---
description: Akka 2.10.17 - akka.cluster.sbr.SplitBrainResolverProvider
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:02:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sbr/SplitBrainResolverProvider.html
title: Akka 2.10.17 - akka.cluster.sbr.SplitBrainResolverProvider
---

# Akka 2.10.17 - akka.cluster.sbr.SplitBrainResolverProvider

> **Summary:** Akka 2.10.17 - akka.cluster.sbr.SplitBrainResolverProvider

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/sbr/index.html "Permalink")  package [sbr](index.html)Definition Classes[cluster](../index.html)
- SplitBrainResolverProvider
c[akka](../../index.html).[cluster](../index.html).[sbr](index.html)

# SplitBrainResolverProvider[**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html "Permalink")

### 

#### final  class SplitBrainResolverProvider extends [DowningProvider](../DowningProvider.html)

See reference documentation: https://doc.akka.io/libraries/akka\-core/current/split\-brain\-resolver.html

Enabled with configuration:

```
akka.cluster.downing-provider-class = "akka.cluster.sbr.SplitBrainResolverProvider"
```
Annotations@nowarn() Source[SplitBrainResolverProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/sbr/SplitBrainResolverProvider.scala#L26)Linear Supertypes[DowningProvider](../DowningProvider.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SplitBrainResolverProvider
2. DowningProvider
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

1. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#<init>(system:akka.actor.ActorSystem):akka.cluster.sbr.SplitBrainResolverProvider "Permalink")  new SplitBrainResolverProvider(system: [ActorSystem](../../actor/ActorSystem.html))
### Value Members

1. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SplitBrainResolverProvider toany2stringadd\[SplitBrainResolverProvider] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SplitBrainResolverProvider, B)ImplicitThis member is added by an implicit conversion from SplitBrainResolverProvider toArrowAssoc\[SplitBrainResolverProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#downRemovalMargin:scala.concurrent.duration.FiniteDuration "Permalink")  def downRemovalMargin: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Time margin after which shards or singletons that belonged to a downed/removed
partition are created in surviving partition.

Time margin after which shards or singletons that belonged to a downed/removed
partition are created in surviving partition. The purpose of this margin is that
in case of a network partition the persistent actors in the non\-surviving partitions
must be stopped before corresponding persistent actors are started somewhere else.
This is useful if you implement downing strategies that handle network partitions,
e.g. by keeping the larger side of the partition and shutting down the smaller side.

Definition ClassesSplitBrainResolverProvider → [DowningProvider](../DowningProvider.html)
9. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#downingActorProps:Option[akka.actor.Props] "Permalink")  def downingActorProps: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Props](../../actor/Props.html)]If a props is returned it is created as a child of the core cluster daemon on cluster startup.

If a props is returned it is created as a child of the core cluster daemon on cluster startup.
It should then handle downing using the regular [akka.cluster.Cluster](../Cluster.html) APIs.
The actor will run on the same dispatcher as the cluster actor if dispatcher not configured.

May throw an exception which will then immediately lead to Cluster stopping, as the downing
provider is vital to a working cluster.

Definition ClassesSplitBrainResolverProvider → [DowningProvider](../DowningProvider.html)
10. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SplitBrainResolverProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SplitBrainResolverProviderImplicitThis member is added by an implicit conversion from SplitBrainResolverProvider toEnsuring\[SplitBrainResolverProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SplitBrainResolverProvider) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SplitBrainResolverProviderImplicitThis member is added by an implicit conversion from SplitBrainResolverProvider toEnsuring\[SplitBrainResolverProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SplitBrainResolverProviderImplicitThis member is added by an implicit conversion from SplitBrainResolverProvider toEnsuring\[SplitBrainResolverProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SplitBrainResolverProviderImplicitThis member is added by an implicit conversion from SplitBrainResolverProvider toEnsuring\[SplitBrainResolverProvider] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SplitBrainResolverProvider toStringFormat\[SplitBrainResolverProvider] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sbr/SplitBrainResolverProvider.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SplitBrainResolverProvider, B)ImplicitThis member is added by an implicit conversion from SplitBrainResolverProvider toArrowAssoc\[SplitBrainResolverProvider] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [DowningProvider](../DowningProvider.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSplitBrainResolverProvider to any2stringadd\[SplitBrainResolverProvider]

### Inherited by implicit conversion StringFormat fromSplitBrainResolverProvider to StringFormat\[SplitBrainResolverProvider]

### Inherited by implicit conversion Ensuring fromSplitBrainResolverProvider to Ensuring\[SplitBrainResolverProvider]

### Inherited by implicit conversion ArrowAssoc fromSplitBrainResolverProvider to ArrowAssoc\[SplitBrainResolverProvider]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Props.html
- https://doc.akka.io/api/akka/current/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka/current/akka/cluster/DowningProvider.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sbr/SplitBrainResolverProvider.html
- https://doc.akka.io/api/akka/current/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sbr/SplitBrainResolverProvider.html](https://doc.akka.io/api/akka/current/akka/cluster/sbr/SplitBrainResolverProvider.html)*