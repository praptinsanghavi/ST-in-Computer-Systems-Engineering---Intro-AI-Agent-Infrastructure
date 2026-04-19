---
description: Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager.State
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:26:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/singleton/ClusterSingletonManager$$State.html
title: Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager.State
---

# Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager.State

> **Summary:** Akka 2.10.17 - akka.cluster.singleton.ClusterSingletonManager.State

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/singleton/index.html "Permalink")  package [singleton](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/singleton/ClusterSingletonManager$.html "Permalink")  object [ClusterSingletonManager](ClusterSingletonManager$.html)Definition Classes[singleton](index.html)
- [Data](ClusterSingletonManager$$Data.html "INTERNAL API public due to the with FSM type parameters")
- State
t[akka](../../index.html).[cluster](../index.html).[singleton](index.html).[ClusterSingletonManager](ClusterSingletonManager$.html)

# State[**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html "Permalink")

### 

#### sealed  trait State extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

INTERNAL API
public due to the `with FSM` type parameters

Source[ClusterSingletonManager.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-tools/src/main/scala/akka/cluster/singleton/ClusterSingletonManager.scala#L191)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. State
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

1. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from State toany2stringadd\[State] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (State, B)ImplicitThis member is added by an implicit conversion from State toArrowAssoc\[State] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (State) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StateImplicitThis member is added by an implicit conversion from State toEnsuring\[State] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (State) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StateImplicitThis member is added by an implicit conversion from State toEnsuring\[State] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StateImplicitThis member is added by an implicit conversion from State toEnsuring\[State] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StateImplicitThis member is added by an implicit conversion from State toEnsuring\[State] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from State toStringFormat\[State] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/singleton/ClusterSingletonManager$$State.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (State, B)ImplicitThis member is added by an implicit conversion from State toArrowAssoc\[State] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromState to any2stringadd\[State]

### Inherited by implicit conversion StringFormat fromState to StringFormat\[State]

### Inherited by implicit conversion Ensuring fromState to Ensuring\[State]

### Inherited by implicit conversion ArrowAssoc fromState to ArrowAssoc\[State]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$$Data.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$$State.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$$State.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManager$$State.html)*