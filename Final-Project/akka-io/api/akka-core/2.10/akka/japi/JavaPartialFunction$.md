---
description: Akka 2.10.17 - akka.japi.JavaPartialFunction
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:22:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/JavaPartialFunction$.html
title: Akka 2.10.17 - akka.japi.JavaPartialFunction
---

# Akka 2.10.17 - akka.japi.JavaPartialFunction

> **Summary:** Akka 2.10.17 - akka.japi.JavaPartialFunction

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
[o](JavaPartialFunction.html "See companion class")[akka](../index.html).[japi](index.html)

# [JavaPartialFunction](JavaPartialFunction.html "See companion class")[**](../../akka/japi/JavaPartialFunction$.html "Permalink")

### Companion [class JavaPartialFunction](JavaPartialFunction.html "See companion class")

#### object JavaPartialFunction

Source[JavaAPI.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/japi/JavaAPI.scala#L103)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. JavaPartialFunction
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/japi/JavaPartialFunction$$NoMatchException.html "Permalink") sealed abstract  class [NoMatchException](JavaPartialFunction$$NoMatchException.html) extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)
### Value Members

1. [**](../../akka/japi/JavaPartialFunction$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/japi/JavaPartialFunction$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/japi/JavaPartialFunction$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/japi/JavaPartialFunction$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/japi/JavaPartialFunction$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/japi/JavaPartialFunction$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/japi/JavaPartialFunction$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/japi/JavaPartialFunction$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/japi/JavaPartialFunction$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/japi/JavaPartialFunction$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/japi/JavaPartialFunction$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/japi/JavaPartialFunction$.html#noMatch():RuntimeException "Permalink") final  def noMatch(): RuntimeException
13. [**](../../akka/japi/JavaPartialFunction$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/japi/JavaPartialFunction$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/japi/JavaPartialFunction$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../akka/japi/JavaPartialFunction$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../akka/japi/JavaPartialFunction$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/japi/JavaPartialFunction$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../akka/japi/JavaPartialFunction$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../akka/japi/JavaPartialFunction$$NoMatch$.html "Permalink")  case object [NoMatch](JavaPartialFunction$$NoMatch$.html) extends [NoMatchException](JavaPartialFunction$$NoMatchException.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../akka/japi/JavaPartialFunction$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Creator.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Effect.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Function.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Function2.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/JAPI.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/JavaPartialFunction$$NoMatch$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/JavaPartialFunction$$NoMatchException.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/JavaPartialFunction$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/JavaPartialFunction.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Option$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Option.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Pair$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Pair.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Predicate.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Procedure.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Throwables$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/Util$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/function/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/japi/JavaPartialFunction$.html](https://doc.akka.io/api/akka-core/2.10/akka/japi/JavaPartialFunction$.html)*