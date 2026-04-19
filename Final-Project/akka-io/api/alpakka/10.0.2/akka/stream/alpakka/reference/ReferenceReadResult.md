---
description: Alpakka 10.0.2 - akka.stream.alpakka.reference.ReferenceReadResult
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:09:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/reference/ReferenceReadResult.html
title: Alpakka 10.0.2 - akka.stream.alpakka.reference.ReferenceReadResult
---

# Alpakka 10.0.2 - akka.stream.alpakka.reference.ReferenceReadResult

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.reference.ReferenceReadResult

## Content

Alpakka10\.0\.2 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/stream/index.html "Permalink")  package [stream](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/stream/alpakka/index.html "Permalink")  package [alpakka](../index.html)Definition Classes[stream](../../index.html)
- [**](../../../../akka/stream/alpakka/reference/index.html "Permalink")  package [reference](index.html)Definition Classes[alpakka](../index.html)
- [**](../../../../akka/stream/alpakka/reference/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[reference](index.html)
- [**](../../../../akka/stream/alpakka/reference/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[reference](index.html)
- [**](../../../../akka/stream/alpakka/reference/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[reference](index.html)
- [Authentication](Authentication.html "Use sealed for closed class hierarchies.")
- [ReferenceAttributes](ReferenceAttributes$.html)
- ReferenceReadResult
- [ReferenceResourceValue](ReferenceResourceValue.html)
- [ReferenceWriteMessage](ReferenceWriteMessage.html "Use \"Write\" in message data types to signify that the messages is to be written to outside.")
- [ReferenceWriteResult](ReferenceWriteResult.html "The result returned by the flow for each ReferenceWriteMessage.")
- [Resource](Resource.html "Some connectors might require an external resource that is used in the Source, Flow and/or Sink factories.")
- [ResourceExt](ResourceExt.html "In order to minimise the user facing API, the resource lifetime can be managed by an Akka Extension.")
- [ResourceSettings](ResourceSettings.html "Settings required for the Resource should be extracted to a separate class.")
- [SourceSettings](SourceSettings.html "Settings class constructor is private and not exposed as API.")
c[akka](../../../index.html).[stream](../../index.html).[alpakka](../index.html).[reference](index.html)

# ReferenceReadResult[**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html "Permalink")

### 

#### final  class ReferenceReadResult extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Use "Read" in message data types to signify that the message was read from outside.

The constructor is INTERNAL API, but you may construct instances for testing by using
[akka.stream.alpakka.reference.testkit.MessageFactory](testkit/MessageFactory$.html).

Source[model.scala](https://github.com/akka/alpakka/tree/v10.0.2/reference/src/main/scala/akka/stream/alpakka/reference/model.scala#L23)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReferenceReadResult
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#bytesRead:scala.util.Try[Int] "Permalink")  val bytesRead: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
6. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#data:Seq[akka.util.ByteString] "Permalink")  val data: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]
8. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#getBytesRead():java.util.OptionalInt "Permalink")  def getBytesRead(): [OptionalInt](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/OptionalInt.html#java.util.OptionalInt)Java API

Java API

If the model class is scala.util.Try, then two getters should be created.
One for getting the value, and another for getting the exception.

Return bytes read wrapped in OptionalInt if the Try contains a value,
otherwise return empty Optional.
11. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#getBytesReadFailure():java.util.Optional[Throwable] "Permalink")  def getBytesReadFailure(): [Optional](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]Java API

Java API

Return the exception wrapped in Optional if the Try contains a Failure,
otherwise return empty Optional.
12. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#getData():java.util.List[akka.util.ByteString] "Permalink")  def getData(): [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]Java API

Java API

If the model class is meant to be also consumed from the user API,
but the attribute class is Scala specific, create getter for Java API.
14. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
15. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
18. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
19. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#toString():String "Permalink")  def toString(): StringDefinition ClassesReferenceReadResult → AnyRef → Any
21. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../akka/stream/alpakka/reference/ReferenceReadResult.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/Authentication$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/Authentication.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceAttributes$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceReadResult.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceResourceValue.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceWriteMessage$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceWriteMessage.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceWriteResult.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/Resource$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/Resource.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ResourceExt$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ResourceExt.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ResourceSettings$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ResourceSettings.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/SourceSettings$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/SourceSettings.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/javadsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/scaladsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/testkit/MessageFactory$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/testkit/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/index.html
- https://doc.akka.io/api/alpakka/10.0.2/index.html

---
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceReadResult.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceReadResult.html)*