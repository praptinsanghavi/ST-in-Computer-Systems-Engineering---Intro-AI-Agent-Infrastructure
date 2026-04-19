---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/FiniteDurationModule.html
title: FiniteDurationModule
---

# FiniteDurationModule

## Content

Package [akka.serialization.jackson](package-summary.html)
## Interface FiniteDurationModule

- All Superinterfaces:
`[JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")`

All Known Implementing Classes:
`[AkkaJacksonModule](AkkaJacksonModule.html "class in akka.serialization.jackson")`, `[AkkaJacksonModule$](AkkaJacksonModule$.html "class in akka.serialization.jackson")`, `[AkkaStreamJacksonModule$](AkkaStreamJacksonModule$.html "class in akka.serialization.jackson")`, `[AkkaTypedJacksonModule$](AkkaTypedJacksonModule$.html "class in akka.serialization.jackson")`

---

```
public interface FiniteDurationModule
extends [JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")
```

INTERNAL API: Adds support for serializing and deserializing `FiniteDuration`.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.serialization.jackson.[JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")
		
		
		`[JacksonModule.DeserializerResolverByClass](JacksonModule.DeserializerResolverByClass.html "class in akka.serialization.jackson"), [JacksonModule.SerializerResolverByClass](JacksonModule.SerializerResolverByClass.html "class in akka.serialization.jackson")`

	- ### Method Summary
	
	
		- ### Methods inherited from interface akka.serialization.jackson.[JacksonModule](JacksonModule.html "interface in akka.serialization.jackson")
		
		
		`[$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.deser.Deserializers)), [$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.ser.BeanSerializerModifier)), [$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.ser.Serializers)), [$plus$eq](JacksonModule.html#$plus$eq(com.fasterxml.jackson.databind.type.TypeModifier)), [$plus$eq](JacksonModule.html#$plus$eq(scala.Function1)), [addSerializer](JacksonModule.html#addSerializer(java.lang.Class,scala.Function0,scala.Function0)), [setupModule](JacksonModule.html#setupModule(com.fasterxml.jackson.databind.Module.SetupContext)), [version](JacksonModule.html#version())`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaJacksonModule$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaJacksonModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaStreamJacksonModule$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/AkkaTypedJacksonModule$.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.DeserializerResolverByClass.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.SerializerResolverByClass.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonModule.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/FiniteDurationModule.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/FiniteDurationModule.html)*