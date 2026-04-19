---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.SerializerResolverByClass.html
title: JacksonModule.SerializerResolverByClass
---

# JacksonModule.SerializerResolverByClass

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class JacksonModule.SerializerResolverByClass

- java.lang.Object
- - com.fasterxml.jackson.databind.ser.Serializers.Base
	- - akka.serialization.jackson.JacksonModule.SerializerResolverByClass

- All Implemented Interfaces:
`com.fasterxml.jackson.databind.ser.Serializers`

Enclosing interface:
[JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")

---

```
public static class JacksonModule.SerializerResolverByClass
extends com.fasterxml.jackson.databind.ser.Serializers.Base
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface com.fasterxml.jackson.databind.ser.Serializers
		
		
		`com.fasterxml.jackson.databind.ser.Serializers.Base`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializerResolverByClass](#%3Cinit%3E(java.lang.Class,scala.Function0))​(java.lang.Class<?> clazz,  scala.Function0<com.fasterxml.jackson.databind.JsonSerializer<?>> deserializer)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.fasterxml.jackson.databind.JsonSerializer<?>` | `[findSerializer](#findSerializer(com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription))​(com.fasterxml.jackson.databind.SerializationConfig config,  com.fasterxml.jackson.databind.JavaType javaType,  com.fasterxml.jackson.databind.BeanDescription beanDesc)` |  |
	
	
		- ### Methods inherited from class com.fasterxml.jackson.databind.ser.Serializers.Base
		
		
		`findArraySerializer, findCollectionLikeSerializer, findCollectionSerializer, findMapLikeSerializer, findMapSerializer, findReferenceSerializer`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SerializerResolverByClass
		
		
		
		```
		public SerializerResolverByClass​(java.lang.Class<?> clazz,
		                                 scala.Function0<com.fasterxml.jackson.databind.JsonSerializer<?>> deserializer)
		```

	- ### Method Detail
	
	
	
		- #### findSerializer
		
		
		
		```
		public com.fasterxml.jackson.databind.JsonSerializer<?> findSerializer​(com.fasterxml.jackson.databind.SerializationConfig config,
		                                                                       com.fasterxml.jackson.databind.JavaType javaType,
		                                                                       com.fasterxml.jackson.databind.BeanDescription beanDesc)
		```
		
		
		Specified by:
		`findSerializer` in interface `com.fasterxml.jackson.databind.ser.Serializers`
		Overrides:
		`findSerializer` in class `com.fasterxml.jackson.databind.ser.Serializers.Base`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.SerializerResolverByClass.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.SerializerResolverByClass.html)*