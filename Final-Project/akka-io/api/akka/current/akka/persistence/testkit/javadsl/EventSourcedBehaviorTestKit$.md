---
description: Akka 2.10.17 - akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html
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
- [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)
- [PersistenceEffect](PersistenceEffect.html)
- [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")
- [PersistenceProbe](PersistenceProbe.html "Not for user extension")
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing persisted events in persistent actors.")
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing persisted snapshots in persistent actors.")
- [UnpersistentBehavior](UnpersistentBehavior.html)
[o](EventSourcedBehaviorTestKit.html "See companion class")[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[javadsl](index.html)

# [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "See companion class")[**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html "Permalink")

### Companion [class EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html "See companion class")

#### object EventSourcedBehaviorTestKit

Testing of [akka.persistence.typed.javadsl.EventSourcedBehavior](../../typed/javadsl/EventSourcedBehavior.html) implementations.
It supports running one command at a time and you can assert that the synchronously returned result is as expected.
The result contains the events emitted by the command and the new state after applying the events.
It also has support for verifying the reply to a command.

Serialization of commands, events and state are verified automatically.

Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)() Source[EventSourcedBehaviorTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit.scala#L33)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventSourcedBehaviorTestKit
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$$CommandResult.html "Permalink")  class [CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html "The result of running a command.")\[Command, Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The result of running a command.

The result of running a command.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
2. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html "Permalink") final  class [CommandResultWithReply](EventSourcedBehaviorTestKit$$CommandResultWithReply.html "The result of running a command with a ActorRef<R> replyTo, i.e.")\[Command, Event, State, Reply] extends [CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)\[Command, Event, State]The result of running a command with a `ActorRef<R> replyTo`, i.e.

The result of running a command with a `ActorRef<R> replyTo`, i.e. the `runCommand` with a
`Function<ActorRef<R>, Command>` parameter.
3. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$$RestartResult.html "Permalink") final  class [RestartResult](EventSourcedBehaviorTestKit$$RestartResult.html "The result of restarting the behavior.")\[State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The result of restarting the behavior.
4. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$$SerializationSettings.html "Permalink") final  class [SerializationSettings](EventSourcedBehaviorTestKit$$SerializationSettings.html "Customization of which serialization checks that are performed.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Customization of which serialization checks that are performed.

Customization of which serialization checks that are performed.
`equals` must be implemented (or using `case class`) when `verifyEquality` is enabled.
### Value Members

1. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#config:com.typesafe.config.Config "Permalink")  val config: ConfigThe configuration to be included in the configuration of the `ActorSystem`.

The configuration to be included in the configuration of the `ActorSystem`. Typically used as
constructor parameter to `TestKitJunitResource`. The configuration enables the in\-memory
journal and snapshot storage.
7. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#create[Command,Event,State](system:akka.actor.typed.ActorSystem[_],behavior:akka.actor.typed.Behavior[Command],serializationSettings:akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.SerializationSettings):akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit[Command,Event,State] "Permalink")  def create\[Command, Event, State](system: [ActorSystem](../../../actor/typed/ActorSystem.html)\[\_], behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command], serializationSettings: [SerializationSettings](EventSourcedBehaviorTestKit$$SerializationSettings.html)): [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)\[Command, Event, State]Factory method to create a new EventSourcedBehaviorTestKit with custom [SerializationSettings](EventSourcedBehaviorTestKit$$SerializationSettings.html).

Factory method to create a new EventSourcedBehaviorTestKit with custom [SerializationSettings](EventSourcedBehaviorTestKit$$SerializationSettings.html).

Note that `equals` must be implemented in the commands, events and state if `verifyEquality` is enabled.
8. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#create[Command,Event,State](system:akka.actor.typed.ActorSystem[_],behavior:akka.actor.typed.Behavior[Command]):akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit[Command,Event,State] "Permalink")  def create\[Command, Event, State](system: [ActorSystem](../../../actor/typed/ActorSystem.html)\[\_], behavior: [Behavior](../../../actor/typed/Behavior.html)\[Command]): [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)\[Command, Event, State]Factory method to create a new EventSourcedBehaviorTestKit.
9. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#disabledSerializationSettings:akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.SerializationSettings "Permalink")  val disabledSerializationSettings: [SerializationSettings](EventSourcedBehaviorTestKit$$SerializationSettings.html)
10. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#enabledSerializationSettings:akka.persistence.testkit.javadsl.EventSourcedBehaviorTestKit.SerializationSettings "Permalink")  val enabledSerializationSettings: [SerializationSettings](EventSourcedBehaviorTestKit$$SerializationSettings.html)
11. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
13. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$$CommandResult.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$$RestartResult.html
- https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$$SerializationSettings.html
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
- https://doc.akka.io/api/akka/current/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html](https://doc.akka.io/api/akka/current/akka/persistence/testkit/javadsl/EventSourcedBehaviorTestKit$.html)*