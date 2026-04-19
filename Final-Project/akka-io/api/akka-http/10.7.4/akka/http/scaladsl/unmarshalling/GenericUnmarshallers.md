---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.GenericUnmarshallers
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.GenericUnmarshallers
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.GenericUnmarshallers

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.GenericUnmarshallers

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[unmarshalling](index.html)
- GenericUnmarshallers
- [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
- [MultipartUnmarshallers](MultipartUnmarshallers.html "Provides akka.http.scaladsl.model.Multipart marshallers.")
- [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
- [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
- [Unmarshal](Unmarshal.html)
- [Unmarshaller](Unmarshaller.html)
t[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[unmarshalling](index.html)

# GenericUnmarshallers[**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html "Permalink")

### 

#### trait GenericUnmarshallers extends [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)

Source[GenericUnmarshallers.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.scala#L14)Linear Supertypes[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Unmarshaller](Unmarshaller$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GenericUnmarshallers
2. LowerPriorityGenericUnmarshallers
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
### Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from GenericUnmarshallers toany2stringadd\[GenericUnmarshallers] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (GenericUnmarshallers, B)ImplicitThis member is added by an implicit conversion from GenericUnmarshallers toArrowAssoc\[GenericUnmarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#eitherUnmarshaller[L,R](implicitua:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[L],implicitrightTag:scala.reflect.ClassTag[R],implicitub:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[R],implicitleftTag:scala.reflect.ClassTag[L]):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[Either[L,R]] "Permalink") implicit  def eitherUnmarshaller\[L, R](implicit ua: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[L], rightTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[R], ub: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[R], leftTag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[L]): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[Either\[L, R]]Enables using Either to encode the following unmarshalling logic:
Attempt unmarshalling the entity as as `R` first (yielding `R`),
and if it fails attempt unmarshalling as `L` (yielding `Left`).

Enables using Either to encode the following unmarshalling logic:
Attempt unmarshalling the entity as as `R` first (yielding `R`),
and if it fails attempt unmarshalling as `L` (yielding `Left`).

The either unmarshaller only works with strict entities, so make sure to wrap routes that want to use it with
`toStrictEntity`. Otherwise, if a non\-strict entity is provided, it will fail with an `IllegalArgumentException`.

Note that the Either's "R" type will be attempted first (as Left is often considered as the "failed case" in Either).

Definition Classes[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
9. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (GenericUnmarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GenericUnmarshallersImplicitThis member is added by an implicit conversion from GenericUnmarshallers toEnsuring\[GenericUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (GenericUnmarshallers) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GenericUnmarshallersImplicitThis member is added by an implicit conversion from GenericUnmarshallers toEnsuring\[GenericUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): GenericUnmarshallersImplicitThis member is added by an implicit conversion from GenericUnmarshallers toEnsuring\[GenericUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): GenericUnmarshallersImplicitThis member is added by an implicit conversion from GenericUnmarshallers toEnsuring\[GenericUnmarshallers] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#liftToSourceOptionUnmarshaller[A,B](um:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B]):akka.http.scaladsl.unmarshalling.Unmarshaller[Option[A],B] "Permalink") implicit  def liftToSourceOptionUnmarshaller\[A, B](um: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A], B]Definition Classes[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
19. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#liftToTargetOptionUnmarshaller[A,B](um:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B]):akka.http.scaladsl.unmarshalling.Unmarshaller[A,Option[B]] "Permalink") implicit  def liftToTargetOptionUnmarshaller\[A, B](um: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[A, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]]
20. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#messageUnmarshallerFromEntityUnmarshaller[T](implicitum:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[T]):akka.http.scaladsl.unmarshalling.FromMessageUnmarshaller[T] "Permalink") implicit  def messageUnmarshallerFromEntityUnmarshaller\[T](implicit um: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[T]): [FromMessageUnmarshaller](index.html#FromMessageUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpMessage,T])\[T]Definition Classes[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
21. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#sourceOptionUnmarshaller[A,B](implicitum:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B]):akka.http.scaladsl.unmarshalling.Unmarshaller[Option[A],B] "Permalink") implicit  def sourceOptionUnmarshaller\[A, B](implicit um: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A], B]Definition Classes[LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
25. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#targetOptionUnmarshaller[A,B](implicitum:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B]):akka.http.scaladsl.unmarshalling.Unmarshaller[A,Option[B]] "Permalink") implicit  def targetOptionUnmarshaller\[A, B](implicit um: [Unmarshaller](Unmarshaller.html)\[A, B]): [Unmarshaller](Unmarshaller.html)\[A, [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[B]]
27. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from GenericUnmarshallers toStringFormat\[GenericUnmarshallers] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (GenericUnmarshallers, B)ImplicitThis member is added by an implicit conversion from GenericUnmarshallers toArrowAssoc\[GenericUnmarshallers] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromGenericUnmarshallers to any2stringadd\[GenericUnmarshallers]

### Inherited by implicit conversion StringFormat fromGenericUnmarshallers to StringFormat\[GenericUnmarshallers]

### Inherited by implicit conversion Ensuring fromGenericUnmarshallers to Ensuring\[GenericUnmarshallers]

### Inherited by implicit conversion ArrowAssoc fromGenericUnmarshallers to ArrowAssoc\[GenericUnmarshallers]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshal$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshal.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html)*