---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWRegister.html
title: LWWRegister
---

# LWWRegister

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class LWWRegister\<A\>

- java.lang.Object
- - akka.cluster.ddata.LWWRegister\<A\>

- All Implemented Interfaces:
`[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")`, `[ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")`, `java.io.Serializable`

---

```
public final class LWWRegister<A>
extends java.lang.Object
implements [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata"), [ReplicatedDataSerialization](ReplicatedDataSerialization.html "interface in akka.cluster.ddata")
```

Implements a 'Last Writer Wins Register' CRDT, also called a 'LWW\-Register'.
 
 It is described in the paper
 [A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).
 

 Merge takes the register with highest timestamp. Note that this
 relies on synchronized clocks. `LWWRegister` should only be used when the choice of
 value is not important for concurrent updates occurring within the clock skew.
 

 Merge takes the register updated by the node with lowest address (`UniqueAddress` is ordered)
 if the timestamps are exactly the same.
 

 Instead of using timestamps based on `System.currentTimeMillis()` time it is possible to
 use a timestamp value based on something else, for example an increasing version number
 from a database record that is used for optimistic concurrency control.
 

 The `defaultClock` is using max value of `System.currentTimeMillis()` and `currentTimestamp + 1`.
 This means that the timestamp is increased for changes on the same node that occurs within
 the same millisecond. It also means that it is safe to use the `LWWRegister` without
 synchronized clocks when there is only one active writer, e.g. a Cluster Singleton. Such a
 single writer should then first read current value with `ReadMajority` (or more) before
 changing and writing the value with `WriteMajority` (or more).
 

 For first\-write\-wins semantics you can use the [`reverseClock()`](#reverseClock()) instead of the
 [`defaultClock()`](#defaultClock())

 This class is immutable, i.e. "modifying" methods return a new instance.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.LWWRegister)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<[A](LWWRegister.Clock.html "type parameter in LWWRegister.Clock")>` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>` | `[apply](#apply(akka.cluster.ddata.SelfUniqueAddress,A))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  A initialValue)` |  |
	| `static <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>` | `[apply](#apply(akka.cluster.ddata.SelfUniqueAddress,A,akka.cluster.ddata.LWWRegister.Clock))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  A initialValue,  [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)` |  |
	| `static <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>` | `[create](#create(akka.cluster.ddata.SelfUniqueAddress,A))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  A initialValue)` | Java API |
	| `static <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>` | `[create](#create(akka.cluster.ddata.SelfUniqueAddress,A,akka.cluster.ddata.LWWRegister.Clock))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  A initialValue,  [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)` | Java API |
	| `static <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A>` | `[create](#create(A,akka.cluster.ddata.SelfUniqueAddress,akka.cluster.ddata.LWWRegister.Clock))​(A initialValue,  [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)` | Scala API  Creates a `LWWRegister` with implicits, given deprecated `apply` functions using Cluster constrain overloading. |
	| `static <A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A>` | `[create$default$3](#create$default$3(A))​(A initialValue)` |  |
	| `static <A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A>` | `[defaultClock](#defaultClock())()` | The default [`LWWRegister.Clock`](LWWRegister.Clock.html "interface in akka.cluster.ddata") is using max value of `System.currentTimeMillis()`  and `currentTimestamp + 1`. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object o)` |  |
	| `[A](LWWRegister.html "type parameter in LWWRegister")` | `[getValue](#getValue())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")>` | `[merge](#merge(akka.cluster.ddata.LWWRegister))​([LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")> that)` | INTERNAL API |
	| `static <A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A>` | `[reverseClock](#reverseClock())()` | This [`LWWRegister.Clock`](LWWRegister.Clock.html "interface in akka.cluster.ddata") can be used for first\-write\-wins semantics. |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <A> scala.Option<A>` | `[unapply](#unapply(akka.cluster.ddata.LWWRegister))​([LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> c)` | Extract the [`value()`](#value()). |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.cluster")` | `[updatedBy](#updatedBy())()` | The current `value` was set by this node. |
	| `[A](LWWRegister.html "type parameter in LWWRegister")` | `[value](#value())()` |  |
	| `[LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")>` | `[withValue](#withValue(akka.cluster.ddata.SelfUniqueAddress,A))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  [A](LWWRegister.html "type parameter in LWWRegister") value)` | Change the value of the register. |
	| `[LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")>` | `[withValue](#withValue(akka.cluster.ddata.SelfUniqueAddress,A,akka.cluster.ddata.LWWRegister.Clock))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  [A](LWWRegister.html "type parameter in LWWRegister") value,  [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")> clock)` | Change the value of the register. |
	| `[LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")>` | `[withValueOf](#withValueOf(A,akka.cluster.ddata.SelfUniqueAddress,akka.cluster.ddata.LWWRegister.Clock))​([A](LWWRegister.html "type parameter in LWWRegister") value,  [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,  [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")> clock)` | Change the value of the register. |
	| `[LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")>` | `[withValueOf$default$3](#withValueOf$default$3(A))​([A](LWWRegister.html "type parameter in LWWRegister") value)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.cluster.ddata.[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")
		
		
		`[merge](ReplicatedData.html#merge(akka.cluster.ddata.ReplicatedData))`

- - ### Method Detail
	
	
	
		- #### defaultClock
		
		
		
		```
		public static <A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> defaultClock()
		```
		
		The default [`LWWRegister.Clock`](LWWRegister.Clock.html "interface in akka.cluster.ddata") is using max value of `System.currentTimeMillis()`
		 and `currentTimestamp + 1`.
		- #### reverseClock
		
		
		
		```
		public static <A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> reverseClock()
		```
		
		This [`LWWRegister.Clock`](LWWRegister.Clock.html "interface in akka.cluster.ddata") can be used for first\-write\-wins semantics. It is using min value of
		 `-System.currentTimeMillis()` and `currentTimestamp + 1`, i.e. it is counting backwards.
		- #### apply
		
		
		
		```
		public static <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> apply​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                       A initialValue)
		```
		- #### apply
		
		
		
		```
		public static <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> apply​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                       A initialValue,
		                                       [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)
		```
		- #### create
		
		
		
		```
		public static <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> create​(A initialValue,
		                                        [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                        [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)
		```
		
		Scala API
		 Creates a `LWWRegister` with implicits, given deprecated `apply` functions using Cluster constrain overloading.
		- #### create
		
		
		
		```
		public static <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> create​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                        A initialValue,
		                                        [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> clock)
		```
		
		Java API
		- #### create
		
		
		
		```
		public static <A> [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> create​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                        A initialValue)
		```
		
		Java API
		- #### create$default$3
		
		
		
		```
		public static <A> [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<A> create$default$3​(A initialValue)
		```
		- #### unapply
		
		
		
		```
		public static <A> scala.Option<A> unapply​([LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<A> c)
		```
		
		Extract the [`value()`](#value()).
		- #### value
		
		
		
		```
		public [A](LWWRegister.html "type parameter in LWWRegister") value()
		```
		- #### timestamp
		
		
		
		```
		public long timestamp()
		```
		- #### getValue
		
		
		
		```
		public [A](LWWRegister.html "type parameter in LWWRegister") getValue()
		```
		
		Java API
		- #### withValue
		
		
		
		```
		public [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")> withValue​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                [A](LWWRegister.html "type parameter in LWWRegister") value,
		                                [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")> clock)
		```
		
		Change the value of the register.
		 
		 You can provide your `clock` implementation instead of using timestamps based
		 on `System.currentTimeMillis()` time. The timestamp can for example be an
		 increasing version number from a database record that is used for optimistic
		 concurrency control.
		- #### withValue
		
		
		
		```
		public [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")> withValue​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                [A](LWWRegister.html "type parameter in LWWRegister") value)
		```
		
		Change the value of the register.
		- #### withValueOf
		
		
		
		```
		public [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")> withValueOf​([A](LWWRegister.html "type parameter in LWWRegister") value,
		                                  [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") node,
		                                  [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")> clock)
		```
		
		Change the value of the register.
		 
		 You can provide your `clock` implementation instead of using timestamps based
		 on `System.currentTimeMillis()` time. The timestamp can for example be an
		 increasing version number from a database record that is used for optimistic
		 concurrency control.
		- #### updatedBy
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.cluster") updatedBy()
		```
		
		The current `value` was set by this node.
		- #### withValueOf$default$3
		
		
		
		```
		public [LWWRegister.Clock](LWWRegister.Clock.html "interface in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")> withValueOf$default$3​([A](LWWRegister.html "type parameter in LWWRegister") value)
		```
		- #### merge
		
		
		
		```
		public [LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")> merge​([LWWRegister](LWWRegister.html "class in akka.cluster.ddata")<[A](LWWRegister.html "type parameter in LWWRegister")> that)
		```
		
		INTERNAL API
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object o)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWRegister.Clock.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWRegister.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/SelfUniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWRegister.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWRegister.html)*