---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GSet$.html
title: GSet$
---

# GSet$

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class GSet$

- java.lang.Object
- - akka.cluster.ddata.GSet$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class GSet$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.GSet$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GSet$](GSet$.html "class in akka.cluster.ddata")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GSet$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GSet](GSet.html "class in akka.cluster.ddata")<java.lang.Object>` | `[apply](#apply())()` |  |
	| `<A> [GSet](GSet.html "class in akka.cluster.ddata")<A>` | `[apply](#apply(scala.collection.immutable.Set,scala.Option))​(scala.collection.immutable.Set<A> elements,  scala.Option<[GSet](GSet.html "class in akka.cluster.ddata")<A>> delta)` | Implements a 'Add Set' CRDT, also called a 'G\-Set'. |
	| `<A> [GSet](GSet.html "class in akka.cluster.ddata")<A>` | `[create](#create())()` | Java API |
	| `<A> [GSet](GSet.html "class in akka.cluster.ddata")<A>` | `[empty](#empty())()` |  |
	| `<A> scala.Option<scala.collection.immutable.Set<A>>` | `[unapply](#unapply(akka.cluster.ddata.GSet))​([GSet](GSet.html "class in akka.cluster.ddata")<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GSet$](GSet$.html "class in akka.cluster.ddata") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GSet$
		
		
		
		```
		public GSet$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public <A> [GSet](GSet.html "class in akka.cluster.ddata")<A> empty()
		```
		- #### apply
		
		
		
		```
		public [GSet](GSet.html "class in akka.cluster.ddata")<java.lang.Object> apply()
		```
		- #### create
		
		
		
		```
		public <A> [GSet](GSet.html "class in akka.cluster.ddata")<A> create()
		```
		
		Java API
		- #### apply
		
		
		
		```
		public <A> [GSet](GSet.html "class in akka.cluster.ddata")<A> apply​(scala.collection.immutable.Set<A> elements,
		                         scala.Option<[GSet](GSet.html "class in akka.cluster.ddata")<A>> delta)
		```
		
		Implements a 'Add Set' CRDT, also called a 'G\-Set'. You can't
		 remove elements of a G\-Set.
		 
		 It is described in the paper
		 [A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).
		 
		
		
		 A G\-Set doesn't accumulate any garbage apart from the elements themselves.
		 
		
		
		 This class is immutable, i.e. "modifying" methods return a new instance.
		- #### unapply
		
		
		
		```
		public <A> scala.Option<scala.collection.immutable.Set<A>> unapply​([GSet](GSet.html "class in akka.cluster.ddata")<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GSet$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GSet.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GSet$.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GSet$.html)*