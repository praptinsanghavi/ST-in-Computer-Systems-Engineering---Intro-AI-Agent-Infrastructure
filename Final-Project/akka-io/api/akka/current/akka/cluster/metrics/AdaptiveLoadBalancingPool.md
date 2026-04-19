---
description: Akka 2.10.17 - akka.cluster.metrics.AdaptiveLoadBalancingPool
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:01:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
title: Akka 2.10.17 - akka.cluster.metrics.AdaptiveLoadBalancingPool
---

# Akka 2.10.17 - akka.cluster.metrics.AdaptiveLoadBalancingPool

> **Summary:** Akka 2.10.17 - akka.cluster.metrics.AdaptiveLoadBalancingPool

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[metrics](index.html)
- [AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "A router group that performs load balancing of messages to cluster nodes based on cluster metric data.")
- AdaptiveLoadBalancingPool
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

# AdaptiveLoadBalancingPool[**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html "Permalink")

### 

#### final  case class AdaptiveLoadBalancingPool(metricsSelector: [MetricsSelector](MetricsSelector.html) \= [MixMetricsSelector](MixMetricsSelector$.html), nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](../../index.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false) extends [Pool](../../routing/Pool.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

A router pool that performs load balancing of messages to cluster nodes based on
cluster metric data.

It uses random selection of routees based on probabilities derived from
the remaining capacity of corresponding node.

The configuration parameter trumps the constructor arguments. This means that
if you provide `nrOfInstances` during instantiation they will be ignored if
the router is defined in the configuration file for the actor being used.

### Supervision Setup

Any routees that are created by a router will be created as the router's children.
The router is therefore also the children's supervisor.

The supervision strategy of the router actor can be configured with
[\#withSupervisorStrategy](#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.cluster.metrics.AdaptiveLoadBalancingPool). If no strategy is provided, routers default to
a strategy of “always escalate”. This means that errors are passed up to the
router's supervisor for handling.

The router's supervisor will treat the error as an error with the router itself.
Therefore a directive to stop or restart will cause the router itself to stop or
restart. The router, in turn, will cause its children to stop and restart.

metricsSelectordecides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics

nrOfInstancesinitial number of routees in the pool

supervisorStrategystrategy for supervising the routees, see 'Supervision Setup'

routerDispatcherdispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages

Annotations@SerialVersionUID() Source[ClusterMetricsRouting.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/main/scala/akka/cluster/metrics/ClusterMetricsRouting.scala#L130)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Pool](../../routing/Pool.html), [RouterConfig](../../routing/RouterConfig.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AdaptiveLoadBalancingPool
2. Product
3. Equals
4. Pool
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

1. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#<init>(metricsSelector:akka.cluster.metrics.MetricsSelector,nr:Int):akka.cluster.metrics.AdaptiveLoadBalancingPool "Permalink")  new AdaptiveLoadBalancingPool(metricsSelector: [MetricsSelector](MetricsSelector.html), nr: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))Java API

Java API

metricsSelectordecides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics

nrinitial number of routees in the pool
2. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#<init>(config:com.typesafe.config.Config,dynamicAccess:akka.actor.DynamicAccess):akka.cluster.metrics.AdaptiveLoadBalancingPool "Permalink")  new AdaptiveLoadBalancingPool(config: Config, dynamicAccess: [DynamicAccess](../../actor/DynamicAccess.html))
3. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#<init>(metricsSelector:akka.cluster.metrics.MetricsSelector,nrOfInstances:Int,supervisorStrategy:akka.actor.SupervisorStrategy,routerDispatcher:String,usePoolDispatcher:Boolean):akka.cluster.metrics.AdaptiveLoadBalancingPool "Permalink")  new AdaptiveLoadBalancingPool(metricsSelector: [MetricsSelector](MetricsSelector.html) \= [MixMetricsSelector](MixMetricsSelector$.html), nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html) \= [Pool.defaultSupervisorStrategy](../../index.html), routerDispatcher: String \= [Dispatchers.DefaultDispatcherId](../../index.html), usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false)metricsSelectordecides what probability to use for selecting a routee, based
 on remaining capacity as indicated by the node metrics

nrOfInstancesinitial number of routees in the pool

supervisorStrategystrategy for supervising the routees, see 'Supervision Setup'

routerDispatcherdispatcher to use for the router head actor, which handles
 supervision, death watch and router management messages
### Value Members

1. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingPool toany2stringadd\[AdaptiveLoadBalancingPool] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AdaptiveLoadBalancingPool, B)ImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingPool toArrowAssoc\[AdaptiveLoadBalancingPool] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#createRouter(system:akka.actor.ActorSystem):akka.routing.Router "Permalink")  def createRouter(system: [ActorSystem](../../actor/ActorSystem.html)): [Router](../../routing/Router.html)Create the actual router, responsible for routing messages to routees.

Create the actual router, responsible for routing messages to routees.

systemthe ActorSystem this router belongs to

Definition ClassesAdaptiveLoadBalancingPool → [RouterConfig](../../routing/RouterConfig.html)
9. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AdaptiveLoadBalancingPool) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AdaptiveLoadBalancingPoolImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingPool toEnsuring\[AdaptiveLoadBalancingPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AdaptiveLoadBalancingPool) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AdaptiveLoadBalancingPoolImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingPool toEnsuring\[AdaptiveLoadBalancingPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AdaptiveLoadBalancingPoolImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingPool toEnsuring\[AdaptiveLoadBalancingPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AdaptiveLoadBalancingPoolImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingPool toEnsuring\[AdaptiveLoadBalancingPool] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#isManagementMessage(msg:Any):Boolean "Permalink")  def isManagementMessage(msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Is the message handled by the router head actor or the
[\#routingLogicController](#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props]) actor.

Definition Classes[RouterConfig](../../routing/RouterConfig.html)
17. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#metricsSelector:akka.cluster.metrics.MetricsSelector "Permalink")  val metricsSelector: [MetricsSelector](MetricsSelector.html)
18. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#nrOfInstances(sys:akka.actor.ActorSystem):Int "Permalink")  def nrOfInstances(sys: [ActorSystem](../../actor/ActorSystem.html)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAdaptiveLoadBalancingPool → [Pool](../../routing/Pool.html)
22. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#nrOfInstances:Int "Permalink")  val nrOfInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
23. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
24. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#props(routeeProps:akka.actor.Props):akka.actor.Props "Permalink")  def props(routeeProps: [Props](../../actor/Props.html)): [Props](../../actor/Props.html)[akka.actor.Props](../../actor/Props.html) for a pool router based on the settings defined by
this instance and the supplied [akka.actor.Props](../../actor/Props.html) for the routees created by the
router.

[akka.actor.Props](../../actor/Props.html) for a pool router based on the settings defined by
this instance and the supplied [akka.actor.Props](../../actor/Props.html) for the routees created by the
router.

Definition Classes[Pool](../../routing/Pool.html)
25. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#resizer:Option[akka.routing.Resizer] "Permalink")  def resizer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Resizer](../../routing/Resizer.html)]Pool with dynamically resizable number of routees return the [akka.routing.Resizer](../../routing/Resizer.html)
to use.

Pool with dynamically resizable number of routees return the [akka.routing.Resizer](../../routing/Resizer.html)
to use. The resizer is invoked once when the router is created, before any messages can
be sent to it. Resize is also triggered when messages are sent to the routees, and the
resizer is invoked asynchronously, i.e. not necessarily before the message has been sent.

Definition ClassesAdaptiveLoadBalancingPool → [Pool](../../routing/Pool.html)
26. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#routerDispatcher:String "Permalink")  val routerDispatcher: StringDispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Dispatcher ID to use for running the “head” actor, which handles
supervision, death watch and router management messages

Definition ClassesAdaptiveLoadBalancingPool → [RouterConfig](../../routing/RouterConfig.html)
27. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#routingLogicController(routingLogic:akka.routing.RoutingLogic):Option[akka.actor.Props] "Permalink")  def routingLogicController(routingLogic: [RoutingLogic](../../routing/RoutingLogic.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Props](../../actor/Props.html)]Possibility to define an actor for controlling the routing
logic from external stimuli (e.g.

Possibility to define an actor for controlling the routing
logic from external stimuli (e.g. monitoring metrics).
This actor will be a child of the router "head" actor.
Management messages not handled by the "head" actor are
delegated to this controller actor.

Definition ClassesAdaptiveLoadBalancingPool → [RouterConfig](../../routing/RouterConfig.html)
28. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#stopRouterWhenAllRouteesRemoved:Boolean "Permalink")  def stopRouterWhenAllRouteesRemoved: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Pool](../../routing/Pool.html) → [RouterConfig](../../routing/RouterConfig.html)
29. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#supervisorStrategy:akka.actor.SupervisorStrategy "Permalink")  val supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)SupervisorStrategy for the head actor, i.e.

SupervisorStrategy for the head actor, i.e. for supervising the routees of the pool.

Definition ClassesAdaptiveLoadBalancingPool → [Pool](../../routing/Pool.html)
30. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#usePoolDispatcher:Boolean "Permalink")  val usePoolDispatcher: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Use a dedicated dispatcher for the routees of the pool.

Use a dedicated dispatcher for the routees of the pool.
The dispatcher is defined in 'pool\-dispatcher' configuration property in the
deployment section of the router.

Definition ClassesAdaptiveLoadBalancingPool → [Pool](../../routing/Pool.html)
32. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#verifyConfig(path:akka.actor.ActorPath):Unit "Permalink")  def verifyConfig(path: [ActorPath](../../actor/ActorPath.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Check that everything is there which is needed.

Check that everything is there which is needed. Called in constructor of RoutedActorRef to fail early.

Definition Classes[RouterConfig](../../routing/RouterConfig.html)
33. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#withDispatcher(dispatcherId:String):akka.cluster.metrics.AdaptiveLoadBalancingPool "Permalink")  def withDispatcher(dispatcherId: String): AdaptiveLoadBalancingPoolSetting the dispatcher to be used for the router head actor, which handles
supervision, death watch and router management messages.
37. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#withFallback(other:akka.routing.RouterConfig):akka.routing.RouterConfig "Permalink")  def withFallback(other: [RouterConfig](../../routing/RouterConfig.html)): [RouterConfig](../../routing/RouterConfig.html)Uses the supervisor strategy of the given RouterConfig
if this RouterConfig doesn't have one

Uses the supervisor strategy of the given RouterConfig
if this RouterConfig doesn't have one

Definition ClassesAdaptiveLoadBalancingPool → [RouterConfig](../../routing/RouterConfig.html)
38. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#withSupervisorStrategy(strategy:akka.actor.SupervisorStrategy):akka.cluster.metrics.AdaptiveLoadBalancingPool "Permalink")  def withSupervisorStrategy(strategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)): AdaptiveLoadBalancingPoolSetting the supervisor strategy to be used for the “head” Router actor.
### Deprecated Value Members

1. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingPool toStringFormat\[AdaptiveLoadBalancingPool] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/metrics/AdaptiveLoadBalancingPool.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AdaptiveLoadBalancingPool, B)ImplicitThis member is added by an implicit conversion from AdaptiveLoadBalancingPool toArrowAssoc\[AdaptiveLoadBalancingPool] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Pool](../../routing/Pool.html)

### Inherited from [RouterConfig](../../routing/RouterConfig.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAdaptiveLoadBalancingPool to any2stringadd\[AdaptiveLoadBalancingPool]

### Inherited by implicit conversion StringFormat fromAdaptiveLoadBalancingPool to StringFormat\[AdaptiveLoadBalancingPool]

### Inherited by implicit conversion Ensuring fromAdaptiveLoadBalancingPool to Ensuring\[AdaptiveLoadBalancingPool]

### Inherited by implicit conversion ArrowAssoc fromAdaptiveLoadBalancingPool to ArrowAssoc\[AdaptiveLoadBalancingPool]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/DynamicAccess.html
- https://doc.akka.io/api/akka/current/akka/actor/Props.html
- https://doc.akka.io/api/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsChanged.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsEvent.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsExtension$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsExtension.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsStrategy$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/ClusterMetricsStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/CollectionControlMessage.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/CollectionStartMessage$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/CollectionStopMessage$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/CpuMetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/DefaultSigarProvider.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/EWMA$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/HeapMetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/JmxMetricsCollector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/Metric$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/Metric.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MetricsCollector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MixMetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MixMetricsSelector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/MixMetricsSelectorBase.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/SigarMetricsCollector.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/SigarProvider$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/SigarProvider.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/StandardMetrics$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/SystemLoadAverageMetricsSelector$.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/routing/Pool.html
- https://doc.akka.io/api/akka/current/akka/routing/Resizer.html
- https://doc.akka.io/api/akka/current/akka/routing/Router.html
- https://doc.akka.io/api/akka/current/akka/routing/RouterConfig.html
- https://doc.akka.io/api/akka/current/akka/routing/RoutingLogic.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingPool.html](https://doc.akka.io/api/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingPool.html)*