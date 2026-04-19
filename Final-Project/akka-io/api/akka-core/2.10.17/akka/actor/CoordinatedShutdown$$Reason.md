---
description: Akka 2.10.17 - akka.actor.CoordinatedShutdown.Reason
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:58:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/CoordinatedShutdown$$Reason.html
title: Akka 2.10.17 - akka.actor.CoordinatedShutdown.Reason
---

# Akka 2.10.17 - akka.actor.CoordinatedShutdown.Reason

> **Summary:** Akka 2.10.17 - akka.actor.CoordinatedShutdown.Reason

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/CoordinatedShutdown$.html "Permalink")  object [CoordinatedShutdown](CoordinatedShutdown$.html) extends [ExtensionId](ExtensionId.html)\[[CoordinatedShutdown](CoordinatedShutdown.html)] with [ExtensionIdProvider](ExtensionIdProvider.html)Definition Classes[actor](index.html)
- [ActorSystemTerminateReason](CoordinatedShutdown$$ActorSystemTerminateReason$.html "Scala API: The shutdown was initiated by ActorSystem.terminate.")
- [ClusterDowningReason](CoordinatedShutdown$$ClusterDowningReason$.html "Scala API: The shutdown was initiated by Cluster downing.")
- [ClusterJoinUnsuccessfulReason](CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html "Scala API: The shutdown was initiated by a failure to join a seed node.")
- [ClusterLeavingReason](CoordinatedShutdown$$ClusterLeavingReason$.html "Scala API: The shutdown was initiated by Cluster leaving.")
- [IncompatibleConfigurationDetectedReason](CoordinatedShutdown$$IncompatibleConfigurationDetectedReason$.html "Scala API: The shutdown was initiated by a configuration clash within the existing cluster and the joining node")
- [JvmExitReason](CoordinatedShutdown$$JvmExitReason$.html "Scala API: The shutdown was initiated by a JVM shutdown hook, e.g.")
- Reason
- [UnknownReason](CoordinatedShutdown$$UnknownReason$.html "Scala API: The reason for the shutdown was unknown.")
t[akka](../index.html).[actor](index.html).[CoordinatedShutdown](CoordinatedShutdown$.html)

# Reason[**](../../akka/actor/CoordinatedShutdown$$Reason.html "Permalink")

### 

#### trait Reason extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Reason for the shutdown, which can be used by tasks in case they need to do
different things depending on what caused the shutdown. There are some
predefined reasons, but external libraries applications may also define
other reasons.

Source[CoordinatedShutdown.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/CoordinatedShutdown.scala#L107)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ActorSystemTerminateReason](CoordinatedShutdown$$ActorSystemTerminateReason$.html), [ClusterDowningReason](CoordinatedShutdown$$ClusterDowningReason$.html), [ClusterJoinUnsuccessfulReason](CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html), [ClusterLeavingReason](CoordinatedShutdown$$ClusterLeavingReason$.html), [IncompatibleConfigurationDetectedReason](CoordinatedShutdown$$IncompatibleConfigurationDetectedReason$.html), [JvmExitReason](CoordinatedShutdown$$JvmExitReason$.html), [UnknownReason](CoordinatedShutdown$$UnknownReason$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Reason
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

1. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/CoordinatedShutdown$$Reason.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Reason toany2stringadd\[Reason] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Reason, B)ImplicitThis member is added by an implicit conversion from Reason toArrowAssoc\[Reason] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Reason) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReasonImplicitThis member is added by an implicit conversion from Reason toEnsuring\[Reason] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Reason) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReasonImplicitThis member is added by an implicit conversion from Reason toEnsuring\[Reason] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ReasonImplicitThis member is added by an implicit conversion from Reason toEnsuring\[Reason] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ReasonImplicitThis member is added by an implicit conversion from Reason toEnsuring\[Reason] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Reason toStringFormat\[Reason] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/CoordinatedShutdown$$Reason.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Reason, B)ImplicitThis member is added by an implicit conversion from Reason toArrowAssoc\[Reason] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromReason to any2stringadd\[Reason]

### Inherited by implicit conversion StringFormat fromReason to StringFormat\[Reason]

### Inherited by implicit conversion Ensuring fromReason to Ensuring\[Reason]

### Inherited by implicit conversion ArrowAssoc fromReason to ArrowAssoc\[Reason]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown$$ActorSystemTerminateReason$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown$$ClusterDowningReason$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown$$ClusterJoinUnsuccessfulReason$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown$$ClusterLeavingReason$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown$$IncompatibleConfigurationDetectedReason$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown$$JvmExitReason$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown$$Reason.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown$$UnknownReason$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown$$Reason.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/CoordinatedShutdown$$Reason.html)*