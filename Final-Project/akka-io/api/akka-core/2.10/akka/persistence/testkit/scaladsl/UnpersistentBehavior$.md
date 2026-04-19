---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.UnpersistentBehavior

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[testkit](../index.html)
- [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)
- [PersistenceEffect](PersistenceEffect.html)
- [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")
- [PersistenceProbe](PersistenceProbe.html "Not for user extension")
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing events of persistent actors.")
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing snapshots of persistent actors.")
- [UnpersistentBehavior](UnpersistentBehavior.html)
[o](UnpersistentBehavior.html "See companion trait")[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html)

# [UnpersistentBehavior](UnpersistentBehavior.html "See companion trait")[**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html "Permalink")

### Companion [trait UnpersistentBehavior](UnpersistentBehavior.html "See companion trait")

#### object UnpersistentBehavior

Source[UnpersistentBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/UnpersistentBehavior.scala#L21)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UnpersistentBehavior
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html "Permalink") final  case class [DurableState](UnpersistentBehavior$$DurableState.html)\[Command, State](behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command], stateProbe: [PersistenceProbe](PersistenceProbe.html)\[State]) extends [UnpersistentBehavior](UnpersistentBehavior.html)\[Command, State] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html "Permalink") final  case class [EventSourced](UnpersistentBehavior$$EventSourced.html)\[Command, Event, State](behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command], eventProbe: [PersistenceProbe](PersistenceProbe.html)\[Event], stateProbe: [PersistenceProbe](PersistenceProbe.html)\[State]) extends [UnpersistentBehavior](UnpersistentBehavior.html)\[Command, State] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#fromDurableState[Command,State](behavior:akka.actor.typed.Behavior[Command],initialState:Option[State]):akka.persistence.testkit.scaladsl.UnpersistentBehavior.DurableState[Command,State] "Permalink")  def fromDurableState\[Command, State](behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command], initialState: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[State] \= None): [DurableState](UnpersistentBehavior$$DurableState.html)\[Command, State]
9. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#fromEventSourced[Command,Event,State](behavior:akka.actor.typed.Behavior[Command],initialState:State):akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced[Command,Event,State] "Permalink")  def fromEventSourced\[Command, Event, State](behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command], initialState: State): [EventSourced](UnpersistentBehavior$$EventSourced.html)\[Command, Event, State]
10. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#fromEventSourced[Command,Event,State](behavior:akka.actor.typed.Behavior[Command],initialStateAndSequenceNr:Option[(State,Long)]):akka.persistence.testkit.scaladsl.UnpersistentBehavior.EventSourced[Command,Event,State] "Permalink")  def fromEventSourced\[Command, Event, State](behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command], initialStateAndSequenceNr: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(State, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))] \= None): [EventSourced](UnpersistentBehavior$$EventSourced.html)\[Command, Event, State]Given an EventSourcedBehavior, produce a non\-persistent Behavior which synchronously publishes events and snapshots
 for inspection.

Given an EventSourcedBehavior, produce a non\-persistent Behavior which synchronously publishes events and snapshots
 for inspection. State is updated as in the EventSourcedBehavior, and side effects are performed synchronously. The
 resulting Behavior is, contingent on the command handling, event handling, and side effects being compatible with the
 BehaviorTestKit, testable with the BehaviorTestKit.

 The returned Behavior does not intrinsically depend on configuration: it therefore does not serialize and assumes an
 unbounded stash for commands.
11. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceInit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$DurableState.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$$EventSourced.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html)*