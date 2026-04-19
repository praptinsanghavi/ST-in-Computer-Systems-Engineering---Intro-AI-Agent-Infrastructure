---
description: Akka 2.10.17 - akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:46:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html
title: Akka 2.10.17 - akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope
---

# Akka 2.10.17 - akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope

> **Summary:** Akka 2.10.17 - akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/ConsistentHashingRouter$.html "Permalink")  object [ConsistentHashingRouter](ConsistentHashingRouter$.html)Definition Classes[routing](index.html)
- [ConsistentHashMapper](ConsistentHashingRouter$$ConsistentHashMapper.html "JAVA API Mapping from message to the data to use for the consistent hash key.")
- [ConsistentHashable](ConsistentHashingRouter$$ConsistentHashable.html "If you don't define the hashMapping when constructing the akka.routing.ConsistentHashingRouter the messages need to implement this interface to define what data to use for the consistent hash key.")
- ConsistentHashableEnvelope
- [emptyConsistentHashMapping](ConsistentHashingRouter$$emptyConsistentHashMapping$.html)
c[akka](../index.html).[routing](index.html).[ConsistentHashingRouter](ConsistentHashingRouter$.html)

# ConsistentHashableEnvelope[**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html "Permalink")

### 

#### final  case class ConsistentHashableEnvelope(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), hashKey: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [ConsistentHashable](ConsistentHashingRouter$$ConsistentHashable.html) with [RouterEnvelope](RouterEnvelope.html) with [WrappedMessage](../actor/WrappedMessage.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

If you don't define the `hashMapping` when
constructing the [akka.routing.ConsistentHashingRouter](ConsistentHashingRouter$.html)
and messages can't implement [akka.routing.ConsistentHashingRouter.ConsistentHashable](ConsistentHashingRouter$$ConsistentHashable.html)
themselves they can we wrapped by this envelope instead. The
router will only send the wrapped message to the destination,
i.e. the envelope will be stripped off.

Annotations@SerialVersionUID() Source[ConsistentHashing.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/routing/ConsistentHashing.scala#L57)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [RouterEnvelope](RouterEnvelope.html), [WrappedMessage](../actor/WrappedMessage.html), [ConsistentHashable](ConsistentHashingRouter$$ConsistentHashable.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConsistentHashableEnvelope
2. Serializable
3. Product
4. Equals
5. RouterEnvelope
6. WrappedMessage
7. ConsistentHashable
8. AnyRef
9. Any
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

1. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#<init>(message:Any,hashKey:Any):akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope "Permalink")  new ConsistentHashableEnvelope(message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), hashKey: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))
### Value Members

1. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ConsistentHashableEnvelope toany2stringadd\[ConsistentHashableEnvelope] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ConsistentHashableEnvelope, B)ImplicitThis member is added by an implicit conversion from ConsistentHashableEnvelope toArrowAssoc\[ConsistentHashableEnvelope] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#consistentHashKey:Any "Permalink")  def consistentHashKey: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesConsistentHashableEnvelope → [ConsistentHashable](ConsistentHashingRouter$$ConsistentHashable.html)
9. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ConsistentHashableEnvelope) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConsistentHashableEnvelopeImplicitThis member is added by an implicit conversion from ConsistentHashableEnvelope toEnsuring\[ConsistentHashableEnvelope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ConsistentHashableEnvelope) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConsistentHashableEnvelopeImplicitThis member is added by an implicit conversion from ConsistentHashableEnvelope toEnsuring\[ConsistentHashableEnvelope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConsistentHashableEnvelopeImplicitThis member is added by an implicit conversion from ConsistentHashableEnvelope toEnsuring\[ConsistentHashableEnvelope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConsistentHashableEnvelopeImplicitThis member is added by an implicit conversion from ConsistentHashableEnvelope toEnsuring\[ConsistentHashableEnvelope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#hashKey:Any "Permalink")  val hashKey: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)
16. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#message:Any "Permalink")  val message: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesConsistentHashableEnvelope → [RouterEnvelope](RouterEnvelope.html) → [WrappedMessage](../actor/WrappedMessage.html)
18. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ConsistentHashableEnvelope toStringFormat\[ConsistentHashableEnvelope] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ConsistentHashableEnvelope, B)ImplicitThis member is added by an implicit conversion from ConsistentHashableEnvelope toArrowAssoc\[ConsistentHashableEnvelope] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [RouterEnvelope](RouterEnvelope.html)

### Inherited from [WrappedMessage](../actor/WrappedMessage.html)

### Inherited from [ConsistentHashable](ConsistentHashingRouter$$ConsistentHashable.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromConsistentHashableEnvelope to any2stringadd\[ConsistentHashableEnvelope]

### Inherited by implicit conversion StringFormat fromConsistentHashableEnvelope to StringFormat\[ConsistentHashableEnvelope]

### Inherited by implicit conversion Ensuring fromConsistentHashableEnvelope to Ensuring\[ConsistentHashableEnvelope]

### Inherited by implicit conversion ArrowAssoc fromConsistentHashableEnvelope to ArrowAssoc\[ConsistentHashableEnvelope]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/WrappedMessage.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$ConsistentHashMapper.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html
- https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$.html
- https://doc.akka.io/api/akka/current/akka/routing/RouterEnvelope.html
- https://doc.akka.io/api/akka/current/akka/routing/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html](https://doc.akka.io/api/akka/current/akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html)*