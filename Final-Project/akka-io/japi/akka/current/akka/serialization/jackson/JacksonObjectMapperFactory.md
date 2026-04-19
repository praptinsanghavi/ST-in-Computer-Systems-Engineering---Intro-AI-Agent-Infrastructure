---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperFactory.html
title: JacksonObjectMapperFactory
---

# JacksonObjectMapperFactory

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class JacksonObjectMapperFactory

- java.lang.Object
- - akka.serialization.jackson.JacksonObjectMapperFactory

- ---

```
public class JacksonObjectMapperFactory
extends java.lang.Object
```

Used with [`JacksonObjectMapperProviderSetup`](JacksonObjectMapperProviderSetup.html "class in akka.serialization.jackson") for defining a `JacksonObjectMapperProvider` that can be
 passed in when ActorSystem is created rather than creating one from configured class name.
 Create a subclass and override the methods to amend the defaults.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JacksonObjectMapperFactory](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.fasterxml.jackson.databind.ObjectMapper` | `[newObjectMapper](#newObjectMapper(java.lang.String,com.fasterxml.jackson.core.JsonFactory))​(java.lang.String bindingName,  com.fasterxml.jackson.core.JsonFactory jsonFactory)` | Override this method to create a new custom instance of `ObjectMapper` for the given `serializerIdentifier`. |
	| `scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.DeserializationFeature,​java.lang.Object>>` | `[overrideConfiguredDeserializationFeatures](#overrideConfiguredDeserializationFeatures(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String bindingName,  scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.DeserializationFeature,​java.lang.Object>> configuredFeatures)` | After construction of the `ObjectMapper` the configured deserialization features are applied to  the mapper. |
	| `scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.JsonGenerator.Feature,​java.lang.Object>>` | `[overrideConfiguredJsonGeneratorFeatures](#overrideConfiguredJsonGeneratorFeatures(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String bindingName,  scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.JsonGenerator.Feature,​java.lang.Object>> configuredFeatures)` | After construction of the `ObjectMapper` the configured JSON generator features are applied to  the mapper. |
	| `scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.JsonParser.Feature,​java.lang.Object>>` | `[overrideConfiguredJsonParserFeatures](#overrideConfiguredJsonParserFeatures(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String bindingName,  scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.JsonParser.Feature,​java.lang.Object>> configuredFeatures)` | After construction of the `ObjectMapper` the configured JSON parser features are applied to  the mapper. |
	| `scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.json.JsonReadFeature,​java.lang.Object>>` | `[overrideConfiguredJsonReadFeatures](#overrideConfiguredJsonReadFeatures(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String bindingName,  scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.json.JsonReadFeature,​java.lang.Object>> configuredFeatures)` | `JsonReadFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create  an `ObjectMapper`. |
	| `scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.json.JsonWriteFeature,​java.lang.Object>>` | `[overrideConfiguredJsonWriteFeatures](#overrideConfiguredJsonWriteFeatures(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String bindingName,  scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.json.JsonWriteFeature,​java.lang.Object>> configuredFeatures)` | `JsonWriteFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create  an `ObjectMapper`. |
	| `scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.MapperFeature,​java.lang.Object>>` | `[overrideConfiguredMapperFeatures](#overrideConfiguredMapperFeatures(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String bindingName,  scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.MapperFeature,​java.lang.Object>> configuredFeatures)` | After construction of the `ObjectMapper` the configured mapper features are applied to  the mapper. |
	| `scala.collection.immutable.Seq<com.fasterxml.jackson.databind.Module>` | `[overrideConfiguredModules](#overrideConfiguredModules(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String bindingName,  scala.collection.immutable.Seq<com.fasterxml.jackson.databind.Module> configuredModules)` | After construction of the `ObjectMapper` the configured modules are added to  the mapper. |
	| `scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.SerializationFeature,​java.lang.Object>>` | `[overrideConfiguredSerializationFeatures](#overrideConfiguredSerializationFeatures(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String bindingName,  scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.SerializationFeature,​java.lang.Object>> configuredFeatures)` | After construction of the `ObjectMapper` the configured serialization features are applied to  the mapper. |
	| `scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.StreamReadFeature,​java.lang.Object>>` | `[overrideConfiguredStreamReadFeatures](#overrideConfiguredStreamReadFeatures(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String bindingName,  scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.StreamReadFeature,​java.lang.Object>> configuredFeatures)` | `StreamReadFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create  an `ObjectMapper`. |
	| `scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.StreamWriteFeature,​java.lang.Object>>` | `[overrideConfiguredStreamWriteFeatures](#overrideConfiguredStreamWriteFeatures(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String bindingName,  scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.StreamWriteFeature,​java.lang.Object>> configuredFeatures)` | `StreamWriteFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create  an `ObjectMapper`. |
	| `scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.annotation.PropertyAccessor,​com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility>>` | `[overrideConfiguredVisibility](#overrideConfiguredVisibility(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String bindingName,  scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.annotation.PropertyAccessor,​com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility>> configuredFeatures)` | Visibility settings used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create  an `ObjectMapper`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JacksonObjectMapperFactory
		
		
		
		```
		public JacksonObjectMapperFactory()
		```

	- ### Method Detail
	
	
	
		- #### newObjectMapper
		
		
		
		```
		public com.fasterxml.jackson.databind.ObjectMapper newObjectMapper​(java.lang.String bindingName,
		                                                                   com.fasterxml.jackson.core.JsonFactory jsonFactory)
		```
		
		Override this method to create a new custom instance of `ObjectMapper` for the given `serializerIdentifier`.
		 
		
		Parameters:
		`bindingName` \- name of this `ObjectMapper`
		`jsonFactory` \- optional `JsonFactory` such as `CBORFactory`, for plain JSON `None` (defaults)
		 can be used
		- #### overrideConfiguredDeserializationFeatures
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.DeserializationFeature,​java.lang.Object>> overrideConfiguredDeserializationFeatures​(java.lang.String bindingName,
		                                                                                                                                                                            scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.DeserializationFeature,​java.lang.Object>> configuredFeatures)
		```
		
		After construction of the `ObjectMapper` the configured deserialization features are applied to
		 the mapper. These features can be amended programatically by overriding this method and
		 return the features that are to be applied to the `ObjectMapper`.
		 
		 When implementing a `JacksonObjectMapperFactory` with Java the `immutable.Seq` can be
		 created with `akka.japi.Util.immutableSeq`.
		 
		
		
		
		Parameters:
		`bindingName` \- bindingName name of this `ObjectMapper`
		`configuredFeatures` \- the list of `DeserializationFeature` that were configured in
		 `akka.serialization.jackson.deserialization-features`
		- #### overrideConfiguredJsonGeneratorFeatures
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.JsonGenerator.Feature,​java.lang.Object>> overrideConfiguredJsonGeneratorFeatures​(java.lang.String bindingName,
		                                                                                                                                                                     scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.JsonGenerator.Feature,​java.lang.Object>> configuredFeatures)
		```
		
		After construction of the `ObjectMapper` the configured JSON generator features are applied to
		 the mapper. These features can be amended programmatically by overriding this method and
		 return the features that are to be applied to the `ObjectMapper`.
		 
		
		Parameters:
		`bindingName` \- bindingName name of this `ObjectMapper`
		`configuredFeatures` \- the list of `JsonGenerator.Feature` that were configured in `akka.serialization.jackson.json-generator-features`
		- #### overrideConfiguredJsonParserFeatures
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.JsonParser.Feature,​java.lang.Object>> overrideConfiguredJsonParserFeatures​(java.lang.String bindingName,
		                                                                                                                                                               scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.JsonParser.Feature,​java.lang.Object>> configuredFeatures)
		```
		
		After construction of the `ObjectMapper` the configured JSON parser features are applied to
		 the mapper. These features can be amended programmatically by overriding this method and
		 return the features that are to be applied to the `ObjectMapper`.
		 
		
		Parameters:
		`bindingName` \- bindingName name of this `ObjectMapper`
		`configuredFeatures` \- the list of `JsonParser.Feature` that were configured in `akka.serialization.jackson.json-parser-features`
		- #### overrideConfiguredJsonReadFeatures
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.json.JsonReadFeature,​java.lang.Object>> overrideConfiguredJsonReadFeatures​(java.lang.String bindingName,
		                                                                                                                                                               scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.json.JsonReadFeature,​java.lang.Object>> configuredFeatures)
		```
		
		`JsonReadFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
		 an `ObjectMapper`. These features can be amended programmatically by overriding this method and return the features
		 that are to be applied to the `JsonFactoryBuilder`.
		 
		
		Parameters:
		`bindingName` \- bindingName name of this `ObjectMapper`
		`configuredFeatures` \- the list of `JsonReadFeature` that were configured in `akka.serialization.jackson.json-read-features`
		- #### overrideConfiguredJsonWriteFeatures
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.json.JsonWriteFeature,​java.lang.Object>> overrideConfiguredJsonWriteFeatures​(java.lang.String bindingName,
		                                                                                                                                                                 scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.json.JsonWriteFeature,​java.lang.Object>> configuredFeatures)
		```
		
		`JsonWriteFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
		 an `ObjectMapper`. These features can be amended programmatically by overriding this method and return the features
		 that are to be applied to the `JsonFactoryBuilder`.
		 
		
		Parameters:
		`bindingName` \- bindingName name of this `ObjectMapper`
		`configuredFeatures` \- the list of `JsonWriteFeature` that were configured in `akka.serialization.jackson.json-write-features`
		- #### overrideConfiguredMapperFeatures
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.MapperFeature,​java.lang.Object>> overrideConfiguredMapperFeatures​(java.lang.String bindingName,
		                                                                                                                                                          scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.MapperFeature,​java.lang.Object>> configuredFeatures)
		```
		
		After construction of the `ObjectMapper` the configured mapper features are applied to
		 the mapper. These features can be amended programmatically by overriding this method and
		 return the features that are to be applied to the `ObjectMapper`.
		 
		
		Parameters:
		`bindingName` \- bindingName name of this `ObjectMapper`
		`configuredFeatures` \- the list of `MapperFeatures` that were configured in `akka.serialization.jackson.mapper-features`
		- #### overrideConfiguredModules
		
		
		
		```
		public scala.collection.immutable.Seq<com.fasterxml.jackson.databind.Module> overrideConfiguredModules​(java.lang.String bindingName,
		                                                                                                       scala.collection.immutable.Seq<com.fasterxml.jackson.databind.Module> configuredModules)
		```
		
		After construction of the `ObjectMapper` the configured modules are added to
		 the mapper. These modules can be amended programatically by overriding this method and
		 return the modules that are to be applied to the `ObjectMapper`.
		 
		 When implementing a `JacksonObjectMapperFactory` with Java the `immutable.Seq` can be
		 created with `akka.japi.Util.immutableSeq`.
		 
		
		
		
		Parameters:
		`bindingName` \- bindingName name of this `ObjectMapper`
		`configuredModules` \- the list of `Modules` that were configured in
		 `akka.serialization.jackson.deserialization-features`
		- #### overrideConfiguredSerializationFeatures
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.SerializationFeature,​java.lang.Object>> overrideConfiguredSerializationFeatures​(java.lang.String bindingName,
		                                                                                                                                                                        scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.databind.SerializationFeature,​java.lang.Object>> configuredFeatures)
		```
		
		After construction of the `ObjectMapper` the configured serialization features are applied to
		 the mapper. These features can be amended programatically by overriding this method and
		 return the features that are to be applied to the `ObjectMapper`.
		 
		 When implementing a `JacksonObjectMapperFactory` with Java the `immutable.Seq` can be
		 created with `akka.japi.Util.immutableSeq`.
		 
		
		
		
		Parameters:
		`bindingName` \- bindingName name of this `ObjectMapper`
		`configuredFeatures` \- the list of `SerializationFeature` that were configured in
		 `akka.serialization.jackson.serialization-features`
		- #### overrideConfiguredStreamReadFeatures
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.StreamReadFeature,​java.lang.Object>> overrideConfiguredStreamReadFeatures​(java.lang.String bindingName,
		                                                                                                                                                              scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.StreamReadFeature,​java.lang.Object>> configuredFeatures)
		```
		
		`StreamReadFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
		 an `ObjectMapper`. These features can be amended programmatically by overriding this method and return the features
		 that are to be applied to the `JsonFactoryBuilder`.
		 
		
		Parameters:
		`bindingName` \- bindingName name of this `ObjectMapper`
		`configuredFeatures` \- the list of `StreamReadFeature` that were configured in `akka.serialization.jackson.stream-read-features`
		- #### overrideConfiguredStreamWriteFeatures
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.StreamWriteFeature,​java.lang.Object>> overrideConfiguredStreamWriteFeatures​(java.lang.String bindingName,
		                                                                                                                                                                scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.core.StreamWriteFeature,​java.lang.Object>> configuredFeatures)
		```
		
		`StreamWriteFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
		 an `ObjectMapper`. These features can be amended programmatically by overriding this method and return the features
		 that are to be applied to the `JsonFactoryBuilder`.
		 
		
		Parameters:
		`bindingName` \- bindingName name of this `ObjectMapper`
		`configuredFeatures` \- the list of `StreamWriterFeature` that were configured in `akka.serialization.jackson.stream-write-features`
		- #### overrideConfiguredVisibility
		
		
		
		```
		public scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.annotation.PropertyAccessor,​com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility>> overrideConfiguredVisibility​(java.lang.String bindingName,
		                                                                                                                                                                                                     scala.collection.immutable.Seq<scala.Tuple2<com.fasterxml.jackson.annotation.PropertyAccessor,​com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility>> configuredFeatures)
		```
		
		Visibility settings used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
		 an `ObjectMapper`. These settings can be amended programmatically by overriding this method and return the values
		 that are to be applied to the `JsonFactoryBuilder`.
		 
		
		Parameters:
		`bindingName` \- bindingName name of this `ObjectMapper`
		`configuredFeatures` \- the list of `PropertyAccessor`/`JsonAutoDetect.Visibility` that were configured in
		 `akka.serialization.jackson.visibility`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperFactory.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonObjectMapperFactory.html)*