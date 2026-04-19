---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:47:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/scalatest/MayVerb.TestCanceledByFailure$.html
title: MayVerb.TestCanceledByFailure$
---

# MayVerb.TestCanceledByFailure$

## Content

Package [akka.persistence.scalatest](package-summary.html)
## Class MayVerb.TestCanceledByFailure$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.StackTraceElement\[],​[MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest")\>
	- - akka.persistence.scalatest.MayVerb.TestCanceledByFailure$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.String,​java.lang.StackTraceElement[],​[MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest")>`

Enclosing interface:
[MayVerb](MayVerb.html "interface in akka.persistence.scalatest")

---

```
public static class MayVerb.TestCanceledByFailure$
extends scala.runtime.AbstractFunction2<java.lang.String,​java.lang.StackTraceElement[],​[MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.scalatest.MayVerb.TestCanceledByFailure$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MayVerb.TestCanceledByFailure$](MayVerb.TestCanceledByFailure$.html "class in akka.persistence.scalatest")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestCanceledByFailure$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest")` | `[apply](#apply(java.lang.String,java.lang.StackTraceElement%5B%5D))​(java.lang.String msg,  java.lang.StackTraceElement[] specialStackTrace)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.String,​java.lang.StackTraceElement[]>>` | `[unapply](#unapply(akka.persistence.scalatest.MayVerb.TestCanceledByFailure))​([MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MayVerb.TestCanceledByFailure$](MayVerb.TestCanceledByFailure$.html "class in akka.persistence.scalatest") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestCanceledByFailure$
		
		
		
		```
		public TestCanceledByFailure$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.String,​java.lang.StackTraceElement[],​[MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.String,​java.lang.StackTraceElement[],​[MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest")>`
		- #### apply
		
		
		
		```
		public [MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest") apply​(java.lang.String msg,
		                                           java.lang.StackTraceElement[] specialStackTrace)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<java.lang.String,​java.lang.StackTraceElement[],​[MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.String,​java.lang.StackTraceElement[]>> unapply​([MayVerb.TestCanceledByFailure](MayVerb.TestCanceledByFailure.html "class in akka.persistence.scalatest") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/scalatest/MayVerb.TestCanceledByFailure$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/scalatest/MayVerb.TestCanceledByFailure.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/scalatest/MayVerb.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/scalatest/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/scalatest/MayVerb.TestCanceledByFailure$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/scalatest/MayVerb.TestCanceledByFailure$.html)*