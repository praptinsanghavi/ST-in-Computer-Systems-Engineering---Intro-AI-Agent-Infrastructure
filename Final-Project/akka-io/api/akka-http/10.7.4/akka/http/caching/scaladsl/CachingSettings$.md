---
description: Akka HTTP 10.7.4 - akka.http.caching.scaladsl.CachingSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/caching/scaladsl/CachingSettings$.html
title: Akka HTTP 10.7.4 - akka.http.caching.scaladsl.CachingSettings
---

# Akka HTTP 10.7.4 - akka.http.caching.scaladsl.CachingSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.caching.scaladsl.CachingSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/caching/index.html "Permalink")  package [caching](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/caching/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[caching](../index.html)
- [Cache](Cache.html "API MAY CHANGE")
- [CachingSettings](CachingSettings.html "Public API but not intended for subclassing")
- [LfuCacheSettings](LfuCacheSettings.html "Public API but not intended for subclassing")
[o](CachingSettings.html "See companion class")[akka](../../../index.html).[http](../../index.html).[caching](../index.html).[scaladsl](index.html)

# [CachingSettings](CachingSettings.html "See companion class")[**](../../../../akka/http/caching/scaladsl/CachingSettings$.html "Permalink")

### Companion [class CachingSettings](CachingSettings.html "See companion class")

#### object CachingSettings extends SettingsCompanion\[[CachingSettings](CachingSettings.html)]

Source[CachingSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-caching/src/main/scala/akka/http/caching/scaladsl/CachingSettings.scala#L25)Linear SupertypesSettingsCompanion\[[CachingSettings](CachingSettings.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CachingSettings
2. SettingsCompanion
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#apply(configOverrides:String):akka.http.caching.scaladsl.CachingSettings "Permalink")  def apply(configOverrides: String): [CachingSettings](CachingSettings.html)Create an instance of settings using the given String of config overrides to override
settings set in the class loader of this class (i.e.

Create an instance of settings using the given String of config overrides to override
settings set in the class loader of this class (i.e. by application.conf or reference.conf files in
the class loader of this class).

Definition ClassesCachingSettings → SettingsCompanion
5. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#apply(config:com.typesafe.config.Config):akka.http.caching.scaladsl.CachingSettings "Permalink")  def apply(config: [Config](https://javadoc.io/page/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config)): [CachingSettings](CachingSettings.html)Creates an instance of settings using the given Config.

Creates an instance of settings using the given Config.

Definition ClassesCachingSettings → SettingsCompanion
6. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink") final  def apply(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CachingSettings](CachingSettings.html)Definition ClassesSettingsCompanion
7. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#apply(system:akka.actor.ActorSystem):T "Permalink") final  def apply(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [CachingSettings](CachingSettings.html)Creates an instance of settings using the configuration provided by the given ActorSystem.

Creates an instance of settings using the configuration provided by the given ActorSystem.

Definition ClassesSettingsCompanion
8. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#default(actorRefFactory:akka.actor.ActorRefFactory):T "Permalink")  def default(actorRefFactory: [ActorRefFactory](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRefFactory.html#akka.actor.ActorRefFactory)): [CachingSettings](CachingSettings.html)Definition ClassesSettingsCompanion
11. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#default(implicitsystem:akka.actor.ClassicActorSystemProvider):T "Permalink") implicit  def default(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CachingSettings](CachingSettings.html)Definition ClassesSettingsCompanion
12. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/caching/scaladsl/CachingSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from SettingsCompanion\[[CachingSettings](CachingSettings.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/CachingSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/CachingSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/LfuCacheSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/LfuCacheSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/CachingSettings$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/CachingSettings$.html)*