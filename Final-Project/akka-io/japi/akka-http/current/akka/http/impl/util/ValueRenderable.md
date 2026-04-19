---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html
title: ValueRenderable
---

# ValueRenderable

## Content

Package [akka.http.impl.util](package-summary.html)
## Interface ValueRenderable

- All Superinterfaces:
`[Renderable](Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](ToStringRenderable.html "interface in akka.http.impl.util")`

All Known Subinterfaces:
`[ByteContentRange](../../scaladsl/model/ByteContentRange.html "interface in akka.http.scaladsl.model")`, `[ContentRange](../../scaladsl/model/ContentRange.html "interface in akka.http.scaladsl.model")`, `[ContentType](../../scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model")`, `[ContentType.NonBinary](../../scaladsl/model/ContentType.NonBinary.html "interface in akka.http.scaladsl.model")`, `[LanguageRange](../../scaladsl/model/headers/LanguageRange.html "interface in akka.http.scaladsl.model.headers")`

All Known Implementing Classes:
`[BasicHttpCredentials](../../javadsl/model/headers/BasicHttpCredentials.html "class in akka.http.javadsl.model.headers")`, `[BasicHttpCredentials](../../scaladsl/model/headers/BasicHttpCredentials.html "class in akka.http.scaladsl.model.headers")`, `[ByteRange](../../scaladsl/model/headers/ByteRange.html "class in akka.http.scaladsl.model.headers")`, `[ByteRange.FromOffset](../../scaladsl/model/headers/ByteRange.FromOffset.html "class in akka.http.scaladsl.model.headers")`, `[ByteRange.Slice](../../scaladsl/model/headers/ByteRange.Slice.html "class in akka.http.scaladsl.model.headers")`, `[ByteRange.Suffix](../../scaladsl/model/headers/ByteRange.Suffix.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirective.CustomCacheDirective](../../scaladsl/model/headers/CacheDirective.CustomCacheDirective.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirective.FieldNamesDirective](../../scaladsl/model/headers/CacheDirective.FieldNamesDirective.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.max$minusage](../../scaladsl/model/headers/CacheDirectives.max$minusage.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.max$minusstale](../../scaladsl/model/headers/CacheDirectives.max$minusstale.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.min$minusfresh](../../scaladsl/model/headers/CacheDirectives.min$minusfresh.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.no$minuscache](../../scaladsl/model/headers/CacheDirectives.no$minuscache.html "class in akka.http.scaladsl.model.headers")`, `[CacheDirectives.s$minusmaxage](../../scaladsl/model/headers/CacheDirectives.s$minusmaxage.html "class in akka.http.scaladsl.model.headers")`, `[ContentRange.Default](../../scaladsl/model/ContentRange.Default.html "class in akka.http.scaladsl.model")`, `[ContentRange.Other](../../scaladsl/model/ContentRange.Other.html "class in akka.http.scaladsl.model")`, `[ContentRange.Unsatisfiable](../../scaladsl/model/ContentRange.Unsatisfiable.html "class in akka.http.scaladsl.model")`, `[ContentType.Binary](../../scaladsl/model/ContentType.Binary.html "class in akka.http.scaladsl.model")`, `[ContentType.WithCharset](../../scaladsl/model/ContentType.WithCharset.html "class in akka.http.scaladsl.model")`, `[ContentType.WithFixedCharset](../../scaladsl/model/ContentType.WithFixedCharset.html "class in akka.http.scaladsl.model")`, `[ContentType.WithMissingCharset](../../scaladsl/model/ContentType.WithMissingCharset.html "class in akka.http.scaladsl.model")`, `[ContentTypeRange](../../scaladsl/model/ContentTypeRange.html "class in akka.http.scaladsl.model")`, `[EntityTag](../../scaladsl/model/headers/EntityTag.html "class in akka.http.scaladsl.model.headers")`, `[EntityTagRange](../../scaladsl/model/headers/EntityTagRange.html "class in akka.http.scaladsl.model.headers")`, `[EntityTagRange.$times$](../../scaladsl/model/headers/EntityTagRange.$times$.html "class in akka.http.scaladsl.model.headers")`, `[EntityTagRange.Default](../../scaladsl/model/headers/EntityTagRange.Default.html "class in akka.http.scaladsl.model.headers")`, `[GenericHttpCredentials](../../scaladsl/model/headers/GenericHttpCredentials.html "class in akka.http.scaladsl.model.headers")`, `[HttpChallenge](../../scaladsl/model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers")`, `[HttpCharsetRange](../../scaladsl/model/HttpCharsetRange.html "class in akka.http.scaladsl.model")`, `[HttpCharsetRange.$times](../../scaladsl/model/HttpCharsetRange.$times.html "class in akka.http.scaladsl.model")`, `[HttpCharsetRange.$times$](../../scaladsl/model/HttpCharsetRange.$times$.html "class in akka.http.scaladsl.model")`, `[HttpCharsetRange.One](../../scaladsl/model/HttpCharsetRange.One.html "class in akka.http.scaladsl.model")`, `[HttpCredentials](../../scaladsl/model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers")`, `[HttpEncodingRange](../../scaladsl/model/headers/HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")`, `[HttpEncodingRange.$times](../../scaladsl/model/headers/HttpEncodingRange.$times.html "class in akka.http.scaladsl.model.headers")`, `[HttpEncodingRange.$times$](../../scaladsl/model/headers/HttpEncodingRange.$times$.html "class in akka.http.scaladsl.model.headers")`, `[HttpEncodingRange.One](../../scaladsl/model/headers/HttpEncodingRange.One.html "class in akka.http.scaladsl.model.headers")`, `[HttpOrigin](../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")`, `[HttpOriginRange](../../scaladsl/model/headers/HttpOriginRange.html "class in akka.http.scaladsl.model.headers")`, `[HttpOriginRange.$times$](../../scaladsl/model/headers/HttpOriginRange.$times$.html "class in akka.http.scaladsl.model.headers")`, `[HttpOriginRange.Default](../../scaladsl/model/headers/HttpOriginRange.Default.html "class in akka.http.scaladsl.model.headers")`, `[Language](../../scaladsl/model/headers/Language.html "class in akka.http.scaladsl.model.headers")`, `[LanguageRange.$times](../../scaladsl/model/headers/LanguageRange.$times.html "class in akka.http.scaladsl.model.headers")`, `[LanguageRange.$times$](../../scaladsl/model/headers/LanguageRange.$times$.html "class in akka.http.scaladsl.model.headers")`, `[LanguageRange.One](../../scaladsl/model/headers/LanguageRange.One.html "class in akka.http.scaladsl.model.headers")`, `[LinkValue](../../scaladsl/model/headers/LinkValue.html "class in akka.http.scaladsl.model.headers")`, `[MediaRange.One](../../scaladsl/model/MediaRange.One.html "class in akka.http.scaladsl.model")`, `[OAuth2BearerToken](../../javadsl/model/headers/OAuth2BearerToken.html "class in akka.http.javadsl.model.headers")`, `[OAuth2BearerToken](../../scaladsl/model/headers/OAuth2BearerToken.html "class in akka.http.scaladsl.model.headers")`, `[ProductVersion](../../scaladsl/model/headers/ProductVersion.html "class in akka.http.scaladsl.model.headers")`, `[RangeUnit](../../scaladsl/model/headers/RangeUnit.html "class in akka.http.scaladsl.model.headers")`, `[RangeUnits.Bytes$](../../scaladsl/model/headers/RangeUnits.Bytes$.html "class in akka.http.scaladsl.model.headers")`, `[RangeUnits.Other](../../scaladsl/model/headers/RangeUnits.Other.html "class in akka.http.scaladsl.model.headers")`, `[RemoteAddress](../../scaladsl/model/RemoteAddress.html "class in akka.http.scaladsl.model")`, `[RemoteAddress.IP](../../scaladsl/model/RemoteAddress.IP.html "class in akka.http.scaladsl.model")`, `[RemoteAddress.Unknown$](../../scaladsl/model/RemoteAddress.Unknown$.html "class in akka.http.scaladsl.model")`, `[UpgradeProtocol](../../scaladsl/model/headers/UpgradeProtocol.html "class in akka.http.scaladsl.model.headers")`, `[WebSocketExtension](../../scaladsl/model/headers/WebSocketExtension.html "class in akka.http.scaladsl.model.headers")`

---

```
public interface ValueRenderable
extends [ToStringRenderable](ToStringRenderable.html "interface in akka.http.impl.util")
```

INTERNAL API
 
 An entity that has a rendered value (like an HttpHeader)

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from interface akka.http.impl.util.[Renderable](Renderable.html "interface in akka.http.impl.util")
		
		
		`[render](Renderable.html#render(R))`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](ToStringRenderable.html#toString())`

- - ### Method Detail
	
	
	
		- #### value
		
		
		
		```
		java.lang.String value()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/BasicHttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/OAuth2BearerToken.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ByteContentRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Default.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Other.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.Unsatisfiable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.WithMissingCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.$times$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.$times.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.One.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.One.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.IP.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.Unknown$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/BasicHttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange.FromOffset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange.Slice.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange.Suffix.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.CustomCacheDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirective.FieldNamesDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.max$minusage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.max$minusstale.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.min$minusfresh.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.no$minuscache.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/CacheDirectives.s$minusmaxage.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTagRange.$times$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTagRange.Default.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTagRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/GenericHttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodingRange.$times$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodingRange.$times.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodingRange.One.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodingRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpOrigin.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpOriginRange.$times$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ValueRenderable.html)*