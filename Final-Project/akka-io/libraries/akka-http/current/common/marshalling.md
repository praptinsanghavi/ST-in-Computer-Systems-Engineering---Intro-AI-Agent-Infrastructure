---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:06:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/common/marshalling.html
title: Marshalling • Akka HTTP
---

# Marshalling • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Marshalling

TODO [overhaul for Java](https://github.com/akka/akka-http/issues/1367)

Marshalling is the process of converting a higher\-level (object) structure into some kind of lower\-level representation, often a “wire format”. Other popular names for marshalling are “serialization” or “pickling”.

In Akka HTTP, marshalling means the conversion of an object of type `T` into a lower\-level target type, e.g. a `MessageEntity` (which forms the “entity body” of an HTTP request or response) or a full [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") or [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse").

On the server\-side, for example, marshalling is used to convert an application\-domain object to a response entity. Requests can contain an [`Accept`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Accept.html "akka.http.javadsl.model.headers.Accept")[`Accept`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept.html "akka.http.scaladsl.model.headers.Accept") header that lists acceptable content types for the client, such as `application/json` and `application/xml`. A marshaller contains the logic to negotiate the result content types based on the [`Accept`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Accept.html "akka.http.javadsl.model.headers.Accept")[`Accept`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept.html "akka.http.scaladsl.model.headers.Accept") and the `AcceptCharset` headers.

## Basic Design

Marshalling of instances of type `A` into instances of type `B` is performed by a [`Marshaller<A, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[A, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller").

Contrary to what you might initially expect, [`Marshaller<A, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[A, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") is not a plain function `A => B` but rather essentially a function `A => Future[List[Marshalling[B]]]``A => CompletionStage<List<Marshalling<B>>>`. Let’s dissect this rather complicated looking signature piece by piece to understand why marshallers are designed this way. Given an instance of type `A` a [`Marshaller<A, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[A, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") produces:

1. A `Future``CompletionStage`: This is probably quite clear. Marshallers are not required to synchronously produce a result, so instead they return a future, which allows for asynchronicity in the marshalling process.
2. of `List`: Rather than only a single target representation for `A` marshallers can offer several ones. Which one will be rendered onto the wire in the end is decided by content negotiation. For example, the [`Marshaller<OrderConfirmation, MessageEntity>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[OrderConfirmation, MessageEntity]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") might offer a JSON as well as an XML representation. The client can decide through the addition of an [`Accept`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Accept.html "akka.http.javadsl.model.headers.Accept")[`Accept`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept.html "akka.http.scaladsl.model.headers.Accept") request header which one is preferred. If the client doesn’t express a preference the first representation is picked.
3. of `Marshalling[B]``Marshalling<B>`: Rather than returning an instance of `B` directly marshallers first produce a `Marshalling[B]``Marshalling<B>`. This allows for querying the [`MediaType`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html "akka.http.javadsl.model.MediaType")[`MediaType`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html "akka.http.scaladsl.model.MediaType") and potentially the [`HttpCharset`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html "akka.http.javadsl.model.HttpCharset")[`HttpCharset`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html "akka.http.scaladsl.model.HttpCharset") that the marshaller will produce before the actual marshalling is triggered. Apart from enabling content negotiation this design allows for delaying the actual construction of the marshalling target instance to the very last moment when it is really needed.

This is how `Marshalling` is defined:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/Marshaller.scala#L172-L216 "Go to snippet source")/**
 * Describes one possible option for marshalling a given value.
 */
sealed trait Marshalling[+A] {
  def map[B](f: A => B): Marshalling[B]

  /**
   * Converts this marshalling to an opaque marshalling, i.e. a marshalling result that
   * does not take part in content type negotiation. The given charset is used if this
   * instance is a `WithOpenCharset` marshalling.
   */
  def toOpaque(charset: HttpCharset): Marshalling[A]
}

object Marshalling {

  /**
   * A Marshalling to a specific [[akka.http.scaladsl.model.ContentType]].
   */
  final case class WithFixedContentType[A](
    contentType: ContentType,
    marshal:     () => A) extends Marshalling[A] {
    def map[B](f: A => B): WithFixedContentType[B] = copy(marshal = () => f(marshal()))
    def toOpaque(charset: HttpCharset): Marshalling[A] = Opaque(marshal)
  }

  /**
   * A Marshalling to a specific [[akka.http.scaladsl.model.MediaType]] with a flexible charset.
   */
  final case class WithOpenCharset[A](
    mediaType: MediaType.WithOpenCharset,
    marshal:   HttpCharset => A) extends Marshalling[A] {
    def map[B](f: A => B): WithOpenCharset[B] = copy(marshal = cs => f(marshal(cs)))
    def toOpaque(charset: HttpCharset): Marshalling[A] = Opaque(() => marshal(charset))
  }

  /**
   * A Marshalling to an unknown MediaType and charset.
   * Circumvents content negotiation.
   */
  final case class Opaque[A](marshal: () => A) extends Marshalling[A] {
    def map[B](f: A => B): Opaque[B] = copy(marshal = () => f(marshal()))
    def toOpaque(charset: HttpCharset): Marshalling[A] = this
  }
}
```

Akka HTTP also defines a number of helpful aliases for the types of marshallers that you’ll likely work with most:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/package.scala#L13-L17 "Go to snippet source")type ToEntityMarshaller[T] = Marshaller[T, MessageEntity]
type ToByteStringMarshaller[T] = Marshaller[T, ByteString]
type ToHeadersAndEntityMarshaller[T] = Marshaller[T, (immutable.Seq[HttpHeader], MessageEntity)]
type ToResponseMarshaller[T] = Marshaller[T, HttpResponse]
type ToRequestMarshaller[T] = Marshaller[T, HttpRequest]
```

## Predefined Marshallers

Akka HTTP already predefines a number of marshallers for the most common types. Specifically these are:

- [`PredefinedToEntityMarshallers`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html "akka.http.scaladsl.marshalling.PredefinedToEntityMarshallers")
	- `Array[Byte]`
	- [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")
	- `Array[Char]`
	- `String`
	- `akka.http.scaladsl.model.FormData`
	- `akka.http.scaladsl.model.MessageEntity`
	- `T <: akka.http.scaladsl.model.Multipart`
- [`PredefinedToResponseMarshallers`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html "akka.http.scaladsl.marshalling.PredefinedToResponseMarshallers")
	- `T`, if a `ToEntityMarshaller[T]` is available
	- [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse")
	- [`StatusCode`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html "akka.http.javadsl.model.StatusCode")[`StatusCode`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html "akka.http.scaladsl.model.StatusCode")
	- `(StatusCode, T)`, if a `ToEntityMarshaller[T]` is available
	- `(Int, T)`, if a `ToEntityMarshaller[T]` is available
	- `(StatusCode, immutable.Seq[HttpHeader], T)`, if a `ToEntityMarshaller[T]` is available
	- `(Int, immutable.Seq[HttpHeader], T)`, if a `ToEntityMarshaller[T]` is available
- [`PredefinedToRequestMarshallers`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html "akka.http.scaladsl.marshalling.PredefinedToRequestMarshallers")
	- [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest")
	- [`Uri`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html "akka.http.javadsl.model.Uri")[`Uri`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html "akka.http.scaladsl.model.Uri")
	- `(HttpMethod, Uri, T)`, if a `ToEntityMarshaller[T]` is available
	- `(HttpMethod, Uri, immutable.Seq[HttpHeader], T)`, if a `ToEntityMarshaller[T]` is available
- [`GenericMarshallers`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/GenericMarshallers.html "akka.http.scaladsl.marshalling.GenericMarshallers")
	- [`Marshaller<Throwable, T>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[Throwable, T]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller")
	- [`Marshaller<Option<A>, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[Option[A], B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller"), if a [`Marshaller<A, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[A, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") and an `EmptyValue[B]` is available
	- [`Marshaller<Either<A1, A2>, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[Either[A1, A2], B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller"), if a [`Marshaller<A1, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[A1, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") and a [`Marshaller<A2, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[A2, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") is available
	- [`Marshaller<Future<A>, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[Future[A], B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller"), if a [`Marshaller<A, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[A, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") is available
	- [`Marshaller<Try<A>, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[Try[A], B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller"), if a [`Marshaller<A, B>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[A, B]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") is available

- Predefined [`RequestEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html "akka.http.javadsl.model.RequestEntity")[`RequestEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html "akka.http.scaladsl.model.RequestEntity") marshallers:
	- `byte[]`
	- [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")
	- `char[]`
	- `String`
	- [`FormData`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/FormData.html "akka.http.javadsl.model.FormData")[`FormData`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/FormData.html "akka.http.scaladsl.model.FormData")
	- `Optional<T>` using an existing [`RequestEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html "akka.http.javadsl.model.RequestEntity")[`RequestEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html "akka.http.scaladsl.model.RequestEntity") marshaller for `T`. An empty optional will yield an empty entity.
- Predefined [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") marshallers:
	- `T` using an existing [`RequestEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html "akka.http.javadsl.model.RequestEntity")[`RequestEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html "akka.http.scaladsl.model.RequestEntity") marshaller for `T`
	- `T` and [`StatusCode`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html "akka.http.javadsl.model.StatusCode")[`StatusCode`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html "akka.http.scaladsl.model.StatusCode") using an existing [`RequestEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html "akka.http.javadsl.model.RequestEntity")[`RequestEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html "akka.http.scaladsl.model.RequestEntity") marshaller for `T`
	- `T`, [`StatusCode`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html "akka.http.javadsl.model.StatusCode")[`StatusCode`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html "akka.http.scaladsl.model.StatusCode") and `Iterable[HttpHeader]` using an existing [`RequestEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html "akka.http.javadsl.model.RequestEntity")[`RequestEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html "akka.http.scaladsl.model.RequestEntity") marshaller for `T`

All marshallers can be found in [`Marshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller").

## Implicit Resolution

The marshalling infrastructure of Akka HTTP relies on a type\-class based approach, which means that [`Marshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") instances from a certain type `A` to a certain type `B` have to be available implicitly.

The implicits for most of the predefined marshallers in Akka HTTP are provided through the companion object of the [`Marshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") trait. This means that they are always available and never need to be explicitly imported. Additionally, you can simply “override” them by bringing your own custom version into local scope.

## Custom Marshallers

Akka HTTP gives you a few convenience tools for constructing marshallers for your own types. Before you do that you need to think about what kind of marshaller you want to create. If all your marshaller needs to produce is a `MessageEntity` then you should probably provide a `ToEntityMarshaller[T]`[`Marshaller<T, MessageEntity>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[T, MessageEntity]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller"). The advantage here is that it will work on both the client\- as well as the server\-side since a `ToResponseMarshaller[T]`[`Marshaller<T, HttpResponse>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[T, HttpResponse]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") as well as a `ToRequestMarshaller[T]`[`Marshaller<T, HttpRequest>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[T, HttpRequest]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") can automatically be created if a `ToEntityMarshaller[T]`[`Marshaller<T, MessageEntity>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[T, MessageEntity]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") is available.

If, however, your marshaller also needs to set things like the response status code, the request method, the request URI or any headers then a `ToEntityMarshaller[T]`[`Marshaller<T, MessageEntity>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[T, MessageEntity]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") won’t work. You’ll need to fall down to providing a `ToResponseMarshaller[T]`[`Marshaller<T, HttpResponse>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[T, HttpResponse]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") or a `ToRequestMarshaller[T]]`[`Marshaller<T, HttpRequest>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[T, HttpRequest]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") directly.

For writing your own marshallers you won’t have to “manually” implement the [`Marshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") traitclass directly.

Rather, it should be possible to use one of the convenience construction helpers defined on the [`Marshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") companion:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/Marshaller.scala#L78-L168 "Go to snippet source")object Marshaller
  extends GenericMarshallers
  with PredefinedToEntityMarshallers
  with PredefinedToResponseMarshallers
  with PredefinedToRequestMarshallers {

  /**
   * Creates a [[Marshaller]] from the given function.
   */
  def apply[A, B](f: ExecutionContext => A => Future[List[Marshalling[B]]]): Marshaller[A, B] =
    new Marshaller[A, B] {
      def apply(value: A)(implicit ec: ExecutionContext) =
        try f(ec)(value)
        catch { case NonFatal(e) => FastFuture.failed(e) }
    }

  /**
   * Helper for creating a [[Marshaller]] using the given function.
   */
  def strict[A, B](f: A => Marshalling[B]): Marshaller[A, B] =
    Marshaller { _ => a => FastFuture.successful(f(a) :: Nil) }

  /**
   * Helper for creating a "super-marshaller" from a number of "sub-marshallers".
   * Content-negotiation determines, which "sub-marshaller" eventually gets to do the job.
   *
   * Please note that all marshallers will actually be invoked in order to get the Marshalling object
   * out of them, and later decide which of the marshallings should be returned. This is by-design,
   * however in ticket as discussed in ticket https://github.com/akka/akka-http/issues/243 it MAY be
   * changed in later versions of Akka HTTP.
   */
  def oneOf[A, B](marshallers: Marshaller[A, B]*): Marshaller[A, B] =
    Marshaller { implicit ec => a => FastFuture.sequence(marshallers.map(_(a))).fast.map(_.flatten.toList) }

  /**
   * Helper for creating a "super-marshaller" from a number of values and a function producing "sub-marshallers"
   * from these values. Content-negotiation determines, which "sub-marshaller" eventually gets to do the job.
   *
   * Please note that all marshallers will actually be invoked in order to get the Marshalling object
   * out of them, and later decide which of the marshallings should be returned. This is by-design,
   * however in ticket as discussed in ticket https://github.com/akka/akka-http/issues/243 it MAY be
   * changed in later versions of Akka HTTP.
   */
  def oneOf[T, A, B](values: T*)(f: T => Marshaller[A, B]): Marshaller[A, B] =
    oneOf(values map f: _*)

  /**
   * Helper for creating a synchronous [[Marshaller]] to content with a fixed charset from the given function.
   */
  def withFixedContentType[A, B](contentType: ContentType)(marshal: A => B): Marshaller[A, B] =
    new Marshaller[A, B] {
      def apply(value: A)(implicit ec: ExecutionContext) =
        try FastFuture.successful {
          Marshalling.WithFixedContentType(contentType, () => marshal(value)) :: Nil
        } catch {
          case NonFatal(e) => FastFuture.failed(e)
        }

      override def compose[C](f: C => A): Marshaller[C, B] =
        Marshaller.withFixedContentType(contentType)(marshal compose f)
    }

  /**
   * Helper for creating a synchronous [[Marshaller]] to content with a negotiable charset from the given function.
   */
  def withOpenCharset[A, B](mediaType: MediaType.WithOpenCharset)(marshal: (A, HttpCharset) => B): Marshaller[A, B] =
    new Marshaller[A, B] {
      def apply(value: A)(implicit ec: ExecutionContext) =
        try FastFuture.successful {
          Marshalling.WithOpenCharset(mediaType, charset => marshal(value, charset)) :: Nil
        } catch {
          case NonFatal(e) => FastFuture.failed(e)
        }

      override def compose[C](f: C => A): Marshaller[C, B] =
        Marshaller.withOpenCharset(mediaType)((c: C, hc: HttpCharset) => marshal(f(c), hc))
    }

  /**
   * Helper for creating a synchronous [[Marshaller]] to non-negotiable content from the given function.
   */
  def opaque[A, B](marshal: A => B): Marshaller[A, B] =
    strict { value => Marshalling.Opaque(() => marshal(value)) }

  /**
   * Helper for creating a [[Marshaller]] combined of the provided `marshal` function
   * and an implicit Marshaller which is able to produce the required final type.
   */
  def combined[A, B, C](marshal: A => B)(implicit m2: Marshaller[B, C]): Marshaller[A, C] =
    Marshaller[A, C] { ec => a => m2.compose(marshal).apply(a)(ec) }
}
```

## Deriving Marshallers

Sometimes you can save yourself some work by reusing existing marshallers for your custom ones. The idea is to “wrap” an existing marshaller with some logic to “re\-target” it to your type.

In this regard wrapping a marshaller can mean one or both of the following two things:

- Transform the input before it reaches the wrapped marshaller
- Transform the output of the wrapped marshaller

For the latter (transforming the output) you can use `baseMarshaller.map`, which works exactly as it does for functions. For the former (transforming the input) you have four alternatives:

- `baseMarshaller.compose`
- `baseMarshaller.composeWithEC`
- `baseMarshaller.wrap`
- `baseMarshaller.wrapWithEC`

`compose` works just like it does for functions. `wrap` is a compose that allows you to also change the `ContentType` that the marshaller marshals to. The `...WithEC` variants allow you to receive an `ExecutionContext` internally if you need one, without having to depend on one being available implicitly at the usage site.

## Using Marshallers

In many places throughout Akka HTTP, marshallers are used implicitly, e.g. when you define how to [complete](../routing-dsl/directives/route-directives/complete.html) a request using the [Routing DSL](../routing-dsl/index.html).

However, you can also use the marshalling infrastructure directly if you wish, which can be useful for example in tests. The best entry point for this is the [`Marshal`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshal.html "akka.http.scaladsl.marshalling.Marshal") object, which you can use like this:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/MarshalSpec.scala#L13-L36 "Go to snippet source")import scala.concurrent.Await
import scala.concurrent.duration._
import akka.http.scaladsl.marshalling.Marshal
import akka.http.scaladsl.model._

import system.dispatcher // ExecutionContext

val string = "Yeah"
val entityFuture = Marshal(string).to[MessageEntity]
val entity = Await.result(entityFuture, 1.second) // don't block in non-test code!
entity.contentType shouldEqual ContentTypes.`text/plain(UTF-8)`

val errorMsg = "Easy, pal!"
val responseFuture = Marshal(420 -> errorMsg).to[HttpResponse]
val response = Await.result(responseFuture, 1.second) // don't block in non-test code!
response.status shouldEqual StatusCodes.EnhanceYourCalm
response.entity.contentType shouldEqual ContentTypes.`text/plain(UTF-8)`

val request = HttpRequest(headers = List(headers.Accept(MediaTypes.`application/json`)))
val responseText = "Plaintext"
val respFuture = Marshal(responseText).toResponseFor(request) // with content negotiation!
a[Marshal.UnacceptableResponseContentTypeException] should be thrownBy {
  Await.result(respFuture, 1.second) // client requested JSON, we only have text/plain!
}
```

However, many directives dealing with [marshalling](../routing-dsl/directives/marshalling-directives/index.html) also require that you pass a marshaller explicitly. The following example shows how to marshal Java bean classes to JSON using the [Jackson JSON support](json-support.html#jackson-support):

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/main/java/akka/http/javadsl/server/examples/petstore/PetStoreExample.java#L11-L27 "Go to snippet source")import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.StatusCodes;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import static akka.http.javadsl.server.Directives.*;
import static akka.http.javadsl.unmarshalling.StringUnmarshallers.INTEGER;

private static Route putPetHandler(Map<Integer, Pet> pets, Pet thePet) {
    pets.put(thePet.getId(), thePet);
    return complete(StatusCodes.OK, thePet, Jackson.<Pet>marshaller());
}

private static Route alternativeFuturePutPetHandler(Map<Integer, Pet> pets, Pet thePet) {
    pets.put(thePet.getId(), thePet);
  CompletableFuture<Pet> futurePet = CompletableFuture.supplyAsync(() -> thePet);
    return completeOKWithFuture(futurePet, Jackson.<Pet>marshaller());
}
```

## Code Examples

### Example 1: Basic Design

```scala
/**
 * Describes one possible option for marshalling a given value.
 */
sealed trait Marshalling[+A] {
  def map[B](f: A => B): Marshalling[B]

  /**
   * Converts this marshalling to an opaque marshalling, i.e. a marshalling result that
   * does not take part in content type negotiation. The given charset is used if this
   * instance is a `WithOpenCharset` marshalling.
   */
  def toOpaque(charset: HttpCharset): Marshalling[A]
}

object Marshalling {

  /**
   * A Marshalling to a specific [[akka.http.scaladsl.model.ContentType]].
   */
  final case class WithFixedContentType[A](
    contentType: ContentType,
    marshal:     () => A) extends Marshalling[A] {
    def map[B](f: A => B): WithFixedContentType[B] = copy(marshal = () => f(marshal()))
    def toOpaque(charset: HttpCharset): Marshalling[A] = Opaque(marshal)
  }

  /**
   * A Marshalling to a specific [[akka.http.scaladsl.model.MediaType]] with a flexible charset.
   */
  final case class WithOpenCharset[A](
    mediaType: MediaType.WithOpenCharset,
    marshal:   HttpCharset => A) extends Marshalling[A] {
    def map[B](f: A => B): WithOpenCharset[B] = copy(marshal = cs => f(marshal(cs)))
    def toOpaque(charset: HttpCharset): Marshalling[A] = Opaque(() => marshal(charset))
  }

  /**
   * A Marshalling to an unknown MediaType and charset.
   * Circumvents content negotiation.
   */
  final case class Opaque[A](marshal: () => A) extends Marshalling[A] {
    def map[B](f: A => B): Opaque[B] = copy(marshal = () => f(marshal()))
    def toOpaque(charset: HttpCharset): Marshalling[A] = this
  }
}
```

### Example 2: Basic Design

```scala
type ToEntityMarshaller[T] = Marshaller[T, MessageEntity]
type ToByteStringMarshaller[T] = Marshaller[T, ByteString]
type ToHeadersAndEntityMarshaller[T] = Marshaller[T, (immutable.Seq[HttpHeader], MessageEntity)]
type ToResponseMarshaller[T] = Marshaller[T, HttpResponse]
type ToRequestMarshaller[T] = Marshaller[T, HttpRequest]
```

### Example 3: Custom Marshallers

```scala
object Marshaller
  extends GenericMarshallers
  with PredefinedToEntityMarshallers
  with PredefinedToResponseMarshallers
  with PredefinedToRequestMarshallers {

  /**
   * Creates a [[Marshaller]] from the given function.
   */
  def apply[A, B](f: ExecutionContext => A => Future[List[Marshalling[B]]]): Marshaller[A, B] =
    new Marshaller[A, B] {
      def apply(value: A)(implicit ec: ExecutionContext) =
        try f(ec)(value)
        catch { case NonFatal(e) => FastFuture.failed(e) }
    }

  /**
   * Helper for creating a [[Marshaller]] using the given function.
   */
  def strict[A, B](f: A => Marshalling[B]): Marshaller[A, B] =
    Marshaller { _ => a => FastFuture.successful(f(a) :: Nil) }

  /**
   * Helper for creating a "super-marshaller" from a number of "sub-marshallers".
   * Content-negotiation determines, which "sub-marshaller" eventually gets to do the job.
   *
   * Please note that all marshallers will actually be invoked in order to get the Marshalling object
   * out of them, and later decide which of the marshallings should be returned. This is by-design,
   * however in ticket as discussed in ticket https://github.com/akka/akka-http/issues/243 it MAY be
   * changed in later versions of Akka HTTP.
   */
  def oneOf[A, B](marshallers: Marshaller[A, B]*): Marshaller[A, B] =
    Marshaller { implicit ec => a => FastFuture.sequence(marshallers.map(_(a))).fast.map(_.flatten.toList) }

  /**
   * Helper for creating a "super-marshaller" from a number of values and a function producing "sub-marshallers"
   * from these values. Content-negotiation determines, which "sub-marshaller" eventually gets to do the job.
   *
   * Please note that all marshallers will actually be invoked in order to get the Marshalling object
   * out of them, and later decide which of the marshallings should be returned. This is by-design,
   * however in ticket as discussed in ticket https://github.com/akka/akka-http/issues/243 it MAY be
   * changed in later versions of Akka HTTP.
   */
  def oneOf[T, A, B](values: T*)(f: T => Marshaller[A, B]): Marshaller[A, B] =
    oneOf(values map f: _*)

  /**
   * Helper for creating a synchronous [[Marshaller]] to content with a fixed charset from the given function.
   */
  def withFixedContentType[A, B](contentType: ContentType)(marshal: A => B): Marshaller[A, B] =
    new Marshaller[A, B] {
      def apply(value: A)(implicit ec: ExecutionContext) =
        try FastFuture.successful {
          Marshalling.WithFixedContentType(contentType, () => marshal(value)) :: Nil
        } catch {
          case NonFatal(e) => FastFuture.failed(e)
        }

      override def compose[C](f: C => A): Marshaller[C, B] =
        Marshaller.withFixedContentType(contentType)(marshal compose f)
    }

  /**
   * Helper for creating a synchronous [[Marshaller]] to content with a negotiable charset from the given function.
   */
  def withOpenCharset[A, B](mediaType: MediaType.WithOpenCharset)(marshal: (A, HttpCharset) => B): Marshaller[A, B] =
    new Marshaller[A, B] {
      def apply(value: A)(implicit ec: ExecutionContext) =
        try FastFuture.successful {
          Marshalling.WithOpenCharset(mediaType, charset => marshal(value, charset)) :: Nil
        } catch {
          case NonFatal(e) => FastFuture.failed(e)
        }

      override def compose[C](f: C => A): Marshaller[C, B] =
        Marshaller.withOpenCharset(mediaType)((c: C, hc: HttpCharset) => marshal(f(c), hc))
    }

  /**
   * Helper for creating a synchronous [[Marshaller]] to non-negotiable content from the given function.
   */
  def opaque[A, B](marshal: A => B): Marshaller[A, B] =
    strict { value => Marshalling.Opaque(() => marshal(value)) }

  /**
   * Helper for creating a [[Marshaller]] combined of the provided `marshal` function
   * and an implicit Marshaller which is able to produce the required final type.
   */
  def combined[A, B, C](marshal: A => B)(implicit m2: Marshaller[B, C]): Marshaller[A, C] =
    Marshaller[A, C] { ec => a => m2.compose(marshal).apply(a)(ec) }
}
```

### Example 4: Using Marshallers

```scala
import scala.concurrent.Await
import scala.concurrent.duration._
import akka.http.scaladsl.marshalling.Marshal
import akka.http.scaladsl.model._

import system.dispatcher // ExecutionContext

val string = "Yeah"
val entityFuture = Marshal(string).to[MessageEntity]
val entity = Await.result(entityFuture, 1.second) // don't block in non-test code!
entity.contentType shouldEqual ContentTypes.`text/plain(UTF-8)`

val errorMsg = "Easy, pal!"
val responseFuture = Marshal(420 -> errorMsg).to[HttpResponse]
val response = Await.result(responseFuture, 1.second) // don't block in non-test code!
response.status shouldEqual StatusCodes.EnhanceYourCalm
response.entity.contentType shouldEqual ContentTypes.`text/plain(UTF-8)`

val request = HttpRequest(headers = List(headers.Accept(MediaTypes.`application/json`)))
val responseText = "Plaintext"
val respFuture = Marshal(responseText).toResponseFor(request) // with content negotiation!
a[Marshal.UnacceptableResponseContentTypeException] should be thrownBy {
  Await.result(respFuture, 1.second) // client requested JSON, we only have text/plain!
}
```

### Example 5: Using Marshallers

```java
import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.StatusCodes;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import static akka.http.javadsl.server.Directives.*;
import static akka.http.javadsl.unmarshalling.StringUnmarshallers.INTEGER;

private static Route putPetHandler(Map<Integer, Pet> pets, Pet thePet) {
    pets.put(thePet.getId(), thePet);
    return complete(StatusCodes.OK, thePet, Jackson.<Pet>marshaller());
}

private static Route alternativeFuturePutPetHandler(Map<Integer, Pet> pets, Pet thePet) {
    pets.put(thePet.getId(), thePet);
  CompletableFuture<Pet> futurePet = CompletableFuture.supplyAsync(() -> thePet);
    return completeOKWithFuture(futurePet, Jackson.<Pet>marshaller());
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/GenericMarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshal.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Accept.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Accept.html
- https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-http/current/common/json-support.html
- https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html
- https://doc.akka.io/libraries/akka-http/current/common/uri-model.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/complete.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/common/marshalling.html](https://doc.akka.io/libraries/akka-http/current/common/marshalling.html)*