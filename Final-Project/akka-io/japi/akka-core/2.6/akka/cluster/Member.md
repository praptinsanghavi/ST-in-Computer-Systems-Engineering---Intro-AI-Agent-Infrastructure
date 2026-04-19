---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:14:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/cluster/Member.html
title: Member
---

# Member

## Content

Package [akka.cluster](package-summary.html)
## Class Member

- java.lang.Object
- - akka.cluster.Member

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Member
extends java.lang.Object
implements java.io.Serializable
```

Represents the address, current status, and roles of a cluster member node.
 
 Note: `hashCode` and `equals` are solely based on the underlying `Address`, not its `MemberStatus`
 and roles.

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.Member)

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Address](../actor/Address.html "class in akka.actor")` | `[address](#address())()` |  |
	| `static scala.math.Ordering<[Address](../actor/Address.html "class in akka.actor")>` | `[addressOrdering](#addressOrdering())()` | `Address` ordering type class, sorts addresses by host and port. |
	| `static scala.math.Ordering<[Member](Member.html "class in akka.cluster")>` | `[ageOrdering](#ageOrdering())()` | Sort members by age, i.e. |
	| `[Version](../util/Version.html "class in akka.util")` | `[appVersion](#appVersion())()` |  |
	| `[Member](Member.html "class in akka.cluster")` | `[copy](#copy(akka.cluster.MemberStatus))​([MemberStatus](MemberStatus.html "class in akka.cluster") status)` |  |
	| `[Member](Member.html "class in akka.cluster")` | `[copyUp](#copyUp(int))​(int upNumber)` |  |
	| `java.lang.String` | `[dataCenter](#dataCenter())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `java.util.Set<java.lang.String>` | `[getRoles](#getRoles())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasRole](#hasRole(java.lang.String))​(java.lang.String role)` |  |
	| `static [Member](Member.html "class in akka.cluster")` | `[highestPriorityOf](#highestPriorityOf(akka.cluster.Member,akka.cluster.Member))​([Member](Member.html "class in akka.cluster") m1,  [Member](Member.html "class in akka.cluster") m2)` | Picks the Member with the highest "priority" MemberStatus. |
	| `boolean` | `[isOlderThan](#isOlderThan(akka.cluster.Member))​([Member](Member.html "class in akka.cluster") other)` | Is this member older, has been part of cluster longer, than another  member. |
	| `static scala.collection.immutable.Set<[Member](Member.html "class in akka.cluster")>` | `[none](#none())()` |  |
	| `static scala.math.Ordering<[Member](Member.html "class in akka.cluster")>` | `[ordering](#ordering())()` | `Member` ordering type class, sorts members by host and port. |
	| `static scala.collection.immutable.Set<[Member](Member.html "class in akka.cluster")>` | `[pickHighestPriority](#pickHighestPriority(scala.collection.immutable.Set,scala.collection.immutable.Set))​(scala.collection.immutable.Set<[Member](Member.html "class in akka.cluster")> a,  scala.collection.immutable.Set<[Member](Member.html "class in akka.cluster")> b)` | Deprecated. Was accidentally made a public API, internal. |
	| `scala.collection.immutable.Set<java.lang.String>` | `[roles](#roles())()` |  |
	| `[MemberStatus](MemberStatus.html "class in akka.cluster")` | `[status](#status())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[UniqueAddress](UniqueAddress.html "class in akka.cluster")` | `[uniqueAddress](#uniqueAddress())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### none
		
		
		
		```
		public static scala.collection.immutable.Set<[Member](Member.html "class in akka.cluster")> none()
		```
		- #### addressOrdering
		
		
		
		```
		public static scala.math.Ordering<[Address](../actor/Address.html "class in akka.actor")> addressOrdering()
		```
		
		`Address` ordering type class, sorts addresses by host and port.
		- #### ordering
		
		
		
		```
		public static scala.math.Ordering<[Member](Member.html "class in akka.cluster")> ordering()
		```
		
		`Member` ordering type class, sorts members by host and port.
		- #### ageOrdering
		
		
		
		```
		public static scala.math.Ordering<[Member](Member.html "class in akka.cluster")> ageOrdering()
		```
		
		Sort members by age, i.e. using [`isOlderThan(akka.cluster.Member)`](#isOlderThan(akka.cluster.Member)).
		 
		 Note that it only makes sense to compare with other members of
		 same data center. To avoid mistakes of comparing members of different
		 data centers it will throw `IllegalArgumentException` if the
		 members belong to different data centers.
		- #### pickHighestPriority
		
		
		
		```
		public static scala.collection.immutable.Set<[Member](Member.html "class in akka.cluster")> pickHighestPriority​(scala.collection.immutable.Set<[Member](Member.html "class in akka.cluster")> a,
		                                                                         scala.collection.immutable.Set<[Member](Member.html "class in akka.cluster")> b)
		```
		
		Deprecated.
		Was accidentally made a public API, internal. Since 2\.5\.4\.
		- #### highestPriorityOf
		
		
		
		```
		public static [Member](Member.html "class in akka.cluster") highestPriorityOf​([Member](Member.html "class in akka.cluster") m1,
		                                       [Member](Member.html "class in akka.cluster") m2)
		```
		
		Picks the Member with the highest "priority" MemberStatus.
		 Where highest priority is furthest along the membership state machine
		- #### uniqueAddress
		
		
		
		```
		public [UniqueAddress](UniqueAddress.html "class in akka.cluster") uniqueAddress()
		```
		- #### status
		
		
		
		```
		public [MemberStatus](MemberStatus.html "class in akka.cluster") status()
		```
		- #### roles
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> roles()
		```
		- #### appVersion
		
		
		
		```
		public [Version](../util/Version.html "class in akka.util") appVersion()
		```
		- #### dataCenter
		
		
		
		```
		public java.lang.String dataCenter()
		```
		- #### address
		
		
		
		```
		public [Address](../actor/Address.html "class in akka.actor") address()
		```
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### hasRole
		
		
		
		```
		public boolean hasRole​(java.lang.String role)
		```
		- #### getRoles
		
		
		
		```
		public java.util.Set<java.lang.String> getRoles()
		```
		
		Java API
		- #### isOlderThan
		
		
		
		```
		public boolean isOlderThan​([Member](Member.html "class in akka.cluster") other)
		                    throws java.lang.IllegalArgumentException
		```
		
		Is this member older, has been part of cluster longer, than another
		 member. It is only correct when comparing two existing members in a
		 cluster. A member that joined after removal of another member may be
		 considered older than the removed member.
		 
		 Note that it only makes sense to compare with other members of
		 same data center (upNumber has a higher risk of being reused across data centers).
		 To avoid mistakes of comparing members of different data centers this
		 method will throw `IllegalArgumentException` if the members belong
		 to different data centers.
		
		
		
		Throws:
		`java.lang.IllegalArgumentException`
		- #### copy
		
		
		
		```
		public [Member](Member.html "class in akka.cluster") copy​([MemberStatus](MemberStatus.html "class in akka.cluster") status)
		```
		- #### copyUp
		
		
		
		```
		public [Member](Member.html "class in akka.cluster") copyUp​(int upNumber)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/MemberStatus.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/Version.html
- https://doc.akka.io/japi/akka-core/2.6/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/cluster/Member.html](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/Member.html)*