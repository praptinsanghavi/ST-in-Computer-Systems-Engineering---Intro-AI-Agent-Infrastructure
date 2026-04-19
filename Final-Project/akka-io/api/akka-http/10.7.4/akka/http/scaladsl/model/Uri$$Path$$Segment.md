---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Segment
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:20:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path$$Segment.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Segment
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Segment

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Segment

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/Uri$.html "Permalink")  object [Uri](Uri$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/Uri$$Path$.html "Permalink")  object [Path](Uri$$Path$.html)Definition Classes[Uri](Uri$.html)
- [Empty](Uri$$Path$$Empty$.html)
- Segment
- [Slash](Uri$$Path$$Slash.html)
- [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html)
- [\~](Uri$$Path$$$tilde$.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Uri](Uri$.html).[Path](Uri$$Path$.html)

# Segment[**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html "Permalink")

### 

#### final  case class Segment(head: String, tail: [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html)) extends [Path](Uri$$Path.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[Uri.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Uri.scala#L622)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Path](Uri$$Path.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Segment
2. Serializable
3. Product
4. Equals
5. Path
6. AnyRef
7. Any
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

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#<init>(head:String,tail:akka.http.scaladsl.model.Uri.Path.SlashOrEmpty):akka.http.scaladsl.model.Uri.Path.Segment "Permalink")  new Segment(head: String, tail: [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html))
### Type Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#Head=String "Permalink")  type Head \= [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesSegment → [Path](Uri$$Path.html)
### Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#+(pathString:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def \+(pathString: String): [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
4. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#++(suffix:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.model.Uri.Path "Permalink")  def \+\+(suffix: [Path](Uri$$Path.html)): [Path](Uri$$Path.html)Definition ClassesSegment → [Path](Uri$$Path.html)
5. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Segment, B)ImplicitThis member is added by an implicit conversion from Segment toArrowAssoc\[Segment] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#/(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def /(segment: String): [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
7. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#::(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def ::(segment: String): [Path](Uri$$Path.html)Definition ClassesSegment → [Path](Uri$$Path.html)
8. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#::(c:Char):akka.http.scaladsl.model.Uri.Path "Permalink")  def ::(c: [Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)): [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
9. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#?/(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def ?/(segment: String): [Path](Uri$$Path.html)Appends two path segments while avoiding a double slash between them
Example:
\- Path("abc") ?/ "def" returns Path("abc/def")
\- Path("abc/") ?/ "def" returns Path("abc/def")

Appends two path segments while avoiding a double slash between them
Example:
\- Path("abc") ?/ "def" returns Path("abc/def")
\- Path("abc/") ?/ "def" returns Path("abc/def")

segmentThe path segment to be appended

returnsThe final concatenated path segment

Definition Classes[Path](Uri$$Path.html)
11. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#charCount:Int "Permalink")  def charCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSegment → [Path](Uri$$Path.html)
13. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#dropChars(count:Int):akka.http.scaladsl.model.Uri.Path "Permalink")  def dropChars(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Path](Uri$$Path.html)Definition ClassesSegment → [Path](Uri$$Path.html)
15. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#endsWith(suffix:String,ignoreTrailingSlash:Boolean):Boolean "Permalink") final  def endsWith(suffix: String, ignoreTrailingSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Path](Uri$$Path.html)
16. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#endsWithSlash:Boolean "Permalink")  def endsWithSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Path](Uri$$Path.html)
17. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Segment) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SegmentImplicitThis member is added by an implicit conversion from Segment toEnsuring\[Segment] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Segment) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SegmentImplicitThis member is added by an implicit conversion from Segment toEnsuring\[Segment] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SegmentImplicitThis member is added by an implicit conversion from Segment toEnsuring\[Segment] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SegmentImplicitThis member is added by an implicit conversion from Segment toEnsuring\[Segment] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#head:String "Permalink")  val head: StringDefinition ClassesSegment → [Path](Uri$$Path.html)
24. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSegment → [Path](Uri$$Path.html)
25. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#length:Int "Permalink")  def length: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSegment → [Path](Uri$$Path.html)
27. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
31. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#reverse:akka.http.scaladsl.model.Uri.Path "Permalink")  def reverse: [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
32. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#reverseAndPrependTo(prefix:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.model.Uri.Path "Permalink")  def reverseAndPrependTo(prefix: [Path](Uri$$Path.html)): [Path](Uri$$Path.html)Definition ClassesSegment → [Path](Uri$$Path.html)
33. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#startsWith(that:akka.http.scaladsl.model.Uri.Path):Boolean "Permalink")  def startsWith(that: [Path](Uri$$Path.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSegment → [Path](Uri$$Path.html)
34. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#startsWithSegment:Boolean "Permalink")  def startsWithSegment: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSegment → [Path](Uri$$Path.html)
35. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#startsWithSlash:Boolean "Permalink")  def startsWithSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSegment → [Path](Uri$$Path.html)
36. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#tail:akka.http.scaladsl.model.Uri.Path.SlashOrEmpty "Permalink")  val tail: [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html)Definition ClassesSegment → [Path](Uri$$Path.html)
38. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#toString():String "Permalink")  def toString(): StringDefinition Classes[Path](Uri$$Path.html) → AnyRef → Any
39. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
41. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Segment toany2stringadd\[Segment] performed by method any2stringadd in scala.Predef.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(segment: any2stringadd[Segment]).+(other)
```
Definition Classesany2stringadd
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Segment toStringFormat\[Segment] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Segment.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Segment, B)ImplicitThis member is added by an implicit conversion from Segment toArrowAssoc\[Segment] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Path](Uri$$Path.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSegment to any2stringadd\[Segment]

### Inherited by implicit conversion StringFormat fromSegment to StringFormat\[Segment]

### Inherited by implicit conversion Ensuring fromSegment to Ensuring\[Segment]

### Inherited by implicit conversion ArrowAssoc fromSegment to ArrowAssoc\[Segment]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$$$tilde$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$$Empty$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$$Segment.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$$Slash.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$$SlashOrEmpty.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$$Segment.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$$Segment.html)*