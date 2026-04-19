---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:59Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/settings/ParserSettings$.html "Permalink")  object [ParserSettings](ParserSettings$.html) extends SettingsCompanion\[[ParserSettings](ParserSettings.html)]Definition Classes[settings](index.html)
- [ConflictingContentTypeHeaderProcessingMode](ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html)
- [CookieParsingMode](ParserSettings$$CookieParsingMode.html)
- ErrorLoggingVerbosity
- [IllegalResponseHeaderNameProcessingMode](ParserSettings$$IllegalResponseHeaderNameProcessingMode.html)
- [IllegalResponseHeaderValueProcessingMode](ParserSettings$$IllegalResponseHeaderValueProcessingMode.html)
[t](ParserSettings$$ErrorLoggingVerbosity$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[settings](index.html).[ParserSettings](ParserSettings$.html)

# [ErrorLoggingVerbosity](ParserSettings$$ErrorLoggingVerbosity$.html "See companion object")[**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html "Permalink")

### Companion [object ErrorLoggingVerbosity](ParserSettings$$ErrorLoggingVerbosity$.html "See companion object")

#### sealed  trait ErrorLoggingVerbosity extends [javadsl.settings.ParserSettings.ErrorLoggingVerbosity](../../javadsl/settings/ParserSettings$$ErrorLoggingVerbosity.html)

Source[ParserSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/settings/ParserSettings.scala#L155)Linear Supertypes[javadsl.settings.ParserSettings.ErrorLoggingVerbosity](../../javadsl/settings/ParserSettings$$ErrorLoggingVerbosity.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Full](ParserSettings$$ErrorLoggingVerbosity$$Full$.html), [Off](ParserSettings$$ErrorLoggingVerbosity$$Off$.html), [Simple](ParserSettings$$ErrorLoggingVerbosity$$Simple$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ErrorLoggingVerbosity
2. ErrorLoggingVerbosity
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

1. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ErrorLoggingVerbosity toany2stringadd\[ErrorLoggingVerbosity] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ErrorLoggingVerbosity, B)ImplicitThis member is added by an implicit conversion from ErrorLoggingVerbosity toArrowAssoc\[ErrorLoggingVerbosity] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ErrorLoggingVerbosity) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ErrorLoggingVerbosityImplicitThis member is added by an implicit conversion from ErrorLoggingVerbosity toEnsuring\[ErrorLoggingVerbosity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ErrorLoggingVerbosity) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ErrorLoggingVerbosityImplicitThis member is added by an implicit conversion from ErrorLoggingVerbosity toEnsuring\[ErrorLoggingVerbosity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ErrorLoggingVerbosityImplicitThis member is added by an implicit conversion from ErrorLoggingVerbosity toEnsuring\[ErrorLoggingVerbosity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ErrorLoggingVerbosityImplicitThis member is added by an implicit conversion from ErrorLoggingVerbosity toEnsuring\[ErrorLoggingVerbosity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ErrorLoggingVerbosity toStringFormat\[ErrorLoggingVerbosity] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ErrorLoggingVerbosity, B)ImplicitThis member is added by an implicit conversion from ErrorLoggingVerbosity toArrowAssoc\[ErrorLoggingVerbosity] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.settings.ParserSettings.ErrorLoggingVerbosity](../../javadsl/settings/ParserSettings$$ErrorLoggingVerbosity.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromErrorLoggingVerbosity to any2stringadd\[ErrorLoggingVerbosity]

### Inherited by implicit conversion StringFormat fromErrorLoggingVerbosity to StringFormat\[ErrorLoggingVerbosity]

### Inherited by implicit conversion Ensuring fromErrorLoggingVerbosity to Ensuring\[ErrorLoggingVerbosity]

### Inherited by implicit conversion ArrowAssoc fromErrorLoggingVerbosity to ArrowAssoc\[ErrorLoggingVerbosity]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$ErrorLoggingVerbosity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ConflictingContentTypeHeaderProcessingMode$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$CookieParsingMode$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$CookieParsingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity$$Full$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity$$Off$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity$$Simple$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html)*