---
description: 'declaration: package: akka.javasdk.annotations, annotation type: GrpcEndpoint'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:08Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/GrpcEndpoint.html
title: GrpcEndpoint
---

# GrpcEndpoint

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: GrpcEndpoint

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface GrpcEndpoint

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface GrpcEndpoint
Mark a class to be made available as a gRPC endpoint. The annotated class should extend a gRPC
 service interface generated using Akka gRPC, be public and have a public constructor.

 Annotated classes can accept the following types to the constructor:

 

- [`ComponentClient`](../client/ComponentClient.html "interface in akka.javasdk.client")
- [`HttpClientProvider`](../http/HttpClientProvider.html "interface in akka.javasdk.http")
- [`TimerScheduler`](../timer/TimerScheduler.html "interface in akka.javasdk.timer")
- `Materializer`
- `Config`
- Custom types provided by a [`DependencyProvider`](../DependencyProvider.html "interface in akka.javasdk") from the service setup

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DependencyProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClientProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timer/TimerScheduler.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/GrpcEndpoint.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/GrpcEndpoint.html)*