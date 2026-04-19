---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Lift
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:14:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/PathMatcher$$Lift$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Lift
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Lift

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.PathMatcher.Lift

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/PathMatcher$.html "Permalink")  object [PathMatcher](PathMatcher$.html) extends [ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html)Definition Classes[server](index.html)
- [EnhancedPathMatcher](PathMatcher$$EnhancedPathMatcher.html)
- [Lift](PathMatcher$$Lift.html)
- [LowLevelLiftImplicits](PathMatcher$$LowLevelLiftImplicits.html)
- [Matched](PathMatcher$$Matched.html)
- [Matching](PathMatcher$$Matching.html)
- [PathMatcher1Ops](PathMatcher$$PathMatcher1Ops.html)
- [Unmatched](PathMatcher$$Unmatched$.html)
[o](PathMatcher$$Lift.html "See companion trait")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[server](index.html).[PathMatcher](PathMatcher$.html)

# [Lift](PathMatcher$$Lift.html "See companion trait")[**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html "Permalink")

### Companion [trait Lift](PathMatcher$$Lift.html "See companion trait")

#### object Lift extends [LowLevelLiftImplicits](PathMatcher$$LowLevelLiftImplicits.html)

Source[PathMatcher.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/PathMatcher.scala#L190)Linear Supertypes[LowLevelLiftImplicits](PathMatcher$$LowLevelLiftImplicits.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Lift
2. LowLevelLiftImplicits
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$$MOps.html "Permalink")  trait [MOps](PathMatcher$$Lift$$MOps.html)\[M\[\+\_]] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#default[T,M[+_]](implicitmops:akka.http.scaladsl.server.PathMatcher.Lift.MOps[M]):akka.http.scaladsl.server.PathMatcher.Lift[T,M]{typeOut=(M[T],)} "Permalink") implicit  def default\[T, M\[\+\_]](implicit mops: [MOps](PathMatcher$$Lift$$MOps.html)\[M]): [Lift](PathMatcher$$Lift.html)\[T, M] { type Out \= (M\[T],) }Definition Classes[LowLevelLiftImplicits](PathMatcher$$LowLevelLiftImplicits.html)
7. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#liftSingleElement[A,M[+_]](implicitmops:akka.http.scaladsl.server.PathMatcher.Lift.MOps[M]):akka.http.scaladsl.server.PathMatcher.Lift[(A,),M]{typeOut=(M[A],)} "Permalink") implicit  def liftSingleElement\[A, M\[\+\_]](implicit mops: [MOps](PathMatcher$$Lift$$MOps.html)\[M]): [Lift](PathMatcher$$Lift.html)\[(A), M] { type Out \= (M\[A],) }
13. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#liftUnit[M[+_]]:akka.http.scaladsl.server.PathMatcher.Lift[Unit,M]{typeOut=Unit} "Permalink") implicit  def liftUnit\[M\[\+\_]]: [Lift](PathMatcher$$Lift.html)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit), M] { type Out \= Unit }
14. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$$MOps$.html "Permalink")  object [MOps](PathMatcher$$Lift$$MOps$.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/server/PathMatcher$$Lift$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [LowLevelLiftImplicits](PathMatcher$$LowLevelLiftImplicits.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$EnhancedPathMatcher.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift$$MOps$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift$$MOps.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$LowLevelLiftImplicits.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matched$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matched.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Matching.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$PathMatcher1Ops.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Unmatched$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher$$Lift$.html)*