---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.xml.ScalaXmlSupport
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.xml.ScalaXmlSupport
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.xml.ScalaXmlSupport

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.xml.ScalaXmlSupport

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/marshallers/xml/index.html "Permalink")  package [xml](index.html)Definition Classes[marshallers](../index.html)
- ScalaXmlSupport
[t](ScalaXmlSupport$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[marshallers](../index.html).[xml](index.html)

# [ScalaXmlSupport](ScalaXmlSupport$.html "See companion object")[**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html "Permalink")

### Companion [object ScalaXmlSupport](ScalaXmlSupport$.html "See companion object")

#### trait ScalaXmlSupport extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ScalaXmlSupport.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-marshallers-scala/akka-http-xml/src/main/scala/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.scala#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ScalaXmlSupport](ScalaXmlSupport$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ScalaXmlSupport
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
### Value Members

1. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ScalaXmlSupport toany2stringadd\[ScalaXmlSupport] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ScalaXmlSupport, B)ImplicitThis member is added by an implicit conversion from ScalaXmlSupport toArrowAssoc\[ScalaXmlSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#createSAXParser():javax.xml.parsers.SAXParser "Permalink")  def createSAXParser(): [SAXParser](https://docs.oracle.com/en/java/javase/11/docs/api/java.xml/javax/xml/parsers/SAXParser.html#javax.xml.parsers.SAXParser)Provides a SAXParser for the NodeSeqUnmarshaller to use.

Provides a SAXParser for the NodeSeqUnmarshaller to use. Override to provide a custom SAXParser implementation.
Will be called once for for every request to be unmarshalled. The default implementation calls `ScalaXmlSupport.createSaferSAXParser`.

Attributesprotected
9. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#defaultNodeSeqMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[scala.xml.NodeSeq] "Permalink") implicit  def defaultNodeSeqMarshaller: [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[NodeSeq](https://javadoc.io/page/org.scala-lang.modules/scala-xml_2.13/2.1.0/scala/xml/NodeSeq.html#scala.xml.NodeSeq)]
10. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#defaultNodeSeqUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[scala.xml.NodeSeq] "Permalink") implicit  def defaultNodeSeqUnmarshaller: [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[NodeSeq](https://javadoc.io/page/org.scala-lang.modules/scala-xml_2.13/2.1.0/scala/xml/NodeSeq.html#scala.xml.NodeSeq)]
11. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ScalaXmlSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ScalaXmlSupportImplicitThis member is added by an implicit conversion from ScalaXmlSupport toEnsuring\[ScalaXmlSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ScalaXmlSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ScalaXmlSupportImplicitThis member is added by an implicit conversion from ScalaXmlSupport toEnsuring\[ScalaXmlSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ScalaXmlSupportImplicitThis member is added by an implicit conversion from ScalaXmlSupport toEnsuring\[ScalaXmlSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ScalaXmlSupportImplicitThis member is added by an implicit conversion from ScalaXmlSupport toEnsuring\[ScalaXmlSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#nodeSeqMarshaller(mediaType:akka.http.scaladsl.model.MediaType.NonBinary):akka.http.scaladsl.marshalling.ToEntityMarshaller[scala.xml.NodeSeq] "Permalink")  def nodeSeqMarshaller(mediaType: [NonBinary](../../model/MediaType$$NonBinary.html)): [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[NodeSeq](https://javadoc.io/page/org.scala-lang.modules/scala-xml_2.13/2.1.0/scala/xml/NodeSeq.html#scala.xml.NodeSeq)]
22. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#nodeSeqUnmarshaller(ranges:akka.http.scaladsl.model.ContentTypeRange*):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[scala.xml.NodeSeq] "Permalink")  def nodeSeqUnmarshaller(ranges: [ContentTypeRange](../../model/ContentTypeRange.html)\*): [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[NodeSeq](https://javadoc.io/page/org.scala-lang.modules/scala-xml_2.13/2.1.0/scala/xml/NodeSeq.html#scala.xml.NodeSeq)]
23. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ScalaXmlSupport toStringFormat\[ScalaXmlSupport] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ScalaXmlSupport, B)ImplicitThis member is added by an implicit conversion from ScalaXmlSupport toArrowAssoc\[ScalaXmlSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromScalaXmlSupport to any2stringadd\[ScalaXmlSupport]

### Inherited by implicit conversion StringFormat fromScalaXmlSupport to StringFormat\[ScalaXmlSupport]

### Inherited by implicit conversion Ensuring fromScalaXmlSupport to Ensuring\[ScalaXmlSupport]

### Inherited by implicit conversion ArrowAssoc fromScalaXmlSupport to ArrowAssoc\[ScalaXmlSupport]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/xml/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$NonBinary.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html)*