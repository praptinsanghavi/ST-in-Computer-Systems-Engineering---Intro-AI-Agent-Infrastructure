---
description: 'declaration: package: akka.javasdk.annotations, annotation type: Produce,
  annotation type: ServiceStream'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:11Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Produce.ServiceStream.html
title: Produce.ServiceStream
---

# Produce.ServiceStream

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: Produce, annotation type: ServiceStream

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface Produce.ServiceStream

Enclosing class:
`[Produce](Produce.html "annotation interface in akka.javasdk.annotations")`

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public static @interface Produce.ServiceStream
Annotation to configure the component to produce an event stream that can be consumed by other
 services.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[id](#id())`

Identifier for the event stream.

- ## Element Details

	- ### id
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id
	Identifier for the event stream. Must be unique inside the same service.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Produce.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Produce.ServiceStream.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Produce.ServiceStream.html)*