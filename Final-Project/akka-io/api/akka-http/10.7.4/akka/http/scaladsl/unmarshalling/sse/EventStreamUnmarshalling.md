---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.sse.EventStreamUnmarshalling
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.sse.EventStreamUnmarshalling
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.sse.EventStreamUnmarshalling

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.sse.EventStreamUnmarshalling

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/unmarshalling/sse/index.html "Permalink")  package [sse](index.html)Definition Classes[unmarshalling](../index.html)
- [EventStreamParser](EventStreamParser$.html "Flow that converts raw byte string input into ServerSentEvents.")
- EventStreamUnmarshalling
[t](EventStreamUnmarshalling$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[unmarshalling](../index.html).[sse](index.html)

# [EventStreamUnmarshalling](EventStreamUnmarshalling$.html "See companion object")[**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html "Permalink")

### Companion [object EventStreamUnmarshalling](EventStreamUnmarshalling$.html "See companion object")

#### trait EventStreamUnmarshalling extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Mixing in this trait lets a `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of
ServerSentEvents.

The maximum size for parsing server\-sent events is 8KiB by default and can be customized by configuring
`akka.http.sse.max-event-size`. The maximum size for parsing lines of a server\-sent event is 4KiB by
default and can be customized by configuring `akka.http.sse.max-line-size`.

Annotations@ApiMayChange() Source[EventStreamUnmarshalling.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.scala#L40)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[EventStreamUnmarshalling](EventStreamUnmarshalling$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EventStreamUnmarshalling
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

1. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EventStreamUnmarshalling toany2stringadd\[EventStreamUnmarshalling] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EventStreamUnmarshalling, B)ImplicitThis member is added by an implicit conversion from EventStreamUnmarshalling toArrowAssoc\[EventStreamUnmarshalling] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EventStreamUnmarshalling) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventStreamUnmarshallingImplicitThis member is added by an implicit conversion from EventStreamUnmarshalling toEnsuring\[EventStreamUnmarshalling] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EventStreamUnmarshalling) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventStreamUnmarshallingImplicitThis member is added by an implicit conversion from EventStreamUnmarshalling toEnsuring\[EventStreamUnmarshalling] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EventStreamUnmarshallingImplicitThis member is added by an implicit conversion from EventStreamUnmarshalling toEnsuring\[EventStreamUnmarshalling] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EventStreamUnmarshallingImplicitThis member is added by an implicit conversion from EventStreamUnmarshalling toEnsuring\[EventStreamUnmarshalling] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#fromEventsStream(settings:akka.http.scaladsl.settings.ServerSentEventSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.stream.scaladsl.Source[akka.http.scaladsl.model.sse.ServerSentEvent,akka.NotUsed]] "Permalink")  def fromEventsStream(settings: [ServerSentEventSettings](../../settings/ServerSentEventSettings.html)): [FromEntityUnmarshaller](../index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ServerSentEvent](../../model/sse/ServerSentEvent.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]]Lets an `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of `ServerSentEvent`s.

Lets an `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of `ServerSentEvent`s.

settingsoverrides the default unmarshalling behavior.
15. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#fromEventsStream(implicitsystem:akka.actor.ActorSystem):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.stream.scaladsl.Source[akka.http.scaladsl.model.sse.ServerSentEvent,akka.NotUsed]] "Permalink") implicit final  def fromEventsStream(implicit system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [FromEntityUnmarshaller](../index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ServerSentEvent](../../model/sse/ServerSentEvent.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]]Lets an `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of `ServerSentEvent`s.
16. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EventStreamUnmarshalling toStringFormat\[EventStreamUnmarshalling] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#fromEventStream:akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.stream.scaladsl.Source[akka.http.scaladsl.model.sse.ServerSentEvent,akka.NotUsed]] "Permalink") final  val fromEventStream: [FromEntityUnmarshaller](../index.html#FromEntityUnmarshaller[T]=akka.http.scaladsl.unmarshalling.Unmarshaller[akka.http.scaladsl.model.HttpEntity,T])\[[Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ServerSentEvent](../../model/sse/ServerSentEvent.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]]Annotations@deprecated Deprecated*(Since version 10\.1\.8\)* Binary compatibility method. Invocations should have an implicit ActorSystem in scope to provide access to configuration
4. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#maxEventSize:Int "Permalink")  def maxEventSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)The maximum size for parsing server\-sent events; 8KiB by default.

The maximum size for parsing server\-sent events; 8KiB by default.

Attributesprotected Annotations@deprecated Deprecated*(Since version 10\.1\.8\)* Set this property in configuration as `akka.http.sse.max-event-size` before calling fromEventsStream(implicit ActorSystem)
5. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#maxLineSize:Int "Permalink")  def maxLineSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)The maximum size for parsing lines of a server\-sent event; 4KiB by default.

The maximum size for parsing lines of a server\-sent event; 4KiB by default.

Attributesprotected Annotations@deprecated Deprecated*(Since version 10\.1\.8\)* Set this property in configuration as `akka.http.sse.max-line-size` before calling fromEventsStream(implicit ActorSystem)
6. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EventStreamUnmarshalling, B)ImplicitThis member is added by an implicit conversion from EventStreamUnmarshalling toArrowAssoc\[EventStreamUnmarshalling] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEventStreamUnmarshalling to any2stringadd\[EventStreamUnmarshalling]

### Inherited by implicit conversion StringFormat fromEventStreamUnmarshalling to StringFormat\[EventStreamUnmarshalling]

### Inherited by implicit conversion Ensuring fromEventStreamUnmarshalling to Ensuring\[EventStreamUnmarshalling]

### Inherited by implicit conversion ArrowAssoc fromEventStreamUnmarshalling to ArrowAssoc\[EventStreamUnmarshalling]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/EventStreamParser$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html)*