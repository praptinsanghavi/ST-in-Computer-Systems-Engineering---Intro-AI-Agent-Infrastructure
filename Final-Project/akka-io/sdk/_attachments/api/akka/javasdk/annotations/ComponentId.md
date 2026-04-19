---
description: 'declaration: package: akka.javasdk.annotations, annotation type: ComponentId'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:03Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/ComponentId.html
title: ComponentId
---

# ComponentId

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: ComponentId

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface ComponentId

---

[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface ComponentId
Deprecated.
Use [`Component`](Component.html "annotation interface in akka.javasdk.annotations") instead.
 Assign a type identifier to a component (required for all component types aside from
 Endpoints).
 

The identifier should be unique among the different components.
 

In the case of Entities, Workflows and Views, the ComponentId should be stable as a
 different identifier means a different representation in storage. Changing this identifier
 will create a new class of component and all previous instances using the old identifier
 won't be accessible anymore.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[value](#value())`

Deprecated.

- ## Element Details

	- ### value
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value
	Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Component.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/ComponentId.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/ComponentId.html)*