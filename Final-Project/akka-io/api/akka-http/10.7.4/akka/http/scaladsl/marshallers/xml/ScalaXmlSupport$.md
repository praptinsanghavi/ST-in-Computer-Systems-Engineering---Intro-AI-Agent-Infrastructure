---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshallers.xml.ScalaXmlSupport
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html
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
- [ScalaXmlSupport](ScalaXmlSupport.html)
[o](ScalaXmlSupport.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[marshallers](../index.html).[xml](index.html)

# [ScalaXmlSupport](ScalaXmlSupport.html "See companion trait")[**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html "Permalink")

### Companion [trait ScalaXmlSupport](ScalaXmlSupport.html "See companion trait")

#### object ScalaXmlSupport extends [ScalaXmlSupport](ScalaXmlSupport.html)

Source[ScalaXmlSupport.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-marshallers-scala/akka-http-xml/src/main/scala/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.scala#L40)Linear Supertypes[ScalaXmlSupport](ScalaXmlSupport.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ScalaXmlSupport
2. ScalaXmlSupport
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#createSAXParser():javax.xml.parsers.SAXParser "Permalink")  def createSAXParser(): [SAXParser](https://docs.oracle.com/en/java/javase/11/docs/api/java.xml/javax/xml/parsers/SAXParser.html#javax.xml.parsers.SAXParser)Provides a SAXParser for the NodeSeqUnmarshaller to use.

Provides a SAXParser for the NodeSeqUnmarshaller to use. Override to provide a custom SAXParser implementation.
Will be called once for for every request to be unmarshalled. The default implementation calls `ScalaXmlSupport.createSaferSAXParser`.

Attributesprotected Definition Classes[ScalaXmlSupport](ScalaXmlSupport.html)
7. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#createSaferSAXParser():javax.xml.parsers.SAXParser "Permalink")  def createSaferSAXParser(): [SAXParser](https://docs.oracle.com/en/java/javase/11/docs/api/java.xml/javax/xml/parsers/SAXParser.html#javax.xml.parsers.SAXParser)Creates a safer SAXParser.
8. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#defaultNodeSeqMarshaller:akka.http.scaladsl.marshalling.ToEntityMarshaller[scala.xml.NodeSeq] "Permalink") implicit  def defaultNodeSeqMarshaller: [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[NodeSeq](https://javadoc.io/page/org.scala-lang.modules/scala-xml_2.13/2.1.0/scala/xml/NodeSeq.html#scala.xml.NodeSeq)]Definition Classes[ScalaXmlSupport](ScalaXmlSupport.html)
9. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#defaultNodeSeqUnmarshaller:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[scala.xml.NodeSeq] "Permalink") implicit  def defaultNodeSeqUnmarshaller: [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[NodeSeq](https://javadoc.io/page/org.scala-lang.modules/scala-xml_2.13/2.1.0/scala/xml/NodeSeq.html#scala.xml.NodeSeq)]Definition Classes[ScalaXmlSupport](ScalaXmlSupport.html)
10. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#nodeSeqContentTypeRanges:Seq[akka.http.scaladsl.model.ContentTypeRange] "Permalink")  val nodeSeqContentTypeRanges: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ContentTypeRange](../../model/ContentTypeRange.html)]
17. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#nodeSeqMarshaller(mediaType:akka.http.scaladsl.model.MediaType.NonBinary):akka.http.scaladsl.marshalling.ToEntityMarshaller[scala.xml.NodeSeq] "Permalink")  def nodeSeqMarshaller(mediaType: [NonBinary](../../model/MediaType$$NonBinary.html)): [ToEntityMarshaller](../../marshalling/index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[NodeSeq](https://javadoc.io/page/org.scala-lang.modules/scala-xml_2.13/2.1.0/scala/xml/NodeSeq.html#scala.xml.NodeSeq)]Definition Classes[ScalaXmlSupport](ScalaXmlSupport.html)
18. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#nodeSeqMediaTypes:Seq[akka.http.scaladsl.model.MediaType.NonBinary] "Permalink")  val nodeSeqMediaTypes: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[NonBinary](../../model/MediaType$$NonBinary.html)]
19. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#nodeSeqUnmarshaller(ranges:akka.http.scaladsl.model.ContentTypeRange*):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[scala.xml.NodeSeq] "Permalink")  def nodeSeqUnmarshaller(ranges: [ContentTypeRange](../../model/ContentTypeRange.html)\*): [FromEntityUnmarshaller](../../unmarshalling/index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[NodeSeq](https://javadoc.io/page/org.scala-lang.modules/scala-xml_2.13/2.1.0/scala/xml/NodeSeq.html#scala.xml.NodeSeq)]Definition Classes[ScalaXmlSupport](ScalaXmlSupport.html)
20. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ScalaXmlSupport](ScalaXmlSupport.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html)*