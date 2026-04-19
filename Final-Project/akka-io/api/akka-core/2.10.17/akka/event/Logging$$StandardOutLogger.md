---
description: Akka 2.10.17 - akka.event.Logging.StandardOutLogger
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:25:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/Logging$$StandardOutLogger.html
title: Akka 2.10.17 - akka.event.Logging.StandardOutLogger
---

# Akka 2.10.17 - akka.event.Logging.StandardOutLogger

> **Summary:** Akka 2.10.17 - akka.event.Logging.StandardOutLogger

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/Logging$.html "Permalink")  object [Logging](Logging$.html "Main entry point for Akka logging: log levels and message types (aka channels) defined for the main transport medium, the main event bus.")Main entry point for Akka logging: log levels and message types (aka
channels) defined for the main transport medium, the main event bus.

Main entry point for Akka logging: log levels and message types (aka
channels) defined for the main transport medium, the main event bus. The
recommended use is to obtain an implementation of the Logging trait with
suitable and efficient methods for generating log events:

```

val log = Logging(<bus>, <source object>)
...
log.info("hello world!")

```
The source object is used in two fashions: its `Class[_]` will be part of
all log events produced by this logger, plus a string representation is
generated which may contain per\-instance information, see `apply` or `create`
below.

Loggers are attached to the level\-specific channels `Error`,
`Warning`, `Info` and `Debug` as
appropriate for the configured (or set) log level. If you want to implement
your own, make sure to handle these four event types plus the `InitializeLogger`
message which is sent before actually attaching it to the logging bus.

Logging is configured by setting (some of) the following:

```

akka {
  loggers = ["akka.slf4j.Slf4jLogger"] # for example
  loglevel = "INFO"        # used when normal logging ("loggers") has been started
  stdout-loglevel = "WARN" # used during application start-up until normal logging is available
}

```

Definition Classes[event](index.html)
- [Debug](Logging$$Debug.html "For DEBUG Logging")
- [Debug2](Logging$$Debug2.html)
- [Debug3](Logging$$Debug3.html)
- [DefaultLogger](Logging$$DefaultLogger.html "Actor wrapper around the standard output logger.")
- [Error](Logging$$Error.html "For ERROR Logging")
- [Error2](Logging$$Error2.html)
- [Error3](Logging$$Error3.html)
- [Info](Logging$$Info.html "For INFO Logging")
- [Info2](Logging$$Info2.html)
- [Info3](Logging$$Info3.html)
- [InitializeLogger](Logging$$InitializeLogger.html "Message which is sent to each default logger (i.e.")
- [LogEvent](Logging$$LogEvent.html "Base type of LogEvents")
- [LogEventException](Logging$$LogEventException.html "Exception that wraps a LogEvent.")
- [LogEventWithCause](Logging$$LogEventWithCause.html)
- [LogEventWithMarker](Logging$$LogEventWithMarker.html "INTERNAL API, Marker interface for LogEvents containing Markers, which can be set for example on an slf4j logger")
- [LogLevel](Logging$$LogLevel.html "Marker trait for annotating LogLevel, which must be Int after erasure.")
- [LoggerException](Logging$$LoggerException.html "Artificial exception injected into Error events if no Throwable is supplied; used for getting a stack dump of error locations.")
- [LoggerInitializationException](Logging$$LoggerInitializationException.html "LoggerInitializationException is thrown to indicate that there was a problem initializing a logger")
- [LoggerInitialized](Logging$$LoggerInitialized.html "Response message each logger must send within 1 second after receiving the InitializeLogger request.")
- StandardOutLogger
- [StdOutLogger](Logging$$StdOutLogger.html)
- [Warning](Logging$$Warning.html "For WARNING Logging")
- [Warning2](Logging$$Warning2.html)
- [Warning3](Logging$$Warning3.html)
- [Warning4](Logging$$Warning4.html)
c[akka](../index.html).[event](index.html).[Logging](Logging$.html)

# StandardOutLogger[**](../../akka/event/Logging$$StandardOutLogger.html "Permalink")

### 

#### class StandardOutLogger extends InternalActorRef with MinimalActorRef with [StdOutLogger](Logging$$StdOutLogger.html)

Actor\-less logging implementation for synchronous logging to standard
output. This logger is always attached first in order to be able to log
failures during application start\-up, even before normal logging is
started. Its log level can be defined by configuration setting
`akka.stdout-loglevel`.

Source[Logging.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/Logging.scala#L1101)Linear Supertypes[StdOutLogger](Logging$$StdOutLogger.html), MinimalActorRef, LocalRef, ActorRefScope, InternalActorRef, [ScalaActorRef](../actor/ScalaActorRef.html), [ActorRef](../actor/ActorRef.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[[ActorRef](../actor/ActorRef.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StandardOutLogger
2. StdOutLogger
3. MinimalActorRef
4. LocalRef
5. ActorRefScope
6. InternalActorRef
7. ScalaActorRef
8. ActorRef
9. Serializable
10. Comparable
11. AnyRef
12. Any
Implicitly  
1. by scala2ActorRef
2. by actorRef2Scala
3. by any2stringadd
4. by StringFormat
5. by Ensuring
6. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/event/Logging$$StandardOutLogger.html#<init>():akka.event.Logging.StandardOutLogger "Permalink")  new StandardOutLogger()
### Value Members

1. [**](../../akka/event/Logging$$StandardOutLogger.html#!(message:Any)(implicitsender:akka.actor.ActorRef):Unit "Permalink")  def !(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../index.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sends a one\-way asynchronous message.

Sends a one\-way asynchronous message. E.g. fire\-and\-forget semantics.

If invoked from within an actor then the actor reference is implicitly passed on as the implicit 'sender' argument.

This actor 'sender' reference is then available in the receiving actor in the 'sender()' member variable,
if invoked from within an Actor. If not then no sender is available.

```

  actor ! message

```
Definition ClassesStandardOutLogger → MinimalActorRef → [ScalaActorRef](../actor/ScalaActorRef.html) → [ActorRef](../actor/ActorRef.html)
2. [**](../../akka/event/Logging$$StandardOutLogger.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
3. [**](../../akka/event/Logging$$StandardOutLogger.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
4. [**](../../akka/event/Logging$$StandardOutLogger.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StandardOutLogger toany2stringadd\[StandardOutLogger] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
5. [**](../../akka/event/Logging$$StandardOutLogger.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StandardOutLogger, B)ImplicitThis member is added by an implicit conversion from StandardOutLogger toArrowAssoc\[StandardOutLogger] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../akka/event/Logging$$StandardOutLogger.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../akka/event/Logging$$StandardOutLogger.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/event/Logging$$StandardOutLogger.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/event/Logging$$StandardOutLogger.html#compareTo(other:akka.actor.ActorRef):Int "Permalink") final  def compareTo(other: [ActorRef](../actor/ActorRef.html)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Comparison takes path and the unique id of the actor cell into account.

Comparison takes path and the unique id of the actor cell into account.

Definition Classes[ActorRef](../actor/ActorRef.html) → Comparable
10. [**](../../akka/event/Logging$$StandardOutLogger.html#debug(event:akka.event.Logging.Debug):Unit "Permalink")  def debug(event: [Debug](Logging$$Debug.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](Logging$$StdOutLogger.html)
11. [**](../../akka/event/Logging$$StandardOutLogger.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StandardOutLogger) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StandardOutLoggerImplicitThis member is added by an implicit conversion from StandardOutLogger toEnsuring\[StandardOutLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/event/Logging$$StandardOutLogger.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StandardOutLogger) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StandardOutLoggerImplicitThis member is added by an implicit conversion from StandardOutLogger toEnsuring\[StandardOutLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/event/Logging$$StandardOutLogger.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StandardOutLoggerImplicitThis member is added by an implicit conversion from StandardOutLogger toEnsuring\[StandardOutLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/event/Logging$$StandardOutLogger.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StandardOutLoggerImplicitThis member is added by an implicit conversion from StandardOutLogger toEnsuring\[StandardOutLogger] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/event/Logging$$StandardOutLogger.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/event/Logging$$StandardOutLogger.html#equals(that:Any):Boolean "Permalink") final  def equals(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Equals takes path and the unique id of the actor cell into account.

Equals takes path and the unique id of the actor cell into account.

Definition Classes[ActorRef](../actor/ActorRef.html) → AnyRef → Any
17. [**](../../akka/event/Logging$$StandardOutLogger.html#error(event:akka.event.Logging.Error):Unit "Permalink")  def error(event: [Error](Logging$$Error.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](Logging$$StdOutLogger.html)
18. [**](../../akka/event/Logging$$StandardOutLogger.html#forward(message:Any)(implicitcontext:akka.actor.ActorContext):Unit "Permalink")  def forward(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit context: [ActorContext](../actor/ActorContext.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Forwards the message and passes the original sender actor as the sender.

Forwards the message and passes the original sender actor as the sender.

Works, no matter whether originally sent with tell/'!' or ask/'?'.

Definition Classes[ActorRef](../actor/ActorRef.html)
19. [**](../../akka/event/Logging$$StandardOutLogger.html#getChild(names:Iterator[String]):akka.actor.InternalActorRef "Permalink")  def getChild(names: Iterator\[String]): InternalActorRefObtain ActorRef by possibly traversing the actor tree or looking it up at
some provider\-specific location.

Obtain ActorRef by possibly traversing the actor tree or looking it up at
some provider\-specific location. This method shall return the end result,
i.e. not only the next step in the look\-up; this will typically involve
recursive invocation. A path element of ".." signifies the parent, a
trailing "" element must be disregarded. If the requested path does not
exist, return Nobody.

Definition ClassesMinimalActorRef → InternalActorRef
20. [**](../../akka/event/Logging$$StandardOutLogger.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/event/Logging$$StandardOutLogger.html#getParent:akka.actor.InternalActorRef "Permalink")  def getParent: InternalActorRefObtain parent of this ref; used by getChild for ".." paths.

Obtain parent of this ref; used by getChild for ".." paths.

Definition ClassesMinimalActorRef → InternalActorRef
22. [**](../../akka/event/Logging$$StandardOutLogger.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ActorRef](../actor/ActorRef.html) → AnyRef → Any
23. [**](../../akka/event/Logging$$StandardOutLogger.html#info(event:akka.event.Logging.Info):Unit "Permalink")  def info(event: [Info](Logging$$Info.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](Logging$$StdOutLogger.html)
24. [**](../../akka/event/Logging$$StandardOutLogger.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/event/Logging$$StandardOutLogger.html#isLocal:Boolean "Permalink") final  def isLocal: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLocalRef → ActorRefScope
26. [**](../../akka/event/Logging$$StandardOutLogger.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../akka/event/Logging$$StandardOutLogger.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/event/Logging$$StandardOutLogger.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../akka/event/Logging$$StandardOutLogger.html#path:akka.actor.ActorPath "Permalink")  val path: [ActorPath](../actor/ActorPath.html)Returns the path for this actor (from this actor up to the root actor).

Returns the path for this actor (from this actor up to the root actor).

Definition ClassesStandardOutLogger → [ActorRef](../actor/ActorRef.html)
30. [**](../../akka/event/Logging$$StandardOutLogger.html#print(event:Any):Unit "Permalink")  def print(event: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](Logging$$StdOutLogger.html)
31. [**](../../akka/event/Logging$$StandardOutLogger.html#provider:akka.actor.ActorRefProvider "Permalink")  def provider: [ActorRefProvider](../actor/ActorRefProvider.html)Get a reference to the actor ref provider which created this ref.

Get a reference to the actor ref provider which created this ref.

Definition ClassesStandardOutLogger → InternalActorRef
32. [**](../../akka/event/Logging$$StandardOutLogger.html#restart(cause:Throwable):Unit "Permalink")  def restart(cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesMinimalActorRef → InternalActorRef
33. [**](../../akka/event/Logging$$StandardOutLogger.html#resume(causedByFailure:Throwable):Unit "Permalink")  def resume(causedByFailure: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesMinimalActorRef → InternalActorRef
34. [**](../../akka/event/Logging$$StandardOutLogger.html#sendSystemMessage(message:akka.dispatch.sysmsg.SystemMessage):Unit "Permalink")  def sendSystemMessage(message: SystemMessage): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesMinimalActorRef → InternalActorRef
35. [**](../../akka/event/Logging$$StandardOutLogger.html#start():Unit "Permalink")  def start(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesMinimalActorRef → InternalActorRef
36. [**](../../akka/event/Logging$$StandardOutLogger.html#stop():Unit "Permalink")  def stop(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesMinimalActorRef → InternalActorRef
37. [**](../../akka/event/Logging$$StandardOutLogger.html#suspend():Unit "Permalink")  def suspend(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesMinimalActorRef → InternalActorRef
38. [**](../../akka/event/Logging$$StandardOutLogger.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
39. [**](../../akka/event/Logging$$StandardOutLogger.html#tell(msg:Any,sender:akka.actor.ActorRef):Unit "Permalink") final  def tell(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sender: [ActorRef](../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sends the specified message to this ActorRef, i.e.

Sends the specified message to this ActorRef, i.e. fire\-and\-forget
semantics, including the sender reference if possible.

Pass [akka.actor.ActorRef](../actor/ActorRef.html) `noSender` or `null` as sender if there is nobody to reply to

Definition Classes[ActorRef](../actor/ActorRef.html)
40. [**](../../akka/event/Logging$$StandardOutLogger.html#timestamp(event:akka.event.Logging.LogEvent):String "Permalink")  def timestamp(event: [LogEvent](Logging$$LogEvent.html)): StringDefinition Classes[StdOutLogger](Logging$$StdOutLogger.html)
41. [**](../../akka/event/Logging$$StandardOutLogger.html#toString:String "Permalink")  val toString: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)
42. [**](../../akka/event/Logging$$StandardOutLogger.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
43. [**](../../akka/event/Logging$$StandardOutLogger.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
44. [**](../../akka/event/Logging$$StandardOutLogger.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
45. [**](../../akka/event/Logging$$StandardOutLogger.html#warning(event:akka.event.Logging.Warning):Unit "Permalink")  def warning(event: [Warning](Logging$$Warning.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[StdOutLogger](Logging$$StdOutLogger.html)
46. [**](../../akka/event/Logging$$StandardOutLogger.html#writeReplace():AnyRef "Permalink")  def writeReplace(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected Definition ClassesStandardOutLogger → MinimalActorRefAnnotations@throws(classOf\[java.io.ObjectStreamException])
### Shadowed Implicit Value Members

1. [**](../../akka/event/Logging$$StandardOutLogger.html#!(message:Any)(implicitsender:akka.actor.ActorRef):Unit "Permalink")  def !(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../actor/Actor$.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Scala API: Sends a one\-way asynchronous message.

Scala API: Sends a one\-way asynchronous message. E.g. fire\-and\-forget semantics.

If invoked from within an actor then the actor reference is implicitly passed on as the implicit 'sender' argument.

This actor 'sender' reference is then available in the receiving actor in the 'sender()' member variable,
if invoked from within an Actor. If not then no sender is available.

```

  actor ! message

```
ImplicitThis member is added by an implicit conversion from StandardOutLogger to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(standardOutLogger: ActorRef).!(message)(sender)
```
Definition Classes[ActorRef](../actor/ActorRef.html)
2. [**](../../akka/event/Logging$$StandardOutLogger.html#!(message:Any)(implicitsender:akka.actor.ActorRef):Unit "Permalink")  def !(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../actor/Actor$.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sends a one\-way asynchronous message.

Sends a one\-way asynchronous message. E.g. fire\-and\-forget semantics.

If invoked from within an actor then the actor reference is implicitly passed on as the implicit 'sender' argument.

This actor 'sender' reference is then available in the receiving actor in the 'sender()' member variable,
if invoked from within an Actor. If not then no sender is available.

```

  actor ! message

```
ImplicitThis member is added by an implicit conversion from StandardOutLogger to[ScalaActorRef](../actor/ScalaActorRef.html) performed by method actorRef2Scala in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(standardOutLogger: ScalaActorRef).!(message)(sender)
```
Definition Classes[ScalaActorRef](../actor/ScalaActorRef.html)
3. [**](../../akka/event/Logging$$StandardOutLogger.html#compareTo(other:akka.actor.ActorRef):Int "Permalink") final  def compareTo(other: [ActorRef](../actor/ActorRef.html)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Comparison takes path and the unique id of the actor cell into account.

Comparison takes path and the unique id of the actor cell into account.

ImplicitThis member is added by an implicit conversion from StandardOutLogger to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(standardOutLogger: ActorRef).compareTo(other)
```
Definition Classes[ActorRef](../actor/ActorRef.html) → Comparable
4. [**](../../akka/event/Logging$$StandardOutLogger.html#equals(that:Any):Boolean "Permalink") final  def equals(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Equals takes path and the unique id of the actor cell into account.

Equals takes path and the unique id of the actor cell into account.

ImplicitThis member is added by an implicit conversion from StandardOutLogger to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(standardOutLogger: ActorRef).equals(that)
```
Definition Classes[ActorRef](../actor/ActorRef.html) → AnyRef → Any
5. [**](../../akka/event/Logging$$StandardOutLogger.html#forward(message:Any)(implicitcontext:akka.actor.ActorContext):Unit "Permalink")  def forward(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))(implicit context: [ActorContext](../actor/ActorContext.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Forwards the message and passes the original sender actor as the sender.

Forwards the message and passes the original sender actor as the sender.

Works, no matter whether originally sent with tell/'!' or ask/'?'.

ImplicitThis member is added by an implicit conversion from StandardOutLogger to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(standardOutLogger: ActorRef).forward(message)(context)
```
Definition Classes[ActorRef](../actor/ActorRef.html)
6. [**](../../akka/event/Logging$$StandardOutLogger.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)ImplicitThis member is added by an implicit conversion from StandardOutLogger to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(standardOutLogger: ActorRef).hashCode()
```
Definition Classes[ActorRef](../actor/ActorRef.html) → AnyRef → Any
7. [**](../../akka/event/Logging$$StandardOutLogger.html#path:akka.actor.ActorPath "Permalink")  def path: [ActorPath](../actor/ActorPath.html)Returns the path for this actor (from this actor up to the root actor).

Returns the path for this actor (from this actor up to the root actor).

ImplicitThis member is added by an implicit conversion from StandardOutLogger to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(standardOutLogger: ActorRef).path
```
Definition Classes[ActorRef](../actor/ActorRef.html)
8. [**](../../akka/event/Logging$$StandardOutLogger.html#tell(msg:Any,sender:akka.actor.ActorRef):Unit "Permalink") final  def tell(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), sender: [ActorRef](../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sends the specified message to this ActorRef, i.e.

Sends the specified message to this ActorRef, i.e. fire\-and\-forget
semantics, including the sender reference if possible.

Pass [akka.actor.ActorRef](../actor/ActorRef.html) `noSender` or `null` as sender if there is nobody to reply to

ImplicitThis member is added by an implicit conversion from StandardOutLogger to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(standardOutLogger: ActorRef).tell(msg, sender)
```
Definition Classes[ActorRef](../actor/ActorRef.html)
9. [**](../../akka/event/Logging$$StandardOutLogger.html#toString():String "Permalink")  def toString(): StringImplicitThis member is added by an implicit conversion from StandardOutLogger to[ActorRef](../actor/ActorRef.html) performed by method scala2ActorRef in [akka.actor](../actor/index.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(standardOutLogger: ActorRef).toString()
```
Definition Classes[ActorRef](../actor/ActorRef.html) → AnyRef → Any
### Deprecated Value Members

1. [**](../../akka/event/Logging$$StandardOutLogger.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/event/Logging$$StandardOutLogger.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StandardOutLogger toStringFormat\[StandardOutLogger] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/event/Logging$$StandardOutLogger.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StandardOutLogger, B)ImplicitThis member is added by an implicit conversion from StandardOutLogger toArrowAssoc\[StandardOutLogger] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [StdOutLogger](Logging$$StdOutLogger.html)

### Inherited from MinimalActorRef

### Inherited from LocalRef

### Inherited from ActorRefScope

### Inherited from InternalActorRef

### Inherited from [ScalaActorRef](../actor/ScalaActorRef.html)

### Inherited from [ActorRef](../actor/ActorRef.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[[ActorRef](../actor/ActorRef.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion scala2ActorRef fromStandardOutLogger to [ActorRef](../actor/ActorRef.html)

### Inherited by implicit conversion actorRef2Scala fromStandardOutLogger to [ScalaActorRef](../actor/ScalaActorRef.html)

### Inherited by implicit conversion any2stringadd fromStandardOutLogger to any2stringadd\[StandardOutLogger]

### Inherited by implicit conversion StringFormat fromStandardOutLogger to StringFormat\[StandardOutLogger]

### Inherited by implicit conversion Ensuring fromStandardOutLogger to Ensuring\[StandardOutLogger]

### Inherited by implicit conversion ArrowAssoc fromStandardOutLogger to ArrowAssoc\[StandardOutLogger]

### Ungrouped

## Code Examples

### Example 1: Packages

```text
val log = Logging(<bus>, <source object>)
...
log.info("hello world!")
```

### Example 2: Packages

```text
akka {
  loggers = ["akka.slf4j.Slf4jLogger"] # for example
  loglevel = "INFO"        # used when normal logging ("loggers") has been started
  stdout-loglevel = "WARN" # used during application start-up until normal logging is available
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRefProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ScalaActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Debug$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Debug.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Debug2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Debug3.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$DefaultLogger.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Error$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Error.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Error2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Error3.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Info$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Info.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Info2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Info3.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$InitializeLogger.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogEvent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogEventException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogEventWithCause.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogEventWithMarker.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LogLevel.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LoggerException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LoggerInitializationException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LoggerInitialized$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$LoggerInitialized.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$StandardOutLogger.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$StdOutLogger$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$StdOutLogger.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Warning$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Warning.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Warning2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Warning3.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$Warning4.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$StandardOutLogger.html](https://doc.akka.io/api/akka-core/2.10.17/akka/event/Logging$$StandardOutLogger.html)*