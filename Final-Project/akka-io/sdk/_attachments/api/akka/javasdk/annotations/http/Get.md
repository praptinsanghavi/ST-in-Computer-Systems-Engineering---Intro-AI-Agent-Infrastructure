---
description: 'declaration: package: akka.javasdk.annotations.http, annotation type:
  Get'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:47Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Get.html
title: Get
---

# Get

> **Summary:** declaration: package: akka.javasdk.annotations.http, annotation type: Get

## Content

Package [akka.javasdk.annotations.http](package-summary.html)
# Annotation Interface Get

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface Get
Annotation to mark a method as handling HTTP GET requests.

 GET requests are used to retrieve data from the server and should be idempotent and safe (no
 side effects). They typically don't include request bodies and use path parameters and query
 parameters for input.

 

**Path Configuration:** The annotation value specifies the path pattern for this
 endpoint, which is combined with the [`HttpEndpoint`](HttpEndpoint.html "annotation interface in akka.javasdk.annotations.http") class\-level path prefix to form the
 complete URL.

 

**Path Parameters:** Use `{paramName}` in the path to extract URL segments
 as method parameters. Parameters can be strings, numbers, or other primitive types.

 

**Query Parameters:** Access query parameters via `RequestContext.queryParams()` when extending [`AbstractHttpEndpoint`](../../http/AbstractHttpEndpoint.html "class in akka.javasdk.http") or
 injecting [`RequestContext`](../../http/RequestContext.html "interface in akka.javasdk.http").

 

**Response Types:** GET methods can return strings, objects (serialized to JSON),
 `HttpResponse` for full control, or `CompletionStage<T>` for asynchronous responses.

- ## Optional Element Summary

Optional Elements

Modifier and Type
Optional Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[value](#value())`

- ## Element Details

	- ### value
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value
	
	Default:
	`""`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/HttpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/AbstractHttpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestContext.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Get.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Get.html)*