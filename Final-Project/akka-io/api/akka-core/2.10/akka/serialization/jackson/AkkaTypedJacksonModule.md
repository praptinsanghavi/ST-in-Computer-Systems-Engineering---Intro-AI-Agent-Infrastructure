---
description: Akka 2.10.17 - akka.serialization.jackson.AkkaTypedJacksonModule
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:02:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/AkkaTypedJacksonModule.html
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
- AkkaTypedJacksonModule
- [CborSerializable](CborSerializable.html "Predefined marker trait for serialization with Jackson CBOR.")
- [Compression](Compression$.html)
- [JacksonMigration](JacksonMigration.html "Data migration of old formats to current format can be implemented in a concrete subclass and configured to be used by the JacksonSerializer for a changed class.")
- [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "Used with JacksonObjectMapperProviderSetup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "Registry of shared ObjectMapper instances, each with it's unique bindingName.")
- [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "Setup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JsonSerializable](JsonSerializable.html "Predefined marker trait for serialization with Jackson JSON.")
[c](AkkaTypedJacksonModule$.html "See companion object")[akka](../../index.html).[serialization](../index.html).[jackson](index.html)

# [AkkaTypedJacksonModule](AkkaTypedJacksonModule$.html "See companion object")[**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html "Permalink")

### Companion [object AkkaTypedJacksonModule](AkkaTypedJacksonModule$.html "See companion object")

#### class AkkaTypedJacksonModule extends Module with JacksonModule with TypedActorRefModule

Source[AkkaJacksonModule.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/scala/akka/serialization/jackson/AkkaJacksonModule.scala#L16)Linear SupertypesTypedActorRefModule, JacksonModule, Module, Versioned, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaTypedJacksonModule
2. TypedActorRefModule
3. JacksonModule
4. Module
5. Versioned
6. AnyRef
7. Any
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

1. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#<init>():akka.serialization.jackson.AkkaTypedJacksonModule "Permalink")  new AkkaTypedJacksonModule()
### Value Members

1. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AkkaTypedJacksonModule toany2stringadd\[AkkaTypedJacksonModule] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#+=(beanSerMod:com.fasterxml.jackson.databind.ser.BeanSerializerModifier):JacksonModule.this.type "Permalink")  def \+\=(beanSerMod: BeanSerializerModifier): AkkaTypedJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
5. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#+=(typeMod:com.fasterxml.jackson.databind.type.TypeModifier):JacksonModule.this.type "Permalink")  def \+\=(typeMod: TypeModifier): AkkaTypedJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
6. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#+=(deser:com.fasterxml.jackson.databind.deser.Deserializers):JacksonModule.this.type "Permalink")  def \+\=(deser: Deserializers): AkkaTypedJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
7. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#+=(ser:com.fasterxml.jackson.databind.ser.Serializers):JacksonModule.this.type "Permalink")  def \+\=(ser: com.fasterxml.jackson.databind.ser.Serializers): AkkaTypedJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
8. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#+=(init:com.fasterxml.jackson.databind.Module.SetupContext=>Unit):JacksonModule.this.type "Permalink")  def \+\=(init: (SetupContext) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): AkkaTypedJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
9. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AkkaTypedJacksonModule, B)ImplicitThis member is added by an implicit conversion from AkkaTypedJacksonModule toArrowAssoc\[AkkaTypedJacksonModule] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
10. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#addSerializer(clazz:Class[_],serializer:()=>com.fasterxml.jackson.databind.JsonSerializer[_],deserializer:()=>com.fasterxml.jackson.databind.JsonDeserializer[_]):JacksonModule.this.type "Permalink")  def addSerializer(clazz: Class\[\_], serializer: () \=\> JsonSerializer\[\_], deserializer: () \=\> JsonDeserializer\[\_]): AkkaTypedJacksonModule.this.typeDefinition ClassesJacksonModule
12. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AkkaTypedJacksonModule) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaTypedJacksonModuleImplicitThis member is added by an implicit conversion from AkkaTypedJacksonModule toEnsuring\[AkkaTypedJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AkkaTypedJacksonModule) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaTypedJacksonModuleImplicitThis member is added by an implicit conversion from AkkaTypedJacksonModule toEnsuring\[AkkaTypedJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaTypedJacksonModuleImplicitThis member is added by an implicit conversion from AkkaTypedJacksonModule toEnsuring\[AkkaTypedJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaTypedJacksonModuleImplicitThis member is added by an implicit conversion from AkkaTypedJacksonModule toEnsuring\[AkkaTypedJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#getDependencies():Iterable[_<:com.fasterxml.jackson.databind.Module] "Permalink")  def getDependencies(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[\_ \<: Module]Definition ClassesModule
22. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#getModuleName():String "Permalink")  def getModuleName(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAkkaTypedJacksonModule → Module
23. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#getTypeId():Object "Permalink")  def getTypeId(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesModule
24. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#setupModule(context:com.fasterxml.jackson.databind.Module.SetupContext):Unit "Permalink")  def setupModule(context: SetupContext): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesJacksonModule → Module
30. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#version():com.fasterxml.jackson.core.Version "Permalink")  def version(): com.fasterxml.jackson.core.VersionDefinition ClassesJacksonModule → Module → Versioned
33. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AkkaTypedJacksonModule toStringFormat\[AkkaTypedJacksonModule] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/serialization/jackson/AkkaTypedJacksonModule.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AkkaTypedJacksonModule, B)ImplicitThis member is added by an implicit conversion from AkkaTypedJacksonModule toArrowAssoc\[AkkaTypedJacksonModule] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from TypedActorRefModule

### Inherited from JacksonModule

### Inherited from Module

### Inherited from Versioned

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAkkaTypedJacksonModule to any2stringadd\[AkkaTypedJacksonModule]

### Inherited by implicit conversion StringFormat fromAkkaTypedJacksonModule to StringFormat\[AkkaTypedJacksonModule]

### Inherited by implicit conversion Ensuring fromAkkaTypedJacksonModule to Ensuring\[AkkaTypedJacksonModule]

### Inherited by implicit conversion ArrowAssoc fromAkkaTypedJacksonModule to ArrowAssoc\[AkkaTypedJacksonModule]

### Ungrouped

## Related Pages (Internal Links)

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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaTypedJacksonModule.html](https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/AkkaTypedJacksonModule.html)*