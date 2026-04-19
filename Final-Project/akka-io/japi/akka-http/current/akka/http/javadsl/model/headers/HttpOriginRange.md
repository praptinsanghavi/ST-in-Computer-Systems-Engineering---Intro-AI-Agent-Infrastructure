---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOriginRange.html
title: HttpOriginRange
---

# HttpOriginRange

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class HttpOriginRange

- java.lang.Object
- - akka.http.javadsl.model.headers.HttpOriginRange

- Direct Known Subclasses:
`[HttpOriginRange](../../../scaladsl/model/headers/HttpOriginRange.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class HttpOriginRange
extends java.lang.Object
```

See Also:
[`for convenience access to often used values.`](HttpOriginRanges.html "class in akka.http.javadsl.model.headers")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpOriginRange](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpOriginRange](HttpOriginRange.html "class in akka.http.javadsl.model.headers")` | `[create](#create(akka.http.javadsl.model.headers.HttpOrigin...))​([HttpOrigin](HttpOrigin.html "class in akka.http.javadsl.model.headers")... origins)` |  |
	| `abstract boolean` | `[matches](#matches(akka.http.javadsl.model.headers.HttpOrigin))​([HttpOrigin](HttpOrigin.html "class in akka.http.javadsl.model.headers") origin)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpOriginRange
		
		
		
		```
		public HttpOriginRange()
		```

	- ### Method Detail
	
	
	
		- #### matches
		
		
		
		```
		public abstract boolean matches​([HttpOrigin](HttpOrigin.html "class in akka.http.javadsl.model.headers") origin)
		```
		- #### create
		
		
		
		```
		public static [HttpOriginRange](HttpOriginRange.html "class in akka.http.javadsl.model.headers") create​([HttpOrigin](HttpOrigin.html "class in akka.http.javadsl.model.headers")... origins)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOrigin.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOriginRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOriginRanges.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpOriginRange.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOriginRange.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOriginRange.html)*