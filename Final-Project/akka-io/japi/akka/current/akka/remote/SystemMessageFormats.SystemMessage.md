---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/SystemMessageFormats.SystemMessage.Type.html
title: SystemMessageFormats.SystemMessage.Type
---

# SystemMessageFormats.SystemMessage.Type

## Content

Package [akka.remote](package-summary.html)
## Enum SystemMessageFormats.SystemMessage.Type

- java.lang.Object
- - java.lang.Enum\<[SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")\>
	- - akka.remote.SystemMessageFormats.SystemMessage.Type

- All Implemented Interfaces:
`akka.protobufv3.internal.Internal.EnumLite`, `akka.protobufv3.internal.ProtocolMessageEnum`, `java.io.Serializable`, `java.lang.Comparable<[SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")>`

Enclosing class:
[SystemMessageFormats.SystemMessage](SystemMessageFormats.SystemMessage.html "class in akka.remote")

---

```
public static enum SystemMessageFormats.SystemMessage.Type
extends java.lang.Enum<[SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")>
implements akka.protobufv3.internal.ProtocolMessageEnum
```

Protobuf enum `SystemMessage.Type`

- - ### Enum Constant Summary
	
	
	
	Enum Constants 
	| Enum Constant | Description |
	| `[CREATE](#CREATE)` | `CREATE = 0;` |
	| `[DEATHWATCH_NOTIFICATION](#DEATHWATCH_NOTIFICATION)` | `DEATHWATCH_NOTIFICATION = 9;` |
	| `[FAILED](#FAILED)` | `FAILED = 8;` |
	| `[RECREATE](#RECREATE)` | `RECREATE = 1;` |
	| `[RESUME](#RESUME)` | `RESUME = 3;` |
	| `[SUPERVISE](#SUPERVISE)` | `SUPERVISE = 5;` |
	| `[SUSPEND](#SUSPEND)` | `SUSPEND = 2;` |
	| `[TERMINATE](#TERMINATE)` | `TERMINATE = 4;` |
	| `[UNWATCH](#UNWATCH)` | `UNWATCH = 7;` |
	| `[WATCH](#WATCH)` | `WATCH = 6;` |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[CREATE_VALUE](#CREATE_VALUE)` | `CREATE = 0;` |
	| `static int` | `[DEATHWATCH_NOTIFICATION_VALUE](#DEATHWATCH_NOTIFICATION_VALUE)` | `DEATHWATCH_NOTIFICATION = 9;` |
	| `static int` | `[FAILED_VALUE](#FAILED_VALUE)` | `FAILED = 8;` |
	| `static int` | `[RECREATE_VALUE](#RECREATE_VALUE)` | `RECREATE = 1;` |
	| `static int` | `[RESUME_VALUE](#RESUME_VALUE)` | `RESUME = 3;` |
	| `static int` | `[SUPERVISE_VALUE](#SUPERVISE_VALUE)` | `SUPERVISE = 5;` |
	| `static int` | `[SUSPEND_VALUE](#SUSPEND_VALUE)` | `SUSPEND = 2;` |
	| `static int` | `[TERMINATE_VALUE](#TERMINATE_VALUE)` | `TERMINATE = 4;` |
	| `static int` | `[UNWATCH_VALUE](#UNWATCH_VALUE)` | `UNWATCH = 7;` |
	| `static int` | `[WATCH_VALUE](#WATCH_VALUE)` | `WATCH = 6;` |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")` | `[forNumber](#forNumber(int))​(int value)` |  |
	| `static akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getNumber](#getNumber())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumValueDescriptor` | `[getValueDescriptor](#getValueDescriptor())()` |  |
	| `static akka.protobufv3.internal.Internal.EnumLiteMap<[SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")>` | `[internalGetValueMap](#internalGetValueMap())()` |  |
	| `static [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")` | `[valueOf](#valueOf(int))​(int value)` | Deprecated. |
	| `static [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")` | `[valueOf](#valueOf(akka.protobufv3.internal.Descriptors.EnumValueDescriptor))​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)` | Returns the enum constant of this type with the specified name. |
	| `static [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### CREATE
		
		
		
		```
		public static final [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") CREATE
		```
		
		`CREATE = 0;`
		- #### RECREATE
		
		
		
		```
		public static final [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") RECREATE
		```
		
		`RECREATE = 1;`
		- #### SUSPEND
		
		
		
		```
		public static final [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") SUSPEND
		```
		
		`SUSPEND = 2;`
		- #### RESUME
		
		
		
		```
		public static final [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") RESUME
		```
		
		`RESUME = 3;`
		- #### TERMINATE
		
		
		
		```
		public static final [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") TERMINATE
		```
		
		`TERMINATE = 4;`
		- #### SUPERVISE
		
		
		
		```
		public static final [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") SUPERVISE
		```
		
		`SUPERVISE = 5;`
		- #### WATCH
		
		
		
		```
		public static final [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") WATCH
		```
		
		`WATCH = 6;`
		- #### UNWATCH
		
		
		
		```
		public static final [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") UNWATCH
		```
		
		`UNWATCH = 7;`
		- #### FAILED
		
		
		
		```
		public static final [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") FAILED
		```
		
		`FAILED = 8;`
		- #### DEATHWATCH\_NOTIFICATION
		
		
		
		```
		public static final [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") DEATHWATCH_NOTIFICATION
		```
		
		`DEATHWATCH_NOTIFICATION = 9;`

	- ### Field Detail
	
	
	
		- #### CREATE\_VALUE
		
		
		
		```
		public static final int CREATE_VALUE
		```
		
		`CREATE = 0;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.Type.CREATE_VALUE)
		- #### RECREATE\_VALUE
		
		
		
		```
		public static final int RECREATE_VALUE
		```
		
		`RECREATE = 1;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.Type.RECREATE_VALUE)
		- #### SUSPEND\_VALUE
		
		
		
		```
		public static final int SUSPEND_VALUE
		```
		
		`SUSPEND = 2;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.Type.SUSPEND_VALUE)
		- #### RESUME\_VALUE
		
		
		
		```
		public static final int RESUME_VALUE
		```
		
		`RESUME = 3;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.Type.RESUME_VALUE)
		- #### TERMINATE\_VALUE
		
		
		
		```
		public static final int TERMINATE_VALUE
		```
		
		`TERMINATE = 4;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.Type.TERMINATE_VALUE)
		- #### SUPERVISE\_VALUE
		
		
		
		```
		public static final int SUPERVISE_VALUE
		```
		
		`SUPERVISE = 5;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.Type.SUPERVISE_VALUE)
		- #### WATCH\_VALUE
		
		
		
		```
		public static final int WATCH_VALUE
		```
		
		`WATCH = 6;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.Type.WATCH_VALUE)
		- #### UNWATCH\_VALUE
		
		
		
		```
		public static final int UNWATCH_VALUE
		```
		
		`UNWATCH = 7;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.Type.UNWATCH_VALUE)
		- #### FAILED\_VALUE
		
		
		
		```
		public static final int FAILED_VALUE
		```
		
		`FAILED = 8;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.Type.FAILED_VALUE)
		- #### DEATHWATCH\_NOTIFICATION\_VALUE
		
		
		
		```
		public static final int DEATHWATCH_NOTIFICATION_VALUE
		```
		
		`DEATHWATCH_NOTIFICATION = 9;`
		
		See Also:
		[Constant Field Values](../../constant-values.html#akka.remote.SystemMessageFormats.SystemMessage.Type.DEATHWATCH_NOTIFICATION_VALUE)

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (SystemMessageFormats.SystemMessage.Type c : SystemMessageFormats.SystemMessage.Type.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") valueOf​(java.lang.String name)
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
		public static [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") valueOf​(int value)
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
		public static [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") forNumber​(int value)
		```
		
		
		Parameters:
		`value` \- The numeric wire value of the corresponding enum entry.
		Returns:
		The enum associated with the given numeric wire value.
		- #### internalGetValueMap
		
		
		
		```
		public static akka.protobufv3.internal.Internal.EnumLiteMap<[SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote")> internalGetValueMap()
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
		public static [SystemMessageFormats.SystemMessage.Type](SystemMessageFormats.SystemMessage.Type.html "enum in akka.remote") valueOf​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)
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

- https://doc.akka.io/japi/akka/current/akka/remote/SystemMessageFormats.SystemMessage.Type.html
- https://doc.akka.io/japi/akka/current/akka/remote/SystemMessageFormats.SystemMessage.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka/current/constant-values.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/SystemMessageFormats.SystemMessage.Type.html](https://doc.akka.io/japi/akka/current/akka/remote/SystemMessageFormats.SystemMessage.Type.html)*