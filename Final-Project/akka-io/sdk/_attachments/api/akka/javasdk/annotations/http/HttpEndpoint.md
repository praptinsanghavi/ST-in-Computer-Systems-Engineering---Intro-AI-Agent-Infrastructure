---
description: 'declaration: package: akka.javasdk.annotations.http, annotation type:
  HttpEndpoint'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:25Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/HttpEndpoint.html
title: HttpEndpoint
---

# HttpEndpoint

> **Summary:** declaration: package: akka.javasdk.annotations.http, annotation type: HttpEndpoint

## Content

Package [akka.javasdk.annotations.http](package-summary.html)
# Annotation Interface HttpEndpoint

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface HttpEndpoint
Annotation to mark a class as an HTTP endpoint that exposes RESTful APIs.

 HTTP endpoints handle incoming HTTP requests and can return responses in various formats
 including JSON, plain text, or custom content types. They provide the external API for your
 service.

 

**Basic Structure:** The annotated class should be public with a public
 constructor. Methods annotated with HTTP verb annotations ([`Get`](Get.html "annotation interface in akka.javasdk.annotations.http"), [`Post`](Post.html "annotation interface in akka.javasdk.annotations.http"), [`Put`](Put.html "annotation interface in akka.javasdk.annotations.http"), [`Patch`](Patch.html "annotation interface in akka.javasdk.annotations.http"), [`Delete`](Delete.html "annotation interface in akka.javasdk.annotations.http")) handle requests.

 

**Path Configuration:** The annotation value specifies a common path prefix for
 all methods in the class. Individual method paths are combined with this prefix to form the
 complete endpoint URL.

 

**Method Features:**

- **Path Parameters:** Use `{paramName}` in paths to extract URL segments
- **Request Bodies:** Accept JSON by adding parameters Jackson can deserialize
- **Query Parameters:** Access via `RequestContext.queryParams()`
- **Headers:** Access via `RequestContext.requestHeader()`

**Response Types:**

- String \- text/plain responses
- Objects \- JSON responses (serialized with Jackson)
- `HttpResponse` \- full control over response
- `CompletionStage<T>` \- asynchronous responses

**Constructor Injection:** Annotated classes can accept the following types in
 their constructor:

 

- [`ComponentClient`](../../client/ComponentClient.html "interface in akka.javasdk.client") \- for calling other components
- [`HttpClientProvider`](../../http/HttpClientProvider.html "interface in akka.javasdk.http") \- for HTTP service calls
- [`RequestContext`](../../http/RequestContext.html "interface in akka.javasdk.http") \- for request context access
- [`TimerScheduler`](../../timer/TimerScheduler.html "interface in akka.javasdk.timer")
- `Materializer`
- `Config`
- `Span`
- [`AgentRegistry`](../../agent/AgentRegistry.html "interface in akka.javasdk.agent") \- contains information about all agents
- [`Sanitizer`](../../Sanitizer.html "interface in akka.javasdk") \- allows for applying sanitization
- Custom types provided by a [`DependencyProvider`](../../DependencyProvider.html "interface in akka.javasdk")

**Request Context Access:** If the annotated class extends [`AbstractHttpEndpoint`](../../http/AbstractHttpEndpoint.html "class in akka.javasdk.http"), the request context is available via `requestContext()` without constructor injection.

 

**Security:** Always annotate endpoints with appropriate [`Acl`](../Acl.html "annotation interface in akka.javasdk.annotations") annotations to control access. Without ACL annotations, no clients
 are allowed to access the endpoint.

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

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DependencyProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Sanitizer.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/AgentRegistry.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Acl.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Delete.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Get.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Patch.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Post.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Put.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/AbstractHttpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClientProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timer/TimerScheduler.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/HttpEndpoint.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/HttpEndpoint.html)*