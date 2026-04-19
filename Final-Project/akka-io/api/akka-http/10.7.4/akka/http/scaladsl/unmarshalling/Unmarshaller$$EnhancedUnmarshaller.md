---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller.EnhancedUnmarshaller
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller.EnhancedUnmarshaller
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller.EnhancedUnmarshaller

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller.EnhancedUnmarshaller

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html "Permalink")  object [Unmarshaller](Unmarshaller$.html) extends [GenericUnmarshallers](GenericUnmarshallers.html) with [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html) with [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)Definition Classes[unmarshalling](index.html)
- [EitherUnmarshallingException](Unmarshaller$$EitherUnmarshallingException.html "Order of parameters (right first, left second) is intentional, since that's the order we evaluate them in.")
- [EnhancedFromEntityUnmarshaller](Unmarshaller$$EnhancedFromEntityUnmarshaller.html)
- EnhancedUnmarshaller
- [NoContentException](Unmarshaller$$NoContentException$.html "Signals that unmarshalling failed because the entity was unexpectedly empty.")
- [UnsupportedContentTypeException](Unmarshaller$$UnsupportedContentTypeException.html "Signals that unmarshalling failed because the entity content-type did not match one of the supported ranges.")
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[unmarshalling](index.html).[Unmarshaller](Unmarshaller$.html)

# EnhancedUnmarshaller[**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html "Permalink")

### 

#### implicit final  class EnhancedUnmarshaller\[A, B] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Source[Unmarshaller.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/Unmarshaller.scala#L91)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EnhancedUnmarshaller
2. AnyVal
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

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#<init>(um:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B]):akka.http.scaladsl.unmarshalling.Unmarshaller.EnhancedUnmarshaller[A,B] "Permalink")  new EnhancedUnmarshaller(um: [Unmarshaller](Unmarshaller.html)\[A, B])
### Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EnhancedUnmarshaller\[A, B] toany2stringadd\[EnhancedUnmarshaller\[A, B]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EnhancedUnmarshaller\[A, B], B)ImplicitThis member is added by an implicit conversion from EnhancedUnmarshaller\[A, B] toArrowAssoc\[EnhancedUnmarshaller\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EnhancedUnmarshaller\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EnhancedUnmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from EnhancedUnmarshaller\[A, B] toEnsuring\[EnhancedUnmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
8. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EnhancedUnmarshaller\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EnhancedUnmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from EnhancedUnmarshaller\[A, B] toEnsuring\[EnhancedUnmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EnhancedUnmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from EnhancedUnmarshaller\[A, B] toEnsuring\[EnhancedUnmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EnhancedUnmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from EnhancedUnmarshaller\[A, B] toEnsuring\[EnhancedUnmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#flatMapWithInput[C](f:(A,B)=>scala.concurrent.Future[C]):akka.http.scaladsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def flatMapWithInput\[C](f: (A, B) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[C]): [Unmarshaller](Unmarshaller.html)\[A, C]
12. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
13. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#mapWithInput[C](f:(A,B)=>C):akka.http.scaladsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def mapWithInput\[C](f: (A, B) \=\> C): [Unmarshaller](Unmarshaller.html)\[A, C]
15. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
16. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#um:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B] "Permalink")  val um: [Unmarshaller](Unmarshaller.html)\[A, B]
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EnhancedUnmarshaller\[A, B] toStringFormat\[EnhancedUnmarshaller\[A, B]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EnhancedUnmarshaller\[A, B], B)ImplicitThis member is added by an implicit conversion from EnhancedUnmarshaller\[A, B] toArrowAssoc\[EnhancedUnmarshaller\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEnhancedUnmarshaller\[A, B] to any2stringadd\[EnhancedUnmarshaller\[A, B]]

### Inherited by implicit conversion StringFormat fromEnhancedUnmarshaller\[A, B] to StringFormat\[EnhancedUnmarshaller\[A, B]]

### Inherited by implicit conversion Ensuring fromEnhancedUnmarshaller\[A, B] to Ensuring\[EnhancedUnmarshaller\[A, B]]

### Inherited by implicit conversion ArrowAssoc fromEnhancedUnmarshaller\[A, B] to ArrowAssoc\[EnhancedUnmarshaller\[A, B]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$EitherUnmarshallingException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$NoContentException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$UnsupportedContentTypeException$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$UnsupportedContentTypeException.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html)*