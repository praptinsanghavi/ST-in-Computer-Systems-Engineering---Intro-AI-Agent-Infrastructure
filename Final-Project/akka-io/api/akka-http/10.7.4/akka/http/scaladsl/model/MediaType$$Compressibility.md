---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType.Compressibility
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:44:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaType$$Compressibility.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType.Compressibility
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType.Compressibility

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType.Compressibility

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/MediaType$.html "Permalink")  object [MediaType](MediaType$.html)Definition Classes[model](index.html)
- [Binary](MediaType$$Binary.html)
- Compressibility
- [Compressible](MediaType$$Compressible$.html)
- [Gzipped](MediaType$$Gzipped$.html)
- [Multipart](MediaType$$Multipart.html)
- [NonBinary](MediaType$$NonBinary.html)
- [NonMultipartWithOpenCharset](MediaType$$NonMultipartWithOpenCharset.html)
- [NotCompressible](MediaType$$NotCompressible$.html)
- [WithFixedCharset](MediaType$$WithFixedCharset.html)
- [WithOpenCharset](MediaType$$WithOpenCharset.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[MediaType](MediaType$.html)

# Compressibility[**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html "Permalink")

### 

#### sealed  class Compressibility extends [javadsl.model.MediaType.Compressibility](../../javadsl/model/MediaType$$Compressibility.html)

Source[MediaType.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/MediaType.scala#L298)Linear Supertypes[javadsl.model.MediaType.Compressibility](../../javadsl/model/MediaType$$Compressibility.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Compressible](MediaType$$Compressible$.html), [Gzipped](MediaType$$Gzipped$.html), [NotCompressible](MediaType$$NotCompressible$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Compressibility
2. Compressibility
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

1. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#<init>(compressible:Boolean):akka.http.scaladsl.model.MediaType.Compressibility "Permalink")  new Compressibility(compressible: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))
### Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Compressibility toany2stringadd\[Compressibility] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Compressibility, B)ImplicitThis member is added by an implicit conversion from Compressibility toArrowAssoc\[Compressibility] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#compressible:Boolean "Permalink")  val compressible: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesCompressibility → [Compressibility](../../javadsl/model/MediaType$$Compressibility.html)
9. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Compressibility) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CompressibilityImplicitThis member is added by an implicit conversion from Compressibility toEnsuring\[Compressibility] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Compressibility) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CompressibilityImplicitThis member is added by an implicit conversion from Compressibility toEnsuring\[Compressibility] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CompressibilityImplicitThis member is added by an implicit conversion from Compressibility toEnsuring\[Compressibility] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CompressibilityImplicitThis member is added by an implicit conversion from Compressibility toEnsuring\[Compressibility] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Compressibility toStringFormat\[Compressibility] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/MediaType$$Compressibility.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Compressibility, B)ImplicitThis member is added by an implicit conversion from Compressibility toArrowAssoc\[Compressibility] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.model.MediaType.Compressibility](../../javadsl/model/MediaType$$Compressibility.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCompressibility to any2stringadd\[Compressibility]

### Inherited by implicit conversion StringFormat fromCompressibility to StringFormat\[Compressibility]

### Inherited by implicit conversion Ensuring fromCompressibility to Ensuring\[Compressibility]

### Inherited by implicit conversion ArrowAssoc fromCompressibility to ArrowAssoc\[Compressibility]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$Compressibility.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Binary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Compressibility.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Compressible$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Gzipped$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$NonBinary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$NonMultipartWithOpenCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$NotCompressible$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$WithFixedCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$WithOpenCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Compressibility.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Compressibility.html)*