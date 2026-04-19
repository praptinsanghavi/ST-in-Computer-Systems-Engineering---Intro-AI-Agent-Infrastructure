---
description: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSub
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/pubsub/DistributedPubSub.html
title: Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSub
---

# Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSub

> **Summary:** Akka 2.10.17 - akka.cluster.pubsub.DistributedPubSub

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/pubsub/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[pubsub](index.html)
- DistributedPubSub
- [DistributedPubSubMediator](DistributedPubSubMediator.html "This actor manages a registry of actor references and replicates the entries to peer actors among all cluster nodes or a group of nodes tagged with a specific role.")
- [DistributedPubSubMessage](DistributedPubSubMessage.html "Marker trait for remote messages with special serializer.")
- [DistributedPubSubSettings](DistributedPubSubSettings.html)
[c](DistributedPubSub$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[pubsub](index.html)

# [DistributedPubSub](DistributedPubSub$.html "See companion object")[**](../../../akka/cluster/pubsub/DistributedPubSub.html "Permalink")

### Companion [object DistributedPubSub](DistributedPubSub$.html "See companion object")

#### class DistributedPubSub extends [Extension](../../actor/Extension.html)

Extension that starts a [DistributedPubSubMediator](DistributedPubSubMediator.html) actor
with settings defined in config section `akka.cluster.pub-sub`.

Source[DistributedPubSubMediator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/scala/akka/cluster/pubsub/DistributedPubSubMediator.scala#L940)Linear Supertypes[Extension](../../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DistributedPubSub
2. Extension
3. AnyRef
4. Any
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

1. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#<init>(system:akka.actor.ExtendedActorSystem):akka.cluster.pubsub.DistributedPubSub "Permalink")  new DistributedPubSub(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/pubsub/DistributedPubSub.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DistributedPubSub toany2stringadd\[DistributedPubSub] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DistributedPubSub, B)ImplicitThis member is added by an implicit conversion from DistributedPubSub toArrowAssoc\[DistributedPubSub] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DistributedPubSub) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DistributedPubSubImplicitThis member is added by an implicit conversion from DistributedPubSub toEnsuring\[DistributedPubSub] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DistributedPubSub) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DistributedPubSubImplicitThis member is added by an implicit conversion from DistributedPubSub toEnsuring\[DistributedPubSub] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DistributedPubSubImplicitThis member is added by an implicit conversion from DistributedPubSub toEnsuring\[DistributedPubSub] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DistributedPubSubImplicitThis member is added by an implicit conversion from DistributedPubSub toEnsuring\[DistributedPubSub] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#isTerminated:Boolean "Permalink")  def isTerminated: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if this member is not tagged with the role configured for the
mediator.
18. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#mediator:akka.actor.ActorRef "Permalink")  val mediator: [ActorRef](../../actor/ActorRef.html)The [DistributedPubSubMediator](DistributedPubSubMediator.html)
19. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DistributedPubSub toStringFormat\[DistributedPubSub] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/pubsub/DistributedPubSub.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DistributedPubSub, B)ImplicitThis member is added by an implicit conversion from DistributedPubSub toArrowAssoc\[DistributedPubSub] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDistributedPubSub to any2stringadd\[DistributedPubSub]

### Inherited by implicit conversion StringFormat fromDistributedPubSub to StringFormat\[DistributedPubSub]

### Inherited by implicit conversion Ensuring fromDistributedPubSub to Ensuring\[DistributedPubSub]

### Inherited by implicit conversion ArrowAssoc fromDistributedPubSub to ArrowAssoc\[DistributedPubSub]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSub.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMediator.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSubSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSub.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/DistributedPubSub.html)*