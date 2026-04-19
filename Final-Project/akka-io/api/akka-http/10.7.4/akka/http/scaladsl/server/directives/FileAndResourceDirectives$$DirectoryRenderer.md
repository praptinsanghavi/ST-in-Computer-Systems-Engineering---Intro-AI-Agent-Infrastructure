---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:10:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html "Permalink")  object [FileAndResourceDirectives](FileAndResourceDirectives$.html) extends [FileAndResourceDirectives](FileAndResourceDirectives.html)Definition Classes[directives](index.html)
- DirectoryRenderer
- [LowLevelDirectoryRenderer](FileAndResourceDirectives$$LowLevelDirectoryRenderer.html)
- [ResourceFile](FileAndResourceDirectives$$ResourceFile.html)
[t](FileAndResourceDirectives$$DirectoryRenderer$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html).[FileAndResourceDirectives](FileAndResourceDirectives$.html)

# [DirectoryRenderer](FileAndResourceDirectives$$DirectoryRenderer$.html "See companion object")[**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html "Permalink")

### Companion [object DirectoryRenderer](FileAndResourceDirectives$$DirectoryRenderer$.html "See companion object")

#### trait DirectoryRenderer extends [javadsl.server.directives.DirectoryRenderer](../../../javadsl/server/directives/DirectoryRenderer.html)

Source[FileAndResourceDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/FileAndResourceDirectives.scala#L295)Linear Supertypes[javadsl.server.directives.DirectoryRenderer](../../../javadsl/server/directives/DirectoryRenderer.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DirectoryRenderer
2. DirectoryRenderer
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
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#JDL=akka.http.javadsl.server.directives.DirectoryListing "Permalink")  type JDL \= [javadsl.server.directives.DirectoryListing](../../../javadsl/server/directives/DirectoryListing.html)
2. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#JRE=akka.http.javadsl.model.RequestEntity "Permalink")  type JRE \= [RequestEntity](../../../javadsl/model/RequestEntity.html)
3. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#SDL=akka.http.scaladsl.server.directives.DirectoryListing "Permalink")  type SDL \= [DirectoryListing](DirectoryListing.html)
4. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#SRE=akka.http.scaladsl.model.RequestEntity "Permalink")  type SRE \= [RequestEntity](../../model/RequestEntity.html)
### Abstract Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#marshaller(renderVanityFooter:Boolean):akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.http.scaladsl.server.directives.DirectoryListing] "Permalink") abstract  def marshaller(renderVanityFooter: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[DirectoryListing](DirectoryListing.html)]
### Concrete Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DirectoryRenderer toany2stringadd\[DirectoryRenderer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DirectoryRenderer, B)ImplicitThis member is added by an implicit conversion from DirectoryRenderer toArrowAssoc\[DirectoryRenderer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#directoryMarshaller(renderVanityFooter:Boolean):akka.http.javadsl.marshalling.Marshaller[DirectoryRenderer.this.JDL,DirectoryRenderer.this.JRE] "Permalink") final  def directoryMarshaller(renderVanityFooter: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Marshaller](../../../javadsl/marshalling/Marshaller.html)\[[JDL](#JDL=akka.http.javadsl.server.directives.DirectoryListing), [JRE](#JRE=akka.http.javadsl.model.RequestEntity)]Definition ClassesDirectoryRenderer → [DirectoryRenderer](../../../javadsl/server/directives/DirectoryRenderer.html)
9. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DirectoryRenderer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DirectoryRendererImplicitThis member is added by an implicit conversion from DirectoryRenderer toEnsuring\[DirectoryRenderer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DirectoryRenderer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DirectoryRendererImplicitThis member is added by an implicit conversion from DirectoryRenderer toEnsuring\[DirectoryRenderer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DirectoryRendererImplicitThis member is added by an implicit conversion from DirectoryRenderer toEnsuring\[DirectoryRenderer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DirectoryRendererImplicitThis member is added by an implicit conversion from DirectoryRenderer toEnsuring\[DirectoryRenderer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DirectoryRenderer toStringFormat\[DirectoryRenderer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DirectoryRenderer, B)ImplicitThis member is added by an implicit conversion from DirectoryRenderer toArrowAssoc\[DirectoryRenderer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.server.directives.DirectoryRenderer](../../../javadsl/server/directives/DirectoryRenderer.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDirectoryRenderer to any2stringadd\[DirectoryRenderer]

### Inherited by implicit conversion StringFormat fromDirectoryRenderer to StringFormat\[DirectoryRenderer]

### Inherited by implicit conversion Ensuring fromDirectoryRenderer to Ensuring\[DirectoryRenderer]

### Inherited by implicit conversion ArrowAssoc fromDirectoryRenderer to ArrowAssoc\[DirectoryRenderer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryListing.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryRenderer.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DirectoryListing.html
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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html)*