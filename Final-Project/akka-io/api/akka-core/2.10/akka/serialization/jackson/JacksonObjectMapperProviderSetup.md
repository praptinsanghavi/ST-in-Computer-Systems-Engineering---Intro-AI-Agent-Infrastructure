---
description: Akka 2.10.17 - akka.serialization.jackson.JacksonObjectMapperProviderSetup
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:02:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
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
- JacksonObjectMapperProviderSetup
- [JsonSerializable](JsonSerializable.html "Predefined marker trait for serialization with Jackson JSON.")
[c](JacksonObjectMapperProviderSetup$.html "See companion object")[akka](../../index.html).[serialization](../index.html).[jackson](index.html)

# [JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup$.html "See companion object")[**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html "Permalink")

### Companion [object JacksonObjectMapperProviderSetup](JacksonObjectMapperProviderSetup$.html "See companion object")

#### final  class JacksonObjectMapperProviderSetup extends [Setup](../../actor/setup/Setup.html)

Setup for defining a `JacksonObjectMapperProvider` that can be passed in when ActorSystem
is created rather than creating one from configured class name. Create a subclass of
[JacksonObjectMapperFactory](JacksonObjectMapperFactory.html) and override the methods to amend the defaults.

Source[JacksonObjectMapperProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-serialization-jackson/src/main/scala/akka/serialization/jackson/JacksonObjectMapperProvider.scala#L418)Linear Supertypes[Setup](../../actor/setup/Setup.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JacksonObjectMapperProviderSetup
2. Setup
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

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#<init>(factory:akka.serialization.jackson.JacksonObjectMapperFactory):akka.serialization.jackson.JacksonObjectMapperProviderSetup "Permalink")  new JacksonObjectMapperProviderSetup(factory: [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html))
### Value Members

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from JacksonObjectMapperProviderSetup toany2stringadd\[JacksonObjectMapperProviderSetup] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (JacksonObjectMapperProviderSetup, B)ImplicitThis member is added by an implicit conversion from JacksonObjectMapperProviderSetup toArrowAssoc\[JacksonObjectMapperProviderSetup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#and(other:akka.actor.setup.Setup):akka.actor.setup.ActorSystemSetup "Permalink") final  def and(other: [Setup](../../actor/setup/Setup.html)): [ActorSystemSetup](../../actor/setup/ActorSystemSetup.html)Construct an ActorSystemSetup with this setup combined with another one.

Construct an ActorSystemSetup with this setup combined with another one. Allows for
fluent creation of settings. If `other` is a setting of the same concrete Setup as this
it will replace this.

Definition Classes[Setup](../../actor/setup/Setup.html)
7. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (JacksonObjectMapperProviderSetup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JacksonObjectMapperProviderSetupImplicitThis member is added by an implicit conversion from JacksonObjectMapperProviderSetup toEnsuring\[JacksonObjectMapperProviderSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (JacksonObjectMapperProviderSetup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JacksonObjectMapperProviderSetupImplicitThis member is added by an implicit conversion from JacksonObjectMapperProviderSetup toEnsuring\[JacksonObjectMapperProviderSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): JacksonObjectMapperProviderSetupImplicitThis member is added by an implicit conversion from JacksonObjectMapperProviderSetup toEnsuring\[JacksonObjectMapperProviderSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): JacksonObjectMapperProviderSetupImplicitThis member is added by an implicit conversion from JacksonObjectMapperProviderSetup toEnsuring\[JacksonObjectMapperProviderSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#factory:akka.serialization.jackson.JacksonObjectMapperFactory "Permalink")  val factory: [JacksonObjectMapperFactory](JacksonObjectMapperFactory.html)
16. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from JacksonObjectMapperProviderSetup toStringFormat\[JacksonObjectMapperProviderSetup] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/serialization/jackson/JacksonObjectMapperProviderSetup.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (JacksonObjectMapperProviderSetup, B)ImplicitThis member is added by an implicit conversion from JacksonObjectMapperProviderSetup toArrowAssoc\[JacksonObjectMapperProviderSetup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Setup](../../actor/setup/Setup.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromJacksonObjectMapperProviderSetup to any2stringadd\[JacksonObjectMapperProviderSetup]

### Inherited by implicit conversion StringFormat fromJacksonObjectMapperProviderSetup to StringFormat\[JacksonObjectMapperProviderSetup]

### Inherited by implicit conversion Ensuring fromJacksonObjectMapperProviderSetup to Ensuring\[JacksonObjectMapperProviderSetup]

### Inherited by implicit conversion ArrowAssoc fromJacksonObjectMapperProviderSetup to ArrowAssoc\[JacksonObjectMapperProviderSetup]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/Setup.html
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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html](https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html)*