---
description: 'declaration: package: akka.javasdk.agent, interface: SessionMemory'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:24Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemory.html
title: SessionMemory
---

# SessionMemory

> **Summary:** declaration: package: akka.javasdk.agent, interface: SessionMemory

## Content

Package [akka.javasdk.agent](package-summary.html)
# Interface SessionMemory

All Known Implementing Classes:
`[SessionMemoryClient](../impl/agent/SessionMemoryClient.html "class in akka.javasdk.impl.agent")`

---

public interface SessionMemory
Interface for managing contextual session history between users and AI models.

 SessionMemory provides functionality to store, retrieve, and manage messages exchanged during
 interactions in an agent system. It enables agents to maintain context across multiple
 interactions within the same session.

 

**Default Implementation:** The default implementation is backed by [`SessionMemoryEntity`](SessionMemoryEntity.html "class in akka.javasdk.agent"), a built\-in Event Sourced Entity that automatically stores contextual
 history. This provides durability and allows for session memory to be shared between multiple
 agents using the same session id.

 

**Custom Implementation:** You can provide a custom implementation using [`MemoryProvider.custom(SessionMemory)`](MemoryProvider.html#custom(akka.javasdk.agent.SessionMemory)) to store session memory in external databases or services.

 

**Memory Management:** Session memory can be configured to limit the amount of
 history retained, either by message count or total size, to control token usage and performance.

- ## Method Summary

Modifier and Type
Method
Description
`void`
`[addInteraction](#addInteraction(java.lang.String,akka.javasdk.agent.SessionMessage.MultimodalUserMessage,java.util.List))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
 [SessionMessage.MultimodalUserMessage](SessionMessage.MultimodalUserMessage.html "class in akka.javasdk.agent") userMessage,
 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")> messages)`

Adds an interaction between a user and an AI model to the session history for the specified
 session, supporting multimodal content.

`void`
`[addInteraction](#addInteraction(java.lang.String,akka.javasdk.agent.SessionMessage.UserMessage,java.util.List))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
 [SessionMessage.UserMessage](SessionMessage.UserMessage.html "class in akka.javasdk.agent") userMessage,
 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")> messages)`

Adds an interaction between a user and an AI model to the session history for the specified
 session.

`[SessionHistory](SessionHistory.html "class in akka.javasdk.agent")`
`[getHistory](#getHistory(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId)`

Retrieves the complete session history for the specified session.

- ## Method Details

	- ### addInteraction
	
	
	void addInteraction([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
	 [SessionMessage.UserMessage](SessionMessage.UserMessage.html "class in akka.javasdk.agent") userMessage,
	 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")\> messages)
	Adds an interaction between a user and an AI model to the session history for the specified
	 session.
	
	Parameters:
	`sessionId` \- The unique identifier for the contextual session
	`userMessage` \- The content of the user message
	`messages` \- All other messages generated during this interaction, typically AiMessage but
	 also Tool Call responses.
	- ### addInteraction
	
	
	void addInteraction([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId,
	 [SessionMessage.MultimodalUserMessage](SessionMessage.MultimodalUserMessage.html "class in akka.javasdk.agent") userMessage,
	 [List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<[SessionMessage](SessionMessage.html "interface in akka.javasdk.agent")\> messages)
	Adds an interaction between a user and an AI model to the session history for the specified
	 session, supporting multimodal content.
	
	 This overload accepts a [`SessionMessage.MultimodalUserMessage`](SessionMessage.MultimodalUserMessage.html "class in akka.javasdk.agent") which can contain
	 multiple content types including text and images, enabling multimodal interactions.
	
	
	
	Parameters:
	`sessionId` \- The unique identifier for the contextual session
	`userMessage` \- The user message containing multimodal content (text, images, etc.)
	`messages` \- All other messages generated during this interaction, typically AiMessage but
	 also Tool Call responses.
	- ### getHistory
	
	
	[SessionHistory](SessionHistory.html "class in akka.javasdk.agent") getHistory([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId)
	Retrieves the complete session history for the specified session. For very long sessions, this
	 might return a compacted version of the history.
	
	Parameters:
	`sessionId` \- The unique identifier for the contextual session
	Returns:
	The complete session history containing all messages

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/MemoryProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionHistory.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemoryEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.MultimodalUserMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.UserMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMessage.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/impl/agent/SessionMemoryClient.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemory.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/SessionMemory.html)*