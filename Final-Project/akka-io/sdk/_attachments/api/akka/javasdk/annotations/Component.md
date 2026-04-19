---
description: 'declaration: package: akka.javasdk.annotations, annotation type: Component'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:01Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Component.html
title: Component
---

# Component

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: Component

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface Component

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface Component
Assign metadata to a component (required for all component types aside from Endpoints).

 The id should be unique among the different components.

 

In the case of Entities, Workflows and Views, the component id should be stable as a different
 identifier means a different representation in storage. Changing this identifier will create a
 new class of component and all previous instances using the old identifier won't be accessible
 anymore.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[id](#id())`

The unique identifier for this component (mandatory).
- ## Optional Element Summary

Optional Elements

Modifier and Type
Optional Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[description](#description())`

A description of what this component does (optional).

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[name](#name())`

A human\-readable name for this component (optional).

- ## Element Details

	- ### id
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id
	The unique identifier for this component (mandatory).
	- ### name
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name
	A human\-readable name for this component (optional).
	
	Default:
	`""`
	- ### description
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") description
	A description of what this component does (optional).
	
	Default:
	`""`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Component.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Component.html)*