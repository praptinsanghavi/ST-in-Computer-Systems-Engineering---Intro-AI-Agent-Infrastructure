---
description: Akka 2.10.17 - akka.coordination.lease.LeaseUsageSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:25:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/coordination/lease/LeaseUsageSettings$.html
title: Akka 2.10.17 - akka.coordination.lease.LeaseUsageSettings
---

# Akka 2.10.17 - akka.coordination.lease.LeaseUsageSettings

> **Summary:** Akka 2.10.17 - akka.coordination.lease.LeaseUsageSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/coordination/index.html "Permalink")  package [coordination](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/coordination/lease/index.html "Permalink")  package [lease](index.html)Definition Classes[coordination](../index.html)
- [**](../../../akka/coordination/lease/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[lease](index.html)
- [**](../../../akka/coordination/lease/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[lease](index.html)
- [LeaseException](LeaseException.html)
- [LeaseSettings](LeaseSettings.html)
- [LeaseTimeoutException](LeaseTimeoutException.html)
- [LeaseUsageSettings](LeaseUsageSettings.html)
- [TimeoutSettings](TimeoutSettings.html)
[o](LeaseUsageSettings.html "See companion class")[akka](../../index.html).[coordination](../index.html).[lease](index.html)

# [LeaseUsageSettings](LeaseUsageSettings.html "See companion class")[**](../../../akka/coordination/lease/LeaseUsageSettings$.html "Permalink")

### Companion [class LeaseUsageSettings](LeaseUsageSettings.html "See companion class")

#### object LeaseUsageSettings

Note that if you define a custom lease name and have several Cluster Singletons or Cluster Sharding
entity types each one must have a unique lease name. If the lease name is undefined it will be derived
from ActorSystem name and other component names, but that may result in too long lease names.

Source[LeaseUsageSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-coordination/src/main/scala/akka/coordination/lease/LeaseUsageSettings.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LeaseUsageSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#apply(leaseImplementation:String,leaseRetryInterval:scala.concurrent.duration.FiniteDuration,leaseName:String):akka.coordination.lease.LeaseUsageSettings "Permalink")  def apply(leaseImplementation: String, leaseRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), leaseName: String): [LeaseUsageSettings](LeaseUsageSettings.html)Scala API:

Scala API:

leaseNameNote that if you have several Cluster Singletons or Cluster Sharding
 entity types using lease each one must have a unique lease name
5. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#apply(leaseImplementation:String,leaseRetryInterval:scala.concurrent.duration.FiniteDuration):akka.coordination.lease.LeaseUsageSettings "Permalink")  def apply(leaseImplementation: String, leaseRetryInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [LeaseUsageSettings](LeaseUsageSettings.html)Scala API: Create lease settings with undefined lease name to trigger auto generated names when used with
 for example singleton or sharding
6. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#apply(config:com.typesafe.config.Config):akka.coordination.lease.LeaseUsageSettings "Permalink")  def apply(config: Config): [LeaseUsageSettings](LeaseUsageSettings.html)Scala API: Load the settings from the given lease config block
7. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#create(leaseImplementation:String,leaseRetryInterval:java.time.Duration,leaseName:String):akka.coordination.lease.LeaseUsageSettings "Permalink")  def create(leaseImplementation: String, leaseRetryInterval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), leaseName: String): [LeaseUsageSettings](LeaseUsageSettings.html)Java API:

Java API:

leaseNameNote that if you have several Cluster Singletons or Cluster Sharding
 entity types using lease each one must have a unique lease name
10. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#create(leaseImplementation:String,leaseRetryInterval:java.time.Duration):akka.coordination.lease.LeaseUsageSettings "Permalink")  def create(leaseImplementation: String, leaseRetryInterval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [LeaseUsageSettings](LeaseUsageSettings.html)Java API: Create lease settings with undefined lease name to trigger auto generated names when used with
 for example singleton or sharding
11. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#create(config:com.typesafe.config.Config):akka.coordination.lease.LeaseUsageSettings "Permalink")  def create(config: Config): [LeaseUsageSettings](LeaseUsageSettings.html)Java API: Load the settings from the given lease config block
12. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/coordination/lease/LeaseUsageSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/coordination/index.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseException.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseSettings$.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseSettings.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseUsageSettings$.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/TimeoutSettings$.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/TimeoutSettings.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/index.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseUsageSettings$.html](https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseUsageSettings$.html)*