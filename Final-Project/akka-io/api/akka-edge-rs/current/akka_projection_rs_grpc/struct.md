---
description: Returned when the envelope cannot be represented as an event envelope.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/struct.NotAnEventEnvelope.html
title: NotAnEventEnvelope in akka_projection_rs_grpc - Rust
---

# NotAnEventEnvelope in akka_projection_rs_grpc - Rust

> **Summary:** Returned when the envelope cannot be represented as an event envelope.

## Content

# Struct [akka\_projection\_rs\_grpc](index.html)::[NotAnEventEnvelope](#)

[source](../src/akka_projection_rs_grpc/lib.rs.html#111) · 
```
pub struct NotAnEventEnvelope;
```
Expand descriptionReturned when the envelope cannot be represented as an event envelope.

## Auto Trait Implementations[§](#synthetic-implementations)

[§](#impl-RefUnwindSafe-for-NotAnEventEnvelope)### impl [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe") for [NotAnEventEnvelope](struct.NotAnEventEnvelope.html "struct akka_projection_rs_grpc::NotAnEventEnvelope")

[§](#impl-Send-for-NotAnEventEnvelope)### impl [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") for [NotAnEventEnvelope](struct.NotAnEventEnvelope.html "struct akka_projection_rs_grpc::NotAnEventEnvelope")

[§](#impl-Sync-for-NotAnEventEnvelope)### impl [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync") for [NotAnEventEnvelope](struct.NotAnEventEnvelope.html "struct akka_projection_rs_grpc::NotAnEventEnvelope")

[§](#impl-Unpin-for-NotAnEventEnvelope)### impl [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin") for [NotAnEventEnvelope](struct.NotAnEventEnvelope.html "struct akka_projection_rs_grpc::NotAnEventEnvelope")

[§](#impl-UnwindSafe-for-NotAnEventEnvelope)### impl [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe") for [NotAnEventEnvelope](struct.NotAnEventEnvelope.html "struct akka_projection_rs_grpc::NotAnEventEnvelope")

## Blanket Implementations[§](#blanket-implementations)

[source](https://doc.rust-lang.org/1.75.0/src/core/any.rs.html#135)[§](#impl-Any-for-T)### impl\<T\> [Any](https://doc.rust-lang.org/1.75.0/core/any/trait.Any.html "trait core::any::Any") for Twhere
 T: 'static \+ ?[Sized](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sized.html "trait core::marker::Sized"),

[source](https://doc.rust-lang.org/1.75.0/src/core/any.rs.html#136)[§](#method.type_id)#### fn [type\_id](https://doc.rust-lang.org/1.75.0/core/any/trait.Any.html#tymethod.type_id)(\&self) \-\> [TypeId](https://doc.rust-lang.org/1.75.0/core/any/struct.TypeId.html "struct core::any::TypeId")

Gets the `TypeId` of `self`. [Read more](https://doc.rust-lang.org/1.75.0/core/any/trait.Any.html#tymethod.type_id)[source](https://doc.rust-lang.org/1.75.0/src/core/borrow.rs.html#208)[§](#impl-Borrow%3CT%3E-for-T)### impl\<T\> [Borrow](https://doc.rust-lang.org/1.75.0/core/borrow/trait.Borrow.html "trait core::borrow::Borrow")\<T\> for Twhere
 T: ?[Sized](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sized.html "trait core::marker::Sized"),

[source](https://doc.rust-lang.org/1.75.0/src/core/borrow.rs.html#210)[§](#method.borrow)#### fn [borrow](https://doc.rust-lang.org/1.75.0/core/borrow/trait.Borrow.html#tymethod.borrow)(\&self) \-\> [\&T](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)

Immutably borrows from an owned value. [Read more](https://doc.rust-lang.org/1.75.0/core/borrow/trait.Borrow.html#tymethod.borrow)[source](https://doc.rust-lang.org/1.75.0/src/core/borrow.rs.html#216)[§](#impl-BorrowMut%3CT%3E-for-T)### impl\<T\> [BorrowMut](https://doc.rust-lang.org/1.75.0/core/borrow/trait.BorrowMut.html "trait core::borrow::BorrowMut")\<T\> for Twhere
 T: ?[Sized](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sized.html "trait core::marker::Sized"),

[source](https://doc.rust-lang.org/1.75.0/src/core/borrow.rs.html#217)[§](#method.borrow_mut)#### fn [borrow\_mut](https://doc.rust-lang.org/1.75.0/core/borrow/trait.BorrowMut.html#tymethod.borrow_mut)(\&mut self) \-\> [\&mut T](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)

Mutably borrows from an owned value. [Read more](https://doc.rust-lang.org/1.75.0/core/borrow/trait.BorrowMut.html#tymethod.borrow_mut)[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#763)[§](#impl-From%3CT%3E-for-T)### impl\<T\> [From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")\<T\> for T

[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#766)[§](#method.from)#### fn [from](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html#tymethod.from)(t: T) \-\> T

Returns the argument unchanged.

[§](#impl-Instrument-for-T)### impl\<T\> Instrument for T

[§](#method.instrument)#### fn instrument(self, span: Span) \-\> Instrumented\<Self\>

Instruments this type with the provided \[`Span`], returning an
`Instrumented` wrapper. Read more[§](#method.in_current_span)#### fn in\_current\_span(self) \-\> Instrumented\<Self\>

Instruments this type with the [current](super::Span::current()) [`Span`](crate::Span), returning an
`Instrumented` wrapper. Read more[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#747-749)[§](#impl-Into%3CU%3E-for-T)### impl\<T, U\> [Into](https://doc.rust-lang.org/1.75.0/core/convert/trait.Into.html "trait core::convert::Into")\<U\> for Twhere
 U: [From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")\<T\>,

[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#756)[§](#method.into)#### fn [into](https://doc.rust-lang.org/1.75.0/core/convert/trait.Into.html#tymethod.into)(self) \-\> U

Calls `U::from(self)`.

That is, this conversion is whatever the implementation of
`[From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")<T> for U` chooses to do.

[source](https://docs.rs/tonic/0.10.2/src/tonic/request.rs.html#383)[§](#impl-IntoRequest%3CT%3E-for-T)### impl\<T\> [IntoRequest](https://docs.rs/tonic/0.10.2/tonic/request/trait.IntoRequest.html "trait tonic::request::IntoRequest")\<T\> for T

[source](https://docs.rs/tonic/0.10.2/src/tonic/request.rs.html#384)[§](#method.into_request)#### fn [into\_request](https://docs.rs/tonic/0.10.2/tonic/request/trait.IntoRequest.html#tymethod.into_request)(self) \-\> [Request](https://docs.rs/tonic/0.10.2/tonic/request/struct.Request.html "struct tonic::request::Request")\<T\>

Wrap the input message `T` in a `tonic::Request`[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#803-805)[§](#impl-TryFrom%3CU%3E-for-T)### impl\<T, U\> [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<U\> for Twhere
 U: [Into](https://doc.rust-lang.org/1.75.0/core/convert/trait.Into.html "trait core::convert::Into")\<T\>,

[§](#associatedtype.Error)#### type [Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error) \= [Infallible](https://doc.rust-lang.org/1.75.0/core/convert/enum.Infallible.html "enum core::convert::Infallible")

The type returned in the event of a conversion error.[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#810)[§](#method.try_from)#### fn [try\_from](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#tymethod.try_from)(value: U) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<T, \<T as [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<U\>\>::[Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error "type core::convert::TryFrom::Error")\>

Performs the conversion.[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#788-790)[§](#impl-TryInto%3CU%3E-for-T)### impl\<T, U\> [TryInto](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryInto.html "trait core::convert::TryInto")\<U\> for Twhere
 U: [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<T\>,

[§](#associatedtype.Error-1)#### type [Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryInto.html#associatedtype.Error) \= \<U as [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<T\>\>::[Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error "type core::convert::TryFrom::Error")

The type returned in the event of a conversion error.[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#795)[§](#method.try_into)#### fn [try\_into](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryInto.html#tymethod.try_into)(self) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<U, \<U as [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<T\>\>::[Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error "type core::convert::TryFrom::Error")\>

Performs the conversion.[§](#impl-VZip%3CV%3E-for-T)### impl\<V, T\> VZip\<V\> for Twhere
 V: MultiLane\<T\>,

[§](#method.vzip)#### fn vzip(self) \-\> V

[§](#impl-WithSubscriber-for-T)### impl\<T\> WithSubscriber for T

[§](#method.with_subscriber)#### fn with\_subscriber\<S\>(self, subscriber: S) \-\> WithDispatch\<Self\>where
 S: [Into](https://doc.rust-lang.org/1.75.0/core/convert/trait.Into.html "trait core::convert::Into")\<Dispatch\>,

Attaches the provided [`Subscriber`](super::Subscriber) to this type, returning a
\[`WithDispatch`] wrapper. Read more[§](#method.with_current_subscriber)#### fn with\_current\_subscriber(self) \-\> WithDispatch\<Self\>

Attaches the current [default](crate::dispatcher#setting-the-default-subscriber) [`Subscriber`](super::Subscriber) to this type, returning a
\[`WithDispatch`] wrapper. Read more

## Code Examples

### Example 1: Structakka_projection_rs_grpc::NotAnEventEnvelope

```text
pub struct NotAnEventEnvelope;
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/struct.NotAnEventEnvelope.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs_grpc/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/struct.NotAnEventEnvelope.html](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_grpc/struct.NotAnEventEnvelope.html)*