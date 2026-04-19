---
description: 'declaration: package: akka.javasdk.http, class: AbstractHttpEndpoint'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:22Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/AbstractHttpEndpoint.html
title: AbstractHttpEndpoint
---

# AbstractHttpEndpoint

> **Summary:** declaration: package: akka.javasdk.http, class: AbstractHttpEndpoint

## Content

Package [akka.javasdk.http](package-summary.html)
# Class AbstractHttpEndpoint

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.http.AbstractHttpEndpoint

---

public abstract class AbstractHttpEndpoint
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
Optional base class for HTTP endpoints providing convenient access to request context.

 HTTP endpoints expose services to the outside world through RESTful APIs. They handle incoming
 HTTP requests and can return responses in various formats including JSON, plain text, or custom
 content types.

 

**Basic Usage:**

```

 @HttpEndpoint("/api")
 @Acl(allow = @Acl.Matcher(principal = Acl.Principal.ALL))
 public class MyEndpoint extends AbstractHttpEndpoint {

   @Get("/hello/{name}")
   public String hello(String name) {
     return "Hello " + name;
   }

   @Post("/users")
   public HttpResponse createUser(CreateUserRequest request) {
     // Access request context for headers, query params, etc.
     String userAgent = requestContext().requestHeader("User-Agent")
         .map(HttpHeader::value)
         .orElse("Unknown");

     // Process request and return response
     return HttpResponses.created(new User(request.name()));
   }

   @Get("/search")
   public List<Result> search() {
     // Access query parameters
     String query = requestContext().queryParams()
         .getString("q").orElse("");
     return performSearch(query);
   }
 }
 
```

**HTTP Methods:** Annotate methods with [`Get`](../annotations/http/Get.html "annotation interface in akka.javasdk.annotations.http"), [`Post`](../annotations/http/Post.html "annotation interface in akka.javasdk.annotations.http"), [`Put`](../annotations/http/Put.html "annotation interface in akka.javasdk.annotations.http"), [`Patch`](../annotations/http/Patch.html "annotation interface in akka.javasdk.annotations.http"), or [`Delete`](../annotations/http/Delete.html "annotation interface in akka.javasdk.annotations.http") to handle different HTTP verbs.

 

**Path Parameters:** Use `{paramName}` in paths to extract URL segments as
 method parameters. Parameters can be strings, numbers, or other primitive types.

 

**Request Bodies:** Accept JSON request bodies by adding parameters that Jackson
 can deserialize. The request body parameter must come last in the parameter list when combined
 with path parameters.

 

**Response Types:** Return strings for text responses, objects for JSON
 responses, `HttpResponse` for full control, or `CompletionStage<T>` for asynchronous responses.

 

**Request Context:** Extending this class provides access to [`RequestContext`](RequestContext.html "interface in akka.javasdk.http") via [`requestContext()`](#requestContext()) without requiring constructor injection. The
 context provides access to headers, query parameters, JWT claims, and tracing information.

 

**Alternative Approach:** Instead of extending this class, you can inject [`RequestContext`](RequestContext.html "interface in akka.javasdk.http") directly into your endpoint constructor or use dependency injection for other
 services like [`ComponentClient`](../client/ComponentClient.html "interface in akka.javasdk.client").

 

**Security:** Always annotate endpoints with appropriate [`Acl`](../annotations/Acl.html "annotation interface in akka.javasdk.annotations") annotations to control access. Without ACL annotations, no clients
 are allowed to access the endpoint.

- ## Constructor Summary

Constructors

Constructor
Description
`[AbstractHttpEndpoint](#%3Cinit%3E())()`
- ## Method Summary

Modifier and Type
Method
Description
`protected final [RequestContext](RequestContext.html "interface in akka.javasdk.http")`
`[requestContext](#requestContext())()`

Always available from request handling methods, not available from the constructor.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### AbstractHttpEndpoint
	
	
	public AbstractHttpEndpoint()
- ## Method Details

	- ### requestContext
	
	
	protected final [RequestContext](RequestContext.html "interface in akka.javasdk.http") requestContext()
	Always available from request handling methods, not available from the constructor.

## Code Examples

### Example 1: Class AbstractHttpEndpoint

```text
@HttpEndpoint("/api")
 @Acl(allow = @Acl.Matcher(principal = Acl.Principal.ALL))
 public class MyEndpoint extends AbstractHttpEndpoint {

   @Get("/hello/{name}")
   public String hello(String name) {
     return "Hello " + name;
   }

   @Post("/users")
   public HttpResponse createUser(CreateUserRequest request) {
     // Access request context for headers, query params, etc.
     String userAgent = requestContext().requestHeader("User-Agent")
         .map(HttpHeader::value)
         .orElse("Unknown");

     // Process request and return response
     return HttpResponses.created(new User(request.name()));
   }

   @Get("/search")
   public List<Result> search() {
     // Access query parameters
     String query = requestContext().queryParams()
         .getString("q").orElse("");
     return performSearch(query);
   }
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Acl.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Delete.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Get.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Patch.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Post.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/Put.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/AbstractHttpEndpoint.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/AbstractHttpEndpoint.html)*