---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:32:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Trailer.html
title: Trailer
---

# Trailer

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class Trailer

- java.lang.Object
- - akka.http.scaladsl.model.Trailer

- All Implemented Interfaces:
`[Trailer](../../javadsl/model/Trailer.html "interface in akka.http.javadsl.model")`

---

```
public class Trailer
extends java.lang.Object
implements [Trailer](../../javadsl/model/Trailer.html "interface in akka.http.javadsl.model")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Trailer](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> headers)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Trailer](Trailer.html "class in akka.http.scaladsl.model")` | `[addHeader](#addHeader(akka.http.javadsl.model.HttpHeader))​([HttpHeader](../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model") header)` | Java API |
	| `[Trailer](Trailer.html "class in akka.http.scaladsl.model")` | `[addHeaders](#addHeaders(scala.collection.Iterable))​(scala.collection.Iterable<[HttpHeader](../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")> headers)` | Java API |
	| `static [Trailer](Trailer.html "class in akka.http.scaladsl.model")` | `[apply](#apply())()` |  |
	| `static [Trailer](Trailer.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.HttpHeader))​([HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model") header)` |  |
	| `static [Trailer](Trailer.html "class in akka.http.scaladsl.model")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers)` |  |
	| `scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[headers](#headers())()` |  |
	| `[Trailer](Trailer.html "class in akka.http.scaladsl.model")` | `[withHeaders](#withHeaders(scala.collection.Iterable))​(scala.collection.Iterable<[HttpHeader](../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")> headers)` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Trailer
		
		
		
		```
		public Trailer​(scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> headers)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Trailer](Trailer.html "class in akka.http.scaladsl.model") apply()
		```
		- #### apply
		
		
		
		```
		public static [Trailer](Trailer.html "class in akka.http.scaladsl.model") apply​([HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model") header)
		```
		- #### apply
		
		
		
		```
		public static [Trailer](Trailer.html "class in akka.http.scaladsl.model") apply​(scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers)
		```
		- #### headers
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> headers()
		```
		- #### addHeader
		
		
		
		```
		public [Trailer](Trailer.html "class in akka.http.scaladsl.model") addHeader​([HttpHeader](../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model") header)
		```
		
		Java API
		
		Specified by:
		`[addHeader](../../javadsl/model/Trailer.html#addHeader(akka.http.javadsl.model.HttpHeader))` in interface `[Trailer](../../javadsl/model/Trailer.html "interface in akka.http.javadsl.model")`
		Parameters:
		`header` \- (undocumented)
		Returns:
		(undocumented)
		- #### addHeaders
		
		
		
		```
		public [Trailer](Trailer.html "class in akka.http.scaladsl.model") addHeaders​(scala.collection.Iterable<[HttpHeader](../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")> headers)
		```
		
		Java API
		
		Specified by:
		`[addHeaders](../../javadsl/model/Trailer.html#addHeaders(scala.collection.Iterable))` in interface `[Trailer](../../javadsl/model/Trailer.html "interface in akka.http.javadsl.model")`
		Parameters:
		`headers` \- (undocumented)
		Returns:
		(undocumented)
		- #### withHeaders
		
		
		
		```
		public [Trailer](Trailer.html "class in akka.http.scaladsl.model") withHeaders​(scala.collection.Iterable<[HttpHeader](../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")> headers)
		```
		
		Java API
		
		Specified by:
		`[withHeaders](../../javadsl/model/Trailer.html#withHeaders(scala.collection.Iterable))` in interface `[Trailer](../../javadsl/model/Trailer.html "interface in akka.http.javadsl.model")`
		Parameters:
		`headers` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Trailer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Trailer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Trailer.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Trailer.html)*