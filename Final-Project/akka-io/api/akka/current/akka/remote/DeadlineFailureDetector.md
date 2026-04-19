---
description: Akka 2.10.17 - akka.remote.DeadlineFailureDetector
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:44:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/DeadlineFailureDetector.html
title: Akka 2.10.17 - akka.remote.DeadlineFailureDetector
---

# Akka 2.10.17 - akka.remote.DeadlineFailureDetector

> **Summary:** Akka 2.10.17 - akka.remote.DeadlineFailureDetector

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/artery/index.html "Permalink")  package [artery](artery/index.html)Definition Classes[remote](index.html)
- [**](../../akka/remote/routing/index.html "Permalink")  package [routing](routing/index.html)Definition Classes[remote](index.html)
- [**](../../akka/remote/serialization/index.html "Permalink")  package [serialization](serialization/index.html)Definition Classes[remote](index.html)
- [**](../../akka/remote/testconductor/index.html "Permalink")  package [testconductor](testconductor/index.html)Definition Classes[remote](index.html)
- [**](../../akka/remote/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[remote](index.html)
- [AddressUidExtension](AddressUidExtension.html)
- [ArteryControlFormats](ArteryControlFormats.html)
- [BoundAddressesExtension](BoundAddressesExtension.html)
- [ContainerFormats](ContainerFormats.html)
- DeadlineFailureDetector
- [DefaultFailureDetectorRegistry](DefaultFailureDetectorRegistry.html "A lock-less thread-safe implementation of akka.remote.FailureDetectorRegistry.")
- [FailureDetector](FailureDetector.html "A failure detector must be a thread-safe mutable construct that registers heartbeat events of a resource and is able to decide the availability of that monitored resource.")
- [FailureDetectorRegistry](FailureDetectorRegistry.html "Interface for a registry of Akka failure detectors.")
- [NotAllowedClassRemoteDeploymentAttemptException](NotAllowedClassRemoteDeploymentAttemptException.html "INTERNAL API")
- [PhiAccrualFailureDetector](PhiAccrualFailureDetector.html "Implementation of 'The Phi Accrual Failure Detector' by Hayashibara et al.")
- [RemoteLogMarker](RemoteLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [RemoteScope](RemoteScope.html)
- [RemoteSettings](RemoteSettings.html)
- [RemoteTransportException](RemoteTransportException.html "RemoteTransportException represents a general failure within a RemoteTransport, such as inability to start, wrong configuration etc.")
- [RemoteTransportExceptionNoStackTrace](RemoteTransportExceptionNoStackTrace.html "RemoteTransportException without stack trace.")
- [SystemMessageFormats](SystemMessageFormats.html)
- [UniqueAddress](UniqueAddress.html)
- [WireFormats](WireFormats.html)
c[akka](../index.html).[remote](index.html)

# DeadlineFailureDetector[**](../../akka/remote/DeadlineFailureDetector.html "Permalink")

### 

#### class DeadlineFailureDetector extends [FailureDetector](FailureDetector.html)

Implementation of failure detector using an absolute timeout of missing heartbeats
to trigger unavailability.

[\#isAvailable](#isAvailable:Boolean) will return `false` if there is no [\#heartbeat](#heartbeat():Unit) within the duration
`heartbeatInterval + acceptableHeartbeatPause`.

Source[DeadlineFailureDetector.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/DeadlineFailureDetector.scala#L31)Linear Supertypes[FailureDetector](FailureDetector.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DeadlineFailureDetector
2. FailureDetector
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
### Instance Constructors

1. [**](../../akka/remote/DeadlineFailureDetector.html#<init>(config:com.typesafe.config.Config,ev:akka.event.EventStream):akka.remote.DeadlineFailureDetector "Permalink")  new DeadlineFailureDetector(config: Config, ev: [EventStream](../event/EventStream.html))Constructor that reads parameters from config.

Constructor that reads parameters from config.
Expecting config properties named `acceptable-heartbeat-pause`.
2. [**](../../akka/remote/DeadlineFailureDetector.html#<init>(acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration,heartbeatInterval:scala.concurrent.duration.FiniteDuration)(implicitclock:akka.remote.FailureDetector.Clock):akka.remote.DeadlineFailureDetector "Permalink")  new DeadlineFailureDetector(acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), heartbeatInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit clock: [Clock](FailureDetector$$Clock.html))acceptableHeartbeatPauseDuration corresponding to number of potentially lost/delayed
 heartbeats that will be accepted before considering it to be an anomaly.

heartbeatIntervalExpected heartbeat interval

clockThe clock, returning current time in milliseconds, but can be faked for testing
 purposes. It is only used for measuring intervals (duration).
### Value Members

1. [**](../../akka/remote/DeadlineFailureDetector.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/remote/DeadlineFailureDetector.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/remote/DeadlineFailureDetector.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DeadlineFailureDetector toany2stringadd\[DeadlineFailureDetector] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/remote/DeadlineFailureDetector.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DeadlineFailureDetector, B)ImplicitThis member is added by an implicit conversion from DeadlineFailureDetector toArrowAssoc\[DeadlineFailureDetector] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/remote/DeadlineFailureDetector.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/remote/DeadlineFailureDetector.html#acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration "Permalink")  val acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
7. [**](../../akka/remote/DeadlineFailureDetector.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/remote/DeadlineFailureDetector.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/remote/DeadlineFailureDetector.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DeadlineFailureDetector) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeadlineFailureDetectorImplicitThis member is added by an implicit conversion from DeadlineFailureDetector toEnsuring\[DeadlineFailureDetector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/remote/DeadlineFailureDetector.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DeadlineFailureDetector) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeadlineFailureDetectorImplicitThis member is added by an implicit conversion from DeadlineFailureDetector toEnsuring\[DeadlineFailureDetector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/remote/DeadlineFailureDetector.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeadlineFailureDetectorImplicitThis member is added by an implicit conversion from DeadlineFailureDetector toEnsuring\[DeadlineFailureDetector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/remote/DeadlineFailureDetector.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeadlineFailureDetectorImplicitThis member is added by an implicit conversion from DeadlineFailureDetector toEnsuring\[DeadlineFailureDetector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/remote/DeadlineFailureDetector.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/remote/DeadlineFailureDetector.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/remote/DeadlineFailureDetector.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/remote/DeadlineFailureDetector.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/remote/DeadlineFailureDetector.html#heartbeat():Unit "Permalink") final  def heartbeat(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Notifies the FailureDetector that a heartbeat arrived from the monitored resource.

Notifies the FailureDetector that a heartbeat arrived from the monitored resource. This causes the FailureDetector
to update its state.

Definition ClassesDeadlineFailureDetector → [FailureDetector](FailureDetector.html)
18. [**](../../akka/remote/DeadlineFailureDetector.html#heartbeatInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val heartbeatInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
19. [**](../../akka/remote/DeadlineFailureDetector.html#isAvailable:Boolean "Permalink")  def isAvailable: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if the resource is considered to be up and healthy and returns false otherwise.

Returns true if the resource is considered to be up and healthy and returns false otherwise.

Definition ClassesDeadlineFailureDetector → [FailureDetector](FailureDetector.html)
20. [**](../../akka/remote/DeadlineFailureDetector.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/remote/DeadlineFailureDetector.html#isMonitoring:Boolean "Permalink")  def isMonitoring: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if the failure detector has received any heartbeats and started monitoring
of the resource.

Returns true if the failure detector has received any heartbeats and started monitoring
of the resource.

Definition ClassesDeadlineFailureDetector → [FailureDetector](FailureDetector.html)
22. [**](../../akka/remote/DeadlineFailureDetector.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../akka/remote/DeadlineFailureDetector.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/remote/DeadlineFailureDetector.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/remote/DeadlineFailureDetector.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/remote/DeadlineFailureDetector.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../akka/remote/DeadlineFailureDetector.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/remote/DeadlineFailureDetector.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../akka/remote/DeadlineFailureDetector.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/remote/DeadlineFailureDetector.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/remote/DeadlineFailureDetector.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DeadlineFailureDetector toStringFormat\[DeadlineFailureDetector] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/remote/DeadlineFailureDetector.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DeadlineFailureDetector, B)ImplicitThis member is added by an implicit conversion from DeadlineFailureDetector toArrowAssoc\[DeadlineFailureDetector] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [FailureDetector](FailureDetector.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDeadlineFailureDetector to any2stringadd\[DeadlineFailureDetector]

### Inherited by implicit conversion StringFormat fromDeadlineFailureDetector to StringFormat\[DeadlineFailureDetector]

### Inherited by implicit conversion Ensuring fromDeadlineFailureDetector to Ensuring\[DeadlineFailureDetector]

### Inherited by implicit conversion ArrowAssoc fromDeadlineFailureDetector to ArrowAssoc\[DeadlineFailureDetector]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/event/EventStream.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/AddressUidExtension$.html
- https://doc.akka.io/api/akka/current/akka/remote/AddressUidExtension.html
- https://doc.akka.io/api/akka/current/akka/remote/ArteryControlFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/BoundAddressesExtension$.html
- https://doc.akka.io/api/akka/current/akka/remote/BoundAddressesExtension.html
- https://doc.akka.io/api/akka/current/akka/remote/ContainerFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/DeadlineFailureDetector.html
- https://doc.akka.io/api/akka/current/akka/remote/DefaultFailureDetectorRegistry.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetector$$Clock.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetector$.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetector.html
- https://doc.akka.io/api/akka/current/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/api/akka/current/akka/remote/NotAllowedClassRemoteDeploymentAttemptException.html
- https://doc.akka.io/api/akka/current/akka/remote/PhiAccrualFailureDetector.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteLogMarker$.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteScope.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteSettings.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteTransportException.html
- https://doc.akka.io/api/akka/current/akka/remote/RemoteTransportExceptionNoStackTrace.html
- https://doc.akka.io/api/akka/current/akka/remote/SystemMessageFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/api/akka/current/akka/remote/WireFormats.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/remote/routing/index.html
- https://doc.akka.io/api/akka/current/akka/remote/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka/current/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/DeadlineFailureDetector.html](https://doc.akka.io/api/akka/current/akka/remote/DeadlineFailureDetector.html)*