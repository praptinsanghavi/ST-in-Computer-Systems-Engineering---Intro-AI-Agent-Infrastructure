---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsets.html
title: HttpCharsets
---

# HttpCharsets

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class HttpCharsets

- java.lang.Object
- - akka.http.javadsl.model.HttpCharsets

- ---

```
public final class HttpCharsets
extends java.lang.Object
```

Contains a set of predefined charsets.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model")` | `[ISO_8859_1](#ISO_8859_1)` |  |
	| `static [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model")` | `[US_ASCII](#US_ASCII)` |  |
	| `static [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model")` | `[UTF_16](#UTF_16)` |  |
	| `static [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model")` | `[UTF_16BE](#UTF_16BE)` |  |
	| `static [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model")` | `[UTF_16LE](#UTF_16LE)` |  |
	| `static [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model")` | `[UTF_8](#UTF_8)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model")` | `[custom](#custom(java.lang.String,java.lang.String...))​(java.lang.String value,  java.lang.String... aliases)` | Create and return a custom charset. |
	| `static java.util.Optional<[HttpCharset](HttpCharset.html "class in akka.http.javadsl.model")>` | `[lookup](#lookup(java.lang.String))​(java.lang.String name)` | Returns Some(charset) if the charset with the given name was found and None otherwise. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### US\_ASCII
		
		
		
		```
		public static final [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") US_ASCII
		```
		- #### ISO\_8859\_1
		
		
		
		```
		public static final [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") ISO_8859_1
		```
		- #### UTF\_8
		
		
		
		```
		public static final [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") UTF_8
		```
		- #### UTF\_16
		
		
		
		```
		public static final [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") UTF_16
		```
		- #### UTF\_16BE
		
		
		
		```
		public static final [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") UTF_16BE
		```
		- #### UTF\_16LE
		
		
		
		```
		public static final [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") UTF_16LE
		```

	- ### Method Detail
	
	
	
		- #### custom
		
		
		
		```
		public static [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") custom​(java.lang.String value,
		                                 java.lang.String... aliases)
		```
		
		Create and return a custom charset.
		- #### lookup
		
		
		
		```
		public static java.util.Optional<[HttpCharset](HttpCharset.html "class in akka.http.javadsl.model")> lookup​(java.lang.String name)
		```
		
		Returns Some(charset) if the charset with the given name was found and None otherwise.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsets.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsets.html)*