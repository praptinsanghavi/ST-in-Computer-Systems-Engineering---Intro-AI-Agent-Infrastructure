---
description: 'declaration: package: akka.javasdk.annotations, annotation type: Description'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:07Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Description.html
title: Description
---

# Description

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: Description

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface Description

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")({[FIELD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#FIELD "class or interface in java.lang.annotation"),[PARAMETER](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#PARAMETER "class or interface in java.lang.annotation")})
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface Description
Used to define a human language description for fields and method parameters, such as MCP tool
 parameters or tool methods.

 This annotation can be used to provide additional context. Fields and method parameters of
 type `Optional` are considered as non\-required.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[value](#value())`

- ## Element Details

	- ### value
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Description.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Description.html)*