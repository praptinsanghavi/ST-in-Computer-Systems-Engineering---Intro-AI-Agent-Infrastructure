---
description: Akka 2.10.17 - akka.actor.typed.receptionist.ServiceKey.Listing
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:57:20Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/ServiceKey$Listing$.html
title: Akka 2.10.17 - akka.actor.typed.receptionist.ServiceKey.Listing
---

# Akka 2.10.17 - akka.actor.typed.receptionist.ServiceKey.Listing

> **Summary:** Akka 2.10.17 - akka.actor.typed.receptionist.ServiceKey.Listing

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/receptionist/ServiceKey.html "Permalink") abstract  class [ServiceKey](ServiceKey.html "A service key is an object that implements this trait for a given protocol T, meaning that it signifies that the type T is the entry point into the protocol spoken by that service (think of it as the set of first messages that a client could send).")\[T] extends AbstractServiceKeyA service key is an object that implements this trait for a given protocol
T, meaning that it signifies that the type T is the entry point into the
protocol spoken by that service (think of it as the set of first messages
that a client could send).

A service key is an object that implements this trait for a given protocol
T, meaning that it signifies that the type T is the entry point into the
protocol spoken by that service (think of it as the set of first messages
that a client could send).

Not for user extension, see factories in companion object: [ServiceKey\#create](ServiceKey$.html#create[T](clazz:Class[T],id:String):akka.actor.typed.receptionist.ServiceKey[T]) and [ServiceKey\#apply](ServiceKey$.html#apply[T](id:String)(implicitclassTag:scala.reflect.ClassTag[T]):akka.actor.typed.receptionist.ServiceKey[T])

Definition Classes[receptionist](index.html)Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
- Listing
- [Registered](ServiceKey$Registered$.html "Scala API: Provides a type safe pattern match for registration acks")
o[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[receptionist](index.html).[ServiceKey](ServiceKey.html)

# Listing[**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html "Permalink")

### 

#### object Listing

Scala API: Provides a type safe pattern match for listings.

Using it for pattern match like this will return the reachable service instances:

`case MyServiceKey.Listing(reachable) =>`

In a non\-clustered `ActorSystem` this will always be all registered instances
for a service key. For a clustered environment services on nodes that have
been observed unreachable are not among these (note that they could have
become unreachable between this message being sent and the receiving actor
processing it).

Source[Receptionist.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/receptionist/Receptionist.scala#L71)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Listing
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#unapply(l:akka.actor.typed.receptionist.Receptionist.Listing):Option[Set[akka.actor.typed.ActorRef[T]]] "Permalink")  def unapply(l: [Listing](Receptionist$$Listing.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Set\[[ActorRef](../ActorRef.html)\[T]]]
17. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/Receptionist$$Listing.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$Listing$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$Registered$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$Listing$.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$Listing$.html)*