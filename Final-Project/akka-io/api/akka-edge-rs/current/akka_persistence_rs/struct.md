---
description: A namespaced entity id given an entity type.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.PersistenceId.html
title: PersistenceId in akka_persistence_rs - Rust
---

# PersistenceId in akka_persistence_rs - Rust

> **Summary:** A namespaced entity id given an entity type.

## Content

# Struct [akka\_persistence\_rs](index.html)::[PersistenceId](#)

[source](../src/akka_persistence_rs/lib.rs.html#62-65) · 
```
pub struct PersistenceId {
    pub entity_type: [EntityType](type.EntityType.html "type akka_persistence_rs::EntityType"),
    pub entity_id: [EntityId](type.EntityId.html "type akka_persistence_rs::EntityId"),
}
```
Expand descriptionA namespaced entity id given an entity type.

## Fields[§](#fields)

[§](#structfield.entity_type)`entity_type: [EntityType](type.EntityType.html "type akka_persistence_rs::EntityType")`[§](#structfield.entity_id)`entity_id: [EntityId](type.EntityId.html "type akka_persistence_rs::EntityId")`## Implementations[§](#implementations)

[source](../src/akka_persistence_rs/lib.rs.html#67-87)[§](#impl-PersistenceId)### impl [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#68-73)#### pub fn [new](#method.new)(entity\_type: [EntityType](type.EntityType.html "type akka_persistence_rs::EntityType"), entity\_id: [EntityId](type.EntityId.html "type akka_persistence_rs::EntityId")) \-\> Self

[source](../src/akka_persistence_rs/lib.rs.html#75-77)#### pub fn [slice](#method.slice)(\&self) \-\> [u32](https://doc.rust-lang.org/1.75.0/std/primitive.u32.html)

[source](../src/akka_persistence_rs/lib.rs.html#79-86)#### pub fn [jdk\_string\_hash](#method.jdk_string_hash)(\&self) \-\> [i32](https://doc.rust-lang.org/1.75.0/std/primitive.i32.html)

## Trait Implementations[§](#trait-implementations)

[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#impl-Clone-for-PersistenceId)### impl [Clone](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html "trait core::clone::Clone") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#method.clone)#### fn [clone](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#tymethod.clone)(\&self) \-\> [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

Returns a copy of the value. [Read more](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#tymethod.clone)1\.0\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/clone.rs.html#169)[§](#method.clone_from)#### fn [clone\_from](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#method.clone_from)(\&mut self, source: [\&Self](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html))

Performs copy\-assignment from `source`. [Read more](https://doc.rust-lang.org/1.75.0/core/clone/trait.Clone.html#method.clone_from)[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#impl-Debug-for-PersistenceId)### impl [Debug](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Debug.html "trait core::fmt::Debug") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#method.fmt-1)#### fn [fmt](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Debug.html#tymethod.fmt)(\&self, f: \&mut [Formatter](https://doc.rust-lang.org/1.75.0/core/fmt/struct.Formatter.html "struct core::fmt::Formatter")\<'\_\>) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/fmt/type.Result.html "type core::fmt::Result")

Formats the value using the given formatter. [Read more](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Debug.html#tymethod.fmt)[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#impl-Deserialize%3C'de%3E-for-PersistenceId)### impl\<'de\> [Deserialize](https://docs.rs/serde/1.0.196/serde/de/trait.Deserialize.html "trait serde::de::Deserialize")\<'de\> for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#method.deserialize)#### fn [deserialize](https://docs.rs/serde/1.0.196/serde/de/trait.Deserialize.html#tymethod.deserialize)\<\_\_D\>(\_\_deserializer: \_\_D) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<Self, \_\_D::[Error](https://docs.rs/serde/1.0.196/serde/de/trait.Deserializer.html#associatedtype.Error "type serde::de::Deserializer::Error")\>where
 \_\_D: [Deserializer](https://docs.rs/serde/1.0.196/serde/de/trait.Deserializer.html "trait serde::de::Deserializer")\<'de\>,

Deserialize this value from the given Serde deserializer. [Read more](https://docs.rs/serde/1.0.196/serde/de/trait.Deserialize.html#tymethod.deserialize)[source](../src/akka_persistence_rs/lib.rs.html#89-95)[§](#impl-Display-for-PersistenceId)### impl [Display](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Display.html "trait core::fmt::Display") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#90-94)[§](#method.fmt)#### fn [fmt](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Display.html#tymethod.fmt)(\&self, f: \&mut [Formatter](https://doc.rust-lang.org/1.75.0/core/fmt/struct.Formatter.html "struct core::fmt::Formatter")\<'\_\>) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/fmt/type.Result.html "type core::fmt::Result")

Formats the value using the given formatter. [Read more](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Display.html#tymethod.fmt)[source](../src/akka_persistence_rs/lib.rs.html#100-117)[§](#impl-FromStr-for-PersistenceId)### impl [FromStr](https://doc.rust-lang.org/1.75.0/core/str/traits/trait.FromStr.html "trait core::str::traits::FromStr") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[§](#associatedtype.Err)#### type [Err](https://doc.rust-lang.org/1.75.0/core/str/traits/trait.FromStr.html#associatedtype.Err) \= [PersistenceIdParseError](struct.PersistenceIdParseError.html "struct akka_persistence_rs::PersistenceIdParseError")

The associated error which can be returned from parsing.[source](../src/akka_persistence_rs/lib.rs.html#103-116)[§](#method.from_str)#### fn [from\_str](https://doc.rust-lang.org/1.75.0/core/str/traits/trait.FromStr.html#tymethod.from_str)(s: \&[str](https://doc.rust-lang.org/1.75.0/std/primitive.str.html)) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<Self, Self::[Err](https://doc.rust-lang.org/1.75.0/core/str/traits/trait.FromStr.html#associatedtype.Err "type core::str::traits::FromStr::Err")\>

Parses a string `s` to return a value of this type. [Read more](https://doc.rust-lang.org/1.75.0/core/str/traits/trait.FromStr.html#tymethod.from_str)[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#impl-Hash-for-PersistenceId)### impl [Hash](https://doc.rust-lang.org/1.75.0/core/hash/trait.Hash.html "trait core::hash::Hash") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#method.hash)#### fn [hash](https://doc.rust-lang.org/1.75.0/core/hash/trait.Hash.html#tymethod.hash)\<\_\_H: [Hasher](https://doc.rust-lang.org/1.75.0/core/hash/trait.Hasher.html "trait core::hash::Hasher")\>(\&self, state: [\&mut \_\_H](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html))

Feeds this value into the given [`Hasher`](https://doc.rust-lang.org/1.75.0/core/hash/trait.Hasher.html "trait core::hash::Hasher"). [Read more](https://doc.rust-lang.org/1.75.0/core/hash/trait.Hash.html#tymethod.hash)1\.3\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/hash/mod.rs.html#242-244)[§](#method.hash_slice)#### fn [hash\_slice](https://doc.rust-lang.org/1.75.0/core/hash/trait.Hash.html#method.hash_slice)\<H\>(data: \&[\[Self]](https://doc.rust-lang.org/1.75.0/std/primitive.slice.html), state: [\&mut H](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html))where
 H: [Hasher](https://doc.rust-lang.org/1.75.0/core/hash/trait.Hasher.html "trait core::hash::Hasher"),
 Self: [Sized](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sized.html "trait core::marker::Sized"),

Feeds a slice of this type into the given [`Hasher`](https://doc.rust-lang.org/1.75.0/core/hash/trait.Hasher.html "trait core::hash::Hasher"). [Read more](https://doc.rust-lang.org/1.75.0/core/hash/trait.Hash.html#method.hash_slice)[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#impl-Ord-for-PersistenceId)### impl [Ord](https://doc.rust-lang.org/1.75.0/core/cmp/trait.Ord.html "trait core::cmp::Ord") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#method.cmp)#### fn [cmp](https://doc.rust-lang.org/1.75.0/core/cmp/trait.Ord.html#tymethod.cmp)(\&self, other: \&[PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")) \-\> [Ordering](https://doc.rust-lang.org/1.75.0/core/cmp/enum.Ordering.html "enum core::cmp::Ordering")

This method returns an [`Ordering`](https://doc.rust-lang.org/1.75.0/core/cmp/enum.Ordering.html "enum core::cmp::Ordering") between `self` and `other`. [Read more](https://doc.rust-lang.org/1.75.0/core/cmp/trait.Ord.html#tymethod.cmp)1\.21\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/cmp.rs.html#826-828)[§](#method.max)#### fn [max](https://doc.rust-lang.org/1.75.0/core/cmp/trait.Ord.html#method.max)(self, other: Self) \-\> Selfwhere
 Self: [Sized](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sized.html "trait core::marker::Sized"),

Compares and returns the maximum of two values. [Read more](https://doc.rust-lang.org/1.75.0/core/cmp/trait.Ord.html#method.max)1\.21\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/cmp.rs.html#846-848)[§](#method.min)#### fn [min](https://doc.rust-lang.org/1.75.0/core/cmp/trait.Ord.html#method.min)(self, other: Self) \-\> Selfwhere
 Self: [Sized](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sized.html "trait core::marker::Sized"),

Compares and returns the minimum of two values. [Read more](https://doc.rust-lang.org/1.75.0/core/cmp/trait.Ord.html#method.min)1\.50\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/cmp.rs.html#871-874)[§](#method.clamp)#### fn [clamp](https://doc.rust-lang.org/1.75.0/core/cmp/trait.Ord.html#method.clamp)(self, min: Self, max: Self) \-\> Selfwhere
 Self: [Sized](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sized.html "trait core::marker::Sized") \+ [PartialOrd](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html "trait core::cmp::PartialOrd"),

Restrict a value to a certain interval. [Read more](https://doc.rust-lang.org/1.75.0/core/cmp/trait.Ord.html#method.clamp)[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#impl-PartialEq-for-PersistenceId)### impl [PartialEq](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialEq.html "trait core::cmp::PartialEq") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#method.eq)#### fn [eq](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialEq.html#tymethod.eq)(\&self, other: \&[PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")) \-\> [bool](https://doc.rust-lang.org/1.75.0/std/primitive.bool.html)

This method tests for `self` and `other` values to be equal, and is used
by `==`.1\.0\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/cmp.rs.html#239)[§](#method.ne)#### fn [ne](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialEq.html#method.ne)(\&self, other: [\&Rhs](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)) \-\> [bool](https://doc.rust-lang.org/1.75.0/std/primitive.bool.html)

This method tests for `!=`. The default implementation is almost always
sufficient, and should not be overridden without very good reason.[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#impl-PartialOrd-for-PersistenceId)### impl [PartialOrd](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html "trait core::cmp::PartialOrd") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#method.partial_cmp)#### fn [partial\_cmp](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html#tymethod.partial_cmp)(\&self, other: \&[PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")) \-\> [Option](https://doc.rust-lang.org/1.75.0/core/option/enum.Option.html "enum core::option::Option")\<[Ordering](https://doc.rust-lang.org/1.75.0/core/cmp/enum.Ordering.html "enum core::cmp::Ordering")\>

This method returns an ordering between `self` and `other` values if one exists. [Read more](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html#tymethod.partial_cmp)1\.0\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/cmp.rs.html#1122)[§](#method.lt)#### fn [lt](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html#method.lt)(\&self, other: [\&Rhs](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)) \-\> [bool](https://doc.rust-lang.org/1.75.0/std/primitive.bool.html)

This method tests less than (for `self` and `other`) and is used by the `<` operator. [Read more](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html#method.lt)1\.0\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/cmp.rs.html#1139)[§](#method.le)#### fn [le](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html#method.le)(\&self, other: [\&Rhs](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)) \-\> [bool](https://doc.rust-lang.org/1.75.0/std/primitive.bool.html)

This method tests less than or equal to (for `self` and `other`) and is used by the `<=`
operator. [Read more](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html#method.le)1\.0\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/cmp.rs.html#1155)[§](#method.gt)#### fn [gt](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html#method.gt)(\&self, other: [\&Rhs](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)) \-\> [bool](https://doc.rust-lang.org/1.75.0/std/primitive.bool.html)

This method tests greater than (for `self` and `other`) and is used by the `>` operator. [Read more](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html#method.gt)1\.0\.0 · [source](https://doc.rust-lang.org/1.75.0/src/core/cmp.rs.html#1172)[§](#method.ge)#### fn [ge](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html#method.ge)(\&self, other: [\&Rhs](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)) \-\> [bool](https://doc.rust-lang.org/1.75.0/std/primitive.bool.html)

This method tests greater than or equal to (for `self` and `other`) and is used by the `>=`
operator. [Read more](https://doc.rust-lang.org/1.75.0/core/cmp/trait.PartialOrd.html#method.ge)[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#impl-Serialize-for-PersistenceId)### impl [Serialize](https://docs.rs/serde/1.0.196/serde/ser/trait.Serialize.html "trait serde::ser::Serialize") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#method.serialize)#### fn [serialize](https://docs.rs/serde/1.0.196/serde/ser/trait.Serialize.html#tymethod.serialize)\<\_\_S\>(\&self, \_\_serializer: \_\_S) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<\_\_S::[Ok](https://docs.rs/serde/1.0.196/serde/ser/trait.Serializer.html#associatedtype.Ok "type serde::ser::Serializer::Ok"), \_\_S::[Error](https://docs.rs/serde/1.0.196/serde/ser/trait.Serializer.html#associatedtype.Error "type serde::ser::Serializer::Error")\>where
 \_\_S: [Serializer](https://docs.rs/serde/1.0.196/serde/ser/trait.Serializer.html "trait serde::ser::Serializer"),

Serialize this value into the given Serde serializer. [Read more](https://docs.rs/serde/1.0.196/serde/ser/trait.Serialize.html#tymethod.serialize)[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#impl-Eq-for-PersistenceId)### impl [Eq](https://doc.rust-lang.org/1.75.0/core/cmp/trait.Eq.html "trait core::cmp::Eq") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#impl-StructuralEq-for-PersistenceId)### impl [StructuralEq](https://doc.rust-lang.org/1.75.0/core/marker/trait.StructuralEq.html "trait core::marker::StructuralEq") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[source](../src/akka_persistence_rs/lib.rs.html#61)[§](#impl-StructuralPartialEq-for-PersistenceId)### impl [StructuralPartialEq](https://doc.rust-lang.org/1.75.0/core/marker/trait.StructuralPartialEq.html "trait core::marker::StructuralPartialEq") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

## Auto Trait Implementations[§](#synthetic-implementations)

[§](#impl-RefUnwindSafe-for-PersistenceId)### impl [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[§](#impl-Send-for-PersistenceId)### impl [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[§](#impl-Sync-for-PersistenceId)### impl [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[§](#impl-Unpin-for-PersistenceId)### impl [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

[§](#impl-UnwindSafe-for-PersistenceId)### impl [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe") for [PersistenceId](struct.PersistenceId.html "struct akka_persistence_rs::PersistenceId")

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

Mutably borrows from an owned value. [Read more](https://doc.rust-lang.org/1.75.0/core/borrow/trait.BorrowMut.html#tymethod.borrow_mut)[§](#impl-Equivalent%3CK%3E-for-Q)### impl\<Q, K\> Equivalent\<K\> for Qwhere
 Q: [Eq](https://doc.rust-lang.org/1.75.0/core/cmp/trait.Eq.html "trait core::cmp::Eq") \+ ?[Sized](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sized.html "trait core::marker::Sized"),
 K: [Borrow](https://doc.rust-lang.org/1.75.0/core/borrow/trait.Borrow.html "trait core::borrow::Borrow")\<Q\> \+ ?[Sized](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sized.html "trait core::marker::Sized"),

[§](#method.equivalent)#### fn equivalent(\&self, key: [\&K](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)) \-\> [bool](https://doc.rust-lang.org/1.75.0/std/primitive.bool.html)

Checks if this value is equivalent to the given key. Read more[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#763)[§](#impl-From%3CT%3E-for-T)### impl\<T\> [From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")\<T\> for T

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

Uses borrowed data to replace owned data, usually by cloning. [Read more](https://doc.rust-lang.org/1.75.0/alloc/borrow/trait.ToOwned.html#method.clone_into)[§](#impl-ToSmolStr-for-T)### impl\<T\> ToSmolStr for Twhere
 T: [Display](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Display.html "trait core::fmt::Display") \+ ?[Sized](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sized.html "trait core::marker::Sized"),

[§](#method.to_smolstr)#### fn to\_smolstr(\&self) \-\> SmolStr

[source](https://doc.rust-lang.org/1.75.0/src/alloc/string.rs.html#2600)[§](#impl-ToString-for-T)### impl\<T\> [ToString](https://doc.rust-lang.org/1.75.0/alloc/string/trait.ToString.html "trait alloc::string::ToString") for Twhere
 T: [Display](https://doc.rust-lang.org/1.75.0/core/fmt/trait.Display.html "trait core::fmt::Display") \+ ?[Sized](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sized.html "trait core::marker::Sized"),

[source](https://doc.rust-lang.org/1.75.0/src/alloc/string.rs.html#2606)[§](#method.to_string)#### default fn [to\_string](https://doc.rust-lang.org/1.75.0/alloc/string/trait.ToString.html#tymethod.to_string)(\&self) \-\> [String](https://doc.rust-lang.org/1.75.0/alloc/string/struct.String.html "struct alloc::string::String")

Converts the given value to a `String`. [Read more](https://doc.rust-lang.org/1.75.0/alloc/string/trait.ToString.html#tymethod.to_string)[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#803-805)[§](#impl-TryFrom%3CU%3E-for-T)### impl\<T, U\> [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<U\> for Twhere
 U: [Into](https://doc.rust-lang.org/1.75.0/core/convert/trait.Into.html "trait core::convert::Into")\<T\>,

[§](#associatedtype.Error)#### type [Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error) \= [Infallible](https://doc.rust-lang.org/1.75.0/core/convert/enum.Infallible.html "enum core::convert::Infallible")

The type returned in the event of a conversion error.[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#810)[§](#method.try_from)#### fn [try\_from](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#tymethod.try_from)(value: U) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<T, \<T as [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<U\>\>::[Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error "type core::convert::TryFrom::Error")\>

Performs the conversion.[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#788-790)[§](#impl-TryInto%3CU%3E-for-T)### impl\<T, U\> [TryInto](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryInto.html "trait core::convert::TryInto")\<U\> for Twhere
 U: [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<T\>,

[§](#associatedtype.Error-1)#### type [Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryInto.html#associatedtype.Error) \= \<U as [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<T\>\>::[Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error "type core::convert::TryFrom::Error")

The type returned in the event of a conversion error.[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#795)[§](#method.try_into)#### fn [try\_into](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryInto.html#tymethod.try_into)(self) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<U, \<U as [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<T\>\>::[Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error "type core::convert::TryFrom::Error")\>

Performs the conversion.[source](https://docs.rs/serde/1.0.196/src/serde/de/mod.rs.html#608)[§](#impl-DeserializeOwned-for-T)### impl\<T\> [DeserializeOwned](https://docs.rs/serde/1.0.196/serde/de/trait.DeserializeOwned.html "trait serde::de::DeserializeOwned") for Twhere
 T: for\<'de\> [Deserialize](https://docs.rs/serde/1.0.196/serde/de/trait.Deserialize.html "trait serde::de::Deserialize")\<'de\>,

## Code Examples

### Example 1: Structakka_persistence_rs::PersistenceId

```text
pub struct PersistenceId {
    pub entity_type: EntityType,
    pub entity_id: EntityId,
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.PersistenceId.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.PersistenceIdParseError.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/type.EntityId.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/type.EntityType.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.PersistenceId.html](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/struct.PersistenceId.html)*