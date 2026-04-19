---
description: Akka 2.10.17 - akka.actor.AbstractActor.ActorContext
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:55:36Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/AbstractActor$$ActorContext.html
title: Akka 2.10.17 - akka.actor.AbstractActor.ActorContext
---

# Akka 2.10.17 - akka.actor.AbstractActor.ActorContext

> **Summary:** Akka 2.10.17 - akka.actor.AbstractActor.ActorContext

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/actor/AbstractActor$.html "Permalink")  object [AbstractActor](AbstractActor$.html "Java API: compatible with lambda expressions")Java API: compatible with lambda expressions

Java API: compatible with lambda expressions

Definition Classes[actor](index.html)
- ActorContext
- [Receive](AbstractActor$$Receive.html "Defines which messages the Actor can handle, along with the implementation of how the messages should be processed.")
t[akka](../index.html).[actor](index.html).[AbstractActor](AbstractActor$.html)

# ActorContext[**](../../akka/actor/AbstractActor$$ActorContext.html "Permalink")

### 

#### trait ActorContext extends [actor.ActorContext](ActorContext.html)

The actor context \- the view of the actor cell from the actor.
Exposes contextual information for the actor and the current message.

Not intended for public inheritance/implementation

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)() Source[AbstractActor.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/actor/AbstractActor.scala#L52)Linear Supertypes[actor.ActorContext](ActorContext.html), [ClassicActorContextProvider](ClassicActorContextProvider.html), [ActorRefFactory](ActorRefFactory.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorContext
2. ActorContext
3. ClassicActorContextProvider
4. ActorRefFactory
5. AnyRef
6. Any
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

1. [**](../../akka/actor/AbstractActor$$ActorContext.html#actorOf(props:akka.actor.Props,name:String):akka.actor.ActorRef "Permalink") abstract  def actorOf(props: [Props](Props.html), name: String): [ActorRef](ActorRef.html)Create new actor as child of this context with the given name, which must
not be null, empty or start with “$”.

Create new actor as child of this context with the given name, which must
not be null, empty or start with “$”. If the given name is already in use,
an `InvalidActorNameException` is thrown.

See [akka.actor.Props](Props.html) for details on how to obtain a `Props` object.

Definition Classes[ActorRefFactory](ActorRefFactory.html)Exceptions thrown`UnsupportedOperationException` if invoked on an ActorSystem that
 uses a custom user guardian

[`akka.ConfigurationException`](../ConfigurationException.html) if deployment, dispatcher
 or mailbox configuration is wrong

[`akka.actor.InvalidActorNameException`](InvalidActorNameException.html) if the given name is
 invalid or already in use
2. [**](../../akka/actor/AbstractActor$$ActorContext.html#actorOf(props:akka.actor.Props):akka.actor.ActorRef "Permalink") abstract  def actorOf(props: [Props](Props.html)): [ActorRef](ActorRef.html)Create new actor as child of this context and give it an automatically
generated name (currently similar to base64\-encoded integer count,
reversed and with “$” prepended, may change in the future).

Create new actor as child of this context and give it an automatically
generated name (currently similar to base64\-encoded integer count,
reversed and with “$” prepended, may change in the future).

See [akka.actor.Props](Props.html) for details on how to obtain a `Props` object.

Definition Classes[ActorRefFactory](ActorRefFactory.html)Exceptions thrown`UnsupportedOperationException` if invoked on an ActorSystem that
 uses a custom user guardian

[`akka.ConfigurationException`](../ConfigurationException.html) if deployment, dispatcher
 or mailbox configuration is wrong
3. [**](../../akka/actor/AbstractActor$$ActorContext.html#become(behavior:akka.actor.Actor.Receive,discardOld:Boolean):Unit "Permalink") abstract  def become(behavior: [Actor.Receive](Actor$.html#Receive=PartialFunction[Any,Unit]), discardOld: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Changes the Actor's behavior to become the new 'Receive' (PartialFunction\[Any, Unit]) handler.

Changes the Actor's behavior to become the new 'Receive' (PartialFunction\[Any, Unit]) handler.
This method acts upon the behavior stack as follows:

	- if `discardOld = true` it will replace the top element (i.e. the current behavior)
	- if `discardOld = false` it will keep the current behavior and push the given one atopThe default of replacing the current behavior on the stack has been chosen to avoid memory
leaks in case client code is written without consulting this documentation first (i.e.
always pushing new behaviors and never issuing an `unbecome()`)

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
4. [**](../../akka/actor/AbstractActor$$ActorContext.html#child(name:String):Option[akka.actor.ActorRef] "Permalink") abstract  def child(name: String): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[ActorRef](ActorRef.html)]Get the child with the given name if it exists.

Get the child with the given name if it exists.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
5. [**](../../akka/actor/AbstractActor$$ActorContext.html#children:scala.collection.immutable.Iterable[akka.actor.ActorRef] "Permalink") abstract  def children: [Iterable](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Iterable.html#scala.collection.immutable.Iterable)\[[ActorRef](ActorRef.html)]Returns all supervised children; this method returns a view (i.e.

Returns all supervised children; this method returns a view (i.e. a lazy
collection) onto the internal collection of children. Targeted lookups
should be using `child` instead for performance reasons:

```
val badLookup = context.children find (_.path.name == "kid")
// should better be expressed as:
val goodLookup = context.child("kid")
```
\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
6. [**](../../akka/actor/AbstractActor$$ActorContext.html#dispatcher:scala.concurrent.ExecutionContextExecutor "Permalink") implicit abstract  def dispatcher: [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)Returns the dispatcher (MessageDispatcher) that is used for this Actor.

Returns the dispatcher (MessageDispatcher) that is used for this Actor.
Importing this member will place an implicit ExecutionContext in scope.

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html) → [ActorRefFactory](ActorRefFactory.html)
7. [**](../../akka/actor/AbstractActor$$ActorContext.html#findChild(name:String):java.util.Optional[akka.actor.ActorRef] "Permalink") abstract  def findChild(name: String): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[ActorRef](ActorRef.html)]Returns a reference to the named child if it exists.

Returns a reference to the named child if it exists.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) callbacks.
8. [**](../../akka/actor/AbstractActor$$ActorContext.html#getChildren():Iterable[akka.actor.ActorRef] "Permalink") abstract  def getChildren(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[ActorRef](ActorRef.html)]Returns an unmodifiable Java Collection containing the linked actors

Returns an unmodifiable Java Collection containing the linked actors

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) callbacks.
9. [**](../../akka/actor/AbstractActor$$ActorContext.html#getDispatcher():scala.concurrent.ExecutionContextExecutor "Permalink") abstract  def getDispatcher(): [ExecutionContextExecutor](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContextExecutor.html#scala.concurrent.ExecutionContextExecutor)Returns the dispatcher (MessageDispatcher) that is used for this Actor.

Returns the dispatcher (MessageDispatcher) that is used for this Actor.

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
10. [**](../../akka/actor/AbstractActor$$ActorContext.html#getParent():akka.actor.ActorRef "Permalink") abstract  def getParent(): [ActorRef](ActorRef.html)Returns the supervisor of this actor.

Returns the supervisor of this actor.

Same as `parent()`.

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) callbacks.
11. [**](../../akka/actor/AbstractActor$$ActorContext.html#getProps():akka.actor.Props "Permalink") abstract  def getProps(): [Props](Props.html)Retrieve the Props which were used to create this actor.

Retrieve the Props which were used to create this actor.

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
12. [**](../../akka/actor/AbstractActor$$ActorContext.html#getSelf():akka.actor.ActorRef "Permalink") abstract  def getSelf(): [ActorRef](ActorRef.html)The ActorRef representing this actor

The ActorRef representing this actor

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
13. [**](../../akka/actor/AbstractActor$$ActorContext.html#getSystem():akka.actor.ActorSystem "Permalink") abstract  def getSystem(): [ActorSystem](ActorSystem.html)Returns the system this actor is running in.

Returns the system this actor is running in.

Same as `system()`

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) callbacks.
14. [**](../../akka/actor/AbstractActor$$ActorContext.html#guardian:akka.actor.InternalActorRef "Permalink") abstract  def guardian: InternalActorRefParent of all children created by this interface.

Parent of all children created by this interface.

INTERNAL API

Attributesprotected Definition Classes[ActorRefFactory](ActorRefFactory.html)
15. [**](../../akka/actor/AbstractActor$$ActorContext.html#lookupRoot:akka.actor.InternalActorRef "Permalink") abstract  def lookupRoot: InternalActorRefINTERNAL API

INTERNAL API

Attributesprotected Definition Classes[ActorRefFactory](ActorRefFactory.html)
16. [**](../../akka/actor/AbstractActor$$ActorContext.html#parent:akka.actor.ActorRef "Permalink") abstract  def parent: [ActorRef](ActorRef.html)Returns the supervising parent ActorRef.

Returns the supervising parent ActorRef.

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
17. [**](../../akka/actor/AbstractActor$$ActorContext.html#props:akka.actor.Props "Permalink") abstract  def props: [Props](Props.html)Retrieve the Props which were used to create this actor.

Retrieve the Props which were used to create this actor.

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
18. [**](../../akka/actor/AbstractActor$$ActorContext.html#provider:akka.actor.ActorRefProvider "Permalink") abstract  def provider: [ActorRefProvider](ActorRefProvider.html)INTERNAL API

INTERNAL API

Attributesprotected Definition Classes[ActorRefFactory](ActorRefFactory.html)
19. [**](../../akka/actor/AbstractActor$$ActorContext.html#receiveTimeout:scala.concurrent.duration.Duration "Permalink") abstract  def receiveTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Gets the current receive timeout.

Gets the current receive timeout.
When specified, the receive method should be able to handle a [akka.actor.ReceiveTimeout](ReceiveTimeout.html) message.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
20. [**](../../akka/actor/AbstractActor$$ActorContext.html#self:akka.actor.ActorRef "Permalink") abstract  def self: [ActorRef](ActorRef.html)The ActorRef representing this actor

The ActorRef representing this actor

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
21. [**](../../akka/actor/AbstractActor$$ActorContext.html#sender():akka.actor.ActorRef "Permalink") abstract  def sender(): [ActorRef](ActorRef.html)Returns the sender 'ActorRef' of the current message.

Returns the sender 'ActorRef' of the current message.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
22. [**](../../akka/actor/AbstractActor$$ActorContext.html#setReceiveTimeout(timeout:scala.concurrent.duration.Duration):Unit "Permalink") abstract  def setReceiveTimeout(timeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Defines the inactivity timeout after which the sending of a [akka.actor.ReceiveTimeout](ReceiveTimeout.html) message is triggered.

Defines the inactivity timeout after which the sending of a [akka.actor.ReceiveTimeout](ReceiveTimeout.html) message is triggered.
When specified, the receive function should be able to handle a [akka.actor.ReceiveTimeout](ReceiveTimeout.html) message.
1 millisecond is the minimum supported timeout.

Please note that the receive timeout might fire and enqueue the `ReceiveTimeout` message right after
another message was enqueued; hence it is **not guaranteed** that upon reception of the receive
timeout there must have been an idle period beforehand as configured via this method.

Once set, the receive timeout stays in effect (i.e. continues firing repeatedly after inactivity
periods). Pass in `Duration.Undefined` to switch off this feature.

Messages marked with [NotInfluenceReceiveTimeout](NotInfluenceReceiveTimeout.html) will not reset the timer. This can be useful when
`ReceiveTimeout` should be fired by external inactivity but not influenced by internal activity,
e.g. scheduled tick messages.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
23. [**](../../akka/actor/AbstractActor$$ActorContext.html#stop(actor:akka.actor.ActorRef):Unit "Permalink") abstract  def stop(actor: [ActorRef](ActorRef.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Stop the actor pointed to by the given [akka.actor.ActorRef](ActorRef.html); this is
an asynchronous operation, i.e.

Stop the actor pointed to by the given [akka.actor.ActorRef](ActorRef.html); this is
an asynchronous operation, i.e. involves a message send.
If this method is applied to the `self` reference from inside an Actor
then that Actor is guaranteed to not process any further messages after
this call; please note that the processing of the current message will
continue, this method does not immediately terminate this actor.

Definition Classes[ActorRefFactory](ActorRefFactory.html)
24. [**](../../akka/actor/AbstractActor$$ActorContext.html#system:akka.actor.ActorSystem "Permalink") implicit abstract  def system: [ActorSystem](ActorSystem.html)The system that the actor belongs to.

The system that the actor belongs to.
Importing this member will place an implicit ActorSystem in scope.

This method is thread\-safe and can be called from other threads than the ordinary
actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
25. [**](../../akka/actor/AbstractActor$$ActorContext.html#systemImpl:akka.actor.ActorSystemImpl "Permalink") abstract  def systemImpl: ActorSystemImplINTERNAL API

INTERNAL API

Attributesprotected Definition Classes[ActorRefFactory](ActorRefFactory.html)
26. [**](../../akka/actor/AbstractActor$$ActorContext.html#unbecome():Unit "Permalink") abstract  def unbecome(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Reverts the Actor behavior to the previous one on the behavior stack.

Reverts the Actor behavior to the previous one on the behavior stack.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
27. [**](../../akka/actor/AbstractActor$$ActorContext.html#unwatch(subject:akka.actor.ActorRef):akka.actor.ActorRef "Permalink") abstract  def unwatch(subject: [ActorRef](ActorRef.html)): [ActorRef](ActorRef.html)Unregisters this actor as Monitor for the provided ActorRef.

Unregisters this actor as Monitor for the provided ActorRef.

returnsthe provided ActorRef
\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
28. [**](../../akka/actor/AbstractActor$$ActorContext.html#watch(subject:akka.actor.ActorRef):akka.actor.ActorRef "Permalink") abstract  def watch(subject: [ActorRef](ActorRef.html)): [ActorRef](ActorRef.html)Registers this actor as a Monitor for the provided ActorRef.

Registers this actor as a Monitor for the provided ActorRef.
This actor will receive a Terminated(subject) message when watched
actor is terminated.

`watch` is idempotent if it is not mixed with `watchWith`.

It will fail with an IllegalStateException if the same subject was watched before using `watchWith`.
To clear the termination message, unwatch first.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

returnsthe provided ActorRef

Definition Classes[ActorContext](ActorContext.html)
29. [**](../../akka/actor/AbstractActor$$ActorContext.html#watchWith(subject:akka.actor.ActorRef,msg:Any):akka.actor.ActorRef "Permalink") abstract  def watchWith(subject: [ActorRef](ActorRef.html), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [ActorRef](ActorRef.html)Registers this actor as a Monitor for the provided ActorRef.

Registers this actor as a Monitor for the provided ActorRef.
This actor will receive the specified message when watched
actor is terminated.

`watchWith` is idempotent if it is called with the same `msg` and not mixed with `watch`.

It will fail with an IllegalStateException if the same subject was watched before using `watch` or `watchWith` with
another termination message. To change the termination message, unwatch first.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

returnsthe provided ActorRef

Definition Classes[ActorContext](ActorContext.html)
### Concrete Value Members

1. [**](../../akka/actor/AbstractActor$$ActorContext.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/actor/AbstractActor$$ActorContext.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/actor/AbstractActor$$ActorContext.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ActorContext toany2stringadd\[ActorContext] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/actor/AbstractActor$$ActorContext.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ActorContext, B)ImplicitThis member is added by an implicit conversion from ActorContext toArrowAssoc\[ActorContext] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/actor/AbstractActor$$ActorContext.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/actor/AbstractActor$$ActorContext.html#actorSelection(path:akka.actor.ActorPath):akka.actor.ActorSelection "Permalink")  def actorSelection(path: [ActorPath](ActorPath.html)): [ActorSelection](ActorSelection.html)Construct an [akka.actor.ActorSelection](ActorSelection.html) from the given path, which is
parsed for wildcards (these are replaced by regular expressions
internally).

Construct an [akka.actor.ActorSelection](ActorSelection.html) from the given path, which is
parsed for wildcards (these are replaced by regular expressions
internally). No attempt is made to verify the existence of any part of
the supplied path, it is recommended to send a message and gather the
replies in order to resolve the matching set of actors.

Definition Classes[ActorRefFactory](ActorRefFactory.html)
7. [**](../../akka/actor/AbstractActor$$ActorContext.html#actorSelection(path:String):akka.actor.ActorSelection "Permalink")  def actorSelection(path: String): [ActorSelection](ActorSelection.html)Construct an [akka.actor.ActorSelection](ActorSelection.html) from the given path, which is
parsed for wildcards (these are replaced by regular expressions
internally).

Construct an [akka.actor.ActorSelection](ActorSelection.html) from the given path, which is
parsed for wildcards (these are replaced by regular expressions
internally). No attempt is made to verify the existence of any part of
the supplied path, it is recommended to send a message and gather the
replies in order to resolve the matching set of actors.

Definition Classes[ActorRefFactory](ActorRefFactory.html)
8. [**](../../akka/actor/AbstractActor$$ActorContext.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/actor/AbstractActor$$ActorContext.html#become(behavior:akka.actor.AbstractActor.Receive,discardOld:Boolean):Unit "Permalink")  def become(behavior: [Receive](AbstractActor$$Receive.html), discardOld: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Changes the Actor's behavior to become the new 'Receive' handler.

Changes the Actor's behavior to become the new 'Receive' handler.
This method acts upon the behavior stack as follows:

	- if `discardOld = true` it will replace the top element (i.e. the current behavior)
	- if `discardOld = false` it will keep the current behavior and push the given one atopThe default of replacing the current behavior on the stack has been chosen to avoid memory
leaks in case client code is written without consulting this documentation first (i.e.
always pushing new behaviors and never issuing an `unbecome()`)

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) callbacks.
10. [**](../../akka/actor/AbstractActor$$ActorContext.html#become(behavior:akka.actor.AbstractActor.Receive):Unit "Permalink")  def become(behavior: [Receive](AbstractActor$$Receive.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Changes the Actor's behavior to become the new 'Receive' handler.

Changes the Actor's behavior to become the new 'Receive' handler.
Replaces the current behavior on the top of the behavior stack.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) callbacks.
11. [**](../../akka/actor/AbstractActor$$ActorContext.html#become(behavior:akka.actor.Actor.Receive):Unit "Permalink")  def become(behavior: [Actor.Receive](Actor$.html#Receive=PartialFunction[Any,Unit])): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Changes the Actor's behavior to become the new 'Receive' (PartialFunction\[Any, Unit]) handler.

Changes the Actor's behavior to become the new 'Receive' (PartialFunction\[Any, Unit]) handler.
Replaces the current behavior on the top of the behavior stack.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.

Definition Classes[ActorContext](ActorContext.html)
12. [**](../../akka/actor/AbstractActor$$ActorContext.html#cancelReceiveTimeout():Unit "Permalink")  def cancelReceiveTimeout(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Cancel the sending of receive timeout notifications.
13. [**](../../akka/actor/AbstractActor$$ActorContext.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/actor/AbstractActor$$ActorContext.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ActorContext) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorContextImplicitThis member is added by an implicit conversion from ActorContext toEnsuring\[ActorContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/actor/AbstractActor$$ActorContext.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ActorContext) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorContextImplicitThis member is added by an implicit conversion from ActorContext toEnsuring\[ActorContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/actor/AbstractActor$$ActorContext.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ActorContextImplicitThis member is added by an implicit conversion from ActorContext toEnsuring\[ActorContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/actor/AbstractActor$$ActorContext.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ActorContextImplicitThis member is added by an implicit conversion from ActorContext toEnsuring\[ActorContext] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/actor/AbstractActor$$ActorContext.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/actor/AbstractActor$$ActorContext.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../akka/actor/AbstractActor$$ActorContext.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/actor/AbstractActor$$ActorContext.html#getReceiveTimeout():java.time.Duration "Permalink")  def getReceiveTimeout(): [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Gets the current receive timeout.

Gets the current receive timeout.
When specified, the receive method should be able to handle a [akka.actor.ReceiveTimeout](ReceiveTimeout.html) message.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
22. [**](../../akka/actor/AbstractActor$$ActorContext.html#getSender():akka.actor.ActorRef "Permalink")  def getSender(): [ActorRef](ActorRef.html)Returns the sender 'ActorRef' of the current message.

Returns the sender 'ActorRef' of the current message.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
23. [**](../../akka/actor/AbstractActor$$ActorContext.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/actor/AbstractActor$$ActorContext.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../akka/actor/AbstractActor$$ActorContext.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../akka/actor/AbstractActor$$ActorContext.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/actor/AbstractActor$$ActorContext.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../akka/actor/AbstractActor$$ActorContext.html#setReceiveTimeout(timeout:java.time.Duration):Unit "Permalink")  def setReceiveTimeout(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Defines the inactivity timeout after which the sending of a [akka.actor.ReceiveTimeout](ReceiveTimeout.html) message is triggered.

Defines the inactivity timeout after which the sending of a [akka.actor.ReceiveTimeout](ReceiveTimeout.html) message is triggered.
When specified, the receive function should be able to handle a [akka.actor.ReceiveTimeout](ReceiveTimeout.html) message.
1 millisecond is the minimum supported timeout.

Please note that the receive timeout might fire and enqueue the `ReceiveTimeout` message right after
another message was enqueued; hence it is **not guaranteed** that upon reception of the receive
timeout there must have been an idle period beforehand as configured via this method.

Once set, the receive timeout stays in effect (i.e. continues firing repeatedly after inactivity
periods). Pass in `Duration.Undefined` to switch off this feature.

Messages marked with [NotInfluenceReceiveTimeout](NotInfluenceReceiveTimeout.html) will not reset the timer. This can be useful when
`ReceiveTimeout` should be fired by external inactivity but not influenced by internal activity,
e.g. scheduled tick messages.

\*Warning\*: This method is not thread\-safe and must not be accessed from threads other
than the ordinary actor message processing thread, such as [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) and [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) callbacks.
29. [**](../../akka/actor/AbstractActor$$ActorContext.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../akka/actor/AbstractActor$$ActorContext.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../akka/actor/AbstractActor$$ActorContext.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/actor/AbstractActor$$ActorContext.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
33. [**](../../akka/actor/AbstractActor$$ActorContext.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../akka/actor/AbstractActor$$ActorContext.html#writeObject(o:java.io.ObjectOutputStream):Unit "Permalink") final  def writeObject(o: [ObjectOutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectOutputStream.html#java.io.ObjectOutputStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)ActorContexts shouldn't be Serializable

ActorContexts shouldn't be Serializable

Attributesprotected Definition Classes[ActorContext](ActorContext.html)
### Deprecated Value Members

1. [**](../../akka/actor/AbstractActor$$ActorContext.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/actor/AbstractActor$$ActorContext.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ActorContext toStringFormat\[ActorContext] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/actor/AbstractActor$$ActorContext.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ActorContext, B)ImplicitThis member is added by an implicit conversion from ActorContext toArrowAssoc\[ActorContext] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [actor.ActorContext](ActorContext.html)

### Inherited from [ClassicActorContextProvider](ClassicActorContextProvider.html)

### Inherited from [ActorRefFactory](ActorRefFactory.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromActorContext to any2stringadd\[ActorContext]

### Inherited by implicit conversion StringFormat fromActorContext to StringFormat\[ActorContext]

### Inherited by implicit conversion Ensuring fromActorContext to Ensuring\[ActorContext]

### Inherited by implicit conversion ArrowAssoc fromActorContext to ArrowAssoc\[ActorContext]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/ConfigurationException.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActor$$ActorContext.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActor$$Receive.html
- https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActor$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Actor$.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorPath.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRefProvider.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ClassicActorContextProvider.html
- https://doc.akka.io/api/akka/2.10/akka/actor/InvalidActorNameException.html
- https://doc.akka.io/api/akka/2.10/akka/actor/NotInfluenceReceiveTimeout.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Props.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ReceiveTimeout.html
- https://doc.akka.io/api/akka/2.10/akka/actor/index.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActor$$ActorContext.html](https://doc.akka.io/api/akka/2.10/akka/actor/AbstractActor$$ActorContext.html)*