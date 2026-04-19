---
description: Akka 2.10.17 - akka.util.PriorityQueueStabilizer.WrappedElement
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:25:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/util/PriorityQueueStabilizer$$WrappedElement.html
title: Akka 2.10.17 - akka.util.PriorityQueueStabilizer.WrappedElement
---

# Akka 2.10.17 - akka.util.PriorityQueueStabilizer.WrappedElement

> **Summary:** Akka 2.10.17 - akka.util.PriorityQueueStabilizer.WrappedElement

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/PriorityQueueStabilizer$.html "Permalink")  object [PriorityQueueStabilizer](PriorityQueueStabilizer$.html)Definition Classes[util](index.html)
- WrappedElement
- [WrappedElementComparator](PriorityQueueStabilizer$$WrappedElementComparator.html)
c[akka](../index.html).[util](index.html).[PriorityQueueStabilizer](PriorityQueueStabilizer$.html)

# WrappedElement[**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html "Permalink")

### 

#### class WrappedElement\[E] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[StablePriorityQueue.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/util/StablePriorityQueue.scala#L45)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WrappedElement
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
### Instance Constructors

1. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#<init>(element:E,seqNum:Long):akka.util.PriorityQueueStabilizer.WrappedElement[E] "Permalink")  new WrappedElement(element: E, seqNum: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))
### Value Members

1. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WrappedElement\[E] toany2stringadd\[WrappedElement\[E]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WrappedElement\[E], B)ImplicitThis member is added by an implicit conversion from WrappedElement\[E] toArrowAssoc\[WrappedElement\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#element:E "Permalink")  val element: E
9. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WrappedElement\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WrappedElement\[E]ImplicitThis member is added by an implicit conversion from WrappedElement\[E] toEnsuring\[WrappedElement\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WrappedElement\[E]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WrappedElement\[E]ImplicitThis member is added by an implicit conversion from WrappedElement\[E] toEnsuring\[WrappedElement\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WrappedElement\[E]ImplicitThis member is added by an implicit conversion from WrappedElement\[E] toEnsuring\[WrappedElement\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WrappedElement\[E]ImplicitThis member is added by an implicit conversion from WrappedElement\[E] toEnsuring\[WrappedElement\[E]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#seqNum:Long "Permalink")  val seqNum: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
22. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WrappedElement\[E] toStringFormat\[WrappedElement\[E]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/util/PriorityQueueStabilizer$$WrappedElement.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WrappedElement\[E], B)ImplicitThis member is added by an implicit conversion from WrappedElement\[E] toArrowAssoc\[WrappedElement\[E]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromWrappedElement\[E] to any2stringadd\[WrappedElement\[E]]

### Inherited by implicit conversion StringFormat fromWrappedElement\[E] to StringFormat\[WrappedElement\[E]]

### Inherited by implicit conversion Ensuring fromWrappedElement\[E] to Ensuring\[WrappedElement\[E]]

### Inherited by implicit conversion ArrowAssoc fromWrappedElement\[E] to ArrowAssoc\[WrappedElement\[E]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/util/PriorityQueueStabilizer$$WrappedElement.html
- https://doc.akka.io/api/akka/current/akka/util/PriorityQueueStabilizer$$WrappedElementComparator.html
- https://doc.akka.io/api/akka/current/akka/util/PriorityQueueStabilizer$.html
- https://doc.akka.io/api/akka/current/akka/util/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/util/PriorityQueueStabilizer$$WrappedElement.html](https://doc.akka.io/api/akka/current/akka/util/PriorityQueueStabilizer$$WrappedElement.html)*