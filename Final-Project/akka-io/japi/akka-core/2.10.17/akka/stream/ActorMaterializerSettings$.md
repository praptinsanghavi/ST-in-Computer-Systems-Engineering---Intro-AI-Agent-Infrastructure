---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:25:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorMaterializerSettings$.html
title: ActorMaterializerSettings$
---

# ActorMaterializerSettings$

## Content

Package [akka.stream](package-summary.html)
## Class ActorMaterializerSettings$

- java.lang.Object
- - akka.stream.ActorMaterializerSettings$

- ---

```
public class ActorMaterializerSettings$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorMaterializerSettings$](ActorMaterializerSettings$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorMaterializerSettings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[apply](#apply(int,int,java.lang.String,scala.Function1,akka.stream.StreamSubscriptionTimeoutSettings,boolean,int,boolean,boolean,int))​(int initialInputBufferSize,  int maxInputBufferSize,  java.lang.String dispatcher,  scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> supervisionDecider,  [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") subscriptionTimeoutSettings,  boolean debugLogging,  int outputBurstLimit,  boolean fuzzingMode,  boolean autoFusing,  int maxFixedBufferSize)` | Deprecated. Use config or attributes to configure the materializer. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use config or attributes to configure the materializer. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use config or attributes to configure the materializer. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[create](#create(int,int,java.lang.String,scala.Function1,akka.stream.StreamSubscriptionTimeoutSettings,boolean,int,boolean,boolean,int))​(int initialInputBufferSize,  int maxInputBufferSize,  java.lang.String dispatcher,  scala.Function1<java.lang.Throwable,​[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")> supervisionDecider,  [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "class in akka.stream") subscriptionTimeoutSettings,  boolean debugLogging,  int outputBurstLimit,  boolean fuzzingMode,  boolean autoFusing,  int maxFixedBufferSize)` | Deprecated. Use config or attributes to configure the materializer. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[create](#create(akka.actor.ActorSystem))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)` | Deprecated. Use config or attributes to configure the materializer. |
	| `[ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use config or attributes to configure the materializer. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorMaterializerSettings$](ActorMaterializerSettings$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorMaterializerSettings$
		
		
		
		```
		public ActorMaterializerSettings$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") apply​(int initialInputBufferSize,
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
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") apply​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use config or attributes to configure the materializer. See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. Since 2\.6\.0\.
		
		Create [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") from the settings of an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") (Scala).
		 
		 Prefer using either config for defaults or attributes for per\-stream config.
		 See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html"
		- #### apply
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") apply​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use config or attributes to configure the materializer. See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. Since 2\.6\.0\.
		
		Create [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") from a Config subsection (Scala).
		 
		 Prefer using either config for defaults or attributes for per\-stream config.
		 See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html"
		- #### create
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") create​(int initialInputBufferSize,
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
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") create​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Deprecated.
		Use config or attributes to configure the materializer. See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. Since 2\.6\.0\.
		
		Create [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") from the settings of an [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor") (Java).
		- #### create
		
		
		
		```
		public [ActorMaterializerSettings](ActorMaterializerSettings.html "class in akka.stream") create​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use config or attributes to configure the materializer. See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html. Since 2\.6\.0\.
		
		Create [`ActorMaterializerSettings`](ActorMaterializerSettings.html "class in akka.stream") from a Config subsection (Java).
		 
		 Prefer using either config for defaults or attributes for per\-stream config.
		 See migration guide for details https://doc.akka.io/libraries/akka\-core/2\.6/project/migration\-guide\-2\.5\.x\-2\.6\.x.html"

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorMaterializerSettings$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorMaterializerSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/StreamSubscriptionTimeoutSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/Supervision.Directive.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorMaterializerSettings$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/ActorMaterializerSettings$.html)*