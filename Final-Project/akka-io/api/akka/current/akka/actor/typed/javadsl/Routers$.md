---
description: Akka 2.10.17 - akka.actor.typed.javadsl.Routers
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:51:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/javadsl/Routers$.html
title: Akka 2.10.17 - akka.actor.typed.javadsl.Routers
---

# Akka 2.10.17 - akka.actor.typed.javadsl.Routers

> **Summary:** Akka 2.10.17 - akka.actor.typed.javadsl.Routers

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#createReceive.")
- [AbstractOnMessageBehavior](AbstractOnMessageBehavior.html "An actor Behavior can be implemented by extending this class and implementing the abstract method AbstractOnMessageBehavior#onMessage.")
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [Adapter](Adapter$.html "Adapters between typed and classic actors and actor systems.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [BehaviorBuilder](BehaviorBuilder.html "Immutable builder used for creating a Behavior by 'chaining' message and signal handlers.")
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Receive](Receive.html "A specialized \"receive\" behavior that is implemented using message matching builders, such as ReceiveBuilder, from AbstractBehavior.")
- [ReceiveBuilder](ReceiveBuilder.html "Mutable builder used when implementing AbstractBehavior.")
- Routers
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[javadsl](index.html)

# Routers[**](../../../../akka/actor/typed/javadsl/Routers$.html "Permalink")

### 

#### object Routers

Source[Routers.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/javadsl/Routers.scala#L15)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Routers
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/actor/typed/javadsl/Routers$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/javadsl/Routers$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/javadsl/Routers$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/javadsl/Routers$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/actor/typed/javadsl/Routers$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/actor/typed/javadsl/Routers$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/actor/typed/javadsl/Routers$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/actor/typed/javadsl/Routers$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/typed/javadsl/Routers$.html#group[T](key:akka.actor.typed.receptionist.ServiceKey[T]):akka.actor.typed.javadsl.GroupRouter[T] "Permalink")  def group\[T](key: [ServiceKey](../receptionist/ServiceKey.html)\[T]): [GroupRouter](GroupRouter.html)\[T]A router that will keep track of the available routees registered to the [akka.actor.typed.receptionist.Receptionist](../receptionist/Receptionist.html)
and route over those by random selection.

A router that will keep track of the available routees registered to the [akka.actor.typed.receptionist.Receptionist](../receptionist/Receptionist.html)
and route over those by random selection.

In a clustered app this means the routees could live on any node in the cluster.
The current impl does not try to avoid sending messages to unreachable cluster nodes.

Note that there is a delay between a routee stopping and this being detected by the receptionist, and another
before the group detects this, therefore it is best to deregister routees from the receptionist and not stop
until the deregistration is complete if you want to minimize the risk of lost messages.
10. [**](../../../../akka/actor/typed/javadsl/Routers$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/actor/typed/javadsl/Routers$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/actor/typed/javadsl/Routers$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/javadsl/Routers$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/typed/javadsl/Routers$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/javadsl/Routers$.html#pool[T](poolSize:Int)(behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.javadsl.PoolRouter[T] "Permalink")  def pool\[T](poolSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(behavior: [Behavior](../Behavior.html)\[T]): [PoolRouter](PoolRouter.html)\[T]Spawn `poolSize` children with the given `behavior` and forward messages to them using round robin.

Spawn `poolSize` children with the given `behavior` and forward messages to them using round robin.
If a child is stopped it is removed from the pool, to have children restart on failure use supervision.
When all children are stopped the pool stops itself. To stop the pool from the outside, use `ActorContext.stop`
from the parent actor.

Note that if a child stops there is a slight chance that messages still get delivered to it, and get lost,
before the pool sees that the child stopped. Therefore it is best to \_not\_ stop children arbitrarily.
16. [**](../../../../akka/actor/typed/javadsl/Routers$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/actor/typed/javadsl/Routers$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/actor/typed/javadsl/Routers$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/actor/typed/javadsl/Routers$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/actor/typed/javadsl/Routers$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/javadsl/Routers$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/Adapter$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/AskPattern$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/BehaviorBuilder$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/BehaviorBuilder.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/Behaviors$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/GroupRouter.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/PoolRouter.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/ReceiveBuilder$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/ReceiveBuilder.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/Routers$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/StashBuffer.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/StashOverflowException.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/TimerScheduler.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/Routers$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/javadsl/Routers$.html)*