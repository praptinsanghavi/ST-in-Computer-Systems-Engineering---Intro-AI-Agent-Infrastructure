---
description: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:19:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html
title: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe
---

# Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe

> **Summary:** Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe

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
- [SendToAll](DistributedPubSubMediator$$SendToAll.html)
- [Subscribe](DistributedPubSubMediator$$Subscribe.html)
- [SubscribeAck](DistributedPubSubMediator$$SubscribeAck.html)
- Unsubscribe
- [UnsubscribeAck](DistributedPubSubMediator$$UnsubscribeAck.html)
[c](DistributedPubSubMediator$$Unsubscribe$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[pubsub](index.html).[DistributedPubSubMediator](DistributedPubSubMediator$.html)

# [Unsubscribe](DistributedPubSubMediator$$Unsubscribe$.html "See companion object")[**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html "Permalink")

### Companion [object Unsubscribe](DistributedPubSubMediator$$Unsubscribe$.html "See companion object")

#### final  case class Unsubscribe(topic: String, group: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], ref: [ActorRef](../../actor/ActorRef.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Annotations@SerialVersionUID() Source[DistributedPubSubMediator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/scala/akka/cluster/pubsub/DistributedPubSubMediator.scala#L182)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Unsubscribe
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

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#<init>(topic:String,group:String,ref:akka.actor.ActorRef):akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe "Permalink")  new Unsubscribe(topic: String, group: String, ref: [ActorRef](../../actor/ActorRef.html))
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#<init>(topic:String,ref:akka.actor.ActorRef):akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe "Permalink")  new Unsubscribe(topic: String, ref: [ActorRef](../../actor/ActorRef.html))
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#<init>(topic:String,group:Option[String],ref:akka.actor.ActorRef):akka.cluster.pubsub.DistributedPubSubMediator.Unsubscribe "Permalink")  new Unsubscribe(topic: String, group: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], ref: [ActorRef](../../actor/ActorRef.html))
### Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Unsubscribe toany2stringadd\[Unsubscribe] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Unsubscribe, B)ImplicitThis member is added by an implicit conversion from Unsubscribe toArrowAssoc\[Unsubscribe] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Unsubscribe) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnsubscribeImplicitThis member is added by an implicit conversion from Unsubscribe toEnsuring\[Unsubscribe] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Unsubscribe) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnsubscribeImplicitThis member is added by an implicit conversion from Unsubscribe toEnsuring\[Unsubscribe] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnsubscribeImplicitThis member is added by an implicit conversion from Unsubscribe toEnsuring\[Unsubscribe] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnsubscribeImplicitThis member is added by an implicit conversion from Unsubscribe toEnsuring\[Unsubscribe] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#group:Option[String] "Permalink")  val group: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
15. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#ref:akka.actor.ActorRef "Permalink")  val ref: [ActorRef](../../actor/ActorRef.html)
21. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#topic:String "Permalink")  val topic: String
23. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Unsubscribe toStringFormat\[Unsubscribe] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Unsubscribe, B)ImplicitThis member is added by an implicit conversion from Unsubscribe toArrowAssoc\[Unsubscribe] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUnsubscribe to any2stringadd\[Unsubscribe]

### Inherited by implicit conversion StringFormat fromUnsubscribe to StringFormat\[Unsubscribe]

### Inherited by implicit conversion Ensuring fromUnsubscribe to Ensuring\[Unsubscribe]

### Inherited by implicit conversion ArrowAssoc fromUnsubscribe to ArrowAssoc\[Unsubscribe]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Count$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Count.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$CountSubscribers.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$CurrentTopics.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Publish.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Put.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Remove.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Send.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$SubscribeAck.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$UnsubscribeAck.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html)*