---
description: Akka 2.10.17 - akka.discovery.ServiceDiscovery.ResolvedTarget
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:01:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/discovery/ServiceDiscovery$$ResolvedTarget.html
title: Akka 2.10.17 - akka.discovery.ServiceDiscovery.ResolvedTarget
---

# Akka 2.10.17 - akka.discovery.ServiceDiscovery.ResolvedTarget

> **Summary:** Akka 2.10.17 - akka.discovery.ServiceDiscovery.ResolvedTarget

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/ServiceDiscovery$.html "Permalink")  object [ServiceDiscovery](ServiceDiscovery$.html)Definition Classes[discovery](index.html)
- [DiscoveryTimeoutException](ServiceDiscovery$$DiscoveryTimeoutException.html "Future returned by resolve(name, timeout) should be failed with this exception if the underlying mechanism was unable to resolve the name within the given timeout.")
- [Resolved](ServiceDiscovery$$Resolved.html "Result of a successful resolve request")
- ResolvedTarget
[c](ServiceDiscovery$$ResolvedTarget$.html "See companion object")[akka](../index.html).[discovery](index.html).[ServiceDiscovery](ServiceDiscovery$.html)

# [ResolvedTarget](ServiceDiscovery$$ResolvedTarget$.html "See companion object")[**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html "Permalink")

### Companion [object ResolvedTarget](ServiceDiscovery$$ResolvedTarget$.html "See companion object")

#### final  class ResolvedTarget extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

Resolved target host, with optional port and the IP address.

Source[ServiceDiscovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/main/scala/akka/discovery/ServiceDiscovery.scala#L96)Linear Supertypes[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ResolvedTarget
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

1. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#<init>(host:String,port:Option[Int],address:Option[java.net.InetAddress]):akka.discovery.ServiceDiscovery.ResolvedTarget "Permalink")  new ResolvedTarget(host: String, port: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], address: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)])hostthe hostname or the IP address of the target

portoptional port number

addressoptional IP address of the target. This is used during cluster bootstap when available.
### Value Members

1. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ResolvedTarget toany2stringadd\[ResolvedTarget] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ResolvedTarget, B)ImplicitThis member is added by an implicit conversion from ResolvedTarget toArrowAssoc\[ResolvedTarget] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#address:Option[java.net.InetAddress] "Permalink")  val address: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)]
7. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ResolvedTarget) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResolvedTargetImplicitThis member is added by an implicit conversion from ResolvedTarget toEnsuring\[ResolvedTarget] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ResolvedTarget) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResolvedTargetImplicitThis member is added by an implicit conversion from ResolvedTarget toEnsuring\[ResolvedTarget] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResolvedTargetImplicitThis member is added by an implicit conversion from ResolvedTarget toEnsuring\[ResolvedTarget] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResolvedTargetImplicitThis member is added by an implicit conversion from ResolvedTarget toEnsuring\[ResolvedTarget] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesResolvedTarget → AnyRef → Any
15. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#getAddress:java.util.Optional[java.net.InetAddress] "Permalink")  def getAddress: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)]Java API
16. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#getPort:java.util.Optional[Int] "Permalink")  def getPort: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]Java API
18. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesResolvedTarget → AnyRef → Any
19. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#host:String "Permalink")  val host: String
20. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#port:Option[Int] "Permalink")  val port: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
25. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#toString():String "Permalink")  def toString(): StringDefinition ClassesResolvedTarget → AnyRef → Any
27. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ResolvedTarget toStringFormat\[ResolvedTarget] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ResolvedTarget, B)ImplicitThis member is added by an implicit conversion from ResolvedTarget toArrowAssoc\[ResolvedTarget] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromResolvedTarget to any2stringadd\[ResolvedTarget]

### Inherited by implicit conversion StringFormat fromResolvedTarget to StringFormat\[ResolvedTarget]

### Inherited by implicit conversion Ensuring fromResolvedTarget to Ensuring\[ResolvedTarget]

### Inherited by implicit conversion ArrowAssoc fromResolvedTarget to ArrowAssoc\[ResolvedTarget]

### Ungrouped

## Related Pages (Internal Links)

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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$ResolvedTarget.html](https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$ResolvedTarget.html)*