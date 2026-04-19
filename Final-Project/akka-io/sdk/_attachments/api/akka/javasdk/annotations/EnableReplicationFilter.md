---
description: 'declaration: package: akka.javasdk.annotations, annotation type: EnableReplicationFilter'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:07Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/EnableReplicationFilter.html
title: EnableReplicationFilter
---

# EnableReplicationFilter

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: EnableReplicationFilter

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface EnableReplicationFilter

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface EnableReplicationFilter
Enables the replication filter feature for an Event Sourced Entity, allowing runtime control of
 which regions participate in event replication.

 After enabling this annotation, the entity will still replicate to all regions until the
 regions are defined with the `updateReplicationFilter` effect.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/EnableReplicationFilter.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/EnableReplicationFilter.html)*