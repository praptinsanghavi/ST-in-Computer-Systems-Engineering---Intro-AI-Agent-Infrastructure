---
description: 'declaration: package: akka.javasdk.client, interface: ComponentClient'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:26Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html
title: ComponentClient
---

# ComponentClient

> **Summary:** declaration: package: akka.javasdk.client, interface: ComponentClient

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ComponentClient

---

@DoNotInherit
public interface ComponentClient
Utility to send requests to other components by composing a call that can be executed by the
 runtime. To compose a call:

 1. select component type (and pass id if necessary)
2. select component method, by using Java method reference operator (::)
3. provide a request parameter (if required)

Example of use on a cross\-component call:

 

```

 public CompletionStage<Done> addItem(String cartId, ShoppingCart.LineItem item) {
   return componentClient.forEventSourcedEntity(cartId)
     .method(ShoppingCartEntity::addItem)
     .invokeAsync(item);
 }
 
```

 Not for user extension, implementation provided by the SDK.

- ## Method Summary

Modifier and Type
Method
Description
`[AgentClient](AgentClient.html "interface in akka.javasdk.client")`
`[forAgent](#forAgent())()`

Select [`Agent`](../agent/Agent.html "class in akka.javasdk.agent") as a call target component.

`[EventSourcedEntityClient](EventSourcedEntityClient.html "interface in akka.javasdk.client")`
`[forEventSourcedEntity](#forEventSourcedEntity(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") eventSourcedEntityId)`

Select [`EventSourcedEntity`](../eventsourcedentity/EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity") as a call target component.

`[KeyValueEntityClient](KeyValueEntityClient.html "interface in akka.javasdk.client")`
`[forKeyValueEntity](#forKeyValueEntity(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") keyValueEntityId)`

Select [`KeyValueEntity`](../keyvalueentity/KeyValueEntity.html "class in akka.javasdk.keyvalueentity") as a call target component.

`[TimedActionClient](TimedActionClient.html "interface in akka.javasdk.client")`
`[forTimedAction](#forTimedAction())()`

Select [`TimedAction`](../timedaction/TimedAction.html "class in akka.javasdk.timedaction") as a call target component.

`[ViewClient](ViewClient.html "interface in akka.javasdk.client")`
`[forView](#forView())()`

Select [`View`](../view/View.html "class in akka.javasdk.view") as a call target component.

`[WorkflowClient](WorkflowClient.html "interface in akka.javasdk.client")`
`[forWorkflow](#forWorkflow(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") workflowId)`

Select [`Workflow`](../workflow/Workflow.html "class in akka.javasdk.workflow") as a call target component.

- ## Method Details

	- ### forTimedAction
	
	
	[TimedActionClient](TimedActionClient.html "interface in akka.javasdk.client") forTimedAction()
	Select [`TimedAction`](../timedaction/TimedAction.html "class in akka.javasdk.timedaction") as a call target component.
	- ### forKeyValueEntity
	
	
	[KeyValueEntityClient](KeyValueEntityClient.html "interface in akka.javasdk.client") forKeyValueEntity([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") keyValueEntityId)
	Select [`KeyValueEntity`](../keyvalueentity/KeyValueEntity.html "class in akka.javasdk.keyvalueentity") as a call target component.
	
	Parameters:
	`keyValueEntityId` \- \- key value entity id used to create a call. Must not be null or empty
	 string.
	- ### forEventSourcedEntity
	
	
	[EventSourcedEntityClient](EventSourcedEntityClient.html "interface in akka.javasdk.client") forEventSourcedEntity([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") eventSourcedEntityId)
	Select [`EventSourcedEntity`](../eventsourcedentity/EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity") as a call target component.
	
	Parameters:
	`eventSourcedEntityId` \- \- event sourced entity id used to create a call. Must not be null
	 or empty string.
	- ### forWorkflow
	
	
	[WorkflowClient](WorkflowClient.html "interface in akka.javasdk.client") forWorkflow([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") workflowId)
	Select [`Workflow`](../workflow/Workflow.html "class in akka.javasdk.workflow") as a call target component.
	
	Parameters:
	`workflowId` \- \- workflow id used to create a call. Must not be null or empty string.
	- ### forView
	
	
	[ViewClient](ViewClient.html "interface in akka.javasdk.client") forView()
	Select [`View`](../view/View.html "class in akka.javasdk.view") as a call target component.
	- ### forAgent
	
	
	[AgentClient](AgentClient.html "interface in akka.javasdk.client") forAgent()
	Select [`Agent`](../agent/Agent.html "class in akka.javasdk.agent") as a call target component.

## Code Examples

### Example 1: Interface ComponentClient

```text
public CompletionStage<Done> addItem(String cartId, ShoppingCart.LineItem item) {
   return componentClient.forEventSourcedEntity(cartId)
     .method(ShoppingCartEntity::addItem)
     .invokeAsync(item);
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/EventSourcedEntityClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/KeyValueEntityClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/TimedActionClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/WorkflowClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html)*