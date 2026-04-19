---
description: 'declaration: package: akka.javasdk.client, interface: AgentClientInSession'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:18Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentClientInSession.html
title: AgentClientInSession
---

# AgentClientInSession

> **Summary:** declaration: package: akka.javasdk.client, interface: AgentClientInSession

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface AgentClientInSession

---

@DoNotInherit
public interface AgentClientInSession
Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`<A1,
R> [DynamicMethodRef](DynamicMethodRef.html "interface in akka.javasdk.client")<A1,R>`
`[dynamicCall](#dynamicCall(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") agentId)`

Agents can be called based on the id without knowing the exact agent class or lambda of the
 agent method by using the {`dynamicCall`} of the component client.

`<T,
R> [AgentMethodRef](AgentMethodRef.html "interface in akka.javasdk.client")<R>`
`[method](#method(akka.japi.function.Function))(akka.japi.function.Function<T,[Agent.Effect](../agent/Agent.Effect.html "interface in akka.javasdk.agent")<R>> methodRef)`

Pass in an Agent command handler method reference, e.g.

`<T,
A1,
R> [AgentMethodRef1](AgentMethodRef1.html "interface in akka.javasdk.client")<A1,R>`
`[method](#method(akka.japi.function.Function2))(akka.japi.function.Function2<T,A1,[Agent.Effect](../agent/Agent.Effect.html "interface in akka.javasdk.agent")<R>> methodRef)`

Pass in an Agent command handler method reference, e.g.

`<T> [ComponentStreamMethodRef](ComponentStreamMethodRef.html "interface in akka.javasdk.client")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[tokenStream](#tokenStream(akka.japi.function.Function))(akka.japi.function.Function<T,[Agent.StreamEffect](../agent/Agent.StreamEffect.html "interface in akka.javasdk.agent")> methodRef)`

Pass in an Agent command handler method reference, e.g.

`<T,
A1> [ComponentStreamMethodRef1](ComponentStreamMethodRef1.html "interface in akka.javasdk.client")<A1,[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[tokenStream](#tokenStream(akka.japi.function.Function2))(akka.japi.function.Function2<T,A1,[Agent.StreamEffect](../agent/Agent.StreamEffect.html "interface in akka.javasdk.agent")> methodRef)`

Pass in an Agent command handler method reference, e.g.

- ## Method Details

	- ### method
	
	
	\<T,
	R\> [AgentMethodRef](AgentMethodRef.html "interface in akka.javasdk.client")\<R\> method(akka.japi.function.Function\<T,[Agent.Effect](../agent/Agent.Effect.html "interface in akka.javasdk.agent")\<R\>\> methodRef)
	Pass in an Agent command handler method reference, e.g. `SummarizerAgent::summarizeSession`
	- ### method
	
	
	\<T,
	A1,
	R\> [AgentMethodRef1](AgentMethodRef1.html "interface in akka.javasdk.client")\<A1,R\> method(akka.japi.function.Function2\<T,A1,[Agent.Effect](../agent/Agent.Effect.html "interface in akka.javasdk.agent")\<R\>\> methodRef)
	Pass in an Agent command handler method reference, e.g. `PlannerAgent::plan`
	- ### tokenStream
	
	
	\<T\> [ComponentStreamMethodRef](ComponentStreamMethodRef.html "interface in akka.javasdk.client")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> tokenStream(akka.japi.function.Function\<T,[Agent.StreamEffect](../agent/Agent.StreamEffect.html "interface in akka.javasdk.agent")\> methodRef)
	Pass in an Agent command handler method reference, e.g. `ExpertAgent::ask`
	- ### tokenStream
	
	
	\<T,
	A1\> [ComponentStreamMethodRef1](ComponentStreamMethodRef1.html "interface in akka.javasdk.client")\<A1,[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> tokenStream(akka.japi.function.Function2\<T,A1,[Agent.StreamEffect](../agent/Agent.StreamEffect.html "interface in akka.javasdk.agent")\> methodRef)
	Pass in an Agent command handler method reference, e.g. `ExpertAgent::ask`
	
	Type Parameters:
	`A1` \- the type of parameter expected by the call
	- ### dynamicCall
	
	
	\<A1,
	R\> [DynamicMethodRef](DynamicMethodRef.html "interface in akka.javasdk.client")\<A1,R\> dynamicCall([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") agentId)
	Agents can be called based on the id without knowing the exact agent class or lambda of the
	 agent method by using the {`dynamicCall`} of the component client.
	
	 
	```
	
	 var response =
	   componentClient
	     .forAgent().inSession(sessionId)
	     .dynamicCall(agentId)
	     .invoke(request);
	 
	```
	
	
	Type Parameters:
	`A1` \- the type of parameter expected by the call
	`R` \- the return type of the call
	Parameters:
	`agentId` \- the componentId of the agent

## Code Examples

### Example 1: dynamicCall

```text
var response =
   componentClient
     .forAgent().inSession(sessionId)
     .dynamicCall(agentId)
     .invoke(request);
```

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.StreamEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/DynamicMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentClientInSession.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentClientInSession.html)*