---
description: Akka 2.10.17 - akka.actor.Actor.ignoringBehavior
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:41:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/Actor$$ignoringBehavior$.html
title: Akka 2.10.17 - akka.actor.Actor.ignoringBehavior
---

# Akka 2.10.17 - akka.actor.Actor.ignoringBehavior

> **Summary:** Akka 2.10.17 - akka.actor.Actor.ignoringBehavior

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/Actor$.html "Permalink")  object [Actor](Actor$.html)Definition Classes[actor](index.html)
- [emptyBehavior](Actor$$emptyBehavior$.html "emptyBehavior is a Receive-expression that matches no messages at all, ever.")
- ignoringBehavior
o[akka](../index.html).[actor](index.html).[Actor](Actor$.html)

# ignoringBehavior[**](../../akka/actor/Actor$$ignoringBehavior$.html "Permalink")

### 

#### object ignoringBehavior extends [Receive](Actor$.html#Receive=PartialFunction[Any,Unit])

ignoringBehavior is a Receive\-expression that consumes and ignores all messages.

Annotations@SerialVersionUID() Source[Actor.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/Actor.scala#L402)Linear Supertypes[PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)], ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ignoringBehavior
2. PartialFunction
3. Function1
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/actor/Actor$$ignoringBehavior$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/Actor$$ignoringBehavior$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/Actor$$ignoringBehavior$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/actor/Actor$$ignoringBehavior$.html#andThen[C](k:PartialFunction[B,C]):PartialFunction[A,C] "Permalink")  def andThen\[C](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit), C]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), C]Definition ClassesPartialFunction
5. [**](../../akka/actor/Actor$$ignoringBehavior$.html#andThen[C](k:B=>C):PartialFunction[A,C] "Permalink")  def andThen\[C](k: ([Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)) \=\> C): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), C]Definition ClassesPartialFunction → Function1
6. [**](../../akka/actor/Actor$$ignoringBehavior$.html#apply(x:Any):Unit "Permalink")  def apply(x: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesignoringBehavior → Function1
7. [**](../../akka/actor/Actor$$ignoringBehavior$.html#applyOrElse[A1<:A,B1>:B](x:A1,default:A1=>B1):B1 "Permalink")  def applyOrElse\[A1 \<: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), B1 \>: [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)](x: A1, default: (A1) \=\> B1): B1Definition ClassesPartialFunction
8. [**](../../akka/actor/Actor$$ignoringBehavior$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/actor/Actor$$ignoringBehavior$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/actor/Actor$$ignoringBehavior$.html#compose[R](k:PartialFunction[R,A]):PartialFunction[R,B] "Permalink")  def compose\[R](k: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[R, [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition ClassesPartialFunction
11. [**](../../akka/actor/Actor$$ignoringBehavior$.html#compose[A](g:A=>T1):A=>R "Permalink")  def compose\[A](g: (A) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): (A) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesFunction1Annotations@unspecialized()
12. [**](../../akka/actor/Actor$$ignoringBehavior$.html#elementWise:PartialFunction.ElementWiseExtractor[A,B] "Permalink")  def elementWise: ElementWiseExtractor\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition ClassesPartialFunction
13. [**](../../akka/actor/Actor$$ignoringBehavior$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/actor/Actor$$ignoringBehavior$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../akka/actor/Actor$$ignoringBehavior$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/actor/Actor$$ignoringBehavior$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/actor/Actor$$ignoringBehavior$.html#isDefinedAt(x:Any):Boolean "Permalink")  def isDefinedAt(x: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesignoringBehavior → PartialFunction
18. [**](../../akka/actor/Actor$$ignoringBehavior$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../akka/actor/Actor$$ignoringBehavior$.html#lift:A=>Option[B] "Permalink")  def lift: ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition ClassesPartialFunction
20. [**](../../akka/actor/Actor$$ignoringBehavior$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../akka/actor/Actor$$ignoringBehavior$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/actor/Actor$$ignoringBehavior$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../akka/actor/Actor$$ignoringBehavior$.html#orElse[A1<:A,B1>:B](that:PartialFunction[A1,B1]):PartialFunction[A1,B1] "Permalink")  def orElse\[A1 \<: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), B1 \>: [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)](that: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]): [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[A1, B1]Definition ClassesPartialFunction
24. [**](../../akka/actor/Actor$$ignoringBehavior$.html#runWith[U](action:B=>U):A=>Boolean "Permalink")  def runWith\[U](action: ([Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)) \=\> U): ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesPartialFunction
25. [**](../../akka/actor/Actor$$ignoringBehavior$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/actor/Actor$$ignoringBehavior$.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction1 → AnyRef → Any
27. [**](../../akka/actor/Actor$$ignoringBehavior$.html#unapply(a:A):Option[B] "Permalink")  def unapply(a: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Definition ClassesPartialFunction
28. [**](../../akka/actor/Actor$$ignoringBehavior$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../akka/actor/Actor$$ignoringBehavior$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../akka/actor/Actor$$ignoringBehavior$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/actor/Actor$$ignoringBehavior$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]

### Inherited from ([Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor$$emptyBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor$$ignoringBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor$$ignoringBehavior$.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor$$ignoringBehavior$.html)*