---
description: Akka 2.10.17 - akka.cluster.ClusterEvent.SubscriptionInitialStateMode
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html
title: Akka 2.10.17 - akka.cluster.ClusterEvent.SubscriptionInitialStateMode
---

# Akka 2.10.17 - akka.cluster.ClusterEvent.SubscriptionInitialStateMode

> **Summary:** Akka 2.10.17 - akka.cluster.ClusterEvent.SubscriptionInitialStateMode

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/ClusterEvent$.html "Permalink")  object [ClusterEvent](ClusterEvent$.html "Domain events published to the event bus.")Domain events published to the event bus.

Domain events published to the event bus.
Subscribe with:

```
Cluster(system).subscribe(actorRef, classOf[ClusterDomainEvent])
```
Definition Classes[cluster](index.html)Annotations@nowarn()
- [ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html "Marker interface for cluster domain events.")
- [ClusterShuttingDown](ClusterEvent$$ClusterShuttingDown$.html "This event is published when the cluster node is shutting down, before the final MemberRemoved events are published.")
- [CurrentClusterState](ClusterEvent$$CurrentClusterState.html "Current snapshot state of the cluster.")
- [DataCenterReachabilityEvent](ClusterEvent$$DataCenterReachabilityEvent.html "Marker interface to facilitate subscription of both UnreachableDataCenter and ReachableDataCenter.")
- [InitialStateAsEvents](ClusterEvent$$InitialStateAsEvents$.html "When using this subscription mode the events corresponding to the current state will be sent to the subscriber to mimic what you would have seen if you were listening to the events when they occurred in the past.")
- [InitialStateAsSnapshot](ClusterEvent$$InitialStateAsSnapshot$.html "When using this subscription mode a snapshot of akka.cluster.ClusterEvent.CurrentClusterState will be sent to the subscriber as the first message.")
- [LeaderChanged](ClusterEvent$$LeaderChanged.html "Leader of the cluster data center of this node changed.")
- [MemberDowned](ClusterEvent$$MemberDowned.html "Member status changed to MemberStatus.Down and will be removed when all members have seen the Down status.")
- [MemberEvent](ClusterEvent$$MemberEvent.html "Marker interface for membership events.")
- [MemberExited](ClusterEvent$$MemberExited.html "Member status changed to MemberStatus.Exiting and will be removed when all members have seen the Exiting status.")
- [MemberJoined](ClusterEvent$$MemberJoined.html "Member status changed to Joining.")
- [MemberLeft](ClusterEvent$$MemberLeft.html "Member status changed to Leaving.")
- [MemberPreparingForShutdown](ClusterEvent$$MemberPreparingForShutdown.html)
- [MemberReadyForShutdown](ClusterEvent$$MemberReadyForShutdown.html)
- [MemberRemoved](ClusterEvent$$MemberRemoved.html "Member completely removed from the cluster.")
- [MemberUp](ClusterEvent$$MemberUp.html "Member status changed to Up.")
- [MemberWeaklyUp](ClusterEvent$$MemberWeaklyUp.html "Member status changed to WeaklyUp.")
- [ReachabilityEvent](ClusterEvent$$ReachabilityEvent.html "Marker interface to facilitate subscription of both UnreachableMember and ReachableMember.")
- [ReachableDataCenter](ClusterEvent$$ReachableDataCenter.html "A data center is considered reachable when all members from the data center are reachable")
- [ReachableMember](ClusterEvent$$ReachableMember.html "A member is considered as reachable by the failure detector after having been unreachable.")
- [RoleLeaderChanged](ClusterEvent$$RoleLeaderChanged.html "First member (leader) of the members within a role set (in the same data center as this node, if data centers are used) changed.")
- SubscriptionInitialStateMode
- [UnreachableDataCenter](ClusterEvent$$UnreachableDataCenter.html "A data center is considered as unreachable when any members from the data center are unreachable")
- [UnreachableMember](ClusterEvent$$UnreachableMember.html "A member is considered as unreachable by the failure detector.")
c[akka](../index.html).[cluster](index.html).[ClusterEvent](ClusterEvent$.html)

# SubscriptionInitialStateMode[**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html "Permalink")

### 

#### sealed abstract  class SubscriptionInitialStateMode extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ClusterEvent.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/ClusterEvent.scala#L33)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[InitialStateAsEvents](ClusterEvent$$InitialStateAsEvents$.html), [InitialStateAsSnapshot](ClusterEvent$$InitialStateAsSnapshot$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SubscriptionInitialStateMode
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SubscriptionInitialStateMode toany2stringadd\[SubscriptionInitialStateMode] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SubscriptionInitialStateMode, B)ImplicitThis member is added by an implicit conversion from SubscriptionInitialStateMode toArrowAssoc\[SubscriptionInitialStateMode] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SubscriptionInitialStateMode) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubscriptionInitialStateModeImplicitThis member is added by an implicit conversion from SubscriptionInitialStateMode toEnsuring\[SubscriptionInitialStateMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SubscriptionInitialStateMode) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubscriptionInitialStateModeImplicitThis member is added by an implicit conversion from SubscriptionInitialStateMode toEnsuring\[SubscriptionInitialStateMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubscriptionInitialStateModeImplicitThis member is added by an implicit conversion from SubscriptionInitialStateMode toEnsuring\[SubscriptionInitialStateMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubscriptionInitialStateModeImplicitThis member is added by an implicit conversion from SubscriptionInitialStateMode toEnsuring\[SubscriptionInitialStateMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SubscriptionInitialStateMode toStringFormat\[SubscriptionInitialStateMode] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SubscriptionInitialStateMode, B)ImplicitThis member is added by an implicit conversion from SubscriptionInitialStateMode toArrowAssoc\[SubscriptionInitialStateMode] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSubscriptionInitialStateMode to any2stringadd\[SubscriptionInitialStateMode]

### Inherited by implicit conversion StringFormat fromSubscriptionInitialStateMode to StringFormat\[SubscriptionInitialStateMode]

### Inherited by implicit conversion Ensuring fromSubscriptionInitialStateMode to Ensuring\[SubscriptionInitialStateMode]

### Inherited by implicit conversion ArrowAssoc fromSubscriptionInitialStateMode to ArrowAssoc\[SubscriptionInitialStateMode]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$ClusterDomainEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$ClusterShuttingDown$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$CurrentClusterState$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$CurrentClusterState.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$DataCenterReachabilityEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$InitialStateAsEvents$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$InitialStateAsSnapshot$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$LeaderChanged.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberDowned.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberExited.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberJoined.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberLeft.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberPreparingForShutdown.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberReadyForShutdown.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberRemoved.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberUp.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$MemberWeaklyUp.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$ReachabilityEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$ReachableDataCenter.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$ReachableMember.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$RoleLeaderChanged.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$UnreachableDataCenter.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$UnreachableMember.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html)*