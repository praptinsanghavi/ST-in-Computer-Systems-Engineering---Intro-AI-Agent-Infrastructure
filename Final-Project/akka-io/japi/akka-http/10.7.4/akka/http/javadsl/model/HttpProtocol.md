---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocol.html
title: HttpProtocol
---

# HttpProtocol

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class HttpProtocol

- java.lang.Object
- - akka.http.javadsl.model.HttpProtocol

- Direct Known Subclasses:
`[HttpProtocol](../../scaladsl/model/HttpProtocol.html "class in akka.http.scaladsl.model")`

---

```
public abstract class HttpProtocol
extends java.lang.Object
```

Represents an Http protocol (currently only HTTP/1\.0 or HTTP/1\.1\). See [`HttpProtocols`](HttpProtocols.html "class in akka.http.javadsl.model")
 for the predefined constants for the supported protocols.

See Also:
[`for convenience access to often used values.`](HttpProtocols.html "class in akka.http.javadsl.model")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpProtocol](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract java.lang.String` | `[value](#value())()` | Returns the String representation of this protocol. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpProtocol
		
		
		
		```
		public HttpProtocol()
		```

	- ### Method Detail
	
	
	
		- #### value
		
		
		
		```
		public abstract java.lang.String value()
		```
		
		Returns the String representation of this protocol.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocols.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocol.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocol.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocol.html)*