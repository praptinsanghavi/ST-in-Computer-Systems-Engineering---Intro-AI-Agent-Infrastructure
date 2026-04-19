---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:18:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.WeaklyUp$.html
title: MemberStatus.WeaklyUp$
---

# MemberStatus.WeaklyUp$

## Content

Package [akka.cluster](package-summary.html)
## Class MemberStatus.WeaklyUp$

- java.lang.Object
- - [akka.cluster.MemberStatus](MemberStatus.html "class in akka.cluster")
	- - akka.cluster.MemberStatus.WeaklyUp$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[MemberStatus](MemberStatus.html "class in akka.cluster")

---

```
public static class MemberStatus.WeaklyUp$
extends [MemberStatus](MemberStatus.html "class in akka.cluster")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.MemberStatus.WeaklyUp$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.cluster.[MemberStatus](MemberStatus.html "class in akka.cluster")
		
		
		`[MemberStatus.Down$](MemberStatus.Down$.html "class in akka.cluster"), [MemberStatus.Exiting$](MemberStatus.Exiting$.html "class in akka.cluster"), [MemberStatus.Joining$](MemberStatus.Joining$.html "class in akka.cluster"), [MemberStatus.Leaving$](MemberStatus.Leaving$.html "class in akka.cluster"), [MemberStatus.PreparingForShutdown$](MemberStatus.PreparingForShutdown$.html "class in akka.cluster"), [MemberStatus.ReadyForShutdown$](MemberStatus.ReadyForShutdown$.html "class in akka.cluster"), [MemberStatus.Removed$](MemberStatus.Removed$.html "class in akka.cluster"), [MemberStatus.Up$](MemberStatus.Up$.html "class in akka.cluster"), [MemberStatus.WeaklyUp$](MemberStatus.WeaklyUp$.html "class in akka.cluster")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MemberStatus.WeaklyUp$](MemberStatus.WeaklyUp$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WeaklyUp$](#%3Cinit%3E())()` |  |

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
	
	
		- ### Methods inherited from class akka.cluster.[MemberStatus](MemberStatus.html "class in akka.cluster")
		
		
		`[down](MemberStatus.html#down()), [exiting](MemberStatus.html#exiting()), [joining](MemberStatus.html#joining()), [leaving](MemberStatus.html#leaving()), [removed](MemberStatus.html#removed()), [shutDown](MemberStatus.html#shutDown()), [shuttingDown](MemberStatus.html#shuttingDown()), [up](MemberStatus.html#up()), [weaklyUp](MemberStatus.html#weaklyUp())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MemberStatus.WeaklyUp$](MemberStatus.WeaklyUp$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WeaklyUp$
		
		
		
		```
		public WeaklyUp$()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.Down$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.Exiting$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.Joining$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.Leaving$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.PreparingForShutdown$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.ReadyForShutdown$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.Removed$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.Up$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.WeaklyUp$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.WeaklyUp$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.WeaklyUp$.html)*