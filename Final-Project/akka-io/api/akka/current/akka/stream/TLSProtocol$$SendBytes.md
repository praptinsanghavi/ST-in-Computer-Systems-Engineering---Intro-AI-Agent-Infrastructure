---
description: Akka 2.10.17 - akka.stream.TLSProtocol.SendBytes
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:34:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/TLSProtocol$$SendBytes.html
title: Akka 2.10.17 - akka.stream.TLSProtocol.SendBytes
---

# Akka 2.10.17 - akka.stream.TLSProtocol.SendBytes

> **Summary:** Akka 2.10.17 - akka.stream.TLSProtocol.SendBytes

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/TLSProtocol$.html "Permalink")  object [TLSProtocol](TLSProtocol$.html)Definition Classes[stream](index.html)
- [NegotiateNewSession](TLSProtocol$$NegotiateNewSession.html "Initiate a new session negotiation.")
- SendBytes
- [SessionBytes](TLSProtocol$$SessionBytes.html "Plaintext bytes emitted by the SSLEngine are received over one specific encryption session and this class bundles the bytes with the SSLSession object.")
- [SessionTruncated](TLSProtocol$$SessionTruncated.html "If the underlying transport is closed before the final TLS closure command is received from the peer then the SSLEngine will throw an SSLException that warns about possible truncation attacks.")
- [SslTlsInbound](TLSProtocol$$SslTlsInbound.html "This is the supertype of all messages that the SslTls operator emits on the plaintext side.")
- [SslTlsOutbound](TLSProtocol$$SslTlsOutbound.html "This is the supertype of all messages that the SslTls operator accepts on its plaintext side.")
c[akka](../index.html).[stream](index.html).[TLSProtocol](TLSProtocol$.html)

# SendBytes[**](../../akka/stream/TLSProtocol$$SendBytes.html "Permalink")

### 

#### final  case class SendBytes(bytes: [ByteString](../util/ByteString.html)) extends [SslTlsOutbound](TLSProtocol$$SslTlsOutbound.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Send the given [akka.util.ByteString](../util/ByteString.html) across the encrypted session to the
peer.

Source[SslTlsOptions.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/SslTlsOptions.scala#L250)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [SslTlsOutbound](TLSProtocol$$SslTlsOutbound.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SendBytes
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

1. [**](../../akka/stream/TLSProtocol$$SendBytes.html#<init>(bytes:akka.util.ByteString):akka.stream.TLSProtocol.SendBytes "Permalink")  new SendBytes(bytes: [ByteString](../util/ByteString.html))
### Value Members

1. [**](../../akka/stream/TLSProtocol$$SendBytes.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/TLSProtocol$$SendBytes.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/TLSProtocol$$SendBytes.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SendBytes toany2stringadd\[SendBytes] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/TLSProtocol$$SendBytes.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SendBytes, B)ImplicitThis member is added by an implicit conversion from SendBytes toArrowAssoc\[SendBytes] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/TLSProtocol$$SendBytes.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/TLSProtocol$$SendBytes.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/TLSProtocol$$SendBytes.html#bytes:akka.util.ByteString "Permalink")  val bytes: [ByteString](../util/ByteString.html)
8. [**](../../akka/stream/TLSProtocol$$SendBytes.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/stream/TLSProtocol$$SendBytes.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SendBytes) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SendBytesImplicitThis member is added by an implicit conversion from SendBytes toEnsuring\[SendBytes] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/TLSProtocol$$SendBytes.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SendBytes) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SendBytesImplicitThis member is added by an implicit conversion from SendBytes toEnsuring\[SendBytes] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/TLSProtocol$$SendBytes.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SendBytesImplicitThis member is added by an implicit conversion from SendBytes toEnsuring\[SendBytes] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/TLSProtocol$$SendBytes.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SendBytesImplicitThis member is added by an implicit conversion from SendBytes toEnsuring\[SendBytes] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/stream/TLSProtocol$$SendBytes.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/stream/TLSProtocol$$SendBytes.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/stream/TLSProtocol$$SendBytes.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/stream/TLSProtocol$$SendBytes.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/stream/TLSProtocol$$SendBytes.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/stream/TLSProtocol$$SendBytes.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/stream/TLSProtocol$$SendBytes.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../akka/stream/TLSProtocol$$SendBytes.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/stream/TLSProtocol$$SendBytes.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/stream/TLSProtocol$$SendBytes.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/stream/TLSProtocol$$SendBytes.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/TLSProtocol$$SendBytes.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/TLSProtocol$$SendBytes.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SendBytes toStringFormat\[SendBytes] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/TLSProtocol$$SendBytes.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SendBytes, B)ImplicitThis member is added by an implicit conversion from SendBytes toArrowAssoc\[SendBytes] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [SslTlsOutbound](TLSProtocol$$SslTlsOutbound.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSendBytes to any2stringadd\[SendBytes]

### Inherited by implicit conversion StringFormat fromSendBytes to StringFormat\[SendBytes]

### Inherited by implicit conversion Ensuring fromSendBytes to Ensuring\[SendBytes]

### Inherited by implicit conversion ArrowAssoc fromSendBytes to ArrowAssoc\[SendBytes]

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
- https://doc.akka.io/api/akka/current/akka/util/ByteString.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$SendBytes.html](https://doc.akka.io/api/akka/current/akka/stream/TLSProtocol$$SendBytes.html)*