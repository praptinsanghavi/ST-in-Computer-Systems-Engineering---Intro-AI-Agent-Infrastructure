---
description: Akka 2.10.17 - akka.serialization.jackson.JacksonMigration
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:37:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/JacksonMigration.html
title: Akka 2.10.17 - akka.serialization.jackson.JacksonMigration
---

# Akka 2.10.17 - akka.serialization.jackson.JacksonMigration

> **Summary:** Akka 2.10.17 - akka.serialization.jackson.JacksonMigration

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
- JacksonMigration
- [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html "Used with JacksonObjectMapperProviderSetup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JacksonObjectMapperProvider](JacksonObjectMapperProvider.html "Registry of shared ObjectMapper instances, each with it's unique bindingName.")
- [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup.html "Setup for defining a JacksonObjectMapperProvider that can be passed in when ActorSystem is created rather than creating one from configured class name.")
- [JsonSerializable](JsonSerializable.html "Predefined marker trait for serialization with Jackson JSON.")
c[akka](../../index.html).[serialization](../index.html).[jackson](index.html)

# JacksonMigration[**](../../../akka/serialization/jackson/JacksonMigration.html "Permalink")

### 

#### abstract  class JacksonMigration extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Data migration of old formats to current format can
be implemented in a concrete subclass and configured to
be used by the `JacksonSerializer` for a changed class.

It is used when deserializing data of older version than the
[JacksonMigration\#currentVersion](#currentVersion:Int). You implement the transformation of the
JSON structure in the [JacksonMigration\#transform](#transform(fromVersion:Int,json:com.fasterxml.jackson.databind.JsonNode):com.fasterxml.jackson.databind.JsonNode) method. If you have changed the
class name you should override [JacksonMigration\#transformClassName](#transformClassName(fromVersion:Int,className:String):String) and return
current class name.

Source[JacksonMigration.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/scala/akka/serialization/jackson/JacksonMigration.scala#L22)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JacksonMigration
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

1. [**](../../../akka/serialization/jackson/JacksonMigration.html#<init>():akka.serialization.jackson.JacksonMigration "Permalink")  new JacksonMigration()
### Abstract Value Members

1. [**](../../../akka/serialization/jackson/JacksonMigration.html#currentVersion:Int "Permalink") abstract  def currentVersion: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Define current version, that is, the value used when serializing new data.

Define current version, that is, the value used when serializing new data. The first version, when no
migration was used, is always 1\.
2. [**](../../../akka/serialization/jackson/JacksonMigration.html#transform(fromVersion:Int,json:com.fasterxml.jackson.databind.JsonNode):com.fasterxml.jackson.databind.JsonNode "Permalink") abstract  def transform(fromVersion: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), json: JsonNode): JsonNodeImplement the transformation of the old JSON structure to the new
JSON structure.

Implement the transformation of the old JSON structure to the new
JSON structure. The `JsonNode` is mutable so you can add and remove fields,
or change values. Note that you have to cast to specific sub\-classes such
as `ObjectNode` and `ArrayNode` to get access to mutators.

fromVersionthe version of the old data

jsonthe old JSON data
### Concrete Value Members

1. [**](../../../akka/serialization/jackson/JacksonMigration.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/serialization/jackson/JacksonMigration.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/serialization/jackson/JacksonMigration.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from JacksonMigration toany2stringadd\[JacksonMigration] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/serialization/jackson/JacksonMigration.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (JacksonMigration, B)ImplicitThis member is added by an implicit conversion from JacksonMigration toArrowAssoc\[JacksonMigration] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/serialization/jackson/JacksonMigration.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/serialization/jackson/JacksonMigration.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/serialization/jackson/JacksonMigration.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/serialization/jackson/JacksonMigration.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (JacksonMigration) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JacksonMigrationImplicitThis member is added by an implicit conversion from JacksonMigration toEnsuring\[JacksonMigration] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/serialization/jackson/JacksonMigration.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (JacksonMigration) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JacksonMigrationImplicitThis member is added by an implicit conversion from JacksonMigration toEnsuring\[JacksonMigration] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/serialization/jackson/JacksonMigration.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JacksonMigrationImplicitThis member is added by an implicit conversion from JacksonMigration toEnsuring\[JacksonMigration] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/serialization/jackson/JacksonMigration.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JacksonMigrationImplicitThis member is added by an implicit conversion from JacksonMigration toEnsuring\[JacksonMigration] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/serialization/jackson/JacksonMigration.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/serialization/jackson/JacksonMigration.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/serialization/jackson/JacksonMigration.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/serialization/jackson/JacksonMigration.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/serialization/jackson/JacksonMigration.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/serialization/jackson/JacksonMigration.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/serialization/jackson/JacksonMigration.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/serialization/jackson/JacksonMigration.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/serialization/jackson/JacksonMigration.html#supportedForwardVersion:Int "Permalink")  def supportedForwardVersion: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Define the supported forward version this migration can read (must be greater or equal than `currentVersion`).

Define the supported forward version this migration can read (must be greater or equal than `currentVersion`).
If this value is different from [currentVersion](#currentVersion:Int) a JacksonMigration may be required to downcast
the received payload to the current schema.
21. [**](../../../akka/serialization/jackson/JacksonMigration.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/serialization/jackson/JacksonMigration.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/serialization/jackson/JacksonMigration.html#transformClassName(fromVersion:Int,className:String):String "Permalink")  def transformClassName(fromVersion: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), className: String): StringOverride this method if you have changed the class name.

Override this method if you have changed the class name. Return
current class name.
24. [**](../../../akka/serialization/jackson/JacksonMigration.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/serialization/jackson/JacksonMigration.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/serialization/jackson/JacksonMigration.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/serialization/jackson/JacksonMigration.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/serialization/jackson/JacksonMigration.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from JacksonMigration toStringFormat\[JacksonMigration] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/serialization/jackson/JacksonMigration.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (JacksonMigration, B)ImplicitThis member is added by an implicit conversion from JacksonMigration toArrowAssoc\[JacksonMigration] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromJacksonMigration to any2stringadd\[JacksonMigration]

### Inherited by implicit conversion StringFormat fromJacksonMigration to StringFormat\[JacksonMigration]

### Inherited by implicit conversion Ensuring fromJacksonMigration to Ensuring\[JacksonMigration]

### Inherited by implicit conversion ArrowAssoc fromJacksonMigration to ArrowAssoc\[JacksonMigration]

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
*Source: [https://doc.akka.io/api/akka/current/akka/serialization/jackson/JacksonMigration.html](https://doc.akka.io/api/akka/current/akka/serialization/jackson/JacksonMigration.html)*