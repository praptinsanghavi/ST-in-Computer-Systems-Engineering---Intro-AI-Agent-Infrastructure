---
description: Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Deregistered
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:23:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/Receptionist$$Deregistered.html
title: Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Deregistered
---

# Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Deregistered

> **Summary:** Akka 2.10.17 - akka.actor.typed.receptionist.Receptionist.Deregistered

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
- Deregistered
- [Find](Receptionist$$Find$.html "Find message.")
- [Listing](Receptionist$$Listing.html "Current listing of all Actors that implement the protocol given by the ServiceKey.")
- [Register](Receptionist$$Register$.html "Register message.")
- [Registered](Receptionist$$Registered.html "Confirmation that the given akka.actor.typed.ActorRef has been associated with the ServiceKey.")
- [Subscribe](Receptionist$$Subscribe$.html "Subscribe message.")
[t](Receptionist$$Deregistered$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[receptionist](index.html).[Receptionist](Receptionist$.html)

# [Deregistered](Receptionist$$Deregistered$.html "See companion object")[**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html "Permalink")

### Companion [object Deregistered](Receptionist$$Deregistered$.html "See companion object")

#### trait Deregistered extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Confirmation that the given [akka.actor.typed.ActorRef](../ActorRef.html) no more associated with the [ServiceKey](ServiceKey.html) in the local receptionist.
Note that this does not guarantee that subscribers has yet seen that the service is deregistered.

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[Receptionist.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/receptionist/Receptionist.scala#L246)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Deregistered
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

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#getServiceInstance[T](key:akka.actor.typed.receptionist.ServiceKey[T]):akka.actor.typed.ActorRef[T] "Permalink") abstract  def getServiceInstance\[T](key: [ServiceKey](ServiceKey.html)\[T]): [ActorRef](../ActorRef.html)\[T]Java API
2. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#isForKey(key:akka.actor.typed.receptionist.ServiceKey[_]):Boolean "Permalink") abstract  def isForKey(key: [ServiceKey](ServiceKey.html)\[\_]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
3. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#key:akka.actor.typed.receptionist.ServiceKey[_] "Permalink") abstract  def key: [ServiceKey](ServiceKey.html)\[\_]Scala API
4. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#serviceInstance[T](key:akka.actor.typed.receptionist.ServiceKey[T]):akka.actor.typed.ActorRef[T] "Permalink") abstract  def serviceInstance\[T](key: [ServiceKey](ServiceKey.html)\[T]): [ActorRef](../ActorRef.html)\[T]Scala API

Scala API

Also, see [ServiceKey.Listing](ServiceKey$Listing$.html) for more convenient pattern matching
### Concrete Value Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Deregistered toany2stringadd\[Deregistered] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Deregistered, B)ImplicitThis member is added by an implicit conversion from Deregistered toArrowAssoc\[Deregistered] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Deregistered) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeregisteredImplicitThis member is added by an implicit conversion from Deregistered toEnsuring\[Deregistered] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Deregistered) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeregisteredImplicitThis member is added by an implicit conversion from Deregistered toEnsuring\[Deregistered] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeregisteredImplicitThis member is added by an implicit conversion from Deregistered toEnsuring\[Deregistered] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeregisteredImplicitThis member is added by an implicit conversion from Deregistered toEnsuring\[Deregistered] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#getKey:akka.actor.typed.receptionist.ServiceKey[_] "Permalink")  def getKey: [ServiceKey](ServiceKey.html)\[\_]Java API
16. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Deregistered toStringFormat\[Deregistered] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/receptionist/Receptionist$$Deregistered.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Deregistered, B)ImplicitThis member is added by an implicit conversion from Deregistered toArrowAssoc\[Deregistered] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDeregistered to any2stringadd\[Deregistered]

### Inherited by implicit conversion StringFormat fromDeregistered to StringFormat\[Deregistered]

### Inherited by implicit conversion Ensuring fromDeregistered to Ensuring\[Deregistered]

### Inherited by implicit conversion ArrowAssoc fromDeregistered to ArrowAssoc\[Deregistered]

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
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey$Listing$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Deregistered.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/receptionist/Receptionist$$Deregistered.html)*