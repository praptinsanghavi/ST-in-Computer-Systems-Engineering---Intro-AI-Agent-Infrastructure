---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaOp.html
title: ReplicatedEventSourcing.ORSetDeltaOp
---

# ReplicatedEventSourcing.ORSetDeltaOp

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Enum ReplicatedEventSourcing.ORSetDeltaOp

- java.lang.Object
- - java.lang.Enum\<[ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")\>
	- - akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSetDeltaOp

- All Implemented Interfaces:
`akka.protobufv3.internal.Internal.EnumLite`, `akka.protobufv3.internal.ProtocolMessageEnum`, `java.io.Serializable`, `java.lang.Comparable<[ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")>`

Enclosing class:
[ReplicatedEventSourcing](ReplicatedEventSourcing.html "class in akka.persistence.typed.serialization")

---

```
public static enum ReplicatedEventSourcing.ORSetDeltaOp
extends java.lang.Enum<[ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")>
implements akka.protobufv3.internal.ProtocolMessageEnum
```

Protobuf enum `ORSetDeltaOp`

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
	| `static [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")` | `[forNumber](#forNumber(int))​(int value)` |  |
	| `static akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getNumber](#getNumber())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumValueDescriptor` | `[getValueDescriptor](#getValueDescriptor())()` |  |
	| `static akka.protobufv3.internal.Internal.EnumLiteMap<[ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")>` | `[internalGetValueMap](#internalGetValueMap())()` |  |
	| `static [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")` | `[valueOf](#valueOf(int))​(int value)` | Deprecated. |
	| `static [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")` | `[valueOf](#valueOf(akka.protobufv3.internal.Descriptors.EnumValueDescriptor))​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)` | Returns the enum constant of this type with the specified name. |
	| `static [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### Add
		
		
		
		```
		public static final [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization") Add
		```
		
		`Add = 0;`
		- #### Remove
		
		
		
		```
		public static final [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization") Remove
		```
		
		`Remove = 1;`
		- #### Full
		
		
		
		```
		public static final [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization") Full
		```
		
		`Full = 2;`

	- ### Field Detail
	
	
	
		- #### Add\_VALUE
		
		
		
		```
		public static final int Add_VALUE
		```
		
		`Add = 0;`
		
		See Also:
		[Constant Field Values](../../../../constant-values.html#akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSetDeltaOp.Add_VALUE)
		- #### Remove\_VALUE
		
		
		
		```
		public static final int Remove_VALUE
		```
		
		`Remove = 1;`
		
		See Also:
		[Constant Field Values](../../../../constant-values.html#akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSetDeltaOp.Remove_VALUE)
		- #### Full\_VALUE
		
		
		
		```
		public static final int Full_VALUE
		```
		
		`Full = 2;`
		
		See Also:
		[Constant Field Values](../../../../constant-values.html#akka.persistence.typed.serialization.ReplicatedEventSourcing.ORSetDeltaOp.Full_VALUE)

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (ReplicatedEventSourcing.ORSetDeltaOp c : ReplicatedEventSourcing.ORSetDeltaOp.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization") valueOf​(java.lang.String name)
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
		public static [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization") valueOf​(int value)
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
		public static [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization") forNumber​(int value)
		```
		
		
		Parameters:
		`value` \- The numeric wire value of the corresponding enum entry.
		Returns:
		The enum associated with the given numeric wire value.
		- #### internalGetValueMap
		
		
		
		```
		public static akka.protobufv3.internal.Internal.EnumLiteMap<[ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")> internalGetValueMap()
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
		public static [ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization") valueOf​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)
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

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaOp.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaOp.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaOp.html)*