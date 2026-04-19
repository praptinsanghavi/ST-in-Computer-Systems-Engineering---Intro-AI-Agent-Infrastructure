---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:54:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/Serialization.Information$.html
title: Serialization.Information$
---

# Serialization.Information$

## Content

Package [akka.serialization](package-summary.html)
## Class Serialization.Information$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[Address](../actor/Address.html "class in akka.actor"),​[ActorSystem](../actor/ActorSystem.html "class in akka.actor"),​[Serialization.Information](Serialization.Information.html "class in akka.serialization")\>
	- - akka.serialization.Serialization.Information$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[Address](../actor/Address.html "class in akka.actor"),​[ActorSystem](../actor/ActorSystem.html "class in akka.actor"),​[Serialization.Information](Serialization.Information.html "class in akka.serialization")>`

Enclosing class:
[Serialization](Serialization.html "class in akka.serialization")

---

```
public static class Serialization.Information$
extends scala.runtime.AbstractFunction2<[Address](../actor/Address.html "class in akka.actor"),​[ActorSystem](../actor/ActorSystem.html "class in akka.actor"),​[Serialization.Information](Serialization.Information.html "class in akka.serialization")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.serialization.Serialization.Information$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Serialization.Information$](Serialization.Information$.html "class in akka.serialization")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Information$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Serialization.Information](Serialization.Information.html "class in akka.serialization")` | `[apply](#apply(akka.actor.Address,akka.actor.ActorSystem))​([Address](../actor/Address.html "class in akka.actor") address,  [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[Address](../actor/Address.html "class in akka.actor"),​[ActorSystem](../actor/ActorSystem.html "class in akka.actor")>>` | `[unapply](#unapply(akka.serialization.Serialization.Information))​([Serialization.Information](Serialization.Information.html "class in akka.serialization") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Serialization.Information$](Serialization.Information$.html "class in akka.serialization") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Information$
		
		
		
		```
		public Information$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[Address](../actor/Address.html "class in akka.actor"),​[ActorSystem](../actor/ActorSystem.html "class in akka.actor"),​[Serialization.Information](Serialization.Information.html "class in akka.serialization")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[Address](../actor/Address.html "class in akka.actor"),​[ActorSystem](../actor/ActorSystem.html "class in akka.actor"),​[Serialization.Information](Serialization.Information.html "class in akka.serialization")>`
		- #### apply
		
		
		
		```
		public [Serialization.Information](Serialization.Information.html "class in akka.serialization") apply​([Address](../actor/Address.html "class in akka.actor") address,
		                                       [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[Address](../actor/Address.html "class in akka.actor"),​[ActorSystem](../actor/ActorSystem.html "class in akka.actor"),​[Serialization.Information](Serialization.Information.html "class in akka.serialization")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[Address](../actor/Address.html "class in akka.actor"),​[ActorSystem](../actor/ActorSystem.html "class in akka.actor")>> unapply​([Serialization.Information](Serialization.Information.html "class in akka.serialization") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/Serialization.Information$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/Serialization.Information.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/Serialization.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/Serialization.Information$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/serialization/Serialization.Information$.html)*