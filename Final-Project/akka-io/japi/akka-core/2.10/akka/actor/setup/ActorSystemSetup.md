---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:34:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html
title: ActorSystemSetup
---

# ActorSystemSetup

## Content

Package [akka.actor.setup](package-summary.html)
## Class ActorSystemSetup

- java.lang.Object
- - akka.actor.setup.ActorSystemSetup

- ---

```
public final class ActorSystemSetup
extends java.lang.Object
```

A set of setup settings for programmatic configuration of the actor system.
 
 Constructor is \*Internal API\*. Use the factory methods [`create(akka.actor.setup.Setup...)`](#create(akka.actor.setup.Setup...)) and `akka.actor.Actor#apply` to create
 instances.

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T extends [Setup](Setup.html "class in akka.actor.setup")>[ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup")` | `[and](#and(T))​(T t)` | alias for `withSetup` allowing for fluent combination of settings: `a and b and c`, where `a`, `b` and `c` are  concrete [`Setup`](Setup.html "class in akka.actor.setup") instances. |
	| `static [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Setup](Setup.html "class in akka.actor.setup")> settings)` | Scala API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings |
	| `static [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup")` | `[create](#create(akka.actor.setup.Setup...))​([Setup](Setup.html "class in akka.actor.setup")... settings)` | Java API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings |
	| `static [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup")` | `[create](#create(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Setup](Setup.html "class in akka.actor.setup")> settings)` | Java API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings |
	| `static [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup")` | `[empty](#empty())()` |  |
	| `<T extends [Setup](Setup.html "class in akka.actor.setup")>java.util.Optional<T>` | `[get](#get(java.lang.Class))​(java.lang.Class<T> clazz)` | Java API: Extract a concrete [`Setup`](Setup.html "class in akka.actor.setup") of type `T` if it is defined in the settings. |
	| `<T extends [Setup](Setup.html "class in akka.actor.setup")>scala.Option<T>` | `[get](#get(scala.reflect.ClassTag))​(scala.reflect.ClassTag<T> evidence$1)` | Scala API: Extract a concrete [`Setup`](Setup.html "class in akka.actor.setup") of type `T` if it is defined in the settings. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T extends [Setup](Setup.html "class in akka.actor.setup")>[ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup")` | `[withSetup](#withSetup(T))​(T t)` | Add a concrete [`Setup`](Setup.html "class in akka.actor.setup"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup") create​([Setup](Setup.html "class in akka.actor.setup")... settings)
		```
		
		Java API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings
		- #### empty
		
		
		
		```
		public static [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup") empty()
		```
		- #### apply
		
		
		
		```
		public static [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup") apply​(scala.collection.immutable.Seq<[Setup](Setup.html "class in akka.actor.setup")> settings)
		```
		
		Scala API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings
		- #### create
		
		
		
		```
		public static [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup") create​(scala.collection.immutable.Seq<[Setup](Setup.html "class in akka.actor.setup")> settings)
		```
		
		Java API: Create an [`ActorSystemSetup`](ActorSystemSetup.html "class in akka.actor.setup") containing all the provided settings
		- #### get
		
		
		
		```
		public <T extends [Setup](Setup.html "class in akka.actor.setup")> java.util.Optional<T> get​(java.lang.Class<T> clazz)
		```
		
		Java API: Extract a concrete [`Setup`](Setup.html "class in akka.actor.setup") of type `T` if it is defined in the settings.
		- #### get
		
		
		
		```
		public <T extends [Setup](Setup.html "class in akka.actor.setup")> scala.Option<T> get​(scala.reflect.ClassTag<T> evidence$1)
		```
		
		Scala API: Extract a concrete [`Setup`](Setup.html "class in akka.actor.setup") of type `T` if it is defined in the settings.
		- #### withSetup
		
		
		
		```
		public <T extends [Setup](Setup.html "class in akka.actor.setup")> [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup") withSetup​(T t)
		```
		
		Add a concrete [`Setup`](Setup.html "class in akka.actor.setup"). If a setting of the same concrete [`Setup`](Setup.html "class in akka.actor.setup") already is
		 present it will be replaced.
		- #### and
		
		
		
		```
		public <T extends [Setup](Setup.html "class in akka.actor.setup")> [ActorSystemSetup](ActorSystemSetup.html "class in akka.actor.setup") and​(T t)
		```
		
		alias for `withSetup` allowing for fluent combination of settings: `a and b and c`, where `a`, `b` and `c` are
		 concrete [`Setup`](Setup.html "class in akka.actor.setup") instances. If a setting of the same concrete [`Setup`](Setup.html "class in akka.actor.setup") already is
		 present it will be replaced.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/Setup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html)*