---
description: 'declaration: package: akka.javasdk.annotations.http, annotation type:
  Put'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:47Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Put.html
title: Put
---

# Put

> **Summary:** declaration: package: akka.javasdk.annotations.http, annotation type: Put

## Content

Package [akka.javasdk.annotations.http](package-summary.html)
# Annotation Interface Put

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface Put
Annotation to mark a method as handling HTTP PUT requests.

 PUT requests are used to create or completely replace a resource at a specific location. They
 should be idempotent, meaning multiple identical requests should have the same effect.

 

**Path Configuration:** The annotation value specifies the path pattern for this
 endpoint, which is combined with the [`HttpEndpoint`](HttpEndpoint.html "annotation interface in akka.javasdk.annotations.http") class\-level path prefix to form the
 complete URL.

 

**Request Bodies:** PUT methods typically include request bodies with the
 complete resource representation that should replace the existing resource. The request body
 parameter must come last in the parameter list when combined with path parameters.

 

**Path Parameters:** Use `{paramName}` in the path to identify the specific
 resource to create or update. These can be combined with request body parameters.

 

**Response Types:** PUT methods typically return the updated resource, a success
 confirmation, or appropriate status codes (200 OK for updates, 201 Created for new resources).

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

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Put.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Put.html)*