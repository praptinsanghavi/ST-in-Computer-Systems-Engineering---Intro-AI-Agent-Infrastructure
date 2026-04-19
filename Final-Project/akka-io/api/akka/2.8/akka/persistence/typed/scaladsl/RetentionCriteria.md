---
description: Akka 2.8.9 - akka.persistence.typed.scaladsl.RetentionCriteria
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:24:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/RetentionCriteria.html
title: Akka 2.8.9 - akka.persistence.typed.scaladsl.RetentionCriteria
---

# Akka 2.8.9 - akka.persistence.typed.scaladsl.RetentionCriteria

> **Summary:** Akka 2.8.9 - akka.persistence.typed.scaladsl.RetentionCriteria

## Content

Akka2\.8\.9 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EventSourcedBehavior](EventSourcedBehavior.html "Further customization of the EventSourcedBehavior can be done with the methods defined here.")
- [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")
- [Recovery](Recovery.html "Strategy for recovery of snapshots and events.")
- [ReplicatedEventSourcing](ReplicatedEventSourcing$.html)
- [ReplicationContext](ReplicationContext.html "Provides access to replication specific state")
- [ReplyEffect](ReplyEffect.html "EventSourcedBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
- RetentionCriteria
- [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)
[t](RetentionCriteria$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[scaladsl](index.html)

# [RetentionCriteria](RetentionCriteria$.html "See companion object")[**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html "Permalink")

### Companion [object RetentionCriteria](RetentionCriteria$.html "See companion object")

#### trait RetentionCriteria extends [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

Criteria for retention/deletion of snapshots and events.

Source[RetentionCriteria.scala](https://github.com/akka/akka/tree/v2.8.9//akka-persistence-typed/src/main/scala/akka/persistence/typed/scaladsl/RetentionCriteria.scala#L14)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)Known Subclasses[SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RetentionCriteria
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

1. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#asJava:akka.persistence.typed.javadsl.RetentionCriteria "Permalink") abstract  def asJava: [javadsl.RetentionCriteria](../javadsl/RetentionCriteria.html)
### Concrete Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RetentionCriteria toany2stringadd\[RetentionCriteria] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RetentionCriteria, B)ImplicitThis member is added by an implicit conversion from RetentionCriteria toArrowAssoc\[RetentionCriteria] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
8. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RetentionCriteria) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): RetentionCriteriaImplicitThis member is added by an implicit conversion from RetentionCriteria toEnsuring\[RetentionCriteria] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RetentionCriteria) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): RetentionCriteriaImplicitThis member is added by an implicit conversion from RetentionCriteria toEnsuring\[RetentionCriteria] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): RetentionCriteriaImplicitThis member is added by an implicit conversion from RetentionCriteria toEnsuring\[RetentionCriteria] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): RetentionCriteriaImplicitThis member is added by an implicit conversion from RetentionCriteria toEnsuring\[RetentionCriteria] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
15. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
16. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
19. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
20. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated @Deprecated Deprecated
2. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RetentionCriteria toStringFormat\[RetentionCriteria] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RetentionCriteria, B)ImplicitThis member is added by an implicit conversion from RetentionCriteria toArrowAssoc\[RetentionCriteria] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRetentionCriteria to any2stringadd\[RetentionCriteria]

### Inherited by implicit conversion StringFormat fromRetentionCriteria to StringFormat\[RetentionCriteria]

### Inherited by implicit conversion Ensuring fromRetentionCriteria to Ensuring\[RetentionCriteria]

### Inherited by implicit conversion ArrowAssoc fromRetentionCriteria to ArrowAssoc\[RetentionCriteria]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/Effect$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/PersistentFSMMigration$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/Recovery$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/Recovery.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/ReplicationContext.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/RetentionCriteria$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/RetentionCriteria.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.8/index.html

---
*Source: [https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/RetentionCriteria.html](https://doc.akka.io/api/akka/2.8/akka/persistence/typed/scaladsl/RetentionCriteria.html)*