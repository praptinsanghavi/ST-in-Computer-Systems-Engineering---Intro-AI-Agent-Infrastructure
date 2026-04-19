---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.Tupler
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/Tupler.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.Tupler
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.Tupler

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.Tupler

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package [util](index.html)Definition Classes[server](../index.html)
- [ApplyConverter](ApplyConverter.html "ApplyConverter allows generic conversion of functions of type (T1, T2, ...) => Route to (TupleX(T1, T2, ...)) => Route.")
- [BinaryPolyFunc](BinaryPolyFunc.html "Allows the definition of binary poly-functions (e.g.")
- [ClassMagnet](ClassMagnet.html "A magnet that wraps a ClassTag")
- [ConstructFromTuple](ConstructFromTuple.html "Constructor for instances of type R which can be created from a tuple of type T.")
- [Tuple](Tuple.html "Phantom type providing implicit evidence that a given type is a Tuple or Unit.")
- [TupleOps](TupleOps.html)
- Tupler
[t](Tupler$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[util](index.html)

# [Tupler](Tupler$.html "See companion object")[**](../../../../../akka/http/scaladsl/server/util/Tupler.html "Permalink")

### Companion [object Tupler](Tupler$.html "See companion object")

#### trait Tupler\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Provides a way to convert a value into an Tuple.
If the value is already a Tuple then it is returned unchanged, otherwise it's wrapped in a Tuple1 instance.

Source[Tupler.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/util/Tupler.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Tupler
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
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#Out "Permalink") abstract  type Out
### Abstract Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#OutIsTuple:akka.http.scaladsl.server.util.Tuple[Tupler.this.Out] "Permalink") abstract  def OutIsTuple: [Tuple](Tuple.html)\[[Out](#Out)]
2. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#apply(value:T):Tupler.this.Out "Permalink") abstract  def apply(value: T): [Out](#Out)
### Concrete Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Tupler\[T] toany2stringadd\[Tupler\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Tupler\[T], B)ImplicitThis member is added by an implicit conversion from Tupler\[T] toArrowAssoc\[Tupler\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Tupler\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Tupler\[T]ImplicitThis member is added by an implicit conversion from Tupler\[T] toEnsuring\[Tupler\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Tupler\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Tupler\[T]ImplicitThis member is added by an implicit conversion from Tupler\[T] toEnsuring\[Tupler\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Tupler\[T]ImplicitThis member is added by an implicit conversion from Tupler\[T] toEnsuring\[Tupler\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Tupler\[T]ImplicitThis member is added by an implicit conversion from Tupler\[T] toEnsuring\[Tupler\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Tupler\[T] toStringFormat\[Tupler\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Tupler\[T], B)ImplicitThis member is added by an implicit conversion from Tupler\[T] toArrowAssoc\[Tupler\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTupler\[T] to any2stringadd\[Tupler\[T]]

### Inherited by implicit conversion StringFormat fromTupler\[T] to StringFormat\[Tupler\[T]]

### Inherited by implicit conversion Ensuring fromTupler\[T] to Ensuring\[Tupler\[T]]

### Inherited by implicit conversion ArrowAssoc fromTupler\[T] to ArrowAssoc\[Tupler\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ClassMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ClassMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ConstructFromTuple$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ConstructFromTuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler.html)*