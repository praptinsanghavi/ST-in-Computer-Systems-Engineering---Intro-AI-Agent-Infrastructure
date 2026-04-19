---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:12:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.Unmarshaller

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/sse/index.html "Permalink")  package [sse](sse/index.html)Definition Classes[unmarshalling](index.html)
- [GenericUnmarshallers](GenericUnmarshallers.html)
- [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html)
- [MultipartUnmarshallers](MultipartUnmarshallers.html "Provides akka.http.scaladsl.model.Multipart marshallers.")
- [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html)
- [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html)
- [Unmarshal](Unmarshal.html)
- Unmarshaller
[t](Unmarshaller$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[unmarshalling](index.html)

# [Unmarshaller](Unmarshaller$.html "See companion object")[**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html "Permalink")

### Companion [object Unmarshaller](Unmarshaller$.html "See companion object")

#### trait Unmarshaller\[\-A, B] extends [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B]

Source[Unmarshaller.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/Unmarshaller.scala#L16)Linear Supertypes[javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B], [UnmarshallerBase](../../javadsl/unmarshalling/UnmarshallerBase.html)\[A, B], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Unmarshaller
2. Unmarshaller
3. UnmarshallerBase
4. AnyRef
5. Any
Implicitly  
1. by EnhancedFromEntityUnmarshaller
2. by EnhancedUnmarshaller
3. by fromScala
4. by any2stringadd
5. by StringFormat
6. by Ensuring
7. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#apply(value:A)(implicitec:scala.concurrent.ExecutionContext,implicitmaterializer:akka.stream.Materializer):scala.concurrent.Future[B] "Permalink") abstract  def apply(value: A)(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toany2stringadd\[Unmarshaller\[A, B]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Unmarshaller\[A, B], B)ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toArrowAssoc\[Unmarshaller\[A, B]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if A is a superclass of HttpEntity (A \>: [HttpEntity](../model/HttpEntity.html)).Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#andThen[C](other:akka.http.scaladsl.unmarshalling.Unmarshaller[B,C]):akka.http.scaladsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def andThen\[C](other: Unmarshaller\[B, C]): Unmarshaller\[A, C]
7. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#asScala:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B] "Permalink") implicit final  def asScala: Unmarshaller\[A, B]Definition ClassesUnmarshaller → [Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
9. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Unmarshaller\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Unmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toEnsuring\[Unmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Unmarshaller\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Unmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toEnsuring\[Unmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Unmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toEnsuring\[Unmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Unmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toEnsuring\[Unmarshaller\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#flatMap[C](f:scala.concurrent.ExecutionContext=>(akka.stream.Materializer=>(B=>scala.concurrent.Future[C]))):akka.http.scaladsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def flatMap\[C](f: ([ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)) \=\> ([Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)) \=\> (B) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[C]): Unmarshaller\[A, C]
17. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#flatMap[C](u:akka.http.javadsl.unmarshalling.Unmarshaller[_>:B,C]):akka.http.javadsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def flatMap\[C](u: [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[\_ \>: B, C]): [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, C]Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
18. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#flatMap[C](f:java.util.function.Function[B,java.util.concurrent.CompletionStage[C]]):akka.http.javadsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def flatMap\[C](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[B, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[C]]): [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, C]Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
19. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#flatMapWithInput[C](f:(A,B)=>scala.concurrent.Future[C]):akka.http.scaladsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def flatMapWithInput\[C](f: (A, B) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[C]): Unmarshaller\[A, C]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[EnhancedUnmarshaller](Unmarshaller$$EnhancedUnmarshaller.html)\[A, B] performed by method EnhancedUnmarshaller in [akka.http.scaladsl.unmarshalling.Unmarshaller](Unmarshaller$.html).Definition Classes[EnhancedUnmarshaller](Unmarshaller$$EnhancedUnmarshaller.html)
20. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#forContentTypes(ranges:akka.http.scaladsl.model.ContentTypeRange*):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[A] "Permalink")  def forContentTypes(ranges: [ContentTypeRange](../model/ContentTypeRange.html)\*): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[B]Modifies the underlying Unmarshaller to only accept Content\-Types matching one of the given ranges.

Modifies the underlying Unmarshaller to only accept Content\-Types matching one of the given ranges.
Note that you can only restrict to a subset of the Content\-Types accepted by the underlying unmarshaller,
i.e. the given ranges must be completely supported also by the underlying Unmarshaller!
If a violation of this rule is detected at runtime, i.e. if an entity is encountered whose Content\-Type
is matched by one of the given ranges but rejected by the underlying unmarshaller
an IllegalStateException will be thrown!

ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[EnhancedFromEntityUnmarshaller](Unmarshaller$$EnhancedFromEntityUnmarshaller.html)\[B] performed by method EnhancedFromEntityUnmarshaller in [akka.http.scaladsl.unmarshalling.Unmarshaller](Unmarshaller$.html).This conversion will take place only if A is a superclass of HttpEntity (A \>: [HttpEntity](../model/HttpEntity.html)).Definition Classes[EnhancedFromEntityUnmarshaller](Unmarshaller$$EnhancedFromEntityUnmarshaller.html)
21. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#map[C](f:B=>C):akka.http.scaladsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def map\[C](f: (B) \=\> C): Unmarshaller\[A, C]
25. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#mapWithCharset[B](f:(A,akka.http.scaladsl.model.HttpCharset)=>B):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[B] "Permalink")  def mapWithCharset\[B](f: (B, [HttpCharset](../model/HttpCharset.html)) \=\> B): [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[EnhancedFromEntityUnmarshaller](Unmarshaller$$EnhancedFromEntityUnmarshaller.html)\[B] performed by method EnhancedFromEntityUnmarshaller in [akka.http.scaladsl.unmarshalling.Unmarshaller](Unmarshaller$.html).This conversion will take place only if A is a superclass of HttpEntity (A \>: [HttpEntity](../model/HttpEntity.html)).Definition Classes[EnhancedFromEntityUnmarshaller](Unmarshaller$$EnhancedFromEntityUnmarshaller.html)
26. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#mapWithInput[C](f:(A,B)=>C):akka.http.scaladsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def mapWithInput\[C](f: (A, B) \=\> C): Unmarshaller\[A, C]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[EnhancedUnmarshaller](Unmarshaller$$EnhancedUnmarshaller.html)\[A, B] performed by method EnhancedUnmarshaller in [akka.http.scaladsl.unmarshalling.Unmarshaller](Unmarshaller$.html).Definition Classes[EnhancedUnmarshaller](Unmarshaller$$EnhancedUnmarshaller.html)
27. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#recover[C>:B](pf:scala.concurrent.ExecutionContext=>(akka.stream.Materializer=>PartialFunction[Throwable,C])):akka.http.scaladsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def recover\[C \>: B](pf: ([ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)) \=\> ([Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)) \=\> [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, C]): Unmarshaller\[A, C]
31. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#thenApply[C](f:java.util.function.Function[B,C]):akka.http.javadsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def thenApply\[C](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[B, C]): [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, C]Transform the result `B` of this unmarshaller to a `C` producing a marshaller that turns `A`s into `C`s

Transform the result `B` of this unmarshaller to a `C` producing a marshaller that turns `A`s into `C`s

returnsA new marshaller that can unmarshall instances of `A` into instances of `C`

Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
33. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
34. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#transform[C](f:scala.concurrent.ExecutionContext=>(akka.stream.Materializer=>(scala.concurrent.Future[B]=>scala.concurrent.Future[C]))):akka.http.scaladsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def transform\[C](f: ([ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)) \=\> ([Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)) \=\> ([Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[B]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[C]): Unmarshaller\[A, C]
35. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#um:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B] "Permalink")  val um: Unmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[EnhancedUnmarshaller](Unmarshaller$$EnhancedUnmarshaller.html)\[A, B] performed by method EnhancedUnmarshaller in [akka.http.scaladsl.unmarshalling.Unmarshaller](Unmarshaller$.html).Definition Classes[EnhancedUnmarshaller](Unmarshaller$$EnhancedUnmarshaller.html)
36. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#underlying:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[A] "Permalink")  val underlying: [FromEntityUnmarshaller](index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[EnhancedFromEntityUnmarshaller](Unmarshaller$$EnhancedFromEntityUnmarshaller.html)\[B] performed by method EnhancedFromEntityUnmarshaller in [akka.http.scaladsl.unmarshalling.Unmarshaller](Unmarshaller$.html).This conversion will take place only if A is a superclass of HttpEntity (A \>: [HttpEntity](../model/HttpEntity.html)).Definition Classes[EnhancedFromEntityUnmarshaller](Unmarshaller$$EnhancedFromEntityUnmarshaller.html)
37. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.

Apply this Unmarshaller to the given value. Uses the default materializer ExecutionContext.
If you expect the marshalling to be heavy, it is suggested to provide a specialized context for those operations.

Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
38. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,ec:scala.concurrent.ExecutionContext,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.

Apply this Unmarshaller to the given value.

Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
39. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,mat:akka.stream.Materializer):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.

Apply this Unmarshaller to the given value. Uses the default materializer ExecutionContext.
If you expect the marshalling to be heavy, it is suggested to provide a specialized context for those operations.

Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
40. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,ec:scala.concurrent.ExecutionContext,mat:akka.stream.Materializer):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.

Apply this Unmarshaller to the given value.

Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
41. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
43. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
44. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#withDefaultValue[BB>:B](defaultValue:BB):akka.http.scaladsl.unmarshalling.Unmarshaller[A,BB] "Permalink")  def withDefaultValue\[BB \>: B](defaultValue: BB): Unmarshaller\[A, BB]
### Shadowed Implicit Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#asScala:akka.http.scaladsl.unmarshalling.Unmarshaller[A,B] "Permalink") implicit  def asScala: Unmarshaller\[A, B]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B] performed by method fromScala in [akka.http.javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(unmarshaller: javadsl.unmarshalling.Unmarshaller[A, B]).asScala
```
Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
2. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#flatMap[C](u:akka.http.javadsl.unmarshalling.Unmarshaller[_>:B,C]):akka.http.javadsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def flatMap\[C](u: [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[\_ \>: B, C]): [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, C]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B] performed by method fromScala in [akka.http.javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(unmarshaller: javadsl.unmarshalling.Unmarshaller[A, B]).flatMap(u)
```
Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
3. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#flatMap[C](f:java.util.function.Function[B,java.util.concurrent.CompletionStage[C]]):akka.http.javadsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def flatMap\[C](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[B, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[C]]): [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, C]ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B] performed by method fromScala in [akka.http.javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(unmarshaller: javadsl.unmarshalling.Unmarshaller[A, B]).flatMap(f)
```
Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
4. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#thenApply[C](f:java.util.function.Function[B,C]):akka.http.javadsl.unmarshalling.Unmarshaller[A,C] "Permalink")  def thenApply\[C](f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[B, C]): [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, C]Transform the result `B` of this unmarshaller to a `C` producing a marshaller that turns `A`s into `C`s

Transform the result `B` of this unmarshaller to a `C` producing a marshaller that turns `A`s into `C`s

returnsA new marshaller that can unmarshall instances of `A` into instances of `C`

ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B] performed by method fromScala in [akka.http.javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(unmarshaller: javadsl.unmarshalling.Unmarshaller[A, B]).thenApply(f)
```
Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
5. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.

Apply this Unmarshaller to the given value. Uses the default materializer ExecutionContext.
If you expect the marshalling to be heavy, it is suggested to provide a specialized context for those operations.

ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B] performed by method fromScala in [akka.http.javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(unmarshaller: javadsl.unmarshalling.Unmarshaller[A, B]).unmarshal(value, system)
```
Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
6. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,ec:scala.concurrent.ExecutionContext,system:akka.actor.ClassicActorSystemProvider):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.

Apply this Unmarshaller to the given value.

ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B] performed by method fromScala in [akka.http.javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(unmarshaller: javadsl.unmarshalling.Unmarshaller[A, B]).unmarshal(value, ec, system)
```
Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
7. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,mat:akka.stream.Materializer):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.

Apply this Unmarshaller to the given value. Uses the default materializer ExecutionContext.
If you expect the marshalling to be heavy, it is suggested to provide a specialized context for those operations.

ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B] performed by method fromScala in [akka.http.javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(unmarshaller: javadsl.unmarshalling.Unmarshaller[A, B]).unmarshal(value, mat)
```
Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
8. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#unmarshal(value:A,ec:scala.concurrent.ExecutionContext,mat:akka.stream.Materializer):java.util.concurrent.CompletionStage[B] "Permalink")  def unmarshal(value: A, ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext), mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[B]Apply this Unmarshaller to the given value.

Apply this Unmarshaller to the given value.

ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] to[javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B] performed by method fromScala in [akka.http.javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(unmarshaller: javadsl.unmarshalling.Unmarshaller[A, B]).unmarshal(value, ec, mat)
```
Definition Classes[Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toStringFormat\[Unmarshaller\[A, B]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/unmarshalling/Unmarshaller.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Unmarshaller\[A, B], B)ImplicitThis member is added by an implicit conversion from Unmarshaller\[A, B] toArrowAssoc\[Unmarshaller\[A, B]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if A is a superclass of HttpEntity (A \>: [HttpEntity](../model/HttpEntity.html)).Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B]

### Inherited from [UnmarshallerBase](../../javadsl/unmarshalling/UnmarshallerBase.html)\[A, B]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion EnhancedFromEntityUnmarshaller fromUnmarshaller\[A, B] to [EnhancedFromEntityUnmarshaller](Unmarshaller$$EnhancedFromEntityUnmarshaller.html)\[B]

### Inherited by implicit conversion EnhancedUnmarshaller fromUnmarshaller\[A, B] to [EnhancedUnmarshaller](Unmarshaller$$EnhancedUnmarshaller.html)\[A, B]

### Inherited by implicit conversion fromScala fromUnmarshaller\[A, B] to [javadsl.unmarshalling.Unmarshaller](../../javadsl/unmarshalling/Unmarshaller.html)\[A, B]

### Inherited by implicit conversion any2stringadd fromUnmarshaller\[A, B] to any2stringadd\[Unmarshaller\[A, B]]

### Inherited by implicit conversion StringFormat fromUnmarshaller\[A, B] to StringFormat\[Unmarshaller\[A, B]]

### Inherited by implicit conversion Ensuring fromUnmarshaller\[A, B] to Ensuring\[Unmarshaller\[A, B]]

### Inherited by implicit conversion ArrowAssoc fromUnmarshaller\[A, B] to ArrowAssoc\[Unmarshaller\[A, B]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/UnmarshallerBase.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedFromEntityUnmarshaller.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$$EnhancedUnmarshaller.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html)*