---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:39:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FormFieldDirectives.FieldDef

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$.html "Permalink")  object [FormFieldDirectives](FormFieldDirectives$.html) extends [FormFieldDirectives](FormFieldDirectives.html)Definition Classes[directives](index.html)
- FieldDef
- [FieldMagnet](FormFieldDirectives$$FieldMagnet.html)
- [FieldSpec](FormFieldDirectives$$FieldSpec.html)
[t](FormFieldDirectives$$FieldDef$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html).[FormFieldDirectives](FormFieldDirectives$.html)

# [FieldDef](FormFieldDirectives$$FieldDef$.html "See companion object")[**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html "Permalink")

### Companion [object FieldDef](FormFieldDirectives$$FieldDef$.html "See companion object")

#### sealed  trait FieldDef\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use new `formFields` overloads with FieldSpec parameters. Kept for binary compatibility

Source[FormFieldDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/FormFieldDirectives.scala#L213)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FieldDef
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

1. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#U "Permalink") abstract  type U
### Abstract Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#apply(value:T):akka.http.scaladsl.server.Directive[FieldDef.this.U] "Permalink") abstract  def apply(value: T): [Directive](../Directive.html)\[[U](#U)]
### Concrete Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FieldDef\[T] toany2stringadd\[FieldDef\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FieldDef\[T], B)ImplicitThis member is added by an implicit conversion from FieldDef\[T] toArrowAssoc\[FieldDef\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FieldDef\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FieldDef\[T]ImplicitThis member is added by an implicit conversion from FieldDef\[T] toEnsuring\[FieldDef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FieldDef\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FieldDef\[T]ImplicitThis member is added by an implicit conversion from FieldDef\[T] toEnsuring\[FieldDef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FieldDef\[T]ImplicitThis member is added by an implicit conversion from FieldDef\[T] toEnsuring\[FieldDef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FieldDef\[T]ImplicitThis member is added by an implicit conversion from FieldDef\[T] toEnsuring\[FieldDef\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FieldDef\[T] toStringFormat\[FieldDef\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FieldDef\[T], B)ImplicitThis member is added by an implicit conversion from FieldDef\[T] toArrowAssoc\[FieldDef\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFieldDef\[T] to any2stringadd\[FieldDef\[T]]

### Inherited by implicit conversion StringFormat fromFieldDef\[T] to StringFormat\[FieldDef\[T]]

### Inherited by implicit conversion Ensuring fromFieldDef\[T] to Ensuring\[FieldDef\[T]]

### Inherited by implicit conversion ArrowAssoc fromFieldDef\[T] to ArrowAssoc\[FieldDef\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldSpec.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$$FieldDef.html)*