---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.Strict.html
title: Multipart.Strict
---

# Multipart.Strict

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Interface Multipart.Strict

- All Superinterfaces:
`[Multipart](Multipart.html "interface in akka.http.javadsl.model")`

All Known Subinterfaces:
`[Multipart.ByteRanges.Strict](Multipart.ByteRanges.Strict.html "interface in akka.http.javadsl.model")`, `[Multipart.FormData.Strict](Multipart.FormData.Strict.html "interface in akka.http.javadsl.model")`, `[Multipart.General.Strict](Multipart.General.Strict.html "interface in akka.http.javadsl.model")`, `[Multipart.Strict](../../scaladsl/model/Multipart.Strict.html "interface in akka.http.scaladsl.model")`

All Known Implementing Classes:
`[Multipart.ByteRanges$.Strict](../../scaladsl/model/Multipart.ByteRanges$.Strict.html "class in akka.http.scaladsl.model")`, `[Multipart.FormData$.Strict](../../scaladsl/model/Multipart.FormData$.Strict.html "class in akka.http.scaladsl.model")`, `[Multipart.General$.Strict](../../scaladsl/model/Multipart.General$.Strict.html "class in akka.http.scaladsl.model")`

Enclosing interface:
[Multipart](Multipart.html "interface in akka.http.javadsl.model")

---

```
public static interface Multipart.Strict
extends [Multipart](Multipart.html "interface in akka.http.javadsl.model")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[Multipart](Multipart.html "interface in akka.http.javadsl.model")
		
		
		`[Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.javadsl.model"), [Multipart.ByteRanges](Multipart.ByteRanges.html "interface in akka.http.javadsl.model"), [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model"), [Multipart.General](Multipart.General.html "interface in akka.http.javadsl.model"), [Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.javadsl.Source<? extends [Multipart.BodyPart.Strict](Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model"),​java.lang.Object>` | `[getParts](#getParts())()` |  |
	| `java.lang.Iterable<? extends [Multipart.BodyPart.Strict](Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model")>` | `[getStrictParts](#getStrictParts())()` |  |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")` | `[toEntity](#toEntity())()` | Creates an entity from this multipart object using a random boundary. |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")` | `[toEntity](#toEntity(java.lang.String))​(java.lang.String boundary)` | Creates an entity from this multipart object using the specified boundary. |
	
	
		- ### Methods inherited from interface akka.http.javadsl.model.[Multipart](Multipart.html "interface in akka.http.javadsl.model")
		
		
		`[getMediaType](Multipart.html#getMediaType()), [toStrict](Multipart.html#toStrict(long,akka.stream.Materializer))`

- - ### Method Detail
	
	
	
		- #### getParts
		
		
		
		```
		akka.stream.javadsl.Source<? extends [Multipart.BodyPart.Strict](Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model"),​java.lang.Object> getParts()
		```
		
		
		Specified by:
		`[getParts](Multipart.html#getParts())` in interface `[Multipart](Multipart.html "interface in akka.http.javadsl.model")`
		- #### getStrictParts
		
		
		
		```
		java.lang.Iterable<? extends [Multipart.BodyPart.Strict](Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model")> getStrictParts()
		```
		- #### toEntity
		
		
		
		```
		[HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") toEntity​(java.lang.String boundary)
		```
		
		Creates an entity from this multipart object using the specified boundary.
		
		Specified by:
		`[toEntity](Multipart.html#toEntity(java.lang.String))` in interface `[Multipart](Multipart.html "interface in akka.http.javadsl.model")`
		- #### toEntity
		
		
		
		```
		[HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") toEntity()
		```
		
		Creates an entity from this multipart object using a random boundary.
		
		Specified by:
		`[toEntity](Multipart.html#toEntity())` in interface `[Multipart](Multipart.html "interface in akka.http.javadsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.BodyPart.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.BodyPart.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.ByteRanges.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.ByteRanges.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.FormData.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.FormData.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.General.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.General.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Multipart.ByteRanges$.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Multipart.FormData$.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Multipart.General$.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Multipart.Strict.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.Strict.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.Strict.html)*