---
description: Akka 2.6.21 - akka.io.InetAddressDnsResolver
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:21:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/io/InetAddressDnsResolver.html
title: Akka 2.6.21 - akka.io.InetAddressDnsResolver
---

# Akka 2.6.21 - akka.io.InetAddressDnsResolver

> **Summary:** Akka 2.6.21 - akka.io.InetAddressDnsResolver

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/dns/index.html "Permalink")  package [dns](dns/index.html)Definition Classes[io](index.html)
- [BufferPool](BufferPool.html)
- [Dns](Dns.html "Not for user extension.")
- [DnsExt](DnsExt.html)
- [DnsProvider](DnsProvider.html "Where as it is possible to plug in alternative DNS implementations it is not recommended.")
- [IO](IO$.html "Entry point to Akka’s IO layer.")
- [Inet](Inet$.html)
- [InetAddressDnsProvider](InetAddressDnsProvider.html "INTERNAL API")
- InetAddressDnsResolver
- [IpVersionSelector](IpVersionSelector$.html "INTERNAL API")
- [SelectionHandlerSettings](SelectionHandlerSettings.html)
- [SimpleDnsCache](SimpleDnsCache.html)
- [SimpleDnsManager](SimpleDnsManager.html)
- [Tcp](Tcp$.html "TCP Extension for Akka’s IO layer.")
- [TcpExt](TcpExt.html)
- [TcpMessage](TcpMessage$.html)
- [TcpSO](TcpSO$.html "Java API for accessing socket options.")
- [Udp](Udp$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnected](UdpConnected$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnectedExt](UdpConnectedExt.html)
- [UdpConnectedMessage](UdpConnectedMessage$.html "Java API: factory methods for the message types used when communicating with the UdpConnected service.")
- [UdpExt](UdpExt.html)
- [UdpMessage](UdpMessage$.html "Java API: factory methods for the message types used when communicating with the Udp service.")
- [UdpSO](UdpSO$.html)
c[akka](../index.html).[io](index.html)

# InetAddressDnsResolver[**](../../akka/io/InetAddressDnsResolver.html "Permalink")

### 

#### class InetAddressDnsResolver extends [Actor](../actor/Actor.html) with [ActorLogging](../actor/ActorLogging.html)

INTERNAL API

Respects the settings that can be set on the Java runtime via parameters.

Annotations@nowarn() @[InternalApi](../annotation/InternalApi.html)() Source[InetAddressDnsResolver.scala](https://github.com/akka/akka/tree/v2.6.21//akka-actor/src/main/scala/akka/io/InetAddressDnsResolver.scala#L39)Linear Supertypes[ActorLogging](../actor/ActorLogging.html), [Actor](../actor/Actor.html), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. InetAddressDnsResolver
2. ActorLogging
3. Actor
4. AnyRef
5. Any
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

1. [**](../../akka/io/InetAddressDnsResolver.html#<init>(cache:akka.io.SimpleDnsCache,config:com.typesafe.config.Config):akka.io.InetAddressDnsResolver "Permalink")  new InetAddressDnsResolver(cache: [SimpleDnsCache](SimpleDnsCache.html), config: Config)
### Type Members

1. [**](../../akka/io/InetAddressDnsResolver.html#Receive=akka.actor.Actor.Receive "Permalink")  type Receive \= [PartialFunction](https://www.scala-lang.org/api/2.13.8/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)]Definition Classes[Actor](../actor/Actor.html)
### Value Members

1. [**](../../akka/io/InetAddressDnsResolver.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/InetAddressDnsResolver.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/InetAddressDnsResolver.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from InetAddressDnsResolver toany2stringadd\[InetAddressDnsResolver] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/InetAddressDnsResolver.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (InetAddressDnsResolver, B)ImplicitThis member is added by an implicit conversion from InetAddressDnsResolver toArrowAssoc\[InetAddressDnsResolver] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/InetAddressDnsResolver.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/InetAddressDnsResolver.html#aroundPostRestart(reason:Throwable):Unit "Permalink")  def aroundPostRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postRestart`. Calls `postRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
7. [**](../../akka/io/InetAddressDnsResolver.html#aroundPostStop():Unit "Permalink")  def aroundPostStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `postStop`. Calls `postStop` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
8. [**](../../akka/io/InetAddressDnsResolver.html#aroundPreRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def aroundPreRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preRestart`. Calls `preRestart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
9. [**](../../akka/io/InetAddressDnsResolver.html#aroundPreStart():Unit "Permalink")  def aroundPreStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to `preStart`. Calls `preStart` by default.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
10. [**](../../akka/io/InetAddressDnsResolver.html#aroundReceive(receive:akka.actor.Actor.Receive,msg:Any):Unit "Permalink")  def aroundReceive(receive: [actor.Actor.Receive](../actor/Actor$.html#Receive=PartialFunction[Any,Unit]), msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)INTERNAL API.

INTERNAL API.

Can be overridden to intercept calls to this actor's current behavior.

receivecurrent behavior.

msgcurrent message.

Attributesprotected\[[akka](../index.html)] Definition Classes[Actor](../actor/Actor.html)Annotations@[InternalApi](../annotation/InternalApi.html)()
11. [**](../../akka/io/InetAddressDnsResolver.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/io/InetAddressDnsResolver.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
13. [**](../../akka/io/InetAddressDnsResolver.html#context:akka.actor.ActorContext "Permalink") implicit  val context: [ActorContext](../actor/ActorContext.html)Scala API: Stores the context for this actor, including self, and sender.

Scala API: Stores the context for this actor, including self, and sender.
It is implicit to support operations such as `forward`.

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

[akka.actor.ActorContext](../actor/ActorContext.html) is the Scala API. `getContext` returns a
[akka.actor.AbstractActor.ActorContext](../actor/AbstractActor$$ActorContext.html), which is the Java API of the actor
context.

Definition Classes[Actor](../actor/Actor.html)
14. [**](../../akka/io/InetAddressDnsResolver.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (InetAddressDnsResolver) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): InetAddressDnsResolverImplicitThis member is added by an implicit conversion from InetAddressDnsResolver toEnsuring\[InetAddressDnsResolver] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/io/InetAddressDnsResolver.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (InetAddressDnsResolver) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): InetAddressDnsResolverImplicitThis member is added by an implicit conversion from InetAddressDnsResolver toEnsuring\[InetAddressDnsResolver] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/io/InetAddressDnsResolver.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): InetAddressDnsResolverImplicitThis member is added by an implicit conversion from InetAddressDnsResolver toEnsuring\[InetAddressDnsResolver] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/io/InetAddressDnsResolver.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): InetAddressDnsResolverImplicitThis member is added by an implicit conversion from InetAddressDnsResolver toEnsuring\[InetAddressDnsResolver] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/io/InetAddressDnsResolver.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/io/InetAddressDnsResolver.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/io/InetAddressDnsResolver.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
21. [**](../../akka/io/InetAddressDnsResolver.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
22. [**](../../akka/io/InetAddressDnsResolver.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../akka/io/InetAddressDnsResolver.html#log:akka.event.LoggingAdapter "Permalink")  def log: [LoggingAdapter](../event/LoggingAdapter.html)Definition Classes[ActorLogging](../actor/ActorLogging.html)
24. [**](../../akka/io/InetAddressDnsResolver.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../akka/io/InetAddressDnsResolver.html#negativeCachePolicy:akka.io.dns.CachePolicy.CachePolicy "Permalink")  val negativeCachePolicy: [CachePolicy](dns/CachePolicy$$CachePolicy.html)
26. [**](../../akka/io/InetAddressDnsResolver.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
27. [**](../../akka/io/InetAddressDnsResolver.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
28. [**](../../akka/io/InetAddressDnsResolver.html#positiveCachePolicy:akka.io.dns.CachePolicy.CachePolicy "Permalink")  val positiveCachePolicy: [CachePolicy](dns/CachePolicy$$CachePolicy.html)
29. [**](../../akka/io/InetAddressDnsResolver.html#postRestart(reason:Throwable):Unit "Permalink")  def postRestart(reason: Throwable): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback: By default it calls `preStart()`.

User overridable callback: By default it calls `preStart()`.

reasonthe Throwable that caused the restart to happen
Is called right AFTER restart on the newly created Actor to allow reinitialization after an Actor crash.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
30. [**](../../akka/io/InetAddressDnsResolver.html#postStop():Unit "Permalink")  def postStop(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called asynchronously after 'actor.stop()' is invoked.
Empty default implementation.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
31. [**](../../akka/io/InetAddressDnsResolver.html#preRestart(reason:Throwable,message:Option[Any]):Unit "Permalink")  def preRestart(reason: Throwable, message: [Option](https://www.scala-lang.org/api/2.13.8/scala/Option.html#scala.Option)\[[Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)]): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

Scala API: User overridable callback: **By default it disposes of all children and then calls `postStop()`.**

reasonthe Throwable that caused the restart to happen

messageoptionally the current message the actor processed when failing, if applicable
Is called on a crashed Actor right BEFORE it is restarted to allow clean
up of resources before Actor is terminated.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
32. [**](../../akka/io/InetAddressDnsResolver.html#preStart():Unit "Permalink")  def preStart(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when an Actor is started.
Actors are automatically started asynchronously when created.
Empty default implementation.

Definition Classes[Actor](../actor/Actor.html)Annotations@throws(classOf\[Exception])
33. [**](../../akka/io/InetAddressDnsResolver.html#receive:InetAddressDnsResolver.this.Receive "Permalink")  def receive: [Receive](#Receive=akka.actor.Actor.Receive)Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Scala API: This defines the initial actor behavior, it must return a partial function
with the actor logic.

Definition ClassesInetAddressDnsResolver → [Actor](../actor/Actor.html)
34. [**](../../akka/io/InetAddressDnsResolver.html#self:akka.actor.ActorRef "Permalink") implicit final  val self: [ActorRef](../actor/ActorRef.html)The 'self' field holds the ActorRef for this actor.

The 'self' field holds the ActorRef for this actor.

Can be used to send messages to itself:

```

self ! message

```

Definition Classes[Actor](../actor/Actor.html)
35. [**](../../akka/io/InetAddressDnsResolver.html#sender():akka.actor.ActorRef "Permalink") final  def sender(): [ActorRef](../actor/ActorRef.html)The reference sender Actor of the last received message.

The reference sender Actor of the last received message.
Is defined if the message was sent from another Actor,
else `deadLetters` in [akka.actor.ActorSystem](../actor/ActorSystem.html).

WARNING: Only valid within the Actor itself, so do not close over it and
publish it to other threads!

Definition Classes[Actor](../actor/Actor.html)
36. [**](../../akka/io/InetAddressDnsResolver.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../actor/SupervisorStrategy.html)User overridable definition the strategy to use for supervising
child actors.

User overridable definition the strategy to use for supervising
child actors.

Definition Classes[Actor](../actor/Actor.html)
37. [**](../../akka/io/InetAddressDnsResolver.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
38. [**](../../akka/io/InetAddressDnsResolver.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
39. [**](../../akka/io/InetAddressDnsResolver.html#unhandled(message:Any):Unit "Permalink")  def unhandled(message: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)User overridable callback.

User overridable callback.

Is called when a message isn't handled by the current behavior of the actor
by default it fails with either a [akka.actor.DeathPactException](../actor/DeathPactException.html) (in
case of an unhandled [akka.actor.Terminated](../actor/Terminated.html) message) or publishes an [akka.actor.UnhandledMessage](../actor/UnhandledMessage.html)
to the actor's system's [akka.event.EventStream](../event/EventStream.html)

Definition Classes[Actor](../actor/Actor.html)
40. [**](../../akka/io/InetAddressDnsResolver.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../akka/io/InetAddressDnsResolver.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
42. [**](../../akka/io/InetAddressDnsResolver.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/InetAddressDnsResolver.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../akka/io/InetAddressDnsResolver.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from InetAddressDnsResolver toStringFormat\[InetAddressDnsResolver] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/InetAddressDnsResolver.html#negativeTtl:Long "Permalink")  val negativeTtl: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)Annotations@deprecated Deprecated*(Since version 2\.5\.17\)* Use negativeCacheDuration instead
4. [**](../../akka/io/InetAddressDnsResolver.html#positiveTtl:Long "Permalink")  val positiveTtl: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)Annotations@deprecated Deprecated*(Since version 2\.5\.17\)* Use positiveCacheDuration instead
5. [**](../../akka/io/InetAddressDnsResolver.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (InetAddressDnsResolver, B)ImplicitThis member is added by an implicit conversion from InetAddressDnsResolver toArrowAssoc\[InetAddressDnsResolver] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ActorLogging](../actor/ActorLogging.html)

### Inherited from [Actor](../actor/Actor.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromInetAddressDnsResolver to any2stringadd\[InetAddressDnsResolver]

### Inherited by implicit conversion StringFormat fromInetAddressDnsResolver to StringFormat\[InetAddressDnsResolver]

### Inherited by implicit conversion Ensuring fromInetAddressDnsResolver to Ensuring\[InetAddressDnsResolver]

### Inherited by implicit conversion ArrowAssoc fromInetAddressDnsResolver to ArrowAssoc\[InetAddressDnsResolver]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/api/akka-core/2.6/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/Dns$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/DnsExt.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/IO$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/Inet$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/IpVersionSelector$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/SimpleDnsCache$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/SimpleDnsCache.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/SimpleDnsManager$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/SimpleDnsManager.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/Tcp$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/TcpExt.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/TcpMessage$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/UdpExt.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/dns/CachePolicy$$CachePolicy.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/io/InetAddressDnsResolver.html](https://doc.akka.io/api/akka-core/2.6/akka/io/InetAddressDnsResolver.html)*