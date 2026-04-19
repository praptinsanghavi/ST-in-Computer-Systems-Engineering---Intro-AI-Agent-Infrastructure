---
description: Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Find
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:23:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/Receptionist$$Find$.html
title: Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Find
---

# Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Find

> **Summary:** Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Find

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
- [Deregister](Receptionist$$Deregister$.html "Remove association between the given akka.actor.typed.ActorRef and the given ServiceKey.")
- [Deregistered](Receptionist$$Deregistered.html "Confirmation that the given akka.actor.typed.ActorRef no more associated with the ServiceKey in the local receptionist.")
- Find
- [Listing](Receptionist$$Listing.html "Current listing of all Actors that implement the protocol given by the ServiceKey.")
- [Register](Receptionist$$Register$.html "Register message.")
- [Registered](Receptionist$$Registered.html "Confirmation that the given akka.actor.typed.ActorRef has been associated with the ServiceKey.")
- [Subscribe](Receptionist$$Subscribe$.html "Subscribe message.")
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[receptionist](index.html).[Receptionist](Receptionist$.html)

# Find[**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html "Permalink")

### 

#### object Find

`Find` message. Query the Receptionist for a list of all Actors implementing the given
protocol at one point in time by sending this command to the [Receptionist.ref](Receptionist.html#ref:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Command]).

Source[Receptionist.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/receptionist/Receptionist.scala#L317)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Find
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#apply[T](key:akka.actor.typed.receptionist.ServiceKey[T]):akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Listing]=>akka.actor.typed.receptionist.Receptionist.Command "Permalink")  def apply\[T](key: [ServiceKey](ServiceKey.html)\[T]): ([ActorRef](../ActorRef.html)\[[Listing](Receptionist$$Listing.html)]) \=\> [Command](Receptionist$$Command.html)Special factory to make using Find with ask easier
5. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#apply[T](key:akka.actor.typed.receptionist.ServiceKey[T],replyTo:akka.actor.typed.ActorRef[akka.actor.typed.receptionist.Receptionist.Listing]):akka.actor.typed.receptionist.Receptionist.Command "Permalink")  def apply\[T](key: [ServiceKey](ServiceKey.html)\[T], replyTo: [ActorRef](../ActorRef.html)\[[Listing](Receptionist$$Listing.html)]): [Command](Receptionist$$Command.html)Scala API:
6. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Find$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Deregister$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Deregistered$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Deregistered.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Find$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Listing$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Listing.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Register$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Registered$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Registered.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Subscribe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Find$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Find$.html)*