---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.MediaType.WithOpenCharset
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:44:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaType$$WithOpenCharset.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.MediaType.WithOpenCharset
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.MediaType.WithOpenCharset

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.MediaType.WithOpenCharset

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/model/MediaType$.html "Permalink")  object [MediaType](MediaType$.html "Represents an Http media-type.")Represents an Http media\-type.

Represents an Http media\-type. A media\-type consists of a main\-type and a sub\-type.

See [MediaTypes](MediaTypes.html) for convenience access to often used values.

Definition Classes[model](index.html)
- [Binary](MediaType$$Binary.html)
- [Compressibility](MediaType$$Compressibility.html)
- [Multipart](MediaType$$Multipart.html)
- [NonBinary](MediaType$$NonBinary.html)
- [WithFixedCharset](MediaType$$WithFixedCharset.html)
- WithOpenCharset
t[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[model](index.html).[MediaType](MediaType$.html)

# WithOpenCharset[**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html "Permalink")

### 

#### trait WithOpenCharset extends [NonBinary](MediaType$$NonBinary.html)

Source[MediaType.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/model/MediaType.scala#L33)Linear Supertypes[NonBinary](MediaType$$NonBinary.html), [MediaType](MediaType.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[NonMultipartWithOpenCharset](../../scaladsl/model/MediaType$$NonMultipartWithOpenCharset.html), [WithOpenCharset](../../scaladsl/model/MediaType$$WithOpenCharset.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WithOpenCharset
2. NonBinary
3. MediaType
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

1. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#binary:Boolean "Permalink") abstract  def binary: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)True when this media\-type is not character\-based.

True when this media\-type is not character\-based.

Definition Classes[MediaType](MediaType.html)
2. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#isApplication:Boolean "Permalink") abstract  def isApplication: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
3. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#isAudio:Boolean "Permalink") abstract  def isAudio: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
4. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#isCompressible:Boolean "Permalink") abstract  def isCompressible: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)True when this media\-type is generally compressible.

True when this media\-type is generally compressible.

Definition Classes[MediaType](MediaType.html)
5. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#isImage:Boolean "Permalink") abstract  def isImage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
6. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#isMessage:Boolean "Permalink") abstract  def isMessage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
7. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#isMultipart:Boolean "Permalink") abstract  def isMultipart: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
8. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#isText:Boolean "Permalink") abstract  def isText: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
9. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#isVideo:Boolean "Permalink") abstract  def isVideo: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
10. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#mainType:String "Permalink") abstract  def mainType: StringThe main\-type of this media\-type.

The main\-type of this media\-type.

Definition Classes[MediaType](MediaType.html)
11. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#subType:String "Permalink") abstract  def subType: StringThe sub\-type of this media\-type.

The sub\-type of this media\-type.

Definition Classes[MediaType](MediaType.html)
12. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#toContentType(charset:akka.http.javadsl.model.HttpCharset):akka.http.javadsl.model.ContentType.WithCharset "Permalink") abstract  def toContentType(charset: [HttpCharset](HttpCharset.html)): [WithCharset](ContentType$$WithCharset.html)Turns the media type into a content type with the given charset.
13. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#toContentTypeWithMissingCharset:akka.http.javadsl.model.ContentType.WithMissingCharset "Permalink") abstract  def toContentTypeWithMissingCharset: [WithMissingCharset](ContentType$$WithMissingCharset.html)Turns the media type into a content type without specifying a charset.

Turns the media type into a content type without specifying a charset.

This is generally NOT what you want, since you're hiding the actual character encoding of your content, making
decoding it possibly ambiguous.

Consider using toContentType(charset: HttpCharset) instead.
14. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#toRange(qValue:Float):akka.http.javadsl.model.MediaRange "Permalink") abstract  def toRange(qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)): [MediaRange](MediaRange.html)Creates a media\-range from this media\-type with a given qValue.

Creates a media\-range from this media\-type with a given qValue.

Definition Classes[MediaType](MediaType.html)
15. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#toRange:akka.http.javadsl.model.MediaRange "Permalink") abstract  def toRange: [MediaRange](MediaRange.html)Creates a media\-range from this media\-type.

Creates a media\-range from this media\-type.

Definition Classes[MediaType](MediaType.html)
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WithOpenCharset toany2stringadd\[WithOpenCharset] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WithOpenCharset, B)ImplicitThis member is added by an implicit conversion from WithOpenCharset toArrowAssoc\[WithOpenCharset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WithOpenCharset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WithOpenCharsetImplicitThis member is added by an implicit conversion from WithOpenCharset toEnsuring\[WithOpenCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WithOpenCharset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WithOpenCharsetImplicitThis member is added by an implicit conversion from WithOpenCharset toEnsuring\[WithOpenCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WithOpenCharsetImplicitThis member is added by an implicit conversion from WithOpenCharset toEnsuring\[WithOpenCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WithOpenCharsetImplicitThis member is added by an implicit conversion from WithOpenCharset toEnsuring\[WithOpenCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WithOpenCharset toStringFormat\[WithOpenCharset] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/model/MediaType$$WithOpenCharset.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WithOpenCharset, B)ImplicitThis member is added by an implicit conversion from WithOpenCharset toArrowAssoc\[WithOpenCharset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NonBinary](MediaType$$NonBinary.html)

### Inherited from [MediaType](MediaType.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromWithOpenCharset to any2stringadd\[WithOpenCharset]

### Inherited by implicit conversion StringFormat fromWithOpenCharset to StringFormat\[WithOpenCharset]

### Inherited by implicit conversion Ensuring fromWithOpenCharset to Ensuring\[WithOpenCharset]

### Inherited by implicit conversion ArrowAssoc fromWithOpenCharset to ArrowAssoc\[WithOpenCharset]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$WithCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$WithMissingCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$Binary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$Compressibility.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$NonBinary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$WithFixedCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$WithOpenCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$NonMultipartWithOpenCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$WithOpenCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$WithOpenCharset.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$WithOpenCharset.html)*