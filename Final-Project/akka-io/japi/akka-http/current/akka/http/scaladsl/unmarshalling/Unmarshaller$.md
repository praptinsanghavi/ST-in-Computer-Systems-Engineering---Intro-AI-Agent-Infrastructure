---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:42:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
title: Unmarshaller$
---

# Unmarshaller$

## Content

Package [akka.http.scaladsl.unmarshalling](package-summary.html)
## Class Unmarshaller$

- java.lang.Object
- - akka.http.scaladsl.unmarshalling.Unmarshaller$

- All Implemented Interfaces:
`[GenericUnmarshallers](GenericUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`, `[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`, `[MultipartUnmarshallers](MultipartUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`, `[PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`, `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`

---

```
public class Unmarshaller$
extends java.lang.Object
implements [GenericUnmarshallers](GenericUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling"), [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling"), [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Unmarshaller$](Unmarshaller$.html "class in akka.http.scaladsl.unmarshalling")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unmarshaller$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B>` | `[apply](#apply(scala.Function1))​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<A,​scala.concurrent.Future<B>>> f)` | Creates an `Unmarshaller` from the given function. |
	| `[HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model")` | `[bestUnmarshallingCharsetFor](#bestUnmarshallingCharsetFor(akka.http.scaladsl.model.HttpEntity))​([HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model") entity)` | Returns the best charset for unmarshalling the given entity to a character\-based representation. |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[booleanFromStringUnmarshaller](#booleanFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[byteFromStringUnmarshaller](#byteFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[doubleFromStringUnmarshaller](#doubleFromStringUnmarshaller())()` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B>` | `[firstOf](#firstOf(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B>> unmarshallers)` | Helper for creating a "super\-unmarshaller" from a sequence of "sub\-unmarshallers", which are tried  in the given order. |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[floatFromStringUnmarshaller](#floatFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexByte](#HexByte())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexInt](#HexInt())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexLong](#HexLong())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[HexShort](#HexShort())()` |  |
	| `<T> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<T,​T>` | `[identityUnmarshaller](#identityUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[intFromStringUnmarshaller](#intFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[longFromStringUnmarshaller](#longFromStringUnmarshaller())()` |  |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object>` | `[shortFromStringUnmarshaller](#shortFromStringUnmarshaller())()` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B>` | `[strict](#strict(scala.Function1))​(scala.Function1<A,​B> f)` | Helper for creating a synchronous `Unmarshaller` from the given function. |
	| `[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID>` | `[uuidFromStringUnmarshaller](#uuidFromStringUnmarshaller())()` |  |
	| `<A,​B>[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B>` | `[withMaterializer](#withMaterializer(scala.Function1))​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<akka.stream.Materializer,​scala.Function1<A,​scala.concurrent.Future<B>>>> f)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.unmarshalling.[GenericUnmarshallers](GenericUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
		
		
		`[liftToTargetOptionUnmarshaller](GenericUnmarshallers.html#liftToTargetOptionUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller)), [targetOptionUnmarshaller](GenericUnmarshallers.html#targetOptionUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller))`
		- ### Methods inherited from interface akka.http.scaladsl.unmarshalling.[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
		
		
		`[eitherUnmarshaller](LowerPriorityGenericUnmarshallers.html#eitherUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller,scala.reflect.ClassTag,akka.http.scaladsl.unmarshalling.Unmarshaller,scala.reflect.ClassTag)), [liftToSourceOptionUnmarshaller](LowerPriorityGenericUnmarshallers.html#liftToSourceOptionUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller)), [messageUnmarshallerFromEntityUnmarshaller](LowerPriorityGenericUnmarshallers.html#messageUnmarshallerFromEntityUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller)), [sourceOptionUnmarshaller](LowerPriorityGenericUnmarshallers.html#sourceOptionUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller))`
		- ### Methods inherited from interface akka.http.scaladsl.unmarshalling.[MultipartUnmarshallers](MultipartUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
		
		
		`[defaultMultipartByteRangesUnmarshaller](MultipartUnmarshallers.html#defaultMultipartByteRangesUnmarshaller(akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings)), [defaultMultipartGeneralUnmarshaller](MultipartUnmarshallers.html#defaultMultipartGeneralUnmarshaller(akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings)), [multipartByteRangesUnmarshaller](MultipartUnmarshallers.html#multipartByteRangesUnmarshaller(akka.http.scaladsl.model.HttpCharset,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings)), [multipartFormDataUnmarshaller](MultipartUnmarshallers.html#multipartFormDataUnmarshaller(akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings)), [multipartGeneralUnmarshaller](MultipartUnmarshallers.html#multipartGeneralUnmarshaller(akka.http.scaladsl.model.HttpCharset,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings)), [multipartUnmarshaller](MultipartUnmarshallers.html#multipartUnmarshaller(akka.http.scaladsl.model.MediaRange,akka.http.scaladsl.model.ContentType,scala.Function2,scala.Function2,scala.Function2,scala.Function2,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings))`
		- ### Methods inherited from interface akka.http.scaladsl.unmarshalling.[PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
		
		
		`[byteArrayUnmarshaller](PredefinedFromEntityUnmarshallers.html#byteArrayUnmarshaller()), [byteStringUnmarshaller](PredefinedFromEntityUnmarshallers.html#byteStringUnmarshaller()), [charArrayUnmarshaller](PredefinedFromEntityUnmarshallers.html#charArrayUnmarshaller()), [defaultUrlEncodedFormDataUnmarshaller](PredefinedFromEntityUnmarshallers.html#defaultUrlEncodedFormDataUnmarshaller()), [stringUnmarshaller](PredefinedFromEntityUnmarshallers.html#stringUnmarshaller()), [urlEncodedFormDataUnmarshaller](PredefinedFromEntityUnmarshallers.html#urlEncodedFormDataUnmarshaller(scala.collection.immutable.Seq))`
		- ### Methods inherited from interface akka.http.scaladsl.unmarshalling.[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")
		
		
		`[_fromStringUnmarshallerFromByteStringUnmarshaller](PredefinedFromStringUnmarshallers.html#_fromStringUnmarshallerFromByteStringUnmarshaller(akka.http.scaladsl.unmarshalling.Unmarshaller)), [CsvSeq](PredefinedFromStringUnmarshallers.html#CsvSeq(akka.http.scaladsl.unmarshalling.Unmarshaller)), [numberFormatError](PredefinedFromStringUnmarshallers.html#numberFormatError(java.lang.String,java.lang.String)), [numberUnmarshaller](PredefinedFromStringUnmarshallers.html#numberUnmarshaller(scala.Function1,java.lang.String))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Unmarshaller$](Unmarshaller$.html "class in akka.http.scaladsl.unmarshalling") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Unmarshaller$
		
		
		
		```
		public Unmarshaller$()
		```

	- ### Method Detail
	
	
	
		- #### byteFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> byteFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[byteFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#byteFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### shortFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> shortFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[shortFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#shortFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### intFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> intFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[intFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#intFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### longFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> longFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[longFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#longFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### floatFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> floatFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[floatFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#floatFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### doubleFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> doubleFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[doubleFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#doubleFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### booleanFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> booleanFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[booleanFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#booleanFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### uuidFromStringUnmarshaller
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.util.UUID> uuidFromStringUnmarshaller()
		```
		
		
		Specified by:
		`[uuidFromStringUnmarshaller](PredefinedFromStringUnmarshallers.html#uuidFromStringUnmarshaller())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexByte
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexByte()
		```
		
		
		Specified by:
		`[HexByte](PredefinedFromStringUnmarshallers.html#HexByte())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexShort
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexShort()
		```
		
		
		Specified by:
		`[HexShort](PredefinedFromStringUnmarshallers.html#HexShort())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexInt
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexInt()
		```
		
		
		Specified by:
		`[HexInt](PredefinedFromStringUnmarshallers.html#HexInt())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### HexLong
		
		
		
		```
		public [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<java.lang.String,​java.lang.Object> HexLong()
		```
		
		
		Specified by:
		`[HexLong](PredefinedFromStringUnmarshallers.html#HexLong())` in interface `[PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling")`
		- #### apply
		
		
		
		```
		public <A,​B> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> apply​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<A,​scala.concurrent.Future<B>>> f)
		```
		
		Creates an `Unmarshaller` from the given function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### withMaterializer
		
		
		
		```
		public <A,​B> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> withMaterializer​(scala.Function1<scala.concurrent.ExecutionContext,​scala.Function1<akka.stream.Materializer,​scala.Function1<A,​scala.concurrent.Future<B>>>> f)
		```
		- #### strict
		
		
		
		```
		public <A,​B> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> strict​(scala.Function1<A,​B> f)
		```
		
		Helper for creating a synchronous `Unmarshaller` from the given function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### firstOf
		
		
		
		```
		public <A,​B> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B> firstOf​(scala.collection.immutable.Seq<[Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<A,​B>> unmarshallers)
		```
		
		Helper for creating a "super\-unmarshaller" from a sequence of "sub\-unmarshallers", which are tried
		 in the given order. The first successful unmarshalling of a "sub\-unmarshallers" is the one produced by the
		 "super\-unmarshaller".
		
		Parameters:
		`unmarshallers` \- (undocumented)
		Returns:
		(undocumented)
		- #### identityUnmarshaller
		
		
		
		```
		public <T> [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<T,​T> identityUnmarshaller()
		```
		- #### bestUnmarshallingCharsetFor
		
		
		
		```
		public [HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model") bestUnmarshallingCharsetFor​([HttpEntity](../model/HttpEntity.html "interface in akka.http.scaladsl.model") entity)
		```
		
		Returns the best charset for unmarshalling the given entity to a character\-based representation.
		 Falls back to UTF\-8 if no better alternative can be determined.
		
		Parameters:
		`entity` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html)*