---
description: Akka 2.10.17 - akka.remote.artery.tcp.ConfigSSLEngineProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:50:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/artery/tcp/ConfigSSLEngineProvider.html
title: Akka 2.10.17 - akka.remote.artery.tcp.ConfigSSLEngineProvider
---

# Akka 2.10.17 - akka.remote.artery.tcp.ConfigSSLEngineProvider

> **Summary:** Akka 2.10.17 - akka.remote.artery.tcp.ConfigSSLEngineProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/remote/index.html "Permalink")  package [remote](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/remote/artery/index.html "Permalink")  package [artery](../index.html)Definition Classes[remote](../../index.html)
- [**](../../../../akka/remote/artery/tcp/index.html "Permalink")  package [tcp](index.html)Definition Classes[artery](../index.html)
- [**](../../../../akka/remote/artery/tcp/ssl/index.html "Permalink")  package [ssl](ssl/index.html)Definition Classes[tcp](index.html)
- ConfigSSLEngineProvider
- [SSLEngineProvider](SSLEngineProvider.html)
- [SSLEngineProviderSetup](SSLEngineProviderSetup.html "Setup for defining a SSLEngineProvider that is passed in when ActorSystem is created rather than creating one from configured class name.")
- [SslTransportException](SslTransportException.html)
c[akka](../../../index.html).[remote](../../index.html).[artery](../index.html).[tcp](index.html)

# ConfigSSLEngineProvider[**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html "Permalink")

### 

#### class ConfigSSLEngineProvider extends [SSLEngineProvider](SSLEngineProvider.html)

Config in akka.remote.artery.ssl.config\-ssl\-engine

Subclass may override protected methods to replace certain parts, such as key and trust manager.

Source[ConfigSSLEngineProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/artery/tcp/ConfigSSLEngineProvider.scala#L38)Linear Supertypes[SSLEngineProvider](SSLEngineProvider.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConfigSSLEngineProvider
2. SSLEngineProvider
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#<init>(system:akka.actor.ActorSystem):akka.remote.artery.tcp.ConfigSSLEngineProvider "Permalink")  new ConfigSSLEngineProvider(system: [ActorSystem](../../../actor/ActorSystem.html))
2. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#<init>(config:com.typesafe.config.Config,log:akka.event.MarkerLoggingAdapter):akka.remote.artery.tcp.ConfigSSLEngineProvider "Permalink")  new ConfigSSLEngineProvider(config: Config, log: [MarkerLoggingAdapter](../../../event/MarkerLoggingAdapter.html))
### Value Members

1. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ConfigSSLEngineProvider toany2stringadd\[ConfigSSLEngineProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ConfigSSLEngineProvider, B)ImplicitThis member is added by an implicit conversion from ConfigSSLEngineProvider toArrowAssoc\[ConfigSSLEngineProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#HostnameVerification:Boolean "Permalink")  val HostnameVerification: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
7. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#SSLEnabledAlgorithms:Set[String] "Permalink")  val SSLEnabledAlgorithms: Set\[String]
8. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#SSLKeyPassword:String "Permalink")  val SSLKeyPassword: String
9. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#SSLKeyStore:String "Permalink")  val SSLKeyStore: String
10. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#SSLKeyStorePassword:String "Permalink")  val SSLKeyStorePassword: String
11. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#SSLProtocol:String "Permalink")  val SSLProtocol: String
12. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#SSLRandomNumberGenerator:String "Permalink")  val SSLRandomNumberGenerator: String
13. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#SSLRequireMutualAuthentication:Boolean "Permalink")  val SSLRequireMutualAuthentication: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
14. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#SSLTrustStore:String "Permalink")  val SSLTrustStore: String
15. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#SSLTrustStorePassword:String "Permalink")  val SSLTrustStorePassword: String
16. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
17. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#config:com.typesafe.config.Config "Permalink")  val config: ConfigAttributesprotected
19. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#createClientSSLEngine(hostname:String,port:Int):javax.net.ssl.SSLEngine "Permalink")  def createClientSSLEngine(hostname: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)Definition ClassesConfigSSLEngineProvider → [SSLEngineProvider](SSLEngineProvider.html)
20. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#createSecureRandom():java.security.SecureRandom "Permalink")  def createSecureRandom(): [SecureRandom](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/SecureRandom.html#java.security.SecureRandom)
21. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#createServerSSLEngine(hostname:String,port:Int):javax.net.ssl.SSLEngine "Permalink")  def createServerSSLEngine(hostname: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)Definition ClassesConfigSSLEngineProvider → [SSLEngineProvider](SSLEngineProvider.html)
22. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ConfigSSLEngineProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConfigSSLEngineProviderImplicitThis member is added by an implicit conversion from ConfigSSLEngineProvider toEnsuring\[ConfigSSLEngineProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ConfigSSLEngineProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConfigSSLEngineProviderImplicitThis member is added by an implicit conversion from ConfigSSLEngineProvider toEnsuring\[ConfigSSLEngineProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConfigSSLEngineProviderImplicitThis member is added by an implicit conversion from ConfigSSLEngineProvider toEnsuring\[ConfigSSLEngineProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
25. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConfigSSLEngineProviderImplicitThis member is added by an implicit conversion from ConfigSSLEngineProvider toEnsuring\[ConfigSSLEngineProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
26. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
28. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
31. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#keyManagers:Array[javax.net.ssl.KeyManager] "Permalink")  def keyManagers: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[KeyManager](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/KeyManager.html#javax.net.ssl.KeyManager)]Subclass may override to customize `KeyManager`

Subclass may override to customize `KeyManager`

Attributesprotected
32. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#loadKeystore(filename:String,password:String):java.security.KeyStore "Permalink")  def loadKeystore(filename: String, password: String): [KeyStore](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/KeyStore.html#java.security.KeyStore)Subclass may override to customize loading of `KeyStore`

Subclass may override to customize loading of `KeyStore`

Attributesprotected
33. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#log:akka.event.MarkerLoggingAdapter "Permalink")  val log: [MarkerLoggingAdapter](../../../event/MarkerLoggingAdapter.html)Attributesprotected
34. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
35. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
38. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
39. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#trustManagers:Array[javax.net.ssl.TrustManager] "Permalink")  def trustManagers: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[TrustManager](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/TrustManager.html#javax.net.ssl.TrustManager)]Subclass may override to customize `TrustManager`

Subclass may override to customize `TrustManager`

Attributesprotected
40. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#verifyClientSession(hostname:String,session:javax.net.ssl.SSLSession):Option[Throwable] "Permalink")  def verifyClientSession(hostname: String, session: [SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable]Verification that will be called after every successful handshake
to verify additional session information.

Verification that will be called after every successful handshake
to verify additional session information. Return `None` if valid
otherwise `Some` with explaining cause.

Definition ClassesConfigSSLEngineProvider → [SSLEngineProvider](SSLEngineProvider.html)
41. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#verifyServerSession(hostname:String,session:javax.net.ssl.SSLSession):Option[Throwable] "Permalink")  def verifyServerSession(hostname: String, session: [SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable]Verification that will be called after every successful handshake
to verify additional session information.

Verification that will be called after every successful handshake
to verify additional session information. Return `None` if valid
otherwise `Some` with explaining cause.

Definition ClassesConfigSSLEngineProvider → [SSLEngineProvider](SSLEngineProvider.html)
42. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
43. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
44. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ConfigSSLEngineProvider toStringFormat\[ConfigSSLEngineProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ConfigSSLEngineProvider, B)ImplicitThis member is added by an implicit conversion from ConfigSSLEngineProvider toArrowAssoc\[ConfigSSLEngineProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [SSLEngineProvider](SSLEngineProvider.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromConfigSSLEngineProvider to any2stringadd\[ConfigSSLEngineProvider]

### Inherited by implicit conversion StringFormat fromConfigSSLEngineProvider to StringFormat\[ConfigSSLEngineProvider]

### Inherited by implicit conversion Ensuring fromConfigSSLEngineProvider to Ensuring\[ConfigSSLEngineProvider]

### Inherited by implicit conversion ArrowAssoc fromConfigSSLEngineProvider to ArrowAssoc\[ConfigSSLEngineProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/event/MarkerLoggingAdapter.html
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
*Source: [https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/ConfigSSLEngineProvider.html](https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/ConfigSSLEngineProvider.html)*