---
description: Akka 2.10.17 - akka.japi.Option
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:04:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/Option$.html
title: Akka 2.10.17 - akka.japi.Option
---

# Akka 2.10.17 - akka.japi.Option

> **Summary:** Akka 2.10.17 - akka.japi.Option

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/function/index.html "Permalink")  package [function](function/index.html)Definition Classes[japi](index.html)
- [**](../../akka/japi/pf/index.html "Permalink")  package [pf](pf/index.html)Definition Classes[japi](index.html)
- [**](../../akka/japi/tuple/index.html "Permalink")  package [tuple](tuple/index.html)Definition Classes[japi](index.html)
- [Creator](Creator.html "A constructor/factory, takes no parameters but creates a new value of type T every call.")
- [Effect](Effect.html "An executable piece of code that takes no parameters and doesn't return any value.")
- [Function](Function.html "A Function interface.")
- [Function2](Function2.html "A Function interface.")
- [JAPI](JAPI.html)
- [JavaPartialFunction](JavaPartialFunction.html "Helper for implementing a *pure* partial function: it will possibly be invoked multiple times for a single “application”, because its only abstract method is used for both isDefinedAt() and apply(); the former is mapped to isCheck == true and the latter to isCheck == false for those cases where this is important to know.")
- [Option](Option.html "This class represents optional values.")
- [Pair](Pair.html "Java API Represents a pair (tuple) of two elements.")
- [Predicate](Predicate.html "Java API: Defines a criteria and determines whether the parameter meets this criteria.")
- [Procedure](Procedure.html "A Procedure is like a Function, but it doesn't produce a return value.")
- [Throwables](Throwables$.html "Helper class for determining whether a Throwable is fatal or not.")
- [Util](Util$.html "This class hold common utilities for Java")
[o](Option.html "See companion class")[akka](../index.html).[japi](index.html)

# [Option](Option.html "See companion class")[**](../../akka/japi/Option$.html "Permalink")

### Companion [class Option](Option.html "See companion class")

#### object Option

Source[JavaAPI.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/japi/JavaAPI.scala#L182)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Option
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/japi/Option$$Some.html "Permalink") final  case class [Some](Option$$Some.html "Class Some[A] represents existing values of type A.")\[A](v: A) extends [Option](Option.html)\[A] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableClass `Some[A]` represents existing values of type
`A`.
### Value Members

1. [**](../../akka/japi/Option$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/japi/Option$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/japi/Option$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/japi/Option$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/japi/Option$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/japi/Option$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/japi/Option$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/japi/Option$.html#fromScalaOption[T](scalaOption:Option[T]):akka.japi.Option[T] "Permalink")  def fromScalaOption\[T](scalaOption: [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]): [Option](Option.html)\[T]Converts a Scala Option to a Java Option
9. [**](../../akka/japi/Option$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/japi/Option$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/japi/Option$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../akka/japi/Option$.html#java2ScalaOption[A](o:akka.japi.Option[A]):Option[A] "Permalink") implicit  def java2ScalaOption\[A](o: [Option](Option.html)\[A]): [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]
13. [**](../../akka/japi/Option$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/japi/Option$.html#none[A]:akka.japi.Option[A] "Permalink")  def none\[A]: [Option](Option.html)\[A]`Option` factory that creates `None`
15. [**](../../akka/japi/Option$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/japi/Option$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/japi/Option$.html#option[A](v:A):akka.japi.Option[A] "Permalink")  def option\[A](v: A): [Option](Option.html)\[A]`Option` factory that creates `None` if
`v` is `null`, `Some(v)` otherwise.
18. [**](../../akka/japi/Option$.html#scala2JavaOption[A](o:Option[A]):akka.japi.Option[A] "Permalink") implicit  def scala2JavaOption\[A](o: [scala.Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[A]): [Option](Option.html)\[A]
19. [**](../../akka/japi/Option$.html#some[A](v:A):akka.japi.Option[A] "Permalink")  def some\[A](v: A): [Option](Option.html)\[A]`Option` factory that creates `Some`
20. [**](../../akka/japi/Option$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/japi/Option$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/japi/Option$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/japi/Option$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/japi/Option$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/japi/Option$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Creator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Effect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Function.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Function2.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/JAPI.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/JavaPartialFunction$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/JavaPartialFunction.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Option$$Some.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Option$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Option.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Pair$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Pair.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Predicate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Procedure.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Throwables$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Util$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/function/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/pf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/japi/tuple/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Option$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/japi/Option$.html)*