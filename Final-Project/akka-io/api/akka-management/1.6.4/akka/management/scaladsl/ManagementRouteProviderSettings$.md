---
description: Akka Management 1.6.4 - akka.management.scaladsl.ManagementRouteProviderSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-management/current/akka/management/scaladsl/ManagementRouteProviderSettings$.html
title: Akka Management 1.6.4 - akka.management.scaladsl.ManagementRouteProviderSettings
---

# Akka Management 1.6.4 - akka.management.scaladsl.ManagementRouteProviderSettings

> **Summary:** Akka Management 1.6.4 - akka.management.scaladsl.ManagementRouteProviderSettings

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
[o](ManagementRouteProviderSettings.html "See companion trait")[akka](../../index.html).[management](../index.html).[scaladsl](index.html)

# [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html "See companion trait")[**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html "Permalink")

### Companion [trait ManagementRouteProviderSettings](ManagementRouteProviderSettings.html "See companion trait")

#### object ManagementRouteProviderSettings

Source[ManagementRouteProviderSettings.scala](https://github.com/akka/akka-management/tree/v1.6.4/management/src/main/scala/akka/management/scaladsl/ManagementRouteProviderSettings.scala#L23)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ManagementRouteProviderSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#apply(selfBaseUri:akka.http.scaladsl.model.Uri,readOnly:Boolean):akka.management.scaladsl.ManagementRouteProviderSettings "Permalink")  def apply(selfBaseUri: [Uri](https://doc.akka.io/api/akka-http/10.7.3/akka/http/scaladsl/model/Uri.html#akka.http.scaladsl.model.Uri), readOnly: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html)
5. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
15. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/management/scaladsl/ManagementRouteProviderSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.3/akka/http/scaladsl/model/Uri.html
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
*Source: [https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ManagementRouteProviderSettings$.html](https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/ManagementRouteProviderSettings$.html)*