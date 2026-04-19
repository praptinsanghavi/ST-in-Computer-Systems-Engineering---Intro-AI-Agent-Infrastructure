---
description: Akka 2.10.17 - akka.routing.ConsistentHashingRouter.ConsistentHashable
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:25:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html
title: Akka 2.10.17 - akka.routing.ConsistentHashingRouter.ConsistentHashable
---

# Akka 2.10.17 - akka.routing.ConsistentHashingRouter.ConsistentHashable

> **Summary:** Akka 2.10.17 - akka.routing.ConsistentHashingRouter.ConsistentHashable

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/ConsistentHashingRouter$.html "Permalink")  object [ConsistentHashingRouter](ConsistentHashingRouter$.html)Definition Classes[routing](index.html)
- [ConsistentHashMapper](ConsistentHashingRouter$$ConsistentHashMapper.html "JAVA API Mapping from message to the data to use for the consistent hash key.")
- ConsistentHashable
- [ConsistentHashableEnvelope](ConsistentHashingRouter$$ConsistentHashableEnvelope.html "If you don't define the hashMapping when constructing the akka.routing.ConsistentHashingRouter and messages can't implement akka.routing.ConsistentHashingRouter.ConsistentHashable themselves they can we wrapped by this envelope instead.")
- [emptyConsistentHashMapping](ConsistentHashingRouter$$emptyConsistentHashMapping$.html)
t[akka](../index.html).[routing](index.html).[ConsistentHashingRouter](ConsistentHashingRouter$.html)

# ConsistentHashable[**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html "Permalink")

### 

#### trait ConsistentHashable extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

If you don't define the `hashMapping` when
constructing the [akka.routing.ConsistentHashingRouter](ConsistentHashingRouter$.html)
the messages need to implement this interface to define what
data to use for the consistent hash key. Note that it's not
the hash, but the data to be hashed.

If returning an `Array[Byte]` or String it will be used as is,
otherwise the configured [akka.serialization.Serializer](../serialization/Serializer.html)
will be applied to the returned data.

If messages can't implement this interface themselves,
it's possible to wrap the messages in
[akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter$$ConsistentHashableEnvelope.html),
or use [akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope](ConsistentHashingRouter$$ConsistentHashableEnvelope.html)

Source[ConsistentHashing.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/routing/ConsistentHashing.scala#L44)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Resolve](../io/dns/DnsProtocol$$Resolve.html), [ConsistentHashableEnvelope](ConsistentHashingRouter$$ConsistentHashableEnvelope.html), [Resolve](../io/Dns$$Resolve.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConsistentHashable
2. AnyRef
3. Any
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

1. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#consistentHashKey:Any "Permalink") abstract  def consistentHashKey: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)
### Concrete Value Members

1. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ConsistentHashable toany2stringadd\[ConsistentHashable] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ConsistentHashable, B)ImplicitThis member is added by an implicit conversion from ConsistentHashable toArrowAssoc\[ConsistentHashable] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ConsistentHashable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConsistentHashableImplicitThis member is added by an implicit conversion from ConsistentHashable toEnsuring\[ConsistentHashable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ConsistentHashable) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConsistentHashableImplicitThis member is added by an implicit conversion from ConsistentHashable toEnsuring\[ConsistentHashable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConsistentHashableImplicitThis member is added by an implicit conversion from ConsistentHashable toEnsuring\[ConsistentHashable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConsistentHashableImplicitThis member is added by an implicit conversion from ConsistentHashable toEnsuring\[ConsistentHashable] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ConsistentHashable toStringFormat\[ConsistentHashable] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/routing/ConsistentHashingRouter$$ConsistentHashable.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ConsistentHashable, B)ImplicitThis member is added by an implicit conversion from ConsistentHashable toArrowAssoc\[ConsistentHashable] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromConsistentHashable to any2stringadd\[ConsistentHashable]

### Inherited by implicit conversion StringFormat fromConsistentHashable to StringFormat\[ConsistentHashable]

### Inherited by implicit conversion Ensuring fromConsistentHashable to Ensuring\[ConsistentHashable]

### Inherited by implicit conversion ArrowAssoc fromConsistentHashable to ArrowAssoc\[ConsistentHashable]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/Dns$$Resolve.html
- https://doc.akka.io/api/akka-core/2.10/akka/io/dns/DnsProtocol$$Resolve.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$$ConsistentHashMapper.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$$emptyConsistentHashMapping$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/serialization/Serializer.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html](https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html)*