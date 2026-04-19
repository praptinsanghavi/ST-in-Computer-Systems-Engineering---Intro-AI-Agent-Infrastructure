---
description: Akka 2.10.17 - akka.stream.TLSProtocol.NegotiateNewSession
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:01:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/TLSProtocol$$NegotiateNewSession.html
title: Akka 2.10.17 - akka.stream.TLSProtocol.NegotiateNewSession
---

# Akka 2.10.17 - akka.stream.TLSProtocol.NegotiateNewSession

> **Summary:** Akka 2.10.17 - akka.stream.TLSProtocol.NegotiateNewSession

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/TLSProtocol$.html "Permalink")  object [TLSProtocol](TLSProtocol$.html)Definition Classes[stream](index.html)
- NegotiateNewSession
- [SendBytes](TLSProtocol$$SendBytes.html "Send the given akka.util.ByteString across the encrypted session to the peer.")
- [SessionBytes](TLSProtocol$$SessionBytes.html "Plaintext bytes emitted by the SSLEngine are received over one specific encryption session and this class bundles the bytes with the SSLSession object.")
- [SessionTruncated](TLSProtocol$$SessionTruncated.html "If the underlying transport is closed before the final TLS closure command is received from the peer then the SSLEngine will throw an SSLException that warns about possible truncation attacks.")
- [SslTlsInbound](TLSProtocol$$SslTlsInbound.html "This is the supertype of all messages that the SslTls operator emits on the plaintext side.")
- [SslTlsOutbound](TLSProtocol$$SslTlsOutbound.html "This is the supertype of all messages that the SslTls operator accepts on its plaintext side.")
[c](TLSProtocol$$NegotiateNewSession$.html "See companion object")[akka](../index.html).[stream](index.html).[TLSProtocol](TLSProtocol$.html)

# [NegotiateNewSession](TLSProtocol$$NegotiateNewSession$.html "See companion object")[**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html "Permalink")

### Companion [object NegotiateNewSession](TLSProtocol$$NegotiateNewSession$.html "See companion object")

#### case class NegotiateNewSession(enabledCipherSuites: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]], enabledProtocols: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]], clientAuth: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[TLSClientAuth](TLSClientAuth.html)], sslParameters: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[SSLParameters](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLParameters.html#javax.net.ssl.SSLParameters)]) extends [SslTlsOutbound](TLSProtocol$$SslTlsOutbound.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Initiate a new session negotiation. Any [SendBytes](TLSProtocol$$SendBytes.html) commands following
this one will be held back (i.e. back\-pressured) until the new handshake is
completed, meaning that the bytes following this message will be encrypted
according to the requirements outlined here.

Each of the values in this message is optional and will have the following
effect if provided:

\- `enabledCipherSuites` will be passed to `SSLEngine::setEnabledCipherSuites()`
\- `enabledProtocols` will be passed to `SSLEngine::setEnabledProtocols()`
\- `clientAuth` will be passed to `SSLEngine::setWantClientAuth()` or `SSLEngine.setNeedClientAuth()`, respectively
\- `sslParameters` will be passed to `SSLEngine::setSSLParameters()`

Please note that passing `clientAuth = None` means that no change is done
on client authentication requirements while `clientAuth = Some(ClientAuth.None)`
switches off client authentication.

Source[SslTlsOptions.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/SslTlsOptions.scala#L200)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [SslTlsOutbound](TLSProtocol$$SslTlsOutbound.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[NegotiateNewSession](TLSProtocol$$NegotiateNewSession$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NegotiateNewSession
2. Serializable
3. Product
4. Equals
5. SslTlsOutbound
6. AnyRef
7. Any
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

1. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#<init>(enabledCipherSuites:Option[Seq[String]],enabledProtocols:Option[Seq[String]],clientAuth:Option[akka.stream.TLSClientAuth],sslParameters:Option[javax.net.ssl.SSLParameters]):akka.stream.TLSProtocol.NegotiateNewSession "Permalink")  new NegotiateNewSession(enabledCipherSuites: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]], enabledProtocols: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]], clientAuth: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[TLSClientAuth](TLSClientAuth.html)], sslParameters: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[SSLParameters](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLParameters.html#javax.net.ssl.SSLParameters)])
### Value Members

1. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NegotiateNewSession toany2stringadd\[NegotiateNewSession] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NegotiateNewSession, B)ImplicitThis member is added by an implicit conversion from NegotiateNewSession toArrowAssoc\[NegotiateNewSession] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#clientAuth:Option[akka.stream.TLSClientAuth] "Permalink")  val clientAuth: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[TLSClientAuth](TLSClientAuth.html)]
8. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#enabledCipherSuites:Option[Seq[String]] "Permalink")  val enabledCipherSuites: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]]
10. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#enabledProtocols:Option[Seq[String]] "Permalink")  val enabledProtocols: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]]
11. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NegotiateNewSession) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NegotiateNewSessionImplicitThis member is added by an implicit conversion from NegotiateNewSession toEnsuring\[NegotiateNewSession] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NegotiateNewSession) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NegotiateNewSessionImplicitThis member is added by an implicit conversion from NegotiateNewSession toEnsuring\[NegotiateNewSession] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NegotiateNewSessionImplicitThis member is added by an implicit conversion from NegotiateNewSession toEnsuring\[NegotiateNewSession] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NegotiateNewSessionImplicitThis member is added by an implicit conversion from NegotiateNewSession toEnsuring\[NegotiateNewSession] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#sslParameters:Option[javax.net.ssl.SSLParameters] "Permalink")  val sslParameters: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[SSLParameters](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLParameters.html#javax.net.ssl.SSLParameters)]
23. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#withCipherSuites(s:String*):akka.stream.TLSProtocol.NegotiateNewSession "Permalink")  def withCipherSuites(s: String\*): NegotiateNewSessionJava API: Make a copy of this message with the given `enabledCipherSuites`.

Java API: Make a copy of this message with the given `enabledCipherSuites`.

Annotations@varargs()
28. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#withClientAuth(ca:akka.stream.TLSClientAuth):akka.stream.TLSProtocol.NegotiateNewSession "Permalink")  def withClientAuth(ca: [TLSClientAuth](TLSClientAuth.html)): NegotiateNewSessionJava API: Make a copy of this message with the given [TLSClientAuth](TLSClientAuth.html) setting.
29. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#withParameters(p:javax.net.ssl.SSLParameters):akka.stream.TLSProtocol.NegotiateNewSession "Permalink")  def withParameters(p: [SSLParameters](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLParameters.html#javax.net.ssl.SSLParameters)): NegotiateNewSessionJava API: Make a copy of this message with the given SSLParameters.
30. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#withProtocols(p:String*):akka.stream.TLSProtocol.NegotiateNewSession "Permalink")  def withProtocols(p: String\*): NegotiateNewSessionJava API: Make a copy of this message with the given `enabledProtocols`.

Java API: Make a copy of this message with the given `enabledProtocols`.

Annotations@varargs()
### Deprecated Value Members

1. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NegotiateNewSession toStringFormat\[NegotiateNewSession] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/TLSProtocol$$NegotiateNewSession.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NegotiateNewSession, B)ImplicitThis member is added by an implicit conversion from NegotiateNewSession toArrowAssoc\[NegotiateNewSession] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [SslTlsOutbound](TLSProtocol$$SslTlsOutbound.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNegotiateNewSession to any2stringadd\[NegotiateNewSession]

### Inherited by implicit conversion StringFormat fromNegotiateNewSession to StringFormat\[NegotiateNewSession]

### Inherited by implicit conversion Ensuring fromNegotiateNewSession to Ensuring\[NegotiateNewSession]

### Inherited by implicit conversion ArrowAssoc fromNegotiateNewSession to ArrowAssoc\[NegotiateNewSession]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/TLSClientAuth.html
- https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$NegotiateNewSession$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$NegotiateNewSession.html
- https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$SendBytes.html
- https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$SessionBytes.html
- https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$SessionTruncated$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$SessionTruncated.html
- https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$SslTlsInbound.html
- https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$SslTlsOutbound.html
- https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$NegotiateNewSession.html](https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$NegotiateNewSession.html)*