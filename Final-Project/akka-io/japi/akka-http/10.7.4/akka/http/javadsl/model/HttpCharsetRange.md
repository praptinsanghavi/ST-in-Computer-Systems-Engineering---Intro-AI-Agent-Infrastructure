---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRange.html
title: HttpCharsetRange
---

# HttpCharsetRange

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class HttpCharsetRange

- java.lang.Object
- - akka.http.javadsl.model.HttpCharsetRange

- Direct Known Subclasses:
`[HttpCharsetRange](../../scaladsl/model/HttpCharsetRange.html "class in akka.http.scaladsl.model")`

---

```
public abstract class HttpCharsetRange
extends java.lang.Object
```

Represents an Http charset range. This can either be \`\*\` which matches all charsets or a specific
 charset. [`HttpCharsetRanges`](HttpCharsetRanges.html "class in akka.http.javadsl.model") contains static constructors for HttpCharsetRanges.

See Also:
[`for convenience access to often used values.`](HttpCharsetRanges.html "class in akka.http.javadsl.model")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCharsetRange](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract boolean` | `[matches](#matches(akka.http.javadsl.model.HttpCharset))​([HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset)` | Returns if the given charset matches this range. |
	| `abstract float` | `[qValue](#qValue())()` | The qValue for this range. |
	| `abstract [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.javadsl.model")` | `[withQValue](#withQValue(float))​(float qValue)` | Returns a copy of this range with the given qValue. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpCharsetRange
		
		
		
		```
		public HttpCharsetRange()
		```

	- ### Method Detail
	
	
	
		- #### qValue
		
		
		
		```
		public abstract float qValue()
		```
		
		The qValue for this range.
		- #### matches
		
		
		
		```
		public abstract boolean matches​([HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset)
		```
		
		Returns if the given charset matches this range.
		- #### withQValue
		
		
		
		```
		public abstract [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.javadsl.model") withQValue​(float qValue)
		```
		
		Returns a copy of this range with the given qValue.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRanges.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRange.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRange.html)*