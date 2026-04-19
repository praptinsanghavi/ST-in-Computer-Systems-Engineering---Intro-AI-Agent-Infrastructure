---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:46:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/ActorMaterializerSettings.html
title: ActorMaterializerSettings
---

# ActorMaterializerSettings

## Content

Package [akka.stream](package-summary.html)
## Class ActorMaterializerSettings

- java.lang.Object
- - akka.stream.ActorMaterializerSettings

- ---

```
public final class ActorMaterializerSettings
extends java.lang.Object
```

This class describes the configurable properties of the [`ActorMaterializer`](ActorMaterializer.html "class in akka.stream").
 Please refer to the `withX` methods for descriptions of the individual settings.
 
 The constructor is not public API, use create or apply on the [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") companion instead.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorMaterializerSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[apply](#apply(int,int,java.lang.String,scala.Function1,akka.stream.StreamSubscriptionTimeoutSettings,boolean,int,boolean,boolean,int))​(int initialInputBufferSize,  int maxInputBufferSize,  java.lang.String dispatcher,  scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> supervisionDecider,  [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") subscriptionTimeoutSettings,  boolean debugLogging,  int outputBurstLimit,  boolean fuzzingMode,  boolean autoFusing,  int maxFixedBufferSize)` | Deprecated. Use config or attributes to configure the materializer. |
	| `static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use config or attributes to configure the materializer. |
	| `static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use config or attributes to configure the materializer. |
	| `boolean` | `[autoFusing](#autoFusing())()` | Deprecated. No longer has any effect. |
	| `java.lang.String` | `[blockingIoDispatcher](#blockingIoDispatcher())()` | Deprecated. Use attribute 'ActorAttributes.BlockingIoDispatcher' to read the concrete setting value. |
	| `static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[create](#create(int,int,java.lang.String,scala.Function1,akka.stream.StreamSubscriptionTimeoutSettings,boolean,int,boolean,boolean,int))​(int initialInputBufferSize,  int maxInputBufferSize,  java.lang.String dispatcher,  scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> supervisionDecider,  [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") subscriptionTimeoutSettings,  boolean debugLogging,  int outputBurstLimit,  boolean fuzzingMode,  boolean autoFusing,  int maxFixedBufferSize)` | Deprecated. Use config or attributes to configure the materializer. |
	| `static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use config or attributes to configure the materializer. |
	| `static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use config or attributes to configure the materializer. |
	| `boolean` | `[debugLogging](#debugLogging())()` | Deprecated. Use attribute 'ActorAttributes.DebugLogging' to read the concrete setting value. |
	| `java.lang.String` | `[dispatcher](#dispatcher())()` | Deprecated. Use attribute 'ActorAttributes.Dispatcher' to read the concrete setting value. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `boolean` | `[fuzzingMode](#fuzzingMode())()` | Deprecated. Use attribute 'ActorAttributes.FuzzingMode' to read the concrete setting value. |
	| `int` | `[initialInputBufferSize](#initialInputBufferSize())()` | Deprecated. Use attribute 'Attributes.InputBuffer' to read the concrete setting value. |
	| `[IOSettings](IOSettings.html "class in akka.stream")` | `[ioSettings](#ioSettings())()` |  |
	| `int` | `[maxFixedBufferSize](#maxFixedBufferSize())()` | Deprecated. Use attribute 'ActorAttributes.MaxFixedBufferSize' to read the concrete setting value. |
	| `int` | `[maxInputBufferSize](#maxInputBufferSize())()` | Deprecated. Use attribute 'Attributes.InputBuffer' to read the concrete setting value. |
	| `int` | `[outputBurstLimit](#outputBurstLimit())()` | Deprecated. Use attribute 'ActorAttributes.OutputBurstLimit' to read the concrete setting value. |
	| `[StreamRefSettings](StreamRefSettings.html "interface in akka.stream")` | `[streamRefSettings](#streamRefSettings())()` |  |
	| `[StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream")` | `[subscriptionTimeoutSettings](#subscriptionTimeoutSettings())()` |  |
	| `scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")>` | `[supervisionDecider](#supervisionDecider())()` | Deprecated. Use attribute 'ActorAttributes.SupervisionStrategy' to read the concrete setting value. |
	| `int` | `[syncProcessingLimit](#syncProcessingLimit())()` | Deprecated. Use attribute 'ActorAttributes.SyncProcessingLimit' to read the concrete setting value. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withBlockingIoDispatcher](#withBlockingIoDispatcher(java.lang.String))​(java.lang.String newBlockingIoDispatcher)` | Deprecated. Use attribute 'ActorAttributes.BlockingIoDispatcher' to change setting value. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withDebugLogging](#withDebugLogging(boolean))​(boolean enable)` | Deprecated. Use attribute 'ActorAttributes.DebugLogging' to change setting value. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withDispatcher](#withDispatcher(java.lang.String))​(java.lang.String dispatcher)` | Deprecated. Use attribute 'ActorAttributes.Dispatcher' to change setting value. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withFuzzing](#withFuzzing(boolean))​(boolean enable)` | Deprecated. Use attribute 'ActorAttributes.FuzzingMode' to change setting value. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withInputBuffer](#withInputBuffer(int,int))​(int initialSize,  int maxSize)` | Deprecated. Use attribute 'Attributes.InputBuffer' to change setting value. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withIOSettings](#withIOSettings(akka.stream.IOSettings))​([IOSettings](IOSettings.html "class in akka.stream") ioSettings)` |  |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withMaxFixedBufferSize](#withMaxFixedBufferSize(int))​(int size)` | Deprecated. Use attribute 'ActorAttributes.MaxFixedBufferSize' to change setting value. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withOutputBurstLimit](#withOutputBurstLimit(int))​(int limit)` | Deprecated. Use attribute 'ActorAttributes.OutputBurstLimit' to change setting value. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withStreamRefSettings](#withStreamRefSettings(akka.stream.StreamRefSettings))​([StreamRefSettings](StreamRefSettings.html "interface in akka.stream") streamRefSettings)` | Change settings specific to [`SourceRef`](SourceRef.html "interface in akka.stream") and [`SinkRef`](SinkRef.html "interface in akka.stream"). |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withSubscriptionTimeoutSettings](#withSubscriptionTimeoutSettings(akka.stream.StreamSubscriptionTimeoutSettings))​([StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") settings)` | Leaked publishers and subscribers are cleaned up when they are not used within a given  deadline, configured by [`StreamSubscriptionTimeoutSettings`](StreamSubscriptionTimeoutSettings.html "class in akka.stream"). |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withSupervisionStrategy](#withSupervisionStrategy(akka.japi.function.Function))​([Function](../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> decider)` | Deprecated. Use attribute 'ActorAttributes.SupervisionStrategy' to change setting value. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withSupervisionStrategy](#withSupervisionStrategy(scala.Function1))​(scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> decider)` | Deprecated. Use attribute 'ActorAttributes.supervisionStrategy' to change setting value. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[withSyncProcessingLimit](#withSyncProcessingLimit(int))​(int limit)` | Deprecated. Use attribute 'ActorAttributes.SyncProcessingLimit' to change setting value. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorMaterializerSettings
		
		
		
		```
		public ActorMaterializerSettings()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") apply​(int initialInputBufferSize,
		                                              int maxInputBufferSize,
		                                              java.lang.String dispatcher,
		                                              scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> supervisionDecider,
		                                              [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") subscriptionTimeoutSettings,
		                                              boolean debugLogging,
		                                              int outputBurstLimit,
		                                              boolean fuzzingMode,
		                                              boolean autoFusing,
		                                              int maxFixedBufferSize)
		```
		
		Deprecated.
		Use config or attributes to configure the materializer. See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. Since 2\.6\.0\.
		
		Create [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") from individual settings (Scala).
		 
		 Prefer using either config for defaults or attributes for per\-stream config.
		 See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html"
		- #### apply
		
		
		
		```
		public static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use config or attributes to configure the materializer. See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. Since 2\.6\.0\.
		
		Create [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") from the settings of an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") (Scala).
		 
		 Prefer using either config for defaults or attributes for per\-stream config.
		 See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html"
		- #### apply
		
		
		
		```
		public static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") apply​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use config or attributes to configure the materializer. See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. Since 2\.6\.0\.
		
		Create [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") from a Config subsection (Scala).
		 
		 Prefer using either config for defaults or attributes for per\-stream config.
		 See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html"
		- #### create
		
		
		
		```
		public static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") create​(int initialInputBufferSize,
		                                               int maxInputBufferSize,
		                                               java.lang.String dispatcher,
		                                               scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> supervisionDecider,
		                                               [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") subscriptionTimeoutSettings,
		                                               boolean debugLogging,
		                                               int outputBurstLimit,
		                                               boolean fuzzingMode,
		                                               boolean autoFusing,
		                                               int maxFixedBufferSize)
		```
		
		Deprecated.
		Use config or attributes to configure the materializer. See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. Since 2\.6\.0\.
		
		Create [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") from individual settings (Java).
		 
		 Prefer using either config for defaults or attributes for per\-stream config.
		 See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html"
		- #### create
		
		
		
		```
		public static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use config or attributes to configure the materializer. See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. Since 2\.6\.0\.
		
		Create [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") from the settings of an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") (Java).
		- #### create
		
		
		
		```
		public static [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") create​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use config or attributes to configure the materializer. See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. Since 2\.6\.0\.
		
		Create [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") from a Config subsection (Java).
		 
		 Prefer using either config for defaults or attributes for per\-stream config.
		 See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html"
		- #### initialInputBufferSize
		
		
		
		```
		public int initialInputBufferSize()
		```
		
		Deprecated.
		Use attribute 'Attributes.InputBuffer' to read the concrete setting value. Since 2\.6\.0\.
		- #### maxInputBufferSize
		
		
		
		```
		public int maxInputBufferSize()
		```
		
		Deprecated.
		Use attribute 'Attributes.InputBuffer' to read the concrete setting value. Since 2\.6\.0\.
		- #### dispatcher
		
		
		
		```
		public java.lang.String dispatcher()
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.Dispatcher' to read the concrete setting value. Since 2\.6\.0\.
		- #### supervisionDecider
		
		
		
		```
		public scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> supervisionDecider()
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.SupervisionStrategy' to read the concrete setting value. Since 2\.6\.0\.
		- #### subscriptionTimeoutSettings
		
		
		
		```
		public [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") subscriptionTimeoutSettings()
		```
		- #### debugLogging
		
		
		
		```
		public boolean debugLogging()
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.DebugLogging' to read the concrete setting value. Since 2\.6\.0\.
		- #### outputBurstLimit
		
		
		
		```
		public int outputBurstLimit()
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.OutputBurstLimit' to read the concrete setting value. Since 2\.6\.0\.
		- #### fuzzingMode
		
		
		
		```
		public boolean fuzzingMode()
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.FuzzingMode' to read the concrete setting value. Since 2\.6\.0\.
		- #### autoFusing
		
		
		
		```
		public boolean autoFusing()
		```
		
		Deprecated.
		No longer has any effect. Since 2\.6\.0\.
		- #### maxFixedBufferSize
		
		
		
		```
		public int maxFixedBufferSize()
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.MaxFixedBufferSize' to read the concrete setting value. Since 2\.6\.0\.
		- #### syncProcessingLimit
		
		
		
		```
		public int syncProcessingLimit()
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.SyncProcessingLimit' to read the concrete setting value. Since 2\.6\.0\.
		- #### ioSettings
		
		
		
		```
		public [IOSettings](IOSettings.html "class in akka.stream") ioSettings()
		```
		- #### streamRefSettings
		
		
		
		```
		public [StreamRefSettings](StreamRefSettings.html "interface in akka.stream") streamRefSettings()
		```
		- #### blockingIoDispatcher
		
		
		
		```
		public java.lang.String blockingIoDispatcher()
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.BlockingIoDispatcher' to read the concrete setting value. Since 2\.6\.0\.
		- #### withInputBuffer
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withInputBuffer​(int initialSize,
		                                                 int maxSize)
		```
		
		Deprecated.
		Use attribute 'Attributes.InputBuffer' to change setting value. Since 2\.6\.0\.
		
		Each asynchronous piece of a materialized stream topology is executed by one Actor
		 that manages an input buffer for all inlets of its shape. This setting configures
		 the default for initial and maximal input buffer in number of elements for each inlet.
		 This can be overridden for individual parts of the
		 stream topology by using [`Attributes.inputBuffer(int, int)`](Attributes.html#inputBuffer(int,int)).
		 
		 FIXME: this is used for all kinds of buffers, not only the stream actor, some use initial some use max,
		 document and or fix if it should not be like that. Search for get\[Attributes.InputBuffer] to see how it is used
		- #### withDispatcher
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withDispatcher​(java.lang.String dispatcher)
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.Dispatcher' to change setting value. Since 2\.6\.0\.
		
		This setting configures the default dispatcher to be used by streams materialized
		 with the [`ActorMaterializer`](ActorMaterializer.html "class in akka.stream"). This can be overridden for individual parts of the
		 stream topology by using `akka.stream.Attributes#dispatcher`.
		- #### withSupervisionStrategy
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withSupervisionStrategy​(scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> decider)
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.supervisionStrategy' to change setting value. Since 2\.6\.0\.
		
		Scala API: Decides how exceptions from application code are to be handled, unless
		 overridden for specific flows of the stream operations with
		 `akka.stream.Attributes#supervisionStrategy`.
		 
		 Note that supervision in streams are implemented on a per operator basis and is not supported
		 by every operator.
		- #### withSupervisionStrategy
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withSupervisionStrategy​([Function](../japi/function/Function.html "interface in akka.japi.function")<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> decider)
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.SupervisionStrategy' to change setting value. Since 2\.6\.0\.
		
		Java API: Decides how exceptions from application code are to be handled, unless
		 overridden for specific flows of the stream operations with
		 `akka.stream.Attributes#supervisionStrategy`.
		 
		 Note that supervision in streams are implemented on a per operator basis and is not supported
		 by every operator.
		- #### withFuzzing
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withFuzzing​(boolean enable)
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.FuzzingMode' to change setting value. Since 2\.6\.0\.
		
		Test utility: fuzzing mode means that GraphStage events are not processed
		 in FIFO order within a fused subgraph, but randomized.
		- #### withOutputBurstLimit
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withOutputBurstLimit​(int limit)
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.OutputBurstLimit' to change setting value. Since 2\.6\.0\.
		
		Maximum number of elements emitted in batch if downstream signals large demand.
		- #### withSyncProcessingLimit
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withSyncProcessingLimit​(int limit)
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.SyncProcessingLimit' to change setting value. Since 2\.6\.0\.
		
		Limit for number of messages that can be processed synchronously in stream to substream communication
		- #### withDebugLogging
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withDebugLogging​(boolean enable)
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.DebugLogging' to change setting value. Since 2\.6\.0\.
		
		Enable to log all elements that are dropped due to failures (at DEBUG level).
		- #### withMaxFixedBufferSize
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withMaxFixedBufferSize​(int size)
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.MaxFixedBufferSize' to change setting value. Since 2\.6\.0\.
		
		Configure the maximum buffer size for which a FixedSizeBuffer will be preallocated.
		 This defaults to a large value because it is usually better to fail early when
		 system memory is not sufficient to hold the buffer.
		- #### withSubscriptionTimeoutSettings
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withSubscriptionTimeoutSettings​([StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") settings)
		```
		
		Leaked publishers and subscribers are cleaned up when they are not used within a given
		 deadline, configured by [`StreamSubscriptionTimeoutSettings`](StreamSubscriptionTimeoutSettings.html "class in akka.stream").
		- #### withIOSettings
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withIOSettings​([IOSettings](IOSettings.html "class in akka.stream") ioSettings)
		```
		- #### withStreamRefSettings
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withStreamRefSettings​([StreamRefSettings](StreamRefSettings.html "interface in akka.stream") streamRefSettings)
		```
		
		Change settings specific to [`SourceRef`](SourceRef.html "interface in akka.stream") and [`SinkRef`](SinkRef.html "interface in akka.stream").
		- #### withBlockingIoDispatcher
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") withBlockingIoDispatcher​(java.lang.String newBlockingIoDispatcher)
		```
		
		Deprecated.
		Use attribute 'ActorAttributes.BlockingIoDispatcher' to change setting value. Since 2\.6\.0\.
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/ActorMaterializerSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/IOSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamRefSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutSettings.html
- https://doc.akka.io/japi/akka/current/akka/stream/Supervision.Directive.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/ActorMaterializerSettings.html](https://doc.akka.io/japi/akka/current/akka/stream/ActorMaterializerSettings.html)*