---
description: 'declaration: package: akka.javasdk.client'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:26Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html
title: akka.javasdk.client
---

# akka.javasdk.client

> **Summary:** declaration: package: akka.javasdk.client

## Content

# Package akka.javasdk.client

---

package akka.javasdk.client

[`ComponentClient`](ComponentClient.html "interface in akka.javasdk.client") is used for calls between components.

- Related Packages

Package
Description
[akka.javasdk](../package-summary.html)

Root package of the Akka SDK.
- Class
Description
[AgentClient](AgentClient.html "interface in akka.javasdk.client")

Not for user extension or instantiation, returned by the SDK component client

[AgentClientInSession](AgentClientInSession.html "interface in akka.javasdk.client")

Not for user extension or instantiation, returned by the SDK component client

[AgentInvokeOnlyMethodRef](AgentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")\<R\>

Zero argument agent component call representation, returning a detailed reply including token
 usage, not executed until invoked.

[AgentInvokeOnlyMethodRef1](AgentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")\<A1,R\>

One argument agent component call representation, returning a detailed reply including token
 usage, not executed until invoked.

[AgentMethodRef](AgentMethodRef.html "interface in akka.javasdk.client")\<R\>

Zero argument agent component call representation.

[AgentMethodRef1](AgentMethodRef1.html "interface in akka.javasdk.client")\<A1,R\>

One argument agent component call representation.

[AgentReplyInvokeOnlyMethodRef](AgentReplyInvokeOnlyMethodRef.html "interface in akka.javasdk.client")\<R\>

Zero argument agent component call representation, returning a detailed reply including token
 usage, not executed until invoked.

[AgentReplyInvokeOnlyMethodRef1](AgentReplyInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")\<A1,R\>

One argument agent component call representation, returning a detailed reply including token
 usage, not executed until invoked.

[ComponentClient](ComponentClient.html "interface in akka.javasdk.client")

Utility to send requests to other components by composing a call that can be executed by the
 runtime.

[ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")\<R\>

Zero argument component deferred call representation, not executed until invoked by some
 mechanism using the deferred call (like a timer executing it later for example)

[ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")\<A1,R\>

One argument component deferred call representation, not executed until invoked by some mechanism
 using the deferred call (like a timer executing it later for example)

[ComponentInvokeOnlyMethodRef](ComponentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")\<R\>

Zero argument component call representation, not executed until invoked.

[ComponentInvokeOnlyMethodRef1](ComponentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")\<A1,R\>

One argument component call representation, not executed until invoked.

[ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")\<R\>

Zero argument component call representation, not executed until invoked or by some mechanism
 using the deferred call (like a timer executing it later for example)

[ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")\<A1,R\>

One argument component call representation, not executed until invoked or by some mechanism using
 the deferred call (like a timer executing it later for example)

[ComponentStreamMethodRef](ComponentStreamMethodRef.html "interface in akka.javasdk.client")\<R\>

Zero argument component call representation, not executed until stream is materialized.

[ComponentStreamMethodRef1](ComponentStreamMethodRef1.html "interface in akka.javasdk.client")\<A1,R\>

One argument component call representation, not executed until stream is materialized.

[DynamicMethodRef](DynamicMethodRef.html "interface in akka.javasdk.client")\<A1,R\>

Zero or one argument component call representation, not executed until invoked.

[EventSourcedEntityClient](EventSourcedEntityClient.html "interface in akka.javasdk.client")

Not for user extension

[KeyValueEntityClient](KeyValueEntityClient.html "interface in akka.javasdk.client")

Not for user extension

[NoEntryFoundException](NoEntryFoundException.html "class in akka.javasdk.client")

Thrown for a query where the query result would be a single entry but none was found.

[TimedActionClient](TimedActionClient.html "interface in akka.javasdk.client")
 
[ViewClient](ViewClient.html "interface in akka.javasdk.client")

Not for user extension

[ViewStreamMethodRef](ViewStreamMethodRef.html "interface in akka.javasdk.client")\<R\>

Zero argument component call representation, query is not executed until stream is materialized.

[ViewStreamMethodRef1](ViewStreamMethodRef1.html "interface in akka.javasdk.client")\<A1,R\>

One argument streaming view query representation, the query is not executed until stream is
 materialized.

[WorkflowClient](WorkflowClient.html "interface in akka.javasdk.client")

Not for user extension

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentClientInSession.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentInvokeOnlyMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentInvokeOnlyMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentReplyInvokeOnlyMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentReplyInvokeOnlyMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/DynamicMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/EventSourcedEntityClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/KeyValueEntityClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/NoEntryFoundException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/TimedActionClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/WorkflowClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html)*