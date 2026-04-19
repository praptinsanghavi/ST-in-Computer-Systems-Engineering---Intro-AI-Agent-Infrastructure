---
description: Akka 2.10.17 - akka.io.Dns.Resolve
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:26:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/Dns$$Resolve.html
title: Akka 2.10.17 - akka.io.Dns.Resolve
---

# Akka 2.10.17 - akka.io.Dns.Resolve

> **Summary:** Akka 2.10.17 - akka.io.Dns.Resolve

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/Dns$.html "Permalink")  object [Dns](Dns$.html) extends [ExtensionId](../actor/ExtensionId.html)\[[DnsExt](DnsExt.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)Definition Classes[io](index.html)
- [Command](Dns$$Command.html)
- Resolve
- [Resolved](Dns$$Resolved.html)
c[akka](../index.html).[io](index.html).[Dns](Dns$.html)

# Resolve[**](../../akka/io/Dns$$Resolve.html "Permalink")

### 

#### case class Resolve(name: String) extends [Command](Dns$$Command.html) with [ConsistentHashable](../routing/ConsistentHashingRouter$$ConsistentHashable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use cached(DnsProtocol.Resolve)

Source[Dns.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/Dns.scala#L67)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [ConsistentHashable](../routing/ConsistentHashingRouter$$ConsistentHashable.html), [Command](Dns$$Command.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Resolve
2. Serializable
3. Product
4. Equals
5. ConsistentHashable
6. Command
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

1. [**](../../akka/io/Dns$$Resolve.html#<init>(name:String):akka.io.Dns.Resolve "Permalink")  new Resolve(name: String)
### Value Members

1. [**](../../akka/io/Dns$$Resolve.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/Dns$$Resolve.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/Dns$$Resolve.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Resolve toany2stringadd\[Resolve] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/Dns$$Resolve.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Resolve, B)ImplicitThis member is added by an implicit conversion from Resolve toArrowAssoc\[Resolve] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/Dns$$Resolve.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/Dns$$Resolve.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/io/Dns$$Resolve.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/io/Dns$$Resolve.html#consistentHashKey:String "Permalink")  def consistentHashKey: StringDefinition ClassesResolve → [ConsistentHashable](../routing/ConsistentHashingRouter$$ConsistentHashable.html)
9. [**](../../akka/io/Dns$$Resolve.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Resolve) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResolveImplicitThis member is added by an implicit conversion from Resolve toEnsuring\[Resolve] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/io/Dns$$Resolve.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Resolve) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResolveImplicitThis member is added by an implicit conversion from Resolve toEnsuring\[Resolve] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/io/Dns$$Resolve.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResolveImplicitThis member is added by an implicit conversion from Resolve toEnsuring\[Resolve] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/io/Dns$$Resolve.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResolveImplicitThis member is added by an implicit conversion from Resolve toEnsuring\[Resolve] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/io/Dns$$Resolve.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/io/Dns$$Resolve.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/io/Dns$$Resolve.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/io/Dns$$Resolve.html#name:String "Permalink")  val name: String
17. [**](../../akka/io/Dns$$Resolve.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/io/Dns$$Resolve.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/io/Dns$$Resolve.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/Dns$$Resolve.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../akka/io/Dns$$Resolve.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/io/Dns$$Resolve.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/io/Dns$$Resolve.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/io/Dns$$Resolve.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/Dns$$Resolve.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/Dns$$Resolve.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Resolve toStringFormat\[Resolve] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/Dns$$Resolve.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Resolve, B)ImplicitThis member is added by an implicit conversion from Resolve toArrowAssoc\[Resolve] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [ConsistentHashable](../routing/ConsistentHashingRouter$$ConsistentHashable.html)

### Inherited from [Command](Dns$$Command.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromResolve to any2stringadd\[Resolve]

### Inherited by implicit conversion StringFormat fromResolve to StringFormat\[Resolve]

### Inherited by implicit conversion Ensuring fromResolve to Ensuring\[Resolve]

### Inherited by implicit conversion ArrowAssoc fromResolve to ArrowAssoc\[Resolve]

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
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolve.html](https://doc.akka.io/api/akka/current/akka/io/Dns$$Resolve.html)*