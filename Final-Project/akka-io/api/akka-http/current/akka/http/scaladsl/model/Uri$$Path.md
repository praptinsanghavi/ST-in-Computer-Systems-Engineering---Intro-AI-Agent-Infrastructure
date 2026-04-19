---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:50:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/Uri$.html "Permalink")  object [Uri](Uri$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[model](index.html)
- [Authority](Uri$$Authority.html)
- [Empty](Uri$$Empty$.html)
- [Host](Uri$$Host.html)
- [IPv4Host](Uri$$IPv4Host.html)
- [IPv6Host](Uri$$IPv6Host.html)
- [NamedHost](Uri$$NamedHost.html)
- [NonEmptyHost](Uri$$NonEmptyHost.html)
- [ParsingMode](Uri$$ParsingMode.html)
- Path
- [Query](Uri$$Query.html)
[c](Uri$$Path$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Uri](Uri$.html)

# [Path](Uri$$Path$.html "See companion object")[**](../../../../akka/http/scaladsl/model/Uri$$Path.html "Permalink")

### Companion [object Path](Uri$$Path$.html "See companion object")

#### sealed abstract  class Path extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[Uri.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Uri.scala#L524)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Empty](Uri$$Path$$Empty$.html), [Segment](Uri$$Path$$Segment.html), [Slash](Uri$$Path$$Slash.html), [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Path
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

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#Head "Permalink") abstract  type Head
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#++(suffix:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.model.Uri.Path "Permalink") abstract  def \+\+(suffix: Path): Path
2. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#::(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink") abstract  def ::(segment: String): Path
3. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#charCount:Int "Permalink") abstract  def charCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
4. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#dropChars(count:Int):akka.http.scaladsl.model.Uri.Path "Permalink") abstract  def dropChars(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Path
5. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#head:Path.this.Head "Permalink") abstract  def head: [Head](#Head)
6. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#isEmpty:Boolean "Permalink") abstract  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
7. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#length:Int "Permalink") abstract  def length: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
8. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#reverseAndPrependTo(prefix:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.model.Uri.Path "Permalink") abstract  def reverseAndPrependTo(prefix: Path): Path
9. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#startsWith(that:akka.http.scaladsl.model.Uri.Path):Boolean "Permalink") abstract  def startsWith(that: Path): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
10. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#startsWithSegment:Boolean "Permalink") abstract  def startsWithSegment: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
11. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#startsWithSlash:Boolean "Permalink") abstract  def startsWithSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
12. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#tail:akka.http.scaladsl.model.Uri.Path "Permalink") abstract  def tail: Path
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#+(pathString:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def \+(pathString: String): Path
4. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Path, B)ImplicitThis member is added by an implicit conversion from Path toArrowAssoc\[Path] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#/(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def /(segment: String): Path
6. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#::(c:Char):akka.http.scaladsl.model.Uri.Path "Permalink")  def ::(c: [Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)): Path
7. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#?/(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def ?/(segment: String): PathAppends two path segments while avoiding a double slash between them
Example:
\- Path("abc") ?/ "def" returns Path("abc/def")
\- Path("abc/") ?/ "def" returns Path("abc/def")

Appends two path segments while avoiding a double slash between them
Example:
\- Path("abc") ?/ "def" returns Path("abc/def")
\- Path("abc/") ?/ "def" returns Path("abc/def")

segmentThe path segment to be appended

returnsThe final concatenated path segment
9. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
10. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#endsWith(suffix:String,ignoreTrailingSlash:Boolean):Boolean "Permalink") final  def endsWith(suffix: String, ignoreTrailingSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
12. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#endsWithSlash:Boolean "Permalink")  def endsWithSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
13. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Path) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PathImplicitThis member is added by an implicit conversion from Path toEnsuring\[Path] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Path) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PathImplicitThis member is added by an implicit conversion from Path toEnsuring\[Path] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PathImplicitThis member is added by an implicit conversion from Path toEnsuring\[Path] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PathImplicitThis member is added by an implicit conversion from Path toEnsuring\[Path] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#reverse:akka.http.scaladsl.model.Uri.Path "Permalink")  def reverse: Path
26. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#toString():String "Permalink")  def toString(): StringDefinition ClassesPath → AnyRef → Any
28. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Path toany2stringadd\[Path] performed by method any2stringadd in scala.Predef.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(path: any2stringadd[Path]).+(other)
```
Definition Classesany2stringadd
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Path toStringFormat\[Path] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/Uri$$Path.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Path, B)ImplicitThis member is added by an implicit conversion from Path toArrowAssoc\[Path] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPath to any2stringadd\[Path]

### Inherited by implicit conversion StringFormat fromPath to StringFormat\[Path]

### Inherited by implicit conversion Ensuring fromPath to Ensuring\[Path]

### Inherited by implicit conversion ArrowAssoc fromPath to ArrowAssoc\[Path]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Authority$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Authority.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Empty$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Host$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Host.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$IPv4Host$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$IPv4Host.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$IPv6Host$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$IPv6Host.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$NamedHost.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$NonEmptyHost.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$ParsingMode$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$ParsingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path$$Empty$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path$$Segment.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path$$Slash.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path$$SlashOrEmpty.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Query$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Query.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path.html)*