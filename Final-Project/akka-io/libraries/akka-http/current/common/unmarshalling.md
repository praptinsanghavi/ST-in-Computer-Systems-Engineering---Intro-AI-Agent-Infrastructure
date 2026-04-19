---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:06:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html
title: Unmarshalling • Akka HTTP
---

# Unmarshalling • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Unmarshalling

“Unmarshalling” is the process of converting some kind of a lower\-level representation, often a “wire format”, into a higher\-level (object) structure. Other popular names for it are “Deserialization” or “Unpickling”.

In Akka HTTP “Unmarshalling” means the conversion of a lower\-level source object, e.g. a `MessageEntity` (which forms the “entity body” of an HTTP request or response) or a full [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") or [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse"), into an instance of type `T`.

## Basic Design

Unmarshalling of instances of type `A` into instances of type `B` is performed by an [`Unmarshaller<A, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller[A, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller").

Akka HTTP also predefines a number of helpful aliases for the types of unmarshallers that you’ll likely work with most:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/package.scala#L13-L19 "Go to snippet source")type FromEntityUnmarshaller[T] = Unmarshaller[HttpEntity, T]
type FromMessageUnmarshaller[T] = Unmarshaller[HttpMessage, T]
type FromResponseUnmarshaller[T] = Unmarshaller[HttpResponse, T]
type FromRequestUnmarshaller[T] = Unmarshaller[HttpRequest, T]
type FromByteStringUnmarshaller[T] = Unmarshaller[ByteString, T]
type FromStringUnmarshaller[T] = Unmarshaller[String, T]
type FromStrictFormFieldUnmarshaller[T] = Unmarshaller[StrictForm.Field, T]
```

At its core an [`Unmarshaller<A, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller[A, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") is very similar to a function `A => Future[B]``Function<A, CompletionStage<B>>` and as such quite a bit simpler than its [marshalling](marshalling.html) counterpart. The process of unmarshalling does not have to support content negotiation which saves two additional layers of indirection that are required on the marshalling side.

## Using unmarshallers

For an example on how to use an unmarshaller on the server side, see for example the [Dynamic Routing Example](../routing-dsl/index.html#dynamic-routing-example). For the client side, see [Processing Responses](../client-side/request-and-response.html#processing-responses)

## Predefined Unmarshallers

Akka HTTP already predefines a number of unmarshallers for the most common types. Specifically these are:

- [`PredefinedFromStringUnmarshallers`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html "akka.http.scaladsl.unmarshalling.PredefinedFromStringUnmarshallers") [`StringUnmarshallers`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/StringUnmarshallers.html "akka.http.javadsl.unmarshalling.StringUnmarshallers")
	- `Byte`
	- `Short`
	- `Int``Integer`
	- `Long`
	- `Float`
	- `Double`
	- `Boolean`
- [`PredefinedFromEntityUnmarshallers`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html "akka.http.scaladsl.unmarshalling.PredefinedFromEntityUnmarshallers") [`Unmarshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller")
	- `Array[Byte]``byte[]`
	- [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")
	- `Array[Char]``char[]`
	- `String`
	- `akka.http.scaladsl.model.FormData``akka.http.javadsl.model.FormData`

- [`GenericUnmarshallers`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html "akka.http.scaladsl.unmarshalling.GenericUnmarshallers")
	- [`Unmarshaller<T, T>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller[T, T]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") (identity unmarshaller)
	- [`Unmarshaller<Option<A>, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller[Option[A], B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller"), if an [`Unmarshaller<A, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller[A, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") is available
	- [`Unmarshaller<A, Option<B>>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller[A, Option[B]]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller"), if an [`Unmarshaller<A, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller[A, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") is available

Additional unmarshallers are available in separate modules for specific content types, such as [JSON](json-support.html) and [XML](xml-support.html).

## Implicit Resolution

The unmarshalling infrastructure of Akka HTTP relies on a type\-class based approach, which means that [`Unmarshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") instances from a certain type `A` to a certain type `B` have to be available implicitly.

The implicits for most of the predefined unmarshallers in Akka HTTP are provided through the companion object of the [`Unmarshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") trait. This means that they are always available and never need to be explicitly imported. Additionally, you can simply “override” them by bringing your own custom version into local scope.

## Custom Unmarshallers

Akka HTTP gives you a few convenience tools for constructing unmarshallers for your own types. Usually you won’t have to “manually” implement the [`Unmarshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") traitclass directly. Rather, it should be possible to use one of the convenience construction helpers defined on the [`Unmarshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") companion[`Unmarshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller"):

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/Unmarshaller.scala#L49-L72 "Go to snippet source")/**
 * Creates an `Unmarshaller` from the given function.
 */
def apply[A, B](f: ExecutionContext => A => Future[B]): Unmarshaller[A, B] =
  withMaterializer(ec => _ => f(ec))

def withMaterializer[A, B](f: ExecutionContext => Materializer => A => Future[B]): Unmarshaller[A, B] =
  new Unmarshaller[A, B] {
    def apply(a: A)(implicit ec: ExecutionContext, materializer: Materializer) =
      try f(ec)(materializer)(a)
      catch { case NonFatal(e) => FastFuture.failed(e) }
  }

/**
 * Helper for creating a synchronous `Unmarshaller` from the given function.
 */
def strict[A, B](f: A => B): Unmarshaller[A, B] = Unmarshaller(_ => a => FastFuture.successful(f(a)))

/**
 * Helper for creating a "super-unmarshaller" from a sequence of "sub-unmarshallers", which are tried
 * in the given order. The first successful unmarshalling of a "sub-unmarshallers" is the one produced by the
 * "super-unmarshaller".
 */
def firstOf[A, B](unmarshallers: Unmarshaller[A, B]*): Unmarshaller[A, B] = //...
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/java/akka/http/javadsl/unmarshalling/Unmarshallers.java#L14-L28 "Go to snippet source")<A, B> Unmarshaller<A, B> async(java.util.function.Function<A, java.util.concurrent.CompletionStage<B>> f);
<A, B> Unmarshaller<A, B> sync(java.util.function.Function<A, B> f);
<A, B> Unmarshaller<A, B> firstOf(Unmarshaller<A, B> u1, Unmarshaller<A, B> u2);
<A, B> Unmarshaller<A, B> firstOf(Unmarshaller<A, B> u1, Unmarshaller<A, B> u2, Unmarshaller<A, B> u3);
<A, B> Unmarshaller<A, B> firstOf(Unmarshaller<A, B> u1, Unmarshaller<A, B> u2, Unmarshaller<A, B> u3, Unmarshaller<A, B> u4);
<A, B> Unmarshaller<A, B> firstOf(Unmarshaller<A, B> u1, Unmarshaller<A, B> u2, Unmarshaller<A, B> u3, Unmarshaller<A, B> u4, Unmarshaller<A, B> u5);
```

Note
To avoid unnecessary memory pressure, unmarshallers should make sure to either fully consume the incoming entity data stream, or make sure it is properly cancelled on error. Failure to do so might keep the remaining part of the stream in memory for longer than necessary.

## Deriving Unmarshallers

Sometimes you can save yourself some work by reusing existing unmarshallers for your custom ones. The idea is to “wrap” an existing unmarshaller with some logic to “re\-target” it to your type.

Usually what you want to do is to transform the output of some existing unmarshaller and convert it to your type. For this type of unmarshaller transformation Akka HTTP defines these methods:

- `baseUnmarshaller.transform`
- `baseUnmarshaller.map`
- `baseUnmarshaller.mapWithInput`
- `baseUnmarshaller.flatMap`
- `baseUnmarshaller.flatMapWithInput`
- `baseUnmarshaller.recover`
- `baseUnmarshaller.withDefaultValue`
- `baseUnmarshaller.mapWithCharset` (only available for FromEntityUnmarshallers)
- `baseUnmarshaller.forContentTypes` (only available for FromEntityUnmarshallers)

- `baseMarshaller.thenApply`
- `baseMarshaller.flatMap`
- `Unmarshaller.forMediaType` (to derive from a [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") unmarshaller)
- `Unmarshaller.forMediaTypes` (to derive from a [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") unmarshaller)

The method signatures should make their semantics relatively clear.

## Using Unmarshallers

In many places throughout Akka HTTP unmarshallers are used implicitly, e.g. when you want to access the [entity](../routing-dsl/directives/marshalling-directives/entity.html) of a request using the [Routing DSL](../routing-dsl/index.html).

However, you can also use the unmarshalling infrastructure directly if you wish, which can be useful for example in tests. The best entry point for this is the `akka.http.scaladsl.unmarshalling.Unmarshal` object`akka.http.javadsl.unmarshalling.StringUnmarshallers` class, which you can use like this:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/UnmarshalSpec.scala#L13-L25 "Go to snippet source")import akka.http.scaladsl.unmarshalling.Unmarshal
import system.dispatcher // Optional ExecutionContext (default from Materializer)

import scala.concurrent.Await
import scala.concurrent.duration._

val intFuture = Unmarshal("42").to[Int]
val int = Await.result(intFuture, 1.second) // don't block in non-test code!
int shouldEqual 42

val boolFuture = Unmarshal("off").to[Boolean]
val bool = Await.result(boolFuture, 1.second) // don't block in non-test code!
bool shouldBe false
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/UnmarshalTest.java#L13-L19 "Go to snippet source")import akka.http.javadsl.model.*;
import akka.http.javadsl.unmarshalling.StringUnmarshallers;
import akka.http.javadsl.unmarshalling.Unmarshaller;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

CompletionStage<Integer> integerStage =
  StringUnmarshallers.INTEGER.unmarshal("42", system());
int integer = integerStage.toCompletableFuture().get(1, TimeUnit.SECONDS); // don't block in non-test code!
assertEquals(integer, 42);

CompletionStage<Boolean> boolStage =
  StringUnmarshallers.BOOLEAN.unmarshal("off", system());
boolean bool = boolStage.toCompletableFuture().get(1, TimeUnit.SECONDS); // don't block in non-test code!
assertEquals(bool, false);
```

## Code Examples

### Example 1: Basic Design

```scala
type FromEntityUnmarshaller[T] = Unmarshaller[HttpEntity, T]
type FromMessageUnmarshaller[T] = Unmarshaller[HttpMessage, T]
type FromResponseUnmarshaller[T] = Unmarshaller[HttpResponse, T]
type FromRequestUnmarshaller[T] = Unmarshaller[HttpRequest, T]
type FromByteStringUnmarshaller[T] = Unmarshaller[ByteString, T]
type FromStringUnmarshaller[T] = Unmarshaller[String, T]
type FromStrictFormFieldUnmarshaller[T] = Unmarshaller[StrictForm.Field, T]
```

### Example 2: Custom Unmarshallers

```scala
/**
 * Creates an `Unmarshaller` from the given function.
 */
def apply[A, B](f: ExecutionContext => A => Future[B]): Unmarshaller[A, B] =
  withMaterializer(ec => _ => f(ec))

def withMaterializer[A, B](f: ExecutionContext => Materializer => A => Future[B]): Unmarshaller[A, B] =
  new Unmarshaller[A, B] {
    def apply(a: A)(implicit ec: ExecutionContext, materializer: Materializer) =
      try f(ec)(materializer)(a)
      catch { case NonFatal(e) => FastFuture.failed(e) }
  }

/**
 * Helper for creating a synchronous `Unmarshaller` from the given function.
 */
def strict[A, B](f: A => B): Unmarshaller[A, B] = Unmarshaller(_ => a => FastFuture.successful(f(a)))

/**
 * Helper for creating a "super-unmarshaller" from a sequence of "sub-unmarshallers", which are tried
 * in the given order. The first successful unmarshalling of a "sub-unmarshallers" is the one produced by the
 * "super-unmarshaller".
 */
def firstOf[A, B](unmarshallers: Unmarshaller[A, B]*): Unmarshaller[A, B] = //...
```

### Example 3: Custom Unmarshallers

```java
<A, B> Unmarshaller<A, B> async(java.util.function.Function<A, java.util.concurrent.CompletionStage<B>> f);
<A, B> Unmarshaller<A, B> sync(java.util.function.Function<A, B> f);
<A, B> Unmarshaller<A, B> firstOf(Unmarshaller<A, B> u1, Unmarshaller<A, B> u2);
<A, B> Unmarshaller<A, B> firstOf(Unmarshaller<A, B> u1, Unmarshaller<A, B> u2, Unmarshaller<A, B> u3);
<A, B> Unmarshaller<A, B> firstOf(Unmarshaller<A, B> u1, Unmarshaller<A, B> u2, Unmarshaller<A, B> u3, Unmarshaller<A, B> u4);
<A, B> Unmarshaller<A, B> firstOf(Unmarshaller<A, B> u1, Unmarshaller<A, B> u2, Unmarshaller<A, B> u3, Unmarshaller<A, B> u4, Unmarshaller<A, B> u5);
```

### Example 4: Using Unmarshallers

```scala
import akka.http.scaladsl.unmarshalling.Unmarshal
import system.dispatcher // Optional ExecutionContext (default from Materializer)

import scala.concurrent.Await
import scala.concurrent.duration._

val intFuture = Unmarshal("42").to[Int]
val int = Await.result(intFuture, 1.second) // don't block in non-test code!
int shouldEqual 42

val boolFuture = Unmarshal("off").to[Boolean]
val bool = Await.result(boolFuture, 1.second) // don't block in non-test code!
bool shouldBe false
```

### Example 5: Using Unmarshallers

```java
import akka.http.javadsl.model.*;
import akka.http.javadsl.unmarshalling.StringUnmarshallers;
import akka.http.javadsl.unmarshalling.Unmarshaller;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

CompletionStage<Integer> integerStage =
  StringUnmarshallers.INTEGER.unmarshal("42", system());
int integer = integerStage.toCompletableFuture().get(1, TimeUnit.SECONDS); // don't block in non-test code!
assertEquals(integer, 42);

CompletionStage<Boolean> boolStage =
  StringUnmarshallers.BOOLEAN.unmarshal("off", system());
boolean bool = boolStage.toCompletableFuture().get(1, TimeUnit.SECONDS); // don't block in non-test code!
assertEquals(bool, false);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/StringUnmarshallers.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-http/current/client-side/request-and-response.html
- https://doc.akka.io/libraries/akka-http/current/common/encoding.html
- https://doc.akka.io/libraries/akka-http/current/common/json-support.html
- https://doc.akka.io/libraries/akka-http/current/common/marshalling.html
- https://doc.akka.io/libraries/akka-http/current/common/xml-support.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/entity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html](https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html)*