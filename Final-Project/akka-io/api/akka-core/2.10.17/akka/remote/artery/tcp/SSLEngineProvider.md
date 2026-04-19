---
description: Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:26:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/artery/tcp/SSLEngineProvider.html
title: Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProvider
---

# Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProvider

> **Summary:** Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/remote/index.html "Permalink")  package [remote](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/remote/artery/index.html "Permalink")  package [artery](../index.html)Definition Classes[remote](../../index.html)
- [**](../../../../akka/remote/artery/tcp/index.html "Permalink")  package [tcp](index.html)Definition Classes[artery](../index.html)
- [**](../../../../akka/remote/artery/tcp/ssl/index.html "Permalink")  package [ssl](ssl/index.html)Definition Classes[tcp](index.html)
- [ConfigSSLEngineProvider](ConfigSSLEngineProvider.html "Config in akka.remote.artery.ssl.config-ssl-engine")
- SSLEngineProvider
- [SSLEngineProviderSetup](SSLEngineProviderSetup.html "Setup for defining a SSLEngineProvider that is passed in when ActorSystem is created rather than creating one from configured class name.")
- [SslTransportException](SslTransportException.html)
t[akka](../../../index.html).[remote](../../index.html).[artery](../index.html).[tcp](index.html)

# SSLEngineProvider[**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html "Permalink")

### 

#### trait SSLEngineProvider extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[SSLEngineProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/artery/tcp/SSLEngineProvider.scala#L14)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ConfigSSLEngineProvider](ConfigSSLEngineProvider.html), [RotatingKeysSSLEngineProvider](ssl/RotatingKeysSSLEngineProvider.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SSLEngineProvider
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#createClientSSLEngine(hostname:String,port:Int):javax.net.ssl.SSLEngine "Permalink") abstract  def createClientSSLEngine(hostname: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)
2. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#createServerSSLEngine(hostname:String,port:Int):javax.net.ssl.SSLEngine "Permalink") abstract  def createServerSSLEngine(hostname: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)
3. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#verifyClientSession(hostname:String,session:javax.net.ssl.SSLSession):Option[Throwable] "Permalink") abstract  def verifyClientSession(hostname: String, session: [SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable]Verification that will be called after every successful handshake
to verify additional session information.

Verification that will be called after every successful handshake
to verify additional session information. Return `None` if valid
otherwise `Some` with explaining cause.
4. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#verifyServerSession(hostname:String,session:javax.net.ssl.SSLSession):Option[Throwable] "Permalink") abstract  def verifyServerSession(hostname: String, session: [SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable]Verification that will be called after every successful handshake
to verify additional session information.

Verification that will be called after every successful handshake
to verify additional session information. Return `None` if valid
otherwise `Some` with explaining cause.
### Concrete Value Members

1. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SSLEngineProvider toany2stringadd\[SSLEngineProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SSLEngineProvider, B)ImplicitThis member is added by an implicit conversion from SSLEngineProvider toArrowAssoc\[SSLEngineProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SSLEngineProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SSLEngineProviderImplicitThis member is added by an implicit conversion from SSLEngineProvider toEnsuring\[SSLEngineProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SSLEngineProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SSLEngineProviderImplicitThis member is added by an implicit conversion from SSLEngineProvider toEnsuring\[SSLEngineProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SSLEngineProviderImplicitThis member is added by an implicit conversion from SSLEngineProvider toEnsuring\[SSLEngineProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SSLEngineProviderImplicitThis member is added by an implicit conversion from SSLEngineProvider toEnsuring\[SSLEngineProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SSLEngineProvider toStringFormat\[SSLEngineProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SSLEngineProvider, B)ImplicitThis member is added by an implicit conversion from SSLEngineProvider toArrowAssoc\[SSLEngineProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSSLEngineProvider to any2stringadd\[SSLEngineProvider]

### Inherited by implicit conversion StringFormat fromSSLEngineProvider to StringFormat\[SSLEngineProvider]

### Inherited by implicit conversion Ensuring fromSSLEngineProvider to Ensuring\[SSLEngineProvider]

### Inherited by implicit conversion ArrowAssoc fromSSLEngineProvider to ArrowAssoc\[SSLEngineProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/ConfigSSLEngineProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProviderSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProviderSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SslTransportException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/ssl/RotatingKeysSSLEngineProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/ssl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProvider.html](https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProvider.html)*