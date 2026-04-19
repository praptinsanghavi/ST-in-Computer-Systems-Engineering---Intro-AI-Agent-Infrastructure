---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonMigration.html
title: JacksonMigration
---

# JacksonMigration

## Content

Package [akka.serialization.jackson](package-summary.html)
## Class JacksonMigration

- java.lang.Object
- - akka.serialization.jackson.JacksonMigration

- ---

```
public abstract class JacksonMigration
extends java.lang.Object
```

Data migration of old formats to current format can
 be implemented in a concrete subclass and configured to
 be used by the `JacksonSerializer` for a changed class.
 
 It is used when deserializing data of older version than the
 [`currentVersion()`](#currentVersion()). You implement the transformation of the
 JSON structure in the [`transform(int, com.fasterxml.jackson.databind.JsonNode)`](#transform(int,com.fasterxml.jackson.databind.JsonNode)) method. If you have changed the
 class name you should override [`transformClassName(int, java.lang.String)`](#transformClassName(int,java.lang.String)) and return
 current class name.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JacksonMigration](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract int` | `[currentVersion](#currentVersion())()` | Define current version, that is, the value used when serializing new data. |
	| `int` | `[supportedForwardVersion](#supportedForwardVersion())()` | Define the supported forward version this migration can read (must be greater or equal than `currentVersion`). |
	| `abstract com.fasterxml.jackson.databind.JsonNode` | `[transform](#transform(int,com.fasterxml.jackson.databind.JsonNode))​(int fromVersion,  com.fasterxml.jackson.databind.JsonNode json)` | Implement the transformation of the old JSON structure to the new  JSON structure. |
	| `java.lang.String` | `[transformClassName](#transformClassName(int,java.lang.String))​(int fromVersion,  java.lang.String className)` | Override this method if you have changed the class name. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JacksonMigration
		
		
		
		```
		public JacksonMigration()
		```

	- ### Method Detail
	
	
	
		- #### currentVersion
		
		
		
		```
		public abstract int currentVersion()
		```
		
		Define current version, that is, the value used when serializing new data. The first version, when no
		 migration was used, is always 1\.
		- #### supportedForwardVersion
		
		
		
		```
		public int supportedForwardVersion()
		```
		
		Define the supported forward version this migration can read (must be greater or equal than `currentVersion`).
		 If this value is different from [`currentVersion()`](#currentVersion()) a [`JacksonMigration`](JacksonMigration.html "class in akka.serialization.jackson") may be required to downcast
		 the received payload to the current schema.
		- #### transform
		
		
		
		```
		public abstract com.fasterxml.jackson.databind.JsonNode transform​(int fromVersion,
		                                                                  com.fasterxml.jackson.databind.JsonNode json)
		```
		
		Implement the transformation of the old JSON structure to the new
		 JSON structure. The `JsonNode` is mutable so you can add and remove fields,
		 or change values. Note that you have to cast to specific sub\-classes such
		 as `ObjectNode` and `ArrayNode` to get access to mutators.
		 
		
		Parameters:
		`fromVersion` \- the version of the old data
		`json` \- the old JSON data
		- #### transformClassName
		
		
		
		```
		public java.lang.String transformClassName​(int fromVersion,
		                                           java.lang.String className)
		```
		
		Override this method if you have changed the class name. Return
		 current class name.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonMigration.html
- https://doc.akka.io/japi/akka/current/akka/serialization/jackson/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonMigration.html](https://doc.akka.io/japi/akka/current/akka/serialization/jackson/JacksonMigration.html)*