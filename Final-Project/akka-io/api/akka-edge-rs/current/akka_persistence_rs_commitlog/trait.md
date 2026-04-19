---
description: Provides the ability to transform the the memory representation of Akka
  Persistence events from and to the records that a CommitLog expects.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/trait.CommitLogMarshaller.html
title: CommitLogMarshaller in akka_persistence_rs_commitlog - Rust
---

# CommitLogMarshaller in akka_persistence_rs_commitlog - Rust

> **Summary:** Provides the ability to transform the the memory representation of Akka Persistence events from and to the records that a CommitLog expects.

## Content

# Trait [akka\_persistence\_rs\_commitlog](index.html)::[CommitLogMarshaller](#)

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#113-147) · 
```
pub trait CommitLogMarshaller<E>where
    for<'async_trait> E: [DeserializeOwned](https://docs.rs/serde/1.0.196/serde/de/trait.DeserializeOwned.html "trait serde::de::DeserializeOwned") + [Serialize](https://docs.rs/serde/1.0.196/serde/ser/trait.Serialize.html "trait serde::ser::Serialize") + [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") + [Sync](https://doc.rust-lang.org/1.75.0/core/marker/trait.Sync.html "trait core::marker::Sync") + 'async_trait,{
    // Required methods
    fn [entity_type](#tymethod.entity_type)(&self) -> [EntityType](../akka_persistence_rs/type.EntityType.html "type akka_persistence_rs::EntityType");
    fn [to_compaction_key](#tymethod.to_compaction_key)(&self, entity_id: &[EntityId](../akka_persistence_rs/type.EntityId.html "type akka_persistence_rs::EntityId"), event: [&E](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)) -> Key;
    fn [to_entity_id](#tymethod.to_entity_id)(&self, record: &ConsumerRecord) -> [Option](https://doc.rust-lang.org/1.75.0/core/option/enum.Option.html "enum core::option::Option")<[EntityId](../akka_persistence_rs/type.EntityId.html "type akka_persistence_rs::EntityId")>;
    fn [envelope](#tymethod.envelope)<'life0, 'async_trait>(
        &'life0 self,
        entity_id: [EntityId](../akka_persistence_rs/type.EntityId.html "type akka_persistence_rs::EntityId"),
        record: ConsumerRecord
    ) -> [Pin](https://doc.rust-lang.org/1.75.0/core/pin/struct.Pin.html "struct core::pin::Pin")<[Box](https://doc.rust-lang.org/1.75.0/alloc/boxed/struct.Box.html "struct alloc::boxed::Box")<dyn [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")<Output = [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")<[EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")<E>, [CannotConsume](struct.CannotConsume.html "struct akka_persistence_rs_commitlog::CannotConsume")>> + [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") + 'async_trait>>
       where Self: 'async_trait,
             'life0: 'async_trait;
    fn [producer_record](#tymethod.producer_record)<'life0, 'life1, 'async_trait>(
        &'life0 self,
        topic: Topic,
        entity_id: [EntityId](../akka_persistence_rs/type.EntityId.html "type akka_persistence_rs::EntityId"),
        seq_nr: [u64](https://doc.rust-lang.org/1.75.0/std/primitive.u64.html),
        timestamp: [DateTime](https://docs.rs/chrono/latest/chrono/datetime/struct.DateTime.html "struct chrono::datetime::DateTime")<[Utc](https://docs.rs/chrono/latest/chrono/offset/utc/struct.Utc.html "struct chrono::offset::utc::Utc")>,
        event: [&'life1 E](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)
    ) -> [Pin](https://doc.rust-lang.org/1.75.0/core/pin/struct.Pin.html "struct core::pin::Pin")<[Box](https://doc.rust-lang.org/1.75.0/alloc/boxed/struct.Box.html "struct alloc::boxed::Box")<dyn [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")<Output = [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")<ProducerRecord, [CannotProduce](struct.CannotProduce.html "struct akka_persistence_rs_commitlog::CannotProduce")>> + [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") + 'async_trait>>
       where Self: 'async_trait,
             'life0: 'async_trait,
             'life1: 'async_trait;
}
```
Expand descriptionProvides the ability to transform the the memory representation of Akka Persistence events from
and to the records that a CommitLog expects.

## Required Methods[§](#required-methods)

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#118)#### fn [entity\_type](#tymethod.entity_type)(\&self) \-\> [EntityType](../akka_persistence_rs/type.EntityType.html "type akka_persistence_rs::EntityType")

Declares the entity type to the marshaller.

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#123)#### fn [to\_compaction\_key](#tymethod.to_compaction_key)(\&self, entity\_id: \&[EntityId](../akka_persistence_rs/type.EntityId.html "type akka_persistence_rs::EntityId"), event: [\&E](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)) \-\> Key

Provide a key we can use for the purposes of log compaction.
A key would generally comprise and event type value held in
the high bits, and the entity id in the lower bits.

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#126)#### fn [to\_entity\_id](#tymethod.to_entity_id)(\&self, record: \&ConsumerRecord) \-\> [Option](https://doc.rust-lang.org/1.75.0/core/option/enum.Option.html "enum core::option::Option")\<[EntityId](../akka_persistence_rs/type.EntityId.html "type akka_persistence_rs::EntityId")\>

Extract an entity id from a consumer envelope.

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#132-136)#### fn [envelope](#tymethod.envelope)\<'life0, 'async\_trait\>(
 \&'life0 self,
 entity\_id: [EntityId](../akka_persistence_rs/type.EntityId.html "type akka_persistence_rs::EntityId"),
 record: ConsumerRecord
) \-\> [Pin](https://doc.rust-lang.org/1.75.0/core/pin/struct.Pin.html "struct core::pin::Pin")\<[Box](https://doc.rust-lang.org/1.75.0/alloc/boxed/struct.Box.html "struct alloc::boxed::Box")\<dyn [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")\<Output \= [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<[EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")\<E\>, [CannotConsume](struct.CannotConsume.html "struct akka_persistence_rs_commitlog::CannotConsume")\>\> \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") \+ 'async\_trait\>\>where
 Self: 'async\_trait,
 'life0: 'async\_trait,

Produce an event envelope from a consumer record.
Note that this may not always be possible due to record formats having
changed, in which case we want the consumer to continue and skip it.
Changes in a record’s layout should not prevent the system from working.

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#139-146)#### fn [producer\_record](#tymethod.producer_record)\<'life0, 'life1, 'async\_trait\>(
 \&'life0 self,
 topic: Topic,
 entity\_id: [EntityId](../akka_persistence_rs/type.EntityId.html "type akka_persistence_rs::EntityId"),
 seq\_nr: [u64](https://doc.rust-lang.org/1.75.0/std/primitive.u64.html),
 timestamp: [DateTime](https://docs.rs/chrono/latest/chrono/datetime/struct.DateTime.html "struct chrono::datetime::DateTime")\<[Utc](https://docs.rs/chrono/latest/chrono/offset/utc/struct.Utc.html "struct chrono::offset::utc::Utc")\>,
 event: [\&'life1 E](https://doc.rust-lang.org/1.75.0/std/primitive.reference.html)
) \-\> [Pin](https://doc.rust-lang.org/1.75.0/core/pin/struct.Pin.html "struct core::pin::Pin")\<[Box](https://doc.rust-lang.org/1.75.0/alloc/boxed/struct.Box.html "struct alloc::boxed::Box")\<dyn [Future](https://doc.rust-lang.org/1.75.0/core/future/future/trait.Future.html "trait core::future::future::Future")\<Output \= [Result](https://doc.rust-lang.org/1.75.0/core/result/enum.Result.html "enum core::result::Result")\<ProducerRecord, [CannotProduce](struct.CannotProduce.html "struct akka_persistence_rs_commitlog::CannotProduce")\>\> \+ [Send](https://doc.rust-lang.org/1.75.0/core/marker/trait.Send.html "trait core::marker::Send") \+ 'async\_trait\>\>where
 Self: 'async\_trait,
 'life0: 'async\_trait,
 'life1: 'async\_trait,

Produce a producer record from an event and its entity info.

## Implementors[§](#implementors)

## Code Examples

### Example 1: Traitakka_persistence_rs_commitlog::CommitLogMarshaller

```text
pub trait CommitLogMarshaller<E>where
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,{
    // Required methods
    fn entity_type(&self) -> EntityType;
    fn to_compaction_key(&self, entity_id: &EntityId, event: &E) -> Key;
    fn to_entity_id(&self, record: &ConsumerRecord) -> Option<EntityId>;
    fn envelope<'life0, 'async_trait>(
        &'life0 self,
        entity_id: EntityId,
        record: ConsumerRecord
    ) -> Pin<Box<dyn Future<Output = Result<EventEnvelope<E>, CannotConsume>> + Send + 'async_trait>>
       where Self: 'async_trait,
             'life0: 'async_trait;
    fn producer_record<'life0, 'life1, 'async_trait>(
        &'life0 self,
        topic: Topic,
        entity_id: EntityId,
        seq_nr: u64,
        timestamp: DateTime<Utc>,
        event: &'life1 E
    ) -> Pin<Box<dyn Future<Output = Result<ProducerRecord, CannotProduce>> + Send + 'async_trait>>
       where Self: 'async_trait,
             'life0: 'async_trait,
             'life1: 'async_trait;
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/type.EntityId.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/type.EntityType.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/index.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/struct.CannotConsume.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/struct.CannotProduce.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/struct.EventEnvelope.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs_commitlog/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/trait.CommitLogMarshaller.html](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/trait.CommitLogMarshaller.html)*