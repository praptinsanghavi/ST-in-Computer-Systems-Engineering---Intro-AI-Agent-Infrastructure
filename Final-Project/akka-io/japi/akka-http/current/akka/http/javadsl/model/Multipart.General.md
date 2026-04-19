---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.General.Strict.html
title: Multipart.General.Strict
---

# Multipart.General.Strict

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Interface Multipart.General.Strict

- All Superinterfaces:
`[Multipart](Multipart.html "interface in akka.http.javadsl.model")`, `[Multipart.General](Multipart.General.html "interface in akka.http.javadsl.model")`, `[Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")`

All Known Implementing Classes:
`[Multipart.General$.Strict](../../scaladsl/model/Multipart.General$.Strict.html "class in akka.http.scaladsl.model")`

Enclosing interface:
[Multipart.General](Multipart.General.html "interface in akka.http.javadsl.model")

---

```
public static interface Multipart.General.Strict
extends [Multipart.General](Multipart.General.html "interface in akka.http.javadsl.model"), [Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[Multipart](Multipart.html "interface in akka.http.javadsl.model")
		
		
		`[Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.javadsl.model"), [Multipart.ByteRanges](Multipart.ByteRanges.html "interface in akka.http.javadsl.model"), [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model"), [Multipart.General](Multipart.General.html "interface in akka.http.javadsl.model"), [Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")`
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[Multipart.General](Multipart.General.html "interface in akka.http.javadsl.model")
		
		
		`[Multipart.General.BodyPart](Multipart.General.BodyPart.html "interface in akka.http.javadsl.model"), [Multipart.General.Strict](Multipart.General.Strict.html "interface in akka.http.javadsl.model")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.javadsl.Source<[Multipart.General.BodyPart.Strict](Multipart.General.BodyPart.Strict.html "interface in akka.http.javadsl.model"),​java.lang.Object>` | `[getParts](#getParts())()` |  |
	| `java.lang.Iterable<? extends [Multipart.General.BodyPart.Strict](Multipart.General.BodyPart.Strict.html "interface in akka.http.javadsl.model")>` | `[getStrictParts](#getStrictParts())()` |  |
	
	
		- ### Methods inherited from interface akka.http.javadsl.model.[Multipart](Multipart.html "interface in akka.http.javadsl.model")
		
		
		`[getMediaType](Multipart.html#getMediaType())`
		- ### Methods inherited from interface akka.http.javadsl.model.[Multipart.General](Multipart.General.html "interface in akka.http.javadsl.model")
		
		
		`[toStrict](Multipart.General.html#toStrict(long,akka.stream.Materializer))`
		- ### Methods inherited from interface akka.http.javadsl.model.[Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")
		
		
		`[toEntity](Multipart.Strict.html#toEntity()), [toEntity](Multipart.Strict.html#toEntity(java.lang.String))`

- - ### Method Detail
	
	
	
		- #### getParts
		
		
		
		```
		akka.stream.javadsl.Source<[Multipart.General.BodyPart.Strict](Multipart.General.BodyPart.Strict.html "interface in akka.http.javadsl.model"),​java.lang.Object> getParts()
		```
		
		
		Specified by:
		`[getParts](Multipart.html#getParts())` in interface `[Multipart](Multipart.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getParts](Multipart.General.html#getParts())` in interface `[Multipart.General](Multipart.General.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getParts](Multipart.Strict.html#getParts())` in interface `[Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")`
		- #### getStrictParts
		
		
		
		```
		java.lang.Iterable<? extends [Multipart.General.BodyPart.Strict](Multipart.General.BodyPart.Strict.html "interface in akka.http.javadsl.model")> getStrictParts()
		```
		
		
		Specified by:
		`[getStrictParts](Multipart.Strict.html#getStrictParts())` in interface `[Multipart.Strict](Multipart.Strict.html "interface in akka.http.javadsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.BodyPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.ByteRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.FormData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.General.BodyPart.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.General.BodyPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.General.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.General.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.General$.Strict.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.General.Strict.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.General.Strict.html)*