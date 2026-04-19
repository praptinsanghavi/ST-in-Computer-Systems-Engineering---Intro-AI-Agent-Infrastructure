---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/index.html
title: Directives • Akka HTTP
---

# Directives • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Directives

A “Directive” is a small building block used for creating arbitrarily complex [route structures](../routes.html). Akka HTTP already pre\-defines a large number of directives and you can easily construct your own:

## Basics

Directives create [Routes](../routes.html). To understand how directives work it is helpful to contrast them with the “primitive” way of creating routes.

[Routes](../routes.html) effectively are simply highly specialised functions that take a [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") and eventually `complete` it, which could (and often should) happen asynchronously.

The [complete](route-directives/complete.html) directive simply completes the request with a response:

Since [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") is just a type alias for a function type [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") instances can be written in any way in which function instances can be written, e.g. as a function literal:

```
val route: Route = { ctx => ctx.complete("yeah") }

```

or shorter:

```
val route: Route = _.complete("yeah")

```

With the [complete](route-directives/complete.html) directive this becomes even shorter:

Scala

```
val route = complete("yeah")

```

Java

```
Route route = complete("yeah");

```

These three ways of writing this [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") are fully equivalent, the created `route` will behave identically in all cases.

Let’s look at a slightly more complicated example to highlight one important point in particular. Consider these two routes:

```
val a: Route = {
  println("MARK")
  ctx => ctx.complete("yeah")
}

val b: Route = { ctx =>
  println("MARK")
  ctx.complete("yeah")
}

```

The difference between `a` and `b` is when the `println` statement is executed. In the case of `a` it is executed *once*, when the route is constructed, whereas in the case of `b` it is executed every time the route is *run*.

Using the [complete](route-directives/complete.html) directive the same effects are achieved like this:

```
val a = {
  println("MARK")
  complete("yeah")
}

val b = complete {
  println("MARK")
  "yeah"
}

```

This works because the argument to the [complete](route-directives/complete.html) directive is evaluated *by\-name*, i.e. it is re\-evaluated every time the produced route is run.

Let’s take things one step further:

```
val route: Route = { ctx =>
  if (ctx.request.method == HttpMethods.GET)
    ctx.complete("Received GET")
  else
    ctx.complete("Received something else")
}

```

Using the [get](method-directives/get.html) and [complete](route-directives/complete.html) directives we can write this route like this:

```
val route =
  concat(
    get {
      complete("Received GET")
    },
    complete("Received something else")
  )

```

Again, the produced routes will behave identically in all cases.

Note that, if you wish, you can also mix the two styles of route creation:

```
val route =
  concat(
    get { ctx =>
      ctx.complete("Received GET")
    },
    complete("Received something else")
  )

```

Here, the inner route of the [get](method-directives/get.html) directive is written as an explicit function literal.

However, as you can see from these examples, building routes with directives rather than “manually” results in code that is a lot more concise and as such more readable and maintainable. In addition it provides for better composability (as you will see in the coming sections). So, when using Akka HTTP’s Routing DSL you should almost never have to fall back to creating routes via [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") function literals that directly manipulate the [RequestContext](../routes.html#requestcontext).

Writing multiple routes that are tried as alternatives (in\-order of definition), is as simple as using the `concat(route1, route2)`, method:

```
Route routes = concat(
  pathSingleSlash(() ->
    getFromResource("web/calculator.html")
  ),
  path("hello", () -> complete("World!))
);

```

You could also simply define a “catch all” completion by providing it as the last route to attempt to match. In the example below we use the `get()` (one of the [MethodDirectives](method-directives/index.html)) to match all incoming `GET` requests for that route, and all other requests will be routed towards the other “catch all” route, that completes the route:

```
Route route =
  get(
    () -> complete("Received GET")
  ).orElse(
    () -> complete("Received something else")
  )

```

If no route matches a given request, a default `404 Not Found` response will be returned as response.

## Structure

The general anatomy of a directive is as follows:

Scala

```
name(arguments) { extractions =>
  ... // inner route
}

```

Java

```
directiveName(arguments [, ...], (extractions [, ...]) -> {
  ... // inner route
})

```

It has a name, zero or more arguments and optionally an inner route (The [RouteDirectives](route-directives/index.html) are special in that they are always used at the leaf\-level and as such cannot have inner routes).

Additionally directives can “extract” a number of values and make them available to their inner routes as function arguments. When seen “from the outside” a directive with its inner route form an expression of type [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route").

## What Directives do

A directive can do one or more of the following:

- Transform the incoming [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") before passing it on to its inner route (i.e. modify the request)
- Filter the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") according to some logic, i.e. only pass on certain requests and reject others
- Extract values from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") and make them available to its inner route as “extractions”
- Chain some logic into the [RouteResult](../routes.html#routeresult) future transformation chain (i.e. modify the response or rejection)
- Complete the request

This means a `Directive` completely wraps the functionality of its inner route and can apply arbitrarily complex transformations, both (or either) on the request and on the response side.

## Composing Directives

As you have seen from the examples presented so far the “normal” way of composing directives is nesting. Let’s take a look at this concrete example:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/DirectiveExamplesSpec.scala#L14-L28 "Go to snippet source")val route: Route =
  path("order" / IntNumber) { id =>
    concat(
      get {
        complete {
          "Received GET request for order " + id
        }
      },
      put {
        complete {
          "Received PUT request for order " + id
        }
      }
    )
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/DirectiveExamplesTest.java#L16-L94 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.put;

import static akka.http.javadsl.server.PathMatchers.integerSegment;
import static akka.http.javadsl.server.PathMatchers.segment;

Route orElse() {
  return path(segment("order").slash(integerSegment()), id ->
    get(() -> complete("Received GET request for order " + id))
      .orElse(
        put(() -> complete("Received PUT request for order " + id)))
  );
}
```

Here the `get` and `put` directives are chained together with the `concat` combinatorusing the `orElse` method to form a higher\-level route that serves as the inner route of the `path` directive. Let’s rewrite it in the following way:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/DirectiveExamplesSpec.scala#L35-L49 "Go to snippet source")def innerRoute(id: Int): Route =
  concat(
    get {
      complete {
        "Received GET request for order " + id
      }
    },
    put {
      complete {
        "Received PUT request for order " + id
      }
    }
  )

val route: Route = path("order" / IntNumber) { id => innerRoute(id) }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/DirectiveExamplesTest.java#L46-L127 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractMethod;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.put;
import static akka.http.javadsl.server.PathMatchers.integerSegment;
import static akka.http.javadsl.server.PathMatchers.segment;

Route getOrPut(Supplier<Route> inner) {
  return get(inner)
    .orElse(put(inner));
}

Route customDirective() {
  return path(segment("order").slash(integerSegment()), id ->
    getOrPut(() ->
      extractMethod(method -> complete("Received " + method + " for order " + id)))
  );
}
```

In this previous example, we combined the `get` and `put` directives into one composed directive and extracted it to its own method, which could be reused anywhere else in our code.

Instead of extracting the composed directives to its own method, we can also use the available `anyOf` combinator. The following code is equivalent to the previous one:

What you can’t see from this snippet is that directives are not implemented as simple methods but rather as stand\-alone objects of type `Directive`. This gives you more flexibility when composing directives. For example you can also use the `|` operator (or the `or` method) on directives. Here is yet another way to write the example:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/DirectiveExamplesSpec.scala#L56-L61 "Go to snippet source")val route =
  path("order" / IntNumber) { id =>
    (get | put) { ctx =>
      ctx.complete(s"Received ${ctx.request.method.name} request for order $id")
    }
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/DirectiveExamplesTest.java#L56-L136 "Go to snippet source")import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.anyOf;

import static akka.http.javadsl.server.PathMatchers.integerSegment;
import static akka.http.javadsl.server.PathMatchers.segment;

Route usingAnyOf() {
  return path(segment("order").slash(integerSegment()), id ->
    anyOf(Directives::get, Directives::put, () ->
      extractMethod(method -> complete("Received " + method + " for order " + id)))
  );
}
```

Or better (without dropping down to writing an explicit [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") function manually):

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/DirectiveExamplesSpec.scala#L68-L75 "Go to snippet source")val route =
  path("order" / IntNumber) { id =>
    (get | put) {
      extractMethod { m =>
        complete(s"Received ${m.name} request for order $id")
      }
    }
  }
```

If you have a larger route structure where the `(get | put)` snippet appears several times you could also factor it out like this:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/DirectiveExamplesSpec.scala#L82-L90 "Go to snippet source")val getOrPut = get | put
val route =
  path("order" / IntNumber) { id =>
    getOrPut {
      extractMethod { m =>
        complete(s"Received ${m.name} request for order $id")
      }
    }
  }
```

Note that, because `getOrPut` doesn’t take any parameters, it can be a `val` here.

As an alternative to nesting you can also use the `&` operator (or the `and` method):

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/DirectiveExamplesSpec.scala#L97-L101 "Go to snippet source")val getOrPut = get | put
val route =
  (path("order" / IntNumber) & getOrPut & extractMethod) { (id, m) =>
    complete(s"Received ${m.name} request for order $id")
  }
```

Here you can see that, when directives producing extractions are combined with `&`, the resulting “super\-directive” simply extracts the concatenation of its sub\-extractions.

And once again, you can factor things out if you want, thereby pushing the “factoring out” of directive configurations to its extreme:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/DirectiveExamplesSpec.scala#L108-L113 "Go to snippet source")val orderGetOrPutWithMethod =
  path("order" / IntNumber) & (get | put) & extractMethod
val route =
  orderGetOrPutWithMethod { (id, m) =>
    complete(s"Received ${m.name} request for order $id")
  }
```

This type of combining directives with the `|` and `&` operators as well as “saving” more complex directive configurations as a `val` works across the board, with all directives taking inner routes.

The previous example, tries to complete the route first with a `GET` or with a `PUT` if the first one was rejected. 

In case you are constantly nesting the same directives several times in you code, you could factor them out in their own method and use it everywhere:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/DirectiveExamplesTest.java#L65-L151 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractClientIP;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.path;

Route getWithIP(Function<RemoteAddress, Route> inner) {
  return get(() ->
      extractClientIP(address -> inner.apply(address))
  );
}

Route complexRoute() {
  return path(segment("order").slash(integerSegment()), id ->
    getWithIP(address ->
      complete("Received request for order " + id + " from IP " + address))
  );
}
```

Here we simple created our own combined directive that accepts `GET` requests, then extracts the method and completes it with an inner route that takes this HTTP method as a parameter.

Again, instead of extracting own combined directives to its own method, we can make use of the `allOf` combinator. The following code is equivalent to the previous one:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/DirectiveExamplesTest.java#L155-L160 "Go to snippet source")Route complexRouteUsingAllOf() {
  return path(segment("order").slash(integerSegment()), id ->
    allOf(Directives::get, Directives::extractClientIP, address ->
      complete("Received request for order " + id + " from IP " + address))
  );
}
```

In this previous example, the the inner route function provided to `allOf` will be called when the request is a `GET` and with the extracted client IP obtained from the second directive.

As you have already seen in the previous section, you can also use the `concat` method defined in [`RouteDirectives`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteDirectives.html "akka.http.javadsl.server.directives.RouteDirectives")[`RouteDirectives`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives.html "akka.http.scaladsl.server.directives.RouteDirectives") as an alternative to `orElse` chaining. Here you can see the first example again, rewritten using `concat`:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/DirectiveExamplesTest.java#L26-L103 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.put;
import static akka.http.javadsl.server.PathMatchers.integerSegment;
import static akka.http.javadsl.server.PathMatchers.segment;

Route usingConcat() {
  return path(segment("order").slash(integerSegment()), id ->
    concat(get(() -> complete("Received GET request for order " + id)),
          put(() -> complete("Received PUT request for order " + id)))
  );
}
```

The `concat` combinator comes handy when you want to avoid nesting. Here you can see an illustrative example:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/DirectiveExamplesTest.java#L35-L113 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.head;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.put;
import static akka.http.javadsl.server.PathMatchers.integerSegment;
import static akka.http.javadsl.server.PathMatchers.segment;

Route multipleRoutes() {
  return path(segment("order").slash(integerSegment()), id ->
    concat(get(()  -> complete("Received GET request for order " + id)),
          put(()  -> complete("Received PUT request for order " + id)),
          head(() -> complete("Received HEAD request for order " + id)))
  );
}
```

Notice how you could adjust the indentation in these last two examples to have a more readable code.

Note that going too far with “compressing” several directives into a single one probably doesn’t result in the most readable and therefore maintainable routing code. It might even be that the very first of this series of examples is in fact the most readable one.

Still, the purpose of the exercise presented here is to show you how flexible directives can be and how you can use their power to define your web service behavior at the level of abstraction that is right for **your** application.

### Composing Directives with `~` Operator

Note
Gotcha: forgetting the `~` (tilde) character in between directives can result in perfectly valid Scala code that compiles but does not work as expected. What would be intended as a single expression would actually be multiple expressions, and only the final one would be used as the result of the parent directive. Because of this, the recommended way to compose routes is with the the `concat` combinator.

Alternatively we can combine directives using the `~` operator where we chain them together instead of passing each directive as a separate argument. Let’s take a look at the usage of this combinator:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/DirectiveExamplesSpec.scala#L120-L132 "Go to snippet source")def innerRoute(id: Int): Route =
  get {
    complete {
      "Received GET request for order " + id
    }
  } ~
    put {
      complete {
        "Received PUT request for order " + id
      }
    }

val route: Route = path("order" / IntNumber) { id => innerRoute(id) }
```

## Type Safety of Directives

When you combine directives with the `|` and `&` operators`anyOf` and `allOf` methods the routing DSL makes sure that all extractions work as expected and logical constraints are enforced at compile\-time.

For example you cannot `|``anyOf` a directive producing an extraction with one that doesn’t:

Scala

```
val route = path("order" / IntNumber) | get // doesn't compile

```

Java

```
anyOf(this::get, this::extractClientIP, routeProvider) // doesn't compile

```

Also the number of extractions and their types have to match up:

Scala

```
val route = path("order" / IntNumber) | path("order" / DoubleNumber)   // doesn't compile
val route = path("order" / IntNumber) | parameter("order".as[Int])     // ok

```

Java

```
anyOf(this::extractClientIP, this::extractMethod, routeProvider) // doesn't compile
anyOf(bindParameter(this::parameter, "foo"), bindParameter(this::parameter, "bar"), routeProvider) // ok

```

In this previous example we make use of the `bindParameter` function located in `akka-http/akka.http.javadsl.common.PartialApplication`. In order to be able to call `anyOf`, we need to convert our directive that takes 2 parameters to a function that takes only 1\. In this particular case we want to use the `parameter` directive that takes a `String` and a function from `String` to [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route"), so to be able to use it in combination with `anyOf`, we need to bind the first parameter to `foo` and to `bar` in the second one. `bindParameter(this::parameter, "foo")` is equivalent to define your own function like this:

```
Route parameterFoo(Function<String, Route> inner) {
  return parameter("foo", inner);
}

```

When you combine directives producing extractions with the `&` operator`allOf` method all extractions will be properly gathered up:

Scala

```
val order = path("order" / IntNumber) & parameters("oem", "expired".optional)
val route =
  order { (orderId, oem, expired) =>
...
  }

```

Java

```
allOf(this::extractScheme, this::extractMethod, (scheme, method) -> ...) 

```

Directives offer a great way of constructing your web service logic from small building blocks in a plug and play fashion while maintaining DRYness and full type\-safety. If the large range of [Predefined Directives](alphabetically.html) does not fully satisfy your needs you can also easily create [Custom Directives](custom-directives.html).

## Automatic Tuple extraction (flattening)

Convenient Scala DSL syntax described in [Basics](index.html#basics), and [Composing Directives](index.html#composing-directives) are made possible by Tuple extraction internally. Let’s see how this works with examples.

```
val futureOfInt: Future[Int] = Future.successful(1)
val route =
  path("success") {
    onSuccess(futureOfInt) { //: Directive[Tuple1[Int]]
      i => complete("Future was completed.")
    }
  }

```

Looking at the above code, `onSuccess(futureOfInt)` returns a `Directive1[Int] = Directive[Tuple1[Int]]`.

```
val futureOfTuple2: Future[Tuple2[Int,Int]] = Future.successful( (1,2) )
val route =
  path("success") {
    onSuccess(futureOfTuple2) { //: Directive[Tuple2[Int,Int]]
      (i, j) => complete("Future was completed.")
    }
  }

```

Similarly, `onSuccess(futureOfTuple2)` returns a `Directive1[Tuple2[Int,Int]] = Directive[Tuple1[Tuple2[Int,Int]]]`, but this will be automatically converted to `Directive[Tuple2[Int,Int]]` to avoid nested Tuples.

```
val futureOfUnit: Future[Unit] = Future.successful( () )
val route =
  path("success") {
    onSuccess(futureOfUnit) { //: Directive0
        complete("Future was completed.")
    }
  }

```

If the future returns `Future[Unit]`, it is a bit special case as it results in `Directive0`. Looking at the above code, `onSuccess(futureOfUnit)` returns a `Directive1[Unit] = Directive[Tuple1[Unit]]`. However, the DSL interprets `Unit` as `Tuple0`, and automatically converts the result to `Directive[Unit] = Directive0`,

## Code Examples

### Example 1: Basics

```scala
val route: Route = { ctx => ctx.complete("yeah") }
```

### Example 2: Basics

```scala
val route: Route = _.complete("yeah")
```

### Example 3: Basics

```scala
val route = complete("yeah")
```

### Example 4: Basics

```java
Route route = complete("yeah");
```

### Example 5: Basics

```scala
val a: Route = {
  println("MARK")
  ctx => ctx.complete("yeah")
}

val b: Route = { ctx =>
  println("MARK")
  ctx.complete("yeah")
}
```

### Example 6: Basics

```scala
val a = {
  println("MARK")
  complete("yeah")
}

val b = complete {
  println("MARK")
  "yeah"
}
```

### Example 7: Basics

```scala
val route: Route = { ctx =>
  if (ctx.request.method == HttpMethods.GET)
    ctx.complete("Received GET")
  else
    ctx.complete("Received something else")
}
```

### Example 8: Basics

```scala
val route =
  concat(
    get {
      complete("Received GET")
    },
    complete("Received something else")
  )
```

### Example 9: Basics

```scala
val route =
  concat(
    get { ctx =>
      ctx.complete("Received GET")
    },
    complete("Received something else")
  )
```

### Example 10: Basics

```java
Route routes = concat(
  pathSingleSlash(() ->
    getFromResource("web/calculator.html")
  ),
  path("hello", () -> complete("World!))
);
```

### Example 11: Basics

```java
Route route =
  get(
    () -> complete("Received GET")
  ).orElse(
    () -> complete("Received something else")
  )
```

### Example 12: Structure

```scala
name(arguments) { extractions =>
  ... // inner route
}
```

### Example 13: Structure

```java
directiveName(arguments [, ...], (extractions [, ...]) -> {
  ... // inner route
})
```

### Example 14: Composing Directives

```scala
val route: Route =
  path("order" / IntNumber) { id =>
    concat(
      get {
        complete {
          "Received GET request for order " + id
        }
      },
      put {
        complete {
          "Received PUT request for order " + id
        }
      }
    )
  }
```

### Example 15: Composing Directives

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.put;

import static akka.http.javadsl.server.PathMatchers.integerSegment;
import static akka.http.javadsl.server.PathMatchers.segment;

Route orElse() {
  return path(segment("order").slash(integerSegment()), id ->
    get(() -> complete("Received GET request for order " + id))
      .orElse(
        put(() -> complete("Received PUT request for order " + id)))
  );
}
```

### Example 16: Composing Directives

```scala
def innerRoute(id: Int): Route =
  concat(
    get {
      complete {
        "Received GET request for order " + id
      }
    },
    put {
      complete {
        "Received PUT request for order " + id
      }
    }
  )

val route: Route = path("order" / IntNumber) { id => innerRoute(id) }
```

### Example 17: Composing Directives

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractMethod;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.put;
import static akka.http.javadsl.server.PathMatchers.integerSegment;
import static akka.http.javadsl.server.PathMatchers.segment;

Route getOrPut(Supplier<Route> inner) {
  return get(inner)
    .orElse(put(inner));
}

Route customDirective() {
  return path(segment("order").slash(integerSegment()), id ->
    getOrPut(() ->
      extractMethod(method -> complete("Received " + method + " for order " + id)))
  );
}
```

### Example 18: Composing Directives

```scala
val route =
  path("order" / IntNumber) { id =>
    (get | put) { ctx =>
      ctx.complete(s"Received ${ctx.request.method.name} request for order $id")
    }
  }
```

### Example 19: Composing Directives

```java
import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.anyOf;

import static akka.http.javadsl.server.PathMatchers.integerSegment;
import static akka.http.javadsl.server.PathMatchers.segment;

Route usingAnyOf() {
  return path(segment("order").slash(integerSegment()), id ->
    anyOf(Directives::get, Directives::put, () ->
      extractMethod(method -> complete("Received " + method + " for order " + id)))
  );
}
```

### Example 20: Composing Directives

```scala
val route =
  path("order" / IntNumber) { id =>
    (get | put) {
      extractMethod { m =>
        complete(s"Received ${m.name} request for order $id")
      }
    }
  }
```

### Example 21: Composing Directives

```scala
val getOrPut = get | put
val route =
  path("order" / IntNumber) { id =>
    getOrPut {
      extractMethod { m =>
        complete(s"Received ${m.name} request for order $id")
      }
    }
  }
```

### Example 22: Composing Directives

```scala
val getOrPut = get | put
val route =
  (path("order" / IntNumber) & getOrPut & extractMethod) { (id, m) =>
    complete(s"Received ${m.name} request for order $id")
  }
```

### Example 23: Composing Directives

```scala
val orderGetOrPutWithMethod =
  path("order" / IntNumber) & (get | put) & extractMethod
val route =
  orderGetOrPutWithMethod { (id, m) =>
    complete(s"Received ${m.name} request for order $id")
  }
```

### Example 24: Composing Directives

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractClientIP;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.path;

Route getWithIP(Function<RemoteAddress, Route> inner) {
  return get(() ->
      extractClientIP(address -> inner.apply(address))
  );
}

Route complexRoute() {
  return path(segment("order").slash(integerSegment()), id ->
    getWithIP(address ->
      complete("Received request for order " + id + " from IP " + address))
  );
}
```

### Example 25: Composing Directives

```java
Route complexRouteUsingAllOf() {
  return path(segment("order").slash(integerSegment()), id ->
    allOf(Directives::get, Directives::extractClientIP, address ->
      complete("Received request for order " + id + " from IP " + address))
  );
}
```

### Example 26: Composing Directives

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.put;
import static akka.http.javadsl.server.PathMatchers.integerSegment;
import static akka.http.javadsl.server.PathMatchers.segment;

Route usingConcat() {
  return path(segment("order").slash(integerSegment()), id ->
    concat(get(() -> complete("Received GET request for order " + id)),
          put(() -> complete("Received PUT request for order " + id)))
  );
}
```

### Example 27: Composing Directives

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.head;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.put;
import static akka.http.javadsl.server.PathMatchers.integerSegment;
import static akka.http.javadsl.server.PathMatchers.segment;

Route multipleRoutes() {
  return path(segment("order").slash(integerSegment()), id ->
    concat(get(()  -> complete("Received GET request for order " + id)),
          put(()  -> complete("Received PUT request for order " + id)),
          head(() -> complete("Received HEAD request for order " + id)))
  );
}
```

### Example 28: Composing Directives with~Operator

```scala
def innerRoute(id: Int): Route =
  get {
    complete {
      "Received GET request for order " + id
    }
  } ~
    put {
      complete {
        "Received PUT request for order " + id
      }
    }

val route: Route = path("order" / IntNumber) { id => innerRoute(id) }
```

### Example 29: Type Safety of Directives

```scala
val route = path("order" / IntNumber) | get // doesn't compile
```

### Example 30: Type Safety of Directives

```java
anyOf(this::get, this::extractClientIP, routeProvider) // doesn't compile
```

### Example 31: Type Safety of Directives

```scala
val route = path("order" / IntNumber) | path("order" / DoubleNumber)   // doesn't compile
val route = path("order" / IntNumber) | parameter("order".as[Int])     // ok
```

### Example 32: Type Safety of Directives

```java
anyOf(this::extractClientIP, this::extractMethod, routeProvider) // doesn't compile
anyOf(bindParameter(this::parameter, "foo"), bindParameter(this::parameter, "bar"), routeProvider) // ok
```

### Example 33: Type Safety of Directives

```java
Route parameterFoo(Function<String, Route> inner) {
  return parameter("foo", inner);
}
```

### Example 34: Type Safety of Directives

```scala
val order = path("order" / IntNumber) & parameters("oem", "expired".optional)
val route =
  order { (orderId, oem, expired) =>
...
  }
```

### Example 35: Type Safety of Directives

```java
allOf(this::extractScheme, this::extractMethod, (scheme, method) -> ...)
```

### Example 36: Automatic Tuple extraction (flattening)

```scala
val futureOfInt: Future[Int] = Future.successful(1)
val route =
  path("success") {
    onSuccess(futureOfInt) { //: Directive[Tuple1[Int]]
      i => complete("Future was completed.")
    }
  }
```

### Example 37: Automatic Tuple extraction (flattening)

```scala
val futureOfTuple2: Future[Tuple2[Int,Int]] = Future.successful( (1,2) )
val route =
  path("success") {
    onSuccess(futureOfTuple2) { //: Directive[Tuple2[Int,Int]]
      (i, j) => complete("Future was completed.")
    }
  }
```

### Example 38: Automatic Tuple extraction (flattening)

```scala
val futureOfUnit: Future[Unit] = Future.successful( () )
val route =
  path("success") {
    onSuccess(futureOfUnit) { //: Directive0
        complete("Future was completed.")
    }
  }
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteDirectives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/alphabetically.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/get.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/complete.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/index.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/index.html)*