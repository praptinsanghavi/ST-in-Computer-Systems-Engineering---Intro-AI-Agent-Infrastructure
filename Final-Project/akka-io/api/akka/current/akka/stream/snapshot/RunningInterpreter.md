---
description: Akka 2.10.17 - akka.stream.snapshot.RunningInterpreter
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:33:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/snapshot/RunningInterpreter.html
title: Akka 2.10.17 - akka.stream.snapshot.RunningInterpreter
---

# Akka 2.10.17 - akka.stream.snapshot.RunningInterpreter

> **Summary:** Akka 2.10.17 - akka.stream.snapshot.RunningInterpreter

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/snapshot/index.html "Permalink")  package [snapshot](index.html)Definition Classes[stream](../index.html)
- [ConnectionSnapshot](ConnectionSnapshot.html "Not for user extension")
- [HideImpl](HideImpl.html "INTERNAL API")
- [InterpreterSnapshot](InterpreterSnapshot.html "A snapshot of one interpreter - contains a set of logics running in the same underlying actor.")
- [LogicSnapshot](LogicSnapshot.html "Not for user extension")
- [MaterializerState](MaterializerState$.html "Debug utility to dump the running streams of a materializers in a structure describing the graph layout and \"waits-on\" relationships.")
- RunningInterpreter
- [StreamSnapshot](StreamSnapshot.html "A snapshot of one running stream")
- [UninitializedInterpreter](UninitializedInterpreter.html "A stream interpreter that was not yet initialized when the snapshot was taken")
t[akka](../../index.html).[stream](../index.html).[snapshot](index.html)

# RunningInterpreter[**](../../../akka/stream/snapshot/RunningInterpreter.html "Permalink")

### 

#### sealed  trait RunningInterpreter extends [InterpreterSnapshot](InterpreterSnapshot.html)

A stream interpreter that is running/has been started

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[MaterializerState.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/snapshot/MaterializerState.scala#L117)Linear Supertypes[InterpreterSnapshot](InterpreterSnapshot.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RunningInterpreter
2. InterpreterSnapshot
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/stream/snapshot/RunningInterpreter.html#connections:Seq[akka.stream.snapshot.ConnectionSnapshot] "Permalink") abstract  def connections: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ConnectionSnapshot](ConnectionSnapshot.html)]Each connection between logics in the interpreter
2. [**](../../../akka/stream/snapshot/RunningInterpreter.html#logics:Seq[akka.stream.snapshot.LogicSnapshot] "Permalink") abstract  def logics: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[LogicSnapshot](LogicSnapshot.html)]Each of the materialized graph stage logics running inside the interpreter

Each of the materialized graph stage logics running inside the interpreter

Definition ClassesRunningInterpreter → [InterpreterSnapshot](InterpreterSnapshot.html)
3. [**](../../../akka/stream/snapshot/RunningInterpreter.html#runningLogicsCount:Int "Permalink") abstract  def runningLogicsCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Total number of non\-stopped logics in the interpreter
4. [**](../../../akka/stream/snapshot/RunningInterpreter.html#stoppedLogics:Seq[akka.stream.snapshot.LogicSnapshot] "Permalink") abstract  def stoppedLogics: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[LogicSnapshot](LogicSnapshot.html)]All logics that has completed and is no longer executing
### Concrete Value Members

1. [**](../../../akka/stream/snapshot/RunningInterpreter.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/snapshot/RunningInterpreter.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/snapshot/RunningInterpreter.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from RunningInterpreter toany2stringadd\[RunningInterpreter] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/snapshot/RunningInterpreter.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (RunningInterpreter, B)ImplicitThis member is added by an implicit conversion from RunningInterpreter toArrowAssoc\[RunningInterpreter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/snapshot/RunningInterpreter.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/snapshot/RunningInterpreter.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/snapshot/RunningInterpreter.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/snapshot/RunningInterpreter.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (RunningInterpreter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RunningInterpreterImplicitThis member is added by an implicit conversion from RunningInterpreter toEnsuring\[RunningInterpreter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/snapshot/RunningInterpreter.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (RunningInterpreter) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RunningInterpreterImplicitThis member is added by an implicit conversion from RunningInterpreter toEnsuring\[RunningInterpreter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/snapshot/RunningInterpreter.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): RunningInterpreterImplicitThis member is added by an implicit conversion from RunningInterpreter toEnsuring\[RunningInterpreter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/snapshot/RunningInterpreter.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): RunningInterpreterImplicitThis member is added by an implicit conversion from RunningInterpreter toEnsuring\[RunningInterpreter] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/snapshot/RunningInterpreter.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/snapshot/RunningInterpreter.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/stream/snapshot/RunningInterpreter.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/snapshot/RunningInterpreter.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/stream/snapshot/RunningInterpreter.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/stream/snapshot/RunningInterpreter.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/stream/snapshot/RunningInterpreter.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/snapshot/RunningInterpreter.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/stream/snapshot/RunningInterpreter.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/stream/snapshot/RunningInterpreter.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/stream/snapshot/RunningInterpreter.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/stream/snapshot/RunningInterpreter.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/stream/snapshot/RunningInterpreter.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/snapshot/RunningInterpreter.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/snapshot/RunningInterpreter.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from RunningInterpreter toStringFormat\[RunningInterpreter] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/snapshot/RunningInterpreter.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (RunningInterpreter, B)ImplicitThis member is added by an implicit conversion from RunningInterpreter toArrowAssoc\[RunningInterpreter] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [InterpreterSnapshot](InterpreterSnapshot.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromRunningInterpreter to any2stringadd\[RunningInterpreter]

### Inherited by implicit conversion StringFormat fromRunningInterpreter to StringFormat\[RunningInterpreter]

### Inherited by implicit conversion Ensuring fromRunningInterpreter to Ensuring\[RunningInterpreter]

### Inherited by implicit conversion ArrowAssoc fromRunningInterpreter to ArrowAssoc\[RunningInterpreter]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/snapshot/ConnectionSnapshot$.html
- https://doc.akka.io/api/akka/current/akka/stream/snapshot/ConnectionSnapshot.html
- https://doc.akka.io/api/akka/current/akka/stream/snapshot/HideImpl.html
- https://doc.akka.io/api/akka/current/akka/stream/snapshot/InterpreterSnapshot.html
- https://doc.akka.io/api/akka/current/akka/stream/snapshot/LogicSnapshot.html
- https://doc.akka.io/api/akka/current/akka/stream/snapshot/MaterializerState$.html
- https://doc.akka.io/api/akka/current/akka/stream/snapshot/RunningInterpreter.html
- https://doc.akka.io/api/akka/current/akka/stream/snapshot/StreamSnapshot.html
- https://doc.akka.io/api/akka/current/akka/stream/snapshot/UninitializedInterpreter.html
- https://doc.akka.io/api/akka/current/akka/stream/snapshot/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/snapshot/RunningInterpreter.html](https://doc.akka.io/api/akka/current/akka/stream/snapshot/RunningInterpreter.html)*