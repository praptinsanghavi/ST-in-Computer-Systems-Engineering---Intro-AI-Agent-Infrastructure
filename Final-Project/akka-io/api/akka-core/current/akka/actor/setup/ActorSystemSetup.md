---
description: Akka 2.10.17 - akka.actor.setup.ActorSystemSetup
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:55:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/setup/ActorSystemSetup.html
title: Akka 2.10.17 - akka.actor.setup.ActorSystemSetup
---

# Akka 2.10.17 - akka.actor.setup.ActorSystemSetup

> **Summary:** Akka 2.10.17 - akka.actor.setup.ActorSystemSetup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/setup/index.html "Permalink")  package [setup](index.html)Definition Classes[actor](../index.html)
- ActorSystemSetup
- [Setup](Setup.html "Marker supertype for a setup part that can be put inside ActorSystemSetup, if a specific concrete setup is not specified in the actor system setup that means defaults are used (usually from the config file) - no concrete setup instance should be mandatory in the ActorSystemSetup that an actor system is created with.")
[c](ActorSystemSetup$.html "See companion object")[akka](../../index.html).[actor](../index.html).[setup](index.html)

# [ActorSystemSetup](ActorSystemSetup$.html "See companion object")[**](../../../akka/actor/setup/ActorSystemSetup.html "Permalink")

### Companion [object ActorSystemSetup](ActorSystemSetup$.html "See companion object")

#### final  class ActorSystemSetup extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A set of setup settings for programmatic configuration of the actor system.

Constructor is \*Internal API\*. Use the factory methods [ActorSystemSetup\#create](ActorSystemSetup$.html#create(settings:akka.actor.setup.Setup*):akka.actor.setup.ActorSystemSetup) and akka.actor.Actor\#apply to create
instances.

Source[ActorSystemSetup.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/setup/ActorSystemSetup.scala#L54)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorSystemSetup
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
### Value Members

1. [**](../../../akka/actor/setup/ActorSystemSetup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/setup/ActorSystemSetup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/setup/ActorSystemSetup.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorSystemSetup toany2stringadd\[ActorSystemSetup] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/setup/ActorSystemSetup.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorSystemSetup, B)ImplicitThis member is added by an implicit conversion from ActorSystemSetup toArrowAssoc\[ActorSystemSetup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/setup/ActorSystemSetup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/actor/setup/ActorSystemSetup.html#and[T<:akka.actor.setup.Setup](t:T):akka.actor.setup.ActorSystemSetup "Permalink")  def and\[T \<: [Setup](Setup.html)](t: T): ActorSystemSetupalias for `withSetup` allowing for fluent combination of settings: `a and b and c`, where `a`, `b` and `c` are
concrete [Setup](Setup.html) instances.

alias for `withSetup` allowing for fluent combination of settings: `a and b and c`, where `a`, `b` and `c` are
concrete [Setup](Setup.html) instances. If a setting of the same concrete [Setup](Setup.html) already is
present it will be replaced.
7. [**](../../../akka/actor/setup/ActorSystemSetup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/actor/setup/ActorSystemSetup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/actor/setup/ActorSystemSetup.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorSystemSetup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorSystemSetupImplicitThis member is added by an implicit conversion from ActorSystemSetup toEnsuring\[ActorSystemSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/setup/ActorSystemSetup.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorSystemSetup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorSystemSetupImplicitThis member is added by an implicit conversion from ActorSystemSetup toEnsuring\[ActorSystemSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/setup/ActorSystemSetup.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorSystemSetupImplicitThis member is added by an implicit conversion from ActorSystemSetup toEnsuring\[ActorSystemSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/setup/ActorSystemSetup.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorSystemSetupImplicitThis member is added by an implicit conversion from ActorSystemSetup toEnsuring\[ActorSystemSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/actor/setup/ActorSystemSetup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/actor/setup/ActorSystemSetup.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/actor/setup/ActorSystemSetup.html#get[T<:akka.actor.setup.Setup](implicitevidence$1:scala.reflect.ClassTag[T]):Option[T] "Permalink")  def get\[T \<: [Setup](Setup.html)](implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]Scala API: Extract a concrete [Setup](Setup.html) of type `T` if it is defined in the settings.
16. [**](../../../akka/actor/setup/ActorSystemSetup.html#get[T<:akka.actor.setup.Setup](clazz:Class[T]):java.util.Optional[T] "Permalink")  def get\[T \<: [Setup](Setup.html)](clazz: Class\[T]): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[T]Java API: Extract a concrete [Setup](Setup.html) of type `T` if it is defined in the settings.
17. [**](../../../akka/actor/setup/ActorSystemSetup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/actor/setup/ActorSystemSetup.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/actor/setup/ActorSystemSetup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../akka/actor/setup/ActorSystemSetup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/actor/setup/ActorSystemSetup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/actor/setup/ActorSystemSetup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/actor/setup/ActorSystemSetup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/actor/setup/ActorSystemSetup.html#toString():String "Permalink")  def toString(): StringDefinition ClassesActorSystemSetup → AnyRef → Any
25. [**](../../../akka/actor/setup/ActorSystemSetup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/actor/setup/ActorSystemSetup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/actor/setup/ActorSystemSetup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/actor/setup/ActorSystemSetup.html#withSetup[T<:akka.actor.setup.Setup](t:T):akka.actor.setup.ActorSystemSetup "Permalink")  def withSetup\[T \<: [Setup](Setup.html)](t: T): ActorSystemSetupAdd a concrete [Setup](Setup.html).

Add a concrete [Setup](Setup.html). If a setting of the same concrete [Setup](Setup.html) already is
present it will be replaced.
### Deprecated Value Members

1. [**](../../../akka/actor/setup/ActorSystemSetup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/actor/setup/ActorSystemSetup.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorSystemSetup toStringFormat\[ActorSystemSetup] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/actor/setup/ActorSystemSetup.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorSystemSetup, B)ImplicitThis member is added by an implicit conversion from ActorSystemSetup toArrowAssoc\[ActorSystemSetup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActorSystemSetup to any2stringadd\[ActorSystemSetup]

### Inherited by implicit conversion StringFormat fromActorSystemSetup to StringFormat\[ActorSystemSetup]

### Inherited by implicit conversion Ensuring fromActorSystemSetup to Ensuring\[ActorSystemSetup]

### Inherited by implicit conversion ArrowAssoc fromActorSystemSetup to ArrowAssoc\[ActorSystemSetup]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/actor/setup/ActorSystemSetup$.html
- https://doc.akka.io/api/akka-core/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka-core/current/akka/actor/setup/Setup.html
- https://doc.akka.io/api/akka-core/current/akka/actor/setup/index.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/index.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/actor/setup/ActorSystemSetup.html](https://doc.akka.io/api/akka-core/current/akka/actor/setup/ActorSystemSetup.html)*