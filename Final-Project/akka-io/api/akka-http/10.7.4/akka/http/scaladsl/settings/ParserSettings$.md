---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings

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
[o](ParserSettings.html "See companion class")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[settings](index.html)

# [ParserSettings](ParserSettings.html "See companion class")[**](../../../../akka/http/scaladsl/settings/ParserSettings$.html "Permalink")

### Companion [class ParserSettings](ParserSettings.html "See companion class")

#### object ParserSettings extends SettingsCompanion\[[ParserSettings](ParserSettings.html)]

Source[ParserSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/settings/ParserSettings.scala#L143)Linear SupertypesSettingsCompanion\[[ParserSettings](ParserSettings.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ParserSettings
2. SettingsCompanion
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html "Permalink") sealed  trait [ConflictingContentTypeHeaderProcessingMode](ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html) extends [javadsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode](../../javadsl/settings/ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html)
2. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$CookieParsingMode.html "Permalink") sealed  trait [CookieParsingMode](ParserSettings$$CookieParsingMode.html) extends [javadsl.settings.ParserSettings.CookieParsingMode](../../javadsl/settings/ParserSettings$$CookieParsingMode.html)
3. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html "Permalink") sealed  trait [ErrorLoggingVerbosity](ParserSettings$$ErrorLoggingVerbosity.html) extends [javadsl.settings.ParserSettings.ErrorLoggingVerbosity](../../javadsl/settings/ParserSettings$$ErrorLoggingVerbosity.html)
4. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode.html "Permalink") sealed  trait [IllegalResponseHeaderNameProcessingMode](ParserSettings$$IllegalResponseHeaderNameProcessingMode.html) extends [javadsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode](../../javadsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode.html)
5. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode.html "Permalink") sealed  trait [IllegalResponseHeaderValueProcessingMode](ParserSettings$$IllegalResponseHeaderValueProcessingMode.html) extends [javadsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode](../../javadsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode.html)
### Value Members

1. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink") final  def apply(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [ParserSettings](ParserSettings.html)Definition ClassesSettingsCompanion
5. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#apply(system:akka.actor.ActorSystem):T "Permalink") final  def apply(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [ParserSettings](ParserSettings.html)Creates an instance of settings using the configuration provided by the given ActorSystem.

Creates an instance of settings using the configuration provided by the given ActorSystem.

Definition ClassesSettingsCompanion
6. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#default(actorRefFactory:akka.actor.ActorRefFactory):T "Permalink")  def default(actorRefFactory: [ActorRefFactory](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRefFactory.html#akka.actor.ActorRefFactory)): [ParserSettings](ParserSettings.html)Definition ClassesSettingsCompanion
9. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#default(implicitsystem:akka.actor.ClassicActorSystemProvider):T "Permalink") implicit  def default(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [ParserSettings](ParserSettings.html)Definition ClassesSettingsCompanion
10. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#forClient(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.settings.ParserSettings "Permalink")  def forClient(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [ParserSettings](ParserSettings.html)
13. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#forServer(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.settings.ParserSettings "Permalink")  def forServer(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [ParserSettings](ParserSettings.html)
14. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ConflictingContentTypeHeaderProcessingMode$.html "Permalink")  object [ConflictingContentTypeHeaderProcessingMode](ParserSettings$$ConflictingContentTypeHeaderProcessingMode$.html)
26. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$CookieParsingMode$.html "Permalink")  object [CookieParsingMode](ParserSettings$$CookieParsingMode$.html)
27. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity$.html "Permalink")  object [ErrorLoggingVerbosity](ParserSettings$$ErrorLoggingVerbosity$.html)
28. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode$.html "Permalink")  object [IllegalResponseHeaderNameProcessingMode](ParserSettings$$IllegalResponseHeaderNameProcessingMode$.html)
29. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode$.html "Permalink")  object [IllegalResponseHeaderValueProcessingMode](ParserSettings$$IllegalResponseHeaderValueProcessingMode$.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#apply(configOverrides:String):akka.http.scaladsl.settings.ParserSettings "Permalink")  def apply(configOverrides: String): [ParserSettings](ParserSettings.html)Create an instance of settings using the given String of config overrides to override
settings set in the class loader of this class (i.e.

Create an instance of settings using the given String of config overrides to override
settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
the class loader of this class).

Definition ClassesParserSettings → SettingsCompanionAnnotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use forServer or forClient instead
2. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#apply(config:com.typesafe.config.Config):akka.http.scaladsl.settings.ParserSettings "Permalink")  def apply(config: [Config](https://javadoc.io/page/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config)): [ParserSettings](ParserSettings.html)Creates an instance of settings using the given Config.

Creates an instance of settings using the given Config.

Definition ClassesParserSettings → SettingsCompanionAnnotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use forServer or forClient instead
3. [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from SettingsCompanion\[[ParserSettings](ParserSettings.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$ErrorLoggingVerbosity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ConflictingContentTypeHeaderProcessingMode$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$CookieParsingMode$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$CookieParsingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode.html
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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$.html)*