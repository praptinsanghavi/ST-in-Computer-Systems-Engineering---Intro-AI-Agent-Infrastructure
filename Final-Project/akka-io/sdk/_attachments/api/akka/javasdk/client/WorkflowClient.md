---
description: 'declaration: package: akka.javasdk.client, interface: WorkflowClient'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:30Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/WorkflowClient.html
title: WorkflowClient
---

# WorkflowClient

> **Summary:** declaration: package: akka.javasdk.client, interface: WorkflowClient

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface WorkflowClient

---

@DoNotInherit
public interface WorkflowClient
Not for user extension

- ## Method Summary

Modifier and Type
Method
Description
`<T,
R> [ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")<R>`
`[method](#method(akka.japi.function.Function))(akka.japi.function.Function<T,[Workflow.Effect](../workflow/Workflow.Effect.html "interface in akka.javasdk.workflow")<R>> methodRef)`

Pass in a Workflow command handler method reference, e.g.

`<T,
A1,
R> [ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")<A1,R>`
`[method](#method(akka.japi.function.Function2))(akka.japi.function.Function2<T,A1,[Workflow.Effect](../workflow/Workflow.Effect.html "interface in akka.javasdk.workflow")<R>> methodRef)`

Pass in a Workflow command handler method reference, e.g.

`<T,
R> [ComponentStreamMethodRef](ComponentStreamMethodRef.html "interface in akka.javasdk.client")<R>`
`[notificationStream](#notificationStream(akka.japi.function.Function))(akka.japi.function.Function<T,[NotificationPublisher.NotificationStream](../NotificationPublisher.NotificationStream.html "interface in akka.javasdk")<R>> methodRef)`

Pass in a Workflow notification stream getter method reference, e.g.

- ## Method Details

	- ### method
	
	
	\<T,
	R\> [ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")\<R\> method(akka.japi.function.Function\<T,[Workflow.Effect](../workflow/Workflow.Effect.html "interface in akka.javasdk.workflow")\<R\>\> methodRef)
	Pass in a Workflow command handler method reference, e.g. `MyWorkflow::start`
	- ### method
	
	
	\<T,
	A1,
	R\> [ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")\<A1,R\> method(akka.japi.function.Function2\<T,A1,[Workflow.Effect](../workflow/Workflow.Effect.html "interface in akka.javasdk.workflow")\<R\>\> methodRef)
	Pass in a Workflow command handler method reference, e.g. `MyWorkflow::start`
	- ### notificationStream
	
	
	\<T,
	R\> [ComponentStreamMethodRef](ComponentStreamMethodRef.html "interface in akka.javasdk.client")\<R\> notificationStream(akka.japi.function.Function\<T,[NotificationPublisher.NotificationStream](../NotificationPublisher.NotificationStream.html "interface in akka.javasdk")\<R\>\> methodRef)
	Pass in a Workflow notification stream getter method reference, e.g. `MyWorkflow::updates`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/NotificationPublisher.NotificationStream.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/WorkflowClient.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/WorkflowClient.html)*