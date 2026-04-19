---
description: Akka 2.10.17 - akka.cluster.ddata.typed.scaladsl.Replicator.Delete
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:27:08Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html
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
- Delete
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
[c](Replicator$$Delete$.html "See companion object")[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[scaladsl](index.html).[Replicator](Replicator$.html)

# [Delete](Replicator$$Delete$.html "See companion object")[**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html "Permalink")

### Companion [object Delete](Replicator$$Delete$.html "See companion object")

#### final  case class Delete\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], consistency: [WriteConsistency](Replicator$.html#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency), replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[DeleteResponse](Replicator$.html#DeleteResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteResponse[A])\[A]]) extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Send this message to the local `Replicator` to delete a data value for the
given `key`. The `Replicator` will reply with one of the [DeleteResponse](Replicator$.html#DeleteResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteResponse[A]) messages.

Source[Replicator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/scaladsl/Replicator.scala#L318)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Command](Replicator$$Command.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Delete
2. Serializable
3. Product
4. Equals
5. Command
6. AnyRef
7. Any
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

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#<init>(key:akka.cluster.ddata.Key[A],consistency:akka.cluster.ddata.typed.scaladsl.Replicator.WriteConsistency,replyTo:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.scaladsl.Replicator.DeleteResponse[A]]):akka.cluster.ddata.typed.scaladsl.Replicator.Delete[A] "Permalink")  new Delete(key: [Key](../../Key.html)\[A], consistency: [WriteConsistency](Replicator$.html#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency), replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[DeleteResponse](Replicator$.html#DeleteResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteResponse[A])\[A]])
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Delete\[A] toany2stringadd\[Delete\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Delete\[A], B)ImplicitThis member is added by an implicit conversion from Delete\[A] toArrowAssoc\[Delete\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#consistency:akka.cluster.ddata.typed.scaladsl.Replicator.WriteConsistency "Permalink")  val consistency: [WriteConsistency](Replicator$.html#WriteConsistency=akka.cluster.ddata.Replicator.WriteConsistency)
9. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Delete\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Delete\[A]ImplicitThis member is added by an implicit conversion from Delete\[A] toEnsuring\[Delete\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Delete\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Delete\[A]ImplicitThis member is added by an implicit conversion from Delete\[A] toEnsuring\[Delete\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Delete\[A]ImplicitThis member is added by an implicit conversion from Delete\[A] toEnsuring\[Delete\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Delete\[A]ImplicitThis member is added by an implicit conversion from Delete\[A] toEnsuring\[Delete\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#key:akka.cluster.ddata.Key[A] "Permalink")  val key: [Key](../../Key.html)\[A]
17. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#replyTo:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.scaladsl.Replicator.DeleteResponse[A]] "Permalink")  val replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[DeleteResponse](Replicator$.html#DeleteResponse[A<:akka.cluster.ddata.ReplicatedData]=akka.cluster.ddata.Replicator.DeleteResponse[A])\[A]]
22. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Delete\[A] toStringFormat\[Delete\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Delete\[A], B)ImplicitThis member is added by an implicit conversion from Delete\[A] toArrowAssoc\[Delete\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Command](Replicator$$Command.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDelete\[A] to any2stringadd\[Delete\[A]]

### Inherited by implicit conversion StringFormat fromDelete\[A] to StringFormat\[Delete\[A]]

### Inherited by implicit conversion Ensuring fromDelete\[A] to Ensuring\[Delete\[A]]

### Inherited by implicit conversion ArrowAssoc fromDelete\[A] to ArrowAssoc\[Delete\[A]]

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
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Delete.html)*