---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html
title: Marshaller
---

# Marshaller

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Class Marshaller\<A,​B\>

- java.lang.Object
- - akka.http.scaladsl.marshalling.Marshaller\<A,​B\>

- ---

```
public abstract class Marshaller<A,​B>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Marshaller](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected abstract static void` | `[akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$ByteArrayMarshaller_$eq](#akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$ByteArrayMarshaller_$eq(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$ByteStringMarshaller_$eq](#akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$ByteStringMarshaller_$eq(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$CharArrayMarshaller_$eq](#akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$CharArrayMarshaller_$eq(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$DoneMarshaller_$eq](#akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$DoneMarshaller_$eq(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.Done,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$FormDataMarshaller_$eq](#akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$FormDataMarshaller_$eq(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[FormData](../model/FormData.html "class in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$MessageEntityMarshaller_$eq](#akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$MessageEntityMarshaller_$eq(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$StringMarshaller_$eq](#akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$StringMarshaller_$eq(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$marshalling$PredefinedToRequestMarshallers$_setter_$fromRequest_$eq](#akka$http$scaladsl$marshalling$PredefinedToRequestMarshallers$_setter_$fromRequest_$eq(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$_setter_$fromResponse_$eq](#akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$_setter_$fromResponse_$eq(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$_setter_$fromStatusCode_$eq](#akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$_setter_$fromStatusCode_$eq(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> x$1)` |  |
	| `protected abstract static void` | `[akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$_setter_$fromStatusCodeAndHeaders_$eq](#akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$_setter_$fromStatusCodeAndHeaders_$eq(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> x$1)` |  |
	| `abstract scala.concurrent.Future<scala.collection.immutable.List<[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<[B](Marshaller.html "type parameter in Marshaller")>>>` | `[apply](#apply(A,scala.concurrent.ExecutionContext))​([A](Marshaller.html "type parameter in Marshaller") value,  scala.concurrent.ExecutionContext ec)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[byteArrayMarshaller](#byteArrayMarshaller(akka.http.scaladsl.model.ContentType))​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[ByteArrayMarshaller](#ByteArrayMarshaller())()` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[byteStringMarshaller](#byteStringMarshaller(akka.http.scaladsl.model.ContentType))​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[ByteStringMarshaller](#ByteStringMarshaller())()` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[charArrayMarshaller](#charArrayMarshaller(akka.http.scaladsl.model.MediaType.WithFixedCharset))​([MediaType.WithFixedCharset](../model/MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[charArrayMarshaller](#charArrayMarshaller(akka.http.scaladsl.model.MediaType.WithOpenCharset))​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[CharArrayMarshaller](#CharArrayMarshaller())()` |  |
	| `static <A,​B,​C>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​C>` | `[combined](#combined(scala.Function1,akka.http.scaladsl.marshalling.Marshaller))​(scala.Function1<A,​B> marshal,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<B,​C> m2)` | Helper for creating a [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") combined of the provided `marshal` function  and an implicit Marshaller which is able to produce the required final type. |
	| `<C> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<C,​[B](Marshaller.html "type parameter in Marshaller")>` | `[compose](#compose(scala.Function1))​(scala.Function1<C,​[A](Marshaller.html "type parameter in Marshaller")> f)` |  |
	| `<C> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<C,​[B](Marshaller.html "type parameter in Marshaller")>` | `[composeWithEC](#composeWithEC(scala.Function1))​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<C,​[A](Marshaller.html "type parameter in Marshaller")>> f)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.Done,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[DoneMarshaller](#DoneMarshaller())()` |  |
	| `static <A1,​A2,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.util.Either<A1,​A2>,​B>` | `[eitherMarshaller](#eitherMarshaller(akka.http.scaladsl.marshalling.Marshaller,akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A1,​B> m1,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A2,​B> m2)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[FormData](../model/FormData.html "class in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[FormDataMarshaller](#FormDataMarshaller())()` |  |
	| `static <T,​M>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<T,​M>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromEntityStreamingSupportAndByteStringMarshaller](#fromEntityStreamingSupportAndByteStringMarshaller(scala.reflect.ClassTag,akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller))​(scala.reflect.ClassTag<T> evidence$1,  [EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") s,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​akka.util.ByteString> m)` |  |
	| `static <T,​M>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<T,​M>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromEntityStreamingSupportAndByteStringSourceMarshaller](#fromEntityStreamingSupportAndByteStringSourceMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag))​([EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") s,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​akka.stream.scaladsl.Source<akka.util.ByteString,​?>> m,  scala.reflect.ClassTag<T> evidence$2)` |  |
	| `static <T,​M>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<T,​M>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromEntityStreamingSupportAndEntityMarshaller](#fromEntityStreamingSupportAndEntityMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag))​([EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") s,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m,  scala.reflect.ClassTag<T> tag)` |  |
	| `static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple4<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model"),​[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[fromMethodAndUriAndHeadersAndValue](#fromMethodAndUriAndHeadersAndValue(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)` |  |
	| `static <S,​T>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model"),​[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​T>,​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[fromMethodAndUriAndValue](#fromMethodAndUriAndValue(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[fromRequest](#fromRequest())()` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromResponse](#fromResponse())()` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCode](#fromStatusCode())()` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCodeAndHeaders](#fromStatusCodeAndHeaders())()` |  |
	| `static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCodeAndHeadersAndValue](#fromStatusCodeAndHeadersAndValue(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)` |  |
	| `static <S,​T>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<S,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCodeAndValue](#fromStatusCodeAndValue(scala.Function1,akka.http.scaladsl.marshalling.Marshaller))​(scala.Function1<S,​[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")> sConv,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)` |  |
	| `static <S,​T>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<S,​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCodeConvertibleAndHeadersAndT](#fromStatusCodeConvertibleAndHeadersAndT(scala.Function1,akka.http.scaladsl.marshalling.Marshaller))​(scala.Function1<S,​[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")> sConv,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)` |  |
	| `static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromToEntityMarshaller](#fromToEntityMarshaller(akka.http.scaladsl.model.StatusCode,scala.collection.immutable.Seq,akka.http.scaladsl.marshalling.Marshaller))​([StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model") status,  scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)` |  |
	| `static <T> [StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")` | `[fromToEntityMarshaller$default$1](#fromToEntityMarshaller$default$1())()` |  |
	| `static <T> scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>` | `[fromToEntityMarshaller$default$2](#fromToEntityMarshaller$default$2())()` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[fromUri](#fromUri())()` |  |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.concurrent.Future<A>,​B>` | `[futureMarshaller](#futureMarshaller(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m)` |  |
	| `static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[liftMarshaller](#liftMarshaller(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)` |  |
	| `static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[liftMarshallerConversion](#liftMarshallerConversion(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)` |  |
	| `<C> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[A](Marshaller.html "type parameter in Marshaller"),​C>` | `[map](#map(scala.Function1))​(scala.Function1<[B](Marshaller.html "type parameter in Marshaller"),​C> f)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[MessageEntityMarshaller](#MessageEntityMarshaller())()` |  |
	| `protected static int` | `[multipartBoundaryLength](#multipartBoundaryLength())()` |  |
	| `protected static java.util.Random` | `[multipartBoundaryRandom](#multipartBoundaryRandom())()` |  |
	| `static <T extends [Multipart](../model/Multipart.html "interface in akka.http.scaladsl.model")>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[multipartMarshaller](#multipartMarshaller(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter log)` |  |
	| `static <T extends [Multipart](../model/Multipart.html "interface in akka.http.scaladsl.model")>akka.event.LoggingAdapter` | `[multipartMarshaller$default$1](#multipartMarshaller$default$1())()` |  |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[oneOf](#oneOf(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>> marshallers)` | Helper for creating a "super\-marshaller" from a number of "sub\-marshallers". |
	| `static <T,​A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[oneOf](#oneOf(scala.collection.immutable.Seq,scala.Function1))​(scala.collection.immutable.Seq<T> values,  scala.Function1<T,​[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>> f)` | Helper for creating a "super\-marshaller" from a number of values and a function producing "sub\-marshallers"  from these values. |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[opaque](#opaque(scala.Function1))​(scala.Function1<A,​B> marshal)` | Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") to non\-negotiable content from the given function. |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Option<A>,​B>` | `[optionMarshaller](#optionMarshaller(akka.http.scaladsl.marshalling.Marshaller,akka.http.scaladsl.marshalling.EmptyValue))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m,  [EmptyValue](EmptyValue.html "class in akka.http.scaladsl.marshalling")<B> empty)` |  |
	| `protected static java.lang.String` | `[randomBoundary](#randomBoundary())()` |  |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[strict](#strict(scala.Function1))​(scala.Function1<A,​[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<B>> f)` | Helper for creating a [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") using the given function. |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[stringMarshaller](#stringMarshaller(akka.http.scaladsl.model.MediaType.WithFixedCharset))​([MediaType.WithFixedCharset](../model/MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[stringMarshaller](#stringMarshaller(akka.http.scaladsl.model.MediaType.WithOpenCharset))​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[StringMarshaller](#StringMarshaller())()` |  |
	| `static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.Throwable,​T>` | `[throwableMarshaller](#throwableMarshaller())()` |  |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.util.Try<A>,​B>` | `[tryMarshaller](#tryMarshaller(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m)` |  |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[withFixedContentType](#withFixedContentType(akka.http.scaladsl.model.ContentType,scala.Function1))​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType,  scala.Function1<A,​B> marshal)` | Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") to content with a fixed charset from the given function. |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[withOpenCharset](#withOpenCharset(akka.http.scaladsl.model.MediaType.WithOpenCharset,scala.Function2))​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType,  scala.Function2<A,​[HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model"),​B> marshal)` | Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") to content with a negotiable charset from the given function. |
	| `<C,​D>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<C,​D>` | `[wrap](#wrap(akka.http.scaladsl.model.MediaType,scala.Function1,akka.http.scaladsl.marshalling.ContentTypeOverrider))​([MediaType](../model/MediaType.html "class in akka.http.scaladsl.model") newMediaType,  scala.Function1<C,​[A](Marshaller.html "type parameter in Marshaller")> f,  [ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<D> mto)` | Reuses this Marshaller's logic to produce a new Marshaller from another type `C` which overrides  the [`MediaType`](../model/MediaType.html "class in akka.http.scaladsl.model") of the marshalling result with the given one. |
	| `<C,​D>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<C,​D>` | `[wrapWithEC](#wrapWithEC(akka.http.scaladsl.model.MediaType,scala.Function1,akka.http.scaladsl.marshalling.ContentTypeOverrider))​([MediaType](../model/MediaType.html "class in akka.http.scaladsl.model") newMediaType,  scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<C,​[A](Marshaller.html "type parameter in Marshaller")>> f,  [ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<D> cto)` | Reuses this Marshaller's logic to produce a new Marshaller from another type `C` which overrides  the [`MediaType`](../model/MediaType.html "class in akka.http.scaladsl.model") of the marshalling result with the given one. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Marshaller
		
		
		
		```
		public Marshaller()
		```

	- ### Method Detail
	
	
	
		- #### fromRequest
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> fromRequest()
		```
		- #### fromResponse
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromResponse()
		```
		- #### fromStatusCode
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCode()
		```
		- #### fromStatusCodeAndHeaders
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCodeAndHeaders()
		```
		- #### ByteArrayMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> ByteArrayMarshaller()
		```
		- #### ByteStringMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> ByteStringMarshaller()
		```
		- #### CharArrayMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> CharArrayMarshaller()
		```
		- #### DoneMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.Done,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> DoneMarshaller()
		```
		- #### StringMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> StringMarshaller()
		```
		- #### FormDataMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[FormData](../model/FormData.html "class in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> FormDataMarshaller()
		```
		- #### MessageEntityMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> MessageEntityMarshaller()
		```
		- #### strict
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> strict​(scala.Function1<A,​[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<B>> f)
		```
		
		Helper for creating a [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") using the given function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### oneOf
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> oneOf​(scala.collection.immutable.Seq<[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>> marshallers)
		```
		
		Helper for creating a "super\-marshaller" from a number of "sub\-marshallers".
		 Content\-negotiation determines, which "sub\-marshaller" eventually gets to do the job.
		 
		 Please note that all marshallers will actually be invoked in order to get the Marshalling object
		 out of them, and later decide which of the marshallings should be returned. This is by\-design,
		 however in ticket as discussed in ticket https://github.com/akka/akka\-http/issues/243 it MAY be
		 changed in later versions of Akka HTTP.
		
		
		
		Parameters:
		`marshallers` \- (undocumented)
		Returns:
		(undocumented)
		- #### oneOf
		
		
		
		```
		public static <T,​A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> oneOf​(scala.collection.immutable.Seq<T> values,
		                                                              scala.Function1<T,​[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>> f)
		```
		
		Helper for creating a "super\-marshaller" from a number of values and a function producing "sub\-marshallers"
		 from these values. Content\-negotiation determines, which "sub\-marshaller" eventually gets to do the job.
		 
		 Please note that all marshallers will actually be invoked in order to get the Marshalling object
		 out of them, and later decide which of the marshallings should be returned. This is by\-design,
		 however in ticket as discussed in ticket https://github.com/akka/akka\-http/issues/243 it MAY be
		 changed in later versions of Akka HTTP.
		
		
		
		Parameters:
		`values` \- (undocumented)
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### withFixedContentType
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> withFixedContentType​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType,
		                                                                     scala.Function1<A,​B> marshal)
		```
		
		Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") to content with a fixed charset from the given function.
		
		Parameters:
		`contentType` \- (undocumented)
		`marshal` \- (undocumented)
		Returns:
		(undocumented)
		- #### withOpenCharset
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> withOpenCharset​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType,
		                                                                scala.Function2<A,​[HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model"),​B> marshal)
		```
		
		Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") to content with a negotiable charset from the given function.
		
		Parameters:
		`mediaType` \- (undocumented)
		`marshal` \- (undocumented)
		Returns:
		(undocumented)
		- #### opaque
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> opaque​(scala.Function1<A,​B> marshal)
		```
		
		Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") to non\-negotiable content from the given function.
		
		Parameters:
		`marshal` \- (undocumented)
		Returns:
		(undocumented)
		- #### combined
		
		
		
		```
		public static <A,​B,​C> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​C> combined​(scala.Function1<A,​B> marshal,
		                                                                 [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<B,​C> m2)
		```
		
		Helper for creating a [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") combined of the provided `marshal` function
		 and an implicit Marshaller which is able to produce the required final type.
		
		Parameters:
		`marshal` \- (undocumented)
		`m2` \- (undocumented)
		Returns:
		(undocumented)
		- #### liftMarshallerConversion
		
		
		
		```
		public static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> liftMarshallerConversion​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)
		```
		- #### liftMarshaller
		
		
		
		```
		public static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> liftMarshaller​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)
		```
		- #### fromEntityStreamingSupportAndEntityMarshaller
		
		
		
		```
		public static <T,​M> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<T,​M>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromEntityStreamingSupportAndEntityMarshaller​([EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") s,
		                                                                                                                                              [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m,
		                                                                                                                                              scala.reflect.ClassTag<T> tag)
		```
		- #### fromEntityStreamingSupportAndByteStringSourceMarshaller
		
		
		
		```
		public static <T,​M> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<T,​M>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromEntityStreamingSupportAndByteStringSourceMarshaller​([EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") s,
		                                                                                                                                                        [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​akka.stream.scaladsl.Source<akka.util.ByteString,​?>> m,
		                                                                                                                                                        scala.reflect.ClassTag<T> evidence$2)
		```
		- #### throwableMarshaller
		
		
		
		```
		public static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.Throwable,​T> throwableMarshaller()
		```
		- #### optionMarshaller
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Option<A>,​B> optionMarshaller​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m,
		                                                                               [EmptyValue](EmptyValue.html "class in akka.http.scaladsl.marshalling")<B> empty)
		```
		- #### eitherMarshaller
		
		
		
		```
		public static <A1,​A2,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.util.Either<A1,​A2>,​B> eitherMarshaller​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A1,​B> m1,
		                                                                                                        [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A2,​B> m2)
		```
		- #### futureMarshaller
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.concurrent.Future<A>,​B> futureMarshaller​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m)
		```
		- #### tryMarshaller
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.util.Try<A>,​B> tryMarshaller​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> m)
		```
		- #### multipartMarshaller
		
		
		
		```
		public static <T extends [Multipart](../model/Multipart.html "interface in akka.http.scaladsl.model")> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> multipartMarshaller​(akka.event.LoggingAdapter log)
		```
		- #### multipartMarshaller$default$1
		
		
		
		```
		public static <T extends [Multipart](../model/Multipart.html "interface in akka.http.scaladsl.model")> akka.event.LoggingAdapter multipartMarshaller$default$1()
		```
		- #### multipartBoundaryRandom
		
		
		
		```
		protected static java.util.Random multipartBoundaryRandom()
		```
		- #### multipartBoundaryLength
		
		
		
		```
		protected static int multipartBoundaryLength()
		```
		- #### randomBoundary
		
		
		
		```
		protected static java.lang.String randomBoundary()
		```
		- #### byteArrayMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> byteArrayMarshaller​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```
		- #### byteStringMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> byteStringMarshaller​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```
		- #### charArrayMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> charArrayMarshaller​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### charArrayMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> charArrayMarshaller​([MediaType.WithFixedCharset](../model/MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### stringMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> stringMarshaller​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### stringMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> stringMarshaller​([MediaType.WithFixedCharset](../model/MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$\_setter\_$ByteArrayMarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$ByteArrayMarshaller_$eq​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)
		```
		- #### akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$\_setter\_$ByteStringMarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$ByteStringMarshaller_$eq​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)
		```
		- #### akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$\_setter\_$CharArrayMarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$CharArrayMarshaller_$eq​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)
		```
		- #### akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$\_setter\_$DoneMarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$DoneMarshaller_$eq​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.Done,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)
		```
		- #### akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$\_setter\_$StringMarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$StringMarshaller_$eq​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)
		```
		- #### akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$\_setter\_$FormDataMarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$FormDataMarshaller_$eq​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[FormData](../model/FormData.html "class in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)
		```
		- #### akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$\_setter\_$MessageEntityMarshaller\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$marshalling$PredefinedToEntityMarshallers$_setter_$MessageEntityMarshaller_$eq​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> x$1)
		```
		- #### fromToEntityMarshaller
		
		
		
		```
		public static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromToEntityMarshaller​([StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model") status,
		                                                                          scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                                                                          [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> m)
		```
		- #### fromToEntityMarshaller$default$1
		
		
		
		```
		public static <T> [StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model") fromToEntityMarshaller$default$1()
		```
		- #### fromToEntityMarshaller$default$2
		
		
		
		```
		public static <T> scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> fromToEntityMarshaller$default$2()
		```
		- #### fromStatusCodeAndValue
		
		
		
		```
		public static <S,​T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<S,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCodeAndValue​(scala.Function1<S,​[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")> sConv,
		                                                                                                        [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)
		```
		- #### fromStatusCodeConvertibleAndHeadersAndT
		
		
		
		```
		public static <S,​T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<S,​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCodeConvertibleAndHeadersAndT​(scala.Function1<S,​[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")> sConv,
		                                                                                                                                                                          [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)
		```
		- #### fromStatusCodeAndHeadersAndValue
		
		
		
		```
		public static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCodeAndHeadersAndValue​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)
		```
		- #### fromEntityStreamingSupportAndByteStringMarshaller
		
		
		
		```
		public static <T,​M> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.stream.scaladsl.Source<T,​M>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromEntityStreamingSupportAndByteStringMarshaller​(scala.reflect.ClassTag<T> evidence$1,
		                                                                                                                                                  [EntityStreamingSupport](../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") s,
		                                                                                                                                                  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​akka.util.ByteString> m)
		```
		- #### akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$\_setter\_$fromResponse\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$_setter_$fromResponse_$eq​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> x$1)
		```
		- #### akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$\_setter\_$fromStatusCode\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$_setter_$fromStatusCode_$eq​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> x$1)
		```
		- #### akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$\_setter\_$fromStatusCodeAndHeaders\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$marshalling$PredefinedToResponseMarshallers$_setter_$fromStatusCodeAndHeaders_$eq​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> x$1)
		```
		- #### fromUri
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> fromUri()
		```
		- #### fromMethodAndUriAndValue
		
		
		
		```
		public static <S,​T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple3<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model"),​[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​T>,​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> fromMethodAndUriAndValue​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)
		```
		- #### fromMethodAndUriAndHeadersAndValue
		
		
		
		```
		public static <T> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple4<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model"),​[Uri](../model/Uri.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>,​T>,​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> fromMethodAndUriAndHeadersAndValue​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> mt)
		```
		- #### akka$http$scaladsl$marshalling$PredefinedToRequestMarshallers$\_setter\_$fromRequest\_$eq
		
		
		
		```
		protected abstract static void akka$http$scaladsl$marshalling$PredefinedToRequestMarshallers$_setter_$fromRequest_$eq​([Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> x$1)
		```
		- #### apply
		
		
		
		```
		public abstract scala.concurrent.Future<scala.collection.immutable.List<[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<[B](Marshaller.html "type parameter in Marshaller")>>> apply​([A](Marshaller.html "type parameter in Marshaller") value,
		                                                                                               scala.concurrent.ExecutionContext ec)
		```
		- #### map
		
		
		
		```
		public <C> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[A](Marshaller.html "type parameter in Marshaller"),​C> map​(scala.Function1<[B](Marshaller.html "type parameter in Marshaller"),​C> f)
		```
		- #### wrap
		
		
		
		```
		public <C,​D> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<C,​D> wrap​([MediaType](../model/MediaType.html "class in akka.http.scaladsl.model") newMediaType,
		                                              scala.Function1<C,​[A](Marshaller.html "type parameter in Marshaller")> f,
		                                              [ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<D> mto)
		```
		
		Reuses this Marshaller's logic to produce a new Marshaller from another type `C` which overrides
		 the [`MediaType`](../model/MediaType.html "class in akka.http.scaladsl.model") of the marshalling result with the given one.
		 Note that not all wrappings are legal. f the underlying [`MediaType`](../model/MediaType.html "class in akka.http.scaladsl.model") has constraints with regard to the
		 charsets it allows the new [`MediaType`](../model/MediaType.html "class in akka.http.scaladsl.model") must be compatible, since akka\-http will never recode entities.
		 If the wrapping is illegal the `Future` produced by the resulting marshaller will contain a `RuntimeException`.
		
		Parameters:
		`newMediaType` \- (undocumented)
		`f` \- (undocumented)
		`mto` \- (undocumented)
		Returns:
		(undocumented)
		- #### wrapWithEC
		
		
		
		```
		public <C,​D> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<C,​D> wrapWithEC​([MediaType](../model/MediaType.html "class in akka.http.scaladsl.model") newMediaType,
		                                                    scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<C,​[A](Marshaller.html "type parameter in Marshaller")>> f,
		                                                    [ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")<D> cto)
		```
		
		Reuses this Marshaller's logic to produce a new Marshaller from another type `C` which overrides
		 the [`MediaType`](../model/MediaType.html "class in akka.http.scaladsl.model") of the marshalling result with the given one.
		 Note that not all wrappings are legal. f the underlying [`MediaType`](../model/MediaType.html "class in akka.http.scaladsl.model") has constraints with regard to the
		 charsets it allows the new [`MediaType`](../model/MediaType.html "class in akka.http.scaladsl.model") must be compatible, since akka\-http will never recode entities.
		 If the wrapping is illegal the `Future` produced by the resulting marshaller will contain a `RuntimeException`.
		
		Parameters:
		`newMediaType` \- (undocumented)
		`f` \- (undocumented)
		`cto` \- (undocumented)
		Returns:
		(undocumented)
		- #### compose
		
		
		
		```
		public <C> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<C,​[B](Marshaller.html "type parameter in Marshaller")> compose​(scala.Function1<C,​[A](Marshaller.html "type parameter in Marshaller")> f)
		```
		- #### composeWithEC
		
		
		
		```
		public <C> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<C,​[B](Marshaller.html "type parameter in Marshaller")> composeWithEC​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<C,​[A](Marshaller.html "type parameter in Marshaller")>> f)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/ContentTypeOverrider.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/EmptyValue.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshalling.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html)*