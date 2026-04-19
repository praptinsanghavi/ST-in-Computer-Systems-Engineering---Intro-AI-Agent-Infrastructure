---
description: 'declaration: package: akka.javasdk.annotations, annotation type: AgentDescription'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:01Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/AgentDescription.html
title: AgentDescription
---

# AgentDescription

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: AgentDescription

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface AgentDescription

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
public @interface AgentDescription
Deprecated.
Use [`Component`](Component.html "annotation interface in akka.javasdk.annotations") for specifying the agent's name and description.
 To assign a role to an agent, use the [`AgentRole`](AgentRole.html "annotation interface in akka.javasdk.annotations") annotation.
 

This annotation is retained for backward compatibility but should not be used in new code.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[description](#description())`

Deprecated.
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[name](#name())`

Deprecated.
- ## Optional Element Summary

Optional Elements

Modifier and Type
Optional Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[role](#role())`

Deprecated.

- ## Element Details

	- ### name
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name
	Deprecated.
	- ### description
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") description
	Deprecated.
	- ### role
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") role
	Deprecated.
	
	Default:
	`""`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/AgentRole.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Component.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/AgentDescription.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/AgentDescription.html)*