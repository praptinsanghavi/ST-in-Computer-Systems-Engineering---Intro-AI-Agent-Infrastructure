---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:32:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.ByteRanges$.Strict.html
title: Multipart.ByteRanges$.Strict
---

# Multipart.ByteRanges$.Strict

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class Multipart.ByteRanges$.Strict

- java.lang.Object
- - [akka.http.scaladsl.model.Multipart.ByteRanges](Multipart.ByteRanges.html "class in akka.http.scaladsl.model")
	- - akka.http.scaladsl.model.Multipart.ByteRanges$.Strict

- All Implemented Interfaces:
`[Multipart](../../javadsl/model/Multipart.html "interface in akka.http.javadsl.model")`, `[Multipart.ByteRanges](../../javadsl/model/Multipart.ByteRanges.html "interface in akka.http.javadsl.model")`, `[Multipart.ByteRanges.Strict](../../javadsl/model/Multipart.ByteRanges.Strict.html "interface in akka.http.javadsl.model")`, `[Multipart.Strict](../../javadsl/model/Multipart.Strict.html "interface in akka.http.javadsl.model")`, `[Multipart](Multipart.html "interface in akka.http.scaladsl.model")`, `[Multipart.Strict](Multipart.Strict.html "interface in akka.http.scaladsl.model")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Multipart.ByteRanges$](Multipart.ByteRanges$.html "class in akka.http.scaladsl.model")

---

```
public static class Multipart.ByteRanges$.Strict
extends [Multipart.ByteRanges](Multipart.ByteRanges.html "class in akka.http.scaladsl.model")
implements [Multipart.Strict](Multipart.Strict.html "interface in akka.http.scaladsl.model"), [Multipart.ByteRanges.Strict](../../javadsl/model/Multipart.ByteRanges.Strict.html "interface in akka.http.javadsl.model"), scala.Product, java.io.Serializable
```

Strict `ByteRanges`.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.Multipart.ByteRanges$.Strict)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[Multipart](../../javadsl/model/Multipart.html "interface in akka.http.javadsl.model")
		
		
		`[Multipart.BodyPart](../../javadsl/model/Multipart.BodyPart.html "interface in akka.http.javadsl.model"), [Multipart.ByteRanges](../../javadsl/model/Multipart.ByteRanges.html "interface in akka.http.javadsl.model"), [Multipart.FormData](../../javadsl/model/Multipart.FormData.html "interface in akka.http.javadsl.model"), [Multipart.General](../../javadsl/model/Multipart.General.html "interface in akka.http.javadsl.model"), [Multipart.Strict](../../javadsl/model/Multipart.Strict.html "interface in akka.http.javadsl.model")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.model.[Multipart](Multipart.html "interface in akka.http.scaladsl.model")
		
		
		`[Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.scaladsl.model"), [Multipart.BodyPart$](Multipart.BodyPart$.html "class in akka.http.scaladsl.model"), [Multipart.ByteRanges](Multipart.ByteRanges.html "class in akka.http.scaladsl.model"), [Multipart.ByteRanges$](Multipart.ByteRanges$.html "class in akka.http.scaladsl.model"), [Multipart.FormData](Multipart.FormData.html "class in akka.http.scaladsl.model"), [Multipart.FormData$](Multipart.FormData$.html "class in akka.http.scaladsl.model"), [Multipart.General](Multipart.General.html "class in akka.http.scaladsl.model"), [Multipart.General$](Multipart.General$.html "class in akka.http.scaladsl.model"), [Multipart.Strict](Multipart.Strict.html "interface in akka.http.scaladsl.model")`
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[Multipart.ByteRanges](../../javadsl/model/Multipart.ByteRanges.html "interface in akka.http.javadsl.model")
		
		
		`[Multipart.ByteRanges.BodyPart](../../javadsl/model/Multipart.ByteRanges.BodyPart.html "interface in akka.http.javadsl.model"), [Multipart.ByteRanges.Strict](../../javadsl/model/Multipart.ByteRanges.Strict.html "interface in akka.http.javadsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Strict](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<akka.http.scaladsl.model.Multipart.ByteRanges.BodyPart.Strict> strictParts)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.javadsl.Source<[Multipart.ByteRanges.BodyPart.Strict](../../javadsl/model/Multipart.ByteRanges.BodyPart.Strict.html "interface in akka.http.javadsl.model"),​java.lang.Object>` | `[getParts](#getParts())()` | Java API |
	| `java.lang.Iterable<[Multipart.ByteRanges.BodyPart.Strict](../../javadsl/model/Multipart.ByteRanges.BodyPart.Strict.html "interface in akka.http.javadsl.model")>` | `[getStrictParts](#getStrictParts())()` | Java API |
	| `akka.stream.scaladsl.Source<akka.http.scaladsl.model.Multipart.ByteRanges.BodyPart.Strict,​java.lang.Object>` | `[parts](#parts())()` | The stream of body parts this content consists of. |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.collection.immutable.Seq<akka.http.scaladsl.model.Multipart.ByteRanges.BodyPart.Strict>` | `[strictParts](#strictParts())()` | The parts of this content as a strict collection. |
	| `scala.concurrent.Future<akka.http.scaladsl.model.Multipart.ByteRanges.Strict>` | `[toStrict](#toStrict(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer))​(scala.concurrent.duration.FiniteDuration timeout,  akka.stream.Materializer fm)` | Converts this content into its strict counterpart. |
	
	
		- ### Methods inherited from class akka.http.scaladsl.model.[Multipart.ByteRanges](Multipart.ByteRanges.html "class in akka.http.scaladsl.model")
		
		
		`[mediaType](Multipart.ByteRanges.html#mediaType()), [toStrict](Multipart.ByteRanges.html#toStrict(long,akka.stream.Materializer))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface akka.http.scaladsl.model.[Multipart](Multipart.html "interface in akka.http.scaladsl.model")
		
		
		`[getMediaType](Multipart.html#getMediaType()), [mediaType](Multipart.html#mediaType()), [toStrict](Multipart.html#toStrict(long,akka.stream.Materializer))`
		- ### Methods inherited from interface akka.http.javadsl.model.[Multipart.ByteRanges](../../javadsl/model/Multipart.ByteRanges.html "interface in akka.http.javadsl.model")
		
		
		`[toStrict](../../javadsl/model/Multipart.ByteRanges.html#toStrict(long,akka.stream.Materializer))`
		- ### Methods inherited from interface akka.http.javadsl.model.[Multipart.Strict](../../javadsl/model/Multipart.Strict.html "interface in akka.http.javadsl.model")
		
		
		`[toEntity](../../javadsl/model/Multipart.Strict.html#toEntity()), [toEntity](../../javadsl/model/Multipart.Strict.html#toEntity(java.lang.String))`
		- ### Methods inherited from interface akka.http.scaladsl.model.[Multipart.Strict](Multipart.Strict.html "interface in akka.http.scaladsl.model")
		
		
		`[toEntity](Multipart.Strict.html#toEntity()), [toEntity](Multipart.Strict.html#toEntity(java.lang.String)), [toEntity](Multipart.Strict.html#toEntity(java.lang.String,akka.event.LoggingAdapter))`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### Strict
		
		
		
		```
		public Strict​(scala.collection.immutable.Seq<akka.http.scaladsl.model.Multipart.ByteRanges.BodyPart.Strict> strictParts)
		```

	- ### Method Detail
	
	
	
		- #### strictParts
		
		
		
		```
		public scala.collection.immutable.Seq<akka.http.scaladsl.model.Multipart.ByteRanges.BodyPart.Strict> strictParts()
		```
		
		Description copied from interface: `[Multipart.Strict](Multipart.Strict.html#strictParts())`
		The parts of this content as a strict collection.
		
		Specified by:
		`[strictParts](Multipart.Strict.html#strictParts())` in interface `[Multipart.Strict](Multipart.Strict.html "interface in akka.http.scaladsl.model")`
		Returns:
		(undocumented)
		- #### parts
		
		
		
		```
		public akka.stream.scaladsl.Source<akka.http.scaladsl.model.Multipart.ByteRanges.BodyPart.Strict,​java.lang.Object> parts()
		```
		
		Description copied from interface: `[Multipart](Multipart.html#parts())`
		The stream of body parts this content consists of.
		
		Specified by:
		`[parts](Multipart.html#parts())` in interface `[Multipart](Multipart.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[parts](Multipart.Strict.html#parts())` in interface `[Multipart.Strict](Multipart.Strict.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[parts](Multipart.ByteRanges.html#parts())` in class `[Multipart.ByteRanges](Multipart.ByteRanges.html "class in akka.http.scaladsl.model")`
		Returns:
		(undocumented)
		- #### toStrict
		
		
		
		```
		public scala.concurrent.Future<akka.http.scaladsl.model.Multipart.ByteRanges.Strict> toStrict​(scala.concurrent.duration.FiniteDuration timeout,
		                                                                                              akka.stream.Materializer fm)
		```
		
		Description copied from interface: `[Multipart](Multipart.html#toStrict(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer))`
		Converts this content into its strict counterpart.
		 The given `timeout` denotes the max time that an individual part must be read in.
		 The Future is failed with an TimeoutException if one part isn't read completely after the given timeout.
		
		Specified by:
		`[toStrict](Multipart.html#toStrict(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer))` in interface `[Multipart](Multipart.html "interface in akka.http.scaladsl.model")`
		Overrides:
		`[toStrict](Multipart.ByteRanges.html#toStrict(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer))` in class `[Multipart.ByteRanges](Multipart.ByteRanges.html "class in akka.http.scaladsl.model")`
		Parameters:
		`timeout` \- (undocumented)
		`fm` \- (undocumented)
		Returns:
		(undocumented)
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### getParts
		
		
		
		```
		public akka.stream.javadsl.Source<[Multipart.ByteRanges.BodyPart.Strict](../../javadsl/model/Multipart.ByteRanges.BodyPart.Strict.html "interface in akka.http.javadsl.model"),​java.lang.Object> getParts()
		```
		
		Java API
		
		Specified by:
		`[getParts](../../javadsl/model/Multipart.html#getParts())` in interface `[Multipart](../../javadsl/model/Multipart.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getParts](Multipart.html#getParts())` in interface `[Multipart](Multipart.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[getParts](../../javadsl/model/Multipart.ByteRanges.html#getParts())` in interface `[Multipart.ByteRanges](../../javadsl/model/Multipart.ByteRanges.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getParts](../../javadsl/model/Multipart.ByteRanges.Strict.html#getParts())` in interface `[Multipart.ByteRanges.Strict](../../javadsl/model/Multipart.ByteRanges.Strict.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getParts](../../javadsl/model/Multipart.Strict.html#getParts())` in interface `[Multipart.Strict](../../javadsl/model/Multipart.Strict.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getParts](Multipart.Strict.html#getParts())` in interface `[Multipart.Strict](Multipart.Strict.html "interface in akka.http.scaladsl.model")`
		Overrides:
		`[getParts](Multipart.ByteRanges.html#getParts())` in class `[Multipart.ByteRanges](Multipart.ByteRanges.html "class in akka.http.scaladsl.model")`
		- #### getStrictParts
		
		
		
		```
		public java.lang.Iterable<[Multipart.ByteRanges.BodyPart.Strict](../../javadsl/model/Multipart.ByteRanges.BodyPart.Strict.html "interface in akka.http.javadsl.model")> getStrictParts()
		```
		
		Java API
		
		Specified by:
		`[getStrictParts](../../javadsl/model/Multipart.ByteRanges.Strict.html#getStrictParts())` in interface `[Multipart.ByteRanges.Strict](../../javadsl/model/Multipart.ByteRanges.Strict.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getStrictParts](../../javadsl/model/Multipart.Strict.html#getStrictParts())` in interface `[Multipart.Strict](../../javadsl/model/Multipart.Strict.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getStrictParts](Multipart.Strict.html#getStrictParts())` in interface `[Multipart.Strict](Multipart.Strict.html "interface in akka.http.scaladsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.BodyPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.ByteRanges.BodyPart.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.ByteRanges.BodyPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.ByteRanges.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.ByteRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.General.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.BodyPart$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.BodyPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.ByteRanges$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.ByteRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.FormData$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.General$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.General.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.ByteRanges$.Strict.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.ByteRanges$.Strict.html)*