---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:32:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.General.html
title: Multipart.General
---

# Multipart.General

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class Multipart.General

- java.lang.Object
- - akka.http.scaladsl.model.Multipart.General

- All Implemented Interfaces:
`[Multipart](../../javadsl/model/Multipart.html "interface in akka.http.javadsl.model")`, `[Multipart.General](../../javadsl/model/Multipart.General.html "interface in akka.http.javadsl.model")`, `[Multipart](Multipart.html "interface in akka.http.scaladsl.model")`

Direct Known Subclasses:
`[Multipart.General$.Strict](Multipart.General$.Strict.html "class in akka.http.scaladsl.model")`

Enclosing interface:
[Multipart](Multipart.html "interface in akka.http.scaladsl.model")

---

```
public abstract static class Multipart.General
extends java.lang.Object
implements [Multipart](Multipart.html "interface in akka.http.scaladsl.model"), [Multipart.General](../../javadsl/model/Multipart.General.html "interface in akka.http.javadsl.model")
```

Basic model for general multipart content as defined by http://tools.ietf.org/html/rfc2046\.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[Multipart](../../javadsl/model/Multipart.html "interface in akka.http.javadsl.model")
		
		
		`[Multipart.ByteRanges](../../javadsl/model/Multipart.ByteRanges.html "interface in akka.http.javadsl.model"), [Multipart.FormData](../../javadsl/model/Multipart.FormData.html "interface in akka.http.javadsl.model"), [Multipart.General](../../javadsl/model/Multipart.General.html "interface in akka.http.javadsl.model")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.model.[Multipart](Multipart.html "interface in akka.http.scaladsl.model")
		
		
		`[Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.scaladsl.model"), [Multipart.BodyPart$](Multipart.BodyPart$.html "class in akka.http.scaladsl.model"), [Multipart.ByteRanges](Multipart.ByteRanges.html "class in akka.http.scaladsl.model"), [Multipart.ByteRanges$](Multipart.ByteRanges$.html "class in akka.http.scaladsl.model"), [Multipart.FormData](Multipart.FormData.html "class in akka.http.scaladsl.model"), [Multipart.FormData$](Multipart.FormData$.html "class in akka.http.scaladsl.model"), [Multipart.General](Multipart.General.html "class in akka.http.scaladsl.model"), [Multipart.General$](Multipart.General$.html "class in akka.http.scaladsl.model"), [Multipart.Strict](Multipart.Strict.html "interface in akka.http.scaladsl.model")`
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[Multipart.General](../../javadsl/model/Multipart.General.html "interface in akka.http.javadsl.model")
		
		
		`[Multipart.General.BodyPart](../../javadsl/model/Multipart.General.BodyPart.html "interface in akka.http.javadsl.model"), [Multipart.General.Strict](../../javadsl/model/Multipart.General.Strict.html "interface in akka.http.javadsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[General](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.javadsl.Source<? extends [Multipart.General.BodyPart](../../javadsl/model/Multipart.General.BodyPart.html "interface in akka.http.javadsl.model"),​java.lang.Object>` | `[getParts](#getParts())()` | Java API |
	| `abstract akka.stream.scaladsl.Source<akka.http.scaladsl.model.Multipart.General.BodyPart,​java.lang.Object>` | `[parts](#parts())()` | The stream of body parts this content consists of. |
	| `java.util.concurrent.CompletionStage<[Multipart.General.Strict](../../javadsl/model/Multipart.General.Strict.html "interface in akka.http.javadsl.model")>` | `[toStrict](#toStrict(long,akka.stream.Materializer))​(long timeoutMillis,  akka.stream.Materializer materializer)` | Java API |
	| `scala.concurrent.Future<akka.http.scaladsl.model.Multipart.General.Strict>` | `[toStrict](#toStrict(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer))​(scala.concurrent.duration.FiniteDuration timeout,  akka.stream.Materializer fm)` | Converts this content into its strict counterpart. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.model.[Multipart](Multipart.html "interface in akka.http.scaladsl.model")
		
		
		`[getMediaType](Multipart.html#getMediaType()), [mediaType](Multipart.html#mediaType()), [toEntity](Multipart.html#toEntity()), [toEntity](Multipart.html#toEntity(java.lang.String)), [toEntity](Multipart.html#toEntity(java.lang.String,akka.event.LoggingAdapter))`

- - ### Constructor Detail
	
	
	
		- #### General
		
		
		
		```
		public General()
		```

	- ### Method Detail
	
	
	
		- #### parts
		
		
		
		```
		public abstract akka.stream.scaladsl.Source<akka.http.scaladsl.model.Multipart.General.BodyPart,​java.lang.Object> parts()
		```
		
		Description copied from interface: `[Multipart](Multipart.html#parts())`
		The stream of body parts this content consists of.
		
		Specified by:
		`[parts](Multipart.html#parts())` in interface `[Multipart](Multipart.html "interface in akka.http.scaladsl.model")`
		Returns:
		(undocumented)
		- #### toStrict
		
		
		
		```
		public scala.concurrent.Future<akka.http.scaladsl.model.Multipart.General.Strict> toStrict​(scala.concurrent.duration.FiniteDuration timeout,
		                                                                                           akka.stream.Materializer fm)
		```
		
		Description copied from interface: `[Multipart](Multipart.html#toStrict(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer))`
		Converts this content into its strict counterpart.
		 The given `timeout` denotes the max time that an individual part must be read in.
		 The Future is failed with an TimeoutException if one part isn't read completely after the given timeout.
		
		Specified by:
		`[toStrict](Multipart.html#toStrict(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer))` in interface `[Multipart](Multipart.html "interface in akka.http.scaladsl.model")`
		Parameters:
		`timeout` \- (undocumented)
		`fm` \- (undocumented)
		Returns:
		(undocumented)
		- #### getParts
		
		
		
		```
		public akka.stream.javadsl.Source<? extends [Multipart.General.BodyPart](../../javadsl/model/Multipart.General.BodyPart.html "interface in akka.http.javadsl.model"),​java.lang.Object> getParts()
		```
		
		Java API
		
		Specified by:
		`[getParts](../../javadsl/model/Multipart.html#getParts())` in interface `[Multipart](../../javadsl/model/Multipart.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getParts](Multipart.html#getParts())` in interface `[Multipart](Multipart.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[getParts](../../javadsl/model/Multipart.General.html#getParts())` in interface `[Multipart.General](../../javadsl/model/Multipart.General.html "interface in akka.http.javadsl.model")`
		- #### toStrict
		
		
		
		```
		public java.util.concurrent.CompletionStage<[Multipart.General.Strict](../../javadsl/model/Multipart.General.Strict.html "interface in akka.http.javadsl.model")> toStrict​(long timeoutMillis,
		                                                                               akka.stream.Materializer materializer)
		```
		
		Java API
		
		Specified by:
		`[toStrict](../../javadsl/model/Multipart.html#toStrict(long,akka.stream.Materializer))` in interface `[Multipart](../../javadsl/model/Multipart.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[toStrict](Multipart.html#toStrict(long,akka.stream.Materializer))` in interface `[Multipart](Multipart.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[toStrict](../../javadsl/model/Multipart.General.html#toStrict(long,akka.stream.Materializer))` in interface `[Multipart.General](../../javadsl/model/Multipart.General.html "interface in akka.http.javadsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.ByteRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.General.BodyPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.General.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.General.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.BodyPart$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.BodyPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.ByteRanges$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.ByteRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.FormData$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.General$.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.General$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.General.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.General.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.General.html)*