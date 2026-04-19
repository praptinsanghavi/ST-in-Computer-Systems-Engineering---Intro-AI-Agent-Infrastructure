---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProvider$.html
title: JacksonObjectMapperProvider$
---

# JacksonObjectMapperProvider$

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class JacksonObjectMapperProvider$

- java.lang.Object
- - akka.serialization.jackson.JacksonObjectMapperProvider$

- All Implemented Interfaces:
`[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson")>`, `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class JacksonObjectMapperProvider$
extends java.lang.Object
implements [ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson")>, [ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JacksonObjectMapperProvider$](JacksonObjectMapperProvider$.html "class in akka.serialization.jackson")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JacksonObjectMapperProvider$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.typesafe.config.Config` | `[configForBinding](#configForBinding(java.lang.String,com.typesafe.config.Config))​(java.lang.String bindingName,  com.typesafe.config.Config systemConfig)` | The configuration for a given `bindingName`. |
	| `[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `com.fasterxml.jackson.databind.ObjectMapper` | `[createObjectMapper](#createObjectMapper(java.lang.String,scala.Option,akka.serialization.jackson.JacksonObjectMapperFactory,com.typesafe.config.Config,akka.actor.DynamicAccess,scala.Option))​(java.lang.String bindingName,  scala.Option<com.fasterxml.jackson.core.JsonFactory> jsonFactory,  [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") objectMapperFactory,  com.typesafe.config.Config config,  [DynamicAccess](../../actor/DynamicAccess.html "class in akka.actor") dynamicAccess,  scala.Option<[LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event")> log)` | INTERNAL API: Use [`JacksonObjectMapperProvider.create(java.lang.String, scala.Option<com.fasterxml.jackson.core.JsonFactory>)`](JacksonObjectMapperProvider.html#create(java.lang.String,scala.Option)) |
	| `[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[JacksonObjectMapperProvider$](JacksonObjectMapperProvider$.html "class in akka.serialization.jackson")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JacksonObjectMapperProvider$](JacksonObjectMapperProvider$.html "class in akka.serialization.jackson") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JacksonObjectMapperProvider$
		
		
		
		```
		public JacksonObjectMapperProvider$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson")>`
		- #### get
		
		
		
		```
		public [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson")>`
		- #### lookup
		
		
		
		```
		public [JacksonObjectMapperProvider$](JacksonObjectMapperProvider$.html "class in akka.serialization.jackson") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "class in akka.serialization.jackson")>`
		- #### configForBinding
		
		
		
		```
		public com.typesafe.config.Config configForBinding​(java.lang.String bindingName,
		                                                   com.typesafe.config.Config systemConfig)
		```
		
		The configuration for a given `bindingName`.
		- #### createObjectMapper
		
		
		
		```
		public com.fasterxml.jackson.databind.ObjectMapper createObjectMapper​(java.lang.String bindingName,
		                                                                      scala.Option<com.fasterxml.jackson.core.JsonFactory> jsonFactory,
		                                                                      [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "class in akka.serialization.jackson") objectMapperFactory,
		                                                                      com.typesafe.config.Config config,
		                                                                      [DynamicAccess](../../actor/DynamicAccess.html "class in akka.actor") dynamicAccess,
		                                                                      scala.Option<[LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event")> log)
		```
		
		INTERNAL API: Use [`JacksonObjectMapperProvider.create(java.lang.String, scala.Option<com.fasterxml.jackson.core.JsonFactory>)`](JacksonObjectMapperProvider.html#create(java.lang.String,scala.Option))
		
		 This is needed by one test in Lagom where the ObjectMapper is created without starting and ActorSystem.

## Code Examples

### Example 1: get

```text
override def get(system: ActorSystem): TheExtension = super.get(system)
```

### Example 2: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProvider$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProvider$.html](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProvider$.html)*