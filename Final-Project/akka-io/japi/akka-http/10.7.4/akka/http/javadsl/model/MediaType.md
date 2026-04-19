---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.WithFixedCharset.html
title: MediaType.WithFixedCharset
---

# MediaType.WithFixedCharset

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Interface MediaType.WithFixedCharset

- All Superinterfaces:
`[MediaType](MediaType.html "interface in akka.http.javadsl.model")`, `[MediaType.NonBinary](MediaType.NonBinary.html "interface in akka.http.javadsl.model")`

All Known Implementing Classes:
`[MediaType.WithFixedCharset](../../scaladsl/model/MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model")`

Enclosing interface:
[MediaType](MediaType.html "interface in akka.http.javadsl.model")

---

```
public static interface MediaType.WithFixedCharset
extends [MediaType.NonBinary](MediaType.NonBinary.html "interface in akka.http.javadsl.model")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[MediaType](MediaType.html "interface in akka.http.javadsl.model")
		
		
		`[MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model"), [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model"), [MediaType.Multipart](MediaType.Multipart.html "interface in akka.http.javadsl.model"), [MediaType.NonBinary](MediaType.NonBinary.html "interface in akka.http.javadsl.model"), [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model"), [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[toContentType](#toContentType())()` | Turns the media type into a content type with a fixed, known charset. |
	
	
		- ### Methods inherited from interface akka.http.javadsl.model.[MediaType](MediaType.html "interface in akka.http.javadsl.model")
		
		
		`[binary](MediaType.html#binary()), [isApplication](MediaType.html#isApplication()), [isAudio](MediaType.html#isAudio()), [isCompressible](MediaType.html#isCompressible()), [isImage](MediaType.html#isImage()), [isMessage](MediaType.html#isMessage()), [isMultipart](MediaType.html#isMultipart()), [isText](MediaType.html#isText()), [isVideo](MediaType.html#isVideo()), [mainType](MediaType.html#mainType()), [subType](MediaType.html#subType()), [toRange](MediaType.html#toRange()), [toRange](MediaType.html#toRange(float))`

- - ### Method Detail
	
	
	
		- #### toContentType
		
		
		
		```
		[ContentType.WithFixedCharset](ContentType.WithFixedCharset.html "interface in akka.http.javadsl.model") toContentType()
		```
		
		Turns the media type into a content type with a fixed, known charset.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.Compressibility.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.Multipart.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.NonBinary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.WithFixedCharset.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.WithFixedCharset.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.WithFixedCharset.html)*