---
description: Akka 2.10.17 - akka.actor.typed.receptionist.ReceptionistSetup
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:52:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/receptionist/ReceptionistSetup.html
title: Akka 2.10.17 - akka.actor.typed.receptionist.ReceptionistSetup
---

# Akka 2.10.17 - akka.actor.typed.receptionist.ReceptionistSetup

> **Summary:** Akka 2.10.17 - akka.actor.typed.receptionist.ReceptionistSetup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/receptionist/index.html "Permalink")  package [receptionist](index.html)Definition Classes[typed](../index.html)
- [Receptionist](Receptionist.html "Register and discover actors that implement a service with a protocol defined by a ServiceKey.")
- ReceptionistSetup
- [ServiceKey](ServiceKey.html "A service key is an object that implements this trait for a given protocol T, meaning that it signifies that the type T is the entry point into the protocol spoken by that service (think of it as the set of first messages that a client could send).")
[c](ReceptionistSetup$.html "See companion object")[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[receptionist](index.html)

# [ReceptionistSetup](ReceptionistSetup$.html "See companion object")[**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html "Permalink")

### Companion [object ReceptionistSetup](ReceptionistSetup$.html "See companion object")

#### final  class ReceptionistSetup extends [ExtensionSetup](../ExtensionSetup.html)\[[Receptionist](Receptionist.html)]

Can be used in [akka.actor.setup.ActorSystemSetup](../../setup/ActorSystemSetup.html) when starting the [ActorSystem](../ActorSystem.html)
to replace the default implementation of the [Receptionist](Receptionist.html) extension. Intended
for tests that need to replace extension with stub/mock implementations.

Source[Receptionist.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/receptionist/Receptionist.scala#L466)Linear Supertypes[ExtensionSetup](../ExtensionSetup.html)\[[Receptionist](Receptionist.html)], [Setup](../../setup/Setup.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReceptionistSetup
2. ExtensionSetup
3. Setup
4. AnyRef
5. Any
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

1. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#<init>(createExtension:java.util.function.Function[akka.actor.typed.ActorSystem[_],akka.actor.typed.receptionist.Receptionist]):akka.actor.typed.receptionist.ReceptionistSetup "Permalink")  new ReceptionistSetup(createExtension: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorSystem](../ActorSystem.html)\[\_], [Receptionist](Receptionist.html)])
### Value Members

1. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ReceptionistSetup toany2stringadd\[ReceptionistSetup] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ReceptionistSetup, B)ImplicitThis member is added by an implicit conversion from ReceptionistSetup toArrowAssoc\[ReceptionistSetup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#and(other:akka.actor.setup.Setup):akka.actor.setup.ActorSystemSetup "Permalink") final  def and(other: [Setup](../../setup/Setup.html)): [ActorSystemSetup](../../setup/ActorSystemSetup.html)Construct an ActorSystemSetup with this setup combined with another one.

Construct an ActorSystemSetup with this setup combined with another one. Allows for
fluent creation of settings. If `other` is a setting of the same concrete Setup as this
it will replace this.

Definition Classes[Setup](../../setup/Setup.html)
7. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#createExtension:java.util.function.Function[akka.actor.typed.ActorSystem[_],T] "Permalink")  val createExtension: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[ActorSystem](../ActorSystem.html)\[\_], [Receptionist](Receptionist.html)]Definition Classes[ExtensionSetup](../ExtensionSetup.html)
10. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ReceptionistSetup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReceptionistSetupImplicitThis member is added by an implicit conversion from ReceptionistSetup toEnsuring\[ReceptionistSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ReceptionistSetup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReceptionistSetupImplicitThis member is added by an implicit conversion from ReceptionistSetup toEnsuring\[ReceptionistSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReceptionistSetupImplicitThis member is added by an implicit conversion from ReceptionistSetup toEnsuring\[ReceptionistSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReceptionistSetupImplicitThis member is added by an implicit conversion from ReceptionistSetup toEnsuring\[ReceptionistSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#extId:akka.actor.typed.ExtensionId[T] "Permalink")  val extId: [ExtensionId](../ExtensionId.html)\[[Receptionist](Receptionist.html)]Definition Classes[ExtensionSetup](../ExtensionSetup.html)
17. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ReceptionistSetup toStringFormat\[ReceptionistSetup] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/actor/typed/receptionist/ReceptionistSetup.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ReceptionistSetup, B)ImplicitThis member is added by an implicit conversion from ReceptionistSetup toArrowAssoc\[ReceptionistSetup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ExtensionSetup](../ExtensionSetup.html)\[[Receptionist](Receptionist.html)]

### Inherited from [Setup](../../setup/Setup.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReceptionistSetup to any2stringadd\[ReceptionistSetup]

### Inherited by implicit conversion StringFormat fromReceptionistSetup to StringFormat\[ReceptionistSetup]

### Inherited by implicit conversion Ensuring fromReceptionistSetup to Ensuring\[ReceptionistSetup]

### Inherited by implicit conversion ArrowAssoc fromReceptionistSetup to ArrowAssoc\[ReceptionistSetup]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/setup/Setup.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ReceptionistSetup$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ReceptionistSetup.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ReceptionistSetup.html](https://doc.akka.io/api/akka/current/akka/actor/typed/receptionist/ReceptionistSetup.html)*