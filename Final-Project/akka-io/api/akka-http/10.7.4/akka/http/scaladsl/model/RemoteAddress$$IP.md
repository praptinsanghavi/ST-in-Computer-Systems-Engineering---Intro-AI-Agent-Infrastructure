---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.RemoteAddress.IP
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:30:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/RemoteAddress$$IP.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.RemoteAddress.IP
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.RemoteAddress.IP

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.RemoteAddress.IP

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/RemoteAddress$.html "Permalink")  object [RemoteAddress](RemoteAddress$.html)Definition Classes[model](index.html)
- IP
- [Unknown](RemoteAddress$$Unknown$.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[RemoteAddress](RemoteAddress$.html)

# IP[**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html "Permalink")

### 

#### final  case class IP(ip: [InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress), port: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)] \= None) extends [RemoteAddress](RemoteAddress.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[RemoteAddress.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/RemoteAddress.scala#L35)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [RemoteAddress](RemoteAddress.html), ValueRenderable, ToStringRenderable, Renderable, [javadsl.model.RemoteAddress](../../javadsl/model/RemoteAddress.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. IP
2. Serializable
3. Product
4. Equals
5. RemoteAddress
6. ValueRenderable
7. ToStringRenderable
8. Renderable
9. RemoteAddress
10. AnyRef
11. Any
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

1. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#<init>(ip:java.net.InetAddress,port:Option[Int]):akka.http.scaladsl.model.RemoteAddress.IP "Permalink")  new IP(ip: [InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress), port: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)] \= None)
### Value Members

1. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from IP toany2stringadd\[IP] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (IP, B)ImplicitThis member is added by an implicit conversion from IP toArrowAssoc\[IP] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (IP) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): IPImplicitThis member is added by an implicit conversion from IP toEnsuring\[IP] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (IP) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): IPImplicitThis member is added by an implicit conversion from IP toEnsuring\[IP] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): IPImplicitThis member is added by an implicit conversion from IP toEnsuring\[IP] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): IPImplicitThis member is added by an implicit conversion from IP toEnsuring\[IP] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#getAddress():java.util.Optional[java.net.InetAddress] "Permalink")  def getAddress(): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)]Java API

Java API

Definition Classes[RemoteAddress](RemoteAddress.html) → [RemoteAddress](../../javadsl/model/RemoteAddress.html)
14. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#getPort():Int "Permalink")  def getPort(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Java API

Java API

Definition Classes[RemoteAddress](RemoteAddress.html) → [RemoteAddress](../../javadsl/model/RemoteAddress.html)
16. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#ip:java.net.InetAddress "Permalink")  val ip: [InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)
17. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#isUnknown():Boolean "Permalink")  def isUnknown(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesIP → [RemoteAddress](RemoteAddress.html) → [RemoteAddress](../../javadsl/model/RemoteAddress.html)
19. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#port:Option[Int] "Permalink")  val port: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
23. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
24. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesIP → Renderable
25. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#toIP:Some[akka.http.scaladsl.model.RemoteAddress.IP] "Permalink")  def toIP: [Some](https://www.scala-lang.org/api/2.13.17/scala/Some.html#scala.Some)\[IP]Definition ClassesIP → [RemoteAddress](RemoteAddress.html)
27. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#toOption:Option[java.net.InetAddress] "Permalink")  def toOption: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)]Definition ClassesIP → [RemoteAddress](RemoteAddress.html)
28. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#toString():String "Permalink")  def toString(): StringDefinition ClassesToStringRenderable → AnyRef → Any
29. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#value:String "Permalink")  def value: StringDefinition ClassesValueRenderable
30. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from IP toStringFormat\[IP] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/RemoteAddress$$IP.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (IP, B)ImplicitThis member is added by an implicit conversion from IP toArrowAssoc\[IP] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [RemoteAddress](RemoteAddress.html)

### Inherited from ValueRenderable

### Inherited from ToStringRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.RemoteAddress](../../javadsl/model/RemoteAddress.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromIP to any2stringadd\[IP]

### Inherited by implicit conversion StringFormat fromIP to StringFormat\[IP]

### Inherited by implicit conversion Ensuring fromIP to Ensuring\[IP]

### Inherited by implicit conversion ArrowAssoc fromIP to ArrowAssoc\[IP]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RemoteAddress.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress$$IP.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress$$Unknown$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress$$IP.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RemoteAddress$$IP.html)*