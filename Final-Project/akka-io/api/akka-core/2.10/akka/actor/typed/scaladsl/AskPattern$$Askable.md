---
description: Akka 2.10.17 - akka.actor.typed.scaladsl.AskPattern.Askable
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:36:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/AskPattern$$Askable.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl.AskPattern.Askable
---

# Akka 2.10.17 - akka.actor.typed.scaladsl.AskPattern.Askable

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl.AskPattern.Askable

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/scaladsl/AskPattern$.html "Permalink")  object [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")The ask\-pattern implements the initiator side of a request–reply protocol.

The ask\-pattern implements the initiator side of a request–reply protocol.

See [AskPattern.Askable.ask](#ask[Res](replyTo:akka.actor.typed.ActorRef[Res]=>Req)(implicittimeout:akka.util.Timeout,implicitscheduler:akka.actor.typed.Scheduler):scala.concurrent.Future[Res]) for details

Definition Classes[scaladsl](index.html)
- Askable
c[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[scaladsl](index.html).[AskPattern](AskPattern$.html)

# Askable[**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html "Permalink")

### 

#### implicit final  class Askable\[Req] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

See [ask](#ask[Res](replyTo:akka.actor.typed.ActorRef[Res]=>Req)(implicittimeout:akka.util.Timeout,implicitscheduler:akka.actor.typed.Scheduler):scala.concurrent.Future[Res])

ReqThe request protocol, what the other actor accepts

Source[AskPattern.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/AskPattern.scala#L41)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Askable
2. AnyVal
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

1. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#<init>(ref:akka.actor.typed.RecipientRef[Req]):akka.actor.typed.scaladsl.AskPattern.Askable[Req] "Permalink")  new Askable(ref: [RecipientRef](../RecipientRef.html)\[Req])
### Value Members

1. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Askable\[Req] toany2stringadd\[Askable\[Req]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Askable\[Req], B)ImplicitThis member is added by an implicit conversion from Askable\[Req] toArrowAssoc\[Askable\[Req]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#?[Res](replyTo:akka.actor.typed.ActorRef[Res]=>Req)(implicittimeout:akka.util.Timeout,implicitscheduler:akka.actor.typed.Scheduler):scala.concurrent.Future[Res] "Permalink")  def ?\[Res](replyTo: ([ActorRef](../ActorRef.html)\[Res]) \=\> Req)(implicit timeout: [Timeout](../../../util/Timeout.html), scheduler: [Scheduler](../Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Res]The ask\-pattern implements the initiator side of a request–reply protocol.

The ask\-pattern implements the initiator side of a request–reply protocol.
The `?` operator is pronounced as "ask" (and a convenience symbolic operation
kept since the previous ask API, if unsure which one to use, prefer the non\-symbolic
method as it leads to fewer surprises with the scope of the `replyTo` function)

Note that if you are inside of an actor you should prefer [ActorContext.ask](ActorContext.html#ask[Req,Res](target:akka.actor.typed.RecipientRef[Req],createRequest:akka.actor.typed.ActorRef[Res]=>Req)(mapResponse:scala.util.Try[Res]=>T)(implicitresponseTimeout:akka.util.Timeout,implicitclassTag:scala.reflect.ClassTag[Res]):Unit)
as that provides better safety.

The party that asks may be within or without an Actor, since the
implementation will fabricate a (hidden) [ActorRef](../ActorRef.html) that is bound to a
[scala.concurrent.Promise](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Promise.html). This ActorRef will need to be injected in the
message that is sent to the target Actor in order to function as a reply\-to
address, therefore the argument to the ask / `?`
operator is not the message itself but a function that given the reply\-to
address will create the message.

```
case class Request(msg: String, replyTo: ActorRef[Reply])
case class Reply(msg: String)

implicit val system = ...
implicit val timeout = Timeout(3.seconds)
val target: ActorRef[Request] = ...
val f: Future[Reply] = target ? (replyTo => Request("hello", replyTo))
```
Note: it is preferrable to use the non\-symbolic ask method as it easier allows for wildcards for
the `replyTo: ActorRef`.

ResThe response protocol, what the other actor sends back
7. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#ask[Res](replyTo:akka.actor.typed.ActorRef[Res]=>Req)(implicittimeout:akka.util.Timeout,implicitscheduler:akka.actor.typed.Scheduler):scala.concurrent.Future[Res] "Permalink")  def ask\[Res](replyTo: ([ActorRef](../ActorRef.html)\[Res]) \=\> Req)(implicit timeout: [Timeout](../../../util/Timeout.html), scheduler: [Scheduler](../Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Res]The ask\-pattern implements the initiator side of a request–reply protocol.

The ask\-pattern implements the initiator side of a request–reply protocol.

Note that if you are inside of an actor you should prefer [ActorContext.ask](ActorContext.html#ask[Req,Res](target:akka.actor.typed.RecipientRef[Req],createRequest:akka.actor.typed.ActorRef[Res]=>Req)(mapResponse:scala.util.Try[Res]=>T)(implicitresponseTimeout:akka.util.Timeout,implicitclassTag:scala.reflect.ClassTag[Res]):Unit)
as that provides better safety.

The party that asks may be within or without an Actor, since the
implementation will fabricate a (hidden) [ActorRef](../ActorRef.html) that is bound to a
[scala.concurrent.Promise](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Promise.html). This ActorRef will need to be injected in the
message that is sent to the target Actor in order to function as a reply\-to
address, therefore the argument to the ask / `?`
operator is not the message itself but a function that given the reply\-to
address will create the message.

```
case class Request(msg: String, replyTo: ActorRef[Reply])
case class Reply(msg: String)

implicit val system = ...
implicit val timeout = Timeout(3.seconds)
val target: ActorRef[Request] = ...
val f: Future[Reply] = target.ask(replyTo => Request("hello", replyTo))
// alternatively
val f2: Future[Reply] = target.ask(Request("hello", _))
```
ResThe response protocol, what the other actor sends back

Annotations@nowarn()
9. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#askWithStatus[Res](replyTo:akka.actor.typed.ActorRef[akka.pattern.StatusReply[Res]]=>Req)(implicittimeout:akka.util.Timeout,implicitscheduler:akka.actor.typed.Scheduler):scala.concurrent.Future[Res] "Permalink")  def askWithStatus\[Res](replyTo: ([ActorRef](../ActorRef.html)\[[StatusReply](../../../pattern/StatusReply.html)\[Res]]) \=\> Req)(implicit timeout: [Timeout](../../../util/Timeout.html), scheduler: [Scheduler](../Scheduler.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Res]The same as [ask](#ask[Res](replyTo:akka.actor.typed.ActorRef[Res]=>Req)(implicittimeout:akka.util.Timeout,implicitscheduler:akka.actor.typed.Scheduler):scala.concurrent.Future[Res]) but only for requests that result in a response of type [akka.pattern.StatusReply](../../../pattern/StatusReply.html).

The same as [ask](#ask[Res](replyTo:akka.actor.typed.ActorRef[Res]=>Req)(implicittimeout:akka.util.Timeout,implicitscheduler:akka.actor.typed.Scheduler):scala.concurrent.Future[Res]) but only for requests that result in a response of type [akka.pattern.StatusReply](../../../pattern/StatusReply.html).
If the response is a [akka.pattern.StatusReply.Success](../../../pattern/StatusReply$$Success$.html) the returned future is completed successfully with the wrapped response.
If the status response is a [akka.pattern.StatusReply.Error](../../../pattern/StatusReply$$Error$.html) the returned future will be failed with the
exception in the error (normally a [akka.pattern.StatusReply.ErrorMessage](../../../pattern/StatusReply$$ErrorMessage.html)).
10. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Askable\[Req]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Askable\[Req]ImplicitThis member is added by an implicit conversion from Askable\[Req] toEnsuring\[Askable\[Req]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Askable\[Req]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Askable\[Req]ImplicitThis member is added by an implicit conversion from Askable\[Req] toEnsuring\[Askable\[Req]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Askable\[Req]ImplicitThis member is added by an implicit conversion from Askable\[Req] toEnsuring\[Askable\[Req]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Askable\[Req]ImplicitThis member is added by an implicit conversion from Askable\[Req] toEnsuring\[Askable\[Req]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
15. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#ref:akka.actor.typed.RecipientRef[Req] "Permalink")  val ref: [RecipientRef](../RecipientRef.html)\[Req]
17. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Askable\[Req] toStringFormat\[Askable\[Req]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../../akka/actor/typed/scaladsl/AskPattern$$Askable.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Askable\[Req], B)ImplicitThis member is added by an implicit conversion from Askable\[Req] toArrowAssoc\[Askable\[Req]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAskable\[Req] to any2stringadd\[Askable\[Req]]

### Inherited by implicit conversion StringFormat fromAskable\[Req] to StringFormat\[Askable\[Req]]

### Inherited by implicit conversion Ensuring fromAskable\[Req] to Ensuring\[Askable\[Req]]

### Inherited by implicit conversion ArrowAssoc fromAskable\[Req] to ArrowAssoc\[Askable\[Req]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/Scheduler.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern$$Askable.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply$$Error$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply$$ErrorMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply$$Success$.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/StatusReply.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/Timeout.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern$$Askable.html](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/scaladsl/AskPattern$$Askable.html)*