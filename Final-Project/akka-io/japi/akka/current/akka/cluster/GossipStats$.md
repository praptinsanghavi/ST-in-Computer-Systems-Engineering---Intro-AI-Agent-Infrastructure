---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:41:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/GossipStats$.html
title: GossipStats$
---

# GossipStats$

## Content

Package [akka.cluster](package-summary.html)
## Class GossipStats$

- java.lang.Object
- - scala.runtime.AbstractFunction5\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.GossipStats\>
	- - akka.cluster.GossipStats$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function5<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.GossipStats>`

---

```
public class GossipStats$
extends scala.runtime.AbstractFunction5<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.GossipStats>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.GossipStats$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GossipStats$](GossipStats$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GossipStats$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `long` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `long` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `long` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `long` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `akka.cluster.GossipStats` | `[apply](#apply(long,long,long,long,long))​(long receivedGossipCount,  long mergeCount,  long sameCount,  long newerCount,  long olderCount)` |  |
	| `long` | `[apply$default$1](#apply$default$1())()` |  |
	| `long` | `[apply$default$2](#apply$default$2())()` |  |
	| `long` | `[apply$default$3](#apply$default$3())()` |  |
	| `long` | `[apply$default$4](#apply$default$4())()` |  |
	| `long` | `[apply$default$5](#apply$default$5())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple5<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.GossipStats))​(akka.cluster.GossipStats x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction5
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function5
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GossipStats$](GossipStats$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GossipStats$
		
		
		
		```
		public GossipStats$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public long $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public long $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public long $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public long $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public long $lessinit$greater$default$5()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function5<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.GossipStats>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction5<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.GossipStats>`
		- #### apply
		
		
		
		```
		public akka.cluster.GossipStats apply​(long receivedGossipCount,
		                                      long mergeCount,
		                                      long sameCount,
		                                      long newerCount,
		                                      long olderCount)
		```
		- #### apply$default$1
		
		
		
		```
		public long apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public long apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public long apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public long apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public long apply$default$5()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple5<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​(akka.cluster.GossipStats x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/GossipStats$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/GossipStats$.html](https://doc.akka.io/japi/akka/current/akka/cluster/GossipStats$.html)*