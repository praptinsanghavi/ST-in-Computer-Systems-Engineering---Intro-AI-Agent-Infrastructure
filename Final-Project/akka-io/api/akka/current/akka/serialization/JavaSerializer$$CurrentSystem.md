---
description: Akka 2.10.17 - akka.serialization.JavaSerializer.CurrentSystem
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:37:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/JavaSerializer$$CurrentSystem.html
title: Akka 2.10.17 - akka.serialization.JavaSerializer.CurrentSystem
---

# Akka 2.10.17 - akka.serialization.JavaSerializer.CurrentSystem

> **Summary:** Akka 2.10.17 - akka.serialization.JavaSerializer.CurrentSystem

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/JavaSerializer$.html "Permalink")  object [JavaSerializer](JavaSerializer$.html)Definition Classes[serialization](index.html)
- CurrentSystem
c[akka](../index.html).[serialization](index.html).[JavaSerializer](JavaSerializer$.html)

# CurrentSystem[**](../../akka/serialization/JavaSerializer$$CurrentSystem.html "Permalink")

### 

#### final  class CurrentSystem extends [DynamicVariable](https://www.scala-lang.org/api/2.13.17/scala/util/DynamicVariable.html#scala.util.DynamicVariable)\[[ExtendedActorSystem](../actor/ExtendedActorSystem.html)]

Source[Serializer.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/serialization/Serializer.scala#L327)Linear Supertypes[DynamicVariable](https://www.scala-lang.org/api/2.13.17/scala/util/DynamicVariable.html#scala.util.DynamicVariable)\[[ExtendedActorSystem](../actor/ExtendedActorSystem.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CurrentSystem
2. DynamicVariable
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

1. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#<init>():akka.serialization.JavaSerializer.CurrentSystem "Permalink")  new CurrentSystem()
### Value Members

1. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CurrentSystem toany2stringadd\[CurrentSystem] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CurrentSystem, B)ImplicitThis member is added by an implicit conversion from CurrentSystem toArrowAssoc\[CurrentSystem] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CurrentSystem) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CurrentSystemImplicitThis member is added by an implicit conversion from CurrentSystem toEnsuring\[CurrentSystem] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CurrentSystem) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CurrentSystemImplicitThis member is added by an implicit conversion from CurrentSystem toEnsuring\[CurrentSystem] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CurrentSystemImplicitThis member is added by an implicit conversion from CurrentSystem toEnsuring\[CurrentSystem] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CurrentSystemImplicitThis member is added by an implicit conversion from CurrentSystem toEnsuring\[CurrentSystem] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#toString():String "Permalink")  def toString(): StringDefinition ClassesDynamicVariable → AnyRef → Any
22. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#value:T "Permalink")  def value: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)Definition ClassesDynamicVariable
23. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#value_=(newval:T):Unit "Permalink")  def value\_\=(newval: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesDynamicVariable
24. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#withValue[S](value:akka.actor.ExtendedActorSystem,callable:java.util.concurrent.Callable[S]):S "Permalink")  def withValue\[S](value: [ExtendedActorSystem](../actor/ExtendedActorSystem.html), callable: [Callable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Callable.html#java.util.concurrent.Callable)\[S]): SJava API: invoke the callable with the current system being set to the given value for this thread.

Java API: invoke the callable with the current system being set to the given value for this thread.

value\- the current value under the call to callable.call()

callable\- the operation to be performed

returnsthe result of callable.call()
28. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#withValue[S](newval:T)(thunk:=>S):S "Permalink")  def withValue\[S](newval: [ExtendedActorSystem](../actor/ExtendedActorSystem.html))(thunk: \=\> S): SDefinition ClassesDynamicVariable
### Deprecated Value Members

1. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CurrentSystem toStringFormat\[CurrentSystem] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/serialization/JavaSerializer$$CurrentSystem.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CurrentSystem, B)ImplicitThis member is added by an implicit conversion from CurrentSystem toArrowAssoc\[CurrentSystem] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DynamicVariable](https://www.scala-lang.org/api/2.13.17/scala/util/DynamicVariable.html#scala.util.DynamicVariable)\[[ExtendedActorSystem](../actor/ExtendedActorSystem.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCurrentSystem to any2stringadd\[CurrentSystem]

### Inherited by implicit conversion StringFormat fromCurrentSystem to StringFormat\[CurrentSystem]

### Inherited by implicit conversion Ensuring fromCurrentSystem to Ensuring\[CurrentSystem]

### Inherited by implicit conversion ArrowAssoc fromCurrentSystem to ArrowAssoc\[CurrentSystem]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/serialization/JavaSerializer$$CurrentSystem.html
- https://doc.akka.io/api/akka/current/akka/serialization/JavaSerializer$.html
- https://doc.akka.io/api/akka/current/akka/serialization/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/serialization/JavaSerializer$$CurrentSystem.html](https://doc.akka.io/api/akka/current/akka/serialization/JavaSerializer$$CurrentSystem.html)*