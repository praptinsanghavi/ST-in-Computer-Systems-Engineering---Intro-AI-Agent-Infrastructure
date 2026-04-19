---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:01:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/MessageSerializer.html
title: MessageSerializer
---

# MessageSerializer

## Content

Package [akka.cluster.metrics.protobuf](package-summary.html)
## Class MessageSerializer

- java.lang.Object
- - [akka.serialization.SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")
	- - akka.cluster.metrics.protobuf.MessageSerializer

- All Implemented Interfaces:
`[BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")`, `[Serializer](../../../serialization/Serializer.html "interface in akka.serialization")`

---

```
public class MessageSerializer
extends [SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")
implements [BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")
```

Protobuf serializer for [`ClusterMetricsMessage`](../ClusterMetricsMessage.html "interface in akka.cluster.metrics") types.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageSerializer](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AdaptiveLoadBalancingPool](../AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")` | `[adaptiveLoadBalancingPoolFromBinary](#adaptiveLoadBalancingPoolFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `byte[]` | `[adaptiveLoadBalancingPoolToBinary](#adaptiveLoadBalancingPoolToBinary(akka.cluster.metrics.AdaptiveLoadBalancingPool))​([AdaptiveLoadBalancingPool](../AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") alb)` |  |
	| `protected void` | `[akka$serialization$BaseSerializer$_setter_$identifier_$eq](#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))​(int x$1)` | Globally unique serialization identifier configured in the `reference.conf`. |
	| `byte[]` | `[compress](#compress(akka.protobufv3.internal.MessageLite))​(akka.protobufv3.internal.MessageLite msg)` |  |
	| `byte[]` | `[decompress](#decompress(byte%5B%5D))​(byte[] bytes)` |  |
	| `java.lang.Object` | `[fromBinary](#fromBinary(byte%5B%5D,java.lang.String))​(byte[] bytes,  java.lang.String manifest)` | Produces an object from an array of bytes, with an optional type\-hint. |
	| `int` | `[identifier](#identifier())()` | Completely unique value to identify this implementation of Serializer, used to optimize network traffic. |
	| `java.lang.String` | `[manifest](#manifest(java.lang.Object))​(java.lang.Object obj)` | Return the manifest (type hint) that will be provided in the fromBinary method. |
	| `[MetricsSelector](../MetricsSelector.html "interface in akka.cluster.metrics")` | `[metricSelectorFromProto](#metricSelectorFromProto(akka.cluster.metrics.protobuf.msg.ClusterMetricsMessages.MetricsSelector))​([ClusterMetricsMessages.MetricsSelector](msg/ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") selector)` |  |
	| `[MixMetricsSelector](../MixMetricsSelector.html "class in akka.cluster.metrics")` | `[mixMetricSelectorFromBinary](#mixMetricSelectorFromBinary(byte%5B%5D))​(byte[] bytes)` |  |
	| `[ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` | Actor system which is required by most serializer implementations. |
	| `byte[]` | `[toBinary](#toBinary(java.lang.Object))​(java.lang.Object obj)` | Serializes the given object into an Array of Byte. |
	
	
		- ### Methods inherited from class akka.serialization.[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")
		
		
		`[fromBinary](../../../serialization/SerializerWithStringManifest.html#fromBinary(byte%5B%5D,scala.Option)), [includeManifest](../../../serialization/SerializerWithStringManifest.html#includeManifest())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.serialization.[BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")
		
		
		`[identifierFromConfig](../../../serialization/BaseSerializer.html#identifierFromConfig()), [SerializationIdentifiers](../../../serialization/BaseSerializer.html#SerializationIdentifiers())`
		- ### Methods inherited from interface akka.serialization.[Serializer](../../../serialization/Serializer.html "interface in akka.serialization")
		
		
		`[fromBinary](../../../serialization/Serializer.html#fromBinary(byte%5B%5D)), [fromBinary](../../../serialization/Serializer.html#fromBinary(byte%5B%5D,java.lang.Class)), [fromBinary](../../../serialization/Serializer.html#fromBinary(byte%5B%5D,scala.Option)), [includeManifest](../../../serialization/Serializer.html#includeManifest())`

- - ### Constructor Detail
	
	
	
		- #### MessageSerializer
		
		
		
		```
		public MessageSerializer​([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### adaptiveLoadBalancingPoolFromBinary
		
		
		
		```
		public [AdaptiveLoadBalancingPool](../AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") adaptiveLoadBalancingPoolFromBinary​(byte[] bytes)
		```
		- #### adaptiveLoadBalancingPoolToBinary
		
		
		
		```
		public byte[] adaptiveLoadBalancingPoolToBinary​([AdaptiveLoadBalancingPool](../AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") alb)
		```
		- #### akka$serialization$BaseSerializer$\_setter\_$identifier\_$eq
		
		
		
		```
		protected void akka$serialization$BaseSerializer$_setter_$identifier_$eq​(int x$1)
		```
		
		Description copied from interface: `[BaseSerializer](../../../serialization/BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))`
		Globally unique serialization identifier configured in the `reference.conf`.
		 
		 See `Serializer.identifier`.
		
		
		
		Specified by:
		`[akka$serialization$BaseSerializer$_setter_$identifier_$eq](../../../serialization/BaseSerializer.html#akka$serialization$BaseSerializer$_setter_$identifier_$eq(int))` in interface `[BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")`
		- #### compress
		
		
		
		```
		public byte[] compress​(akka.protobufv3.internal.MessageLite msg)
		```
		- #### decompress
		
		
		
		```
		public byte[] decompress​(byte[] bytes)
		```
		- #### fromBinary
		
		
		
		```
		public java.lang.Object fromBinary​(byte[] bytes,
		                                   java.lang.String manifest)
		```
		
		Description copied from class: `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html#fromBinary(byte%5B%5D,java.lang.String))`
		Produces an object from an array of bytes, with an optional type\-hint.
		 
		 It's recommended to throw `java.io.NotSerializableException` in `fromBinary`
		 if the manifest is unknown. This makes it possible to introduce new message
		 types and send them to nodes that don't know about them. This is typically
		 needed when performing rolling upgrades, i.e. running a cluster with mixed
		 versions for while. `NotSerializableException` is treated as a transient
		 problem in the TCP based remoting layer. The problem will be logged
		 and message is dropped. Other exceptions will tear down the TCP connection
		 because it can be an indication of corrupt bytes from the underlying transport.
		
		
		
		Specified by:
		`[fromBinary](../../../serialization/SerializerWithStringManifest.html#fromBinary(byte%5B%5D,java.lang.String))` in class `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")`
		- #### identifier
		
		
		
		```
		public int identifier()
		```
		
		Description copied from class: `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html#identifier())`
		Completely unique value to identify this implementation of Serializer, used to optimize network traffic.
		 Values from 0 to 40 are reserved for Akka internal usage.
		
		Specified by:
		`[identifier](../../../serialization/BaseSerializer.html#identifier())` in interface `[BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")`
		Specified by:
		`[identifier](../../../serialization/Serializer.html#identifier())` in interface `[Serializer](../../../serialization/Serializer.html "interface in akka.serialization")`
		Specified by:
		`[identifier](../../../serialization/SerializerWithStringManifest.html#identifier())` in class `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")`
		- #### manifest
		
		
		
		```
		public java.lang.String manifest​(java.lang.Object obj)
		```
		
		Description copied from class: `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html#manifest(java.lang.Object))`
		Return the manifest (type hint) that will be provided in the fromBinary method.
		 Use `""` if manifest is not needed.
		
		Specified by:
		`[manifest](../../../serialization/SerializerWithStringManifest.html#manifest(java.lang.Object))` in class `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")`
		- #### metricSelectorFromProto
		
		
		
		```
		public [MetricsSelector](../MetricsSelector.html "interface in akka.cluster.metrics") metricSelectorFromProto​([ClusterMetricsMessages.MetricsSelector](msg/ClusterMetricsMessages.MetricsSelector.html "class in akka.cluster.metrics.protobuf.msg") selector)
		```
		- #### mixMetricSelectorFromBinary
		
		
		
		```
		public [MixMetricsSelector](../MixMetricsSelector.html "class in akka.cluster.metrics") mixMetricSelectorFromBinary​(byte[] bytes)
		```
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		
		Description copied from interface: `[BaseSerializer](../../../serialization/BaseSerializer.html#system())`
		Actor system which is required by most serializer implementations.
		
		Specified by:
		`[system](../../../serialization/BaseSerializer.html#system())` in interface `[BaseSerializer](../../../serialization/BaseSerializer.html "interface in akka.serialization")`
		- #### toBinary
		
		
		
		```
		public byte[] toBinary​(java.lang.Object obj)
		```
		
		Description copied from class: `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html#toBinary(java.lang.Object))`
		Serializes the given object into an Array of Byte.
		 
		 Note that the array must not be mutated by the serializer after it has been returned.
		
		
		
		Specified by:
		`[toBinary](../../../serialization/Serializer.html#toBinary(java.lang.Object))` in interface `[Serializer](../../../serialization/Serializer.html "interface in akka.serialization")`
		Specified by:
		`[toBinary](../../../serialization/SerializerWithStringManifest.html#toBinary(java.lang.Object))` in class `[SerializerWithStringManifest](../../../serialization/SerializerWithStringManifest.html "class in akka.serialization")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsMessage.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MixMetricsSelector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/msg/ClusterMetricsMessages.MetricsSelector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/serialization/BaseSerializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka/current/akka/serialization/SerializerWithStringManifest.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/MessageSerializer.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/protobuf/MessageSerializer.html)*