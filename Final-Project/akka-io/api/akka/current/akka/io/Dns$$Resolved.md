---
description: Akka 2.10.17 - akka.io.Dns.Resolved
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:26:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Dns$$Resolved.html
title: Akka 2.10.17 - akka.io.Dns.Resolved
---

# Akka 2.10.17 - akka.io.Dns.Resolved

> **Summary:** Akka 2.10.17 - akka.io.Dns.Resolved

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/Dns$.html "Permalink")  object [Dns](Dns$.html) extends [ExtensionId](../actor/ExtensionId.html)\[[DnsExt](DnsExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)Definition Classes[io](index.html)
- [Command](Dns$$Command.html)
- [Resolve](Dns$$Resolve.html)
- Resolved
[c](Dns$$Resolved$.html "See companion object")[akka](../index.html).[io](index.html).[Dns](Dns$.html)

# [Resolved](Dns$$Resolved$.html "See companion object")[**](../../akka/io/Dns$$Resolved.html "Permalink")

### Companion [object Resolved](Dns$$Resolved$.html "See companion object")

#### case class Resolved(name: String, ipv4: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Inet4Address](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet4Address.html#java.net.Inet4Address)], ipv6: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Inet6Address](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet6Address.html#java.net.Inet6Address)]) extends [Command](Dns$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use cached(DnsProtocol.Resolved)

Source[Dns.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Dns.scala#L72)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Command](Dns$$Command.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Resolved
2. Serializable
3. Product
4. Equals
5. Command
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

1. [**](../../akka/io/Dns$$Resolved.html#<init>(name:String,ipv4:Seq[java.net.Inet4Address],ipv6:Seq[java.net.Inet6Address]):akka.io.Dns.Resolved "Permalink")  new Resolved(name: String, ipv4: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Inet4Address](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet4Address.html#java.net.Inet4Address)], ipv6: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Inet6Address](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet6Address.html#java.net.Inet6Address)])
### Value Members

1. [**](../../akka/io/Dns$$Resolved.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Dns$$Resolved.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Dns$$Resolved.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Resolved toany2stringadd\[Resolved] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/Dns$$Resolved.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Resolved, B)ImplicitThis member is added by an implicit conversion from Resolved toArrowAssoc\[Resolved] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/Dns$$Resolved.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/Dns$$Resolved.html#addr:java.net.InetAddress "Permalink")  def addr: [InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)Annotations@throws("")
7. [**](../../akka/io/Dns$$Resolved.html#addrOption:Option[java.net.InetAddress] "Permalink")  val addrOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)]
8. [**](../../akka/io/Dns$$Resolved.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/io/Dns$$Resolved.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/io/Dns$$Resolved.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Resolved) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/io/Dns$$Resolved.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Resolved) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/io/Dns$$Resolved.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/io/Dns$$Resolved.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/io/Dns$$Resolved.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/io/Dns$$Resolved.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/io/Dns$$Resolved.html#ipv4:Seq[java.net.Inet4Address] "Permalink")  val ipv4: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Inet4Address](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet4Address.html#java.net.Inet4Address)]
17. [**](../../akka/io/Dns$$Resolved.html#ipv6:Seq[java.net.Inet6Address] "Permalink")  val ipv6: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Inet6Address](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Inet6Address.html#java.net.Inet6Address)]
18. [**](../../akka/io/Dns$$Resolved.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/io/Dns$$Resolved.html#name:String "Permalink")  val name: String
20. [**](../../akka/io/Dns$$Resolved.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/io/Dns$$Resolved.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/io/Dns$$Resolved.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/io/Dns$$Resolved.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
24. [**](../../akka/io/Dns$$Resolved.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/io/Dns$$Resolved.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../akka/io/Dns$$Resolved.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../akka/io/Dns$$Resolved.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/Dns$$Resolved.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/Dns$$Resolved.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Resolved toStringFormat\[Resolved] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/Dns$$Resolved.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Resolved, B)ImplicitThis member is added by an implicit conversion from Resolved toArrowAssoc\[Resolved] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Command](Dns$$Command.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromResolved to any2stringadd\[Resolved]

### Inherited by implicit conversion StringFormat fromResolved to StringFormat\[Resolved]

### Inherited by implicit conversion Ensuring fromResolved to Ensuring\[Resolved]

### Inherited by implicit conversion ArrowAssoc fromResolved to ArrowAssoc\[Resolved]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Command.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolve.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolved$.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolved.html
- https://doc.akka.io/api/akka/current/akka/io/Dns$.html
- https://doc.akka.io/api/akka/current/akka/io/DnsExt.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolved.html](https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolved.html)*