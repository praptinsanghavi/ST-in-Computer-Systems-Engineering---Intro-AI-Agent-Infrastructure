---
description: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.SendToAll
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:22:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html
title: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.SendToAll
---

# Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.SendToAll

> **Summary:** Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.SendToAll

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$.html "Permalink")  object [DistributedPubSubMediator](DistributedPubSubMediator$.html)Definition Classes[pubsub](index.html)
- [Count](DistributedPubSubMediator$$Count.html)
- [CountSubscribers](DistributedPubSubMediator$$CountSubscribers.html)
- [CurrentTopics](DistributedPubSubMediator$$CurrentTopics.html "Reply to GetTopics.")
- [GetTopics](DistributedPubSubMediator$$GetTopics.html)
- [Publish](DistributedPubSubMediator$$Publish.html)
- [Put](DistributedPubSubMediator$$Put.html)
- [Remove](DistributedPubSubMediator$$Remove.html)
- [Send](DistributedPubSubMediator$$Send.html)
- SendToAll
- [Subscribe](DistributedPubSubMediator$$Subscribe.html)
- [SubscribeAck](DistributedPubSubMediator$$SubscribeAck.html)
- [Unsubscribe](DistributedPubSubMediator$$Unsubscribe.html)
- [UnsubscribeAck](DistributedPubSubMediator$$UnsubscribeAck.html)
c[akka](../../index.html).[cluster](../index.html).[pubsub](index.html).[DistributedPubSubMediator](DistributedPubSubMediator$.html)

# SendToAll[**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html "Permalink")

### 

#### final  case class SendToAll(path: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), allButSelf: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [DistributedPubSubMessage](DistributedPubSubMessage.html) with [WrappedMessage](../../actor/WrappedMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Annotations@SerialVersionUID() Source[DistributedPubSubMediator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/scala/akka/cluster/pubsub/DistributedPubSubMediator.scala#L215)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [WrappedMessage](../../actor/WrappedMessage.html), [DistributedPubSubMessage](DistributedPubSubMessage.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SendToAll
2. Product
3. Equals
4. WrappedMessage
5. DistributedPubSubMessage
6. Serializable
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

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#<init>(path:String,msg:Any):akka.cluster.pubsub.DistributedPubSubMediator.SendToAll "Permalink")  new SendToAll(path: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#<init>(path:String,msg:Any,allButSelf:Boolean):akka.cluster.pubsub.DistributedPubSubMediator.SendToAll "Permalink")  new SendToAll(path: String, msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), allButSelf: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false)
### Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SendToAll toany2stringadd\[SendToAll] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SendToAll, B)ImplicitThis member is added by an implicit conversion from SendToAll toArrowAssoc\[SendToAll] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#allButSelf:Boolean "Permalink")  val allButSelf: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
7. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SendToAll) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SendToAllImplicitThis member is added by an implicit conversion from SendToAll toEnsuring\[SendToAll] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SendToAll) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SendToAllImplicitThis member is added by an implicit conversion from SendToAll toEnsuring\[SendToAll] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SendToAllImplicitThis member is added by an implicit conversion from SendToAll toEnsuring\[SendToAll] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SendToAllImplicitThis member is added by an implicit conversion from SendToAll toEnsuring\[SendToAll] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#message:Any "Permalink")  def message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesSendToAll → [WrappedMessage](../../actor/WrappedMessage.html)
17. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#msg:Any "Permalink")  val msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)
18. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#path:String "Permalink")  val path: String
22. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SendToAll toStringFormat\[SendToAll] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SendToAll, B)ImplicitThis member is added by an implicit conversion from SendToAll toArrowAssoc\[SendToAll] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [WrappedMessage](../../actor/WrappedMessage.html)

### Inherited from [DistributedPubSubMessage](DistributedPubSubMessage.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSendToAll to any2stringadd\[SendToAll]

### Inherited by implicit conversion StringFormat fromSendToAll to StringFormat\[SendToAll]

### Inherited by implicit conversion Ensuring fromSendToAll to Ensuring\[SendToAll]

### Inherited by implicit conversion ArrowAssoc fromSendToAll to ArrowAssoc\[SendToAll]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/WrappedMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Count$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Count.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$CountSubscribers.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$CurrentTopics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Publish.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Put.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Remove.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Send.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$SubscribeAck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$UnsubscribeAck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html)*