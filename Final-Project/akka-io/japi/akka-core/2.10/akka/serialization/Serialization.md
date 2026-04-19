---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serialization.html
title: Serialization
---

# Serialization

## Content

Package [akka.serialization](package-summary.html)
## Class Serialization

- java.lang.Object
- - akka.serialization.Serialization

- All Implemented Interfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public class Serialization
extends java.lang.Object
implements [Extension](../actor/Extension.html "interface in akka.actor")
```

Serialization module. Contains methods for serialization and deserialization as well as
 locating a Serializer for a particular class as defined in the mapping in the configuration.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Serialization.Information](Serialization.Information.html "class in akka.serialization")` | Serialization information needed for serializing local actor refs,  or if serializer library e.g. |
	| `static class` | `[Serialization.Information$](Serialization.Information$.html "class in akka.serialization")` |  |
	| `static class` | `[Serialization.Settings](Serialization.Settings.html "class in akka.serialization")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Serialization](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[AllowJavaSerialization](#AllowJavaSerialization())()` |  |
	| `scala.util.Try<java.lang.Object>` | `[deserialize](#deserialize(byte%5B%5D,int,java.lang.String))​(byte[] bytes,  int serializerId,  java.lang.String manifest)` | Deserializes the given array of bytes using the specified serializer id,  using the optional type hint to the Serializer. |
	| `<T> scala.util.Try<T>` | `[deserialize](#deserialize(byte%5B%5D,int,scala.Option))​(byte[] bytes,  int serializerId,  scala.Option<java.lang.Class<? extends T>> clazz)` | Deprecated. Use deserialize that accepts the \`manifest\` as a class name. |
	| `<T> scala.util.Try<T>` | `[deserialize](#deserialize(byte%5B%5D,java.lang.Class))​(byte[] bytes,  java.lang.Class<T> clazz)` | Deserializes the given array of bytes using the specified type to look up what Serializer should be used. |
	| `java.lang.Object` | `[deserializeByteBuffer](#deserializeByteBuffer(java.nio.ByteBuffer,int,java.lang.String))​(java.nio.ByteBuffer buf,  int serializerId,  java.lang.String manifest)` | Deserializes the given ByteBuffer of bytes using the specified serializer id,  using the optional type hint to the Serializer. |
	| `[Serializer](Serializer.html "interface in akka.serialization")` | `[findSerializerFor](#findSerializerFor(java.lang.Object))​(java.lang.Object o)` | Returns the Serializer configured for the given object, returns the NullSerializer if it's null. |
	| `static [Serialization.Information](Serialization.Information.html "class in akka.serialization")` | `[getCurrentTransportInformation](#getCurrentTransportInformation())()` | Gets the serialization information from a `ThreadLocal` that was assigned via  [`withTransportInformation(akka.actor.ExtendedActorSystem, scala.Function0<T>)`](#withTransportInformation(akka.actor.ExtendedActorSystem,scala.Function0)). |
	| `[LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event")` | `[log](#log())()` |  |
	| `scala.util.Try<byte[]>` | `[serialize](#serialize(java.lang.Object))​(java.lang.Object o)` | Serializes the given AnyRef/java.lang.Object according to the Serialization configuration  to either an Array of Bytes or an Exception if one was thrown. |
	| `static java.lang.String` | `[serializedActorPath](#serializedActorPath(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)` | The serialized path of an actorRef, based on the current transport serialization information. |
	| `scala.collection.immutable.Map<java.lang.Object,​[Serializer](Serializer.html "interface in akka.serialization")>` | `[serializerByIdentity](#serializerByIdentity())()` | Maps from a Serializer Identity (Int) to a Serializer instance (optimization) |
	| `[Serializer](Serializer.html "interface in akka.serialization")` | `[serializerFor](#serializerFor(java.lang.Class))​(java.lang.Class<?> clazz)` | Returns the configured Serializer for the given Class. |
	| `scala.util.Try<[Serializer](Serializer.html "interface in akka.serialization")>` | `[serializerOf](#serializerOf(java.lang.String))​(java.lang.String serializerFQN)` | Tries to load the specified Serializer by the fully\-qualified name; the actual  loading is performed by the system\&rsquo;s [`DynamicAccess`](../actor/DynamicAccess.html "class in akka.actor"). |
	| `[Serialization.Settings](Serialization.Settings.html "class in akka.serialization")` | `[settings](#settings())()` |  |
	| `[ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor")` | `[system](#system())()` |  |
	| `static <T> T` | `[withTransportInformation](#withTransportInformation(akka.actor.ExtendedActorSystem,scala.Function0))​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system,  scala.Function0<T> f)` | Sets serialization information in a `ThreadLocal` and runs `f`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Serialization
		
		
		
		```
		public Serialization​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### serializedActorPath
		
		
		
		```
		public static java.lang.String serializedActorPath​([ActorRef](../actor/ActorRef.html "class in akka.actor") actorRef)
		```
		
		The serialized path of an actorRef, based on the current transport serialization information.
		 If there is no external address available in the given `ActorRef` then the systems default
		 address will be used and that is retrieved from the ThreadLocal `Serialization.Information`
		 that was set with [`withTransportInformation(akka.actor.ExtendedActorSystem, scala.Function0<T>)`](#withTransportInformation(akka.actor.ExtendedActorSystem,scala.Function0)).
		- #### withTransportInformation
		
		
		
		```
		public static <T> T withTransportInformation​([ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                             scala.Function0<T> f)
		```
		
		Sets serialization information in a `ThreadLocal` and runs `f`. The information is
		 needed for serializing local actor refs, or if serializer library e.g. custom serializer/deserializer
		 in Jackson need access to the current `ActorSystem`. The current [`Serialization.Information`](Serialization.Information.html "class in akka.serialization") can be accessed within
		 `f` via [`getCurrentTransportInformation()`](#getCurrentTransportInformation()).
		 
		 Akka Remoting sets this value when serializing and deserializing messages, and when using
		 the ordinary `serialize` and `deserialize` methods in [`Serialization`](Serialization.html "class in akka.serialization") the value is also
		 set automatically.
		 
		
		
		
		Returns:
		value returned by `f`
		- #### getCurrentTransportInformation
		
		
		
		```
		public static [Serialization.Information](Serialization.Information.html "class in akka.serialization") getCurrentTransportInformation()
		```
		
		Gets the serialization information from a `ThreadLocal` that was assigned via
		 [`withTransportInformation(akka.actor.ExtendedActorSystem, scala.Function0<T>)`](#withTransportInformation(akka.actor.ExtendedActorSystem,scala.Function0)). The information is needed for serializing
		 local actor refs, or if serializer library e.g. custom serializer/deserializer
		 in Jackson need access to the current `ActorSystem`.
		 
		
		Throws:
		`java.lang.IllegalStateException` \- if the information was not set
		- #### system
		
		
		
		```
		public [ExtendedActorSystem](../actor/ExtendedActorSystem.html "class in akka.actor") system()
		```
		- #### settings
		
		
		
		```
		public [Serialization.Settings](Serialization.Settings.html "class in akka.serialization") settings()
		```
		- #### AllowJavaSerialization
		
		
		
		```
		public boolean AllowJavaSerialization()
		```
		- #### log
		
		
		
		```
		public [LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event") log()
		```
		- #### serialize
		
		
		
		```
		public scala.util.Try<byte[]> serialize​(java.lang.Object o)
		```
		
		Serializes the given AnyRef/java.lang.Object according to the Serialization configuration
		 to either an Array of Bytes or an Exception if one was thrown.
		- #### deserialize
		
		
		
		```
		public <T> scala.util.Try<T> deserialize​(byte[] bytes,
		                                         int serializerId,
		                                         scala.Option<java.lang.Class<? extends T>> clazz)
		```
		
		Deprecated.
		Use deserialize that accepts the \`manifest\` as a class name. Since 2\.6\.0\.
		
		Deserializes the given array of bytes using the specified serializer id,
		 using the optional type hint to the Serializer.
		 Returns either the resulting object or an Exception if one was thrown.
		- #### deserialize
		
		
		
		```
		public scala.util.Try<java.lang.Object> deserialize​(byte[] bytes,
		                                                    int serializerId,
		                                                    java.lang.String manifest)
		```
		
		Deserializes the given array of bytes using the specified serializer id,
		 using the optional type hint to the Serializer.
		 Returns either the resulting object or an Exception if one was thrown.
		- #### deserializeByteBuffer
		
		
		
		```
		public java.lang.Object deserializeByteBuffer​(java.nio.ByteBuffer buf,
		                                              int serializerId,
		                                              java.lang.String manifest)
		                                       throws java.io.NotSerializableException
		```
		
		Deserializes the given ByteBuffer of bytes using the specified serializer id,
		 using the optional type hint to the Serializer.
		 Returns either the resulting object or throws an exception if deserialization fails.
		
		Throws:
		`java.io.NotSerializableException`
		- #### deserialize
		
		
		
		```
		public <T> scala.util.Try<T> deserialize​(byte[] bytes,
		                                         java.lang.Class<T> clazz)
		```
		
		Deserializes the given array of bytes using the specified type to look up what Serializer should be used.
		 Returns either the resulting object or an Exception if one was thrown.
		- #### findSerializerFor
		
		
		
		```
		public [Serializer](Serializer.html "interface in akka.serialization") findSerializerFor​(java.lang.Object o)
		```
		
		Returns the Serializer configured for the given object, returns the NullSerializer if it's null.
		 
		 Throws akka.ConfigurationException if no `serialization-bindings` is configured for the
		 class of the object.
		- #### serializerFor
		
		
		
		```
		public [Serializer](Serializer.html "interface in akka.serialization") serializerFor​(java.lang.Class<?> clazz)
		                         throws java.io.NotSerializableException
		```
		
		Returns the configured Serializer for the given Class. The configured Serializer
		 is used if the configured class `isAssignableFrom` from the `clazz`, i.e.
		 the configured class is a super class or implemented interface. In case of
		 ambiguity it is primarily using the most specific configured class,
		 and secondly the entry configured first.
		 
		 Throws java.io.NotSerializableException if no `serialization-bindings` is configured for the class.
		
		
		
		Throws:
		`java.io.NotSerializableException`
		- #### serializerOf
		
		
		
		```
		public scala.util.Try<[Serializer](Serializer.html "interface in akka.serialization")> serializerOf​(java.lang.String serializerFQN)
		```
		
		Tries to load the specified Serializer by the fully\-qualified name; the actual
		 loading is performed by the system\&rsquo;s [`DynamicAccess`](../actor/DynamicAccess.html "class in akka.actor").
		- #### serializerByIdentity
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.Object,​[Serializer](Serializer.html "interface in akka.serialization")> serializerByIdentity()
		```
		
		Maps from a Serializer Identity (Int) to a Serializer instance (optimization)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serialization.Information$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serialization.Information.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serialization.Settings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serialization.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serialization.html](https://doc.akka.io/japi/akka-core/2.10/akka/serialization/Serialization.html)*