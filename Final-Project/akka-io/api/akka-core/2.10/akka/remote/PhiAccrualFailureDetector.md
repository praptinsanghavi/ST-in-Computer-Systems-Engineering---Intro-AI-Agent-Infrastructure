---
description: Akka 2.10.17 - akka.remote.PhiAccrualFailureDetector
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/PhiAccrualFailureDetector.html
title: Akka 2.10.17 - akka.remote.PhiAccrualFailureDetector
---

# Akka 2.10.17 - akka.remote.PhiAccrualFailureDetector

> **Summary:** Akka 2.10.17 - akka.remote.PhiAccrualFailureDetector

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
- [DeadlineFailureDetector](DeadlineFailureDetector.html "Implementation of failure detector using an absolute timeout of missing heartbeats to trigger unavailability.")
- [DefaultFailureDetectorRegistry](DefaultFailureDetectorRegistry.html "A lock-less thread-safe implementation of akka.remote.FailureDetectorRegistry.")
- [FailureDetector](FailureDetector.html "A failure detector must be a thread-safe mutable construct that registers heartbeat events of a resource and is able to decide the availability of that monitored resource.")
- [FailureDetectorRegistry](FailureDetectorRegistry.html "Interface for a registry of Akka failure detectors.")
- [NotAllowedClassRemoteDeploymentAttemptException](NotAllowedClassRemoteDeploymentAttemptException.html "INTERNAL API")
- PhiAccrualFailureDetector
- [RemoteLogMarker](RemoteLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [RemoteScope](RemoteScope.html)
- [RemoteSettings](RemoteSettings.html)
- [RemoteTransportException](RemoteTransportException.html "RemoteTransportException represents a general failure within a RemoteTransport, such as inability to start, wrong configuration etc.")
- [RemoteTransportExceptionNoStackTrace](RemoteTransportExceptionNoStackTrace.html "RemoteTransportException without stack trace.")
- [SystemMessageFormats](SystemMessageFormats.html)
- [UniqueAddress](UniqueAddress.html)
- [WireFormats](WireFormats.html)
c[akka](../index.html).[remote](index.html)

# PhiAccrualFailureDetector[**](../../akka/remote/PhiAccrualFailureDetector.html "Permalink")

### 

#### class PhiAccrualFailureDetector extends [FailureDetector](FailureDetector.html)

Implementation of 'The Phi Accrual Failure Detector' by Hayashibara et al. as defined in their paper:
\[https://oneofus.la/have\-emacs\-will\-hack/files/HDY04\.pdf]

The suspicion level of failure is given by a value called φ (phi).
The basic idea of the φ failure detector is to express the value of φ on a scale that
is dynamically adjusted to reflect current network conditions. A configurable
threshold is used to decide if φ is considered to be a failure.

The value of φ is calculated as:

```
φ = -log10(1 - F(timeSinceLastHeartbeat)
```
where F is the cumulative distribution function of a normal distribution with mean
and standard deviation estimated from historical heartbeat inter\-arrival times.

Source[PhiAccrualFailureDetector.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/PhiAccrualFailureDetector.scala#L57)Linear Supertypes[FailureDetector](FailureDetector.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PhiAccrualFailureDetector
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

1. [**](../../akka/remote/PhiAccrualFailureDetector.html#<init>(config:com.typesafe.config.Config,ev:akka.event.EventStream):akka.remote.PhiAccrualFailureDetector "Permalink")  new PhiAccrualFailureDetector(config: Config, ev: [EventStream](../event/EventStream.html))Constructor that reads parameters from config.

Constructor that reads parameters from config.
Expecting config properties named `threshold`, `max-sample-size`,
`min-std-deviation`, `acceptable-heartbeat-pause` and
`heartbeat-interval`.
2. [**](../../akka/remote/PhiAccrualFailureDetector.html#<init>(threshold:Double,maxSampleSize:Int,minStdDeviation:scala.concurrent.duration.FiniteDuration,acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration,firstHeartbeatEstimate:scala.concurrent.duration.FiniteDuration)(implicitclock:akka.remote.FailureDetector.Clock):akka.remote.PhiAccrualFailureDetector "Permalink")  new PhiAccrualFailureDetector(threshold: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), maxSampleSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minStdDeviation: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), firstHeartbeatEstimate: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit clock: [Clock](FailureDetector$$Clock.html))Constructor without eventStream to support backwards compatibility
3. [**](../../akka/remote/PhiAccrualFailureDetector.html#<init>(threshold:Double,maxSampleSize:Int,minStdDeviation:scala.concurrent.duration.FiniteDuration,acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration,firstHeartbeatEstimate:scala.concurrent.duration.FiniteDuration,eventStream:Option[akka.event.EventStream])(implicitclock:akka.remote.FailureDetector.Clock):akka.remote.PhiAccrualFailureDetector "Permalink")  new PhiAccrualFailureDetector(threshold: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double), maxSampleSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), minStdDeviation: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), firstHeartbeatEstimate: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), eventStream: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[EventStream](../event/EventStream.html)])(implicit clock: [Clock](FailureDetector$$Clock.html))thresholdA low threshold is prone to generate many wrong suspicions but ensures a quick detection in the event
 of a real crash. Conversely, a high threshold generates fewer mistakes but needs more time to detect
 actual crashes

maxSampleSizeNumber of samples to use for calculation of mean and standard deviation of
 inter\-arrival times.

minStdDeviationMinimum standard deviation to use for the normal distribution used when calculating phi.
 Too low standard deviation might result in too much sensitivity for sudden, but normal, deviations
 in heartbeat inter arrival times.

acceptableHeartbeatPauseDuration corresponding to number of potentially lost/delayed
 heartbeats that will be accepted before considering it to be an anomaly.
 This margin is important to be able to survive sudden, occasional, pauses in heartbeat
 arrivals, due to for example garbage collect or network drop.

firstHeartbeatEstimateBootstrap the stats with heartbeats that corresponds to
 to this duration, with a with rather high standard deviation (since environment is unknown
 in the beginning)

clockThe clock, returning current time in milliseconds, but can be faked for testing
 purposes. It is only used for measuring intervals (duration).
### Value Members

1. [**](../../akka/remote/PhiAccrualFailureDetector.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/remote/PhiAccrualFailureDetector.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/remote/PhiAccrualFailureDetector.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PhiAccrualFailureDetector toany2stringadd\[PhiAccrualFailureDetector] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/remote/PhiAccrualFailureDetector.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PhiAccrualFailureDetector, B)ImplicitThis member is added by an implicit conversion from PhiAccrualFailureDetector toArrowAssoc\[PhiAccrualFailureDetector] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/remote/PhiAccrualFailureDetector.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/remote/PhiAccrualFailureDetector.html#acceptableHeartbeatPause:scala.concurrent.duration.FiniteDuration "Permalink")  val acceptableHeartbeatPause: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
7. [**](../../akka/remote/PhiAccrualFailureDetector.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/remote/PhiAccrualFailureDetector.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/remote/PhiAccrualFailureDetector.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PhiAccrualFailureDetector) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PhiAccrualFailureDetectorImplicitThis member is added by an implicit conversion from PhiAccrualFailureDetector toEnsuring\[PhiAccrualFailureDetector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/remote/PhiAccrualFailureDetector.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PhiAccrualFailureDetector) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PhiAccrualFailureDetectorImplicitThis member is added by an implicit conversion from PhiAccrualFailureDetector toEnsuring\[PhiAccrualFailureDetector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/remote/PhiAccrualFailureDetector.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PhiAccrualFailureDetectorImplicitThis member is added by an implicit conversion from PhiAccrualFailureDetector toEnsuring\[PhiAccrualFailureDetector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/remote/PhiAccrualFailureDetector.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PhiAccrualFailureDetectorImplicitThis member is added by an implicit conversion from PhiAccrualFailureDetector toEnsuring\[PhiAccrualFailureDetector] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/remote/PhiAccrualFailureDetector.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/remote/PhiAccrualFailureDetector.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/remote/PhiAccrualFailureDetector.html#firstHeartbeatEstimate:scala.concurrent.duration.FiniteDuration "Permalink")  val firstHeartbeatEstimate: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
16. [**](../../akka/remote/PhiAccrualFailureDetector.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/remote/PhiAccrualFailureDetector.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/remote/PhiAccrualFailureDetector.html#heartbeat():Unit "Permalink") final  def heartbeat(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Notifies the FailureDetector that a heartbeat arrived from the monitored resource.

Notifies the FailureDetector that a heartbeat arrived from the monitored resource. This causes the FailureDetector
to update its state.

Definition ClassesPhiAccrualFailureDetector → [FailureDetector](FailureDetector.html)Annotations@tailrec()
19. [**](../../akka/remote/PhiAccrualFailureDetector.html#isAvailable:Boolean "Permalink")  def isAvailable: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if the resource is considered to be up and healthy and returns false otherwise.

Returns true if the resource is considered to be up and healthy and returns false otherwise.

Definition ClassesPhiAccrualFailureDetector → [FailureDetector](FailureDetector.html)
20. [**](../../akka/remote/PhiAccrualFailureDetector.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/remote/PhiAccrualFailureDetector.html#isMonitoring:Boolean "Permalink")  def isMonitoring: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if the failure detector has received any heartbeats and started monitoring
of the resource.

Returns true if the failure detector has received any heartbeats and started monitoring
of the resource.

Definition ClassesPhiAccrualFailureDetector → [FailureDetector](FailureDetector.html)
22. [**](../../akka/remote/PhiAccrualFailureDetector.html#maxSampleSize:Int "Permalink")  val maxSampleSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
23. [**](../../akka/remote/PhiAccrualFailureDetector.html#minStdDeviation:scala.concurrent.duration.FiniteDuration "Permalink")  val minStdDeviation: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
24. [**](../../akka/remote/PhiAccrualFailureDetector.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../akka/remote/PhiAccrualFailureDetector.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/remote/PhiAccrualFailureDetector.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/remote/PhiAccrualFailureDetector.html#phi:Double "Permalink")  def phi: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)The suspicion level of the accrual failure detector.

The suspicion level of the accrual failure detector.

If a connection does not have any records in failure detector then it is
considered healthy.
28. [**](../../akka/remote/PhiAccrualFailureDetector.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../akka/remote/PhiAccrualFailureDetector.html#threshold:Double "Permalink")  val threshold: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)
30. [**](../../akka/remote/PhiAccrualFailureDetector.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../akka/remote/PhiAccrualFailureDetector.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/remote/PhiAccrualFailureDetector.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../akka/remote/PhiAccrualFailureDetector.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/remote/PhiAccrualFailureDetector.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/remote/PhiAccrualFailureDetector.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PhiAccrualFailureDetector toStringFormat\[PhiAccrualFailureDetector] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/remote/PhiAccrualFailureDetector.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PhiAccrualFailureDetector, B)ImplicitThis member is added by an implicit conversion from PhiAccrualFailureDetector toArrowAssoc\[PhiAccrualFailureDetector] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [FailureDetector](FailureDetector.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPhiAccrualFailureDetector to any2stringadd\[PhiAccrualFailureDetector]

### Inherited by implicit conversion StringFormat fromPhiAccrualFailureDetector to StringFormat\[PhiAccrualFailureDetector]

### Inherited by implicit conversion Ensuring fromPhiAccrualFailureDetector to Ensuring\[PhiAccrualFailureDetector]

### Inherited by implicit conversion ArrowAssoc fromPhiAccrualFailureDetector to ArrowAssoc\[PhiAccrualFailureDetector]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/AddressUidExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/AddressUidExtension.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/ArteryControlFormats.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/BoundAddressesExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/BoundAddressesExtension.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/ContainerFormats.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/DeadlineFailureDetector.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/DefaultFailureDetectorRegistry.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/FailureDetector$$Clock.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/FailureDetector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/FailureDetector.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/FailureDetectorRegistry.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/NotAllowedClassRemoteDeploymentAttemptException.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/PhiAccrualFailureDetector.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteScope.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteTransportException.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteTransportExceptionNoStackTrace.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/SystemMessageFormats.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/UniqueAddress.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/WireFormats.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/routing/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/PhiAccrualFailureDetector.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/PhiAccrualFailureDetector.html)*