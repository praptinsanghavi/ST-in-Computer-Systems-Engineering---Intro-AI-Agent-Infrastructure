---
description: Handle event envelopes in any way that an application requires.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/trait.PendingHandler.html
title: PendingHandler in akka_projection_rs - Rust
---

# PendingHandler in akka_projection_rs - Rust

> **Summary:** Handle event envelopes in any way that an application requires.

## Content

# Trait [akka\_projection\_rs](index.html)::[PendingHandler](#)

[source](../src/akka_projection_rs/lib.rs.html#131-146) · 
```
pub trait PendingHandler {
    type [Envelope](#associatedtype.Envelope): [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send");

    const [MAX_PENDING](#associatedconstant.MAX_PENDING): [usize](https://doc.rust-lang.org/1.75.0/std/primitive.usize.html);

    // Required method
    fn [process_pending](#tymethod.process_pending)<'life0, 'async_trait>(
        &'life0 mut self,
        envelope: Self::[Envelope](trait.PendingHandler.html#associatedtype.Envelope "type akka_projection_rs::PendingHandler::Envelope")
    ) -> [Pin](https://doc.rust-lang.org/1.75.0/core/pin/struct.Pin.html "struct core::pin::Pin")<[Box](https://doc.rust-lang.org/1.75.0/alloc/boxed/struct.Box.html "struct alloc::boxed::Box")<dyn [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")<Output = [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")<[Pin](https://doc.rust-lang.org/1.75.0/core/pin/struct.Pin.html "struct core::pin::Pin")<[Box](https://doc.rust-lang.org/1.75.0/alloc/boxed/struct.Box.html "struct alloc::boxed::Box")<dyn [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")<Output = [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")<[()](https://doc.rust-lang.org/1.75.0/std/primitive.unit.html), [HandlerError](struct.HandlerError.html "struct akka_projection_rs::HandlerError")>> + [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send")>>, [HandlerError](struct.HandlerError.html "struct akka_projection_rs::HandlerError")>> + [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") + 'async_trait>>
       where Self: 'async_trait,
             'life0: 'async_trait;
}
```
Expand descriptionHandle event envelopes in any way that an application requires.

## Required Associated Types[§](#required-associated-types)

[source](../src/akka_projection_rs/lib.rs.html#133)#### type [Envelope](#associatedtype.Envelope): [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send")

The envelope processed by the handler.

## Required Associated Constants[§](#required-associated-consts)

[source](../src/akka_projection_rs/lib.rs.html#136)#### const [MAX\_PENDING](#associatedconstant.MAX_PENDING): [usize](https://doc.rust-lang.org/1.75.0/std/primitive.usize.html)

The maximum number of envelopes that can be pending at any time.

## Required Methods[§](#required-methods)

[source](../src/akka_projection_rs/lib.rs.html#142-145)#### fn [process\_pending](#tymethod.process_pending)\<'life0, 'async\_trait\>(
 \&'life0 mut self,
 envelope: Self::[Envelope](trait.PendingHandler.html#associatedtype.Envelope "type akka_projection_rs::PendingHandler::Envelope")
) \-\> [Pin](https://doc.rust-lang.org/1.75.0/core/pin/struct.Pin.html "struct core::pin::Pin")\<[Box](https://doc.rust-lang.org/1.75.0/alloc/boxed/struct.Box.html "struct alloc::boxed::Box")\<dyn [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")\<Output \= [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<[Pin](https://doc.rust-lang.org/1.75.0/core/pin/struct.Pin.html "struct core::pin::Pin")\<[Box](https://doc.rust-lang.org/1.75.0/alloc/boxed/struct.Box.html "struct alloc::boxed::Box")\<dyn [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")\<Output \= [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<[()](https://doc.rust-lang.org/1.75.0/std/primitive.unit.html), [HandlerError](struct.HandlerError.html "struct akka_projection_rs::HandlerError")\>\> \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send")\>\>, [HandlerError](struct.HandlerError.html "struct akka_projection_rs::HandlerError")\>\> \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") \+ 'async\_trait\>\>where
 Self: 'async\_trait,
 'life0: 'async\_trait,

Process an envelope with a pending result.
A handler’s result is “pending” when envelopes can be passed through and the
result of processing one is not immediately known. Meanwhile, more
envelopes can be passed though.

## Object Safety[§](#object-safety)

This trait is **not** [object safe](https://doc.rust-lang.org/1.75.0/reference/items/traits.html#object-safety).## Implementors[§](#implementors)

[source](../src/akka_projection_rs/lib.rs.html#154-168)[§](#impl-PendingHandler-for-UnusedPendingHandler%3CE%3E)### impl\<E\> [PendingHandler](trait.PendingHandler.html "trait akka_projection_rs::PendingHandler") for [UnusedPendingHandler](struct.UnusedPendingHandler.html "struct akka_projection_rs::UnusedPendingHandler")\<E\>where
 E: [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send"),

[§](#associatedtype.Envelope-1)#### type [Envelope](#associatedtype.Envelope) \= E

[source](../src/akka_projection_rs/lib.rs.html#160)[§](#associatedconstant.MAX_PENDING-1)#### const [MAX\_PENDING](#associatedconstant.MAX_PENDING): [usize](https://doc.rust-lang.org/1.75.0/std/primitive.usize.html) \= 0usize

## Code Examples

### Example 1: Traitakka_projection_rs::PendingHandler

```text
pub trait PendingHandler {
    type Envelope: Send;

    const MAX_PENDING: usize;

    // Required method
    fn process_pending<'life0, 'async_trait>(
        &'life0 mut self,
        envelope: Self::Envelope
    ) -> Pin<Box<dyn Future<Output = Result<Pin<Box<dyn Future<Output = Result<(), HandlerError>> + Send>>, HandlerError>> + Send + 'async_trait>>
       where Self: 'async_trait,
             'life0: 'async_trait;
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/struct.HandlerError.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/struct.UnusedPendingHandler.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/trait.PendingHandler.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/trait.PendingHandler.html](https://doc.akka.io/api/akka-edge-rs/current/akka_projection_rs/trait.PendingHandler.html)*