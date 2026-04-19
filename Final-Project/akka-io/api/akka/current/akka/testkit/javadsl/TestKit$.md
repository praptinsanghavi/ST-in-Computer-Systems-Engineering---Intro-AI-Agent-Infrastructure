---
description: Akka 2.10.17 - akka.testkit.javadsl.TestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/javadsl/TestKit$.html
title: Akka 2.10.17 - akka.testkit.javadsl.TestKit
---

# Akka 2.10.17 - akka.testkit.javadsl.TestKit

> **Summary:** Akka 2.10.17 - akka.testkit.javadsl.TestKit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/testkit/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[testkit](../index.html)
- [EventFilter](EventFilter.html)
- [TestKit](TestKit.html "Java API: Test kit for testing actors.")
[o](TestKit.html "See companion class")[akka](../../index.html).[testkit](../index.html).[javadsl](index.html)

# [TestKit](TestKit.html "See companion class")[**](../../../akka/testkit/javadsl/TestKit$.html "Permalink")

### Companion [class TestKit](TestKit.html "See companion class")

#### object TestKit

Source[TestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/javadsl/TestKit.scala#L586)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestKit
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/testkit/javadsl/TestKit$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/testkit/javadsl/TestKit$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/testkit/javadsl/TestKit$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/testkit/javadsl/TestKit$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/testkit/javadsl/TestKit$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/testkit/javadsl/TestKit$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/testkit/javadsl/TestKit$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/testkit/javadsl/TestKit$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/testkit/javadsl/TestKit$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/testkit/javadsl/TestKit$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/testkit/javadsl/TestKit$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/testkit/javadsl/TestKit$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/testkit/javadsl/TestKit$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/testkit/javadsl/TestKit$.html#shutdownActorSystem(actorSystem:akka.actor.ActorSystem,verifySystemShutdown:Boolean):Unit "Permalink")  def shutdownActorSystem(actorSystem: [ActorSystem](../../actor/ActorSystem.html), verifySystemShutdown: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Shut down an actor system and wait for termination.

Shut down an actor system and wait for termination.
On failure debug output will be logged about the remaining actors in the system.

If verifySystemShutdown is true, then an exception will be thrown on failure.
15. [**](../../../akka/testkit/javadsl/TestKit$.html#shutdownActorSystem(actorSystem:akka.actor.ActorSystem,duration:scala.concurrent.duration.Duration):Unit "Permalink")  def shutdownActorSystem(actorSystem: [ActorSystem](../../actor/ActorSystem.html), duration: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Shut down an actor system and wait for termination.

Shut down an actor system and wait for termination.
On failure debug output will be logged about the remaining actors in the system.
16. [**](../../../akka/testkit/javadsl/TestKit$.html#shutdownActorSystem(actorSystem:akka.actor.ActorSystem):Unit "Permalink")  def shutdownActorSystem(actorSystem: [ActorSystem](../../actor/ActorSystem.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Shut down an actor system and wait for termination.

Shut down an actor system and wait for termination.
On failure debug output will be logged about the remaining actors in the system.
17. [**](../../../akka/testkit/javadsl/TestKit$.html#shutdownActorSystem(actorSystem:akka.actor.ActorSystem,duration:scala.concurrent.duration.Duration,verifySystemShutdown:Boolean):Unit "Permalink")  def shutdownActorSystem(actorSystem: [ActorSystem](../../actor/ActorSystem.html), duration: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), verifySystemShutdown: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Shut down an actor system and wait for termination.

Shut down an actor system and wait for termination.
On failure debug output will be logged about the remaining actors in the system.

If verifySystemShutdown is true, then an exception will be thrown on failure.
18. [**](../../../akka/testkit/javadsl/TestKit$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../akka/testkit/javadsl/TestKit$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../akka/testkit/javadsl/TestKit$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/testkit/javadsl/TestKit$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../akka/testkit/javadsl/TestKit$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/testkit/javadsl/TestKit$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/EventFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/TestKit$.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/TestKit.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/javadsl/TestKit$.html](https://doc.akka.io/api/akka/current/akka/testkit/javadsl/TestKit$.html)*