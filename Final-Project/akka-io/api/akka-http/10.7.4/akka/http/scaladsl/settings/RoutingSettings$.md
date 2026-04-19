---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.RoutingSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/RoutingSettings$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.RoutingSettings
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.settings.RoutingSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.settings.RoutingSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[scaladsl](../index.html)
- [ClientConnectionSettings](ClientConnectionSettings.html "Public API but not intended for subclassing")
- [ConnectionPoolSettings](ConnectionPoolSettings.html "Public API but not intended for subclassing")
- [CorsSettings](CorsSettings.html "Settings for the CORS support")
- [Http2ClientSettings](Http2ClientSettings.html)
- [Http2ServerSettings](Http2ServerSettings.html)
- [HttpsProxySettings](HttpsProxySettings.html "Public API but not intended for subclassing")
- [ParserSettings](ParserSettings.html "Public API but not intended for subclassing")
- [PreviewServerSettings](PreviewServerSettings.html "Public API but not intended for subclassing")
- [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing")
- [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing")
- [ServerSettings](ServerSettings.html "Public API but not intended for subclassing")
- [WebSocketSettings](WebSocketSettings.html)
[o](RoutingSettings.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[settings](index.html)

# [RoutingSettings](RoutingSettings.html "See companion class")[**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html "Permalink")

### Companion [class RoutingSettings](RoutingSettings.html "See companion class")

#### object RoutingSettings extends SettingsCompanion\[[RoutingSettings](RoutingSettings.html)]

Source[RoutingSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/settings/RoutingSettings.scala#L50)Linear SupertypesSettingsCompanion\[[RoutingSettings](RoutingSettings.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RoutingSettings
2. SettingsCompanion
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#apply(configOverrides:String):akka.http.scaladsl.settings.RoutingSettings "Permalink")  def apply(configOverrides: String): [RoutingSettings](RoutingSettings.html)Create an instance of settings using the given String of config overrides to override
settings set in the class loader of this class (i.e.

Create an instance of settings using the given String of config overrides to override
settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
the class loader of this class).

Definition ClassesRoutingSettings → SettingsCompanion
5. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#apply(config:com.typesafe.config.Config):akka.http.scaladsl.settings.RoutingSettings "Permalink")  def apply(config: [Config](https://javadoc.io/page/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config)): [RoutingSettings](RoutingSettings.html)Creates an instance of settings using the given Config.

Creates an instance of settings using the given Config.

Definition ClassesRoutingSettings → SettingsCompanion
6. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink") final  def apply(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [RoutingSettings](RoutingSettings.html)Definition ClassesSettingsCompanion
7. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#apply(system:akka.actor.ActorSystem):T "Permalink") final  def apply(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [RoutingSettings](RoutingSettings.html)Creates an instance of settings using the configuration provided by the given ActorSystem.

Creates an instance of settings using the configuration provided by the given ActorSystem.

Definition ClassesSettingsCompanion
8. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#default(actorRefFactory:akka.actor.ActorRefFactory):T "Permalink")  def default(actorRefFactory: [ActorRefFactory](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRefFactory.html#akka.actor.ActorRefFactory)): [RoutingSettings](RoutingSettings.html)Definition ClassesSettingsCompanion
11. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#default(implicitsystem:akka.actor.ClassicActorSystemProvider):T "Permalink") implicit  def default(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [RoutingSettings](RoutingSettings.html)Definition ClassesSettingsCompanion
12. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/settings/RoutingSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from SettingsCompanion\[[RoutingSettings](RoutingSettings.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/CorsSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ClientSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSentEventSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings$.html)*