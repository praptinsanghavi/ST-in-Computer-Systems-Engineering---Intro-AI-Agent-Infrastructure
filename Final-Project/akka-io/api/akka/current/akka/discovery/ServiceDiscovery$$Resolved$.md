---
description: Akka 2.10.17 - akka.discovery.ServiceDiscovery.Resolved
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:25:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/discovery/ServiceDiscovery$$Resolved$.html
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
- [Resolved](ServiceDiscovery$$Resolved.html "Result of a successful resolve request")
- [ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html "Resolved target host, with optional port and the IP address.")
[o](ServiceDiscovery$$Resolved.html "See companion class")[akka](../index.html).[discovery](index.html).[ServiceDiscovery](ServiceDiscovery$.html)

# [Resolved](ServiceDiscovery$$Resolved.html "See companion class")[**](../../akka/discovery/ServiceDiscovery$$Resolved$.html "Permalink")

### Companion [class Resolved](ServiceDiscovery$$Resolved.html "See companion class")

#### object Resolved

Source[ServiceDiscovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/main/scala/akka/discovery/ServiceDiscovery.scala#L32)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Resolved
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#apply(serviceName:String,addresses:Seq[akka.discovery.ServiceDiscovery.ResolvedTarget]):akka.discovery.ServiceDiscovery.Resolved "Permalink")  def apply(serviceName: String, addresses: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html)]): [Resolved](ServiceDiscovery$$Resolved.html)
5. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#unapply(resolved:akka.discovery.ServiceDiscovery.Resolved):Option[(String,Seq[akka.discovery.ServiceDiscovery.ResolvedTarget])] "Permalink")  def unapply(resolved: [Resolved](ServiceDiscovery$$Resolved.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[(String, [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html)])]
18. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/discovery/ServiceDiscovery$$Resolved$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$$DiscoveryTimeoutException.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$$Resolved$.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$$Resolved.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$$ResolvedTarget$.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$$ResolvedTarget.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$.html
- https://doc.akka.io/api/akka/current/akka/discovery/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$$Resolved$.html](https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$$Resolved$.html)*