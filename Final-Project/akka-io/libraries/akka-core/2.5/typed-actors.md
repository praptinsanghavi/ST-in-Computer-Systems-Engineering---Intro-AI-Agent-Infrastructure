---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed-actors.html
title: Typed Actors
---

# Typed Actors

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Typed Actors

Note
This module will be deprecated as it will be superseded by the [Akka Typed](typed/actors.html) project which is currently being developed in open preview mode.

Akka “Typed Actors”, now replaced by [Akka Typed](typed/index.html), were an implementation of the [Active Objects](https://en.wikipedia.org/wiki/Active_object) pattern. Essentially turning method invocations into asynchronous dispatch instead of synchronous that has been the default way since Smalltalk came out.

Typed Actors consist of 2 “parts”, a public interface and an implementation, and if you’ve done any work in “enterprise” Java, this will be very familiar to you. As with normal Actors you have an external API (the public interface instance) that will delegate method calls asynchronously to a private instance of the implementation.

The advantage of Typed Actors vs. Actors is that with TypedActors you have a static contract, and don’t need to define your own messages, the downside is that it places some limitations on what you can do and what you can’t, i.e. you cannot use `become`/`unbecome`.

Typed Actors are implemented using [JDK Proxies](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Proxy.html) which provide a pretty easy\-worked API to intercept method calls.

Note
Just as with regular Akka Actors, Typed Actors process one call at a time.

## When to use Typed Actors

Typed actors are nice for bridging between actor systems (the “inside”) and non\-actor code (the “outside”), because they allow you to write normal OO\-looking code on the outside. Think of them like doors: their practicality lies in interfacing between private sphere and the public, but you don’t want that many doors inside your house, do you? For a longer discussion see [this blog post](http://letitcrash.com/post/19074284309/when-to-use-typedactors).

A bit more background: TypedActors can easily be abused as RPC, and that is an abstraction which is [well\-known](https://doc.akka.io/docs/misc/smli_tr-94-29.pdf) to be leaky. Hence TypedActors are not what we think of first when we talk about making highly scalable concurrent software easier to write correctly. They have their niche, use them sparingly.

## The tools of the trade

Before we create our first Typed Actor we should first go through the tools that we have at our disposal, it’s located in `akka.actor.TypedActor`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L88-L112 "Go to snippet source")  
import akka.actor.TypedActor

//Returns the Typed Actor Extension
val extension = TypedActor(system) //system is an instance of ActorSystem

//Returns whether the reference is a Typed Actor Proxy or not
TypedActor(system).isTypedActor(someReference)

//Returns the backing Akka Actor behind an external Typed Actor Proxy
TypedActor(system).getActorRefFor(someReference)

//Returns the current ActorContext,
// method only valid within methods of a TypedActor implementation
val c: ActorContext = TypedActor.context

//Returns the external proxy of the current Typed Actor,
// method only valid within methods of a TypedActor implementation
val s: Squarer = TypedActor.self[Squarer]

//Returns a contextual instance of the Typed Actor Extension
//this means that if you create other Typed Actors with this,
//they will become children to the current Typed Actor.
TypedActor(TypedActor.context)

```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L86-L109 "Go to snippet source")  
// Returns the Typed Actor Extension
TypedActorExtension extension =
    TypedActor.get(system); // system is an instance of ActorSystem

// Returns whether the reference is a Typed Actor Proxy or not
TypedActor.get(system).isTypedActor(someReference);

// Returns the backing Akka Actor behind an external Typed Actor Proxy
TypedActor.get(system).getActorRefFor(someReference);

// Returns the current ActorContext,
// method only valid within methods of a TypedActor implementation
ActorContext context = TypedActor.context();

// Returns the external proxy of the current Typed Actor,
// method only valid within methods of a TypedActor implementation
Squarer sq = TypedActor.<Squarer>self();

// Returns a contextual instance of the Typed Actor Extension
// this means that if you create other Typed Actors with this,
// they will become children to the current Typed Actor.
TypedActor.get(TypedActor.context());

```

Warning
Same as not exposing `this` of an Akka Actor, it’s important not to expose `this` of a Typed Actor, instead you should pass the external proxy reference, which is obtained from within your Typed Actor as `TypedActor.self``TypedActor.self()`, this is your external identity, as the `ActorRef` is the external identity of an Akka Actor.

## Creating Typed Actors

To create a Typed Actor you need to have one or more interfaces, and one implementation.

The following imports are assumed:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L8-L15 "Go to snippet source")import java.lang.String.{ valueOf => println }

import akka.actor.{ ActorContext, ActorRef, TypedActor, TypedProps }
import akka.routing.RoundRobinGroup
import akka.testkit._

import scala.concurrent.{ Await, Future }
import scala.concurrent.duration._
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L8-L22 "Go to snippet source")import akka.actor.TypedActor;
import akka.actor.*;
import akka.japi.*;
import akka.dispatch.Futures;

import jdocs.AbstractJavaTest;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;
import java.util.concurrent.TimeUnit;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import akka.routing.RoundRobinGroup;
```

Our example interface:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L22-L35 "Go to snippet source")trait Squarer {
  def squareDontCare(i: Int): Unit //fire-forget

  def square(i: Int): Future[Int] //non-blocking send-request-reply

  def squareNowPlease(i: Int): Option[Int] //blocking send-request-reply

  def squareNow(i: Int): Int //blocking send-request-reply

  @throws(classOf[Exception]) //declare it or you will get an UndeclaredThrowableException
  def squareTry(i: Int): Int //blocking send-request-reply with possible exception
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L34-L44 "Go to snippet source")static interface Squarer {
  void squareDontCare(int i); // fire-forget

  Future<Integer> square(int i); // non-blocking send-request-reply

  Option<Integer> squareNowPlease(int i); // blocking send-request-reply

  int squareNow(int i); // blocking send-request-reply
}
```

Our example implementation of that interface:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L39-L53 "Go to snippet source")class SquarerImpl(val name: String) extends Squarer {

  def this() = this("default")
  def squareDontCare(i: Int): Unit = i * i //Nobody cares :(

  def square(i: Int): Future[Int] = Future.successful(i * i)

  def squareNowPlease(i: Int): Option[Int] = Some(i * i)

  def squareNow(i: Int): Int = i * i

  def squareTry(i: Int): Int = throw new Exception("Catch me!")
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L49-L78 "Go to snippet source")class SquarerImpl implements Squarer {
  private String name;

  public SquarerImpl() {
    this.name = "default";
  }

  public SquarerImpl(String name) {
    this.name = name;
  }

  public void squareDontCare(int i) {
    int sq = i * i; // Nobody cares :(
  }

  public Future<Integer> square(int i) {
    return Futures.successful(i * i);
  }

  public Option<Integer> squareNowPlease(int i) {
    return Option.some(i * i);
  }

  public int squareNow(int i) {
    return i * i;
  }
}
```

The most trivial way of creating a Typed Actor instance of our `Squarer`:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L121-L122 "Go to snippet source")val mySquarer: Squarer =
  TypedActor(system).typedActorOf(TypedProps[SquarerImpl]())
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L120-L122 "Go to snippet source")Squarer mySquarer =
    TypedActor.get(system)
        .typedActorOf(new TypedProps<SquarerImpl>(Squarer.class, SquarerImpl.class));
```

First type is the type of the proxy, the second type is the type of the implementation. If you need to call a specific constructor you do it like this:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L125-L126 "Go to snippet source")val otherSquarer: Squarer =
  TypedActor(system).typedActorOf(TypedProps(classOf[Squarer], new SquarerImpl("foo")), "name")
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L125-L135 "Go to snippet source")Squarer otherSquarer =
    TypedActor.get(system)
        .typedActorOf(
            new TypedProps<SquarerImpl>(
                Squarer.class,
                new Creator<SquarerImpl>() {
                  public SquarerImpl create() {
                    return new SquarerImpl("foo");
                  }
                }),
            "name");
```

Since you supply a `Props`, you can specify which dispatcher to use, what the default timeout should be used and more. Now, our `Squarer` doesn’t have any methods, so we’d better add those.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L22-L35 "Go to snippet source")trait Squarer {
  def squareDontCare(i: Int): Unit //fire-forget

  def square(i: Int): Future[Int] //non-blocking send-request-reply

  def squareNowPlease(i: Int): Option[Int] //blocking send-request-reply

  def squareNow(i: Int): Int //blocking send-request-reply

  @throws(classOf[Exception]) //declare it or you will get an UndeclaredThrowableException
  def squareTry(i: Int): Int //blocking send-request-reply with possible exception
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L34-L44 "Go to snippet source")static interface Squarer {
  void squareDontCare(int i); // fire-forget

  Future<Integer> square(int i); // non-blocking send-request-reply

  Option<Integer> squareNowPlease(int i); // blocking send-request-reply

  int squareNow(int i); // blocking send-request-reply
}
```

Alright, now we’ve got some methods we can call, but we need to implement those in `SquarerImpl`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L39-L53 "Go to snippet source")class SquarerImpl(val name: String) extends Squarer {

  def this() = this("default")
  def squareDontCare(i: Int): Unit = i * i //Nobody cares :(

  def square(i: Int): Future[Int] = Future.successful(i * i)

  def squareNowPlease(i: Int): Option[Int] = Some(i * i)

  def squareNow(i: Int): Int = i * i

  def squareTry(i: Int): Int = throw new Exception("Catch me!")
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L49-L78 "Go to snippet source")class SquarerImpl implements Squarer {
  private String name;

  public SquarerImpl() {
    this.name = "default";
  }

  public SquarerImpl(String name) {
    this.name = name;
  }

  public void squareDontCare(int i) {
    int sq = i * i; // Nobody cares :(
  }

  public Future<Integer> square(int i) {
    return Futures.successful(i * i);
  }

  public Option<Integer> squareNowPlease(int i) {
    return Option.some(i * i);
  }

  public int squareNow(int i) {
    return i * i;
  }
}
```

Excellent, now we have an interface and an implementation of that interface, and we know how to create a Typed Actor from that, so let’s look at calling these methods.

## Method dispatch semantics

Methods returning:

- `Unit` will be dispatched with `fire-and-forget` semantics, exactly like `ActorRef.tell`
- `scala.concurrent.Future[_]` will use `send-request-reply` semantics, exactly like `ActorRef.ask`
- `scala.Option[_]` will use `send-request-reply` semantics, but *will* block to wait for an answer, and return `scala.None` if no answer was produced within the timeout, or `scala.Some[_]` containing the result otherwise. Any exception that was thrown during this call will be rethrown.
- Any other type of value will use `send-request-reply` semantics, but *will* block to wait for an answer, throwing `java.util.concurrent.TimeoutException` if there was a timeout or rethrow any exception that was thrown during this call.

- `void` will be dispatched with `fire-and-forget` semantics, exactly like `ActorRef.tell`
- `scala.concurrent.Future<?>` will use `send-request-reply` semantics, exactly like `ActorRef.ask`
- `akka.japi.Option<?>` will use `send-request-reply` semantics, but *will* block to wait for an answer, and return `akka.japi.Option.None` if no answer was produced within the timeout, or `akka.japi.Option.Some<?>` containing the result otherwise. Any exception that was thrown during this call will be rethrown.
- Any other type of value will use `send-request-reply` semantics, but *will* block to wait for an answer, throwing `java.util.concurrent.TimeoutException` if there was a timeout or rethrow any exception that was thrown during this call. Note that due to the Java exception and reflection mechanisms, such a `TimeoutException` will be wrapped in a `java.lang.reflect.UndeclaredThrowableException` unless the interface method explicitly declares the `TimeoutException` as a thrown checked exception.

## Messages and immutability

While Akka cannot enforce that the parameters to the methods of your Typed Actors are immutable, we *strongly* recommend that parameters passed are immutable.

### One\-way message send

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L131 "Go to snippet source")mySquarer.squareDontCare(10)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L140 "Go to snippet source")mySquarer.squareDontCare(10);
```

As simple as that! The method will be executed on another thread; asynchronously.

### Request\-reply message send

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L139 "Go to snippet source")val oSquare = mySquarer.squareNowPlease(10) //Option[Int]
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L148 "Go to snippet source")Option<Integer> oSquare = mySquarer.squareNowPlease(10); // Option[Int]
```

This will block for as long as the timeout that was set in the `Props` of the Typed Actor, if needed. It will return `None` if a timeout occurs.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L143 "Go to snippet source")val iSquare = mySquarer.squareNow(10) //Int
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L152 "Go to snippet source")int iSquare = mySquarer.squareNow(10); // Int
```

This will block for as long as the timeout that was set in the `Props` of the Typed Actor, if needed. It will throw a `java.util.concurrent.TimeoutException` if a timeout occurs.

Note that here, such a `TimeoutException` will be wrapped in a `java.lang.reflect.UndeclaredThrowableException` by the Java reflection mechanism, because the interface method does not explicitly declare the `TimeoutException` as a thrown checked exception. To get the `TimeoutException` directly, declare `throws java.util.concurrent.TimeoutException` at the interface method.

### Request\-reply\-with\-future message send

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L135 "Go to snippet source")val fSquare = mySquarer.square(10) //A Future[Int]
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L144 "Go to snippet source")Future<Integer> fSquare = mySquarer.square(10); // A Future[Int]
```

This call is asynchronous, and the Future returned can be used for asynchronous composition.

## Stopping Typed Actors

Since Akka’s Typed Actors are backed by Akka Actors they must be stopped when they aren’t needed anymore.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L154 "Go to snippet source")TypedActor(system).stop(mySquarer)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L163 "Go to snippet source")TypedActor.get(system).stop(mySquarer);
```

This asynchronously stops the Typed Actor associated with the specified proxy ASAP.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L158 "Go to snippet source")TypedActor(system).poisonPill(otherSquarer)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L167 "Go to snippet source")TypedActor.get(system).poisonPill(otherSquarer);
```

This asynchronously stops the Typed Actor associated with the specified proxy after it’s done with all calls that were made prior to this call.

## Typed Actor Hierarchies

Since you can obtain a contextual Typed Actor Extension by passing in an `ActorContext` you can create child Typed Actors by invoking `typedActorOf(..)` on that.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L174-L177 "Go to snippet source")//Inside your Typed Actor
val childSquarer: Squarer =
  TypedActor(TypedActor.context).typedActorOf(TypedProps[SquarerImpl]())
//Use "childSquarer" as a Squarer
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L178-L181 "Go to snippet source")Squarer childSquarer =
    TypedActor.get(TypedActor.context())
        .typedActorOf(new TypedProps<SquarerImpl>(Squarer.class, SquarerImpl.class));
// Use "childSquarer" as a Squarer
```

You can also create a child Typed Actor in regular Akka Actors by giving the `ActorContext``AbstractActor.ActorContext` as an input parameter to `TypedActor.get(…)`.

## Supervisor Strategy

By having your Typed Actor implementation class implement `TypedActor.Supervisor` you can define the strategy to use for supervising child actors, as described in [supervision](general/supervision.html) and [Fault Tolerance](fault-tolerance.html).

## Lifecycle callbacks

By having your Typed Actor implementation class implement any and all of the following:

- `TypedActor.PreStart`
- `TypedActor.PostStop`
- `TypedActor.PreRestart`
- `TypedActor.PostRestart`

You can hook into the lifecycle of your Typed Actor.

## Receive arbitrary messages

If your implementation class of your TypedActor extends `akka.actor.TypedActor.Receiver`, all messages that are not `MethodCall` instances will be passed into the `onReceive`\-method.

This allows you to react to DeathWatch `Terminated`\-messages and other types of messages, e.g. when interfacing with untyped actors.

## Proxying

You can use the `typedActorOf` that takes a TypedProps and an ActorRef to proxy the given ActorRef as a TypedActor. This is usable if you want to communicate remotely with TypedActors on other machines, pass the `ActorRef` to `typedActorOf`.

Note
The ActorRef needs to accept `MethodCall` messages.

## Lookup \& Remoting

Since `TypedActors` are backed by `Akka Actors`, you can use `typedActorOf` to proxy `ActorRefs` potentially residing on remote nodes.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L165-L167 "Go to snippet source")val typedActor: Foo with Bar =
  TypedActor(system).typedActorOf(TypedProps[FooBar], actorRefToRemoteActor)
//Use "typedActor" as a FooBar
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L193-L196 "Go to snippet source")Squarer typedActor =
    TypedActor.get(system)
        .typedActorOf(new TypedProps<Squarer>(Squarer.class), actorRefToRemoteActor);
// Use "typedActor" as a FooBar
```

## Supercharging

Here’s an example on how you can use traits to mix in behavior in your Typed Actors.

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L56-L65 "Go to snippet source")trait Foo {
  def doFoo(times: Int): Unit = println("doFoo(" + times + ")")
}

trait Bar {
  def doBar(str: String): Future[String] =
    Future.successful(str.toUpperCase)
}

class FooBar extends Foo with Bar
```

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L186-L192 "Go to snippet source")val awesomeFooBar: Foo with Bar =
  TypedActor(system).typedActorOf(TypedProps[FooBar]())

awesomeFooBar.doFoo(10)
val f = awesomeFooBar.doBar("yes")

TypedActor(system).poisonPill(awesomeFooBar)
```

## Typed Router pattern

Sometimes you want to spread messages between multiple actors. The easiest way to achieve this in Akka is to use a [Router](routing.html), which can implement a specific routing logic, such as `smallest-mailbox` or `consistent-hashing` etc.

Routers are not provided directly for typed actors, but it is really easy to leverage an untyped router and use a typed proxy in front of it. To showcase this let’s create typed actors that assign themselves some random `id`, so we know that in fact, the router has sent the message to different actors:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L69-L78 "Go to snippet source")trait HasName {
  def name(): String
}

class Named extends HasName {
  import scala.util.Random
  private val id = Random.nextInt(1024)

  def name(): String = "name-" + id
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L204-L215 "Go to snippet source")interface HasName {
  String name();
}

class Named implements HasName {
  private int id = new Random().nextInt(1024);

  @Override
  public String name() {
    return "name-" + id;
  }
}
```

In order to round robin among a few instances of such actors, you can create a plain untyped router, and then facade it with a `TypedActor` like shown in the example below. This works because typed actors communicate using the same mechanisms as normal actors, and methods calls on them get transformed into message sends of `MethodCall` messages.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/actor/TypedActorDocSpec.scala#L199-L217 "Go to snippet source")def namedActor(): HasName = TypedActor(system).typedActorOf(TypedProps[Named]())

// prepare routees
val routees: List[HasName] = List.fill(5) { namedActor() }
val routeePaths = routees.map { r =>
  TypedActor(system).getActorRefFor(r).path.toStringWithoutAddress
}

// prepare untyped router
val router: ActorRef = system.actorOf(RoundRobinGroup(routeePaths).props())

// prepare typed proxy, forwarding MethodCall messages to `router`
val typedRouter: HasName =
  TypedActor(system).typedActorOf(TypedProps[Named](), actorRef = router)

println("actor was: " + typedRouter.name()) // name-184
println("actor was: " + typedRouter.name()) // name-753
println("actor was: " + typedRouter.name()) // name-320
println("actor was: " + typedRouter.name()) // name-164
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/actor/TypedActorDocTest.java#L222-L247 "Go to snippet source")// prepare routees
TypedActorExtension typed = TypedActor.get(system);

Named named1 = typed.typedActorOf(new TypedProps<Named>(Named.class));

Named named2 = typed.typedActorOf(new TypedProps<Named>(Named.class));

List<Named> routees = new ArrayList<Named>();
routees.add(named1);
routees.add(named2);

List<String> routeePaths = new ArrayList<String>();
routeePaths.add(typed.getActorRefFor(named1).path().toStringWithoutAddress());
routeePaths.add(typed.getActorRefFor(named2).path().toStringWithoutAddress());

// prepare untyped router
ActorRef router = system.actorOf(new RoundRobinGroup(routeePaths).props(), "router");

// prepare typed proxy, forwarding MethodCall messages to `router`
Named typedRouter = typed.typedActorOf(new TypedProps<Named>(Named.class), router);

System.out.println("actor was: " + typedRouter.name()); // name-243
System.out.println("actor was: " + typedRouter.name()); // name-614
System.out.println("actor was: " + typedRouter.name()); // name-243
System.out.println("actor was: " + typedRouter.name()); // name-614

```

## Code Examples

### Example 1: The tools of the trade

```scala
import akka.actor.TypedActor

//Returns the Typed Actor Extension
val extension = TypedActor(system) //system is an instance of ActorSystem

//Returns whether the reference is a Typed Actor Proxy or not
TypedActor(system).isTypedActor(someReference)

//Returns the backing Akka Actor behind an external Typed Actor Proxy
TypedActor(system).getActorRefFor(someReference)

//Returns the current ActorContext,
// method only valid within methods of a TypedActor implementation
val c: ActorContext = TypedActor.context

//Returns the external proxy of the current Typed Actor,
// method only valid within methods of a TypedActor implementation
val s: Squarer = TypedActor.self[Squarer]

//Returns a contextual instance of the Typed Actor Extension
//this means that if you create other Typed Actors with this,
//they will become children to the current Typed Actor.
TypedActor(TypedActor.context)
```

### Example 2: The tools of the trade

```java
// Returns the Typed Actor Extension
TypedActorExtension extension =
    TypedActor.get(system); // system is an instance of ActorSystem

// Returns whether the reference is a Typed Actor Proxy or not
TypedActor.get(system).isTypedActor(someReference);

// Returns the backing Akka Actor behind an external Typed Actor Proxy
TypedActor.get(system).getActorRefFor(someReference);

// Returns the current ActorContext,
// method only valid within methods of a TypedActor implementation
ActorContext context = TypedActor.context();

// Returns the external proxy of the current Typed Actor,
// method only valid within methods of a TypedActor implementation
Squarer sq = TypedActor.<Squarer>self();

// Returns a contextual instance of the Typed Actor Extension
// this means that if you create other Typed Actors with this,
// they will become children to the current Typed Actor.
TypedActor.get(TypedActor.context());
```

### Example 3: Creating Typed Actors

```scala
import java.lang.String.{ valueOf => println }

import akka.actor.{ ActorContext, ActorRef, TypedActor, TypedProps }
import akka.routing.RoundRobinGroup
import akka.testkit._

import scala.concurrent.{ Await, Future }
import scala.concurrent.duration._
```

### Example 4: Creating Typed Actors

```java
import akka.actor.TypedActor;
import akka.actor.*;
import akka.japi.*;
import akka.dispatch.Futures;

import jdocs.AbstractJavaTest;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;
import java.util.concurrent.TimeUnit;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import akka.routing.RoundRobinGroup;
```

### Example 5: Creating Typed Actors

```scala
trait Squarer {
  def squareDontCare(i: Int): Unit //fire-forget

  def square(i: Int): Future[Int] //non-blocking send-request-reply

  def squareNowPlease(i: Int): Option[Int] //blocking send-request-reply

  def squareNow(i: Int): Int //blocking send-request-reply

  @throws(classOf[Exception]) //declare it or you will get an UndeclaredThrowableException
  def squareTry(i: Int): Int //blocking send-request-reply with possible exception
}
```

### Example 6: Creating Typed Actors

```java
static interface Squarer {
  void squareDontCare(int i); // fire-forget

  Future<Integer> square(int i); // non-blocking send-request-reply

  Option<Integer> squareNowPlease(int i); // blocking send-request-reply

  int squareNow(int i); // blocking send-request-reply
}
```

### Example 7: Creating Typed Actors

```scala
class SquarerImpl(val name: String) extends Squarer {

  def this() = this("default")
  def squareDontCare(i: Int): Unit = i * i //Nobody cares :(

  def square(i: Int): Future[Int] = Future.successful(i * i)

  def squareNowPlease(i: Int): Option[Int] = Some(i * i)

  def squareNow(i: Int): Int = i * i

  def squareTry(i: Int): Int = throw new Exception("Catch me!")
}
```

### Example 8: Creating Typed Actors

```java
class SquarerImpl implements Squarer {
  private String name;

  public SquarerImpl() {
    this.name = "default";
  }

  public SquarerImpl(String name) {
    this.name = name;
  }


  public void squareDontCare(int i) {
    int sq = i * i; // Nobody cares :(
  }

  public Future<Integer> square(int i) {
    return Futures.successful(i * i);
  }

  public Option<Integer> squareNowPlease(int i) {
    return Option.some(i * i);
  }

  public int squareNow(int i) {
    return i * i;
  }
}
```

### Example 9: Creating Typed Actors

```scala
val mySquarer: Squarer =
  TypedActor(system).typedActorOf(TypedProps[SquarerImpl]())
```

### Example 10: Creating Typed Actors

```java
Squarer mySquarer =
    TypedActor.get(system)
        .typedActorOf(new TypedProps<SquarerImpl>(Squarer.class, SquarerImpl.class));
```

### Example 11: Creating Typed Actors

```scala
val otherSquarer: Squarer =
  TypedActor(system).typedActorOf(TypedProps(classOf[Squarer], new SquarerImpl("foo")), "name")
```

### Example 12: Creating Typed Actors

```java
Squarer otherSquarer =
    TypedActor.get(system)
        .typedActorOf(
            new TypedProps<SquarerImpl>(
                Squarer.class,
                new Creator<SquarerImpl>() {
                  public SquarerImpl create() {
                    return new SquarerImpl("foo");
                  }
                }),
            "name");
```

### Example 13: Creating Typed Actors

```scala
trait Squarer {
  def squareDontCare(i: Int): Unit //fire-forget

  def square(i: Int): Future[Int] //non-blocking send-request-reply

  def squareNowPlease(i: Int): Option[Int] //blocking send-request-reply

  def squareNow(i: Int): Int //blocking send-request-reply

  @throws(classOf[Exception]) //declare it or you will get an UndeclaredThrowableException
  def squareTry(i: Int): Int //blocking send-request-reply with possible exception
}
```

### Example 14: Creating Typed Actors

```java
static interface Squarer {
  void squareDontCare(int i); // fire-forget

  Future<Integer> square(int i); // non-blocking send-request-reply

  Option<Integer> squareNowPlease(int i); // blocking send-request-reply

  int squareNow(int i); // blocking send-request-reply
}
```

### Example 15: Creating Typed Actors

```scala
class SquarerImpl(val name: String) extends Squarer {

  def this() = this("default")
  def squareDontCare(i: Int): Unit = i * i //Nobody cares :(

  def square(i: Int): Future[Int] = Future.successful(i * i)

  def squareNowPlease(i: Int): Option[Int] = Some(i * i)

  def squareNow(i: Int): Int = i * i

  def squareTry(i: Int): Int = throw new Exception("Catch me!")
}
```

### Example 16: Creating Typed Actors

```java
class SquarerImpl implements Squarer {
  private String name;

  public SquarerImpl() {
    this.name = "default";
  }

  public SquarerImpl(String name) {
    this.name = name;
  }


  public void squareDontCare(int i) {
    int sq = i * i; // Nobody cares :(
  }

  public Future<Integer> square(int i) {
    return Futures.successful(i * i);
  }

  public Option<Integer> squareNowPlease(int i) {
    return Option.some(i * i);
  }

  public int squareNow(int i) {
    return i * i;
  }
}
```

### Example 17: One-way message send

```scala
mySquarer.squareDontCare(10)
```

### Example 18: One-way message send

```java
mySquarer.squareDontCare(10);
```

### Example 19: Request-reply message send

```scala
val oSquare = mySquarer.squareNowPlease(10) //Option[Int]
```

### Example 20: Request-reply message send

```java
Option<Integer> oSquare = mySquarer.squareNowPlease(10); // Option[Int]
```

### Example 21: Request-reply message send

```scala
val iSquare = mySquarer.squareNow(10) //Int
```

### Example 22: Request-reply message send

```java
int iSquare = mySquarer.squareNow(10); // Int
```

### Example 23: Request-reply-with-future message send

```scala
val fSquare = mySquarer.square(10) //A Future[Int]
```

### Example 24: Request-reply-with-future message send

```java
Future<Integer> fSquare = mySquarer.square(10); // A Future[Int]
```

### Example 25: Stopping Typed Actors

```scala
TypedActor(system).stop(mySquarer)
```

### Example 26: Stopping Typed Actors

```java
TypedActor.get(system).stop(mySquarer);
```

### Example 27: Stopping Typed Actors

```scala
TypedActor(system).poisonPill(otherSquarer)
```

### Example 28: Stopping Typed Actors

```java
TypedActor.get(system).poisonPill(otherSquarer);
```

### Example 29: Typed Actor Hierarchies

```scala
//Inside your Typed Actor
val childSquarer: Squarer =
  TypedActor(TypedActor.context).typedActorOf(TypedProps[SquarerImpl]())
//Use "childSquarer" as a Squarer
```

### Example 30: Typed Actor Hierarchies

```java
Squarer childSquarer =
    TypedActor.get(TypedActor.context())
        .typedActorOf(new TypedProps<SquarerImpl>(Squarer.class, SquarerImpl.class));
// Use "childSquarer" as a Squarer
```

### Example 31: Lookup & Remoting

```scala
val typedActor: Foo with Bar =
  TypedActor(system).typedActorOf(TypedProps[FooBar], actorRefToRemoteActor)
//Use "typedActor" as a FooBar
```

### Example 32: Lookup & Remoting

```java
Squarer typedActor =
    TypedActor.get(system)
        .typedActorOf(new TypedProps<Squarer>(Squarer.class), actorRefToRemoteActor);
// Use "typedActor" as a FooBar
```

### Example 33: Supercharging

```scala
trait Foo {
  def doFoo(times: Int): Unit = println("doFoo(" + times + ")")
}

trait Bar {
  def doBar(str: String): Future[String] =
    Future.successful(str.toUpperCase)
}

class FooBar extends Foo with Bar
```

### Example 34: Supercharging

```scala
val awesomeFooBar: Foo with Bar =
  TypedActor(system).typedActorOf(TypedProps[FooBar]())

awesomeFooBar.doFoo(10)
val f = awesomeFooBar.doBar("yes")

TypedActor(system).poisonPill(awesomeFooBar)
```

### Example 35: Typed Router pattern

```scala
trait HasName {
  def name(): String
}

class Named extends HasName {
  import scala.util.Random
  private val id = Random.nextInt(1024)

  def name(): String = "name-" + id
}
```

### Example 36: Typed Router pattern

```java
interface HasName {
  String name();
}

class Named implements HasName {
  private int id = new Random().nextInt(1024);

  @Override
  public String name() {
    return "name-" + id;
  }
}
```

### Example 37: Typed Router pattern

```scala
def namedActor(): HasName = TypedActor(system).typedActorOf(TypedProps[Named]())

// prepare routees
val routees: List[HasName] = List.fill(5) { namedActor() }
val routeePaths = routees.map { r =>
  TypedActor(system).getActorRefFor(r).path.toStringWithoutAddress
}

// prepare untyped router
val router: ActorRef = system.actorOf(RoundRobinGroup(routeePaths).props())

// prepare typed proxy, forwarding MethodCall messages to `router`
val typedRouter: HasName =
  TypedActor(system).typedActorOf(TypedProps[Named](), actorRef = router)

println("actor was: " + typedRouter.name()) // name-184
println("actor was: " + typedRouter.name()) // name-753
println("actor was: " + typedRouter.name()) // name-320
println("actor was: " + typedRouter.name()) // name-164
```

### Example 38: Typed Router pattern

```java
// prepare routees
TypedActorExtension typed = TypedActor.get(system);

Named named1 = typed.typedActorOf(new TypedProps<Named>(Named.class));

Named named2 = typed.typedActorOf(new TypedProps<Named>(Named.class));

List<Named> routees = new ArrayList<Named>();
routees.add(named1);
routees.add(named2);

List<String> routeePaths = new ArrayList<String>();
routeePaths.add(typed.getActorRefFor(named1).path().toStringWithoutAddress());
routeePaths.add(typed.getActorRefFor(named2).path().toStringWithoutAddress());

// prepare untyped router
ActorRef router = system.actorOf(new RoundRobinGroup(routeePaths).props(), "router");

// prepare typed proxy, forwarding MethodCall messages to `router`
Named typedRouter = typed.typedActorOf(new TypedProps<Named>(Named.class), router);

System.out.println("actor was: " + typedRouter.name()); // name-243
System.out.println("actor was: " + typedRouter.name()); // name-614
System.out.println("actor was: " + typedRouter.name()); // name-243
System.out.println("actor was: " + typedRouter.name()); // name-614
```

## Related Pages (Internal Links)

- https://doc.akka.io/docs/misc/smli_tr-94-29.pdf
- https://doc.akka.io/libraries/akka-core/2.5/fault-tolerance.html
- https://doc.akka.io/libraries/akka-core/2.5/general/supervision.html
- https://doc.akka.io/libraries/akka-core/2.5/routing.html
- https://doc.akka.io/libraries/akka-core/2.5/typed/actors.html
- https://doc.akka.io/libraries/akka-core/2.5/typed/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.5/typed-actors.html](https://doc.akka.io/libraries/akka-core/2.5/typed-actors.html)*