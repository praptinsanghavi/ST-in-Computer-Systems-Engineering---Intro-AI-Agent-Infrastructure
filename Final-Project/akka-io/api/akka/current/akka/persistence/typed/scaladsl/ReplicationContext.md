---
description: Akka 2.10.17 - akka.persistence.typed.scaladsl.ReplicationContext
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:57:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/scaladsl/ReplicationContext.html
title: Akka 2.10.17 - akka.persistence.typed.scaladsl.ReplicationContext
---

# Akka 2.10.17 - akka.persistence.typed.scaladsl.ReplicationContext

> **Summary:** Akka 2.10.17 - akka.persistence.typed.scaladsl.ReplicationContext

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EventSourcedBehavior](EventSourcedBehavior.html "Further customization of the EventSourcedBehavior can be done with the methods defined here.")
- [EventWithMetadata](EventWithMetadata.html)
- [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")
- [Recovery](Recovery.html "Strategy for recovery of snapshots and events.")
- [ReplicatedEventSourcing](ReplicatedEventSourcing$.html)
- ReplicationContext
- [ReplicationInterceptor](ReplicationInterceptor.html)
- [ReplyEffect](ReplyEffect.html "EventSourcedBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
- [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.")
- [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)
t[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[scaladsl](index.html)

# ReplicationContext[**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html "Permalink")

### 

#### trait ReplicationContext extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Provides access to replication specific state

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[ReplicatedEventSourcing.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/scaladsl/ReplicatedEventSourcing.scala#L20)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicationContext
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
### Abstract Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#allReplicas:Set[akka.persistence.typed.ReplicaId] "Permalink") abstract  def allReplicas: Set\[[ReplicaId](../ReplicaId.html)]returnsThe ids of all replicas of this replicated event sourced actor
2. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#concurrent:Boolean "Permalink") abstract  def concurrent: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Must only be called from the event handler

Must only be called from the event handler

returnstrue if this event happened concurrent with an event from another replica
3. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#currentTimeMillis():Long "Permalink") abstract  def currentTimeMillis(): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)returnsa timestamp that will always be increasing (is monotonic)
4. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#origin:akka.persistence.typed.ReplicaId "Permalink") abstract  def origin: [ReplicaId](../ReplicaId.html)Must only be called from the event handler

Must only be called from the event handler

returnsthe replica id where the current event was persisted
5. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#persistenceId:akka.persistence.typed.PersistenceId "Permalink") abstract  def persistenceId: [PersistenceId](../PersistenceId.html)returnsThe unique id of this replica, including the replica id
6. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#recoveryRunning:Boolean "Permalink") abstract  def recoveryRunning: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Must only be called from the event handler

Must only be called from the event handler

returnstrue when the event handler is invoked during recovery.
7. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#replicationId:akka.persistence.typed.ReplicationId "Permalink") abstract  def replicationId: [ReplicationId](../ReplicationId.html)
### Concrete Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReplicationContext toany2stringadd\[ReplicationContext] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReplicationContext, B)ImplicitThis member is added by an implicit conversion from ReplicationContext toArrowAssoc\[ReplicationContext] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReplicationContext) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicationContextImplicitThis member is added by an implicit conversion from ReplicationContext toEnsuring\[ReplicationContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReplicationContext) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicationContextImplicitThis member is added by an implicit conversion from ReplicationContext toEnsuring\[ReplicationContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReplicationContextImplicitThis member is added by an implicit conversion from ReplicationContext toEnsuring\[ReplicationContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReplicationContextImplicitThis member is added by an implicit conversion from ReplicationContext toEnsuring\[ReplicationContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#entityId:String "Permalink")  def entityId: StringreturnsThe entity id of this replicated event sourced actor (not including the replica id)
13. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#replicaId:akka.persistence.typed.ReplicaId "Permalink")  def replicaId: [ReplicaId](../ReplicaId.html)returnsThe replica id of this replicated event sourced actor
22. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReplicationContext toStringFormat\[ReplicationContext] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReplicationContext, B)ImplicitThis member is added by an implicit conversion from ReplicationContext toArrowAssoc\[ReplicationContext] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReplicationContext to any2stringadd\[ReplicationContext]

### Inherited by implicit conversion StringFormat fromReplicationContext to StringFormat\[ReplicationContext]

### Inherited by implicit conversion Ensuring fromReplicationContext to Ensuring\[ReplicationContext]

### Inherited by implicit conversion ArrowAssoc fromReplicationContext to ArrowAssoc\[ReplicationContext]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/Effect$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EventWithMetadata$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EventWithMetadata.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/PersistentFSMMigration$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/Recovery$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/Recovery.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/ReplicationContext.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/ReplicationInterceptor.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/RetentionCriteria$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/RetentionCriteria.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/ReplicationContext.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/ReplicationContext.html)*