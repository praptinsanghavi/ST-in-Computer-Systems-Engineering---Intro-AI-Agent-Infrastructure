---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller$.html
title: Unmarshaller$
---

# Unmarshaller$

## Content

Package [akka.http.javadsl.unmarshalling](package-summary.html)
## Class Unmarshaller$

- java.lang.Object
- - akka.http.javadsl.unmarshalling.Unmarshaller$

- All Implemented Interfaces:
`[Unmarshallers](Unmarshallers.html "interface in akka.http.javadsl.unmarshalling")`

---

```
public class Unmarshaller$
extends java.lang.Object
implements [Unmarshallers](Unmarshallers.html "interface in akka.http.javadsl.unmarshalling")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Unmarshaller$](Unmarshaller$.html "class in akka.http.javadsl.unmarshalling")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unmarshaller$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[async](#async(java.util.function.Function))​(java.util.function.Function<A,​java.util.concurrent.CompletionStage<B>> f)` | Creates an unmarshaller from an asynchronous Java function. |
	| `[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​byte[]>` | `[entityToByteArray](#entityToByteArray())()` |  |
	| `[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​akka.util.ByteString>` | `[entityToByteString](#entityToByteString())()` |  |
	| `[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​char[]>` | `[entityToCharArray](#entityToCharArray())()` |  |
	| `[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[Multipart.ByteRanges](../model/Multipart.ByteRanges.html "interface in akka.http.javadsl.model")>` | `[entityToMultipartByteRangesUnmarshaller](#entityToMultipartByteRangesUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[Multipart.FormData](../model/Multipart.FormData.html "interface in akka.http.javadsl.model")>` | `[entityToMultipartFormData](#entityToMultipartFormData())()` |  |
	| `[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​java.lang.String>` | `[entityToString](#entityToString())()` |  |
	| `[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[FormData](../model/FormData.html "class in akka.http.javadsl.model")>` | `[entityToWwwUrlEncodedFormData](#entityToWwwUrlEncodedFormData())()` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2)` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3)` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4)` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u5)` |  |
	| `<B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B>` | `[forMediaType](#forMediaType(akka.http.javadsl.model.MediaType,akka.http.javadsl.unmarshalling.Unmarshaller))​([MediaType](../model/MediaType.html "interface in akka.http.javadsl.model") t,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> um)` |  |
	| `<B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B>` | `[forMediaTypes](#forMediaTypes(java.lang.Iterable,akka.http.javadsl.unmarshalling.Unmarshaller))​(java.lang.Iterable<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> types,  [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> um)` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[fromScala](#fromScala(akka.http.scaladsl.unmarshalling.Unmarshaller))​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> scalaUnmarshaller)` |  |
	| `[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")>` | `[requestToEntity](#requestToEntity())()` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B>` | `[sync](#sync(java.util.function.Function))​(java.util.function.Function<A,​B> f)` | Creates an unmarshaller from a Java function. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Unmarshaller$](Unmarshaller$.html "class in akka.http.javadsl.unmarshalling") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Unmarshaller$
		
		
		
		```
		public Unmarshaller$()
		```

	- ### Method Detail
	
	
	
		- #### fromScala
		
		
		
		```
		public <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> fromScala​([Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> scalaUnmarshaller)
		```
		- #### async
		
		
		
		```
		public <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> async​(java.util.function.Function<A,​java.util.concurrent.CompletionStage<B>> f)
		```
		
		Creates an unmarshaller from an asynchronous Java function.
		
		Specified by:
		`[async](Unmarshallers.html#async(java.util.function.Function))` in interface `[Unmarshallers](Unmarshallers.html "interface in akka.http.javadsl.unmarshalling")`
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### sync
		
		
		
		```
		public <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> sync​(java.util.function.Function<A,​B> f)
		```
		
		Creates an unmarshaller from a Java function.
		
		Specified by:
		`[sync](Unmarshallers.html#sync(java.util.function.Function))` in interface `[Unmarshallers](Unmarshallers.html "interface in akka.http.javadsl.unmarshalling")`
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### entityToByteString
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​akka.util.ByteString> entityToByteString()
		```
		- #### entityToByteArray
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​byte[]> entityToByteArray()
		```
		- #### entityToCharArray
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​char[]> entityToCharArray()
		```
		- #### entityToString
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​java.lang.String> entityToString()
		```
		- #### entityToWwwUrlEncodedFormData
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[FormData](../model/FormData.html "class in akka.http.javadsl.model")> entityToWwwUrlEncodedFormData()
		```
		- #### entityToMultipartByteRangesUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[Multipart.ByteRanges](../model/Multipart.ByteRanges.html "interface in akka.http.javadsl.model")> entityToMultipartByteRangesUnmarshaller()
		```
		- #### entityToMultipartFormData
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​[Multipart.FormData](../model/Multipart.FormData.html "interface in akka.http.javadsl.model")> entityToMultipartFormData()
		```
		- #### requestToEntity
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.javadsl.model")> requestToEntity()
		```
		- #### forMediaType
		
		
		
		```
		public <B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> forMediaType​([MediaType](../model/MediaType.html "interface in akka.http.javadsl.model") t,
		                                                         [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> um)
		```
		- #### forMediaTypes
		
		
		
		```
		public <B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> forMediaTypes​(java.lang.Iterable<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> types,
		                                                          [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<[HttpEntity](../model/HttpEntity.html "interface in akka.http.javadsl.model"),​B> um)
		```
		- #### firstOf
		
		
		
		```
		public <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                                   [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2)
		```
		
		
		Specified by:
		`[firstOf](Unmarshallers.html#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))` in interface `[Unmarshallers](Unmarshallers.html "interface in akka.http.javadsl.unmarshalling")`
		- #### firstOf
		
		
		
		```
		public <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                                   [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,
		                                                   [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3)
		```
		
		
		Specified by:
		`[firstOf](Unmarshallers.html#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))` in interface `[Unmarshallers](Unmarshallers.html "interface in akka.http.javadsl.unmarshalling")`
		- #### firstOf
		
		
		
		```
		public <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                                   [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,
		                                                   [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,
		                                                   [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4)
		```
		
		
		Specified by:
		`[firstOf](Unmarshallers.html#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))` in interface `[Unmarshallers](Unmarshallers.html "interface in akka.http.javadsl.unmarshalling")`
		- #### firstOf
		
		
		
		```
		public <A,​B> [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> firstOf​([Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u1,
		                                                   [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u2,
		                                                   [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u3,
		                                                   [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u4,
		                                                   [Unmarshaller](Unmarshaller.html "class in akka.http.javadsl.unmarshalling")<A,​B> u5)
		```
		
		
		Specified by:
		`[firstOf](Unmarshallers.html#firstOf(akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller,akka.http.javadsl.unmarshalling.Unmarshaller))` in interface `[Unmarshallers](Unmarshallers.html "interface in akka.http.javadsl.unmarshalling")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.ByteRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller$.html)*