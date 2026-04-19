---
description: Akka 2.10.17 - akka.persistence.AtLeastOnceDelivery.UnconfirmedWarning
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:42:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html
title: Akka 2.10.17 - akka.persistence.AtLeastOnceDelivery.UnconfirmedWarning
---

# Akka 2.10.17 - akka.persistence.AtLeastOnceDelivery.UnconfirmedWarning

> **Summary:** Akka 2.10.17 - akka.persistence.AtLeastOnceDelivery.UnconfirmedWarning

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/persistence/AtLeastOnceDelivery$.html "Permalink")  object [AtLeastOnceDelivery](AtLeastOnceDelivery$.html)Definition Classes[persistence](index.html)
- [AtLeastOnceDeliverySnapshot](AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html "Snapshot of current AtLeastOnceDelivery state.")
- [MaxUnconfirmedMessagesExceededException](AtLeastOnceDelivery$$MaxUnconfirmedMessagesExceededException.html)
- [UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html "Information about a message that has not been confirmed.")
- UnconfirmedWarning
c[akka](../index.html).[persistence](index.html).[AtLeastOnceDelivery](AtLeastOnceDelivery$.html)

# UnconfirmedWarning[**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html "Permalink")

### 

#### case class UnconfirmedWarning(unconfirmedDeliveries: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Annotations@SerialVersionUID() Source[AtLeastOnceDelivery.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/AtLeastOnceDelivery.scala#L44)See also[AtLeastOnceDeliveryLike\#warnAfterNumberOfUnconfirmedAttempts](AtLeastOnceDeliveryLike.html#warnAfterNumberOfUnconfirmedAttempts:Int)

Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UnconfirmedWarning
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

1. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#<init>(unconfirmedDeliveries:Seq[akka.persistence.AtLeastOnceDelivery.UnconfirmedDelivery]):akka.persistence.AtLeastOnceDelivery.UnconfirmedWarning "Permalink")  new UnconfirmedWarning(unconfirmedDeliveries: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html)])
### Value Members

1. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from UnconfirmedWarning toany2stringadd\[UnconfirmedWarning] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (UnconfirmedWarning, B)ImplicitThis member is added by an implicit conversion from UnconfirmedWarning toArrowAssoc\[UnconfirmedWarning] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (UnconfirmedWarning) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnconfirmedWarningImplicitThis member is added by an implicit conversion from UnconfirmedWarning toEnsuring\[UnconfirmedWarning] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (UnconfirmedWarning) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnconfirmedWarningImplicitThis member is added by an implicit conversion from UnconfirmedWarning toEnsuring\[UnconfirmedWarning] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnconfirmedWarningImplicitThis member is added by an implicit conversion from UnconfirmedWarning toEnsuring\[UnconfirmedWarning] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnconfirmedWarningImplicitThis member is added by an implicit conversion from UnconfirmedWarning toEnsuring\[UnconfirmedWarning] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#getUnconfirmedDeliveries:java.util.List[akka.persistence.AtLeastOnceDelivery.UnconfirmedDelivery] "Permalink")  def getUnconfirmedDeliveries: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html)]Java API
15. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#unconfirmedDeliveries:Seq[akka.persistence.AtLeastOnceDelivery.UnconfirmedDelivery] "Permalink")  val unconfirmedDeliveries: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[UnconfirmedDelivery](AtLeastOnceDelivery$$UnconfirmedDelivery.html)]
22. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from UnconfirmedWarning toStringFormat\[UnconfirmedWarning] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (UnconfirmedWarning, B)ImplicitThis member is added by an implicit conversion from UnconfirmedWarning toArrowAssoc\[UnconfirmedWarning] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUnconfirmedWarning to any2stringadd\[UnconfirmedWarning]

### Inherited by implicit conversion StringFormat fromUnconfirmedWarning to StringFormat\[UnconfirmedWarning]

### Inherited by implicit conversion Ensuring fromUnconfirmedWarning to Ensuring\[UnconfirmedWarning]

### Inherited by implicit conversion ArrowAssoc fromUnconfirmedWarning to ArrowAssoc\[UnconfirmedWarning]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery$$AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery$$MaxUnconfirmedMessagesExceededException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery$$UnconfirmedDelivery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery$$UnconfirmedWarning.html)*