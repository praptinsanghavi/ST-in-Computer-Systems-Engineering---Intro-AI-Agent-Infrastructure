---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
title: Unmarshaller
---

# Unmarshaller

## Content

Package [akka.http.javadsl.unmarshalling](package-summary.html)
## Class Unmarshaller\<A,​B\>

- java.lang.Object
- - akka.http.javadsl.unmarshalling.Unmarshaller\<A,​B\>

- All Implemented Interfaces:
`[UnmarshallerBase](UnmarshallerBase.html "interface in akka.http.javadsl.unmarshalling")<A,​B>`

---

```
public abstract class Unmarshaller<A,​B>
extends java.lang.Object
implements [UnmarshallerBase](UnmarshallerBase.html "interface in akka.http.javadsl.unmarshalling")<A,​B>
```

An unmarshaller transforms values of type A into type B.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unmarshaller](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​[B](Unmarshaller.html "type parameter in Unmarshaller")>` | `[asScala](#asScala())()` |  |
	| `<I> [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<I,​[B](Unmarshaller.html "type parameter in Unmarshaller")>` | `[asScalaCastInput](#asScalaCastInput())()` | INTERNAL API |
	| `static <A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[async](#async(java.util.function.Function))​(java.util.function.Function<A,​java.util.concurrent.CompletionStage<B>> f)` | Creates an unmarshaller from an asynchronous Java function. |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​byte[]>` | `[entityToByteArray](#entityToByteArray())()` |  |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​akka.util.ByteString>` | `[entityToByteString](#entityToByteString())()` |  |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​char[]>` | `[entityToCharArray](#entityToCharArray())()` |  |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[Multipart.ByteRanges](../model/Multipart.ByteRanges.html "interface in akka.http.javadsl.model")>` | `[entityToMultipartByteRangesUnmarshaller](#entityToMultipartByteRangesUnmarshaller())()` |  |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[Multipart.FormData](../model/Multipart.FormData.html "interface in akka.http.javadsl.model")>` | `[entityToMultipartFormData](#entityToMultipartFormData())()` |  |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​java.lang.String>` | `[entityToString](#entityToString())()` |  |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[FormData](../model/FormData.html "class in akka.http.javadsl.model")>` | `[entityToWwwUrlEncodedFormData](#entityToWwwUrlEncodedFormData())()` |  |
	| `static <A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2)` |  |
	| `static <A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3)` |  |
	| `static <A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4)` |  |
	| `static <A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u5)` |  |
	| `<C> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C>` | `[flatMap](#flatMap(akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<? super [B](Unmarshaller.html "type parameter in Unmarshaller"),​C> u)` |  |
	| `<C> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C>` | `[flatMap](#flatMap(java.util.function.Function))​(java.util.function.Function<[B](Unmarshaller.html "type parameter in Unmarshaller"),​java.util.concurrent.CompletionStage<C>> f)` |  |
	| `static <B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B>` | `[forMediaType](#forMediaType(akka.http.javadsl.model.MediaType,akka.http.javadsl.unmarshalling.Unmarshaller))​([MediaType](../model/MediaType.html "interface in akka.http.javadsl.model") t,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> um)` |  |
	| `static <B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B>` | `[forMediaTypes](#forMediaTypes(java.lang.Iterable,akka.http.javadsl.unmarshalling.Unmarshaller))​(java.lang.Iterable<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> types,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> um)` |  |
	| `static <A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[fromScala](#fromScala(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> scalaUnmarshaller)` |  |
	| `static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[requestToEntity](#requestToEntity())()` |  |
	| `static <A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[sync](#sync(java.util.function.Function))​(java.util.function.Function<A,​B> f)` | Creates an unmarshaller from a Java function. |
	| `<C> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C>` | `[thenApply](#thenApply(java.util.function.Function))​(java.util.function.Function<[B](Unmarshaller.html "type parameter in Unmarshaller"),​C> f)` | Transform the result `B` of this unmarshaller to a `C` producing a marshaller that turns `A`s into `C`s |
	| `java.util.concurrent.CompletionStage<[B](Unmarshaller.html "type parameter in Unmarshaller")>` | `[unmarshal](#unmarshal(A,akka.actor.ClassicActorSystemProvider))​([A](Unmarshaller.html "type parameter in Unmarshaller") value,  akka.actor.ClassicActorSystemProvider system)` | Apply this Unmarshaller to the given value. |
	| `java.util.concurrent.CompletionStage<[B](Unmarshaller.html "type parameter in Unmarshaller")>` | `[unmarshal](#unmarshal(A,akka.stream.Materializer))​([A](Unmarshaller.html "type parameter in Unmarshaller") value,  akka.stream.Materializer mat)` | Apply this Unmarshaller to the given value. |
	| `java.util.concurrent.CompletionStage<[B](Unmarshaller.html "type parameter in Unmarshaller")>` | `[unmarshal](#unmarshal(A,scala.concurrent.ExecutionContext,akka.actor.ClassicActorSystemProvider))​([A](Unmarshaller.html "type parameter in Unmarshaller") value,  scala.concurrent.ExecutionContext ec,  akka.actor.ClassicActorSystemProvider system)` | Apply this Unmarshaller to the given value. |
	| `java.util.concurrent.CompletionStage<[B](Unmarshaller.html "type parameter in Unmarshaller")>` | `[unmarshal](#unmarshal(A,scala.concurrent.ExecutionContext,akka.stream.Materializer))​([A](Unmarshaller.html "type parameter in Unmarshaller") value,  scala.concurrent.ExecutionContext ec,  akka.stream.Materializer mat)` | Apply this Unmarshaller to the given value. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Unmarshaller
		
		
		
		```
		public Unmarshaller()
		```

	- ### Method Detail
	
	
	
		- #### fromScala
		
		
		
		```
		public static <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> fromScala​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> scalaUnmarshaller)
		```
		- #### async
		
		
		
		```
		public static <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> async​(java.util.function.Function<A,​java.util.concurrent.CompletionStage<B>> f)
		```
		
		Creates an unmarshaller from an asynchronous Java function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### sync
		
		
		
		```
		public static <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> sync​(java.util.function.Function<A,​B> f)
		```
		
		Creates an unmarshaller from a Java function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### entityToByteString
		
		
		
		```
		public static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​akka.util.ByteString> entityToByteString()
		```
		- #### entityToByteArray
		
		
		
		```
		public static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​byte[]> entityToByteArray()
		```
		- #### entityToCharArray
		
		
		
		```
		public static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​char[]> entityToCharArray()
		```
		- #### entityToString
		
		
		
		```
		public static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​java.lang.String> entityToString()
		```
		- #### entityToWwwUrlEncodedFormData
		
		
		
		```
		public static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[FormData](../model/FormData.html "class in akka.http.javadsl.model")> entityToWwwUrlEncodedFormData()
		```
		- #### entityToMultipartByteRangesUnmarshaller
		
		
		
		```
		public static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[Multipart.ByteRanges](../model/Multipart.ByteRanges.html "interface in akka.http.javadsl.model")> entityToMultipartByteRangesUnmarshaller()
		```
		- #### entityToMultipartFormData
		
		
		
		```
		public static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[Multipart.FormData](../model/Multipart.FormData.html "interface in akka.http.javadsl.model")> entityToMultipartFormData()
		```
		- #### requestToEntity
		
		
		
		```
		public static [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> requestToEntity()
		```
		- #### forMediaType
		
		
		
		```
		public static <B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> forMediaType​([MediaType](../model/MediaType.html "interface in akka.http.javadsl.model") t,
		                                                                [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> um)
		```
		- #### forMediaTypes
		
		
		
		```
		public static <B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> forMediaTypes​(java.lang.Iterable<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> types,
		                                                                 [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> um)
		```
		- #### firstOf
		
		
		
		```
		public static <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                                          [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2)
		```
		- #### firstOf
		
		
		
		```
		public static <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                                          [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,
		                                                          [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3)
		```
		- #### firstOf
		
		
		
		```
		public static <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                                          [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,
		                                                          [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,
		                                                          [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4)
		```
		- #### firstOf
		
		
		
		```
		public static <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                                          [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,
		                                                          [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,
		                                                          [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4,
		                                                          [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u5)
		```
		- #### asScala
		
		
		
		```
		public abstract [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​[B](Unmarshaller.html "type parameter in Unmarshaller")> asScala()
		```
		- #### asScalaCastInput
		
		
		
		```
		public <I> [Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<I,​[B](Unmarshaller.html "type parameter in Unmarshaller")> asScalaCastInput()
		```
		
		INTERNAL API
		- #### unmarshal
		
		
		
		```
		public java.util.concurrent.CompletionStage<[B](Unmarshaller.html "type parameter in Unmarshaller")> unmarshal​([A](Unmarshaller.html "type parameter in Unmarshaller") value,
		                                                         scala.concurrent.ExecutionContext ec,
		                                                         akka.stream.Materializer mat)
		```
		
		Apply this Unmarshaller to the given value.
		
		Parameters:
		`value` \- (undocumented)
		`ec` \- (undocumented)
		`mat` \- (undocumented)
		Returns:
		(undocumented)
		- #### unmarshal
		
		
		
		```
		public java.util.concurrent.CompletionStage<[B](Unmarshaller.html "type parameter in Unmarshaller")> unmarshal​([A](Unmarshaller.html "type parameter in Unmarshaller") value,
		                                                         akka.stream.Materializer mat)
		```
		
		Apply this Unmarshaller to the given value. Uses the default materializer `ExecutionContext`.
		 If you expect the marshalling to be heavy, it is suggested to provide a specialized context for those operations.
		
		Parameters:
		`value` \- (undocumented)
		`mat` \- (undocumented)
		Returns:
		(undocumented)
		- #### unmarshal
		
		
		
		```
		public java.util.concurrent.CompletionStage<[B](Unmarshaller.html "type parameter in Unmarshaller")> unmarshal​([A](Unmarshaller.html "type parameter in Unmarshaller") value,
		                                                         scala.concurrent.ExecutionContext ec,
		                                                         akka.actor.ClassicActorSystemProvider system)
		```
		
		Apply this Unmarshaller to the given value.
		
		Parameters:
		`value` \- (undocumented)
		`ec` \- (undocumented)
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### unmarshal
		
		
		
		```
		public java.util.concurrent.CompletionStage<[B](Unmarshaller.html "type parameter in Unmarshaller")> unmarshal​([A](Unmarshaller.html "type parameter in Unmarshaller") value,
		                                                         akka.actor.ClassicActorSystemProvider system)
		```
		
		Apply this Unmarshaller to the given value. Uses the default materializer `ExecutionContext`.
		 If you expect the marshalling to be heavy, it is suggested to provide a specialized context for those operations.
		
		Parameters:
		`value` \- (undocumented)
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### thenApply
		
		
		
		```
		public <C> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C> thenApply​(java.util.function.Function<[B](Unmarshaller.html "type parameter in Unmarshaller"),​C> f)
		```
		
		Transform the result `B` of this unmarshaller to a `C` producing a marshaller that turns `A`s into `C`s
		 
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		A new marshaller that can unmarshall instances of `A` into instances of `C`
		- #### flatMap
		
		
		
		```
		public <C> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C> flatMap​(java.util.function.Function<[B](Unmarshaller.html "type parameter in Unmarshaller"),​java.util.concurrent.CompletionStage<C>> f)
		```
		- #### flatMap
		
		
		
		```
		public <C> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[A](Unmarshaller.html "type parameter in Unmarshaller"),​C> flatMap​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<? super [B](Unmarshaller.html "type parameter in Unmarshaller"),​C> u)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.ByteRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/UnmarshallerBase.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html)*