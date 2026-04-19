---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps.Join
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/TupleOps$$Join.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps.Join
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps.Join

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.TupleOps.Join

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package [util](index.html)Definition Classes[server](../index.html)
- [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html "Permalink")  object [TupleOps](TupleOps$.html)Definition Classes[util](index.html)
- [AppendOne](TupleOps$$AppendOne.html)
- [FoldLeft](TupleOps$$FoldLeft.html)
- Join
- [LowLevelJoinImplicits](TupleOps$$LowLevelJoinImplicits.html)
[t](TupleOps$$Join$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[util](index.html).[TupleOps](TupleOps$.html)

# [Join](TupleOps$$Join$.html "See companion object")[**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html "Permalink")

### Companion [object Join](TupleOps$$Join$.html "See companion object")

#### trait Join\[P, S] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[TupleOps.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/util/TupleOps.scala#L41)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Join
2. AnyRef
3. Any
Implicitly  
1. by enhanceTuple
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#Out "Permalink") abstract  type Out
### Abstract Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#apply(prefix:P,suffix:S):Join.this.Out "Permalink") abstract  def apply(prefix: P, suffix: S): [Out](#Out)
### Concrete Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Join\[P, S] toany2stringadd\[Join\[P, S]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Join\[P, S], B)ImplicitThis member is added by an implicit conversion from Join\[P, S] toArrowAssoc\[Join\[P, S]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#append[S](value:S)(implicitao:akka.http.scaladsl.server.util.TupleOps.AppendOne[T,S]):ao.Out "Permalink")  def append\[S](value: S)(implicit ao: [AppendOne](TupleOps$$AppendOne.html)\[Join\[P, S], S]): [AppendOne.Out](TupleOps$$AppendOne.html#Out)Appends the given value to the tuple producing a tuple of arity n \+ 1\.

Appends the given value to the tuple producing a tuple of arity n \+ 1\.

ImplicitThis member is added by an implicit conversion from Join\[P, S] to[TupleOps](TupleOps.html)\[Join\[P, S]] performed by method enhanceTuple in [akka.http.scaladsl.server.util.TupleOps](TupleOps$.html).This conversion will take place only if an implicit value of type [Tuple](Tuple.html)\[Join\[P, S]] is in scope.Definition Classes[TupleOps](TupleOps.html)
7. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Join\[P, S]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Join\[P, S]ImplicitThis member is added by an implicit conversion from Join\[P, S] toEnsuring\[Join\[P, S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Join\[P, S]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Join\[P, S]ImplicitThis member is added by an implicit conversion from Join\[P, S] toEnsuring\[Join\[P, S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Join\[P, S]ImplicitThis member is added by an implicit conversion from Join\[P, S] toEnsuring\[Join\[P, S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Join\[P, S]ImplicitThis member is added by an implicit conversion from Join\[P, S] toEnsuring\[Join\[P, S]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#foldLeft[In](zero:In)(op:akka.http.scaladsl.server.util.BinaryPolyFunc)(implicitfold:akka.http.scaladsl.server.util.TupleOps.FoldLeft[In,T,op.type]):fold.Out "Permalink")  def foldLeft\[In](zero: In)(op: [BinaryPolyFunc](BinaryPolyFunc.html))(implicit fold: [FoldLeft](TupleOps$$FoldLeft.html)\[In, Join\[P, S], op.type]): [FoldLeft.Out](TupleOps$$FoldLeft.html#Out)Left\-Folds over the tuple using the given binary poly\-function.

Left\-Folds over the tuple using the given binary poly\-function.

ImplicitThis member is added by an implicit conversion from Join\[P, S] to[TupleOps](TupleOps.html)\[Join\[P, S]] performed by method enhanceTuple in [akka.http.scaladsl.server.util.TupleOps](TupleOps$.html).This conversion will take place only if an implicit value of type [Tuple](Tuple.html)\[Join\[P, S]] is in scope.Definition Classes[TupleOps](TupleOps.html)
16. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#join[S](suffixTuple:S)(implicitjoin:akka.http.scaladsl.server.util.TupleOps.Join[T,S]):join.Out "Permalink")  def join\[S](suffixTuple: S)(implicit join: Join\[Join\[P, S], S]): [Out](#Out)Appends the given tuple to the underlying tuple producing a tuple of arity n \+ m.

Appends the given tuple to the underlying tuple producing a tuple of arity n \+ m.

ImplicitThis member is added by an implicit conversion from Join\[P, S] to[TupleOps](TupleOps.html)\[Join\[P, S]] performed by method enhanceTuple in [akka.http.scaladsl.server.util.TupleOps](TupleOps$.html).This conversion will take place only if an implicit value of type [Tuple](Tuple.html)\[Join\[P, S]] is in scope.Definition Classes[TupleOps](TupleOps.html)
20. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#tuple:T "Permalink")  val tuple: Join\[P, S]ImplicitThis member is added by an implicit conversion from Join\[P, S] to[TupleOps](TupleOps.html)\[Join\[P, S]] performed by method enhanceTuple in [akka.http.scaladsl.server.util.TupleOps](TupleOps$.html).This conversion will take place only if an implicit value of type [Tuple](Tuple.html)\[Join\[P, S]] is in scope.Definition Classes[TupleOps](TupleOps.html)
26. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Join\[P, S] toStringFormat\[Join\[P, S]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$$Join.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Join\[P, S], B)ImplicitThis member is added by an implicit conversion from Join\[P, S] toArrowAssoc\[Join\[P, S]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion enhanceTuple fromJoin\[P, S] to [TupleOps](TupleOps.html)\[Join\[P, S]]

### Inherited by implicit conversion any2stringadd fromJoin\[P, S] to any2stringadd\[Join\[P, S]]

### Inherited by implicit conversion StringFormat fromJoin\[P, S] to StringFormat\[Join\[P, S]]

### Inherited by implicit conversion Ensuring fromJoin\[P, S] to Ensuring\[Join\[P, S]]

### Inherited by implicit conversion ArrowAssoc fromJoin\[P, S] to ArrowAssoc\[Join\[P, S]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$AppendOne$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$AppendOne.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$FoldLeft$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$FoldLeft.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$Join$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$Join.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$LowLevelJoinImplicits.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$Join.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$$Join.html)*