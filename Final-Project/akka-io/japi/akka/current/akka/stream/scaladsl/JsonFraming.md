---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/JsonFraming.PartialObjectException.html
title: JsonFraming.PartialObjectException
---

# JsonFraming.PartialObjectException

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class JsonFraming.PartialObjectException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.stream.scaladsl.Framing.FramingException](Framing.FramingException.html "class in akka.stream.scaladsl")
				- - akka.stream.scaladsl.JsonFraming.PartialObjectException

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[JsonFraming](JsonFraming.html "class in akka.stream.scaladsl")

---

```
public static class JsonFraming.PartialObjectException
extends [Framing.FramingException](Framing.FramingException.html "class in akka.stream.scaladsl")
```

Thrown if upstream completes with a partial object in the buffer.

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.scaladsl.JsonFraming.PartialObjectException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PartialObjectException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PartialObjectException
		
		
		
		```
		public PartialObjectException​(java.lang.String msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Framing.FramingException.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/JsonFraming.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/JsonFraming.PartialObjectException.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/JsonFraming.PartialObjectException.html)*