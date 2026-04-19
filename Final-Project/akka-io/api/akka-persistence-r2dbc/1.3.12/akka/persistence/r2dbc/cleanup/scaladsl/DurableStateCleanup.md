---
description: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.scaladsl.DurableStateCleanup
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html
title: Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.scaladsl.DurableStateCleanup
---

# Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.scaladsl.DurableStateCleanup

> **Summary:** Akka Persistence R2DBC 1.3.12 - akka.persistence.r2dbc.cleanup.scaladsl.DurableStateCleanup

## Content

Akka Persistence R2DBC1\.3\.12 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/index.html "Permalink")  package [r2dbc](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/r2dbc/cleanup/index.html "Permalink")  package [cleanup](../index.html)Definition Classes[r2dbc](../../index.html)
- [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[cleanup](../index.html)
- DurableStateCleanup
- [EventSourcedCleanup](EventSourcedCleanup.html "Scala API: Tool for deleting events and/or snapshots for a given list of persistenceIds without using persistent actors.")
c[akka](../../../../index.html).[persistence](../../../index.html).[r2dbc](../../index.html).[cleanup](../index.html).[scaladsl](index.html)

# DurableStateCleanup[**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html "Permalink")

### 

#### final  class DurableStateCleanup extends AnyRef

Scala API: Tool for deleting durable state for a given list of `persistenceIds` without using `DurableStateBehavior`
actors. It's important that the actors with corresponding persistenceId are not running at the same time as using the
tool.

If `resetRevisionNumber` is `true` then the creating entity with the same `persistenceId` will start from 0\.
Otherwise it will continue from the latest highest used revision number.

WARNING: reusing the same `persistenceId` after resetting the revision number should be avoided, since it might be
confusing to reuse the same revision numbers for new state changes.

When a list of `persistenceIds` are given they are deleted sequentially in the order of the list. It's possible to
parallelize the deletes by running several cleanup operations at the same time operating on different sets of
`persistenceIds`.

Annotations@ApiMayChange() Linear SupertypesAnyRef, Any****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DurableStateCleanup
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#<init>(systemProvider:akka.actor.ClassicActorSystemProvider):akka.persistence.r2dbc.cleanup.scaladsl.DurableStateCleanup "Permalink")  new DurableStateCleanup(systemProvider: ClassicActorSystemProvider)
2. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#<init>(systemProvider:akka.actor.ClassicActorSystemProvider,configPath:String):akka.persistence.r2dbc.cleanup.scaladsl.DurableStateCleanup "Permalink")  new DurableStateCleanup(systemProvider: ClassicActorSystemProvider, configPath: String)
### Value Members

1. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
2. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html###:Int "Permalink") final  def \#\#: IntDefinition ClassesAnyRef → Any
3. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: Any): BooleanDefinition ClassesAnyRef → Any
4. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#clone():Object "Permalink")  def clone(): AnyRefAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#deleteState(persistenceId:String,resetRevisionNumber:Boolean):scala.concurrent.Future[akka.Done] "Permalink")  def deleteState(persistenceId: String, resetRevisionNumber: Boolean): Future\[Done]Delete the state related to one single `persistenceId`.
7. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#deleteStates(persistenceIds:Seq[String],resetRevisionNumber:Boolean):scala.concurrent.Future[akka.Done] "Permalink")  def deleteStates(persistenceIds: Seq\[String], resetRevisionNumber: Boolean): Future\[Done]Delete all states related to the given list of `persistenceIds`.
8. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: AnyRef): BooleanDefinition ClassesAnyRef
9. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: AnyRef): BooleanDefinition ClassesAnyRef → Any
10. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: AnyRef]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
11. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#hashCode():Int "Permalink")  def hashCode(): IntDefinition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
12. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: BooleanDefinition ClassesAny
13. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: AnyRef): BooleanDefinition ClassesAnyRef
14. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#notify():Unit "Permalink") final  def notify(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#notifyAll():Unit "Permalink") final  def notifyAll(): UnitDefinition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
16. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
18. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: Long, arg1: Int): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: Long): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#wait():Unit "Permalink") final  def wait(): UnitDefinition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html#finalize():Unit "Permalink")  def finalize(): UnitAttributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from AnyRef

### Inherited from Any

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/EventSourcedCleanup.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/index.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html](https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html)*