---
description: 'declaration: package: akka.javasdk.agent, class: Agent, interface: StreamEffect,
  interface: OnSuccessBuilder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:01Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.StreamEffect.OnSuccessBuilder.html
title: Agent.StreamEffect.OnSuccessBuilder
---

# Agent.StreamEffect.OnSuccessBuilder

> **Summary:** declaration: package: akka.javasdk.agent, class: Agent, interface: StreamEffect, interface: OnSuccessBuilder

## Content

Package [akka.javasdk.agent](package-summary.html)
# Interface Agent.StreamEffect.OnSuccessBuilder

Enclosing interface:
`[Agent.StreamEffect](Agent.StreamEffect.html "interface in akka.javasdk.agent")`

---

public static interface Agent.StreamEffect.OnSuccessBuilder

- ## Method Summary

Modifier and Type
Method
Description
`[Agent.StreamEffect](Agent.StreamEffect.html "interface in akka.javasdk.agent")`
`[thenReply](#thenReply())()`

Reply with the response from the model.

`[Agent.StreamEffect](Agent.StreamEffect.html "interface in akka.javasdk.agent")`
`[thenReply](#thenReply(akka.javasdk.Metadata))([Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

Reply with the response from the model.

- ## Method Details

	- ### thenReply
	
	
	[Agent.StreamEffect](Agent.StreamEffect.html "interface in akka.javasdk.agent") thenReply()
	Reply with the response from the model.
	
	Returns:
	A message reply.
	- ### thenReply
	
	
	[Agent.StreamEffect](Agent.StreamEffect.html "interface in akka.javasdk.agent") thenReply([Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	Reply with the response from the model.
	
	Parameters:
	`metadata` \- The metadata for the message.
	Returns:
	A message reply.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.StreamEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.StreamEffect.OnSuccessBuilder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.StreamEffect.OnSuccessBuilder.html)*