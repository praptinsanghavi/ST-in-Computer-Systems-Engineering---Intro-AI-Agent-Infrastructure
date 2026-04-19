---
description: Akka 2.10.17 - akka.cluster.MemberStatus.Joining
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:23:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/MemberStatus$$Joining$.html
title: Akka 2.10.17 - akka.cluster.MemberStatus.Joining
---

# Akka 2.10.17 - akka.cluster.MemberStatus.Joining

> **Summary:** Akka 2.10.17 - akka.cluster.MemberStatus.Joining

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/MemberStatus$.html "Permalink")  object [MemberStatus](MemberStatus$.html)Definition Classes[cluster](index.html)
- [Down](MemberStatus$$Down$.html)
- [Exiting](MemberStatus$$Exiting$.html)
- Joining
- [Leaving](MemberStatus$$Leaving$.html)
- [PreparingForShutdown](MemberStatus$$PreparingForShutdown$.html)
- [ReadyForShutdown](MemberStatus$$ReadyForShutdown$.html)
- [Removed](MemberStatus$$Removed$.html)
- [Up](MemberStatus$$Up$.html)
- [WeaklyUp](MemberStatus$$WeaklyUp$.html)
o[akka](../index.html).[cluster](index.html).[MemberStatus](MemberStatus$.html)

# Joining[**](../../akka/cluster/MemberStatus$$Joining$.html "Permalink")

### 

#### case object Joining extends [MemberStatus](MemberStatus.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Annotations@SerialVersionUID() Source[Member.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/Member.scala#L239)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [MemberStatus](MemberStatus.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Joining
2. Serializable
3. Product
4. Equals
5. MemberStatus
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/cluster/MemberStatus$$Joining$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/MemberStatus$$Joining$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/MemberStatus$$Joining$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/cluster/MemberStatus$$Joining$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/cluster/MemberStatus$$Joining$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/cluster/MemberStatus$$Joining$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/cluster/MemberStatus$$Joining$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/cluster/MemberStatus$$Joining$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/cluster/MemberStatus$$Joining$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
10. [**](../../akka/cluster/MemberStatus$$Joining$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../akka/cluster/MemberStatus$$Joining$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/cluster/MemberStatus$$Joining$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/cluster/MemberStatus$$Joining$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
14. [**](../../akka/cluster/MemberStatus$$Joining$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
15. [**](../../akka/cluster/MemberStatus$$Joining$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../akka/cluster/MemberStatus$$Joining$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/cluster/MemberStatus$$Joining$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../akka/cluster/MemberStatus$$Joining$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/cluster/MemberStatus$$Joining$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [MemberStatus](MemberStatus.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Down$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Exiting$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Joining$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Leaving$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$PreparingForShutdown$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$ReadyForShutdown$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Removed$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Up$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$WeaklyUp$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Joining$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Joining$.html)*