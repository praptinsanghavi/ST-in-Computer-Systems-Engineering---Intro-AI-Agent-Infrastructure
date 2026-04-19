---
description: 'declaration: package: akka.javasdk.annotations, annotation type: AgentRole'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:03Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/AgentRole.html
title: AgentRole
---

# AgentRole

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: AgentRole

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface AgentRole

---

[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
public @interface AgentRole
Defines the role of an agent. This annotation should be placed on agent classes to specify their
 role.

 This replaces the `role` field in [`AgentDescription`](AgentDescription.html "annotation interface in akka.javasdk.annotations"). If both are present,
 `@AgentRole` takes precedence.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[value](#value())`

The role of the agent.

- ## Element Details

	- ### value
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value
	The role of the agent.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/AgentDescription.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/AgentRole.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/AgentRole.html)*