---
description: Akka 2.10.17 - akka.event.japi.SubchannelEventBus
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:25:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/japi/SubchannelEventBus.html
title: Akka 2.10.17 - akka.event.japi.SubchannelEventBus
---

# Akka 2.10.17 - akka.event.japi.SubchannelEventBus

> **Summary:** Akka 2.10.17 - akka.event.japi.SubchannelEventBus

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/event/index.html "Permalink")  package [event](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/event/japi/index.html "Permalink")  package [japi](index.html)Definition Classes[event](../index.html)
- [EventBus](EventBus.html "Java API: See documentation for akka.event.EventBus E is the Event type S is the Subscriber type C is the Classifier type")
- [LookupEventBus](LookupEventBus.html "Java API: See documentation for akka.event.LookupClassification E is the Event type S is the Subscriber type C is the Classifier type")
- [ManagedActorEventBus](ManagedActorEventBus.html "Java API: See documentation for akka.event.ManagedActorClassification An EventBus where the Subscribers are ActorRefs and the Classifier is ActorRef Means that ActorRefs \"listen\" to other ActorRefs E is the Event type")
- [ScanningEventBus](ScanningEventBus.html "Java API: See documentation for akka.event.ScanningClassification E is the Event type S is the Subscriber type C is the Classifier type")
- SubchannelEventBus
c[akka](../../index.html).[event](../index.html).[japi](index.html)

# SubchannelEventBus[**](../../../akka/event/japi/SubchannelEventBus.html "Permalink")

### 

#### abstract  class SubchannelEventBus\[E, S, C] extends [EventBus](EventBus.html)\[E, S, C]

Java API: See documentation for [akka.event.SubchannelClassification](../SubchannelClassification.html)
E is the Event type
S is the Subscriber type
C is the Classifier type

Source[EventBusJavaAPI.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/event/japi/EventBusJavaAPI.scala#L98)Linear Supertypes[EventBus](EventBus.html)\[E, S, C], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SubchannelEventBus
2. EventBus
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

1. [**](../../../akka/event/japi/SubchannelEventBus.html#<init>():akka.event.japi.SubchannelEventBus[E,S,C] "Permalink")  new SubchannelEventBus()
### Abstract Value Members

1. [**](../../../akka/event/japi/SubchannelEventBus.html#classify(event:E):C "Permalink") abstract  def classify(event: E): CReturns the Classifier associated with the given Event

Returns the Classifier associated with the given Event

Attributesprotected
2. [**](../../../akka/event/japi/SubchannelEventBus.html#publish(event:E,subscriber:S):Unit "Permalink") abstract  def publish(event: E, subscriber: S): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Publishes the given Event to the given Subscriber

Publishes the given Event to the given Subscriber

Attributesprotected
3. [**](../../../akka/event/japi/SubchannelEventBus.html#subclassification:akka.util.Subclassification[C] "Permalink") abstract  def subclassification: [Subclassification](../../util/Subclassification.html)\[C]The logic to form sub\-class hierarchy
### Concrete Value Members

1. [**](../../../akka/event/japi/SubchannelEventBus.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/event/japi/SubchannelEventBus.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/event/japi/SubchannelEventBus.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SubchannelEventBus\[E, S, C] toany2stringadd\[SubchannelEventBus\[E, S, C]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/event/japi/SubchannelEventBus.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SubchannelEventBus\[E, S, C], B)ImplicitThis member is added by an implicit conversion from SubchannelEventBus\[E, S, C] toArrowAssoc\[SubchannelEventBus\[E, S, C]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/event/japi/SubchannelEventBus.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/event/japi/SubchannelEventBus.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/event/japi/SubchannelEventBus.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/event/japi/SubchannelEventBus.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SubchannelEventBus\[E, S, C]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubchannelEventBus\[E, S, C]ImplicitThis member is added by an implicit conversion from SubchannelEventBus\[E, S, C] toEnsuring\[SubchannelEventBus\[E, S, C]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/event/japi/SubchannelEventBus.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SubchannelEventBus\[E, S, C]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubchannelEventBus\[E, S, C]ImplicitThis member is added by an implicit conversion from SubchannelEventBus\[E, S, C] toEnsuring\[SubchannelEventBus\[E, S, C]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/event/japi/SubchannelEventBus.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubchannelEventBus\[E, S, C]ImplicitThis member is added by an implicit conversion from SubchannelEventBus\[E, S, C] toEnsuring\[SubchannelEventBus\[E, S, C]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/event/japi/SubchannelEventBus.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubchannelEventBus\[E, S, C]ImplicitThis member is added by an implicit conversion from SubchannelEventBus\[E, S, C] toEnsuring\[SubchannelEventBus\[E, S, C]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/event/japi/SubchannelEventBus.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/event/japi/SubchannelEventBus.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/event/japi/SubchannelEventBus.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/event/japi/SubchannelEventBus.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/event/japi/SubchannelEventBus.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/event/japi/SubchannelEventBus.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/event/japi/SubchannelEventBus.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/event/japi/SubchannelEventBus.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/event/japi/SubchannelEventBus.html#publish(event:E):Unit "Permalink")  def publish(event: E): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Publishes the specified Event to this bus

Publishes the specified Event to this bus

Definition ClassesSubchannelEventBus → [EventBus](EventBus.html)
21. [**](../../../akka/event/japi/SubchannelEventBus.html#subscribe(subscriber:S,to:C):Boolean "Permalink")  def subscribe(subscriber: S, to: C): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attempts to register the subscriber to the specified Classifier

Attempts to register the subscriber to the specified Classifier

returnstrue if successful and false if not (because it was already subscribed to that Classifier, or otherwise)

Definition ClassesSubchannelEventBus → [EventBus](EventBus.html)
22. [**](../../../akka/event/japi/SubchannelEventBus.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/event/japi/SubchannelEventBus.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/event/japi/SubchannelEventBus.html#unsubscribe(subscriber:S):Unit "Permalink")  def unsubscribe(subscriber: S): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attempts to deregister the subscriber from all Classifiers it may be subscribed to

Attempts to deregister the subscriber from all Classifiers it may be subscribed to

Definition ClassesSubchannelEventBus → [EventBus](EventBus.html)
25. [**](../../../akka/event/japi/SubchannelEventBus.html#unsubscribe(subscriber:S,from:C):Boolean "Permalink")  def unsubscribe(subscriber: S, from: C): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attempts to deregister the subscriber from the specified Classifier

Attempts to deregister the subscriber from the specified Classifier

returnstrue if successful and false if not (because it wasn't subscribed to that Classifier, or otherwise)

Definition ClassesSubchannelEventBus → [EventBus](EventBus.html)
26. [**](../../../akka/event/japi/SubchannelEventBus.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/event/japi/SubchannelEventBus.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/event/japi/SubchannelEventBus.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/event/japi/SubchannelEventBus.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/event/japi/SubchannelEventBus.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SubchannelEventBus\[E, S, C] toStringFormat\[SubchannelEventBus\[E, S, C]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/event/japi/SubchannelEventBus.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SubchannelEventBus\[E, S, C], B)ImplicitThis member is added by an implicit conversion from SubchannelEventBus\[E, S, C] toArrowAssoc\[SubchannelEventBus\[E, S, C]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [EventBus](EventBus.html)\[E, S, C]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSubchannelEventBus\[E, S, C] to any2stringadd\[SubchannelEventBus\[E, S, C]]

### Inherited by implicit conversion StringFormat fromSubchannelEventBus\[E, S, C] to StringFormat\[SubchannelEventBus\[E, S, C]]

### Inherited by implicit conversion Ensuring fromSubchannelEventBus\[E, S, C] to Ensuring\[SubchannelEventBus\[E, S, C]]

### Inherited by implicit conversion ArrowAssoc fromSubchannelEventBus\[E, S, C] to ArrowAssoc\[SubchannelEventBus\[E, S, C]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/event/SubchannelClassification.html
- https://doc.akka.io/api/akka/current/akka/event/index.html
- https://doc.akka.io/api/akka/current/akka/event/japi/EventBus.html
- https://doc.akka.io/api/akka/current/akka/event/japi/LookupEventBus.html
- https://doc.akka.io/api/akka/current/akka/event/japi/ManagedActorEventBus.html
- https://doc.akka.io/api/akka/current/akka/event/japi/ScanningEventBus.html
- https://doc.akka.io/api/akka/current/akka/event/japi/SubchannelEventBus.html
- https://doc.akka.io/api/akka/current/akka/event/japi/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/util/Subclassification.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/event/japi/SubchannelEventBus.html](https://doc.akka.io/api/akka/current/akka/event/japi/SubchannelEventBus.html)*