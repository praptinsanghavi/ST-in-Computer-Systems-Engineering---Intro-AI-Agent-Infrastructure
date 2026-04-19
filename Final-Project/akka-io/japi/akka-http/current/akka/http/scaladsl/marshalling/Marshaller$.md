---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html
title: Marshaller$
---

# Marshaller$

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Class Marshaller$

- java.lang.Object
- - akka.http.scaladsl.marshalling.Marshaller$

- All Implemented Interfaces:
`[GenericMarshallers](GenericMarshallers.html "interface in akka.http.scaladsl.marshalling")`, `[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")`, `[MultipartMarshallers](MultipartMarshallers.html "interface in akka.http.scaladsl.marshalling")`, `[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")`, `[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html "interface in akka.http.scaladsl.marshalling")`, `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling")`

---

```
public class Marshaller$
extends java.lang.Object
implements [GenericMarshallers](GenericMarshallers.html "interface in akka.http.scaladsl.marshalling"), [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling"), [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling"), [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html "interface in akka.http.scaladsl.marshalling")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Marshaller$](Marshaller$.html "class in akka.http.scaladsl.marshalling")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Marshaller$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[apply](#apply(scala.Function1))​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<A,​scala.concurrent.Future<scala.collection.immutable.List<[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<B>>>>> f)` | Creates a [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") from the given function. |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[ByteArrayMarshaller](#ByteArrayMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[ByteStringMarshaller](#ByteStringMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[CharArrayMarshaller](#CharArrayMarshaller())()` |  |
	| `<A,​B,​C>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​C>` | `[combined](#combined(scala.Function1,akka.http.scaladsl.marshalling.Marshaller))​(scala.Function1<A,​B> marshal,  [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<B,​C> m2)` | Helper for creating a [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") combined of the provided `marshal` function  and an implicit Marshaller which is able to produce the required final type. |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.Done,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[DoneMarshaller](#DoneMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[FormData](../model/FormData.html "class in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[FormDataMarshaller](#FormDataMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")>` | `[fromRequest](#fromRequest())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromResponse](#fromResponse())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCode](#fromStatusCode())()` | Creates a response for a status code. |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[fromStatusCodeAndHeaders](#fromStatusCodeAndHeaders())()` | Creates a response from status code and headers. |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[MessageEntityMarshaller](#MessageEntityMarshaller())()` |  |
	| `<A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[oneOf](#oneOf(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>> marshallers)` | Helper for creating a "super\-marshaller" from a number of "sub\-marshallers". |
	| `<T,​A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[oneOf](#oneOf(scala.collection.immutable.Seq,scala.Function1))​(scala.collection.immutable.Seq<T> values,  scala.Function1<T,​[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>> f)` | Helper for creating a "super\-marshaller" from a number of values and a function producing "sub\-marshallers"  from these values. |
	| `<A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[opaque](#opaque(scala.Function1))​(scala.Function1<A,​B> marshal)` | Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") to non\-negotiable content from the given function. |
	| `<A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[strict](#strict(scala.Function1))​(scala.Function1<A,​[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<B>> f)` | Helper for creating a [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") using the given function. |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[StringMarshaller](#StringMarshaller())()` |  |
	| `<A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[withFixedContentType](#withFixedContentType(akka.http.scaladsl.model.ContentType,scala.Function1))​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType,  scala.Function1<A,​B> marshal)` | Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") to content with a fixed charset from the given function. |
	| `<A,​B>[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>` | `[withOpenCharset](#withOpenCharset(akka.http.scaladsl.model.MediaType.WithOpenCharset,scala.Function2))​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType,  scala.Function2<A,​[HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model"),​B> marshal)` | Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") to content with a negotiable charset from the given function. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[GenericMarshallers](GenericMarshallers.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[eitherMarshaller](GenericMarshallers.html#eitherMarshaller(akka.http.scaladsl.marshalling.Marshaller,akka.http.scaladsl.marshalling.Marshaller)), [futureMarshaller](GenericMarshallers.html#futureMarshaller(akka.http.scaladsl.marshalling.Marshaller)), [optionMarshaller](GenericMarshallers.html#optionMarshaller(akka.http.scaladsl.marshalling.Marshaller,akka.http.scaladsl.marshalling.EmptyValue)), [throwableMarshaller](GenericMarshallers.html#throwableMarshaller()), [tryMarshaller](GenericMarshallers.html#tryMarshaller(akka.http.scaladsl.marshalling.Marshaller))`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[fromEntityStreamingSupportAndByteStringSourceMarshaller](LowPriorityToResponseMarshallerImplicits.html#fromEntityStreamingSupportAndByteStringSourceMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag)), [fromEntityStreamingSupportAndEntityMarshaller](LowPriorityToResponseMarshallerImplicits.html#fromEntityStreamingSupportAndEntityMarshaller(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller,scala.reflect.ClassTag)), [liftMarshaller](LowPriorityToResponseMarshallerImplicits.html#liftMarshaller(akka.http.scaladsl.marshalling.Marshaller)), [liftMarshallerConversion](LowPriorityToResponseMarshallerImplicits.html#liftMarshallerConversion(akka.http.scaladsl.marshalling.Marshaller))`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[MultipartMarshallers](MultipartMarshallers.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[multipartBoundaryLength](MultipartMarshallers.html#multipartBoundaryLength()), [multipartBoundaryRandom](MultipartMarshallers.html#multipartBoundaryRandom()), [multipartMarshaller](MultipartMarshallers.html#multipartMarshaller(akka.event.LoggingAdapter)), [randomBoundary](MultipartMarshallers.html#randomBoundary())`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[byteArrayMarshaller](PredefinedToEntityMarshallers.html#byteArrayMarshaller(akka.http.scaladsl.model.ContentType)), [byteStringMarshaller](PredefinedToEntityMarshallers.html#byteStringMarshaller(akka.http.scaladsl.model.ContentType)), [charArrayMarshaller](PredefinedToEntityMarshallers.html#charArrayMarshaller(akka.http.scaladsl.model.MediaType.WithFixedCharset)), [charArrayMarshaller](PredefinedToEntityMarshallers.html#charArrayMarshaller(akka.http.scaladsl.model.MediaType.WithOpenCharset)), [marshalCharArray](PredefinedToEntityMarshallers.html#marshalCharArray(char%5B%5D,akka.http.scaladsl.model.ContentType.NonBinary)), [stringMarshaller](PredefinedToEntityMarshallers.html#stringMarshaller(akka.http.scaladsl.model.MediaType.WithFixedCharset)), [stringMarshaller](PredefinedToEntityMarshallers.html#stringMarshaller(akka.http.scaladsl.model.MediaType.WithOpenCharset))`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[fromMethodAndUriAndHeadersAndValue](PredefinedToRequestMarshallers.html#fromMethodAndUriAndHeadersAndValue(akka.http.scaladsl.marshalling.Marshaller)), [fromMethodAndUriAndValue](PredefinedToRequestMarshallers.html#fromMethodAndUriAndValue(akka.http.scaladsl.marshalling.Marshaller)), [fromUri](PredefinedToRequestMarshallers.html#fromUri())`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[fromEntityStreamingSupportAndByteStringMarshaller](PredefinedToResponseMarshallers.html#fromEntityStreamingSupportAndByteStringMarshaller(scala.reflect.ClassTag,akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.marshalling.Marshaller)), [fromStatusCodeAndHeadersAndValue](PredefinedToResponseMarshallers.html#fromStatusCodeAndHeadersAndValue(akka.http.scaladsl.marshalling.Marshaller)), [fromStatusCodeAndValue](PredefinedToResponseMarshallers.html#fromStatusCodeAndValue(scala.Function1,akka.http.scaladsl.marshalling.Marshaller)), [fromStatusCodeConvertibleAndHeadersAndT](PredefinedToResponseMarshallers.html#fromStatusCodeConvertibleAndHeadersAndT(scala.Function1,akka.http.scaladsl.marshalling.Marshaller)), [fromToEntityMarshaller](PredefinedToResponseMarshallers.html#fromToEntityMarshaller(akka.http.scaladsl.model.StatusCode,scala.collection.immutable.Seq,akka.http.scaladsl.marshalling.Marshaller))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Marshaller$](Marshaller$.html "class in akka.http.scaladsl.marshalling") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Marshaller$
		
		
		
		```
		public Marshaller$()
		```

	- ### Method Detail
	
	
	
		- #### fromRequest
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> fromRequest()
		```
		
		
		Specified by:
		`[fromRequest](PredefinedToRequestMarshallers.html#fromRequest())` in interface `[PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		- #### fromResponse
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromResponse()
		```
		
		
		Specified by:
		`[fromResponse](PredefinedToResponseMarshallers.html#fromResponse())` in interface `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		- #### fromStatusCode
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCode()
		```
		
		Description copied from interface: `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html#fromStatusCode())`
		Creates a response for a status code. Does not support content\-type negotiation but will return
		 a response either with a `text-plain` entity containing the `status.defaultMessage` or an empty entity
		 for status codes that don't allow a response.
		
		Specified by:
		`[fromStatusCode](PredefinedToResponseMarshallers.html#fromStatusCode())` in interface `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		Returns:
		(undocumented)
		- #### fromStatusCodeAndHeaders
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.Tuple2<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")>>,​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> fromStatusCodeAndHeaders()
		```
		
		Description copied from interface: `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html#fromStatusCodeAndHeaders())`
		Creates a response from status code and headers. Does not support content\-type negotiation but will return
		 a response either with a `text-plain` entity containing the `status.defaultMessage` or an empty entity
		 for status codes that don't allow a response.
		
		Specified by:
		`[fromStatusCodeAndHeaders](PredefinedToResponseMarshallers.html#fromStatusCodeAndHeaders())` in interface `[PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		Returns:
		(undocumented)
		- #### ByteArrayMarshaller
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> ByteArrayMarshaller()
		```
		
		
		Specified by:
		`[ByteArrayMarshaller](PredefinedToEntityMarshallers.html#ByteArrayMarshaller())` in interface `[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		- #### ByteStringMarshaller
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> ByteStringMarshaller()
		```
		
		
		Specified by:
		`[ByteStringMarshaller](PredefinedToEntityMarshallers.html#ByteStringMarshaller())` in interface `[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		- #### CharArrayMarshaller
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> CharArrayMarshaller()
		```
		
		
		Specified by:
		`[CharArrayMarshaller](PredefinedToEntityMarshallers.html#CharArrayMarshaller())` in interface `[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		- #### DoneMarshaller
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.Done,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> DoneMarshaller()
		```
		
		
		Specified by:
		`[DoneMarshaller](PredefinedToEntityMarshallers.html#DoneMarshaller())` in interface `[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		- #### StringMarshaller
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> StringMarshaller()
		```
		
		
		Specified by:
		`[StringMarshaller](PredefinedToEntityMarshallers.html#StringMarshaller())` in interface `[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		- #### FormDataMarshaller
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[FormData](../model/FormData.html "class in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> FormDataMarshaller()
		```
		
		
		Specified by:
		`[FormDataMarshaller](PredefinedToEntityMarshallers.html#FormDataMarshaller())` in interface `[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		- #### MessageEntityMarshaller
		
		
		
		```
		public [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")> MessageEntityMarshaller()
		```
		
		
		Specified by:
		`[MessageEntityMarshaller](PredefinedToEntityMarshallers.html#MessageEntityMarshaller())` in interface `[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")`
		- #### apply
		
		
		
		```
		public <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> apply​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<A,​scala.concurrent.Future<scala.collection.immutable.List<[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<B>>>>> f)
		```
		
		Creates a [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") from the given function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### strict
		
		
		
		```
		public <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> strict​(scala.Function1<A,​[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<B>> f)
		```
		
		Helper for creating a [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") using the given function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### oneOf
		
		
		
		```
		public <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> oneOf​(scala.collection.immutable.Seq<[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B>> marshallers)
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
		public <T,​A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> oneOf​(scala.collection.immutable.Seq<T> values,
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
		public <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> withFixedContentType​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") contentType,
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
		public <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> withOpenCharset​([MediaType.WithOpenCharset](../model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType,
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
		public <A,​B> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​B> opaque​(scala.Function1<A,​B> marshal)
		```
		
		Helper for creating a synchronous [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") to non\-negotiable content from the given function.
		
		Parameters:
		`marshal` \- (undocumented)
		Returns:
		(undocumented)
		- #### combined
		
		
		
		```
		public <A,​B,​C> [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<A,​C> combined​(scala.Function1<A,​B> marshal,
		                                                          [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<B,​C> m2)
		```
		
		Helper for creating a [`Marshaller`](Marshaller.html "class in akka.http.scaladsl.marshalling") combined of the provided `marshal` function
		 and an implicit Marshaller which is able to produce the required final type.
		
		Parameters:
		`marshal` \- (undocumented)
		`m2` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/LowPriorityToResponseMarshallerImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html)*