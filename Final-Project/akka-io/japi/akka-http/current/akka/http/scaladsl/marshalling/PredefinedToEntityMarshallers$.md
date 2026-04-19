---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html
title: PredefinedToEntityMarshallers$
---

# PredefinedToEntityMarshallers$

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Class PredefinedToEntityMarshallers$

- java.lang.Object
- - akka.http.scaladsl.marshalling.PredefinedToEntityMarshallers$

- All Implemented Interfaces:
`[MultipartMarshallers](MultipartMarshallers.html "interface in akka.http.scaladsl.marshalling")`, `[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")`

---

```
public class PredefinedToEntityMarshallers$
extends java.lang.Object
implements [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PredefinedToEntityMarshallers$](PredefinedToEntityMarshallers$.html "class in akka.http.scaladsl.marshalling")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PredefinedToEntityMarshallers$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<byte[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[ByteArrayMarshaller](#ByteArrayMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.util.ByteString,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[ByteStringMarshaller](#ByteStringMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<char[],​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[CharArrayMarshaller](#CharArrayMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<akka.Done,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[DoneMarshaller](#DoneMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[FormData](../model/FormData.html "class in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[FormDataMarshaller](#FormDataMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model"),​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[MessageEntityMarshaller](#MessageEntityMarshaller())()` |  |
	| `[Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")<java.lang.String,​[RequestEntity](../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[StringMarshaller](#StringMarshaller())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[MultipartMarshallers](MultipartMarshallers.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[multipartBoundaryLength](MultipartMarshallers.html#multipartBoundaryLength()), [multipartBoundaryRandom](MultipartMarshallers.html#multipartBoundaryRandom()), [multipartMarshaller](MultipartMarshallers.html#multipartMarshaller(akka.event.LoggingAdapter)), [randomBoundary](MultipartMarshallers.html#randomBoundary())`
		- ### Methods inherited from interface akka.http.scaladsl.marshalling.[PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling")
		
		
		`[byteArrayMarshaller](PredefinedToEntityMarshallers.html#byteArrayMarshaller(akka.http.scaladsl.model.ContentType)), [byteStringMarshaller](PredefinedToEntityMarshallers.html#byteStringMarshaller(akka.http.scaladsl.model.ContentType)), [charArrayMarshaller](PredefinedToEntityMarshallers.html#charArrayMarshaller(akka.http.scaladsl.model.MediaType.WithFixedCharset)), [charArrayMarshaller](PredefinedToEntityMarshallers.html#charArrayMarshaller(akka.http.scaladsl.model.MediaType.WithOpenCharset)), [marshalCharArray](PredefinedToEntityMarshallers.html#marshalCharArray(char%5B%5D,akka.http.scaladsl.model.ContentType.NonBinary)), [stringMarshaller](PredefinedToEntityMarshallers.html#stringMarshaller(akka.http.scaladsl.model.MediaType.WithFixedCharset)), [stringMarshaller](PredefinedToEntityMarshallers.html#stringMarshaller(akka.http.scaladsl.model.MediaType.WithOpenCharset))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PredefinedToEntityMarshallers$](PredefinedToEntityMarshallers$.html "class in akka.http.scaladsl.marshalling") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PredefinedToEntityMarshallers$
		
		
		
		```
		public PredefinedToEntityMarshallers$()
		```

	- ### Method Detail
	
	
	
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html)*