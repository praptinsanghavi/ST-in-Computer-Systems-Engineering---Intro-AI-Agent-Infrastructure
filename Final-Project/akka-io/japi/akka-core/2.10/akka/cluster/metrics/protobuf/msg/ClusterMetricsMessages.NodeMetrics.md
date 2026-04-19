---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:03:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.NumberType.html
title: ClusterMetricsMessages.NodeMetrics.NumberType
---

# ClusterMetricsMessages.NodeMetrics.NumberType

## Content

Package [akka.cluster.metrics.protobuf.msg](package-summary.html)
## Enum ClusterMetricsMessages.NodeMetrics.NumberType

- java.lang.Object
- - java.lang.Enum\<[ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")\>
	- - akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.NumberType

- All Implemented Interfaces:
`akka.protobufv3.internal.Internal.EnumLite`, `akka.protobufv3.internal.ProtocolMessageEnum`, `java.io.Serializable`, `java.lang.Comparable<[ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")>`

Enclosing class:
[ClusterMetricsMessages.NodeMetrics](ClusterMetricsMessages.NodeMetrics.html "class in akka.cluster.metrics.protobuf.msg")

---

```
public static enum ClusterMetricsMessages.NodeMetrics.NumberType
extends java.lang.Enum<[ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")>
implements akka.protobufv3.internal.ProtocolMessageEnum
```

Protobuf enum `NodeMetrics.NumberType`

- - ### Enum Constant Summary
	
	
	
	Enum Constants 
	| Enum Constant | Description |
	| `[Double](#Double)` | `Double = 1;` |
	| `[Float](#Float)` | `Float = 2;` |
	| `[Integer](#Integer)` | `Integer = 3;` |
	| `[Long](#Long)` | `Long = 4;` |
	| `[Serialized](#Serialized)` | `Serialized = 0;` |

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[Double_VALUE](#Double_VALUE)` | `Double = 1;` |
	| `static int` | `[Float_VALUE](#Float_VALUE)` | `Float = 2;` |
	| `static int` | `[Integer_VALUE](#Integer_VALUE)` | `Integer = 3;` |
	| `static int` | `[Long_VALUE](#Long_VALUE)` | `Long = 4;` |
	| `static int` | `[Serialized_VALUE](#Serialized_VALUE)` | `Serialized = 0;` |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")` | `[forNumber](#forNumber(int))​(int value)` |  |
	| `static akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumDescriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `int` | `[getNumber](#getNumber())()` |  |
	| `akka.protobufv3.internal.Descriptors.EnumValueDescriptor` | `[getValueDescriptor](#getValueDescriptor())()` |  |
	| `static akka.protobufv3.internal.Internal.EnumLiteMap<[ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")>` | `[internalGetValueMap](#internalGetValueMap())()` |  |
	| `static [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")` | `[valueOf](#valueOf(int))​(int value)` | Deprecated. |
	| `static [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")` | `[valueOf](#valueOf(akka.protobufv3.internal.Descriptors.EnumValueDescriptor))​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)` | Returns the enum constant of this type with the specified name. |
	| `static [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")` | `[valueOf](#valueOf(java.lang.String))​(java.lang.String name)` | Returns the enum constant of this type with the specified name. |
	| `static [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")[]` | `[values](#values())()` | Returns an array containing the constants of this enum type, in the order they are declared. |
	
	
		- ### Methods inherited from class java.lang.Enum
		
		
		`clone, compareTo, equals, finalize, getDeclaringClass, hashCode, name, ordinal, toString, valueOf`
		- ### Methods inherited from class java.lang.Object
		
		
		`getClass, notify, notifyAll, wait, wait, wait`

- - ### Enum Constant Detail
	
	
	
		- #### Serialized
		
		
		
		```
		public static final [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") Serialized
		```
		
		`Serialized = 0;`
		- #### Double
		
		
		
		```
		public static final [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") Double
		```
		
		`Double = 1;`
		- #### Float
		
		
		
		```
		public static final [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") Float
		```
		
		`Float = 2;`
		- #### Integer
		
		
		
		```
		public static final [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") Integer
		```
		
		`Integer = 3;`
		- #### Long
		
		
		
		```
		public static final [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") Long
		```
		
		`Long = 4;`

	- ### Field Detail
	
	
	
		- #### Serialized\_VALUE
		
		
		
		```
		public static final int Serialized_VALUE
		```
		
		`Serialized = 0;`
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.NumberType.Serialized_VALUE)
		- #### Double\_VALUE
		
		
		
		```
		public static final int Double_VALUE
		```
		
		`Double = 1;`
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.NumberType.Double_VALUE)
		- #### Float\_VALUE
		
		
		
		```
		public static final int Float_VALUE
		```
		
		`Float = 2;`
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.NumberType.Float_VALUE)
		- #### Integer\_VALUE
		
		
		
		```
		public static final int Integer_VALUE
		```
		
		`Integer = 3;`
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.NumberType.Integer_VALUE)
		- #### Long\_VALUE
		
		
		
		```
		public static final int Long_VALUE
		```
		
		`Long = 4;`
		
		See Also:
		[Constant Field Values](../../../../../constant-values.html#akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.NodeMetrics.NumberType.Long_VALUE)

	- ### Method Detail
	
	
	
		- #### values
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")[] values()
		```
		
		Returns an array containing the constants of this enum type, in
		the order they are declared. This method may be used to iterate
		over the constants as follows:
		
		```
		
		for (ClusterMetricsMessages.NodeMetrics.NumberType c : ClusterMetricsMessages.NodeMetrics.NumberType.values())
		    System.out.println(c);
		
		```
		
		
		Returns:
		an array containing the constants of this enum type, in the order they are declared
		- #### valueOf
		
		
		
		```
		public static [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") valueOf​(java.lang.String name)
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
		public static [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") valueOf​(int value)
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
		public static [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") forNumber​(int value)
		```
		
		
		Parameters:
		`value` \- The numeric wire value of the corresponding enum entry.
		Returns:
		The enum associated with the given numeric wire value.
		- #### internalGetValueMap
		
		
		
		```
		public static akka.protobufv3.internal.Internal.EnumLiteMap<[ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg")> internalGetValueMap()
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
		public static [ClusterMetricsMessages.NodeMetrics.NumberType](ClusterMetricsMessages.NodeMetrics.NumberType.html "enum in akka.cluster.metrics.protobuf.msg") valueOf​(akka.protobufv3.internal.Descriptors.EnumValueDescriptor desc)
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

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.NumberType.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/constant-values.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.NumberType.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.NodeMetrics.NumberType.html)*