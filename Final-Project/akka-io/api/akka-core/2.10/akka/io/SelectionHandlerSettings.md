---
description: Akka 2.10.17 - akka.io.SelectionHandlerSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:21:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/SelectionHandlerSettings.html
title: Akka 2.10.17 - akka.io.SelectionHandlerSettings
---

# Akka 2.10.17 - akka.io.SelectionHandlerSettings

> **Summary:** Akka 2.10.17 - akka.io.SelectionHandlerSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/dns/index.html "Permalink")  package [dns](dns/index.html)Definition Classes[io](index.html)
- [BufferPool](BufferPool.html)
- [Dns](Dns.html "Not for user extension.")
- [DnsExt](DnsExt.html)
- [DnsProvider](DnsProvider.html "Where as it is possible to plug in alternative DNS implementations it is not recommended.")
- [IO](IO$.html "Entry point to Akka’s IO layer.")
- [Inet](Inet$.html)
- [InetAddressDnsProvider](InetAddressDnsProvider.html "INTERNAL API")
- [InetAddressDnsResolver](InetAddressDnsResolver.html "INTERNAL API")
- [IpVersionSelector](IpVersionSelector$.html "INTERNAL API")
- SelectionHandlerSettings
- [SimpleDnsCache](SimpleDnsCache.html)
- [SimpleDnsManager](SimpleDnsManager.html)
- [Tcp](Tcp$.html "TCP Extension for Akka’s IO layer.")
- [TcpExt](TcpExt.html)
- [TcpMessage](TcpMessage$.html)
- [TcpSO](TcpSO$.html "Java API for accessing socket options.")
- [Udp](Udp$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnected](UdpConnected$.html "UDP Extension for Akka’s IO layer.")
- [UdpConnectedExt](UdpConnectedExt.html)
- [UdpConnectedMessage](UdpConnectedMessage$.html "Java API: factory methods for the message types used when communicating with the UdpConnected service.")
- [UdpExt](UdpExt.html)
- [UdpMessage](UdpMessage$.html "Java API: factory methods for the message types used when communicating with the Udp service.")
- [UdpSO](UdpSO$.html)
c[akka](../index.html).[io](index.html)

# SelectionHandlerSettings[**](../../akka/io/SelectionHandlerSettings.html "Permalink")

### 

#### abstract  class SelectionHandlerSettings extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[SelectionHandler.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/SelectionHandler.scala#L29)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Settings](TcpExt$Settings.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SelectionHandlerSettings
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

1. [**](../../akka/io/SelectionHandlerSettings.html#<init>(config:com.typesafe.config.Config):akka.io.SelectionHandlerSettings "Permalink")  new SelectionHandlerSettings(config: Config)
### Abstract Value Members

1. [**](../../akka/io/SelectionHandlerSettings.html#MaxChannelsPerSelector:Int "Permalink") abstract  def MaxChannelsPerSelector: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
### Concrete Value Members

1. [**](../../akka/io/SelectionHandlerSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/io/SelectionHandlerSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/io/SelectionHandlerSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SelectionHandlerSettings toany2stringadd\[SelectionHandlerSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/io/SelectionHandlerSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SelectionHandlerSettings, B)ImplicitThis member is added by an implicit conversion from SelectionHandlerSettings toArrowAssoc\[SelectionHandlerSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/io/SelectionHandlerSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/io/SelectionHandlerSettings.html#MaxChannels:Int "Permalink")  val MaxChannels: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
7. [**](../../akka/io/SelectionHandlerSettings.html#SelectorAssociationRetries:Int "Permalink")  val SelectorAssociationRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
8. [**](../../akka/io/SelectionHandlerSettings.html#SelectorDispatcher:String "Permalink")  val SelectorDispatcher: String
9. [**](../../akka/io/SelectionHandlerSettings.html#TraceLogging:Boolean "Permalink")  val TraceLogging: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
10. [**](../../akka/io/SelectionHandlerSettings.html#WorkerDispatcher:String "Permalink")  val WorkerDispatcher: String
11. [**](../../akka/io/SelectionHandlerSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/io/SelectionHandlerSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/io/SelectionHandlerSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SelectionHandlerSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SelectionHandlerSettingsImplicitThis member is added by an implicit conversion from SelectionHandlerSettings toEnsuring\[SelectionHandlerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/io/SelectionHandlerSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SelectionHandlerSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SelectionHandlerSettingsImplicitThis member is added by an implicit conversion from SelectionHandlerSettings toEnsuring\[SelectionHandlerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/io/SelectionHandlerSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SelectionHandlerSettingsImplicitThis member is added by an implicit conversion from SelectionHandlerSettings toEnsuring\[SelectionHandlerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/io/SelectionHandlerSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SelectionHandlerSettingsImplicitThis member is added by an implicit conversion from SelectionHandlerSettings toEnsuring\[SelectionHandlerSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/io/SelectionHandlerSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/io/SelectionHandlerSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../akka/io/SelectionHandlerSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/io/SelectionHandlerSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/io/SelectionHandlerSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../akka/io/SelectionHandlerSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../akka/io/SelectionHandlerSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/io/SelectionHandlerSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/io/SelectionHandlerSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/io/SelectionHandlerSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../akka/io/SelectionHandlerSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/io/SelectionHandlerSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../akka/io/SelectionHandlerSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/io/SelectionHandlerSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/io/SelectionHandlerSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SelectionHandlerSettings toStringFormat\[SelectionHandlerSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/io/SelectionHandlerSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SelectionHandlerSettings, B)ImplicitThis member is added by an implicit conversion from SelectionHandlerSettings toArrowAssoc\[SelectionHandlerSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSelectionHandlerSettings to any2stringadd\[SelectionHandlerSettings]

### Inherited by implicit conversion StringFormat fromSelectionHandlerSettings to StringFormat\[SelectionHandlerSettings]

### Inherited by implicit conversion Ensuring fromSelectionHandlerSettings to Ensuring\[SelectionHandlerSettings]

### Inherited by implicit conversion ArrowAssoc fromSelectionHandlerSettings to ArrowAssoc\[SelectionHandlerSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/BufferPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Dns$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Dns.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/DnsExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/DnsProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/IO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Inet$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/InetAddressDnsProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/InetAddressDnsResolver.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/IpVersionSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SelectionHandlerSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsCache$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsCache.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsManager$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/SimpleDnsManager.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Tcp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpExt$Settings.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/TcpSO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Udp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnected$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnectedExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpConnectedMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpExt.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/UdpSO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/io/SelectionHandlerSettings.html](https://doc.akka.io/api/akka-core/2.10/akka/io/SelectionHandlerSettings.html)*