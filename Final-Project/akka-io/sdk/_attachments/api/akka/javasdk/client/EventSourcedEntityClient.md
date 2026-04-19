---
description: 'declaration: package: akka.javasdk.client, interface: EventSourcedEntityClient'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:26Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/EventSourcedEntityClient.html
title: EventSourcedEntityClient
---

# EventSourcedEntityClient

> **Summary:** declaration: package: akka.javasdk.client, interface: EventSourcedEntityClient

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface EventSourcedEntityClient

---

@DoNotInherit
public interface EventSourcedEntityClient
Not for user extension

- ## Method Summary

Modifier and Type
Method
Description
`<T,
R> [ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")<R>`
`[method](#method(akka.japi.function.Function))(akka.japi.function.Function<T,[EventSourcedEntity.Effect](../eventsourcedentity/EventSourcedEntity.Effect.html "interface in akka.javasdk.eventsourcedentity")<R>> methodRef)`

Pass in an Event Sourced Entity command handler method reference, e.g.

`<T,
A1,
R> [ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")<A1,R>`
`[method](#method(akka.japi.function.Function2))(akka.japi.function.Function2<T,A1,[EventSourcedEntity.Effect](../eventsourcedentity/EventSourcedEntity.Effect.html "interface in akka.javasdk.eventsourcedentity")<R>> methodRef)`

Pass in an Event Sourced Entity command handler method reference, e.g.

`<T,
R> [ComponentStreamMethodRef](ComponentStreamMethodRef.html "interface in akka.javasdk.client")<R>`
`[notificationStream](#notificationStream(akka.japi.function.Function))(akka.japi.function.Function<T,[NotificationPublisher.NotificationStream](../NotificationPublisher.NotificationStream.html "interface in akka.javasdk")<R>> methodRef)`

Pass in an Event Sourced Entity notification stream getter method reference, e.g.

- ## Method Details

	- ### method
	
	
	\<T,
	R\> [ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")\<R\> method(akka.japi.function.Function\<T,[EventSourcedEntity.Effect](../eventsourcedentity/EventSourcedEntity.Effect.html "interface in akka.javasdk.eventsourcedentity")\<R\>\> methodRef)
	Pass in an Event Sourced Entity command handler method reference, e.g. `UserEntity::create`
	- ### method
	
	
	\<T,
	A1,
	R\> [ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")\<A1,R\> method(akka.japi.function.Function2\<T,A1,[EventSourcedEntity.Effect](../eventsourcedentity/EventSourcedEntity.Effect.html "interface in akka.javasdk.eventsourcedentity")\<R\>\> methodRef)
	Pass in an Event Sourced Entity command handler method reference, e.g. `UserEntity::update`
	- ### notificationStream
	
	
	\<T,
	R\> [ComponentStreamMethodRef](ComponentStreamMethodRef.html "interface in akka.javasdk.client")\<R\> notificationStream(akka.japi.function.Function\<T,[NotificationPublisher.NotificationStream](../NotificationPublisher.NotificationStream.html "interface in akka.javasdk")\<R\>\> methodRef)
	Pass in an Event Sourced Entity notification stream getter method reference, e.g. `MyEntity::updates`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/NotificationPublisher.NotificationStream.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.Effect.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/EventSourcedEntityClient.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/EventSourcedEntityClient.html)*