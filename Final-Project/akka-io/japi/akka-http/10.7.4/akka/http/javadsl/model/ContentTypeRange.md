---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentTypeRange.html
title: ContentTypeRange
---

# ContentTypeRange

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class ContentTypeRange

- java.lang.Object
- - akka.http.javadsl.model.ContentTypeRange

- Direct Known Subclasses:
`[ContentTypeRange](../../scaladsl/model/ContentTypeRange.html "class in akka.http.scaladsl.model")`

---

```
public abstract class ContentTypeRange
extends java.lang.Object
```

A data structure that combines an acceptable media range and an acceptable charset range into
 one structure to be used with unmarshalling.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ContentTypeRange](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.javadsl.model")` | `[charsetRange](#charsetRange())()` |  |
	| `abstract boolean` | `[matches](#matches(akka.http.javadsl.model.ContentType))​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType)` | Returns true if this range includes the given content type. |
	| `abstract [MediaRange](MediaRange.html "class in akka.http.javadsl.model")` | `[mediaRange](#mediaRange())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ContentTypeRange
		
		
		
		```
		public ContentTypeRange()
		```

	- ### Method Detail
	
	
	
		- #### mediaRange
		
		
		
		```
		public abstract [MediaRange](MediaRange.html "class in akka.http.javadsl.model") mediaRange()
		```
		- #### charsetRange
		
		
		
		```
		public abstract [HttpCharsetRange](HttpCharsetRange.html "class in akka.http.javadsl.model") charsetRange()
		```
		- #### matches
		
		
		
		```
		public abstract boolean matches​([ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType)
		```
		
		Returns true if this range includes the given content type.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsetRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentTypeRange.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentTypeRange.html)*