---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:41:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.DecodedId.html
title: ShardedDaemonProcessId.DecodedId
---

# ShardedDaemonProcessId.DecodedId

## Content

Package [akka.cluster.sharding.typed.internal](package-summary.html)
## Class ShardedDaemonProcessId.DecodedId

- java.lang.Object
- - akka.cluster.sharding.typed.internal.ShardedDaemonProcessId.DecodedId

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[ShardedDaemonProcessId](ShardedDaemonProcessId.html "class in akka.cluster.sharding.typed.internal")

---

```
public static final class ShardedDaemonProcessId.DecodedId
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.cluster.sharding.typed.internal.ShardedDaemonProcessId.DecodedId)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DecodedId](#%3Cinit%3E(long,int,int))​(long revision,  int totalCount,  int processNumber)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ShardedDaemonProcessId.DecodedId](ShardedDaemonProcessId.DecodedId.html "class in akka.cluster.sharding.typed.internal")` | `[copy](#copy(long,int,int))​(long revision,  int totalCount,  int processNumber)` |  |
	| `long` | `[copy$default$1](#copy$default$1())()` |  |
	| `int` | `[copy$default$2](#copy$default$2())()` |  |
	| `int` | `[copy$default$3](#copy$default$3())()` |  |
	| `java.lang.String` | `[encodeEntityId](#encodeEntityId())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[processNumber](#processNumber())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[revision](#revision())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `int` | `[totalCount](#totalCount())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DecodedId
		
		
		
		```
		public DecodedId​(long revision,
		                 int totalCount,
		                 int processNumber)
		```

	- ### Method Detail
	
	
	
		- #### revision
		
		
		
		```
		public long revision()
		```
		- #### totalCount
		
		
		
		```
		public int totalCount()
		```
		- #### processNumber
		
		
		
		```
		public int processNumber()
		```
		- #### encodeEntityId
		
		
		
		```
		public java.lang.String encodeEntityId()
		```
		- #### copy
		
		
		
		```
		public [ShardedDaemonProcessId.DecodedId](ShardedDaemonProcessId.DecodedId.html "class in akka.cluster.sharding.typed.internal") copy​(long revision,
		                                             int totalCount,
		                                             int processNumber)
		```
		- #### copy$default$1
		
		
		
		```
		public long copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public int copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public int copy$default$3()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.DecodedId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.DecodedId.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/internal/ShardedDaemonProcessId.DecodedId.html)*