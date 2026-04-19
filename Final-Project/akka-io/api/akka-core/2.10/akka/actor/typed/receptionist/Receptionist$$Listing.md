---
description: Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Listing
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/Receptionist$$Listing.html
title: Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Listing
---

# Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Listing

> **Summary:** Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Listing

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
- [Find](Receptionist$$Find$.html "Find message.")
- Listing
- [Register](Receptionist$$Register$.html "Register message.")
- [Registered](Receptionist$$Registered.html "Confirmation that the given akka.actor.typed.ActorRef has been associated with the ServiceKey.")
- [Subscribe](Receptionist$$Subscribe$.html "Subscribe message.")
[t](Receptionist$$Listing$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[receptionist](index.html).[Receptionist](Receptionist$.html)

# [Listing](Receptionist$$Listing$.html "See companion object")[**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html "Permalink")

### Companion [object Listing](Receptionist$$Listing$.html "See companion object")

#### trait Listing extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Current listing of all Actors that implement the protocol given by the [ServiceKey](ServiceKey.html).

You can use `key.Listing` for type\-safe pattern matching.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[Receptionist.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/receptionist/Receptionist.scala#L344)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Listing
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

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#allServiceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):Set[akka.actor.typed.ActorRef[T]] "Permalink") abstract  def allServiceInstances\[T](key: [ServiceKey](ServiceKey.html)\[T]): Set\[[ActorRef](../ActorRef.html)\[T]]Scala API: Return both the reachable and the unreachable service instances.

Scala API: Return both the reachable and the unreachable service instances.

In a non\-clustered `ActorSystem` this will always be the same as [\#serviceInstances](#serviceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):Set[akka.actor.typed.ActorRef[T]]).

For a clustered `ActorSystem` this include both services on nodes that are reachable
and nodes that are unreachable.
2. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#getAllServiceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):java.util.Set[akka.actor.typed.ActorRef[T]] "Permalink") abstract  def getAllServiceInstances\[T](key: [ServiceKey](ServiceKey.html)\[T]): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ActorRef](../ActorRef.html)\[T]]Java API: Return both the reachable and the unreachable service instances.

Java API: Return both the reachable and the unreachable service instances.

In a non\-clustered `ActorSystem` this will always be the same as [\#getServiceInstances](#getServiceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):java.util.Set[akka.actor.typed.ActorRef[T]]).

For a clustered `ActorSystem` this include both services on nodes that are reachable
and nodes that are unreachable.
3. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#getServiceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):java.util.Set[akka.actor.typed.ActorRef[T]] "Permalink") abstract  def getServiceInstances\[T](key: [ServiceKey](ServiceKey.html)\[T]): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[ActorRef](../ActorRef.html)\[T]]Java API: Return the reachable service instances.

Java API: Return the reachable service instances.

In a non\-clustered `ActorSystem` this will always be all registered instances
for a service key.

For a clustered `ActorSystem` it only contain services on nodes that has
are not seen as unreachable (note that they could have still have become
unreachable between this message being sent and the receiving actor processing it).

For a list including both reachable and unreachable instances see [\#getAllServiceInstances](#getAllServiceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):java.util.Set[akka.actor.typed.ActorRef[T]])
4. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#isForKey(key:akka.actor.typed.receptionist.ServiceKey[_]):Boolean "Permalink") abstract  def isForKey(key: [ServiceKey](ServiceKey.html)\[\_]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
5. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#key:akka.actor.typed.receptionist.ServiceKey[_] "Permalink") abstract  def key: [ServiceKey](ServiceKey.html)\[\_]Scala API
6. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#serviceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):Set[akka.actor.typed.ActorRef[T]] "Permalink") abstract  def serviceInstances\[T](key: [ServiceKey](ServiceKey.html)\[T]): Set\[[ActorRef](../ActorRef.html)\[T]]Scala API: Return the reachable service instances.

Scala API: Return the reachable service instances.

In a non\-clustered `ActorSystem` this will always be all registered instances
for a service key.

For a clustered `ActorSystem` it only contain services on nodes that
are not seen as unreachable (note that they could have still have become
unreachable between this message being sent and the receiving actor processing it).

For a list including both reachable and unreachable instances see [\#allServiceInstances](#allServiceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):Set[akka.actor.typed.ActorRef[T]])

Also, see [ServiceKey.Listing](ServiceKey$Listing$.html) for more convenient pattern matching
7. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#servicesWereAddedOrRemoved:Boolean "Permalink") abstract  def servicesWereAddedOrRemoved: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns `true` only if this `Listing` was sent triggered by new actors added or removed to the receptionist.

Returns `true` only if this `Listing` was sent triggered by new actors added or removed to the receptionist.
When `false` the event is only about reachability changes \- meaning that the full set of actors
([\#allServiceInstances](#allServiceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):Set[akka.actor.typed.ActorRef[T]]) or [\#getAllServiceInstances](#getAllServiceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):java.util.Set[akka.actor.typed.ActorRef[T]])) is the same as the previous `Listing`.

knowing this is useful for subscribers only concerned with [\#allServiceInstances](#allServiceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):Set[akka.actor.typed.ActorRef[T]]) or [\#getAllServiceInstances](#getAllServiceInstances[T](key:akka.actor.typed.receptionist.ServiceKey[T]):java.util.Set[akka.actor.typed.ActorRef[T]])
that can then ignore `Listing`s related to reachability.

In a non\-clustered `ActorSystem` this will be `true` for all listings.
For `Find` queries and the initial listing for a `Subscribe` this will always be `true`.
### Concrete Value Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Listing toany2stringadd\[Listing] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Listing, B)ImplicitThis member is added by an implicit conversion from Listing toArrowAssoc\[Listing] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Listing) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ListingImplicitThis member is added by an implicit conversion from Listing toEnsuring\[Listing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Listing) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ListingImplicitThis member is added by an implicit conversion from Listing toEnsuring\[Listing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ListingImplicitThis member is added by an implicit conversion from Listing toEnsuring\[Listing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ListingImplicitThis member is added by an implicit conversion from Listing toEnsuring\[Listing] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#getKey:akka.actor.typed.receptionist.ServiceKey[_] "Permalink")  def getKey: [ServiceKey](ServiceKey.html)\[\_]Java API
16. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Listing toStringFormat\[Listing] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Listing.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Listing, B)ImplicitThis member is added by an implicit conversion from Listing toArrowAssoc\[Listing] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromListing to any2stringadd\[Listing]

### Inherited by implicit conversion StringFormat fromListing to StringFormat\[Listing]

### Inherited by implicit conversion Ensuring fromListing to Ensuring\[Listing]

### Inherited by implicit conversion ArrowAssoc fromListing to ArrowAssoc\[Listing]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Deregister$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Deregistered$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Deregistered.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Find$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Listing$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Listing.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Register$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Registered$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Registered.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Subscribe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$Listing$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Listing.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Listing.html)*