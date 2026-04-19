---
description: Akka 2.10.17 - akka.actor.Scheduler.TaskRunOnClose
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:41:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/Scheduler$$TaskRunOnClose.html
title: Akka 2.10.17 - akka.actor.Scheduler.TaskRunOnClose
---

# Akka 2.10.17 - akka.actor.Scheduler.TaskRunOnClose

> **Summary:** Akka 2.10.17 - akka.actor.Scheduler.TaskRunOnClose

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/Scheduler$.html "Permalink")  object [Scheduler](Scheduler$.html)Definition Classes[actor](index.html)
- TaskRunOnClose
t[akka](../index.html).[actor](index.html).[Scheduler](Scheduler$.html)

# TaskRunOnClose[**](../../akka/actor/Scheduler$$TaskRunOnClose.html "Permalink")

### 

#### trait TaskRunOnClose extends [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)

If a `TaskRunOnClose` is used in `scheduleOnce` it will be run when the `Scheduler` is
closed (`ActorSystem` shutdown). This is needed for the internal shutdown of dispatchers
in Akka and is not intended to be used by end user applications, but it's public because
a custom implementation of `Scheduler` must also implement this.

Source[Scheduler.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/Scheduler.scala#L557)Linear Supertypes[Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TaskRunOnClose
2. Runnable
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
### Abstract Value Members

1. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#run():Unit "Permalink") abstract  def run(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesRunnable
### Concrete Value Members

1. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TaskRunOnClose toany2stringadd\[TaskRunOnClose] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TaskRunOnClose, B)ImplicitThis member is added by an implicit conversion from TaskRunOnClose toArrowAssoc\[TaskRunOnClose] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TaskRunOnClose) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TaskRunOnCloseImplicitThis member is added by an implicit conversion from TaskRunOnClose toEnsuring\[TaskRunOnClose] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TaskRunOnClose) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TaskRunOnCloseImplicitThis member is added by an implicit conversion from TaskRunOnClose toEnsuring\[TaskRunOnClose] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TaskRunOnCloseImplicitThis member is added by an implicit conversion from TaskRunOnClose toEnsuring\[TaskRunOnClose] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TaskRunOnCloseImplicitThis member is added by an implicit conversion from TaskRunOnClose toEnsuring\[TaskRunOnClose] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TaskRunOnClose toStringFormat\[TaskRunOnClose] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/Scheduler$$TaskRunOnClose.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TaskRunOnClose, B)ImplicitThis member is added by an implicit conversion from TaskRunOnClose toArrowAssoc\[TaskRunOnClose] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTaskRunOnClose to any2stringadd\[TaskRunOnClose]

### Inherited by implicit conversion StringFormat fromTaskRunOnClose to StringFormat\[TaskRunOnClose]

### Inherited by implicit conversion Ensuring fromTaskRunOnClose to Ensuring\[TaskRunOnClose]

### Inherited by implicit conversion ArrowAssoc fromTaskRunOnClose to ArrowAssoc\[TaskRunOnClose]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Scheduler$$TaskRunOnClose.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Scheduler$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Scheduler$$TaskRunOnClose.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Scheduler$$TaskRunOnClose.html)*