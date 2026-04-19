---
description: Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperFactory
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:26:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/JacksonObjectMapperFactory.html
title: Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperFactory
---

# Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperFactory

> **Summary:** Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperFactory

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
- JacksonObjectMapperFactory
- [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "Registry of shared ObjectMapper instances, each with it's unique bindingName.")
- [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "Setup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JsonSerializable](JsonSerializable.html "Predefined marker trait for serialization with Jackson JSON.")
c[akka](../../index.html).[serialization](../index.html).[jackson](index.html)

# JacksonObjectMapperFactory[**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html "Permalink")

### 

#### class JacksonObjectMapperFactory extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Used with [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html) for defining a `JacksonObjectMapperProvider` that can be
passed in when ActorSystem is created rather than creating one from configured class name.
Create a subclass and override the methods to amend the defaults.

Source[JacksonObjectMapperProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/scala/akka/serialization/jackson/JacksonObjectMapperProvider.scala#L425)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JacksonObjectMapperFactory
2. AnyRef
3. Any
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

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#<init>():akka.serialization.jackson.JacksonObjectMapperFactory "Permalink")  new JacksonObjectMapperFactory()
### Value Members

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from JacksonObjectMapperFactory toany2stringadd\[JacksonObjectMapperFactory] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (JacksonObjectMapperFactory, B)ImplicitThis member is added by an implicit conversion from JacksonObjectMapperFactory toArrowAssoc\[JacksonObjectMapperFactory] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (JacksonObjectMapperFactory) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JacksonObjectMapperFactoryImplicitThis member is added by an implicit conversion from JacksonObjectMapperFactory toEnsuring\[JacksonObjectMapperFactory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (JacksonObjectMapperFactory) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JacksonObjectMapperFactoryImplicitThis member is added by an implicit conversion from JacksonObjectMapperFactory toEnsuring\[JacksonObjectMapperFactory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JacksonObjectMapperFactoryImplicitThis member is added by an implicit conversion from JacksonObjectMapperFactory toEnsuring\[JacksonObjectMapperFactory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JacksonObjectMapperFactoryImplicitThis member is added by an implicit conversion from JacksonObjectMapperFactory toEnsuring\[JacksonObjectMapperFactory] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#newObjectMapper(bindingName:String,jsonFactory:com.fasterxml.jackson.core.JsonFactory):com.fasterxml.jackson.databind.ObjectMapper "Permalink")  def newObjectMapper(bindingName: String, jsonFactory: JsonFactory): ObjectMapperOverride this method to create a new custom instance of `ObjectMapper` for the given `serializerIdentifier`.

Override this method to create a new custom instance of `ObjectMapper` for the given `serializerIdentifier`.

bindingNamename of this `ObjectMapper`

jsonFactoryoptional `JsonFactory` such as `CBORFactory`, for plain JSON `None` (defaults)
 can be used
19. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#overrideConfiguredDeserializationFeatures(bindingName:String,configuredFeatures:Seq[(com.fasterxml.jackson.databind.DeserializationFeature,Boolean)]):Seq[(com.fasterxml.jackson.databind.DeserializationFeature,Boolean)] "Permalink")  def overrideConfiguredDeserializationFeatures(bindingName: String, configuredFeatures: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(DeserializationFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(DeserializationFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]After construction of the `ObjectMapper` the configured deserialization features are applied to
the mapper.

After construction of the `ObjectMapper` the configured deserialization features are applied to
the mapper. These features can be amended programatically by overriding this method and
return the features that are to be applied to the `ObjectMapper`.

When implementing a `JacksonObjectMapperFactory` with Java the `immutable.Seq` can be
created with [akka.japi.Util.immutableSeq](../../japi/Util$.html#immutableSeq[T](iterable:Iterable[T]):Seq[T]).

bindingNamebindingName name of this `ObjectMapper`

configuredFeaturesthe list of `DeserializationFeature` that were configured in
 `akka.serialization.jackson.deserialization-features`
22. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#overrideConfiguredJsonGeneratorFeatures(bindingName:String,configuredFeatures:Seq[(com.fasterxml.jackson.core.JsonGenerator.Feature,Boolean)]):Seq[(com.fasterxml.jackson.core.JsonGenerator.Feature,Boolean)] "Permalink")  def overrideConfiguredJsonGeneratorFeatures(bindingName: String, configuredFeatures: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(Feature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(Feature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]After construction of the `ObjectMapper` the configured JSON generator features are applied to
the mapper.

After construction of the `ObjectMapper` the configured JSON generator features are applied to
the mapper. These features can be amended programmatically by overriding this method and
return the features that are to be applied to the `ObjectMapper`.

bindingNamebindingName name of this `ObjectMapper`

configuredFeaturesthe list of `JsonGenerator.Feature` that were configured in `akka.serialization.jackson.json-generator-features`
23. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#overrideConfiguredJsonParserFeatures(bindingName:String,configuredFeatures:Seq[(com.fasterxml.jackson.core.JsonParser.Feature,Boolean)]):Seq[(com.fasterxml.jackson.core.JsonParser.Feature,Boolean)] "Permalink")  def overrideConfiguredJsonParserFeatures(bindingName: String, configuredFeatures: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(Feature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(Feature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]After construction of the `ObjectMapper` the configured JSON parser features are applied to
the mapper.

After construction of the `ObjectMapper` the configured JSON parser features are applied to
the mapper. These features can be amended programmatically by overriding this method and
return the features that are to be applied to the `ObjectMapper`.

bindingNamebindingName name of this `ObjectMapper`

configuredFeaturesthe list of `JsonParser.Feature` that were configured in `akka.serialization.jackson.json-parser-features`
24. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#overrideConfiguredJsonReadFeatures(bindingName:String,configuredFeatures:Seq[(com.fasterxml.jackson.core.json.JsonReadFeature,Boolean)]):Seq[(com.fasterxml.jackson.core.json.JsonReadFeature,Boolean)] "Permalink")  def overrideConfiguredJsonReadFeatures(bindingName: String, configuredFeatures: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(JsonReadFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(JsonReadFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]`JsonReadFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
an `ObjectMapper`.

`JsonReadFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
an `ObjectMapper`. These features can be amended programmatically by overriding this method and return the features
that are to be applied to the `JsonFactoryBuilder`.

bindingNamebindingName name of this `ObjectMapper`

configuredFeaturesthe list of `JsonReadFeature` that were configured in `akka.serialization.jackson.json-read-features`
25. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#overrideConfiguredJsonWriteFeatures(bindingName:String,configuredFeatures:Seq[(com.fasterxml.jackson.core.json.JsonWriteFeature,Boolean)]):Seq[(com.fasterxml.jackson.core.json.JsonWriteFeature,Boolean)] "Permalink")  def overrideConfiguredJsonWriteFeatures(bindingName: String, configuredFeatures: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(JsonWriteFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(JsonWriteFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]`JsonWriteFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
an `ObjectMapper`.

`JsonWriteFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
an `ObjectMapper`. These features can be amended programmatically by overriding this method and return the features
that are to be applied to the `JsonFactoryBuilder`.

bindingNamebindingName name of this `ObjectMapper`

configuredFeaturesthe list of `JsonWriteFeature` that were configured in `akka.serialization.jackson.json-write-features`
26. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#overrideConfiguredMapperFeatures(bindingName:String,configuredFeatures:Seq[(com.fasterxml.jackson.databind.MapperFeature,Boolean)]):Seq[(com.fasterxml.jackson.databind.MapperFeature,Boolean)] "Permalink")  def overrideConfiguredMapperFeatures(bindingName: String, configuredFeatures: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(MapperFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(MapperFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]After construction of the `ObjectMapper` the configured mapper features are applied to
the mapper.

After construction of the `ObjectMapper` the configured mapper features are applied to
the mapper. These features can be amended programmatically by overriding this method and
return the features that are to be applied to the `ObjectMapper`.

bindingNamebindingName name of this `ObjectMapper`

configuredFeaturesthe list of `MapperFeatures` that were configured in `akka.serialization.jackson.mapper-features`
27. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#overrideConfiguredModules(bindingName:String,configuredModules:Seq[com.fasterxml.jackson.databind.Module]):Seq[com.fasterxml.jackson.databind.Module] "Permalink")  def overrideConfiguredModules(bindingName: String, configuredModules: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Module]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Module]After construction of the `ObjectMapper` the configured modules are added to
the mapper.

After construction of the `ObjectMapper` the configured modules are added to
the mapper. These modules can be amended programatically by overriding this method and
return the modules that are to be applied to the `ObjectMapper`.

When implementing a `JacksonObjectMapperFactory` with Java the `immutable.Seq` can be
created with [akka.japi.Util.immutableSeq](../../japi/Util$.html#immutableSeq[T](iterable:Iterable[T]):Seq[T]).

bindingNamebindingName name of this `ObjectMapper`

configuredModulesthe list of `Modules` that were configured in
 `akka.serialization.jackson.deserialization-features`
28. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#overrideConfiguredSerializationFeatures(bindingName:String,configuredFeatures:Seq[(com.fasterxml.jackson.databind.SerializationFeature,Boolean)]):Seq[(com.fasterxml.jackson.databind.SerializationFeature,Boolean)] "Permalink")  def overrideConfiguredSerializationFeatures(bindingName: String, configuredFeatures: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(SerializationFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(SerializationFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]After construction of the `ObjectMapper` the configured serialization features are applied to
the mapper.

After construction of the `ObjectMapper` the configured serialization features are applied to
the mapper. These features can be amended programatically by overriding this method and
return the features that are to be applied to the `ObjectMapper`.

When implementing a `JacksonObjectMapperFactory` with Java the `immutable.Seq` can be
created with [akka.japi.Util.immutableSeq](../../japi/Util$.html#immutableSeq[T](iterable:Iterable[T]):Seq[T]).

bindingNamebindingName name of this `ObjectMapper`

configuredFeaturesthe list of `SerializationFeature` that were configured in
 `akka.serialization.jackson.serialization-features`
29. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#overrideConfiguredStreamReadFeatures(bindingName:String,configuredFeatures:Seq[(com.fasterxml.jackson.core.StreamReadFeature,Boolean)]):Seq[(com.fasterxml.jackson.core.StreamReadFeature,Boolean)] "Permalink")  def overrideConfiguredStreamReadFeatures(bindingName: String, configuredFeatures: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(StreamReadFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(StreamReadFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]`StreamReadFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
an `ObjectMapper`.

`StreamReadFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
an `ObjectMapper`. These features can be amended programmatically by overriding this method and return the features
that are to be applied to the `JsonFactoryBuilder`.

bindingNamebindingName name of this `ObjectMapper`

configuredFeaturesthe list of `StreamReadFeature` that were configured in `akka.serialization.jackson.stream-read-features`
30. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#overrideConfiguredStreamWriteFeatures(bindingName:String,configuredFeatures:Seq[(com.fasterxml.jackson.core.StreamWriteFeature,Boolean)]):Seq[(com.fasterxml.jackson.core.StreamWriteFeature,Boolean)] "Permalink")  def overrideConfiguredStreamWriteFeatures(bindingName: String, configuredFeatures: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(StreamWriteFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(StreamWriteFeature, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))]`StreamWriteFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
an `ObjectMapper`.

`StreamWriteFeature`s used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
an `ObjectMapper`. These features can be amended programmatically by overriding this method and return the features
that are to be applied to the `JsonFactoryBuilder`.

bindingNamebindingName name of this `ObjectMapper`

configuredFeaturesthe list of `StreamWriterFeature` that were configured in `akka.serialization.jackson.stream-write-features`
31. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#overrideConfiguredVisibility(bindingName:String,configuredFeatures:Seq[(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)]):Seq[(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)] "Permalink")  def overrideConfiguredVisibility(bindingName: String, configuredFeatures: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(PropertyAccessor, Visibility)]): [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(PropertyAccessor, Visibility)]Visibility settings used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
an `ObjectMapper`.

Visibility settings used to configure the `JsonFactoryBuilder` that, if provided, will later be used to create
an `ObjectMapper`. These settings can be amended programmatically by overriding this method and return the values
that are to be applied to the `JsonFactoryBuilder`.

bindingNamebindingName name of this `ObjectMapper`

configuredFeaturesthe list of `PropertyAccessor`/`JsonAutoDetect.Visibility` that were configured in
 `akka.serialization.jackson.visibility`
32. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
33. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
34. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
35. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
36. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from JacksonObjectMapperFactory toStringFormat\[JacksonObjectMapperFactory] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/serialization/jackson/JacksonObjectMapperFactory.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (JacksonObjectMapperFactory, B)ImplicitThis member is added by an implicit conversion from JacksonObjectMapperFactory toArrowAssoc\[JacksonObjectMapperFactory] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromJacksonObjectMapperFactory to any2stringadd\[JacksonObjectMapperFactory]

### Inherited by implicit conversion StringFormat fromJacksonObjectMapperFactory to StringFormat\[JacksonObjectMapperFactory]

### Inherited by implicit conversion Ensuring fromJacksonObjectMapperFactory to Ensuring\[JacksonObjectMapperFactory]

### Inherited by implicit conversion ArrowAssoc fromJacksonObjectMapperFactory to ArrowAssoc\[JacksonObjectMapperFactory]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Util$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaSerializationDeserializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaSerializationSerializer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaStreamJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaStreamJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaTypedJacksonModule$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaTypedJacksonModule.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/CborSerializable.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/Compression$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/JacksonMigration.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/JacksonObjectMapperFactory.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/JacksonObjectMapperProvider$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/JacksonObjectMapperProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/JacksonObjectMapperProviderSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/JsonSerializable.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/JacksonObjectMapperFactory.html](https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/JacksonObjectMapperFactory.html)*