---
description: Akka 2.10.17 - akka.discovery.Discovery
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:36:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/discovery/Discovery$.html
title: Akka 2.10.17 - akka.discovery.Discovery
---

# Akka 2.10.17 - akka.discovery.Discovery

> **Summary:** Akka 2.10.17 - akka.discovery.Discovery

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](index.html)Definition Classes[akka](../index.html)
- [Discovery](Discovery.html)
- [Lookup](Lookup.html "A service lookup.")
- [ServiceDiscovery](ServiceDiscovery.html "Implement to provide a service discovery method")
[o](Discovery.html "See companion class")[akka](../index.html).[discovery](index.html)

# [Discovery](Discovery.html "See companion class")[**](../../akka/discovery/Discovery$.html "Permalink")

### Companion [class Discovery](Discovery.html "See companion class")

#### object Discovery extends [ExtensionId](../actor/ExtensionId.html)\[[Discovery](Discovery.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

Source[Discovery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/main/scala/akka/discovery/Discovery.scala#L99)Linear Supertypes[ExtensionIdProvider](../actor/ExtensionIdProvider.html), [ExtensionId](../actor/ExtensionId.html)\[[Discovery](Discovery.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Discovery
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/discovery/Discovery$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/discovery/Discovery$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/discovery/Discovery$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/discovery/Discovery$.html#apply(system:akka.actor.ActorSystem):akka.discovery.Discovery "Permalink")  def apply(system: [ActorSystem](../actor/ActorSystem.html)): [Discovery](Discovery.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition ClassesDiscovery → [ExtensionId](../actor/ExtensionId.html)
5. [**](../../akka/discovery/Discovery$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [Discovery](Discovery.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../actor/ExtensionId.html)
6. [**](../../akka/discovery/Discovery$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/discovery/Discovery$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/discovery/Discovery$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.discovery.Discovery "Permalink")  def createExtension(system: [ExtendedActorSystem](../actor/ExtendedActorSystem.html)): [Discovery](Discovery.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesDiscovery → [ExtensionId](../actor/ExtensionId.html)
9. [**](../../akka/discovery/Discovery$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/discovery/Discovery$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
11. [**](../../akka/discovery/Discovery$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.discovery.Discovery "Permalink")  def get(system: [ClassicActorSystemProvider](../actor/ClassicActorSystemProvider.html)): [Discovery](Discovery.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesDiscovery → [ExtensionId](../actor/ExtensionId.html)
12. [**](../../akka/discovery/Discovery$.html#get(system:akka.actor.ActorSystem):akka.discovery.Discovery "Permalink")  def get(system: [ActorSystem](../actor/ActorSystem.html)): [Discovery](Discovery.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ActorSystem): TheExtension = super.get(system)
```
Definition ClassesDiscovery → [ExtensionId](../actor/ExtensionId.html)
13. [**](../../akka/discovery/Discovery$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/discovery/Discovery$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../actor/ExtensionId.html) → AnyRef → Any
15. [**](../../akka/discovery/Discovery$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/discovery/Discovery$.html#lookup:akka.discovery.Discovery.type "Permalink")  def lookup: Discovery.typeReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesDiscovery → [ExtensionIdProvider](../actor/ExtensionIdProvider.html)
17. [**](../../akka/discovery/Discovery$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/discovery/Discovery$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/discovery/Discovery$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/discovery/Discovery$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/discovery/Discovery$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/discovery/Discovery$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/discovery/Discovery$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/discovery/Discovery$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/discovery/Discovery$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../actor/ExtensionId.html)\[[Discovery](Discovery.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/discovery/Discovery$.html
- https://doc.akka.io/api/akka/current/akka/discovery/Discovery.html
- https://doc.akka.io/api/akka/current/akka/discovery/Lookup$.html
- https://doc.akka.io/api/akka/current/akka/discovery/Lookup.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery$.html
- https://doc.akka.io/api/akka/current/akka/discovery/ServiceDiscovery.html
- https://doc.akka.io/api/akka/current/akka/discovery/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/discovery/Discovery$.html](https://doc.akka.io/api/akka/current/akka/discovery/Discovery$.html)*