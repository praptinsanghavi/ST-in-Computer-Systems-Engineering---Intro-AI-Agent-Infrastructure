---
description: Akka 2.10.17 - akka.coordination.lease.LeaseSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:26:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/coordination/lease/LeaseSettings$.html
title: Akka 2.10.17 - akka.coordination.lease.LeaseSettings
---

# Akka 2.10.17 - akka.coordination.lease.LeaseSettings

> **Summary:** Akka 2.10.17 - akka.coordination.lease.LeaseSettings

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
[o](LeaseSettings.html "See companion class")[akka](../../index.html).[coordination](../index.html).[lease](index.html)

# [LeaseSettings](LeaseSettings.html "See companion class")[**](../../../akka/coordination/lease/LeaseSettings$.html "Permalink")

### Companion [class LeaseSettings](LeaseSettings.html "See companion class")

#### object LeaseSettings

Source[LeaseSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-coordination/src/main/scala/akka/coordination/lease/LeaseSettings.scala#L9)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LeaseSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/coordination/lease/LeaseSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/coordination/lease/LeaseSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/coordination/lease/LeaseSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/coordination/lease/LeaseSettings$.html#apply(config:com.typesafe.config.Config,leaseName:String,ownerName:String):akka.coordination.lease.LeaseSettings "Permalink")  def apply(config: Config, leaseName: String, ownerName: String): [LeaseSettings](LeaseSettings.html)
5. [**](../../../akka/coordination/lease/LeaseSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/coordination/lease/LeaseSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/coordination/lease/LeaseSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/coordination/lease/LeaseSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/coordination/lease/LeaseSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/coordination/lease/LeaseSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/coordination/lease/LeaseSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/coordination/lease/LeaseSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/coordination/lease/LeaseSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/coordination/lease/LeaseSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/coordination/lease/LeaseSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/coordination/lease/LeaseSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/coordination/lease/LeaseSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/coordination/lease/LeaseSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/coordination/lease/LeaseSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/coordination/lease/LeaseSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseException.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseUsageSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/TimeoutSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/TimeoutSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseSettings$.html](https://doc.akka.io/api/akka-core/2.10/akka/coordination/lease/LeaseSettings$.html)*