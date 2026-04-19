---
description: Akka 2.10.17 - akka.actor.typed.receptionist.ServiceKey
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:51:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/ServiceKey.html
title: Akka 2.10.17 - akka.actor.typed.receptionist.ServiceKey
---

# Akka 2.10.17 - akka.actor.typed.receptionist.ServiceKey

> **Summary:** Akka 2.10.17 - akka.actor.typed.receptionist.ServiceKey

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](index.html)Definition Classes[typed](../index.html)
- [Receptionist](Receptionist.html "Register and discover actors that implement a service with a protocol defined by a ServiceKey.")
- [ReceptionistSetup](ReceptionistSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the Receptionist extension.")
- ServiceKey
[c](ServiceKey$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[receptionist](index.html)

# [ServiceKey](ServiceKey$.html "See companion object")[**](../../../../akka/actor/typed/receptionist/ServiceKey.html "Permalink")

### Companion [object ServiceKey](ServiceKey$.html "See companion object")

#### abstract  class ServiceKey\[T] extends AbstractServiceKey

A service key is an object that implements this trait for a given protocol
T, meaning that it signifies that the type T is the entry point into the
protocol spoken by that service (think of it as the set of first messages
that a client could send).

Not for user extension, see factories in companion object: [ServiceKey\#create](ServiceKey$.html#create[T](clazz:Class[T],id:String):akka.actor.typed.receptionist.ServiceKey[T]) and [ServiceKey\#apply](ServiceKey$.html#apply[T](id:String)(implicitclassTag:scala.reflect.ClassTag[T]):akka.actor.typed.receptionist.ServiceKey[T])

Self TypeServiceKey\[T]Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)() Source[Receptionist.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/receptionist/Receptionist.scala#L51)Linear SupertypesAbstractServiceKey, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[DefaultServiceKey](../internal/receptionist/DefaultServiceKey.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServiceKey
2. AbstractServiceKey
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

1. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#<init>():akka.actor.typed.receptionist.ServiceKey[T] "Permalink")  new ServiceKey()
### Type Members

1. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#Protocol=T "Permalink")  type Protocol \= TDefinition ClassesServiceKey → AbstractServiceKey
### Abstract Value Members

1. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#id:String "Permalink") abstract  def id: String
### Concrete Value Members

1. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ServiceKey\[T] toany2stringadd\[ServiceKey\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ServiceKey\[T], B)ImplicitThis member is added by an implicit conversion from ServiceKey\[T] toArrowAssoc\[ServiceKey\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#asServiceKey:akka.actor.typed.receptionist.ServiceKey[T] "Permalink")  def asServiceKey: ServiceKey\[T]Type\-safe down\-cast

Type\-safe down\-cast

Definition ClassesServiceKey → AbstractServiceKey
8. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ServiceKey\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServiceKey\[T]ImplicitThis member is added by an implicit conversion from ServiceKey\[T] toEnsuring\[ServiceKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ServiceKey\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServiceKey\[T]ImplicitThis member is added by an implicit conversion from ServiceKey\[T] toEnsuring\[ServiceKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServiceKey\[T]ImplicitThis member is added by an implicit conversion from ServiceKey\[T] toEnsuring\[ServiceKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServiceKey\[T]ImplicitThis member is added by an implicit conversion from ServiceKey\[T] toEnsuring\[ServiceKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html "Permalink")  object [Listing](ServiceKey$Listing$.html "Scala API: Provides a type safe pattern match for listings.")Scala API: Provides a type safe pattern match for listings.

Scala API: Provides a type safe pattern match for listings.

Using it for pattern match like this will return the reachable service instances:

`case MyServiceKey.Listing(reachable) =>`

In a non\-clustered `ActorSystem` this will always be all registered instances
for a service key. For a clustered environment services on nodes that have
been observed unreachable are not among these (note that they could have
become unreachable between this message being sent and the receiving actor
processing it).
27. [**](../../../../akka/actor/typed/receptionist/ServiceKey$Registered$.html "Permalink")  object [Registered](ServiceKey$Registered$.html "Scala API: Provides a type safe pattern match for registration acks")Scala API: Provides a type safe pattern match for registration acks
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ServiceKey\[T] toStringFormat\[ServiceKey\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/receptionist/ServiceKey.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ServiceKey\[T], B)ImplicitThis member is added by an implicit conversion from ServiceKey\[T] toArrowAssoc\[ServiceKey\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from AbstractServiceKey

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromServiceKey\[T] to any2stringadd\[ServiceKey\[T]]

### Inherited by implicit conversion StringFormat fromServiceKey\[T] to StringFormat\[ServiceKey\[T]]

### Inherited by implicit conversion Ensuring fromServiceKey\[T] to Ensuring\[ServiceKey\[T]]

### Inherited by implicit conversion ArrowAssoc fromServiceKey\[T] to ArrowAssoc\[ServiceKey\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/internal/receptionist/DefaultServiceKey.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ReceptionistSetup$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ReceptionistSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey$Listing$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey$Registered$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey.html](https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey.html)*