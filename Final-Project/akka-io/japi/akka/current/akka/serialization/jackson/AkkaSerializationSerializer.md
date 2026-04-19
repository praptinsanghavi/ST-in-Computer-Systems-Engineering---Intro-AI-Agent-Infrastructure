---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaSerializationSerializer.html
title: AkkaSerializationSerializer
---

# AkkaSerializationSerializer

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class AkkaSerializationSerializer

- java.lang.Object
- - com.fasterxml.jackson.databind.JsonSerializer\<T\>
	- - com.fasterxml.jackson.databind.ser.std.StdSerializer\<T\>
		- - com.fasterxml.jackson.databind.ser.std.StdScalarSerializer\<java.lang.Object\>
			- - akka.serialization.jackson.AkkaSerializationSerializer

- All Implemented Interfaces:
`[ActorSystemAccess](ActorSystemAccess.html "interface in akka.serialization.jackson")`, `com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable`, `com.fasterxml.jackson.databind.jsonschema.SchemaAware`, `java.io.Serializable`

---

```
public final class AkkaSerializationSerializer
extends com.fasterxml.jackson.databind.ser.std.StdScalarSerializer<java.lang.Object>
implements [ActorSystemAccess](ActorSystemAccess.html "interface in akka.serialization.jackson")
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.serialization.jackson.AkkaSerializationSerializer)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class com.fasterxml.jackson.databind.JsonSerializer
		
		
		`com.fasterxml.jackson.databind.JsonSerializer.None`

	- ### Field Summary
	
	
		- ### Fields inherited from class com.fasterxml.jackson.databind.ser.std.StdSerializer
		
		
		`_handledType`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AkkaSerializationSerializer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Serialization](../Serialization.html "class in akka.serialization")` | `[serialization](#serialization())()` |  |
	| `void` | `[serialize](#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider))​(java.lang.Object value,  com.fasterxml.jackson.core.JsonGenerator jgen,  com.fasterxml.jackson.databind.SerializerProvider provider)` |  |
	
	
		- ### Methods inherited from class com.fasterxml.jackson.databind.ser.std.StdScalarSerializer
		
		
		`acceptJsonFormatVisitor, getSchema, serializeWithType`
		- ### Methods inherited from class com.fasterxml.jackson.databind.ser.std.StdSerializer
		
		
		`_neitherNull, _nonEmpty, createSchemaNode, createSchemaNode, findAnnotatedContentSerializer, findContextualConvertingSerializer, findConvertingContentSerializer, findFormatFeature, findFormatOverrides, findIncludeOverrides, findPropertyFilter, getSchema, handledType, isDefaultSerializer, visitArrayFormat, visitArrayFormat, visitFloatFormat, visitIntFormat, visitIntFormat, visitStringFormat, visitStringFormat, wrapAndThrow, wrapAndThrow`
		- ### Methods inherited from class com.fasterxml.jackson.databind.JsonSerializer
		
		
		`getDelegatee, isEmpty, isEmpty, isUnwrappingSerializer, properties, replaceDelegatee, unwrappingSerializer, usesObjectId, withFilterId, withIgnoredProperties`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.jackson.[ActorSystemAccess](ActorSystemAccess.html "interface in akka.serialization.jackson")
		
		
		`[currentSystem](ActorSystemAccess.html#currentSystem())`

- - ### Constructor Detail
	
	
	
		- #### AkkaSerializationSerializer
		
		
		
		```
		public AkkaSerializationSerializer()
		```

	- ### Method Detail
	
	
	
		- #### serialization
		
		
		
		```
		public [Serialization](../Serialization.html "class in akka.serialization") serialization()
		```
		- #### serialize
		
		
		
		```
		public void serialize​(java.lang.Object value,
		                      com.fasterxml.jackson.core.JsonGenerator jgen,
		                      com.fasterxml.jackson.databind.SerializerProvider provider)
		```
		
		
		Specified by:
		`serialize` in class `com.fasterxml.jackson.databind.ser.std.StdSerializer<java.lang.Object>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/ActorSystemAccess.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaSerializationSerializer.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaSerializationSerializer.html)*