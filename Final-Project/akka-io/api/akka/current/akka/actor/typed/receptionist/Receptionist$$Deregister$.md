---
description: Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Deregister
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:46:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/Receptionist$$Deregister$.html
title: Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Deregister
---

# Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Deregister

> **Summary:** Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Deregister

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/receptionist/Receptionist$.html "Permalink")  object [Receptionist](Receptionist$.html "A Receptionist is an entry point into an Actor hierarchy where select Actors publish their identity together with the protocols that they implement.") extends [ExtensionId](../ExtensionId.html)\[[Receptionist](Receptionist.html)]A Receptionist is an entry point into an Actor hierarchy where select Actors
publish their identity together with the protocols that they implement.

A Receptionist is an entry point into an Actor hierarchy where select Actors
publish their identity together with the protocols that they implement. Other
Actors need only know the Receptionist’s identity in order to be able to use
the services of the registered Actors.

These are the messages (and the extension) for interacting with the receptionist.
The receptionist is easiest accessed through the system: [ActorSystem.receptionist](../ActorSystem.html#receptionist:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command])

Definition Classes[receptionist](index.html)
- [Command](Receptionist$$Command.html "The set of commands accepted by a Receptionist.")
- Deregister
- [Deregistered](Receptionist$$Deregistered.html "Confirmation that the given akka.actor.typed.ActorRef no more associated with the ServiceKey in the local receptionist.")
- [Find](Receptionist$$Find$.html "Find message.")
- [Listing](Receptionist$$Listing.html "Current listing of all Actors that implement the protocol given by the ServiceKey.")
- [Register](Receptionist$$Register$.html "Register message.")
- [Registered](Receptionist$$Registered.html "Confirmation that the given akka.actor.typed.ActorRef has been associated with the ServiceKey.")
- [Subscribe](Receptionist$$Subscribe$.html "Subscribe message.")
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[receptionist](index.html).[Receptionist](Receptionist$.html)

# Deregister[**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html "Permalink")

### 

#### object Deregister

Remove association between the given [akka.actor.typed.ActorRef](../ActorRef.html) and the given [ServiceKey](ServiceKey.html).

Deregistration can be acknowledged with the [Deregistered](Receptionist$$Deregistered.html) message if the deregister message is created with a
`replyTo` actor.

Note that getting the [Deregistered](Receptionist$$Deregistered.html) confirmation does not mean all service key subscribers has seen the fact
that the actor has been deregistered yet (especially in a clustered context) so it will be possible that messages
sent to the actor in the role of service provider arrive even after getting the confirmation.

Source[Receptionist.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/receptionist/Receptionist.scala#L213)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Deregister
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#apply[T](key:akka.actor.typed.receptionist.ServiceKey[T],service:akka.actor.typed.ActorRef[T],replyTo:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Deregistered]):akka.actor.typed.receptionist.Receptionist.Command "Permalink")  def apply\[T](key: [ServiceKey](ServiceKey.html)\[T], service: [ActorRef](../ActorRef.html)\[T], replyTo: [ActorRef](../ActorRef.html)\[[Deregistered](Receptionist$$Deregistered.html)]): [Command](Receptionist$$Command.html)Create a Deregister with an actor that will get an ack that the service was unregistered
5. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#apply[T](key:akka.actor.typed.receptionist.ServiceKey[T],service:akka.actor.typed.ActorRef[T]):akka.actor.typed.receptionist.Receptionist.Command "Permalink")  def apply\[T](key: [ServiceKey](ServiceKey.html)\[T], service: [ActorRef](../ActorRef.html)\[T]): [Command](Receptionist$$Command.html)Create a Deregister without Ack that the service was deregistered
6. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Command.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Deregister$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Deregistered$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Deregistered.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Find$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Listing$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Listing.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Register$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Registered$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Registered.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Subscribe$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Deregister$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$$Deregister$.html)*