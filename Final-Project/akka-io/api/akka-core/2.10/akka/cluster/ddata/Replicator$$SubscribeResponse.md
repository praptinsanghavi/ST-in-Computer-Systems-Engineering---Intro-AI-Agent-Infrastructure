---
description: Akka 2.10.17 - akka.cluster.ddata.Replicator.SubscribeResponse
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:25:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/Replicator$$SubscribeResponse.html
title: Akka 2.10.17 - akka.cluster.ddata.Replicator.SubscribeResponse
---

# Akka 2.10.17 - akka.cluster.ddata.Replicator.SubscribeResponse

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.Replicator.SubscribeResponse

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/ddata/Replicator$.html "Permalink")  object [Replicator](Replicator$.html)Definition Classes[ddata](index.html)
- [Changed](Replicator$$Changed.html "The data value is retrieved with #get using the typed key.")
- [Command](Replicator$$Command.html)
- [DataDeleted](Replicator$$DataDeleted.html)
- [Delete](Replicator$$Delete.html "Send this message to the local Replicator to delete a data value for the given key.")
- [DeleteResponse](Replicator$$DeleteResponse.html)
- [DeleteSuccess](Replicator$$DeleteSuccess.html)
- [Deleted](Replicator$$Deleted.html)
- [Expired](Replicator$$Expired.html)
- [FlushChanges](Replicator$$FlushChanges$.html "Notify subscribers of changes now, otherwise they will be notified periodically with the configured notify-subscribers-interval.")
- [Get](Replicator$$Get.html "Send this message to the local Replicator to retrieve a data value for the given key.")
- [GetDataDeleted](Replicator$$GetDataDeleted.html "The Get request couldn't be performed because the entry has been deleted.")
- [GetFailure](Replicator$$GetFailure.html "The Get request could not be fulfill according to the given consistency level and timeout.")
- [GetReplicaCount](Replicator$$GetReplicaCount$.html "Get current number of replicas, including the local replica.")
- [GetResponse](Replicator$$GetResponse.html)
- [GetSuccess](Replicator$$GetSuccess.html "Reply from Get.")
- [ModifyFailure](Replicator$$ModifyFailure.html "If the modify function of the Update throws an exception the reply message will be this ModifyFailure message.")
- [NotFound](Replicator$$NotFound.html)
- [ReadAll](Replicator$$ReadAll.html)
- [ReadConsistency](Replicator$$ReadConsistency.html)
- [ReadFrom](Replicator$$ReadFrom.html)
- [ReadLocal](Replicator$$ReadLocal$.html)
- [ReadMajority](Replicator$$ReadMajority.html)
- [ReadMajorityPlus](Replicator$$ReadMajorityPlus.html "ReadMajority but with the given number of additional nodes added to the majority count.")
- [ReplicaCount](Replicator$$ReplicaCount.html "Current number of replicas.")
- [ReplicationDeleteFailure](Replicator$$ReplicationDeleteFailure.html)
- [ReplicatorMessage](Replicator$$ReplicatorMessage.html "Marker trait for remote messages serialized by akka.cluster.ddata.protobuf.ReplicatorMessageSerializer.")
- [StoreFailure](Replicator$$StoreFailure.html "The local store or direct replication of the Update could not be fulfill according to the given consistency level due to durable store errors.")
- [Subscribe](Replicator$$Subscribe.html "Register a subscriber that will be notified with a Changed message when the value of the given key is changed.")
- SubscribeResponse
- [Unsubscribe](Replicator$$Unsubscribe.html "Unregister a subscriber.")
- [Update](Replicator$$Update.html "Send this message to the local Replicator to update a data value for the given key.")
- [UpdateDataDeleted](Replicator$$UpdateDataDeleted.html "The Update couldn't be performed because the entry has been deleted.")
- [UpdateFailure](Replicator$$UpdateFailure.html)
- [UpdateResponse](Replicator$$UpdateResponse.html)
- [UpdateSuccess](Replicator$$UpdateSuccess.html)
- [UpdateTimeout](Replicator$$UpdateTimeout.html "The direct replication of the Update could not be fulfill according to the given consistency level and timeout.")
- [WriteAll](Replicator$$WriteAll.html)
- [WriteConsistency](Replicator$$WriteConsistency.html)
- [WriteLocal](Replicator$$WriteLocal$.html)
- [WriteMajority](Replicator$$WriteMajority.html)
- [WriteMajorityPlus](Replicator$$WriteMajorityPlus.html "WriteMajority but with the given number of additional nodes added to the majority count.")
- [WriteTo](Replicator$$WriteTo.html)
t[akka](../../index.html).[cluster](../index.html).[ddata](index.html).[Replicator](Replicator$.html)

# SubscribeResponse[**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html "Permalink")

### 

#### sealed  trait SubscribeResponse\[A \<: [ReplicatedData](ReplicatedData.html)] extends [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

Source[Replicator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/Replicator.scala#L768)See also[Replicator.Subscribe](Replicator$$Subscribe.html)

Linear Supertypes[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Changed](Replicator$$Changed.html), [Deleted](Replicator$$Deleted.html), [Expired](Replicator$$Expired.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SubscribeResponse
2. NoSerializationVerificationNeeded
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
### Abstract Value Members

1. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#key:akka.cluster.ddata.Key[A] "Permalink") abstract  def key: [Key](Key.html)\[A]
### Concrete Value Members

1. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SubscribeResponse\[A] toany2stringadd\[SubscribeResponse\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SubscribeResponse\[A], B)ImplicitThis member is added by an implicit conversion from SubscribeResponse\[A] toArrowAssoc\[SubscribeResponse\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SubscribeResponse\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubscribeResponse\[A]ImplicitThis member is added by an implicit conversion from SubscribeResponse\[A] toEnsuring\[SubscribeResponse\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SubscribeResponse\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubscribeResponse\[A]ImplicitThis member is added by an implicit conversion from SubscribeResponse\[A] toEnsuring\[SubscribeResponse\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SubscribeResponse\[A]ImplicitThis member is added by an implicit conversion from SubscribeResponse\[A] toEnsuring\[SubscribeResponse\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SubscribeResponse\[A]ImplicitThis member is added by an implicit conversion from SubscribeResponse\[A] toEnsuring\[SubscribeResponse\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SubscribeResponse\[A] toStringFormat\[SubscribeResponse\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/Replicator$$SubscribeResponse.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SubscribeResponse\[A], B)ImplicitThis member is added by an implicit conversion from SubscribeResponse\[A] toArrowAssoc\[SubscribeResponse\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSubscribeResponse\[A] to any2stringadd\[SubscribeResponse\[A]]

### Inherited by implicit conversion StringFormat fromSubscribeResponse\[A] to StringFormat\[SubscribeResponse\[A]]

### Inherited by implicit conversion Ensuring fromSubscribeResponse\[A] to Ensuring\[SubscribeResponse\[A]]

### Inherited by implicit conversion ArrowAssoc fromSubscribeResponse\[A] to ArrowAssoc\[SubscribeResponse\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Changed.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$DataDeleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Delete.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$DeleteResponse.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$DeleteSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Deleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Expired.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$FlushChanges$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Get.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetDataDeleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetReplicaCount$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetResponse.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$GetSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ModifyFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$NotFound.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReadAll.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReadConsistency.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReadFrom.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReadLocal$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReadMajority.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReadMajorityPlus.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReplicaCount.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReplicationDeleteFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$ReplicatorMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$StoreFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Subscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$SubscribeResponse.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Update$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$Update.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$UpdateDataDeleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$UpdateFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$UpdateResponse.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$UpdateSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$UpdateTimeout.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$WriteAll.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$WriteConsistency.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$WriteLocal$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$WriteMajority.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$WriteMajorityPlus.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$WriteTo.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$SubscribeResponse.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator$$SubscribeResponse.html)*