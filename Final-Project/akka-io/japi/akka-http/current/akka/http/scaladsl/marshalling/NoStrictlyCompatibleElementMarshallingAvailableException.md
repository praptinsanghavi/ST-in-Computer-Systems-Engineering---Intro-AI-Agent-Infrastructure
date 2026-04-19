---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/NoStrictlyCompatibleElementMarshallingAvailableException.html
title: NoStrictlyCompatibleElementMarshallingAvailableException
---

# NoStrictlyCompatibleElementMarshallingAvailableException

## Content

Package [akka.http.scaladsl.marshalling](package-summary.html)
## Class NoStrictlyCompatibleElementMarshallingAvailableException\<T\>

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.http.scaladsl.marshalling.NoStrictlyCompatibleElementMarshallingAvailableException\<T\>

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public final class NoStrictlyCompatibleElementMarshallingAvailableException<T>
extends java.lang.RuntimeException
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.marshalling.NoStrictlyCompatibleElementMarshallingAvailableException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoStrictlyCompatibleElementMarshallingAvailableException](#%3Cinit%3E(akka.http.scaladsl.model.ContentType,scala.collection.immutable.List,scala.reflect.ClassTag))​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") streamContentType,  scala.collection.immutable.List<[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<?>> availableMarshallings,  scala.reflect.ClassTag<[T](NoStrictlyCompatibleElementMarshallingAvailableException.html "type parameter in NoStrictlyCompatibleElementMarshallingAvailableException")> tag)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NoStrictlyCompatibleElementMarshallingAvailableException
		
		
		
		```
		public NoStrictlyCompatibleElementMarshallingAvailableException​([ContentType](../model/ContentType.html "interface in akka.http.scaladsl.model") streamContentType,
		                                                                scala.collection.immutable.List<[Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")<?>> availableMarshallings,
		                                                                scala.reflect.ClassTag<[T](NoStrictlyCompatibleElementMarshallingAvailableException.html "type parameter in NoStrictlyCompatibleElementMarshallingAvailableException")> tag)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/NoStrictlyCompatibleElementMarshallingAvailableException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/NoStrictlyCompatibleElementMarshallingAvailableException.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/NoStrictlyCompatibleElementMarshallingAvailableException.html)*