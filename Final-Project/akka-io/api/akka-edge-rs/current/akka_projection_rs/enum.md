---
description: Captures the various types of handlers and the way they are performed.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/enum.Handlers.html
title: Handlers in akka_projection_rs - Rust
---

# Handlers in akka_projection_rs - Rust

> **Summary:** Captures the various types of handlers and the way they are performed.

## Content

# Enum [akka\_projection\_rs](index.html)::[Handlers](#)

[source](../src/akka_projection_rs/lib.rs.html#16-23) · 
```
pub enum Handlers<A, B>where
    A: [Handler](trait.Handler.html "trait akka_projection_rs::Handler"),
    B: [PendingHandler](trait.PendingHandler.html "trait akka_projection_rs::PendingHandler"),{
    Ready(A, B),
    Pending(B, A),
}
```
Expand descriptionCaptures the various types of handlers and the way they are performed.

## Variants[§](#variants)

[§](#variant.Ready)### Ready(A, B)

[§](#variant.Pending)### Pending(B, A)

## Trait Implementations[§](#trait-implementations)

[source](../src/akka_projection_rs/lib.rs.html#25-38)[§](#impl-From%3CA%3E-for-Handlers%3CA,+UnusedPendingHandler%3CE%3E%3E)### impl\<A, E\> [From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")\<A\> for [Handlers](enum.Handlers.html "enum akka_projection_rs::Handlers")\<A, [UnusedPendingHandler](struct.UnusedPendingHandler.html "struct akka_projection_rs::UnusedPendingHandler")\<E\>\>where
 A: [Handler](trait.Handler.html "trait akka_projection_rs::Handler"),
 E: [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),

[source](../src/akka_projection_rs/lib.rs.html#30-37)[§](#method.from-1)#### fn [from](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html#tymethod.from)(handler: A) \-\> Self

Converts to this type from the input type.[source](../src/akka_projection_rs/lib.rs.html#63-80)[§](#impl-From%3CA%3E-for-Handlers%3CFnHandler%3CA,+AR,+E%3E,+UnusedPendingHandler%3CE%3E%3E)### impl\<A, AR, E\> [From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")\<A\> for [Handlers](enum.Handlers.html "enum akka_projection_rs::Handlers")\<[FnHandler](struct.FnHandler.html "struct akka_projection_rs::FnHandler")\<A, AR, E\>, [UnusedPendingHandler](struct.UnusedPendingHandler.html "struct akka_projection_rs::UnusedPendingHandler")\<E\>\>where
 A: [FnMut](https://doc.rust-lang.org/1.75.0/core/ops/function/trait.FnMut.html "trait core::ops::function::FnMut")(E) \-\> AR \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),
 AR: [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")\<Output \= [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<[()](https://doc.rust-lang.org/1.75.0/std/primitive.unit.html), [HandlerError](struct.HandlerError.html "struct akka_projection_rs::HandlerError")\>\> \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),
 E: [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),

[source](../src/akka_projection_rs/lib.rs.html#69-79)[§](#method.from-2)#### fn [from](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html#tymethod.from)(handler: A) \-\> Self

Converts to this type from the input type.[source](../src/akka_projection_rs/lib.rs.html#82-95)[§](#impl-From%3CB%3E-for-Handlers%3CUnusedHandler%3CE%3E,+B%3E)### impl\<B, E\> [From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")\<B\> for [Handlers](enum.Handlers.html "enum akka_projection_rs::Handlers")\<[UnusedHandler](struct.UnusedHandler.html "struct akka_projection_rs::UnusedHandler")\<E\>, B\>where
 B: [PendingHandler](trait.PendingHandler.html "trait akka_projection_rs::PendingHandler"),
 E: [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),

[source](../src/akka_projection_rs/lib.rs.html#87-94)[§](#method.from)#### fn [from](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html#tymethod.from)(handler: B) \-\> Self

Converts to this type from the input type.## Auto Trait Implementations[§](#synthetic-implementations)

[§](#impl-RefUnwindSafe-for-Handlers%3CA,+B%3E)### impl\<A, B\> [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe") for [Handlers](enum.Handlers.html "enum akka_projection_rs::Handlers")\<A, B\>where
 A: [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe"),
 B: [RefUnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.RefUnwindSafe.html "trait core::panic::unwind_safe::RefUnwindSafe"),

[§](#impl-Send-for-Handlers%3CA,+B%3E)### impl\<A, B\> [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") for [Handlers](enum.Handlers.html "enum akka_projection_rs::Handlers")\<A, B\>where
 A: [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),
 B: [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),

[§](#impl-Sync-for-Handlers%3CA,+B%3E)### impl\<A, B\> [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync") for [Handlers](enum.Handlers.html "enum akka_projection_rs::Handlers")\<A, B\>where
 A: [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync"),
 B: [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync"),

[§](#impl-Unpin-for-Handlers%3CA,+B%3E)### impl\<A, B\> [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin") for [Handlers](enum.Handlers.html "enum akka_projection_rs::Handlers")\<A, B\>where
 A: [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin"),
 B: [Unpin](https://doc.rust-lang.org/1.75.0/core/marker/trait.Unpin.html "trait core::marker::Unpin"),

[§](#impl-UnwindSafe-for-Handlers%3CA,+B%3E)### impl\<A, B\> [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe") for [Handlers](enum.Handlers.html "enum akka_projection_rs::Handlers")\<A, B\>where
 A: [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe"),
 B: [UnwindSafe](https://doc.rust-lang.org/1.75.0/core/panic/unwind_safe/trait.UnwindSafe.html "trait core::panic::unwind_safe::UnwindSafe"),

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

Mutably borrows from an owned value. [Read more](https://doc.rust-lang.org/1.75.0/core/borrow/trait.BorrowMut.html#tymethod.borrow_mut)[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#780)[§](#impl-From%3C!%3E-for-T)### impl\<T\> [From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")\<[!](https://doc.rust-lang.org/1.75.0/std/primitive.never.html)\> for T

[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#781)[§](#method.from-3)#### fn [from](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html#tymethod.from)(t: [!](https://doc.rust-lang.org/1.75.0/std/primitive.never.html)) \-\> T

Converts to this type from the input type.[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#763)[§](#impl-From%3CT%3E-for-T)### impl\<T\> [From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")\<T\> for T

[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#766)[§](#method.from-4)#### fn [from](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html#tymethod.from)(t: T) \-\> T

Returns the argument unchanged.

[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#747-749)[§](#impl-Into%3CU%3E-for-T)### impl\<T, U\> [Into](https://doc.rust-lang.org/1.75.0/core/convert/trait.Into.html "trait core::convert::Into")\<U\> for Twhere
 U: [From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")\<T\>,

[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#756)[§](#method.into)#### fn [into](https://doc.rust-lang.org/1.75.0/core/convert/trait.Into.html#tymethod.into)(self) \-\> U

Calls `U::from(self)`.

That is, this conversion is whatever the implementation of
`[From](https://doc.rust-lang.org/1.75.0/core/convert/trait.From.html "trait core::convert::From")<T> for U` chooses to do.

[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#803-805)[§](#impl-TryFrom%3CU%3E-for-T)### impl\<T, U\> [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<U\> for Twhere
 U: [Into](https://doc.rust-lang.org/1.75.0/core/convert/trait.Into.html "trait core::convert::Into")\<T\>,

[§](#associatedtype.Error)#### type [Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error) \= [Infallible](https://doc.rust-lang.org/1.75.0/core/convert/enum.Infallible.html "enum core::convert::Infallible")

The type returned in the event of a conversion error.[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#810)[§](#method.try_from)#### fn [try\_from](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#tymethod.try_from)(value: U) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<T, \<T as [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<U\>\>::[Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error "type core::convert::TryFrom::Error")\>

Performs the conversion.[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#788-790)[§](#impl-TryInto%3CU%3E-for-T)### impl\<T, U\> [TryInto](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryInto.html "trait core::convert::TryInto")\<U\> for Twhere
 U: [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<T\>,

[§](#associatedtype.Error-1)#### type [Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryInto.html#associatedtype.Error) \= \<U as [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<T\>\>::[Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error "type core::convert::TryFrom::Error")

The type returned in the event of a conversion error.[source](https://doc.rust-lang.org/1.75.0/src/core/convert/mod.rs.html#795)[§](#method.try_into)#### fn [try\_into](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryInto.html#tymethod.try_into)(self) \-\> [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<U, \<U as [TryFrom](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html "trait core::convert::TryFrom")\<T\>\>::[Error](https://doc.rust-lang.org/1.75.0/core/convert/trait.TryFrom.html#associatedtype.Error "type core::convert::TryFrom::Error")\>

Performs the conversion.

## Code Examples

### Example 1: Enumakka_projection_rs::Handlers

```text
pub enum Handlers<A, B>where
    A: Handler,
    B: PendingHandler,{
    Ready(A, B),
    Pending(B, A),
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/enum.Handlers.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/struct.FnHandler.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/struct.HandlerError.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/struct.UnusedHandler.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/struct.UnusedPendingHandler.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/trait.Handler.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/trait.PendingHandler.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/enum.Handlers.html](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/enum.Handlers.html)*