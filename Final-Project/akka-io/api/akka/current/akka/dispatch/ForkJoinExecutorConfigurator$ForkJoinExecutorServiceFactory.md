---
description: Akka 2.10.17 - akka.dispatch.ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:25:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html
title: Akka 2.10.17 - akka.dispatch.ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory
---

# Akka 2.10.17 - akka.dispatch.ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory

> **Summary:** Akka 2.10.17 - akka.dispatch.ForkJoinExecutorConfigurator.ForkJoinExecutorServiceFactory

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/ForkJoinExecutorConfigurator.html "Permalink")  class [ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator.html) extends [ExecutorServiceConfigurator](ExecutorServiceConfigurator.html)Definition Classes[dispatch](index.html)
- ForkJoinExecutorServiceFactory
c[akka](../index.html).[dispatch](index.html).[ForkJoinExecutorConfigurator](ForkJoinExecutorConfigurator.html)

# ForkJoinExecutorServiceFactory[**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html "Permalink")

### 

#### class ForkJoinExecutorServiceFactory extends [ExecutorServiceFactory](ExecutorServiceFactory.html)

Source[ForkJoinExecutorConfigurator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/dispatch/ForkJoinExecutorConfigurator.scala#L87)Linear Supertypes[ExecutorServiceFactory](ExecutorServiceFactory.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ForkJoinExecutorServiceFactory
2. ExecutorServiceFactory
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

1. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#<init>(threadFactory:java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory,parallelism:Int,asyncMode:Boolean):ForkJoinExecutorConfigurator.this.ForkJoinExecutorServiceFactory "Permalink")  new ForkJoinExecutorServiceFactory(threadFactory: ForkJoinWorkerThreadFactory, parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), asyncMode: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))
2. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#<init>(threadFactory:java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory,parallelism:Int):ForkJoinExecutorConfigurator.this.ForkJoinExecutorServiceFactory "Permalink")  new ForkJoinExecutorServiceFactory(threadFactory: ForkJoinWorkerThreadFactory, parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
3. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#<init>(threadFactory:java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory,parallelism:Int,asyncMode:Boolean,maxSpareThreads:Int):ForkJoinExecutorConfigurator.this.ForkJoinExecutorServiceFactory "Permalink")  new ForkJoinExecutorServiceFactory(threadFactory: ForkJoinWorkerThreadFactory, parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), asyncMode: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), maxSpareThreads: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))
### Value Members

1. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ForkJoinExecutorServiceFactory toany2stringadd\[ForkJoinExecutorServiceFactory] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ForkJoinExecutorServiceFactory, B)ImplicitThis member is added by an implicit conversion from ForkJoinExecutorServiceFactory toArrowAssoc\[ForkJoinExecutorServiceFactory] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#asyncMode:Boolean "Permalink")  val asyncMode: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
8. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#createExecutorService:java.util.concurrent.ExecutorService "Permalink")  def createExecutorService: [ExecutorService](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ExecutorService.html#java.util.concurrent.ExecutorService)Definition ClassesForkJoinExecutorServiceFactory → [ExecutorServiceFactory](ExecutorServiceFactory.html)
10. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ForkJoinExecutorServiceFactory) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ForkJoinExecutorServiceFactoryImplicitThis member is added by an implicit conversion from ForkJoinExecutorServiceFactory toEnsuring\[ForkJoinExecutorServiceFactory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ForkJoinExecutorServiceFactory) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ForkJoinExecutorServiceFactoryImplicitThis member is added by an implicit conversion from ForkJoinExecutorServiceFactory toEnsuring\[ForkJoinExecutorServiceFactory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ForkJoinExecutorServiceFactoryImplicitThis member is added by an implicit conversion from ForkJoinExecutorServiceFactory toEnsuring\[ForkJoinExecutorServiceFactory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ForkJoinExecutorServiceFactoryImplicitThis member is added by an implicit conversion from ForkJoinExecutorServiceFactory toEnsuring\[ForkJoinExecutorServiceFactory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#maxSpareThreads:Int "Permalink")  val maxSpareThreads: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
20. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#parallelism:Int "Permalink")  val parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
24. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#threadFactory:java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory "Permalink")  val threadFactory: ForkJoinWorkerThreadFactory
26. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ForkJoinExecutorServiceFactory toStringFormat\[ForkJoinExecutorServiceFactory] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ForkJoinExecutorServiceFactory, B)ImplicitThis member is added by an implicit conversion from ForkJoinExecutorServiceFactory toArrowAssoc\[ForkJoinExecutorServiceFactory] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ExecutorServiceFactory](ExecutorServiceFactory.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromForkJoinExecutorServiceFactory to any2stringadd\[ForkJoinExecutorServiceFactory]

### Inherited by implicit conversion StringFormat fromForkJoinExecutorServiceFactory to StringFormat\[ForkJoinExecutorServiceFactory]

### Inherited by implicit conversion Ensuring fromForkJoinExecutorServiceFactory to Ensuring\[ForkJoinExecutorServiceFactory]

### Inherited by implicit conversion ArrowAssoc fromForkJoinExecutorServiceFactory to ArrowAssoc\[ForkJoinExecutorServiceFactory]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/dispatch/ExecutorServiceConfigurator.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ExecutorServiceFactory.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html
- https://doc.akka.io/api/akka/current/akka/dispatch/ForkJoinExecutorConfigurator.html
- https://doc.akka.io/api/akka/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html](https://doc.akka.io/api/akka/current/akka/dispatch/ForkJoinExecutorConfigurator$ForkJoinExecutorServiceFactory.html)*