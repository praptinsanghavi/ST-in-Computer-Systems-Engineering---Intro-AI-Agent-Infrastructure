---
description: Akka 2.8.9 - akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:29:45Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka/current/akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html
title: Akka 2.8.9 - akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot
---

# Akka 2.8.9 - akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot

> **Summary:** Akka 2.8.9 - akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot

## Content

Akka2\.8\.9 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/persistence/AtLeastOnceDelivery$.html "Permalink")  object [AtLeastOnceDelivery](AtLeastOnceDelivery$.html)Definition Classes[persistence](index.html)Annotations@ccompatUsedUntil213()
- AtLeastOnceDeliverySnapshot
- [MaxUnconfirmedMessagesExceededException](AtLeastOnceDelivery$$MaxUnconfirmedMessagesExceededException.html)
- [UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html "Information about a message that has not been confirmed.")
- [UnconfirmedWarning](AtLeastOnceDelivery$$UnconfirmedWarning.html)
c[akka](../index.html).[persistence](index.html).[AtLeastOnceDelivery](AtLeastOnceDelivery$.html)

# AtLeastOnceDeliverySnapshot[**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html "Permalink")

### 

#### case class AtLeastOnceDeliverySnapshot(currentDeliveryId: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), unconfirmedDeliveries: [Seq](https://www.scala-lang.org/api/2.13.11/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html)]) extends [Message](serialization/Message.html) with [Product](https://www.scala-lang.org/api/2.13.11/scala/Product.html#scala.Product) with Serializable

Snapshot of current `AtLeastOnceDelivery` state. Can be retrieved with
[AtLeastOnceDeliveryLike\#getDeliverySnapshot](AtLeastOnceDeliveryLike.html#getDeliverySnapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot) and saved with [PersistentActor\#saveSnapshot](PersistentActor.html#saveSnapshot(snapshot:Any):Unit).
During recovery the snapshot received in [SnapshotOffer](SnapshotOffer.html) should be set
with [AtLeastOnceDeliveryLike\#setDeliverySnapshot](AtLeastOnceDeliveryLike.html#setDeliverySnapshot(snapshot:akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot):Unit).

Annotations@SerialVersionUID() Source[AtLeastOnceDelivery.scala](https://github.com/akka/akka/tree/v2.8.9//akka-persistence/src/main/scala/akka/persistence/AtLeastOnceDelivery.scala#L27)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.11/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.11/scala/Equals.html#scala.Equals), [Message](serialization/Message.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AtLeastOnceDeliverySnapshot
2. Product
3. Equals
4. Message
5. Serializable
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

1. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#<init>(currentDeliveryId:Long,unconfirmedDeliveries:Seq[akka.persistence.AtLeastOnceDelivery.UnconfirmedDelivery]):akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot "Permalink")  new AtLeastOnceDeliverySnapshot(currentDeliveryId: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), unconfirmedDeliveries: [Seq](https://www.scala-lang.org/api/2.13.11/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html)])
### Value Members

1. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AtLeastOnceDeliverySnapshot toany2stringadd\[AtLeastOnceDeliverySnapshot] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AtLeastOnceDeliverySnapshot, B)ImplicitThis member is added by an implicit conversion from AtLeastOnceDeliverySnapshot toArrowAssoc\[AtLeastOnceDeliverySnapshot] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native() @HotSpotIntrinsicCandidate()
8. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#currentDeliveryId:Long "Permalink")  val currentDeliveryId: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)
9. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AtLeastOnceDeliverySnapshot) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): AtLeastOnceDeliverySnapshotImplicitThis member is added by an implicit conversion from AtLeastOnceDeliverySnapshot toEnsuring\[AtLeastOnceDeliverySnapshot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AtLeastOnceDeliverySnapshot) \=\> [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): AtLeastOnceDeliverySnapshotImplicitThis member is added by an implicit conversion from AtLeastOnceDeliverySnapshot toEnsuring\[AtLeastOnceDeliverySnapshot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)): AtLeastOnceDeliverySnapshotImplicitThis member is added by an implicit conversion from AtLeastOnceDeliverySnapshot toEnsuring\[AtLeastOnceDeliverySnapshot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)): AtLeastOnceDeliverySnapshotImplicitThis member is added by an implicit conversion from AtLeastOnceDeliverySnapshot toEnsuring\[AtLeastOnceDeliverySnapshot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native() @HotSpotIntrinsicCandidate()
15. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#getUnconfirmedDeliveries:java.util.List[akka.persistence.AtLeastOnceDelivery.UnconfirmedDelivery] "Permalink")  def getUnconfirmedDeliveries: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html)]Java API
16. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.11/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
19. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native() @HotSpotIntrinsicCandidate()
20. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#unconfirmedDeliveries:Seq[akka.persistence.AtLeastOnceDelivery.UnconfirmedDelivery] "Permalink")  val unconfirmedDeliveries: [Seq](https://www.scala-lang.org/api/2.13.11/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html)]
23. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.11/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.11/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.11/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated @Deprecated Deprecated
2. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AtLeastOnceDeliverySnapshot toStringFormat\[AtLeastOnceDeliverySnapshot] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AtLeastOnceDeliverySnapshot, B)ImplicitThis member is added by an implicit conversion from AtLeastOnceDeliverySnapshot toArrowAssoc\[AtLeastOnceDeliverySnapshot] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.11/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.11/scala/Equals.html#scala.Equals)

### Inherited from [Message](serialization/Message.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.11/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.11/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAtLeastOnceDeliverySnapshot to any2stringadd\[AtLeastOnceDeliverySnapshot]

### Inherited by implicit conversion StringFormat fromAtLeastOnceDeliverySnapshot to StringFormat\[AtLeastOnceDeliverySnapshot]

### Inherited by implicit conversion Ensuring fromAtLeastOnceDeliverySnapshot to Ensuring\[AtLeastOnceDeliverySnapshot]

### Inherited by implicit conversion ArrowAssoc fromAtLeastOnceDeliverySnapshot to ArrowAssoc\[AtLeastOnceDeliverySnapshot]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.8/akka/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/AtLeastOnceDelivery$$MaxUnconfirmedMessagesExceededException.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/AtLeastOnceDelivery$$UnconfirmedDelivery.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/AtLeastOnceDelivery$.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/PersistentActor.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.8/akka/persistence/serialization/Message.html
- https://doc.akka.io/api/akka/2.8/index.html

---
*Source: [https://doc.akka.io/api/akka/2.8/akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html](https://doc.akka.io/api/akka/2.8/akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html)*