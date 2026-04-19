---
description: Akka 2.10.17 - akka.cluster.metrics.AdaptiveLoadBalancingGroup
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:25:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
title: Akka 2.10.17 - akka.cluster.metrics.AdaptiveLoadBalancingGroup
---

# Akka 2.10.17 - akka.cluster.metrics.AdaptiveLoadBalancingGroup

> **Summary:** Akka 2.10.17 - akka.cluster.metrics.AdaptiveLoadBalancingGroup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[metrics](index.html)
- AdaptiveLoadBalancingGroup
- [AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "A router pool that performs load balancing of messages to cluster nodes based on cluster metric data.")
- [AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "Load balancing of messages to cluster nodes based on cluster metric data.")
- [CapacityMetricsSelector](CapacityMetricsSelector.html "A MetricsSelector producing weights from remaining capacity.")
- [ClusterMetricsChanged](ClusterMetricsChanged.html "Current snapshot of cluster node metrics.")
- [ClusterMetricsEvent](ClusterMetricsEvent.html "Local cluster metrics extension events.")
- [ClusterMetricsExtension](ClusterMetricsExtension.html "Cluster metrics extension.")
- [ClusterMetricsSettings](ClusterMetricsSettings.html "Metrics extension settings.")
- [ClusterMetricsStrategy](ClusterMetricsStrategy.html "Default ClusterMetricsSupervisor strategy: A configurable akka.actor.OneForOneStrategy with restart-on-throwable decider.")
- [CollectionControlMessage](CollectionControlMessage.html "Runtime collection management commands.")
- [CollectionStartMessage](CollectionStartMessage$.html "Command for ClusterMetricsSupervisor to start metrics collection.")
- [CollectionStopMessage](CollectionStopMessage$.html "Command for ClusterMetricsSupervisor to stop metrics collection.")
- [CpuMetricsSelector](CpuMetricsSelector$.html "MetricsSelector that uses the combined CPU time metrics and stolen CPU time metrics.")
- [DefaultSigarProvider](DefaultSigarProvider.html "Provide sigar instance as SigarProxy with configured location via ClusterMetricsSettings.")
- [EWMA](EWMA.html "The exponentially weighted moving average (EWMA) approach captures short-term movements in volatility for a conditional volatility forecasting model.")
- [HeapMetricsSelector](HeapMetricsSelector$.html "MetricsSelector that uses the heap metrics.")
- [JmxMetricsCollector](JmxMetricsCollector.html "Loads JVM and system metrics through JMX monitoring beans.")
- [Metric](Metric.html "Metrics key/value.")
- [MetricsCollector](MetricsCollector.html "Metrics sampler.")
- [MetricsSelector](MetricsSelector.html "A MetricsSelector is responsible for producing weights from the node metrics.")
- [MixMetricsSelector](MixMetricsSelector.html "MetricsSelector that combines other selectors and aggregates their capacity values.")
- [MixMetricsSelectorBase](MixMetricsSelectorBase.html "Base class for MetricsSelector that combines other selectors and aggregates their capacity.")
- [NodeMetrics](NodeMetrics.html "The snapshot of current sampled health metrics for any monitored process.")
- [SigarMetricsCollector](SigarMetricsCollector.html "Loads metrics through Hyperic SIGAR and JMX monitoring beans.")
- [SigarProvider](SigarProvider.html "Provide sigar instance as SigarProxy.")
- [StandardMetrics](StandardMetrics$.html "Definitions of the built-in standard metrics.")
- [SystemLoadAverageMetricsSelector](SystemLoadAverageMetricsSelector$.html "MetricsSelector that uses the system load average metrics.")
c[akka](../../index.html).[cluster](../index.html).[metrics](index.html)

# AdaptiveLoadBalancingGroup[**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html "Permalink")

### 

#### final  case class AdaptiveLoadBalancingGroup(metricsSelector: [MetricsSelector](MetricsSelector.html) \= [MixMetricsSelector](MixMetricsSelector$.html), paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String] \= Nil, routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../../index.html)) extends [Group](../../routing/Group.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

A router group that performs load balancing of messages to cluster nodes based on
cluster metric data.

It uses random selection of routees based on probabilities derived from
the remaining capacity of corresponding node.

The configuration parameter trumps the constructor arguments. This means that
if you provide `paths` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

metricsSelectordecides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics

pathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../../actor/ActorSelection.html) to these paths

routerDispatcherdispatcher to use for the router head actor, which handles
 router management messages

Annotations@SerialVersionUID() Source[ClusterMetricsRouting.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/main/scala/akka/cluster/metrics/ClusterMetricsRouting.scala#L215)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Group](../../routing/Group.html), [RouterConfig](../../routing/RouterConfig.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AdaptiveLoadBalancingGroup
2. Product
3. Equals
4. Group
5. RouterConfig
6. Serializable
7. AnyRef
8. Any
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

1. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#<init>(metricsSelector:akka.cluster.metrics.MetricsSelector,routeesPaths:Iterable[String]):akka.cluster.metrics.AdaptiveLoadBalancingGroup "Permalink")  new AdaptiveLoadBalancingGroup(metricsSelector: [MetricsSelector](MetricsSelector.html), routeesPaths: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String])Java API

Java API

metricsSelectordecides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics

routeesPathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../../actor/ActorSelection.html) to these paths
2. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#<init>(config:com.typesafe.config.Config,dynamicAccess:akka.actor.DynamicAccess):akka.cluster.metrics.AdaptiveLoadBalancingGroup "Permalink")  new AdaptiveLoadBalancingGroup(config: Config, dynamicAccess: [DynamicAccess](../../actor/DynamicAccess.html))
3. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#<init>(metricsSelector:akka.cluster.metrics.MetricsSelector,paths:scala.collection.immutable.Iterable[String],routerDispatcher:String):akka.cluster.metrics.AdaptiveLoadBalancingGroup "Permalink")  new AdaptiveLoadBalancingGroup(metricsSelector: [MetricsSelector](MetricsSelector.html) \= [MixMetricsSelector](MixMetricsSelector$.html), paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String] \= Nil, routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../../index.html))metricsSelectordecides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics

pathsstring representation of the actor paths of the routees, messages are
 sent with [akka.actor.ActorSelection](../../actor/ActorSelection.html) to these paths

routerDispatcherdispatcher to use for the router head actor, which handles
 router management messages
### Value Members

1. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingGroup toany2stringadd\[AdaptiveLoadBalancingGroup] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AdaptiveLoadBalancingGroup, B)ImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingGroup toArrowAssoc\[AdaptiveLoadBalancingGroup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#createRouter(system:akka.actor.ActorSystem):akka.routing.Router "Permalink")  def createRouter(system: [ActorSystem](../../actor/ActorSystem.html)): [Router](../../routing/Router.html)Create the actual router, responsible for routing messages to routees.

Create the actual router, responsible for routing messages to routees.

systemthe ActorSystem this router belongs to

Definition ClassesAdaptiveLoadBalancingGroup → [RouterConfig](../../routing/RouterConfig.html)
9. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AdaptiveLoadBalancingGroup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AdaptiveLoadBalancingGroupImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingGroup toEnsuring\[AdaptiveLoadBalancingGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AdaptiveLoadBalancingGroup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AdaptiveLoadBalancingGroupImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingGroup toEnsuring\[AdaptiveLoadBalancingGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AdaptiveLoadBalancingGroupImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingGroup toEnsuring\[AdaptiveLoadBalancingGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AdaptiveLoadBalancingGroupImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingGroup toEnsuring\[AdaptiveLoadBalancingGroup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#isManagementMessage(msg:Any):Boolean "Permalink")  def isManagementMessage(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Definition Classes[RouterConfig](../../routing/RouterConfig.html)
17. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#metricsSelector:akka.cluster.metrics.MetricsSelector "Permalink")  val metricsSelector: [MetricsSelector](MetricsSelector.html)
18. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#paths(system:akka.actor.ActorSystem):scala.collection.immutable.Iterable[String] "Permalink")  def paths(system: [ActorSystem](../../actor/ActorSystem.html)): [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String]Definition ClassesAdaptiveLoadBalancingGroup → [Group](../../routing/Group.html)
22. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#paths:scala.collection.immutable.Iterable[String] "Permalink")  val paths: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[String]
23. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
24. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#props():akka.actor.Props "Permalink")  def props(): [Props](../../actor/Props.html)[akka.actor.Props](../../actor/Props.html) for a group router based on the settings defined by
this instance.

[akka.actor.Props](../../actor/Props.html) for a group router based on the settings defined by
this instance.

Definition Classes[Group](../../routing/Group.html)
25. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#routerDispatcher:String "Permalink")  val routerDispatcher: StringDispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Dispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Definition ClassesAdaptiveLoadBalancingGroup → [RouterConfig](../../routing/RouterConfig.html)
26. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props] "Permalink")  def routingLogicController(routingLogic: [RoutingLogic](../../routing/RoutingLogic.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Props](../../actor/Props.html)]Possibility to define an actor for controlling the routing
logic from external stimuli (e.g.

Possibility to define an actor for controlling the routing
logic from external stimuli (e.g. monitoring metrics).
This actor will be a child of the router "head" actor.
Management messages not handled by the "head" actor are
delegated to this controller actor.

Definition ClassesAdaptiveLoadBalancingGroup → [RouterConfig](../../routing/RouterConfig.html)
27. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#stopRouterWhenAllRouteesRemoved:Boolean "Permalink")  def stopRouterWhenAllRouteesRemoved: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[RouterConfig](../../routing/RouterConfig.html)
28. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#verifyConfig(path:akka.actor.ActorPath):Unit "Permalink")  def verifyConfig(path: [ActorPath](../../actor/ActorPath.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that everything is there which is needed.

Check that everything is there which is needed. Called in constructor of RoutedActorRef to fail early.

Definition Classes[RouterConfig](../../routing/RouterConfig.html)
30. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#withDispatcher(dispatcherId:String):akka.cluster.metrics.AdaptiveLoadBalancingGroup "Permalink")  def withDispatcher(dispatcherId: String): AdaptiveLoadBalancingGroupSetting the dispatcher to be used for the router head actor, which handles
router management messages
34. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#withFallback(other:akka.routing.RouterConfig):akka.routing.RouterConfig "Permalink")  def withFallback(other: [RouterConfig](../../routing/RouterConfig.html)): [RouterConfig](../../routing/RouterConfig.html)Overridable merge strategy, by default completely prefers `this` (i.e.

Overridable merge strategy, by default completely prefers `this` (i.e. no merge).

Definition Classes[RouterConfig](../../routing/RouterConfig.html)
### Deprecated Value Members

1. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingGroup toStringFormat\[AdaptiveLoadBalancingGroup] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingGroup.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AdaptiveLoadBalancingGroup, B)ImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingGroup toArrowAssoc\[AdaptiveLoadBalancingGroup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Group](../../routing/Group.html)

### Inherited from [RouterConfig](../../routing/RouterConfig.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAdaptiveLoadBalancingGroup to any2stringadd\[AdaptiveLoadBalancingGroup]

### Inherited by implicit conversion StringFormat fromAdaptiveLoadBalancingGroup to StringFormat\[AdaptiveLoadBalancingGroup]

### Inherited by implicit conversion Ensuring fromAdaptiveLoadBalancingGroup to Ensuring\[AdaptiveLoadBalancingGroup]

### Inherited by implicit conversion ArrowAssoc fromAdaptiveLoadBalancingGroup to ArrowAssoc\[AdaptiveLoadBalancingGroup]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DynamicAccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsChanged.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsExtension$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsExtension.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/ClusterMetricsStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/CollectionControlMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/CollectionStartMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/CollectionStopMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/CpuMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/DefaultSigarProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/EWMA$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/HeapMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/JmxMetricsCollector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/Metric$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/Metric.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MetricsCollector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/MixMetricsSelectorBase.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/SigarMetricsCollector.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/SigarProvider$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/SigarProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/StandardMetrics$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/SystemLoadAverageMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Group.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html)*