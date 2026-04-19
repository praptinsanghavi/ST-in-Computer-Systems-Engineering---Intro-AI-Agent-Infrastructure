---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SingletonException.html
title: SingletonException
---

# SingletonException

## Content

Package [akka.http.impl.util](package-summary.html)
## Class SingletonException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.impl.util.SingletonException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

Direct Known Subclasses:
`[HeaderParser.EmptyCookieException$](../model/parser/HeaderParser.EmptyCookieException$.html "class in akka.http.impl.model.parser")`, `[NotEnoughDataException$](../engine/parsing/NotEnoughDataException$.html "class in akka.http.impl.engine.parsing")`

---

```
public abstract class SingletonException
extends java.lang.RuntimeException
implements scala.util.control.NoStackTrace
```

INTERNAL API
 
 Convenience base class for exception objects.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.util.SingletonException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SingletonException](#%3Cinit%3E())()` |  |
	| `[SingletonException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### SingletonException
		
		
		
		```
		public SingletonException​(java.lang.String msg)
		```
		- #### SingletonException
		
		
		
		```
		public SingletonException()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/NotEnoughDataException$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.EmptyCookieException$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SingletonException.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/SingletonException.html)*