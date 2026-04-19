---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:37:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testconductor/AddressReply$.html
title: AddressReply$
---

# AddressReply$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class AddressReply$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.AddressReply\>
	- - akka.remote.testconductor.AddressReply$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.AddressReply>`

---

```
public class AddressReply$
extends scala.runtime.AbstractFunction2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.AddressReply>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testconductor.AddressReply$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AddressReply$](AddressReply$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AddressReply$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.testconductor.AddressReply` | `[apply](#apply(akka.remote.testconductor.RoleName,akka.actor.Address))​([RoleName](RoleName.html "class in akka.remote.testconductor") node,  [Address](../../actor/Address.html "class in akka.actor") addr)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Address](../../actor/Address.html "class in akka.actor")>>` | `[unapply](#unapply(akka.remote.testconductor.AddressReply))​(akka.remote.testconductor.AddressReply x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AddressReply$](AddressReply$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AddressReply$
		
		
		
		```
		public AddressReply$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.AddressReply>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.AddressReply>`
		- #### apply
		
		
		
		```
		public akka.remote.testconductor.AddressReply apply​([RoleName](RoleName.html "class in akka.remote.testconductor") node,
		                                                    [Address](../../actor/Address.html "class in akka.actor") addr)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Address](../../actor/Address.html "class in akka.actor"),​akka.remote.testconductor.AddressReply>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[RoleName](RoleName.html "class in akka.remote.testconductor"),​[Address](../../actor/Address.html "class in akka.actor")>> unapply​(akka.remote.testconductor.AddressReply x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/AddressReply$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/RoleName.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testconductor/AddressReply$.html](https://doc.akka.io/japi/akka/current/akka/remote/testconductor/AddressReply$.html)*