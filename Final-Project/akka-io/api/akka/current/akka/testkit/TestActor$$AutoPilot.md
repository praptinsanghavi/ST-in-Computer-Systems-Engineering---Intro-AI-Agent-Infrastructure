---
description: Akka 2.10.17 - akka.testkit.TestActor.AutoPilot
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:36:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestActor$$AutoPilot.html
title: Akka 2.10.17 - akka.testkit.TestActor.AutoPilot
---

# Akka 2.10.17 - akka.testkit.TestActor.AutoPilot

> **Summary:** Akka 2.10.17 - akka.testkit.TestActor.AutoPilot

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/TestActor$.html "Permalink")  object [TestActor](TestActor$.html)Definition Classes[testkit](index.html)
- AutoPilot
- [KeepRunning](TestActor$$KeepRunning$.html)
- [Message](TestActor$$Message.html)
- [NoAutoPilot](TestActor$$NoAutoPilot$.html)
- [NullMessage](TestActor$$NullMessage$.html)
- [RealMessage](TestActor$$RealMessage.html)
- [SetAutoPilot](TestActor$$SetAutoPilot.html)
- [SetIgnore](TestActor$$SetIgnore.html)
- [Spawn](TestActor$$Spawn.html)
- [UnWatch](TestActor$$UnWatch.html)
- [Watch](TestActor$$Watch.html)
c[akka](../index.html).[testkit](index.html).[TestActor](TestActor$.html)

# AutoPilot[**](../../akka/testkit/TestActor$$AutoPilot.html "Permalink")

### 

#### abstract  class AutoPilot extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[TestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestKit.scala#L29)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[KeepRunning](TestActor$$KeepRunning$.html), [NoAutoPilot](TestActor$$NoAutoPilot$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. AutoPilot
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

1. [**](../../akka/testkit/TestActor$$AutoPilot.html#<init>():akka.testkit.TestActor.AutoPilot "Permalink")  new AutoPilot()
### Abstract Value Members

1. [**](../../akka/testkit/TestActor$$AutoPilot.html#run(sender:akka.actor.ActorRef,msg:Any):akka.testkit.TestActor.AutoPilot "Permalink") abstract  def run(sender: [ActorRef](../actor/ActorRef.html), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AutoPilot
### Concrete Value Members

1. [**](../../akka/testkit/TestActor$$AutoPilot.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestActor$$AutoPilot.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestActor$$AutoPilot.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from AutoPilot toany2stringadd\[AutoPilot] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/TestActor$$AutoPilot.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (AutoPilot, B)ImplicitThis member is added by an implicit conversion from AutoPilot toArrowAssoc\[AutoPilot] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/TestActor$$AutoPilot.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/TestActor$$AutoPilot.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/testkit/TestActor$$AutoPilot.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/testkit/TestActor$$AutoPilot.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (AutoPilot) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AutoPilotImplicitThis member is added by an implicit conversion from AutoPilot toEnsuring\[AutoPilot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/testkit/TestActor$$AutoPilot.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (AutoPilot) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AutoPilotImplicitThis member is added by an implicit conversion from AutoPilot toEnsuring\[AutoPilot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/testkit/TestActor$$AutoPilot.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AutoPilotImplicitThis member is added by an implicit conversion from AutoPilot toEnsuring\[AutoPilot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/testkit/TestActor$$AutoPilot.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AutoPilotImplicitThis member is added by an implicit conversion from AutoPilot toEnsuring\[AutoPilot] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/testkit/TestActor$$AutoPilot.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/testkit/TestActor$$AutoPilot.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/testkit/TestActor$$AutoPilot.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/testkit/TestActor$$AutoPilot.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/testkit/TestActor$$AutoPilot.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/testkit/TestActor$$AutoPilot.html#keepRunning:akka.testkit.TestActor.AutoPilot "Permalink")  def keepRunning: AutoPilot
18. [**](../../akka/testkit/TestActor$$AutoPilot.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/testkit/TestActor$$AutoPilot.html#noAutoPilot:akka.testkit.TestActor.AutoPilot "Permalink")  def noAutoPilot: AutoPilot
20. [**](../../akka/testkit/TestActor$$AutoPilot.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/testkit/TestActor$$AutoPilot.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../akka/testkit/TestActor$$AutoPilot.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/testkit/TestActor$$AutoPilot.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../akka/testkit/TestActor$$AutoPilot.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/testkit/TestActor$$AutoPilot.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/testkit/TestActor$$AutoPilot.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/TestActor$$AutoPilot.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/TestActor$$AutoPilot.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from AutoPilot toStringFormat\[AutoPilot] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/TestActor$$AutoPilot.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (AutoPilot, B)ImplicitThis member is added by an implicit conversion from AutoPilot toArrowAssoc\[AutoPilot] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAutoPilot to any2stringadd\[AutoPilot]

### Inherited by implicit conversion StringFormat fromAutoPilot to StringFormat\[AutoPilot]

### Inherited by implicit conversion Ensuring fromAutoPilot to Ensuring\[AutoPilot]

### Inherited by implicit conversion ArrowAssoc fromAutoPilot to ArrowAssoc\[AutoPilot]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$AutoPilot.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$KeepRunning$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$Message.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$NoAutoPilot$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$NullMessage$.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$RealMessage.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$SetAutoPilot.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$SetIgnore.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$Spawn.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$UnWatch.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$Watch.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$.html
- https://doc.akka.io/api/akka/current/akka/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$AutoPilot.html](https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$AutoPilot.html)*