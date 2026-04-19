---
description: 'declaration: package: akka.javasdk.agent, interface: AgentContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:02Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/AgentContext.html
title: AgentContext
---

# AgentContext

> **Summary:** declaration: package: akka.javasdk.agent, interface: AgentContext

## Content

Package [akka.javasdk.agent](package-summary.html)
# Interface AgentContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`, `[MetadataContext](../MetadataContext.html "interface in akka.javasdk")`

---

public interface AgentContext
extends [MetadataContext](../MetadataContext.html "interface in akka.javasdk")
Context information available to an agent during command handling.

 Provides access to session information and tracing capabilities for agents. The context is
 only available during command processing and will throw an exception if accessed from the agent
 constructor.

 

**Session Management:** The session id identifies the contextual context for the
 agent. Multiple agents can share the same session id to collaborate on a common goal, sharing
 session memory and contextual history.

 

**Tracing:** Custom tracing can be added for observability and debugging
 purposes.

- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[sessionId](#sessionId())()`

Returns the session identifier for this agent interaction.

`[Tracing](../Tracing.html "interface in akka.javasdk")`
`[tracing](#tracing())()`

Provides access to tracing for custom application\-specific tracing.

### Methods inherited from interface akka.javasdk.[Context](../Context.html "interface in akka.javasdk")

`[selfRegion](../Context.html#selfRegion())`

### Methods inherited from interface akka.javasdk.[MetadataContext](../MetadataContext.html "interface in akka.javasdk")

`[metadata](../MetadataContext.html#metadata())`

- ## Method Details

	- ### sessionId
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId()
	Returns the session identifier for this agent interaction.
	
	 The agent participates in a session, which is used for the agent's contextual memory.
	 Session memory is shared between all agents that use the same session id, enabling multi\-agent
	 collaboration and maintaining context across interactions.
	
	
	
	Returns:
	the session id for this agent interaction
	- ### tracing
	
	
	[Tracing](../Tracing.html "interface in akka.javasdk") tracing()
	Provides access to tracing for custom application\-specific tracing.
	
	 Use this to add custom spans and trace information for observability and debugging of agent
	 interactions.
	
	
	
	Returns:
	tracing interface for custom tracing

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/AgentContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/AgentContext.html)*