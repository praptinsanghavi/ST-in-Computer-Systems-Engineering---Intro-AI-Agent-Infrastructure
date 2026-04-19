---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/scalatest/MayVerb.TestCanceledByFailure.html
title: MayVerb.TestCanceledByFailure
---

# MayVerb.TestCanceledByFailure

## Content

Package [akka.persistence.scalatest](package-summary.html)
## Class MayVerb.TestCanceledByFailure

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - org.scalatest.exceptions.StackDepthException
				- - org.scalatest.exceptions.TestCanceledException
					- - akka.persistence.scalatest.MayVerb.TestCanceledByFailure

- All Implemented Interfaces:
`java.io.Serializable`, `org.scalatest.exceptions.ModifiableMessage<org.scalatest.exceptions.TestCanceledException>`, `org.scalatest.exceptions.ModifiablePayload<org.scalatest.exceptions.TestCanceledException>`, `org.scalatest.exceptions.PayloadField`, `org.scalatest.exceptions.StackDepth`, `scala.Equals`, `scala.Product`

Enclosing interface:
[MayVerb](MayVerb.html "interface in akka.persistence.scalatest")

---

```
public static class MayVerb.TestCanceledByFailure
extends org.scalatest.exceptions.TestCanceledException
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.scalatest.MayVerb.TestCanceledByFailure)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestCanceledByFailure](#%3Cinit%3E(java.lang.String,java.lang.StackTraceElement%5B%5D))​(java.lang.String msg,  java.lang.StackTraceElement[] specialStackTrace)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest")` | `[copy](#copy(java.lang.String,java.lang.StackTraceElement%5B%5D))​(java.lang.String msg,  java.lang.StackTraceElement[] specialStackTrace)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.StackTraceElement[]` | `[copy$default$2](#copy$default$2())()` |  |
	| `java.lang.StackTraceElement[]` | `[getStackTrace](#getStackTrace())()` |  |
	| `java.lang.String` | `[msg](#msg())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.StackTraceElement[]` | `[specialStackTrace](#specialStackTrace())()` |  |
	
	
		- ### Methods inherited from class org.scalatest.exceptions.TestCanceledException
		
		
		`canEqual, equals, hashCode, modifyMessage, modifyPayload, payload, severedAtStackDepth`
		- ### Methods inherited from class org.scalatest.exceptions.StackDepthException
		
		
		`cause, failedCodeFileName, failedCodeFileNameAndLineNumberString, failedCodeFilePathname, failedCodeFilePathnameAndLineNumberString, failedCodeLineNumber, failedCodeStackDepth, getMessage, initCause, message, messageFun, position, toExceptionFunction`
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getSuppressed, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### TestCanceledByFailure
		
		
		
		```
		public TestCanceledByFailure​(java.lang.String msg,
		                             java.lang.StackTraceElement[] specialStackTrace)
		```

	- ### Method Detail
	
	
	
		- #### msg
		
		
		
		```
		public java.lang.String msg()
		```
		- #### specialStackTrace
		
		
		
		```
		public java.lang.StackTraceElement[] specialStackTrace()
		```
		- #### getStackTrace
		
		
		
		```
		public java.lang.StackTraceElement[] getStackTrace()
		```
		
		
		Overrides:
		`getStackTrace` in class `java.lang.Throwable`
		- #### copy
		
		
		
		```
		public [MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest") copy​(java.lang.String msg,
		                                          java.lang.StackTraceElement[] specialStackTrace)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.StackTraceElement[] copy$default$2()
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
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/scalatest/MayVerb.TestCanceledByFailure.html
- https://doc.akka.io/japi/akka/current/akka/persistence/scalatest/MayVerb.html
- https://doc.akka.io/japi/akka/current/akka/persistence/scalatest/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/scalatest/MayVerb.TestCanceledByFailure.html](https://doc.akka.io/japi/akka/current/akka/persistence/scalatest/MayVerb.TestCanceledByFailure.html)*