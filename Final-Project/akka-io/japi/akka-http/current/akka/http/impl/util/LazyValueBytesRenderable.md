---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LazyValueBytesRenderable.html
title: LazyValueBytesRenderable
---

# LazyValueBytesRenderable

## Content

Package [akka.http.impl.util](package-summary.html)
## Interface LazyValueBytesRenderable

- All Superinterfaces:
`[Renderable](Renderable.html "interface in akka.http.impl.util")`

All Known Implementing Classes:
`[HttpEncoding](../../scaladsl/model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")`, `[MediaRanges.PredefinedMediaRange](../../scaladsl/model/MediaRanges.PredefinedMediaRange.html "class in akka.http.scaladsl.model")`, `[MediaType](../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")`, `[MediaType.Binary](../../scaladsl/model/MediaType.Binary.html "class in akka.http.scaladsl.model")`, `[MediaType.Multipart](../../scaladsl/model/MediaType.Multipart.html "class in akka.http.scaladsl.model")`, `[MediaType.NonBinary](../../scaladsl/model/MediaType.NonBinary.html "class in akka.http.scaladsl.model")`, `[MediaType.NonMultipartWithOpenCharset](../../scaladsl/model/MediaType.NonMultipartWithOpenCharset.html "class in akka.http.scaladsl.model")`, `[MediaType.WithFixedCharset](../../scaladsl/model/MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model")`, `[MediaType.WithOpenCharset](../../scaladsl/model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model")`, `[StatusCode](../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model")`, `[StatusCodes.ClientError](../../scaladsl/model/StatusCodes.ClientError.html "class in akka.http.scaladsl.model")`, `[StatusCodes.CustomStatusCode](../../scaladsl/model/StatusCodes.CustomStatusCode.html "class in akka.http.scaladsl.model")`, `[StatusCodes.HttpFailure](../../scaladsl/model/StatusCodes.HttpFailure.html "class in akka.http.scaladsl.model")`, `[StatusCodes.HttpSuccess](../../scaladsl/model/StatusCodes.HttpSuccess.html "class in akka.http.scaladsl.model")`, `[StatusCodes.Informational](../../scaladsl/model/StatusCodes.Informational.html "class in akka.http.scaladsl.model")`, `[StatusCodes.Redirection](../../scaladsl/model/StatusCodes.Redirection.html "class in akka.http.scaladsl.model")`, `[StatusCodes.ServerError](../../scaladsl/model/StatusCodes.ServerError.html "class in akka.http.scaladsl.model")`, `[StatusCodes.Success](../../scaladsl/model/StatusCodes.Success.html "class in akka.http.scaladsl.model")`

---

```
public interface LazyValueBytesRenderable
extends [Renderable](Renderable.html "interface in akka.http.impl.util")
```

INTERNAL API
 
 An entity whose rendering result is cached in an unsynchronized and non\-volatile lazy.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<R extends [Rendering](Rendering.html "interface in akka.http.impl.util")>[Rendering](Rendering.html "interface in akka.http.impl.util")` | `[render](#render(R))​(R r)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `java.lang.String` | `[value](#value())()` |  |
	| `byte[]` | `[valueBytes](#valueBytes())()` |  |

- - ### Method Detail
	
	
	
		- #### render
		
		
		
		```
		<R extends [Rendering](Rendering.html "interface in akka.http.impl.util")> [Rendering](Rendering.html "interface in akka.http.impl.util") render​(R r)
		```
		
		
		Specified by:
		`[render](Renderable.html#render(R))` in interface `[Renderable](Renderable.html "interface in akka.http.impl.util")`
		- #### toString
		
		
		
		```
		java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### value
		
		
		
		```
		java.lang.String value()
		```
		- #### valueBytes
		
		
		
		```
		byte[] valueBytes()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRanges.PredefinedMediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.NonMultipartWithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.ClientError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.CustomStatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.HttpFailure.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.HttpSuccess.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.Informational.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.Redirection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.ServerError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.Success.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LazyValueBytesRenderable.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/LazyValueBytesRenderable.html)*