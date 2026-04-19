---
description: Source events for given slices from a Streambed commit log.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_commitlog/struct.CommitLogSourceProvider.html
title: CommitLogSourceProvider in akka_projection_rs_commitlog - Rust
---

# CommitLogSourceProvider in akka_projection_rs_commitlog - Rust

> **Summary:** Source events for given slices from a Streambed commit log.

## Content

# Struct [akka\_projection\_rs\_commitlog](index.html)::[CommitLogSourceProvider](#)

[source](../src/akka_projection_rs_commitlog/lib.rs.html#17-24) · 
```
pub struct CommitLogSourceProvider<CL, E, M> { /* private fields */ }
```
Expand descriptionSource events for given slices from a Streambed commit log.

## Implementations[§](#implementations)

[source](../src/akka_projection_rs_commitlog/lib.rs.html#26-109)[§](#impl-CommitLogSourceProvider%3CCL,+E,+M%3E)### impl\<CL, E, M\> [CommitLogSourceProvider](struct.CommitLogSourceProvider.html "struct akka_projection_rs_commitlog::CommitLogSourceProvider")\<CL, E, M\>where
 CL: CommitLog,
 M: CommitLogMarshaller\<E\> \+ [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync"),
 for\<'async\_trait\> E: [DeserializeOwned](https://docs.rs/serde/1.0.196/serde/de/trait.DeserializeOwned.html "trait serde::de::DeserializeOwned") \+ [Serialize](https://docs.rs/serde/1.0.196/serde/ser/trait.Serialize.html "trait serde::ser::Serialize") \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") \+ [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync") \+ 'async\_trait,

[source](../src/akka_projection_rs_commitlog/lib.rs.html#32-45)#### pub fn [new](#method.new)(
 commit\_log: CL,
 marshaller: M,
 consumer\_group\_name: \&[str](https://doc.rust-lang.org/1.75.0/std/primitive.str.html),
 topic: Topic
) \-\> Self

[source](../src/akka_projection_rs_commitlog/lib.rs.html#47-62)#### pub fn [with\_slice\_range](#method.with_slice_range)(
 commit\_log: CL,
 marshaller: M,
 consumer\_group\_name: \&[str](https://doc.rust-lang.org/1.75.0/std/primitive.str.html),
 topic: Topic,
 slice\_range: [Range](https://doc.rust-lang.org/1.75.0/core/ops/range/struct.Range.html "struct core::ops::range::Range")\<[u32](https://doc.rust-lang.org/1.75.0/std/primitive.u32.html)\>
) \-\> Self

## Trait Implementations[§](#trait-implementations)

[source](../src/akka_projection_rs_commitlog/lib.rs.html#112-139)[§](#impl-SourceProvider-for-CommitLogSourceProvider%3CCL,+E,+M%3E)### impl\<CL, E, M\> SourceProvider for [CommitLogSourceProvider](struct.CommitLogSourceProvider.html "struct akka_projection_rs_commitlog::CommitLogSourceProvider")\<CL, E, M\>where
 CL: CommitLog,
 M: CommitLogMarshaller\<E\> \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") \+ [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync"),
 for\<'async\_trait\> E: [DeserializeOwned](https://docs.rs/serde/1.0.196/serde/de/trait.DeserializeOwned.html "trait serde::de::DeserializeOwned") \+ [Serialize](https://docs.rs/serde/1.0.196/serde/ser/trait.Serialize.html "trait serde::ser::Serialize") \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") \+ [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync") \+ 'async\_trait,

[§](#associatedtype.Envelope)#### type Envelope \= EventEnvelope\<E\>

The envelope processed by the provider.[source](../src/akka_projection_rs_commitlog/lib.rs.html#120-130)[§](#method.source)#### fn source\<'life0, 'async\_trait, F, FR\>(
 \&'life0 self,
 offset: F
) \-\> [Pin](https://doc.rust-lang.org/1.75.0/core/pin/struct.Pin.html "struct core::pin::Pin")\<[Box](https://doc.rust-lang.org/1.75.0/alloc/boxed/struct.Box.html "struct alloc::boxed::Box")\<dyn [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")\<Output \= [Pin](https://doc.rust-lang.org/1.75.0/core/pin/struct.Pin.html "struct core::pin::Pin")\<[Box](https://doc.rust-lang.org/1.75.0/alloc/boxed/struct.Box.html "struct alloc::boxed::Box")\<dyn Stream\<Item \= Self::Envelope\> \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") \+ 'async\_trait\>\>\> \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") \+ 'async\_trait\>\>where
 F: [Fn](https://doc.rust-lang.org/1.75.0/core/ops/function/trait.Fn.html "trait core::ops::function::Fn")() \-\> FR \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") \+ [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync") \+ 'async\_trait,
 FR: [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")\<Output \= [Option](https://doc.rust-lang.org/1.75.0/core/option/enum.Option.html "enum core::option::Option")\<LastOffset\>\> \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") \+ 'async\_trait,
 Self: 'async\_trait,
 'life0: 'async\_trait,

Given a closure that returns an offset, source envelopes.[source](../src/akka_projection_rs_commitlog/lib.rs.html#132-138)[§](#method.load_envelope)#### fn load\_envelope\<'life0, 'async\_trait\>(
 \&'life0 self,
 \_persistence\_id: PersistenceId,
 \_sequence\_nr: [u64](https://doc.rust-lang.org/1.75.0/std/primitive.u64.html)
) \-\> [Pin](https://doc.rust-lang.org/1.75.0/core/pin/struct.Pin.html "struct core::pin::Pin")\<[Box](https://doc.rust-lang.org/1.75.0/alloc/boxed/struct.Box.html "struct alloc::boxed::Box")\<dyn [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")\<Output \= [Option](https://doc.rust-lang.org/1.75.0/core/option/enum.Option.html "enum core::option::Option")\<Self::Envelope\>\> \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") \+ 'async\_trait\>\>where
 Self: 'async\_trait,
 'life0: 'async\_trait,

Load a single event on demand. A None is returned if the event for the
given `persistence_id` and `seq_nr` doesn’t exist.## Auto Trait Implementations[§](#synthetic-implementations)

[§](#impl-RefUnwindSafe-for-CommitLogSourceProvider%3CCL,+E,+M%3E)### impl\<CL, E, M\> [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe") for [CommitLogSourceProvider](struct.CommitLogSourceProvider.html "struct akka_projection_rs_commitlog::CommitLogSourceProvider")\<CL, E, M\>where
 CL: [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe"),
 E: [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe"),
 M: [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe"),

[§](#impl-Send-for-CommitLogSourceProvider%3CCL,+E,+M%3E)### impl\<CL, E, M\> [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") for [CommitLogSourceProvider](struct.CommitLogSourceProvider.html "struct akka_projection_rs_commitlog::CommitLogSourceProvider")\<CL, E, M\>where
 CL: [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),
 E: [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),
 M: [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),

[§](#impl-Sync-for-CommitLogSourceProvider%3CCL,+E,+M%3E)### impl\<CL, E, M\> [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync") for [CommitLogSourceProvider](struct.CommitLogSourceProvider.html "struct akka_projection_rs_commitlog::CommitLogSourceProvider")\<CL, E, M\>where
 CL: [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync"),
 E: [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync"),
 M: [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync"),

[§](#impl-Unpin-for-CommitLogSourceProvider%3CCL,+E,+M%3E)### impl\<CL, E, M\> [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin") for [CommitLogSourceProvider](struct.CommitLogSourceProvider.html "struct akka_projection_rs_commitlog::CommitLogSourceProvider")\<CL, E, M\>where
 CL: [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin"),
 E: [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin"),
 M: [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin"),

[§](#impl-UnwindSafe-for-CommitLogSourceProvider%3CCL,+E,+M%3E)### impl\<CL, E, M\> [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe") for [CommitLogSourceProvider](struct.CommitLogSourceProvider.html "struct akka_projection_rs_commitlog::CommitLogSourceProvider")\<CL, E, M\>where
 CL: [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe"),
 E: [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe"),
 M: [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe"),

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

[source](https://docs.rs/typenum/1.17.0/src/typenum/type_operators.rs.html#34)[§](#impl-Same-for-T)### impl\<T\> [Same](https://docs.rs/typenum/1.17.0/typenum/type_operators/trait.Same.html "trait typenum::type_operators::Same") for T

[§](#associatedtype.Output)#### type [Output](https://docs.rs/typenum/1.17.0/typenum/type_operators/trait.Same.html#associatedtype.Output) \= T

Should always be `Self`[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#803-805)[§](#impl-TryFrom%3CU%3E-for-T)### impl\<T, U\> [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<U\> for Twhere
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

### Example 1: Structakka_projection_rs_commitlog::CommitLogSourceProvider

```text
pub struct CommitLogSourceProvider<CL, E, M> { /* private fields */ }
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_commitlog/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_commitlog/struct.CommitLogSourceProvider.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs_commitlog/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_commitlog/struct.CommitLogSourceProvider.html](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs_commitlog/struct.CommitLogSourceProvider.html)*