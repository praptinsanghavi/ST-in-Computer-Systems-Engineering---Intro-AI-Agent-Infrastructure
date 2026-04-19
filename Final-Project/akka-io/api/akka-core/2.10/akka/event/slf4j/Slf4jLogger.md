---
description: Akka 2.10.17 - akka.event.slf4j.Slf4jLogger
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:34:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/slf4j/Slf4jLogger.html
title: Akka 2.10.17 - akka.event.slf4j.Slf4jLogger
---

# Akka 2.10.17 - akka.event.slf4j.Slf4jLogger

> **Summary:** Akka 2.10.17 - akka.event.slf4j.Slf4jLogger

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/event/index.html "Permalink")  package [event](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/event/slf4j/index.html "Permalink")  package [slf4j](index.html)Definition Classes[event](../index.html)
- [Logger](Logger$.html "Logger is a factory for obtaining SLF4J-Loggers")
- [SLF4JLogging](SLF4JLogging.html "Base trait for all classes that wants to be able use the SLF4J logging infrastructure.")
- [Slf4jLogMarker](Slf4jLogMarker.html "Wraps org.slf4j.Marker")
- Slf4jLogger
- [Slf4jLoggingFilter](Slf4jLoggingFilter.html "akka.event.LoggingFilter that uses the log level defined in the SLF4J backend configuration (e.g.")
c[akka](../../index.html).[event](../index.html).[slf4j](index.html)

# Slf4jLogger[**](../../../akka/event/slf4j/Slf4jLogger.html "Permalink")

### 

#### class Slf4jLogger extends [Actor](../../actor/Actor.html) with [SLF4JLogging](SLF4JLogging.html) with [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[LoggerMessageQueueSemantics](../LoggerMessageQueueSemantics.html)]

SLF4J logger.

The thread in which the logging was performed is captured in
Mapped Diagnostic Context (MDC) with attribute name "sourceThread".

Source[Slf4jLogger.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-slf4j/src/main/scala/akka/event/slf4j/Slf4jLogger.scala#L58)Linear Supertypes[RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[LoggerMessageQueueSemantics](../LoggerMessageQueueSemantics.html)], [SLF4JLogging](SLF4JLogging.html), [Actor](../../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Slf4jLogger
2. RequiresMessageQueue
3. SLF4JLogging
4. Actor
5. AnyRef
6. Any
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

1. [**](../../../akka/event/slf4j/Slf4jLogger.html#<init>():akka.event.slf4j.Slf4jLogger "Permalink")  new Slf4jLogger()
### Type Members

1. [**](../../../akka/event/slf4j/Slf4jLogger.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../../actor/Actor.html)
### Value Members

1. [**](../../../akka/event/slf4j/Slf4jLogger.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/event/slf4j/Slf4jLogger.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/event/slf4j/Slf4jLogger.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Slf4jLogger toany2stringadd\[Slf4jLogger] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/event/slf4j/Slf4jLogger.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Slf4jLogger, B)ImplicitThis member is added by an implicit conversion from Slf4jLogger toArrowAssoc\[Slf4jLogger] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/event/slf4j/Slf4jLogger.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/event/slf4j/Slf4jLogger.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
7. [**](../../../akka/event/slf4j/Slf4jLogger.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
8. [**](../../../akka/event/slf4j/Slf4jLogger.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
9. [**](../../../akka/event/slf4j/Slf4jLogger.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
10. [**](../../../akka/event/slf4j/Slf4jLogger.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../../index.html)] Definition Classes[Actor](../../actor/Actor.html)Annotations@[InternalApi](../../annotation/InternalApi.html)()
11. [**](../../../akka/event/slf4j/Slf4jLogger.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../akka/event/slf4j/Slf4jLogger.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/event/slf4j/Slf4jLogger.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../../actor/Actor.html)
14. [**](../../../akka/event/slf4j/Slf4jLogger.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Slf4jLogger) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Slf4jLoggerImplicitThis member is added by an implicit conversion from Slf4jLogger toEnsuring\[Slf4jLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/event/slf4j/Slf4jLogger.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Slf4jLogger) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Slf4jLoggerImplicitThis member is added by an implicit conversion from Slf4jLogger toEnsuring\[Slf4jLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/event/slf4j/Slf4jLogger.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Slf4jLoggerImplicitThis member is added by an implicit conversion from Slf4jLogger toEnsuring\[Slf4jLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/event/slf4j/Slf4jLogger.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Slf4jLoggerImplicitThis member is added by an implicit conversion from Slf4jLogger toEnsuring\[Slf4jLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/event/slf4j/Slf4jLogger.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/event/slf4j/Slf4jLogger.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../akka/event/slf4j/Slf4jLogger.html#formatTimestamp(timestamp:Long):String "Permalink")  def formatTimestamp(timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): StringOverride this method to provide a differently formatted timestamp

Override this method to provide a differently formatted timestamp

timestampa "currentTimeMillis"\-obtained timestamp

returnsthe given timestamp as a UTC String

Attributesprotected
21. [**](../../../akka/event/slf4j/Slf4jLogger.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/event/slf4j/Slf4jLogger.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/event/slf4j/Slf4jLogger.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../akka/event/slf4j/Slf4jLogger.html#log:org.slf4j.Logger "Permalink")  lazy val log: org.slf4j.LoggerDefinition Classes[SLF4JLogging](SLF4JLogging.html)Annotations@transient()
25. [**](../../../akka/event/slf4j/Slf4jLogger.html#mdcActorSystemAttributeName:String "Permalink")  val mdcActorSystemAttributeName: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
26. [**](../../../akka/event/slf4j/Slf4jLogger.html#mdcAkkaAddressAttributeName:String "Permalink")  val mdcAkkaAddressAttributeName: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
27. [**](../../../akka/event/slf4j/Slf4jLogger.html#mdcAkkaSourceAttributeName:String "Permalink")  val mdcAkkaSourceAttributeName: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
28. [**](../../../akka/event/slf4j/Slf4jLogger.html#mdcAkkaTimestamp:String "Permalink")  val mdcAkkaTimestamp: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
29. [**](../../../akka/event/slf4j/Slf4jLogger.html#mdcAkkaUidAttributeName:String "Permalink")  val mdcAkkaUidAttributeName: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
30. [**](../../../akka/event/slf4j/Slf4jLogger.html#mdcThreadAttributeName:String "Permalink")  val mdcThreadAttributeName: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
31. [**](../../../akka/event/slf4j/Slf4jLogger.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../../akka/event/slf4j/Slf4jLogger.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../akka/event/slf4j/Slf4jLogger.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../../akka/event/slf4j/Slf4jLogger.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
35. [**](../../../akka/event/slf4j/Slf4jLogger.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
36. [**](../../../akka/event/slf4j/Slf4jLogger.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
37. [**](../../../akka/event/slf4j/Slf4jLogger.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../../actor/Actor.html)Annotations@throws(classOf\[Exception])
38. [**](../../../akka/event/slf4j/Slf4jLogger.html#receive:PartialFunction[Any,Unit] "Permalink")  def receive: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesSlf4jLogger → [Actor](../../actor/Actor.html)
39. [**](../../../akka/event/slf4j/Slf4jLogger.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../../actor/Actor.html)
40. [**](../../../akka/event/slf4j/Slf4jLogger.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../../actor/Actor.html)
41. [**](../../../akka/event/slf4j/Slf4jLogger.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../../actor/Actor.html)
42. [**](../../../akka/event/slf4j/Slf4jLogger.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
43. [**](../../../akka/event/slf4j/Slf4jLogger.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
44. [**](../../../akka/event/slf4j/Slf4jLogger.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../EventStream.html)

Definition Classes[Actor](../../actor/Actor.html)
45. [**](../../../akka/event/slf4j/Slf4jLogger.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
46. [**](../../../akka/event/slf4j/Slf4jLogger.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
47. [**](../../../akka/event/slf4j/Slf4jLogger.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
48. [**](../../../akka/event/slf4j/Slf4jLogger.html#withMdc(logSource:String,logEvent:akka.event.Logging.LogEvent)(logStatement:=>Unit):Unit "Permalink") final  def withMdc(logSource: String, logEvent: [LogEvent](../Logging$$LogEvent.html))(logStatement: \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Annotations@inline()
### Deprecated Value Members

1. [**](../../../akka/event/slf4j/Slf4jLogger.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/event/slf4j/Slf4jLogger.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Slf4jLogger toStringFormat\[Slf4jLogger] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/event/slf4j/Slf4jLogger.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Slf4jLogger, B)ImplicitThis member is added by an implicit conversion from Slf4jLogger toArrowAssoc\[Slf4jLogger] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html)\[[LoggerMessageQueueSemantics](../LoggerMessageQueueSemantics.html)]

### Inherited from [SLF4JLogging](SLF4JLogging.html)

### Inherited from [Actor](../../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSlf4jLogger to any2stringadd\[Slf4jLogger]

### Inherited by implicit conversion StringFormat fromSlf4jLogger to StringFormat\[Slf4jLogger]

### Inherited by implicit conversion Ensuring fromSlf4jLogger to Ensuring\[Slf4jLogger]

### Inherited by implicit conversion ArrowAssoc fromSlf4jLogger to ArrowAssoc\[Slf4jLogger]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/Logger$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/SLF4JLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/Slf4jLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/Slf4jLogMarker.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/Slf4jLogger.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/Slf4jLoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/Slf4jLogger.html](https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/Slf4jLogger.html)*