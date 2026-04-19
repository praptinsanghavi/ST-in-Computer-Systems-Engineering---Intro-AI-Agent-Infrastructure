---
description: Akka 2.10.17 - akka.actor.Status.Success
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:56:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/Status$$Success.html
title: Akka 2.10.17 - akka.actor.Status.Success
---

# Akka 2.10.17 - akka.actor.Status.Success

> **Summary:** Akka 2.10.17 - akka.actor.Status.Success

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/Status$.html "Permalink")  object [Status](Status$.html "Superseeded by akka.pattern.StatusReply, prefer that when possible.")Superseeded by [akka.pattern.StatusReply](../pattern/StatusReply.html), prefer that when possible.

Superseeded by [akka.pattern.StatusReply](../pattern/StatusReply.html), prefer that when possible.

Classes for passing status back to the sender.
Used for internal ACKing protocol. But exposed as utility class for user\-specific ACKing protocols as well.

Definition Classes[actor](index.html)
- [Failure](Status$$Failure.html "This class/message type is preferably used to indicate failure of some operation performed.")
- [Status](Status$$Status.html)
- Success
c[akka](../index.html).[actor](index.html).[Status](Status$.html)

# Success[**](../../akka/actor/Status$$Success.html "Permalink")

### 

#### final  case class Success(status: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [Status](Status$$Status.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

This class/message type is preferably used to indicate success of some operation performed.

Annotations@SerialVersionUID() Source[Actor.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/Actor.scala#L313)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Status](Status$$Status.html), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Success
2. Product
3. Equals
4. Status
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

1. [**](../../akka/actor/Status$$Success.html#<init>(status:Any):akka.actor.Status.Success "Permalink")  new Success(status: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any))
### Value Members

1. [**](../../akka/actor/Status$$Success.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/Status$$Success.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/Status$$Success.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Success toany2stringadd\[Success] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/Status$$Success.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Success, B)ImplicitThis member is added by an implicit conversion from Success toArrowAssoc\[Success] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/Status$$Success.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/Status$$Success.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/actor/Status$$Success.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/actor/Status$$Success.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Success) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SuccessImplicitThis member is added by an implicit conversion from Success toEnsuring\[Success] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/actor/Status$$Success.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Success) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SuccessImplicitThis member is added by an implicit conversion from Success toEnsuring\[Success] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/actor/Status$$Success.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SuccessImplicitThis member is added by an implicit conversion from Success toEnsuring\[Success] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/actor/Status$$Success.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SuccessImplicitThis member is added by an implicit conversion from Success toEnsuring\[Success] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/actor/Status$$Success.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/actor/Status$$Success.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/actor/Status$$Success.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../akka/actor/Status$$Success.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/actor/Status$$Success.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/actor/Status$$Success.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/actor/Status$$Success.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
19. [**](../../akka/actor/Status$$Success.html#status:Any "Permalink")  val status: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)
20. [**](../../akka/actor/Status$$Success.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/actor/Status$$Success.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/actor/Status$$Success.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/actor/Status$$Success.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/Status$$Success.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/Status$$Success.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Success toStringFormat\[Success] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/Status$$Success.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Success, B)ImplicitThis member is added by an implicit conversion from Success toArrowAssoc\[Success] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Status](Status$$Status.html)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSuccess to any2stringadd\[Success]

### Inherited by implicit conversion StringFormat fromSuccess to StringFormat\[Success]

### Inherited by implicit conversion Ensuring fromSuccess to Ensuring\[Success]

### Inherited by implicit conversion ArrowAssoc fromSuccess to ArrowAssoc\[Success]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Status$$Status.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Status$$Success.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Status$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/Status$$Success.html](https://doc.akka.io/api/akka/2.10/akka/actor/Status$$Success.html)*