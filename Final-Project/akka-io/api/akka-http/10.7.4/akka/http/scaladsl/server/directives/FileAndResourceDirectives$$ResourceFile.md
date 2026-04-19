---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives.ResourceFile
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives.ResourceFile
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives.ResourceFile

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives.ResourceFile

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html "Permalink")  object [FileAndResourceDirectives](FileAndResourceDirectives$.html) extends [FileAndResourceDirectives](FileAndResourceDirectives.html)Definition Classes[directives](index.html)
- [DirectoryRenderer](FileAndResourceDirectives$$DirectoryRenderer.html)
- [LowLevelDirectoryRenderer](FileAndResourceDirectives$$LowLevelDirectoryRenderer.html)
- ResourceFile
[c](FileAndResourceDirectives$$ResourceFile$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html).[FileAndResourceDirectives](FileAndResourceDirectives$.html)

# [ResourceFile](FileAndResourceDirectives$$ResourceFile$.html "See companion object")[**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html "Permalink")

### Companion [object ResourceFile](FileAndResourceDirectives$$ResourceFile$.html "See companion object")

#### case class ResourceFile(url: [URL](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/URL.html#java.net.URL), length: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), lastModified: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[FileAndResourceDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/FileAndResourceDirectives.scala#L293)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ResourceFile
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
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

1. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#<init>(url:java.net.URL,length:Long,lastModified:Long):akka.http.scaladsl.server.directives.FileAndResourceDirectives.ResourceFile "Permalink")  new ResourceFile(url: [URL](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/URL.html#java.net.URL), length: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), lastModified: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ResourceFile toany2stringadd\[ResourceFile] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ResourceFile, B)ImplicitThis member is added by an implicit conversion from ResourceFile toArrowAssoc\[ResourceFile] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ResourceFile) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResourceFileImplicitThis member is added by an implicit conversion from ResourceFile toEnsuring\[ResourceFile] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ResourceFile) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResourceFileImplicitThis member is added by an implicit conversion from ResourceFile toEnsuring\[ResourceFile] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ResourceFileImplicitThis member is added by an implicit conversion from ResourceFile toEnsuring\[ResourceFile] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ResourceFileImplicitThis member is added by an implicit conversion from ResourceFile toEnsuring\[ResourceFile] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#lastModified:Long "Permalink")  val lastModified: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
16. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#length:Long "Permalink")  val length: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
17. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#url:java.net.URL "Permalink")  val url: [URL](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/URL.html#java.net.URL)
23. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ResourceFile toStringFormat\[ResourceFile] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ResourceFile, B)ImplicitThis member is added by an implicit conversion from ResourceFile toArrowAssoc\[ResourceFile] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromResourceFile to any2stringadd\[ResourceFile]

### Inherited by implicit conversion StringFormat fromResourceFile to StringFormat\[ResourceFile]

### Inherited by implicit conversion Ensuring fromResourceFile to Ensuring\[ResourceFile]

### Inherited by implicit conversion ArrowAssoc fromResourceFile to ArrowAssoc\[ResourceFile]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$LowLevelDirectoryRenderer.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html)*