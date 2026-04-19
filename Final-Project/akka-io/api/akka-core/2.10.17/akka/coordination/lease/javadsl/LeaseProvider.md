---
description: Akka 2.10.17 - akka.coordination.lease.javadsl.LeaseProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:59:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/coordination/lease/javadsl/LeaseProvider.html
title: Akka 2.10.17 - akka.coordination.lease.javadsl.LeaseProvider
---

# Akka 2.10.17 - akka.coordination.lease.javadsl.LeaseProvider

> **Summary:** Akka 2.10.17 - akka.coordination.lease.javadsl.LeaseProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/coordination/index.html "Permalink")  package [coordination](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/coordination/lease/index.html "Permalink")  package [lease](../index.html)Definition Classes[coordination](../../index.html)
- [**](../../../../akka/coordination/lease/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[lease](../index.html)
- [Lease](Lease.html)
- LeaseProvider
[c](LeaseProvider$.html "See companion object")[akka](../../../index.html).[coordination](../../index.html).[lease](../index.html).[javadsl](index.html)

# [LeaseProvider](LeaseProvider$.html "See companion object")[**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html "Permalink")

### Companion [object LeaseProvider](LeaseProvider$.html "See companion object")

#### class LeaseProvider extends [Extension](../../../actor/Extension.html)

Source[LeaseProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-coordination/src/main/scala/akka/coordination/lease/javadsl/LeaseProvider.scala#L24)Linear Supertypes[Extension](../../../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LeaseProvider
2. Extension
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

1. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#<init>(system:akka.actor.ExtendedActorSystem):akka.coordination.lease.javadsl.LeaseProvider "Permalink")  new LeaseProvider(system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LeaseProvider toany2stringadd\[LeaseProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LeaseProvider, B)ImplicitThis member is added by an implicit conversion from LeaseProvider toArrowAssoc\[LeaseProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LeaseProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeaseProviderImplicitThis member is added by an implicit conversion from LeaseProvider toEnsuring\[LeaseProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LeaseProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeaseProviderImplicitThis member is added by an implicit conversion from LeaseProvider toEnsuring\[LeaseProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeaseProviderImplicitThis member is added by an implicit conversion from LeaseProvider toEnsuring\[LeaseProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeaseProviderImplicitThis member is added by an implicit conversion from LeaseProvider toEnsuring\[LeaseProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#getLease(leaseName:String,configPath:String,ownerName:String):akka.coordination.lease.javadsl.Lease "Permalink")  def getLease(leaseName: String, configPath: String, ownerName: String): [Lease](Lease.html)The configuration define at `configPath` must have a property `lease-class` that defines
the fully qualified class name of the Lease implementation.

The configuration define at `configPath` must have a property `lease-class` that defines
the fully qualified class name of the Lease implementation.
The class must implement [Lease](Lease.html) and have constructor with [akka.coordination.lease.LeaseSettings](../LeaseSettings.html) parameter and
optionally ActorSystem parameter.

leaseNamethe name of the lease resource

configPaththe path of configuration for the lease

ownerNamethe owner that will `acquire` the lease, e.g. hostname and port of the ActorSystem
16. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LeaseProvider toStringFormat\[LeaseProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/coordination/lease/javadsl/LeaseProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LeaseProvider, B)ImplicitThis member is added by an implicit conversion from LeaseProvider toArrowAssoc\[LeaseProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLeaseProvider to any2stringadd\[LeaseProvider]

### Inherited by implicit conversion StringFormat fromLeaseProvider to StringFormat\[LeaseProvider]

### Inherited by implicit conversion Ensuring fromLeaseProvider to Ensuring\[LeaseProvider]

### Inherited by implicit conversion ArrowAssoc fromLeaseProvider to ArrowAssoc\[LeaseProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/LeaseSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/Lease.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/LeaseProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/LeaseProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/LeaseProvider.html](https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/lease/javadsl/LeaseProvider.html)*