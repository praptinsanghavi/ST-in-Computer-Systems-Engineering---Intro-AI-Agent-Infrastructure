---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameError.html
title: FrameError
---

# FrameError

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class FrameError

- java.lang.Object
- - akka.http.impl.engine.ws.FrameError

- All Implemented Interfaces:
`[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class FrameError
extends java.lang.Object
implements [FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.ws.FrameError)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameError](#%3Cinit%3E(akka.http.impl.engine.ws.ProtocolException))​([ProtocolException](ProtocolException.html "class in akka.http.impl.engine.ws") p)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `[ProtocolException](ProtocolException.html "class in akka.http.impl.engine.ws")` | `[p](#p())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### FrameError
		
		
		
		```
		public FrameError​([ProtocolException](ProtocolException.html "class in akka.http.impl.engine.ws") p)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### p
		
		
		
		```
		public [ProtocolException](ProtocolException.html "class in akka.http.impl.engine.ws") p()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventOrError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/ProtocolException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameError.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameError.html)*