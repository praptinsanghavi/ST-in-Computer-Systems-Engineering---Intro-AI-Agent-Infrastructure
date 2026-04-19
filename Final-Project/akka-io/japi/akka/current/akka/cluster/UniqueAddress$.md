---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:42:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress$.html
title: UniqueAddress$
---

# UniqueAddress$

## Content

Package [akka.cluster](package-summary.html)
## Class UniqueAddress$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[Address](../actor/Address.html "class in akka.actor"),​java.lang.Object,​[UniqueAddress](UniqueAddress.html "class in akka.cluster")\>
	- - akka.cluster.UniqueAddress$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[Address](../actor/Address.html "class in akka.actor"),​java.lang.Object,​[UniqueAddress](UniqueAddress.html "class in akka.cluster")>`

---

```
public class UniqueAddress$
extends scala.runtime.AbstractFunction2<[Address](../actor/Address.html "class in akka.actor"),​java.lang.Object,​[UniqueAddress](UniqueAddress.html "class in akka.cluster")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.UniqueAddress$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UniqueAddress$](UniqueAddress$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UniqueAddress$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[UniqueAddress](UniqueAddress.html "class in akka.cluster")` | `[apply](#apply(akka.actor.Address,int))​([Address](../actor/Address.html "class in akka.actor") address,  int uid)` | Deprecated. Use Long UID apply instead. |
	| `[UniqueAddress](UniqueAddress.html "class in akka.cluster")` | `[apply](#apply(akka.actor.Address,long))​([Address](../actor/Address.html "class in akka.actor") address,  long longUid)` |  |
	| `[UniqueAddress](UniqueAddress.html "class in akka.cluster")` | `[apply](#apply(akka.remote.UniqueAddress))​([UniqueAddress](../remote/UniqueAddress.html "class in akka.remote") remoteUniqueAddress)` |  |
	| `scala.Option<scala.Tuple2<[Address](../actor/Address.html "class in akka.actor"),​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.UniqueAddress))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") address)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, toString, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UniqueAddress$](UniqueAddress$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UniqueAddress$
		
		
		
		```
		public UniqueAddress$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [UniqueAddress](UniqueAddress.html "class in akka.cluster") apply​([Address](../actor/Address.html "class in akka.actor") address,
		                           int uid)
		```
		
		Deprecated.
		Use Long UID apply instead. Since 2\.4\.11\.
		- #### apply
		
		
		
		```
		public [UniqueAddress](UniqueAddress.html "class in akka.cluster") apply​([UniqueAddress](../remote/UniqueAddress.html "class in akka.remote") remoteUniqueAddress)
		```
		- #### apply
		
		
		
		```
		public [UniqueAddress](UniqueAddress.html "class in akka.cluster") apply​([Address](../actor/Address.html "class in akka.actor") address,
		                           long longUid)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[Address](../actor/Address.html "class in akka.actor"),​java.lang.Object>> unapply​([UniqueAddress](UniqueAddress.html "class in akka.cluster") address)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress$.html](https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress$.html)*