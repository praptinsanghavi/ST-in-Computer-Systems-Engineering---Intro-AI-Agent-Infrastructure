---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html
title: Marshaller
---

# Marshaller

## Content

Package [akka.http.javadsl.marshalling](package-summary.html)
## Class Marshaller\<A,​B\>

- java.lang.Object
- - akka.http.javadsl.marshalling.Marshaller\<A,​B\>

- ---

```
public class Marshaller<A,​B>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Marshaller](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Marshaller](../../scaladsl/marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<[A](Marshaller.html "type parameter in Marshaller"),​[B](Marshaller.html "type parameter in Marshaller")>` | `[asScala](#asScala())()` |  |
	| `<C> [Marshaller](../../scaladsl/marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<[A](Marshaller.html "type parameter in Marshaller"),​C>` | `[asScalaCastOutput](#asScalaCastOutput())()` | INTERNAL API: involves unsafe cast (however is very fast) |
	| `static <T> [Marshaller](../../scaladsl/marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../../scaladsl/model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[asScalaEntityMarshaller](#asScalaEntityMarshaller(akka.http.javadsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m)` |  |
	| `static <T> [Marshaller](../../scaladsl/marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[asScalaToResponseMarshaller](#asScalaToResponseMarshaller(akka.http.javadsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> m)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[byteArrayToEntity](#byteArrayToEntity())()` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[byteStringMarshaller](#byteStringMarshaller(akka.http.javadsl.model.ContentType))​([ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") t)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[byteStringToEntity](#byteStringToEntity())()` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[charArrayToEntity](#charArrayToEntity())()` |  |
	| `<C> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<C,​[B](Marshaller.html "type parameter in Marshaller")>` | `[compose](#compose(java.util.function.Function))​(java.util.function.Function<C,​[A](Marshaller.html "type parameter in Marshaller")> f)` |  |
	| `static <A,​B1,​B2 extends B1>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B1>` | `[downcast](#downcast(akka.http.javadsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B2> m)` | Safe downcasting of the output type of the marshaller to a superclass. |
	| `static <A,​B1,​B2 extends B1>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B1>` | `[downcast](#downcast(akka.http.javadsl.marshalling.Marshaller,java.lang.Class))​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B2> m,  java.lang.Class<B1> target)` | Safe downcasting of the output type of the marshaller to a superclass. |
	| `static <A> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")>` | `[entityToOKResponse](#entityToOKResponse(akka.http.javadsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​? extends [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m)` |  |
	| `static <A> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")>` | `[entityToOKResponse](#entityToOKResponse(java.lang.Iterable,akka.http.javadsl.marshalling.Marshaller))​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​? extends [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m)` |  |
	| `static <A,​R extends [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")>` | `[entityToResponse](#entityToResponse(akka.http.javadsl.model.StatusCode,akka.http.javadsl.marshalling.Marshaller))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​R> m)` |  |
	| `static <A> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")>` | `[entityToResponse](#entityToResponse(akka.http.javadsl.model.StatusCode,java.lang.Iterable,akka.http.javadsl.marshalling.Marshaller))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,  java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​? extends [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m)` |  |
	| `static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<[FormData](../../scaladsl/model/FormData.html "class in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[formDataToEntity](#formDataToEntity())()` |  |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B>` | `[fromScala](#fromScala(akka.http.scaladsl.marshalling.Marshaller))​([Marshaller](../../scaladsl/marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> scalaMarshaller)` |  |
	| `<C> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<[A](Marshaller.html "type parameter in Marshaller"),​C>` | `[map](#map(java.util.function.Function))​(java.util.function.Function<[B](Marshaller.html "type parameter in Marshaller"),​C> f)` |  |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B>` | `[oneOf](#oneOf(akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m1,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m2)` | Helper for creating a "super\-marshaller" from a number of "sub\-marshallers". |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B>` | `[oneOf](#oneOf(akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m1,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m2,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m3)` | Helper for creating a "super\-marshaller" from a number of "sub\-marshallers". |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B>` | `[oneOf](#oneOf(akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m1,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m2,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m3,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m4)` | Helper for creating a "super\-marshaller" from a number of "sub\-marshallers". |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B>` | `[oneOf](#oneOf(akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m1,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m2,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m3,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m4,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m5)` | Helper for creating a "super\-marshaller" from a number of "sub\-marshallers". |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B>` | `[oneOf](#oneOf(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B>> ms)` | Helper for creating a "super\-marshaller" from a number of "sub\-marshallers". |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B>` | `[opaque](#opaque(java.util.function.Function))​(java.util.function.Function<A,​B> f)` | Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.javadsl.marshalling") to non\-negotiable content from the given function. |
	| `static <A> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<java.util.Optional<A>,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[optionMarshaller](#optionMarshaller(akka.http.javadsl.marshalling.Marshaller))​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m)` | Marshals an Optional\[A] to a RequestEntity an empty optional will yield an empty entity. |
	| `static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[stringToEntity](#stringToEntity())()` |  |
	| `static <T> scala.Option<T>` | `[toOption](#toOption(java.util.Optional))​(java.util.Optional<T> opt)` |  |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B>` | `[withFixedContentType](#withFixedContentType(akka.http.javadsl.model.ContentType,java.util.function.Function))​([ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") contentType,  java.util.function.Function<A,​B> f)` | Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.javadsl.marshalling") to content with a fixed charset from the given function. |
	| `static <A,​B>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B>` | `[withOpenCharset](#withOpenCharset(akka.http.javadsl.model.MediaType.WithOpenCharset,java.util.function.BiFunction))​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") mediaType,  java.util.function.BiFunction<A,​[HttpCharset](../../scaladsl/model/HttpCharset.html "class in akka.http.scaladsl.model"),​B> f)` | Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.javadsl.marshalling") to content with a negotiable charset from the given function. |
	| `static <A,​C>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<C,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[wrapEntity](#wrapEntity(java.util.function.BiFunction,akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.model.MediaType))​(java.util.function.BiFunction<scala.concurrent.ExecutionContext,​C,​A> f,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m,  [MediaType](../model/MediaType.html "interface in akka.http.javadsl.model") mediaType)` |  |
	| `static <A,​C,​E extends [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<C,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[wrapEntity](#wrapEntity(java.util.function.Function,akka.http.javadsl.marshalling.Marshaller,akka.http.javadsl.model.MediaType))​(java.util.function.Function<C,​A> f,  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​E> m,  [MediaType](../model/MediaType.html "interface in akka.http.javadsl.model") mediaType)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Marshaller
		
		
		
		```
		public Marshaller()
		```

	- ### Method Detail
	
	
	
		- #### fromScala
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> fromScala​([Marshaller](../../scaladsl/marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> scalaMarshaller)
		```
		- #### toOption
		
		
		
		```
		public static <T> scala.Option<T> toOption​(java.util.Optional<T> opt)
		```
		- #### downcast
		
		
		
		```
		public static <A,​B1,​B2 extends B1> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B1> downcast​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B2> m)
		```
		
		Safe downcasting of the output type of the marshaller to a superclass.
		 
		 Marshaller is covariant in B, i.e. if B2 is a subclass of B1,
		 then Marshaller\[X,B2] is OK to use where Marshaller\[X,B1] is expected.
		
		
		
		Parameters:
		`m` \- (undocumented)
		Returns:
		(undocumented)
		- #### downcast
		
		
		
		```
		public static <A,​B1,​B2 extends B1> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B1> downcast​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B2> m,
		                                                                               java.lang.Class<B1> target)
		```
		
		Safe downcasting of the output type of the marshaller to a superclass.
		 
		 Marshaller is covariant in B, i.e. if B2 is a subclass of B1,
		 then Marshaller\[X,B2] is OK to use where Marshaller\[X,B1] is expected.
		
		
		
		Parameters:
		`m` \- (undocumented)
		`target` \- (undocumented)
		Returns:
		(undocumented)
		- #### stringToEntity
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> stringToEntity()
		```
		- #### byteArrayToEntity
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> byteArrayToEntity()
		```
		- #### charArrayToEntity
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> charArrayToEntity()
		```
		- #### byteStringToEntity
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> byteStringToEntity()
		```
		- #### formDataToEntity
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<[FormData](../../scaladsl/model/FormData.html "class in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> formDataToEntity()
		```
		- #### byteStringMarshaller
		
		
		
		```
		public static [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> byteStringMarshaller​([ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") t)
		```
		- #### optionMarshaller
		
		
		
		```
		public static <A> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<java.util.Optional<A>,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> optionMarshaller​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m)
		```
		
		Marshals an Optional\[A] to a RequestEntity an empty optional will yield an empty entity.
		
		Parameters:
		`m` \- (undocumented)
		Returns:
		(undocumented)
		- #### wrapEntity
		
		
		
		```
		public static <A,​C> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<C,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> wrapEntity​(java.util.function.BiFunction<scala.concurrent.ExecutionContext,​C,​A> f,
		                                                                       [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m,
		                                                                       [MediaType](../model/MediaType.html "interface in akka.http.javadsl.model") mediaType)
		```
		- #### wrapEntity
		
		
		
		```
		public static <A,​C,​E extends [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<C,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> wrapEntity​(java.util.function.Function<C,​A> f,
		                                                                                                     [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​E> m,
		                                                                                                     [MediaType](../model/MediaType.html "interface in akka.http.javadsl.model") mediaType)
		```
		- #### entityToOKResponse
		
		
		
		```
		public static <A> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> entityToOKResponse​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​? extends [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m)
		```
		- #### entityToResponse
		
		
		
		```
		public static <A,​R extends [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> entityToResponse​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                                                                                                  [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​R> m)
		```
		- #### entityToResponse
		
		
		
		```
		public static <A> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> entityToResponse​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") status,
		                                                                    java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                                                                    [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​? extends [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m)
		```
		- #### entityToOKResponse
		
		
		
		```
		public static <A> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> entityToOKResponse​(java.lang.Iterable<[HttpHeader](../model/HttpHeader.html "class in akka.http.javadsl.model")> headers,
		                                                                      [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​? extends [RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m)
		```
		- #### oneOf
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> oneOf​(scala.collection.immutable.Seq<[Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B>> ms)
		```
		
		Helper for creating a "super\-marshaller" from a number of "sub\-marshallers".
		 Content\-negotiation determines, which "sub\-marshaller" eventually gets to do the job.
		 
		 Please note that all passed in marshallers will actually be invoked in order to get the Marshalling object
		 out of them, and later decide which of the marshallings should be returned. This is by\-design,
		 however in ticket as discussed in ticket https://github.com/akka/akka\-http/issues/243 it MAY be
		 changed in later versions of Akka HTTP.
		
		
		
		Parameters:
		`ms` \- (undocumented)
		Returns:
		(undocumented)
		- #### oneOf
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> oneOf​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m1,
		                                                      [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m2)
		```
		
		Helper for creating a "super\-marshaller" from a number of "sub\-marshallers".
		 Content\-negotiation determines, which "sub\-marshaller" eventually gets to do the job.
		 
		 Please note that all marshallers will actually be invoked in order to get the Marshalling object
		 out of them, and later decide which of the marshallings should be returned. This is by\-design,
		 however in ticket as discussed in ticket https://github.com/akka/akka\-http/issues/243 it MAY be
		 changed in later versions of Akka HTTP.
		
		
		
		Parameters:
		`m1` \- (undocumented)
		`m2` \- (undocumented)
		Returns:
		(undocumented)
		- #### oneOf
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> oneOf​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m1,
		                                                      [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m2,
		                                                      [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m3)
		```
		
		Helper for creating a "super\-marshaller" from a number of "sub\-marshallers".
		 Content\-negotiation determines, which "sub\-marshaller" eventually gets to do the job.
		 
		 Please note that all marshallers will actually be invoked in order to get the Marshalling object
		 out of them, and later decide which of the marshallings should be returned. This is by\-design,
		 however in ticket as discussed in ticket https://github.com/akka/akka\-http/issues/243 it MAY be
		 changed in later versions of Akka HTTP.
		
		
		
		Parameters:
		`m1` \- (undocumented)
		`m2` \- (undocumented)
		`m3` \- (undocumented)
		Returns:
		(undocumented)
		- #### oneOf
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> oneOf​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m1,
		                                                      [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m2,
		                                                      [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m3,
		                                                      [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m4)
		```
		
		Helper for creating a "super\-marshaller" from a number of "sub\-marshallers".
		 Content\-negotiation determines, which "sub\-marshaller" eventually gets to do the job.
		 
		 Please note that all marshallers will actually be invoked in order to get the Marshalling object
		 out of them, and later decide which of the marshallings should be returned. This is by\-design,
		 however in ticket as discussed in ticket https://github.com/akka/akka\-http/issues/243 it MAY be
		 changed in later versions of Akka HTTP.
		
		
		
		Parameters:
		`m1` \- (undocumented)
		`m2` \- (undocumented)
		`m3` \- (undocumented)
		`m4` \- (undocumented)
		Returns:
		(undocumented)
		- #### oneOf
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> oneOf​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m1,
		                                                      [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m2,
		                                                      [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m3,
		                                                      [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m4,
		                                                      [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> m5)
		```
		
		Helper for creating a "super\-marshaller" from a number of "sub\-marshallers".
		 Content\-negotiation determines, which "sub\-marshaller" eventually gets to do the job.
		 
		 Please note that all marshallers will actually be invoked in order to get the Marshalling object
		 out of them, and later decide which of the marshallings should be returned. This is by\-design,
		 however in ticket as discussed in ticket https://github.com/akka/akka\-http/issues/243 it MAY be
		 changed in later versions of Akka HTTP.
		
		
		
		Parameters:
		`m1` \- (undocumented)
		`m2` \- (undocumented)
		`m3` \- (undocumented)
		`m4` \- (undocumented)
		`m5` \- (undocumented)
		Returns:
		(undocumented)
		- #### withFixedContentType
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> withFixedContentType​([ContentType](../model/ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                                                     java.util.function.Function<A,​B> f)
		```
		
		Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.javadsl.marshalling") to content with a fixed charset from the given function.
		
		Parameters:
		`contentType` \- (undocumented)
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### withOpenCharset
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> withOpenCharset​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") mediaType,
		                                                                java.util.function.BiFunction<A,​[HttpCharset](../../scaladsl/model/HttpCharset.html "class in akka.http.scaladsl.model"),​B> f)
		```
		
		Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.javadsl.marshalling") to content with a negotiable charset from the given function.
		
		Parameters:
		`mediaType` \- (undocumented)
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### opaque
		
		
		
		```
		public static <A,​B> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<A,​B> opaque​(java.util.function.Function<A,​B> f)
		```
		
		Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.javadsl.marshalling") to non\-negotiable content from the given function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### asScalaToResponseMarshaller
		
		
		
		```
		public static <T> [Marshaller](../../scaladsl/marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[HttpResponse](../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")> asScalaToResponseMarshaller​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> m)
		```
		- #### asScalaEntityMarshaller
		
		
		
		```
		public static <T> [Marshaller](../../scaladsl/marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../../scaladsl/model/RequestEntity.html "interface in akka.http.scaladsl.model")> asScalaEntityMarshaller​([Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> m)
		```
		- #### asScala
		
		
		
		```
		public [Marshaller](../../scaladsl/marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<[A](Marshaller.html "type parameter in Marshaller"),​[B](Marshaller.html "type parameter in Marshaller")> asScala()
		```
		- #### asScalaCastOutput
		
		
		
		```
		public <C> [Marshaller](../../scaladsl/marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<[A](Marshaller.html "type parameter in Marshaller"),​C> asScalaCastOutput()
		```
		
		INTERNAL API: involves unsafe cast (however is very fast)
		- #### map
		
		
		
		```
		public <C> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<[A](Marshaller.html "type parameter in Marshaller"),​C> map​(java.util.function.Function<[B](Marshaller.html "type parameter in Marshaller"),​C> f)
		```
		- #### compose
		
		
		
		```
		public <C> [Marshaller](Marshaller.html "class in akka.http.javadsl.marshalling")<C,​[B](Marshaller.html "type parameter in Marshaller")> compose​(java.util.function.Function<C,​[A](Marshaller.html "type parameter in Marshaller")> f)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html)*