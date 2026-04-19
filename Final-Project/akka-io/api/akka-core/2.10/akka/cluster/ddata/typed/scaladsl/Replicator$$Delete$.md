---
description: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.Replicator.Delete
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:27:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.Replicator.Delete
---

# Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.Replicator.Delete

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.Replicator.Delete

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[ddata](../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$.html "Permalink")  object [Replicator](Replicator$.html)Definition Classes[scaladsl](index.html)See also[akka.cluster.ddata.Replicator](../../Replicator.html).
- [Changed](Replicator$$Changed$.html "The data value is retrieved with dd.Replicator.Changed.get using the typed key.")
- [Command](Replicator$$Command.html)
- [DataDeleted](Replicator$$DataDeleted$.html)
- [Delete](Replicator$$Delete.html "Send this message to the local Replicator to delete a data value for the given key.")
- [DeleteFailure](Replicator$$DeleteFailure$.html)
- [DeleteSuccess](Replicator$$DeleteSuccess$.html)
- [Deleted](Replicator$$Deleted$.html)
- [Expired](Replicator$$Expired$.html)
- [FlushChanges](Replicator$$FlushChanges$.html "Notify subscribers of changes now, otherwise they will be notified periodically with the configured notify-subscribers-interval.")
- [Get](Replicator$$Get.html "Send this message to the local Replicator to retrieve a data value for the given key.")
- [GetDataDeleted](Replicator$$GetDataDeleted$.html)
- [GetFailure](Replicator$$GetFailure$.html)
- [GetReplicaCount](Replicator$$GetReplicaCount.html "Get current number of replicas, including the local replica.")
- [GetSuccess](Replicator$$GetSuccess$.html)
- [ModifyFailure](Replicator$$ModifyFailure$.html)
- [NotFound](Replicator$$NotFound$.html)
- [ReadAll](Replicator$$ReadAll$.html)
- [ReadFrom](Replicator$$ReadFrom$.html)
- [ReadMajority](Replicator$$ReadMajority$.html)
- [ReplicaCount](Replicator$$ReplicaCount$.html)
- [StoreFailure](Replicator$$StoreFailure$.html)
- [Subscribe](Replicator$$Subscribe.html "Register a subscriber that will be notified with a Changed message when the value of the given key is changed.")
- [Unsubscribe](Replicator$$Unsubscribe.html "Unregister a subscriber.")
- [Update](Replicator$$Update.html "Send this message to the local Replicator to update a data value for the given key.")
- [UpdateDataDeleted](Replicator$$UpdateDataDeleted$.html)
- [UpdateFailure](Replicator$$UpdateFailure$.html)
- [UpdateSuccess](Replicator$$UpdateSuccess$.html)
- [UpdateTimeout](Replicator$$UpdateTimeout$.html)
- [WriteAll](Replicator$$WriteAll$.html)
- [WriteMajority](Replicator$$WriteMajority$.html)
- [WriteTo](Replicator$$WriteTo$.html)
[o](Replicator$$Delete.html "See companion class")[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[scaladsl](index.html).[Replicator](Replicator$.html)

# [Delete](Replicator$$Delete.html "See companion class")[**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html "Permalink")

### Companion [class Delete](Replicator$$Delete.html "See companion class")

#### object Delete extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[Replicator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/scaladsl/Replicator.scala#L303)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Delete
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#apply[A<:akka.cluster.ddata.ReplicatedData](key:akka.cluster.ddata.Key[A],consistency:akka.cluster.ddata.typed.scaladsl.Replicator.WriteConsistency):akka.actor.typed.ActorRef[akka.cluster.ddata.typed.scaladsl.Replicator.DeleteResponse[A]]=>akka.cluster.ddata.typed.scaladsl.Replicator.Delete[A] "Permalink")  def apply\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], consistency: [WriteConsistency](Replicator$.html#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency)): ([ActorRef](../../../../actor/typed/ActorRef.html)\[[DeleteResponse](Replicator$.html#DeleteResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteResponse[A])\[A]]) \=\> [Delete](Replicator$$Delete.html)\[A]Convenience for `ask`.
5. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Changed$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$DataDeleted$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$DeleteFailure$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$DeleteSuccess$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Deleted$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Expired$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$FlushChanges$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Get$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Get.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$GetDataDeleted$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$GetFailure$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$GetReplicaCount$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$GetReplicaCount.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$GetSuccess$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$ModifyFailure$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$NotFound$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$ReadAll$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$ReadFrom$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$ReadMajority$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$ReplicaCount$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$StoreFailure$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Subscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Update$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Update.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$UpdateDataDeleted$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$UpdateFailure$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$UpdateSuccess$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$UpdateTimeout$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$WriteAll$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$WriteMajority$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$WriteTo$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Delete$.html)*