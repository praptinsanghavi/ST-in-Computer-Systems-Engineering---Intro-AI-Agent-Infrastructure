---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.TimeUnit.html
title: WireFormats.TimeUnit
---

# WireFormats.TimeUnit

## Content

Package [akka.remote](package-summary.html)
## Enum WireFormats.TimeUnit

- java.lang.Object
- - java.lang.Enum\<[WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")\>
	- - akka.remote.WireFormats.TimeUnit

- All Implemented Interfaces:
`akka.protobufv3.internal.Internal.EnumLite`, `akka.protobufv3.internal.ProtocolMessageEnum`, `java.io.Serializable`, `java.lang.Comparable<[WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")>`

Enclosing class:
[WireFormats](WireFormats.html "class in akka.remote")

---

```
public static enum WireFormats.TimeUnit
extends java.lang.Enum<[WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")>
implements akka.protobufv3.internal.ProtocolMessageEnum
```

```

 java.util.concurrent.TimeUnit enum
 
```

 Protobuf enum `TimeUnit`

- - ### Enum Constant Summary
	
	
	
	Enum Constants 
	| Enum Constant | Description |
	| `[DAYS](#DAYS)` | `DAYS = 7;` |
	| `[HOURS](#HOURS)` | `HOURS = 6;` |
	| `[MICROSECONDS](#MICROSECONDS)` | `MICROSECONDS = 2;` |
	| `[MILLISECONDS](#MILLISECONDS)` | `MILLISECONDS = 3;` |
	| `[MINUTES](#MINUTES)` | `MINUTES = 5;` |
	| `[NANOSECONDS](#NANOSECONDS)` | `NANOSECONDS = 1;` |
	| `[SECONDS](#SECONDS)` | `SECONDS = 4;` |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[DAYS_VALUE](#DAYS_VALUE)` | `DAYS = 7;` |
	| `static int` | `[HOURS_VALUE](#HOURS_VALUE)` | `HOURS = 6;` |
	| `static int` | `[MICROSECONDS_VALUE](#MICROSECONDS_VALUE)` | `MICROSECONDS = 2;` |
	| `static int` | `[MILLISECONDS_VALUE](#MILLISECONDS_VALUE)` | `MILLISECONDS = 3;` |
	| `static int` | `[MINUTES_VALUE](#MINUTES_VALUE)` | `MINUTES = 5;` |
	| `static int` | `[NANOSECONDS_VALUE](#NANOSECONDS_VALUE)` | `NANOSECONDS = 1;` |
	| `static int` | `[SECONDS_VALUE](#SECONDS_VALUE)` | `SECONDS = 4;` |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")` | `[forNumber](#forNumber(int))​(int value)` |  |
	| `static akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getNumber](#getNumber())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumValueDescriptor` | `[getValueDescriptor](#getValueDescriptor())()` |  |
	| `static akka.protobufv3.internal.Internal.EnumLiteMap<[WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")>` | `[internalGetValueMap](#internalGetValueMap())()` |  |
	| `static [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")` | `[valueOf](#valueOf(int))​(int value)` | Deprecated. |
	| `static [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")` | `[valueOf](#valueOf(akka.protobufv3.internal.Descriptors.EnumValueDescriptor))​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)` | Returns the enum constant of this type with the specified name. |
	| `static [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### NANOSECONDS
		
		
		
		```
		public static final [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") NANOSECONDS
		```
		
		`NANOSECONDS = 1;`
		- #### MICROSECONDS
		
		
		
		```
		public static final [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") MICROSECONDS
		```
		
		`MICROSECONDS = 2;`
		- #### MILLISECONDS
		
		
		
		```
		public static final [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") MILLISECONDS
		```
		
		`MILLISECONDS = 3;`
		- #### SECONDS
		
		
		
		```
		public static final [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") SECONDS
		```
		
		`SECONDS = 4;`
		- #### MINUTES
		
		
		
		```
		public static final [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") MINUTES
		```
		
		`MINUTES = 5;`
		- #### HOURS
		
		
		
		```
		public static final [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") HOURS
		```
		
		`HOURS = 6;`
		- #### DAYS
		
		
		
		```
		public static final [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") DAYS
		```
		
		`DAYS = 7;`

	- ### Field Detail
	
	
	
		- #### NANOSECONDS\_VALUE
		
		
		
		```
		public static final int NANOSECONDS_VALUE
		```
		
		`NANOSECONDS = 1;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.WireFormats.TimeUnit.NANOSECONDS_VALUE)
		- #### MICROSECONDS\_VALUE
		
		
		
		```
		public static final int MICROSECONDS_VALUE
		```
		
		`MICROSECONDS = 2;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.WireFormats.TimeUnit.MICROSECONDS_VALUE)
		- #### MILLISECONDS\_VALUE
		
		
		
		```
		public static final int MILLISECONDS_VALUE
		```
		
		`MILLISECONDS = 3;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.WireFormats.TimeUnit.MILLISECONDS_VALUE)
		- #### SECONDS\_VALUE
		
		
		
		```
		public static final int SECONDS_VALUE
		```
		
		`SECONDS = 4;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.WireFormats.TimeUnit.SECONDS_VALUE)
		- #### MINUTES\_VALUE
		
		
		
		```
		public static final int MINUTES_VALUE
		```
		
		`MINUTES = 5;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.WireFormats.TimeUnit.MINUTES_VALUE)
		- #### HOURS\_VALUE
		
		
		
		```
		public static final int HOURS_VALUE
		```
		
		`HOURS = 6;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.WireFormats.TimeUnit.HOURS_VALUE)
		- #### DAYS\_VALUE
		
		
		
		```
		public static final int DAYS_VALUE
		```
		
		`DAYS = 7;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.WireFormats.TimeUnit.DAYS_VALUE)

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (WireFormats.TimeUnit c : WireFormats.TimeUnit.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") valueOf​(java.lang.String name)
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
		public static [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") valueOf​(int value)
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
		public static [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") forNumber​(int value)
		```
		
		
		Parameters:
		`value` \- The numeric wire value of the corresponding enum entry.
		Returns:
		The enum associated with the given numeric wire value.
		- #### internalGetValueMap
		
		
		
		```
		public static akka.protobufv3.internal.Internal.EnumLiteMap<[WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote")> internalGetValueMap()
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
		public static [WireFormats.TimeUnit](WireFormats.TimeUnit.html "enum in akka.remote") valueOf​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)
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

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.TimeUnit.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.TimeUnit.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.TimeUnit.html)*