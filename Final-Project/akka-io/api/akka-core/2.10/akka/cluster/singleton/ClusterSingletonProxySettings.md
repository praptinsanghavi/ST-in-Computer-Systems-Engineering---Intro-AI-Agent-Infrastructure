---
description: Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonProxySettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonProxySettings.html
title: Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonProxySettings
---

# Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonProxySettings

> **Summary:** Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonProxySettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](index.html)Definition Classes[cluster](../index.html)
- [ClusterSingletonManager](ClusterSingletonManager.html "Manages singleton actor instance among all cluster nodes or a group of nodes tagged with a specific role.")
- [ClusterSingletonManagerIsStuck](ClusterSingletonManagerIsStuck.html "Thrown when a consistent state can't be determined within the defined retry limits.")
- [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)
- [ClusterSingletonMessage](ClusterSingletonMessage.html "Marker trait for remote messages with special serializer.")
- [ClusterSingletonProxy](ClusterSingletonProxy.html "The ClusterSingletonProxy works together with the akka.cluster.singleton.ClusterSingletonManager to provide a distributed proxy to the singleton actor.")
- ClusterSingletonProxySettings
[c](ClusterSingletonProxySettings$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[singleton](index.html)

# [ClusterSingletonProxySettings](ClusterSingletonProxySettings$.html "See companion object")[**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html "Permalink")

### Companion [object ClusterSingletonProxySettings](ClusterSingletonProxySettings$.html "See companion object")

#### final  class ClusterSingletonProxySettings extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

Annotations@nowarn() Source[ClusterSingletonProxy.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/scala/akka/cluster/singleton/ClusterSingletonProxy.scala#L82)Linear Supertypes[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSingletonProxySettings
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

1. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#<init>(singletonName:String,role:Option[String],singletonIdentificationInterval:scala.concurrent.duration.FiniteDuration,bufferSize:Int):akka.cluster.singleton.ClusterSingletonProxySettings "Permalink")  new ClusterSingletonProxySettings(singletonName: String, role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], singletonIdentificationInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
2. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#<init>(singletonName:String,role:Option[String],dataCenter:Option[akka.cluster.ClusterSettings.DataCenter],singletonIdentificationInterval:scala.concurrent.duration.FiniteDuration,bufferSize:Int):akka.cluster.singleton.ClusterSingletonProxySettings "Permalink")  new ClusterSingletonProxySettings(singletonName: String, role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../ClusterSettings$.html#DataCenter=String)], singletonIdentificationInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))singletonNameThe actor name of the singleton actor that is started by the [ClusterSingletonManager](ClusterSingletonManager.html).

roleThe role of the cluster nodes where the singleton can be deployed. Corresponding to the `role`
 used by the `ClusterSingletonManager`. If the role is not specified it's a singleton among all
 nodes in the cluster, and the `ClusterSingletonManager` must then also be configured in
 same way.

dataCenterThe data center of the cluster nodes where the singleton is running. If None then the same data center as current node.

singletonIdentificationIntervalInterval at which the proxy will try to resolve the singleton instance.

bufferSizeIf the location of the singleton is unknown the proxy will buffer this number of messages
 and deliver them when the singleton is identified. When the buffer is full old messages will be dropped
 when new messages are sent viea the proxy. Use 0 to disable buffering, i.e. messages will be dropped
 immediately if the location of the singleton is unknown.
### Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonProxySettings toany2stringadd\[ClusterSingletonProxySettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterSingletonProxySettings, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonProxySettings toArrowAssoc\[ClusterSingletonProxySettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#bufferSize:Int "Permalink")  val bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
8. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterSingletonProxySettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSingletonProxySettingsImplicitThis member is added by an implicit conversion from ClusterSingletonProxySettings toEnsuring\[ClusterSingletonProxySettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterSingletonProxySettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSingletonProxySettingsImplicitThis member is added by an implicit conversion from ClusterSingletonProxySettings toEnsuring\[ClusterSingletonProxySettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSingletonProxySettingsImplicitThis member is added by an implicit conversion from ClusterSingletonProxySettings toEnsuring\[ClusterSingletonProxySettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSingletonProxySettingsImplicitThis member is added by an implicit conversion from ClusterSingletonProxySettings toEnsuring\[ClusterSingletonProxySettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#role:Option[String] "Permalink")  val role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]
22. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#singletonIdentificationInterval:scala.concurrent.duration.FiniteDuration "Permalink")  val singletonIdentificationInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
23. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#singletonName:String "Permalink")  val singletonName: String
24. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#withBufferSize(bufferSize:Int):akka.cluster.singleton.ClusterSingletonProxySettings "Permalink")  def withBufferSize(bufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ClusterSingletonProxySettings
30. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#withRole(role:Option[String]):akka.cluster.singleton.ClusterSingletonProxySettings "Permalink")  def withRole(role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]): ClusterSingletonProxySettings
31. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#withRole(role:String):akka.cluster.singleton.ClusterSingletonProxySettings "Permalink")  def withRole(role: String): ClusterSingletonProxySettings
32. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#withSingletonIdentificationInterval(singletonIdentificationInterval:scala.concurrent.duration.FiniteDuration):akka.cluster.singleton.ClusterSingletonProxySettings "Permalink")  def withSingletonIdentificationInterval(singletonIdentificationInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ClusterSingletonProxySettings
33. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#withSingletonName(name:String):akka.cluster.singleton.ClusterSingletonProxySettings "Permalink")  def withSingletonName(name: String): ClusterSingletonProxySettings
### Deprecated Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#dataCenter:Option[akka.cluster.ClusterSettings.DataCenter] "Permalink")  val dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../ClusterSettings$.html#DataCenter=String)]Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
2. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonProxySettings toStringFormat\[ClusterSingletonProxySettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#withDataCenter(dataCenter:Option[akka.cluster.ClusterSettings.DataCenter]):akka.cluster.singleton.ClusterSingletonProxySettings "Permalink")  def withDataCenter(dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../ClusterSettings$.html#DataCenter=String)]): ClusterSingletonProxySettingsAnnotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
5. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#withDataCenter(dataCenter:akka.cluster.ClusterSettings.DataCenter):akka.cluster.singleton.ClusterSingletonProxySettings "Permalink")  def withDataCenter(dataCenter: [DataCenter](../ClusterSettings$.html#DataCenter=String)): ClusterSingletonProxySettingsAnnotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
6. [**](../../../akka/cluster/singleton/ClusterSingletonProxySettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterSingletonProxySettings, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonProxySettings toArrowAssoc\[ClusterSingletonProxySettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterSingletonProxySettings to any2stringadd\[ClusterSingletonProxySettings]

### Inherited by implicit conversion StringFormat fromClusterSingletonProxySettings to StringFormat\[ClusterSingletonProxySettings]

### Inherited by implicit conversion Ensuring fromClusterSingletonProxySettings to Ensuring\[ClusterSingletonProxySettings]

### Inherited by implicit conversion ArrowAssoc fromClusterSingletonProxySettings to ArrowAssoc\[ClusterSingletonProxySettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonProxySettings.html)*