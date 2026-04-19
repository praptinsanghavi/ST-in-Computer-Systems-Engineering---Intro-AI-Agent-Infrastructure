---
description: Akka 2.10.17 - akka.testkit.TestActor.SetIgnore
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:24:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestActor$$SetIgnore.html
title: Akka 2.10.17 - akka.testkit.TestActor.SetIgnore
---

# Akka 2.10.17 - akka.testkit.TestActor.SetIgnore

> **Summary:** Akka 2.10.17 - akka.testkit.TestActor.SetIgnore

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/TestActor$.html "Permalink")  object [TestActor](TestActor$.html)Definition Classes[testkit](index.html)
- [AutoPilot](TestActor$$AutoPilot.html)
- [KeepRunning](TestActor$$KeepRunning$.html)
- [Message](TestActor$$Message.html)
- [NoAutoPilot](TestActor$$NoAutoPilot$.html)
- [NullMessage](TestActor$$NullMessage$.html)
- [RealMessage](TestActor$$RealMessage.html)
- [SetAutoPilot](TestActor$$SetAutoPilot.html)
- SetIgnore
- [Spawn](TestActor$$Spawn.html)
- [UnWatch](TestActor$$UnWatch.html)
- [Watch](TestActor$$Watch.html)
c[akka](../index.html).[testkit](index.html).[TestActor](TestActor$.html)

# SetIgnore[**](../../akka/testkit/TestActor$$SetIgnore.html "Permalink")

### 

#### final  case class SetIgnore(i: [Ignore](TestActor$.html#Ignore=Option[PartialFunction[Any,Boolean]])) extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[TestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestKit.scala#L43)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SetIgnore
2. Serializable
3. Product
4. Equals
5. NoSerializationVerificationNeeded
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

1. [**](../../akka/testkit/TestActor$$SetIgnore.html#<init>(i:akka.testkit.TestActor.Ignore):akka.testkit.TestActor.SetIgnore "Permalink")  new SetIgnore(i: [Ignore](TestActor$.html#Ignore=Option[PartialFunction[Any,Boolean]]))
### Value Members

1. [**](../../akka/testkit/TestActor$$SetIgnore.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestActor$$SetIgnore.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestActor$$SetIgnore.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SetIgnore toany2stringadd\[SetIgnore] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/TestActor$$SetIgnore.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SetIgnore, B)ImplicitThis member is added by an implicit conversion from SetIgnore toArrowAssoc\[SetIgnore] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/TestActor$$SetIgnore.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/TestActor$$SetIgnore.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/testkit/TestActor$$SetIgnore.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/testkit/TestActor$$SetIgnore.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SetIgnore) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SetIgnoreImplicitThis member is added by an implicit conversion from SetIgnore toEnsuring\[SetIgnore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/testkit/TestActor$$SetIgnore.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SetIgnore) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SetIgnoreImplicitThis member is added by an implicit conversion from SetIgnore toEnsuring\[SetIgnore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/testkit/TestActor$$SetIgnore.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SetIgnoreImplicitThis member is added by an implicit conversion from SetIgnore toEnsuring\[SetIgnore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/testkit/TestActor$$SetIgnore.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SetIgnoreImplicitThis member is added by an implicit conversion from SetIgnore toEnsuring\[SetIgnore] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/testkit/TestActor$$SetIgnore.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/testkit/TestActor$$SetIgnore.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/testkit/TestActor$$SetIgnore.html#i:akka.testkit.TestActor.Ignore "Permalink")  val i: [Ignore](TestActor$.html#Ignore=Option[PartialFunction[Any,Boolean]])
15. [**](../../akka/testkit/TestActor$$SetIgnore.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/testkit/TestActor$$SetIgnore.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/testkit/TestActor$$SetIgnore.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/testkit/TestActor$$SetIgnore.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/testkit/TestActor$$SetIgnore.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../akka/testkit/TestActor$$SetIgnore.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/testkit/TestActor$$SetIgnore.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/testkit/TestActor$$SetIgnore.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/testkit/TestActor$$SetIgnore.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/TestActor$$SetIgnore.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/TestActor$$SetIgnore.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SetIgnore toStringFormat\[SetIgnore] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/TestActor$$SetIgnore.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SetIgnore, B)ImplicitThis member is added by an implicit conversion from SetIgnore toArrowAssoc\[SetIgnore] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSetIgnore to any2stringadd\[SetIgnore]

### Inherited by implicit conversion StringFormat fromSetIgnore to StringFormat\[SetIgnore]

### Inherited by implicit conversion Ensuring fromSetIgnore to Ensuring\[SetIgnore]

### Inherited by implicit conversion ArrowAssoc fromSetIgnore to ArrowAssoc\[SetIgnore]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$AutoPilot.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$KeepRunning$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$Message.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$NoAutoPilot$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$NullMessage$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$RealMessage.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$SetAutoPilot.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$SetIgnore.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$Spawn.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$UnWatch.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$Watch.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$.html
- https://doc.akka.io/api/akka/current/akka/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$SetIgnore.html](https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$SetIgnore.html)*