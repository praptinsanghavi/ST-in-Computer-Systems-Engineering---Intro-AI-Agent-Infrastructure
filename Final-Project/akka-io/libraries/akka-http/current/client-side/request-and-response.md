---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/client-side/request-and-response.html
title: HttpRequest and HttpResponse • Akka HTTP
---

# HttpRequest and HttpResponse • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# HttpRequest and HttpResponse

All 3 Akka HTTP Client API levels use the same basic model of [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") and [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse").

## Creating requests

You can create simple `GET` requests:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientExampleSpec.scala#L281-L289 "Go to snippet source")HttpRequest(uri = "https://akka.io")

// or:
import akka.http.scaladsl.client.RequestBuilding.Get
Get("https://akka.io")

// with query params
Get("https://akka.io?foo=bar")

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/ClientSingleRequestExample.java#L37-L40 "Go to snippet source")HttpRequest.create("https://akka.io");

// with query params
HttpRequest.create("https://akka.io?foo=bar");
```

Note
[`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") also[`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest")’s method `HttpRequest::withUri()` takes [`Uri`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html "akka.http.javadsl.model.Uri")[`Uri`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html "akka.http.scaladsl.model.Uri") as a parameter. [Query String in URI](../common/uri-model.html#query-string-in-uri) section describes a fluent API for building URIs with query parameters.

Or more complicated ones, like this `POST`:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientExampleSpec.scala#L294-L302 "Go to snippet source")HttpRequest(
  method = HttpMethods.POST,
  uri = "https://userservice.example/users",
  entity = HttpEntity(ContentTypes.`text/plain(UTF-8)`, "data")
)

// or:
import akka.http.scaladsl.client.RequestBuilding.Post
Post("https://userservice.example/users", "data")
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/ClientSingleRequestExample.java#L43-L44 "Go to snippet source")HttpRequest.POST("https://userservice.example/users")
  .withEntity(HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, "data"));
```

See the API documentation of [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") for more information on how to customize your requests.

## Processing responses

When you receive a response, you can use the [Marshalling](../common/marshalling.html) API to convert the response entity into an object:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpClientExampleSpec.scala#L308-L316 "Go to snippet source")import akka.http.scaladsl.unmarshalling.Unmarshal
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import spray.json.DefaultJsonProtocol._
import spray.json.RootJsonFormat

case class Pet(name: String)
implicit val petFormat: RootJsonFormat[Pet] = jsonFormat1(Pet.apply)

val pet: Future[Pet] = Unmarshal(response).to[Pet]
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/ClientSingleRequestExample.java#L54 "Go to snippet source")CompletionStage<Pet> pet = Jackson.unmarshaller(Pet.class).unmarshal(response.entity(), system);
```

## Code Examples

### Example 1: Creating requests

```scala
HttpRequest(uri = "https://akka.io")

// or:
import akka.http.scaladsl.client.RequestBuilding.Get
Get("https://akka.io")

// with query params
Get("https://akka.io?foo=bar")
```

### Example 2: Creating requests

```java
HttpRequest.create("https://akka.io");

// with query params
HttpRequest.create("https://akka.io?foo=bar");
```

### Example 3: Creating requests

```scala
HttpRequest(
  method = HttpMethods.POST,
  uri = "https://userservice.example/users",
  entity = HttpEntity(ContentTypes.`text/plain(UTF-8)`, "data")
)

// or:
import akka.http.scaladsl.client.RequestBuilding.Post
Post("https://userservice.example/users", "data")
```

### Example 4: Creating requests

```java
HttpRequest.POST("https://userservice.example/users")
  .withEntity(HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, "data"));
```

### Example 5: Processing responses

```scala
import akka.http.scaladsl.unmarshalling.Unmarshal
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import spray.json.DefaultJsonProtocol._
import spray.json.RootJsonFormat

case class Pet(name: String)
implicit val petFormat: RootJsonFormat[Pet] = jsonFormat1(Pet.apply)

val pet: Future[Pet] = Unmarshal(response).to[Pet]
```

### Example 6: Processing responses

```java
CompletionStage<Pet> pet = Jackson.unmarshaller(Pet.class).unmarshal(response.entity(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/libraries/akka-http/current/client-side/configuration.html
- https://doc.akka.io/libraries/akka-http/current/client-side/request-level.html
- https://doc.akka.io/libraries/akka-http/current/common/marshalling.html
- https://doc.akka.io/libraries/akka-http/current/common/uri-model.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/client-side/request-and-response.html](https://doc.akka.io/libraries/akka-http/current/client-side/request-and-response.html)*