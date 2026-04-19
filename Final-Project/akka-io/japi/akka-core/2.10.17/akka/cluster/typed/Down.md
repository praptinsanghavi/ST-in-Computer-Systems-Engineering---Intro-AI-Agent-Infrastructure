---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Down.html
title: Down
---

# Down

## Content

Package [akka.cluster.typed](package-summary.html)
## Class Down

- java.lang.Object
- - akka.cluster.typed.Down

- All Implemented Interfaces:
`[ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Down
extends java.lang.Object
implements [ClusterCommand](ClusterCommand.html "interface in akka.cluster.typed"), scala.Product, java.io.Serializable
```

Send command to DOWN the node specified by 'address'.
 
 When a member is considered by the failure detector to be unreachable the leader is not
 allowed to perform its duties, such as changing status of new joining members to 'Up'.
 The status of the unreachable member must be changed to 'Down', which can be done with
 this method.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.Down)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Down](#%3Cinit%3E(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[address](#address())()` |  |
	| `static [Down](Down.html "class in akka.cluster.typed")` | `[apply](#apply(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Down](Down.html "class in akka.cluster.typed")` | `[copy](#copy(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[Address](../../actor/Address.html "class in akka.actor")>` | `[unapply](#unapply(akka.cluster.typed.Down))​([Down](Down.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Down
		
		
		
		```
		public Down​([Address](../../actor/Address.html "class in akka.actor") address)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Down](Down.html "class in akka.cluster.typed") apply​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[Address](../../actor/Address.html "class in akka.actor")> unapply​([Down](Down.html "class in akka.cluster.typed") x$0)
		```
		- #### address
		
		
		
		```
		public [Address](../../actor/Address.html "class in akka.actor") address()
		```
		- #### copy
		
		
		
		```
		public [Down](Down.html "class in akka.cluster.typed") copy​([Address](../../actor/Address.html "class in akka.actor") address)
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Down.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Down.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/Down.html)*