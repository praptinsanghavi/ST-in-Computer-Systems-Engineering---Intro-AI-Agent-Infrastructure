---
description: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.StatusReplyInbox
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:11:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html
title: Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.StatusReplyInbox
---

# Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.StatusReplyInbox

> **Summary:** Akka 2.10.17 - akka.actor.testkit.typed.scaladsl.StatusReplyInbox

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/actor/index.html "Permalink")  package [actor](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/actor/testkit/index.html "Permalink")  package [testkit](../../index.html)Definition Classes[actor](../../../index.html)
- [**](../../../../../akka/actor/testkit/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[testkit](../../index.html)
- [**](../../../../../akka/actor/testkit/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [ActorTestKit](ActorTestKit.html "Testkit for asynchronous testing of typed actors, meant for mixing into the test class.")
- [ActorTestKitBase](ActorTestKitBase.html "A base class for the ActorTestKit, making it possible to have testing framework (e.g.")
- [BehaviorTestKit](BehaviorTestKit.html "Used for synchronous testing akka.actor.typed.Behaviors.")
- [Effects](Effects$.html "Factories for behavior effects for BehaviorTestKit, each effect has a suitable equals and can be used to compare actual effects to expected ones.")
- [FishingOutcomes](FishingOutcomes$.html)
- [LogCapturing](LogCapturing.html "Mixin this trait to a ScalaTest test to make log lines appear only when the test failed.")
- [LoggingTestKit](LoggingTestKit.html "Facilities for verifying logs.")
- [ManualTime](ManualTime.html "Not for user instantiation, see ManualTime#apply")
- [ReplyInbox](ReplyInbox.html "Similar to an akka.actor.testkit.typed.scaladsl.TestInbox, but can only ever give access to a single message (a reply).")
- [ScalaTestWithActorTestKit](ScalaTestWithActorTestKit.html "A ScalaTest base class for the ActorTestKit, making it possible to have ScalaTest manage the lifecycle of the testkit.")
- [SerializationTestKit](SerializationTestKit.html "Utilities to test serialization.")
- StatusReplyInbox
- [TestDuration](package$$TestDuration.html "Scala API.")
- [TestInbox](TestInbox.html "Utility for use as an ActorRef when *synchronously* testing akka.actor.typed.Behavior with akka.actor.testkit.typed.scaladsl.BehaviorTestKit.")
- [TestProbe](TestProbe.html "Create instances through the factories in the TestProbe companion.")
t[akka](../../../../index.html).[actor](../../../index.html).[testkit](../../index.html).[typed](../index.html).[scaladsl](index.html)

# StatusReplyInbox[**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html "Permalink")

### 

#### trait StatusReplyInbox\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

A [akka.actor.testkit.typed.scaladsl.ReplyInbox](ReplyInbox.html) which specially handles [akka.pattern.StatusReply](../../../../pattern/StatusReply.html).

Note that there is no provided ability to expect a specific `Throwable`, as it's recommended to prefer
a string error message or to enumerate failures with specific types.

Not intended for user creation: the [akka.actor.testkit.typed.scaladsl.BehaviorTestKit](BehaviorTestKit.html) will provide these
to denote that at most a single reply is expected.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() @[ApiMayChange](../../../../annotation/ApiMayChange.html)() Source[TestInbox.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-testkit-typed/src/main/scala/akka/actor/testkit/typed/scaladsl/TestInbox.scala#L105)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StatusReplyInbox
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

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#expectErrorMessage(errorMessage:String):Unit "Permalink") abstract  def expectErrorMessage(errorMessage: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that the status reply is a failure with this error message and remove the status reply.

Assert that the status reply is a failure with this error message and remove the status reply. Subsequent
calls to any `receive` or `expect` method will fail and `hasReply` will be false after calling this method.
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#expectNoReply():akka.actor.testkit.typed.scaladsl.StatusReplyInbox[T] "Permalink") abstract  def expectNoReply(): StatusReplyInbox\[T]Assert that this inbox has \*never\* received a reply.
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#expectValue(expectedValue:T):Unit "Permalink") abstract  def expectValue(expectedValue: T): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that the status reply is a success with this value and remove the status reply.

Assert that the status reply is a success with this value and remove the status reply. Subsequent calls to any
`receive` or `expect` method will fail and `hasReply` will be false after calling this method.
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#hasReply:Boolean "Permalink") abstract  def hasReply: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#receiveError():Throwable "Permalink") abstract  def receiveError(): ThrowableGet and remove the error value of the status reply.

Get and remove the error value of the status reply. This will fail if the status reply is a success.
Subsequent calls to any `receive` or `expect` method will fail and `hasReply` will be false after calling this
method.
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#receiveStatusReply():akka.pattern.StatusReply[T] "Permalink") abstract  def receiveStatusReply(): [StatusReply](../../../../pattern/StatusReply.html)\[T]Get and remove the status reply.

Get and remove the status reply. Subsequent calls to any `receive` or `expect` method will fail and `hasReply`
will be false after calling this method.
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#receiveValue():T "Permalink") abstract  def receiveValue(): TGet and remove the successful value of the status reply.

Get and remove the successful value of the status reply. This will fail if the status reply is an error.
Subsequent calls to any `receive` or `expect` method will fail and `hasReply` will be false after calling this
method.
### Concrete Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StatusReplyInbox\[T] toany2stringadd\[StatusReplyInbox\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StatusReplyInbox\[T], B)ImplicitThis member is added by an implicit conversion from StatusReplyInbox\[T] toArrowAssoc\[StatusReplyInbox\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StatusReplyInbox\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StatusReplyInbox\[T]ImplicitThis member is added by an implicit conversion from StatusReplyInbox\[T] toEnsuring\[StatusReplyInbox\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StatusReplyInbox\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StatusReplyInbox\[T]ImplicitThis member is added by an implicit conversion from StatusReplyInbox\[T] toEnsuring\[StatusReplyInbox\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StatusReplyInbox\[T]ImplicitThis member is added by an implicit conversion from StatusReplyInbox\[T] toEnsuring\[StatusReplyInbox\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StatusReplyInbox\[T]ImplicitThis member is added by an implicit conversion from StatusReplyInbox\[T] toEnsuring\[StatusReplyInbox\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#expectDone()(implicitev:T=:=akka.Done):Unit "Permalink")  def expectDone()(implicit ev: [\=:\=](https://www.scala-lang.org/api/2.13.17/scala/$eq$colon$eq.html#scala.=:=)\[T, [Done](../../../../Done.html)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that the successful value of the status reply is [akka.Done](../../../../Done.html).

Assert that the successful value of the status reply is [akka.Done](../../../../Done.html). Subsequent calls to any `receive` or
`expect` method will fail and `hasReply` will be false after calling this method.
15. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StatusReplyInbox\[T] toStringFormat\[StatusReplyInbox\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StatusReplyInbox\[T], B)ImplicitThis member is added by an implicit conversion from StatusReplyInbox\[T] toArrowAssoc\[StatusReplyInbox\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStatusReplyInbox\[T] to any2stringadd\[StatusReplyInbox\[T]]

### Inherited by implicit conversion StringFormat fromStatusReplyInbox\[T] to StringFormat\[StatusReplyInbox\[T]]

### Inherited by implicit conversion Ensuring fromStatusReplyInbox\[T] to Ensuring\[StatusReplyInbox\[T]]

### Inherited by implicit conversion ArrowAssoc fromStatusReplyInbox\[T] to ArrowAssoc\[StatusReplyInbox\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKitBase$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ActorTestKitBase.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/BehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/Effects$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/FishingOutcomes$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LogCapturing.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LoggingTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/LoggingTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ManualTime$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ManualTime.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/ScalaTestWithActorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/SerializationTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/TestInbox$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/TestInbox.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/TestProbe$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/package$$TestDuration.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/testkit/typed/scaladsl/StatusReplyInbox.html)*