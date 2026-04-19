---
description: Akka 2.10.17 - akka.stream.TLSProtocol.SslTlsOutbound
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:56:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/TLSProtocol$$SslTlsOutbound.html
title: Akka 2.10.17 - akka.stream.TLSProtocol.SslTlsOutbound
---

# Akka 2.10.17 - akka.stream.TLSProtocol.SslTlsOutbound

> **Summary:** Akka 2.10.17 - akka.stream.TLSProtocol.SslTlsOutbound

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/TLSProtocol$.html "Permalink")  object [TLSProtocol](TLSProtocol$.html)Definition Classes[stream](index.html)
- [NegotiateNewSession](TLSProtocol$$NegotiateNewSession.html "Initiate a new session negotiation.")
- [SendBytes](TLSProtocol$$SendBytes.html "Send the given akka.util.ByteString across the encrypted session to the peer.")
- [SessionBytes](TLSProtocol$$SessionBytes.html "Plaintext bytes emitted by the SSLEngine are received over one specific encryption session and this class bundles the bytes with the SSLSession object.")
- [SessionTruncated](TLSProtocol$$SessionTruncated.html "If the underlying transport is closed before the final TLS closure command is received from the peer then the SSLEngine will throw an SSLException that warns about possible truncation attacks.")
- [SslTlsInbound](TLSProtocol$$SslTlsInbound.html "This is the supertype of all messages that the SslTls operator emits on the plaintext side.")
- SslTlsOutbound
t[akka](../index.html).[stream](index.html).[TLSProtocol](TLSProtocol$.html)

# SslTlsOutbound[**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html "Permalink")

### 

#### sealed  trait SslTlsOutbound extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

This is the supertype of all messages that the SslTls operator accepts on its
plaintext side.

Source[SslTlsOptions.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/SslTlsOptions.scala#L180)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[NegotiateNewSession](TLSProtocol$$NegotiateNewSession.html), [NegotiateNewSession](TLSProtocol$$NegotiateNewSession$.html), [SendBytes](TLSProtocol$$SendBytes.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SslTlsOutbound
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
### Value Members

1. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SslTlsOutbound toany2stringadd\[SslTlsOutbound] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SslTlsOutbound, B)ImplicitThis member is added by an implicit conversion from SslTlsOutbound toArrowAssoc\[SslTlsOutbound] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SslTlsOutbound) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SslTlsOutboundImplicitThis member is added by an implicit conversion from SslTlsOutbound toEnsuring\[SslTlsOutbound] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SslTlsOutbound) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SslTlsOutboundImplicitThis member is added by an implicit conversion from SslTlsOutbound toEnsuring\[SslTlsOutbound] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SslTlsOutboundImplicitThis member is added by an implicit conversion from SslTlsOutbound toEnsuring\[SslTlsOutbound] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SslTlsOutboundImplicitThis member is added by an implicit conversion from SslTlsOutbound toEnsuring\[SslTlsOutbound] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SslTlsOutbound toStringFormat\[SslTlsOutbound] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/stream/TLSProtocol$$SslTlsOutbound.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SslTlsOutbound, B)ImplicitThis member is added by an implicit conversion from SslTlsOutbound toArrowAssoc\[SslTlsOutbound] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSslTlsOutbound to any2stringadd\[SslTlsOutbound]

### Inherited by implicit conversion StringFormat fromSslTlsOutbound to StringFormat\[SslTlsOutbound]

### Inherited by implicit conversion Ensuring fromSslTlsOutbound to Ensuring\[SslTlsOutbound]

### Inherited by implicit conversion ArrowAssoc fromSslTlsOutbound to ArrowAssoc\[SslTlsOutbound]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/index.html
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
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$SslTlsOutbound.html](https://doc.akka.io/api/akka/2.10/akka/stream/TLSProtocol$$SslTlsOutbound.html)*