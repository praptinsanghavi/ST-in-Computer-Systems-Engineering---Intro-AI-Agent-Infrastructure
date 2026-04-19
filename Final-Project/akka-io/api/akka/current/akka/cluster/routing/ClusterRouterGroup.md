---
description: Akka 2.10.17 - akka.cluster.routing.ClusterRouterGroup
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:02:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/routing/ClusterRouterGroup.html
title: Akka 2.10.17 - akka.cluster.routing.ClusterRouterGroup
---

# Akka 2.10.17 - akka.cluster.routing.ClusterRouterGroup

> **Summary:** Akka 2.10.17 - akka.cluster.routing.ClusterRouterGroup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/routing/index.html "Permalink")  package [routing](index.html)Definition Classes[cluster](../index.html)
- ClusterRouterGroup
- [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "totalInstances of cluster router must be > 0")
- [ClusterRouterPool](ClusterRouterPool.html "akka.routing.RouterConfig implementation for deployment on cluster nodes.")
- [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "totalInstances of cluster router must be > 0 maxInstancesPerNode of cluster router must be > 0 maxInstancesPerNode of cluster router must be 1 when routeesPath is defined")
c[akka](../../index.html).[cluster](../index.html).[routing](index.html)

# ClusterRouterGroup[**](../../../akka/cluster/routing/ClusterRouterGroup.html "Permalink")

### 

#### final  case class ClusterRouterGroup(local: [Group](../../routing/Group.html), settings: [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html)) extends [Group](../../routing/Group.html) with ClusterRouterConfigBase with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

[akka.routing.RouterConfig](../../routing/RouterConfig.html) implementation for deployment on cluster nodes.
Delegates other duties to the local [akka.routing.RouterConfig](../../routing/RouterConfig.html),
which makes it possible to mix this with the built\-in routers such as
[akka.routing.RoundRobinGroup](../../routing/RoundRobinGroup.html) or custom routers.

Annotations@SerialVersionUID() Source[ClusterRouterConfig.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/routing/ClusterRouterConfig.scala#L285)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), ClusterRouterConfigBase, [Group](../../routing/Group.html), [RouterConfig](../../routing/RouterConfig.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterRouterGroup
2. Product
3. Equals
4. ClusterRouterConfigBase
5. Group
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

1. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#<init>(local:akka.routing.Group,settings:akka.cluster.routing.ClusterRouterGroupSettings):akka.cluster.routing.ClusterRouterGroup "Permalink")  new ClusterRouterGroup(local: [Group](../../routing/Group.html), settings: [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html))
### Value Members

1. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/routing/ClusterRouterGroup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterRouterGroup toany2stringadd\[ClusterRouterGroup] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterRouterGroup, B)ImplicitThis member is added by an implicit conversion from ClusterRouterGroup toArrowAssoc\[ClusterRouterGroup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#createRouter(system:akka.actor.ActorSystem):akka.routing.Router "Permalink")  def createRouter(system: [ActorSystem](../../actor/ActorSystem.html)): [Router](../../routing/Router.html)Create the actual router, responsible for routing messages to routees.

Create the actual router, responsible for routing messages to routees.

systemthe ActorSystem this router belongs to

Definition ClassesClusterRouterConfigBase → [RouterConfig](../../routing/RouterConfig.html)
9. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterRouterGroup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterRouterGroupImplicitThis member is added by an implicit conversion from ClusterRouterGroup toEnsuring\[ClusterRouterGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterRouterGroup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterRouterGroupImplicitThis member is added by an implicit conversion from ClusterRouterGroup toEnsuring\[ClusterRouterGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterRouterGroupImplicitThis member is added by an implicit conversion from ClusterRouterGroup toEnsuring\[ClusterRouterGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterRouterGroupImplicitThis member is added by an implicit conversion from ClusterRouterGroup toEnsuring\[ClusterRouterGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#isManagementMessage(msg:Any):Boolean "Permalink")  def isManagementMessage(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Definition ClassesClusterRouterConfigBase → [RouterConfig](../../routing/RouterConfig.html)
17. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#local:akka.routing.Group "Permalink")  val local: [Group](../../routing/Group.html)Definition ClassesClusterRouterGroup → ClusterRouterConfigBase
18. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#paths(system:akka.actor.ActorSystem):scala.collection.immutable.Iterable[String] "Permalink")  def paths(system: [ActorSystem](../../actor/ActorSystem.html)): [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String]Definition ClassesClusterRouterGroup → [Group](../../routing/Group.html)
22. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#props():akka.actor.Props "Permalink")  def props(): [Props](../../actor/Props.html)[akka.actor.Props](../../actor/Props.html) for a group router based on the settings defined by
this instance.

[akka.actor.Props](../../actor/Props.html) for a group router based on the settings defined by
this instance.

Definition Classes[Group](../../routing/Group.html)
24. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#routerDispatcher:String "Permalink")  def routerDispatcher: StringDispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Dispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Definition ClassesClusterRouterConfigBase → [RouterConfig](../../routing/RouterConfig.html)
25. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props] "Permalink")  def routingLogicController(routingLogic: [RoutingLogic](../../routing/RoutingLogic.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Props](../../actor/Props.html)]Possibility to define an actor for controlling the routing
logic from external stimuli (e.g.

Possibility to define an actor for controlling the routing
logic from external stimuli (e.g. monitoring metrics).
This actor will be a child of the router "head" actor.
Management messages not handled by the "head" actor are
delegated to this controller actor.

Definition ClassesClusterRouterConfigBase → [RouterConfig](../../routing/RouterConfig.html)
26. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#settings:akka.cluster.routing.ClusterRouterGroupSettings "Permalink")  val settings: [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html)Definition ClassesClusterRouterGroup → ClusterRouterConfigBase
27. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#stopRouterWhenAllRouteesRemoved:Boolean "Permalink")  def stopRouterWhenAllRouteesRemoved: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesClusterRouterConfigBase → [RouterConfig](../../routing/RouterConfig.html)
28. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#verifyConfig(path:akka.actor.ActorPath):Unit "Permalink")  def verifyConfig(path: [ActorPath](../../actor/ActorPath.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that everything is there which is needed.

Check that everything is there which is needed. Called in constructor of RoutedActorRef to fail early.

Definition Classes[RouterConfig](../../routing/RouterConfig.html)
30. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#withFallback(other:akka.routing.RouterConfig):akka.routing.RouterConfig "Permalink")  def withFallback(other: [RouterConfig](../../routing/RouterConfig.html)): [RouterConfig](../../routing/RouterConfig.html)Overridable merge strategy, by default completely prefers `this` (i.e.

Overridable merge strategy, by default completely prefers `this` (i.e. no merge).

Definition ClassesClusterRouterGroup → [RouterConfig](../../routing/RouterConfig.html)
### Deprecated Value Members

1. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterRouterGroup toStringFormat\[ClusterRouterGroup] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/routing/ClusterRouterGroup.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterRouterGroup, B)ImplicitThis member is added by an implicit conversion from ClusterRouterGroup toArrowAssoc\[ClusterRouterGroup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from ClusterRouterConfigBase

### Inherited from [Group](../../routing/Group.html)

### Inherited from [RouterConfig](../../routing/RouterConfig.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterRouterGroup to any2stringadd\[ClusterRouterGroup]

### Inherited by implicit conversion StringFormat fromClusterRouterGroup to StringFormat\[ClusterRouterGroup]

### Inherited by implicit conversion Ensuring fromClusterRouterGroup to Ensuring\[ClusterRouterGroup]

### Inherited by implicit conversion ArrowAssoc fromClusterRouterGroup to ArrowAssoc\[ClusterRouterGroup]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Props.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroup.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroupSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroupSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterPool.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterPoolSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterPoolSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/routing/Group.html
- https://doc.akka.io/api/akka/current/akka/routing/RoundRobinGroup.html
- https://doc.akka.io/api/akka/current/akka/routing/Router.html
- https://doc.akka.io/api/akka/current/akka/routing/RouterConfig.html
- https://doc.akka.io/api/akka/current/akka/routing/RoutingLogic.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroup.html](https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroup.html)*