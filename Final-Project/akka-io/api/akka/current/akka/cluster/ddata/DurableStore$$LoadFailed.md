---
description: Akka 2.10.17 - akka.cluster.ddata.DurableStore.LoadFailed
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:53:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/DurableStore$$LoadFailed.html
title: Akka 2.10.17 - akka.cluster.ddata.DurableStore.LoadFailed
---

# Akka 2.10.17 - akka.cluster.ddata.DurableStore.LoadFailed

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.DurableStore.LoadFailed

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/ddata/DurableStore$.html "Permalink")  object [DurableStore](DurableStore$.html "An actor implementing the durable store for the Distributed Data Replicator has to implement the protocol with the messages defined here.")An actor implementing the durable store for the Distributed Data `Replicator`
has to implement the protocol with the messages defined here.

An actor implementing the durable store for the Distributed Data `Replicator`
has to implement the protocol with the messages defined here.

At startup the `Replicator` creates the durable store actor and sends the
`Load` message to it. It must then reply with 0 or more `LoadData` messages
followed by one `LoadAllCompleted` message to the `sender` (the `Replicator`).

If the `LoadAll` fails it can throw `LoadFailed` and the `Replicator` supervisor
will stop itself and the durable store.

When the `Replicator` needs to store a value it sends a `Store` message
to the durable store actor, which must then reply with the `successMsg` or
`failureMsg` to the `replyTo`.

When entries have expired the `Replicator` sends a `Expire` message to the durable
store actor, which can delete the entries from the backend store.

Definition Classes[ddata](index.html)
- [DurableDataEnvelope](DurableStore$$DurableDataEnvelope.html "Wrapper class for serialization of a data value.")
- [Expire](DurableStore$$Expire.html "Request to expire (remove) entries.")
- [LoadAll](DurableStore$$LoadAll$.html "Request to load all entries.")
- [LoadAllCompleted](DurableStore$$LoadAllCompleted$.html)
- [LoadData](DurableStore$$LoadData.html)
- LoadFailed
- [Store](DurableStore$$Store.html "Request to store an entry.")
- [StoreReply](DurableStore$$StoreReply.html)
c[akka](../../index.html).[cluster](../index.html).[ddata](index.html).[DurableStore](DurableStore$.html)

# LoadFailed[**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html "Permalink")

### 

#### class LoadFailed extends RuntimeException

Source[DurableStore.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/DurableStore.scala#L78)Linear Supertypes[RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LoadFailed
2. RuntimeException
3. Exception
4. Throwable
5. Serializable
6. AnyRef
7. Any
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

1. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#<init>(message:String):akka.cluster.ddata.DurableStore.LoadFailed "Permalink")  new LoadFailed(message: String)
2. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#<init>(message:String,cause:Throwable):akka.cluster.ddata.DurableStore.LoadFailed "Permalink")  new LoadFailed(message: String, cause: Throwable)
### Value Members

1. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LoadFailed toany2stringadd\[LoadFailed] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LoadFailed, B)ImplicitThis member is added by an implicit conversion from LoadFailed toArrowAssoc\[LoadFailed] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
7. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LoadFailed) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoadFailedImplicitThis member is added by an implicit conversion from LoadFailed toEnsuring\[LoadFailed] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LoadFailed) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoadFailedImplicitThis member is added by an implicit conversion from LoadFailed toEnsuring\[LoadFailed] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoadFailedImplicitThis member is added by an implicit conversion from LoadFailed toEnsuring\[LoadFailed] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoadFailedImplicitThis member is added by an implicit conversion from LoadFailed toEnsuring\[LoadFailed] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
16. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
17. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
19. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
20. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
21. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
22. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
24. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
29. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
30. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
31. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
32. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
34. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LoadFailed toStringFormat\[LoadFailed] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/DurableStore$$LoadFailed.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LoadFailed, B)ImplicitThis member is added by an implicit conversion from LoadFailed toArrowAssoc\[LoadFailed] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLoadFailed to any2stringadd\[LoadFailed]

### Inherited by implicit conversion StringFormat fromLoadFailed to StringFormat\[LoadFailed]

### Inherited by implicit conversion Ensuring fromLoadFailed to Ensuring\[LoadFailed]

### Inherited by implicit conversion ArrowAssoc fromLoadFailed to ArrowAssoc\[LoadFailed]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$DurableDataEnvelope.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$Expire.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$LoadAll$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$LoadAllCompleted$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$LoadData.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$LoadFailed.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$Store.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$StoreReply.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$LoadFailed.html](https://doc.akka.io/api/akka/current/akka/cluster/ddata/DurableStore$$LoadFailed.html)*