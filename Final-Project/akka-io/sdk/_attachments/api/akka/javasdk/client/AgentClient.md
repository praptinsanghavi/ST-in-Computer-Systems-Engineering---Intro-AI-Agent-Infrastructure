---
description: 'declaration: package: akka.javasdk.client, interface: AgentClient'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:18Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentClient.html
title: AgentClient
---

# AgentClient

> **Summary:** declaration: package: akka.javasdk.client, interface: AgentClient

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface AgentClient

---

@DoNotInherit
public interface AgentClient
Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[AgentClientInSession](AgentClientInSession.html "interface in akka.javasdk.client")`
`[inSession](#inSession(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId)`

The agent participates in a session, which is used for the agent's conversational memory.

- ## Method Details

	- ### inSession
	
	
	[AgentClientInSession](AgentClientInSession.html "interface in akka.javasdk.client") inSession([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sessionId)
	The agent participates in a session, which is used for the agent's conversational memory.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentClientInSession.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentClient.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentClient.html)*