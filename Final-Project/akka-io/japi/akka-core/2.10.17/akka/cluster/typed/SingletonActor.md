---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/SingletonActor.html
title: SingletonActor
---

# SingletonActor

## Content

Package [akka.cluster.typed](package-summary.html)
## Class SingletonActor\<M\>

- java.lang.Object
- - akka.cluster.typed.SingletonActor\<M\>

- ---

```
public final class SingletonActor<M>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SingletonActor](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <M> [SingletonActor](SingletonActor.html "class in akka.cluster.typed")<M>` | `[apply](#apply(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../../actor/typed/Behavior.html "class in akka.actor.typed")<M> behavior,  java.lang.String name)` |  |
	| `[Behavior](../../actor/typed/Behavior.html "class in akka.actor.typed")<[M](SingletonActor.html "type parameter in SingletonActor")>` | `[behavior](#behavior())()` |  |
	| `java.lang.String` | `[name](#name())()` |  |
	| `static <M> [SingletonActor](SingletonActor.html "class in akka.cluster.typed")<M>` | `[of](#of(akka.actor.typed.Behavior,java.lang.String))​([Behavior](../../actor/typed/Behavior.html "class in akka.actor.typed")<M> behavior,  java.lang.String name)` | Java API |
	| `[Props](../../actor/typed/Props.html "class in akka.actor.typed")` | `[props](#props())()` |  |
	| `scala.Option<[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")>` | `[settings](#settings())()` |  |
	| `scala.Option<[M](SingletonActor.html "type parameter in SingletonActor")>` | `[stopMessage](#stopMessage())()` |  |
	| `[SingletonActor](SingletonActor.html "class in akka.cluster.typed")<[M](SingletonActor.html "type parameter in SingletonActor")>` | `[withProps](#withProps(akka.actor.typed.Props))​([Props](../../actor/typed/Props.html "class in akka.actor.typed") props)` | [`Props`](../../actor/typed/Props.html "class in akka.actor.typed") of the singleton actor, such as dispatcher settings. |
	| `[SingletonActor](SingletonActor.html "class in akka.cluster.typed")<[M](SingletonActor.html "type parameter in SingletonActor")>` | `[withSettings](#withSettings(akka.cluster.typed.ClusterSingletonSettings))​([ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") settings)` | Additional settings, typically loaded from configuration. |
	| `[SingletonActor](SingletonActor.html "class in akka.cluster.typed")<[M](SingletonActor.html "type parameter in SingletonActor")>` | `[withStopMessage](#withStopMessage(M))​([M](SingletonActor.html "type parameter in SingletonActor") msg)` | Message sent to the singleton to tell it to stop, e.g. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SingletonActor
		
		
		
		```
		public SingletonActor()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <M> [SingletonActor](SingletonActor.html "class in akka.cluster.typed")<M> apply​([Behavior](../../actor/typed/Behavior.html "class in akka.actor.typed")<M> behavior,
		                                          java.lang.String name)
		```
		
		
		Parameters:
		`name` \- Unique name for the singleton
		`behavior` \- Behavior for the singleton
		- #### of
		
		
		
		```
		public static <M> [SingletonActor](SingletonActor.html "class in akka.cluster.typed")<M> of​([Behavior](../../actor/typed/Behavior.html "class in akka.actor.typed")<M> behavior,
		                                       java.lang.String name)
		```
		
		Java API
		 
		
		Parameters:
		`name` \- Unique name for the singleton
		`behavior` \- Behavior for the singleton
		- #### behavior
		
		
		
		```
		public [Behavior](../../actor/typed/Behavior.html "class in akka.actor.typed")<[M](SingletonActor.html "type parameter in SingletonActor")> behavior()
		```
		- #### name
		
		
		
		```
		public java.lang.String name()
		```
		- #### props
		
		
		
		```
		public [Props](../../actor/typed/Props.html "class in akka.actor.typed") props()
		```
		- #### stopMessage
		
		
		
		```
		public scala.Option<[M](SingletonActor.html "type parameter in SingletonActor")> stopMessage()
		```
		- #### settings
		
		
		
		```
		public scala.Option<[ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed")> settings()
		```
		- #### withProps
		
		
		
		```
		public [SingletonActor](SingletonActor.html "class in akka.cluster.typed")<[M](SingletonActor.html "type parameter in SingletonActor")> withProps​([Props](../../actor/typed/Props.html "class in akka.actor.typed") props)
		```
		
		[`Props`](../../actor/typed/Props.html "class in akka.actor.typed") of the singleton actor, such as dispatcher settings.
		- #### withStopMessage
		
		
		
		```
		public [SingletonActor](SingletonActor.html "class in akka.cluster.typed")<[M](SingletonActor.html "type parameter in SingletonActor")> withStopMessage​([M](SingletonActor.html "type parameter in SingletonActor") msg)
		```
		
		Message sent to the singleton to tell it to stop, e.g. when being migrated.
		 If this is not defined it will be stopped automatically.
		 It can be useful to define a custom stop message if the singleton needs to perform
		 some asynchronous cleanup or interactions before stopping.
		- #### withSettings
		
		
		
		```
		public [SingletonActor](SingletonActor.html "class in akka.cluster.typed")<[M](SingletonActor.html "type parameter in SingletonActor")> withSettings​([ClusterSingletonSettings](ClusterSingletonSettings.html "class in akka.cluster.typed") settings)
		```
		
		Additional settings, typically loaded from configuration.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/ClusterSingletonSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/SingletonActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/SingletonActor.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/SingletonActor.html)*