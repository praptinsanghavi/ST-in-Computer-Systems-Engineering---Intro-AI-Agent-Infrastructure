---
description: 'declaration: package: akka.javasdk.keyvalueentity, interface: KeyValueEntityContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:44Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntityContext.html
title: KeyValueEntityContext
---

# KeyValueEntityContext

> **Summary:** declaration: package: akka.javasdk.keyvalueentity, interface: KeyValueEntityContext

## Content

Package [akka.javasdk.keyvalueentity](package-summary.html)
# Interface KeyValueEntityContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`, `[EntityContext](../EntityContext.html "interface in akka.javasdk")`

---

public interface KeyValueEntityContext
extends [EntityContext](../EntityContext.html "interface in akka.javasdk")
Context information available during Key Value Entity construction and initialization. This
 context provides access to entity metadata and configuration that is available throughout the
 entity's lifecycle.

 The KeyValueEntityContext is typically injected into the entity constructor and can be used to
 access the entity id and other contextual information needed during entity setup.

 

Unlike [`CommandContext`](CommandContext.html "interface in akka.javasdk.keyvalueentity"), this context is available during entity construction and is not
 limited to command processing.

- ## Method Summary

### Methods inherited from interface akka.javasdk.[Context](../Context.html "interface in akka.javasdk")

`[selfRegion](../Context.html#selfRegion())`

### Methods inherited from interface akka.javasdk.[EntityContext](../EntityContext.html "interface in akka.javasdk")

`[entityId](../EntityContext.html#entityId())`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/EntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntityContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntityContext.html)*