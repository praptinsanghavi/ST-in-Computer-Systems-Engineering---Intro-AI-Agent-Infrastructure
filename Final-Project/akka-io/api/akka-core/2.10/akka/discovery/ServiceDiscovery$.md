---
description: Akka 2.10.17 - akka.discovery.ServiceDiscovery
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/discovery/ServiceDiscovery$.html
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
- [ServiceDiscovery](ServiceDiscovery.html "Implement to provide a service discovery method")
[o](ServiceDiscovery.html "See companion class")[akka](../index.html).[discovery](index.html)

# [ServiceDiscovery](ServiceDiscovery.html "See companion class")[**](../../akka/discovery/ServiceDiscovery$.html "Permalink")

### Companion [class ServiceDiscovery](ServiceDiscovery.html "See companion class")

#### object ServiceDiscovery

Source[ServiceDiscovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/main/scala/akka/discovery/ServiceDiscovery.scala#L22)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ServiceDiscovery
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/discovery/ServiceDiscovery$$DiscoveryTimeoutException.html "Permalink") final  class [DiscoveryTimeoutException](ServiceDiscovery$$DiscoveryTimeoutException.html "Future returned by resolve(name, timeout) should be failed with this exception if the underlying mechanism was unable to resolve the name within the given timeout.") extends RuntimeExceptionFuture returned by resolve(name, timeout) should be failed with this exception
if the underlying mechanism was unable to resolve the name within the given timeout.

Future returned by resolve(name, timeout) should be failed with this exception
if the underlying mechanism was unable to resolve the name within the given timeout.

It is up to each implementation to implement timeouts.
2. [**](../../akka/discovery/ServiceDiscovery$$Resolved.html "Permalink") final  class [Resolved](ServiceDiscovery$$Resolved.html "Result of a successful resolve request") extends [DeadLetterSuppression](../actor/DeadLetterSuppression.html) with [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)Result of a successful resolve request
3. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget.html "Permalink") final  class [ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html "Resolved target host, with optional port and the IP address.") extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)Resolved target host, with optional port and the IP address.
### Value Members

1. [**](../../akka/discovery/ServiceDiscovery$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/discovery/ServiceDiscovery$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/discovery/ServiceDiscovery$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/discovery/ServiceDiscovery$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/discovery/ServiceDiscovery$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/discovery/ServiceDiscovery$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/discovery/ServiceDiscovery$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/discovery/ServiceDiscovery$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/discovery/ServiceDiscovery$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/discovery/ServiceDiscovery$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/discovery/ServiceDiscovery$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/discovery/ServiceDiscovery$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/discovery/ServiceDiscovery$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/discovery/ServiceDiscovery$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../akka/discovery/ServiceDiscovery$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../akka/discovery/ServiceDiscovery$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/discovery/ServiceDiscovery$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../akka/discovery/ServiceDiscovery$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html "Permalink")  object [Resolved](ServiceDiscovery$$Resolved$.html)
20. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html "Permalink")  object [ResolvedTarget](ServiceDiscovery$$ResolvedTarget$.html)
### Deprecated Value Members

1. [**](../../akka/discovery/ServiceDiscovery$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/Discovery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/Discovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/Lookup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/Lookup.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$DiscoveryTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$Resolved$.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$Resolved.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$ResolvedTarget$.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$$ResolvedTarget.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$.html](https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$.html)*