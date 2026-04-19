---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType.WithFixedCharset
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:43:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaType$$WithFixedCharset.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType.WithFixedCharset
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType.WithFixedCharset

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaType.WithFixedCharset

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/MediaType$.html "Permalink")  object [MediaType](MediaType$.html)Definition Classes[model](index.html)
- [Binary](MediaType$$Binary.html)
- [Compressibility](MediaType$$Compressibility.html)
- [Compressible](MediaType$$Compressible$.html)
- [Gzipped](MediaType$$Gzipped$.html)
- [Multipart](MediaType$$Multipart.html)
- [NonBinary](MediaType$$NonBinary.html)
- [NonMultipartWithOpenCharset](MediaType$$NonMultipartWithOpenCharset.html)
- [NotCompressible](MediaType$$NotCompressible$.html)
- WithFixedCharset
- [WithOpenCharset](MediaType$$WithOpenCharset.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[MediaType](MediaType$.html)

# WithFixedCharset[**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html "Permalink")

### 

#### sealed abstract  class WithFixedCharset extends [NonBinary](MediaType$$NonBinary.html) with [javadsl.model.MediaType.WithFixedCharset](../../javadsl/model/MediaType$$WithFixedCharset.html)

Annotations@DoNotInherit() Source[MediaType.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/MediaType.scala#L232)Linear Supertypes[javadsl.model.MediaType.WithFixedCharset](../../javadsl/model/MediaType$$WithFixedCharset.html), [NonBinary](MediaType$$NonBinary.html), [javadsl.model.MediaType.NonBinary](../../javadsl/model/MediaType$$NonBinary.html), [MediaType](MediaType.html), [WithQValue](WithQValue.html)\[[MediaRange](MediaRange.html)], LazyValueBytesRenderable, Renderable, [javadsl.model.MediaType](../../javadsl/model/MediaType.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. WithFixedCharset
2. WithFixedCharset
3. NonBinary
4. NonBinary
5. MediaType
6. WithQValue
7. LazyValueBytesRenderable
8. Renderable
9. MediaType
10. AnyRef
11. Any
Implicitly  
1. by apply
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from WithFixedCharset toany2stringadd\[WithFixedCharset] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (WithFixedCharset, B)ImplicitThis member is added by an implicit conversion from WithFixedCharset toArrowAssoc\[WithFixedCharset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#binary:Boolean "Permalink")  def binary: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)True when this media\-type is not character\-based.

True when this media\-type is not character\-based.

Definition Classes[NonBinary](MediaType$$NonBinary.html) → [MediaType](../../javadsl/model/MediaType.html)
8. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#charset:akka.http.scaladsl.model.HttpCharset "Permalink")  val charset: [HttpCharset](HttpCharset.html)
9. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#comp:akka.http.scaladsl.model.MediaType.Compressible.type "Permalink")  def comp: [Compressible](MediaType$$Compressible$.html)Definition Classes[NonBinary](MediaType$$NonBinary.html) → [MediaType](MediaType.html)
11. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (WithFixedCharset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WithFixedCharsetImplicitThis member is added by an implicit conversion from WithFixedCharset toEnsuring\[WithFixedCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (WithFixedCharset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WithFixedCharsetImplicitThis member is added by an implicit conversion from WithFixedCharset toEnsuring\[WithFixedCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): WithFixedCharsetImplicitThis member is added by an implicit conversion from WithFixedCharset toEnsuring\[WithFixedCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): WithFixedCharsetImplicitThis member is added by an implicit conversion from WithFixedCharset toEnsuring\[WithFixedCharset] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#equals(that:Any):Boolean "Permalink")  def equals(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html) → AnyRef → Any
17. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#fileExtensions:List[String] "Permalink")  val fileExtensions: List\[String]Definition ClassesWithFixedCharset → [MediaType](MediaType.html)
18. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#getParams():java.util.Map[String,String] "Permalink")  def getParams(): [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, String]Java API

Java API

ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).Definition Classes[MediaRange](MediaRange.html) → [MediaRange](../../javadsl/model/MediaRange.html)
20. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[MediaType](MediaType.html) → AnyRef → Any
21. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isApplication:Boolean "Permalink")  def isApplication: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
22. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isAudio:Boolean "Permalink")  def isAudio: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
23. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isCompressible:Boolean "Permalink")  def isCompressible: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)True when this media\-type is generally compressible.

True when this media\-type is generally compressible.

Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
24. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isImage:Boolean "Permalink")  def isImage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
25. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isMessage:Boolean "Permalink")  def isMessage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
27. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isMultipart:Boolean "Permalink")  def isMultipart: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
28. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isText:Boolean "Permalink")  def isText: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
29. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isVideo:Boolean "Permalink")  def isVideo: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
30. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isWildcard:Boolean "Permalink")  def isWildcard: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).Definition Classes[MediaRange](MediaRange.html)
31. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#mainType:String "Permalink")  val mainType: StringThe main\-type of this media\-type.

The main\-type of this media\-type.

Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
32. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#matches(mediaType:akka.http.javadsl.model.MediaType):Boolean "Permalink")  def matches(mediaType: [javadsl.model.MediaType](../../javadsl/model/MediaType.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Java API

Java API

ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).Definition Classes[MediaRange](MediaRange.html) → [MediaRange](../../javadsl/model/MediaRange.html)
33. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#matches(mediaType:akka.http.scaladsl.model.MediaType):Boolean "Permalink")  def matches(mediaType: [MediaType](MediaType.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).Definition Classes[MediaRange](MediaRange.html)
34. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
35. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
36. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#params:Map[String,String] "Permalink")  def params: Map\[String, String]Definition ClassesWithFixedCharset → [MediaType](MediaType.html)
38. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#qValue():Float "Permalink")  def qValue(): [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)Returns the qValue of this media\-range.

Returns the qValue of this media\-range.

ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).Definition Classes[MediaRange](MediaRange.html) → [MediaRange](../../javadsl/model/MediaRange.html)
39. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#render[R<:akka.http.impl.util.Rendering](r:R):r.type "Permalink")  def render\[R \<: Rendering](r: R): r.typeDefinition ClassesLazyValueBytesRenderable → Renderable
40. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#subType:String "Permalink")  val subType: StringThe sub\-type of this media\-type.

The sub\-type of this media\-type.

Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
41. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
42. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#toContentType:akka.http.scaladsl.model.ContentType.WithFixedCharset "Permalink")  def toContentType: [ContentType.WithFixedCharset](ContentType$$WithFixedCharset.html)Turns the media type into a content type with a fixed, known charset.

Turns the media type into a content type with a fixed, known charset.

JAVA API

Definition ClassesWithFixedCharset → [WithFixedCharset](../../javadsl/model/MediaType$$WithFixedCharset.html)
43. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#toRange(qValue:Float):akka.http.javadsl.model.MediaRange "Permalink")  def toRange(qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)): [javadsl.model.MediaRange](../../javadsl/model/MediaRange.html)Creates a media\-range from this media\-type with a given qValue.

Creates a media\-range from this media\-type with a given qValue.

Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
44. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#toRange:akka.http.javadsl.model.MediaRange "Permalink")  def toRange: [javadsl.model.MediaRange](../../javadsl/model/MediaRange.html)JAVA API

JAVA API

Definition Classes[MediaType](MediaType.html) → [MediaType](../../javadsl/model/MediaType.html)
45. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#toString():String "Permalink")  def toString(): StringDefinition ClassesLazyValueBytesRenderable → AnyRef → Any
46. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#value:String "Permalink")  val value: StringDefinition ClassesWithFixedCharset → LazyValueBytesRenderable
47. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
48. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
49. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
50. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#withCharsetRange(charsetRange:akka.http.scaladsl.model.HttpCharsetRange):akka.http.scaladsl.model.ContentTypeRange "Permalink")  def withCharsetRange(charsetRange: [HttpCharsetRange](HttpCharsetRange.html)): [ContentTypeRange](ContentTypeRange.html)Constructs a `ContentTypeRange` from this instance and the given charset.

Constructs a `ContentTypeRange` from this instance and the given charset.

ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).Definition Classes[MediaRange](MediaRange.html)
51. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#withComp(comp:akka.http.scaladsl.model.MediaType.Compressibility):akka.http.scaladsl.model.MediaType.Binarywithakka.http.scaladsl.model.MediaType "Permalink")  def withComp(comp: [Compressibility](MediaType$$Compressibility.html)): [Binary](MediaType$$Binary.html) with [MediaType](MediaType.html)Definition Classes[NonBinary](MediaType$$NonBinary.html) → [MediaType](MediaType.html)
52. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#withParams(params:Map[String,String]):akka.http.scaladsl.model.MediaType.WithFixedCharsetwithakka.http.scaladsl.model.MediaType "Permalink")  def withParams(params: Map\[String, String]): WithFixedCharset with [MediaType](MediaType.html)Definition ClassesWithFixedCharset → [MediaType](MediaType.html)
53. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#withQValue(qValue:Float):akka.http.scaladsl.model.MediaRange "Permalink")  def withQValue(qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)): [MediaRange](MediaRange.html)Definition Classes[MediaType](MediaType.html) → [WithQValue](WithQValue.html)
54. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#withQValue(qValue:Double):T "Permalink")  def withQValue(qValue: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [MediaRange](MediaRange.html)truncates Double qValue to float and returns a new instance with this qValue set

truncates Double qValue to float and returns a new instance with this qValue set

Definition Classes[WithQValue](WithQValue.html)
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isApplication:Boolean "Permalink")  def isApplication: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).isApplication
```
Definition Classes[MediaRange](MediaRange.html)
2. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isAudio:Boolean "Permalink")  def isAudio: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).isAudio
```
Definition Classes[MediaRange](MediaRange.html)
3. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isImage:Boolean "Permalink")  def isImage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).isImage
```
Definition Classes[MediaRange](MediaRange.html)
4. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isMessage:Boolean "Permalink")  def isMessage: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).isMessage
```
Definition Classes[MediaRange](MediaRange.html)
5. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isMultipart:Boolean "Permalink")  def isMultipart: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).isMultipart
```
Definition Classes[MediaRange](MediaRange.html)
6. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isText:Boolean "Permalink")  def isText: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).isText
```
Definition Classes[MediaRange](MediaRange.html)
7. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#isVideo:Boolean "Permalink")  def isVideo: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).isVideo
```
Definition Classes[MediaRange](MediaRange.html)
8. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#mainType():String "Permalink")  def mainType(): StringReturns the main\-type this media\-range matches.

Returns the main\-type this media\-range matches.

ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).mainType()
```
Definition Classes[MediaRange](MediaRange.html) → [MediaRange](../../javadsl/model/MediaRange.html)
9. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#params:Map[String,String] "Permalink")  def params: Map\[String, String]ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).params
```
Definition Classes[MediaRange](MediaRange.html)
10. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#value:String "Permalink")  def value: StringImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).value
```
Definition Classes[MediaRange](MediaRange.html)
11. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#withParams(params:Map[String,String]):akka.http.scaladsl.model.MediaRange "Permalink")  def withParams(params: Map\[String, String]): [MediaRange](MediaRange.html)Returns a copy of this instance with the params replaced by the given ones.

Returns a copy of this instance with the params replaced by the given ones.
If the given map contains a "q" value the `qValue` member is (also) updated.

ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).withParams(params)
```
Definition Classes[MediaRange](MediaRange.html)
12. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#withQValue(qValue:Double):T "Permalink")  def withQValue(qValue: [Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)): [MediaRange](MediaRange.html)truncates Double qValue to float and returns a new instance with this qValue set

truncates Double qValue to float and returns a new instance with this qValue set

ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).withQValue(qValue)
```
Definition Classes[WithQValue](WithQValue.html)
13. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#withQValue(qValue:Float):T "Permalink")  def withQValue(qValue: [Float](https://www.scala-lang.org/api/2.13.17/scala/Float.html#scala.Float)): [MediaRange](MediaRange.html)ImplicitThis member is added by an implicit conversion from WithFixedCharset to[MediaRange](MediaRange.html) performed by method apply in [akka.http.scaladsl.model.MediaRange](MediaRange$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(withFixedCharset: MediaRange).withQValue(qValue)
```
Definition Classes[WithQValue](WithQValue.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from WithFixedCharset toStringFormat\[WithFixedCharset] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/MediaType$$WithFixedCharset.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (WithFixedCharset, B)ImplicitThis member is added by an implicit conversion from WithFixedCharset toArrowAssoc\[WithFixedCharset] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.model.MediaType.WithFixedCharset](../../javadsl/model/MediaType$$WithFixedCharset.html)

### Inherited from [NonBinary](MediaType$$NonBinary.html)

### Inherited from [javadsl.model.MediaType.NonBinary](../../javadsl/model/MediaType$$NonBinary.html)

### Inherited from [MediaType](MediaType.html)

### Inherited from [WithQValue](WithQValue.html)\[[MediaRange](MediaRange.html)]

### Inherited from LazyValueBytesRenderable

### Inherited from Renderable

### Inherited from [javadsl.model.MediaType](../../javadsl/model/MediaType.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion apply fromWithFixedCharset to [MediaRange](MediaRange.html)

### Inherited by implicit conversion any2stringadd fromWithFixedCharset to any2stringadd\[WithFixedCharset]

### Inherited by implicit conversion StringFormat fromWithFixedCharset to StringFormat\[WithFixedCharset]

### Inherited by implicit conversion Ensuring fromWithFixedCharset to Ensuring\[WithFixedCharset]

### Inherited by implicit conversion ArrowAssoc fromWithFixedCharset to ArrowAssoc\[WithFixedCharset]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$NonBinary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType$$WithFixedCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType$$WithFixedCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaRange$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaRange.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/WithQValue.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$WithFixedCharset.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$WithFixedCharset.html)*