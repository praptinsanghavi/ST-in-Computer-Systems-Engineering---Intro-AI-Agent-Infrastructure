---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:31:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Flag.html
title: Flag
---

# Flag

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class Flag

- java.lang.Object
- - akka.cluster.ddata.Flag

- All Implemented Interfaces:
`[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`, `[ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Flag
extends java.lang.Object
implements [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata"), [ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.Flag)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Flag](#%3Cinit%3E(boolean))​(boolean enabled)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Flag](Flag.html "class in akka.cluster.ddata")` | `[apply](#apply())()` |  |
	| `static [Flag](Flag.html "class in akka.cluster.ddata")` | `[apply](#apply(boolean))​(boolean enabled)` | Implements a boolean flag CRDT that is initialized to `false` and  can be switched to `true`. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Flag](Flag.html "class in akka.cluster.ddata")` | `[copy](#copy(boolean))​(boolean enabled)` |  |
	| `boolean` | `[copy$default$1](#copy$default$1())()` |  |
	| `static [Flag](Flag.html "class in akka.cluster.ddata")` | `[create](#create())()` | Java API: `Flag` that is initialized to `false`. |
	| `static [Flag](Flag.html "class in akka.cluster.ddata")` | `[Disabled](#Disabled())()` | `Flag` that is initialized to `false`. |
	| `static [Flag](Flag.html "class in akka.cluster.ddata")` | `[empty](#empty())()` | `Flag` that is initialized to `false`. |
	| `boolean` | `[enabled](#enabled())()` |  |
	| `static [Flag](Flag.html "class in akka.cluster.ddata")` | `[Enabled](#Enabled())()` | `Flag` that is initialized to `true`. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[Flag](Flag.html "class in akka.cluster.ddata")` | `[merge](#merge(akka.cluster.ddata.Flag))​([Flag](Flag.html "class in akka.cluster.ddata") that)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Flag](Flag.html "class in akka.cluster.ddata")` | `[switchOn](#switchOn())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.cluster.ddata.Flag))​([Flag](Flag.html "class in akka.cluster.ddata") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`

- - ### Constructor Detail
	
	
	
		- #### Flag
		
		
		
		```
		public Flag​(boolean enabled)
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static [Flag](Flag.html "class in akka.cluster.ddata") empty()
		```
		
		`Flag` that is initialized to `false`.
		- #### Disabled
		
		
		
		```
		public static [Flag](Flag.html "class in akka.cluster.ddata") Disabled()
		```
		
		`Flag` that is initialized to `false`.
		- #### Enabled
		
		
		
		```
		public static [Flag](Flag.html "class in akka.cluster.ddata") Enabled()
		```
		
		`Flag` that is initialized to `true`.
		- #### apply
		
		
		
		```
		public static [Flag](Flag.html "class in akka.cluster.ddata") apply()
		```
		- #### create
		
		
		
		```
		public static [Flag](Flag.html "class in akka.cluster.ddata") create()
		```
		
		Java API: `Flag` that is initialized to `false`.
		- #### apply
		
		
		
		```
		public static [Flag](Flag.html "class in akka.cluster.ddata") apply​(boolean enabled)
		```
		
		Implements a boolean flag CRDT that is initialized to `false` and
		 can be switched to `true`. `true` wins over `false` in merge.
		 
		 This class is immutable, i.e. "modifying" methods return a new instance.
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​([Flag](Flag.html "class in akka.cluster.ddata") x$0)
		```
		- #### enabled
		
		
		
		```
		public boolean enabled()
		```
		- #### switchOn
		
		
		
		```
		public [Flag](Flag.html "class in akka.cluster.ddata") switchOn()
		```
		- #### merge
		
		
		
		```
		public [Flag](Flag.html "class in akka.cluster.ddata") merge​([Flag](Flag.html "class in akka.cluster.ddata") that)
		```
		- #### copy
		
		
		
		```
		public [Flag](Flag.html "class in akka.cluster.ddata") copy​(boolean enabled)
		```
		- #### copy$default$1
		
		
		
		```
		public boolean copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Flag.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Flag.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Flag.html)*