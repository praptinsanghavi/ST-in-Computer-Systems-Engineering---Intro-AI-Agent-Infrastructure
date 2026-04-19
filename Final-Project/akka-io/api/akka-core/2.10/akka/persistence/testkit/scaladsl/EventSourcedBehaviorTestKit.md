---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[testkit](../index.html)
- EventSourcedBehaviorTestKit
- [PersistenceEffect](PersistenceEffect.html)
- [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")
- [PersistenceProbe](PersistenceProbe.html "Not for user extension")
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing events of persistent actors.")
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing snapshots of persistent actors.")
- [UnpersistentBehavior](UnpersistentBehavior.html)
[t](EventSourcedBehaviorTestKit$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html)

# [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit$.html "See companion object")[**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html "Permalink")

### Companion [object EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit$.html "See companion object")

#### trait EventSourcedBehaviorTestKit\[Command, Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() @[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[EventSourcedBehaviorTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.scala#L199)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventSourcedBehaviorTestKit
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

1. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#clear():Unit "Permalink") abstract  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clears the in\-memory journal and snapshot storage and restarts the behavior.
2. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#getState():State "Permalink") abstract  def getState(): StateRetrieve the current state of the Behavior.
3. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#initialize(events:Event*):Unit "Permalink") abstract  def initialize(events: Event\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
4. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#initialize(state:State,events:Event*):Unit "Permalink") abstract  def initialize(state: State, events: Event\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Initializes behavior from provided state and/or events.
5. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#persistenceTestKit:akka.persistence.testkit.scaladsl.PersistenceTestKit "Permalink") abstract  def persistenceTestKit: [PersistenceTestKit](PersistenceTestKit.html)The underlying `PersistenceTestKit` for the in\-memory journal.

The underlying `PersistenceTestKit` for the in\-memory journal.
Can be useful for advanced testing scenarios, such as simulating failures or
populating the journal with events that are used for replay.
6. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#restart():akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.RestartResult[State] "Permalink") abstract  def restart(): [RestartResult](EventSourcedBehaviorTestKit$$RestartResult.html)\[State]Restart the behavior, which will then recover from stored snapshot and events.

Restart the behavior, which will then recover from stored snapshot and events. Can be used for testing
that the recovery is correct.
7. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#runCommand[R](creator:akka.actor.typed.ActorRef[R]=>Command):akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.CommandResultWithReply[Command,Event,State,R] "Permalink") abstract  def runCommand\[R](creator: ([ActorRef](../../../actor/typed/ActorRef.html)\[R]) \=\> Command): [CommandResultWithReply](EventSourcedBehaviorTestKit$$CommandResultWithReply.html)\[Command, Event, State, R]Run one command with a `replyTo: ActorRef[R]` through the behavior.

Run one command with a `replyTo: ActorRef[R]` through the behavior. The returned result contains emitted events,
the state after applying the events, and the reply.
8. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#runCommand(command:Command):akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.CommandResult[Command,Event,State] "Permalink") abstract  def runCommand(command: Command): [CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)\[Command, Event, State]Run one command through the behavior.

Run one command through the behavior. The returned result contains emitted events and the state
after applying the events.
9. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#snapshotTestKit:Option[akka.persistence.testkit.scaladsl.SnapshotTestKit] "Permalink") abstract  def snapshotTestKit: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[SnapshotTestKit](SnapshotTestKit.html)]The underlying `SnapshotTestKit` for snapshot storage.

The underlying `SnapshotTestKit` for snapshot storage. Present only if snapshots are enabled.
Can be useful for advanced testing scenarios, such as simulating failures or
populating the storage with snapshots that are used for replay.
### Concrete Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toany2stringadd\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventSourcedBehaviorTestKit\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toArrowAssoc\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventSourcedBehaviorTestKit\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventSourcedBehaviorTestKit\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toEnsuring\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventSourcedBehaviorTestKit\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventSourcedBehaviorTestKit\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toEnsuring\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventSourcedBehaviorTestKit\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toEnsuring\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventSourcedBehaviorTestKit\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toEnsuring\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toStringFormat\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventSourcedBehaviorTestKit\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toArrowAssoc\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventSourcedBehaviorTestKit\[Command, Event, State] to any2stringadd\[EventSourcedBehaviorTestKit\[Command, Event, State]]

### Inherited by implicit conversion StringFormat fromEventSourcedBehaviorTestKit\[Command, Event, State] to StringFormat\[EventSourcedBehaviorTestKit\[Command, Event, State]]

### Inherited by implicit conversion Ensuring fromEventSourcedBehaviorTestKit\[Command, Event, State] to Ensuring\[EventSourcedBehaviorTestKit\[Command, Event, State]]

### Inherited by implicit conversion ArrowAssoc fromEventSourcedBehaviorTestKit\[Command, Event, State] to ArrowAssoc\[EventSourcedBehaviorTestKit\[Command, Event, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$RestartResult.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceInit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html)*