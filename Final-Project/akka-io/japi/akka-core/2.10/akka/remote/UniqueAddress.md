---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:14:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/UniqueAddress.html
title: UniqueAddress
---

# UniqueAddress

## Content

Package [akka.remote](package-summary.html)
## Class UniqueAddress

- java.lang.Object
- - akka.remote.UniqueAddress

- All Implemented Interfaces:
`java.io.Serializable`, `java.lang.Comparable<[UniqueAddress](UniqueAddress.html "class in akka.remote")>`, `scala.Equals`, `scala.math.Ordered<[UniqueAddress](UniqueAddress.html "class in akka.remote")>`, `scala.Product`

---

```
public final class UniqueAddress
extends java.lang.Object
implements scala.math.Ordered<[UniqueAddress](UniqueAddress.html "class in akka.remote")>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.UniqueAddress)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UniqueAddress](#%3Cinit%3E(akka.actor.Address,long))​([Address](../actor/Address.html "class in akka.actor") address,  long uid)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Address](../actor/Address.html "class in akka.actor")` | `[address](#address())()` |  |
	| `static [UniqueAddress](UniqueAddress.html "class in akka.remote")` | `[apply](#apply(akka.actor.Address,long))​([Address](../actor/Address.html "class in akka.actor") address,  long uid)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[compare](#compare(akka.remote.UniqueAddress))​([UniqueAddress](UniqueAddress.html "class in akka.remote") that)` |  |
	| `[UniqueAddress](UniqueAddress.html "class in akka.remote")` | `[copy](#copy(akka.actor.Address,long))​([Address](../actor/Address.html "class in akka.actor") address,  long uid)` |  |
	| `[Address](../actor/Address.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `long` | `[uid](#uid())()` |  |
	| `static scala.Option<scala.Tuple2<[Address](../actor/Address.html "class in akka.actor"),​java.lang.Object>>` | `[unapply](#unapply(akka.remote.UniqueAddress))​([UniqueAddress](UniqueAddress.html "class in akka.remote") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.math.Ordered
		
		
		`$greater, $greater$eq, $less, $less$eq, compareTo`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### UniqueAddress
		
		
		
		```
		public UniqueAddress​([Address](../actor/Address.html "class in akka.actor") address,
		                     long uid)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [UniqueAddress](UniqueAddress.html "class in akka.remote") apply​([Address](../actor/Address.html "class in akka.actor") address,
		                                  long uid)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[Address](../actor/Address.html "class in akka.actor"),​java.lang.Object>> unapply​([UniqueAddress](UniqueAddress.html "class in akka.remote") x$0)
		```
		- #### address
		
		
		
		```
		public [Address](../actor/Address.html "class in akka.actor") address()
		```
		- #### uid
		
		
		
		```
		public long uid()
		```
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### compare
		
		
		
		```
		public int compare​([UniqueAddress](UniqueAddress.html "class in akka.remote") that)
		```
		
		
		Specified by:
		`compare` in interface `scala.math.Ordered<[UniqueAddress](UniqueAddress.html "class in akka.remote")>`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### copy
		
		
		
		```
		public [UniqueAddress](UniqueAddress.html "class in akka.remote") copy​([Address](../actor/Address.html "class in akka.actor") address,
		                          long uid)
		```
		- #### copy$default$1
		
		
		
		```
		public [Address](../actor/Address.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/UniqueAddress.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/UniqueAddress.html)*