---
description: Akka 2.10.17 - akka.discovery.Lookup
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/discovery/Lookup$.html
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
- [Lookup](Lookup.html "A service lookup.")
- [ServiceDiscovery](ServiceDiscovery.html "Implement to provide a service discovery method")
[o](Lookup.html "See companion class")[akka](../index.html).[discovery](index.html)

# [Lookup](Lookup.html "See companion class")[**](../../akka/discovery/Lookup$.html "Permalink")

### Companion [class Lookup](Lookup.html "See companion class")

#### case object Lookup extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[ServiceDiscovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/main/scala/akka/discovery/ServiceDiscovery.scala#L207)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Lookup
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/discovery/Lookup$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/discovery/Lookup$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/discovery/Lookup$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/discovery/Lookup$.html#apply(serviceName:String,portName:Option[String],protocol:Option[String]):akka.discovery.Lookup "Permalink")  def apply(serviceName: String, portName: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], protocol: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]): [Lookup](Lookup.html)Create a service Lookup with `serviceName`, optional `portName` and optional `protocol`.
5. [**](../../akka/discovery/Lookup$.html#apply(serviceName:String):akka.discovery.Lookup "Permalink")  def apply(serviceName: String): [Lookup](Lookup.html)Create a service Lookup with only a serviceName.

Create a service Lookup with only a serviceName.
Use withPortName and withProtocol to provide optional portName
and protocol
6. [**](../../akka/discovery/Lookup$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/discovery/Lookup$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/discovery/Lookup$.html#create(serviceName:String):akka.discovery.Lookup "Permalink")  def create(serviceName: String): [Lookup](Lookup.html)Java API

Java API

Create a service Lookup with only a serviceName.
Use withPortName and withProtocol to provide optional portName
and protocol
9. [**](../../akka/discovery/Lookup$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/discovery/Lookup$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../akka/discovery/Lookup$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/discovery/Lookup$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../akka/discovery/Lookup$.html#isValidSrv(srv:String):Boolean "Permalink")  def isValidSrv(srv: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if passed string conforms with SRV format.

Returns true if passed string conforms with SRV format. Otherwise returns false.
14. [**](../../akka/discovery/Lookup$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/discovery/Lookup$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/discovery/Lookup$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/discovery/Lookup$.html#parseSrv(str:String):akka.discovery.Lookup "Permalink")  def parseSrv(str: String): [Lookup](Lookup.html)Create a service Lookup from a string with format:
\_portName.\_protocol.serviceName.

Create a service Lookup from a string with format:
\_portName.\_protocol.serviceName.
(as specified by https://www.ietf.org/rfc/rfc2782\.txt)

If the passed string conforms with this format, a SRV Lookup is returned.
The serviceName part must be a valid domain name.
(as defined in https://tools.ietf.org/html/rfc1034\)

The string is parsed and dismembered to build a Lookup as following:
Lookup(serviceName).withPortName(portName).withProtocol(protocol)

Exceptions thrown[`java.lang.IllegalArgumentException`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IllegalArgumentException.html) If the string doesn't not conform with the SRV format

[`java.lang.NullPointerException`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/NullPointerException.html) If the passed string is null
18. [**](../../akka/discovery/Lookup$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
19. [**](../../akka/discovery/Lookup$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../akka/discovery/Lookup$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/discovery/Lookup$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/discovery/Lookup$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/discovery/Lookup$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/discovery/Lookup$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/discovery/Discovery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/Discovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/Lookup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/Lookup.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/ServiceDiscovery.html
- https://doc.akka.io/api/akka-core/2.10/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/discovery/Lookup$.html](https://doc.akka.io/api/akka-core/2.10/akka/discovery/Lookup$.html)*