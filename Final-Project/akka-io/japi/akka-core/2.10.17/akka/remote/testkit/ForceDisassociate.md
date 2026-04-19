---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/ForceDisassociate.html
title: ForceDisassociate
---

# ForceDisassociate

## Content

Package [akka.remote.testkit](package-summary.html)
## Class ForceDisassociate

- java.lang.Object
- - akka.remote.testkit.ForceDisassociate

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ForceDisassociate
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Management Command to force disassociation of an address.

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testkit.ForceDisassociate)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ForceDisassociate](#%3Cinit%3E(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[address](#address())()` |  |
	| `static [ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit")` | `[apply](#apply(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit")` | `[copy](#copy(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[Address](../../actor/Address.html "class in akka.actor")>` | `[unapply](#unapply(akka.remote.testkit.ForceDisassociate))​([ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ForceDisassociate
		
		
		
		```
		public ForceDisassociate​([Address](../../actor/Address.html "class in akka.actor") address)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit") apply​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[Address](../../actor/Address.html "class in akka.actor")> unapply​([ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit") x$0)
		```
		- #### address
		
		
		
		```
		public [Address](../../actor/Address.html "class in akka.actor") address()
		```
		- #### copy
		
		
		
		```
		public [ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit") copy​([Address](../../actor/Address.html "class in akka.actor") address)
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
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/ForceDisassociate.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/ForceDisassociate.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/ForceDisassociate.html)*