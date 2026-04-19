---
description: Akka 2.10.17 - akka.serialization.jackson.AkkaJacksonModule
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:26:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/AkkaJacksonModule.html
title: Akka 2.10.17 - akka.serialization.jackson.AkkaJacksonModule
---

# Akka 2.10.17 - akka.serialization.jackson.AkkaJacksonModule

> **Summary:** Akka 2.10.17 - akka.serialization.jackson.AkkaJacksonModule

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/serialization/index.html "Permalink")  package [serialization](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/serialization/jackson/index.html "Permalink")  package [jackson](index.html)Definition Classes[serialization](../index.html)
- [**](../../../akka/serialization/jackson/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[jackson](index.html)
- AkkaJacksonModule
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
[c](AkkaJacksonModule$.html "See companion object")[akka](../../index.html).[serialization](../index.html).[jackson](index.html)

# [AkkaJacksonModule](AkkaJacksonModule$.html "See companion object")[**](../../../akka/serialization/jackson/AkkaJacksonModule.html "Permalink")

### Companion [object AkkaJacksonModule](AkkaJacksonModule$.html "See companion object")

#### class AkkaJacksonModule extends Module with JacksonModule with ActorRefModule with AddressModule with FiniteDurationModule

Complete module with support for all custom serializers.

Source[AkkaJacksonModule.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/scala/akka/serialization/jackson/AkkaJacksonModule.scala#L10)Linear SupertypesFiniteDurationModule, AddressModule, ActorRefModule, JacksonModule, Module, Versioned, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[AkkaJacksonModule](AkkaJacksonModule$.html), [AkkaStreamJacksonModule](AkkaStreamJacksonModule$.html), [AkkaTypedJacksonModule](AkkaTypedJacksonModule$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaJacksonModule
2. FiniteDurationModule
3. AddressModule
4. ActorRefModule
5. JacksonModule
6. Module
7. Versioned
8. AnyRef
9. Any
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

1. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#<init>():akka.serialization.jackson.AkkaJacksonModule "Permalink")  new AkkaJacksonModule()
### Value Members

1. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AkkaJacksonModule toany2stringadd\[AkkaJacksonModule] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#+=(beanSerMod:com.fasterxml.jackson.databind.ser.BeanSerializerModifier):JacksonModule.this.type "Permalink")  def \+\=(beanSerMod: BeanSerializerModifier): AkkaJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
5. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#+=(typeMod:com.fasterxml.jackson.databind.type.TypeModifier):JacksonModule.this.type "Permalink")  def \+\=(typeMod: TypeModifier): AkkaJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
6. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#+=(deser:com.fasterxml.jackson.databind.deser.Deserializers):JacksonModule.this.type "Permalink")  def \+\=(deser: Deserializers): AkkaJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
7. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#+=(ser:com.fasterxml.jackson.databind.ser.Serializers):JacksonModule.this.type "Permalink")  def \+\=(ser: com.fasterxml.jackson.databind.ser.Serializers): AkkaJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
8. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#+=(init:com.fasterxml.jackson.databind.Module.SetupContext=>Unit):JacksonModule.this.type "Permalink")  def \+\=(init: (SetupContext) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): AkkaJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
9. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AkkaJacksonModule, B)ImplicitThis member is added by an implicit conversion from AkkaJacksonModule toArrowAssoc\[AkkaJacksonModule] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
10. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#addSerializer(clazz:Class[_],serializer:()=>com.fasterxml.jackson.databind.JsonSerializer[_],deserializer:()=>com.fasterxml.jackson.databind.JsonDeserializer[_]):JacksonModule.this.type "Permalink")  def addSerializer(clazz: Class\[\_], serializer: () \=\> JsonSerializer\[\_], deserializer: () \=\> JsonDeserializer\[\_]): AkkaJacksonModule.this.typeDefinition ClassesJacksonModule
12. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AkkaJacksonModule) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaJacksonModuleImplicitThis member is added by an implicit conversion from AkkaJacksonModule toEnsuring\[AkkaJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AkkaJacksonModule) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaJacksonModuleImplicitThis member is added by an implicit conversion from AkkaJacksonModule toEnsuring\[AkkaJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaJacksonModuleImplicitThis member is added by an implicit conversion from AkkaJacksonModule toEnsuring\[AkkaJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaJacksonModuleImplicitThis member is added by an implicit conversion from AkkaJacksonModule toEnsuring\[AkkaJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#getDependencies():Iterable[_<:com.fasterxml.jackson.databind.Module] "Permalink")  def getDependencies(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[\_ \<: Module]Definition ClassesModule
22. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#getModuleName():String "Permalink")  def getModuleName(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAkkaJacksonModule → Module
23. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#getTypeId():Object "Permalink")  def getTypeId(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesModule
24. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#setupModule(context:com.fasterxml.jackson.databind.Module.SetupContext):Unit "Permalink")  def setupModule(context: SetupContext): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesJacksonModule → Module
30. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#version():com.fasterxml.jackson.core.Version "Permalink")  def version(): com.fasterxml.jackson.core.VersionDefinition ClassesJacksonModule → Module → Versioned
33. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AkkaJacksonModule toStringFormat\[AkkaJacksonModule] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/serialization/jackson/AkkaJacksonModule.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AkkaJacksonModule, B)ImplicitThis member is added by an implicit conversion from AkkaJacksonModule toArrowAssoc\[AkkaJacksonModule] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from FiniteDurationModule

### Inherited from AddressModule

### Inherited from ActorRefModule

### Inherited from JacksonModule

### Inherited from Module

### Inherited from Versioned

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAkkaJacksonModule to any2stringadd\[AkkaJacksonModule]

### Inherited by implicit conversion StringFormat fromAkkaJacksonModule to StringFormat\[AkkaJacksonModule]

### Inherited by implicit conversion Ensuring fromAkkaJacksonModule to Ensuring\[AkkaJacksonModule]

### Inherited by implicit conversion ArrowAssoc fromAkkaJacksonModule to ArrowAssoc\[AkkaJacksonModule]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaJacksonModule.html](https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaJacksonModule.html)*