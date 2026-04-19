---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.ContentType.WithCharset
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:43:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ContentType$$WithCharset.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.ContentType.WithCharset
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.ContentType.WithCharset

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.ContentType.WithCharset

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/model/ContentType$.html "Permalink")  object [ContentType](ContentType$.html)Definition Classes[model](index.html)
- [Binary](ContentType$$Binary.html "Represents a content-type which we know not to contain text (will never have a charset)")
- [NonBinary](ContentType$$NonBinary.html "Represents a content-type which we know to contain text, and has a specified charset.")
- WithCharset
- [WithFixedCharset](ContentType$$WithFixedCharset.html "Represents a content-type which we know to contain text, where the charset always has the same predefined value.")
- [WithMissingCharset](ContentType$$WithMissingCharset.html "Represents a content-type which we know to contain text, and would be better off having a charset, but the client hasn't provided that.")
t[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[model](index.html).[ContentType](ContentType$.html)

# WithCharset[**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html "Permalink")

### 

#### trait WithCharset extends [NonBinary](ContentType$$NonBinary.html)

Represents a content\-type which we know to contain text, and the charset is known at runtime.

Source[ContentType.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/model/ContentType.scala#L30)Linear Supertypes[NonBinary](ContentType$$NonBinary.html), [ContentType](ContentType.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[WithCharset](../../scaladsl/model/ContentType$$WithCharset.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WithCharset
2. NonBinary
3. ContentType
4. AnyRef
5. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#binary:Boolean "Permalink") abstract  def binary: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)True if this ContentType is non\-textual.

True if this ContentType is non\-textual.

Definition Classes[ContentType](ContentType.html)
2. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#charset:akka.http.javadsl.model.HttpCharset "Permalink") abstract  def charset: [HttpCharset](HttpCharset.html)Definition Classes[NonBinary](ContentType$$NonBinary.html)
3. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#getCharsetOption:java.util.Optional[akka.http.javadsl.model.HttpCharset] "Permalink") abstract  def getCharsetOption: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[HttpCharset](HttpCharset.html)]Returns the charset if this ContentType is non\-binary.

Returns the charset if this ContentType is non\-binary.

Definition Classes[ContentType](ContentType.html)
4. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#mediaType:akka.http.javadsl.model.MediaType "Permalink") abstract  def mediaType: [MediaType](MediaType.html)The media\-type of this content\-type.

The media\-type of this content\-type.

Definition Classes[ContentType](ContentType.html)
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WithCharset toany2stringadd\[WithCharset] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WithCharset, B)ImplicitThis member is added by an implicit conversion from WithCharset toArrowAssoc\[WithCharset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WithCharset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WithCharsetImplicitThis member is added by an implicit conversion from WithCharset toEnsuring\[WithCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WithCharset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WithCharsetImplicitThis member is added by an implicit conversion from WithCharset toEnsuring\[WithCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WithCharsetImplicitThis member is added by an implicit conversion from WithCharset toEnsuring\[WithCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WithCharsetImplicitThis member is added by an implicit conversion from WithCharset toEnsuring\[WithCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WithCharset toStringFormat\[WithCharset] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/model/ContentType$$WithCharset.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WithCharset, B)ImplicitThis member is added by an implicit conversion from WithCharset toArrowAssoc\[WithCharset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NonBinary](ContentType$$NonBinary.html)

### Inherited from [ContentType](ContentType.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromWithCharset to any2stringadd\[WithCharset]

### Inherited by implicit conversion StringFormat fromWithCharset to StringFormat\[WithCharset]

### Inherited by implicit conversion Ensuring fromWithCharset to Ensuring\[WithCharset]

### Inherited by implicit conversion ArrowAssoc fromWithCharset to ArrowAssoc\[WithCharset]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$Binary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$NonBinary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$WithCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$WithFixedCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$WithMissingCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$$WithCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$WithCharset.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$WithCharset.html)*