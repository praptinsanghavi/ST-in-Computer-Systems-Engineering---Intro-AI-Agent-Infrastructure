---
description: Akka 2.10.11 - akka.persistence.state.DurableStateStoreRegistry
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:17:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/state/DurableStateStoreRegistry.html
title: Akka 2.10.11 - akka.persistence.state.DurableStateStoreRegistry
---

# Akka 2.10.11 - akka.persistence.state.DurableStateStoreRegistry

> **Summary:** Akka 2.10.11 - akka.persistence.state.DurableStateStoreRegistry

## Content

Akka2\.10\.11 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/state/index.html "Permalink")  package [state](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/state/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[state](index.html)
- [**](../../../akka/persistence/state/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[state](index.html)
- [DurableStateStoreProvider](DurableStateStoreProvider.html "A durable state store plugin must implement a class that implements this trait.")
- DurableStateStoreRegistry
[c](DurableStateStoreRegistry$.html "See companion object")[akka](../../index.html).[persistence](../index.html).[state](index.html)

# [DurableStateStoreRegistry](DurableStateStoreRegistry$.html "See companion object")[**](../../../akka/persistence/state/DurableStateStoreRegistry.html "Permalink")

### Companion [object DurableStateStoreRegistry](DurableStateStoreRegistry$.html "See companion object")

#### class DurableStateStoreRegistry extends PersistencePlugin\[[DurableStateStore](scaladsl/DurableStateStore.html)\[\_], [DurableStateStore](javadsl/DurableStateStore.html)\[\_], [DurableStateStoreProvider](DurableStateStoreProvider.html)] with [Extension](../../actor/Extension.html)

Source[DurableStateStoreRegistry.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-persistence/src/main/scala/akka/persistence/state/DurableStateStoreRegistry.scala#L46)Linear Supertypes[Extension](../../actor/Extension.html), PersistencePlugin\[[DurableStateStore](scaladsl/DurableStateStore.html)\[\_], [DurableStateStore](javadsl/DurableStateStore.html)\[\_], [DurableStateStoreProvider](DurableStateStoreProvider.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateStoreRegistry
2. Extension
3. PersistencePlugin
4. AnyRef
5. Any
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

1. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#<init>(system:akka.actor.ExtendedActorSystem):akka.persistence.state.DurableStateStoreRegistry "Permalink")  new DurableStateStoreRegistry(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DurableStateStoreRegistry toany2stringadd\[DurableStateStoreRegistry] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DurableStateStoreRegistry, B)ImplicitThis member is added by an implicit conversion from DurableStateStoreRegistry toArrowAssoc\[DurableStateStoreRegistry] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#durableStateStoreFor[T<:akka.persistence.state.scaladsl.DurableStateStore[_]](pluginId:String):T "Permalink") final  def durableStateStoreFor\[T \<: [DurableStateStore](scaladsl/DurableStateStore.html)\[\_]](pluginId: String): TScala API: Returns the [akka.persistence.state.scaladsl.DurableStateStore](scaladsl/DurableStateStore.html) specified by the given
configuration entry.
9. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DurableStateStoreRegistry) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStoreRegistryImplicitThis member is added by an implicit conversion from DurableStateStoreRegistry toEnsuring\[DurableStateStoreRegistry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DurableStateStoreRegistry) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStoreRegistryImplicitThis member is added by an implicit conversion from DurableStateStoreRegistry toEnsuring\[DurableStateStoreRegistry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DurableStateStoreRegistryImplicitThis member is added by an implicit conversion from DurableStateStoreRegistry toEnsuring\[DurableStateStoreRegistry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DurableStateStoreRegistryImplicitThis member is added by an implicit conversion from DurableStateStoreRegistry toEnsuring\[DurableStateStoreRegistry] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#getDurableStateStoreFor[T<:akka.persistence.state.javadsl.DurableStateStore[_]](clazz:Class[T],pluginId:String):T "Permalink") final  def getDurableStateStoreFor\[T \<: [DurableStateStore](javadsl/DurableStateStore.html)\[\_]](clazz: Class\[T], pluginId: String): TJava API: Returns the [akka.persistence.state.javadsl.DurableStateStore](javadsl/DurableStateStore.html) specified by the given
configuration entry.
17. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#pluginFor(pluginId:String,readJournalPluginConfig:com.typesafe.config.Config):akka.persistence.PersistencePlugin.PluginHolder[ScalaDsl,JavaDsl] "Permalink") final  def pluginFor(pluginId: String, readJournalPluginConfig: Config): PluginHolder\[[DurableStateStore](scaladsl/DurableStateStore.html)\[\_], [DurableStateStore](javadsl/DurableStateStore.html)\[\_]]Attributesprotected Definition ClassesPersistencePluginAnnotations@tailrec()
23. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
25. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DurableStateStoreRegistry toStringFormat\[DurableStateStoreRegistry] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/state/DurableStateStoreRegistry.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DurableStateStoreRegistry, B)ImplicitThis member is added by an implicit conversion from DurableStateStoreRegistry toArrowAssoc\[DurableStateStoreRegistry] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../actor/Extension.html)

### Inherited from PersistencePlugin\[[DurableStateStore](scaladsl/DurableStateStore.html)\[\_], [DurableStateStore](javadsl/DurableStateStore.html)\[\_], [DurableStateStoreProvider](DurableStateStoreProvider.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDurableStateStoreRegistry to any2stringadd\[DurableStateStoreRegistry]

### Inherited by implicit conversion StringFormat fromDurableStateStoreRegistry to StringFormat\[DurableStateStoreRegistry]

### Inherited by implicit conversion Ensuring fromDurableStateStoreRegistry to Ensuring\[DurableStateStoreRegistry]

### Inherited by implicit conversion ArrowAssoc fromDurableStateStoreRegistry to ArrowAssoc\[DurableStateStoreRegistry]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/state/DurableStateStoreProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/state/DurableStateStoreRegistry$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/state/DurableStateStoreRegistry.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/state/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/state/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/state/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/state/DurableStateStoreRegistry.html](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/state/DurableStateStoreRegistry.html)*