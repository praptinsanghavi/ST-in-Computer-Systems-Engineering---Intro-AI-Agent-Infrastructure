---
description: Akka 2.10.17 - akka.cluster.metrics.StandardMetrics.HeapMemory
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:54:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/StandardMetrics$$HeapMemory.html
title: Akka 2.10.17 - akka.cluster.metrics.StandardMetrics.HeapMemory
---

# Akka 2.10.17 - akka.cluster.metrics.StandardMetrics.HeapMemory

> **Summary:** Akka 2.10.17 - akka.cluster.metrics.StandardMetrics.HeapMemory

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/StandardMetrics$.html "Permalink")  object [StandardMetrics](StandardMetrics$.html "Definitions of the built-in standard metrics.")Definitions of the built\-in standard metrics.

Definitions of the built\-in standard metrics.

The following extractors and data structures makes it easy to consume the
[NodeMetrics](NodeMetrics.html) in for example load balancers.

Definition Classes[metrics](index.html)
- [Cpu](StandardMetrics$$Cpu.html)
- HeapMemory
[c](StandardMetrics$$HeapMemory$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[metrics](index.html).[StandardMetrics](StandardMetrics$.html)

# [HeapMemory](StandardMetrics$$HeapMemory$.html "See companion object")[**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html "Permalink")

### Companion [object HeapMemory](StandardMetrics$$HeapMemory$.html "See companion object")

#### final  case class HeapMemory(address: [Address](../../actor/Address.html), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), used: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), committed: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), max: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

The amount of used and committed memory will always be \<\= max if max is defined.
A memory allocation may fail if it attempts to increase the used memory such that used \> committed
even if used \<\= max is true (e.g. when the system virtual memory is low).

address[akka.actor.Address](../../actor/Address.html) of the node the metrics are gathered at

timestampthe time of sampling, in milliseconds since midnight, January 1, 1970 UTC

usedthe current sum of heap memory used from all heap memory pools (in bytes)

committedthe current sum of heap memory guaranteed to be available to the JVM
 from all heap memory pools (in bytes). Committed will always be greater than or equal to used.

maxthe maximum amount of memory (in bytes) that can be used for JVM memory management.
 Can be undefined on some OS.

Annotations@SerialVersionUID() Source[Metric.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/main/scala/akka/cluster/metrics/Metric.scala#L169)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HeapMemory
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
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

1. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#<init>(address:akka.actor.Address,timestamp:Long,used:Long,committed:Long,max:Option[Long]):akka.cluster.metrics.StandardMetrics.HeapMemory "Permalink")  new HeapMemory(address: [Address](../../actor/Address.html), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), used: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), committed: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), max: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)])address[akka.actor.Address](../../actor/Address.html) of the node the metrics are gathered at

timestampthe time of sampling, in milliseconds since midnight, January 1, 1970 UTC

usedthe current sum of heap memory used from all heap memory pools (in bytes)

committedthe current sum of heap memory guaranteed to be available to the JVM
 from all heap memory pools (in bytes). Committed will always be greater than or equal to used.

maxthe maximum amount of memory (in bytes) that can be used for JVM memory management.
 Can be undefined on some OS.
### Value Members

1. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HeapMemory toany2stringadd\[HeapMemory] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HeapMemory, B)ImplicitThis member is added by an implicit conversion from HeapMemory toArrowAssoc\[HeapMemory] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#address:akka.actor.Address "Permalink")  val address: [Address](../../actor/Address.html)
7. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#committed:Long "Permalink")  val committed: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
10. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HeapMemory) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HeapMemoryImplicitThis member is added by an implicit conversion from HeapMemory toEnsuring\[HeapMemory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HeapMemory) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HeapMemoryImplicitThis member is added by an implicit conversion from HeapMemory toEnsuring\[HeapMemory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HeapMemoryImplicitThis member is added by an implicit conversion from HeapMemory toEnsuring\[HeapMemory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HeapMemoryImplicitThis member is added by an implicit conversion from HeapMemory toEnsuring\[HeapMemory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#max:Option[Long] "Permalink")  val max: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]
18. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#timestamp:Long "Permalink")  val timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
24. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#used:Long "Permalink")  val used: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
25. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HeapMemory toStringFormat\[HeapMemory] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/metrics/StandardMetrics$$HeapMemory.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HeapMemory, B)ImplicitThis member is added by an implicit conversion from HeapMemory toArrowAssoc\[HeapMemory] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHeapMemory to any2stringadd\[HeapMemory]

### Inherited by implicit conversion StringFormat fromHeapMemory to StringFormat\[HeapMemory]

### Inherited by implicit conversion Ensuring fromHeapMemory to Ensuring\[HeapMemory]

### Inherited by implicit conversion ArrowAssoc fromHeapMemory to ArrowAssoc\[HeapMemory]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$Cpu$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$Cpu.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$HeapMemory$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$HeapMemory.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$HeapMemory.html](https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$$HeapMemory.html)*