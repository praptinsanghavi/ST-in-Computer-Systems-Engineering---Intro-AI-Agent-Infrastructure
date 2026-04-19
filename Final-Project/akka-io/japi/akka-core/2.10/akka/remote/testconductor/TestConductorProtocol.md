---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:10:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.FailType.html
title: TestConductorProtocol.FailType
---

# TestConductorProtocol.FailType

## Content

Package [akka.remote.testconductor](package-summary.html)
## Enum TestConductorProtocol.FailType

- java.lang.Object
- - java.lang.Enum\<[TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")\>
	- - akka.remote.testconductor.TestConductorProtocol.FailType

- All Implemented Interfaces:
`akka.protobufv3.internal.Internal.EnumLite`, `akka.protobufv3.internal.ProtocolMessageEnum`, `java.io.Serializable`, `java.lang.Comparable<[TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")>`

Enclosing class:
[TestConductorProtocol](TestConductorProtocol.html "class in akka.remote.testconductor")

---

```
public static enum TestConductorProtocol.FailType
extends java.lang.Enum<[TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")>
implements akka.protobufv3.internal.ProtocolMessageEnum
```

Protobuf enum `FailType`

- - ### Enum Constant Summary
	
	
	
	Enum Constants 
	| Enum Constant | Description |
	| `[Abort](#Abort)` | `Abort = 3;` |
	| `[Disconnect](#Disconnect)` | `Disconnect = 2;` |
	| `[Exit](#Exit)` | `Exit = 4;` |
	| `[Shutdown](#Shutdown)` | `Shutdown = 5;` |
	| `[ShutdownAbrupt](#ShutdownAbrupt)` | `ShutdownAbrupt = 6;` |
	| `[Throttle](#Throttle)` | `Throttle = 1;` |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[Abort_VALUE](#Abort_VALUE)` | `Abort = 3;` |
	| `static int` | `[Disconnect_VALUE](#Disconnect_VALUE)` | `Disconnect = 2;` |
	| `static int` | `[Exit_VALUE](#Exit_VALUE)` | `Exit = 4;` |
	| `static int` | `[Shutdown_VALUE](#Shutdown_VALUE)` | `Shutdown = 5;` |
	| `static int` | `[ShutdownAbrupt_VALUE](#ShutdownAbrupt_VALUE)` | `ShutdownAbrupt = 6;` |
	| `static int` | `[Throttle_VALUE](#Throttle_VALUE)` | `Throttle = 1;` |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")` | `[forNumber](#forNumber(int))​(int value)` |  |
	| `static akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getNumber](#getNumber())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumValueDescriptor` | `[getValueDescriptor](#getValueDescriptor())()` |  |
	| `static akka.protobufv3.internal.Internal.EnumLiteMap<[TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")>` | `[internalGetValueMap](#internalGetValueMap())()` |  |
	| `static [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")` | `[valueOf](#valueOf(int))​(int value)` | Deprecated. |
	| `static [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")` | `[valueOf](#valueOf(akka.protobufv3.internal.Descriptors.EnumValueDescriptor))​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)` | Returns the enum constant of this type with the specified name. |
	| `static [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### Throttle
		
		
		
		```
		public static final [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") Throttle
		```
		
		`Throttle = 1;`
		- #### Disconnect
		
		
		
		```
		public static final [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") Disconnect
		```
		
		`Disconnect = 2;`
		- #### Abort
		
		
		
		```
		public static final [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") Abort
		```
		
		`Abort = 3;`
		- #### Exit
		
		
		
		```
		public static final [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") Exit
		```
		
		`Exit = 4;`
		- #### Shutdown
		
		
		
		```
		public static final [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") Shutdown
		```
		
		`Shutdown = 5;`
		- #### ShutdownAbrupt
		
		
		
		```
		public static final [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") ShutdownAbrupt
		```
		
		`ShutdownAbrupt = 6;`

	- ### Field Detail
	
	
	
		- #### Throttle\_VALUE
		
		
		
		```
		public static final int Throttle_VALUE
		```
		
		`Throttle = 1;`
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.remote.testconductor.TestConductorProtocol.FailType.Throttle_VALUE)
		- #### Disconnect\_VALUE
		
		
		
		```
		public static final int Disconnect_VALUE
		```
		
		`Disconnect = 2;`
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.remote.testconductor.TestConductorProtocol.FailType.Disconnect_VALUE)
		- #### Abort\_VALUE
		
		
		
		```
		public static final int Abort_VALUE
		```
		
		`Abort = 3;`
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.remote.testconductor.TestConductorProtocol.FailType.Abort_VALUE)
		- #### Exit\_VALUE
		
		
		
		```
		public static final int Exit_VALUE
		```
		
		`Exit = 4;`
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.remote.testconductor.TestConductorProtocol.FailType.Exit_VALUE)
		- #### Shutdown\_VALUE
		
		
		
		```
		public static final int Shutdown_VALUE
		```
		
		`Shutdown = 5;`
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.remote.testconductor.TestConductorProtocol.FailType.Shutdown_VALUE)
		- #### ShutdownAbrupt\_VALUE
		
		
		
		```
		public static final int ShutdownAbrupt_VALUE
		```
		
		`ShutdownAbrupt = 6;`
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.remote.testconductor.TestConductorProtocol.FailType.ShutdownAbrupt_VALUE)

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (TestConductorProtocol.FailType c : TestConductorProtocol.FailType.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") valueOf​(java.lang.String name)
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
		public static [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") valueOf​(int value)
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
		public static [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") forNumber​(int value)
		```
		
		
		Parameters:
		`value` \- The numeric wire value of the corresponding enum entry.
		Returns:
		The enum associated with the given numeric wire value.
		- #### internalGetValueMap
		
		
		
		```
		public static akka.protobufv3.internal.Internal.EnumLiteMap<[TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor")> internalGetValueMap()
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
		public static [TestConductorProtocol.FailType](TestConductorProtocol.FailType.html "enum in akka.remote.testconductor") valueOf​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)
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

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.FailType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/constant-values.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.FailType.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductorProtocol.FailType.html)*