---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/play-comparison.html
title: Compared with Play routes • Akka HTTP
---

# Compared with Play routes • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Compared with Play routes

If you have been using [Play’s routes file syntax](https://www.playframework.com/documentation/2.8.x/ScalaRouting#The-routes-file-syntax)[Play’s routes file syntax](https://www.playframework.com/documentation/2.8.x/JavaRouting#The-routes-file-syntax) earlier, this page may help you to use the Akka HTTP routing DSL.

## Conceptual differences

The most apparent difference is Play’s use of special purpose syntax implemented as an [external DSL](https://en.wikipedia.org/wiki/Domain-specific_language#External_and_Embedded_Domain_Specific_Languages), whereas Akka HTTP routes are described in Scala source codeJava source code with regular methods and values (as “embedded DSL”). Both are crafted to make the reader “grasp the code’s intention”.

The Akka HTTP DSL uses [Directives](directives/index.html) to describe how incoming requests translate to functionality in the server. Play allows splitting the routes definitions in multiple routes files. The Akka HTTP DSL is very flexible and allows for composition so that different concerns can be properly split and organized as other source code would be.

Both Play and Akka HTTP choose the first matching route within the routes file/routes definition. In Play routes are listed with one route per line, in Akka HTTP multiple routes must be concatenated with the `concat` method.

## Side\-by\-side

These examples are a non\-comprehensive list of how Play routes could be written in Akka HTTP. They try to mimic the structure which Play uses, to aid understanding, even though it might not be the most Akka HTTP\-idiomatic notation. 

### Static path

For example, to exactly match incoming `GET /clients/all` requests, you can define this route in Play.

```
GET   /clients/all          controllers.Clients.list()

```

In Akka HTTP every path segment is specified as a separate `String` concatenated with the `/` methodconcatenated by the `slash` method on `segment`.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L26-L28 "Go to snippet source")(get & path("clients" / "all")) {
  complete(Clients.list())
}
```

Scala test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L32-L34 "Go to snippet source")Get("/clients/all") ~> clientsAll ~> check {
  responseAs[String] shouldEqual "clientA,clientB,clientC"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L56-L60 "Go to snippet source")get(() ->
        path(segment("clients").slash("all"), () ->
                complete(Clients.list())
        )
);
```

Java test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L125-L128 "Go to snippet source")TestRoute route = testRoute(new Routes().clientsAll());
route.run(HttpRequest.GET("/clients/all"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("clientA,clientB,clientC");
```

### Dynamic parts

If you want to define a route that retrieves a client by ID, you’ll need to add a dynamic part.

```
GET   /clients/:id          controllers.Clients.show(id: Long)

```

Akka HTTP uses [path matchers](path-matchers.html#basic-pathmatchers) which match certain data types and pass their data on.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L41-L43 "Go to snippet source")(get & path("client" / LongNumber)) { id =>
  complete(Clients.get(id))
}
```

Scala test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L47-L49 "Go to snippet source")Get("/client/321433") ~> clientById ~> check {
  responseAs[String] shouldEqual "clientB"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L67-L71 "Go to snippet source")get(() ->
        path(segment("client").slash(longSegment()), id ->
                complete(Clients.get(id))
        )
);
```

Java test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L135-L138 "Go to snippet source")TestRoute route = testRoute(new Routes().clientById());
route.run(HttpRequest.GET("/client/321433"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("clientB");
```

### Dynamic parts spanning several /

You may want to capture a dynamic part of more than one URI path segment, separated by forward slashes.

```
GET   /files/*name          controllers.Application.download(name)

```

The Akka HTTP directive `Remaining`remaining() makes a list of the segments to be passed. (See [Path Matchers](path-matchers.html#basic-pathmatchers) for other ways to extract the path.)

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L58-L60 "Go to snippet source")(get & path("files" / Remaining)) { name =>
  complete(download(name))
}
```

Scala test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L64-L66 "Go to snippet source")Get("/files/images/logo.png") ~> files ~> check {
  responseAs[String] shouldEqual "images/logo.png: file contents"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L78-L82 "Go to snippet source")get(() ->
        path(segment("files").slash(remaining()), names ->
                complete(download(names))
        )
);
```

Java test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L145-L148 "Go to snippet source")TestRoute route = testRoute(new Routes().files());
route.run(HttpRequest.GET("/files/images/logo.png"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("images/logo.png: file contents");
```

### Access parameters

The [Parameter directives](directives/parameter-directives/index.html) give access to parameters passed on the URL.

#### Mandatory parameters

By default parameters are expected to be of type `String`. To make Akka HTTP convert a parameter to a different type, specify an [unmarshaller](directives/parameter-directives/parameters.html#deserialized-parameter).

```
# Extract the page parameter from the query string.
# i.e. http://myserver.com/?page=index
GET   /                     controllers.Application.show(page)

```

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L75-L77 "Go to snippet source")(get & path("") & parameter("page")) { page =>
  complete(getPage(page))
}
```

Scala test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L81-L83 "Go to snippet source")Get("/?page=example.txt") ~> pageParameter ~> check {
  responseAs[String] shouldEqual "The requested [example.txt]."
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L89-L93 "Go to snippet source")get(() ->
        parameter("page", page ->
                complete(getPage(page))
        )
);
```

Java test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L155-L160 "Go to snippet source")TestRoute route = testRoute(new Routes().pageParameter());
route.run(HttpRequest.GET("?page=example.txt"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("The requested [example.txt].");
route.run(HttpRequest.GET("/"))
        .assertStatusCode(StatusCodes.NOT_FOUND);
```

#### Optional parameters

```
# The version parameter is optional. E.g. /api/list-all?version=3.0
GET   /api/list-all         controllers.Api.list(version: Option[String])

```

The parameter name may be decorated with `.optional` to mark it as optional (for other variants see [other parameter extractors](directives/parameter-directives/parameters.html#description)).

The `parameterOptional` directive passes the parameter as `Optional<String>`. 

The directive `parameterRequiredValue` makes the route match only if the parameter contains the specified value.

See [parameter extractors](directives/parameter-directives/parameters.html).

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L92-L94 "Go to snippet source")(get & path("api" / "list-all") & parameter("version".optional)) { version =>
  complete(listAll(version))
}
```

Scala test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L98-L103 "Go to snippet source")Get("/api/list-all?version=3.0") ~> optionalPageParameter ~> check {
  responseAs[String] shouldEqual "aa,bb,cc"
}
Get("/api/list-all") ~> optionalPageParameter ~> check {
  responseAs[String] shouldEqual "ff"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L100-L105 "Go to snippet source")get(() ->
        path(segment("api").slash("list"), () ->
                parameterOptional("version", version ->
                        complete(apiList(version)))
        )
);
```

Java test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L167-L173 "Go to snippet source")TestRoute route = testRoute(new Routes().apiListWithVersion());
route.run(HttpRequest.GET("/api/list?version=3.0"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("aa,bb,cc");
route.run(HttpRequest.GET("/api/list"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("ff");
```

#### List parameters

This shows how a repeated URL parameter is captured.

```
# The item parameter is a list.
# E.g. /api/list-items?item=red&item=new&item=slippers
GET   /api/list-items      controllers.Api.listItems(item: List[String])

```

Decorating the parameter name with a `.repeated` makes Akka HTTP pass all values of that parameter as an `Iterable[String]`].

The `parameterList` directive may take a parameter name to specify a single parameter name to pass on as a `List<String>`.]

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L112-L114 "Go to snippet source")(get & path("api" / "list-items") & parameters("item".repeated)) { items =>
  complete(listItems(items))
}
```

Scala test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/PlayRoutesComparisonSpec.scala#L118-L120 "Go to snippet source")Get("/api/list-items?item=red&item=new&item=slippers") ~> itemParameterList ~> check {
  responseAs[String] shouldEqual "slippers,new,red"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L112-L117 "Go to snippet source")get(() ->
        path(segment("api").slash("list-items"), () ->
                parameterList("item", items ->
                        complete(apiItems(items)))
        )
);
```

Java test

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/testkit/PlayRoutesComparisonTest.java#L180-L183 "Go to snippet source")TestRoute route = testRoute(new Routes().apiListItems());
route.run(HttpRequest.GET("/api/list-items?item=red&item=new&item=slippers"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("slippers,new,red"); // order is not kept
```

## Code Examples

### Example 1: Static path

```text
GET   /clients/all          controllers.Clients.list()
```

### Example 2: Static path

```scala
(get & path("clients" / "all")) {
  complete(Clients.list())
}
```

### Example 3: Static path

```scala
Get("/clients/all") ~> clientsAll ~> check {
  responseAs[String] shouldEqual "clientA,clientB,clientC"
}
```

### Example 4: Static path

```java
get(() ->
        path(segment("clients").slash("all"), () ->
                complete(Clients.list())
        )
);
```

### Example 5: Static path

```java
TestRoute route = testRoute(new Routes().clientsAll());
route.run(HttpRequest.GET("/clients/all"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("clientA,clientB,clientC");
```

### Example 6: Dynamic parts

```text
GET   /clients/:id          controllers.Clients.show(id: Long)
```

### Example 7: Dynamic parts

```scala
(get & path("client" / LongNumber)) { id =>
  complete(Clients.get(id))
}
```

### Example 8: Dynamic parts

```scala
Get("/client/321433") ~> clientById ~> check {
  responseAs[String] shouldEqual "clientB"
}
```

### Example 9: Dynamic parts

```java
get(() ->
        path(segment("client").slash(longSegment()), id ->
                complete(Clients.get(id))
        )
);
```

### Example 10: Dynamic parts

```java
TestRoute route = testRoute(new Routes().clientById());
route.run(HttpRequest.GET("/client/321433"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("clientB");
```

### Example 11: Dynamic parts spanning several /

```text
GET   /files/*name          controllers.Application.download(name)
```

### Example 12: Dynamic parts spanning several /

```scala
(get & path("files" / Remaining)) { name =>
  complete(download(name))
}
```

### Example 13: Dynamic parts spanning several /

```scala
Get("/files/images/logo.png") ~> files ~> check {
  responseAs[String] shouldEqual "images/logo.png: file contents"
}
```

### Example 14: Dynamic parts spanning several /

```java
get(() ->
        path(segment("files").slash(remaining()), names ->
                complete(download(names))
        )
);
```

### Example 15: Dynamic parts spanning several /

```java
TestRoute route = testRoute(new Routes().files());
route.run(HttpRequest.GET("/files/images/logo.png"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("images/logo.png: file contents");
```

### Example 16: Mandatory parameters

```text
# Extract the page parameter from the query string.
# i.e. http://myserver.com/?page=index
GET   /                     controllers.Application.show(page)
```

### Example 17: Mandatory parameters

```scala
(get & path("") & parameter("page")) { page =>
  complete(getPage(page))
}
```

### Example 18: Mandatory parameters

```scala
Get("/?page=example.txt") ~> pageParameter ~> check {
  responseAs[String] shouldEqual "The requested [example.txt]."
}
```

### Example 19: Mandatory parameters

```java
get(() ->
        parameter("page", page ->
                complete(getPage(page))
        )
);
```

### Example 20: Mandatory parameters

```java
TestRoute route = testRoute(new Routes().pageParameter());
route.run(HttpRequest.GET("?page=example.txt"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("The requested [example.txt].");
route.run(HttpRequest.GET("/"))
        .assertStatusCode(StatusCodes.NOT_FOUND);
```

### Example 21: Optional parameters

```text
# The version parameter is optional. E.g. /api/list-all?version=3.0
GET   /api/list-all         controllers.Api.list(version: Option[String])
```

### Example 22: Optional parameters

```scala
(get & path("api" / "list-all") & parameter("version".optional)) { version =>
  complete(listAll(version))
}
```

### Example 23: Optional parameters

```scala
Get("/api/list-all?version=3.0") ~> optionalPageParameter ~> check {
  responseAs[String] shouldEqual "aa,bb,cc"
}
Get("/api/list-all") ~> optionalPageParameter ~> check {
  responseAs[String] shouldEqual "ff"
}
```

### Example 24: Optional parameters

```java
get(() ->
        path(segment("api").slash("list"), () ->
                parameterOptional("version", version ->
                        complete(apiList(version)))
        )
);
```

### Example 25: Optional parameters

```java
TestRoute route = testRoute(new Routes().apiListWithVersion());
route.run(HttpRequest.GET("/api/list?version=3.0"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("aa,bb,cc");
route.run(HttpRequest.GET("/api/list"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("ff");
```

### Example 26: List parameters

```text
# The item parameter is a list.
# E.g. /api/list-items?item=red&item=new&item=slippers
GET   /api/list-items      controllers.Api.listItems(item: List[String])
```

### Example 27: List parameters

```scala
(get & path("api" / "list-items") & parameters("item".repeated)) { items =>
  complete(listItems(items))
}
```

### Example 28: List parameters

```scala
Get("/api/list-items?item=red&item=new&item=slippers") ~> itemParameterList ~> check {
  responseAs[String] shouldEqual "slippers,new,red"
}
```

### Example 29: List parameters

```java
get(() ->
        path(segment("api").slash("list-items"), () ->
                parameterList("item", items ->
                        complete(apiItems(items)))
        )
);
```

### Example 30: List parameters

```java
TestRoute route = testRoute(new Routes().apiListItems());
route.run(HttpRequest.GET("/api/list-items?item=red&item=new&item=slippers"))
        .assertStatusCode(StatusCodes.OK)
        .assertEntity("slippers,new,red"); // order is not kept
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameters.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/overview.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/path-matchers.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/play-comparison.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/play-comparison.html)*