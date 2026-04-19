---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive.Directive0Support
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/Directive$$Directive0Support.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive.Directive0Support
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive.Directive0Support

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.Directive.Directive0Support

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/Directive$.html "Permalink")  object [Directive](Directive$.html)Definition Classes[server](index.html)
- Directive0Support
- [SingleValueTransformers](Directive$$SingleValueTransformers.html "\"Standard\" transformers for Directive1.")
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[Directive](Directive$.html)

# Directive0Support[**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html "Permalink")

### 

#### implicit final  class Directive0Support extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Adds helper functions to `Directive0`

Source[Directive.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/Directive.scala#L171)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Directive0Support
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

1. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#<init>(underlying:akka.http.scaladsl.server.Directive0):akka.http.scaladsl.server.Directive.Directive0Support "Permalink")  new Directive0Support(underlying: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit]))
### Value Members

1. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Directive0Support toany2stringadd\[Directive0Support] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Directive0Support, B)ImplicitThis member is added by an implicit conversion from Directive0Support toArrowAssoc\[Directive0Support] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Directive0Support) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Directive0SupportImplicitThis member is added by an implicit conversion from Directive0Support toEnsuring\[Directive0Support] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
8. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Directive0Support) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Directive0SupportImplicitThis member is added by an implicit conversion from Directive0Support toEnsuring\[Directive0Support] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Directive0SupportImplicitThis member is added by an implicit conversion from Directive0Support toEnsuring\[Directive0Support] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Directive0SupportImplicitThis member is added by an implicit conversion from Directive0Support toEnsuring\[Directive0Support] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
12. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
14. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#underlying:akka.http.scaladsl.server.Directive0 "Permalink")  val underlying: [Directive0](index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])
15. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#wrap[R](f:=>akka.http.scaladsl.server.Directive[R]):akka.http.scaladsl.server.Directive[R] "Permalink")  def wrap\[R](f: \=\> [Directive](Directive.html)\[R]): [Directive](Directive.html)\[R]
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Directive0Support toStringFormat\[Directive0Support] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../../akka/http/scaladsl/server/Directive$$Directive0Support.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Directive0Support, B)ImplicitThis member is added by an implicit conversion from Directive0Support toArrowAssoc\[Directive0Support] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDirective0Support to any2stringadd\[Directive0Support]

### Inherited by implicit conversion StringFormat fromDirective0Support to StringFormat\[Directive0Support]

### Inherited by implicit conversion Ensuring fromDirective0Support to Ensuring\[Directive0Support]

### Inherited by implicit conversion ArrowAssoc fromDirective0Support to ArrowAssoc\[Directive0Support]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$$Directive0Support.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$$SingleValueTransformers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$$Directive0Support.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive$$Directive0Support.html)*