---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.CommandResultWithReply
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.CommandResultWithReply
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.CommandResultWithReply

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.CommandResultWithReply

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html "Permalink")  object [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit$.html "Testing of akka.persistence.typed.scaladsl.EventSourcedBehavior implementations.")Testing of [akka.persistence.typed.scaladsl.EventSourcedBehavior](../../typed/scaladsl/EventSourcedBehavior.html) implementations.

Testing of [akka.persistence.typed.scaladsl.EventSourcedBehavior](../../typed/scaladsl/EventSourcedBehavior.html) implementations.
It supports running one command at a time and you can assert that the synchronously returned result is as expected.
The result contains the events emitted by the command and the new state after applying the events.
It also has support for verifying the reply to a command.

Serialization of commands, events and state are verified automatically.

Definition Classes[scaladsl](index.html)Annotations@[ApiMayChange](../../../annotation/ApiMayChange.html)()
- [CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html "The result of running a command.")
- CommandResultWithReply
- [RestartResult](EventSourcedBehaviorTestKit$$RestartResult.html "The result of restarting the behavior.")
- [SerializationSettings](EventSourcedBehaviorTestKit$$SerializationSettings.html "Customization of which serialization checks that are performed.")
t[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html).[EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit$.html)

# CommandResultWithReply[**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html "Permalink")

### 

#### trait CommandResultWithReply\[Command, Event, State, Reply] extends [CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)\[Command, Event, State]

The result of running a command with a `replyTo: ActorRef[R]`, i.e. the `runCommand` with a
`ActorRef[R] => Command` parameter.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[EventSourcedBehaviorTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.scala#L164)Linear Supertypes[CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)\[Command, Event, State], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CommandResultWithReply
2. CommandResult
3. AnyRef
4. Any
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

1. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#command:Command "Permalink") abstract  def command: CommandThe command that was run.

The command that was run.

Definition Classes[CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)
2. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#event:Event "Permalink") abstract  def event: EventThe first event.

The first event. It will throw `AssertionError` if there is no event.

Definition Classes[CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)
3. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#eventOfType[E<:Event](implicitevidence$1:scala.reflect.ClassTag[E]):E "Permalink") abstract  def eventOfType\[E \<: Event](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[E]): EThe first event as a given expected type.

The first event as a given expected type. It will throw `AssertionError` if there is no event or
if the event is of a different type.

Definition Classes[CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)
4. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#events:Seq[Event] "Permalink") abstract  def events: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Event]The events that were emitted by the command, and persisted.

The events that were emitted by the command, and persisted.
In many cases only one event is emitted and then it's more convenient to use [CommandResult.event](EventSourcedBehaviorTestKit$$CommandResult.html#event:Event)
or [CommandResult.eventOfType](EventSourcedBehaviorTestKit$$CommandResult.html#eventOfType[E<:Event](implicitevidence$1:scala.reflect.ClassTag[E]):E).

Definition Classes[CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)
5. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#hasNoEvents:Boolean "Permalink") abstract  def hasNoEvents: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)`true` if no events were emitted by the command.

`true` if no events were emitted by the command.

Definition Classes[CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)
6. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#hasNoReply:Boolean "Permalink") abstract  def hasNoReply: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)`true` if there is no reply.
7. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#reply:Reply "Permalink") abstract  def reply: ReplyThe reply.

The reply. It will throw `AssertionError` if there was no reply.
8. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#replyOfType[R<:Reply](implicitevidence$3:scala.reflect.ClassTag[R]):R "Permalink") abstract  def replyOfType\[R \<: Reply](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[R]): RThe reply as a given expected type.

The reply as a given expected type. It will throw `AssertionError` if there is no reply or
if the reply is of a different type.
9. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#state:State "Permalink") abstract  def state: StateThe state after applying the events.

The state after applying the events.

Definition Classes[CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)
10. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#stateOfType[S<:State](implicitevidence$2:scala.reflect.ClassTag[S]):S "Permalink") abstract  def stateOfType\[S \<: State](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[S]): SThe state as a given expected type.

The state as a given expected type. It will throw `AssertionError` if the state is of a different type.

Definition Classes[CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)
### Concrete Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CommandResultWithReply\[Command, Event, State, Reply] toany2stringadd\[CommandResultWithReply\[Command, Event, State, Reply]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CommandResultWithReply\[Command, Event, State, Reply], B)ImplicitThis member is added by an implicit conversion from CommandResultWithReply\[Command, Event, State, Reply] toArrowAssoc\[CommandResultWithReply\[Command, Event, State, Reply]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CommandResultWithReply\[Command, Event, State, Reply]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CommandResultWithReply\[Command, Event, State, Reply]ImplicitThis member is added by an implicit conversion from CommandResultWithReply\[Command, Event, State, Reply] toEnsuring\[CommandResultWithReply\[Command, Event, State, Reply]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CommandResultWithReply\[Command, Event, State, Reply]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CommandResultWithReply\[Command, Event, State, Reply]ImplicitThis member is added by an implicit conversion from CommandResultWithReply\[Command, Event, State, Reply] toEnsuring\[CommandResultWithReply\[Command, Event, State, Reply]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CommandResultWithReply\[Command, Event, State, Reply]ImplicitThis member is added by an implicit conversion from CommandResultWithReply\[Command, Event, State, Reply] toEnsuring\[CommandResultWithReply\[Command, Event, State, Reply]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CommandResultWithReply\[Command, Event, State, Reply]ImplicitThis member is added by an implicit conversion from CommandResultWithReply\[Command, Event, State, Reply] toEnsuring\[CommandResultWithReply\[Command, Event, State, Reply]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CommandResultWithReply\[Command, Event, State, Reply] toStringFormat\[CommandResultWithReply\[Command, Event, State, Reply]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CommandResultWithReply\[Command, Event, State, Reply], B)ImplicitThis member is added by an implicit conversion from CommandResultWithReply\[Command, Event, State, Reply] toArrowAssoc\[CommandResultWithReply\[Command, Event, State, Reply]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [CommandResult](EventSourcedBehaviorTestKit$$CommandResult.html)\[Command, Event, State]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCommandResultWithReply\[Command, Event, State, Reply] to any2stringadd\[CommandResultWithReply\[Command, Event, State, Reply]]

### Inherited by implicit conversion StringFormat fromCommandResultWithReply\[Command, Event, State, Reply] to StringFormat\[CommandResultWithReply\[Command, Event, State, Reply]]

### Inherited by implicit conversion Ensuring fromCommandResultWithReply\[Command, Event, State, Reply] to Ensuring\[CommandResultWithReply\[Command, Event, State, Reply]]

### Inherited by implicit conversion ArrowAssoc fromCommandResultWithReply\[Command, Event, State, Reply] to ArrowAssoc\[CommandResultWithReply\[Command, Event, State, Reply]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$RestartResult.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$SerializationSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$SerializationSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResultWithReply.html)*