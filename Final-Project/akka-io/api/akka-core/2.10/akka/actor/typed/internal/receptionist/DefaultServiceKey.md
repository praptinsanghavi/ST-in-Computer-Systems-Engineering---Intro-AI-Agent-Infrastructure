---
description: Akka 2.10.17 - akka.actor.typed.internal.receptionist.DefaultServiceKey
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:57:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/internal/receptionist/DefaultServiceKey.html
title: Akka 2.10.17 - akka.actor.typed.internal.receptionist.DefaultServiceKey
---

# Akka 2.10.17 - akka.actor.typed.internal.receptionist.DefaultServiceKey

> **Summary:** Akka 2.10.17 - akka.actor.typed.internal.receptionist.DefaultServiceKey

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/typed/index.html "Permalink")  package [typed](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/typed/internal/index.html "Permalink")  package [internal](../index.html)Definition Classes[typed](../../index.html)
- [**](../../../../../akka/actor/typed/internal/receptionist/index.html "Permalink")  package [receptionist](index.html)Definition Classes[internal](../index.html)
- DefaultServiceKey
- [ServiceKeySerializer](ServiceKeySerializer.html "Internal API")
c[akka](../../../../index.html).[actor](../../../index.html).[typed](../../index.html).[internal](../index.html).[receptionist](index.html)

# DefaultServiceKey[**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html "Permalink")

### 

#### final  case class DefaultServiceKey\[T](id: String, typeName: String) extends [ServiceKey](../../receptionist/ServiceKey.html)\[T] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

This is the only actual concrete service key type

Internal API

Annotations@[InternalApi](../../../../annotation/InternalApi.html)() Source[ServiceKey.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/internal/receptionist/ServiceKey.scala#L31)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [ServiceKey](../../receptionist/ServiceKey.html)\[T], AbstractServiceKey, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DefaultServiceKey
2. Serializable
3. Product
4. Equals
5. ServiceKey
6. AbstractServiceKey
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

1. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#<init>(id:String,typeName:String):akka.actor.typed.internal.receptionist.DefaultServiceKey[T] "Permalink")  new DefaultServiceKey(id: String, typeName: String)
### Type Members

1. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#Protocol=T "Permalink")  type Protocol \= TDefinition Classes[ServiceKey](../../receptionist/ServiceKey.html) → AbstractServiceKey
### Value Members

1. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DefaultServiceKey\[T] toany2stringadd\[DefaultServiceKey\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DefaultServiceKey\[T], B)ImplicitThis member is added by an implicit conversion from DefaultServiceKey\[T] toArrowAssoc\[DefaultServiceKey\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#asServiceKey:akka.actor.typed.receptionist.ServiceKey[T] "Permalink")  def asServiceKey: [ServiceKey](../../receptionist/ServiceKey.html)\[T]Type\-safe down\-cast

Type\-safe down\-cast

Definition Classes[ServiceKey](../../receptionist/ServiceKey.html) → AbstractServiceKey
8. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DefaultServiceKey\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DefaultServiceKey\[T]ImplicitThis member is added by an implicit conversion from DefaultServiceKey\[T] toEnsuring\[DefaultServiceKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DefaultServiceKey\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DefaultServiceKey\[T]ImplicitThis member is added by an implicit conversion from DefaultServiceKey\[T] toEnsuring\[DefaultServiceKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DefaultServiceKey\[T]ImplicitThis member is added by an implicit conversion from DefaultServiceKey\[T] toEnsuring\[DefaultServiceKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DefaultServiceKey\[T]ImplicitThis member is added by an implicit conversion from DefaultServiceKey\[T] toEnsuring\[DefaultServiceKey\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#id:String "Permalink")  val id: StringDefinition ClassesDefaultServiceKey → [ServiceKey](../../receptionist/ServiceKey.html)
16. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#toString():String "Permalink")  def toString(): StringDefinition ClassesDefaultServiceKey → AnyRef → Any
23. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#typeName:String "Permalink")  val typeName: String
24. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../../../akka/actor/typed/receptionist/ServiceKey$Listing$.html "Permalink")  object [Listing](../../receptionist/ServiceKey$Listing$.html "Scala API: Provides a type safe pattern match for listings.")Scala API: Provides a type safe pattern match for listings.

Scala API: Provides a type safe pattern match for listings.

Using it for pattern match like this will return the reachable service instances:

`case MyServiceKey.Listing(reachable) =>`

In a non\-clustered `ActorSystem` this will always be all registered instances
for a service key. For a clustered environment services on nodes that have
been observed unreachable are not among these (note that they could have
become unreachable between this message being sent and the receiving actor
processing it).

Definition Classes[ServiceKey](../../receptionist/ServiceKey.html)
28. [**](../../../../../akka/actor/typed/receptionist/ServiceKey$Registered$.html "Permalink")  object [Registered](../../receptionist/ServiceKey$Registered$.html "Scala API: Provides a type safe pattern match for registration acks")Scala API: Provides a type safe pattern match for registration acks

Scala API: Provides a type safe pattern match for registration acks

Definition Classes[ServiceKey](../../receptionist/ServiceKey.html)
### Deprecated Value Members

1. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DefaultServiceKey\[T] toStringFormat\[DefaultServiceKey\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/typed/internal/receptionist/DefaultServiceKey.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DefaultServiceKey\[T], B)ImplicitThis member is added by an implicit conversion from DefaultServiceKey\[T] toArrowAssoc\[DefaultServiceKey\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [ServiceKey](../../receptionist/ServiceKey.html)\[T]

### Inherited from AbstractServiceKey

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDefaultServiceKey\[T] to any2stringadd\[DefaultServiceKey\[T]]

### Inherited by implicit conversion StringFormat fromDefaultServiceKey\[T] to StringFormat\[DefaultServiceKey\[T]]

### Inherited by implicit conversion Ensuring fromDefaultServiceKey\[T] to Ensuring\[DefaultServiceKey\[T]]

### Inherited by implicit conversion ArrowAssoc fromDefaultServiceKey\[T] to ArrowAssoc\[DefaultServiceKey\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/receptionist/DefaultServiceKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/receptionist/ServiceKeySerializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/receptionist/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$Listing$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey$Registered$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/receptionist/DefaultServiceKey.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/internal/receptionist/DefaultServiceKey.html)*