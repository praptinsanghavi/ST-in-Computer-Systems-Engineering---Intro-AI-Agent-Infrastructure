---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.ByteRanges.Strict.html
title: Multipart.ByteRanges.Strict
---

# Multipart.ByteRanges.Strict

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Interface Multipart.ByteRanges.Strict

- All Superinterfaces:
`[Multipart](Multipart.html "interface in akka.http.javadsl.model")`, `[Multipart.ByteRanges](Multipart.ByteRanges.html "interface in akka.http.javadsl.model")`, `[Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")`

All Known Implementing Classes:
`[Multipart.ByteRanges$.Strict](../../scaladsl/model/Multipart.ByteRanges$.Strict.html "class in akka.http.scaladsl.model")`

Enclosing interface:
[Multipart.ByteRanges](Multipart.ByteRanges.html "interface in akka.http.javadsl.model")

---

```
public static interface Multipart.ByteRanges.Strict
extends [Multipart.ByteRanges](Multipart.ByteRanges.html "interface in akka.http.javadsl.model"), [Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[Multipart](Multipart.html "interface in akka.http.javadsl.model")
		
		
		`[Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.javadsl.model"), [Multipart.ByteRanges](Multipart.ByteRanges.html "interface in akka.http.javadsl.model"), [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model"), [Multipart.General](Multipart.General.html "interface in akka.http.javadsl.model"), [Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")`
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[Multipart.ByteRanges](Multipart.ByteRanges.html "interface in akka.http.javadsl.model")
		
		
		`[Multipart.ByteRanges.BodyPart](Multipart.ByteRanges.BodyPart.html "interface in akka.http.javadsl.model"), [Multipart.ByteRanges.Strict](Multipart.ByteRanges.Strict.html "interface in akka.http.javadsl.model")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.javadsl.Source<[Multipart.ByteRanges.BodyPart.Strict](Multipart.ByteRanges.BodyPart.Strict.html "interface in akka.http.javadsl.model"),​java.lang.Object>` | `[getParts](#getParts())()` |  |
	| `java.lang.Iterable<? extends [Multipart.ByteRanges.BodyPart.Strict](Multipart.ByteRanges.BodyPart.Strict.html "interface in akka.http.javadsl.model")>` | `[getStrictParts](#getStrictParts())()` |  |
	
	
		- ### Methods inherited from interface akka.http.javadsl.model.[Multipart](Multipart.html "interface in akka.http.javadsl.model")
		
		
		`[getMediaType](Multipart.html#getMediaType())`
		- ### Methods inherited from interface akka.http.javadsl.model.[Multipart.ByteRanges](Multipart.ByteRanges.html "interface in akka.http.javadsl.model")
		
		
		`[toStrict](Multipart.ByteRanges.html#toStrict(long,akka.stream.Materializer))`
		- ### Methods inherited from interface akka.http.javadsl.model.[Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")
		
		
		`[toEntity](Multipart.Strict.html#toEntity()), [toEntity](Multipart.Strict.html#toEntity(java.lang.String))`

- - ### Method Detail
	
	
	
		- #### getParts
		
		
		
		```
		akka.stream.javadsl.Source<[Multipart.ByteRanges.BodyPart.Strict](Multipart.ByteRanges.BodyPart.Strict.html "interface in akka.http.javadsl.model"),​java.lang.Object> getParts()
		```
		
		
		Specified by:
		`[getParts](Multipart.html#getParts())` in interface `[Multipart](Multipart.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getParts](Multipart.ByteRanges.html#getParts())` in interface `[Multipart.ByteRanges](Multipart.ByteRanges.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getParts](Multipart.Strict.html#getParts())` in interface `[Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")`
		- #### getStrictParts
		
		
		
		```
		java.lang.Iterable<? extends [Multipart.ByteRanges.BodyPart.Strict](Multipart.ByteRanges.BodyPart.Strict.html "interface in akka.http.javadsl.model")> getStrictParts()
		```
		
		
		Specified by:
		`[getStrictParts](Multipart.Strict.html#getStrictParts())` in interface `[Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")`

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
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.ByteRanges$.Strict.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.ByteRanges.Strict.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.ByteRanges.Strict.html)*