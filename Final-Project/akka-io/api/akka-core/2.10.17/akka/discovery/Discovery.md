---
description: Akka 2.10.17 - akka.discovery.Discovery
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:43:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/discovery/Discovery.html
title: Akka 2.10.17 - akka.discovery.Discovery
---

# Akka 2.10.17 - akka.discovery.Discovery

> **Summary:** Akka 2.10.17 - akka.discovery.Discovery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](index.html)Definition Classes[akka](../index.html)
- Discovery
- [Lookup](Lookup.html "A service lookup.")
- [ServiceDiscovery](ServiceDiscovery.html "Implement to provide a service discovery method")
[c](Discovery$.html "See companion object")[akka](../index.html).[discovery](index.html)

# [Discovery](Discovery$.html "See companion object")[**](../../akka/discovery/Discovery.html "Permalink")

### Companion [object Discovery](Discovery$.html "See companion object")

#### final  class Discovery extends [Extension](../actor/Extension.html)

Source[Discovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/main/scala/akka/discovery/Discovery.scala#L15)Linear Supertypes[Extension](../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Discovery
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

1. [**](../../akka/discovery/Discovery.html#<init>()(implicitsystem:akka.actor.ExtendedActorSystem):akka.discovery.Discovery "Permalink")  new Discovery()(implicit system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../akka/discovery/Discovery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/discovery/Discovery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/discovery/Discovery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Discovery toany2stringadd\[Discovery] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/discovery/Discovery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Discovery, B)ImplicitThis member is added by an implicit conversion from Discovery toArrowAssoc\[Discovery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/discovery/Discovery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/discovery/Discovery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/discovery/Discovery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/discovery/Discovery.html#discovery:akka.discovery.ServiceDiscovery "Permalink")  def discovery: [ServiceDiscovery](ServiceDiscovery.html)Default [ServiceDiscovery](ServiceDiscovery.html) as configured in `akka.discovery.method`.

Default [ServiceDiscovery](ServiceDiscovery.html) as configured in `akka.discovery.method`.

Annotations@throws("")
9. [**](../../akka/discovery/Discovery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Discovery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DiscoveryImplicitThis member is added by an implicit conversion from Discovery toEnsuring\[Discovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/discovery/Discovery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Discovery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DiscoveryImplicitThis member is added by an implicit conversion from Discovery toEnsuring\[Discovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/discovery/Discovery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DiscoveryImplicitThis member is added by an implicit conversion from Discovery toEnsuring\[Discovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/discovery/Discovery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DiscoveryImplicitThis member is added by an implicit conversion from Discovery toEnsuring\[Discovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/discovery/Discovery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/discovery/Discovery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/discovery/Discovery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/discovery/Discovery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/discovery/Discovery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/discovery/Discovery.html#loadServiceDiscovery(method:String):akka.discovery.ServiceDiscovery "Permalink")  def loadServiceDiscovery(method: String): [ServiceDiscovery](ServiceDiscovery.html)Create a [ServiceDiscovery](ServiceDiscovery.html) from configuration property.

Create a [ServiceDiscovery](ServiceDiscovery.html) from configuration property.
The given `method` parameter is used to find configuration property
"akka.discovery.\[method].class".

The `ServiceDiscovery` instance for a given `method` will be created
once and subsequent requests for the same `method` will return the same instance.
19. [**](../../akka/discovery/Discovery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/discovery/Discovery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/discovery/Discovery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/discovery/Discovery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/discovery/Discovery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../akka/discovery/Discovery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/discovery/Discovery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/discovery/Discovery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/discovery/Discovery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/discovery/Discovery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Discovery toStringFormat\[Discovery] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/discovery/Discovery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Discovery, B)ImplicitThis member is added by an implicit conversion from Discovery toArrowAssoc\[Discovery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDiscovery to any2stringadd\[Discovery]

### Inherited by implicit conversion StringFormat fromDiscovery to StringFormat\[Discovery]

### Inherited by implicit conversion Ensuring fromDiscovery to Ensuring\[Discovery]

### Inherited by implicit conversion ArrowAssoc fromDiscovery to ArrowAssoc\[Discovery]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/discovery/Discovery$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/discovery/Discovery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/discovery/Lookup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/discovery/Lookup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/discovery/ServiceDiscovery$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/discovery/ServiceDiscovery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/discovery/Discovery.html](https://doc.akka.io/api/akka-core/2.10.17/akka/discovery/Discovery.html)*