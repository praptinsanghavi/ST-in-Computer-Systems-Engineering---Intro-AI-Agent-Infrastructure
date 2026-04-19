---
description: Akka 2.10.11 - akka.serialization.jackson.JacksonObjectMapperProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/JacksonObjectMapperProvider$.html
title: Akka 2.10.11 - akka.serialization.jackson.JacksonObjectMapperProvider
---

# Akka 2.10.11 - akka.serialization.jackson.JacksonObjectMapperProvider

> **Summary:** Akka 2.10.11 - akka.serialization.jackson.JacksonObjectMapperProvider

## Content

Akka2\.10\.11 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/serialization/index.html "Permalink")  package [serialization](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/serialization/jackson/index.html "Permalink")  package [jackson](index.html)Definition Classes[serialization](../index.html)
- [**](../../../akka/serialization/jackson/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[jackson](index.html)
- [AkkaJacksonModule](AkkaJacksonModule.html "Complete module with support for all custom serializers.")
- [AkkaSerializationDeserializer](AkkaSerializationDeserializer.html)
- [AkkaSerializationSerializer](AkkaSerializationSerializer.html)
- [AkkaStreamJacksonModule](AkkaStreamJacksonModule.html)
- [AkkaTypedJacksonModule](AkkaTypedJacksonModule.html)
- [CborSerializable](CborSerializable.html "Predefined marker trait for serialization with Jackson CBOR.")
- [Compression](Compression$.html)
- [JacksonMigration](JacksonMigration.html "Data migration of old formats to current format can be implemented in a concrete subclass and configured to be used by the JacksonSerializer for a changed class.")
- [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "Used with JacksonObjectMapperProviderSetup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "Registry of shared ObjectMapper instances, each with it's unique bindingName.")
- [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "Setup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JsonSerializable](JsonSerializable.html "Predefined marker trait for serialization with Jackson JSON.")
[o](JacksonObjectMapperProvider.html "See companion class")[akka](../../index.html).[serialization](../index.html).[jackson](index.html)

# [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "See companion class")[**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html "Permalink")

### Companion [class JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "See companion class")

#### object JacksonObjectMapperProvider extends [ExtensionId](../../actor/ExtensionId.html)\[[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)

Source[JacksonObjectMapperProvider.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-serialization-jackson/src/main/scala/akka/serialization/jackson/JacksonObjectMapperProvider.scala#L49)Linear Supertypes[ExtensionIdProvider](../../actor/ExtensionIdProvider.html), [ExtensionId](../../actor/ExtensionId.html)\[[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JacksonObjectMapperProvider
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../actor/ExtensionId.html)
5. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../../actor/ActorSystem.html)): [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../actor/ExtensionId.html)
6. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#configForBinding(bindingName:String,systemConfig:com.typesafe.config.Config):com.typesafe.config.Config "Permalink")  def configForBinding(bindingName: String, systemConfig: Config): ConfigThe configuration for a given `bindingName`.
9. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.serialization.jackson.JacksonObjectMapperProvider "Permalink")  def createExtension(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html)): [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesJacksonObjectMapperProvider → [ExtensionId](../../actor/ExtensionId.html)
10. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#createObjectMapper(bindingName:String,jsonFactory:Option[com.fasterxml.jackson.core.JsonFactory],objectMapperFactory:akka.serialization.jackson.JacksonObjectMapperFactory,config:com.typesafe.config.Config,dynamicAccess:akka.actor.DynamicAccess,log:Option[akka.event.LoggingAdapter]):com.fasterxml.jackson.databind.ObjectMapper "Permalink")  def createObjectMapper(bindingName: String, jsonFactory: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[JsonFactory], objectMapperFactory: [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html), config: Config, dynamicAccess: [DynamicAccess](../../actor/DynamicAccess.html), log: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[LoggingAdapter](../../event/LoggingAdapter.html)]): ObjectMapperINTERNAL API: Use [JacksonObjectMapperProvider\#create](JacksonObjectMapperProvider.html#create(bindingName:String,jsonFactory:java.util.Optional[com.fasterxml.jackson.core.JsonFactory]):com.fasterxml.jackson.databind.ObjectMapper)

INTERNAL API: Use [JacksonObjectMapperProvider\#create](JacksonObjectMapperProvider.html#create(bindingName:String,jsonFactory:java.util.Optional[com.fasterxml.jackson.core.JsonFactory]):com.fasterxml.jackson.databind.ObjectMapper)

This is needed by one test in Lagom where the ObjectMapper is created without starting and ActorSystem.

Annotations@[InternalStableApi](../../annotation/InternalStableApi.html)()
11. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../actor/ExtensionId.html) → AnyRef → Any
13. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.serialization.jackson.JacksonObjectMapperProvider "Permalink")  def get(system: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesJacksonObjectMapperProvider → [ExtensionId](../../actor/ExtensionId.html)
14. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#get(system:akka.actor.ActorSystem):akka.serialization.jackson.JacksonObjectMapperProvider "Permalink")  def get(system: [ActorSystem](../../actor/ActorSystem.html)): [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ActorSystem): TheExtension = super.get(system)
```
Definition ClassesJacksonObjectMapperProvider → [ExtensionId](../../actor/ExtensionId.html)
15. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../actor/ExtensionId.html) → AnyRef → Any
17. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#lookup:akka.serialization.jackson.JacksonObjectMapperProvider.type "Permalink")  def lookup: JacksonObjectMapperProviderReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesJacksonObjectMapperProvider → [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)
19. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../../actor/ExtensionId.html)\[[JacksonObjectMapperProvider](JacksonObjectMapperProvider.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/DynamicAccess.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/AkkaJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/AkkaJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/AkkaSerializationDeserializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/AkkaSerializationSerializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/AkkaStreamJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/AkkaStreamJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/AkkaTypedJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/AkkaTypedJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/CborSerializable.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/Compression$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/JacksonMigration.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/JacksonObjectMapperFactory.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/JacksonObjectMapperProvider$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/JacksonObjectMapperProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/JsonSerializable.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/JacksonObjectMapperProvider$.html](https://doc.akka.io/api/akka-core/2.10.11/akka/serialization/jackson/JacksonObjectMapperProvider$.html)*