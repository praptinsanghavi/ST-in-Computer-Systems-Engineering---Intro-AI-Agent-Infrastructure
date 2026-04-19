---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:37:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testconductor/Hello$.html
title: Hello$
---

# Hello$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class Hello$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.String,​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.Hello\>
	- - akka.remote.testconductor.Hello$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.String,​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.Hello>`

---

```
public class Hello$
extends scala.runtime.AbstractFunction2<java.lang.String,​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.Hello>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testconductor.Hello$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Hello$](Hello$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Hello$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.testconductor.Hello` | `[apply](#apply(java.lang.String,akka.actor.Address))​(java.lang.String name,  [Address](../../actor/Address.html "class in akka.actor") addr)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.String,​[Address](../../actor/Address.html "class in akka.actor")>>` | `[unapply](#unapply(akka.remote.testconductor.Hello))​(akka.remote.testconductor.Hello x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Hello$](Hello$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Hello$
		
		
		
		```
		public Hello$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.String,​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.Hello>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.String,​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.Hello>`
		- #### apply
		
		
		
		```
		public akka.remote.testconductor.Hello apply​(java.lang.String name,
		                                             [Address](../../actor/Address.html "class in akka.actor") addr)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<java.lang.String,​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.Hello>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.String,​[Address](../../actor/Address.html "class in akka.actor")>> unapply​(akka.remote.testconductor.Hello x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/Hello$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testconductor/Hello$.html](https://doc.akka.io/japi/akka/current/akka/remote/testconductor/Hello$.html)*