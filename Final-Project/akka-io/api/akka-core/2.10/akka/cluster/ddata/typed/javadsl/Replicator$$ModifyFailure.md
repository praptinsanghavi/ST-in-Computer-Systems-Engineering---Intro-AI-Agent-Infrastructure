---
description: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator.ModifyFailure
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:42:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html
title: Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator.ModifyFailure
---

# Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator.ModifyFailure

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.typed.javadsl.Replicator.ModifyFailure

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
- ModifyFailure
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
- [WriteTo](Replicator$$WriteTo.html)
c[akka](../../../../index.html).[cluster](../../../index.html).[ddata](../../index.html).[typed](../index.html).[javadsl](index.html).[Replicator](Replicator$.html)

# ModifyFailure[**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html "Permalink")

### 

#### final  case class ModifyFailure\[A \<: [ReplicatedData](../../ReplicatedData.html)](key: [Key](../../Key.html)\[A], errorMessage: String, cause: Throwable) extends [UpdateFailure](Replicator$$UpdateFailure.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

If the `modify` function of the [Update](Replicator$$Update.html) throws an exception the reply message
will be this `ModifyFailure` message. The original exception is included as `cause`.

Source[Replicator.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-typed/src/main/scala/akka/cluster/ddata/typed/javadsl/Replicator.scala#L230)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [UpdateFailure](Replicator$$UpdateFailure.html)\[A], [UpdateResponse](Replicator$$UpdateResponse.html)\[A], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ModifyFailure
2. Serializable
3. Product
4. Equals
5. UpdateFailure
6. UpdateResponse
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

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#<init>(key:akka.cluster.ddata.Key[A],errorMessage:String,cause:Throwable):akka.cluster.ddata.typed.javadsl.Replicator.ModifyFailure[A] "Permalink")  new ModifyFailure(key: [Key](../../Key.html)\[A], errorMessage: String, cause: Throwable)
### Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ModifyFailure\[A] toany2stringadd\[ModifyFailure\[A]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ModifyFailure\[A], B)ImplicitThis member is added by an implicit conversion from ModifyFailure\[A] toArrowAssoc\[ModifyFailure\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#cause:Throwable "Permalink")  val cause: Throwable
8. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ModifyFailure\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ModifyFailure\[A]ImplicitThis member is added by an implicit conversion from ModifyFailure\[A] toEnsuring\[ModifyFailure\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ModifyFailure\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ModifyFailure\[A]ImplicitThis member is added by an implicit conversion from ModifyFailure\[A] toEnsuring\[ModifyFailure\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ModifyFailure\[A]ImplicitThis member is added by an implicit conversion from ModifyFailure\[A] toEnsuring\[ModifyFailure\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ModifyFailure\[A]ImplicitThis member is added by an implicit conversion from ModifyFailure\[A] toEnsuring\[ModifyFailure\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#errorMessage:String "Permalink")  val errorMessage: String
15. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#key:akka.cluster.ddata.Key[A] "Permalink")  val key: [Key](../../Key.html)\[A]Definition ClassesModifyFailure → [UpdateResponse](Replicator$$UpdateResponse.html)
18. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#toString():String "Permalink")  def toString(): StringDefinition ClassesModifyFailure → AnyRef → Any
24. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ModifyFailure\[A] toStringFormat\[ModifyFailure\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ModifyFailure\[A], B)ImplicitThis member is added by an implicit conversion from ModifyFailure\[A] toArrowAssoc\[ModifyFailure\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [UpdateFailure](Replicator$$UpdateFailure.html)\[A]

### Inherited from [UpdateResponse](Replicator$$UpdateResponse.html)\[A]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromModifyFailure\[A] to any2stringadd\[ModifyFailure\[A]]

### Inherited by implicit conversion StringFormat fromModifyFailure\[A] to StringFormat\[ModifyFailure\[A]]

### Inherited by implicit conversion Ensuring fromModifyFailure\[A] to Ensuring\[ModifyFailure\[A]]

### Inherited by implicit conversion ArrowAssoc fromModifyFailure\[A] to ArrowAssoc\[ModifyFailure\[A]]

### Ungrouped

## Related Pages (Internal Links)

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
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/typed/javadsl/Replicator$$ModifyFailure.html)*