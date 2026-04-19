---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.sse.EventStreamMarshalling
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.sse.EventStreamMarshalling
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.sse.EventStreamMarshalling

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.sse.EventStreamMarshalling

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/marshalling/sse/index.html "Permalink")  package [sse](index.html)Definition Classes[marshalling](../index.html)
- EventStreamMarshalling
[t](EventStreamMarshalling$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[marshalling](../index.html).[sse](index.html)

# [EventStreamMarshalling](EventStreamMarshalling$.html "See companion object")[**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html "Permalink")

### Companion [object EventStreamMarshalling](EventStreamMarshalling$.html "See companion object")

#### trait EventStreamMarshalling extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Mixing in this trait lets a source of ServerSentEvents be marshalled to a `HttpEntity` and hence as a
`HttpResponse`.

Annotations@ApiMayChange() Source[EventStreamMarshalling.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.scala#L28)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[EventStreamMarshalling](EventStreamMarshalling$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventStreamMarshalling
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

1. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventStreamMarshalling toany2stringadd\[EventStreamMarshalling] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventStreamMarshalling, B)ImplicitThis member is added by an implicit conversion from EventStreamMarshalling toArrowAssoc\[EventStreamMarshalling] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventStreamMarshalling) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventStreamMarshallingImplicitThis member is added by an implicit conversion from EventStreamMarshalling toEnsuring\[EventStreamMarshalling] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventStreamMarshalling) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventStreamMarshallingImplicitThis member is added by an implicit conversion from EventStreamMarshalling toEnsuring\[EventStreamMarshalling] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventStreamMarshallingImplicitThis member is added by an implicit conversion from EventStreamMarshalling toEnsuring\[EventStreamMarshalling] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventStreamMarshallingImplicitThis member is added by an implicit conversion from EventStreamMarshalling toEnsuring\[EventStreamMarshalling] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#toEventStream:akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.stream.scaladsl.Source[akka.http.scaladsl.model.sse.ServerSentEvent,Any]] "Permalink") implicit final  val toEventStream: [ToEntityMarshaller](../index.html#ToEntityMarshaller[T]=akka.http.scaladsl.marshalling.Marshaller[T,akka.http.scaladsl.model.MessageEntity])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ServerSentEvent](../../model/sse/ServerSentEvent.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]]
22. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventStreamMarshalling toStringFormat\[EventStreamMarshalling] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventStreamMarshalling, B)ImplicitThis member is added by an implicit conversion from EventStreamMarshalling toArrowAssoc\[EventStreamMarshalling] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventStreamMarshalling to any2stringadd\[EventStreamMarshalling]

### Inherited by implicit conversion StringFormat fromEventStreamMarshalling to StringFormat\[EventStreamMarshalling]

### Inherited by implicit conversion Ensuring fromEventStreamMarshalling to Ensuring\[EventStreamMarshalling]

### Inherited by implicit conversion ArrowAssoc fromEventStreamMarshalling to ArrowAssoc\[EventStreamMarshalling]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html)*