---
description: Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProviderSetup
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:50:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/artery/tcp/SSLEngineProviderSetup$.html
title: Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProviderSetup
---

# Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProviderSetup

> **Summary:** Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProviderSetup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/remote/index.html "Permalink")  package [remote](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/remote/artery/index.html "Permalink")  package [artery](../index.html)Definition Classes[remote](../../index.html)
- [**](../../../../akka/remote/artery/tcp/index.html "Permalink")  package [tcp](index.html)Definition Classes[artery](../index.html)
- [**](../../../../akka/remote/artery/tcp/ssl/index.html "Permalink")  package [ssl](ssl/index.html)Definition Classes[tcp](index.html)
- [ConfigSSLEngineProvider](ConfigSSLEngineProvider.html "Config in akka.remote.artery.ssl.config-ssl-engine")
- [SSLEngineProvider](SSLEngineProvider.html)
- [SSLEngineProviderSetup](SSLEngineProviderSetup.html "Setup for defining a SSLEngineProvider that is passed in when ActorSystem is created rather than creating one from configured class name.")
- [SslTransportException](SslTransportException.html)
[o](SSLEngineProviderSetup.html "See companion class")[akka](../../../index.html).[remote](../../index.html).[artery](../index.html).[tcp](index.html)

# [SSLEngineProviderSetup](SSLEngineProviderSetup.html "See companion class")[**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html "Permalink")

### Companion [class SSLEngineProviderSetup](SSLEngineProviderSetup.html "See companion class")

#### object SSLEngineProviderSetup

Source[SSLEngineProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/artery/tcp/SSLEngineProvider.scala#L38)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SSLEngineProviderSetup
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#apply(sslEngineProvider:akka.actor.ExtendedActorSystem=>akka.remote.artery.tcp.SSLEngineProvider):akka.remote.artery.tcp.SSLEngineProviderSetup "Permalink")  def apply(sslEngineProvider: ([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html)) \=\> [SSLEngineProvider](SSLEngineProvider.html)): [SSLEngineProviderSetup](SSLEngineProviderSetup.html)Scala API: factory for defining a `SSLEngineProvider` that is passed in when ActorSystem
is created rather than creating one from configured class name.
5. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#create(sslEngineProvider:java.util.function.Function[akka.actor.ExtendedActorSystem,akka.remote.artery.tcp.SSLEngineProvider]):akka.remote.artery.tcp.SSLEngineProviderSetup "Permalink")  def create(sslEngineProvider: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html), [SSLEngineProvider](SSLEngineProvider.html)]): [SSLEngineProviderSetup](SSLEngineProviderSetup.html)Java API: factory for defining a `SSLEngineProvider` that is passed in when ActorSystem
is created rather than creating one from configured class name.
8. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/ConfigSSLEngineProvider.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/SSLEngineProvider.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/SSLEngineProviderSetup$.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/SSLEngineProviderSetup.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/SslTransportException.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/ssl/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/SSLEngineProviderSetup$.html](https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/SSLEngineProviderSetup$.html)*