---
description: Akka 2.10.17 - akka.testkit.TestActor.Message
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:39:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestActor$$Message.html
title: Akka 2.10.17 - akka.testkit.TestActor.Message
---

# Akka 2.10.17 - akka.testkit.TestActor.Message

> **Summary:** Akka 2.10.17 - akka.testkit.TestActor.Message

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/TestActor$.html "Permalink")  object [TestActor](TestActor$.html)Definition Classes[testkit](index.html)
- [AutoPilot](TestActor$$AutoPilot.html)
- [KeepRunning](TestActor$$KeepRunning$.html)
- Message
- [NoAutoPilot](TestActor$$NoAutoPilot$.html)
- [NullMessage](TestActor$$NullMessage$.html)
- [RealMessage](TestActor$$RealMessage.html)
- [SetAutoPilot](TestActor$$SetAutoPilot.html)
- [SetIgnore](TestActor$$SetIgnore.html)
- [Spawn](TestActor$$Spawn.html)
- [UnWatch](TestActor$$UnWatch.html)
- [Watch](TestActor$$Watch.html)
t[akka](../index.html).[testkit](index.html).[TestActor](TestActor$.html)

# Message[**](../../akka/testkit/TestActor$$Message.html "Permalink")

### 

#### trait Message extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[TestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestKit.scala#L55)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[NullMessage](TestActor$$NullMessage$.html), [RealMessage](TestActor$$RealMessage.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Message
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
### Abstract Value Members

1. [**](../../akka/testkit/TestActor$$Message.html#msg:AnyRef "Permalink") abstract  def msg: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../akka/testkit/TestActor$$Message.html#sender:akka.actor.ActorRef "Permalink") abstract  def sender: [ActorRef](../actor/ActorRef.html)
### Concrete Value Members

1. [**](../../akka/testkit/TestActor$$Message.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestActor$$Message.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestActor$$Message.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Message toany2stringadd\[Message] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/TestActor$$Message.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Message, B)ImplicitThis member is added by an implicit conversion from Message toArrowAssoc\[Message] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/TestActor$$Message.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/TestActor$$Message.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/testkit/TestActor$$Message.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/testkit/TestActor$$Message.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Message) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageImplicitThis member is added by an implicit conversion from Message toEnsuring\[Message] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/testkit/TestActor$$Message.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Message) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageImplicitThis member is added by an implicit conversion from Message toEnsuring\[Message] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/testkit/TestActor$$Message.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MessageImplicitThis member is added by an implicit conversion from Message toEnsuring\[Message] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/testkit/TestActor$$Message.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MessageImplicitThis member is added by an implicit conversion from Message toEnsuring\[Message] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/testkit/TestActor$$Message.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/testkit/TestActor$$Message.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/testkit/TestActor$$Message.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/testkit/TestActor$$Message.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/testkit/TestActor$$Message.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/testkit/TestActor$$Message.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/testkit/TestActor$$Message.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/testkit/TestActor$$Message.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/testkit/TestActor$$Message.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/testkit/TestActor$$Message.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/testkit/TestActor$$Message.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/testkit/TestActor$$Message.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/testkit/TestActor$$Message.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/TestActor$$Message.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/TestActor$$Message.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Message toStringFormat\[Message] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/TestActor$$Message.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Message, B)ImplicitThis member is added by an implicit conversion from Message toArrowAssoc\[Message] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMessage to any2stringadd\[Message]

### Inherited by implicit conversion StringFormat fromMessage to StringFormat\[Message]

### Inherited by implicit conversion Ensuring fromMessage to Ensuring\[Message]

### Inherited by implicit conversion ArrowAssoc fromMessage to ArrowAssoc\[Message]

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
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$Message.html](https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$Message.html)*