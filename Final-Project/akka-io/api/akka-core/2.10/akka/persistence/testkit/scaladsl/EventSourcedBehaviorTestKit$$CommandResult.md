---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.CommandResult
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.CommandResult
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.CommandResult

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.EventSourcedBehaviorTestKit.CommandResult

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
- CommandResult
- [CommandResultWithReply](EventSourcedBehaviorTestKit$$CommandResultWithReply.html "The result of running a command with a replyTo: ActorRef[R], i.e.")
- [RestartResult](EventSourcedBehaviorTestKit$$RestartResult.html "The result of restarting the behavior.")
- [SerializationSettings](EventSourcedBehaviorTestKit$$SerializationSettings.html "Customization of which serialization checks that are performed.")
t[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html).[EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit$.html)

# CommandResult[**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html "Permalink")

### 

#### trait CommandResult\[Command, Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

The result of running a command.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[EventSourcedBehaviorTestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.scala#L119)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[CommandResultWithReply](EventSourcedBehaviorTestKit$$CommandResultWithReply.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CommandResult
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

1. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#command:Command "Permalink") abstract  def command: CommandThe command that was run.
2. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#event:Event "Permalink") abstract  def event: EventThe first event.

The first event. It will throw `AssertionError` if there is no event.
3. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#eventOfType[E<:Event](implicitevidence$1:scala.reflect.ClassTag[E]):E "Permalink") abstract  def eventOfType\[E \<: Event](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[E]): EThe first event as a given expected type.

The first event as a given expected type. It will throw `AssertionError` if there is no event or
if the event is of a different type.
4. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#events:Seq[Event] "Permalink") abstract  def events: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Event]The events that were emitted by the command, and persisted.

The events that were emitted by the command, and persisted.
In many cases only one event is emitted and then it's more convenient to use [CommandResult.event](#event:Event)
or [CommandResult.eventOfType](#eventOfType[E<:Event](implicitevidence$1:scala.reflect.ClassTag[E]):E).
5. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#hasNoEvents:Boolean "Permalink") abstract  def hasNoEvents: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)`true` if no events were emitted by the command.
6. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#state:State "Permalink") abstract  def state: StateThe state after applying the events.
7. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#stateOfType[S<:State](implicitevidence$2:scala.reflect.ClassTag[S]):S "Permalink") abstract  def stateOfType\[S \<: State](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[S]): SThe state as a given expected type.

The state as a given expected type. It will throw `AssertionError` if the state is of a different type.
### Concrete Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CommandResult\[Command, Event, State] toany2stringadd\[CommandResult\[Command, Event, State]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CommandResult\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from CommandResult\[Command, Event, State] toArrowAssoc\[CommandResult\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CommandResult\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CommandResult\[Command, Event, State]ImplicitThis member is added by an implicit conversion from CommandResult\[Command, Event, State] toEnsuring\[CommandResult\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CommandResult\[Command, Event, State]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CommandResult\[Command, Event, State]ImplicitThis member is added by an implicit conversion from CommandResult\[Command, Event, State] toEnsuring\[CommandResult\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CommandResult\[Command, Event, State]ImplicitThis member is added by an implicit conversion from CommandResult\[Command, Event, State] toEnsuring\[CommandResult\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CommandResult\[Command, Event, State]ImplicitThis member is added by an implicit conversion from CommandResult\[Command, Event, State] toEnsuring\[CommandResult\[Command, Event, State]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CommandResult\[Command, Event, State] toStringFormat\[CommandResult\[Command, Event, State]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CommandResult\[Command, Event, State], B)ImplicitThis member is added by an implicit conversion from CommandResult\[Command, Event, State] toArrowAssoc\[CommandResult\[Command, Event, State]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCommandResult\[Command, Event, State] to any2stringadd\[CommandResult\[Command, Event, State]]

### Inherited by implicit conversion StringFormat fromCommandResult\[Command, Event, State] to StringFormat\[CommandResult\[Command, Event, State]]

### Inherited by implicit conversion Ensuring fromCommandResult\[Command, Event, State] to Ensuring\[CommandResult\[Command, Event, State]]

### Inherited by implicit conversion ArrowAssoc fromCommandResult\[Command, Event, State] to ArrowAssoc\[CommandResult\[Command, Event, State]]

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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$$CommandResult.html)*