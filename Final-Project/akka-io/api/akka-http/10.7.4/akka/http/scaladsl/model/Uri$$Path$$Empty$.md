---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Empty
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:20:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Path$$Empty$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Empty
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Empty

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Path.Empty

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/Uri$.html "Permalink")  object [Uri](Uri$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[model](index.html)
- [**](../../../../akka/http/scaladsl/model/Uri$$Path$.html "Permalink")  object [Path](Uri$$Path$.html)Definition Classes[Uri](Uri$.html)
- Empty
- [Segment](Uri$$Path$$Segment.html)
- [Slash](Uri$$Path$$Slash.html)
- [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html)
- [\~](Uri$$Path$$$tilde$.html)
o[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Uri](Uri$.html).[Path](Uri$$Path$.html)

# Empty[**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html "Permalink")

### 

#### case object Empty extends [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[Uri.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Uri.scala#L595)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html), [Path](Uri$$Path.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Empty
2. Serializable
3. Product
4. Equals
5. SlashOrEmpty
6. Path
7. AnyRef
8. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#Head=Nothing "Permalink")  type Head \= [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesEmpty → [Path](Uri$$Path.html)
### Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#+(pathString:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def \+(pathString: String): [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
4. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#++(suffix:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.model.Uri.Path "Permalink")  def \+\+(suffix: [Path](Uri$$Path.html)): [Path](Uri$$Path.html)Definition ClassesEmpty → [Path](Uri$$Path.html)
5. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#/(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def /(segment: String): [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
6. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#::(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def ::(segment: String): [Path](Uri$$Path.html)Definition ClassesEmpty → [Path](Uri$$Path.html)
7. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#::(c:Char):akka.http.scaladsl.model.Uri.Path "Permalink")  def ::(c: [Char](https://www.scala-lang.org/api/2.13.17/scala/Char.html#scala.Char)): [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
8. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#?/(segment:String):akka.http.scaladsl.model.Uri.Path "Permalink")  def ?/(segment: String): [Path](Uri$$Path.html)Appends two path segments while avoiding a double slash between them
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
10. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#charCount:Int "Permalink")  def charCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesEmpty → [Path](Uri$$Path.html)
12. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#dropChars(count:Int):akka.http.scaladsl.model.Uri.Path.Empty.type "Permalink")  def dropChars(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): EmptyDefinition ClassesEmpty → [Path](Uri$$Path.html)
14. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#endsWith(suffix:String,ignoreTrailingSlash:Boolean):Boolean "Permalink") final  def endsWith(suffix: String, ignoreTrailingSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Path](Uri$$Path.html)
15. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#endsWithSlash:Boolean "Permalink")  def endsWithSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Path](Uri$$Path.html)
16. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#head:akka.http.scaladsl.model.Uri.Path.Empty.Head "Permalink")  def head: [Head](#Head=Nothing)Definition ClassesEmpty → [Path](Uri$$Path.html)
20. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesEmpty → [Path](Uri$$Path.html)
21. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#length:Int "Permalink")  def length: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesEmpty → [Path](Uri$$Path.html)
23. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
27. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
28. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#reverse:akka.http.scaladsl.model.Uri.Path "Permalink")  def reverse: [Path](Uri$$Path.html)Definition Classes[Path](Uri$$Path.html)
29. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#reverseAndPrependTo(prefix:akka.http.scaladsl.model.Uri.Path):akka.http.scaladsl.model.Uri.Path "Permalink")  def reverseAndPrependTo(prefix: [Path](Uri$$Path.html)): [Path](Uri$$Path.html)Definition ClassesEmpty → [Path](Uri$$Path.html)
30. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#startsWith(that:akka.http.scaladsl.model.Uri.Path):Boolean "Permalink")  def startsWith(that: [Path](Uri$$Path.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesEmpty → [Path](Uri$$Path.html)
31. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#startsWithSegment:Boolean "Permalink")  def startsWithSegment: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html) → [Path](Uri$$Path.html)
32. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#startsWithSlash:Boolean "Permalink")  def startsWithSlash: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesEmpty → [Path](Uri$$Path.html)
33. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#tail:akka.http.scaladsl.model.Uri.Path "Permalink")  def tail: [Path](Uri$$Path.html)Definition ClassesEmpty → [Path](Uri$$Path.html)
35. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#toString():String "Permalink")  def toString(): StringDefinition Classes[Path](Uri$$Path.html) → AnyRef → Any
36. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
38. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Path$$Empty$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [SlashOrEmpty](Uri$$Path$$SlashOrEmpty.html)

### Inherited from [Path](Uri$$Path.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$$Empty$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$$Empty$.html)*