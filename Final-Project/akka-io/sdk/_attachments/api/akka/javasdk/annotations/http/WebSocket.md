---
description: 'declaration: package: akka.javasdk.annotations.http, annotation type:
  WebSocket'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:14Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/WebSocket.html
title: WebSocket
---

# WebSocket

> **Summary:** declaration: package: akka.javasdk.annotations.http, annotation type: WebSocket

## Content

Package [akka.javasdk.annotations.http](package-summary.html)
# Annotation Interface WebSocket

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface WebSocket
Annotation to mark an endpoint method as handling HTTP WebSocket upgrade requests.

 WebSockets allow bidirectional streaming text or binary communication with a client. Http
 method will always be GET.

 

**Path Configuration:** The annotation value specifies the path pattern for this
 endpoint, which is combined with the [`HttpEndpoint`](HttpEndpoint.html "annotation interface in akka.javasdk.annotations.http") class\-level path prefix to form the
 complete URL.

 

**Request Bodies:** WebSocket annotated methods must not accept a body parameter,
 there is no request body, instead additional data will have to be passed over the WebSocket
 connection after the upgrade completes.

 

**Path Parameters:** Use `{paramName}` in the path to identify the specific
 resource to create or update. These can be combined with request body parameters.

 

**Return value:** WebSocket annotated types must return `Flow` handling the stream of incoming messages, messages coming out of hte
 flow are emitted to the client. The incoming and outgoing message type must both be the same
 type. Supported types are `String` for text, `ByteString` for binary
 messages, or `Message` for a lower level handling of the
 protocol.

 

Example:

 

```

 @WebSocket("/ping-pong-websocket")
 public Flow<String, String, NotUsed> pingPong() {
     return Flow.of(String.class).map(incoming -> "pong: " + incoming)
 }
 
```

**IMPORTANT** WebSocket endpoints always work locally, but in a deployed service,
 require additional setup. See the [Akka SDK
 documentation](https://doc.akka.io/operations/services/invoke-service.html#websockets) for more details about setup.

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

## Code Examples

### Example 1: Annotation Interface WebSocket

```text
@WebSocket("/ping-pong-websocket")
 public Flow<String, String, NotUsed> pingPong() {
     return Flow.of(String.class).map(incoming -> "pong: " + incoming)
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/operations/services/invoke-service.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/HttpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/WebSocket.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/WebSocket.html)*