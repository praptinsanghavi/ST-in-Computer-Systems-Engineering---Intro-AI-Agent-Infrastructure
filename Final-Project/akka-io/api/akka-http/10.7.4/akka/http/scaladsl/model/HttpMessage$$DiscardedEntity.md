---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage.DiscardedEntity
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:12:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage.DiscardedEntity
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage.DiscardedEntity

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage.DiscardedEntity

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/HttpMessage$.html "Permalink")  object [HttpMessage](HttpMessage$.html)Definition Classes[model](index.html)
- DiscardedEntity
- [HttpMessageScalaDSLSugar](HttpMessage$$HttpMessageScalaDSLSugar.html "Adds Scala DSL idiomatic methods to HttpMessage, e.g.")
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[HttpMessage](HttpMessage$.html)

# DiscardedEntity[**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html "Permalink")

### 

#### final  class DiscardedEntity extends javadsl.model.HttpMessage.DiscardedEntity

Represents the currently being\-drained HTTP Entity which triggers completion of the contained
Future once the entity has been drained for the given HttpMessage completely.

Source[HttpMessage.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpMessage.scala#L272)Linear Supertypesjavadsl.model.HttpMessage.DiscardedEntity, javadsl.model.HttpEntity.DiscardedEntity, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DiscardedEntity
2. DiscardedEntity
3. DiscardedEntity
4. AnyRef
5. Any
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

1. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#<init>(f:scala.concurrent.Future[akka.Done]):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  new DiscardedEntity(f: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)])
### Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DiscardedEntity toany2stringadd\[DiscardedEntity] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DiscardedEntity, B)ImplicitThis member is added by an implicit conversion from DiscardedEntity toArrowAssoc\[DiscardedEntity] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#completionStage():java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def completionStage(): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]This future completes successfully once the underlying entity stream has been
successfully drained (and fails otherwise).

This future completes successfully once the underlying entity stream has been
successfully drained (and fails otherwise).

Definition ClassesDiscardedEntity → DiscardedEntity
9. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DiscardedEntity) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DiscardedEntityImplicitThis member is added by an implicit conversion from DiscardedEntity toEnsuring\[DiscardedEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DiscardedEntity) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DiscardedEntityImplicitThis member is added by an implicit conversion from DiscardedEntity toEnsuring\[DiscardedEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DiscardedEntityImplicitThis member is added by an implicit conversion from DiscardedEntity toEnsuring\[DiscardedEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DiscardedEntityImplicitThis member is added by an implicit conversion from DiscardedEntity toEnsuring\[DiscardedEntity] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#future():scala.concurrent.Future[akka.Done] "Permalink")  def future(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]This future completes successfully once the underlying entity stream has been
successfully drained (and fails otherwise).

This future completes successfully once the underlying entity stream has been
successfully drained (and fails otherwise).

Definition ClassesDiscardedEntity → DiscardedEntity
16. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DiscardedEntity toStringFormat\[DiscardedEntity] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DiscardedEntity, B)ImplicitThis member is added by an implicit conversion from DiscardedEntity toArrowAssoc\[DiscardedEntity] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from javadsl.model.HttpMessage.DiscardedEntity

### Inherited from javadsl.model.HttpEntity.DiscardedEntity

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDiscardedEntity to any2stringadd\[DiscardedEntity]

### Inherited by implicit conversion StringFormat fromDiscardedEntity to StringFormat\[DiscardedEntity]

### Inherited by implicit conversion Ensuring fromDiscardedEntity to Ensuring\[DiscardedEntity]

### Inherited by implicit conversion ArrowAssoc fromDiscardedEntity to ArrowAssoc\[DiscardedEntity]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html)*