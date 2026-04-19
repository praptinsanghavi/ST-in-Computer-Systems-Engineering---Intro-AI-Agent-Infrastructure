---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteResult.Complete
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RouteResult$$Complete.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteResult.Complete
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteResult.Complete

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteResult.Complete

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/RouteResult$.html "Permalink")  object [RouteResult](RouteResult$.html) extends [LowerPriorityRouteResultImplicits](LowerPriorityRouteResultImplicits.html)Definition Classes[server](index.html)
- Complete
- [Rejected](RouteResult$$Rejected.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[RouteResult](RouteResult$.html)

# Complete[**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html "Permalink")

### 

#### final  case class Complete(response: [HttpResponse](../model/HttpResponse.html)) extends [javadsl.server.Complete](../../javadsl/server/Complete.html) with [RouteResult](RouteResult.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[RouteResult.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/RouteResult.scala#L28)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [RouteResult](RouteResult.html), [javadsl.server.Complete](../../javadsl/server/Complete.html), [javadsl.server.RouteResult](../../javadsl/server/RouteResult.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Complete
2. Serializable
3. Product
4. Equals
5. RouteResult
6. Complete
7. RouteResult
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

1. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#<init>(response:akka.http.scaladsl.model.HttpResponse):akka.http.scaladsl.server.RouteResult.Complete "Permalink")  new Complete(response: [HttpResponse](../model/HttpResponse.html))
### Value Members

1. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Complete toany2stringadd\[Complete] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Complete, B)ImplicitThis member is added by an implicit conversion from Complete toArrowAssoc\[Complete] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Complete) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CompleteImplicitThis member is added by an implicit conversion from Complete toEnsuring\[Complete] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Complete) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CompleteImplicitThis member is added by an implicit conversion from Complete toEnsuring\[Complete] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): CompleteImplicitThis member is added by an implicit conversion from Complete toEnsuring\[Complete] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): CompleteImplicitThis member is added by an implicit conversion from Complete toEnsuring\[Complete] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#getResponse:akka.http.scaladsl.model.HttpResponse "Permalink")  def getResponse: [HttpResponse](../model/HttpResponse.html)Definition ClassesComplete → [Complete](../../javadsl/server/Complete.html)
15. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#response:akka.http.scaladsl.model.HttpResponse "Permalink")  val response: [HttpResponse](../model/HttpResponse.html)
21. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Complete toStringFormat\[Complete] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/RouteResult$$Complete.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Complete, B)ImplicitThis member is added by an implicit conversion from Complete toArrowAssoc\[Complete] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [RouteResult](RouteResult.html)

### Inherited from [javadsl.server.Complete](../../javadsl/server/Complete.html)

### Inherited from [javadsl.server.RouteResult](../../javadsl/server/RouteResult.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromComplete to any2stringadd\[Complete]

### Inherited by implicit conversion StringFormat fromComplete to StringFormat\[Complete]

### Inherited by implicit conversion Ensuring fromComplete to Ensuring\[Complete]

### Inherited by implicit conversion ArrowAssoc fromComplete to ArrowAssoc\[Complete]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/Complete.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/LowerPriorityRouteResultImplicits.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult$$Complete.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult$$Rejected.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult$$Complete.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult$$Complete.html)*