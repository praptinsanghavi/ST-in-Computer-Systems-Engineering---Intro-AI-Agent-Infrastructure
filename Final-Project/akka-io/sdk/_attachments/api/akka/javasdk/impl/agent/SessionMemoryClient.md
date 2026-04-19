---
description: 'declaration: package: akka.javasdk.impl.agent, class: SessionMemoryClient'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:38Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/impl/agent/SessionMemoryClient.html
title: SessionMemoryClient
---

# SessionMemoryClient

> **Summary:** declaration: package: akka.javasdk.impl.agent, class: SessionMemoryClient

## Content

Package [akka.javasdk.impl.agent](package-summary.html)
# Class SessionMemoryClient

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.impl.agent.SessionMemoryClient

All Implemented Interfaces:
`[SessionMemory](../../agent/SessionMemory.html "interface in akka.javasdk.agent")`

---

@InternalApi
public final class SessionMemoryClient
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
implements [SessionMemory](../../agent/SessionMemory.html "interface in akka.javasdk.agent")
INTERNAL USE Not for user extension or instantiation

- ## Nested Class Summary

Nested Classes

Modifier and Type
Class
Description
`static final record`
`[SessionMemoryClient.MemorySettings](SessionMemoryClient.MemorySettings.html "class in akka.javasdk.impl.agent")`
- ## Constructor Summary

Constructors

Constructor
Description
`[SessionMemoryClient](#%3Cinit%3E(akka.javasdk.client.ComponentClient,akka.javasdk.impl.agent.SessionMemoryClient.MemorySettings))([ComponentClient](../../client/ComponentClient.html "interface in akka.javasdk.client") componentClient,
 [SessionMemoryClient.MemorySettings](SessionMemoryClient.MemorySettings.html "class in akka.javasdk.impl.agent") memorySettings)`
 
`[SessionMemoryClient](#%3Cinit%3E(akka.javasdk.client.ComponentClient,com.typesafe.config.Config))([ComponentClient](../../client/ComponentClient.html "interface in akka.javasdk.client") componentClient,
 com.typesafe.config.Config memoryConfig)`
- ## Method Summary

Modifier and Type
Method
Description
`void`
`[addInteraction](#addInteraction(java.lang.String,akka.javasdk.agent.SessionMessage.MultimodalUserMessage,java.util.List))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
 [SessionMessage.MultimodalUserMessage](../../agent/SessionMessage.MultimodalUserMessage.html "class in akka.javasdk.agent") userMessage,
 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[SessionMessage](../../agent/SessionMessage.html "interface in akka.javasdk.agent")> messages)`

Adds an interaction between a user and an AI model to the session history for the specified
 session, supporting multimodal content.

`void`
`[addInteraction](#addInteraction(java.lang.String,akka.javasdk.agent.SessionMessage.UserMessage,java.util.List))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
 [SessionMessage.UserMessage](../../agent/SessionMessage.UserMessage.html "class in akka.javasdk.agent") userMessage,
 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[SessionMessage](../../agent/SessionMessage.html "interface in akka.javasdk.agent")> messages)`

Adds an interaction between a user and an AI model to the session history for the specified
 session.

`[SessionHistory](../../agent/SessionHistory.html "class in akka.javasdk.agent")`
`[getHistory](#getHistory(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId)`

Retrieves the complete session history for the specified session.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### SessionMemoryClient
	
	
	public SessionMemoryClient([ComponentClient](../../client/ComponentClient.html "interface in akka.javasdk.client") componentClient,
	 com.typesafe.config.Config memoryConfig)
	- ### SessionMemoryClient
	
	
	public SessionMemoryClient([ComponentClient](../../client/ComponentClient.html "interface in akka.javasdk.client") componentClient,
	 [SessionMemoryClient.MemorySettings](SessionMemoryClient.MemorySettings.html "class in akka.javasdk.impl.agent") memorySettings)
- ## Method Details

	- ### addInteraction
	
	
	public void addInteraction([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
	 [SessionMessage.MultimodalUserMessage](../../agent/SessionMessage.MultimodalUserMessage.html "class in akka.javasdk.agent") userMessage,
	 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](../../agent/SessionMessage.html "interface in akka.javasdk.agent")\> messages)
	Description copied from interface: `[SessionMemory](../../agent/SessionMemory.html#addInteraction(java.lang.String,akka.javasdk.agent.SessionMessage.MultimodalUserMessage,java.util.List))`
	Adds an interaction between a user and an AI model to the session history for the specified
	 session, supporting multimodal content.
	
	 This overload accepts a [`SessionMessage.MultimodalUserMessage`](../../agent/SessionMessage.MultimodalUserMessage.html "class in akka.javasdk.agent") which can contain
	 multiple content types including text and images, enabling multimodal interactions.
	
	
	
	Specified by:
	`[addInteraction](../../agent/SessionMemory.html#addInteraction(java.lang.String,akka.javasdk.agent.SessionMessage.MultimodalUserMessage,java.util.List))` in interface `[SessionMemory](../../agent/SessionMemory.html "interface in akka.javasdk.agent")`
	Parameters:
	`sessionId` \- The unique identifier for the contextual session
	`userMessage` \- The user message containing multimodal content (text, images, etc.)
	`messages` \- All other messages generated during this interaction, typically AiMessage but
	 also Tool Call responses.
	- ### addInteraction
	
	
	public void addInteraction([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
	 [SessionMessage.UserMessage](../../agent/SessionMessage.UserMessage.html "class in akka.javasdk.agent") userMessage,
	 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](../../agent/SessionMessage.html "interface in akka.javasdk.agent")\> messages)
	Description copied from interface: `[SessionMemory](../../agent/SessionMemory.html#addInteraction(java.lang.String,akka.javasdk.agent.SessionMessage.UserMessage,java.util.List))`
	Adds an interaction between a user and an AI model to the session history for the specified
	 session.
	
	Specified by:
	`[addInteraction](../../agent/SessionMemory.html#addInteraction(java.lang.String,akka.javasdk.agent.SessionMessage.UserMessage,java.util.List))` in interface `[SessionMemory](../../agent/SessionMemory.html "interface in akka.javasdk.agent")`
	Parameters:
	`sessionId` \- The unique identifier for the contextual session
	`userMessage` \- The content of the user message
	`messages` \- All other messages generated during this interaction, typically AiMessage but
	 also Tool Call responses.
	- ### getHistory
	
	
	public [SessionHistory](../../agent/SessionHistory.html "class in akka.javasdk.agent") getHistory([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId)
	Description copied from interface: `[SessionMemory](../../agent/SessionMemory.html#getHistory(java.lang.String))`
	Retrieves the complete session history for the specified session. For very long sessions, this
	 might return a compacted version of the history.
	
	Specified by:
	`[getHistory](../../agent/SessionMemory.html#getHistory(java.lang.String))` in interface `[SessionMemory](../../agent/SessionMemory.html "interface in akka.javasdk.agent")`
	Parameters:
	`sessionId` \- The unique identifier for the contextual session
	Returns:
	The complete session history containing all messages

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionHistory.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemory.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.MultimodalUserMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.UserMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/impl/agent/SessionMemoryClient.MemorySettings.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/impl/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/impl/agent/SessionMemoryClient.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/impl/agent/SessionMemoryClient.html)*