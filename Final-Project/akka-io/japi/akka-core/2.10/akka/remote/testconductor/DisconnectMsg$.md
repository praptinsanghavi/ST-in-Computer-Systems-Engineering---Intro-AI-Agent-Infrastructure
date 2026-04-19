---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:15:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/DisconnectMsg$.html
title: DisconnectMsg$
---

# DisconnectMsg$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class DisconnectMsg$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​akka.remote.testconductor.DisconnectMsg\>
	- - akka.remote.testconductor.DisconnectMsg$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​akka.remote.testconductor.DisconnectMsg>`

---

```
public class DisconnectMsg$
extends scala.runtime.AbstractFunction2<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​akka.remote.testconductor.DisconnectMsg>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testconductor.DisconnectMsg$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DisconnectMsg$](DisconnectMsg$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DisconnectMsg$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.testconductor.DisconnectMsg` | `[apply](#apply(akka.actor.Address,boolean))​([Address](../../actor/Address.html "class in akka.actor") target,  boolean abort)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>>` | `[unapply](#unapply(akka.remote.testconductor.DisconnectMsg))​(akka.remote.testconductor.DisconnectMsg x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DisconnectMsg$](DisconnectMsg$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DisconnectMsg$
		
		
		
		```
		public DisconnectMsg$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​akka.remote.testconductor.DisconnectMsg>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​akka.remote.testconductor.DisconnectMsg>`
		- #### apply
		
		
		
		```
		public akka.remote.testconductor.DisconnectMsg apply​([Address](../../actor/Address.html "class in akka.actor") target,
		                                                     boolean abort)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>> unapply​(akka.remote.testconductor.DisconnectMsg x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/DisconnectMsg$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/DisconnectMsg$.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/DisconnectMsg$.html)*