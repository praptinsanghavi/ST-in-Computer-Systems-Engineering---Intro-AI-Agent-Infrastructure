---
description: Akka HTTP 10.7.4 - akka.http.javadsl.model.MediaType.Binary
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:44:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaType$$Binary.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.model.MediaType.Binary
---

# Akka HTTP 10.7.4 - akka.http.javadsl.model.MediaType.Binary

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.model.MediaType.Binary

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
- Binary
- [Compressibility](MediaType$$Compressibility.html)
- [Multipart](MediaType$$Multipart.html)
- [NonBinary](MediaType$$NonBinary.html)
- [WithFixedCharset](MediaType$$WithFixedCharset.html)
- [WithOpenCharset](MediaType$$WithOpenCharset.html)
t[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[model](index.html).[MediaType](MediaType$.html)

# Binary[**](../../../../akka/http/javadsl/model/MediaType$$Binary.html "Permalink")

### 

#### trait Binary extends [MediaType](MediaType.html)

Source[MediaType.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/model/MediaType.scala#L16)Linear Supertypes[MediaType](MediaType.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Multipart](MediaType$$Multipart.html), [Binary](../../scaladsl/model/MediaType$$Binary.html), [Multipart](../../scaladsl/model/MediaType$$Multipart.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Binary
2. MediaType
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
### Abstract Value Members

1. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#binary:Boolean "Permalink") abstract  def binary: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)True when this media\-type is not character\-based.

True when this media\-type is not character\-based.

Definition Classes[MediaType](MediaType.html)
2. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#isApplication:Boolean "Permalink") abstract  def isApplication: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
3. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#isAudio:Boolean "Permalink") abstract  def isAudio: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
4. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#isCompressible:Boolean "Permalink") abstract  def isCompressible: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)True when this media\-type is generally compressible.

True when this media\-type is generally compressible.

Definition Classes[MediaType](MediaType.html)
5. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#isImage:Boolean "Permalink") abstract  def isImage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
6. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#isMessage:Boolean "Permalink") abstract  def isMessage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
7. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#isMultipart:Boolean "Permalink") abstract  def isMultipart: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
8. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#isText:Boolean "Permalink") abstract  def isText: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
9. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#isVideo:Boolean "Permalink") abstract  def isVideo: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html)
10. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#mainType:String "Permalink") abstract  def mainType: StringThe main\-type of this media\-type.

The main\-type of this media\-type.

Definition Classes[MediaType](MediaType.html)
11. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#subType:String "Permalink") abstract  def subType: StringThe sub\-type of this media\-type.

The sub\-type of this media\-type.

Definition Classes[MediaType](MediaType.html)
12. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#toContentType:akka.http.javadsl.model.ContentType.Binary "Permalink") abstract  def toContentType: [ContentType.Binary](ContentType$$Binary.html)Turns the media type into a content type.
13. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#toRange(qValue:Float):akka.http.javadsl.model.MediaRange "Permalink") abstract  def toRange(qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)): [MediaRange](MediaRange.html)Creates a media\-range from this media\-type with a given qValue.

Creates a media\-range from this media\-type with a given qValue.

Definition Classes[MediaType](MediaType.html)
14. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#toRange:akka.http.javadsl.model.MediaRange "Permalink") abstract  def toRange: [MediaRange](MediaRange.html)Creates a media\-range from this media\-type.

Creates a media\-range from this media\-type.

Definition Classes[MediaType](MediaType.html)
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Binary toany2stringadd\[Binary] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Binary, B)ImplicitThis member is added by an implicit conversion from Binary toArrowAssoc\[Binary] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Binary) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BinaryImplicitThis member is added by an implicit conversion from Binary toEnsuring\[Binary] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Binary) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BinaryImplicitThis member is added by an implicit conversion from Binary toEnsuring\[Binary] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BinaryImplicitThis member is added by an implicit conversion from Binary toEnsuring\[Binary] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BinaryImplicitThis member is added by an implicit conversion from Binary toEnsuring\[Binary] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Binary toStringFormat\[Binary] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/model/MediaType$$Binary.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Binary, B)ImplicitThis member is added by an implicit conversion from Binary toArrowAssoc\[Binary] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [MediaType](MediaType.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBinary to any2stringadd\[Binary]

### Inherited by implicit conversion StringFormat fromBinary to StringFormat\[Binary]

### Inherited by implicit conversion Ensuring fromBinary to Ensuring\[Binary]

### Inherited by implicit conversion ArrowAssoc fromBinary to ArrowAssoc\[Binary]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType$$Binary.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Binary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$Binary.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$Binary.html)*