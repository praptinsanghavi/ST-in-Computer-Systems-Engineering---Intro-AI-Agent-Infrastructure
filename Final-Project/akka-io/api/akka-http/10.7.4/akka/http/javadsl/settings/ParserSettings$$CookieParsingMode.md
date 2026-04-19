---
description: Akka HTTP 10.7.4 - akka.http.javadsl.settings.ParserSettings.CookieParsingMode
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.settings.ParserSettings.CookieParsingMode
---

# Akka HTTP 10.7.4 - akka.http.javadsl.settings.ParserSettings.CookieParsingMode

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.settings.ParserSettings.CookieParsingMode

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/settings/ParserSettings$.html "Permalink")  object [ParserSettings](ParserSettings$.html) extends [SettingsCompanion](SettingsCompanion.html)\[[ParserSettings](ParserSettings.html)]Definition Classes[settings](index.html)
- [ConflictingContentTypeHeaderProcessingMode](ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html)
- CookieParsingMode
- [ErrorLoggingVerbosity](ParserSettings$$ErrorLoggingVerbosity.html)
- [IllegalResponseHeaderNameProcessingMode](ParserSettings$$IllegalResponseHeaderNameProcessingMode.html)
- [IllegalResponseHeaderValueProcessingMode](ParserSettings$$IllegalResponseHeaderValueProcessingMode.html)
t[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[settings](index.html).[ParserSettings](ParserSettings$.html)

# CookieParsingMode[**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html "Permalink")

### 

#### trait CookieParsingMode extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ParserSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/settings/ParserSettings.scala#L100)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[CookieParsingMode](../../scaladsl/settings/ParserSettings$$CookieParsingMode.html), [RFC6265](../../scaladsl/settings/ParserSettings$$CookieParsingMode$$RFC6265$.html), [Raw](../../scaladsl/settings/ParserSettings$$CookieParsingMode$$Raw$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CookieParsingMode
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
### Value Members

1. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from CookieParsingMode toany2stringadd\[CookieParsingMode] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (CookieParsingMode, B)ImplicitThis member is added by an implicit conversion from CookieParsingMode toArrowAssoc\[CookieParsingMode] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (CookieParsingMode) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CookieParsingModeImplicitThis member is added by an implicit conversion from CookieParsingMode toEnsuring\[CookieParsingMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (CookieParsingMode) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CookieParsingModeImplicitThis member is added by an implicit conversion from CookieParsingMode toEnsuring\[CookieParsingMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CookieParsingModeImplicitThis member is added by an implicit conversion from CookieParsingMode toEnsuring\[CookieParsingMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CookieParsingModeImplicitThis member is added by an implicit conversion from CookieParsingMode toEnsuring\[CookieParsingMode] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from CookieParsingMode toStringFormat\[CookieParsingMode] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (CookieParsingMode, B)ImplicitThis member is added by an implicit conversion from CookieParsingMode toArrowAssoc\[CookieParsingMode] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCookieParsingMode to any2stringadd\[CookieParsingMode]

### Inherited by implicit conversion StringFormat fromCookieParsingMode to StringFormat\[CookieParsingMode]

### Inherited by implicit conversion Ensuring fromCookieParsingMode to Ensuring\[CookieParsingMode]

### Inherited by implicit conversion ArrowAssoc fromCookieParsingMode to ArrowAssoc\[CookieParsingMode]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$ErrorLoggingVerbosity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/SettingsCompanion.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$CookieParsingMode$$RFC6265$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$CookieParsingMode$$Raw$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$$CookieParsingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html)*