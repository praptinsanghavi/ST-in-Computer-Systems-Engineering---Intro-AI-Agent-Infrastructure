---
description: Akka Management 1.6.4 - akka.management.scaladsl.AkkaManagement
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-management/current/akka/management/scaladsl/AkkaManagement$.html
title: Akka Management 1.6.4 - akka.management.scaladsl.AkkaManagement
---

# Akka Management 1.6.4 - akka.management.scaladsl.AkkaManagement

> **Summary:** Akka Management 1.6.4 - akka.management.scaladsl.AkkaManagement

## Content

Akka Management1\.6\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/management/index.html "Permalink")  package [management](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/management/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[management](../index.html)
- [AkkaManagement](AkkaManagement.html)
- [HealthChecks](HealthChecks.html "Not for user extension")
- [LivenessCheckSetup](LivenessCheckSetup.html "Setup for liveness checks, constructor is *Internal API*, use factories in LivenessCheckSetup")
- [ManagementRouteProvider](ManagementRouteProvider.html "Extend this trait in your extension in order to allow it to contribute routes to Akka Management starts its HTTP endpoint")
- [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html "Settings object used to pass through information about the environment the routes will be running in, from the component starting the actual HTTP server, to the ManagementRouteProvider")
- [ReadinessCheckSetup](ReadinessCheckSetup.html "Setup for readiness checks, constructor is *Internal API*, use factories in ReadinessCheckSetup")
[o](AkkaManagement.html "See companion class")[akka](../../index.html).[management](../index.html).[scaladsl](index.html)

# [AkkaManagement](AkkaManagement.html "See companion class")[**](../../../akka/management/scaladsl/AkkaManagement$.html "Permalink")

### Companion [class AkkaManagement](AkkaManagement.html "See companion class")

#### object AkkaManagement extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[AkkaManagement](AkkaManagement.html)] with [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)

Source[AkkaManagement.scala](https://github.com/akka/akka-management/tree/v1.6.4/management/src/main/scala/akka/management/scaladsl/AkkaManagement.scala#L40)Linear Supertypes[ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider), [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[AkkaManagement](AkkaManagement.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaManagement
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/management/scaladsl/AkkaManagement$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/management/scaladsl/AkkaManagement$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/management/scaladsl/AkkaManagement$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/management/scaladsl/AkkaManagement$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [AkkaManagement](AkkaManagement.html)Definition ClassesExtensionId
5. [**](../../../akka/management/scaladsl/AkkaManagement$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [AkkaManagement](AkkaManagement.html)Definition ClassesExtensionId
6. [**](../../../akka/management/scaladsl/AkkaManagement$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/management/scaladsl/AkkaManagement$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
8. [**](../../../akka/management/scaladsl/AkkaManagement$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.management.scaladsl.AkkaManagement "Permalink")  def createExtension(system: [ExtendedActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem)): [AkkaManagement](AkkaManagement.html)Definition ClassesAkkaManagement → ExtensionId
9. [**](../../../akka/management/scaladsl/AkkaManagement$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../akka/management/scaladsl/AkkaManagement$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesExtensionId → AnyRef → Any
11. [**](../../../akka/management/scaladsl/AkkaManagement$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.management.scaladsl.AkkaManagement "Permalink")  def get(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [AkkaManagement](AkkaManagement.html)Definition ClassesAkkaManagement → ExtensionId
12. [**](../../../akka/management/scaladsl/AkkaManagement$.html#get(system:akka.actor.ActorSystem):akka.management.scaladsl.AkkaManagement "Permalink")  def get(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [AkkaManagement](AkkaManagement.html)Definition ClassesAkkaManagement → ExtensionId
13. [**](../../../akka/management/scaladsl/AkkaManagement$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../../akka/management/scaladsl/AkkaManagement$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesExtensionId → AnyRef → Any
15. [**](../../../akka/management/scaladsl/AkkaManagement$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/management/scaladsl/AkkaManagement$.html#lookup:akka.management.scaladsl.AkkaManagement.type "Permalink")  def lookup: AkkaManagement.typeDefinition ClassesAkkaManagement → ExtensionIdProvider
17. [**](../../../akka/management/scaladsl/AkkaManagement$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/management/scaladsl/AkkaManagement$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
19. [**](../../../akka/management/scaladsl/AkkaManagement$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
20. [**](../../../akka/management/scaladsl/AkkaManagement$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/management/scaladsl/AkkaManagement$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/management/scaladsl/AkkaManagement$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/management/scaladsl/AkkaManagement$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/management/scaladsl/AkkaManagement$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/management/scaladsl/AkkaManagement$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)

### Inherited from [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[AkkaManagement](AkkaManagement.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/AkkaManagement$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/AkkaManagement.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/HealthChecks$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/HealthChecks.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/LivenessCheckSetup$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/LivenessCheckSetup.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ManagementRouteProvider.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ManagementRouteProviderSettings$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ManagementRouteProviderSettings.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ReadinessCheckSetup$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ReadinessCheckSetup.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/index.html
- https://doc.akka.io/api/akka-management/1.6.4/index.html

---
*Source: [https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/AkkaManagement$.html](https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/AkkaManagement$.html)*