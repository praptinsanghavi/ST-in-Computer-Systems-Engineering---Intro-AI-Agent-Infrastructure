---
description: Akka HTTP 10.7.4 - akka.http.javadsl.coding.Coder
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:19:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/coding/Coder.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.coding.Coder
---

# Akka HTTP 10.7.4 - akka.http.javadsl.coding.Coder

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.coding.Coder

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/coding/index.html "Permalink")  package [coding](index.html)Definition Classes[javadsl](../index.html)
- Coder
c[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[coding](index.html)

# Coder[**](../../../../akka/http/javadsl/coding/Coder.html "Permalink")

### 

#### sealed final  class Coder extends [Enum](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Enum.html#java.lang.Enum)\[Coder]

A coder is an implementation of the predefined encoders/decoders defined for HTTP.

Annotations@SuppressWarnings() Source[Coder.java](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/java/akka/http/javadsl/coding/Coder.java#L20)Linear Supertypes[Enum](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Enum.html#java.lang.Enum)\[Coder], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[Coder], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Coder
2. Enum
3. Serializable
4. Comparable
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
### Value Members

1. [**](../../../../akka/http/javadsl/coding/Coder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/coding/Coder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/coding/Coder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Coder toany2stringadd\[Coder] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/coding/Coder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Coder, B)ImplicitThis member is added by an implicit conversion from Coder toArrowAssoc\[Coder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/coding/Coder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/coding/Coder.html#_underlyingScalaCoder():akka.http.scaladsl.coding.Coder "Permalink")  def \_underlyingScalaCoder(): [scaladsl.coding.Coder](../../scaladsl/coding/Coder.html)
7. [**](../../../../akka/http/javadsl/coding/Coder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/javadsl/coding/Coder.html#clone():Object "Permalink") final  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesEnum → AnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException])
9. [**](../../../../akka/http/javadsl/coding/Coder.html#compareTo(x$1:E):Int "Permalink") final  def compareTo(arg0: Coder): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesEnum → Comparable
10. [**](../../../../akka/http/javadsl/coding/Coder.html#decode(input:akka.util.ByteString,mat:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.util.ByteString] "Permalink")  def decode(input: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)]
11. [**](../../../../akka/http/javadsl/coding/Coder.html#decodeMessage(message:akka.http.javadsl.model.HttpRequest):akka.http.javadsl.model.HttpRequest "Permalink")  def decodeMessage(message: [HttpRequest](../model/HttpRequest.html)): [HttpRequest](../model/HttpRequest.html)
12. [**](../../../../akka/http/javadsl/coding/Coder.html#decodeMessage(message:akka.http.javadsl.model.HttpResponse):akka.http.javadsl.model.HttpResponse "Permalink")  def decodeMessage(message: [HttpResponse](../model/HttpResponse.html)): [HttpResponse](../model/HttpResponse.html)
13. [**](../../../../akka/http/javadsl/coding/Coder.html#encodeMessage(message:akka.http.javadsl.model.HttpRequest):akka.http.javadsl.model.HttpRequest "Permalink")  def encodeMessage(message: [HttpRequest](../model/HttpRequest.html)): [HttpRequest](../model/HttpRequest.html)
14. [**](../../../../akka/http/javadsl/coding/Coder.html#encodeMessage(message:akka.http.javadsl.model.HttpResponse):akka.http.javadsl.model.HttpResponse "Permalink")  def encodeMessage(message: [HttpResponse](../model/HttpResponse.html)): [HttpResponse](../model/HttpResponse.html)
15. [**](../../../../akka/http/javadsl/coding/Coder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Coder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CoderImplicitThis member is added by an implicit conversion from Coder toEnsuring\[Coder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../akka/http/javadsl/coding/Coder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Coder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CoderImplicitThis member is added by an implicit conversion from Coder toEnsuring\[Coder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/http/javadsl/coding/Coder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CoderImplicitThis member is added by an implicit conversion from Coder toEnsuring\[Coder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/http/javadsl/coding/Coder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CoderImplicitThis member is added by an implicit conversion from Coder toEnsuring\[Coder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../akka/http/javadsl/coding/Coder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/http/javadsl/coding/Coder.html#equals(x$1:Object):Boolean "Permalink") final  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesEnum → AnyRef → Any
21. [**](../../../../akka/http/javadsl/coding/Coder.html#finalize():Unit "Permalink") final  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesEnum → AnyRef
22. [**](../../../../akka/http/javadsl/coding/Coder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/javadsl/coding/Coder.html#getDeclaringClass():Class[E] "Permalink") final  def getDeclaringClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[Coder]Definition ClassesEnum
24. [**](../../../../akka/http/javadsl/coding/Coder.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesEnum → AnyRef → Any
25. [**](../../../../akka/http/javadsl/coding/Coder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../../akka/http/javadsl/coding/Coder.html#name():String "Permalink") final  def name(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesEnum
27. [**](../../../../akka/http/javadsl/coding/Coder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../../akka/http/javadsl/coding/Coder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/http/javadsl/coding/Coder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/javadsl/coding/Coder.html#ordinal():Int "Permalink") final  def ordinal(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesEnum
31. [**](../../../../akka/http/javadsl/coding/Coder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../../akka/http/javadsl/coding/Coder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesEnum → AnyRef → Any
33. [**](../../../../akka/http/javadsl/coding/Coder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../../akka/http/javadsl/coding/Coder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../../akka/http/javadsl/coding/Coder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/coding/Coder.html#encode(input:akka.util.ByteString):akka.util.ByteString "Permalink")  def encode(input: [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)): [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString)Annotations@Deprecated Deprecated
2. [**](../../../../akka/http/javadsl/coding/Coder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Coder toStringFormat\[Coder] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/coding/Coder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Coder, B)ImplicitThis member is added by an implicit conversion from Coder toArrowAssoc\[Coder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Enum](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Enum.html#java.lang.Enum)\[Coder]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Comparable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html#java.lang.Comparable)\[Coder]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCoder to any2stringadd\[Coder]

### Inherited by implicit conversion StringFormat fromCoder to StringFormat\[Coder]

### Inherited by implicit conversion Ensuring fromCoder to Ensuring\[Coder]

### Inherited by implicit conversion ArrowAssoc fromCoder to ArrowAssoc\[Coder]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/coding/Coder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/coding/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/Coder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/coding/Coder.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/coding/Coder.html)*