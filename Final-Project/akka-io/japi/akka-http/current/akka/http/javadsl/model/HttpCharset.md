---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:46:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharset.html
title: HttpCharset
---

# HttpCharset

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class HttpCharset

- java.lang.Object
- - akka.http.javadsl.model.HttpCharset

- Direct Known Subclasses:
`[HttpCharset](../../scaladsl/model/HttpCharset.html "class in akka.http.scaladsl.model")`

---

```
public abstract class HttpCharset
extends java.lang.Object
```

Represents a charset in Http. See [`HttpCharsets`](HttpCharsets.html "class in akka.http.javadsl.model") for a set of predefined charsets and
 static constructors to create custom charsets.

See Also:
[`for convenience access to often used values.`](HttpCharsets.html "class in akka.http.javadsl.model")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCharset](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract java.lang.Iterable<java.lang.String>` | `[getAliases](#getAliases())()` | Returns the predefined alias names for this charset. |
	| `abstract java.nio.charset.Charset` | `[nioCharset](#nioCharset())()` | Returns the Charset for this charset if available or throws an exception otherwise. |
	| `[HttpCharsetRange](HttpCharsetRange.html "class in akka.http.javadsl.model")` | `[toRange](#toRange())()` | Creates a range from this charset with qValue \= 1\. |
	| `[HttpCharsetRange](HttpCharsetRange.html "class in akka.http.javadsl.model")` | `[toRange](#toRange(float))​(float qValue)` | Creates a range from this charset with the given qValue. |
	| `abstract java.lang.String` | `[value](#value())()` | Returns the name of this charset. |
	| `abstract [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.javadsl.model")` | `[withQValue](#withQValue(float))​(float qValue)` | An alias for toRange(float). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpCharset
		
		
		
		```
		public HttpCharset()
		```

	- ### Method Detail
	
	
	
		- #### value
		
		
		
		```
		public abstract java.lang.String value()
		```
		
		Returns the name of this charset.
		- #### toRange
		
		
		
		```
		public [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.javadsl.model") toRange()
		```
		
		Creates a range from this charset with qValue \= 1\.
		- #### toRange
		
		
		
		```
		public [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.javadsl.model") toRange​(float qValue)
		```
		
		Creates a range from this charset with the given qValue.
		- #### withQValue
		
		
		
		```
		public abstract [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.javadsl.model") withQValue​(float qValue)
		```
		
		An alias for toRange(float).
		- #### getAliases
		
		
		
		```
		public abstract java.lang.Iterable<java.lang.String> getAliases()
		```
		
		Returns the predefined alias names for this charset.
		- #### nioCharset
		
		
		
		```
		public abstract java.nio.charset.Charset nioCharset()
		```
		
		Returns the Charset for this charset if available or throws an exception otherwise.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharsets.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharset.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpCharset.html)*