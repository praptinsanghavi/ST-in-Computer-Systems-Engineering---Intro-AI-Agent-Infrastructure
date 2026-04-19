---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:05:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.Type.html
title: ClusterMessages.ConfigCheck.Type
---

# ClusterMessages.ConfigCheck.Type

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Enum ClusterMessages.ConfigCheck.Type

- java.lang.Object
- - java.lang.Enum\<[ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")\>
	- - akka.cluster.protobuf.msg.ClusterMessages.ConfigCheck.Type

- All Implemented Interfaces:
`akka.protobufv3.internal.Internal.EnumLite`, `akka.protobufv3.internal.ProtocolMessageEnum`, `java.io.Serializable`, `java.lang.Comparable<[ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")>`

Enclosing class:
[ClusterMessages.ConfigCheck](ClusterMessages.ConfigCheck.html "class in akka.cluster.protobuf.msg")

---

```
public static enum ClusterMessages.ConfigCheck.Type
extends java.lang.Enum<[ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")>
implements akka.protobufv3.internal.ProtocolMessageEnum
```

Protobuf enum `ConfigCheck.Type`

- - ### Enum Constant Summary
	
	
	
	Enum Constants 
	| Enum Constant | Description |
	| `[CompatibleConfig](#CompatibleConfig)` | `CompatibleConfig = 3;` |
	| `[IncompatibleConfig](#IncompatibleConfig)` | `IncompatibleConfig = 2;` |
	| `[UncheckedConfig](#UncheckedConfig)` | `UncheckedConfig = 1;` |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[CompatibleConfig_VALUE](#CompatibleConfig_VALUE)` | `CompatibleConfig = 3;` |
	| `static int` | `[IncompatibleConfig_VALUE](#IncompatibleConfig_VALUE)` | `IncompatibleConfig = 2;` |
	| `static int` | `[UncheckedConfig_VALUE](#UncheckedConfig_VALUE)` | `UncheckedConfig = 1;` |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")` | `[forNumber](#forNumber(int))​(int value)` |  |
	| `static akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getNumber](#getNumber())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumValueDescriptor` | `[getValueDescriptor](#getValueDescriptor())()` |  |
	| `static akka.protobufv3.internal.Internal.EnumLiteMap<[ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")>` | `[internalGetValueMap](#internalGetValueMap())()` |  |
	| `static [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")` | `[valueOf](#valueOf(int))​(int value)` | Deprecated. |
	| `static [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")` | `[valueOf](#valueOf(akka.protobufv3.internal.Descriptors.EnumValueDescriptor))​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)` | Returns the enum constant of this type with the specified name. |
	| `static [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### UncheckedConfig
		
		
		
		```
		public static final [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg") UncheckedConfig
		```
		
		`UncheckedConfig = 1;`
		- #### IncompatibleConfig
		
		
		
		```
		public static final [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg") IncompatibleConfig
		```
		
		`IncompatibleConfig = 2;`
		- #### CompatibleConfig
		
		
		
		```
		public static final [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg") CompatibleConfig
		```
		
		`CompatibleConfig = 3;`

	- ### Field Detail
	
	
	
		- #### UncheckedConfig\_VALUE
		
		
		
		```
		public static final int UncheckedConfig_VALUE
		```
		
		`UncheckedConfig = 1;`
		
		See Also:
		[Constant Field Values](../../../../constant-values.html#akka.cluster.protobuf.msg.ClusterMessages.ConfigCheck.Type.UncheckedConfig_VALUE)
		- #### IncompatibleConfig\_VALUE
		
		
		
		```
		public static final int IncompatibleConfig_VALUE
		```
		
		`IncompatibleConfig = 2;`
		
		See Also:
		[Constant Field Values](../../../../constant-values.html#akka.cluster.protobuf.msg.ClusterMessages.ConfigCheck.Type.IncompatibleConfig_VALUE)
		- #### CompatibleConfig\_VALUE
		
		
		
		```
		public static final int CompatibleConfig_VALUE
		```
		
		`CompatibleConfig = 3;`
		
		See Also:
		[Constant Field Values](../../../../constant-values.html#akka.cluster.protobuf.msg.ClusterMessages.ConfigCheck.Type.CompatibleConfig_VALUE)

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (ClusterMessages.ConfigCheck.Type c : ClusterMessages.ConfigCheck.Type.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg") valueOf​(java.lang.String name)
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
		public static [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg") valueOf​(int value)
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
		public static [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg") forNumber​(int value)
		```
		
		
		Parameters:
		`value` \- The numeric wire value of the corresponding enum entry.
		Returns:
		The enum associated with the given numeric wire value.
		- #### internalGetValueMap
		
		
		
		```
		public static akka.protobufv3.internal.Internal.EnumLiteMap<[ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg")> internalGetValueMap()
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
		public static [ClusterMessages.ConfigCheck.Type](ClusterMessages.ConfigCheck.Type.html "enum in akka.cluster.protobuf.msg") valueOf​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)
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

- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.Type.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.html
- https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.Type.html](https://doc.akka.io/japi/akka/current/akka/cluster/protobuf/msg/ClusterMessages.ConfigCheck.Type.html)*