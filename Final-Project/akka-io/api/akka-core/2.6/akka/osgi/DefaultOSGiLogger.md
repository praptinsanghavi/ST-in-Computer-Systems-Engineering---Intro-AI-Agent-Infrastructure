---
description: Akka 2.6.21 - akka.osgi.DefaultOSGiLogger
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:21:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/osgi/DefaultOSGiLogger.html
title: Akka 2.6.21 - akka.osgi.DefaultOSGiLogger
---

# Akka 2.6.21 - akka.osgi.DefaultOSGiLogger

> **Summary:** Akka 2.6.21 - akka.osgi.DefaultOSGiLogger

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/osgi/index.html "Permalink")  package [osgi](index.html)Definition Classes[akka](../index.html)
- [ActorSystemActivator](ActorSystemActivator.html "Abstract bundle activator implementation to bootstrap and configure an actor system in an OSGi environment.")
- [BundleDelegatingClassLoader](BundleDelegatingClassLoader.html)
- DefaultOSGiLogger
- [OsgiActorSystemFactory](OsgiActorSystemFactory.html "Factory class to create ActorSystem implementations in an OSGi environment.")
- [UnregisteringLogService](UnregisteringLogService$.html "Message sent when LogService is unregistered.")
c[akka](../index.html).[osgi](index.html)

# DefaultOSGiLogger[**](../../akka/osgi/DefaultOSGiLogger.html "Permalink")

### 

#### class DefaultOSGiLogger extends [DefaultLogger](../event/Logging$$DefaultLogger.html)

Logger for OSGi environment.
Stands for an interface between akka and the OSGi LogService
It uses the OSGi LogService to log the received LogEvents

Source[DefaultOSGiLogger.scala](https://github.com/akka/akka/tree/v2.6.21//akka-osgi/src/main/scala/akka/osgi/DefaultOSGiLogger.scala#L18)Linear Supertypes[DefaultLogger](../event/Logging$$DefaultLogger.html), [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[LoggerMessageQueueSemantics](../event/LoggerMessageQueueSemantics.html)], [StdOutLogger](../event/Logging$$StdOutLogger.html), [Actor](../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DefaultOSGiLogger
2. DefaultLogger
3. RequiresMessageQueue
4. StdOutLogger
5. Actor
6. AnyRef
7. Any
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

1. [**](../../akka/osgi/DefaultOSGiLogger.html#<init>():akka.osgi.DefaultOSGiLogger "Permalink")  new DefaultOSGiLogger()
### Type Members

1. [**](../../akka/osgi/DefaultOSGiLogger.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../actor/Actor.html)
### Value Members

1. [**](../../akka/osgi/DefaultOSGiLogger.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/osgi/DefaultOSGiLogger.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/osgi/DefaultOSGiLogger.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DefaultOSGiLogger toany2stringadd\[DefaultOSGiLogger] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/osgi/DefaultOSGiLogger.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DefaultOSGiLogger, B)ImplicitThis member is added by an implicit conversion from DefaultOSGiLogger toArrowAssoc\[DefaultOSGiLogger] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/osgi/DefaultOSGiLogger.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/osgi/DefaultOSGiLogger.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
7. [**](../../akka/osgi/DefaultOSGiLogger.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
8. [**](../../akka/osgi/DefaultOSGiLogger.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
9. [**](../../akka/osgi/DefaultOSGiLogger.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
10. [**](../../akka/osgi/DefaultOSGiLogger.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
11. [**](../../akka/osgi/DefaultOSGiLogger.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/osgi/DefaultOSGiLogger.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
13. [**](../../akka/osgi/DefaultOSGiLogger.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../actor/Actor.html)
14. [**](../../akka/osgi/DefaultOSGiLogger.html#debug(event:akka.event.Logging.Debug):Unit "Permalink")  def debug(event: [Debug](../event/Logging$$Debug.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
15. [**](../../akka/osgi/DefaultOSGiLogger.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DefaultOSGiLogger) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): DefaultOSGiLoggerImplicitThis member is added by an implicit conversion from DefaultOSGiLogger toEnsuring\[DefaultOSGiLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/osgi/DefaultOSGiLogger.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DefaultOSGiLogger) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): DefaultOSGiLoggerImplicitThis member is added by an implicit conversion from DefaultOSGiLogger toEnsuring\[DefaultOSGiLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/osgi/DefaultOSGiLogger.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): DefaultOSGiLoggerImplicitThis member is added by an implicit conversion from DefaultOSGiLogger toEnsuring\[DefaultOSGiLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/osgi/DefaultOSGiLogger.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): DefaultOSGiLoggerImplicitThis member is added by an implicit conversion from DefaultOSGiLogger toEnsuring\[DefaultOSGiLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../akka/osgi/DefaultOSGiLogger.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/osgi/DefaultOSGiLogger.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../akka/osgi/DefaultOSGiLogger.html#error(event:akka.event.Logging.Error):Unit "Permalink")  def error(event: [Error](../event/Logging$$Error.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
22. [**](../../akka/osgi/DefaultOSGiLogger.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
23. [**](../../akka/osgi/DefaultOSGiLogger.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
24. [**](../../akka/osgi/DefaultOSGiLogger.html#info(event:akka.event.Logging.Info):Unit "Permalink")  def info(event: [Info](../event/Logging$$Info.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
25. [**](../../akka/osgi/DefaultOSGiLogger.html#initialisedReceive(logService:org.osgi.service.log.LogService):DefaultOSGiLogger.this.Receive "Permalink")  def initialisedReceive(logService: LogService): [Receive](#Receive=akka.actor.Actor.Receive)Behavior of the Event handler that is setup (has received a LogService)

Behavior of the Event handler that is setup (has received a LogService)

logServiceregistered OSGi LogService

returnsReceive : Logs LogEvent or go back to the uninitialised state
26. [**](../../akka/osgi/DefaultOSGiLogger.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
27. [**](../../akka/osgi/DefaultOSGiLogger.html#logMessage(logService:org.osgi.service.log.LogService,event:akka.event.Logging.LogEvent):Unit "Permalink")  def logMessage(logService: LogService, event: [LogEvent](../event/Logging$$LogEvent.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Logs a message in an OSGi LogService

Logs a message in an OSGi LogService

logServiceOSGi LogService registered and used for logging

eventakka LogEvent that is logged using the LogService
28. [**](../../akka/osgi/DefaultOSGiLogger.html#messageFormat:String "Permalink")  val messageFormat: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
29. [**](../../akka/osgi/DefaultOSGiLogger.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
30. [**](../../akka/osgi/DefaultOSGiLogger.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
31. [**](../../akka/osgi/DefaultOSGiLogger.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
32. [**](../../akka/osgi/DefaultOSGiLogger.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
33. [**](../../akka/osgi/DefaultOSGiLogger.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
34. [**](../../akka/osgi/DefaultOSGiLogger.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
35. [**](../../akka/osgi/DefaultOSGiLogger.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
36. [**](../../akka/osgi/DefaultOSGiLogger.html#print(event:Any):Unit "Permalink")  def print(event: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
37. [**](../../akka/osgi/DefaultOSGiLogger.html#receive:DefaultOSGiLogger.this.Receive "Permalink")  def receive: [Receive](#Receive=akka.actor.Actor.Receive)Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesDefaultOSGiLogger → [DefaultLogger](../event/Logging$$DefaultLogger.html) → [Actor](../actor/Actor.html)
38. [**](../../akka/osgi/DefaultOSGiLogger.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../actor/Actor.html)
39. [**](../../akka/osgi/DefaultOSGiLogger.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../actor/Actor.html)
40. [**](../../akka/osgi/DefaultOSGiLogger.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../actor/Actor.html)
41. [**](../../akka/osgi/DefaultOSGiLogger.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
42. [**](../../akka/osgi/DefaultOSGiLogger.html#timestamp(event:akka.event.Logging.LogEvent):String "Permalink")  def timestamp(event: [LogEvent](../event/Logging$$LogEvent.html)): StringDefinition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
43. [**](../../akka/osgi/DefaultOSGiLogger.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
44. [**](../../akka/osgi/DefaultOSGiLogger.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../event/EventStream.html)

Definition Classes[Actor](../actor/Actor.html)
45. [**](../../akka/osgi/DefaultOSGiLogger.html#uninitialisedReceive:DefaultOSGiLogger.this.Receive "Permalink")  def uninitialisedReceive: [Receive](#Receive=akka.actor.Actor.Receive)Behavior of the logger that waits for its LogService

Behavior of the logger that waits for its LogService

returnsReceive: Store LogEvent or become initialised
46. [**](../../akka/osgi/DefaultOSGiLogger.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
47. [**](../../akka/osgi/DefaultOSGiLogger.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
48. [**](../../akka/osgi/DefaultOSGiLogger.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
49. [**](../../akka/osgi/DefaultOSGiLogger.html#warning(event:akka.event.Logging.Warning):Unit "Permalink")  def warning(event: [Warning](../event/Logging$$Warning.html)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](../event/Logging$$StdOutLogger.html)
### Deprecated Value Members

1. [**](../../akka/osgi/DefaultOSGiLogger.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../akka/osgi/DefaultOSGiLogger.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DefaultOSGiLogger toStringFormat\[DefaultOSGiLogger] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/osgi/DefaultOSGiLogger.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DefaultOSGiLogger, B)ImplicitThis member is added by an implicit conversion from DefaultOSGiLogger toArrowAssoc\[DefaultOSGiLogger] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DefaultLogger](../event/Logging$$DefaultLogger.html)

### Inherited from [RequiresMessageQueue](../dispatch/RequiresMessageQueue.html)\[[LoggerMessageQueueSemantics](../event/LoggerMessageQueueSemantics.html)]

### Inherited from [StdOutLogger](../event/Logging$$StdOutLogger.html)

### Inherited from [Actor](../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDefaultOSGiLogger to any2stringadd\[DefaultOSGiLogger]

### Inherited by implicit conversion StringFormat fromDefaultOSGiLogger to StringFormat\[DefaultOSGiLogger]

### Inherited by implicit conversion Ensuring fromDefaultOSGiLogger to Ensuring\[DefaultOSGiLogger]

### Inherited by implicit conversion ArrowAssoc fromDefaultOSGiLogger to ArrowAssoc\[DefaultOSGiLogger]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/LoggerMessageQueueSemantics.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$Debug.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$DefaultLogger.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$Error.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$Info.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$LogEvent.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$StdOutLogger.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/Logging$$Warning.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/osgi/ActorSystemActivator.html
- https://doc.akka.io/api/akka-core/2.6/akka/osgi/BundleDelegatingClassLoader$.html
- https://doc.akka.io/api/akka-core/2.6/akka/osgi/BundleDelegatingClassLoader.html
- https://doc.akka.io/api/akka-core/2.6/akka/osgi/DefaultOSGiLogger.html
- https://doc.akka.io/api/akka-core/2.6/akka/osgi/OsgiActorSystemFactory$.html
- https://doc.akka.io/api/akka-core/2.6/akka/osgi/OsgiActorSystemFactory.html
- https://doc.akka.io/api/akka-core/2.6/akka/osgi/UnregisteringLogService$.html
- https://doc.akka.io/api/akka-core/2.6/akka/osgi/index.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/osgi/DefaultOSGiLogger.html](https://doc.akka.io/api/akka-core/2.6/akka/osgi/DefaultOSGiLogger.html)*