---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:02:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaOp.html
title: ReplicatedDataMessages.ORSetDeltaOp
---

# ReplicatedDataMessages.ORSetDeltaOp

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Enum ReplicatedDataMessages.ORSetDeltaOp

- java.lang.Object
- - java.lang.Enum\<[ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")\>
	- - akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaOp

- All Implemented Interfaces:
`akka.protobufv3.internal.Internal.EnumLite`, `akka.protobufv3.internal.ProtocolMessageEnum`, `java.io.Serializable`, `java.lang.Comparable<[ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")>`

Enclosing class:
[ReplicatedDataMessages](ReplicatedDataMessages.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static enum ReplicatedDataMessages.ORSetDeltaOp
extends java.lang.Enum<[ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")>
implements akka.protobufv3.internal.ProtocolMessageEnum
```

Protobuf enum `akka.cluster.ddata.ORSetDeltaOp`

- - ### Enum Constant Summary
	
	
	
	Enum Constants 
	| Enum Constant | Description |
	| `[Add](#Add)` | `Add = 0;` |
	| `[Full](#Full)` | `Full = 2;` |
	| `[Remove](#Remove)` | `Remove = 1;` |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[Add_VALUE](#Add_VALUE)` | `Add = 0;` |
	| `static int` | `[Full_VALUE](#Full_VALUE)` | `Full = 2;` |
	| `static int` | `[Remove_VALUE](#Remove_VALUE)` | `Remove = 1;` |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")` | `[forNumber](#forNumber(int))​(int value)` |  |
	| `static akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getNumber](#getNumber())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumValueDescriptor` | `[getValueDescriptor](#getValueDescriptor())()` |  |
	| `static akka.protobufv3.internal.Internal.EnumLiteMap<[ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")>` | `[internalGetValueMap](#internalGetValueMap())()` |  |
	| `static [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")` | `[valueOf](#valueOf(int))​(int value)` | Deprecated. |
	| `static [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")` | `[valueOf](#valueOf(akka.protobufv3.internal.Descriptors.EnumValueDescriptor))​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)` | Returns the enum constant of this type with the specified name. |
	| `static [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### Add
		
		
		
		```
		public static final [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") Add
		```
		
		`Add = 0;`
		- #### Remove
		
		
		
		```
		public static final [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") Remove
		```
		
		`Remove = 1;`
		- #### Full
		
		
		
		```
		public static final [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") Full
		```
		
		`Full = 2;`

	- ### Field Detail
	
	
	
		- #### Add\_VALUE
		
		
		
		```
		public static final int Add_VALUE
		```
		
		`Add = 0;`
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaOp.Add_VALUE)
		- #### Remove\_VALUE
		
		
		
		```
		public static final int Remove_VALUE
		```
		
		`Remove = 1;`
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaOp.Remove_VALUE)
		- #### Full\_VALUE
		
		
		
		```
		public static final int Full_VALUE
		```
		
		`Full = 2;`
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.ddata.protobuf.msg.ReplicatedDataMessages.ORSetDeltaOp.Full_VALUE)

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (ReplicatedDataMessages.ORSetDeltaOp c : ReplicatedDataMessages.ORSetDeltaOp.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") valueOf​(java.lang.String name)
		```
		
		Returns the enum constant of this type with the specified name.
		The string must match *exactly* an identifier used to declare an
		enum constant in this type. (Extraneous whitespace characters are 
		not permitted.)
		
		Parameters:
		`name` \- the name of the enum constant to be returned.
		Returns:
		the enum constant with the specified name
		Throws:
		`java.lang.IllegalArgumentException` \- if this enum type has no constant with the specified name
		`java.lang.NullPointerException` \- if the argument is null
		- #### getNumber
		
		
		
		```
		public final int getNumber()
		```
		
		
		Specified by:
		`getNumber` in interface `akka.protobufv3.internal.Internal.EnumLite`
		Specified by:
		`getNumber` in interface `akka.protobufv3.internal.ProtocolMessageEnum`
		- #### valueOf
		
		
		
		```
		@Deprecated
		public static [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") valueOf​(int value)
		```
		
		Deprecated.
		Returns the enum constant of this type with the specified name.
		The string must match *exactly* an identifier used to declare an
		enum constant in this type. (Extraneous whitespace characters are 
		not permitted.)
		
		Parameters:
		`value` \- the name of the enum constant to be returned.
		Returns:
		the enum constant with the specified name
		Throws:
		`java.lang.IllegalArgumentException` \- if this enum type has no constant with the specified name
		`java.lang.NullPointerException` \- if the argument is null
		- #### forNumber
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") forNumber​(int value)
		```
		
		
		Parameters:
		`value` \- The numeric wire value of the corresponding enum entry.
		Returns:
		The enum associated with the given numeric wire value.
		- #### internalGetValueMap
		
		
		
		```
		public static akka.protobufv3.internal.Internal.EnumLiteMap<[ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")> internalGetValueMap()
		```
		- #### getValueDescriptor
		
		
		
		```
		public final akka.protobufv3.internal.Descriptors.EnumValueDescriptor getValueDescriptor()
		```
		
		
		Specified by:
		`getValueDescriptor` in interface `akka.protobufv3.internal.ProtocolMessageEnum`
		- #### getDescriptorForType
		
		
		
		```
		public final akka.protobufv3.internal.Descriptors.EnumDescriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.ProtocolMessageEnum`
		- #### getDescriptor
		
		
		
		```
		public static final akka.protobufv3.internal.Descriptors.EnumDescriptor getDescriptor()
		```
		- #### valueOf
		
		
		
		```
		public static [ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") valueOf​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)
		```
		
		Returns the enum constant of this type with the specified name.
		The string must match *exactly* an identifier used to declare an
		enum constant in this type. (Extraneous whitespace characters are 
		not permitted.)
		
		Parameters:
		`desc` \- the name of the enum constant to be returned.
		Returns:
		the enum constant with the specified name
		Throws:
		`java.lang.IllegalArgumentException` \- if this enum type has no constant with the specified name
		`java.lang.NullPointerException` \- if the argument is null

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/constant-values.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaOp.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaOp.html)*