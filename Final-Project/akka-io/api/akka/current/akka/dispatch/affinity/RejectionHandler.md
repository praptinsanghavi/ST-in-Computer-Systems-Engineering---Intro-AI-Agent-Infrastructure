---
description: Akka 2.10.17 - akka.dispatch.affinity.RejectionHandler
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:25:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/affinity/RejectionHandler.html
title: Akka 2.10.17 - akka.dispatch.affinity.RejectionHandler
---

# Akka 2.10.17 - akka.dispatch.affinity.RejectionHandler

> **Summary:** Akka 2.10.17 - akka.dispatch.affinity.RejectionHandler

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/dispatch/index.html "Permalink")  package [dispatch](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/dispatch/affinity/index.html "Permalink")  package [affinity](index.html)Definition Classes[dispatch](../index.html)
- [QueueSelector](QueueSelector.html "A QueueSelector is responsible for, given a Runnable and the number of available queues, return which of the queues that Runnable should be placed in.")
- [QueueSelectorFactory](QueueSelectorFactory.html)
- RejectionHandler
- [RejectionHandlerFactory](RejectionHandlerFactory.html)
t[akka](../../index.html).[dispatch](../index.html).[affinity](index.html)

# RejectionHandler[**](../../../akka/dispatch/affinity/RejectionHandler.html "Permalink")

### 

#### trait RejectionHandler extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[AffinityPool.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/affinity/AffinityPool.scala#L357)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RejectionHandler
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
### Abstract Value Members

1. [**](../../../akka/dispatch/affinity/RejectionHandler.html#reject(command:Runnable,service:java.util.concurrent.ExecutorService):Unit "Permalink") abstract  def reject(command: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable), service: [ExecutorService](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ExecutorService.html#java.util.concurrent.ExecutorService)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
### Concrete Value Members

1. [**](../../../akka/dispatch/affinity/RejectionHandler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/dispatch/affinity/RejectionHandler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/dispatch/affinity/RejectionHandler.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RejectionHandler toany2stringadd\[RejectionHandler] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/dispatch/affinity/RejectionHandler.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RejectionHandler, B)ImplicitThis member is added by an implicit conversion from RejectionHandler toArrowAssoc\[RejectionHandler] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/dispatch/affinity/RejectionHandler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/dispatch/affinity/RejectionHandler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/dispatch/affinity/RejectionHandler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/dispatch/affinity/RejectionHandler.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RejectionHandler) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RejectionHandlerImplicitThis member is added by an implicit conversion from RejectionHandler toEnsuring\[RejectionHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/dispatch/affinity/RejectionHandler.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RejectionHandler) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RejectionHandlerImplicitThis member is added by an implicit conversion from RejectionHandler toEnsuring\[RejectionHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/dispatch/affinity/RejectionHandler.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RejectionHandlerImplicitThis member is added by an implicit conversion from RejectionHandler toEnsuring\[RejectionHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/dispatch/affinity/RejectionHandler.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RejectionHandlerImplicitThis member is added by an implicit conversion from RejectionHandler toEnsuring\[RejectionHandler] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/dispatch/affinity/RejectionHandler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/dispatch/affinity/RejectionHandler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/dispatch/affinity/RejectionHandler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/dispatch/affinity/RejectionHandler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/dispatch/affinity/RejectionHandler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/dispatch/affinity/RejectionHandler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/dispatch/affinity/RejectionHandler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/dispatch/affinity/RejectionHandler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/dispatch/affinity/RejectionHandler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/dispatch/affinity/RejectionHandler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/dispatch/affinity/RejectionHandler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/dispatch/affinity/RejectionHandler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/dispatch/affinity/RejectionHandler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/dispatch/affinity/RejectionHandler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/dispatch/affinity/RejectionHandler.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RejectionHandler toStringFormat\[RejectionHandler] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/dispatch/affinity/RejectionHandler.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RejectionHandler, B)ImplicitThis member is added by an implicit conversion from RejectionHandler toArrowAssoc\[RejectionHandler] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRejectionHandler to any2stringadd\[RejectionHandler]

### Inherited by implicit conversion StringFormat fromRejectionHandler to StringFormat\[RejectionHandler]

### Inherited by implicit conversion Ensuring fromRejectionHandler to Ensuring\[RejectionHandler]

### Inherited by implicit conversion ArrowAssoc fromRejectionHandler to ArrowAssoc\[RejectionHandler]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/dispatch/affinity/QueueSelector.html
- https://doc.akka.io/api/akka/current/akka/dispatch/affinity/QueueSelectorFactory.html
- https://doc.akka.io/api/akka/current/akka/dispatch/affinity/RejectionHandler.html
- https://doc.akka.io/api/akka/current/akka/dispatch/affinity/RejectionHandlerFactory.html
- https://doc.akka.io/api/akka/current/akka/dispatch/affinity/index.html
- https://doc.akka.io/api/akka/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/dispatch/affinity/RejectionHandler.html](https://doc.akka.io/api/akka/current/akka/dispatch/affinity/RejectionHandler.html)*