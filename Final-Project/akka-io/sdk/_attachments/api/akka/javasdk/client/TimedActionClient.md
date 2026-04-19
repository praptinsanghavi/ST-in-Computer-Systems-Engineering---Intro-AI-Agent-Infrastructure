---
description: 'declaration: package: akka.javasdk.client, interface: TimedActionClient'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:28Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/TimedActionClient.html
title: TimedActionClient
---

# TimedActionClient

> **Summary:** declaration: package: akka.javasdk.client, interface: TimedActionClient

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface TimedActionClient

---

public interface TimedActionClient

- ## Method Summary

Modifier and Type
Method
Description
`<T,
R> [ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")<R>`
`[method](#method(akka.japi.function.Function))(akka.japi.function.Function<T,[TimedAction.Effect](../timedaction/TimedAction.Effect.html "interface in akka.javasdk.timedaction")> methodRef)`

Pass in an Action method reference, e.g.

`<T,
A1,
R> [ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")<A1,R>`
`[method](#method(akka.japi.function.Function2))(akka.japi.function.Function2<T,A1,[TimedAction.Effect](../timedaction/TimedAction.Effect.html "interface in akka.javasdk.timedaction")> methodRef)`

Pass in an Action method reference, e.g.

- ## Method Details

	- ### method
	
	
	\<T,
	R\> [ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")\<R\> method(akka.japi.function.Function\<T,[TimedAction.Effect](../timedaction/TimedAction.Effect.html "interface in akka.javasdk.timedaction")\> methodRef)
	Pass in an Action method reference, e.g. `MyAction::create`
	- ### method
	
	
	\<T,
	A1,
	R\> [ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")\<A1,R\> method(akka.japi.function.Function2\<T,A1,[TimedAction.Effect](../timedaction/TimedAction.Effect.html "interface in akka.javasdk.timedaction")\> methodRef)
	Pass in an Action method reference, e.g. `MyAction::create`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.Effect.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/TimedActionClient.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/TimedActionClient.html)*