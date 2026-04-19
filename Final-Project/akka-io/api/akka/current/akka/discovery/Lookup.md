---
description: Akka 2.10.17 - akka.discovery.Lookup
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:36:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/discovery/Lookup.html
title: Akka 2.10.17 - akka.discovery.Lookup
---

# Akka 2.10.17 - akka.discovery.Lookup

> **Summary:** Akka 2.10.17 - akka.discovery.Lookup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](index.html)Definition Classes[akka](../index.html)
- [Discovery](Discovery.html)
- Lookup
- [ServiceDiscovery](ServiceDiscovery.html "Implement to provide a service discovery method")
[c](Lookup$.html "See companion object")[akka](../index.html).[discovery](index.html)

# [Lookup](Lookup$.html "See companion object")[**](../../akka/discovery/Lookup.html "Permalink")

### Companion [object Lookup](Lookup$.html "See companion object")

#### final  class Lookup extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

A service lookup. It is up to each method to decide
what to do with the optional portName and protocol fields.
For example `portName` could be used to distinguish between
Akka remoting ports and HTTP ports.

Source[ServiceDiscovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/main/scala/akka/discovery/ServiceDiscovery.scala#L140)Linear Supertypes[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Lookup
2. NoSerializationVerificationNeeded
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

1. [**](../../akka/discovery/Lookup.html#<init>(serviceName:String,portName:Option[String],protocol:Option[String]):akka.discovery.Lookup "Permalink")  new Lookup(serviceName: String, portName: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], protocol: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String])
2. [**](../../akka/discovery/Lookup.html#<init>(serviceName:String,portName:Option[String],protocol:Option[String],discardCache:Boolean):akka.discovery.Lookup "Permalink")  new Lookup(serviceName: String, portName: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], protocol: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], discardCache: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))serviceNamemust not be 'null' or an empty String

discardCacheAsk the discovery implementation to drop any cached result and do a new resolution.
 Optionally supported by implementations.
### Value Members

1. [**](../../akka/discovery/Lookup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/discovery/Lookup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/discovery/Lookup.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Lookup toany2stringadd\[Lookup] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/discovery/Lookup.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Lookup, B)ImplicitThis member is added by an implicit conversion from Lookup toArrowAssoc\[Lookup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/discovery/Lookup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/discovery/Lookup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/discovery/Lookup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/discovery/Lookup.html#discardCache:Boolean "Permalink")  val discardCache: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
9. [**](../../akka/discovery/Lookup.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Lookup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LookupImplicitThis member is added by an implicit conversion from Lookup toEnsuring\[Lookup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/discovery/Lookup.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Lookup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LookupImplicitThis member is added by an implicit conversion from Lookup toEnsuring\[Lookup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/discovery/Lookup.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LookupImplicitThis member is added by an implicit conversion from Lookup toEnsuring\[Lookup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/discovery/Lookup.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LookupImplicitThis member is added by an implicit conversion from Lookup toEnsuring\[Lookup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/discovery/Lookup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/discovery/Lookup.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesLookup → AnyRef → Any
15. [**](../../akka/discovery/Lookup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/discovery/Lookup.html#getPortName:java.util.Optional[String] "Permalink")  def getPortName: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String]Java API
17. [**](../../akka/discovery/Lookup.html#getProtocol:java.util.Optional[String] "Permalink")  def getProtocol: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String]Java API
18. [**](../../akka/discovery/Lookup.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesLookup → AnyRef → Any
19. [**](../../akka/discovery/Lookup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../akka/discovery/Lookup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/discovery/Lookup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/discovery/Lookup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/discovery/Lookup.html#portName:Option[String] "Permalink")  val portName: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
24. [**](../../akka/discovery/Lookup.html#protocol:Option[String] "Permalink")  val protocol: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
25. [**](../../akka/discovery/Lookup.html#serviceName:String "Permalink")  val serviceName: String
26. [**](../../akka/discovery/Lookup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../akka/discovery/Lookup.html#toString():String "Permalink")  def toString(): StringDefinition ClassesLookup → AnyRef → Any
28. [**](../../akka/discovery/Lookup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../akka/discovery/Lookup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../akka/discovery/Lookup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../akka/discovery/Lookup.html#withDiscardCache:akka.discovery.Lookup "Permalink")  def withDiscardCache: LookupAsk the discovery implementation to drop any cached result and do a new resolution.

Ask the discovery implementation to drop any cached result and do a new resolution.
Optionally supported by implementations.
32. [**](../../akka/discovery/Lookup.html#withPortName(value:String):akka.discovery.Lookup "Permalink")  def withPortName(value: String): LookupWhich port for a service e.g.

Which port for a service e.g. Akka remoting or HTTP.
Maps to "service" for an SRV records.
33. [**](../../akka/discovery/Lookup.html#withProtocol(value:String):akka.discovery.Lookup "Permalink")  def withProtocol(value: String): LookupWhich protocol e.g.

Which protocol e.g. TCP or UDP.
Maps to "protocol" for SRV records.
### Deprecated Value Members

1. [**](../../akka/discovery/Lookup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/discovery/Lookup.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Lookup toStringFormat\[Lookup] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/discovery/Lookup.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Lookup, B)ImplicitThis member is added by an implicit conversion from Lookup toArrowAssoc\[Lookup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLookup to any2stringadd\[Lookup]

### Inherited by implicit conversion StringFormat fromLookup to StringFormat\[Lookup]

### Inherited by implicit conversion Ensuring fromLookup to Ensuring\[Lookup]

### Inherited by implicit conversion ArrowAssoc fromLookup to ArrowAssoc\[Lookup]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/current/akka/discovery/Discovery$.html
- https://doc.akka.io/api/akka/current/akka/discovery/Discovery.html
- https://doc.akka.io/api/akka/current/akka/discovery/Lookup$.html
- https://doc.akka.io/api/akka/current/akka/discovery/Lookup.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery.html
- https://doc.akka.io/api/akka/current/akka/discovery/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/discovery/Lookup.html](https://doc.akka.io/api/akka/current/akka/discovery/Lookup.html)*