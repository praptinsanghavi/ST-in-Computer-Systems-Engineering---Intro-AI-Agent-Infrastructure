---
description: 'declaration: package: akka.javasdk.keyvalueentity, class: KeyValueEntity,
  interface: Effect, interface: OnSuccessBuilder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:46Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.OnSuccessBuilder.html
title: KeyValueEntity.Effect.OnSuccessBuilder
---

# KeyValueEntity.Effect.OnSuccessBuilder

> **Summary:** declaration: package: akka.javasdk.keyvalueentity, class: KeyValueEntity, interface: Effect, interface: OnSuccessBuilder

## Content

Package [akka.javasdk.keyvalueentity](package-summary.html)
# Interface KeyValueEntity.Effect.OnSuccessBuilder\<S\>

Type Parameters:
`S` \- The type of the state for this entity

Enclosing interface:
`[KeyValueEntity.Effect](KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")<[T](KeyValueEntity.Effect.html "type parameter in KeyValueEntity.Effect")>`

---

public static interface KeyValueEntity.Effect.OnSuccessBuilder\<S\>
Builder for chaining a reply after a successful state operation like `updateState` or
 `deleteEntity`. This allows you to both modify the entity and send a response to the
 caller in a single effect.

- ## Method Summary

Modifier and Type
Method
Description
`<T> [KeyValueEntity.Effect](KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")<T>`
`[thenReply](#thenReply(T))(T message)`

Sends a reply message to the caller after the state operation (update or delete) completes
 successfully.

`<T> [KeyValueEntity.Effect](KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")<T>`
`[thenReply](#thenReply(T,akka.javasdk.Metadata))(T message,
 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

Sends a reply message with additional metadata to the caller after the state operation
 completes successfully.

`[KeyValueEntity.Effect.OnSuccessBuilder](KeyValueEntity.Effect.OnSuccessBuilder.html "interface in akka.javasdk.keyvalueentity")<[S](KeyValueEntity.Effect.OnSuccessBuilder.html "type parameter in KeyValueEntity.Effect.OnSuccessBuilder")>`
`[updateReplicationFilter](#updateReplicationFilter(akka.javasdk.keyvalueentity.ReplicationFilter.Builder))([ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.keyvalueentity") filter)`

Change the replication filter for this entity, combined with updating state.

- ## Method Details

	- ### thenReply
	
	
	\<T\> [KeyValueEntity.Effect](KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")\<T\> thenReply(T message)
	Sends a reply message to the caller after the state operation (update or delete) completes
	 successfully. This is typically used to confirm the operation and return the new state or
	 operation result.
	
	Type Parameters:
	`T` \- the type of the reply message
	Parameters:
	`message` \- the payload of the reply message
	Returns:
	an effect that will perform the state operation and then send the reply
	- ### thenReply
	
	
	\<T\> [KeyValueEntity.Effect](KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")\<T\> thenReply(T message,
	 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	Sends a reply message with additional metadata to the caller after the state operation
	 completes successfully.
	
	Type Parameters:
	`T` \- the type of the reply message
	Parameters:
	`message` \- the payload of the reply message
	`metadata` \- additional metadata to include with the reply
	Returns:
	an effect that will perform the state operation and then send the reply
	- ### updateReplicationFilter
	
	
	[KeyValueEntity.Effect.OnSuccessBuilder](KeyValueEntity.Effect.OnSuccessBuilder.html "interface in akka.javasdk.keyvalueentity")\<[S](KeyValueEntity.Effect.OnSuccessBuilder.html "type parameter in KeyValueEntity.Effect.OnSuccessBuilder")\> updateReplicationFilter([ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.keyvalueentity") filter)
	Change the replication filter for this entity, combined with updating state.
	
	 State us by default replicated to all regions that have been enabled for the service.
	 This method allows you to control which regions participate in the replication for this
	 specific entity instance. This is useful for regulatory reasons or as cost optimization.
	
	 
	
	This effect can be combined with updating the state. For example, you can update the
	 state and then update the replication filter in the same command handler.
	
	 
	
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
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.OnSuccessBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/ReplicationFilter.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.OnSuccessBuilder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.OnSuccessBuilder.html)*