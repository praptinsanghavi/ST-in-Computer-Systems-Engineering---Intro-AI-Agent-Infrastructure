---
description: Akka 2.10.17 - akka.actor.typed.pubsub.PubSub
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:52:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/pubsub/PubSub$.html
title: Akka 2.10.17 - akka.actor.typed.pubsub.PubSub
---

# Akka 2.10.17 - akka.actor.typed.pubsub.PubSub

> **Summary:** Akka 2.10.17 - akka.actor.typed.pubsub.PubSub

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/pubsub/index.html "Permalink")  package [pubsub](index.html)Definition Classes[typed](../index.html)
- [PubSub](PubSub.html)
- [Topic](Topic$.html "A pub sub topic is an actor that handles subscribing to a topic and publishing messages to all subscribed actors.")
[o](PubSub.html "See companion class")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[pubsub](index.html)

# [PubSub](PubSub.html "See companion class")[**](../../../../akka/actor/typed/pubsub/PubSub$.html "Permalink")

### Companion [class PubSub](PubSub.html "See companion class")

#### object PubSub extends [ExtensionId](../ExtensionId.html)\[[PubSub](PubSub.html)]

Registry for [Topic](Topic$.html)s. Keeps one topic actor instance of each requested topic name so that they can be shared
between all subscribers in the same actor system.

Note that manually spawned [Topic](Topic$.html) actors will not appear in the registry.

Source[PubSub.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/pubsub/PubSub.scala#L31)Linear Supertypes[ExtensionId](../ExtensionId.html)\[[PubSub](PubSub.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PubSub
2. ExtensionId
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/pubsub/PubSub$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#apply(system:akka.actor.typed.ActorSystem[_]):T "Permalink") final  def apply(system: [ActorSystem](../ActorSystem.html)\[\_]): [PubSub](PubSub.html)Lookup or create an instance of the extension identified by this id.

Lookup or create an instance of the extension identified by this id.

Definition Classes[ExtensionId](../ExtensionId.html)
5. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#createExtension(system:akka.actor.typed.ActorSystem[_]):akka.actor.typed.pubsub.PubSub "Permalink")  def createExtension(system: [ActorSystem](../ActorSystem.html)\[\_]): [PubSub](PubSub.html)Create the extension, will be invoked at most one time per actor system where the extension is registered.

Create the extension, will be invoked at most one time per actor system where the extension is registered.

Definition ClassesPubSub → [ExtensionId](../ExtensionId.html)
8. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../ExtensionId.html) → AnyRef → Any
10. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#get(system:akka.actor.typed.ActorSystem[_]):akka.actor.typed.pubsub.PubSub "Permalink")  def get(system: [ActorSystem](../ActorSystem.html)\[\_]): [PubSub](PubSub.html)
11. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../ExtensionId.html) → AnyRef → Any
13. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#id:akka.actor.typed.ExtensionId[T] "Permalink")  def id: [ExtensionId](../ExtensionId.html)\[[PubSub](PubSub.html)]Java API: The identifier of the extension

Java API: The identifier of the extension

Definition Classes[ExtensionId](../ExtensionId.html)
14. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/pubsub/PubSub$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionId](../ExtensionId.html)\[[PubSub](PubSub.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/PubSub$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/PubSub.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/Topic$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/PubSub$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/pubsub/PubSub$.html)*