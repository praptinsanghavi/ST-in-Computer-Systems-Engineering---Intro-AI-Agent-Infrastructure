---
description: Akka 2.10.17 - akka.discovery.ServiceDiscovery
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:36:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/discovery/ServiceDiscovery.html
title: Akka 2.10.17 - akka.discovery.ServiceDiscovery
---

# Akka 2.10.17 - akka.discovery.ServiceDiscovery

> **Summary:** Akka 2.10.17 - akka.discovery.ServiceDiscovery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](index.html)Definition Classes[akka](../index.html)
- [Discovery](Discovery.html)
- [Lookup](Lookup.html "A service lookup.")
- ServiceDiscovery
[c](ServiceDiscovery$.html "See companion object")[akka](../index.html).[discovery](index.html)

# [ServiceDiscovery](ServiceDiscovery$.html "See companion object")[**](../../akka/discovery/ServiceDiscovery.html "Permalink")

### Companion [object ServiceDiscovery](ServiceDiscovery$.html "See companion object")

#### abstract  class ServiceDiscovery extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Implement to provide a service discovery method

Source[ServiceDiscovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/main/scala/akka/discovery/ServiceDiscovery.scala#L302)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServiceDiscovery
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

1. [**](../../akka/discovery/ServiceDiscovery.html#<init>():akka.discovery.ServiceDiscovery "Permalink")  new ServiceDiscovery()
### Abstract Value Members

1. [**](../../akka/discovery/ServiceDiscovery.html#lookup(lookup:akka.discovery.Lookup,resolveTimeout:scala.concurrent.duration.FiniteDuration):scala.concurrent.Future[akka.discovery.ServiceDiscovery.Resolved] "Permalink") abstract  def lookup(lookup: [Lookup](Lookup.html), resolveTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Resolved](ServiceDiscovery$$Resolved.html)]Scala API: Perform lookup using underlying discovery implementation.

Scala API: Perform lookup using underlying discovery implementation.

lookupA service discovery lookup.

resolveTimeoutTimeout. Up to the discovery\-method to adhere to his

returnsResolved future should be failed with a \[DiscoveryTimeoutException] if the `resolveTimeout` is exceeded.
### Concrete Value Members

1. [**](../../akka/discovery/ServiceDiscovery.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/discovery/ServiceDiscovery.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/discovery/ServiceDiscovery.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ServiceDiscovery toany2stringadd\[ServiceDiscovery] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/discovery/ServiceDiscovery.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ServiceDiscovery, B)ImplicitThis member is added by an implicit conversion from ServiceDiscovery toArrowAssoc\[ServiceDiscovery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/discovery/ServiceDiscovery.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/discovery/ServiceDiscovery.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/discovery/ServiceDiscovery.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/discovery/ServiceDiscovery.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ServiceDiscovery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServiceDiscoveryImplicitThis member is added by an implicit conversion from ServiceDiscovery toEnsuring\[ServiceDiscovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/discovery/ServiceDiscovery.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ServiceDiscovery) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServiceDiscoveryImplicitThis member is added by an implicit conversion from ServiceDiscovery toEnsuring\[ServiceDiscovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/discovery/ServiceDiscovery.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ServiceDiscoveryImplicitThis member is added by an implicit conversion from ServiceDiscovery toEnsuring\[ServiceDiscovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/discovery/ServiceDiscovery.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ServiceDiscoveryImplicitThis member is added by an implicit conversion from ServiceDiscovery toEnsuring\[ServiceDiscovery] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/discovery/ServiceDiscovery.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/discovery/ServiceDiscovery.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/discovery/ServiceDiscovery.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/discovery/ServiceDiscovery.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/discovery/ServiceDiscovery.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/discovery/ServiceDiscovery.html#lookup(serviceName:String,resolveTimeout:java.time.Duration):java.util.concurrent.CompletionStage[akka.discovery.ServiceDiscovery.Resolved] "Permalink")  def lookup(serviceName: String, resolveTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Resolved](ServiceDiscovery$$Resolved.html)]Java API

Java API

Convenience lookup accepting a name. If the name is a valid SRV entry, an SRV lookup is done, otherwise
a regular lookup. For more control use the overload accepting a [Lookup](Lookup.html).

serviceNameA name, see discovery\-method's docs for how this is interpreted

resolveTimeoutTimeout. Up to the discovery\-method to adhere to this and complete the CompletionStage with a
 \[DiscoveryTimeoutException]
18. [**](../../akka/discovery/ServiceDiscovery.html#lookup(query:akka.discovery.Lookup,resolveTimeout:java.time.Duration):java.util.concurrent.CompletionStage[akka.discovery.ServiceDiscovery.Resolved] "Permalink")  def lookup(query: [Lookup](Lookup.html), resolveTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Resolved](ServiceDiscovery$$Resolved.html)]Java API: Perform basic lookup using underlying discovery implementation.

Java API: Perform basic lookup using underlying discovery implementation.

While the implementation may provide other settings and ways to configure timeouts,
the passed `resolveTimeout` should never be exceeded, as it signals the application's
eagerness to wait for a result for this specific lookup.

The returned future should be failed once resolveTimeout has passed with a DiscoveryTimeoutException.
19. [**](../../akka/discovery/ServiceDiscovery.html#lookup(serviceName:String,resolveTimeout:scala.concurrent.duration.FiniteDuration):scala.concurrent.Future[akka.discovery.ServiceDiscovery.Resolved] "Permalink")  def lookup(serviceName: String, resolveTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Resolved](ServiceDiscovery$$Resolved.html)]Scala API: Perform lookup using underlying discovery implementation.

Scala API: Perform lookup using underlying discovery implementation.

Convenience lookup accepting a name. If the name is a valid SRV entry, an SRV lookup is done, otherwise
a regular lookup. For more control use the overload accepting a [Lookup](Lookup.html).
20. [**](../../akka/discovery/ServiceDiscovery.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/discovery/ServiceDiscovery.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/discovery/ServiceDiscovery.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/discovery/ServiceDiscovery.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../akka/discovery/ServiceDiscovery.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../akka/discovery/ServiceDiscovery.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../akka/discovery/ServiceDiscovery.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../akka/discovery/ServiceDiscovery.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/discovery/ServiceDiscovery.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/discovery/ServiceDiscovery.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ServiceDiscovery toStringFormat\[ServiceDiscovery] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/discovery/ServiceDiscovery.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ServiceDiscovery, B)ImplicitThis member is added by an implicit conversion from ServiceDiscovery toArrowAssoc\[ServiceDiscovery] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromServiceDiscovery to any2stringadd\[ServiceDiscovery]

### Inherited by implicit conversion StringFormat fromServiceDiscovery to StringFormat\[ServiceDiscovery]

### Inherited by implicit conversion Ensuring fromServiceDiscovery to Ensuring\[ServiceDiscovery]

### Inherited by implicit conversion ArrowAssoc fromServiceDiscovery to ArrowAssoc\[ServiceDiscovery]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/discovery/Discovery$.html
- https://doc.akka.io/api/akka/current/akka/discovery/Discovery.html
- https://doc.akka.io/api/akka/current/akka/discovery/Lookup$.html
- https://doc.akka.io/api/akka/current/akka/discovery/Lookup.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$$Resolved.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery.html
- https://doc.akka.io/api/akka/current/akka/discovery/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery.html](https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery.html)*