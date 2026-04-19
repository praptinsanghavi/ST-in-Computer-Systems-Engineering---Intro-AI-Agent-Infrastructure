---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/WithQValue.html
title: WithQValue
---

# WithQValue

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Interface WithQValue\<T\>

- All Known Subinterfaces:
`[LanguageRange](headers/LanguageRange.html "interface in akka.http.scaladsl.model.headers")`

All Known Implementing Classes:
`[HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model")`, `[HttpCharsetRange](HttpCharsetRange.html "class in akka.http.scaladsl.model")`, `[HttpCharsetRange.$times](HttpCharsetRange.$times.html "class in akka.http.scaladsl.model")`, `[HttpCharsetRange.$times$](HttpCharsetRange.$times$.html "class in akka.http.scaladsl.model")`, `[HttpCharsetRange.One](HttpCharsetRange.One.html "class in akka.http.scaladsl.model")`, `[HttpEncoding](headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")`, `[HttpEncodingRange](headers/HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")`, `[HttpEncodingRange.$times](headers/HttpEncodingRange.$times.html "class in akka.http.scaladsl.model.headers")`, `[HttpEncodingRange.$times$](headers/HttpEncodingRange.$times$.html "class in akka.http.scaladsl.model.headers")`, `[HttpEncodingRange.One](headers/HttpEncodingRange.One.html "class in akka.http.scaladsl.model.headers")`, `[Language](headers/Language.html "class in akka.http.scaladsl.model.headers")`, `[LanguageRange.$times](headers/LanguageRange.$times.html "class in akka.http.scaladsl.model.headers")`, `[LanguageRange.$times$](headers/LanguageRange.$times$.html "class in akka.http.scaladsl.model.headers")`, `[LanguageRange.One](headers/LanguageRange.One.html "class in akka.http.scaladsl.model.headers")`, `[MediaRange](MediaRange.html "class in akka.http.scaladsl.model")`, `[MediaRange.One](MediaRange.One.html "class in akka.http.scaladsl.model")`, `[MediaRanges.PredefinedMediaRange](MediaRanges.PredefinedMediaRange.html "class in akka.http.scaladsl.model")`, `[MediaType](MediaType.html "class in akka.http.scaladsl.model")`, `[MediaType.Binary](MediaType.Binary.html "class in akka.http.scaladsl.model")`, `[MediaType.Multipart](MediaType.Multipart.html "class in akka.http.scaladsl.model")`, `[MediaType.NonBinary](MediaType.NonBinary.html "class in akka.http.scaladsl.model")`, `[MediaType.NonMultipartWithOpenCharset](MediaType.NonMultipartWithOpenCharset.html "class in akka.http.scaladsl.model")`, `[MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model")`, `[MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model")`

---

```
public interface WithQValue<T>
```

Helper trait for objects that allow creating new instances with a modified qValue.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[T](WithQValue.html "type parameter in WithQValue")` | `[withQValue](#withQValue(double))​(double qValue)` | truncates Double qValue to float and returns a new instance with this qValue set |
	| `[T](WithQValue.html "type parameter in WithQValue")` | `[withQValue](#withQValue(float))​(float qValue)` |  |

- - ### Method Detail
	
	
	
		- #### withQValue
		
		
		
		```
		[T](WithQValue.html "type parameter in WithQValue") withQValue​(double qValue)
		```
		
		truncates Double qValue to float and returns a new instance with this qValue set
		- #### withQValue
		
		
		
		```
		[T](WithQValue.html "type parameter in WithQValue") withQValue​(float qValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.$times$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.$times.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.One.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.One.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRanges.PredefinedMediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.NonMultipartWithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/WithQValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodingRange.$times$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodingRange.$times.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodingRange.One.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodingRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Language.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LanguageRange.$times$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LanguageRange.$times.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LanguageRange.One.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LanguageRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/WithQValue.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/WithQValue.html)*