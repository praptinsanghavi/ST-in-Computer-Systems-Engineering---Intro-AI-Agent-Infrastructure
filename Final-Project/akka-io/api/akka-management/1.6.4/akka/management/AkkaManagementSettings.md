---
description: Akka Management 1.6.4 - akka.management.AkkaManagementSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-management/current/akka/management/AkkaManagementSettings.html
title: Akka Management 1.6.4 - akka.management.AkkaManagementSettings
---

# Akka Management 1.6.4 - akka.management.AkkaManagementSettings

> **Summary:** Akka Management 1.6.4 - akka.management.AkkaManagementSettings

## Content

Akka Management1\.6\.4 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/management/index.html "Permalink")  package [management](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/management/cluster/index.html "Permalink")  package [cluster](cluster/index.html)Definition Classes[management](index.html)
- [**](../../akka/management/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[management](index.html)
- [**](../../akka/management/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[management](index.html)
- [**](../../akka/management/loglevels/index.html "Permalink")  package [loglevels](loglevels/index.html)Definition Classes[management](index.html)
- [**](../../akka/management/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[management](index.html)
- AkkaManagementSettings
- [HealthCheckSettings](HealthCheckSettings.html)
- [InvalidHealthCheckException](InvalidHealthCheckException.html)
- [ManagementLogMarker](ManagementLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [NamedHealthCheck](NamedHealthCheck.html)
- [NamedRouteProvider](NamedRouteProvider.html)
c[akka](../index.html).[management](index.html)

# AkkaManagementSettings[**](../../akka/management/AkkaManagementSettings.html "Permalink")

### 

#### final  class AkkaManagementSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[AkkaManagementSettings.scala](https://github.com/akka/akka-management/tree/v1.6.4/management/src/main/scala/akka/management/AkkaManagementSettings.scala#L17)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaManagementSettings
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/management/AkkaManagementSettings.html#<init>(config:com.typesafe.config.Config):akka.management.AkkaManagementSettings "Permalink")  new AkkaManagementSettings(config: [Config](https://javadoc.io/page/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config))
### Value Members

1. [**](../../akka/management/AkkaManagementSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/management/AkkaManagementSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/management/AkkaManagementSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/management/AkkaManagementSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/management/AkkaManagementSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/management/AkkaManagementSettings.html#config:com.typesafe.config.Config "Permalink")  val config: [Config](https://javadoc.io/page/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config)
7. [**](../../akka/management/AkkaManagementSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../akka/management/AkkaManagementSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../akka/management/AkkaManagementSettings.html#getBasePath:java.util.Optional[String] "Permalink")  def getBasePath: [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String]Java API
10. [**](../../akka/management/AkkaManagementSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../akka/management/AkkaManagementSettings.html#getHttpEffectiveBindHostname:String "Permalink")  def getHttpEffectiveBindHostname: StringJava API
12. [**](../../akka/management/AkkaManagementSettings.html#getHttpEffectiveBindPort:Int "Permalink")  def getHttpEffectiveBindPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Java API
13. [**](../../akka/management/AkkaManagementSettings.html#getHttpHostname:String "Permalink")  def getHttpHostname: StringJava API
14. [**](../../akka/management/AkkaManagementSettings.html#getHttpPort:Int "Permalink")  def getHttpPort: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Java API
15. [**](../../akka/management/AkkaManagementSettings.html#getHttpRouteProviders:java.util.List[akka.management.NamedRouteProvider] "Permalink")  def getHttpRouteProviders: [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[[NamedRouteProvider](NamedRouteProvider.html)]Java API
16. [**](../../akka/management/AkkaManagementSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
17. [**](../../akka/management/AkkaManagementSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/management/AkkaManagementSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/management/AkkaManagementSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
20. [**](../../akka/management/AkkaManagementSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
21. [**](../../akka/management/AkkaManagementSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/management/AkkaManagementSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../akka/management/AkkaManagementSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/management/AkkaManagementSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/management/AkkaManagementSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/management/AkkaManagementSettings$Http$.html "Permalink")  object [Http](AkkaManagementSettings$Http$.html)
### Deprecated Value Members

1. [**](../../akka/management/AkkaManagementSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/AkkaManagementSettings$Http$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/AkkaManagementSettings.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/HealthCheckSettings$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/HealthCheckSettings.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/InvalidHealthCheckException.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/ManagementLogMarker$.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/NamedHealthCheck.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/NamedRouteProvider.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/cluster/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/internal/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/javadsl/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/loglevels/index.html
- https://doc.akka.io/api/akka-management/1.6.4/akka/management/scaladsl/index.html
- https://doc.akka.io/api/akka-management/1.6.4/index.html

---
*Source: [https://doc.akka.io/api/akka-management/1.6.4/akka/management/AkkaManagementSettings.html](https://doc.akka.io/api/akka-management/1.6.4/akka/management/AkkaManagementSettings.html)*