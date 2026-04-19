---
description: Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/JacksonObjectMapperProvider.html
title: Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperProvider
---

# Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperProvider

> **Summary:** Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperProvider

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
- JacksonObjectMapperProvider
- [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "Setup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JsonSerializable](JsonSerializable.html "Predefined marker trait for serialization with Jackson JSON.")
[c](JacksonObjectMapperProvider$.html "See companion object")[akka](../../index.html).[serialization](../index.html).[jackson](index.html)

# [JacksonObjectMapperProvider](JacksonObjectMapperProvider$.html "See companion object")[**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html "Permalink")

### Companion [object JacksonObjectMapperProvider](JacksonObjectMapperProvider$.html "See companion object")

#### final  class JacksonObjectMapperProvider extends [Extension](../../actor/Extension.html)

Registry of shared `ObjectMapper` instances, each with it's unique `bindingName`.

Source[JacksonObjectMapperProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/scala/akka/serialization/jackson/JacksonObjectMapperProvider.scala#L316)Linear Supertypes[Extension](../../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JacksonObjectMapperProvider
2. Extension
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#<init>(system:akka.actor.ExtendedActorSystem):akka.serialization.jackson.JacksonObjectMapperProvider "Permalink")  new JacksonObjectMapperProvider(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from JacksonObjectMapperProvider toany2stringadd\[JacksonObjectMapperProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (JacksonObjectMapperProvider, B)ImplicitThis member is added by an implicit conversion from JacksonObjectMapperProvider toArrowAssoc\[JacksonObjectMapperProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#create(bindingName:String,jsonFactory:java.util.Optional[com.fasterxml.jackson.core.JsonFactory]):com.fasterxml.jackson.databind.ObjectMapper "Permalink")  def create(bindingName: String, jsonFactory: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[JsonFactory]): ObjectMapperJava API: Creates a new instance of a Jackson `ObjectMapper` with sensible defaults and modules configured
in `akka.serialization.jackson.jackson-modules`.

Java API: Creates a new instance of a Jackson `ObjectMapper` with sensible defaults and modules configured
in `akka.serialization.jackson.jackson-modules`. It's using [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html)
if the `ActorSystem` is started with such [akka.actor.setup.ActorSystemSetup](../../actor/setup/ActorSystemSetup.html).

bindingNamename of this `ObjectMapper`

jsonFactoryoptional `JsonFactory` such as `CBORFactory`, for plain JSON `None` (defaults)
 can be used

See also[JacksonObjectMapperProvider\#getOrCreate](#getOrCreate(bindingName:String,jsonFactory:java.util.Optional[com.fasterxml.jackson.core.JsonFactory]):com.fasterxml.jackson.databind.ObjectMapper)
9. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#create(bindingName:String,jsonFactory:Option[com.fasterxml.jackson.core.JsonFactory]):com.fasterxml.jackson.databind.ObjectMapper "Permalink")  def create(bindingName: String, jsonFactory: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[JsonFactory]): ObjectMapperScala API: Creates a new instance of a Jackson `ObjectMapper` with sensible defaults and modules configured
in `akka.serialization.jackson.jackson-modules`.

Scala API: Creates a new instance of a Jackson `ObjectMapper` with sensible defaults and modules configured
in `akka.serialization.jackson.jackson-modules`. It's using [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html)
if the `ActorSystem` is started with such [akka.actor.setup.ActorSystemSetup](../../actor/setup/ActorSystemSetup.html).

bindingNamename of this `ObjectMapper`

jsonFactoryoptional `JsonFactory` such as `CBORFactory`, for plain JSON `None` (defaults)
 can be used

See also[JacksonObjectMapperProvider\#getOrCreate](#getOrCreate(bindingName:String,jsonFactory:java.util.Optional[com.fasterxml.jackson.core.JsonFactory]):com.fasterxml.jackson.databind.ObjectMapper)
10. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (JacksonObjectMapperProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JacksonObjectMapperProviderImplicitThis member is added by an implicit conversion from JacksonObjectMapperProvider toEnsuring\[JacksonObjectMapperProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (JacksonObjectMapperProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JacksonObjectMapperProviderImplicitThis member is added by an implicit conversion from JacksonObjectMapperProvider toEnsuring\[JacksonObjectMapperProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JacksonObjectMapperProviderImplicitThis member is added by an implicit conversion from JacksonObjectMapperProvider toEnsuring\[JacksonObjectMapperProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JacksonObjectMapperProviderImplicitThis member is added by an implicit conversion from JacksonObjectMapperProvider toEnsuring\[JacksonObjectMapperProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#getOrCreate(bindingName:String,jsonFactory:java.util.Optional[com.fasterxml.jackson.core.JsonFactory]):com.fasterxml.jackson.databind.ObjectMapper "Permalink")  def getOrCreate(bindingName: String, jsonFactory: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[JsonFactory]): ObjectMapperJava API: Returns an existing Jackson `ObjectMapper` that was created previously with this method, or
creates a new instance.

Java API: Returns an existing Jackson `ObjectMapper` that was created previously with this method, or
creates a new instance.

The `ObjectMapper` is created with sensible defaults and modules configured
in `akka.serialization.jackson.jackson-modules`. It's using [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html)
if the `ActorSystem` is started with such [akka.actor.setup.ActorSystemSetup](../../actor/setup/ActorSystemSetup.html).

The returned `ObjectMapper` must not be modified, because it may already be in use and such
modifications are not thread\-safe.

bindingNamename of this `ObjectMapper`

jsonFactoryoptional `JsonFactory` such as `CBORFactory`, for plain JSON `None` (defaults)
 can be used
18. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#getOrCreate(bindingName:String,jsonFactory:Option[com.fasterxml.jackson.core.JsonFactory]):com.fasterxml.jackson.databind.ObjectMapper "Permalink")  def getOrCreate(bindingName: String, jsonFactory: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[JsonFactory]): ObjectMapperScala API: Returns an existing Jackson `ObjectMapper` that was created previously with this method, or
creates a new instance.

Scala API: Returns an existing Jackson `ObjectMapper` that was created previously with this method, or
creates a new instance.

The `ObjectMapper` is created with sensible defaults and modules configured
in `akka.serialization.jackson.jackson-modules`. It's using [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html)
if the `ActorSystem` is started with such [akka.actor.setup.ActorSystemSetup](../../actor/setup/ActorSystemSetup.html).

The returned `ObjectMapper` must not be modified, because it may already be in use and such
modifications are not thread\-safe.

bindingNamename of this `ObjectMapper`

jsonFactoryoptional `JsonFactory` such as `CBORFactory`, for plain JSON `None` (defaults)
 can be used
19. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from JacksonObjectMapperProvider toStringFormat\[JacksonObjectMapperProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/serialization/jackson/JacksonObjectMapperProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (JacksonObjectMapperProvider, B)ImplicitThis member is added by an implicit conversion from JacksonObjectMapperProvider toArrowAssoc\[JacksonObjectMapperProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromJacksonObjectMapperProvider to any2stringadd\[JacksonObjectMapperProvider]

### Inherited by implicit conversion StringFormat fromJacksonObjectMapperProvider to StringFormat\[JacksonObjectMapperProvider]

### Inherited by implicit conversion Ensuring fromJacksonObjectMapperProvider to Ensuring\[JacksonObjectMapperProvider]

### Inherited by implicit conversion ArrowAssoc fromJacksonObjectMapperProvider to ArrowAssoc\[JacksonObjectMapperProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaSerializationDeserializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaSerializationSerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaStreamJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaStreamJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaTypedJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaTypedJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/CborSerializable.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/Compression$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonMigration.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperFactory.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProvider$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JsonSerializable.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProvider.html](https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProvider.html)*