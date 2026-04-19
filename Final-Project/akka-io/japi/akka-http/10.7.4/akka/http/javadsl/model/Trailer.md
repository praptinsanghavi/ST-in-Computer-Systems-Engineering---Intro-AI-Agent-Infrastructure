---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Trailer.html
title: Trailer
---

# Trailer

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Interface Trailer

- All Known Implementing Classes:
`[Trailer](../../scaladsl/model/Trailer.html "class in akka.http.scaladsl.model")`

---

```
public interface Trailer
```

Trailing headers for HTTP/2 responses

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Trailer](Trailer.html "interface in akka.http.javadsl.model")` | `[addHeader](#addHeader(akka.http.javadsl.model.HttpHeader))​([HttpHeader](HttpHeader.html "class in akka.http.javadsl.model") header)` | Returns a copy of this trailer with the given header added to the list of headers. |
	| `[Trailer](Trailer.html "interface in akka.http.javadsl.model")` | `[addHeaders](#addHeaders(scala.collection.Iterable))​(scala.collection.Iterable<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")> headers)` | Returns a copy of this trailer with the given headers added to the list of headers. |
	| `[Trailer](Trailer.html "interface in akka.http.javadsl.model")` | `[withHeaders](#withHeaders(scala.collection.Iterable))​(scala.collection.Iterable<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")> headers)` | Returns a copy of this trailer with new headers. |

- - ### Method Detail
	
	
	
		- #### addHeader
		
		
		
		```
		[Trailer](Trailer.html "interface in akka.http.javadsl.model") addHeader​([HttpHeader](HttpHeader.html "class in akka.http.javadsl.model") header)
		```
		
		Returns a copy of this trailer with the given header added to the list of headers.
		
		Parameters:
		`header` \- (undocumented)
		Returns:
		(undocumented)
		- #### addHeaders
		
		
		
		```
		[Trailer](Trailer.html "interface in akka.http.javadsl.model") addHeaders​(scala.collection.Iterable<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")> headers)
		```
		
		Returns a copy of this trailer with the given headers added to the list of headers.
		
		Parameters:
		`headers` \- (undocumented)
		Returns:
		(undocumented)
		- #### withHeaders
		
		
		
		```
		[Trailer](Trailer.html "interface in akka.http.javadsl.model") withHeaders​(scala.collection.Iterable<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")> headers)
		```
		
		Returns a copy of this trailer with new headers.
		
		Parameters:
		`headers` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Trailer.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Trailer.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Trailer.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Trailer.html)*