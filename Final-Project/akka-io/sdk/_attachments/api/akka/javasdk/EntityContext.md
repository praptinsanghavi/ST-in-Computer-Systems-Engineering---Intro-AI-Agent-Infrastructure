---
description: 'declaration: package: akka.javasdk, interface: EntityContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:46Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/EntityContext.html
title: EntityContext
---

# EntityContext

> **Summary:** declaration: package: akka.javasdk, interface: EntityContext

## Content

Package [akka.javasdk](package-summary.html)
# Interface EntityContext

All Superinterfaces:
`[Context](Context.html "interface in akka.javasdk")`

All Known Subinterfaces:
`[EventContext](eventsourcedentity/EventContext.html "interface in akka.javasdk.eventsourcedentity")`, `[EventSourcedEntityContext](eventsourcedentity/EventSourcedEntityContext.html "interface in akka.javasdk.eventsourcedentity")`, `[KeyValueEntityContext](keyvalueentity/KeyValueEntityContext.html "interface in akka.javasdk.keyvalueentity")`

---

public interface EntityContext
extends [Context](Context.html "interface in akka.javasdk")
Root context for all contexts that pertain to entities, that is, things that are addressable via
 an entity id.

- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[entityId](#entityId())()`

The id of the entity that this context is for.

### Methods inherited from interface akka.javasdk.[Context](Context.html "interface in akka.javasdk")

`[selfRegion](Context.html#selfRegion())`

- ## Method Details

	- ### entityId
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") entityId()
	The id of the entity that this context is for.
	
	Returns:
	The entity id.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/EntityContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/EntityContext.html)*