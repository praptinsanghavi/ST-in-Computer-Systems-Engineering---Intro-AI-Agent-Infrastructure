---
description: 'declaration: package: akka.javasdk.eventsourcedentity, class: EventSourcedEntity,
  interface: Effect, interface: OnSuccessBuilder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:36Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.Effect.OnSuccessBuilder.html
title: EventSourcedEntity.Effect.OnSuccessBuilder
---

# EventSourcedEntity.Effect.OnSuccessBuilder

> **Summary:** declaration: package: akka.javasdk.eventsourcedentity, class: EventSourcedEntity, interface: Effect, interface: OnSuccessBuilder

## Content

Package [akka.javasdk.eventsourcedentity](package-summary.html)
# Interface EventSourcedEntity.Effect.OnSuccessBuilder\<S\>

Enclosing interface:
`[EventSourcedEntity.Effect](EventSourcedEntity.Effect.html "interface in akka.javasdk.eventsourcedentity")<[T](EventSourcedEntity.Effect.html "type parameter in EventSourcedEntity.Effect")>`

---

public static interface EventSourcedEntity.Effect.OnSuccessBuilder\<S\>

- ## Method Summary

Modifier and Type
Method
Description
`[EventSourcedEntity.Effect.OnSuccessBuilder](EventSourcedEntity.Effect.OnSuccessBuilder.html "interface in akka.javasdk.eventsourcedentity")<[S](EventSourcedEntity.Effect.OnSuccessBuilder.html "type parameter in EventSourcedEntity.Effect.OnSuccessBuilder")>`
`[deleteEntity](#deleteEntity())()`

Delete the entity.

`<T> [EventSourcedEntity.Effect](EventSourcedEntity.Effect.html "interface in akka.javasdk.eventsourcedentity")<T>`
`[thenReply](#thenReply(java.util.function.Function))([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")<[S](EventSourcedEntity.Effect.OnSuccessBuilder.html "type parameter in EventSourcedEntity.Effect.OnSuccessBuilder"),T> replyMessage)`

Reply after for example `persist` event.

`<T> [EventSourcedEntity.Effect](EventSourcedEntity.Effect.html "interface in akka.javasdk.eventsourcedentity")<T>`
`[thenReply](#thenReply(java.util.function.Function,akka.javasdk.Metadata))([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")<[S](EventSourcedEntity.Effect.OnSuccessBuilder.html "type parameter in EventSourcedEntity.Effect.OnSuccessBuilder"),T> replyMessage,
 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

Reply after for example `persist` event.

`[EventSourcedEntity.Effect.OnSuccessBuilder](EventSourcedEntity.Effect.OnSuccessBuilder.html "interface in akka.javasdk.eventsourcedentity")<[S](EventSourcedEntity.Effect.OnSuccessBuilder.html "type parameter in EventSourcedEntity.Effect.OnSuccessBuilder")>`
`[updateReplicationFilter](#updateReplicationFilter(akka.javasdk.eventsourcedentity.ReplicationFilter.Builder))([ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.eventsourcedentity") filter)`

Change the replication filter for this entity, combined with persisting events.

- ## Method Details

	- ### deleteEntity
	
	
	[EventSourcedEntity.Effect.OnSuccessBuilder](EventSourcedEntity.Effect.OnSuccessBuilder.html "interface in akka.javasdk.eventsourcedentity")\<[S](EventSourcedEntity.Effect.OnSuccessBuilder.html "type parameter in EventSourcedEntity.Effect.OnSuccessBuilder")\> deleteEntity()
	Delete the entity. No addition events are allowed. To observe the deletion in consumers and
	 views, persist a final event representing the deletion before triggering delete.
	- ### thenReply
	
	
	\<T\> [EventSourcedEntity.Effect](EventSourcedEntity.Effect.html "interface in akka.javasdk.eventsourcedentity")\<T\> thenReply([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")\<[S](EventSourcedEntity.Effect.OnSuccessBuilder.html "type parameter in EventSourcedEntity.Effect.OnSuccessBuilder"),T\> replyMessage)
	Reply after for example `persist` event.
	
	Type Parameters:
	`T` \- The type of the message that must be returned by this call.
	Parameters:
	`replyMessage` \- Function to create the reply message from the new state.
	Returns:
	A message reply.
	- ### thenReply
	
	
	\<T\> [EventSourcedEntity.Effect](EventSourcedEntity.Effect.html "interface in akka.javasdk.eventsourcedentity")\<T\> thenReply([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")\<[S](EventSourcedEntity.Effect.OnSuccessBuilder.html "type parameter in EventSourcedEntity.Effect.OnSuccessBuilder"),T\> replyMessage,
	 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	Reply after for example `persist` event.
	
	Type Parameters:
	`T` \- The type of the message that must be returned by this call.
	Parameters:
	`replyMessage` \- Function to create the reply message from the new state.
	`metadata` \- The metadata for the message.
	Returns:
	A message reply.
	- ### updateReplicationFilter
	
	
	[EventSourcedEntity.Effect.OnSuccessBuilder](EventSourcedEntity.Effect.OnSuccessBuilder.html "interface in akka.javasdk.eventsourcedentity")\<[S](EventSourcedEntity.Effect.OnSuccessBuilder.html "type parameter in EventSourcedEntity.Effect.OnSuccessBuilder")\> updateReplicationFilter([ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.eventsourcedentity") filter)
	Change the replication filter for this entity, combined with persisting events.
	
	 Events are by default replicated to all regions that have been enabled for the service.
	 This method allows you to control which regions participate in the replication for this
	 specific entity instance. This is useful for regulatory reasons or as cost optimization.
	
	 
	
	This effect can be combined with persisting events. For example, you can persist an
	 event and then update the replication filter in the same command handler.
	
	 
	
	The replication filter can only be updated from the primary region of the entity, or the
	 entity will become the primary if using the request\-region primary selection strategy. The
	 filter is durable for the specific entity instance and can be changed without deploying a
	 new version.
	
	 
	
	The region where the update is made (the self region) is automatically included in the
	 replication filter. The changes are additive, meaning that if you first update the filter
	 to include one region and then later make another update to include a different region from
	 the same entity, both regions are included.
	
	
	
	Parameters:
	`filter` \- the replication filter defining which regions to include or exclude
	Returns:
	an effect builder for chaining additional operations

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.Effect.OnSuccessBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/ReplicationFilter.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.Effect.OnSuccessBuilder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.Effect.OnSuccessBuilder.html)*