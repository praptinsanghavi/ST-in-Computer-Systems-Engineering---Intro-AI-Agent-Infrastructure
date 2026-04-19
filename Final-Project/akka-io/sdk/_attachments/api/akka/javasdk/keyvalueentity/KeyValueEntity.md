---
description: 'declaration: package: akka.javasdk.keyvalueentity, class: KeyValueEntity,
  interface: ReadOnlyEffect'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:46Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.ReadOnlyEffect.html
title: KeyValueEntity.ReadOnlyEffect
---

# KeyValueEntity.ReadOnlyEffect

> **Summary:** declaration: package: akka.javasdk.keyvalueentity, class: KeyValueEntity, interface: ReadOnlyEffect

## Content

Package [akka.javasdk.keyvalueentity](package-summary.html)
# Interface KeyValueEntity.ReadOnlyEffect\<T\>

Type Parameters:
`T` \- The type of the message that will be returned by this effect

All Superinterfaces:
`[KeyValueEntity.Effect](KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")<T>`

Enclosing class:
`[KeyValueEntity](KeyValueEntity.html "class in akka.javasdk.keyvalueentity")<[S](KeyValueEntity.html "type parameter in KeyValueEntity")>`

---

public static interface KeyValueEntity.ReadOnlyEffect\<T\>
extends [KeyValueEntity.Effect](KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")\<T\>
A read\-only effect that does not modify the entity state. These effects are used for operations
 that only read data or send replies without persisting any changes.

 Read\-only effects are important for multi\-region replication as they can be served from any
 region, not just the primary region where writes are handled.

- ## Nested Class Summary

## Nested classes/interfaces inherited from interface akka.javasdk.keyvalueentity.[KeyValueEntity.Effect](KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")

`[KeyValueEntity.Effect.Builder](KeyValueEntity.Effect.Builder.html "interface in akka.javasdk.keyvalueentity")<[S](KeyValueEntity.Effect.Builder.html "type parameter in KeyValueEntity.Effect.Builder")>, [KeyValueEntity.Effect.OnSuccessBuilder](KeyValueEntity.Effect.OnSuccessBuilder.html "interface in akka.javasdk.keyvalueentity")<[S](KeyValueEntity.Effect.OnSuccessBuilder.html "type parameter in KeyValueEntity.Effect.OnSuccessBuilder")>`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.OnSuccessBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.ReadOnlyEffect.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.ReadOnlyEffect.html)*