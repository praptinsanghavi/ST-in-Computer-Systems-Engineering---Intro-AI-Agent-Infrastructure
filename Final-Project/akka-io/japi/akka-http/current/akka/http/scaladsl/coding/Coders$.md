---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coders$.html
title: Coders$
---

# Coders$

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class Coders$

- java.lang.Object
- - akka.http.scaladsl.coding.Coders$

- ---

```
public class Coders$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Coders$](Coders$.html "class in akka.http.scaladsl.coding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Coders$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<[Coder](Coder.html "interface in akka.http.scaladsl.coding")>` | `[DefaultCoders](#DefaultCoders())()` |  |
	| `[Coder](Coder.html "interface in akka.http.scaladsl.coding")` | `[Deflate](#Deflate())()` |  |
	| `[Coder](Coder.html "interface in akka.http.scaladsl.coding")` | `[Deflate](#Deflate(scala.Function1,int))​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter,  int compressionLevel)` |  |
	| `[Coder](Coder.html "interface in akka.http.scaladsl.coding")` | `[Gzip](#Gzip())()` |  |
	| `[Coder](Coder.html "interface in akka.http.scaladsl.coding")` | `[Gzip](#Gzip(scala.Function1,int))​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter,  int compressionLevel)` |  |
	| `[Coder](Coder.html "interface in akka.http.scaladsl.coding")` | `[NoCoding](#NoCoding())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Coders$](Coders$.html "class in akka.http.scaladsl.coding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Coders$
		
		
		
		```
		public Coders$()
		```

	- ### Method Detail
	
	
	
		- #### Gzip
		
		
		
		```
		public [Coder](Coder.html "interface in akka.http.scaladsl.coding") Gzip()
		```
		- #### Gzip
		
		
		
		```
		public [Coder](Coder.html "interface in akka.http.scaladsl.coding") Gzip​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter,
		                  int compressionLevel)
		```
		- #### Deflate
		
		
		
		```
		public [Coder](Coder.html "interface in akka.http.scaladsl.coding") Deflate()
		```
		- #### Deflate
		
		
		
		```
		public [Coder](Coder.html "interface in akka.http.scaladsl.coding") Deflate​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter,
		                     int compressionLevel)
		```
		- #### NoCoding
		
		
		
		```
		public [Coder](Coder.html "interface in akka.http.scaladsl.coding") NoCoding()
		```
		- #### DefaultCoders
		
		
		
		```
		public scala.collection.immutable.Seq<[Coder](Coder.html "interface in akka.http.scaladsl.coding")> DefaultCoders()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coders$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coders$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coders$.html)*