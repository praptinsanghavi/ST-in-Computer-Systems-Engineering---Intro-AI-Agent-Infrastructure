---
description: Akka 2.10.17 - akka.cluster.routing.ClusterRouterPool
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:26:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/routing/ClusterRouterPool.html
title: Akka 2.10.17 - akka.cluster.routing.ClusterRouterPool
---

# Akka 2.10.17 - akka.cluster.routing.ClusterRouterPool

> **Summary:** Akka 2.10.17 - akka.cluster.routing.ClusterRouterPool

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/routing/index.html "Permalink")  package [routing](index.html)Definition Classes[cluster](../index.html)
- [ClusterRouterGroup](ClusterRouterGroup.html "akka.routing.RouterConfig implementation for deployment on cluster nodes.")
- [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "totalInstances of cluster router must be > 0")
- ClusterRouterPool
- [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "totalInstances of cluster router must be > 0 maxInstancesPerNode of cluster router must be > 0 maxInstancesPerNode of cluster router must be 1 when routeesPath is defined")
c[akka](../../index.html).[cluster](../index.html).[routing](index.html)

# ClusterRouterPool[**](../../../akka/cluster/routing/ClusterRouterPool.html "Permalink")

### 

#### final  case class ClusterRouterPool(local: [Pool](../../routing/Pool.html), settings: [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html)) extends [Pool](../../routing/Pool.html) with ClusterRouterConfigBase with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

[akka.routing.RouterConfig](../../routing/RouterConfig.html) implementation for deployment on cluster nodes.
Delegates other duties to the local [akka.routing.RouterConfig](../../routing/RouterConfig.html),
which makes it possible to mix this with the built\-in routers such as
[akka.routing.RoundRobinGroup](../../routing/RoundRobinGroup.html) or custom routers.

Annotations@SerialVersionUID() Source[ClusterRouterConfig.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/routing/ClusterRouterConfig.scala#L321)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), ClusterRouterConfigBase, [Pool](../../routing/Pool.html), [RouterConfig](../../routing/RouterConfig.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterRouterPool
2. Product
3. Equals
4. ClusterRouterConfigBase
5. Pool
6. RouterConfig
7. Serializable
8. AnyRef
9. Any
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

1. [**](../../../akka/cluster/routing/ClusterRouterPool.html#<init>(local:akka.routing.Pool,settings:akka.cluster.routing.ClusterRouterPoolSettings):akka.cluster.routing.ClusterRouterPool "Permalink")  new ClusterRouterPool(local: [Pool](../../routing/Pool.html), settings: [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html))
### Value Members

1. [**](../../../akka/cluster/routing/ClusterRouterPool.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/routing/ClusterRouterPool.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/routing/ClusterRouterPool.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterRouterPool toany2stringadd\[ClusterRouterPool] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/routing/ClusterRouterPool.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterRouterPool, B)ImplicitThis member is added by an implicit conversion from ClusterRouterPool toArrowAssoc\[ClusterRouterPool] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/routing/ClusterRouterPool.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/routing/ClusterRouterPool.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/routing/ClusterRouterPool.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/routing/ClusterRouterPool.html#createRouter(system:akka.actor.ActorSystem):akka.routing.Router "Permalink")  def createRouter(system: [ActorSystem](../../actor/ActorSystem.html)): [Router](../../routing/Router.html)Create the actual router, responsible for routing messages to routees.

Create the actual router, responsible for routing messages to routees.

systemthe ActorSystem this router belongs to

Definition ClassesClusterRouterConfigBase → [RouterConfig](../../routing/RouterConfig.html)
9. [**](../../../akka/cluster/routing/ClusterRouterPool.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterRouterPool) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterRouterPoolImplicitThis member is added by an implicit conversion from ClusterRouterPool toEnsuring\[ClusterRouterPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/routing/ClusterRouterPool.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterRouterPool) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterRouterPoolImplicitThis member is added by an implicit conversion from ClusterRouterPool toEnsuring\[ClusterRouterPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/routing/ClusterRouterPool.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterRouterPoolImplicitThis member is added by an implicit conversion from ClusterRouterPool toEnsuring\[ClusterRouterPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/routing/ClusterRouterPool.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterRouterPoolImplicitThis member is added by an implicit conversion from ClusterRouterPool toEnsuring\[ClusterRouterPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/routing/ClusterRouterPool.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/routing/ClusterRouterPool.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/routing/ClusterRouterPool.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/cluster/routing/ClusterRouterPool.html#isManagementMessage(msg:Any):Boolean "Permalink")  def isManagementMessage(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Definition ClassesClusterRouterConfigBase → [RouterConfig](../../routing/RouterConfig.html)
17. [**](../../../akka/cluster/routing/ClusterRouterPool.html#local:akka.routing.Pool "Permalink")  val local: [Pool](../../routing/Pool.html)Definition ClassesClusterRouterPool → ClusterRouterConfigBase
18. [**](../../../akka/cluster/routing/ClusterRouterPool.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/routing/ClusterRouterPool.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/routing/ClusterRouterPool.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/routing/ClusterRouterPool.html#nrOfInstances(sys:akka.actor.ActorSystem):Int "Permalink")  def nrOfInstances(sys: [ActorSystem](../../actor/ActorSystem.html)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Initial number of routee instances

Initial number of routee instances

Definition ClassesClusterRouterPool → [Pool](../../routing/Pool.html)
22. [**](../../../akka/cluster/routing/ClusterRouterPool.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../../akka/cluster/routing/ClusterRouterPool.html#props(routeeProps:akka.actor.Props):akka.actor.Props "Permalink")  def props(routeeProps: [Props](../../actor/Props.html)): [Props](../../actor/Props.html)[akka.actor.Props](../../actor/Props.html) for a pool router based on the settings defined by
this instance and the supplied [akka.actor.Props](../../actor/Props.html) for the routees created by the
router.

[akka.actor.Props](../../actor/Props.html) for a pool router based on the settings defined by
this instance and the supplied [akka.actor.Props](../../actor/Props.html) for the routees created by the
router.

Definition Classes[Pool](../../routing/Pool.html)
24. [**](../../../akka/cluster/routing/ClusterRouterPool.html#resizer:Option[akka.routing.Resizer] "Permalink")  def resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](../../routing/Resizer.html)]Pool with dynamically resizable number of routees return the [akka.routing.Resizer](../../routing/Resizer.html)
to use.

Pool with dynamically resizable number of routees return the [akka.routing.Resizer](../../routing/Resizer.html)
to use. The resizer is invoked once when the router is created, before any messages can
be sent to it. Resize is also triggered when messages are sent to the routees, and the
resizer is invoked asynchronously, i.e. not necessarily before the message has been sent.

Definition ClassesClusterRouterPool → [Pool](../../routing/Pool.html)
25. [**](../../../akka/cluster/routing/ClusterRouterPool.html#routerDispatcher:String "Permalink")  def routerDispatcher: StringDispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Dispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Definition ClassesClusterRouterConfigBase → [RouterConfig](../../routing/RouterConfig.html)
26. [**](../../../akka/cluster/routing/ClusterRouterPool.html#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props] "Permalink")  def routingLogicController(routingLogic: [RoutingLogic](../../routing/RoutingLogic.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Props](../../actor/Props.html)]Possibility to define an actor for controlling the routing
logic from external stimuli (e.g.

Possibility to define an actor for controlling the routing
logic from external stimuli (e.g. monitoring metrics).
This actor will be a child of the router "head" actor.
Management messages not handled by the "head" actor are
delegated to this controller actor.

Definition ClassesClusterRouterConfigBase → [RouterConfig](../../routing/RouterConfig.html)
27. [**](../../../akka/cluster/routing/ClusterRouterPool.html#settings:akka.cluster.routing.ClusterRouterPoolSettings "Permalink")  val settings: [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html)Definition ClassesClusterRouterPool → ClusterRouterConfigBase
28. [**](../../../akka/cluster/routing/ClusterRouterPool.html#stopRouterWhenAllRouteesRemoved:Boolean "Permalink")  def stopRouterWhenAllRouteesRemoved: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesClusterRouterConfigBase → [RouterConfig](../../routing/RouterConfig.html)
29. [**](../../../akka/cluster/routing/ClusterRouterPool.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  def supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)SupervisorStrategy for the head actor, i.e.

SupervisorStrategy for the head actor, i.e. for supervising the routees of the pool.

Definition ClassesClusterRouterPool → [Pool](../../routing/Pool.html)
30. [**](../../../akka/cluster/routing/ClusterRouterPool.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../akka/cluster/routing/ClusterRouterPool.html#usePoolDispatcher:Boolean "Permalink")  def usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Use a dedicated dispatcher for the routees of the pool.

Use a dedicated dispatcher for the routees of the pool.
The dispatcher is defined in 'pool\-dispatcher' configuration property in the
deployment section of the router.

Definition Classes[Pool](../../routing/Pool.html)
32. [**](../../../akka/cluster/routing/ClusterRouterPool.html#verifyConfig(path:akka.actor.ActorPath):Unit "Permalink")  def verifyConfig(path: [ActorPath](../../actor/ActorPath.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that everything is there which is needed.

Check that everything is there which is needed. Called in constructor of RoutedActorRef to fail early.

Definition Classes[RouterConfig](../../routing/RouterConfig.html)
33. [**](../../../akka/cluster/routing/ClusterRouterPool.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/cluster/routing/ClusterRouterPool.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/cluster/routing/ClusterRouterPool.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../akka/cluster/routing/ClusterRouterPool.html#withFallback(other:akka.routing.RouterConfig):akka.routing.RouterConfig "Permalink")  def withFallback(other: [RouterConfig](../../routing/RouterConfig.html)): [RouterConfig](../../routing/RouterConfig.html)Overridable merge strategy, by default completely prefers `this` (i.e.

Overridable merge strategy, by default completely prefers `this` (i.e. no merge).

Definition ClassesClusterRouterPool → [RouterConfig](../../routing/RouterConfig.html)
### Deprecated Value Members

1. [**](../../../akka/cluster/routing/ClusterRouterPool.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/routing/ClusterRouterPool.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterRouterPool toStringFormat\[ClusterRouterPool] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/routing/ClusterRouterPool.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterRouterPool, B)ImplicitThis member is added by an implicit conversion from ClusterRouterPool toArrowAssoc\[ClusterRouterPool] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from ClusterRouterConfigBase

### Inherited from [Pool](../../routing/Pool.html)

### Inherited from [RouterConfig](../../routing/RouterConfig.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterRouterPool to any2stringadd\[ClusterRouterPool]

### Inherited by implicit conversion StringFormat fromClusterRouterPool to StringFormat\[ClusterRouterPool]

### Inherited by implicit conversion Ensuring fromClusterRouterPool to Ensuring\[ClusterRouterPool]

### Inherited by implicit conversion ArrowAssoc fromClusterRouterPool to ArrowAssoc\[ClusterRouterPool]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterGroup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterGroupSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterGroupSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Pool.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Resizer.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RoundRobinGroup.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterPool.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterPool.html)*