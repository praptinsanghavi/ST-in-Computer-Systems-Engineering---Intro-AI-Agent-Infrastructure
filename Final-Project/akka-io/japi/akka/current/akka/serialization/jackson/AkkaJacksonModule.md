---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaJacksonModule.html
title: AkkaJacksonModule
---

# AkkaJacksonModule

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class AkkaJacksonModule

- java.lang.Object
- - com.fasterxml.jackson.databind.Module
	- - akka.serialization.jackson.AkkaJacksonModule

- All Implemented Interfaces:
`[ActorRefModule](ActorRefModule.html "interface in akka.serialization.jackson")`, `[AddressModule](AddressModule.html "interface in akka.serialization.jackson")`, `[FiniteDurationModule](FiniteDurationModule.html "interface in akka.serialization.jackson")`, `[JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")`, `com.fasterxml.jackson.core.Versioned`

Direct Known Subclasses:
`[AkkaJacksonModule$](AkkaJacksonModule$.html "class in akka.serialization.jackson")`, `[AkkaStreamJacksonModule$](AkkaStreamJacksonModule$.html "class in akka.serialization.jackson")`, `[AkkaTypedJacksonModule$](AkkaTypedJacksonModule$.html "class in akka.serialization.jackson")`

---

```
public class AkkaJacksonModule
extends com.fasterxml.jackson.databind.Module
implements [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson"), [ActorRefModule](ActorRefModule.html "interface in akka.serialization.jackson"), [AddressModule](AddressModule.html "interface in akka.serialization.jackson"), [FiniteDurationModule](FiniteDurationModule.html "interface in akka.serialization.jackson")
```

Complete module with support for all custom serializers.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class com.fasterxml.jackson.databind.Module
		
		
		`com.fasterxml.jackson.databind.Module.SetupContext`
		- ### Nested classes/interfaces inherited from interface akka.serialization.jackson.[JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")
		
		
		`[JacksonModule.DeserializerResolverByClass](JacksonModule.DeserializerResolverByClass.html "class in akka.serialization.jackson"), [JacksonModule.SerializerResolverByClass](JacksonModule.SerializerResolverByClass.html "class in akka.serialization.jackson")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AkkaJacksonModule](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")` | `[$plus$eq](#$plus$eq(com.fasterxml.jackson.databind.deser.Deserializers))​(com.fasterxml.jackson.databind.deser.Deserializers deser)` |  |
	| `protected static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")` | `[$plus$eq](#$plus$eq(com.fasterxml.jackson.databind.ser.BeanSerializerModifier))​(com.fasterxml.jackson.databind.ser.BeanSerializerModifier beanSerMod)` |  |
	| `protected static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")` | `[$plus$eq](#$plus$eq(com.fasterxml.jackson.databind.ser.Serializers))​(com.fasterxml.jackson.databind.ser.Serializers ser)` |  |
	| `protected static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")` | `[$plus$eq](#$plus$eq(com.fasterxml.jackson.databind.type.TypeModifier))​(com.fasterxml.jackson.databind.type.TypeModifier typeMod)` |  |
	| `protected static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")` | `[$plus$eq](#$plus$eq(scala.Function1))​(scala.Function1<com.fasterxml.jackson.databind.Module.SetupContext,​scala.runtime.BoxedUnit> init)` |  |
	| `static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")` | `[addSerializer](#addSerializer(java.lang.Class,scala.Function0,scala.Function0))​(java.lang.Class<?> clazz,  scala.Function0<com.fasterxml.jackson.databind.JsonSerializer<?>> serializer,  scala.Function0<com.fasterxml.jackson.databind.JsonDeserializer<?>> deserializer)` |  |
	| `protected static void` | `[akka$serialization$jackson$JacksonModule$_setter_$akka$serialization$jackson$JacksonModule$$initializers_$eq](#akka$serialization$jackson$JacksonModule$_setter_$akka$serialization$jackson$JacksonModule$$initializers_$eq(scala.collection.mutable.Builder))​(scala.collection.mutable.Builder<scala.Function1<com.fasterxml.jackson.databind.Module.SetupContext,​scala.runtime.BoxedUnit>,​scala.collection.immutable.Seq<scala.Function1<com.fasterxml.jackson.databind.Module.SetupContext,​scala.runtime.BoxedUnit>>> x$1)` |  |
	| `static scala.collection.mutable.Builder<scala.Function1<com.fasterxml.jackson.databind.Module.SetupContext,​scala.runtime.BoxedUnit>,​scala.collection.immutable.Seq<scala.Function1<com.fasterxml.jackson.databind.Module.SetupContext,​scala.runtime.BoxedUnit>>>` | `[akka$serialization$jackson$JacksonModule$$initializers](#akka$serialization$jackson$JacksonModule$$initializers())()` |  |
	| `static java.lang.Iterable<? extends com.fasterxml.jackson.databind.Module>` | `[getDependencies](#getDependencies())()` |  |
	| `java.lang.String` | `[getModuleName](#getModuleName())()` |  |
	| `static java.lang.Object` | `[getTypeId](#getTypeId())()` |  |
	| `static void` | `[setupModule](#setupModule(com.fasterxml.jackson.databind.Module.SetupContext))​(com.fasterxml.jackson.databind.Module.SetupContext context)` |  |
	| `static com.fasterxml.jackson.core.Version` | `[version](#version())()` |  |
	
	
		- ### Methods inherited from class com.fasterxml.jackson.databind.Module
		
		
		`getDependencies, getTypeId, setupModule, version`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.jackson.[JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")
		
		
		`[$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.deser.Deserializers)), [$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.ser.BeanSerializerModifier)), [$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.ser.Serializers)), [$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.type.TypeModifier)), [$plus$eq](JacksonModule.html#$plus$eq(scala.Function1)), [addSerializer](JacksonModule.html#addSerializer(java.lang.Class,scala.Function0,scala.Function0)), [setupModule](JacksonModule.html#setupModule(com.fasterxml.jackson.databind.Module.SetupContext)), [version](JacksonModule.html#version())`

- - ### Constructor Detail
	
	
	
		- #### AkkaJacksonModule
		
		
		
		```
		public AkkaJacksonModule()
		```

	- ### Method Detail
	
	
	
		- #### getTypeId
		
		
		
		```
		public static java.lang.Object getTypeId()
		```
		- #### getDependencies
		
		
		
		```
		public static java.lang.Iterable<? extends com.fasterxml.jackson.databind.Module> getDependencies()
		```
		- #### version
		
		
		
		```
		public static com.fasterxml.jackson.core.Version version()
		```
		- #### setupModule
		
		
		
		```
		public static void setupModule​(com.fasterxml.jackson.databind.Module.SetupContext context)
		```
		- #### addSerializer
		
		
		
		```
		public static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson") addSerializer​(java.lang.Class<?> clazz,
		                                          scala.Function0<com.fasterxml.jackson.databind.JsonSerializer<?>> serializer,
		                                          scala.Function0<com.fasterxml.jackson.databind.JsonDeserializer<?>> deserializer)
		```
		- #### $plus$eq
		
		
		
		```
		protected static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson") $plus$eq​(scala.Function1<com.fasterxml.jackson.databind.Module.SetupContext,​scala.runtime.BoxedUnit> init)
		```
		- #### $plus$eq
		
		
		
		```
		protected static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson") $plus$eq​(com.fasterxml.jackson.databind.ser.Serializers ser)
		```
		- #### $plus$eq
		
		
		
		```
		protected static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson") $plus$eq​(com.fasterxml.jackson.databind.deser.Deserializers deser)
		```
		- #### $plus$eq
		
		
		
		```
		protected static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson") $plus$eq​(com.fasterxml.jackson.databind.type.TypeModifier typeMod)
		```
		- #### $plus$eq
		
		
		
		```
		protected static [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson") $plus$eq​(com.fasterxml.jackson.databind.ser.BeanSerializerModifier beanSerMod)
		```
		- #### akka$serialization$jackson$JacksonModule$$initializers
		
		
		
		```
		public static scala.collection.mutable.Builder<scala.Function1<com.fasterxml.jackson.databind.Module.SetupContext,​scala.runtime.BoxedUnit>,​scala.collection.immutable.Seq<scala.Function1<com.fasterxml.jackson.databind.Module.SetupContext,​scala.runtime.BoxedUnit>>> akka$serialization$jackson$JacksonModule$$initializers()
		```
		- #### akka$serialization$jackson$JacksonModule$\_setter\_$akka$serialization$jackson$JacksonModule$$initializers\_$eq
		
		
		
		```
		protected static final void akka$serialization$jackson$JacksonModule$_setter_$akka$serialization$jackson$JacksonModule$$initializers_$eq​(scala.collection.mutable.Builder<scala.Function1<com.fasterxml.jackson.databind.Module.SetupContext,​scala.runtime.BoxedUnit>,​scala.collection.immutable.Seq<scala.Function1<com.fasterxml.jackson.databind.Module.SetupContext,​scala.runtime.BoxedUnit>>> x$1)
		```
		- #### getModuleName
		
		
		
		```
		public java.lang.String getModuleName()
		```
		
		
		Specified by:
		`getModuleName` in class `com.fasterxml.jackson.databind.Module`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/ActorRefModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AddressModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaJacksonModule$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaStreamJacksonModule$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaTypedJacksonModule$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/FiniteDurationModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.DeserializerResolverByClass.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.SerializerResolverByClass.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaJacksonModule.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaJacksonModule.html)*