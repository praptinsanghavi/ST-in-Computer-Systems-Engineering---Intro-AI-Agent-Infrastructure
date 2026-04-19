---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply.ErrorMessage.html
title: StatusReply.ErrorMessage
---

# StatusReply.ErrorMessage

## Content

Package [akka.pattern](package-summary.html)
## Class StatusReply.ErrorMessage

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.pattern.StatusReply.ErrorMessage

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.util.control.NoStackTrace`

Enclosing class:
[StatusReply](StatusReply.html "class in akka.pattern")\<[T](StatusReply.html "type parameter in StatusReply")\>

---

```
public static final class StatusReply.ErrorMessage
extends java.lang.RuntimeException
implements scala.util.control.NoStackTrace, scala.Product, java.io.Serializable
```

Carrier exception used for textual error descriptions.
 
 Not meant for usage outside of [`StatusReply`](StatusReply.html "class in akka.pattern").

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.StatusReply.ErrorMessage)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ErrorMessage](#%3Cinit%3E(java.lang.String))​(java.lang.String errorMessage)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[StatusReply.ErrorMessage](StatusReply.ErrorMessage.html "class in akka.pattern")` | `[copy](#copy(java.lang.String))​(java.lang.String errorMessage)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.String` | `[errorMessage$access$0](#errorMessage$access$0())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ErrorMessage
		
		
		
		```
		public ErrorMessage​(java.lang.String errorMessage)
		```

	- ### Method Detail
	
	
	
		- #### errorMessage$access$0
		
		
		
		```
		public java.lang.String errorMessage$access$0()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Throwable`
		- #### copy
		
		
		
		```
		public [StatusReply.ErrorMessage](StatusReply.ErrorMessage.html "class in akka.pattern") copy​(java.lang.String errorMessage)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
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
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply.ErrorMessage.html
- https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply.html
- https://doc.akka.io/japi/akka/current/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply.ErrorMessage.html](https://doc.akka.io/japi/akka/current/akka/pattern/StatusReply.ErrorMessage.html)*