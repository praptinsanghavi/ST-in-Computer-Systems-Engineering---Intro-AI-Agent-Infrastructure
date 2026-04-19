---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncodingRange.html
title: HttpEncodingRange
---

# HttpEncodingRange

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class HttpEncodingRange

- java.lang.Object
- - akka.http.javadsl.model.headers.HttpEncodingRange

- Direct Known Subclasses:
`[HttpEncodingRange](../../../scaladsl/model/headers/HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class HttpEncodingRange
extends java.lang.Object
```

See Also:
[`for convenience access to often used values.`](HttpEncodingRanges.html "class in akka.http.javadsl.model.headers")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpEncodingRange](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpEncodingRange](HttpEncodingRange.html "class in akka.http.javadsl.model.headers")` | `[create](#create(akka.http.javadsl.model.headers.HttpEncoding))​([HttpEncoding](HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding)` |  |
	| `abstract boolean` | `[matches](#matches(akka.http.javadsl.model.headers.HttpEncoding))​([HttpEncoding](HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding)` |  |
	| `abstract float` | `[qValue](#qValue())()` |  |
	| `abstract [HttpEncodingRange](HttpEncodingRange.html "class in akka.http.javadsl.model.headers")` | `[withQValue](#withQValue(float))​(float qValue)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpEncodingRange
		
		
		
		```
		public HttpEncodingRange()
		```

	- ### Method Detail
	
	
	
		- #### qValue
		
		
		
		```
		public abstract float qValue()
		```
		- #### matches
		
		
		
		```
		public abstract boolean matches​([HttpEncoding](HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding)
		```
		- #### withQValue
		
		
		
		```
		public abstract [HttpEncodingRange](HttpEncodingRange.html "class in akka.http.javadsl.model.headers") withQValue​(float qValue)
		```
		- #### create
		
		
		
		```
		public static [HttpEncodingRange](HttpEncodingRange.html "class in akka.http.javadsl.model.headers") create​([HttpEncoding](HttpEncoding.html "class in akka.http.javadsl.model.headers") encoding)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncodingRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncodingRanges.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncodingRange.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncodingRange.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncodingRange.html)*