---
description: 'declaration: package: akka.javasdk.annotations, annotation type: Setup'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:53Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Setup.html
title: Setup
---

# Setup

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: Setup

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface Setup

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface Setup
Mark a class as a central configuration point for an entire service. Note that a service will
 also work without any such config point.

 The class can optionally implement [`ServiceSetup`](../ServiceSetup.html "interface in akka.javasdk") with predefined lifecycle hooks.

 

May only be used on one class per service.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/ServiceSetup.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Setup.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Setup.html)*