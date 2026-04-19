---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.Tuple
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/Tuple$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.Tuple
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.Tuple

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.util.Tuple

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package [util](index.html)Definition Classes[server](../index.html)
- [ApplyConverter](ApplyConverter.html "ApplyConverter allows generic conversion of functions of type (T1, T2, ...) => Route to (TupleX(T1, T2, ...)) => Route.")
- [BinaryPolyFunc](BinaryPolyFunc.html "Allows the definition of binary poly-functions (e.g.")
- [ClassMagnet](ClassMagnet.html "A magnet that wraps a ClassTag")
- [ConstructFromTuple](ConstructFromTuple.html "Constructor for instances of type R which can be created from a tuple of type T.")
- [Tuple](Tuple.html "Phantom type providing implicit evidence that a given type is a Tuple or Unit.")
- [TupleOps](TupleOps.html)
- [Tupler](Tupler.html "Provides a way to convert a value into an Tuple.")
[o](Tuple.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[util](index.html)

# [Tuple](Tuple.html "See companion trait")[**](../../../../../akka/http/scaladsl/server/util/Tuple$.html "Permalink")

### Companion [trait Tuple](Tuple.html "See companion trait")

#### object Tuple

Source[Tuple.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/util/Tuple.scala#L12)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Tuple
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forNothing[A]:akka.http.scaladsl.server.util.Tuple[Nothing] "Permalink") implicit  def forNothing\[A]: [Tuple](Tuple.html)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]
9. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple1[A]:akka.http.scaladsl.server.util.Tuple[(A,)] "Permalink") implicit  def forTuple1\[A]: [Tuple](Tuple.html)\[(A)]
10. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple10[A,B,C,D,E,F,G,H,I,J]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J)] "Permalink") implicit  def forTuple10\[A, B, C, D, E, F, G, H, I, J]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J)]
11. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple11[A,B,C,D,E,F,G,H,I,J,K]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K)] "Permalink") implicit  def forTuple11\[A, B, C, D, E, F, G, H, I, J, K]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K)]
12. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple12[A,B,C,D,E,F,G,H,I,J,K,L]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K,L)] "Permalink") implicit  def forTuple12\[A, B, C, D, E, F, G, H, I, J, K, L]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K, L)]
13. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple13[A,B,C,D,E,F,G,H,I,J,K,L,M]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K,L,M)] "Permalink") implicit  def forTuple13\[A, B, C, D, E, F, G, H, I, J, K, L, M]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K, L, M)]
14. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple14[A,B,C,D,E,F,G,H,I,J,K,L,M,N]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K,L,M,N)] "Permalink") implicit  def forTuple14\[A, B, C, D, E, F, G, H, I, J, K, L, M, N]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K, L, M, N)]
15. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple15[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O)] "Permalink") implicit  def forTuple15\[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O)]
16. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple16[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P)] "Permalink") implicit  def forTuple16\[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P)]
17. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple17[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q)] "Permalink") implicit  def forTuple17\[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q)]
18. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple18[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R)] "Permalink") implicit  def forTuple18\[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R)]
19. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple19[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S)] "Permalink") implicit  def forTuple19\[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S)]
20. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple2[A,B]:akka.http.scaladsl.server.util.Tuple[(A,B)] "Permalink") implicit  def forTuple2\[A, B]: [Tuple](Tuple.html)\[(A, B)]
21. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple20[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T)] "Permalink") implicit  def forTuple20\[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T)]
22. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple21[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U)] "Permalink") implicit  def forTuple21\[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U)]
23. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple22[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V)] "Permalink") implicit  def forTuple22\[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V)]
24. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple3[A,B,C]:akka.http.scaladsl.server.util.Tuple[(A,B,C)] "Permalink") implicit  def forTuple3\[A, B, C]: [Tuple](Tuple.html)\[(A, B, C)]
25. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple4[A,B,C,D]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D)] "Permalink") implicit  def forTuple4\[A, B, C, D]: [Tuple](Tuple.html)\[(A, B, C, D)]
26. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple5[A,B,C,D,E]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E)] "Permalink") implicit  def forTuple5\[A, B, C, D, E]: [Tuple](Tuple.html)\[(A, B, C, D, E)]
27. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple6[A,B,C,D,E,F]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F)] "Permalink") implicit  def forTuple6\[A, B, C, D, E, F]: [Tuple](Tuple.html)\[(A, B, C, D, E, F)]
28. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple7[A,B,C,D,E,F,G]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G)] "Permalink") implicit  def forTuple7\[A, B, C, D, E, F, G]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G)]
29. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple8[A,B,C,D,E,F,G,H]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H)] "Permalink") implicit  def forTuple8\[A, B, C, D, E, F, G, H]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H)]
30. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forTuple9[A,B,C,D,E,F,G,H,I]:akka.http.scaladsl.server.util.Tuple[(A,B,C,D,E,F,G,H,I)] "Permalink") implicit  def forTuple9\[A, B, C, D, E, F, G, H, I]: [Tuple](Tuple.html)\[(A, B, C, D, E, F, G, H, I)]
31. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#forUnit[A]:akka.http.scaladsl.server.util.Tuple[Unit] "Permalink") implicit  def forUnit\[A]: [Tuple](Tuple.html)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]
32. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
35. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
36. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
39. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
40. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
41. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
42. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
43. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#yes[T]:akka.http.scaladsl.server.util.Tuple[T] "Permalink")  def yes\[T]: [Tuple](Tuple.html)\[T]Used to provide "is\-Tuple" evidence where we know that a given value must be a tuple.
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ApplyConverter.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ClassMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ClassMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ConstructFromTuple$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/ConstructFromTuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/TupleOps.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tupler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/util/Tuple$.html)*