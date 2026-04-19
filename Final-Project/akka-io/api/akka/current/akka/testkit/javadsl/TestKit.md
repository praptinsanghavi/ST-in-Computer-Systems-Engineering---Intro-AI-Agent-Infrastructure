---
description: Akka 2.10.17 - akka.testkit.javadsl.TestKit
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:38:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/javadsl/TestKit.html
title: Akka 2.10.17 - akka.testkit.javadsl.TestKit
---

# Akka 2.10.17 - akka.testkit.javadsl.TestKit

> **Summary:** Akka 2.10.17 - akka.testkit.javadsl.TestKit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/testkit/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[testkit](../index.html)
- [EventFilter](EventFilter.html)
- TestKit
[c](TestKit$.html "See companion object")[akka](../../index.html).[testkit](../index.html).[javadsl](index.html)

# [TestKit](TestKit$.html "See companion object")[**](../../../akka/testkit/javadsl/TestKit.html "Permalink")

### Companion [object TestKit](TestKit$.html "See companion object")

#### class TestKit extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Java API: Test kit for testing actors. Inheriting from this class enables
reception of replies from actors, which are queued by an internal actor and
can be examined using the `expectMsg...` methods. Assertions and
bounds concerning timing are available in the form of `Within`
blocks.

Beware of two points:

- the ActorSystem passed into the constructor needs to be shutdown,
 otherwise thread pools and memory will be leaked \- this trait is not
 thread\-safe (only one actor with one queue, one stack of `Within`
 blocks); take care not to run tests within a single test class instance in
 parallel.
- It should be noted that for CI servers and the like all maximum Durations
 are scaled using the `dilated` method, which uses the
 TestKitExtension.Settings.TestTimeFactor settable via akka.conf entry
 "akka.test.timefactor".
Source[TestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/javadsl/TestKit.scala#L42)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestKit
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

1. [**](../../../akka/testkit/javadsl/TestKit.html#<init>(system:akka.actor.ActorSystem):akka.testkit.javadsl.TestKit "Permalink")  new TestKit(system: [ActorSystem](../../actor/ActorSystem.html))
### Value Members

1. [**](../../../akka/testkit/javadsl/TestKit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/testkit/javadsl/TestKit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/testkit/javadsl/TestKit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TestKit toany2stringadd\[TestKit] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/testkit/javadsl/TestKit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TestKit, B)ImplicitThis member is added by an implicit conversion from TestKit toArrowAssoc\[TestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/testkit/javadsl/TestKit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/testkit/javadsl/TestKit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/testkit/javadsl/TestKit.html#awaitAssert[A](max:java.time.Duration,interval:java.time.Duration,a:java.util.function.Supplier[A]):A "Permalink")  def awaitAssert\[A](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), a: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[A]): AEvaluate the given assert every `interval` until it does not throw an exception.

Evaluate the given assert every `interval` until it does not throw an exception.
If the `max` timeout expires the last exception is thrown.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".

returnsan arbitrary value that would be returned from awaitAssert if successful, if not interested in such value you can return null.
8. [**](../../../akka/testkit/javadsl/TestKit.html#awaitAssert[A](max:java.time.Duration,a:java.util.function.Supplier[A]):A "Permalink")  def awaitAssert\[A](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), a: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[A]): AEvaluate the given assert every `interval` until it does not throw an exception and return the
result.

Evaluate the given assert every `interval` until it does not throw an exception and return the
result.

If the `max` timeout expires the last exception is thrown.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".
9. [**](../../../akka/testkit/javadsl/TestKit.html#awaitAssert[A](a:java.util.function.Supplier[A]):A "Permalink")  def awaitAssert\[A](a: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[A]): AEvaluate the given assert every `interval` until it does not throw an exception and return the
result.

Evaluate the given assert every `interval` until it does not throw an exception and return the
result.

If the `max` timeout expires the last exception is thrown.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".
10. [**](../../../akka/testkit/javadsl/TestKit.html#awaitCond(max:java.time.Duration,interval:java.time.Duration,message:String,p:java.util.function.Supplier[Boolean]):Unit "Permalink")  def awaitCond(max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), message: String, p: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".
11. [**](../../../akka/testkit/javadsl/TestKit.html#awaitCond(max:java.time.Duration,interval:java.time.Duration,p:java.util.function.Supplier[Boolean]):Unit "Permalink")  def awaitCond(max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), p: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".
12. [**](../../../akka/testkit/javadsl/TestKit.html#awaitCond(max:java.time.Duration,p:java.util.function.Supplier[Boolean]):Unit "Permalink")  def awaitCond(max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), p: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".
13. [**](../../../akka/testkit/javadsl/TestKit.html#awaitCond(p:java.util.function.Supplier[Boolean]):Unit "Permalink")  def awaitCond(p: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

Await until the given condition evaluates to `true` or the timeout
expires, whichever comes first.

If no timeout is given, take it from the innermost enclosing `within`
block.

Note that the timeout is scaled using Duration.dilated,
which uses the configuration entry "akka.test.timefactor".
14. [**](../../../akka/testkit/javadsl/TestKit.html#childActorOf(props:akka.actor.Props):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html)): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor with an auto\-generated name and stopping supervisor strategy, returning the child's ActorRef.
15. [**](../../../akka/testkit/javadsl/TestKit.html#childActorOf(props:akka.actor.Props,name:String):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html), name: String): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor with a stopping supervisor strategy, and returns the child's ActorRef.
16. [**](../../../akka/testkit/javadsl/TestKit.html#childActorOf(props:akka.actor.Props,supervisorStrategy:akka.actor.SupervisorStrategy):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html), supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor with an auto\-generated name, and returns the child's ActorRef.
17. [**](../../../akka/testkit/javadsl/TestKit.html#childActorOf(props:akka.actor.Props,name:String,supervisorStrategy:akka.actor.SupervisorStrategy):akka.actor.ActorRef "Permalink")  def childActorOf(props: [Props](../../actor/Props.html), name: String, supervisorStrategy: [SupervisorStrategy](../../actor/SupervisorStrategy.html)): [ActorRef](../../actor/ActorRef.html)Spawns an actor as a child of this test actor, and returns the child's ActorRef.
18. [**](../../../akka/testkit/javadsl/TestKit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/testkit/javadsl/TestKit.html#dilated(duration:java.time.Duration):java.time.Duration "Permalink")  def dilated(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Java timeouts (durations) during tests with the configured
20. [**](../../../akka/testkit/javadsl/TestKit.html#duration(s:String):scala.concurrent.duration.FiniteDuration "Permalink")  def duration(s: String): [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
21. [**](../../../akka/testkit/javadsl/TestKit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestKitImplicitThis member is added by an implicit conversion from TestKit toEnsuring\[TestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../akka/testkit/javadsl/TestKit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TestKit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestKitImplicitThis member is added by an implicit conversion from TestKit toEnsuring\[TestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
23. [**](../../../akka/testkit/javadsl/TestKit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TestKitImplicitThis member is added by an implicit conversion from TestKit toEnsuring\[TestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
24. [**](../../../akka/testkit/javadsl/TestKit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestKitImplicitThis member is added by an implicit conversion from TestKit toEnsuring\[TestKit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
25. [**](../../../akka/testkit/javadsl/TestKit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/testkit/javadsl/TestKit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
27. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsg[T](max:java.time.Duration,obj:T,hint:String):T "Permalink")  def expectMsg\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), obj: T, hint: String): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.
28. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsg[T](max:java.time.Duration,obj:T):T "Permalink")  def expectMsg\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), obj: T): TReceive one message from the test actor and assert that it equals the
given object.

Receive one message from the test actor and assert that it equals the
given object. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.
29. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsg[T](obj:T):T "Permalink")  def expectMsg\[T](obj: T): TSame as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor.
30. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgAllOf[T](objs:T*):java.util.List[T] "Permalink")  def expectMsgAllOf\[T](objs: T\*): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[T]Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAllOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Annotations@varargs()
31. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgAllOfWithin[T](max:java.time.Duration,objs:T*):java.util.List[T] "Permalink")  def expectMsgAllOfWithin\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), objs: T\*): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[T]Receive a number of messages from the test actor matching the given
number of objects and assert that for each given object one is received
which equals it and vice versa.

Receive a number of messages from the test actor matching the given
number of objects and assert that for each given object one is received
which equals it and vice versa. This construct is useful when the order in
which the objects are received is not fixed. Wait time is bounded by the
given duration, with an AssertionFailure being thrown in case of timeout.

Annotations@varargs()
32. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgAnyClassOf[T](max:java.time.Duration,objs:Class[_]*):T "Permalink")  def expectMsgAnyClassOf\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), objs: Class\[\_]\*): TReceive one message from the test actor and assert that it conforms to
one of the given classes.

Receive one message from the test actor and assert that it conforms to
one of the given classes. Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

Annotations@varargs()
33. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgAnyClassOf[T](objs:Class[_]*):T "Permalink")  def expectMsgAnyClassOf\[T](objs: Class\[\_]\*): TSame as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAnyClassOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Annotations@varargs()
34. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgAnyOf[T](first:T,objs:T*):T "Permalink")  def expectMsgAnyOf\[T](first: T, objs: T\*): TSame as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Same as `expectMsgAnyOf(remainingOrDefault, obj...)`, but correctly treating the timeFactor.

Annotations@varargs()
35. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgAnyOfWithin[T](max:java.time.Duration,objs:T*):T "Permalink")  def expectMsgAnyOfWithin\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), objs: T\*): TReceive one message from the test actor and assert that it equals one of
the given objects.

Receive one message from the test actor and assert that it equals one of
the given objects. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

Annotations@varargs()
36. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgClass[T](max:java.time.Duration,c:Class[T]):T "Permalink")  def expectMsgClass\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), c: Class\[T]): TReceive one message from the test actor and assert that it conforms to
the given class.

Receive one message from the test actor and assert that it conforms to
the given class. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.
37. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgClass[T](c:Class[T]):T "Permalink")  def expectMsgClass\[T](c: Class\[T]): TSame as `expectMsgClass(remainingOrDefault, c)`, but correctly treating the timeFactor.
38. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgEquals[T](max:java.time.Duration,obj:T):T "Permalink")  def expectMsgEquals\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), obj: T): TReceive one message from the test actor and assert that it equals the given
object.

Receive one message from the test actor and assert that it equals the given
object. Wait time is bounded by the given duration, with an
AssertionFailure being thrown in case of timeout.

returnsthe received object
39. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgEquals[T](obj:T):T "Permalink")  def expectMsgEquals\[T](obj: T): TSame as `expectMsg(remainingOrDefault, obj)`, but correctly treating the timeFactor.
40. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgPF[T](max:java.time.Duration,hint:String,f:java.util.function.Function[Any,T]):T "Permalink")  def expectMsgPF\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), hint: String, f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TReceive one message from the test actor and assert that the given
partial function accepts it.

Receive one message from the test actor and assert that the given
partial function accepts it. Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

Use this variant to implement more complicated or conditional
processing.

Annotations@nowarn()
41. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgPF[T](hint:String,f:java.util.function.Function[Any,T]):T "Permalink")  def expectMsgPF\[T](hint: String, f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TReceive one message from the test actor and assert that the given
partial function accepts it.

Receive one message from the test actor and assert that the given
partial function accepts it. Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

Use this variant to implement more complicated or conditional
processing.
42. [**](../../../akka/testkit/javadsl/TestKit.html#expectNoMessage(max:java.time.Duration):Unit "Permalink")  def expectNoMessage(max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received for the specified time.

Assert that no message is received for the specified time.
Supplied value is not dilated.
43. [**](../../../akka/testkit/javadsl/TestKit.html#expectNoMessage():Unit "Permalink")  def expectNoMessage(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Assert that no message is received.

Assert that no message is received. Waits for the default period configured as
`akka.actor.testkit.expect-no-message-default`.
That timeout is scaled using the configuration entry "akka.actor.testkit.typed.timefactor".
44. [**](../../../akka/testkit/javadsl/TestKit.html#expectTerminated(target:akka.actor.ActorRef):akka.actor.Terminated "Permalink")  def expectTerminated(target: [ActorRef](../../actor/ActorRef.html)): [Terminated](../../actor/Terminated.html)Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.

Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.
Before calling this method, you have to `watch` the target actor ref.
Wait time is bounded by the given duration, with an AssertionFailure being thrown in case of timeout.

targetthe actor ref expected to be Terminated

returnsthe received Terminated message
45. [**](../../../akka/testkit/javadsl/TestKit.html#expectTerminated(max:java.time.Duration,target:akka.actor.ActorRef):akka.actor.Terminated "Permalink")  def expectTerminated(max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), target: [ActorRef](../../actor/ActorRef.html)): [Terminated](../../actor/Terminated.html)Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.

Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.
Before calling this method, you have to `watch` the target actor ref.
Wait time is bounded by the given duration, with an AssertionFailure being thrown in case of timeout.

maxwait no more than max time, otherwise throw AssertionFailure

targetthe actor ref expected to be Terminated

returnsthe received Terminated message
46. [**](../../../akka/testkit/javadsl/TestKit.html#fishForMessage(max:java.time.Duration,hint:String,f:java.util.function.Function[Any,Boolean]):Any "Permalink")  def fishForMessage(max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), hint: String, f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Hybrid of expectMsgPF and receiveWhile: receive messages while the
partial function matches and returns false.

Hybrid of expectMsgPF and receiveWhile: receive messages while the
partial function matches and returns false. Use it to ignore certain
messages while waiting for a specific message.

returnsthe last received message, i.e. the first one for which the
 partial function returned true

Annotations@nowarn()
47. [**](../../../akka/testkit/javadsl/TestKit.html#fishForSpecificMessage[T](max:java.time.Duration,hint:String,f:java.util.function.Function[Any,T]):T "Permalink")  def fishForSpecificMessage\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), hint: String, f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TSame as `fishForMessage`, but gets a different partial function and returns properly typed message.

Same as `fishForMessage`, but gets a different partial function and returns properly typed message.

Annotations@nowarn()
48. [**](../../../akka/testkit/javadsl/TestKit.html#forward(actor:akka.actor.ActorRef):Unit "Permalink")  def forward(actor: [ActorRef](../../actor/ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Forward this message as if in the TestActor's receive method with self.forward.
49. [**](../../../akka/testkit/javadsl/TestKit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
50. [**](../../../akka/testkit/javadsl/TestKit.html#getLastSender:akka.actor.ActorRef "Permalink")  def getLastSender: [ActorRef](../../actor/ActorRef.html)Get the last sender of the TestProbe
51. [**](../../../akka/testkit/javadsl/TestKit.html#getRef:akka.actor.ActorRef "Permalink")  def getRef: [ActorRef](../../actor/ActorRef.html)Shorthand to get the testActor.
52. [**](../../../akka/testkit/javadsl/TestKit.html#getRemaining:java.time.Duration "Permalink")  def getRemaining: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Obtain time remaining for execution of the innermost enclosing `within`
block or throw an AssertionError if no `within` block surrounds this
call.
53. [**](../../../akka/testkit/javadsl/TestKit.html#getRemainingOr(duration:java.time.Duration):java.time.Duration "Permalink")  def getRemainingOr(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the given duration.
54. [**](../../../akka/testkit/javadsl/TestKit.html#getRemainingOrDefault:java.time.Duration "Permalink")  def getRemainingOrDefault: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Obtain time remaining for execution of the innermost enclosing `within`
block or missing that it returns the properly dilated default for this
case from settings (key "akka.test.single\-expect\-default").
55. [**](../../../akka/testkit/javadsl/TestKit.html#getSystem:akka.actor.ActorSystem "Permalink")  def getSystem: [ActorSystem](../../actor/ActorSystem.html)
56. [**](../../../akka/testkit/javadsl/TestKit.html#getTestActor:akka.actor.ActorRef "Permalink")  def getTestActor: [ActorRef](../../actor/ActorRef.html)ActorRef of the test actor.

ActorRef of the test actor. Access is provided to enable e.g. registration
as message target.
57. [**](../../../akka/testkit/javadsl/TestKit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
58. [**](../../../akka/testkit/javadsl/TestKit.html#ignoreMsg(pf:java.util.function.Function[Any,Boolean]):Unit "Permalink")  def ignoreMsg(pf: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Ignore all messages in the test actor for which the given partial
function returns true.
59. [**](../../../akka/testkit/javadsl/TestKit.html#ignoreNoMsg():Unit "Permalink")  def ignoreNoMsg(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Stop ignoring messages in the test actor.
60. [**](../../../akka/testkit/javadsl/TestKit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
61. [**](../../../akka/testkit/javadsl/TestKit.html#msgAvailable:Boolean "Permalink")  def msgAvailable: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Query queue status.
62. [**](../../../akka/testkit/javadsl/TestKit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
63. [**](../../../akka/testkit/javadsl/TestKit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
64. [**](../../../akka/testkit/javadsl/TestKit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
65. [**](../../../akka/testkit/javadsl/TestKit.html#receiveN(n:Int,max:java.time.Duration):java.util.List[AnyRef] "Permalink")  def receiveN(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Receive N messages in a row before the given deadline.
66. [**](../../../akka/testkit/javadsl/TestKit.html#receiveN(n:Int):java.util.List[AnyRef] "Permalink")  def receiveN(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Same as `receiveN(n, remaining)` but correctly taking into account
Duration.timeFactor.
67. [**](../../../akka/testkit/javadsl/TestKit.html#receiveOne(max:java.time.Duration):AnyRef "Permalink")  def receiveOne(max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Receive one message from the internal queue of the TestActor.

Receive one message from the internal queue of the TestActor. If the given
duration is zero, the queue is polled (non\-blocking).

This method does NOT automatically scale its Duration parameter!
68. [**](../../../akka/testkit/javadsl/TestKit.html#receiveWhile[T](max:java.time.Duration,f:java.util.function.Function[AnyRef,T]):java.util.List[T] "Permalink")  def receiveWhile\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), T]): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[T]
69. [**](../../../akka/testkit/javadsl/TestKit.html#receiveWhile[T](max:java.time.Duration,idle:java.time.Duration,messages:Int,f:java.util.function.Function[AnyRef,T]):java.util.List[T] "Permalink")  def receiveWhile\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), idle: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), messages: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), T]): [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[T]Receive a series of messages until one does not match the given partial
function or the idle timeout is met (disabled by default) or the overall
maximum duration is elapsed or expected messages count is reached.

Receive a series of messages until one does not match the given partial
function or the idle timeout is met (disabled by default) or the overall
maximum duration is elapsed or expected messages count is reached.
Returns the sequence of messages.

Note that it is not an error to hit the `max` duration in this case.

One possible use of this method is for testing whether messages of
certain characteristics are generated at a certain rate:
70. [**](../../../akka/testkit/javadsl/TestKit.html#reply(msg:AnyRef):Unit "Permalink")  def reply(msg: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send message to the sender of the last dequeued message.
71. [**](../../../akka/testkit/javadsl/TestKit.html#send(actor:akka.actor.ActorRef,msg:AnyRef):Unit "Permalink")  def send(actor: [ActorRef](../../actor/ActorRef.html), msg: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send message to an actor while using the probe's TestActor as the sender.

Send message to an actor while using the probe's TestActor as the sender.
Replies will be available for inspection with all of TestKit's assertion
methods.
72. [**](../../../akka/testkit/javadsl/TestKit.html#setAutoPilot(pilot:akka.testkit.TestActor.AutoPilot):Unit "Permalink")  def setAutoPilot(pilot: [AutoPilot](../TestActor$$AutoPilot.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Install an AutoPilot to drive the testActor: the AutoPilot will be run
for each received message and can be used to send or forward messages,
etc.

Install an AutoPilot to drive the testActor: the AutoPilot will be run
for each received message and can be used to send or forward messages,
etc. Each invocation must return the AutoPilot for the next round.
73. [**](../../../akka/testkit/javadsl/TestKit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
74. [**](../../../akka/testkit/javadsl/TestKit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
75. [**](../../../akka/testkit/javadsl/TestKit.html#unwatch(ref:akka.actor.ActorRef):akka.actor.ActorRef "Permalink")  def unwatch(ref: [ActorRef](../../actor/ActorRef.html)): [ActorRef](../../actor/ActorRef.html)Have the testActor stop watching someone (i.e.

Have the testActor stop watching someone (i.e. `context.unwatch(...)`).
76. [**](../../../akka/testkit/javadsl/TestKit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
77. [**](../../../akka/testkit/javadsl/TestKit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
78. [**](../../../akka/testkit/javadsl/TestKit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
79. [**](../../../akka/testkit/javadsl/TestKit.html#watch(ref:akka.actor.ActorRef):akka.actor.ActorRef "Permalink")  def watch(ref: [ActorRef](../../actor/ActorRef.html)): [ActorRef](../../actor/ActorRef.html)Have the testActor watch someone (i.e.

Have the testActor watch someone (i.e. `context.watch(...)`).
80. [**](../../../akka/testkit/javadsl/TestKit.html#within[T](max:java.time.Duration,f:java.util.function.Supplier[T]):T "Permalink")  def within\[T](max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[T]): TExecute code block while bounding its execution time between `min` and
`max`.

Execute code block while bounding its execution time between `min` and
`max`. `within` blocks may be nested. All methods in this trait which
take maximum wait times are available in a version which implicitly uses
the remaining time governed by the innermost enclosing `within` block.

Note that the timeout is scaled using Duration.dilated, which uses the
configuration entry "akka.test.timefactor", while the min Duration is not.

```
within(java.time.Duration.ofMillis(50), () -> {
  test.tell("ping");
  return expectMsgClass(String.class);
});
```
81. [**](../../../akka/testkit/javadsl/TestKit.html#within[T](min:java.time.Duration,max:java.time.Duration,f:java.util.function.Supplier[T]):T "Permalink")  def within\[T](min: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), max: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), f: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[T]): TExecute code block while bounding its execution time between `min` and
`max`.

Execute code block while bounding its execution time between `min` and
`max`. `within` blocks may be nested. All methods in this trait which
take maximum wait times are available in a version which implicitly uses
the remaining time governed by the innermost enclosing `within` block.

Note that the timeout is scaled using Duration.dilated, which uses the
configuration entry "akka.test.timefactor", while the min Duration is not.

```
within(java.time.Duration.ofMillis(50), () -> {
  test.tell("ping");
  return expectMsgClass(String.class);
});
```
### Deprecated Value Members

1. [**](../../../akka/testkit/javadsl/TestKit.html#expectMsgPF[T](max:scala.concurrent.duration.Duration,hint:String,f:java.util.function.Function[Any,T]):T "Permalink")  def expectMsgPF\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), hint: String, f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TReceive one message from the test actor and assert that the given
partial function accepts it.

Receive one message from the test actor and assert that the given
partial function accepts it. Wait time is bounded by the given duration,
with an AssertionFailure being thrown in case of timeout.

Use this variant to implement more complicated or conditional
processing.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use the overloaded one which accepts java.time.Duration instead.
2. [**](../../../akka/testkit/javadsl/TestKit.html#expectTerminated(max:scala.concurrent.duration.Duration,target:akka.actor.ActorRef):akka.actor.Terminated "Permalink")  def expectTerminated(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), target: [ActorRef](../../actor/ActorRef.html)): [Terminated](../../actor/Terminated.html)Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.

Receive one message from the test actor and assert that it is the Terminated message of the given ActorRef.
Before calling this method, you have to `watch` the target actor ref.
Wait time is bounded by the given duration, with an AssertionFailure being thrown in case of timeout.

maxwait no more than max time, otherwise throw AssertionFailure

targetthe actor ref expected to be Terminated

returnsthe received Terminated message

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use the overloaded one which accepts java.time.Duration instead.
3. [**](../../../akka/testkit/javadsl/TestKit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
4. [**](../../../akka/testkit/javadsl/TestKit.html#fishForMessage(max:scala.concurrent.duration.Duration,hint:String,f:java.util.function.Function[Any,Boolean]):Any "Permalink")  def fishForMessage(max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), hint: String, f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Hybrid of expectMsgPF and receiveWhile: receive messages while the
partial function matches and returns false.

Hybrid of expectMsgPF and receiveWhile: receive messages while the
partial function matches and returns false. Use it to ignore certain
messages while waiting for a specific message.

returnsthe last received message, i.e. the first one for which the
 partial function returned true

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use the overloaded one which accepts java.time.Duration instead.
5. [**](../../../akka/testkit/javadsl/TestKit.html#fishForSpecificMessage[T](max:scala.concurrent.duration.Duration,hint:String,f:java.util.function.Function[Any,T]):T "Permalink")  def fishForSpecificMessage\[T](max: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), hint: String, f: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), T]): TSame as `fishForMessage`, but gets a different partial function and returns properly typed message.

Same as `fishForMessage`, but gets a different partial function and returns properly typed message.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use the overloaded one which accepts java.time.Duration instead.
6. [**](../../../akka/testkit/javadsl/TestKit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TestKit toStringFormat\[TestKit] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
7. [**](../../../akka/testkit/javadsl/TestKit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TestKit, B)ImplicitThis member is added by an implicit conversion from TestKit toArrowAssoc\[TestKit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTestKit to any2stringadd\[TestKit]

### Inherited by implicit conversion StringFormat fromTestKit to StringFormat\[TestKit]

### Inherited by implicit conversion Ensuring fromTestKit to Ensuring\[TestKit]

### Inherited by implicit conversion ArrowAssoc fromTestKit to ArrowAssoc\[TestKit]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Props.html
- https://doc.akka.io/api/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/api/akka/current/akka/actor/Terminated.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestActor$$AutoPilot.html
- https://doc.akka.io/api/akka/current/akka/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/EventFilter.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/TestKit$.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/TestKit.html
- https://doc.akka.io/api/akka/current/akka/testkit/javadsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/testkit/javadsl/TestKit.html](https://doc.akka.io/api/akka/current/akka/testkit/javadsl/TestKit.html)*