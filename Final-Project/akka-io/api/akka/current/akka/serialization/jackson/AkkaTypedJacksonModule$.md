---
description: Akka 2.10.17 - akka.serialization.jackson.AkkaTypedJacksonModule
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:37:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/AkkaTypedJacksonModule$.html
title: Akka 2.10.17 - akka.serialization.jackson.AkkaTypedJacksonModule
---

# Akka 2.10.17 - akka.serialization.jackson.AkkaTypedJacksonModule

> **Summary:** Akka 2.10.17 - akka.serialization.jackson.AkkaTypedJacksonModule

## Content

Akka2\.10\.17 \< Back****# Packages

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
[o](AkkaTypedJacksonModule.html "See companion class")[akka](../../index.html).[serialization](../index.html).[jackson](index.html)

# [AkkaTypedJacksonModule](AkkaTypedJacksonModule.html "See companion class")[**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html "Permalink")

### Companion [class AkkaTypedJacksonModule](AkkaTypedJacksonModule.html "See companion class")

#### object AkkaTypedJacksonModule extends [AkkaJacksonModule](AkkaJacksonModule.html)

Source[AkkaJacksonModule.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/scala/akka/serialization/jackson/AkkaJacksonModule.scala#L20)Linear Supertypes[AkkaJacksonModule](AkkaJacksonModule.html), FiniteDurationModule, AddressModule, ActorRefModule, JacksonModule, Module, Versioned, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaTypedJacksonModule
2. AkkaJacksonModule
3. FiniteDurationModule
4. AddressModule
5. ActorRefModule
6. JacksonModule
7. Module
8. Versioned
9. AnyRef
10. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#+=(beanSerMod:com.fasterxml.jackson.databind.ser.BeanSerializerModifier):JacksonModule.this.type "Permalink")  def \+\=(beanSerMod: BeanSerializerModifier): AkkaTypedJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
4. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#+=(typeMod:com.fasterxml.jackson.databind.type.TypeModifier):JacksonModule.this.type "Permalink")  def \+\=(typeMod: TypeModifier): AkkaTypedJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
5. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#+=(deser:com.fasterxml.jackson.databind.deser.Deserializers):JacksonModule.this.type "Permalink")  def \+\=(deser: Deserializers): AkkaTypedJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
6. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#+=(ser:com.fasterxml.jackson.databind.ser.Serializers):JacksonModule.this.type "Permalink")  def \+\=(ser: com.fasterxml.jackson.databind.ser.Serializers): AkkaTypedJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
7. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#+=(init:com.fasterxml.jackson.databind.Module.SetupContext=>Unit):JacksonModule.this.type "Permalink")  def \+\=(init: (SetupContext) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): AkkaTypedJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
8. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#addSerializer(clazz:Class[_],serializer:()=>com.fasterxml.jackson.databind.JsonSerializer[_],deserializer:()=>com.fasterxml.jackson.databind.JsonDeserializer[_]):JacksonModule.this.type "Permalink")  def addSerializer(clazz: Class\[\_], serializer: () \=\> JsonSerializer\[\_], deserializer: () \=\> JsonDeserializer\[\_]): AkkaTypedJacksonModule.this.typeDefinition ClassesJacksonModule
10. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
11. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#getDependencies():Iterable[_<:com.fasterxml.jackson.databind.Module] "Permalink")  def getDependencies(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[\_ \<: Module]Definition ClassesModule
16. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#getModuleName():String "Permalink")  def getModuleName(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition Classes[AkkaJacksonModule](AkkaJacksonModule.html) → Module
17. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#getTypeId():Object "Permalink")  def getTypeId(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesModule
18. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
20. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#setupModule(context:com.fasterxml.jackson.databind.Module.SetupContext):Unit "Permalink")  def setupModule(context: SetupContext): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesJacksonModule → Module
24. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#version():com.fasterxml.jackson.core.Version "Permalink")  def version(): com.fasterxml.jackson.core.VersionDefinition ClassesJacksonModule → Module → Versioned
27. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AkkaJacksonModule](AkkaJacksonModule.html)

### Inherited from FiniteDurationModule

### Inherited from AddressModule

### Inherited from ActorRefModule

### Inherited from JacksonModule

### Inherited from Module

### Inherited from Versioned

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/AkkaJacksonModule$.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/AkkaJacksonModule.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/AkkaSerializationDeserializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/AkkaSerializationSerializer.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/AkkaStreamJacksonModule$.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/AkkaStreamJacksonModule.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/AkkaTypedJacksonModule$.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/AkkaTypedJacksonModule.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/CborSerializable.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/Compression$.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/JacksonMigration.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/JacksonObjectMapperFactory.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/JacksonObjectMapperProvider$.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/JacksonObjectMapperProvider.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/JsonSerializable.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/index.html
- https://doc.akka.io/api/akka/current/akka/serialization/jackson/internal/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/serialization/jackson/AkkaTypedJacksonModule$.html](https://doc.akka.io/api/akka/current/akka/serialization/jackson/AkkaTypedJacksonModule$.html)*