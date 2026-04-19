---
description: Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperProviderSetup
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:37:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html
title: Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperProviderSetup
---

# Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperProviderSetup

> **Summary:** Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperProviderSetup

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
[o](JacksonObjectMapperProviderSetup.html "See companion class")[akka](../../index.html).[serialization](../index.html).[jackson](index.html)

# [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "See companion class")[**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html "Permalink")

### Companion [class JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "See companion class")

#### object JacksonObjectMapperProviderSetup

Source[JacksonObjectMapperProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/scala/akka/serialization/jackson/JacksonObjectMapperProvider.scala#L395)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JacksonObjectMapperProviderSetup
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#apply(factory:akka.serialization.jackson.JacksonObjectMapperFactory):akka.serialization.jackson.JacksonObjectMapperProviderSetup "Permalink")  def apply(factory: [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html)): [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html)Scala API: factory for defining a `JacksonObjectMapperProvider` that is passed in when ActorSystem
is created rather than creating one from configured class name.
5. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#create(factory:akka.serialization.jackson.JacksonObjectMapperFactory):akka.serialization.jackson.JacksonObjectMapperProviderSetup "Permalink")  def create(factory: [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html)): [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html)Java API: factory for defining a `JacksonObjectMapperProvider` that is passed in when ActorSystem
is created rather than creating one from configured class name.
8. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
20. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
*Source: [https://doc.akka.io/api/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html](https://doc.akka.io/api/akka/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html)*