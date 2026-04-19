---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:08:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentStateChangeEventOrBuilder.html
title: MessageFormats.PersistentStateChangeEventOrBuilder
---

# MessageFormats.PersistentStateChangeEventOrBuilder

## Content

Package [akka.persistence.serialization](package-summary.html)
## Interface MessageFormats.PersistentStateChangeEventOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization")`, `[MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization")`

Enclosing class:
[MessageFormats](MessageFormats.html "class in akka.persistence.serialization")

---

```
public static interface MessageFormats.PersistentStateChangeEventOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[getStateIdentifier](#getStateIdentifier())()` | `required string stateIdentifier = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getStateIdentifierBytes](#getStateIdentifierBytes())()` | `required string stateIdentifier = 1;` |
	| `java.lang.String` | `[getTimeout](#getTimeout())()` | not used in new records from 2\.4\.5 |
	| `akka.protobufv3.internal.ByteString` | `[getTimeoutBytes](#getTimeoutBytes())()` | not used in new records from 2\.4\.5 |
	| `long` | `[getTimeoutNanos](#getTimeoutNanos())()` | `optional int64 timeoutNanos = 3;` |
	| `boolean` | `[hasStateIdentifier](#hasStateIdentifier())()` | `required string stateIdentifier = 1;` |
	| `boolean` | `[hasTimeout](#hasTimeout())()` | not used in new records from 2\.4\.5 |
	| `boolean` | `[hasTimeoutNanos](#hasTimeoutNanos())()` | `optional int64 timeoutNanos = 3;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasStateIdentifier
		
		
		
		```
		boolean hasStateIdentifier()
		```
		
		`required string stateIdentifier = 1;`
		
		Returns:
		Whether the stateIdentifier field is set.
		- #### getStateIdentifier
		
		
		
		```
		java.lang.String getStateIdentifier()
		```
		
		`required string stateIdentifier = 1;`
		
		Returns:
		The stateIdentifier.
		- #### getStateIdentifierBytes
		
		
		
		```
		akka.protobufv3.internal.ByteString getStateIdentifierBytes()
		```
		
		`required string stateIdentifier = 1;`
		
		Returns:
		The bytes for stateIdentifier.
		- #### hasTimeout
		
		
		
		```
		boolean hasTimeout()
		```
		
		
		```
		
		not used in new records from 2.4.5
		 
		```
		
		`optional string timeout = 2;`
		
		Returns:
		Whether the timeout field is set.
		- #### getTimeout
		
		
		
		```
		java.lang.String getTimeout()
		```
		
		
		```
		
		not used in new records from 2.4.5
		 
		```
		
		`optional string timeout = 2;`
		
		Returns:
		The timeout.
		- #### getTimeoutBytes
		
		
		
		```
		akka.protobufv3.internal.ByteString getTimeoutBytes()
		```
		
		
		```
		
		not used in new records from 2.4.5
		 
		```
		
		`optional string timeout = 2;`
		
		Returns:
		The bytes for timeout.
		- #### hasTimeoutNanos
		
		
		
		```
		boolean hasTimeoutNanos()
		```
		
		`optional int64 timeoutNanos = 3;`
		
		Returns:
		Whether the timeoutNanos field is set.
		- #### getTimeoutNanos
		
		
		
		```
		long getTimeoutNanos()
		```
		
		`optional int64 timeoutNanos = 3;`
		
		Returns:
		The timeoutNanos.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentStateChangeEventOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/serialization/MessageFormats.PersistentStateChangeEventOrBuilder.html)*