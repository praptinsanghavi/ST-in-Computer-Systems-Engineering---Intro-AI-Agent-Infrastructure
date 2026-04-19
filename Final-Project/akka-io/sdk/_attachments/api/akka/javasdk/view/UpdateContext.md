---
description: 'declaration: package: akka.javasdk.view, interface: UpdateContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:11Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/UpdateContext.html
title: UpdateContext
---

# UpdateContext

> **Summary:** declaration: package: akka.javasdk.view, interface: UpdateContext

## Content

Package [akka.javasdk.view](package-summary.html)
# Interface UpdateContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`, `[MetadataContext](../MetadataContext.html "interface in akka.javasdk")`, `[OriginAwareContext](../OriginAwareContext.html "interface in akka.javasdk")`

---

public interface UpdateContext
extends [MetadataContext](../MetadataContext.html "interface in akka.javasdk"), [OriginAwareContext](../OriginAwareContext.html "interface in akka.javasdk")
Context for view update calls.

- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[eventName](#eventName())()`

The name of the event being handled.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[eventSubject](#eventSubject())()`

The origin subject of the [`CloudEvent`](../CloudEvent.html "interface in akka.javasdk").

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
	- ### eventName
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") eventName()
	The name of the event being handled.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CloudEvent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/OriginAwareContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/UpdateContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/UpdateContext.html)*