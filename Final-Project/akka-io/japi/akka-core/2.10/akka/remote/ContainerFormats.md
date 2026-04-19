---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.PatternType.html
title: ContainerFormats.PatternType
---

# ContainerFormats.PatternType

## Content

Package [akka.remote](package-summary.html)
## Enum ContainerFormats.PatternType

- java.lang.Object
- - java.lang.Enum\<[ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")\>
	- - akka.remote.ContainerFormats.PatternType

- All Implemented Interfaces:
`akka.protobufv3.internal.Internal.EnumLite`, `akka.protobufv3.internal.ProtocolMessageEnum`, `java.io.Serializable`, `java.lang.Comparable<[ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")>`

Enclosing class:
[ContainerFormats](ContainerFormats.html "class in akka.remote")

---

```
public static enum ContainerFormats.PatternType
extends java.lang.Enum<[ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")>
implements akka.protobufv3.internal.ProtocolMessageEnum
```

Protobuf enum `PatternType`

- - ### Enum Constant Summary
	
	
	
	Enum Constants 
	| Enum Constant | Description |
	| `[CHILD_NAME](#CHILD_NAME)` | `CHILD_NAME = 1;` |
	| `[CHILD_PATTERN](#CHILD_PATTERN)` | `CHILD_PATTERN = 2;` |
	| `[PARENT](#PARENT)` | `PARENT = 0;` |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[CHILD_NAME_VALUE](#CHILD_NAME_VALUE)` | `CHILD_NAME = 1;` |
	| `static int` | `[CHILD_PATTERN_VALUE](#CHILD_PATTERN_VALUE)` | `CHILD_PATTERN = 2;` |
	| `static int` | `[PARENT_VALUE](#PARENT_VALUE)` | `PARENT = 0;` |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")` | `[forNumber](#forNumber(int))​(int value)` |  |
	| `static akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getNumber](#getNumber())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumValueDescriptor` | `[getValueDescriptor](#getValueDescriptor())()` |  |
	| `static akka.protobufv3.internal.Internal.EnumLiteMap<[ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")>` | `[internalGetValueMap](#internalGetValueMap())()` |  |
	| `static [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")` | `[valueOf](#valueOf(int))​(int value)` | Deprecated. |
	| `static [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")` | `[valueOf](#valueOf(akka.protobufv3.internal.Descriptors.EnumValueDescriptor))​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)` | Returns the enum constant of this type with the specified name. |
	| `static [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### PARENT
		
		
		
		```
		public static final [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote") PARENT
		```
		
		`PARENT = 0;`
		- #### CHILD\_NAME
		
		
		
		```
		public static final [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote") CHILD_NAME
		```
		
		`CHILD_NAME = 1;`
		- #### CHILD\_PATTERN
		
		
		
		```
		public static final [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote") CHILD_PATTERN
		```
		
		`CHILD_PATTERN = 2;`

	- ### Field Detail
	
	
	
		- #### PARENT\_VALUE
		
		
		
		```
		public static final int PARENT_VALUE
		```
		
		`PARENT = 0;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ContainerFormats.PatternType.PARENT_VALUE)
		- #### CHILD\_NAME\_VALUE
		
		
		
		```
		public static final int CHILD_NAME_VALUE
		```
		
		`CHILD_NAME = 1;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ContainerFormats.PatternType.CHILD_NAME_VALUE)
		- #### CHILD\_PATTERN\_VALUE
		
		
		
		```
		public static final int CHILD_PATTERN_VALUE
		```
		
		`CHILD_PATTERN = 2;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.ContainerFormats.PatternType.CHILD_PATTERN_VALUE)

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (ContainerFormats.PatternType c : ContainerFormats.PatternType.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote") valueOf​(java.lang.String name)
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
		public static [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote") valueOf​(int value)
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
		public static [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote") forNumber​(int value)
		```
		
		
		Parameters:
		`value` \- The numeric wire value of the corresponding enum entry.
		Returns:
		The enum associated with the given numeric wire value.
		- #### internalGetValueMap
		
		
		
		```
		public static akka.protobufv3.internal.Internal.EnumLiteMap<[ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote")> internalGetValueMap()
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
		public static [ContainerFormats.PatternType](ContainerFormats.PatternType.html "enum in akka.remote") valueOf​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)
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

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.PatternType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/constant-values.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.PatternType.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/ContainerFormats.PatternType.html)*