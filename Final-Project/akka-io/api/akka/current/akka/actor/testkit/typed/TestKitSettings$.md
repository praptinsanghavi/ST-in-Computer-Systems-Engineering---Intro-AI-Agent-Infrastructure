---
description: Akka 2.10.17 - akka.actor.testkit.typed.TestKitSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:45:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/TestKitSettings$.html
title: Akka 2.10.17 - akka.actor.testkit.typed.TestKitSettings
---

# Akka 2.10.17 - akka.actor.testkit.typed.TestKitSettings

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.TestKitSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[testkit](../index.html)
- [**](../../../../akka/actor/testkit/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/actor/testkit/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[typed](index.html)
- [**](../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[typed](index.html)
- [CapturedLogEvent](CapturedLogEvent.html "Representation of a Log Event issued by a akka.actor.typed.Behavior when testing with akka.actor.testkit.typed.scaladsl.BehaviorTestKit or akka.actor.testkit.typed.javadsl.BehaviorTestKit.")
- [Effect](Effect.html "All tracked effects for the akka.actor.testkit.typed.scaladsl.BehaviorTestKit and akka.actor.testkit.typed.javadsl.BehaviorTestKit must extend this type.")
- [FishingOutcome](FishingOutcome.html "Not for user extension.")
- [LoggingEvent](LoggingEvent.html "Representation of logging event when testing with akka.actor.testkit.typed.scaladsl.LoggingTestKit or akka.actor.testkit.typed.javadsl.LoggingTestKit.")
- [TestException](TestException.html "A predefined exception that can be used in tests.")
- [TestKitSettings](TestKitSettings.html)
[o](TestKitSettings.html "See companion class")[akka](../../../index.html).[actor](../../index.html).[testkit](../index.html).[typed](index.html)

# [TestKitSettings](TestKitSettings.html "See companion class")[**](../../../../akka/actor/testkit/typed/TestKitSettings$.html "Permalink")

### Companion [class TestKitSettings](TestKitSettings.html "See companion class")

#### object TestKitSettings

Source[TestKitSettings.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/TestKitSettings.scala#L17)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestKitSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#apply(config:com.typesafe.config.Config):akka.actor.testkit.typed.TestKitSettings "Permalink")  def apply(config: Config): [TestKitSettings](TestKitSettings.html)Reads configuration settings from given `Config` that
must have the same layout as the `akka.actor.testkit.typed` section.
5. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#apply(system:akka.actor.typed.ActorSystem[_]):akka.actor.testkit.typed.TestKitSettings "Permalink")  def apply(system: [typed.ActorSystem](../../typed/ActorSystem.html)\[\_]): [TestKitSettings](TestKitSettings.html)Reads configuration settings from `akka.actor.testkit.typed` section.
6. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#create(config:com.typesafe.config.Config):akka.actor.testkit.typed.TestKitSettings "Permalink")  def create(config: Config): [TestKitSettings](TestKitSettings.html)Reads configuration settings from given `Config` that
must have the same layout as the `akka.actor.testkit.typed` section.
9. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#create(system:akka.actor.typed.ActorSystem[_]):akka.actor.testkit.typed.TestKitSettings "Permalink")  def create(system: [typed.ActorSystem](../../typed/ActorSystem.html)\[\_]): [TestKitSettings](TestKitSettings.html)Java API: Reads configuration settings from `akka.actor.testkit.typed` section.
10. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/testkit/typed/TestKitSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/CapturedLogEvent$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/CapturedLogEvent.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/Effect$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/Effect.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/FishingOutcome$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/FishingOutcome.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/LoggingEvent$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/LoggingEvent.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/TestException.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/TestKitSettings$.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/TestKitSettings.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/internal/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/TestKitSettings$.html](https://doc.akka.io/api/akka/current/akka/actor/testkit/typed/TestKitSettings$.html)*