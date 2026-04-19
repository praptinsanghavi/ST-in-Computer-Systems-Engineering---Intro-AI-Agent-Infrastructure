---
description: 'declaration: package: akka.javasdk.annotations.http, annotation type:
  Delete'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:48Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Delete.html
title: Delete
---

# Delete

> **Summary:** declaration: package: akka.javasdk.annotations.http, annotation type: Delete

## Content

Package [akka.javasdk.annotations.http](package-summary.html)
# Annotation Interface Delete

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface Delete
Annotation to mark a method as handling HTTP DELETE requests.

 DELETE requests are used to remove resources from the server. They should be idempotent,
 meaning multiple identical requests should have the same effect (the resource remains deleted).

 

**Path Configuration:** The annotation value specifies the path pattern for this
 endpoint, which is combined with the [`HttpEndpoint`](HttpEndpoint.html "annotation interface in akka.javasdk.annotations.http") class\-level path prefix to form the
 complete URL.

 

**Path Parameters:** Use `{paramName}` in the path to identify the specific
 resource to delete. DELETE requests typically don't include request bodies.

 

**Response Types:** DELETE methods typically return:

 

- 204 No Content for successful deletion with no response body
- 200 OK with confirmation message or deleted resource representation
- 404 Not Found if the resource doesn't exist

 Use [`HttpResponses.noContent()`](../../http/HttpResponses.html#noContent()) for standard deletion responses.

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
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Delete.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Delete.html)*