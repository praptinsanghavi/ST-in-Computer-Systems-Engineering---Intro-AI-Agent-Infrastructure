---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/JoinSeedNodes.html
title: JoinSeedNodes
---

# JoinSeedNodes

## Content

Package [akka.cluster.typed](package-summary.html)
## Class JoinSeedNodes

- java.lang.Object
- - akka.cluster.typed.JoinSeedNodes

- All Implemented Interfaces:
`[ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class JoinSeedNodes
extends java.lang.Object
implements [ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed"), scala.Product, java.io.Serializable
```

Scala API: Join the specified seed nodes without defining them in config.
 Especially useful from tests when Addresses are unknown before startup time.
 
 An actor system can only join a cluster once. Additional attempts will be ignored.
 When it has successfully joined it must be restarted to be able to join another
 cluster or to join the same cluster again.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.JoinSeedNodes)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JoinSeedNodes](#%3Cinit%3E(java.util.List))​(java.util.List<[Address](../../actor/Address.html "class in akka.actor")> seedNodes)` | Java API: Join the specified seed nodes without defining them in config. |
	| `[JoinSeedNodes](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")> seedNodes)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")> seedNodes)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed")` | `[copy](#copy(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")> seedNodes)` |  |
	| `scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")>` | `[seedNodes](#seedNodes())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")>>` | `[unapply](#unapply(akka.cluster.typed.JoinSeedNodes))​([JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### JoinSeedNodes
		
		
		
		```
		public JoinSeedNodes​(scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")> seedNodes)
		```
		- #### JoinSeedNodes
		
		
		
		```
		public JoinSeedNodes​(java.util.List<[Address](../../actor/Address.html "class in akka.actor")> seedNodes)
		```
		
		Java API: Join the specified seed nodes without defining them in config.
		 Especially useful from tests when Addresses are unknown before startup time.
		 
		 An actor system can only join a cluster once. Additional attempts will be ignored.
		 When it has successfully joined it must be restarted to be able to join another
		 cluster or to join the same cluster again.
		 
		
		
		 Creates a defensive copy of the list to ensure immutability.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed") apply​(scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")> seedNodes)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")>> unapply​([JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed") x$0)
		```
		- #### seedNodes
		
		
		
		```
		public scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")> seedNodes()
		```
		- #### copy
		
		
		
		```
		public [JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed") copy​(scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")> seedNodes)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")> copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/JoinSeedNodes.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/JoinSeedNodes.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/JoinSeedNodes.html)*