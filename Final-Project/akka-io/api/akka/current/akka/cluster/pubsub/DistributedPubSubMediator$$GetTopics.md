---
description: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.GetTopics
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html
title: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.GetTopics
---

# Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.GetTopics

> **Summary:** Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSubMediator.GetTopics

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
- GetTopics
- [Publish](DistributedPubSubMediator$$Publish.html)
- [Put](DistributedPubSubMediator$$Put.html)
- [Remove](DistributedPubSubMediator$$Remove.html)
- [Send](DistributedPubSubMediator$$Send.html)
- [SendToAll](DistributedPubSubMediator$$SendToAll.html)
- [Subscribe](DistributedPubSubMediator$$Subscribe.html)
- [SubscribeAck](DistributedPubSubMediator$$SubscribeAck.html)
- [Unsubscribe](DistributedPubSubMediator$$Unsubscribe.html)
- [UnsubscribeAck](DistributedPubSubMediator$$UnsubscribeAck.html)
[c](DistributedPubSubMediator$$GetTopics$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[pubsub](index.html).[DistributedPubSubMediator](DistributedPubSubMediator$.html)

# [GetTopics](DistributedPubSubMediator$$GetTopics$.html "See companion object")[**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html "Permalink")

### Companion [object GetTopics](DistributedPubSubMediator$$GetTopics$.html "See companion object")

#### sealed abstract  class GetTopics extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[DistributedPubSubMediator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/scala/akka/cluster/pubsub/DistributedPubSubMediator.scala#L226)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[GetTopics](DistributedPubSubMediator$$GetTopics$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GetTopics
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

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from GetTopics toany2stringadd\[GetTopics] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (GetTopics, B)ImplicitThis member is added by an implicit conversion from GetTopics toArrowAssoc\[GetTopics] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (GetTopics) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GetTopicsImplicitThis member is added by an implicit conversion from GetTopics toEnsuring\[GetTopics] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (GetTopics) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GetTopicsImplicitThis member is added by an implicit conversion from GetTopics toEnsuring\[GetTopics] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GetTopicsImplicitThis member is added by an implicit conversion from GetTopics toEnsuring\[GetTopics] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GetTopicsImplicitThis member is added by an implicit conversion from GetTopics toEnsuring\[GetTopics] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from GetTopics toStringFormat\[GetTopics] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (GetTopics, B)ImplicitThis member is added by an implicit conversion from GetTopics toArrowAssoc\[GetTopics] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromGetTopics to any2stringadd\[GetTopics]

### Inherited by implicit conversion StringFormat fromGetTopics to StringFormat\[GetTopics]

### Inherited by implicit conversion Ensuring fromGetTopics to Ensuring\[GetTopics]

### Inherited by implicit conversion ArrowAssoc fromGetTopics to ArrowAssoc\[GetTopics]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Count$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Count.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$CountSubscribers.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$CurrentTopics.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Publish$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Publish.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Put.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Remove.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Send.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$SendToAll.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Subscribe.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$SubscribeAck.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$Unsubscribe.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$UnsubscribeAck.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html](https://doc.akka.io/api/akka/current/akka/cluster/pubsub/DistributedPubSubMediator$$GetTopics.html)*