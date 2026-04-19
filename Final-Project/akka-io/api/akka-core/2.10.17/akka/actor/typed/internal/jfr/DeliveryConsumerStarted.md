---
description: Akka 2.10.17 - akka.actor.typed.internal.jfr.DeliveryConsumerStarted
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:22:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html
title: Akka 2.10.17 - akka.actor.typed.internal.jfr.DeliveryConsumerStarted
---

# Akka 2.10.17 - akka.actor.typed.internal.jfr.DeliveryConsumerStarted

> **Summary:** Akka 2.10.17 - akka.actor.typed.internal.jfr.DeliveryConsumerStarted

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/actor/typed/internal/jfr/index.html "Permalink")  package [jfr](index.html)Definition Classes[internal](../index.html)
- [DeliveryConsumerChangedProducer](DeliveryConsumerChangedProducer.html "INTERNAL API")
- [DeliveryConsumerCreated](DeliveryConsumerCreated.html "INTERNAL API")
- [DeliveryConsumerDuplicate](DeliveryConsumerDuplicate.html "INTERNAL API")
- [DeliveryConsumerMissing](DeliveryConsumerMissing.html "INTERNAL API")
- [DeliveryConsumerReceived](DeliveryConsumerReceived.html "INTERNAL API")
- [DeliveryConsumerReceivedPreviousInProgress](DeliveryConsumerReceivedPreviousInProgress.html "INTERNAL API")
- [DeliveryConsumerReceivedResend](DeliveryConsumerReceivedResend.html "INTERNAL API")
- [DeliveryConsumerSentRequest](DeliveryConsumerSentRequest.html "INTERNAL API")
- DeliveryConsumerStarted
- [DeliveryConsumerStashFull](DeliveryConsumerStashFull.html "INTERNAL API")
- [DeliveryProducerCreated](DeliveryProducerCreated.html "INTERNAL API")
- [DeliveryProducerReceived](DeliveryProducerReceived.html "INTERNAL API")
- [DeliveryProducerReceivedRequest](DeliveryProducerReceivedRequest.html "INTERNAL API")
- [DeliveryProducerReceivedResend](DeliveryProducerReceivedResend.html "INTERNAL API")
- [DeliveryProducerRequestNext](DeliveryProducerRequestNext.html "INTERNAL API")
- [DeliveryProducerResentFirst](DeliveryProducerResentFirst.html "INTERNAL API")
- [DeliveryProducerResentFirstUnconfirmed](DeliveryProducerResentFirstUnconfirmed.html "INTERNAL API")
- [DeliveryProducerResentUnconfirmed](DeliveryProducerResentUnconfirmed.html "INTERNAL API")
- [DeliveryProducerSent](DeliveryProducerSent.html "INTERNAL API")
- [DeliveryProducerStarted](DeliveryProducerStarted.html "INTERNAL API")
- [DeliveryProducerWaitingForRequest](DeliveryProducerWaitingForRequest.html "INTERNAL API")
c[akka](../../../../index.html).[actor](../../../index.html).[typed](../../index.html).[internal](../index.html).[jfr](index.html)

# DeliveryConsumerStarted[**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html "Permalink")

### 

#### final  class DeliveryConsumerStarted extends [Event](https://docs.oracle.com/en/java/javase/11/docs/api/jdk.jfr/jdk/jfr/Event.html#jdk.jfr.Event)

INTERNAL API

Annotations@[InternalApi](../../../../annotation/InternalApi.html)() @Enabled() @StackTrace() @Category() @Label() Source[Events.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/internal/jfr/Events.scala#L116)Linear Supertypes[Event](https://docs.oracle.com/en/java/javase/11/docs/api/jdk.jfr/jdk/jfr/Event.html#jdk.jfr.Event), [Event](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/jdk/internal/event/Event.html#jdk.internal.event.Event), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DeliveryConsumerStarted
2. Event
3. Event
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

1. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#<init>(actorPath:String):akka.actor.typed.internal.jfr.DeliveryConsumerStarted "Permalink")  new DeliveryConsumerStarted(actorPath: String)
### Value Members

1. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DeliveryConsumerStarted toany2stringadd\[DeliveryConsumerStarted] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DeliveryConsumerStarted, B)ImplicitThis member is added by an implicit conversion from DeliveryConsumerStarted toArrowAssoc\[DeliveryConsumerStarted] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#actorPath:String "Permalink")  val actorPath: String
7. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#begin():Unit "Permalink") final  def begin(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesEvent → Event
9. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#commit():Unit "Permalink") final  def commit(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesEvent → Event
11. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#end():Unit "Permalink") final  def end(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesEvent → Event
12. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DeliveryConsumerStarted) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeliveryConsumerStartedImplicitThis member is added by an implicit conversion from DeliveryConsumerStarted toEnsuring\[DeliveryConsumerStarted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DeliveryConsumerStarted) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeliveryConsumerStartedImplicitThis member is added by an implicit conversion from DeliveryConsumerStarted toEnsuring\[DeliveryConsumerStarted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DeliveryConsumerStartedImplicitThis member is added by an implicit conversion from DeliveryConsumerStarted toEnsuring\[DeliveryConsumerStarted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DeliveryConsumerStartedImplicitThis member is added by an implicit conversion from DeliveryConsumerStarted toEnsuring\[DeliveryConsumerStarted] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#isEnabled():Boolean "Permalink") final  def isEnabled(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesEvent → Event
21. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#set(x$1:Int,x$2:Object):Unit "Permalink") final  def set(arg0: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), arg1: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesEvent → Event
26. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#shouldCommit():Boolean "Permalink") final  def shouldCommit(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesEvent → Event
27. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DeliveryConsumerStarted toStringFormat\[DeliveryConsumerStarted] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DeliveryConsumerStarted, B)ImplicitThis member is added by an implicit conversion from DeliveryConsumerStarted toArrowAssoc\[DeliveryConsumerStarted] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Event](https://docs.oracle.com/en/java/javase/11/docs/api/jdk.jfr/jdk/jfr/Event.html#jdk.jfr.Event)

### Inherited from [Event](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/jdk/internal/event/Event.html#jdk.internal.event.Event)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDeliveryConsumerStarted to any2stringadd\[DeliveryConsumerStarted]

### Inherited by implicit conversion StringFormat fromDeliveryConsumerStarted to StringFormat\[DeliveryConsumerStarted]

### Inherited by implicit conversion Ensuring fromDeliveryConsumerStarted to Ensuring\[DeliveryConsumerStarted]

### Inherited by implicit conversion ArrowAssoc fromDeliveryConsumerStarted to ArrowAssoc\[DeliveryConsumerStarted]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerChangedProducer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerCreated.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerDuplicate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerMissing.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerReceived.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerReceivedPreviousInProgress.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerReceivedResend.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerSentRequest.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerStashFull.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryProducerCreated.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryProducerReceived.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryProducerReceivedRequest.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryProducerReceivedResend.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryProducerRequestNext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryProducerResentFirst.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryProducerResentFirstUnconfirmed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryProducerResentUnconfirmed.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryProducerSent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryProducerStarted.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryProducerWaitingForRequest.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/internal/jfr/DeliveryConsumerStarted.html)*