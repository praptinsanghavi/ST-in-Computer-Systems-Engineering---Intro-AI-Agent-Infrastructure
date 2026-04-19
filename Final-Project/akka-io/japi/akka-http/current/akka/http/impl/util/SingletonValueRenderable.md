---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SingletonValueRenderable.html
title: SingletonValueRenderable
---

# SingletonValueRenderable

## Content

Package [akka.http.impl.util](package-summary.html)
## Interface SingletonValueRenderable

- All Superinterfaces:
`scala.Equals`, `scala.Product`, `[Renderable](Renderable.html "interface in akka.http.impl.util")`

All Known Implementing Classes:
`[CacheDirectives.immutableDirective$](../../scaladsl/model/headers/CacheDirectives.immutableDirective$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.must$minusrevalidate$](../../scaladsl/model/headers/CacheDirectives.must$minusrevalidate$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.no$minuscache$](../../scaladsl/model/headers/CacheDirectives.no$minuscache$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.no$minusstore$](../../scaladsl/model/headers/CacheDirectives.no$minusstore$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.no$minustransform$](../../scaladsl/model/headers/CacheDirectives.no$minustransform$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.only$minusif$minuscached$](../../scaladsl/model/headers/CacheDirectives.only$minusif$minuscached$.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.proxy$minusrevalidate$](../../scaladsl/model/headers/CacheDirectives.proxy$minusrevalidate$.html "class in akka.http.scaladsl.model.headers")`, `[ContentDispositionTypes.attachment$](../../scaladsl/model/headers/ContentDispositionTypes.attachment$.html "class in akka.http.scaladsl.model.headers")`, `[ContentDispositionTypes.form$minusdata$](../../scaladsl/model/headers/ContentDispositionTypes.form$minusdata$.html "class in akka.http.scaladsl.model.headers")`, `[ContentDispositionTypes.inline$](../../scaladsl/model/headers/ContentDispositionTypes.inline$.html "class in akka.http.scaladsl.model.headers")`, `[ContentDispositionTypes.Predefined](../../scaladsl/model/headers/ContentDispositionTypes.Predefined.html "class in akka.http.scaladsl.model.headers")`, `[ContentType.$u003B$u0020charset$eq$](../../scaladsl/model/ContentType.$u003B$u0020charset$eq$.html "class in akka.http.scaladsl.model")`, `[HttpCharset](../../scaladsl/model/HttpCharset.html "class in akka.http.scaladsl.model")`, `[HttpMethod](../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model")`, `[HttpProtocol](../../scaladsl/model/HttpProtocol.html "class in akka.http.scaladsl.model")`, `[Rendering.$u002C$u0020$](Rendering.$u002C$u0020$.html "class in akka.http.impl.util")`, `[TransferEncodings.chunked$](../../scaladsl/model/TransferEncodings.chunked$.html "class in akka.http.scaladsl.model")`, `[TransferEncodings.compress$](../../scaladsl/model/TransferEncodings.compress$.html "class in akka.http.scaladsl.model")`, `[TransferEncodings.deflate$](../../scaladsl/model/TransferEncodings.deflate$.html "class in akka.http.scaladsl.model")`, `[TransferEncodings.gzip$](../../scaladsl/model/TransferEncodings.gzip$.html "class in akka.http.scaladsl.model")`, `[TransferEncodings.Predefined](../../scaladsl/model/TransferEncodings.Predefined.html "class in akka.http.scaladsl.model")`, `[TransferEncodings.trailers$](../../scaladsl/model/TransferEncodings.trailers$.html "class in akka.http.scaladsl.model")`

---

```
public interface SingletonValueRenderable
extends scala.Product, [Renderable](Renderable.html "interface in akka.http.impl.util")
```

INTERNAL API
 
 An entity whose rendering result is determined eagerly at instantiation (and then is cached).
 Useful for common predefined singleton values.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<R extends [Rendering](Rendering.html "interface in akka.http.impl.util")>[Rendering](Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `java.lang.String` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Method Detail
	
	
	
		- #### render
		
		
		
		```
		<R extends [Rendering](Rendering.html "interface in akka.http.impl.util")> [Rendering](Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](Renderable.html#render(R))` in interface `[Renderable](Renderable.html "interface in akka.http.impl.util")`
		- #### value
		
		
		
		```
		java.lang.String value()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.$u002C$u0020$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.$u003B$u0020charset$eq$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncodings.Predefined.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncodings.chunked$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncodings.compress$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncodings.deflate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncodings.gzip$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/TransferEncodings.trailers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.immutableDirective$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.must$minusrevalidate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.no$minuscache$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.no$minusstore$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.no$minustransform$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.only$minusif$minuscached$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.proxy$minusrevalidate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ContentDispositionTypes.Predefined.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ContentDispositionTypes.attachment$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ContentDispositionTypes.form$minusdata$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ContentDispositionTypes.inline$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SingletonValueRenderable.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SingletonValueRenderable.html)*