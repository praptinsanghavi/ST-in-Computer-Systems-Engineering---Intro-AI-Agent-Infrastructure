---
description: Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling.Unmarshaller
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling.Unmarshaller
---

# Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling.Unmarshaller

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.unmarshalling.Unmarshaller

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](index.html)Definition Classes[javadsl](../index.html)
- [**](../../../../akka/http/javadsl/unmarshalling/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[unmarshalling](index.html)
- [StringUnmarshaller](StringUnmarshaller$.html)
- [StringUnmarshallers](StringUnmarshallers.html)
- Unmarshaller
- [UnmarshallerBase](UnmarshallerBase.html)
- [Unmarshallers](Unmarshallers.html)
[c](Unmarshaller$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[unmarshalling](index.html)

# [Unmarshaller](Unmarshaller$.html "See companion object")[**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html "Permalink")

### Companion [object Unmarshaller](Unmarshaller$.html "See companion object")

#### abstract  class Unmarshaller\[\-A, B] extends [UnmarshallerBase](UnmarshallerBase.html)\[A, B]

An unmarshaller transforms values of type A into type B.

Source[Unmarshaller.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/unmarshalling/Unmarshaller.scala#L115)Linear Supertypes[UnmarshallerBase](UnmarshallerBase.html)\[A, B], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Unmarshaller
2. UnmarshallerBase
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
### Instance Constructors

1. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#<init>():akka.http.javadsl.unmarshalling.Unmarshaller[A,B] "Permalink")  new Unmarshaller()
### Abstract Value Members

1. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#asScala:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B] "Permalink") implicit abstract  def asScala: [scaladsl.unmarshalling.Unmarshaller](../../scaladsl/unmarshalling/Unmarshaller.html)\[A, B]
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toany2stringadd\[Unmarshaller\[A, B]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Unmarshaller\[A, B], B)ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toArrowAssoc\[Unmarshaller\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Unmarshaller\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Unmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toEnsuring\[Unmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Unmarshaller\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Unmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toEnsuring\[Unmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Unmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toEnsuring\[Unmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Unmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toEnsuring\[Unmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#flatMap[C](u:akka.http.javadsl.unmarshalling.Unmarshaller[_>:B,C]):akka.http.javadsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def flatMap\[C](u: Unmarshaller\[\_ \>: B, C]): Unmarshaller\[A, C]
15. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#flatMap[C](f:java.util.function.Function[B,java.util.concurrent.CompletionStage[C]]):akka.http.javadsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def flatMap\[C](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[B, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[C]]): Unmarshaller\[A, C]
16. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#thenApply[C](f:java.util.function.Function[B,C]):akka.http.javadsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def thenApply\[C](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[B, C]): Unmarshaller\[A, C]Transform the result `B` of this unmarshaller to a `C` producing a marshaller that turns `A`s into `C`s

Transform the result `B` of this unmarshaller to a `C` producing a marshaller that turns `A`s into `C`s

returnsA new marshaller that can unmarshall instances of `A` into instances of `C`
24. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.

Apply this Unmarshaller to the given value. Uses the default materializer ExecutionContext.
If you expect the marshalling to be heavy, it is suggested to provide a specialized context for those operations.
26. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,ec:scala.concurrent.ExecutionContext,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.
27. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,mat:akka.stream.Materializer):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.

Apply this Unmarshaller to the given value. Uses the default materializer ExecutionContext.
If you expect the marshalling to be heavy, it is suggested to provide a specialized context for those operations.
28. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,ec:scala.concurrent.ExecutionContext,mat:akka.stream.Materializer):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.
29. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toStringFormat\[Unmarshaller\[A, B]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/unmarshalling/Unmarshaller.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Unmarshaller\[A, B], B)ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toArrowAssoc\[Unmarshaller\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [UnmarshallerBase](UnmarshallerBase.html)\[A, B]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUnmarshaller\[A, B] to any2stringadd\[Unmarshaller\[A, B]]

### Inherited by implicit conversion StringFormat fromUnmarshaller\[A, B] to StringFormat\[Unmarshaller\[A, B]]

### Inherited by implicit conversion Ensuring fromUnmarshaller\[A, B] to Ensuring\[Unmarshaller\[A, B]]

### Inherited by implicit conversion ArrowAssoc fromUnmarshaller\[A, B] to ArrowAssoc\[Unmarshaller\[A, B]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/StringUnmarshaller$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/StringUnmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/UnmarshallerBase.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshallers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html)*