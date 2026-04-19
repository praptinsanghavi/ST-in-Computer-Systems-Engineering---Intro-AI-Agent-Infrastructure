---
description: Akka 2.10.17 - akka.discovery.ServiceDiscovery.ResolvedTarget
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:25:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/discovery/ServiceDiscovery$$ResolvedTarget$.html
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
- [ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html "Resolved target host, with optional port and the IP address.")
[o](ServiceDiscovery$$ResolvedTarget.html "See companion class")[akka](../index.html).[discovery](index.html).[ServiceDiscovery](ServiceDiscovery$.html)

# [ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html "See companion class")[**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html "Permalink")

### Companion [class ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html "See companion class")

#### object ResolvedTarget

Source[ServiceDiscovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/main/scala/akka/discovery/ServiceDiscovery.scala#L69)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ResolvedTarget
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#addressOrdering:Ordering[akka.discovery.ServiceDiscovery.ResolvedTarget] "Permalink") implicit  val addressOrdering: Ordering\[[ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html)]
5. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#apply(host:String,port:Option[Int],address:Option[java.net.InetAddress]):akka.discovery.ServiceDiscovery.ResolvedTarget "Permalink")  def apply(host: String, port: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], address: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)]): [ResolvedTarget](ServiceDiscovery$$ResolvedTarget.html)hostthe hostname or the IP address of the target

portoptional port number

addressIP address of the target. This is used during cluster bootstap when available.
6. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/discovery/ServiceDiscovery$$ResolvedTarget$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
*Source: [https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$$ResolvedTarget$.html](https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$$ResolvedTarget$.html)*