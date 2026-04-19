---
description: Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManagerIsStuck
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:22:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html
title: Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManagerIsStuck
---

# Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManagerIsStuck

> **Summary:** Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManagerIsStuck

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](index.html)Definition Classes[cluster](../index.html)
- [ClusterSingletonManager](ClusterSingletonManager.html "Manages singleton actor instance among all cluster nodes or a group of nodes tagged with a specific role.")
- ClusterSingletonManagerIsStuck
- [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)
- [ClusterSingletonMessage](ClusterSingletonMessage.html "Marker trait for remote messages with special serializer.")
- [ClusterSingletonProxy](ClusterSingletonProxy.html "The ClusterSingletonProxy works together with the akka.cluster.singleton.ClusterSingletonManager to provide a distributed proxy to the singleton actor.")
- [ClusterSingletonProxySettings](ClusterSingletonProxySettings.html)
c[akka](../../index.html).[cluster](../index.html).[singleton](index.html)

# ClusterSingletonManagerIsStuck[**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html "Permalink")

### 

#### class ClusterSingletonManagerIsStuck extends [AkkaException](../../AkkaException.html)

Thrown when a consistent state can't be determined within the
defined retry limits. Eventually it will reach a stable state and
can continue, and that is simplified by starting over with a clean
state. Parent supervisor should typically restart the actor, i.e.
default decision.

Source[ClusterSingletonManager.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/scala/akka/cluster/singleton/ClusterSingletonManager.scala#L448)Linear Supertypes[AkkaException](../../AkkaException.html), [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSingletonManagerIsStuck
2. AkkaException
3. RuntimeException
4. Exception
5. Throwable
6. Serializable
7. AnyRef
8. Any
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

1. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#<init>(message:String):akka.cluster.singleton.ClusterSingletonManagerIsStuck "Permalink")  new ClusterSingletonManagerIsStuck(message: String)
### Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonManagerIsStuck toany2stringadd\[ClusterSingletonManagerIsStuck] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterSingletonManagerIsStuck, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonManagerIsStuck toArrowAssoc\[ClusterSingletonManagerIsStuck] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
7. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterSingletonManagerIsStuck) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSingletonManagerIsStuckImplicitThis member is added by an implicit conversion from ClusterSingletonManagerIsStuck toEnsuring\[ClusterSingletonManagerIsStuck] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterSingletonManagerIsStuck) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSingletonManagerIsStuckImplicitThis member is added by an implicit conversion from ClusterSingletonManagerIsStuck toEnsuring\[ClusterSingletonManagerIsStuck] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterSingletonManagerIsStuckImplicitThis member is added by an implicit conversion from ClusterSingletonManagerIsStuck toEnsuring\[ClusterSingletonManagerIsStuck] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterSingletonManagerIsStuckImplicitThis member is added by an implicit conversion from ClusterSingletonManagerIsStuck toEnsuring\[ClusterSingletonManagerIsStuck] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
16. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
17. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
19. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
20. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
21. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
22. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
24. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
29. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
30. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
31. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
32. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
34. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterSingletonManagerIsStuck toStringFormat\[ClusterSingletonManagerIsStuck] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/singleton/ClusterSingletonManagerIsStuck.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterSingletonManagerIsStuck, B)ImplicitThis member is added by an implicit conversion from ClusterSingletonManagerIsStuck toArrowAssoc\[ClusterSingletonManagerIsStuck] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AkkaException](../../AkkaException.html)

### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterSingletonManagerIsStuck to any2stringadd\[ClusterSingletonManagerIsStuck]

### Inherited by implicit conversion StringFormat fromClusterSingletonManagerIsStuck to StringFormat\[ClusterSingletonManagerIsStuck]

### Inherited by implicit conversion Ensuring fromClusterSingletonManagerIsStuck to Ensuring\[ClusterSingletonManagerIsStuck]

### Inherited by implicit conversion ArrowAssoc fromClusterSingletonManagerIsStuck to ArrowAssoc\[ClusterSingletonManagerIsStuck]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/AkkaException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonProxy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonProxy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonProxySettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonProxySettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html)*