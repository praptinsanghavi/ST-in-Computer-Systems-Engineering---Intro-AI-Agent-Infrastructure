---
description: An event source descriptor
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/enum.Source.html
title: Source in akka_persistence_rs - Rust
---

# Source in akka_persistence_rs - Rust

> **Summary:** An event source descriptor

## Content

# Enum [akka\_persistence\_rs](index.html)::[Source](#)

[source](../src/akka_persistence_rs/lib.rs.html#187-194) · 
```
pub enum Source {
    Backtrack,
    Regular,
    PubSub,
}
```
Expand descriptionAn event source descriptor

## Variants[§](#variants)

[§](#variant.Backtrack)### Backtrack

For backtracking events.

[§](#variant.Regular)### Regular

For ordinary events.

[§](#variant.PubSub)### PubSub

For PubSub events.

## Trait Implementations[§](#trait-implementations)

[source](../src/akka_persistence_rs/lib.rs.html#186)[§](#impl-Clone-for-Source)### impl [Clone](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html "trait core::clone::Clone") for [Source](enum.Source.html "enum akka_persistence_rs::Source")

[source](../src/akka_persistence_rs/lib.rs.html#186)[§](#method.clone)#### fn [clone](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#tymethod.clone)(\&self) \-\> [Source](enum.Source.html "enum akka_persistence_rs::Source")

Returns a copy of the value. [Read more](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#tymethod.clone)1\.0\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/clone.rs.html#169)[§](#method.clone_from)#### fn [clone\_from](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#method.clone_from)(\&mut self, source: [\&Self](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html))

Performs copy\-assignment from `source`. [Read more](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#method.clone_from)[source](../src/akka_persistence_rs/lib.rs.html#186)[§](#impl-Debug-for-Source)### impl [Debug](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Debug.html "trait core::fmt::Debug") for [Source](enum.Source.html "enum akka_persistence_rs::Source")

[source](../src/akka_persistence_rs/lib.rs.html#186)[§](#method.fmt)#### fn [fmt](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Debug.html#tymethod.fmt)(\&self, f: \&mut [Formatter](https://doc.rust-lang.org/1.75.0/core/fmt/struct.Formatter.html "struct core::fmt::Formatter")\<'\_\>) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/fmt/type.Result.html "type core::fmt::Result")

Formats the value using the given formatter. [Read more](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Debug.html#tymethod.fmt)[source](../src/akka_persistence_rs/lib.rs.html#202-213)[§](#impl-FromStr-for-Source)### impl [FromStr](https://doc.rust-lang.org/1.75.0/core/str/traits/trait.FromStr.html "trait core::str::traits::FromStr") for [Source](enum.Source.html "enum akka_persistence_rs::Source")

[§](#associatedtype.Err)#### type [Err](https://doc.rust-lang.org/1.75.0/core/str/traits/trait.FromStr.html#associatedtype.Err) \= [CannotSourceError](struct.CannotSourceError.html "struct akka_persistence_rs::CannotSourceError")

The associated error which can be returned from parsing.[source](../src/akka_persistence_rs/lib.rs.html#205-212)[§](#method.from_str)#### fn [from\_str](https://doc.rust-lang.org/1.75.0/core/str/traits/trait.FromStr.html#tymethod.from_str)(s: \&[str](https://doc.rust-lang.org/1.75.0/std/primitive.str.html)) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<Self, Self::[Err](https://doc.rust-lang.org/1.75.0/core/str/traits/trait.FromStr.html#associatedtype.Err "type core::str::traits::FromStr::Err")\>

Parses a string `s` to return a value of this type. [Read more](https://doc.rust-lang.org/1.75.0/core/str/traits/trait.FromStr.html#tymethod.from_str)[source](../src/akka_persistence_rs/lib.rs.html#186)[§](#impl-PartialEq-for-Source)### impl [PartialEq](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialEq.html "trait core::cmp::PartialEq") for [Source](enum.Source.html "enum akka_persistence_rs::Source")

[source](../src/akka_persistence_rs/lib.rs.html#186)[§](#method.eq)#### fn [eq](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialEq.html#tymethod.eq)(\&self, other: \&[Source](enum.Source.html "enum akka_persistence_rs::Source")) \-\> [bool](https://doc.rust-lang.org/1.75.0/std/primitive.bool.html)

This method tests for `self` and `other` values to be equal, and is used
by `==`.1\.0\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/cmp.rs.html#239)[§](#method.ne)#### fn [ne](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialEq.html#method.ne)(\&self, other: [\&Rhs](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)) \-\> [bool](https://doc.rust-lang.org/1.75.0/std/primitive.bool.html)

This method tests for `!=`. The default implementation is almost always
sufficient, and should not be overridden without very good reason.[source](../src/akka_persistence_rs/lib.rs.html#186)[§](#impl-Copy-for-Source)### impl [Copy](https://doc.rust-lang.org/1.75.0/core/marker/trait.Copy.html "trait core::marker::Copy") for [Source](enum.Source.html "enum akka_persistence_rs::Source")

[source](../src/akka_persistence_rs/lib.rs.html#186)[§](#impl-StructuralPartialEq-for-Source)### impl [StructuralPartialEq](https://doc.rust-lang.org/1.75.0/core/marker/trait.StructuralPartialEq.html "trait core::marker::StructuralPartialEq") for [Source](enum.Source.html "enum akka_persistence_rs::Source")

## Auto Trait Implementations[§](#synthetic-implementations)

[§](#impl-RefUnwindSafe-for-Source)### impl [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe") for [Source](enum.Source.html "enum akka_persistence_rs::Source")

[§](#impl-Send-for-Source)### impl [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") for [Source](enum.Source.html "enum akka_persistence_rs::Source")

[§](#impl-Sync-for-Source)### impl [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync") for [Source](enum.Source.html "enum akka_persistence_rs::Source")

[§](#impl-Unpin-for-Source)### impl [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin") for [Source](enum.Source.html "enum akka_persistence_rs::Source")

[§](#impl-UnwindSafe-for-Source)### impl [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe") for [Source](enum.Source.html "enum akka_persistence_rs::Source")

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

[source](https://doc.rust-lang.org/1.75.0/src/alloc/borrow.rs.html#83-85)[§](#impl-ToOwned-for-T)### impl\<T\> [ToOwned](https://doc.rust-lang.org/1.75.0/alloc/borrow/trait.ToOwned.html "trait alloc::borrow::ToOwned") for Twhere
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

Performs the conversion.

## Code Examples

### Example 1: Enumakka_persistence_rs::Source

```text
pub enum Source {
    Backtrack,
    Regular,
    PubSub,
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/enum.Source.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.CannotSourceError.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/enum.Source.html](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/enum.Source.html)*