---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/Join.html
title: Join
---

# Join

## Content

Package [akka.cluster.typed](package-summary.html)
## Class Join

- java.lang.Object
- - akka.cluster.typed.Join

- All Implemented Interfaces:
`[ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Join
extends java.lang.Object
implements [ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed"), scala.Product, java.io.Serializable
```

Try to join this cluster node with the node specified by 'address'.
 
 An actor system can only join a cluster once. Additional attempts will be ignored.
 When it has successfully joined it must be restarted to be able to join another
 cluster or to join the same cluster again.
 

 The name of the [`ActorSystem`](../../actor/ActorSystem.html "class in akka.actor") must be the same for all members of a
 cluster.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.Join)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Join](#%3Cinit%3E(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[address](#address())()` |  |
	| `static [Join](Join.html "class in akka.cluster.typed")` | `[apply](#apply(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Join](Join.html "class in akka.cluster.typed")` | `[copy](#copy(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `static [Join](Join.html "class in akka.cluster.typed")` | `[create](#create(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` | Java API |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[Address](../../actor/Address.html "class in akka.actor")>` | `[unapply](#unapply(akka.cluster.typed.Join))​([Join](Join.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Join
		
		
		
		```
		public Join​([Address](../../actor/Address.html "class in akka.actor") address)
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [Join](Join.html "class in akka.cluster.typed") create​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public static [Join](Join.html "class in akka.cluster.typed") apply​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[Address](../../actor/Address.html "class in akka.actor")> unapply​([Join](Join.html "class in akka.cluster.typed") x$0)
		```
		- #### address
		
		
		
		```
		public [Address](../../actor/Address.html "class in akka.actor") address()
		```
		- #### copy
		
		
		
		```
		public [Join](Join.html "class in akka.cluster.typed") copy​([Address](../../actor/Address.html "class in akka.actor") address)
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

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/Join.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/Join.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/Join.html)*