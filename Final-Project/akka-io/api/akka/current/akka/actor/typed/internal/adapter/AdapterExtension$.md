---
description: Akka 2.10.17 - akka.actor.typed.internal.adapter.AdapterExtension
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:05:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/internal/adapter/AdapterExtension$.html
title: Akka 2.10.17 - akka.actor.typed.internal.adapter.AdapterExtension
---

# Akka 2.10.17 - akka.actor.typed.internal.adapter.AdapterExtension

> **Summary:** Akka 2.10.17 - akka.actor.typed.internal.adapter.AdapterExtension

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/actor/typed/internal/adapter/index.html "Permalink")  package [adapter](index.html)Definition Classes[internal](../index.html)
- AdapterExtension
o[akka](../../../../index.html).[actor](../../../index.html).[typed](../../index.html).[internal](../index.html).[adapter](index.html)

# AdapterExtension[**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html "Permalink")

### 

#### object AdapterExtension extends [actor.ExtensionId](../../../ExtensionId.html)\[AdapterExtension]

Internal API

Annotations@[InternalApi](../../../../annotation/InternalApi.html)() Source[AdapterExtension.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/internal/adapter/AdapterExtension.scala#L22)Linear Supertypes[actor.ExtensionId](../../../ExtensionId.html)\[AdapterExtension], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AdapterExtension
2. ExtensionId
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../../../ClassicActorSystemProvider.html)): AdapterExtensionReturns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../../ExtensionId.html)
5. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [actor.ActorSystem](../../../ActorSystem.html)): AdapterExtensionReturns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../../ExtensionId.html)
6. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#createExtension(sys:akka.actor.ExtendedActorSystem):akka.actor.typed.internal.adapter.AdapterExtension "Permalink")  def createExtension(sys: [ExtendedActorSystem](../../../ExtendedActorSystem.html)): AdapterExtensionIs used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesAdapterExtension → [ExtensionId](../../../ExtensionId.html)
9. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../../ExtensionId.html) → AnyRef → Any
11. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#get(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def get(system: [ClassicActorSystemProvider](../../../ClassicActorSystemProvider.html)): AdapterExtensionReturns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition Classes[ExtensionId](../../../ExtensionId.html)
12. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#get(system:akka.actor.ActorSystem):T "Permalink")  def get(system: [actor.ActorSystem](../../../ActorSystem.html)): AdapterExtensionReturns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ActorSystem): TheExtension = super.get(system)
```
Definition Classes[ExtensionId](../../../ExtensionId.html)
13. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../../ExtensionId.html) → AnyRef → Any
15. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/typed/internal/adapter/AdapterExtension$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [actor.ExtensionId](../../../ExtensionId.html)\[AdapterExtension]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/internal/adapter/AdapterExtension$.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/internal/adapter/index.html
- https://doc.akka.io/api/akka/current/akka/actor/typed/internal/index.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/actor/typed/internal/adapter/AdapterExtension$.html](https://doc.akka.io/api/akka/current/akka/actor/typed/internal/adapter/AdapterExtension$.html)*