---
description: Akka 2.10.17 - akka.cluster.typed.SingletonActor
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:15Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/typed/SingletonActor.html
title: Akka 2.10.17 - akka.cluster.typed.SingletonActor
---

# Akka 2.10.17 - akka.cluster.typed.SingletonActor

> **Summary:** Akka 2.10.17 - akka.cluster.typed.SingletonActor

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/typed/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[typed](index.html)
- [Cluster](Cluster.html "This class is not intended for user extension other than for test purposes (e.g.")
- [ClusterCommand](ClusterCommand.html "Not intended for user extension.")
- [ClusterSetup](ClusterSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the Cluster extension.")
- [ClusterSingleton](ClusterSingleton.html "This class is not intended for user extension other than for test purposes (e.g.")
- [ClusterSingletonManagerSettings](ClusterSingletonManagerSettings.html)
- [ClusterSingletonSettings](ClusterSingletonSettings.html)
- [ClusterSingletonSetup](ClusterSingletonSetup.html "Can be used in akka.actor.setup.ActorSystemSetup when starting the ActorSystem to replace the default implementation of the ClusterSingleton extension.")
- [ClusterStateSubscription](ClusterStateSubscription.html "Messages for subscribing to changes in the cluster state")
- [Down](Down.html "Send command to DOWN the node specified by 'address'.")
- [GetCurrentState](GetCurrentState.html)
- [Join](Join.html "Try to join this cluster node with the node specified by 'address'.")
- [JoinSeedNodes](JoinSeedNodes.html "Scala API: Join the specified seed nodes without defining them in config.")
- [Leave](Leave.html "Send command to issue state transition to LEAVING for the node specified by 'address'.")
- [PrepareForFullClusterShutdown](PrepareForFullClusterShutdown.html "Initiate a full cluster shutdown.")
- [SelfRemoved](SelfRemoved.html "Subscribe to this node being removed from the cluster.")
- [SelfUp](SelfUp.html "Subscribe to this node being up, after sending this event the subscription is automatically cancelled.")
- [SetAppVersionLater](SetAppVersionLater.html "Scala API: If the appVersion is read from an external system (e.g.")
- SingletonActor
- [Subscribe](Subscribe.html "Subscribe to cluster state changes.")
- [Unsubscribe](Unsubscribe.html)
[c](SingletonActor$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[typed](index.html)

# [SingletonActor](SingletonActor$.html "See companion object")[**](../../../akka/cluster/typed/SingletonActor.html "Permalink")

### Companion [object SingletonActor](SingletonActor$.html "See companion object")

#### final  class SingletonActor\[M] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[ClusterSingleton.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/typed/ClusterSingleton.scala#L184)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SingletonActor
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

1. [**](../../../akka/cluster/typed/SingletonActor.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/typed/SingletonActor.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/typed/SingletonActor.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SingletonActor\[M] toany2stringadd\[SingletonActor\[M]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/typed/SingletonActor.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SingletonActor\[M], B)ImplicitThis member is added by an implicit conversion from SingletonActor\[M] toArrowAssoc\[SingletonActor\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/typed/SingletonActor.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/typed/SingletonActor.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/typed/SingletonActor.html#behavior:akka.actor.typed.Behavior[M] "Permalink")  val behavior: [Behavior](../../actor/typed/Behavior.html)\[M]
8. [**](../../../akka/cluster/typed/SingletonActor.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/typed/SingletonActor.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SingletonActor\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SingletonActor\[M]ImplicitThis member is added by an implicit conversion from SingletonActor\[M] toEnsuring\[SingletonActor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/typed/SingletonActor.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SingletonActor\[M]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SingletonActor\[M]ImplicitThis member is added by an implicit conversion from SingletonActor\[M] toEnsuring\[SingletonActor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/typed/SingletonActor.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SingletonActor\[M]ImplicitThis member is added by an implicit conversion from SingletonActor\[M] toEnsuring\[SingletonActor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/typed/SingletonActor.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SingletonActor\[M]ImplicitThis member is added by an implicit conversion from SingletonActor\[M] toEnsuring\[SingletonActor\[M]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/typed/SingletonActor.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/typed/SingletonActor.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/cluster/typed/SingletonActor.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/typed/SingletonActor.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/typed/SingletonActor.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/cluster/typed/SingletonActor.html#name:String "Permalink")  val name: String
19. [**](../../../akka/cluster/typed/SingletonActor.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/cluster/typed/SingletonActor.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/typed/SingletonActor.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/typed/SingletonActor.html#props:akka.actor.typed.Props "Permalink")  val props: [Props](../../actor/typed/Props.html)
23. [**](../../../akka/cluster/typed/SingletonActor.html#settings:Option[akka.cluster.typed.ClusterSingletonSettings] "Permalink")  val settings: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ClusterSingletonSettings](ClusterSingletonSettings.html)]
24. [**](../../../akka/cluster/typed/SingletonActor.html#stopMessage:Option[M] "Permalink")  val stopMessage: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[M]
25. [**](../../../akka/cluster/typed/SingletonActor.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../akka/cluster/typed/SingletonActor.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../akka/cluster/typed/SingletonActor.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/cluster/typed/SingletonActor.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../akka/cluster/typed/SingletonActor.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/cluster/typed/SingletonActor.html#withProps(props:akka.actor.typed.Props):akka.cluster.typed.SingletonActor[M] "Permalink")  def withProps(props: [Props](../../actor/typed/Props.html)): SingletonActor\[M][akka.actor.typed.Props](../../actor/typed/Props.html) of the singleton actor, such as dispatcher settings.
31. [**](../../../akka/cluster/typed/SingletonActor.html#withSettings(settings:akka.cluster.typed.ClusterSingletonSettings):akka.cluster.typed.SingletonActor[M] "Permalink")  def withSettings(settings: [ClusterSingletonSettings](ClusterSingletonSettings.html)): SingletonActor\[M]Additional settings, typically loaded from configuration.
32. [**](../../../akka/cluster/typed/SingletonActor.html#withStopMessage(msg:M):akka.cluster.typed.SingletonActor[M] "Permalink")  def withStopMessage(msg: M): SingletonActor\[M]Message sent to the singleton to tell it to stop, e.g.

Message sent to the singleton to tell it to stop, e.g. when being migrated.
If this is not defined it will be stopped automatically.
It can be useful to define a custom stop message if the singleton needs to perform
some asynchronous cleanup or interactions before stopping.
### Deprecated Value Members

1. [**](../../../akka/cluster/typed/SingletonActor.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/typed/SingletonActor.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SingletonActor\[M] toStringFormat\[SingletonActor\[M]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/typed/SingletonActor.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SingletonActor\[M], B)ImplicitThis member is added by an implicit conversion from SingletonActor\[M] toArrowAssoc\[SingletonActor\[M]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSingletonActor\[M] to any2stringadd\[SingletonActor\[M]]

### Inherited by implicit conversion StringFormat fromSingletonActor\[M] to StringFormat\[SingletonActor\[M]]

### Inherited by implicit conversion Ensuring fromSingletonActor\[M] to Ensuring\[SingletonActor\[M]]

### Inherited by implicit conversion ArrowAssoc fromSingletonActor\[M] to ArrowAssoc\[SingletonActor\[M]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Cluster$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Cluster.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterCommand.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingleton$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingleton.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonManagerSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonManagerSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Down.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/GetCurrentState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Join$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Join.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/JoinSeedNodes.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Leave$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Leave.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/PrepareForFullClusterShutdown$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/PrepareForFullClusterShutdown.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SelfRemoved.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SelfUp.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SetAppVersionLater$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SetAppVersionLater.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SingletonActor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SingletonActor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Subscribe$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Subscribe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SingletonActor.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/SingletonActor.html)*