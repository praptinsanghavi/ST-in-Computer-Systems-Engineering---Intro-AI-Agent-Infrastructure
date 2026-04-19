---
description: Akka 2.10.17 - akka.serialization.jackson.AkkaSerializationSerializer
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:26:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/AkkaSerializationSerializer.html
title: Akka 2.10.17 - akka.serialization.jackson.AkkaSerializationSerializer
---

# Akka 2.10.17 - akka.serialization.jackson.AkkaSerializationSerializer

> **Summary:** Akka 2.10.17 - akka.serialization.jackson.AkkaSerializationSerializer

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/serialization/index.html "Permalink")  package [serialization](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/serialization/jackson/index.html "Permalink")  package [jackson](index.html)Definition Classes[serialization](../index.html)
- [**](../../../akka/serialization/jackson/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[jackson](index.html)
- [AkkaJacksonModule](AkkaJacksonModule.html "Complete module with support for all custom serializers.")
- [AkkaSerializationDeserializer](AkkaSerializationDeserializer.html)
- AkkaSerializationSerializer
- [AkkaStreamJacksonModule](AkkaStreamJacksonModule.html)
- [AkkaTypedJacksonModule](AkkaTypedJacksonModule.html)
- [CborSerializable](CborSerializable.html "Predefined marker trait for serialization with Jackson CBOR.")
- [Compression](Compression$.html)
- [JacksonMigration](JacksonMigration.html "Data migration of old formats to current format can be implemented in a concrete subclass and configured to be used by the JacksonSerializer for a changed class.")
- [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "Used with JacksonObjectMapperProviderSetup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "Registry of shared ObjectMapper instances, each with it's unique bindingName.")
- [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "Setup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JsonSerializable](JsonSerializable.html "Predefined marker trait for serialization with Jackson JSON.")
c[akka](../../index.html).[serialization](../index.html).[jackson](index.html)

# AkkaSerializationSerializer[**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html "Permalink")

### 

#### final  class AkkaSerializationSerializer extends StdScalarSerializer\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)] with ActorSystemAccess

Source[AkkaSerializationModule.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/scala/akka/serialization/jackson/AkkaSerializationModule.scala#L14)Linear SupertypesActorSystemAccess, StdScalarSerializer\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], StdSerializer\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), SchemaAware, JsonSerializer\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], JsonFormatVisitable, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaSerializationSerializer
2. ActorSystemAccess
3. StdScalarSerializer
4. StdSerializer
5. Serializable
6. SchemaAware
7. JsonSerializer
8. JsonFormatVisitable
9. AnyRef
10. Any
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

1. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#<init>():akka.serialization.jackson.AkkaSerializationSerializer "Permalink")  new AkkaSerializationSerializer()
### Value Members

1. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AkkaSerializationSerializer toany2stringadd\[AkkaSerializationSerializer] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AkkaSerializationSerializer, B)ImplicitThis member is added by an implicit conversion from AkkaSerializationSerializer toArrowAssoc\[AkkaSerializationSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#acceptJsonFormatVisitor(x$1:com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,x$2:com.fasterxml.jackson.databind.JavaType):Unit "Permalink")  def acceptJsonFormatVisitor(arg0: JsonFormatVisitorWrapper, arg1: JavaType): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesStdScalarSerializer → StdSerializer → JsonSerializer → JsonFormatVisitableAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException])
7. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#createSchemaNode(x$1:String,x$2:Boolean):com.fasterxml.jackson.databind.node.ObjectNode "Permalink")  def createSchemaNode(arg0: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String), arg1: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ObjectNodeAttributesprotected\[std] Definition ClassesStdSerializer
10. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#createSchemaNode(x$1:String):com.fasterxml.jackson.databind.node.ObjectNode "Permalink")  def createSchemaNode(arg0: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): ObjectNodeAttributesprotected\[std] Definition ClassesStdSerializer
11. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#currentSystem():akka.actor.ExtendedActorSystem "Permalink")  def currentSystem(): [ExtendedActorSystem](../../actor/ExtendedActorSystem.html)Definition ClassesActorSystemAccess
12. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AkkaSerializationSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaSerializationSerializerImplicitThis member is added by an implicit conversion from AkkaSerializationSerializer toEnsuring\[AkkaSerializationSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AkkaSerializationSerializer) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaSerializationSerializerImplicitThis member is added by an implicit conversion from AkkaSerializationSerializer toEnsuring\[AkkaSerializationSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaSerializationSerializerImplicitThis member is added by an implicit conversion from AkkaSerializationSerializer toEnsuring\[AkkaSerializationSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaSerializationSerializerImplicitThis member is added by an implicit conversion from AkkaSerializationSerializer toEnsuring\[AkkaSerializationSerializer] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#findAnnotatedContentSerializer(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer[_] "Permalink")  def findAnnotatedContentSerializer(arg0: SerializerProvider, arg1: BeanProperty): JsonSerializer\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Attributesprotected\[std] Definition ClassesStdSerializerAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException])
19. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#findContextualConvertingSerializer(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:com.fasterxml.jackson.databind.BeanProperty,x$3:com.fasterxml.jackson.databind.JsonSerializer[_]):com.fasterxml.jackson.databind.JsonSerializer[_] "Permalink")  def findContextualConvertingSerializer(arg0: SerializerProvider, arg1: BeanProperty, arg2: JsonSerializer\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): JsonSerializer\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Attributesprotected\[std] Definition ClassesStdSerializerAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException])
20. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#findFormatFeature(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:com.fasterxml.jackson.databind.BeanProperty,x$3:Class[_],x$4:com.fasterxml.jackson.annotation.JsonFormat.Feature):Boolean "Permalink")  def findFormatFeature(arg0: SerializerProvider, arg1: BeanProperty, arg2: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], arg3: Feature): [Boolean](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Boolean.html#java.lang.Boolean)Attributesprotected\[std] Definition ClassesStdSerializer
21. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#findFormatOverrides(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:com.fasterxml.jackson.databind.BeanProperty,x$3:Class[_]):com.fasterxml.jackson.annotation.JsonFormat.Value "Permalink")  def findFormatOverrides(arg0: SerializerProvider, arg1: BeanProperty, arg2: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): ValueAttributesprotected\[std] Definition ClassesStdSerializer
22. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#findIncludeOverrides(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:com.fasterxml.jackson.databind.BeanProperty,x$3:Class[_]):com.fasterxml.jackson.annotation.JsonInclude.Value "Permalink")  def findIncludeOverrides(arg0: SerializerProvider, arg1: BeanProperty, arg2: [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): ValueAttributesprotected\[std] Definition ClassesStdSerializer
23. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#findPropertyFilter(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:Object,x$3:Object):com.fasterxml.jackson.databind.ser.PropertyFilter "Permalink")  def findPropertyFilter(arg0: SerializerProvider, arg1: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), arg2: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): PropertyFilterAttributesprotected\[std] Definition ClassesStdSerializerAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException])
24. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#getDelegatee():com.fasterxml.jackson.databind.JsonSerializer[_] "Permalink")  def getDelegatee(): JsonSerializer\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesJsonSerializer
26. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#handledType():Class[T] "Permalink")  def handledType(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesStdSerializer → JsonSerializer
27. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#isDefaultSerializer(x$1:com.fasterxml.jackson.databind.JsonSerializer[_]):Boolean "Permalink")  def isDefaultSerializer(arg0: JsonSerializer\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Attributesprotected\[std] Definition ClassesStdSerializer
29. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#isEmpty(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:T):Boolean "Permalink")  def isEmpty(arg0: SerializerProvider, arg1: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesJsonSerializer
30. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
31. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#isUnwrappingSerializer():Boolean "Permalink")  def isUnwrappingSerializer(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesJsonSerializer
32. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
33. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
35. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#properties():java.util.Iterator[com.fasterxml.jackson.databind.ser.PropertyWriter] "Permalink")  def properties(): [Iterator](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html#java.util.Iterator)\[PropertyWriter]Definition ClassesJsonSerializer
36. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#replaceDelegatee(x$1:com.fasterxml.jackson.databind.JsonSerializer[_]):com.fasterxml.jackson.databind.JsonSerializer[T] "Permalink")  def replaceDelegatee(arg0: JsonSerializer\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): JsonSerializer\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesJsonSerializer
37. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#serialization:akka.serialization.Serialization "Permalink")  def serialization: [Serialization](../Serialization.html)
38. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#serialize(value:AnyRef,jgen:com.fasterxml.jackson.core.JsonGenerator,provider:com.fasterxml.jackson.databind.SerializerProvider):Unit "Permalink")  def serialize(value: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), jgen: JsonGenerator, provider: SerializerProvider): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAkkaSerializationSerializer → StdSerializer → JsonSerializer
39. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#serializeWithType(x$1:T,x$2:com.fasterxml.jackson.core.JsonGenerator,x$3:com.fasterxml.jackson.databind.SerializerProvider,x$4:com.fasterxml.jackson.databind.jsontype.TypeSerializer):Unit "Permalink")  def serializeWithType(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), arg1: JsonGenerator, arg2: SerializerProvider, arg3: TypeSerializer): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesStdScalarSerializer → JsonSerializerAnnotations@throws(classOf\[java.io.IOException])
40. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
41. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
42. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#unwrappingSerializer(x$1:com.fasterxml.jackson.databind.util.NameTransformer):com.fasterxml.jackson.databind.JsonSerializer[T] "Permalink")  def unwrappingSerializer(arg0: NameTransformer): JsonSerializer\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesJsonSerializer
43. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#usesObjectId():Boolean "Permalink")  def usesObjectId(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesJsonSerializer
44. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#visitArrayFormat(x$1:com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,x$2:com.fasterxml.jackson.databind.JavaType,x$3:com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes):Unit "Permalink")  def visitArrayFormat(arg0: JsonFormatVisitorWrapper, arg1: JavaType, arg2: JsonFormatTypes): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[std] Definition ClassesStdSerializerAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException])
45. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#visitArrayFormat(x$1:com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,x$2:com.fasterxml.jackson.databind.JavaType,x$3:com.fasterxml.jackson.databind.JsonSerializer[_],x$4:com.fasterxml.jackson.databind.JavaType):Unit "Permalink")  def visitArrayFormat(arg0: JsonFormatVisitorWrapper, arg1: JavaType, arg2: JsonSerializer\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], arg3: JavaType): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[std] Definition ClassesStdSerializerAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException])
46. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#visitFloatFormat(x$1:com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,x$2:com.fasterxml.jackson.databind.JavaType,x$3:com.fasterxml.jackson.core.JsonParser.NumberType):Unit "Permalink")  def visitFloatFormat(arg0: JsonFormatVisitorWrapper, arg1: JavaType, arg2: NumberType): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[std] Definition ClassesStdSerializerAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException])
47. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#visitIntFormat(x$1:com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,x$2:com.fasterxml.jackson.databind.JavaType,x$3:com.fasterxml.jackson.core.JsonParser.NumberType,x$4:com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat):Unit "Permalink")  def visitIntFormat(arg0: JsonFormatVisitorWrapper, arg1: JavaType, arg2: NumberType, arg3: JsonValueFormat): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[std] Definition ClassesStdSerializerAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException])
48. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#visitIntFormat(x$1:com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,x$2:com.fasterxml.jackson.databind.JavaType,x$3:com.fasterxml.jackson.core.JsonParser.NumberType):Unit "Permalink")  def visitIntFormat(arg0: JsonFormatVisitorWrapper, arg1: JavaType, arg2: NumberType): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[std] Definition ClassesStdSerializerAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException])
49. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#visitStringFormat(x$1:com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,x$2:com.fasterxml.jackson.databind.JavaType,x$3:com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat):Unit "Permalink")  def visitStringFormat(arg0: JsonFormatVisitorWrapper, arg1: JavaType, arg2: JsonValueFormat): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[std] Definition ClassesStdSerializerAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException])
50. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#visitStringFormat(x$1:com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,x$2:com.fasterxml.jackson.databind.JavaType):Unit "Permalink")  def visitStringFormat(arg0: JsonFormatVisitorWrapper, arg1: JavaType): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[std] Definition ClassesStdSerializerAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException])
51. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
52. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
53. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
54. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#withFilterId(x$1:Object):com.fasterxml.jackson.databind.JsonSerializer[_] "Permalink")  def withFilterId(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): JsonSerializer\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesJsonSerializer
55. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#withIgnoredProperties(x$1:java.util.Set[String]):com.fasterxml.jackson.databind.JsonSerializer[_] "Permalink")  def withIgnoredProperties(arg0: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[[String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)]): JsonSerializer\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesJsonSerializer
56. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#wrapAndThrow(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:Throwable,x$3:Object,x$4:Int):Unit "Permalink")  def wrapAndThrow(arg0: SerializerProvider, arg1: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), arg2: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), arg3: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesStdSerializerAnnotations@throws(classOf\[java.io.IOException])
57. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#wrapAndThrow(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:Throwable,x$3:Object,x$4:String):Unit "Permalink")  def wrapAndThrow(arg0: SerializerProvider, arg1: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), arg2: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), arg3: [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesStdSerializerAnnotations@throws(classOf\[java.io.IOException])
### Deprecated Value Members

1. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#findConvertingContentSerializer(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:com.fasterxml.jackson.databind.BeanProperty,x$3:com.fasterxml.jackson.databind.JsonSerializer[_]):com.fasterxml.jackson.databind.JsonSerializer[_] "Permalink")  def findConvertingContentSerializer(arg0: SerializerProvider, arg1: BeanProperty, arg2: JsonSerializer\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]): JsonSerializer\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Attributesprotected\[std] Definition ClassesStdSerializerAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException]) @Deprecated Deprecated
3. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AkkaSerializationSerializer toStringFormat\[AkkaSerializationSerializer] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#getSchema(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:java.lang.reflect.Type):com.fasterxml.jackson.databind.JsonNode "Permalink")  def getSchema(arg0: SerializerProvider, arg1: [Type](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Type.html#java.lang.reflect.Type)): JsonNodeDefinition ClassesStdScalarSerializer → StdSerializer → SchemaAwareAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException]) @Deprecated Deprecated
5. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#getSchema(x$1:com.fasterxml.jackson.databind.SerializerProvider,x$2:java.lang.reflect.Type,x$3:Boolean):com.fasterxml.jackson.databind.JsonNode "Permalink")  def getSchema(arg0: SerializerProvider, arg1: [Type](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Type.html#java.lang.reflect.Type), arg2: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JsonNodeDefinition ClassesStdSerializer → SchemaAwareAnnotations@throws(classOf\[com.fasterxml.jackson.databind.JsonMappingException]) @Deprecated Deprecated
6. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#isEmpty(x$1:T):Boolean "Permalink")  def isEmpty(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesJsonSerializerAnnotations@Deprecated Deprecated
7. [**](../../../akka/serialization/jackson/AkkaSerializationSerializer.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AkkaSerializationSerializer, B)ImplicitThis member is added by an implicit conversion from AkkaSerializationSerializer toArrowAssoc\[AkkaSerializationSerializer] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from ActorSystemAccess

### Inherited from StdScalarSerializer\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]

### Inherited from StdSerializer\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from SchemaAware

### Inherited from JsonSerializer\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]

### Inherited from JsonFormatVisitable

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAkkaSerializationSerializer to any2stringadd\[AkkaSerializationSerializer]

### Inherited by implicit conversion StringFormat fromAkkaSerializationSerializer to StringFormat\[AkkaSerializationSerializer]

### Inherited by implicit conversion Ensuring fromAkkaSerializationSerializer to Ensuring\[AkkaSerializationSerializer]

### Inherited by implicit conversion ArrowAssoc fromAkkaSerializationSerializer to ArrowAssoc\[AkkaSerializationSerializer]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/Serialization.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaSerializationSerializer.html](https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaSerializationSerializer.html)*