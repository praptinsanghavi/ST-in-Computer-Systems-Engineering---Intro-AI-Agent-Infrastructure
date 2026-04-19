---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives$.html
title: CodingDirectives$
---

# CodingDirectives$

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class CodingDirectives$

- java.lang.Object
- - akka.http.scaladsl.server.directives.CodingDirectives$

- All Implemented Interfaces:
`[CodingDirectives](CodingDirectives.html "interface in akka.http.scaladsl.server.directives")`

---

```
public class CodingDirectives$
extends java.lang.Object
implements [CodingDirectives](CodingDirectives.html "interface in akka.http.scaladsl.server.directives")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CodingDirectives$](CodingDirectives$.html "class in akka.http.scaladsl.server.directives")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CodingDirectives$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[Coder](../../coding/Coder.html "interface in akka.http.scaladsl.coding")>` | `[DefaultCoders](#DefaultCoders())()` |  |
	| `scala.collection.immutable.Seq<[Coder](../../coding/Coder.html "interface in akka.http.scaladsl.coding")>` | `[DefaultEncodeResponseEncoders](#DefaultEncodeResponseEncoders())()` |  |
	| `<T> scala.collection.immutable.Seq<T>` | `[theseOrDefault](#theseOrDefault(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<T> these)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[CodingDirectives](CodingDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[decodeRequest](CodingDirectives.html#decodeRequest()), [decodeRequestWith](CodingDirectives.html#decodeRequestWith(akka.http.scaladsl.coding.Decoder)), [decodeRequestWith](CodingDirectives.html#decodeRequestWith(scala.collection.immutable.Seq)), [encodeResponse](CodingDirectives.html#encodeResponse()), [encodeResponseWith](CodingDirectives.html#encodeResponseWith(akka.http.scaladsl.coding.Encoder,scala.collection.immutable.Seq)), [requestEncodedWith](CodingDirectives.html#requestEncodedWith(akka.http.scaladsl.model.headers.HttpEncoding)), [responseEncodingAccepted](CodingDirectives.html#responseEncodingAccepted(akka.http.scaladsl.model.headers.HttpEncoding)), [withPrecompressedMediaTypeSupport](CodingDirectives.html#withPrecompressedMediaTypeSupport())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CodingDirectives$](CodingDirectives$.html "class in akka.http.scaladsl.server.directives") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CodingDirectives$
		
		
		
		```
		public CodingDirectives$()
		```

	- ### Method Detail
	
	
	
		- #### DefaultCoders
		
		
		
		```
		public scala.collection.immutable.Seq<[Coder](../../coding/Coder.html "interface in akka.http.scaladsl.coding")> DefaultCoders()
		```
		- #### DefaultEncodeResponseEncoders
		
		
		
		```
		public scala.collection.immutable.Seq<[Coder](../../coding/Coder.html "interface in akka.http.scaladsl.coding")> DefaultEncodeResponseEncoders()
		```
		- #### theseOrDefault
		
		
		
		```
		public <T> scala.collection.immutable.Seq<T> theseOrDefault​(scala.collection.immutable.Seq<T> these)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives$.html)*