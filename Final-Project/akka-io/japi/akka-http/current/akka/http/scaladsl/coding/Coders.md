---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coders.html
title: Coders
---

# Coders

## Content

Package [akka.http.scaladsl.coding](package-summary.html)
## Class Coders

- java.lang.Object
- - akka.http.scaladsl.coding.Coders

- ---

```
public class Coders
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Coders](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.collection.immutable.Seq<[Coder](Coder.html "interface in akka.http.scaladsl.coding")>` | `[DefaultCoders](#DefaultCoders())()` |  |
	| `static [Coder](Coder.html "interface in akka.http.scaladsl.coding")` | `[Deflate](#Deflate())()` |  |
	| `static [Coder](Coder.html "interface in akka.http.scaladsl.coding")` | `[Deflate](#Deflate(scala.Function1,int))​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter,  int compressionLevel)` |  |
	| `static [Coder](Coder.html "interface in akka.http.scaladsl.coding")` | `[Gzip](#Gzip())()` |  |
	| `static [Coder](Coder.html "interface in akka.http.scaladsl.coding")` | `[Gzip](#Gzip(scala.Function1,int))​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter,  int compressionLevel)` |  |
	| `static [Coder](Coder.html "interface in akka.http.scaladsl.coding")` | `[NoCoding](#NoCoding())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Coders
		
		
		
		```
		public Coders()
		```

	- ### Method Detail
	
	
	
		- #### Gzip
		
		
		
		```
		public static [Coder](Coder.html "interface in akka.http.scaladsl.coding") Gzip()
		```
		- #### Gzip
		
		
		
		```
		public static [Coder](Coder.html "interface in akka.http.scaladsl.coding") Gzip​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter,
		                         int compressionLevel)
		```
		- #### Deflate
		
		
		
		```
		public static [Coder](Coder.html "interface in akka.http.scaladsl.coding") Deflate()
		```
		- #### Deflate
		
		
		
		```
		public static [Coder](Coder.html "interface in akka.http.scaladsl.coding") Deflate​(scala.Function1<[HttpMessage](../model/HttpMessage.html "interface in akka.http.scaladsl.model"),​java.lang.Object> messageFilter,
		                            int compressionLevel)
		```
		- #### NoCoding
		
		
		
		```
		public static [Coder](Coder.html "interface in akka.http.scaladsl.coding") NoCoding()
		```
		- #### DefaultCoders
		
		
		
		```
		public static scala.collection.immutable.Seq<[Coder](Coder.html "interface in akka.http.scaladsl.coding")> DefaultCoders()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coders.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/coding/Coders.html)*