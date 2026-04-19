---
description: Source of the Rust file `akka-projection-rs/src/lib.rs`.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs/lib.rs.html
title: lib.rs - source
---

# lib.rs - source

> **Summary:** Source of the Rust file `akka-projection-rs/src/lib.rs`.

## Content

```
[1](#1)
[2](#2)
[3](#3)
[4](#4)
[5](#5)
[6](#6)
[7](#7)
[8](#8)
[9](#9)
[10](#10)
[11](#11)
[12](#12)
[13](#13)
[14](#14)
[15](#15)
[16](#16)
[17](#17)
[18](#18)
[19](#19)
[20](#20)
[21](#21)
[22](#22)
[23](#23)
[24](#24)
[25](#25)
[26](#26)
[27](#27)
[28](#28)
[29](#29)
[30](#30)
[31](#31)
[32](#32)
[33](#33)
[34](#34)
[35](#35)
[36](#36)
[37](#37)
[38](#38)
[39](#39)
[40](#40)
[41](#41)
[42](#42)
[43](#43)
[44](#44)
[45](#45)
[46](#46)
[47](#47)
[48](#48)
[49](#49)
[50](#50)
[51](#51)
[52](#52)
[53](#53)
[54](#54)
[55](#55)
[56](#56)
[57](#57)
[58](#58)
[59](#59)
[60](#60)
[61](#61)
[62](#62)
[63](#63)
[64](#64)
[65](#65)
[66](#66)
[67](#67)
[68](#68)
[69](#69)
[70](#70)
[71](#71)
[72](#72)
[73](#73)
[74](#74)
[75](#75)
[76](#76)
[77](#77)
[78](#78)
[79](#79)
[80](#80)
[81](#81)
[82](#82)
[83](#83)
[84](#84)
[85](#85)
[86](#86)
[87](#87)
[88](#88)
[89](#89)
[90](#90)
[91](#91)
[92](#92)
[93](#93)
[94](#94)
[95](#95)
[96](#96)
[97](#97)
[98](#98)
[99](#99)
[100](#100)
[101](#101)
[102](#102)
[103](#103)
[104](#104)
[105](#105)
[106](#106)
[107](#107)
[108](#108)
[109](#109)
[110](#110)
[111](#111)
[112](#112)
[113](#113)
[114](#114)
[115](#115)
[116](#116)
[117](#117)
[118](#118)
[119](#119)
[120](#120)
[121](#121)
[122](#122)
[123](#123)
[124](#124)
[125](#125)
[126](#126)
[127](#127)
[128](#128)
[129](#129)
[130](#130)
[131](#131)
[132](#132)
[133](#133)
[134](#134)
[135](#135)
[136](#136)
[137](#137)
[138](#138)
[139](#139)
[140](#140)
[141](#141)
[142](#142)
[143](#143)
[144](#144)
[145](#145)
[146](#146)
[147](#147)
[148](#148)
[149](#149)
[150](#150)
[151](#151)
[152](#152)
[153](#153)
[154](#154)
[155](#155)
[156](#156)
[157](#157)
[158](#158)
[159](#159)
[160](#160)
[161](#161)
[162](#162)
[163](#163)
[164](#164)
[165](#165)
[166](#166)
[167](#167)
[168](#168)
[169](#169)
[170](#170)
[171](#171)
[172](#172)
[173](#173)
[174](#174)
[175](#175)
[176](#176)
[177](#177)
[178](#178)
[179](#179)
[180](#180)
[181](#181)
[182](#182)
[183](#183)
[184](#184)
[185](#185)
[186](#186)
[187](#187)
[188](#188)
[189](#189)
[190](#190)
[191](#191)
[192](#192)
[193](#193)
[194](#194)
[195](#195)
[196](#196)
[197](#197)
[198](#198)
[199](#199)
[200](#200)
[201](#201)
[202](#202)
[203](#203)
[204](#204)
[205](#205)
[206](#206)
[207](#207)
[208](#208)
[209](#209)
[210](#210)
[211](#211)
[212](#212)
[213](#213)
[214](#214)
[215](#215)
[216](#216)
[217](#217)
[218](#218)
[219](#219)

```

```
#![doc = include_str!("../README.md")]

use std::{future::Future, marker::PhantomData, pin::Pin};

use akka_persistence_rs::PersistenceId;
use async_trait::async_trait;
use offset_store::LastOffset;
use tokio_stream::Stream;

pub mod consumer;
pub mod consumer_filter;
pub mod offset_store;
pub mod volatile_offset_store;

/// Captures the various types of handlers and the way they are performed.
pub enum Handlers<A, B>
where
    A: Handler,
    B: PendingHandler,
{
    Ready(A, B),
    Pending(B, A),
}

impl<A, E> From<A> for Handlers<A, UnusedPendingHandler<E>>
where
    A: Handler,
    E: Send,
{
    fn from(handler: A) -> Self {
        Handlers::Ready(
            handler,
            UnusedPendingHandler {
                phantom: PhantomData,
            },
        )
    }
}

pub struct FnHandler<A, AR, E>
where
    A: FnMut(E) -> AR,
    AR: Future<Output = Result<(), HandlerError>>,
{
    f: A,
    phantom: PhantomData<E>,
}

#[async_trait]
impl<A, AR, E> Handler for FnHandler<A, AR, E>
where
    A: FnMut(E) -> AR + Send,
    AR: Future<Output = Result<(), HandlerError>> + Send,
    E: Send,
{
    type Envelope = E;

    async fn process(&mut self, envelope: Self::Envelope) -> Result<(), HandlerError> {
        (self.f)(envelope).await
    }
}

impl<A, AR, E> From<A> for Handlers<FnHandler<A, AR, E>, UnusedPendingHandler<E>>
where
    A: FnMut(E) -> AR + Send,
    AR: Future<Output = Result<(), HandlerError>> + Send,
    E: Send,
{
    fn from(handler: A) -> Self {
        Handlers::Ready(
            FnHandler {
                f: handler,
                phantom: PhantomData,
            },
            UnusedPendingHandler {
                phantom: PhantomData,
            },
        )
    }
}

impl<B, E> From<B> for Handlers<UnusedHandler<E>, B>
where
    B: PendingHandler,
    E: Send,
{
    fn from(handler: B) -> Self {
        Handlers::Pending(
            handler,
            UnusedHandler {
                phantom: PhantomData,
            },
        )
    }
}

/// Errors for event processing by a handler.
pub struct HandlerError;

/// Handle event envelopes in any way that an application requires.
#[async_trait]
pub trait Handler {
    /// The envelope processed by the handler.
    type Envelope: Send;

    /// Process an envelope.
    /// A handler's result is "completed" where envelopes are processed upon the previous one
    /// having been processed successfully.
    async fn process(&mut self, _envelope: Self::Envelope) -> Result<(), HandlerError>;
}

/// For the purposes of constructing unused handlers.
pub struct UnusedHandler<E> {
    pub phantom: PhantomData<E>,
}

#[async_trait]
impl<E> Handler for UnusedHandler<E>
where
    E: Send,
{
    type Envelope = E;

    async fn process(&mut self, _envelope: Self::Envelope) -> Result<(), HandlerError> {
        Err(HandlerError)
    }
}

/// Handle event envelopes in any way that an application requires.
#[async_trait]
pub trait PendingHandler {
    /// The envelope processed by the handler.
    type Envelope: Send;

    /// The maximum number of envelopes that can be pending at any time.
    const MAX_PENDING: usize;

    /// Process an envelope with a pending result.
    /// A handler's result is "pending" when envelopes can be passed through and the
    /// result of processing one is not immediately known. Meanwhile, more
    /// envelopes can be passed though.
    async fn process_pending(
        &mut self,
        envelope: Self::Envelope,
    ) -> Result<Pin<Box<dyn Future<Output = Result<(), HandlerError>> + Send>>, HandlerError>;
}

/// For the purposes of constructing unused handlers.
pub struct UnusedPendingHandler<E> {
    pub phantom: PhantomData<E>,
}

#[async_trait]
impl<E> PendingHandler for UnusedPendingHandler<E>
where
    E: Send,
{
    type Envelope = E;

    const MAX_PENDING: usize = 0;

    async fn process_pending(
        &mut self,
        _envelope: Self::Envelope,
    ) -> Result<Pin<Box<dyn Future<Output = Result<(), HandlerError>> + Send>>, HandlerError> {
        Err(HandlerError)
    }
}

/// Errors for event processing by a handler.
pub struct SourceProviderError;

/// Provides a source of envelopes using slices as a query.
///
/// A slice is deterministically defined based on the persistence id. The purpose is to
/// evenly distribute all persistence ids over the slices.
///
/// The consumer can keep track of its current position in the event stream by storing the `offset` and restart the
/// query from a given `offset` after a crash/restart.
///
/// The exact meaning of the `offset` depends on the journal and must be documented by it. It may
/// be a sequential id number that uniquely identifies the position of each event within the event stream. Distributed
/// data stores cannot easily support those semantics and they may use a weaker meaning. For example it may be a
/// timestamp (taken when the event was created or stored). Timestamps are not unique and not strictly ordered, since
/// clocks on different machines may not be synchronized.
///
/// In strongly consistent stores, where the `offset` is unique and strictly ordered, the stream should start from the
/// next event after the `offset`. Otherwise, the read journal should ensure that between an invocation that returned
/// an event with the given `offset`, and this invocation, no events are missed. Depending on the journal
/// implementation, this may mean that this invocation will return events that were already returned by the previous
/// invocation, including the event with the passed in `offset`.
///
/// The returned event stream should be ordered by `offset` if possible, but this can also be difficult to fulfill for
/// a distributed data store. The order must be documented by the journal implementation.
///
/// The stream is not completed when it reaches the end of the currently stored events, but it continues to push new
/// events when new events are persisted.
#[async_trait]
pub trait SourceProvider {
    /// The envelope processed by the provider.
    type Envelope;

    /// Given a closure that returns an offset, source envelopes.
    async fn source<F, FR>(
        &self,
        offset: F,
    ) -> Pin<Box<dyn Stream<Item = Self::Envelope> + Send + 'async_trait>>
    where
        F: Fn() -> FR + Send + Sync,
        FR: Future<Output = Option<LastOffset>> + Send;

    /// Load a single event on demand. A None is returned if the event for the
    /// given `persistence_id` and `seq_nr` doesn't exist.
    async fn load_envelope(
        &self,
        persistence_id: PersistenceId,
        seq_nr: u64,
    ) -> Option<Self::Envelope>;
}

```

## Code Examples

### Example 1

```text
#![doc = include_str!("../README.md")]

use std::{future::Future, marker::PhantomData, pin::Pin};

use akka_persistence_rs::PersistenceId;
use async_trait::async_trait;
use offset_store::LastOffset;
use tokio_stream::Stream;

pub mod consumer;
pub mod consumer_filter;
pub mod offset_store;
pub mod volatile_offset_store;

/// Captures the various types of handlers and the way they are performed.
pub enum Handlers<A, B>
where
    A: Handler,
    B: PendingHandler,
{
    Ready(A, B),
    Pending(B, A),
}

impl<A, E> From<A> for Handlers<A, UnusedPendingHandler<E>>
where
    A: Handler,
    E: Send,
{
    fn from(handler: A) -> Self {
        Handlers::Ready(
            handler,
            UnusedPendingHandler {
                phantom: PhantomData,
            },
        )
    }
}

pub struct FnHandler<A, AR, E>
where
    A: FnMut(E) -> AR,
    AR: Future<Output = Result<(), HandlerError>>,
{
    f: A,
    phantom: PhantomData<E>,
}

#[async_trait]
impl<A, AR, E> Handler for FnHandler<A, AR, E>
where
    A: FnMut(E) -> AR + Send,
    AR: Future<Output = Result<(), HandlerError>> + Send,
    E: Send,
{
    type Envelope = E;

    async fn process(&mut self, envelope: Self::Envelope) -> Result<(), HandlerError> {
        (self.f)(envelope).await
    }
}

impl<A, AR, E> From<A> for Handlers<FnHandler<A, AR, E>, UnusedPendingHandler<E>>
where
    A: FnMut(E) -> AR + Send,
    AR: Future<Output = Result<(), HandlerError>> + Send,
    E: Send,
{
    fn from(handler: A) -> Self {
        Handlers::Ready(
            FnHandler {
                f: handler,
                phantom: PhantomData,
            },
            UnusedPendingHandler {
                phantom: PhantomData,
            },
        )
    }
}

impl<B, E> From<B> for Handlers<UnusedHandler<E>, B>
where
    B: PendingHandler,
    E: Send,
{
    fn from(handler: B) -> Self {
        Handlers::Pending(
            handler,
            UnusedHandler {
                phantom: PhantomData,
            },
        )
    }
}

/// Errors for event processing by a handler.
pub struct HandlerError;

/// Handle event envelopes in any way that an application requires.
#[async_trait]
pub trait Handler {
    /// The envelope processed by the handler.
    type Envelope: Send;

    /// Process an envelope.
    /// A handler's result is "completed" where envelopes are processed upon the previous one
    /// having been processed successfully.
    async fn process(&mut self, _envelope: Self::Envelope) -> Result<(), HandlerError>;
}

/// For the purposes of constructing unused handlers.
pub struct UnusedHandler<E> {
    pub phantom: PhantomData<E>,
}

#[async_trait]
impl<E> Handler for UnusedHandler<E>
where
    E: Send,
{
    type Envelope = E;

    async fn process(&mut self, _envelope: Self::Envelope) -> Result<(), HandlerError> {
        Err(HandlerError)
    }
}

/// Handle event envelopes in any way that an application requires.
#[async_trait]
pub trait PendingHandler {
    /// The envelope processed by the handler.
    type Envelope: Send;

    /// The maximum number of envelopes that can be pending at any time.
    const MAX_PENDING: usize;

    /// Process an envelope with a pending result.
    /// A handler's result is "pending" when envelopes can be passed through and the
    /// result of processing one is not immediately known. Meanwhile, more
    /// envelopes can be passed though.
    async fn process_pending(
        &mut self,
        envelope: Self::Envelope,
    ) -> Result<Pin<Box<dyn Future<Output = Result<(), HandlerError>> + Send>>, HandlerError>;
}

/// For the purposes of constructing unused handlers.
pub struct UnusedPendingHandler<E> {
    pub phantom: PhantomData<E>,
}

#[async_trait]
impl<E> PendingHandler for UnusedPendingHandler<E>
where
    E: Send,
{
    type Envelope = E;

    const MAX_PENDING: usize = 0;

    async fn process_pending(
        &mut self,
        _envelope: Self::Envelope,
    ) -> Result<Pin<Box<dyn Future<Output = Result<(), HandlerError>> + Send>>, HandlerError> {
        Err(HandlerError)
    }
}

/// Errors for event processing by a handler.
pub struct SourceProviderError;

/// Provides a source of envelopes using slices as a query.
///
/// A slice is deterministically defined based on the persistence id. The purpose is to
/// evenly distribute all persistence ids over the slices.
///
/// The consumer can keep track of its current position in the event stream by storing the `offset` and restart the
/// query from a given `offset` after a crash/restart.
///
/// The exact meaning of the `offset` depends on the journal and must be documented by it. It may
/// be a sequential id number that uniquely identifies the position of each event within the event stream. Distributed
/// data stores cannot easily support those semantics and they may use a weaker meaning. For example it may be a
/// timestamp (taken when the event was created or stored). Timestamps are not unique and not strictly ordered, since
/// clocks on different machines may not be synchronized.
///
/// In strongly consistent stores, where the `offset` is unique and strictly ordered, the stream should start from the
/// next event after the `offset`. Otherwise, the read journal should ensure that between an invocation that returned
/// an event with the given `offset`, and this invocation, no events are missed. Depending on the journal
/// implementation, this may mean that this invocation will return events that were already returned by the previous
/// invocation, including the event with the passed in `offset`.
///
/// The returned event stream should be ordered by `offset` if possible, but this can also be difficult to fulfill for
/// a distributed data store. The order must be documented by the journal implementation.
///
/// The stream is not completed when it reaches the end of the currently stored events, but it continues to push new
/// events when new events are persisted.
#[async_trait]
pub trait SourceProvider {
    /// The envelope processed by the provider.
    type Envelope;

    /// Given a closure that returns an offset, source envelopes.
    async fn source<F, FR>(
        &self,
        offset: F,
    ) -> Pin<Box<dyn Stream<Item = Self::Envelope> + Send + 'async_trait>>
    where
        F: Fn() -> FR + Send + Sync,
        FR: Future<Output = Option<LastOffset>> + Send;

    /// Load a single event on demand. A None is returned if the event for the
    /// given `persistence_id` and `seq_nr` doesn't exist.
    async fn load_envelope(
        &self,
        persistence_id: PersistenceId,
        seq_nr: u64,
    ) -> Option<Self::Envelope>;
}
```

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs/lib.rs.html](https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs/lib.rs.html)*