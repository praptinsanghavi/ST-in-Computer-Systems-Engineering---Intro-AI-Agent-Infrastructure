---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.BinaryPolyFunc
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.BinaryPolyFunc
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.BinaryPolyFunc

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.BinaryPolyFunc

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package [util](index.html)Definition Classes[server](../index.html)
- [ApplyConverter](ApplyConverter.html "ApplyConverter allows generic conversion of functions of type (T1, T2, ...) => Route to (TupleX(T1, T2, ...)) => Route.")
- BinaryPolyFunc
- [ClassMagnet](ClassMagnet.html "A magnet that wraps a ClassTag")
- [ConstructFromTuple](ConstructFromTuple.html "Constructor for instances of type R which can be created from a tuple of type T.")
- [Tuple](Tuple.html "Phantom type providing implicit evidence that a given type is a Tuple or Unit.")
- [TupleOps](TupleOps.html)
- [Tupler](Tupler.html "Provides a way to convert a value into an Tuple.")
[t](BinaryPolyFunc$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[util](index.html)

# [BinaryPolyFunc](BinaryPolyFunc$.html "See companion object")[**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html "Permalink")

### Companion [object BinaryPolyFunc](BinaryPolyFunc$.html "See companion object")

#### trait BinaryPolyFunc extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Allows the definition of binary poly\-functions (e.g. for folding over tuples).

Note: the poly\-function implementation seen here is merely a stripped down version of
what Miles Sabin made available with his awesome shapeless library. All credit goes to him!

Source[BinaryPolyFunc.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/util/BinaryPolyFunc.scala#L13)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ConvertFieldDefAndConcatenate](../directives/FormFieldDirectives$$FieldDef$$ConvertFieldDefAndConcatenate$.html), [ConvertParamDefAndConcatenate](../directives/ParameterDirectives$$ParamDef$$ConvertParamDefAndConcatenate$.html), [Fold](TupleOps$$Join$$Fold$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BinaryPolyFunc
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

1. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc$CaseBuilder.html "Permalink")  class [CaseBuilder](BinaryPolyFunc$CaseBuilder.html)\[A, B] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from BinaryPolyFunc toany2stringadd\[BinaryPolyFunc] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (BinaryPolyFunc, B)ImplicitThis member is added by an implicit conversion from BinaryPolyFunc toArrowAssoc\[BinaryPolyFunc] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#at[A,B]:BinaryPolyFunc.this.CaseBuilder[A,B] "Permalink")  def at\[A, B]: [CaseBuilder](BinaryPolyFunc$CaseBuilder.html)\[A, B]
8. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (BinaryPolyFunc) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BinaryPolyFuncImplicitThis member is added by an implicit conversion from BinaryPolyFunc toEnsuring\[BinaryPolyFunc] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (BinaryPolyFunc) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BinaryPolyFuncImplicitThis member is added by an implicit conversion from BinaryPolyFunc toEnsuring\[BinaryPolyFunc] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BinaryPolyFuncImplicitThis member is added by an implicit conversion from BinaryPolyFunc toEnsuring\[BinaryPolyFunc] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BinaryPolyFuncImplicitThis member is added by an implicit conversion from BinaryPolyFunc toEnsuring\[BinaryPolyFunc] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from BinaryPolyFunc toStringFormat\[BinaryPolyFunc] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (BinaryPolyFunc, B)ImplicitThis member is added by an implicit conversion from BinaryPolyFunc toArrowAssoc\[BinaryPolyFunc] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBinaryPolyFunc to any2stringadd\[BinaryPolyFunc]

### Inherited by implicit conversion StringFormat fromBinaryPolyFunc to StringFormat\[BinaryPolyFunc]

### Inherited by implicit conversion Ensuring fromBinaryPolyFunc to Ensuring\[BinaryPolyFunc]

### Inherited by implicit conversion ArrowAssoc fromBinaryPolyFunc to ArrowAssoc\[BinaryPolyFunc]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$$ConvertFieldDefAndConcatenate$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$$ParamDef$$ConvertParamDefAndConcatenate$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc$CaseBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ClassMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ClassMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ConstructFromTuple$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ConstructFromTuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$Join$$Fold$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc.html)*