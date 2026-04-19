---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.RejectionHandler.Builder
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:14:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/RejectionHandler$$Builder.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.RejectionHandler.Builder
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.RejectionHandler.Builder

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.RejectionHandler.Builder

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/RejectionHandler$.html "Permalink")  object [RejectionHandler](RejectionHandler$.html)Definition Classes[server](index.html)
- Builder
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[RejectionHandler](RejectionHandler$.html)

# Builder[**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html "Permalink")

### 

#### final  class Builder extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[RejectionHandler.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/RejectionHandler.scala#L67)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Builder
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
### Value Members

1. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Builder toany2stringadd\[Builder] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Builder, B)ImplicitThis member is added by an implicit conversion from Builder toArrowAssoc\[Builder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Builder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BuilderImplicitThis member is added by an implicit conversion from Builder toEnsuring\[Builder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Builder) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BuilderImplicitThis member is added by an implicit conversion from Builder toEnsuring\[Builder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): BuilderImplicitThis member is added by an implicit conversion from Builder toEnsuring\[Builder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): BuilderImplicitThis member is added by an implicit conversion from Builder toEnsuring\[Builder] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#handle(pf:PartialFunction[akka.http.scaladsl.server.Rejection,akka.http.scaladsl.server.Route]):Builder.this.type "Permalink")  def handle(pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Rejection](Rejection.html), [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])]): Builder.this.typeHandles a single [Rejection](Rejection.html) with the given partial function.
16. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#handleAll[T<:akka.http.scaladsl.server.Rejection](f:Seq[T]=>akka.http.scaladsl.server.Route)(implicitevidence$1:scala.reflect.ClassTag[T]):Builder.this.type "Permalink")  def handleAll\[T \<: [Rejection](Rejection.html)](f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[T]) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]))(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): Builder.this.typeHandles several Rejections of the same type at the same time.

Handles several Rejections of the same type at the same time.
The seq passed to the given function is guaranteed to be non\-empty.
17. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#handleCircuitBreakerOpenRejection(handler:akka.http.scaladsl.server.CircuitBreakerOpenRejection=>akka.http.scaladsl.server.Route):Builder.this.type "Permalink")  def handleCircuitBreakerOpenRejection(handler: ([CircuitBreakerOpenRejection](CircuitBreakerOpenRejection.html)) \=\> [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])): Builder.this.typeConvenience method for handling rejections created by the onCompleteWithBreaker directive.

Convenience method for handling rejections created by the onCompleteWithBreaker directive.
Signals that the request was rejected because the supplied circuit breaker is open and requests are failing fast.

Use to customise the error response being written instead of the default ServiceUnavailable response.
18. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#handleNotFound(route:akka.http.scaladsl.server.Route):Builder.this.type "Permalink")  def handleNotFound(route: [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])): Builder.this.typeHandles the special "not found" case using the given [Route](index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult]).
19. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#result():akka.http.scaladsl.server.RejectionHandler "Permalink")  def result(): [RejectionHandler](RejectionHandler.html)
25. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Builder toStringFormat\[Builder] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/server/RejectionHandler$$Builder.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Builder, B)ImplicitThis member is added by an implicit conversion from Builder toArrowAssoc\[Builder] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromBuilder to any2stringadd\[Builder]

### Inherited by implicit conversion StringFormat fromBuilder to StringFormat\[Builder]

### Inherited by implicit conversion Ensuring fromBuilder to Ensuring\[Builder]

### Inherited by implicit conversion ArrowAssoc fromBuilder to ArrowAssoc\[Builder]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/CircuitBreakerOpenRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler$$Builder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler$$Builder.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler$$Builder.html)*