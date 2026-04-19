---
description: Akka 2.10.17 - akka.discovery.ServiceDiscovery.Resolved
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:01:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/discovery/ServiceDiscovery$$Resolved.html
title: Akka 2.10.17 - akka.discovery.ServiceDiscovery.Resolved
---

# Akka 2.10.17 - akka.discovery.ServiceDiscovery.Resolved

> **Summary:** Akka 2.10.17 - akka.discovery.ServiceDiscovery.Resolved

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/ServiceDiscovery$.html "Permalink")  object [ServiceDiscovery](ServiceDiscovery$.html)Definition Classes[discovery](index.html)
- [DiscoveryTimeoutException](ServiceDiscovery$$DiscoveryTimeoutException.html "Future returned by resolve(name, timeout) should be failed with this exception if the underlying mechanism was unable to resolve the name within the given timeout.")
- Resolved
- [ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html "Resolved target host, with optional port and the IP address.")
[c](ServiceDiscovery$$Resolved$.html "See companion object")[akka](../index.html).[discovery](index.html).[ServiceDiscovery](ServiceDiscovery$.html)

# [Resolved](ServiceDiscovery$$Resolved$.html "See companion object")[**](../../akka/discovery/ServiceDiscovery$$Resolved.html "Permalink")

### Companion [object Resolved](ServiceDiscovery$$Resolved$.html "See companion object")

#### final  class Resolved extends [DeadLetterSuppression](../actor/DeadLetterSuppression.html) with [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

Result of a successful resolve request

Source[ServiceDiscovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/main/scala/akka/discovery/ServiceDiscovery.scala#L41)Linear Supertypes[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html), [DeadLetterSuppression](../actor/DeadLetterSuppression.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Resolved
2. NoSerializationVerificationNeeded
3. DeadLetterSuppression
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

1. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#<init>(serviceName:String,addresses:Seq[akka.discovery.ServiceDiscovery.ResolvedTarget]):akka.discovery.ServiceDiscovery.Resolved "Permalink")  new Resolved(serviceName: String, addresses: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html)])
### Value Members

1. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Resolved toany2stringadd\[Resolved] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Resolved, B)ImplicitThis member is added by an implicit conversion from Resolved toArrowAssoc\[Resolved] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#addresses:Seq[akka.discovery.ServiceDiscovery.ResolvedTarget] "Permalink")  val addresses: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html)]
7. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Resolved) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Resolved) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResolvedImplicitThis member is added by an implicit conversion from Resolved toEnsuring\[Resolved] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesResolved → AnyRef → Any
15. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#getAddresses:java.util.List[akka.discovery.ServiceDiscovery.ResolvedTarget] "Permalink")  def getAddresses: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html)]Java API
16. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesResolved → AnyRef → Any
18. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#serviceName:String "Permalink")  val serviceName: String
23. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#toString():String "Permalink")  def toString(): StringDefinition ClassesResolved → AnyRef → Any
25. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Resolved toStringFormat\[Resolved] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Resolved, B)ImplicitThis member is added by an implicit conversion from Resolved toArrowAssoc\[Resolved] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

### Inherited from [DeadLetterSuppression](../actor/DeadLetterSuppression.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromResolved to any2stringadd\[Resolved]

### Inherited by implicit conversion StringFormat fromResolved to StringFormat\[Resolved]

### Inherited by implicit conversion Ensuring fromResolved to Ensuring\[Resolved]

### Inherited by implicit conversion ArrowAssoc fromResolved to ArrowAssoc\[Resolved]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$DiscoveryTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$Resolved$.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$Resolved.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$ResolvedTarget$.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$ResolvedTarget.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$Resolved.html](https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$Resolved.html)*