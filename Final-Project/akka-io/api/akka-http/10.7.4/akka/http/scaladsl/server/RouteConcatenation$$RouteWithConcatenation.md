---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteConcatenation.RouteWithConcatenation
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:09:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteConcatenation.RouteWithConcatenation
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteConcatenation.RouteWithConcatenation

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.RouteConcatenation.RouteWithConcatenation

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/RouteConcatenation$.html "Permalink")  object [RouteConcatenation](RouteConcatenation$.html) extends [RouteConcatenation](RouteConcatenation.html)Definition Classes[server](index.html)
- RouteWithConcatenation
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[RouteConcatenation](RouteConcatenation$.html)

# RouteWithConcatenation[**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html "Permalink")

### 

#### class RouteWithConcatenation extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[RouteConcatenation.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/RouteConcatenation.scala#L37)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RouteWithConcatenation
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
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#<init>(route:akka.http.scaladsl.server.Route):akka.http.scaladsl.server.RouteConcatenation.RouteWithConcatenation "Permalink")  new RouteWithConcatenation(route: [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]))
### Value Members

1. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RouteWithConcatenation toany2stringadd\[RouteWithConcatenation] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RouteWithConcatenation, B)ImplicitThis member is added by an implicit conversion from RouteWithConcatenation toArrowAssoc\[RouteWithConcatenation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RouteWithConcatenation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RouteWithConcatenationImplicitThis member is added by an implicit conversion from RouteWithConcatenation toEnsuring\[RouteWithConcatenation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RouteWithConcatenation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RouteWithConcatenationImplicitThis member is added by an implicit conversion from RouteWithConcatenation toEnsuring\[RouteWithConcatenation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RouteWithConcatenationImplicitThis member is added by an implicit conversion from RouteWithConcatenation toEnsuring\[RouteWithConcatenation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RouteWithConcatenationImplicitThis member is added by an implicit conversion from RouteWithConcatenation toEnsuring\[RouteWithConcatenation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#~(other:akka.http.scaladsl.server.Route):akka.http.scaladsl.server.Route "Permalink")  def \~(other: [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])): [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Returns a Route that chains two Routes.

Returns a Route that chains two Routes. If the first Route rejects the request the second route is given a
chance to act upon the request.
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RouteWithConcatenation toStringFormat\[RouteWithConcatenation] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RouteWithConcatenation, B)ImplicitThis member is added by an implicit conversion from RouteWithConcatenation toArrowAssoc\[RouteWithConcatenation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRouteWithConcatenation to any2stringadd\[RouteWithConcatenation]

### Inherited by implicit conversion StringFormat fromRouteWithConcatenation to StringFormat\[RouteWithConcatenation]

### Inherited by implicit conversion Ensuring fromRouteWithConcatenation to Ensuring\[RouteWithConcatenation]

### Inherited by implicit conversion ArrowAssoc fromRouteWithConcatenation to ArrowAssoc\[RouteWithConcatenation]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteConcatenation$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteConcatenation.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteConcatenation$$RouteWithConcatenation.html)*