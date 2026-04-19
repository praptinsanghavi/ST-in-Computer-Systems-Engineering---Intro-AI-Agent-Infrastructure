---
description: Akka 2.10.17 - akka.serialization.jackson.AkkaStreamJacksonModule
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:26:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/AkkaStreamJacksonModule.html
title: Akka 2.10.17 - akka.serialization.jackson.AkkaStreamJacksonModule
---

# Akka 2.10.17 - akka.serialization.jackson.AkkaStreamJacksonModule

> **Summary:** Akka 2.10.17 - akka.serialization.jackson.AkkaStreamJacksonModule

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
- AkkaStreamJacksonModule
- [AkkaTypedJacksonModule](AkkaTypedJacksonModule.html)
- [CborSerializable](CborSerializable.html "Predefined marker trait for serialization with Jackson CBOR.")
- [Compression](Compression$.html)
- [JacksonMigration](JacksonMigration.html "Data migration of old formats to current format can be implemented in a concrete subclass and configured to be used by the JacksonSerializer for a changed class.")
- [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "Used with JacksonObjectMapperProviderSetup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "Registry of shared ObjectMapper instances, each with it's unique bindingName.")
- [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "Setup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JsonSerializable](JsonSerializable.html "Predefined marker trait for serialization with Jackson JSON.")
[c](AkkaStreamJacksonModule$.html "See companion object")[akka](../../index.html).[serialization](../index.html).[jackson](index.html)

# [AkkaStreamJacksonModule](AkkaStreamJacksonModule$.html "See companion object")[**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html "Permalink")

### Companion [object AkkaStreamJacksonModule](AkkaStreamJacksonModule$.html "See companion object")

#### class AkkaStreamJacksonModule extends Module with JacksonModule with StreamRefModule

Source[AkkaJacksonModule.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/scala/akka/serialization/jackson/AkkaJacksonModule.scala#L22)Linear SupertypesStreamRefModule, JacksonModule, Module, Versioned, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AkkaStreamJacksonModule
2. StreamRefModule
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

1. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#<init>():akka.serialization.jackson.AkkaStreamJacksonModule "Permalink")  new AkkaStreamJacksonModule()
### Value Members

1. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AkkaStreamJacksonModule toany2stringadd\[AkkaStreamJacksonModule] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#+=(beanSerMod:com.fasterxml.jackson.databind.ser.BeanSerializerModifier):JacksonModule.this.type "Permalink")  def \+\=(beanSerMod: BeanSerializerModifier): AkkaStreamJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
5. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#+=(typeMod:com.fasterxml.jackson.databind.type.TypeModifier):JacksonModule.this.type "Permalink")  def \+\=(typeMod: TypeModifier): AkkaStreamJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
6. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#+=(deser:com.fasterxml.jackson.databind.deser.Deserializers):JacksonModule.this.type "Permalink")  def \+\=(deser: Deserializers): AkkaStreamJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
7. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#+=(ser:com.fasterxml.jackson.databind.ser.Serializers):JacksonModule.this.type "Permalink")  def \+\=(ser: com.fasterxml.jackson.databind.ser.Serializers): AkkaStreamJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
8. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#+=(init:com.fasterxml.jackson.databind.Module.SetupContext=>Unit):JacksonModule.this.type "Permalink")  def \+\=(init: (SetupContext) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): AkkaStreamJacksonModule.this.typeAttributesprotected Definition ClassesJacksonModule
9. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AkkaStreamJacksonModule, B)ImplicitThis member is added by an implicit conversion from AkkaStreamJacksonModule toArrowAssoc\[AkkaStreamJacksonModule] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
10. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#addSerializer(clazz:Class[_],serializer:()=>com.fasterxml.jackson.databind.JsonSerializer[_],deserializer:()=>com.fasterxml.jackson.databind.JsonDeserializer[_]):JacksonModule.this.type "Permalink")  def addSerializer(clazz: Class\[\_], serializer: () \=\> JsonSerializer\[\_], deserializer: () \=\> JsonDeserializer\[\_]): AkkaStreamJacksonModule.this.typeDefinition ClassesJacksonModule
12. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
13. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AkkaStreamJacksonModule) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaStreamJacksonModuleImplicitThis member is added by an implicit conversion from AkkaStreamJacksonModule toEnsuring\[AkkaStreamJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AkkaStreamJacksonModule) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaStreamJacksonModuleImplicitThis member is added by an implicit conversion from AkkaStreamJacksonModule toEnsuring\[AkkaStreamJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AkkaStreamJacksonModuleImplicitThis member is added by an implicit conversion from AkkaStreamJacksonModule toEnsuring\[AkkaStreamJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AkkaStreamJacksonModuleImplicitThis member is added by an implicit conversion from AkkaStreamJacksonModule toEnsuring\[AkkaStreamJacksonModule] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#getDependencies():Iterable[_<:com.fasterxml.jackson.databind.Module] "Permalink")  def getDependencies(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[\_ \<: Module]Definition ClassesModule
22. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#getModuleName():String "Permalink")  def getModuleName(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAkkaStreamJacksonModule → Module
23. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#getTypeId():Object "Permalink")  def getTypeId(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition ClassesModule
24. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
26. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#setupModule(context:com.fasterxml.jackson.databind.Module.SetupContext):Unit "Permalink")  def setupModule(context: SetupContext): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesJacksonModule → Module
30. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
31. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#version():com.fasterxml.jackson.core.Version "Permalink")  def version(): com.fasterxml.jackson.core.VersionDefinition ClassesJacksonModule → Module → Versioned
33. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AkkaStreamJacksonModule toStringFormat\[AkkaStreamJacksonModule] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/serialization/jackson/AkkaStreamJacksonModule.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AkkaStreamJacksonModule, B)ImplicitThis member is added by an implicit conversion from AkkaStreamJacksonModule toArrowAssoc\[AkkaStreamJacksonModule] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from StreamRefModule

### Inherited from JacksonModule

### Inherited from Module

### Inherited from Versioned

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAkkaStreamJacksonModule to any2stringadd\[AkkaStreamJacksonModule]

### Inherited by implicit conversion StringFormat fromAkkaStreamJacksonModule to StringFormat\[AkkaStreamJacksonModule]

### Inherited by implicit conversion Ensuring fromAkkaStreamJacksonModule to Ensuring\[AkkaStreamJacksonModule]

### Inherited by implicit conversion ArrowAssoc fromAkkaStreamJacksonModule to ArrowAssoc\[AkkaStreamJacksonModule]

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
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaStreamJacksonModule.html](https://doc.akka.io/api/akka-core/2.10.17/akka/serialization/jackson/AkkaStreamJacksonModule.html)*