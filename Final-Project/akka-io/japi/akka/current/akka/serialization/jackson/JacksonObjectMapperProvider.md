---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProvider.html
title: JacksonObjectMapperProvider
---

# JacksonObjectMapperProvider

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class JacksonObjectMapperProvider

- java.lang.Object
- - akka.serialization.jackson.JacksonObjectMapperProvider

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public final class JacksonObjectMapperProvider
extends java.lang.Object
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

Registry of shared `ObjectMapper` instances, each with it's unique `bindingName`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JacksonObjectMapperProvider](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static com.typesafe.config.Config` | `[configForBinding](#configForBinding(java.lang.String,com.typesafe.config.Config))​(java.lang.String bindingName,  com.typesafe.config.Config systemConfig)` | The configuration for a given `bindingName`. |
	| `com.fasterxml.jackson.databind.ObjectMapper` | `[create](#create(java.lang.String,java.util.Optional))​(java.lang.String bindingName,  java.util.Optional<com.fasterxml.jackson.core.JsonFactory> jsonFactory)` | Java API: Creates a new instance of a Jackson `ObjectMapper` with sensible defaults and modules configured  in `akka.serialization.jackson.jackson-modules`. |
	| `com.fasterxml.jackson.databind.ObjectMapper` | `[create](#create(java.lang.String,scala.Option))​(java.lang.String bindingName,  scala.Option<com.fasterxml.jackson.core.JsonFactory> jsonFactory)` | Scala API: Creates a new instance of a Jackson `ObjectMapper` with sensible defaults and modules configured  in `akka.serialization.jackson.jackson-modules`. |
	| `static [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static com.fasterxml.jackson.databind.ObjectMapper` | `[createObjectMapper](#createObjectMapper(java.lang.String,scala.Option,akka.serialization.jackson.JacksonObjectMapperFactory,com.typesafe.config.Config,akka.actor.DynamicAccess,scala.Option))​(java.lang.String bindingName,  scala.Option<com.fasterxml.jackson.core.JsonFactory> jsonFactory,  [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") objectMapperFactory,  com.typesafe.config.Config config,  [DynamicAccess](../../actor/DynamicAccess.html "class in akka.actor") dynamicAccess,  scala.Option<[LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event")> log)` | INTERNAL API: Use [`create(java.lang.String, scala.Option<com.fasterxml.jackson.core.JsonFactory>)`](#create(java.lang.String,scala.Option)) |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `com.fasterxml.jackson.databind.ObjectMapper` | `[getOrCreate](#getOrCreate(java.lang.String,java.util.Optional))​(java.lang.String bindingName,  java.util.Optional<com.fasterxml.jackson.core.JsonFactory> jsonFactory)` | Java API: Returns an existing Jackson `ObjectMapper` that was created previously with this method, or  creates a new instance. |
	| `com.fasterxml.jackson.databind.ObjectMapper` | `[getOrCreate](#getOrCreate(java.lang.String,scala.Option))​(java.lang.String bindingName,  scala.Option<com.fasterxml.jackson.core.JsonFactory> jsonFactory)` | Scala API: Returns an existing Jackson `ObjectMapper` that was created previously with this method, or  creates a new instance. |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [JacksonObjectMapperProvider$](JacksonObjectMapperProvider$.html "class in akka.serialization.jackson")` | `[lookup](#lookup())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JacksonObjectMapperProvider
		
		
		
		```
		public JacksonObjectMapperProvider​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [JacksonObjectMapperProvider$](JacksonObjectMapperProvider$.html "class in akka.serialization.jackson") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### configForBinding
		
		
		
		```
		public static com.typesafe.config.Config configForBinding​(java.lang.String bindingName,
		                                                          com.typesafe.config.Config systemConfig)
		```
		
		The configuration for a given `bindingName`.
		- #### createObjectMapper
		
		
		
		```
		public static com.fasterxml.jackson.databind.ObjectMapper createObjectMapper​(java.lang.String bindingName,
		                                                                             scala.Option<com.fasterxml.jackson.core.JsonFactory> jsonFactory,
		                                                                             [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") objectMapperFactory,
		                                                                             com.typesafe.config.Config config,
		                                                                             [DynamicAccess](../../actor/DynamicAccess.html "class in akka.actor") dynamicAccess,
		                                                                             scala.Option<[LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event")> log)
		```
		
		INTERNAL API: Use [`create(java.lang.String, scala.Option<com.fasterxml.jackson.core.JsonFactory>)`](#create(java.lang.String,scala.Option))
		
		 This is needed by one test in Lagom where the ObjectMapper is created without starting and ActorSystem.
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### getOrCreate
		
		
		
		```
		public com.fasterxml.jackson.databind.ObjectMapper getOrCreate​(java.lang.String bindingName,
		                                                               scala.Option<com.fasterxml.jackson.core.JsonFactory> jsonFactory)
		```
		
		Scala API: Returns an existing Jackson `ObjectMapper` that was created previously with this method, or
		 creates a new instance.
		 
		 The `ObjectMapper` is created with sensible defaults and modules configured
		 in `akka.serialization.jackson.jackson-modules`. It's using [`JacksonObjectMapperProviderSetup`](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson")
		 if the `ActorSystem` is started with such [`ActorSystemSetup`](../../actor/setup/ActorSystemSetup.html "class in akka.actor.setup").
		 
		
		
		 The returned `ObjectMapper` must not be modified, because it may already be in use and such
		 modifications are not thread\-safe.
		 
		
		
		
		Parameters:
		`bindingName` \- name of this `ObjectMapper`
		`jsonFactory` \- optional `JsonFactory` such as `CBORFactory`, for plain JSON `None` (defaults)
		 can be used
		- #### getOrCreate
		
		
		
		```
		public com.fasterxml.jackson.databind.ObjectMapper getOrCreate​(java.lang.String bindingName,
		                                                               java.util.Optional<com.fasterxml.jackson.core.JsonFactory> jsonFactory)
		```
		
		Java API: Returns an existing Jackson `ObjectMapper` that was created previously with this method, or
		 creates a new instance.
		 
		 The `ObjectMapper` is created with sensible defaults and modules configured
		 in `akka.serialization.jackson.jackson-modules`. It's using [`JacksonObjectMapperProviderSetup`](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson")
		 if the `ActorSystem` is started with such [`ActorSystemSetup`](../../actor/setup/ActorSystemSetup.html "class in akka.actor.setup").
		 
		
		
		 The returned `ObjectMapper` must not be modified, because it may already be in use and such
		 modifications are not thread\-safe.
		 
		
		
		
		Parameters:
		`bindingName` \- name of this `ObjectMapper`
		`jsonFactory` \- optional `JsonFactory` such as `CBORFactory`, for plain JSON `None` (defaults)
		 can be used
		- #### create
		
		
		
		```
		public com.fasterxml.jackson.databind.ObjectMapper create​(java.lang.String bindingName,
		                                                          scala.Option<com.fasterxml.jackson.core.JsonFactory> jsonFactory)
		```
		
		Scala API: Creates a new instance of a Jackson `ObjectMapper` with sensible defaults and modules configured
		 in `akka.serialization.jackson.jackson-modules`. It's using [`JacksonObjectMapperProviderSetup`](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson")
		 if the `ActorSystem` is started with such [`ActorSystemSetup`](../../actor/setup/ActorSystemSetup.html "class in akka.actor.setup").
		 
		
		Parameters:
		`bindingName` \- name of this `ObjectMapper`
		`jsonFactory` \- optional `JsonFactory` such as `CBORFactory`, for plain JSON `None` (defaults)
		 can be used
		See Also:
		[`getOrCreate(java.lang.String, scala.Option<com.fasterxml.jackson.core.JsonFactory>)`](#getOrCreate(java.lang.String,scala.Option))
		- #### create
		
		
		
		```
		public com.fasterxml.jackson.databind.ObjectMapper create​(java.lang.String bindingName,
		                                                          java.util.Optional<com.fasterxml.jackson.core.JsonFactory> jsonFactory)
		```
		
		Java API: Creates a new instance of a Jackson `ObjectMapper` with sensible defaults and modules configured
		 in `akka.serialization.jackson.jackson-modules`. It's using [`JacksonObjectMapperProviderSetup`](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson")
		 if the `ActorSystem` is started with such [`ActorSystemSetup`](../../actor/setup/ActorSystemSetup.html "class in akka.actor.setup").
		 
		
		Parameters:
		`bindingName` \- name of this `ObjectMapper`
		`jsonFactory` \- optional `JsonFactory` such as `CBORFactory`, for plain JSON `None` (defaults)
		 can be used
		See Also:
		[`getOrCreate(java.lang.String, scala.Option<com.fasterxml.jackson.core.JsonFactory>)`](#getOrCreate(java.lang.String,scala.Option))

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/current/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperFactory.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProvider$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProvider.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProvider.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProvider.html)*