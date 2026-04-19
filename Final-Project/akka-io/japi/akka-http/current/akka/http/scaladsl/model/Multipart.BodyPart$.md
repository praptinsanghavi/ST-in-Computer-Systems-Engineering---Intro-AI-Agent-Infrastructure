---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.BodyPart$.Strict.html
title: Multipart.BodyPart$.Strict
---

# Multipart.BodyPart$.Strict

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Interface Multipart.BodyPart$.Strict

- All Superinterfaces:
`[Multipart.BodyPart](../../javadsl/model/Multipart.BodyPart.html "interface in akka.http.javadsl.model")`, `[Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.scaladsl.model")`, `[Multipart.BodyPart.Strict](../../javadsl/model/Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model")`

Enclosing class:
[Multipart.BodyPart$](Multipart.BodyPart$.html "class in akka.http.scaladsl.model")

---

```
public static interface Multipart.BodyPart$.Strict
extends [Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.scaladsl.model"), [Multipart.BodyPart.Strict](../../javadsl/model/Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model")
```

A [`Multipart.BodyPart`](Multipart.BodyPart.html "interface in akka.http.scaladsl.model") whose entity has already been loaded in its entirety and is therefore
 full and readily available as a [`HttpEntity.Strict`](HttpEntity.Strict.html "class in akka.http.scaladsl.model").

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[Multipart.BodyPart](../../javadsl/model/Multipart.BodyPart.html "interface in akka.http.javadsl.model")
		
		
		`[Multipart.BodyPart.Strict](../../javadsl/model/Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model")` | `[entity](#entity())()` | The entity of the part. |
	| `[HttpEntity.Strict](../../javadsl/model/HttpEntity.Strict.html "interface in akka.http.javadsl.model")` | `[getEntity](#getEntity())()` | Java API |
	
	
		- ### Methods inherited from interface akka.http.scaladsl.model.[Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.scaladsl.model")
		
		
		`[contentDispositionHeader](Multipart.BodyPart.html#contentDispositionHeader()), [dispositionParams](Multipart.BodyPart.html#dispositionParams()), [dispositionType](Multipart.BodyPart.html#dispositionType()), [getContentDispositionHeader](Multipart.BodyPart.html#getContentDispositionHeader()), [getDispositionParams](Multipart.BodyPart.html#getDispositionParams()), [getDispositionType](Multipart.BodyPart.html#getDispositionType()), [getHeaders](Multipart.BodyPart.html#getHeaders()), [headers](Multipart.BodyPart.html#headers()), [toStrict](Multipart.BodyPart.html#toStrict(long,akka.stream.Materializer)), [toStrict](Multipart.BodyPart.html#toStrict(scala.concurrent.duration.FiniteDuration,akka.stream.Materializer))`

- - ### Method Detail
	
	
	
		- #### entity
		
		
		
		```
		[HttpEntity.Strict](HttpEntity.Strict.html "class in akka.http.scaladsl.model") entity()
		```
		
		Description copied from interface: `[Multipart.BodyPart](Multipart.BodyPart.html#entity())`
		The entity of the part.
		
		Specified by:
		`[entity](Multipart.BodyPart.html#entity())` in interface `[Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.scaladsl.model")`
		Returns:
		(undocumented)
		- #### getEntity
		
		
		
		```
		[HttpEntity.Strict](../../javadsl/model/HttpEntity.Strict.html "interface in akka.http.javadsl.model") getEntity()
		```
		
		Java API
		
		Specified by:
		`[getEntity](../../javadsl/model/Multipart.BodyPart.html#getEntity())` in interface `[Multipart.BodyPart](../../javadsl/model/Multipart.BodyPart.html "interface in akka.http.javadsl.model")`
		Specified by:
		`[getEntity](Multipart.BodyPart.html#getEntity())` in interface `[Multipart.BodyPart](Multipart.BodyPart.html "interface in akka.http.scaladsl.model")`
		Specified by:
		`[getEntity](../../javadsl/model/Multipart.BodyPart.Strict.html#getEntity())` in interface `[Multipart.BodyPart.Strict](../../javadsl/model/Multipart.BodyPart.Strict.html "interface in akka.http.javadsl.model")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.BodyPart.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Multipart.BodyPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.BodyPart$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.BodyPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.BodyPart$.Strict.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.BodyPart$.Strict.html)*