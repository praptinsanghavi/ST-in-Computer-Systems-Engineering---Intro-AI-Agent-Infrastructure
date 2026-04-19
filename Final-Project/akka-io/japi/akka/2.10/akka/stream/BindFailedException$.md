---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:05:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/BindFailedException$.html
title: BindFailedException$
---

# BindFailedException$

## Content

Package [akka.stream](package-summary.html)
## Class BindFailedException$

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.stream.StreamTcpException](StreamTcpException.html "class in akka.stream")
				- - [akka.stream.BindFailedException](BindFailedException.html "class in akka.stream")
					- - akka.stream.BindFailedException$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.util.control.NoStackTrace`

---

```
public class BindFailedException$
extends [BindFailedException](BindFailedException.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

Deprecated.
BindFailedException object will never be thrown. Match on the class instead. Since 2\.4\.19\.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.BindFailedException$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BindFailedException$](BindFailedException$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Deprecated. Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BindFailedException$](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` | Deprecated. |
	| `int` | `[hashCode](#hashCode())()` | Deprecated. |
	| `int` | `[productArity](#productArity())()` | Deprecated. |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` | Deprecated. |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` | Deprecated. |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` | Deprecated. |
	
	
		- ### Methods inherited from class akka.stream.[BindFailedException](BindFailedException.html "class in akka.stream")
		
		
		`[addSuppressed](BindFailedException.html#addSuppressed(java.lang.Throwable)), [equals](BindFailedException.html#equals(java.lang.Object)), [fillInStackTrace](BindFailedException.html#fillInStackTrace()), [getCause](BindFailedException.html#getCause()), [getLocalizedMessage](BindFailedException.html#getLocalizedMessage()), [getMessage](BindFailedException.html#getMessage()), [getStackTrace](BindFailedException.html#getStackTrace()), [getSuppressed](BindFailedException.html#getSuppressed()), [initCause](BindFailedException.html#initCause(java.lang.Throwable)), [printStackTrace](BindFailedException.html#printStackTrace()), [printStackTrace](BindFailedException.html#printStackTrace(java.io.PrintStream)), [printStackTrace](BindFailedException.html#printStackTrace(java.io.PrintWriter)), [productElementName](BindFailedException.html#productElementName(int)), [productElementNames](BindFailedException.html#productElementNames()), [setStackTrace](BindFailedException.html#setStackTrace(java.lang.StackTraceElement%5B%5D)), [toString](BindFailedException.html#toString())`
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
		public static final [BindFailedException$](BindFailedException$.html "class in akka.stream") MODULE$
		```
		
		Deprecated.
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BindFailedException$
		
		
		
		```
		public BindFailedException$()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		Deprecated.
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		Overrides:
		`[productPrefix](BindFailedException.html#productPrefix())` in class `[BindFailedException](BindFailedException.html "class in akka.stream")`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		Deprecated.
		
		Specified by:
		`productArity` in interface `scala.Product`
		Overrides:
		`[productArity](BindFailedException.html#productArity())` in class `[BindFailedException](BindFailedException.html "class in akka.stream")`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		Deprecated.
		
		Specified by:
		`productElement` in interface `scala.Product`
		Overrides:
		`[productElement](BindFailedException.html#productElement(int))` in class `[BindFailedException](BindFailedException.html "class in akka.stream")`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		Deprecated.
		
		Specified by:
		`productIterator` in interface `scala.Product`
		Overrides:
		`[productIterator](BindFailedException.html#productIterator())` in class `[BindFailedException](BindFailedException.html "class in akka.stream")`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		Deprecated.
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		Overrides:
		`[canEqual](BindFailedException.html#canEqual(java.lang.Object))` in class `[BindFailedException](BindFailedException.html "class in akka.stream")`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		Deprecated.
		
		Overrides:
		`[hashCode](BindFailedException.html#hashCode())` in class `[BindFailedException](BindFailedException.html "class in akka.stream")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/BindFailedException$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/BindFailedException.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/StreamTcpException.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/BindFailedException$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/BindFailedException$.html)*