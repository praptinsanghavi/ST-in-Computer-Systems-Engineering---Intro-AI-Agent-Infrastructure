---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:21:49Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
title: Custom Directives • Akka HTTP
---

# Custom Directives • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Custom Directives

Part of the power of akka\-http directives comes from the ease with which it’s possible to define custom directives at differing levels of abstraction.

There are essentially three ways of creating custom directives:

1. By introducing new “labels” for configurations of existing directives
2. By transforming existing directives
3. By writing a directive “from scratch”

## Configuration Labeling

The easiest way to create a custom directive is to simply assign a new name for a certain configuration of one or more existing directives. In fact, most of the predefined akka\-http directives can be considered named configurations of more low\-level directives.

The basic technique is explained in the chapter about Composing Directives, where, for example, a new directive `getOrPut` is defined like this:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CustomDirectivesExamplesSpec.scala#L17-L28 "Go to snippet source")val getOrPut = get | put

// tests:
val route = getOrPut { complete("ok") }

Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "ok"
}

Put("/") ~> route ~> check {
  responseAs[String] shouldEqual "ok"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CustomDirectivesExamplesTest.java#L22-L41 "Go to snippet source")import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.put;
import static akka.http.javadsl.server.Directives.complete;

public Route getOrPut(Supplier<Route> inner) {
  return get(inner).orElse(put(inner));
}
Route route = getOrPut(() -> complete("ok"));
```

Multiple directives can be nested to produce a single directive out of multiple like this:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CustomDirectivesExamplesTest.java#L28-L103 "Go to snippet source")import static akka.http.javadsl.server.Directives.headerValueByName;

// the composed custom directive
/**
 * @param authenticate A function returns a set of roles for the credentials of a user
 * @param inner Inner route to execute if the provided credentials has the given role
 *              if not, the request is completed with a
 */
public Route headerBasedAuth(Function<MyCredentials, Set<MyRole>> authenticate, MyRole requiredRole, Supplier<Route> inner) {
  return headerValueByName("X-My-User-Id", (userId) -> {
    return headerValueByName("X-My-User-Secret", (secret) -> {
      Set<MyRole> userRoles = authenticate.apply(new MyCredentials(userId, secret));
      if (userRoles.contains(requiredRole)) {
        return inner.get();
      } else {
        return complete(StatusCodes.FORBIDDEN, "Role " + requiredRole + " required for access");
      }
    });
  });
}
import static akka.http.javadsl.server.Directives.path;

// a function for authentication
Function<MyCredentials, Set<MyRole>> authLogic =
  (credentials) -> {
    if (credentials.userId.equals("admin") && credentials.safeSecretVerification("secret"))
      return new HashSet<>(Arrays.asList(MyRole.USER, MyRole.ADMIN));
    else
      return Collections.emptySet();
  };

// and then using the custom route
Route route = get(() ->
  path("admin", () ->
    headerBasedAuth(authLogic, MyRole.ADMIN, () -> complete(StatusCodes.OK, "admin stuff"))
  )
);
```

Another example is the [MethodDirectives](method-directives/index.html) which are simply instances of a preconfigured [method](method-directives/method.html) directive. The low\-level directives that most often form the basis of higher\-level “named configuration” directives are grouped together in the [BasicDirectives](basic-directives/index.html) trait.

## Transforming Directives

The second option for creating new directives is to transform an existing one using one of the “transformation methods”, which are defined on the [`Directive`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html "akka.http.scaladsl.server.Directive") class, the base class of all “regular” directives.

Apart from the combinator operators (`|` and `&`) and the case\-class extractor (`as[T]`) the following transformations are also defined on all `Directive` instances:

> - [map/tmap](#map-tmap)
> - [flatMap/tflatMap](#flatmap-tflatmap)
> - [require/trequire](#require-trequire)
> - [recover/recoverPF](#recover-recoverpf)

### map and tmap

If the Directive is a single\-value `Directive`, the `map` method allows for simple transformations:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CustomDirectivesExamplesSpec.scala#L34-L43 "Go to snippet source")val textParam: Directive1[String] =
  parameter("text".as[String])

val lengthDirective: Directive1[Int] =
  textParam.map(text => text.length)

// tests:
Get("/?text=abcdefg") ~> lengthDirective(x => complete(x.toString)) ~> check {
  responseAs[String] shouldEqual "7"
}
```

One example of a predefined directive relying on `map` is the [optionalHeaderValue](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/HeaderDirectives.scala#L105-L108) directive.

The tmap modifier has this signature (somewhat simplified):

```
def tmap[R](f: L => R): Directive[Out]

```

It can be used to transform the `Tuple` of extractions into another `Tuple`. The number and/or types of the extractions can be changed arbitrarily. For example if `R` is `Tuple2[A, B]` then the result will be a `Directive[(A, B)]`. Here is a somewhat contrived example:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CustomDirectivesExamplesSpec.scala#L49-L60 "Go to snippet source")val twoIntParameters: Directive[(Int, Int)] =
  parameters("a".as[Int], "b".as[Int])

val myDirective: Directive1[String] =
  twoIntParameters.tmap {
    case (a, b) => (a + b).toString
  }

// tests:
Get("/?a=2&b=5") ~> myDirective(x => complete(x)) ~> check {
  responseAs[String] shouldEqual "7"
}
```

### flatMap and tflatMap

With map and tmap you can transform the values a directive extracts but you cannot change the “extracting” nature of the directive. For example, if you have a directive extracting an `Int` you can use map to turn it into a directive that extracts that `Int` and doubles it, but you cannot transform it into a directive, that doubles all positive `Int` values and rejects all others.

In order to do the latter you need `flatMap` or `tflatMap`. The `tflatMap` modifier has this signature:

```
def tflatMap[R: Tuple](f: L => Directive[R]): Directive[R]

```

The given function produces a new directive depending on the Tuple of extractions of the underlying one. As in the case of [map/tmap](#map-tmap) there is also a single\-value variant called `flatMap`, which simplifies the operation for Directives only extracting one single value.

Here is the (contrived) example from above, which doubles positive Int values and rejects all others:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CustomDirectivesExamplesSpec.scala#L86-L100 "Go to snippet source")val intParameter: Directive1[Int] = parameter("a".as[Int])

val myDirective: Directive1[Int] =
  intParameter.flatMap {
    case a if a > 0 => provide(2 * a)
    case _          => reject
  }

// tests:
Get("/?a=21") ~> myDirective(i => complete(i.toString)) ~> check {
  responseAs[String] shouldEqual "42"
}
Get("/?a=-18") ~> myDirective(i => complete(i.toString)) ~> check {
  handled shouldEqual false
}
```

A common pattern that relies on flatMap is to first extract a value from the RequestContext with the extract directive and then flatMap with some kind of filtering logic. For example, this is the implementation of the method directive:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/MethodDirectives.scala#L83-L87 "Go to snippet source")def method(httpMethod: HttpMethod): Directive0 =
  extractMethod.flatMap[Unit] {
    case `httpMethod` => pass
    case _            => reject(MethodRejection(httpMethod))
  } & cancelRejections(classOf[MethodRejection])
```

The explicit type parameter `[Unit]` on the flatMap is needed in this case because the result of the flatMap is directly concatenated with the `cancelAllRejections` directive, thereby preventing “outside\-in” inference of the type parameter value.

### require and trequire

The require modifier transforms a single\-extraction directive into a directive without extractions, which filters the requests according the a predicate function. All requests, for which the predicate is false are rejected, all others pass unchanged.

The signature of require is this:

```
def require(predicate: T => Boolean, rejections: Rejection*): Directive0

```

One example of a predefined directive relying on require is the first overload of the host directive:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/HostDirectives.scala#L34-L39 "Go to snippet source")/**
 * Rejects all requests for whose host name the given predicate function returns false.
 *
 * @group host
 */
def host(predicate: String => Boolean): Directive0 = extractHost.require(predicate)
```

You can only call require on single\-extraction directives. The trequire modifier is the more general variant, which takes a predicate of type `Tuple => Boolean`. It can therefore also be used on directives with several extractions.

### recover and recoverPF

The `recover` modifier allows you “catch” rejections produced by the underlying directive and, instead of rejecting, produce an alternative directive with the same type(s) of extractions.

The signature of recover is this:

```
def recover[R >: L: Tuple](recovery: Seq[Rejection] => Directive[R]): Directive[R] =

```

In many cases the very similar `recoverPF` modifier might be little bit easier to use since it doesn’t require the handling of all rejections:

```
def recoverPF[R >: L: Tuple](
  recovery: PartialFunction[Seq[Rejection], Directive[R]]): Directive[R]

```

One example of a predefined directive relying `recoverPF` is the `optionalHeaderValue` directive:

```
def optionalHeaderValue[T](f: HttpHeader => Option[T]): Directive1[Option[T]]
```

### collect and tcollect

With collect and tcollect you can filter and map in one go, it mimics the collect known from the regular Scala collections.

Here is an example, first via map and filter and finally using collect:

```
parameter("a".as[Int]).filter(x => x != 0, MissingQueryParamRejection("a")).map(x => 42 / x)

parameter("a".as[Int]).collect({ case x if x != 0 => 42 / x }, MissingQueryParamRejection("a"))

```

## Directives from Scratch

The third option for creating custom directives is to do it “from scratch”, either by using `Directive.apply` or by subclassing `Directive` class directly. The `Directive` is defined like this (leaving away operators and modifiers):

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/Directive.scala#L20-L138 "Go to snippet source")abstract class Directive[L](implicit val ev: Tuple[L]) {

  /**
   * Calls the inner route with a tuple of extracted values of type `L`.
   *
   * `tapply` is short for "tuple-apply". Usually, you will use the regular `apply` method instead,
   * which is added by an implicit conversion (see `Directive.addDirectiveApply`).
   */
  def tapply(f: L => Route): Route
}
```

It only has one abstract member that you need to implement, the `tapply` method, which creates the Route the directives presents to the outside from its inner Route building function (taking the extractions as parameters).

Extractions are kept as a Tuple. Here are a few examples:

A `Directive[Unit]` extracts nothing (like the get directive). Because this type is used quite frequently akka\-http defines a type alias for it:

```
type Directive0 = Directive[Unit]

```

A `Directive[(String)]` extracts one String value (like the hostName directive). The type alias for it is:

```
type Directive1[T] = Directive[Tuple1[T]]

```

A `Directive[(String, Int)]` extracts a `String` value and an `Int` value (like a `parameters('a.as[String], 'b.as[Int])` directive). Such a directive can be defined to extract the hostname and port of a request:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CustomDirectivesExamplesSpec.scala#L106-L119 "Go to snippet source")def hostnameAndPort: Directive[(String, Int)] = Directive[(String, Int)] { inner => ctx =>
  val authority = ctx.request.uri.authority
  inner((authority.host.address(), authority.port))(ctx)
}

// test
val route = hostnameAndPort {
  (hostname, port) => complete(s"The hostname is $hostname and the port is $port")
}

Get() ~> Host("akka.io", 8080) ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "The hostname is akka.io and the port is 8080"
}
```

Beside using `Directive.apply`, you can also extending `Directive` directly(This is actually uncommon and the first is preferable for common use cases):

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CustomDirectivesExamplesSpec.scala#L125-L140 "Go to snippet source")object hostnameAndPort extends Directive[(String, Int)] {
  override def tapply(f: ((String, Int)) => Route): Route = { ctx =>
    val authority = ctx.request.uri.authority
    f((authority.host.address(), authority.port))(ctx)
  }
}

// test
val route = hostnameAndPort {
  (hostname, port) => complete(s"The hostname is $hostname and the port is $port")
}

Get() ~> Host("akka.io", 8080) ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "The hostname is akka.io and the port is 8080"
}
```

Keeping extractions as `Tuples` has a lot of advantages, mainly great flexibility while upholding full type safety and “inferability”. However, the number of times where you’ll really have to fall back to defining a directive from scratch should be very small. In fact, if you find yourself in a position where a “from scratch” directive is your only option, we’d like to hear about it, so we can provide a higher\-level “something” for other users.

## Code Examples

### Example 1: Configuration Labeling

```scala
val getOrPut = get | put

// tests:
val route = getOrPut { complete("ok") }

Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "ok"
}

Put("/") ~> route ~> check {
  responseAs[String] shouldEqual "ok"
}
```

### Example 2: Configuration Labeling

```java
import static akka.http.javadsl.server.Directives.get;
import static akka.http.javadsl.server.Directives.put;
import static akka.http.javadsl.server.Directives.complete;

public Route getOrPut(Supplier<Route> inner) {
  return get(inner).orElse(put(inner));
}
Route route = getOrPut(() -> complete("ok"));
```

### Example 3: Configuration Labeling

```java
import static akka.http.javadsl.server.Directives.headerValueByName;

// the composed custom directive
/**
 * @param authenticate A function returns a set of roles for the credentials of a user
 * @param inner Inner route to execute if the provided credentials has the given role
 *              if not, the request is completed with a
 */
public Route headerBasedAuth(Function<MyCredentials, Set<MyRole>> authenticate, MyRole requiredRole, Supplier<Route> inner) {
  return headerValueByName("X-My-User-Id", (userId) -> {
    return headerValueByName("X-My-User-Secret", (secret) -> {
      Set<MyRole> userRoles = authenticate.apply(new MyCredentials(userId, secret));
      if (userRoles.contains(requiredRole)) {
        return inner.get();
      } else {
        return complete(StatusCodes.FORBIDDEN, "Role " + requiredRole + " required for access");
      }
    });
  });
}
import static akka.http.javadsl.server.Directives.path;

// a function for authentication
Function<MyCredentials, Set<MyRole>> authLogic =
  (credentials) -> {
    if (credentials.userId.equals("admin") && credentials.safeSecretVerification("secret"))
      return new HashSet<>(Arrays.asList(MyRole.USER, MyRole.ADMIN));
    else
      return Collections.emptySet();
  };

// and then using the custom route
Route route = get(() ->
  path("admin", () ->
    headerBasedAuth(authLogic, MyRole.ADMIN, () -> complete(StatusCodes.OK, "admin stuff"))
  )
);
```

### Example 4: map and tmap

```scala
val textParam: Directive1[String] =
  parameter("text".as[String])

val lengthDirective: Directive1[Int] =
  textParam.map(text => text.length)

// tests:
Get("/?text=abcdefg") ~> lengthDirective(x => complete(x.toString)) ~> check {
  responseAs[String] shouldEqual "7"
}
```

### Example 5: map and tmap

```scala
def tmap[R](f: L => R): Directive[Out]
```

### Example 6: map and tmap

```scala
val twoIntParameters: Directive[(Int, Int)] =
  parameters("a".as[Int], "b".as[Int])

val myDirective: Directive1[String] =
  twoIntParameters.tmap {
    case (a, b) => (a + b).toString
  }

// tests:
Get("/?a=2&b=5") ~> myDirective(x => complete(x)) ~> check {
  responseAs[String] shouldEqual "7"
}
```

### Example 7: flatMap and tflatMap

```scala
def tflatMap[R: Tuple](f: L => Directive[R]): Directive[R]
```

### Example 8: flatMap and tflatMap

```scala
val intParameter: Directive1[Int] = parameter("a".as[Int])

val myDirective: Directive1[Int] =
  intParameter.flatMap {
    case a if a > 0 => provide(2 * a)
    case _          => reject
  }

// tests:
Get("/?a=21") ~> myDirective(i => complete(i.toString)) ~> check {
  responseAs[String] shouldEqual "42"
}
Get("/?a=-18") ~> myDirective(i => complete(i.toString)) ~> check {
  handled shouldEqual false
}
```

### Example 9: flatMap and tflatMap

```scala
def method(httpMethod: HttpMethod): Directive0 =
  extractMethod.flatMap[Unit] {
    case `httpMethod` => pass
    case _            => reject(MethodRejection(httpMethod))
  } & cancelRejections(classOf[MethodRejection])
```

### Example 10: require and trequire

```scala
def require(predicate: T => Boolean, rejections: Rejection*): Directive0
```

### Example 11: require and trequire

```scala
/**
 * Rejects all requests for whose host name the given predicate function returns false.
 *
 * @group host
 */
def host(predicate: String => Boolean): Directive0 = extractHost.require(predicate)
```

### Example 12: recover and recoverPF

```scala
def recover[R >: L: Tuple](recovery: Seq[Rejection] => Directive[R]): Directive[R] =
```

### Example 13: recover and recoverPF

```scala
def recoverPF[R >: L: Tuple](
  recovery: PartialFunction[Seq[Rejection], Directive[R]]): Directive[R]
```

### Example 14: recover and recoverPF

```scala
def optionalHeaderValue[T](f: HttpHeader => Option[T]): Directive1[Option[T]]
```

### Example 15: collect and tcollect

```text
parameter("a".as[Int]).filter(x => x != 0, MissingQueryParamRejection("a")).map(x => 42 / x)

parameter("a".as[Int]).collect({ case x if x != 0 => 42 / x }, MissingQueryParamRejection("a"))
```

### Example 16: Directives from Scratch

```scala
abstract class Directive[L](implicit val ev: Tuple[L]) {

  /**
   * Calls the inner route with a tuple of extracted values of type `L`.
   *
   * `tapply` is short for "tuple-apply". Usually, you will use the regular `apply` method instead,
   * which is added by an implicit conversion (see `Directive.addDirectiveApply`).
   */
  def tapply(f: L => Route): Route
}
```

### Example 17: Directives from Scratch

```scala
type Directive0 = Directive[Unit]
```

### Example 18: Directives from Scratch

```scala
type Directive1[T] = Directive[Tuple1[T]]
```

### Example 19: Directives from Scratch

```scala
def hostnameAndPort: Directive[(String, Int)] = Directive[(String, Int)] { inner => ctx =>
  val authority = ctx.request.uri.authority
  inner((authority.host.address(), authority.port))(ctx)
}

// test
val route = hostnameAndPort {
  (hostname, port) => complete(s"The hostname is $hostname and the port is $port")
}

Get() ~> Host("akka.io", 8080) ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "The hostname is akka.io and the port is 8080"
}
```

### Example 20: Directives from Scratch

```scala
object hostnameAndPort extends Directive[(String, Int)] {
  override def tapply(f: ((String, Int)) => Route): Route = { ctx =>
    val authority = ctx.request.uri.authority
    f((authority.host.address(), authority.port))(ctx)
  }
}

// test
val route = hostnameAndPort {
  (hostname, port) => complete(s"The hostname is $hostname and the port is $port")
}

Get() ~> Host("akka.io", 8080) ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "The hostname is akka.io and the port is 8080"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/method.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/requireClientCertificateIdentity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html)*