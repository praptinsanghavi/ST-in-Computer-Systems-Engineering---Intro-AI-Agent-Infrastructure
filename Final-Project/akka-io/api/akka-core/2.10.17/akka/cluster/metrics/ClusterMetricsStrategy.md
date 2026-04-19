---
description: Akka 2.10.17 - akka.cluster.metrics.ClusterMetricsStrategy
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:21:56Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/metrics/ClusterMetricsStrategy.html
title: Akka 2.10.17 - akka.cluster.metrics.ClusterMetricsStrategy
---

# Akka 2.10.17 - akka.cluster.metrics.ClusterMetricsStrategy

> **Summary:** Akka 2.10.17 - akka.cluster.metrics.ClusterMetricsStrategy

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/metrics/index.html "Permalink")  package [metrics](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/metrics/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[metrics](index.html)
- [AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "A router group that performs load balancing of messages to cluster nodes based on cluster metric data.")
- [AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "A router pool that performs load balancing of messages to cluster nodes based on cluster metric data.")
- [AdaptiveLoadBalancingRoutingLogic](AdaptiveLoadBalancingRoutingLogic.html "Load balancing of messages to cluster nodes based on cluster metric data.")
- [CapacityMetricsSelector](CapacityMetricsSelector.html "A MetricsSelector producing weights from remaining capacity.")
- [ClusterMetricsChanged](ClusterMetricsChanged.html "Current snapshot of cluster node metrics.")
- [ClusterMetricsEvent](ClusterMetricsEvent.html "Local cluster metrics extension events.")
- [ClusterMetricsExtension](ClusterMetricsExtension.html "Cluster metrics extension.")
- [ClusterMetricsSettings](ClusterMetricsSettings.html "Metrics extension settings.")
- ClusterMetricsStrategy
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
[c](ClusterMetricsStrategy$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[metrics](index.html)

# [ClusterMetricsStrategy](ClusterMetricsStrategy$.html "See companion object")[**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html "Permalink")

### Companion [object ClusterMetricsStrategy](ClusterMetricsStrategy$.html "See companion object")

#### class ClusterMetricsStrategy extends [OneForOneStrategy](../../actor/OneForOneStrategy.html)

Default ClusterMetricsSupervisor strategy:
A configurable [akka.actor.OneForOneStrategy](../../actor/OneForOneStrategy.html) with restart\-on\-throwable decider.

Source[ClusterMetricsStrategy.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-metrics/src/main/scala/akka/cluster/metrics/ClusterMetricsStrategy.scala#L16)Linear Supertypes[OneForOneStrategy](../../actor/OneForOneStrategy.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [SupervisorStrategy](../../actor/SupervisorStrategy.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterMetricsStrategy
2. OneForOneStrategy
3. Serializable
4. Product
5. Equals
6. SupervisorStrategy
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

1. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#<init>(config:com.typesafe.config.Config):akka.cluster.metrics.ClusterMetricsStrategy "Permalink")  new ClusterMetricsStrategy(config: Config)
### Value Members

1. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterMetricsStrategy toany2stringadd\[ClusterMetricsStrategy] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterMetricsStrategy, B)ImplicitThis member is added by an implicit conversion from ClusterMetricsStrategy toArrowAssoc\[ClusterMetricsStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#decider:akka.actor.SupervisorStrategy.Decider "Permalink")  val decider: [Decider](../../actor/SupervisorStrategy$.html#Decider=PartialFunction[Throwable,akka.actor.SupervisorStrategy.Directive])Returns the Decider that is associated with this SupervisorStrategy.

Returns the Decider that is associated with this SupervisorStrategy.
The Decider is invoked by the default implementation of `handleFailure`
to obtain the Directive to be applied.

Definition Classes[OneForOneStrategy](../../actor/OneForOneStrategy.html) → [SupervisorStrategy](../../actor/SupervisorStrategy.html)
9. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterMetricsStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterMetricsStrategyImplicitThis member is added by an implicit conversion from ClusterMetricsStrategy toEnsuring\[ClusterMetricsStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterMetricsStrategy) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterMetricsStrategyImplicitThis member is added by an implicit conversion from ClusterMetricsStrategy toEnsuring\[ClusterMetricsStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterMetricsStrategyImplicitThis member is added by an implicit conversion from ClusterMetricsStrategy toEnsuring\[ClusterMetricsStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterMetricsStrategyImplicitThis member is added by an implicit conversion from ClusterMetricsStrategy toEnsuring\[ClusterMetricsStrategy] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#handleChildTerminated(context:akka.actor.ActorContext,child:akka.actor.ActorRef,children:Iterable[akka.actor.ActorRef]):Unit "Permalink")  def handleChildTerminated(context: [ActorContext](../../actor/ActorContext.html), child: [ActorRef](../../actor/ActorRef.html), children: Iterable\[[ActorRef](../../actor/ActorRef.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)This method is called after the child has been removed from the set of children.

This method is called after the child has been removed from the set of children.
It does not need to do anything special. Exceptions thrown from this method
do NOT make the actor fail if this happens during termination.

Definition Classes[OneForOneStrategy](../../actor/OneForOneStrategy.html) → [SupervisorStrategy](../../actor/SupervisorStrategy.html)
16. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#handleFailure(context:akka.actor.ActorContext,child:akka.actor.ActorRef,cause:Throwable,stats:akka.actor.ChildRestartStats,children:Iterable[akka.actor.ChildRestartStats]):Boolean "Permalink")  def handleFailure(context: [ActorContext](../../actor/ActorContext.html), child: [ActorRef](../../actor/ActorRef.html), cause: Throwable, stats: [ChildRestartStats](../../actor/ChildRestartStats.html), children: Iterable\[[ChildRestartStats](../../actor/ChildRestartStats.html)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)This is the main entry point: in case of a child’s failure, this method
must try to handle the failure by resuming, restarting or stopping the
child (and returning `true`), or it returns `false` to escalate the
failure, which will lead to this actor re\-throwing the exception which
caused the failure.

This is the main entry point: in case of a child’s failure, this method
must try to handle the failure by resuming, restarting or stopping the
child (and returning `true`), or it returns `false` to escalate the
failure, which will lead to this actor re\-throwing the exception which
caused the failure. The exception will not be wrapped.

This method calls [akka.actor.SupervisorStrategy\#logFailure](../../actor/SupervisorStrategy.html#logFailure(context:akka.actor.ActorContext,child:akka.actor.ActorRef,cause:Throwable,decision:akka.actor.SupervisorStrategy.Directive):Unit), which will
log the failure unless it is escalated. You can customize the logging by
setting [akka.actor.SupervisorStrategy\#loggingEnabled](../../actor/SupervisorStrategy.html#loggingEnabled:Boolean) to `false` and
do the logging inside the `decider` or override the `logFailure` method.

childrenis a lazy collection (a view)

Definition Classes[SupervisorStrategy](../../actor/SupervisorStrategy.html)
17. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#logFailure(context:akka.actor.ActorContext,child:akka.actor.ActorRef,cause:Throwable,decision:akka.actor.SupervisorStrategy.Directive):Unit "Permalink")  def logFailure(context: [ActorContext](../../actor/ActorContext.html), child: [ActorRef](../../actor/ActorRef.html), cause: Throwable, decision: [Directive](../../actor/SupervisorStrategy$$Directive.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Default logging of actor failures when
[akka.actor.SupervisorStrategy\#loggingEnabled](../../actor/SupervisorStrategy.html#loggingEnabled:Boolean) is `true`.

Default logging of actor failures when
[akka.actor.SupervisorStrategy\#loggingEnabled](../../actor/SupervisorStrategy.html#loggingEnabled:Boolean) is `true`.
`Escalate` failures are not logged here, since they are supposed
to be handled at a level higher up in the hierarchy.
`Resume` failures are logged at `Warning` level.
`Stop` and `Restart` failures are logged at `Error` level.

Definition Classes[SupervisorStrategy](../../actor/SupervisorStrategy.html)
19. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#loggingEnabled:Boolean "Permalink")  val loggingEnabled: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Logging of actor failures is done when this is `true`.

Logging of actor failures is done when this is `true`.

Definition Classes[OneForOneStrategy](../../actor/OneForOneStrategy.html) → [SupervisorStrategy](../../actor/SupervisorStrategy.html)
20. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#maxNrOfRetries:Int "Permalink")  val maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[OneForOneStrategy](../../actor/OneForOneStrategy.html)
21. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#processFailure(context:akka.actor.ActorContext,restart:Boolean,child:akka.actor.ActorRef,cause:Throwable,stats:akka.actor.ChildRestartStats,children:Iterable[akka.actor.ChildRestartStats]):Unit "Permalink")  def processFailure(context: [ActorContext](../../actor/ActorContext.html), restart: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), child: [ActorRef](../../actor/ActorRef.html), cause: Throwable, stats: [ChildRestartStats](../../actor/ChildRestartStats.html), children: Iterable\[[ChildRestartStats](../../actor/ChildRestartStats.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)This method is called to act on the failure of a child: restart if the flag is true, stop otherwise.

This method is called to act on the failure of a child: restart if the flag is true, stop otherwise.

Definition Classes[OneForOneStrategy](../../actor/OneForOneStrategy.html) → [SupervisorStrategy](../../actor/SupervisorStrategy.html)
25. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
26. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#restartChild(child:akka.actor.ActorRef,cause:Throwable,suspendFirst:Boolean):Unit "Permalink") final  def restartChild(child: [ActorRef](../../actor/ActorRef.html), cause: Throwable, suspendFirst: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Restart the given child, possibly suspending it first.

Restart the given child, possibly suspending it first.

**IMPORTANT:**

If the child is the currently failing one, it will already have been
suspended, hence `suspendFirst` must be false. If the child is not the
currently failing one, then it did not request this treatment and is
therefore not prepared to be resumed without prior suspend.

Definition Classes[SupervisorStrategy](../../actor/SupervisorStrategy.html)
27. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#resumeChild(child:akka.actor.ActorRef,cause:Throwable):Unit "Permalink") final  def resumeChild(child: [ActorRef](../../actor/ActorRef.html), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Resume the previously failed child: **do never apply this to a child which
is not the currently failing child**.

Resume the previously failed child: **do never apply this to a child which
is not the currently failing child**. Suspend/resume needs to be done in
matching pairs, otherwise actors will wake up too soon or never at all.

Definition Classes[SupervisorStrategy](../../actor/SupervisorStrategy.html)
28. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#withMaxNrOfRetries(maxNrOfRetries:Int):akka.actor.OneForOneStrategy "Permalink")  def withMaxNrOfRetries(maxNrOfRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [OneForOneStrategy](../../actor/OneForOneStrategy.html)Definition Classes[OneForOneStrategy](../../actor/OneForOneStrategy.html)
33. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#withinTimeRange:scala.concurrent.duration.Duration "Permalink")  val withinTimeRange: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Definition Classes[OneForOneStrategy](../../actor/OneForOneStrategy.html)
### Deprecated Value Members

1. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterMetricsStrategy toStringFormat\[ClusterMetricsStrategy] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/metrics/ClusterMetricsStrategy.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterMetricsStrategy, B)ImplicitThis member is added by an implicit conversion from ClusterMetricsStrategy toArrowAssoc\[ClusterMetricsStrategy] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [OneForOneStrategy](../../actor/OneForOneStrategy.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [SupervisorStrategy](../../actor/SupervisorStrategy.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterMetricsStrategy to any2stringadd\[ClusterMetricsStrategy]

### Inherited by implicit conversion StringFormat fromClusterMetricsStrategy to StringFormat\[ClusterMetricsStrategy]

### Inherited by implicit conversion Ensuring fromClusterMetricsStrategy to Ensuring\[ClusterMetricsStrategy]

### Inherited by implicit conversion ArrowAssoc fromClusterMetricsStrategy to ArrowAssoc\[ClusterMetricsStrategy]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ChildRestartStats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/OneForOneStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/SupervisorStrategy$$Directive.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/SupervisorStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsChanged.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsEvent.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsExtension$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsExtension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/CollectionControlMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/CollectionStartMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/CollectionStopMessage$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/CpuMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/DefaultSigarProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/EWMA$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/HeapMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/JmxMetricsCollector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/Metric$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/Metric.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/MetricsCollector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/MetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/MixMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/MixMetricsSelector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/MixMetricsSelectorBase.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/SigarMetricsCollector.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/SigarProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/SigarProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/StandardMetrics$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/SystemLoadAverageMetricsSelector$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsStrategy.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsStrategy.html)*