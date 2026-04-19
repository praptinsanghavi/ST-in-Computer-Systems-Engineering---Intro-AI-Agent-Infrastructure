---
description: 'declaration: package: akka.javasdk.annotations, annotation type: Migration'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:10Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Migration.html
title: Migration
---

# Migration

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: Migration

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface Migration

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
public @interface Migration
Annotation to assign a @[`JsonMigration`](../JsonMigration.html "class in akka.javasdk") implementation for a given class.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<? extends [JsonMigration](../JsonMigration.html "class in akka.javasdk")>`
`[value](#value())`

- ## Element Details

	- ### value
	
	
	[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<? extends [JsonMigration](../JsonMigration.html "class in akka.javasdk")\> value

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JsonMigration.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Migration.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Migration.html)*