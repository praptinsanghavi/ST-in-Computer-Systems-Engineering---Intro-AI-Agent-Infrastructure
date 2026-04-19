---
description: Akka Management 1.6.4 - akka.management.scaladsl.AkkaManagement
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:27:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-management/current/akka/management/scaladsl/AkkaManagement.html
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
- AkkaManagement
- [HealthChecks](HealthChecks.html "Not for user extension")
- [LivenessCheckSetup](LivenessCheckSetup.html "Setup for liveness checks, constructor is *Internal API*, use factories in LivenessCheckSetup")
- [ManagementRouteProvider](ManagementRouteProvider.html "Extend this trait in your extension in order to allow it to contribute routes to Akka Management starts its HTTP endpoint")
- [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html "Settings object used to pass through information about the environment the routes will be running in, from the component starting the actual HTTP server, to the ManagementRouteProvider")
- [ReadinessCheckSetup](ReadinessCheckSetup.html "Setup for readiness checks, constructor is *Internal API*, use factories in ReadinessCheckSetup")
[c](AkkaManagement$.html "See companion object")[akka](../../index.html).[management](../index.html).[scaladsl](index.html)

# [AkkaManagement](AkkaManagement$.html "See companion object")[**](../../../akka/management/scaladsl/AkkaManagement.html "Permalink")

### Companion [object AkkaManagement](AkkaManagement$.html "See companion object")

#### final  class AkkaManagement extends [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)

Source[AkkaManagement.scala](https://github.com/akka/akka-management/tree/v1.6.4/management/src/main/scala/akka/management/scaladsl/AkkaManagement.scala#L51)Linear Supertypes[Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaManagement
2. Extension
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/management/scaladsl/AkkaManagement.html#<init>()(implicitsystem:akka.actor.ExtendedActorSystem):akka.management.scaladsl.AkkaManagement "Permalink")  new AkkaManagement()(implicit system: [ExtendedActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem))
### Value Members

1. [**](../../../akka/management/scaladsl/AkkaManagement.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/management/scaladsl/AkkaManagement.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/management/scaladsl/AkkaManagement.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/management/scaladsl/AkkaManagement.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/management/scaladsl/AkkaManagement.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/management/scaladsl/AkkaManagement.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/management/scaladsl/AkkaManagement.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/management/scaladsl/AkkaManagement.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../../akka/management/scaladsl/AkkaManagement.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/management/scaladsl/AkkaManagement.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/management/scaladsl/AkkaManagement.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/management/scaladsl/AkkaManagement.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
13. [**](../../../akka/management/scaladsl/AkkaManagement.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/management/scaladsl/AkkaManagement.html#routes(transformSettings:akka.management.scaladsl.ManagementRouteProviderSettings=>akka.management.scaladsl.ManagementRouteProviderSettings):akka.http.scaladsl.server.Route "Permalink")  def routes(transformSettings: ([ManagementRouteProviderSettings](ManagementRouteProviderSettings.html)) \=\> [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html)): RouteAmend the [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html) and get the routes for the HTTP management endpoint.

Amend the [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html) and get the routes for the HTTP management endpoint.

Use this when adding authentication and HTTPS.

This method can be used to embed the Akka management routes in an existing Akka HTTP server.

Exceptions thrown[`java.lang.IllegalArgumentException`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/IllegalArgumentException.html) if routes not configured for akka management
15. [**](../../../akka/management/scaladsl/AkkaManagement.html#routes:akka.http.scaladsl.server.Route "Permalink")  def routes: RouteGet the routes for the HTTP management endpoint.

Get the routes for the HTTP management endpoint.

This method can be used to embed the Akka management routes in an existing Akka HTTP server.

Exceptions thrown[`java.lang.IllegalArgumentException`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/IllegalArgumentException.html) if routes not configured for akka management
16. [**](../../../akka/management/scaladsl/AkkaManagement.html#settings:akka.management.AkkaManagementSettings "Permalink")  val settings: [AkkaManagementSettings](../AkkaManagementSettings.html)
17. [**](../../../akka/management/scaladsl/AkkaManagement.html#start(transformSettings:akka.management.scaladsl.ManagementRouteProviderSettings=>akka.management.scaladsl.ManagementRouteProviderSettings):scala.concurrent.Future[akka.http.scaladsl.model.Uri] "Permalink")  def start(transformSettings: ([ManagementRouteProviderSettings](ManagementRouteProviderSettings.html)) \=\> [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Uri](https://doc.akka.io/api/akka-http/10.7.3/akka/http/scaladsl/model/Uri.html#akka.http.scaladsl.model.Uri)]Amend the [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html) and start an Akka HTTP server to serve
the HTTP management endpoint.

Amend the [ManagementRouteProviderSettings](ManagementRouteProviderSettings.html) and start an Akka HTTP server to serve
the HTTP management endpoint.

Use this when adding authentication and HTTPS.
18. [**](../../../akka/management/scaladsl/AkkaManagement.html#start():scala.concurrent.Future[akka.http.scaladsl.model.Uri] "Permalink")  def start(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Uri](https://doc.akka.io/api/akka-http/10.7.3/akka/http/scaladsl/model/Uri.html#akka.http.scaladsl.model.Uri)]Start an Akka HTTP server to serve the HTTP management endpoint.
19. [**](../../../akka/management/scaladsl/AkkaManagement.html#stop():scala.concurrent.Future[akka.Done] "Permalink")  def stop(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]
20. [**](../../../akka/management/scaladsl/AkkaManagement.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/management/scaladsl/AkkaManagement.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/management/scaladsl/AkkaManagement.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/management/scaladsl/AkkaManagement.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/management/scaladsl/AkkaManagement.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/management/scaladsl/AkkaManagement.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html
- https://doc.akka.io/api/akka-http/10.7.3/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/AkkaManagementSettings.html
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
*Source: [https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/AkkaManagement.html](https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/AkkaManagement.html)*