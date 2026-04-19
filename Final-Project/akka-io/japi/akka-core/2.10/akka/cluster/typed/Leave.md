---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Leave.html
title: Leave
---

# Leave

## Content

Package [akka.cluster.typed](package-summary.html)
## Class Leave

- java.lang.Object
- - akka.cluster.typed.Leave

- All Implemented Interfaces:
`[ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Leave
extends java.lang.Object
implements [ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed"), scala.Product, java.io.Serializable
```

Send command to issue state transition to LEAVING for the node specified by 'address'.
 The member will go through the status changes `MemberStatus` `Leaving` (not published to
 subscribers) followed by `MemberStatus` `Exiting` and finally `MemberStatus` `Removed`.
 
 Note that this command can be issued to any member in the cluster, not necessarily the
 one that is leaving. The cluster extension, but not the actor system or JVM, of the
 leaving member will be shutdown after the leader has changed status of the member to
 Exiting. Thereafter the member will be removed from the cluster. Normally this is
 handled automatically, but in case of network failures during this process it might
 still be necessary to set the node\&rsquo;s status to Down in order to complete the removal.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.Leave)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Leave](#%3Cinit%3E(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[address](#address())()` |  |
	| `static [Leave](Leave.html "class in akka.cluster.typed")` | `[apply](#apply(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Leave](Leave.html "class in akka.cluster.typed")` | `[copy](#copy(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `static [Leave](Leave.html "class in akka.cluster.typed")` | `[create](#create(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` | Java API |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[Address](../../actor/Address.html "class in akka.actor")>` | `[unapply](#unapply(akka.cluster.typed.Leave))​([Leave](Leave.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Leave
		
		
		
		```
		public Leave​([Address](../../actor/Address.html "class in akka.actor") address)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [Leave](Leave.html "class in akka.cluster.typed") create​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public static [Leave](Leave.html "class in akka.cluster.typed") apply​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[Address](../../actor/Address.html "class in akka.actor")> unapply​([Leave](Leave.html "class in akka.cluster.typed") x$0)
		```
		- #### address
		
		
		
		```
		public [Address](../../actor/Address.html "class in akka.actor") address()
		```
		- #### copy
		
		
		
		```
		public [Leave](Leave.html "class in akka.cluster.typed") copy​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		- #### copy$default$1
		
		
		
		```
		public [Address](../../actor/Address.html "class in akka.actor") copy$default$1()
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
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Leave.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Leave.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/Leave.html)*