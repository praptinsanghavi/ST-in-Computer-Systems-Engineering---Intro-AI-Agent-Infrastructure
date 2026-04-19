---
description: Akka 2.10.17 - akka.actor.LightArrayRevolverScheduler.TimerTask
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:01:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/LightArrayRevolverScheduler$$TimerTask.html
title: Akka 2.10.17 - akka.actor.LightArrayRevolverScheduler.TimerTask
---

# Akka 2.10.17 - akka.actor.LightArrayRevolverScheduler.TimerTask

> **Summary:** Akka 2.10.17 - akka.actor.LightArrayRevolverScheduler.TimerTask

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/LightArrayRevolverScheduler$.html "Permalink")  object [LightArrayRevolverScheduler](LightArrayRevolverScheduler$.html)Definition Classes[actor](index.html)
- [TaskHolder](LightArrayRevolverScheduler$$TaskHolder.html "INTERNAL API")
- TimerTask
t[akka](../index.html).[actor](index.html).[LightArrayRevolverScheduler](LightArrayRevolverScheduler$.html)

# TimerTask[**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html "Permalink")

### 

#### trait TimerTask extends [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable) with [Cancellable](Cancellable.html)

INTERNAL API

Attributesprotected\[[actor](index.html)] Source[LightArrayRevolverScheduler.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/LightArrayRevolverScheduler.scala#L348)Linear Supertypes[Cancellable](Cancellable.html), [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[TaskHolder](LightArrayRevolverScheduler$$TaskHolder.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TimerTask
2. Cancellable
3. Runnable
4. AnyRef
5. Any
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

1. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#cancel():Boolean "Permalink") abstract  def cancel(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Cancels this Cancellable and returns true if that was successful.

Cancels this Cancellable and returns true if that was successful.
If this cancellable was (concurrently) cancelled already, then this method
will return false although isCancelled will return true.

Java \& Scala API

Definition Classes[Cancellable](Cancellable.html)
2. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#isCancelled:Boolean "Permalink") abstract  def isCancelled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if and only if this Cancellable has been successfully cancelled

Returns true if and only if this Cancellable has been successfully cancelled

Java \& Scala API

Definition Classes[Cancellable](Cancellable.html)
3. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#run():Unit "Permalink") abstract  def run(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesRunnable
### Concrete Value Members

1. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TimerTask toany2stringadd\[TimerTask] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TimerTask, B)ImplicitThis member is added by an implicit conversion from TimerTask toArrowAssoc\[TimerTask] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TimerTask) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TimerTaskImplicitThis member is added by an implicit conversion from TimerTask toEnsuring\[TimerTask] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TimerTask) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TimerTaskImplicitThis member is added by an implicit conversion from TimerTask toEnsuring\[TimerTask] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TimerTaskImplicitThis member is added by an implicit conversion from TimerTask toEnsuring\[TimerTask] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TimerTaskImplicitThis member is added by an implicit conversion from TimerTask toEnsuring\[TimerTask] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TimerTask toStringFormat\[TimerTask] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/LightArrayRevolverScheduler$$TimerTask.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TimerTask, B)ImplicitThis member is added by an implicit conversion from TimerTask toArrowAssoc\[TimerTask] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Cancellable](Cancellable.html)

### Inherited from [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTimerTask to any2stringadd\[TimerTask]

### Inherited by implicit conversion StringFormat fromTimerTask to StringFormat\[TimerTask]

### Inherited by implicit conversion Ensuring fromTimerTask to Ensuring\[TimerTask]

### Inherited by implicit conversion ArrowAssoc fromTimerTask to ArrowAssoc\[TimerTask]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/Cancellable.html
- https://doc.akka.io/api/akka/2.10/akka/actor/LightArrayRevolverScheduler$$TaskHolder.html
- https://doc.akka.io/api/akka/2.10/akka/actor/LightArrayRevolverScheduler$$TimerTask.html
- https://doc.akka.io/api/akka/2.10/akka/actor/LightArrayRevolverScheduler$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/LightArrayRevolverScheduler$$TimerTask.html](https://doc.akka.io/api/akka/2.10/akka/actor/LightArrayRevolverScheduler$$TimerTask.html)*