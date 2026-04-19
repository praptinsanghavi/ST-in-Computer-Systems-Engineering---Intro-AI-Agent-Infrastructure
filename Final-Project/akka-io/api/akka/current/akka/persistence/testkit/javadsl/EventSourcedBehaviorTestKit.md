---
description: Akka 2.10.17 - akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html
title: Akka 2.10.17 - akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit
---

# Akka 2.10.17 - akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[testkit](../index.html)
- EventSourcedBehaviorTestKit
- [PersistenceEffect](PersistenceEffect.html)
- [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")
- [PersistenceProbe](PersistenceProbe.html "Not for user extension")
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing persisted events in persistent actors.")
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing persisted snapshots in persistent actors.")
- [UnpersistentBehavior](UnpersistentBehavior.html)
[c](EventSourcedBehaviorTestKit$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[javadsl](index.html)

# [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit$.html "See companion object")[**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html "Permalink")

### Companion [object EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit$.html "See companion object")

#### final  class EventSourcedBehaviorTestKit\[Command, Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[EventSourcedBehaviorTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.scala#L213)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
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
### Instance Constructors

1. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#<init>(delegate:akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit[Command,Event,State]):akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit[Command,Event,State] "Permalink")  new EventSourcedBehaviorTestKit(delegate: [scaladsl.EventSourcedBehaviorTestKit](../scaladsl/EventSourcedBehaviorTestKit.html)\[Command, Event, State])
### Value Members

1. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toany2stringadd\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventSourcedBehaviorTestKit\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toArrowAssoc\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#clear():Unit "Permalink")  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clears the in\-memory journal and snapshot storage and restarts the behavior.
8. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventSourcedBehaviorTestKit\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventSourcedBehaviorTestKit\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toEnsuring\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventSourcedBehaviorTestKit\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventSourcedBehaviorTestKit\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toEnsuring\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventSourcedBehaviorTestKit\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toEnsuring\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventSourcedBehaviorTestKit\[Command, Event, State]ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toEnsuring\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#getState():State "Permalink")  def getState(): StateRetrieve the current state of the Behavior.
17. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#initialize(events:Event*):Unit "Permalink")  def initialize(events: Event\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Annotations@varargs()
19. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#initialize(state:State,events:Event*):Unit "Permalink")  def initialize(state: State, events: Event\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Initializes behavior from provided state and/or events.

Initializes behavior from provided state and/or events.

Annotations@varargs()
20. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#persistenceTestKit:akka.persistence.testkit.javadsl.PersistenceTestKit "Permalink")  def persistenceTestKit: [PersistenceTestKit](PersistenceTestKit.html)The underlying `PersistenceTestKit` for the in\-memory journal.

The underlying `PersistenceTestKit` for the in\-memory journal.
Can be useful for advanced testing scenarios, such as simulating failures or
populating the journal with events that are used for replay.
25. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#restart():akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.RestartResult[State] "Permalink")  def restart(): [RestartResult](EventSourcedBehaviorTestKit$$RestartResult.html)\[State]Restart the behavior, which will then recover from stored snapshot and events.

Restart the behavior, which will then recover from stored snapshot and events. Can be used for testing
that the recovery is correct.
26. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#runCommand[R](creator:java.util.function.Function[akka.actor.typed.ActorRef[R],Command]):akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.CommandResultWithReply[Command,Event,State,R] "Permalink")  def runCommand\[R](creator: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorRef](../../../actor/typed/ActorRef.html)\[R], Command]): [CommandResultWithReply](EventSourcedBehaviorTestKit$$CommandResultWithReply.html)\[Command, Event, State, R]Run one command with a `replyTo: ActorRef` through the behavior.

Run one command with a `replyTo: ActorRef` through the behavior. The returned result contains emitted events,
the state after applying the events, and the reply.
27. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#runCommand(command:Command):akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.CommandResult[Command,Event,State] "Permalink")  def runCommand(command: Command): [CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)\[Command, Event, State]Run one command through the behavior.

Run one command through the behavior. The returned result contains emitted events and the state
after applying the events.
28. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#snapshotTestKit:java.util.Optional[akka.persistence.testkit.javadsl.SnapshotTestKit] "Permalink")  def snapshotTestKit: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[SnapshotTestKit](SnapshotTestKit.html)]The underlying `SnapshotTestKit` for snapshot storage.

The underlying `SnapshotTestKit` for snapshot storage. Present only if snapshots are enabled.
Can be useful for advanced testing scenarios, such as simulating failures or
populating the storage with snapshots that are used for replay.
29. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toStringFormat\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventSourcedBehaviorTestKit\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from EventSourcedBehaviorTestKit\[Command, Event, State] toArrowAssoc\[EventSourcedBehaviorTestKit\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventSourcedBehaviorTestKit\[Command, Event, State] to any2stringadd\[EventSourcedBehaviorTestKit\[Command, Event, State]]

### Inherited by implicit conversion StringFormat fromEventSourcedBehaviorTestKit\[Command, Event, State] to StringFormat\[EventSourcedBehaviorTestKit\[Command, Event, State]]

### Inherited by implicit conversion Ensuring fromEventSourcedBehaviorTestKit\[Command, Event, State] to Ensuring\[EventSourcedBehaviorTestKit\[Command, Event, State]]

### Inherited by implicit conversion ArrowAssoc fromEventSourcedBehaviorTestKit\[Command, Event, State] to ArrowAssoc\[EventSourcedBehaviorTestKit\[Command, Event, State]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$$CommandResult.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$$RestartResult.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceEffect.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceInit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceProbe.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.html)*