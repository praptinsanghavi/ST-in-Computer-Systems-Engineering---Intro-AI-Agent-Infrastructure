---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Slash
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:20:24Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path$$Slash.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Slash
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Slash

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Slash

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
- [Segment](Uri$$Path$$Segment.html)
- Slash
- [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html)
- [\~](Uri$$Path$$$tilde$.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Uri](Uri$.html).[Path](Uri$$Path$.html)

# Slash[**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html "Permalink")

### 

#### final  case class Slash(tail: [Path](Uri$$Path.html)) extends [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[Uri.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Uri.scala#L609)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html), [Path](Uri$$Path.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Slash
2. Serializable
3. Product
4. Equals
5. SlashOrEmpty
6. Path
7. AnyRef
8. Any
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

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#<init>(tail:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.model.Uri.Path.Slash "Permalink")  new Slash(tail: [Path](Uri$$Path.html))
### Type Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#Head=Char "Permalink")  type Head \= [Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)Definition ClassesSlash → [Path](Uri$$Path.html)
### Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#+(pathString:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def \+(pathString: String): [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
4. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#++(suffix:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.model.Uri.Path.Slash "Permalink")  def \+\+(suffix: [Path](Uri$$Path.html)): SlashDefinition ClassesSlash → [Path](Uri$$Path.html)
5. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Slash, B)ImplicitThis member is added by an implicit conversion from Slash toArrowAssoc\[Slash] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#/(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def /(segment: String): [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
7. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#::(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def ::(segment: String): [Path](Uri$$Path.html)Definition ClassesSlash → [Path](Uri$$Path.html)
8. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#::(c:Char):akka.http.scaladsl.model.Uri.Path "Permalink")  def ::(c: [Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)): [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
9. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#?/(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def ?/(segment: String): [Path](Uri$$Path.html)Appends two path segments while avoiding a double slash between them
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
11. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#charCount:Int "Permalink")  def charCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSlash → [Path](Uri$$Path.html)
13. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#dropChars(count:Int):akka.http.scaladsl.model.Uri.Path "Permalink")  def dropChars(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Path](Uri$$Path.html)Definition ClassesSlash → [Path](Uri$$Path.html)
15. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#endsWith(suffix:String,ignoreTrailingSlash:Boolean):Boolean "Permalink") final  def endsWith(suffix: String, ignoreTrailingSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Path](Uri$$Path.html)
16. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#endsWithSlash:Boolean "Permalink")  def endsWithSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Path](Uri$$Path.html)
17. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Slash) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SlashImplicitThis member is added by an implicit conversion from Slash toEnsuring\[Slash] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Slash) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SlashImplicitThis member is added by an implicit conversion from Slash toEnsuring\[Slash] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SlashImplicitThis member is added by an implicit conversion from Slash toEnsuring\[Slash] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SlashImplicitThis member is added by an implicit conversion from Slash toEnsuring\[Slash] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#head:Char "Permalink")  def head: [Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)Definition ClassesSlash → [Path](Uri$$Path.html)
24. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSlash → [Path](Uri$$Path.html)
25. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#length:Int "Permalink")  def length: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSlash → [Path](Uri$$Path.html)
27. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
31. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#reverse:akka.http.scaladsl.model.Uri.Path "Permalink")  def reverse: [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
32. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#reverseAndPrependTo(prefix:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.model.Uri.Path "Permalink")  def reverseAndPrependTo(prefix: [Path](Uri$$Path.html)): [Path](Uri$$Path.html)Definition ClassesSlash → [Path](Uri$$Path.html)
33. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#startsWith(that:akka.http.scaladsl.model.Uri.Path):Boolean "Permalink")  def startsWith(that: [Path](Uri$$Path.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSlash → [Path](Uri$$Path.html)
34. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#startsWithSegment:Boolean "Permalink")  def startsWithSegment: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html) → [Path](Uri$$Path.html)
35. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#startsWithSlash:Boolean "Permalink")  def startsWithSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSlash → [Path](Uri$$Path.html)
36. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
37. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#tail:akka.http.scaladsl.model.Uri.Path "Permalink")  val tail: [Path](Uri$$Path.html)Definition ClassesSlash → [Path](Uri$$Path.html)
38. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#toString():String "Permalink")  def toString(): StringDefinition Classes[Path](Uri$$Path.html) → AnyRef → Any
39. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
41. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Slash toany2stringadd\[Slash] performed by method any2stringadd in scala.Predef.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(slash: any2stringadd[Slash]).+(other)
```
Definition Classesany2stringadd
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Slash toStringFormat\[Slash] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Slash.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Slash, B)ImplicitThis member is added by an implicit conversion from Slash toArrowAssoc\[Slash] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html)

### Inherited from [Path](Uri$$Path.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSlash to any2stringadd\[Slash]

### Inherited by implicit conversion StringFormat fromSlash to StringFormat\[Slash]

### Inherited by implicit conversion Ensuring fromSlash to Ensuring\[Slash]

### Inherited by implicit conversion ArrowAssoc fromSlash to ArrowAssoc\[Slash]

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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$$Slash.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$$Slash.html)*