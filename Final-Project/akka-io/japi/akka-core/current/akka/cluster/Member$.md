---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:52:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/Member$.html
title: Member$
---

# Member$

## Content

Package [akka.cluster](package-summary.html)
## Class Member$

- java.lang.Object
- - akka.cluster.Member$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Member$
extends java.lang.Object
implements java.io.Serializable
```

Module with factory and ordering methods for Member instances.

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.Member$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Member$](Member$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Member$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.math.Ordering<[Address](../actor/Address.html "class in akka.actor")>` | `[addressOrdering](#addressOrdering())()` | `Address` ordering type class, sorts addresses by host and port. |
	| `scala.math.Ordering<[Member](Member.html "class in akka.cluster")>` | `[ageOrdering](#ageOrdering())()` | Sort members by age, i.e. |
	| `[Member](Member.html "class in akka.cluster")` | `[highestPriorityOf](#highestPriorityOf(akka.cluster.Member,akka.cluster.Member))​([Member](Member.html "class in akka.cluster") m1,  [Member](Member.html "class in akka.cluster") m2)` | Picks the Member with the highest "priority" MemberStatus. |
	| `scala.collection.immutable.Set<[Member](Member.html "class in akka.cluster")>` | `[none](#none())()` |  |
	| `scala.math.Ordering<[Member](Member.html "class in akka.cluster")>` | `[ordering](#ordering())()` | `Member` ordering type class, sorts members by host and port. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Member$](Member$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Member$
		
		
		
		```
		public Member$()
		```

	- ### Method Detail
	
	
	
		- #### none
		
		
		
		```
		public scala.collection.immutable.Set<[Member](Member.html "class in akka.cluster")> none()
		```
		- #### addressOrdering
		
		
		
		```
		public scala.math.Ordering<[Address](../actor/Address.html "class in akka.actor")> addressOrdering()
		```
		
		`Address` ordering type class, sorts addresses by host and port.
		- #### ordering
		
		
		
		```
		public scala.math.Ordering<[Member](Member.html "class in akka.cluster")> ordering()
		```
		
		`Member` ordering type class, sorts members by host and port.
		- #### ageOrdering
		
		
		
		```
		public scala.math.Ordering<[Member](Member.html "class in akka.cluster")> ageOrdering()
		```
		
		Sort members by age, i.e. using [`Member.isOlderThan(akka.cluster.Member)`](Member.html#isOlderThan(akka.cluster.Member)).
		 
		 Note that it only makes sense to compare with other members of
		 same data center. To avoid mistakes of comparing members of different
		 data centers it will throw `IllegalArgumentException` if the
		 members belong to different data centers.
		- #### highestPriorityOf
		
		
		
		```
		public [Member](Member.html "class in akka.cluster") highestPriorityOf​([Member](Member.html "class in akka.cluster") m1,
		                                [Member](Member.html "class in akka.cluster") m2)
		```
		
		Picks the Member with the highest "priority" MemberStatus.
		 Where highest priority is furthest along the membership state machine

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/Member$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/Member$.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/Member$.html)*