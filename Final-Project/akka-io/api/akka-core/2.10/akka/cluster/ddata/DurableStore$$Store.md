---
description: Akka 2.10.17 - akka.cluster.ddata.DurableStore.Store
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:41:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/DurableStore$$Store.html
title: Akka 2.10.17 - akka.cluster.ddata.DurableStore.Store
---

# Akka 2.10.17 - akka.cluster.ddata.DurableStore.Store

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.DurableStore.Store

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/ddata/DurableStore$.html "Permalink")  object [DurableStore](DurableStore$.html "An actor implementing the durable store for the Distributed Data Replicator has to implement the protocol with the messages defined here.")An actor implementing the durable store for the Distributed Data `Replicator`
has to implement the protocol with the messages defined here.

An actor implementing the durable store for the Distributed Data `Replicator`
has to implement the protocol with the messages defined here.

At startup the `Replicator` creates the durable store actor and sends the
`Load` message to it. It must then reply with 0 or more `LoadData` messages
followed by one `LoadAllCompleted` message to the `sender` (the `Replicator`).

If the `LoadAll` fails it can throw `LoadFailed` and the `Replicator` supervisor
will stop itself and the durable store.

When the `Replicator` needs to store a value it sends a `Store` message
to the durable store actor, which must then reply with the `successMsg` or
`failureMsg` to the `replyTo`.

When entries have expired the `Replicator` sends a `Expire` message to the durable
store actor, which can delete the entries from the backend store.

Definition Classes[ddata](index.html)
- [DurableDataEnvelope](DurableStore$$DurableDataEnvelope.html "Wrapper class for serialization of a data value.")
- [Expire](DurableStore$$Expire.html "Request to expire (remove) entries.")
- [LoadAll](DurableStore$$LoadAll$.html "Request to load all entries.")
- [LoadAllCompleted](DurableStore$$LoadAllCompleted$.html)
- [LoadData](DurableStore$$LoadData.html)
- [LoadFailed](DurableStore$$LoadFailed.html)
- Store
- [StoreReply](DurableStore$$StoreReply.html)
c[akka](../../index.html).[cluster](../index.html).[ddata](index.html).[DurableStore](DurableStore$.html)

# Store[**](../../../akka/cluster/ddata/DurableStore$$Store.html "Permalink")

### 

#### final  case class Store(key: [KeyId](Key$.html#KeyId=String), data: [DurableDataEnvelope](DurableStore$$DurableDataEnvelope.html), reply: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[StoreReply](DurableStore$$StoreReply.html)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Request to store an entry. It optionally contains a `StoreReply`, which
should be used to signal success or failure of the operation to the contained
`replyTo` actor.

Source[DurableStore.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/DurableStore.scala#L63)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Store
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
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

1. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#<init>(key:akka.cluster.ddata.Key.KeyId,data:akka.cluster.ddata.DurableStore.DurableDataEnvelope,reply:Option[akka.cluster.ddata.DurableStore.StoreReply]):akka.cluster.ddata.DurableStore.Store "Permalink")  new Store(key: [KeyId](Key$.html#KeyId=String), data: [DurableDataEnvelope](DurableStore$$DurableDataEnvelope.html), reply: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[StoreReply](DurableStore$$StoreReply.html)])
### Value Members

1. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/DurableStore$$Store.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Store toany2stringadd\[Store] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Store, B)ImplicitThis member is added by an implicit conversion from Store toArrowAssoc\[Store] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#data:akka.cluster.ddata.DurableStore.DurableDataEnvelope "Permalink")  val data: [DurableDataEnvelope](DurableStore$$DurableDataEnvelope.html)
9. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Store) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StoreImplicitThis member is added by an implicit conversion from Store toEnsuring\[Store] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Store) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StoreImplicitThis member is added by an implicit conversion from Store toEnsuring\[Store] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StoreImplicitThis member is added by an implicit conversion from Store toEnsuring\[Store] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StoreImplicitThis member is added by an implicit conversion from Store toEnsuring\[Store] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#key:akka.cluster.ddata.Key.KeyId "Permalink")  val key: [KeyId](Key$.html#KeyId=String)
17. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#reply:Option[akka.cluster.ddata.DurableStore.StoreReply] "Permalink")  val reply: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[StoreReply](DurableStore$$StoreReply.html)]
22. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Store toStringFormat\[Store] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/DurableStore$$Store.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Store, B)ImplicitThis member is added by an implicit conversion from Store toArrowAssoc\[Store] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStore to any2stringadd\[Store]

### Inherited by implicit conversion StringFormat fromStore to StringFormat\[Store]

### Inherited by implicit conversion Ensuring fromStore to Ensuring\[Store]

### Inherited by implicit conversion ArrowAssoc fromStore to ArrowAssoc\[Store]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$$DurableDataEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$$Expire.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$$LoadAll$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$$LoadAllCompleted$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$$LoadData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$$LoadFailed.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$$Store.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$$StoreReply.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$$Store.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/DurableStore$$Store.html)*