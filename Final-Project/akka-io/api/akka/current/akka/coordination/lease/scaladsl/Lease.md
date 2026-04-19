---
description: Akka 2.10.17 - akka.coordination.lease.scaladsl.Lease
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/coordination/lease/scaladsl/Lease.html
title: Akka 2.10.17 - akka.coordination.lease.scaladsl.Lease
---

# Akka 2.10.17 - akka.coordination.lease.scaladsl.Lease

> **Summary:** Akka 2.10.17 - akka.coordination.lease.scaladsl.Lease

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/coordination/index.html "Permalink")  package [coordination](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/coordination/lease/index.html "Permalink")  package [lease](../index.html)Definition Classes[coordination](../../index.html)
- [**](../../../../akka/coordination/lease/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[lease](../index.html)
- Lease
- [LeaseProvider](LeaseProvider.html)
c[akka](../../../index.html).[coordination](../../index.html).[lease](../index.html).[scaladsl](index.html)

# Lease[**](../../../../akka/coordination/lease/scaladsl/Lease.html "Permalink")

### 

#### abstract  class Lease extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[Lease.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-coordination/src/main/scala/akka/coordination/lease/scaladsl/Lease.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Lease
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
### Instance Constructors

1. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#<init>(settings:akka.coordination.lease.LeaseSettings):akka.coordination.lease.scaladsl.Lease "Permalink")  new Lease(settings: [LeaseSettings](../LeaseSettings.html))
### Abstract Value Members

1. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#acquire(leaseLostCallback:Option[Throwable]=>Unit):scala.concurrent.Future[Boolean] "Permalink") abstract  def acquire(leaseLostCallback: ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Throwable]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]Same as acquire with an additional callback
that is called if the lease is lost.

Same as acquire with an additional callback
that is called if the lease is lost. The lease can be lose due to being unable
to communicate with the lease provider.
Implementations should not call leaseLostCallback until after the returned future
has been completed
2. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#acquire():scala.concurrent.Future[Boolean] "Permalink") abstract  def acquire(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]Try to acquire the lease.

Try to acquire the lease. The returned `Future` will be completed with `true`
if the lease could be acquired, i.e. no other owner is holding the lease.

The returned `Future` will be completed with `false` if the lease for certain couldn't be
acquired, e.g. because some other owner is holding it. It's completed with [akka.coordination.lease.LeaseException](../LeaseException.html)
failure if it might not have been able to acquire the lease, e.g. communication timeout
with the lease resource.

The lease will be held by the [akka.coordination.lease.LeaseSettings.ownerName](../LeaseSettings.html#ownerName:String) until it is released
with [Lease.release](#release():scala.concurrent.Future[Boolean]). A Lease implementation will typically also lose the ownership
if it can't maintain its authority, e.g. if it crashes or is partitioned from the lease
resource for too long.

[Lease.checkLease](#checkLease():Boolean) can be used to verify that the owner still has the lease.
3. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#checkLease():Boolean "Permalink") abstract  def checkLease(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Check if the owner still holds the lease.

Check if the owner still holds the lease.
`true` means that it certainly holds the lease.
`false` means that it might not hold the lease, but it could, and for more certain
response you would have to use [Lease\#acquire()\*](#acquire():scala.concurrent.Future[Boolean]) or [Lease\#release](#release():scala.concurrent.Future[Boolean]).
4. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#release():scala.concurrent.Future[Boolean] "Permalink") abstract  def release(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]Release the lease so some other owner can acquire it.
### Concrete Value Members

1. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/coordination/lease/scaladsl/Lease.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Lease toany2stringadd\[Lease] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Lease, B)ImplicitThis member is added by an implicit conversion from Lease toArrowAssoc\[Lease] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Lease) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeaseImplicitThis member is added by an implicit conversion from Lease toEnsuring\[Lease] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Lease) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeaseImplicitThis member is added by an implicit conversion from Lease toEnsuring\[Lease] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LeaseImplicitThis member is added by an implicit conversion from Lease toEnsuring\[Lease] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LeaseImplicitThis member is added by an implicit conversion from Lease toEnsuring\[Lease] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#settings:akka.coordination.lease.LeaseSettings "Permalink")  val settings: [LeaseSettings](../LeaseSettings.html)
21. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Lease toStringFormat\[Lease] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/coordination/lease/scaladsl/Lease.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Lease, B)ImplicitThis member is added by an implicit conversion from Lease toArrowAssoc\[Lease] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLease to any2stringadd\[Lease]

### Inherited by implicit conversion StringFormat fromLease to StringFormat\[Lease]

### Inherited by implicit conversion Ensuring fromLease to Ensuring\[Lease]

### Inherited by implicit conversion ArrowAssoc fromLease to ArrowAssoc\[Lease]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/coordination/index.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseException.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/LeaseSettings.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/index.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/scaladsl/Lease.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/scaladsl/LeaseProvider$.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/scaladsl/LeaseProvider.html
- https://doc.akka.io/api/akka/current/akka/coordination/lease/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/coordination/lease/scaladsl/Lease.html](https://doc.akka.io/api/akka/current/akka/coordination/lease/scaladsl/Lease.html)*