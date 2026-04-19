---
description: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator.Update
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:27:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/javadsl/Replicator$$Update.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator.Update
---

# Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator.Update

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator.Update

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[ddata](../../index.html)
- [**](../../../../../akka/cluster/ddata/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$.html "Permalink")  object [Replicator](Replicator$.html)Definition Classes[javadsl](index.html)See also[akka.cluster.ddata.Replicator](../../Replicator.html).
- [Changed](Replicator$$Changed.html "The data value is retrieved with #get using the typed key.")
- [Command](Replicator$$Command.html)
- [DataDeleted](Replicator$$DataDeleted.html)
- [Delete](Replicator$$Delete.html "Send this message to the local Replicator to delete a data value for the given key.")
- [DeleteFailure](Replicator$$DeleteFailure.html)
- [DeleteResponse](Replicator$$DeleteResponse.html)
- [DeleteSuccess](Replicator$$DeleteSuccess.html)
- [Deleted](Replicator$$Deleted.html)
- [Expired](Replicator$$Expired.html)
- [Get](Replicator$$Get.html "Send this message to the local Replicator to retrieve a data value for the given key.")
- [GetDataDeleted](Replicator$$GetDataDeleted.html "The Get request couldn't be performed because the entry has been deleted.")
- [GetFailure](Replicator$$GetFailure.html "The Get request could not be fulfill according to the given consistency level and timeout.")
- [GetReplicaCount](Replicator$$GetReplicaCount.html "Get current number of replicas, including the local replica.")
- [GetResponse](Replicator$$GetResponse.html)
- [GetSuccess](Replicator$$GetSuccess.html "Reply from Get.")
- [ModifyFailure](Replicator$$ModifyFailure.html "If the modify function of the Update throws an exception the reply message will be this ModifyFailure message.")
- [NotFound](Replicator$$NotFound.html)
- [ReadAll](Replicator$$ReadAll.html)
- [ReadConsistency](Replicator$$ReadConsistency.html)
- [ReadFrom](Replicator$$ReadFrom.html)
- [ReadLocal](Replicator$$ReadLocal$.html)
- [ReadMajority](Replicator$$ReadMajority.html)
- [ReplicaCount](Replicator$$ReplicaCount.html "Current number of replicas.")
- [StoreFailure](Replicator$$StoreFailure.html "The local store or direct replication of the Update could not be fulfill according to the given consistency level due to durable store errors.")
- [Subscribe](Replicator$$Subscribe.html "Register a subscriber that will be notified with a Changed message when the value of the given key is changed.")
- [SubscribeResponse](Replicator$$SubscribeResponse.html)
- [Unsubscribe](Replicator$$Unsubscribe.html "Unregister a subscriber.")
- Update
- [UpdateDataDeleted](Replicator$$UpdateDataDeleted.html "The Update couldn't be performed because the entry has been deleted.")
- [UpdateFailure](Replicator$$UpdateFailure.html)
- [UpdateResponse](Replicator$$UpdateResponse.html)
- [UpdateSuccess](Replicator$$UpdateSuccess.html)
- [UpdateTimeout](Replicator$$UpdateTimeout.html "The direct replication of the Update could not be fulfill according to the given consistency level and timeout.")
- [WriteAll](Replicator$$WriteAll.html)
- [WriteConsistency](Replicator$$WriteConsistency.html)
- [WriteLocal](Replicator$$WriteLocal$.html)
- [WriteMajority](Replicator$$WriteMajority.html)
- [WriteTo](Replicator$$WriteTo.html)
[c](Replicator$$Update$.html "See companion object")[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[javadsl](index.html).[Replicator](Replicator$.html)

# [Update](Replicator$$Update$.html "See companion object")[**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html "Permalink")

### Companion [object Update](Replicator$$Update$.html "See companion object")

#### final  case class Update\[A \<: [ReplicatedData](../../ReplicatedData.html)] extends [Command](Replicator$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Send this message to the local `Replicator` to update a data value for the
given `key`. The `Replicator` will reply with one of the [UpdateResponse](Replicator$$UpdateResponse.html) messages.

The current data value for the `key` is passed as parameter to the `modify` function.
It is `None` if there is no value for the `key`, and otherwise `Some(data)`. The function
is supposed to return the new value of the data, which will then be replicated according to
the given `writeConsistency`.

The `modify` function is called by the `Replicator` actor and must therefore be a pure
function that only uses the data parameter and stable fields from enclosing scope. It must
for example not access `sender()` reference of an enclosing actor.

Source[Replicator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/javadsl/Replicator.scala#L180)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Command](Replicator$$Command.html), [scaladsl.Replicator.Command](../scaladsl/Replicator$$Command.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Update
2. Serializable
3. Product
4. Equals
5. Command
6. Command
7. AnyRef
8. Any
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

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#<init>(key:akka.cluster.ddata.Key[A],initial:A,writeConsistency:akka.cluster.ddata.typed.javadsl.Replicator.WriteConsistency,replyTo:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.javadsl.Replicator.UpdateResponse[A]],modify:java.util.function.Function[A,A]):akka.cluster.ddata.typed.javadsl.Replicator.Update[A] "Permalink")  new Update(key: [Key](../../Key.html)\[A], initial: A, writeConsistency: [WriteConsistency](Replicator$$WriteConsistency.html), replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[UpdateResponse](Replicator$$UpdateResponse.html)\[A]], modify: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[A, A])Modify value of local `Replicator` and replicate with given `writeConsistency`.

Modify value of local `Replicator` and replicate with given `writeConsistency`.

The current value for the `key` is passed to the `modify` function.
If there is no current data value for the `key` the `initial` value will be
passed to the `modify` function.
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Update\[A] toany2stringadd\[Update\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Update\[A], B)ImplicitThis member is added by an implicit conversion from Update\[A] toArrowAssoc\[Update\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Update\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Update\[A]ImplicitThis member is added by an implicit conversion from Update\[A] toEnsuring\[Update\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Update\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Update\[A]ImplicitThis member is added by an implicit conversion from Update\[A] toEnsuring\[Update\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Update\[A]ImplicitThis member is added by an implicit conversion from Update\[A] toEnsuring\[Update\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Update\[A]ImplicitThis member is added by an implicit conversion from Update\[A] toEnsuring\[Update\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#key:akka.cluster.ddata.Key[A] "Permalink")  val key: [Key](../../Key.html)\[A]
16. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#modify:Option[A]=>A "Permalink")  val modify: ([Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]) \=\> A
17. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#replyTo:akka.actor.typed.ActorRef[akka.cluster.ddata.typed.javadsl.Replicator.UpdateResponse[A]] "Permalink")  val replyTo: [ActorRef](../../../../actor/typed/ActorRef.html)\[[UpdateResponse](Replicator$$UpdateResponse.html)\[A]]
22. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#writeConsistency:akka.cluster.ddata.typed.javadsl.Replicator.WriteConsistency "Permalink")  val writeConsistency: [WriteConsistency](Replicator$$WriteConsistency.html)
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Update\[A] toStringFormat\[Update\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$Update.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Update\[A], B)ImplicitThis member is added by an implicit conversion from Update\[A] toArrowAssoc\[Update\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Command](Replicator$$Command.html)

### Inherited from [scaladsl.Replicator.Command](../scaladsl/Replicator$$Command.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUpdate\[A] to any2stringadd\[Update\[A]]

### Inherited by implicit conversion StringFormat fromUpdate\[A] to StringFormat\[Update\[A]]

### Inherited by implicit conversion Ensuring fromUpdate\[A] to Ensuring\[Update\[A]]

### Inherited by implicit conversion ArrowAssoc fromUpdate\[A] to ArrowAssoc\[Update\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Changed.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$DataDeleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Delete.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$DeleteFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$DeleteResponse.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$DeleteSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Deleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Expired.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Get.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$GetDataDeleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$GetFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$GetReplicaCount.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$GetResponse.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$GetSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$NotFound.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$ReadAll.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$ReadConsistency.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$ReadFrom.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$ReadLocal$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$ReadMajority.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$ReplicaCount.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$StoreFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Subscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$SubscribeResponse.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Unsubscribe.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Update$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Update.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$UpdateDataDeleted.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$UpdateFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$UpdateResponse.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$UpdateSuccess.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$UpdateTimeout.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$WriteAll.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$WriteConsistency.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$WriteLocal$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$WriteMajority.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$WriteTo.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/scaladsl/Replicator$$Command.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Update.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$Update.html)*