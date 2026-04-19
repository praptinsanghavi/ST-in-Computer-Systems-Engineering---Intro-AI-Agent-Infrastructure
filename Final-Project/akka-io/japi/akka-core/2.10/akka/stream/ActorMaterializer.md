---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorMaterializer.html
title: ActorMaterializer
---

# ActorMaterializer

## Content

Package [akka.stream](package-summary.html)
## Class ActorMaterializer

- java.lang.Object
- - [akka.stream.Materializer](Materializer.html "class in akka.stream")
	- - akka.stream.ActorMaterializer

- All Implemented Interfaces:
`[MaterializerLoggingProvider](MaterializerLoggingProvider.html "interface in akka.stream")`

---

```
public abstract class ActorMaterializer
extends [Materializer](Materializer.html "class in akka.stream")
implements [MaterializerLoggingProvider](MaterializerLoggingProvider.html "interface in akka.stream")
```

Deprecated.
The Materializer now has all methods the ActorMaterializer used to have. Since 2\.6\.0\.

An ActorMaterializer takes a stream blueprint and turns it into a running stream.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorMaterializer](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[apply](#apply(akka.stream.ActorMaterializerSettings,akka.actor.ActorRefFactory))​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") materializerSettings,  [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)` | Deprecated. Use the system wide materializer or Materializer.apply(actorContext) with stream attributes or configuration settings to change defaults. |
	| `static [ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[apply](#apply(akka.stream.ActorMaterializerSettings,java.lang.String,akka.actor.ActorRefFactory))​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") materializerSettings,  java.lang.String namePrefix,  [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)` | Deprecated. Use the system wide materializer with stream attributes or configuration settings to change defaults. |
	| `static [ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[apply](#apply(scala.Option,scala.Option,akka.actor.ActorRefFactory))​(scala.Option<[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")> materializerSettings,  scala.Option<java.lang.String> namePrefix,  [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)` | Deprecated. Use the system wide materializer with stream attributes or configuration settings to change defaults. |
	| `static scala.Option<[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")>` | `[apply$default$1](#apply$default$1())()` | Deprecated. |
	| `static scala.Option<java.lang.String>` | `[apply$default$2](#apply$default$2())()` | Deprecated. |
	| `static [ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[create](#create(akka.actor.ActorRefFactory))​([ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)` | Deprecated. Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. |
	| `static [ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[create](#create(akka.actor.ActorRefFactory,java.lang.String))​([ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context,  java.lang.String namePrefix)` | Deprecated. Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. |
	| `static [ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[create](#create(akka.stream.ActorMaterializerSettings,akka.actor.ActorRefFactory))​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") settings,  [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)` | Deprecated. Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. |
	| `static [ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[create](#create(akka.stream.ActorMaterializerSettings,akka.actor.ActorRefFactory,java.lang.String))​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") settings,  [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context,  java.lang.String namePrefix)` | Deprecated. Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. |
	| `abstract boolean` | `[isShutdown](#isShutdown())()` | Deprecated. Indicates if the materializer has been shut down. |
	| `abstract [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[settings](#settings())()` | Deprecated. Use attributes to access settings from stages, see https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. |
	| `abstract void` | `[shutdown](#shutdown())()` | Deprecated. Shuts down this materializer and all the operators that have been materialized through this materializer. |
	| `abstract [ActorSystem](../actor/ActorSystem.html "class in akka.actor")` | `[system](#system())()` | Deprecated. INTERNAL API |
	
	
		- ### Methods inherited from class akka.stream.[Materializer](Materializer.html "class in akka.stream")
		
		
		`[apply](Materializer.html#apply(akka.actor.ClassicActorContextProvider)), [apply](Materializer.html#apply(akka.actor.ClassicActorContextProvider,akka.stream.Attributes)), [apply](Materializer.html#apply(akka.actor.ClassicActorSystemProvider)), [apply](Materializer.html#apply(akka.actor.ClassicActorSystemProvider,akka.stream.Attributes)), [createMaterializer](Materializer.html#createMaterializer(akka.actor.ClassicActorContextProvider)), [createMaterializer](Materializer.html#createMaterializer(akka.actor.ClassicActorContextProvider,akka.stream.Attributes)), [createMaterializer](Materializer.html#createMaterializer(akka.actor.ClassicActorSystemProvider)), [createMaterializer](Materializer.html#createMaterializer(akka.actor.ClassicActorSystemProvider,akka.stream.Attributes)), [executionContext](Materializer.html#executionContext()), [materialize](Materializer.html#materialize(akka.stream.Graph)), [materialize](Materializer.html#materialize(akka.stream.Graph,akka.stream.Attributes)), [matFromSystem](Materializer.html#matFromSystem(akka.actor.ClassicActorSystemProvider)), [scheduleAtFixedRate](Materializer.html#scheduleAtFixedRate(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable)), [scheduleOnce](Materializer.html#scheduleOnce(scala.concurrent.duration.FiniteDuration,java.lang.Runnable)), [schedulePeriodically](Materializer.html#schedulePeriodically(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable)), [scheduleWithFixedDelay](Materializer.html#scheduleWithFixedDelay(scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.Runnable)), [withNamePrefix](Materializer.html#withNamePrefix(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.[MaterializerLoggingProvider](MaterializerLoggingProvider.html "interface in akka.stream")
		
		
		`[makeLogger](MaterializerLoggingProvider.html#makeLogger(java.lang.Class))`

- - ### Constructor Detail
	
	
	
		- #### ActorMaterializer
		
		
		
		```
		public ActorMaterializer()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ActorMaterializer](ActorMaterializer.html "class in akka.stream") apply​(scala.Option<[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")> materializerSettings,
		                                      scala.Option<java.lang.String> namePrefix,
		                                      [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)
		```
		
		Deprecated.
		Use the system wide materializer with stream attributes or configuration settings to change defaults. Since 2\.6\.0\.
		
		Scala API: Creates an ActorMaterializer that can materialize stream blueprints as running streams.
		 
		 The required [`ActorRefFactory`](../actor/ActorRefFactory.html "interface in akka.actor") (which can be either an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") or an [`ActorContext`](../actor/ActorContext.html "interface in akka.actor"))
		 will be used to create one actor that in turn creates actors for the transformation steps.
		 
		
		
		 The materializer's [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") will be obtained from the
		 configuration of the `context`'s underlying [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor").
		 
		
		
		 The `namePrefix` is used as the first part of the names of the actors running
		 the processing steps. The default `namePrefix` is `"flow"`. The actor names are built up of
		 `namePrefix-flowNumber-flowStepNumber-stepName`.
		- #### apply
		
		
		
		```
		public static [ActorMaterializer](ActorMaterializer.html "class in akka.stream") apply​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") materializerSettings,
		                                      java.lang.String namePrefix,
		                                      [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)
		```
		
		Deprecated.
		Use the system wide materializer with stream attributes or configuration settings to change defaults. Since 2\.6\.0\.
		
		Scala API: Creates an ActorMaterializer that can materialize stream blueprints as running streams.
		 
		 The required [`ActorRefFactory`](../actor/ActorRefFactory.html "interface in akka.actor")
		 (which can be either an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") or an [`ActorContext`](../actor/ActorContext.html "interface in akka.actor"))
		 will be used to create these actors, therefore it is \*forbidden\* to pass this object
		 to another actor if the factory is an ActorContext.
		 
		
		
		 The `namePrefix` is used as the first part of the names of the actors running
		 the processing steps. The default `namePrefix` is `"flow"`. The actor names are built up of
		 `namePrefix-flowNumber-flowStepNumber-stepName`.
		- #### apply
		
		
		
		```
		public static [ActorMaterializer](ActorMaterializer.html "class in akka.stream") apply​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") materializerSettings,
		                                      [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)
		```
		
		Deprecated.
		Use the system wide materializer or Materializer.apply(actorContext) with stream attributes or configuration settings to change defaults. Since 2\.6\.0\.
		
		Scala API: Creates an ActorMaterializer that can materialize stream blueprints as running streams.
		 
		 The required [`ActorRefFactory`](../actor/ActorRefFactory.html "interface in akka.actor")
		 (which can be either an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") or an [`ActorContext`](../actor/ActorContext.html "interface in akka.actor"))
		 will be used to create these actors, therefore it is \*forbidden\* to pass this object
		 to another actor if the factory is an ActorContext.
		 
		
		
		 The `namePrefix` is used as the first part of the names of the actors running
		 the processing steps. The default `namePrefix` is `"flow"`. The actor names are built up of
		 `namePrefix-flowNumber-flowStepNumber-stepName`.
		- #### apply$default$1
		
		
		
		```
		public static scala.Option<[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")> apply$default$1()
		```
		
		Deprecated.
		- #### apply$default$2
		
		
		
		```
		public static scala.Option<java.lang.String> apply$default$2()
		```
		
		Deprecated.
		- #### create
		
		
		
		```
		public static [ActorMaterializer](ActorMaterializer.html "class in akka.stream") create​([ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)
		```
		
		Deprecated.
		Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. Since 2\.6\.0\.
		
		Java API: Creates an ActorMaterializer that can materialize stream blueprints as running streams.
		 
		 The required [`ActorRefFactory`](../actor/ActorRefFactory.html "interface in akka.actor")
		 (which can be either an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") or an [`ActorContext`](../actor/ActorContext.html "interface in akka.actor"))
		 will be used to create these actors, therefore it is \*forbidden\* to pass this object
		 to another actor if the factory is an ActorContext.
		 
		
		
		 Defaults the actor name prefix used to name actors running the processing steps to `"flow"`.
		 The actor names are built up of `namePrefix-flowNumber-flowStepNumber-stepName`.
		- #### create
		
		
		
		```
		public static [ActorMaterializer](ActorMaterializer.html "class in akka.stream") create​([ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context,
		                                       java.lang.String namePrefix)
		```
		
		Deprecated.
		Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. Since 2\.6\.0\.
		
		Java API: Creates an ActorMaterializer that can materialize stream blueprints as running streams.
		 
		 The required [`ActorRefFactory`](../actor/ActorRefFactory.html "interface in akka.actor")
		 (which can be either an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") or an [`ActorContext`](../actor/ActorContext.html "interface in akka.actor"))
		 will be used to create these actors, therefore it is \*forbidden\* to pass this object
		 to another actor if the factory is an ActorContext.
		 
		
		
		 The `namePrefix` is used as the first part of the names of the actors running
		 the processing steps. The default `namePrefix` is `"flow"`. The actor names are built up of
		 `namePrefix-flowNumber-flowStepNumber-stepName`.
		- #### create
		
		
		
		```
		public static [ActorMaterializer](ActorMaterializer.html "class in akka.stream") create​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") settings,
		                                       [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)
		```
		
		Deprecated.
		Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. Since 2\.6\.0\.
		
		Java API: Creates an ActorMaterializer that can materialize stream blueprints as running streams.
		 
		 The required [`ActorRefFactory`](../actor/ActorRefFactory.html "interface in akka.actor")
		 (which can be either an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") or an [`ActorContext`](../actor/ActorContext.html "interface in akka.actor"))
		 will be used to create one actor that in turn creates actors for the transformation steps.
		- #### create
		
		
		
		```
		public static [ActorMaterializer](ActorMaterializer.html "class in akka.stream") create​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") settings,
		                                       [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context,
		                                       java.lang.String namePrefix)
		```
		
		Deprecated.
		Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. Since 2\.6\.0\.
		
		Java API: Creates an ActorMaterializer that can materialize stream blueprints as running streams.
		 
		 The required [`ActorRefFactory`](../actor/ActorRefFactory.html "interface in akka.actor")
		 (which can be either an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") or an [`ActorContext`](../actor/ActorContext.html "interface in akka.actor"))
		 will be used to create these actors, therefore it is \*forbidden\* to pass this object
		 to another actor if the factory is an ActorContext.
		 
		
		
		 The `namePrefix` is used as the first part of the names of the actors running
		 the processing steps. The default `namePrefix` is `"flow"`. The actor names are built up of
		 `namePrefix-flowNumber-flowStepNumber-stepName`.
		- #### settings
		
		
		
		```
		public abstract [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") settings()
		```
		
		Deprecated.
		Use attributes to access settings from stages, see https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. Since 2\.6\.0\.
		
		
		Specified by:
		`[settings](Materializer.html#settings())` in class `[Materializer](Materializer.html "class in akka.stream")`
		- #### shutdown
		
		
		
		```
		public abstract void shutdown()
		```
		
		Deprecated.
		Shuts down this materializer and all the operators that have been materialized through this materializer. After
		 having shut down, this materializer cannot be used again. Any attempt to materialize operators after having
		 shut down will result in an IllegalStateException being thrown at materialization time.
		
		Specified by:
		`[shutdown](Materializer.html#shutdown())` in class `[Materializer](Materializer.html "class in akka.stream")`
		- #### isShutdown
		
		
		
		```
		public abstract boolean isShutdown()
		```
		
		Deprecated.
		Indicates if the materializer has been shut down.
		
		Specified by:
		`[isShutdown](Materializer.html#isShutdown())` in class `[Materializer](Materializer.html "class in akka.stream")`
		- #### system
		
		
		
		```
		public abstract [ActorSystem](../actor/ActorSystem.html "class in akka.actor") system()
		```
		
		Deprecated.
		INTERNAL API
		
		Specified by:
		`[system](Materializer.html#system())` in class `[Materializer](Materializer.html "class in akka.stream")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorMaterializerSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/MaterializerLoggingProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorMaterializer.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorMaterializer.html)*