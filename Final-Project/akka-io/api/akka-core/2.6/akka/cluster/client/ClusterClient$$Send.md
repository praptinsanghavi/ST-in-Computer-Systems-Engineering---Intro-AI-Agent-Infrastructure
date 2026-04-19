---
description: Akka 2.6.21 - akka.cluster.client.ClusterClient.Send
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:13:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/cluster/client/ClusterClient$$Send.html
title: Akka 2.6.21 - akka.cluster.client.ClusterClient.Send
---

# Akka 2.6.21 - akka.cluster.client.ClusterClient.Send

> **Summary:** Akka 2.6.21 - akka.cluster.client.ClusterClient.Send

## Content

Akka2\.6\.21 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/client/index.html "Permalink")  package [client](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/client/ClusterClient$.html "Permalink")  object [ClusterClient](ClusterClient$.html)Definition Classes[client](index.html)Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc
- [Publish](ClusterClient$$Publish.html)
- Send
- [SendToAll](ClusterClient$$SendToAll.html)
c[akka](../../index.html).[cluster](../index.html).[client](index.html).[ClusterClient](ClusterClient$.html)

# Send[**](../../../akka/cluster/client/ClusterClient$$Send.html "Permalink")

### 

#### final  case class Send(path: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), localAffinity: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)) extends [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product) with Serializable

Annotations@SerialVersionUID() @deprecated Deprecated*(Since version 2\.6\.0\)* Use Akka gRPC instead, see https://doc.akka.io/libraries/akka\-core/2\.6/cluster\-client.html\#migration\-to\-akka\-grpc

Source[ClusterClient.scala](https://github.com/akka/akka/tree/v2.6.21//akka-cluster-tools/src/main/scala/akka/cluster/client/ClusterClient.scala#L302)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.8/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Send
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
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

1. [**](../../../akka/cluster/client/ClusterClient$$Send.html#<init>(path:String,msg:Any):akka.cluster.client.ClusterClient.Send "Permalink")  new Send(path: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any))Convenience constructor with `localAffinity` false
2. [**](../../../akka/cluster/client/ClusterClient$$Send.html#<init>(path:String,msg:Any,localAffinity:Boolean):akka.cluster.client.ClusterClient.Send "Permalink")  new Send(path: String, msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any), localAffinity: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean))
### Value Members

1. [**](../../../akka/cluster/client/ClusterClient$$Send.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/client/ClusterClient$$Send.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/client/ClusterClient$$Send.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Send toany2stringadd\[Send] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/client/ClusterClient$$Send.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Send, B)ImplicitThis member is added by an implicit conversion from Send toArrowAssoc\[Send] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/client/ClusterClient$$Send.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/client/ClusterClient$$Send.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/client/ClusterClient$$Send.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
8. [**](../../../akka/cluster/client/ClusterClient$$Send.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Send) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): SendImplicitThis member is added by an implicit conversion from Send toEnsuring\[Send] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/client/ClusterClient$$Send.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Send) \=\> [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): SendImplicitThis member is added by an implicit conversion from Send toEnsuring\[Send] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/client/ClusterClient$$Send.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)): SendImplicitThis member is added by an implicit conversion from Send toEnsuring\[Send] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/client/ClusterClient$$Send.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)): SendImplicitThis member is added by an implicit conversion from Send toEnsuring\[Send] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/client/ClusterClient$$Send.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/client/ClusterClient$$Send.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
14. [**](../../../akka/cluster/client/ClusterClient$$Send.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/cluster/client/ClusterClient$$Send.html#localAffinity:Boolean "Permalink")  val localAffinity: [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)
16. [**](../../../akka/cluster/client/ClusterClient$$Send.html#msg:Any "Permalink")  val msg: [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)
17. [**](../../../akka/cluster/client/ClusterClient$$Send.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.8/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/client/ClusterClient$$Send.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
19. [**](../../../akka/cluster/client/ClusterClient$$Send.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
20. [**](../../../akka/cluster/client/ClusterClient$$Send.html#path:String "Permalink")  val path: String
21. [**](../../../akka/cluster/client/ClusterClient$$Send.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../../akka/cluster/client/ClusterClient$$Send.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/cluster/client/ClusterClient$$Send.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.8/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/cluster/client/ClusterClient$$Send.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.8/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/cluster/client/ClusterClient$$Send.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/client/ClusterClient$$Send.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.8/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated
2. [**](../../../akka/cluster/client/ClusterClient$$Send.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Send toStringFormat\[Send] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/client/ClusterClient$$Send.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Send, B)ImplicitThis member is added by an implicit conversion from Send toArrowAssoc\[Send] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.8/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.8/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.8/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.8/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSend to any2stringadd\[Send]

### Inherited by implicit conversion StringFormat fromSend to StringFormat\[Send]

### Inherited by implicit conversion Ensuring fromSend to Ensuring\[Send]

### Inherited by implicit conversion ArrowAssoc fromSend to ArrowAssoc\[Send]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$$Publish.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$$Send.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$$SendToAll.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.6/akka/index.html
- https://doc.akka.io/api/akka-core/2.6/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$$Send.html](https://doc.akka.io/api/akka-core/2.6/akka/cluster/client/ClusterClient$$Send.html)*