---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/JavaPartialFunction.NoMatch$.html
title: JavaPartialFunction.NoMatch$
---

# JavaPartialFunction.NoMatch$

## Content

Package [akka.japi](package-summary.html)
## Class JavaPartialFunction.NoMatch$

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.japi.JavaPartialFunction.NoMatchException](JavaPartialFunction.NoMatchException.html "class in akka.japi")
				- - akka.japi.JavaPartialFunction.NoMatch$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.util.control.NoStackTrace`

Enclosing class:
[JavaPartialFunction](JavaPartialFunction.html "class in akka.japi")\<[A](JavaPartialFunction.html "type parameter in JavaPartialFunction"),​[B](JavaPartialFunction.html "type parameter in JavaPartialFunction")\>

---

```
public static class JavaPartialFunction.NoMatch$
extends [JavaPartialFunction.NoMatchException](JavaPartialFunction.NoMatchException.html "class in akka.japi")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.japi.JavaPartialFunction.NoMatch$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JavaPartialFunction.NoMatch$](JavaPartialFunction.NoMatch$.html "class in akka.japi")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoMatch$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JavaPartialFunction.NoMatch$](JavaPartialFunction.NoMatch$.html "class in akka.japi") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoMatch$
		
		
		
		```
		public NoMatch$()
		```

	- ### Method Detail
	
	
	
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/JavaPartialFunction.NoMatch$.html
- https://doc.akka.io/japi/akka/current/akka/japi/JavaPartialFunction.NoMatchException.html
- https://doc.akka.io/japi/akka/current/akka/japi/JavaPartialFunction.html
- https://doc.akka.io/japi/akka/current/akka/japi/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/JavaPartialFunction.NoMatch$.html](https://doc.akka.io/japi/akka/current/akka/japi/JavaPartialFunction.NoMatch$.html)*