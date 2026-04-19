---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaJacksonModule$.html
title: AkkaJacksonModule$
---

# AkkaJacksonModule$

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class AkkaJacksonModule$

- java.lang.Object
- - com.fasterxml.jackson.databind.Module
	- - [akka.serialization.jackson.AkkaJacksonModule](AkkaJacksonModule.html "class in akka.serialization.jackson")
		- - akka.serialization.jackson.AkkaJacksonModule$

- All Implemented Interfaces:
`[ActorRefModule](ActorRefModule.html "interface in akka.serialization.jackson")`, `[AddressModule](AddressModule.html "interface in akka.serialization.jackson")`, `[FiniteDurationModule](FiniteDurationModule.html "interface in akka.serialization.jackson")`, `[JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")`, `com.fasterxml.jackson.core.Versioned`

---

```
public class AkkaJacksonModule$
extends [AkkaJacksonModule](AkkaJacksonModule.html "class in akka.serialization.jackson")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class com.fasterxml.jackson.databind.Module
		
		
		`com.fasterxml.jackson.databind.Module.SetupContext`
		- ### Nested classes/interfaces inherited from interface akka.serialization.jackson.[JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")
		
		
		`[JacksonModule.DeserializerResolverByClass](JacksonModule.DeserializerResolverByClass.html "class in akka.serialization.jackson"), [JacksonModule.SerializerResolverByClass](JacksonModule.SerializerResolverByClass.html "class in akka.serialization.jackson")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AkkaJacksonModule$](AkkaJacksonModule$.html "class in akka.serialization.jackson")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AkkaJacksonModule$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.serialization.jackson.[AkkaJacksonModule](AkkaJacksonModule.html "class in akka.serialization.jackson")
		
		
		`[$plus$eq](AkkaJacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.deser.Deserializers)), [$plus$eq](AkkaJacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.ser.BeanSerializerModifier)), [$plus$eq](AkkaJacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.ser.Serializers)), [$plus$eq](AkkaJacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.type.TypeModifier)), [$plus$eq](AkkaJacksonModule.html#$plus$eq(scala.Function1)), [addSerializer](AkkaJacksonModule.html#addSerializer(java.lang.Class,scala.Function0,scala.Function0)), [akka$serialization$jackson$JacksonModule$_setter_$akka$serialization$jackson$JacksonModule$$initializers_$eq](AkkaJacksonModule.html#akka$serialization$jackson$JacksonModule$_setter_$akka$serialization$jackson$JacksonModule$$initializers_$eq(scala.collection.mutable.Builder)), [akka$serialization$jackson$JacksonModule$$initializers](AkkaJacksonModule.html#akka$serialization$jackson$JacksonModule$$initializers()), [getDependencies](AkkaJacksonModule.html#getDependencies()), [getModuleName](AkkaJacksonModule.html#getModuleName()), [getTypeId](AkkaJacksonModule.html#getTypeId()), [setupModule](AkkaJacksonModule.html#setupModule(com.fasterxml.jackson.databind.Module.SetupContext)), [version](AkkaJacksonModule.html#version())`
		- ### Methods inherited from class com.fasterxml.jackson.databind.Module
		
		
		`getDependencies, getTypeId, setupModule, version`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.jackson.[JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")
		
		
		`[$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.deser.Deserializers)), [$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.ser.BeanSerializerModifier)), [$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.ser.Serializers)), [$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.type.TypeModifier)), [$plus$eq](JacksonModule.html#$plus$eq(scala.Function1)), [addSerializer](JacksonModule.html#addSerializer(java.lang.Class,scala.Function0,scala.Function0)), [setupModule](JacksonModule.html#setupModule(com.fasterxml.jackson.databind.Module.SetupContext)), [version](JacksonModule.html#version())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AkkaJacksonModule$](AkkaJacksonModule$.html "class in akka.serialization.jackson") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AkkaJacksonModule$
		
		
		
		```
		public AkkaJacksonModule$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/ActorRefModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AddressModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaJacksonModule$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaJacksonModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/FiniteDurationModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.DeserializerResolverByClass.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.SerializerResolverByClass.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaJacksonModule$.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaJacksonModule$.html)*