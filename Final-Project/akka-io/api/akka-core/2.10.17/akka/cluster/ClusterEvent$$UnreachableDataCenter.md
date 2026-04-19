---
description: Akka 2.10.17 - akka.cluster.ClusterEvent.UnreachableDataCenter
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:23:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterEvent$$UnreachableDataCenter.html
title: Akka 2.10.17 - akka.cluster.ClusterEvent.UnreachableDataCenter
---

# Akka 2.10.17 - akka.cluster.ClusterEvent.UnreachableDataCenter

> **Summary:** Akka 2.10.17 - akka.cluster.ClusterEvent.UnreachableDataCenter

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
- [SubscriptionInitialStateMode](ClusterEvent$$SubscriptionInitialStateMode.html)
- UnreachableDataCenter
- [UnreachableMember](ClusterEvent$$UnreachableMember.html "A member is considered as unreachable by the failure detector.")
c[akka](../index.html).[cluster](index.html).[ClusterEvent](ClusterEvent$.html)

# UnreachableDataCenter[**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html "Permalink")

### 

#### final  case class UnreachableDataCenter(dataCenter: [DataCenter](ClusterSettings$.html#DataCenter=String)) extends [DataCenterReachabilityEvent](ClusterEvent$$DataCenterReachabilityEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

A data center is considered as unreachable when any members from the data center are unreachable

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead

Source[ClusterEvent.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/ClusterEvent.scala#L421)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [DataCenterReachabilityEvent](ClusterEvent$$DataCenterReachabilityEvent.html), [ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html), [DeadLetterSuppression](../actor/DeadLetterSuppression.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UnreachableDataCenter
2. Serializable
3. Product
4. Equals
5. DataCenterReachabilityEvent
6. ClusterDomainEvent
7. DeadLetterSuppression
8. AnyRef
9. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#<init>(dataCenter:akka.cluster.ClusterSettings.DataCenter):akka.cluster.ClusterEvent.UnreachableDataCenter "Permalink")  new UnreachableDataCenter(dataCenter: [DataCenter](ClusterSettings$.html#DataCenter=String))
### Value Members

1. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from UnreachableDataCenter toany2stringadd\[UnreachableDataCenter] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (UnreachableDataCenter, B)ImplicitThis member is added by an implicit conversion from UnreachableDataCenter toArrowAssoc\[UnreachableDataCenter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#dataCenter:akka.cluster.ClusterSettings.DataCenter "Permalink")  val dataCenter: [DataCenter](ClusterSettings$.html#DataCenter=String)
9. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (UnreachableDataCenter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnreachableDataCenterImplicitThis member is added by an implicit conversion from UnreachableDataCenter toEnsuring\[UnreachableDataCenter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (UnreachableDataCenter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnreachableDataCenterImplicitThis member is added by an implicit conversion from UnreachableDataCenter toEnsuring\[UnreachableDataCenter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnreachableDataCenterImplicitThis member is added by an implicit conversion from UnreachableDataCenter toEnsuring\[UnreachableDataCenter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnreachableDataCenterImplicitThis member is added by an implicit conversion from UnreachableDataCenter toEnsuring\[UnreachableDataCenter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from UnreachableDataCenter toStringFormat\[UnreachableDataCenter] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/cluster/ClusterEvent$$UnreachableDataCenter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (UnreachableDataCenter, B)ImplicitThis member is added by an implicit conversion from UnreachableDataCenter toArrowAssoc\[UnreachableDataCenter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [DataCenterReachabilityEvent](ClusterEvent$$DataCenterReachabilityEvent.html)

### Inherited from [ClusterDomainEvent](ClusterEvent$$ClusterDomainEvent.html)

### Inherited from [DeadLetterSuppression](../actor/DeadLetterSuppression.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUnreachableDataCenter to any2stringadd\[UnreachableDataCenter]

### Inherited by implicit conversion StringFormat fromUnreachableDataCenter to StringFormat\[UnreachableDataCenter]

### Inherited by implicit conversion Ensuring fromUnreachableDataCenter to Ensuring\[UnreachableDataCenter]

### Inherited by implicit conversion ArrowAssoc fromUnreachableDataCenter to ArrowAssoc\[UnreachableDataCenter]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$ClusterDomainEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$ClusterShuttingDown$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$CurrentClusterState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$CurrentClusterState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$DataCenterReachabilityEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$InitialStateAsEvents$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$InitialStateAsSnapshot$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$LeaderChanged.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$MemberDowned.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$MemberEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$MemberExited.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$MemberJoined.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$MemberLeft.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$MemberPreparingForShutdown.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$MemberReadyForShutdown.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$MemberRemoved.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$MemberUp.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$MemberWeaklyUp.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$ReachabilityEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$ReachableDataCenter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$ReachableMember.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$RoleLeaderChanged.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$SubscriptionInitialStateMode.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$UnreachableDataCenter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$UnreachableMember.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$UnreachableDataCenter.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$$UnreachableDataCenter.html)*