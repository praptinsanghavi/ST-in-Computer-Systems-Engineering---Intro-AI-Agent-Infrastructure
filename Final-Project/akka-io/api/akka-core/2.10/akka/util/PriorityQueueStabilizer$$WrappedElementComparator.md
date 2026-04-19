---
description: Akka 2.10.17 - akka.util.PriorityQueueStabilizer.WrappedElementComparator
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:19:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html
title: Akka 2.10.17 - akka.util.PriorityQueueStabilizer.WrappedElementComparator
---

# Akka 2.10.17 - akka.util.PriorityQueueStabilizer.WrappedElementComparator

> **Summary:** Akka 2.10.17 - akka.util.PriorityQueueStabilizer.WrappedElementComparator

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/PriorityQueueStabilizer$.html "Permalink")  object [PriorityQueueStabilizer](PriorityQueueStabilizer$.html)Definition Classes[util](index.html)
- [WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)
- WrappedElementComparator
c[akka](../index.html).[util](index.html).[PriorityQueueStabilizer](PriorityQueueStabilizer$.html)

# WrappedElementComparator[**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html "Permalink")

### 

#### class WrappedElementComparator\[E] extends [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]]

Source[StablePriorityQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/StablePriorityQueue.scala#L46)Linear Supertypes[Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WrappedElementComparator
2. Comparator
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

1. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#<init>(cmp:java.util.Comparator[E]):akka.util.PriorityQueueStabilizer.WrappedElementComparator[E] "Permalink")  new WrappedElementComparator(cmp: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[E])
### Value Members

1. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WrappedElementComparator\[E] toany2stringadd\[WrappedElementComparator\[E]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WrappedElementComparator\[E], B)ImplicitThis member is added by an implicit conversion from WrappedElementComparator\[E] toArrowAssoc\[WrappedElementComparator\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#cmp:java.util.Comparator[E] "Permalink")  val cmp: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[E]
9. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#compare(e1:akka.util.PriorityQueueStabilizer.WrappedElement[E],e2:akka.util.PriorityQueueStabilizer.WrappedElement[E]):Int "Permalink")  def compare(e1: [WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E], e2: [WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesWrappedElementComparator → Comparator
10. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WrappedElementComparator\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WrappedElementComparator\[E]ImplicitThis member is added by an implicit conversion from WrappedElementComparator\[E] toEnsuring\[WrappedElementComparator\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WrappedElementComparator\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WrappedElementComparator\[E]ImplicitThis member is added by an implicit conversion from WrappedElementComparator\[E] toEnsuring\[WrappedElementComparator\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WrappedElementComparator\[E]ImplicitThis member is added by an implicit conversion from WrappedElementComparator\[E] toEnsuring\[WrappedElementComparator\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WrappedElementComparator\[E]ImplicitThis member is added by an implicit conversion from WrappedElementComparator\[E] toEnsuring\[WrappedElementComparator\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#reversed():java.util.Comparator[T] "Permalink")  def reversed(): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]]Definition ClassesComparator
23. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#thenComparing[U<:Comparable[_>:U]](x$1:java.util.function.Function[_>:T,_<:U]):java.util.Comparator[T] "Permalink")  def thenComparing\[U \<: [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[\_ \>: U \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]](arg0: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[\_ \>: [WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E] \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), \_ \<: U]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]]Definition ClassesComparator
25. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#thenComparing[U](x$1:java.util.function.Function[_>:T,_<:U],x$2:java.util.Comparator[_>:U]):java.util.Comparator[T] "Permalink")  def thenComparing\[U \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)](arg0: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[\_ \>: [WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E] \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), \_ \<: U], arg1: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[\_ \>: U \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]]Definition ClassesComparator
26. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#thenComparing(x$1:java.util.Comparator[_>:T]):java.util.Comparator[T] "Permalink")  def thenComparing(arg0: [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[\_ \>: [WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E] \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]]Definition ClassesComparator
27. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#thenComparingDouble(x$1:java.util.function.ToDoubleFunction[_>:T]):java.util.Comparator[T] "Permalink")  def thenComparingDouble(arg0: [ToDoubleFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/ToDoubleFunction.html#java.util.function.ToDoubleFunction)\[\_ \>: [WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E] \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]]Definition ClassesComparator
28. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#thenComparingInt(x$1:java.util.function.ToIntFunction[_>:T]):java.util.Comparator[T] "Permalink")  def thenComparingInt(arg0: [ToIntFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/ToIntFunction.html#java.util.function.ToIntFunction)\[\_ \>: [WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E] \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]]Definition ClassesComparator
29. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#thenComparingLong(x$1:java.util.function.ToLongFunction[_>:T]):java.util.Comparator[T] "Permalink")  def thenComparingLong(arg0: [ToLongFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/ToLongFunction.html#java.util.function.ToLongFunction)\[\_ \>: [WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E] \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]]Definition ClassesComparator
30. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WrappedElementComparator\[E] toStringFormat\[WrappedElementComparator\[E]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WrappedElementComparator\[E], B)ImplicitThis member is added by an implicit conversion from WrappedElementComparator\[E] toArrowAssoc\[WrappedElementComparator\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Comparator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#java.util.Comparator)\[[WrappedElement](PriorityQueueStabilizer$$WrappedElement.html)\[E]]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromWrappedElementComparator\[E] to any2stringadd\[WrappedElementComparator\[E]]

### Inherited by implicit conversion StringFormat fromWrappedElementComparator\[E] to StringFormat\[WrappedElementComparator\[E]]

### Inherited by implicit conversion Ensuring fromWrappedElementComparator\[E] to Ensuring\[WrappedElementComparator\[E]]

### Inherited by implicit conversion ArrowAssoc fromWrappedElementComparator\[E] to ArrowAssoc\[WrappedElementComparator\[E]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/PriorityQueueStabilizer$$WrappedElement.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/PriorityQueueStabilizer$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html](https://doc.akka.io/api/akka-core/2.10/akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html)*