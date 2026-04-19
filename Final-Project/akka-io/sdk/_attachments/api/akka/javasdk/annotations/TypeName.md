---
description: 'declaration: package: akka.javasdk.annotations, annotation type: TypeName'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:14Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/TypeName.html
title: TypeName
---

# TypeName

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: TypeName

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface TypeName

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
public @interface TypeName
Annotation to assign a logical type name to events.

 The type name is used for several things, such as to identify each event in order to deliver
 them to the right event consumers. If a logical type name isn't specified, the fully qualified
 class name is used.

 

Once an event is persisted, you won't be able to rename your class if no logical type name has
 been specified, as previously persisted events would have a different identifier.

 

Therefore, we recommend all event classes use a logical type name.

- ## Optional Element Summary

Optional Elements

Modifier and Type
Optional Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[value](#value())`

Logical type name for the annotated type.

- ## Element Details

	- ### value
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value
	Logical type name for the annotated type. If missing (or defined as Empty String), the fully
	 qualified class name will be used.
	
	Default:
	`""`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/TypeName.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/TypeName.html)*