---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:01:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/ActorMaterializer$.html
title: ActorMaterializer$
---

# ActorMaterializer$

## Content

Package [akka.stream](package-summary.html)
## Class ActorMaterializer$

- java.lang.Object
- - akka.stream.ActorMaterializer$

- ---

```
public class ActorMaterializer$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorMaterializer$](ActorMaterializer$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorMaterializer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[apply](#apply(akka.stream.ActorMaterializerSettings,akka.actor.ActorRefFactory))​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") materializerSettings,  [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)` | Deprecated. Use the system wide materializer or Materializer.apply(actorContext) with stream attributes or configuration settings to change defaults. |
	| `[ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[apply](#apply(akka.stream.ActorMaterializerSettings,java.lang.String,akka.actor.ActorRefFactory))​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") materializerSettings,  java.lang.String namePrefix,  [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)` | Deprecated. Use the system wide materializer with stream attributes or configuration settings to change defaults. |
	| `[ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[apply](#apply(scala.Option,scala.Option,akka.actor.ActorRefFactory))​(scala.Option<[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")> materializerSettings,  scala.Option<java.lang.String> namePrefix,  [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)` | Deprecated. Use the system wide materializer with stream attributes or configuration settings to change defaults. |
	| `scala.Option<[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")>` | `[apply$default$1](#apply$default$1())()` |  |
	| `scala.Option<java.lang.String>` | `[apply$default$2](#apply$default$2())()` |  |
	| `[ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[create](#create(akka.actor.ActorRefFactory))​([ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)` | Deprecated. Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. |
	| `[ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[create](#create(akka.actor.ActorRefFactory,java.lang.String))​([ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context,  java.lang.String namePrefix)` | Deprecated. Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. |
	| `[ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[create](#create(akka.stream.ActorMaterializerSettings,akka.actor.ActorRefFactory))​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") settings,  [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)` | Deprecated. Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. |
	| `[ActorMaterializer](ActorMaterializer.html "class in akka.stream")` | `[create](#create(akka.stream.ActorMaterializerSettings,akka.actor.ActorRefFactory,java.lang.String))​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") settings,  [ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context,  java.lang.String namePrefix)` | Deprecated. Use the system wide materializer or Materializer.create(actorContext) with stream attributes or configuration settings to change defaults. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorMaterializer$](ActorMaterializer$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorMaterializer$
		
		
		
		```
		public ActorMaterializer$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ActorMaterializer](ActorMaterializer.html "class in akka.stream") apply​(scala.Option<[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")> materializerSettings,
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
		public [ActorMaterializer](ActorMaterializer.html "class in akka.stream") apply​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") materializerSettings,
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
		public [ActorMaterializer](ActorMaterializer.html "class in akka.stream") apply​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") materializerSettings,
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
		public scala.Option<[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")> apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public scala.Option<java.lang.String> apply$default$2()
		```
		- #### create
		
		
		
		```
		public [ActorMaterializer](ActorMaterializer.html "class in akka.stream") create​([ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context)
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
		public [ActorMaterializer](ActorMaterializer.html "class in akka.stream") create​([ActorRefFactory](../actor/ActorRefFactory.html "interface in akka.actor") context,
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
		public [ActorMaterializer](ActorMaterializer.html "class in akka.stream") create​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") settings,
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
		public [ActorMaterializer](ActorMaterializer.html "class in akka.stream") create​([ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") settings,
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/ActorMaterializer$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/ActorMaterializer.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/ActorMaterializerSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/ActorMaterializer$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/ActorMaterializer$.html)*