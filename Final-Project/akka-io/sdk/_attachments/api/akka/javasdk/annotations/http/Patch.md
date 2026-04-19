---
description: 'declaration: package: akka.javasdk.annotations.http, annotation type:
  Patch'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:48Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Patch.html
title: Patch
---

# Patch

> **Summary:** declaration: package: akka.javasdk.annotations.http, annotation type: Patch

## Content

Package [akka.javasdk.annotations.http](package-summary.html)
# Annotation Interface Patch

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface Patch
Annotation to mark a method as handling HTTP PATCH requests.

 PATCH requests are used to apply partial updates to existing resources. Unlike PUT requests
 that replace the entire resource, PATCH only modifies the specified fields while leaving other
 fields unchanged.

 

**Path Configuration:** The annotation value specifies the path pattern for this
 endpoint, which is combined with the [`HttpEndpoint`](HttpEndpoint.html "annotation interface in akka.javasdk.annotations.http") class\-level path prefix to form the
 complete URL.

 

**Request Bodies:** PATCH methods typically include request bodies with the
 partial data to be updated. The request body parameter must come last in the parameter list when
 combined with path parameters.

 

**Path Parameters:** Use `{paramName}` in the path to identify the specific
 resource to update. These can be combined with request body parameters.

 

**Response Types:** PATCH methods typically return the updated resource, a
 success confirmation, or 200 OK responses. Use [`HttpResponses.ok()`](../../http/HttpResponses.html#ok()) for
 standard update responses.

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
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpResponses.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Patch.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Patch.html)*