---
description: An envelope wraps a commit log event associated with a specific entity.
  Tags are not presently considered useful at the edge. A remote consumer would be
  interested in all events from the edge in most cases, and the edge itself decides
  what to publish (producer defined filter).
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/struct.EventEnvelope.html
title: EventEnvelope in akka_persistence_rs_commitlog - Rust
---

# EventEnvelope in akka_persistence_rs_commitlog - Rust

> **Summary:** An envelope wraps a commit log event associated with a specific entity. Tags are not presently considered useful at the edge. A remote consumer would be interested in all events from the edge in most cases, and the edge itself decides what to publish (producer defined filter).

## Content

# Struct [akka\_persistence\_rs\_commitlog](index.html)::[EventEnvelope](#)

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#27-34) · 
```
pub struct EventEnvelope<E> {
    pub persistence_id: [PersistenceId](../akka_persistence_rs/struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId"),
    pub seq_nr: [u64](https://doc.rust-lang.org/1.75.0/std/primitive.u64.html),
    pub timestamp: [DateTime](https://docs.rs/chrono/latest/chrono/datetime/struct.DateTime.html "struct chrono::datetime::DateTime")<[Utc](https://docs.rs/chrono/latest/chrono/offset/utc/struct.Utc.html "struct chrono::offset::utc::Utc")>,
    pub event: E,
    pub offset: Offset,
    pub tags: [Vec](https://doc.rust-lang.org/1.75.0/alloc/vec/struct.Vec.html "struct alloc::vec::Vec")<[Tag](../akka_persistence_rs/type.Tag.html "type akka_persistence_rs::Tag")>,
}
```
Expand descriptionAn envelope wraps a commit log event associated with a specific entity.
Tags are not presently considered useful at the edge. A remote consumer would be interested
in all events from the edge in most cases, and the edge itself decides what to publish
(producer defined filter).

## Fields[§](#fields)

[§](#structfield.persistence_id)`persistence_id: [PersistenceId](../akka_persistence_rs/struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")`[§](#structfield.seq_nr)`seq_nr: [u64](https://doc.rust-lang.org/1.75.0/std/primitive.u64.html)`[§](#structfield.timestamp)`timestamp: [DateTime](https://docs.rs/chrono/latest/chrono/datetime/struct.DateTime.html "struct chrono::datetime::DateTime")<[Utc](https://docs.rs/chrono/latest/chrono/offset/utc/struct.Utc.html "struct chrono::offset::utc::Utc")>`[§](#structfield.event)`event: E`[§](#structfield.offset)`offset: Offset`[§](#structfield.tags)`tags: [Vec](https://doc.rust-lang.org/1.75.0/alloc/vec/struct.Vec.html "struct alloc::vec::Vec")<[Tag](../akka_persistence_rs/type.Tag.html "type akka_persistence_rs::Tag")>`## Trait Implementations[§](#trait-implementations)

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#26)[§](#impl-Clone-for-EventEnvelope%3CE%3E)### impl\<E: [Clone](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html "trait core::clone::Clone")\> [Clone](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html "trait core::clone::Clone") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#26)[§](#method.clone)#### fn [clone](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#tymethod.clone)(\&self) \-\> [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>

Returns a copy of the value. [Read more](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#tymethod.clone)1\.0\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/clone.rs.html#169)[§](#method.clone_from)#### fn [clone\_from](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#method.clone_from)(\&mut self, source: [\&Self](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html))

Performs copy\-assignment from `source`. [Read more](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#method.clone_from)[source](../src/akka_persistence_rs_commitlog/lib.rs.html#26)[§](#impl-Debug-for-EventEnvelope%3CE%3E)### impl\<E: [Debug](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Debug.html "trait core::fmt::Debug")\> [Debug](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Debug.html "trait core::fmt::Debug") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#26)[§](#method.fmt)#### fn [fmt](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Debug.html#tymethod.fmt)(\&self, f: \&mut [Formatter](https://doc.rust-lang.org/1.75.0/core/fmt/struct.Formatter.html "struct core::fmt::Formatter")\<'\_\>) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/fmt/type.Result.html "type core::fmt::Result")

Formats the value using the given formatter. [Read more](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Debug.html#tymethod.fmt)[source](../src/akka_persistence_rs_commitlog/lib.rs.html#26)[§](#impl-PartialEq-for-EventEnvelope%3CE%3E)### impl\<E: [PartialEq](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialEq.html "trait core::cmp::PartialEq")\> [PartialEq](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialEq.html "trait core::cmp::PartialEq") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#26)[§](#method.eq)#### fn [eq](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialEq.html#tymethod.eq)(\&self, other: \&[EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>) \-\> [bool](https://doc.rust-lang.org/1.75.0/std/primitive.bool.html)

This method tests for `self` and `other` values to be equal, and is used
by `==`.1\.0\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/cmp.rs.html#239)[§](#method.ne)#### fn [ne](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialEq.html#method.ne)(\&self, other: [\&Rhs](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)) \-\> [bool](https://doc.rust-lang.org/1.75.0/std/primitive.bool.html)

This method tests for `!=`. The default implementation is almost always
sufficient, and should not be overridden without very good reason.[source](../src/akka_persistence_rs_commitlog/lib.rs.html#42-46)[§](#impl-WithOffset-for-EventEnvelope%3CE%3E)### impl\<E\> [WithOffset](../akka_persistence_rs/trait.WithOffset.html "trait akka_persistence_rs::WithOffset") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#43-45)[§](#method.offset)#### fn [offset](../akka_persistence_rs/trait.WithOffset.html#tymethod.offset)(\&self) \-\> [Offset](../akka_persistence_rs/enum.Offset.html "enum akka_persistence_rs::Offset")

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#36-40)[§](#impl-WithPersistenceId-for-EventEnvelope%3CE%3E)### impl\<E\> [WithPersistenceId](../akka_persistence_rs/trait.WithPersistenceId.html "trait akka_persistence_rs::WithPersistenceId") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#37-39)[§](#method.persistence_id)#### fn [persistence\_id](../akka_persistence_rs/trait.WithPersistenceId.html#tymethod.persistence_id)(\&self) \-\> \&[PersistenceId](../akka_persistence_rs/struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#48-52)[§](#impl-WithSeqNr-for-EventEnvelope%3CE%3E)### impl\<E\> [WithSeqNr](../akka_persistence_rs/trait.WithSeqNr.html "trait akka_persistence_rs::WithSeqNr") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#49-51)[§](#method.seq_nr)#### fn [seq\_nr](../akka_persistence_rs/trait.WithSeqNr.html#tymethod.seq_nr)(\&self) \-\> [u64](https://doc.rust-lang.org/1.75.0/std/primitive.u64.html)

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#54-58)[§](#impl-WithSource-for-EventEnvelope%3CE%3E)### impl\<E\> [WithSource](../akka_persistence_rs/trait.WithSource.html "trait akka_persistence_rs::WithSource") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#55-57)[§](#method.source)#### fn [source](../akka_persistence_rs/trait.WithSource.html#tymethod.source)(\&self) \-\> [Source](../akka_persistence_rs/enum.Source.html "enum akka_persistence_rs::Source")

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#60-64)[§](#impl-WithTags-for-EventEnvelope%3CE%3E)### impl\<E\> [WithTags](../akka_persistence_rs/trait.WithTags.html "trait akka_persistence_rs::WithTags") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#61-63)[§](#method.tags)#### fn [tags](../akka_persistence_rs/trait.WithTags.html#tymethod.tags)(\&self) \-\> \&\[[Tag](../akka_persistence_rs/type.Tag.html "type akka_persistence_rs::Tag")]

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#66-70)[§](#impl-WithTimestamp-for-EventEnvelope%3CE%3E)### impl\<E\> [WithTimestamp](../akka_persistence_rs/trait.WithTimestamp.html "trait akka_persistence_rs::WithTimestamp") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#67-69)[§](#method.timestamp)#### fn [timestamp](../akka_persistence_rs/trait.WithTimestamp.html#tymethod.timestamp)(\&self) \-\> \&[DateTime](https://docs.rs/chrono/latest/chrono/datetime/struct.DateTime.html "struct chrono::datetime::DateTime")\<[Utc](https://docs.rs/chrono/latest/chrono/offset/utc/struct.Utc.html "struct chrono::offset::utc::Utc")\>

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#26)[§](#impl-StructuralPartialEq-for-EventEnvelope%3CE%3E)### impl\<E\> [StructuralPartialEq](https://doc.rust-lang.org/1.75.0/core/marker/trait.StructuralPartialEq.html "trait core::marker::StructuralPartialEq") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>

## Auto Trait Implementations[§](#synthetic-implementations)

[§](#impl-RefUnwindSafe-for-EventEnvelope%3CE%3E)### impl\<E\> [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>where
 E: [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe"),

[§](#impl-Send-for-EventEnvelope%3CE%3E)### impl\<E\> [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>where
 E: [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),

[§](#impl-Sync-for-EventEnvelope%3CE%3E)### impl\<E\> [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>where
 E: [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync"),

[§](#impl-Unpin-for-EventEnvelope%3CE%3E)### impl\<E\> [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>where
 E: [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin"),

[§](#impl-UnwindSafe-for-EventEnvelope%3CE%3E)### impl\<E\> [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe") for [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>where
 E: [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe"),

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

[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#747-749)[§](#impl-Into%3CU%3E-for-T)### impl\<T, U\> [Into](https://doc.rust-lang.org/1.75.0/core/convert/trait.Into.html "trait core::convert::Into")\<U\> for Twhere
 U: [From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")\<T\>,

[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#756)[§](#method.into)#### fn [into](https://doc.rust-lang.org/1.75.0/core/convert/trait.Into.html#tymethod.into)(self) \-\> U

Calls `U::from(self)`.

That is, this conversion is whatever the implementation of
`[From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")<T> for U` chooses to do.

[source](https://docs.rs/typenum/1.17.0/src/typenum/type_operators.rs.html#34)[§](#impl-Same-for-T)### impl\<T\> [Same](https://docs.rs/typenum/1.17.0/typenum/type_operators/trait.Same.html "trait typenum::type_operators::Same") for T

[§](#associatedtype.Output)#### type [Output](https://docs.rs/typenum/1.17.0/typenum/type_operators/trait.Same.html#associatedtype.Output) \= T

Should always be `Self`[source](https://doc.rust-lang.org/1.75.0/src/alloc/borrow.rs.html#83-85)[§](#impl-ToOwned-for-T)### impl\<T\> [ToOwned](https://doc.rust-lang.org/1.75.0/alloc/borrow/trait.ToOwned.html "trait alloc::borrow::ToOwned") for Twhere
 T: [Clone](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html "trait core::clone::Clone"),

[§](#associatedtype.Owned)#### type [Owned](https://doc.rust-lang.org/1.75.0/alloc/borrow/trait.ToOwned.html#associatedtype.Owned) \= T

The resulting type after obtaining ownership.[source](https://doc.rust-lang.org/1.75.0/src/alloc/borrow.rs.html#88)[§](#method.to_owned)#### fn [to\_owned](https://doc.rust-lang.org/1.75.0/alloc/borrow/trait.ToOwned.html#tymethod.to_owned)(\&self) \-\> T

Creates owned data from borrowed data, usually by cloning. [Read more](https://doc.rust-lang.org/1.75.0/alloc/borrow/trait.ToOwned.html#tymethod.to_owned)[source](https://doc.rust-lang.org/1.75.0/src/alloc/borrow.rs.html#92)[§](#method.clone_into)#### fn [clone\_into](https://doc.rust-lang.org/1.75.0/alloc/borrow/trait.ToOwned.html#method.clone_into)(\&self, target: [\&mut T](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html))

Uses borrowed data to replace owned data, usually by cloning. [Read more](https://doc.rust-lang.org/1.75.0/alloc/borrow/trait.ToOwned.html#method.clone_into)[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#803-805)[§](#impl-TryFrom%3CU%3E-for-T)### impl\<T, U\> [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<U\> for Twhere
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

## Code Examples

### Example 1: Structakka_persistence_rs_commitlog::EventEnvelope

```text
pub struct EventEnvelope<E> {
    pub persistence_id: PersistenceId,
    pub seq_nr: u64,
    pub timestamp: DateTime<Utc>,
    pub event: E,
    pub offset: Offset,
    pub tags: Vec<Tag>,
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/enum.Offset.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/enum.Source.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.PersistenceId.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithOffset.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithPersistenceId.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithSeqNr.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithSource.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithTags.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithTimestamp.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/type.Tag.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/struct.EventEnvelope.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs_commitlog/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/struct.EventEnvelope.html](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/struct.EventEnvelope.html)*