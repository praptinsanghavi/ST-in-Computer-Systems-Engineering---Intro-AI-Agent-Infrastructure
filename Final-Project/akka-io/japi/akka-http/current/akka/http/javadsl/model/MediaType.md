---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.WithOpenCharset.html
title: MediaType.WithOpenCharset
---

# MediaType.WithOpenCharset

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Interface MediaType.WithOpenCharset

- All Superinterfaces:
`[MediaType](MediaType.html "interface in akka.http.javadsl.model")`, `[MediaType.NonBinary](MediaType.NonBinary.html "interface in akka.http.javadsl.model")`

All Known Implementing Classes:
`[MediaType.NonMultipartWithOpenCharset](../../scaladsl/model/MediaType.NonMultipartWithOpenCharset.html "class in akka.http.scaladsl.model")`, `[MediaType.WithOpenCharset](../../scaladsl/model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model")`

Enclosing interface:
[MediaType](MediaType.html "interface in akka.http.javadsl.model")

---

```
public static interface MediaType.WithOpenCharset
extends [MediaType.NonBinary](MediaType.NonBinary.html "interface in akka.http.javadsl.model")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.javadsl.model.[MediaType](MediaType.html "interface in akka.http.javadsl.model")
		
		
		`[MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model"), [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model"), [MediaType.Multipart](MediaType.Multipart.html "interface in akka.http.javadsl.model"), [MediaType.NonBinary](MediaType.NonBinary.html "interface in akka.http.javadsl.model"), [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model"), [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model")` | `[toContentType](#toContentType(akka.http.javadsl.model.HttpCharset))​([HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset)` | Turns the media type into a content type with the given charset. |
	| `[ContentType.WithMissingCharset](ContentType.WithMissingCharset.html "interface in akka.http.javadsl.model")` | `[toContentTypeWithMissingCharset](#toContentTypeWithMissingCharset())()` | Turns the media type into a content type without specifying a charset. |
	
	
		- ### Methods inherited from interface akka.http.javadsl.model.[MediaType](MediaType.html "interface in akka.http.javadsl.model")
		
		
		`[binary](MediaType.html#binary()), [isApplication](MediaType.html#isApplication()), [isAudio](MediaType.html#isAudio()), [isCompressible](MediaType.html#isCompressible()), [isImage](MediaType.html#isImage()), [isMessage](MediaType.html#isMessage()), [isMultipart](MediaType.html#isMultipart()), [isText](MediaType.html#isText()), [isVideo](MediaType.html#isVideo()), [mainType](MediaType.html#mainType()), [subType](MediaType.html#subType()), [toRange](MediaType.html#toRange()), [toRange](MediaType.html#toRange(float))`

- - ### Method Detail
	
	
	
		- #### toContentType
		
		
		
		```
		[ContentType.WithCharset](ContentType.WithCharset.html "interface in akka.http.javadsl.model") toContentType​([HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset)
		```
		
		Turns the media type into a content type with the given charset.
		
		Parameters:
		`charset` \- (undocumented)
		Returns:
		(undocumented)
		- #### toContentTypeWithMissingCharset
		
		
		
		```
		[ContentType.WithMissingCharset](ContentType.WithMissingCharset.html "interface in akka.http.javadsl.model") toContentTypeWithMissingCharset()
		```
		
		Turns the media type into a content type without specifying a charset.
		 
		 This is generally NOT what you want, since you're hiding the actual character encoding of your content, making
		 decoding it possibly ambiguous.
		 
		
		
		 Consider using toContentType(charset: HttpCharset) instead.
		
		
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.WithCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.WithMissingCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.Compressibility.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.NonMultipartWithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.WithOpenCharset.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.WithOpenCharset.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.WithOpenCharset.html)*