---
description: Akka 2.10.17 - akka.actor.typed.pubsub.Topic.TopicStats
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:47:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/Topic$$TopicStats.html
title: Akka 2.10.17 - akka.actor.typed.pubsub.Topic.TopicStats
---

# Akka 2.10.17 - akka.actor.typed.pubsub.Topic.TopicStats

> **Summary:** Akka 2.10.17 - akka.actor.typed.pubsub.Topic.TopicStats

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/pubsub/Topic$.html "Permalink")  object [Topic](Topic$.html "A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.")A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.

A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.

It is mostly useful in a clustered setting, where it is intended to be started once on every node that want to
house subscribers or publish messages to the topic, but it also works in a local setting without cluster.

In a clustered context messages are deduplicated so that there is at most one message sent to each node for
each publish and if there are no subscribers on a node, no message is sent to it. Note that the list of subscribers
is eventually consistent and there are no delivery guarantees built in.

Each topic results in a [akka.actor.typed.receptionist.ServiceKey](../receptionist/ServiceKey.html) in the [akka.actor.typed.receptionist.Receptionist](../receptionist/Receptionist.html)
so the same scaling recommendation holds for topics, see docs:
https://doc.akka.io/libraries/akka\-core/current/typed/actor\-discovery.html\#receptionist\-scalability

Definition Classes[pubsub](index.html)
- [Command](Topic$$Command.html "Not for user extension")
- [GetTopicStats](Topic$$GetTopicStats$.html "Scala API: Get a summary of the state for a local topic actor.")
- [Publish](Topic$$Publish$.html "Scala API: Publish the message to all currently known subscribers.")
- [Subscribe](Topic$$Subscribe$.html "Scala API: Subscribe to this topic.")
- TopicStats
- [Unsubscribe](Topic$$Unsubscribe$.html "Scala API: Unsubscribe a previously subscribed actor from this topic.")
t[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[pubsub](index.html).[Topic](Topic$.html)

# TopicStats[**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html "Permalink")

### 

#### trait TopicStats extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Response to the `GetTopicStats` query.

Note that this is a snapshot of the state at one point in time, that there was subscribers at that
time does not guarantee there is once this response arrives. The information cannot be used to
achieve delivery guarantees, but can be useful in for example tests, to observe a subscription
completed before publishing messages.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[Topic.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/pubsub/Topic.scala#L81)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TopicStats
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
### Abstract Value Members

1. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#localSubscriberCount:Int "Permalink") abstract  def localSubscriberCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)returnsThe number of local subscribers subscribing to this topic actor instance when the request was handled
2. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#topicInstanceCount:Int "Permalink") abstract  def topicInstanceCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)returnsThe number of known other topic actor instances for the topic (locally and across the cluster),
 that has at least one subscriber. A topic only be counted towards this sum once it has at least
 one subscriber and when the last local subscriber unsubscribes it will be subtracted from this sum
 (the value is eventually consistent).
### Concrete Value Members

1. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TopicStats toany2stringadd\[TopicStats] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TopicStats, B)ImplicitThis member is added by an implicit conversion from TopicStats toArrowAssoc\[TopicStats] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TopicStats) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TopicStatsImplicitThis member is added by an implicit conversion from TopicStats toEnsuring\[TopicStats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TopicStats) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TopicStatsImplicitThis member is added by an implicit conversion from TopicStats toEnsuring\[TopicStats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TopicStatsImplicitThis member is added by an implicit conversion from TopicStats toEnsuring\[TopicStats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TopicStatsImplicitThis member is added by an implicit conversion from TopicStats toEnsuring\[TopicStats] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TopicStats toStringFormat\[TopicStats] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/pubsub/Topic$$TopicStats.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TopicStats, B)ImplicitThis member is added by an implicit conversion from TopicStats toArrowAssoc\[TopicStats] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTopicStats to any2stringadd\[TopicStats]

### Inherited by implicit conversion StringFormat fromTopicStats to StringFormat\[TopicStats]

### Inherited by implicit conversion Ensuring fromTopicStats to Ensuring\[TopicStats]

### Inherited by implicit conversion ArrowAssoc fromTopicStats to ArrowAssoc\[TopicStats]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$Command.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$GetTopicStats$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$Publish$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$Subscribe$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$TopicStats.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$Unsubscribe$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$TopicStats.html](https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$$TopicStats.html)*