---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/StorageFailure$.html
title: StorageFailure$
---

# StorageFailure$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class StorageFailure$

- java.lang.Object
- - akka.persistence.testkit.StorageFailure$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class StorageFailure$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.StorageFailure$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StorageFailure$](StorageFailure$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StorageFailure$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Throwable` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `[StorageFailure](StorageFailure.html "class in akka.persistence.testkit")` | `[apply](#apply(java.lang.Throwable))​(java.lang.Throwable error)` |  |
	| `java.lang.Throwable` | `[apply$default$1](#apply$default$1())()` |  |
	| `[StorageFailure](StorageFailure.html "class in akka.persistence.testkit")` | `[create](#create())()` |  |
	| `[StorageFailure](StorageFailure.html "class in akka.persistence.testkit")` | `[create](#create(java.lang.Throwable))​(java.lang.Throwable error)` |  |
	| `scala.Option<java.lang.Throwable>` | `[unapply](#unapply(akka.persistence.testkit.StorageFailure))​([StorageFailure](StorageFailure.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StorageFailure$](StorageFailure$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StorageFailure$
		
		
		
		```
		public StorageFailure$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public java.lang.Throwable $lessinit$greater$default$1()
		```
		- #### create
		
		
		
		```
		public [StorageFailure](StorageFailure.html "class in akka.persistence.testkit") create​(java.lang.Throwable error)
		```
		- #### create
		
		
		
		```
		public [StorageFailure](StorageFailure.html "class in akka.persistence.testkit") create()
		```
		- #### apply
		
		
		
		```
		public [StorageFailure](StorageFailure.html "class in akka.persistence.testkit") apply​(java.lang.Throwable error)
		```
		- #### apply$default$1
		
		
		
		```
		public java.lang.Throwable apply$default$1()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Throwable> unapply​([StorageFailure](StorageFailure.html "class in akka.persistence.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/StorageFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/StorageFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/StorageFailure$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/StorageFailure$.html)*