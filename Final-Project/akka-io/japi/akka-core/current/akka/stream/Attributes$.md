---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:00:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes$.html
title: Attributes$
---

# Attributes$

## Content

Package [akka.stream](package-summary.html)
## Class Attributes$

- java.lang.Object
- - akka.stream.Attributes$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Attributes$
extends java.lang.Object
implements java.io.Serializable
```

Note that more attributes for the [`Materializer`](Materializer.html "class in akka.stream") are defined in [`ActorAttributes`](ActorAttributes.html "class in akka.stream").

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.Attributes$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Attributes$](Attributes$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Attributes$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.List<[Attributes.Attribute](Attributes.Attribute.html "interface in akka.stream")>` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[apply](#apply())()` |  |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[apply](#apply(akka.stream.Attributes.Attribute))​([Attributes.Attribute](Attributes.Attribute.html "interface in akka.stream") attribute)` | INTERNAL API |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[apply](#apply(scala.collection.immutable.List))​(scala.collection.immutable.List<[Attributes.Attribute](Attributes.Attribute.html "interface in akka.stream")> attributeList)` |  |
	| `scala.collection.immutable.List<[Attributes.Attribute](Attributes.Attribute.html "interface in akka.stream")>` | `[apply$default$1](#apply$default$1())()` |  |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[asyncBoundary](#asyncBoundary())()` |  |
	| `akka.stream.Attributes.CancellationStrategy.Strategy` | `[cancellationStrategyAfterDelay](#cancellationStrategyAfterDelay(scala.concurrent.duration.FiniteDuration,akka.stream.Attributes.CancellationStrategy.Strategy))​(scala.concurrent.duration.FiniteDuration delay,  akka.stream.Attributes.CancellationStrategy.Strategy strategy)` | Java API |
	| `akka.stream.Attributes.CancellationStrategy.Strategy` | `[cancellationStrategyCompleteState](#cancellationStrategyCompleteState())()` | Java API |
	| `akka.stream.Attributes.CancellationStrategy.Strategy` | `[cancellationStrategyFailStage](#cancellationStrategyFailStage())()` | Java API |
	| `akka.stream.Attributes.CancellationStrategy.Strategy` | `[cancellationStrategyPropagateFailure](#cancellationStrategyPropagateFailure())()` | Java API |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[createLogLevels](#createLogLevels(akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement)` | Java API |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[createLogLevels](#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement,  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFinish,  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFailure)` | Java API |
	| `java.lang.String` | `[extractName](#extractName(akka.stream.impl.TraversalBuilder,java.lang.String))​(akka.stream.impl.TraversalBuilder builder,  java.lang.String default_)` | Compute a name by concatenating all Name attributes that the given module  has, returning the given default value if none are found. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[inputBuffer](#inputBuffer(int,int))​(int initial,  int max)` | Each asynchronous piece of a materialized stream topology is executed by one Actor  that manages an input buffer for all inlets of its shape. |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevelDebug](#logLevelDebug())()` | Java API: Use to enable logging at DEBUG level for certain operations when configuring [`Attributes.createLogLevels(akka.event.Logging.LogLevel, akka.event.Logging.LogLevel, akka.event.Logging.LogLevel)`](Attributes.html#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel)) |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevelError](#logLevelError())()` | Java API: Use to enable logging at ERROR level for certain operations when configuring [`Attributes.createLogLevels(akka.event.Logging.LogLevel, akka.event.Logging.LogLevel, akka.event.Logging.LogLevel)`](Attributes.html#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel)) |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevelInfo](#logLevelInfo())()` | Java API: Use to enable logging at INFO level for certain operations when configuring [`Attributes.createLogLevels(akka.event.Logging.LogLevel, akka.event.Logging.LogLevel, akka.event.Logging.LogLevel)`](Attributes.html#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel)) |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevelOff](#logLevelOff())()` | Java API: Use to disable logging on certain operations when configuring [`Attributes.createLogLevels(akka.event.Logging.LogLevel, akka.event.Logging.LogLevel, akka.event.Logging.LogLevel)`](Attributes.html#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel)) |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[logLevels](#logLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement,  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFinish,  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFailure)` | Configures `log()` operator log\-levels to be used when logging. |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevels$default$1](#logLevels$default$1())()` |  |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevels$default$2](#logLevels$default$2())()` |  |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevels$default$3](#logLevels$default$3())()` |  |
	| `[Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event")` | `[logLevelWarning](#logLevelWarning())()` | Java API: Use to enable logging at WARNING level for certain operations when configuring [`Attributes.createLogLevels(akka.event.Logging.LogLevel, akka.event.Logging.LogLevel, akka.event.Logging.LogLevel)`](Attributes.html#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel)) |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[name](#name(java.lang.String))​(java.lang.String name)` | Specifies the name of the operation. |
	| `[Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream")` | `[nestedMaterializationCancellationPolicyDefault](#nestedMaterializationCancellationPolicyDefault())()` | Default `NestedMaterializationCancellationPolicy`,  please see [`Attributes.nestedMaterializationCancellationPolicyEagerCancellation()`](Attributes.html#nestedMaterializationCancellationPolicyEagerCancellation()) for details. |
	| `[Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream")` | `[nestedMaterializationCancellationPolicyEagerCancellation](#nestedMaterializationCancellationPolicyEagerCancellation())()` | Java API  A `NestedMaterializationCancellationPolicy` that configures graph stages  delaying nested flow materialization to cancel immediately when downstream cancels before  nested flow materialization. |
	| `[Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream")` | `[nestedMaterializationCancellationPolicyPropagateToNested](#nestedMaterializationCancellationPolicyPropagateToNested())()` | Java API  A `NestedMaterializationCancellationPolicy` that configures graph stages  delaying nested flow materialization to delay cancellation when downstream cancels before  nested flow materialization. |
	| `[Attributes](Attributes.html "class in akka.stream")` | `[none](#none())()` | INTERNAL API |
	| `scala.Option<scala.collection.immutable.List<[Attributes.Attribute](Attributes.Attribute.html "interface in akka.stream")>>` | `[unapply](#unapply(akka.stream.Attributes))​([Attributes](Attributes.html "class in akka.stream") attrs)` | Deprecated. Use explicit methods on Attributes to interact, not the synthetic case class ones. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Attributes$](Attributes$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Attributes$
		
		
		
		```
		public Attributes$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public scala.collection.immutable.List<[Attributes.Attribute](Attributes.Attribute.html "interface in akka.stream")> $lessinit$greater$default$1()
		```
		- #### apply
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") apply()
		```
		- #### apply
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") apply​(scala.collection.immutable.List<[Attributes.Attribute](Attributes.Attribute.html "interface in akka.stream")> attributeList)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.List<[Attributes.Attribute](Attributes.Attribute.html "interface in akka.stream")>> unapply​([Attributes](Attributes.html "class in akka.stream") attrs)
		```
		
		Deprecated.
		Use explicit methods on Attributes to interact, not the synthetic case class ones. Since 2\.8\.0\.
		- #### cancellationStrategyCompleteState
		
		
		
		```
		public akka.stream.Attributes.CancellationStrategy.Strategy cancellationStrategyCompleteState()
		```
		
		Java API
		 
		 Strategy that treats `cancelStage` the same as `completeStage`, i.e. all inlets are cancelled (propagating the
		 cancellation cause) and all outlets are regularly completed.
		 
		
		
		 This used to be the default behavior before Akka 2\.6\.
		 
		
		
		 This behavior can be problematic in stacks of BidiFlows where different layers of the stack are both connected
		 through inputs and outputs. In this case, an error in a doubly connected component triggers both a cancellation
		 going upstream and an error going downstream. Since the stack might be connected to those components with inlets and
		 outlets, a race starts whether the cancellation or the error arrives first. If the error arrives first, that's usually
		 good because then the error can be propagated both on inlets and outlets. However, if the cancellation arrives first,
		 the previous default behavior to complete the stage will lead other outputs to be completed regularly. The error
		 which arrive late at the other hand will just be ignored (that connection will have been cancelled already and also
		 the paths through which the error could propagates are already shut down).
		- #### cancellationStrategyFailStage
		
		
		
		```
		public akka.stream.Attributes.CancellationStrategy.Strategy cancellationStrategyFailStage()
		```
		
		Java API
		 
		 Strategy that treats `cancelStage` the same as `failStage`, i.e. all inlets are cancelled (propagating the
		 cancellation cause) and all outlets are failed propagating the cause from cancellation.
		- #### cancellationStrategyPropagateFailure
		
		
		
		```
		public akka.stream.Attributes.CancellationStrategy.Strategy cancellationStrategyPropagateFailure()
		```
		
		Java API
		 
		 Strategy that treats `cancelStage` in different ways depending on the cause that was given to the cancellation.
		 
		
		
		 If the cause was a regular, active cancellation (`SubscriptionWithCancelException.NoMoreElementsNeeded`), the stage
		 receiving this cancellation is completed regularly.
		 
		
		
		 If another cause was given, this is treated as an error and the behavior is the same as with `failStage`.
		 
		
		
		 This is a good default strategy.
		- #### cancellationStrategyAfterDelay
		
		
		
		```
		public akka.stream.Attributes.CancellationStrategy.Strategy cancellationStrategyAfterDelay​(scala.concurrent.duration.FiniteDuration delay,
		                                                                                           akka.stream.Attributes.CancellationStrategy.Strategy strategy)
		```
		
		Java API
		 
		 Strategy that allows to delay any action when `cancelStage` is invoked.
		 
		
		
		 The idea of this strategy is to delay any action on cancellation because it is expected that the stage is completed
		 through another path in the meantime. The downside is that a stage and a stream may live longer than expected if no
		 such signal is received and cancellation is invoked later on. In streams with many stages that all apply this strategy,
		 this strategy might significantly delay the propagation of a cancellation signal because each upstream stage might impose
		 such a delay. During this time, the stream will be mostly "silent", i.e. it cannot make progress because of backpressure,
		 but you might still be able observe a long delay at the ultimate source.
		- #### nestedMaterializationCancellationPolicyEagerCancellation
		
		
		
		```
		public [Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") nestedMaterializationCancellationPolicyEagerCancellation()
		```
		
		Java API
		 A `NestedMaterializationCancellationPolicy` that configures graph stages
		 delaying nested flow materialization to cancel immediately when downstream cancels before
		 nested flow materialization.
		 This applies to `akka.stream.scaladsl.FlowOps.flatMapPrefix`, `akka.stream.scaladsl.Flow.futureFlow` and derived operators.
		- #### nestedMaterializationCancellationPolicyPropagateToNested
		
		
		
		```
		public [Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") nestedMaterializationCancellationPolicyPropagateToNested()
		```
		
		Java API
		 A `NestedMaterializationCancellationPolicy` that configures graph stages
		 delaying nested flow materialization to delay cancellation when downstream cancels before
		 nested flow materialization. Once the nested flow is materialized it will be cancelled immediately.
		 This applies to `akka.stream.scaladsl.FlowOps.flatMapPrefix`, `akka.stream.scaladsl.Flow.futureFlow` and derived operators.
		- #### nestedMaterializationCancellationPolicyDefault
		
		
		
		```
		public [Attributes.NestedMaterializationCancellationPolicy](Attributes.NestedMaterializationCancellationPolicy.html "class in akka.stream") nestedMaterializationCancellationPolicyDefault()
		```
		
		Default `NestedMaterializationCancellationPolicy`,
		 please see [`Attributes.nestedMaterializationCancellationPolicyEagerCancellation()`](Attributes.html#nestedMaterializationCancellationPolicyEagerCancellation()) for details.
		- #### logLevelOff
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevelOff()
		```
		
		Java API: Use to disable logging on certain operations when configuring [`Attributes.createLogLevels(akka.event.Logging.LogLevel, akka.event.Logging.LogLevel, akka.event.Logging.LogLevel)`](Attributes.html#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))
		- #### logLevelError
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevelError()
		```
		
		Java API: Use to enable logging at ERROR level for certain operations when configuring [`Attributes.createLogLevels(akka.event.Logging.LogLevel, akka.event.Logging.LogLevel, akka.event.Logging.LogLevel)`](Attributes.html#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))
		- #### logLevelWarning
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevelWarning()
		```
		
		Java API: Use to enable logging at WARNING level for certain operations when configuring [`Attributes.createLogLevels(akka.event.Logging.LogLevel, akka.event.Logging.LogLevel, akka.event.Logging.LogLevel)`](Attributes.html#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))
		- #### logLevelInfo
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevelInfo()
		```
		
		Java API: Use to enable logging at INFO level for certain operations when configuring [`Attributes.createLogLevels(akka.event.Logging.LogLevel, akka.event.Logging.LogLevel, akka.event.Logging.LogLevel)`](Attributes.html#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))
		- #### logLevelDebug
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevelDebug()
		```
		
		Java API: Use to enable logging at DEBUG level for certain operations when configuring [`Attributes.createLogLevels(akka.event.Logging.LogLevel, akka.event.Logging.LogLevel, akka.event.Logging.LogLevel)`](Attributes.html#createLogLevels(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))
		- #### apply
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") apply​([Attributes.Attribute](Attributes.Attribute.html "interface in akka.stream") attribute)
		```
		
		INTERNAL API
		- #### apply$default$1
		
		
		
		```
		public scala.collection.immutable.List<[Attributes.Attribute](Attributes.Attribute.html "interface in akka.stream")> apply$default$1()
		```
		- #### none
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") none()
		```
		
		INTERNAL API
		- #### asyncBoundary
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") asyncBoundary()
		```
		- #### name
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") name​(java.lang.String name)
		```
		
		Specifies the name of the operation.
		 If the name is null or empty the name is ignored, i.e. [`none()`](#none()) is returned.
		- #### inputBuffer
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") inputBuffer​(int initial,
		                              int max)
		```
		
		Each asynchronous piece of a materialized stream topology is executed by one Actor
		 that manages an input buffer for all inlets of its shape. This attribute configures
		 the initial and maximal input buffer in number of elements for each inlet.
		- #### createLogLevels
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") createLogLevels​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement,
		                                  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFinish,
		                                  [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFailure)
		```
		
		Java API
		 
		 Configures `log()` operator log\-levels to be used when logging.
		 Logging a certain operation can be completely disabled by using [`Attributes.logLevelOff()`](Attributes.html#logLevelOff()).
		- #### createLogLevels
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") createLogLevels​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement)
		```
		
		Java API
		 
		 Configures `log()` operator log\-levels to be used when logging onElement.
		 Logging a certain operation can be completely disabled by using [`Attributes.logLevelOff()`](Attributes.html#logLevelOff()).
		- #### logLevels
		
		
		
		```
		public [Attributes](Attributes.html "class in akka.stream") logLevels​([Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onElement,
		                            [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFinish,
		                            [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") onFailure)
		```
		
		Configures `log()` operator log\-levels to be used when logging.
		 Logging a certain operation can be completely disabled by using `LogLevels.Off`.
		 
		 See `Attributes.createLogLevels` for Java API
		- #### logLevels$default$1
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevels$default$1()
		```
		- #### logLevels$default$2
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevels$default$2()
		```
		- #### logLevels$default$3
		
		
		
		```
		public [Logging.LogLevel](../event/Logging.LogLevel.html "class in akka.event") logLevels$default$3()
		```
		- #### extractName
		
		
		
		```
		public java.lang.String extractName​(akka.stream.impl.TraversalBuilder builder,
		                                    java.lang.String default_)
		```
		
		Compute a name by concatenating all Name attributes that the given module
		 has, returning the given default value if none are found.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/ActorAttributes.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes.Attribute.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes.NestedMaterializationCancellationPolicy.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes$.html](https://doc.akka.io/japi/akka-core/current/akka/stream/Attributes$.html)*