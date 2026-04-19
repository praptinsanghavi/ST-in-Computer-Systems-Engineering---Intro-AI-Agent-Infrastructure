---
description: Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:51:52Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/Receptionist$.html
title: Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist
---

# Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist

> **Summary:** Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](index.html)Definition Classes[typed](../index.html)
- [Receptionist](Receptionist.html "Register and discover actors that implement a service with a protocol defined by a ServiceKey.")
- [ReceptionistSetup](ReceptionistSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the Receptionist extension.")
- [ServiceKey](ServiceKey.html "A service key is an object that implements this trait for a given protocol T, meaning that it signifies that the type T is the entry point into the protocol spoken by that service (think of it as the set of first messages that a client could send).")
[o](Receptionist.html "See companion class")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[receptionist](index.html)

# [Receptionist](Receptionist.html "See companion class")[**](../../../../akka/actor/typed/receptionist/Receptionist$.html "Permalink")

### Companion [class Receptionist](Receptionist.html "See companion class")

#### object Receptionist extends [ExtensionId](../ExtensionId.html)\[[Receptionist](Receptionist.html)]

A Receptionist is an entry point into an Actor hierarchy where select Actors
publish their identity together with the protocols that they implement. Other
Actors need only know the Receptionist’s identity in order to be able to use
the services of the registered Actors.

These are the messages (and the extension) for interacting with the receptionist.
The receptionist is easiest accessed through the system: [ActorSystem.receptionist](../ActorSystem.html#receptionist:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command])

Source[Receptionist.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/receptionist/Receptionist.scala#L96)Linear Supertypes[ExtensionId](../ExtensionId.html)\[[Receptionist](Receptionist.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Receptionist
2. ExtensionId
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Command.html "Permalink") abstract  class [Command](Receptionist$$Command.html "The set of commands accepted by a Receptionist.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The set of commands accepted by a Receptionist.

The set of commands accepted by a Receptionist.

Not for user Extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
2. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html "Permalink")  trait [Deregistered](Receptionist$$Deregistered.html "Confirmation that the given akka.actor.typed.ActorRef no more associated with the ServiceKey in the local receptionist.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Confirmation that the given [akka.actor.typed.ActorRef](../ActorRef.html) no more associated with the [ServiceKey](ServiceKey.html) in the local receptionist.

Confirmation that the given [akka.actor.typed.ActorRef](../ActorRef.html) no more associated with the [ServiceKey](ServiceKey.html) in the local receptionist.
Note that this does not guarantee that subscribers has yet seen that the service is deregistered.

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
3. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html "Permalink")  trait [Listing](Receptionist$$Listing.html "Current listing of all Actors that implement the protocol given by the ServiceKey.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Current listing of all Actors that implement the protocol given by the [ServiceKey](ServiceKey.html).

Current listing of all Actors that implement the protocol given by the [ServiceKey](ServiceKey.html).

You can use `key.Listing` for type\-safe pattern matching.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
4. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Registered.html "Permalink")  trait [Registered](Receptionist$$Registered.html "Confirmation that the given akka.actor.typed.ActorRef has been associated with the ServiceKey.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Confirmation that the given [akka.actor.typed.ActorRef](../ActorRef.html) has been associated with the [ServiceKey](ServiceKey.html).

Confirmation that the given [akka.actor.typed.ActorRef](../ActorRef.html) has been associated with the [ServiceKey](ServiceKey.html).

You can use `key.Registered` for type\-safe pattern matching.

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#apply(system:akka.actor.typed.ActorSystem[_]):T "Permalink") final  def apply(system: [ActorSystem](../ActorSystem.html)\[\_]): [Receptionist](Receptionist.html)Lookup or create an instance of the extension identified by this id.

Lookup or create an instance of the extension identified by this id.

Definition Classes[ExtensionId](../ExtensionId.html)
5. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#createExtension(system:akka.actor.typed.ActorSystem[_]):akka.actor.typed.receptionist.Receptionist "Permalink")  def createExtension(system: [ActorSystem](../ActorSystem.html)\[\_]): [Receptionist](Receptionist.html)Create the extension, will be invoked at most one time per actor system where the extension is registered.

Create the extension, will be invoked at most one time per actor system where the extension is registered.

Definition ClassesReceptionist → [ExtensionId](../ExtensionId.html)
8. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#deregister[T](key:akka.actor.typed.receptionist.ServiceKey[T],service:akka.actor.typed.ActorRef[T],replyTo:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Deregistered]):akka.actor.typed.receptionist.Receptionist.Command "Permalink")  def deregister\[T](key: [ServiceKey](ServiceKey.html)\[T], service: [ActorRef](../ActorRef.html)\[T], replyTo: [ActorRef](../ActorRef.html)\[[Deregistered](Receptionist$$Deregistered.html)]): [Command](Receptionist$$Command.html)Java API: A Deregister message with an actor that will get an ack that the service was unregistered
9. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#deregister[T](key:akka.actor.typed.receptionist.ServiceKey[T],service:akka.actor.typed.ActorRef[T]):akka.actor.typed.receptionist.Receptionist.Command "Permalink")  def deregister\[T](key: [ServiceKey](ServiceKey.html)\[T], service: [ActorRef](../ActorRef.html)\[T]): [Command](Receptionist$$Command.html)Java API: A Deregister message without Ack that the service was unregistered
10. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#deregistered[T](key:akka.actor.typed.receptionist.ServiceKey[T],serviceInstance:akka.actor.typed.ActorRef[T]):akka.actor.typed.receptionist.Receptionist.Deregistered "Permalink")  def deregistered\[T](key: [ServiceKey](ServiceKey.html)\[T], serviceInstance: [ActorRef](../ActorRef.html)\[T]): [Deregistered](Receptionist$$Deregistered.html)Java API: Sent by the receptionist, available here for easier testing
11. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../ExtensionId.html) → AnyRef → Any
13. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#find[T](key:akka.actor.typed.receptionist.ServiceKey[T],replyTo:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Listing]):akka.actor.typed.receptionist.Receptionist.Command "Permalink")  def find\[T](key: [ServiceKey](ServiceKey.html)\[T], replyTo: [ActorRef](../ActorRef.html)\[[Listing](Receptionist$$Listing.html)]): [Command](Receptionist$$Command.html)Java API: `Find` message.

Java API: `Find` message. Query the Receptionist for a list of all Actors implementing the given
protocol at one point in time by sending this command to the [Receptionist.ref](Receptionist.html#ref:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command]).
14. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#get(system:akka.actor.typed.ActorSystem[_]):akka.actor.typed.receptionist.Receptionist "Permalink")  def get(system: [ActorSystem](../ActorSystem.html)\[\_]): [Receptionist](Receptionist.html)
15. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../ExtensionId.html) → AnyRef → Any
17. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#id:akka.actor.typed.ExtensionId[T] "Permalink")  def id: [ExtensionId](../ExtensionId.html)\[[Receptionist](Receptionist.html)]Java API: The identifier of the extension

Java API: The identifier of the extension

Definition Classes[ExtensionId](../ExtensionId.html)
18. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#listing[T](key:akka.actor.typed.receptionist.ServiceKey[T],serviceInstances:java.util.Set[akka.actor.typed.ActorRef[T]],allServiceInstances:java.util.Set[akka.actor.typed.ActorRef[T]],servicesWereAddedOrRemoved:Boolean):akka.actor.typed.receptionist.Receptionist.Listing "Permalink")  def listing\[T](key: [ServiceKey](ServiceKey.html)\[T], serviceInstances: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ActorRef](../ActorRef.html)\[T]], allServiceInstances: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ActorRef](../ActorRef.html)\[T]], servicesWereAddedOrRemoved: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Listing](Receptionist$$Listing.html)Java API: Sent by the receptionist, available here for easier testing
20. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#listing[T](key:akka.actor.typed.receptionist.ServiceKey[T],serviceInstances:java.util.Set[akka.actor.typed.ActorRef[T]]):akka.actor.typed.receptionist.Receptionist.Listing "Permalink")  def listing\[T](key: [ServiceKey](ServiceKey.html)\[T], serviceInstances: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ActorRef](../ActorRef.html)\[T]]): [Listing](Receptionist$$Listing.html)Java API: Sent by the receptionist, available here for easier testing
21. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#register[T](key:akka.actor.typed.receptionist.ServiceKey[T],service:akka.actor.typed.ActorRef[T],replyTo:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Registered]):akka.actor.typed.receptionist.Receptionist.Command "Permalink")  def register\[T](key: [ServiceKey](ServiceKey.html)\[T], service: [ActorRef](../ActorRef.html)\[T], replyTo: [ActorRef](../ActorRef.html)\[[Registered](Receptionist$$Registered.html)]): [Command](Receptionist$$Command.html)Java API: A `Register` message with Ack that the service was registered.

Java API: A `Register` message with Ack that the service was registered.
Associate the given [akka.actor.typed.ActorRef](../ActorRef.html) with the given [ServiceKey](ServiceKey.html)
by sending this command to the [Receptionist.ref](Receptionist.html#ref:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command]).

Multiple registrations can be made for the same key. De\-registration is implied by
the end of the referenced Actor’s lifecycle, but it can also be explicitly deregistered before termination.

Registration will be acknowledged with the [Registered](Receptionist$$Registered.html) message to the given replyTo actor.
25. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#register[T](key:akka.actor.typed.receptionist.ServiceKey[T],service:akka.actor.typed.ActorRef[T]):akka.actor.typed.receptionist.Receptionist.Command "Permalink")  def register\[T](key: [ServiceKey](ServiceKey.html)\[T], service: [ActorRef](../ActorRef.html)\[T]): [Command](Receptionist$$Command.html)Java API: A Register message without Ack that the service was registered.

Java API: A Register message without Ack that the service was registered.
Associate the given [akka.actor.typed.ActorRef](../ActorRef.html) with the given [ServiceKey](ServiceKey.html)
by sending this command to the [Receptionist.ref](Receptionist.html#ref:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command]).

Multiple registrations can be made for the same key. De\-registration is implied by
the end of the referenced Actor’s lifecycle, but it can also be explicitly deregistered before termination.
26. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#registered[T](key:akka.actor.typed.receptionist.ServiceKey[T],serviceInstance:akka.actor.typed.ActorRef[T]):akka.actor.typed.receptionist.Receptionist.Registered "Permalink")  def registered\[T](key: [ServiceKey](ServiceKey.html)\[T], serviceInstance: [ActorRef](../ActorRef.html)\[T]): [Registered](Receptionist$$Registered.html)Java API: Sent by the receptionist, available here for easier testing
27. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#subscribe[T](key:akka.actor.typed.receptionist.ServiceKey[T],subscriber:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Listing]):akka.actor.typed.receptionist.Receptionist.Command "Permalink")  def subscribe\[T](key: [ServiceKey](ServiceKey.html)\[T], subscriber: [ActorRef](../ActorRef.html)\[[Listing](Receptionist$$Listing.html)]): [Command](Receptionist$$Command.html)Java API: `Subscribe` message.

Java API: `Subscribe` message. The given actor to service updates when this command is sent to
the [Receptionist.ref](Receptionist.html#ref:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command]). When the set of instances registered for the given key changes
the subscriber will be sent a [Listing](Receptionist$$Listing.html) with the new set of instances for that service.

The subscription will be acknowledged by sending out a first [Listing](Receptionist$$Listing.html). The subscription automatically ends
with the termination of the subscriber.
28. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregister$.html "Permalink")  object [Deregister](Receptionist$$Deregister$.html "Remove association between the given akka.actor.typed.ActorRef and the given ServiceKey.")Remove association between the given [akka.actor.typed.ActorRef](../ActorRef.html) and the given [ServiceKey](ServiceKey.html).

Remove association between the given [akka.actor.typed.ActorRef](../ActorRef.html) and the given [ServiceKey](ServiceKey.html).

Deregistration can be acknowledged with the [Deregistered](Receptionist$$Deregistered.html) message if the deregister message is created with a
`replyTo` actor.

Note that getting the [Deregistered](Receptionist$$Deregistered.html) confirmation does not mean all service key subscribers has seen the fact
that the actor has been deregistered yet (especially in a clustered context) so it will be possible that messages
sent to the actor in the role of service provider arrive even after getting the confirmation.
34. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered$.html "Permalink")  object [Deregistered](Receptionist$$Deregistered$.html "Sent by the receptionist, available here for easier testing")Sent by the receptionist, available here for easier testing
35. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html "Permalink")  object [Find](Receptionist$$Find$.html "Find message.")`Find` message.

`Find` message. Query the Receptionist for a list of all Actors implementing the given
protocol at one point in time by sending this command to the [Receptionist.ref](Receptionist.html#ref:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command]).
36. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing$.html "Permalink")  object [Listing](Receptionist$$Listing$.html "Sent by the receptionist, available here for easier testing")Sent by the receptionist, available here for easier testing
37. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Register$.html "Permalink")  object [Register](Receptionist$$Register$.html "Register message.")`Register` message.

`Register` message. Associate the given [akka.actor.typed.ActorRef](../ActorRef.html) with the given [ServiceKey](ServiceKey.html)
by sending this command to the [Receptionist.ref](Receptionist.html#ref:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command]).

Multiple registrations can be made for the same key. De\-registration is implied by
the end of the referenced Actor’s lifecycle, but it can also be explicitly deregistered before termination.

Registration will be acknowledged with the [Registered](Receptionist$$Registered.html) message to the given replyTo actor
if there is one.
38. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Registered$.html "Permalink")  object [Registered](Receptionist$$Registered$.html "Sent by the receptionist, available here for easier testing")Sent by the receptionist, available here for easier testing
39. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Subscribe$.html "Permalink")  object [Subscribe](Receptionist$$Subscribe$.html "Subscribe message.")`Subscribe` message.

`Subscribe` message. The given actor will subscribe to service updates when this command is sent to
the [Receptionist.ref](Receptionist.html#ref:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command]). When the set of instances registered for the given key changes
the subscriber will be sent a [Listing](Receptionist$$Listing.html) with the new set of instances for that service.

The subscription will be acknowledged by sending out a first [Listing](Receptionist$$Listing.html). The subscription automatically ends
with the termination of the subscriber.
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionId](../ExtensionId.html)\[[Receptionist](Receptionist.html)]

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
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ReceptionistSetup$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ReceptionistSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$.html)*