---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.TextMessage.Strict
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/TextMessage$$Strict.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.TextMessage.Strict
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.TextMessage.Strict

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.ws.TextMessage.Strict

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/ws/index.html "Permalink")  package [ws](index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$.html "Permalink")  object [TextMessage](TextMessage$.html)Definition Classes[ws](index.html)
- [Streamed](TextMessage$$Streamed.html)
- Strict
c[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html).[ws](index.html).[TextMessage](TextMessage$.html)

# Strict[**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html "Permalink")

### 

#### final  case class Strict(text: String) extends [javadsl.model.ws.TextMessage](../../../javadsl/model/ws/TextMessage.html) with [TextMessage](TextMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

A strict [TextMessage](TextMessage.html) that contains the complete data as a String.

Source[Message.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/ws/Message.scala#L62)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [TextMessage](TextMessage.html), [Message](Message.html), [javadsl.model.ws.TextMessage](../../../javadsl/model/ws/TextMessage.html), [javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Strict
2. Serializable
3. Product
4. Equals
5. TextMessage
6. Message
7. TextMessage
8. Message
9. AnyRef
10. Any
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

1. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#<init>(text:String):akka.http.scaladsl.model.ws.TextMessage.Strict "Permalink")  new Strict(text: String)
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Strict toany2stringadd\[Strict] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Strict, B)ImplicitThis member is added by an implicit conversion from Strict toArrowAssoc\[Strict] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#asBinaryMessage:akka.http.javadsl.model.ws.BinaryMessage "Permalink")  def asBinaryMessage: [javadsl.model.ws.BinaryMessage](../../../javadsl/model/ws/BinaryMessage.html)Returns this BinaryMessage if it is a binary message, throws otherwise.

Returns this BinaryMessage if it is a binary message, throws otherwise.

Definition Classes[TextMessage](../../../javadsl/model/ws/TextMessage.html) → [Message](../../../javadsl/model/ws/Message.html)
7. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#asScala:akka.http.scaladsl.model.ws.TextMessage "Permalink")  def asScala: [TextMessage](TextMessage.html)Definition Classes[TextMessage](TextMessage.html) → [TextMessage](../../../javadsl/model/ws/TextMessage.html) → [Message](../../../javadsl/model/ws/Message.html)
9. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#asTextMessage:akka.http.javadsl.model.ws.TextMessage "Permalink")  def asTextMessage: [javadsl.model.ws.TextMessage](../../../javadsl/model/ws/TextMessage.html)Returns this TextMessage if it is a text message, throws otherwise.

Returns this TextMessage if it is a text message, throws otherwise.

Definition Classes[TextMessage](../../../javadsl/model/ws/TextMessage.html) → [Message](../../../javadsl/model/ws/Message.html)
10. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Strict) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Strict) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StrictImplicitThis member is added by an implicit conversion from Strict toEnsuring\[Strict] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#getStreamedText:akka.stream.javadsl.Source[String,_] "Permalink")  def getStreamedText: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[String, \_]Java API

Java API

Definition Classes[TextMessage](TextMessage.html) → [TextMessage](../../../javadsl/model/ws/TextMessage.html)
18. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#getStrictText:String "Permalink")  def getStrictText: StringJava API

Java API

Definition ClassesStrict → [TextMessage](../../../javadsl/model/ws/TextMessage.html)
19. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#isStrict:Boolean "Permalink")  def isStrict: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this message a strict one?

Is this message a strict one?

Definition ClassesStrict → [Message](../../../javadsl/model/ws/Message.html)
21. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#isText:Boolean "Permalink")  def isText: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this message a text message? If true, [asTextMessage](#asTextMessage:akka.http.javadsl.model.ws.TextMessage) will return this
text message, if false, [asBinaryMessage](#asBinaryMessage:akka.http.javadsl.model.ws.BinaryMessage) will return this binary message.

Is this message a text message? If true, [asTextMessage](#asTextMessage:akka.http.javadsl.model.ws.TextMessage) will return this
text message, if false, [asBinaryMessage](#asBinaryMessage:akka.http.javadsl.model.ws.BinaryMessage) will return this binary message.

Definition Classes[TextMessage](../../../javadsl/model/ws/TextMessage.html) → [Message](../../../javadsl/model/ws/Message.html)
22. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
26. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#text:String "Permalink")  val text: String
28. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#textStream:akka.stream.scaladsl.Source[String,_] "Permalink")  def textStream: [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[String, \_]The contents of this message as a stream.

The contents of this message as a stream.

Definition ClassesStrict → [TextMessage](TextMessage.html)
29. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#toStrict(timeoutMillis:Long,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.scaladsl.model.ws.TextMessage.Strict] "Permalink")  def toStrict(timeoutMillis: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[Strict]Definition Classes[TextMessage](TextMessage.html) → [TextMessage](../../../javadsl/model/ws/TextMessage.html)
30. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#toStrict(timeout:scala.concurrent.duration.FiniteDuration)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.model.ws.TextMessage.Strict] "Permalink")  def toStrict(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Strict]Collects all possible parts and returns a potentially future Strict Message for easier processing.

Collects all possible parts and returns a potentially future Strict Message for easier processing.
The Future is failed with an TimeoutException if the stream isn't completed after the given timeout.

Definition Classes[TextMessage](TextMessage.html)
31. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#toString():String "Permalink")  def toString(): StringDefinition ClassesStrict → AnyRef → Any
32. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Strict toStringFormat\[Strict] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/model/ws/TextMessage$$Strict.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Strict, B)ImplicitThis member is added by an implicit conversion from Strict toArrowAssoc\[Strict] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [TextMessage](TextMessage.html)

### Inherited from [Message](Message.html)

### Inherited from [javadsl.model.ws.TextMessage](../../../javadsl/model/ws/TextMessage.html)

### Inherited from [javadsl.model.ws.Message](../../../javadsl/model/ws/Message.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStrict to any2stringadd\[Strict]

### Inherited by implicit conversion StringFormat fromStrict to StringFormat\[Strict]

### Inherited by implicit conversion Ensuring fromStrict to Ensuring\[Strict]

### Inherited by implicit conversion ArrowAssoc fromStrict to ArrowAssoc\[Strict]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/BinaryMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ws/TextMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage$$Streamed.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage$$Strict.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage$$Strict.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/TextMessage$$Strict.html)*