---
description: Akka 2.10.17 - akka.dispatch.ForkJoinExecutorConfigurator.AkkaForkJoinTask
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html
title: Akka 2.10.17 - akka.dispatch.ForkJoinExecutorConfigurator.AkkaForkJoinTask
---

# Akka 2.10.17 - akka.dispatch.ForkJoinExecutorConfigurator.AkkaForkJoinTask

> **Summary:** Akka 2.10.17 - akka.dispatch.ForkJoinExecutorConfigurator.AkkaForkJoinTask

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/ForkJoinExecutorConfigurator$.html "Permalink")  object [ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator$.html)Definition Classes[dispatch](index.html)
- [AkkaForkJoinPool](ForkJoinExecutorConfigurator$$AkkaForkJoinPool.html "INTERNAL AKKA USAGE ONLY")
- AkkaForkJoinTask
c[akka](../index.html).[dispatch](index.html).[ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator$.html)

# AkkaForkJoinTask[**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html "Permalink")

### 

#### final  class AkkaForkJoinTask extends [ForkJoinTask](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ForkJoinTask.html#java.util.concurrent.ForkJoinTask)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]

INTERNAL AKKA USAGE ONLY

Annotations@SerialVersionUID() Source[ForkJoinExecutorConfigurator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/ForkJoinExecutorConfigurator.scala#L55)Linear Supertypes[ForkJoinTask](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ForkJoinTask.html#java.util.concurrent.ForkJoinTask)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Future](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Future.html#java.util.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaForkJoinTask
2. ForkJoinTask
3. Serializable
4. Future
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

1. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#<init>(runnable:Runnable):akka.dispatch.ForkJoinExecutorConfigurator.AkkaForkJoinTask "Permalink")  new AkkaForkJoinTask(runnable: [Runnable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html#java.lang.Runnable))
### Value Members

1. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AkkaForkJoinTask toany2stringadd\[AkkaForkJoinTask] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AkkaForkJoinTask, B)ImplicitThis member is added by an implicit conversion from AkkaForkJoinTask toArrowAssoc\[AkkaForkJoinTask] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#cancel(x$1:Boolean):Boolean "Permalink")  def cancel(arg0: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask → Future
8. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#compareAndSetForkJoinTaskTag(x$1:Short,x$2:Short):Boolean "Permalink") final  def compareAndSetForkJoinTaskTag(arg0: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short), arg1: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask
10. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#complete(x$1:V):Unit "Permalink")  def complete(arg0: [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
11. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#completeExceptionally(x$1:Throwable):Unit "Permalink")  def completeExceptionally(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
12. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AkkaForkJoinTask) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaForkJoinTaskImplicitThis member is added by an implicit conversion from AkkaForkJoinTask toEnsuring\[AkkaForkJoinTask] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AkkaForkJoinTask) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaForkJoinTaskImplicitThis member is added by an implicit conversion from AkkaForkJoinTask toEnsuring\[AkkaForkJoinTask] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaForkJoinTaskImplicitThis member is added by an implicit conversion from AkkaForkJoinTask toEnsuring\[AkkaForkJoinTask] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaForkJoinTaskImplicitThis member is added by an implicit conversion from AkkaForkJoinTask toEnsuring\[AkkaForkJoinTask] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#exec():Boolean "Permalink")  def exec(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAkkaForkJoinTask → ForkJoinTask
19. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#fork():java.util.concurrent.ForkJoinTask[V] "Permalink") final  def fork(): [ForkJoinTask](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ForkJoinTask.html#java.util.concurrent.ForkJoinTask)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition ClassesForkJoinTask
20. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#get(x$1:Long,x$2:java.util.concurrent.TimeUnit):V "Permalink") final  def get(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [TimeUnit](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeUnit.html#java.util.concurrent.TimeUnit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask → FutureAnnotations@throws(classOf\[java.lang.InterruptedException]) @throws(classOf\[java.util.concurrent.ExecutionException]) @throws(classOf\[java.util.concurrent.TimeoutException])
21. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#get():V "Permalink") final  def get(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask → FutureAnnotations@throws(classOf\[java.lang.InterruptedException]) @throws(classOf\[java.util.concurrent.ExecutionException])
22. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#getException():Throwable "Permalink") final  def getException(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesForkJoinTask
24. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#getForkJoinTaskTag():Short "Permalink") final  def getForkJoinTaskTag(): [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)Definition ClassesForkJoinTask
25. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#getRawResult():Unit "Permalink")  def getRawResult(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAkkaForkJoinTask → ForkJoinTask
26. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#invoke():V "Permalink") final  def invoke(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
28. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#isCancelled():Boolean "Permalink") final  def isCancelled(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask → Future
29. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#isCompletedAbnormally():Boolean "Permalink") final  def isCompletedAbnormally(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask
30. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#isCompletedNormally():Boolean "Permalink") final  def isCompletedNormally(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask
31. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#isDone():Boolean "Permalink") final  def isDone(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask → Future
32. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
33. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#join():V "Permalink") final  def join(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
34. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
35. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#quietlyComplete():Unit "Permalink") final  def quietlyComplete(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
38. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#quietlyInvoke():Unit "Permalink") final  def quietlyInvoke(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
39. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#quietlyJoin():Unit "Permalink") final  def quietlyJoin(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
40. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#reinitialize():Unit "Permalink")  def reinitialize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesForkJoinTask
41. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#setForkJoinTaskTag(x$1:Short):Short "Permalink") final  def setForkJoinTaskTag(arg0: [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)): [Short](https://www.scala-lang.org/api/2.13.17/scala/Short.html#scala.Short)Definition ClassesForkJoinTask
42. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#setRawResult(unit:Unit):Unit "Permalink")  def setRawResult(unit: [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAkkaForkJoinTask → ForkJoinTask
43. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
44. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
45. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#tryUnfork():Boolean "Permalink")  def tryUnfork(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesForkJoinTask
46. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
47. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
48. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AkkaForkJoinTask toStringFormat\[AkkaForkJoinTask] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AkkaForkJoinTask, B)ImplicitThis member is added by an implicit conversion from AkkaForkJoinTask toArrowAssoc\[AkkaForkJoinTask] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ForkJoinTask](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ForkJoinTask.html#java.util.concurrent.ForkJoinTask)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Future](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/Future.html#java.util.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAkkaForkJoinTask to any2stringadd\[AkkaForkJoinTask]

### Inherited by implicit conversion StringFormat fromAkkaForkJoinTask to StringFormat\[AkkaForkJoinTask]

### Inherited by implicit conversion Ensuring fromAkkaForkJoinTask to Ensuring\[AkkaForkJoinTask]

### Inherited by implicit conversion ArrowAssoc fromAkkaForkJoinTask to ArrowAssoc\[AkkaForkJoinTask]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ForkJoinExecutorConfigurator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/ForkJoinExecutorConfigurator$$AkkaForkJoinTask.html)*