---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:17:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterUserAction.SetAppVersionLater$.html
title: ClusterUserAction.SetAppVersionLater$
---

# ClusterUserAction.SetAppVersionLater$

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterUserAction.SetAppVersionLater$

- java.lang.Object
- - akka.cluster.ClusterUserAction.SetAppVersionLater$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[ClusterUserAction](ClusterUserAction.html "class in akka.cluster")

---

```
public static class ClusterUserAction.SetAppVersionLater$
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

The `appVersion` is defined after system startup but before joining.
 The `appVersion` is defined via the `SetAppVersion` message.
 Subsequent `JoinTo` will be deferred until after `SetAppVersion` has been
 received.

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.ClusterUserAction.SetAppVersionLater$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterUserAction.SetAppVersionLater$](ClusterUserAction.SetAppVersionLater$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SetAppVersionLater$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterUserAction.SetAppVersionLater$](ClusterUserAction.SetAppVersionLater$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SetAppVersionLater$
		
		
		
		```
		public SetAppVersionLater$()
		```

	- ### Method Detail
	
	
	
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterUserAction.SetAppVersionLater$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterUserAction.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterUserAction.SetAppVersionLater$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterUserAction.SetAppVersionLater$.html)*