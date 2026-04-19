---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:18:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html
title: UniqueAddress
---

# UniqueAddress

## Content

Package [akka.cluster](package-summary.html)
## Class UniqueAddress

- java.lang.Object
- - akka.cluster.UniqueAddress

- All Implemented Interfaces:
`java.io.Serializable`, `java.lang.Comparable<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>`, `scala.Equals`, `scala.math.Ordered<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>`, `scala.Product`

---

```
public final class UniqueAddress
extends java.lang.Object
implements scala.Product, java.io.Serializable, scala.math.Ordered<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>
```

Member identifier consisting of address and random `uid`.
 The `uid` is needed to be able to distinguish different
 incarnations of a member with same hostname and port.

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.UniqueAddress)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UniqueAddress](#%3Cinit%3E(akka.actor.Address,int))​([Address](../actor/Address.html "class in akka.actor") address,  int uid)` | Deprecated. Use Long UID constructor instead. |
	| `[UniqueAddress](#%3Cinit%3E(akka.actor.Address,long))​([Address](../actor/Address.html "class in akka.actor") address,  long longUid)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Address](../actor/Address.html "class in akka.actor")` | `[address](#address())()` |  |
	| `static [UniqueAddress](UniqueAddress.html "class in akka.cluster")` | `[apply](#apply(akka.actor.Address,int))​([Address](../actor/Address.html "class in akka.actor") address,  int uid)` | Deprecated. Use Long UID apply instead. |
	| `static [UniqueAddress](UniqueAddress.html "class in akka.cluster")` | `[apply](#apply(akka.actor.Address,long))​([Address](../actor/Address.html "class in akka.actor") address,  long longUid)` |  |
	| `static [UniqueAddress](UniqueAddress.html "class in akka.cluster")` | `[apply](#apply(akka.remote.UniqueAddress))​([UniqueAddress](../remote/UniqueAddress.html "class in akka.remote") remoteUniqueAddress)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object that)` |  |
	| `int` | `[compare](#compare(akka.cluster.UniqueAddress))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") that)` |  |
	| `[UniqueAddress](UniqueAddress.html "class in akka.cluster")` | `[copy](#copy(akka.actor.Address,int))​([Address](../actor/Address.html "class in akka.actor") address,  int uid)` | Deprecated. Use Long UID constructor instead. |
	| `[Address](../actor/Address.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `int` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `long` | `[longUid](#longUid())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int n)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `int` | `[uid](#uid())()` | Deprecated. Use longUid instead. |
	| `static scala.Option<scala.Tuple2<[Address](../actor/Address.html "class in akka.actor"),​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.UniqueAddress))​([UniqueAddress](UniqueAddress.html "class in akka.cluster") address)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.math.Ordered
		
		
		`$greater, $greater$eq, $less, $less$eq, compareTo`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### UniqueAddress
		
		
		
		```
		public UniqueAddress​([Address](../actor/Address.html "class in akka.actor") address,
		                     long longUid)
		```
		- #### UniqueAddress
		
		
		
		```
		public UniqueAddress​([Address](../actor/Address.html "class in akka.actor") address,
		                     int uid)
		```
		
		Deprecated.
		Use Long UID constructor instead. Since 2\.4\.11\.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [UniqueAddress](UniqueAddress.html "class in akka.cluster") apply​([Address](../actor/Address.html "class in akka.actor") address,
		                                  int uid)
		```
		
		Deprecated.
		Use Long UID apply instead. Since 2\.4\.11\.
		- #### apply
		
		
		
		```
		public static [UniqueAddress](UniqueAddress.html "class in akka.cluster") apply​([UniqueAddress](../remote/UniqueAddress.html "class in akka.remote") remoteUniqueAddress)
		```
		- #### apply
		
		
		
		```
		public static [UniqueAddress](UniqueAddress.html "class in akka.cluster") apply​([Address](../actor/Address.html "class in akka.actor") address,
		                                  long longUid)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[Address](../actor/Address.html "class in akka.actor"),​java.lang.Object>> unapply​([UniqueAddress](UniqueAddress.html "class in akka.cluster") address)
		```
		- #### address
		
		
		
		```
		public [Address](../actor/Address.html "class in akka.actor") address()
		```
		- #### longUid
		
		
		
		```
		public long longUid()
		```
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int n)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object that)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### compare
		
		
		
		```
		public int compare​([UniqueAddress](UniqueAddress.html "class in akka.cluster") that)
		```
		
		
		Specified by:
		`compare` in interface `scala.math.Ordered<[UniqueAddress](UniqueAddress.html "class in akka.cluster")>`
		- #### uid
		
		
		
		```
		public int uid()
		```
		
		Deprecated.
		Use longUid instead. Since 2\.4\.11\.
		- #### copy
		
		
		
		```
		public [UniqueAddress](UniqueAddress.html "class in akka.cluster") copy​([Address](../actor/Address.html "class in akka.actor") address,
		                          int uid)
		```
		
		Deprecated.
		Use Long UID constructor instead. Since 2\.4\.11\.
		
		For binary compatibility
		 Stops `copy(Address, Long)` copy from being generated, use `apply` instead.
		- #### copy$default$1
		
		
		
		```
		public [Address](../actor/Address.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public int copy$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html)*