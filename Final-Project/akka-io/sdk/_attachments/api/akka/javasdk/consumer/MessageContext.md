---
description: 'declaration: package: akka.javasdk.consumer, interface: MessageContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:32Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/MessageContext.html
title: MessageContext
---

# MessageContext

> **Summary:** declaration: package: akka.javasdk.consumer, interface: MessageContext

## Content

Package [akka.javasdk.consumer](package-summary.html)
# Interface MessageContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`, `[MetadataContext](../MetadataContext.html "interface in akka.javasdk")`, `[OriginAwareContext](../OriginAwareContext.html "interface in akka.javasdk")`

---

public interface MessageContext
extends [MetadataContext](../MetadataContext.html "interface in akka.javasdk"), [OriginAwareContext](../OriginAwareContext.html "interface in akka.javasdk")
Context for an incoming message.

- ## Method Summary

Modifier and Type
Method
Description
`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[eventSubject](#eventSubject())()`

The origin subject of the [`CloudEvent`](../CloudEvent.html "interface in akka.javasdk").

`[Tracing](../Tracing.html "interface in akka.javasdk")`
`[tracing](#tracing())()`

Access to tracing for custom app specific tracing.

### Methods inherited from interface akka.javasdk.[Context](../Context.html "interface in akka.javasdk")

`[selfRegion](../Context.html#selfRegion())`

### Methods inherited from interface akka.javasdk.[MetadataContext](../MetadataContext.html "interface in akka.javasdk")

`[metadata](../MetadataContext.html#metadata())`

### Methods inherited from interface akka.javasdk.[OriginAwareContext](../OriginAwareContext.html "interface in akka.javasdk")

`[hasLocalOrigin](../OriginAwareContext.html#hasLocalOrigin()), [originRegion](../OriginAwareContext.html#originRegion())`

- ## Method Details

	- ### eventSubject
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> eventSubject()
	The origin subject of the [`CloudEvent`](../CloudEvent.html "interface in akka.javasdk"). For example, the entity id when the event was
	 emitted from an entity.
	- ### tracing
	
	
	[Tracing](../Tracing.html "interface in akka.javasdk") tracing()
	Access to tracing for custom app specific tracing.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CloudEvent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/OriginAwareContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/MessageContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/MessageContext.html)*