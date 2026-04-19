---
description: 'declaration: package: akka.javasdk.annotations.http, annotation type:
  Post'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:47Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Post.html
title: Post
---

# Post

> **Summary:** declaration: package: akka.javasdk.annotations.http, annotation type: Post

## Content

Package [akka.javasdk.annotations.http](package-summary.html)
# Annotation Interface Post

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface Post
Annotation to mark a method as handling HTTP POST requests.

 POST requests are used to create new resources or submit data to the server. They typically
 include request bodies with the data to be processed and can have side effects.

 

**Path Configuration:** The annotation value specifies the path pattern for this
 endpoint, which is combined with the [`HttpEndpoint`](HttpEndpoint.html "annotation interface in akka.javasdk.annotations.http") class\-level path prefix to form the
 complete URL.

 

**Request Bodies:** POST methods commonly accept request bodies by adding a
 parameter that Jackson can deserialize from JSON. The request body parameter must come last in
 the parameter list when combined with path parameters.

 

**Path Parameters:** Use `{paramName}` in the path to extract URL segments
 as method parameters. These can be combined with request body parameters.

 

**Response Types:** POST methods typically return created resources (often with
 201 Created status), confirmation messages, or error responses. Use [`HttpResponses.created()`](../../http/HttpResponses.html#created()) for resource creation scenarios.

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
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Post.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Post.html)*