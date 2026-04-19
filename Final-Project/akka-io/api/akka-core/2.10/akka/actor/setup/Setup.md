---
description: Akka 2.10.17 - akka.actor.setup.Setup
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:55:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/setup/Setup.html
title: Akka 2.10.17 - akka.actor.setup.Setup
---

# Akka 2.10.17 - akka.actor.setup.Setup

> **Summary:** Akka 2.10.17 - akka.actor.setup.Setup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/setup/index.html "Permalink")  package [setup](index.html)Definition Classes[actor](../index.html)
- [ActorSystemSetup](ActorSystemSetup.html "A set of setup settings for programmatic configuration of the actor system.")
- Setup
c[akka](../../index.html).[actor](../index.html).[setup](index.html)

# Setup[**](../../../akka/actor/setup/Setup.html "Permalink")

### 

#### abstract  class Setup extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Marker supertype for a setup part that can be put inside [ActorSystemSetup](ActorSystemSetup.html), if a specific concrete setup
is not specified in the actor system setup that means defaults are used (usually from the config file) \- no concrete
setup instance should be mandatory in the [ActorSystemSetup](ActorSystemSetup.html) that an actor system is created with.

Source[ActorSystemSetup.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/setup/ActorSystemSetup.scala#L20)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[BootstrapSetup](../BootstrapSetup.html), [AbstractExtensionSetup](../typed/AbstractExtensionSetup.html), [ActorRefResolverSetup](../typed/ActorRefResolverSetup.html), [ExtensionSetup](../typed/ExtensionSetup.html), [ReceptionistSetup](../typed/receptionist/ReceptionistSetup.html), [DistributedDataSetup](../../cluster/ddata/typed/javadsl/DistributedDataSetup.html), [ClusterShardingSetup](../../cluster/sharding/typed/scaladsl/ClusterShardingSetup.html), [ClusterSetup](../../cluster/typed/ClusterSetup.html), [ClusterSingletonSetup](../../cluster/typed/ClusterSingletonSetup.html), [SSLEngineProviderSetup](../../remote/artery/tcp/SSLEngineProviderSetup.html), [SerializationSetup](../../serialization/SerializationSetup.html), [JacksonObjectMapperProviderSetup](../../serialization/jackson/JacksonObjectMapperProviderSetup.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Setup
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

1. [**](../../../akka/actor/setup/Setup.html#<init>():akka.actor.setup.Setup "Permalink")  new Setup()
### Value Members

1. [**](../../../akka/actor/setup/Setup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/setup/Setup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/setup/Setup.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Setup toany2stringadd\[Setup] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/setup/Setup.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Setup, B)ImplicitThis member is added by an implicit conversion from Setup toArrowAssoc\[Setup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/setup/Setup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/actor/setup/Setup.html#and(other:akka.actor.setup.Setup):akka.actor.setup.ActorSystemSetup "Permalink") final  def and(other: Setup): [ActorSystemSetup](ActorSystemSetup.html)Construct an [ActorSystemSetup](ActorSystemSetup.html) with this setup combined with another one.

Construct an [ActorSystemSetup](ActorSystemSetup.html) with this setup combined with another one. Allows for
fluent creation of settings. If `other` is a setting of the same concrete Setup as this
it will replace this.
7. [**](../../../akka/actor/setup/Setup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/actor/setup/Setup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/actor/setup/Setup.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Setup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SetupImplicitThis member is added by an implicit conversion from Setup toEnsuring\[Setup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/setup/Setup.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Setup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SetupImplicitThis member is added by an implicit conversion from Setup toEnsuring\[Setup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/setup/Setup.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SetupImplicitThis member is added by an implicit conversion from Setup toEnsuring\[Setup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/setup/Setup.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SetupImplicitThis member is added by an implicit conversion from Setup toEnsuring\[Setup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/actor/setup/Setup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/actor/setup/Setup.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/actor/setup/Setup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/actor/setup/Setup.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/actor/setup/Setup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/actor/setup/Setup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/actor/setup/Setup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/actor/setup/Setup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/actor/setup/Setup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/actor/setup/Setup.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/actor/setup/Setup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/actor/setup/Setup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/actor/setup/Setup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/actor/setup/Setup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/actor/setup/Setup.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Setup toStringFormat\[Setup] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/actor/setup/Setup.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Setup, B)ImplicitThis member is added by an implicit conversion from Setup toArrowAssoc\[Setup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSetup to any2stringadd\[Setup]

### Inherited by implicit conversion StringFormat fromSetup to StringFormat\[Setup]

### Inherited by implicit conversion Ensuring fromSetup to Ensuring\[Setup]

### Inherited by implicit conversion ArrowAssoc fromSetup to ArrowAssoc\[Setup]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/BootstrapSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/ActorSystemSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/Setup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/AbstractExtensionSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRefResolverSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ExtensionSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ReceptionistSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/DistributedDataSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ClusterShardingSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/ClusterSingletonSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/tcp/SSLEngineProviderSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/SerializationSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/jackson/JacksonObjectMapperProviderSetup.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/Setup.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/Setup.html)*