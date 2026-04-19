---
description: Akka 2.10.17 - akka.remote.testkit.ThrottleMode
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:11:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/testkit/ThrottleMode$.html
title: Akka 2.10.17 - akka.remote.testkit.ThrottleMode
---

# Akka 2.10.17 - akka.remote.testkit.ThrottleMode

> **Summary:** Akka 2.10.17 - akka.remote.testkit.ThrottleMode

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/remote/index.html "Permalink")  package [remote](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/remote/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[remote](../index.html)
- [Blackhole](Blackhole$.html)
- [Direction](Direction.html)
- [ForceDisassociate](ForceDisassociate.html "Management Command to force disassociation of an address.")
- [ForceDisassociateAck](ForceDisassociateAck$.html)
- [MultiNodeConfig](MultiNodeConfig.html "Configure the role names and participants of the test, including configuration settings.")
- [MultiNodeSpec](MultiNodeSpec.html "Note: To be able to run tests with everything ignored or excluded by tags you must not use testconductor, or helper methods that use testconductor, from the constructor of your test class.")
- [MultiNodeSpecCallbacks](MultiNodeSpecCallbacks.html "Use this to hook MultiNodeSpec into your test framework lifecycle, either by having your test extend MultiNodeSpec and call these methods or by creating a trait that calls them and then mixing that trait with your test together with MultiNodeSpec.")
- [SetThrottle](SetThrottle.html)
- [SetThrottleAck](SetThrottleAck$.html)
- [ThrottleMode](ThrottleMode.html)
- [TokenBucket](TokenBucket.html)
- [Unthrottled](Unthrottled$.html)
[o](ThrottleMode.html "See companion trait")[akka](../../index.html).[remote](../index.html).[testkit](index.html)

# [ThrottleMode](ThrottleMode.html "See companion trait")[**](../../../akka/remote/testkit/ThrottleMode$.html "Permalink")

### Companion [trait ThrottleMode](ThrottleMode.html "See companion trait")

#### object ThrottleMode

Source[TestTransportCommands.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/testkit/TestTransportCommands.scala#L87)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ThrottleMode
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/remote/testkit/ThrottleMode$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/remote/testkit/ThrottleMode$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/remote/testkit/ThrottleMode$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/remote/testkit/ThrottleMode$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/remote/testkit/ThrottleMode$.html#blackholeThrottleMode():akka.remote.testkit.ThrottleMode "Permalink")  def blackholeThrottleMode(): [ThrottleMode](ThrottleMode.html)Java API: get the Blackhole instance
6. [**](../../../akka/remote/testkit/ThrottleMode$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/remote/testkit/ThrottleMode$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/remote/testkit/ThrottleMode$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/remote/testkit/ThrottleMode$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/remote/testkit/ThrottleMode$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/remote/testkit/ThrottleMode$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/remote/testkit/ThrottleMode$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/remote/testkit/ThrottleMode$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/remote/testkit/ThrottleMode$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/remote/testkit/ThrottleMode$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/remote/testkit/ThrottleMode$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/remote/testkit/ThrottleMode$.html#unthrottledThrottleMode():akka.remote.testkit.ThrottleMode "Permalink")  def unthrottledThrottleMode(): [ThrottleMode](ThrottleMode.html)Java API: get the Unthrottled instance
18. [**](../../../akka/remote/testkit/ThrottleMode$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/remote/testkit/ThrottleMode$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../akka/remote/testkit/ThrottleMode$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/remote/testkit/ThrottleMode$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Blackhole$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Direction$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Direction.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ForceDisassociate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ForceDisassociateAck$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/MultiNodeSpecCallbacks.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/SetThrottle.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/SetThrottleAck$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ThrottleMode$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/TokenBucket.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/Unthrottled$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ThrottleMode$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/ThrottleMode$.html)*