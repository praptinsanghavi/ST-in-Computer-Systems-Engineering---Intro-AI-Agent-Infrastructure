---
description: Akka 2.10.17 - akka.stream.TLSProtocol.SessionBytes
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:34:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/TLSProtocol$$SessionBytes.html
title: Akka 2.10.17 - akka.stream.TLSProtocol.SessionBytes
---

# Akka 2.10.17 - akka.stream.TLSProtocol.SessionBytes

> **Summary:** Akka 2.10.17 - akka.stream.TLSProtocol.SessionBytes

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/TLSProtocol$.html "Permalink")  object [TLSProtocol](TLSProtocol$.html)Definition Classes[stream](index.html)
- [NegotiateNewSession](TLSProtocol$$NegotiateNewSession.html "Initiate a new session negotiation.")
- [SendBytes](TLSProtocol$$SendBytes.html "Send the given akka.util.ByteString across the encrypted session to the peer.")
- SessionBytes
- [SessionTruncated](TLSProtocol$$SessionTruncated.html "If the underlying transport is closed before the final TLS closure command is received from the peer then the SSLEngine will throw an SSLException that warns about possible truncation attacks.")
- [SslTlsInbound](TLSProtocol$$SslTlsInbound.html "This is the supertype of all messages that the SslTls operator emits on the plaintext side.")
- [SslTlsOutbound](TLSProtocol$$SslTlsOutbound.html "This is the supertype of all messages that the SslTls operator accepts on its plaintext side.")
c[akka](../index.html).[stream](index.html).[TLSProtocol](TLSProtocol$.html)

# SessionBytes[**](../../akka/stream/TLSProtocol$$SessionBytes.html "Permalink")

### 

#### final  case class SessionBytes(session: [SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession), bytes: [ByteString](../util/ByteString.html)) extends [SslTlsInbound](TLSProtocol$$SslTlsInbound.html) with [ScalaSessionAPI](scaladsl/ScalaSessionAPI.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Plaintext bytes emitted by the SSLEngine are received over one specific
encryption session and this class bundles the bytes with the SSLSession
object. When the session changes due to renegotiation (which can be
initiated by either party) the new session value will not compare equal to
the previous one.

The Java API for getting session information is given by the SSLSession object,
the Scala API adapters are offered below.

Source[SslTlsOptions.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/SslTlsOptions.scala#L172)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [ScalaSessionAPI](scaladsl/ScalaSessionAPI.html), [SslTlsInbound](TLSProtocol$$SslTlsInbound.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SessionBytes
2. Serializable
3. Product
4. Equals
5. ScalaSessionAPI
6. SslTlsInbound
7. AnyRef
8. Any
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

1. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#<init>(session:javax.net.ssl.SSLSession,bytes:akka.util.ByteString):akka.stream.TLSProtocol.SessionBytes "Permalink")  new SessionBytes(session: [SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession), bytes: [ByteString](../util/ByteString.html))
### Value Members

1. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/TLSProtocol$$SessionBytes.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SessionBytes toany2stringadd\[SessionBytes] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SessionBytes, B)ImplicitThis member is added by an implicit conversion from SessionBytes toArrowAssoc\[SessionBytes] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#bytes:akka.util.ByteString "Permalink")  val bytes: [ByteString](../util/ByteString.html)
8. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SessionBytes) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SessionBytesImplicitThis member is added by an implicit conversion from SessionBytes toEnsuring\[SessionBytes] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SessionBytes) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SessionBytesImplicitThis member is added by an implicit conversion from SessionBytes toEnsuring\[SessionBytes] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SessionBytesImplicitThis member is added by an implicit conversion from SessionBytes toEnsuring\[SessionBytes] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SessionBytesImplicitThis member is added by an implicit conversion from SessionBytes toEnsuring\[SessionBytes] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#localCertificates:List[java.security.cert.Certificate] "Permalink")  def localCertificates: List\[[Certificate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/cert/Certificate.html#java.security.cert.Certificate)]Scala API: Extract the certificates that were actually used by this
engine during this session’s negotiation.

Scala API: Extract the certificates that were actually used by this
engine during this session’s negotiation. The list is empty if no
certificates were used.

Definition Classes[ScalaSessionAPI](scaladsl/ScalaSessionAPI.html)
17. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#localPrincipal:Option[java.security.Principal] "Permalink")  def localPrincipal: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Principal](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/Principal.html#java.security.Principal)]Scala API: Extract the Principal that was actually used by this engine
during this session’s negotiation.

Scala API: Extract the Principal that was actually used by this engine
during this session’s negotiation.

Definition Classes[ScalaSessionAPI](scaladsl/ScalaSessionAPI.html)
18. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#peerCertificates:List[java.security.cert.Certificate] "Permalink")  def peerCertificates: List\[[Certificate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/cert/Certificate.html#java.security.cert.Certificate)]Scala API: Extract the certificates that were used by the peer engine
during this session’s negotiation.

Scala API: Extract the certificates that were used by the peer engine
during this session’s negotiation. The list is empty if no certificates
were used.

Definition Classes[ScalaSessionAPI](scaladsl/ScalaSessionAPI.html)
22. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#peerPrincipal:Option[java.security.Principal] "Permalink")  def peerPrincipal: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Principal](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/Principal.html#java.security.Principal)]Scala API: Extract the Principal that the peer engine presented during
this session’s negotiation.

Scala API: Extract the Principal that the peer engine presented during
this session’s negotiation.

Definition Classes[ScalaSessionAPI](scaladsl/ScalaSessionAPI.html)
23. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
24. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#session:javax.net.ssl.SSLSession "Permalink")  val session: [SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession)The underlying [javax.net.ssl.SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html).

The underlying [javax.net.ssl.SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html).

Definition ClassesSessionBytes → [ScalaSessionAPI](scaladsl/ScalaSessionAPI.html)
25. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SessionBytes toStringFormat\[SessionBytes] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/TLSProtocol$$SessionBytes.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SessionBytes, B)ImplicitThis member is added by an implicit conversion from SessionBytes toArrowAssoc\[SessionBytes] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [ScalaSessionAPI](scaladsl/ScalaSessionAPI.html)

### Inherited from [SslTlsInbound](TLSProtocol$$SslTlsInbound.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSessionBytes to any2stringadd\[SessionBytes]

### Inherited by implicit conversion StringFormat fromSessionBytes to StringFormat\[SessionBytes]

### Inherited by implicit conversion Ensuring fromSessionBytes to Ensuring\[SessionBytes]

### Inherited by implicit conversion ArrowAssoc fromSessionBytes to ArrowAssoc\[SessionBytes]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$NegotiateNewSession$.html
- https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$NegotiateNewSession.html
- https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$SendBytes.html
- https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$SessionBytes.html
- https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$SessionTruncated$.html
- https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$SessionTruncated.html
- https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$SslTlsInbound.html
- https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$SslTlsOutbound.html
- https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/ScalaSessionAPI.html
- https://doc.akka.io/api/akka/current/akka/util/ByteString.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$SessionBytes.html](https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$SessionBytes.html)*