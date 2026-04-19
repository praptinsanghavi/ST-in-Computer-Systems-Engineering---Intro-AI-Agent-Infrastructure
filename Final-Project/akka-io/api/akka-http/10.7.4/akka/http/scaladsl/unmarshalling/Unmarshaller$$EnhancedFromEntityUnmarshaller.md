---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller.EnhancedFromEntityUnmarshaller
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller.EnhancedFromEntityUnmarshaller
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller.EnhancedFromEntityUnmarshaller

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller.EnhancedFromEntityUnmarshaller

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$.html "Permalink")  object [Unmarshaller](Unmarshaller$.html) extends [GenericUnmarshallers](GenericUnmarshallers.html) with [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html) with [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)Definition Classes[unmarshalling](index.html)
- [EitherUnmarshallingException](Unmarshaller$$EitherUnmarshallingException.html "Order of parameters (right first, left second) is intentional, since that's the order we evaluate them in.")
- EnhancedFromEntityUnmarshaller
- [EnhancedUnmarshaller](Unmarshaller$$EnhancedUnmarshaller.html)
- [NoContentException](Unmarshaller$$NoContentException$.html "Signals that unmarshalling failed because the entity was unexpectedly empty.")
- [UnsupportedContentTypeException](Unmarshaller$$UnsupportedContentTypeException.html "Signals that unmarshalling failed because the entity content-type did not match one of the supported ranges.")
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[unmarshalling](index.html).[Unmarshaller](Unmarshaller$.html)

# EnhancedFromEntityUnmarshaller[**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html "Permalink")

### 

#### implicit final  class EnhancedFromEntityUnmarshaller\[A] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Source[Unmarshaller.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/Unmarshaller.scala#L99)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EnhancedFromEntityUnmarshaller
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

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#<init>(underlying:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[A]):akka.http.scaladsl.unmarshalling.Unmarshaller.EnhancedFromEntityUnmarshaller[A] "Permalink")  new EnhancedFromEntityUnmarshaller(underlying: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[A])
### Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EnhancedFromEntityUnmarshaller\[A] toany2stringadd\[EnhancedFromEntityUnmarshaller\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EnhancedFromEntityUnmarshaller\[A], B)ImplicitThis member is added by an implicit conversion from EnhancedFromEntityUnmarshaller\[A] toArrowAssoc\[EnhancedFromEntityUnmarshaller\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EnhancedFromEntityUnmarshaller\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EnhancedFromEntityUnmarshaller\[A]ImplicitThis member is added by an implicit conversion from EnhancedFromEntityUnmarshaller\[A] toEnsuring\[EnhancedFromEntityUnmarshaller\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
8. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EnhancedFromEntityUnmarshaller\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EnhancedFromEntityUnmarshaller\[A]ImplicitThis member is added by an implicit conversion from EnhancedFromEntityUnmarshaller\[A] toEnsuring\[EnhancedFromEntityUnmarshaller\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EnhancedFromEntityUnmarshaller\[A]ImplicitThis member is added by an implicit conversion from EnhancedFromEntityUnmarshaller\[A] toEnsuring\[EnhancedFromEntityUnmarshaller\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EnhancedFromEntityUnmarshaller\[A]ImplicitThis member is added by an implicit conversion from EnhancedFromEntityUnmarshaller\[A] toEnsuring\[EnhancedFromEntityUnmarshaller\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#forContentTypes(ranges:akka.http.scaladsl.model.ContentTypeRange*):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[A] "Permalink")  def forContentTypes(ranges: [ContentTypeRange](../model/ContentTypeRange.html)\*): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[A]Modifies the underlying [Unmarshaller](Unmarshaller.html) to only accept Content\-Types matching one of the given ranges.

Modifies the underlying [Unmarshaller](Unmarshaller.html) to only accept Content\-Types matching one of the given ranges.
Note that you can only restrict to a subset of the Content\-Types accepted by the underlying unmarshaller,
i.e. the given ranges must be completely supported also by the underlying Unmarshaller!
If a violation of this rule is detected at runtime, i.e. if an entity is encountered whose Content\-Type
is matched by one of the given ranges but rejected by the underlying unmarshaller
an IllegalStateException will be thrown!
12. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
13. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#mapWithCharset[B](f:(A,akka.http.scaladsl.model.HttpCharset)=>B):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[B] "Permalink")  def mapWithCharset\[B](f: (A, [HttpCharset](../model/HttpCharset.html)) \=\> B): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[B]
15. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
16. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#underlying:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[A] "Permalink")  val underlying: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[A]
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EnhancedFromEntityUnmarshaller\[A] toStringFormat\[EnhancedFromEntityUnmarshaller\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EnhancedFromEntityUnmarshaller\[A], B)ImplicitThis member is added by an implicit conversion from EnhancedFromEntityUnmarshaller\[A] toArrowAssoc\[EnhancedFromEntityUnmarshaller\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEnhancedFromEntityUnmarshaller\[A] to any2stringadd\[EnhancedFromEntityUnmarshaller\[A]]

### Inherited by implicit conversion StringFormat fromEnhancedFromEntityUnmarshaller\[A] to StringFormat\[EnhancedFromEntityUnmarshaller\[A]]

### Inherited by implicit conversion Ensuring fromEnhancedFromEntityUnmarshaller\[A] to Ensuring\[EnhancedFromEntityUnmarshaller\[A]]

### Inherited by implicit conversion ArrowAssoc fromEnhancedFromEntityUnmarshaller\[A] to ArrowAssoc\[EnhancedFromEntityUnmarshaller\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html)*