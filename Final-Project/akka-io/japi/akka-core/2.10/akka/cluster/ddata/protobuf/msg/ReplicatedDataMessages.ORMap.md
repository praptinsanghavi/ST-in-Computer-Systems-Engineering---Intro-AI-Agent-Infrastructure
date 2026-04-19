---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:01:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.EntryOrBuilder.html
title: ReplicatedDataMessages.ORMap.EntryOrBuilder
---

# ReplicatedDataMessages.ORMap.EntryOrBuilder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Interface ReplicatedDataMessages.ORMap.EntryOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ReplicatedDataMessages.ORMap.Entry](ReplicatedDataMessages.ORMap.Entry.html "class in akka.cluster.ddata.protobuf.msg")`, `[ReplicatedDataMessages.ORMap.Entry.Builder](ReplicatedDataMessages.ORMap.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")`

Enclosing class:
[ReplicatedDataMessages.ORMap](ReplicatedDataMessages.ORMap.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static interface ReplicatedDataMessages.ORMap.EntryOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[getIntKey](#getIntKey())()` | `optional sint32 intKey = 3;` |
	| `long` | `[getLongKey](#getLongKey())()` | `optional sint64 longKey = 4;` |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOtherKey](#getOtherKey())()` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getOtherKeyOrBuilder](#getOtherKeyOrBuilder())()` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `java.lang.String` | `[getStringKey](#getStringKey())()` | `optional string stringKey = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getStringKeyBytes](#getStringKeyBytes())()` | `optional string stringKey = 1;` |
	| `[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg")` | `[getValue](#getValue())()` | `required .akka.cluster.ddata.OtherMessage value = 2;` |
	| `[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getValueOrBuilder](#getValueOrBuilder())()` | `required .akka.cluster.ddata.OtherMessage value = 2;` |
	| `boolean` | `[hasIntKey](#hasIntKey())()` | `optional sint32 intKey = 3;` |
	| `boolean` | `[hasLongKey](#hasLongKey())()` | `optional sint64 longKey = 4;` |
	| `boolean` | `[hasOtherKey](#hasOtherKey())()` | `optional .akka.cluster.ddata.OtherMessage otherKey = 5;` |
	| `boolean` | `[hasStringKey](#hasStringKey())()` | `optional string stringKey = 1;` |
	| `boolean` | `[hasValue](#hasValue())()` | `required .akka.cluster.ddata.OtherMessage value = 2;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasStringKey
		
		
		
		```
		boolean hasStringKey()
		```
		
		`optional string stringKey = 1;`
		
		Returns:
		Whether the stringKey field is set.
		- #### getStringKey
		
		
		
		```
		java.lang.String getStringKey()
		```
		
		`optional string stringKey = 1;`
		
		Returns:
		The stringKey.
		- #### getStringKeyBytes
		
		
		
		```
		akka.protobufv3.internal.ByteString getStringKeyBytes()
		```
		
		`optional string stringKey = 1;`
		
		Returns:
		The bytes for stringKey.
		- #### hasValue
		
		
		
		```
		boolean hasValue()
		```
		
		`required .akka.cluster.ddata.OtherMessage value = 2;`
		
		Returns:
		Whether the value field is set.
		- #### getValue
		
		
		
		```
		[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getValue()
		```
		
		`required .akka.cluster.ddata.OtherMessage value = 2;`
		
		Returns:
		The value.
		- #### getValueOrBuilder
		
		
		
		```
		[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getValueOrBuilder()
		```
		
		`required .akka.cluster.ddata.OtherMessage value = 2;`
		- #### hasIntKey
		
		
		
		```
		boolean hasIntKey()
		```
		
		`optional sint32 intKey = 3;`
		
		Returns:
		Whether the intKey field is set.
		- #### getIntKey
		
		
		
		```
		int getIntKey()
		```
		
		`optional sint32 intKey = 3;`
		
		Returns:
		The intKey.
		- #### hasLongKey
		
		
		
		```
		boolean hasLongKey()
		```
		
		`optional sint64 longKey = 4;`
		
		Returns:
		Whether the longKey field is set.
		- #### getLongKey
		
		
		
		```
		long getLongKey()
		```
		
		`optional sint64 longKey = 4;`
		
		Returns:
		The longKey.
		- #### hasOtherKey
		
		
		
		```
		boolean hasOtherKey()
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		
		Returns:
		Whether the otherKey field is set.
		- #### getOtherKey
		
		
		
		```
		[ReplicatorMessages.OtherMessage](ReplicatorMessages.OtherMessage.html "class in akka.cluster.ddata.protobuf.msg") getOtherKey()
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`
		
		Returns:
		The otherKey.
		- #### getOtherKeyOrBuilder
		
		
		
		```
		[ReplicatorMessages.OtherMessageOrBuilder](ReplicatorMessages.OtherMessageOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getOtherKeyOrBuilder()
		```
		
		`optional .akka.cluster.ddata.OtherMessage otherKey = 5;`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.OtherMessageOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.EntryOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORMap.EntryOrBuilder.html)*