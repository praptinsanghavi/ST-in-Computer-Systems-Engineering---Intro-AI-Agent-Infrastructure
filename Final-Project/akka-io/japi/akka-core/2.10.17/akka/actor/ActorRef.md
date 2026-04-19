---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
title: ActorRef
---

# ActorRef

## Content

Package [akka.actor](package-summary.html)
## Class ActorRef

- java.lang.Object
- - akka.actor.ActorRef

- All Implemented Interfaces:
`java.io.Serializable`, `java.lang.Comparable<[ActorRef](ActorRef.html "class in akka.actor")>`

Direct Known Subclasses:
`[Nobody$](Nobody$.html "class in akka.actor")`

---

```
public abstract class ActorRef
extends java.lang.Object
implements java.lang.Comparable<[ActorRef](ActorRef.html "class in akka.actor")>, java.io.Serializable
```

Immutable and serializable handle to an actor, which may or may not reside
 on the local host or inside the same [`ActorSystem`](ActorSystem.html "class in akka.actor"). An ActorRef
 can be obtained from an [`ActorRefFactory`](ActorRefFactory.html "interface in akka.actor"), an interface which
 is implemented by ActorSystem and [`ActorContext`](ActorContext.html "interface in akka.actor"). This means
 actors can be created top\-level in the ActorSystem or as children of an
 existing actor, but only from within that actor.
 
 ActorRefs can be freely shared among actors by message passing. Message
 passing conversely is their only purpose, as demonstrated in the following
 examples:
 

 Scala:
 

```

 import akka.pattern.ask
 import scala.concurrent.Await

 class ExampleActor extends Actor {
   val other = context.actorOf(Props[OtherActor], "childName") // will be destroyed and re-created upon restart by default

   def receive {
     case Request1(msg) => other ! refine(msg)     // uses this actor as sender reference, reply goes to us
     case Request2(msg) => other.tell(msg, sender()) // forward sender reference, enabling direct reply
     case Request3(msg) =>
       implicit val timeout = Timeout(5.seconds)
       (other ? msg) pipeTo sender()
       // the ask call will get a future from other's reply
       // when the future is complete, send its value to the original sender
   }
 }
 
```

 Java:
 

```

 import static akka.pattern.Patterns.ask;
 import static akka.pattern.Patterns.pipe;

 public class ExampleActor extends AbstractActor {
   // this child will be destroyed and re-created upon restart by default
   final ActorRef other = getContext().actorOf(Props.create(OtherActor.class), "childName");
   @Override
   public Receive createReceive() {
     return receiveBuilder()
       .match(Request1.class, msg ->
         // uses this actor as sender reference, reply goes to us
         other.tell(msg, getSelf()))
       .match(Request2.class, msg ->
         // forward sender reference, enabling direct reply
         other.tell(msg, getSender()))
       .match(Request3.class, msg ->
         // the ask call will get a future from other's reply
         // when the future is complete, send its value to the original sender
         pipe(ask(other, msg, 5000), context().dispatcher()).to(getSender()))
       .build();
   }
 }
 
```

 ActorRef does not have a method for terminating the actor it points to, use
 [`ActorRefFactory`](ActorRefFactory.html "interface in akka.actor")`.stop(ref)`, or send a [`PoisonPill`](PoisonPill.html "class in akka.actor"),
 for this purpose.
 

 Two actor references are compared equal when they have the same path and point to
 the same actor incarnation. A reference pointing to a terminated actor doesn't compare
 equal to a reference pointing to another (re\-created) actor with the same path.
 

 If you need to keep track of actor references in a collection and do not care
 about the exact actor incarnation you can use the ActorPath as key because
 the unique id of the actor is not taken into account when comparing actor paths.
 

 Not for user extension

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorRef)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorRef](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract void` | `[$bang](#$bang(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Scala API: Sends a one\-way asynchronous message. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[$bang$default$2](#$bang$default$2(java.lang.Object))​(java.lang.Object message)` |  |
	| `int` | `[compareTo](#compareTo(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") other)` | Comparison takes path and the unique id of the actor cell into account. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` | Equals takes path and the unique id of the actor cell into account. |
	| `void` | `[forward](#forward(java.lang.Object,akka.actor.ActorContext))​(java.lang.Object message,  [ActorContext](ActorContext.html "interface in akka.actor") context)` | Forwards the message and passes the original sender actor as the sender. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `static [ActorRef](ActorRef.html "class in akka.actor")` | `[noSender](#noSender())()` | Use this value as an argument to [`tell(java.lang.Object, akka.actor.ActorRef)`](#tell(java.lang.Object,akka.actor.ActorRef)) if there is not actor to  reply to (e.g. |
	| `abstract [ActorPath](ActorPath.html "interface in akka.actor")` | `[path](#path())()` | Returns the path for this actor (from this actor up to the root actor). |
	| `void` | `[tell](#tell(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object msg,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Sends the specified message to this ActorRef, i.e. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorRef
		
		
		
		```
		public ActorRef()
		```

	- ### Method Detail
	
	
	
		- #### noSender
		
		
		
		```
		public static final [ActorRef](ActorRef.html "class in akka.actor") noSender()
		```
		
		Use this value as an argument to [`tell(java.lang.Object, akka.actor.ActorRef)`](#tell(java.lang.Object,akka.actor.ActorRef)) if there is not actor to
		 reply to (e.g. when sending from non\-actor code).
		- #### path
		
		
		
		```
		public abstract [ActorPath](ActorPath.html "interface in akka.actor") path()
		```
		
		Returns the path for this actor (from this actor up to the root actor).
		- #### compareTo
		
		
		
		```
		public final int compareTo​([ActorRef](ActorRef.html "class in akka.actor") other)
		```
		
		Comparison takes path and the unique id of the actor cell into account.
		
		Specified by:
		`compareTo` in interface `java.lang.Comparable<[ActorRef](ActorRef.html "class in akka.actor")>`
		- #### tell
		
		
		
		```
		public final void tell​(java.lang.Object msg,
		                       [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Sends the specified message to this ActorRef, i.e. fire\-and\-forget
		 semantics, including the sender reference if possible.
		 
		 Pass [`ActorRef`](ActorRef.html "class in akka.actor") `noSender` or `null` as sender if there is nobody to reply to
		- #### $bang
		
		
		
		```
		public abstract void $bang​(java.lang.Object message,
		                           [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Scala API: Sends a one\-way asynchronous message. E.g. fire\-and\-forget semantics.
		 
		
		 If invoked from within an actor then the actor reference is implicitly passed on as the implicit 'sender' argument.
		 
		
		
		
		 This actor 'sender' reference is then available in the receiving actor in the 'sender()' member variable,
		 if invoked from within an Actor. If not then no sender is available.
		 
		
		
		```
		
		   actor ! message
		 
		```
		- #### forward
		
		
		
		```
		public void forward​(java.lang.Object message,
		                    [ActorContext](ActorContext.html "interface in akka.actor") context)
		```
		
		Forwards the message and passes the original sender actor as the sender.
		 
		 Works, no matter whether originally sent with tell/'!' or ask/'?'.
		- #### hashCode
		
		
		
		```
		public final int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public final boolean equals​(java.lang.Object that)
		```
		
		Equals takes path and the unique id of the actor cell into account.
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### $bang$default$2
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") $bang$default$2​(java.lang.Object message)
		```

## Code Examples

### Example 1: Class ActorRef

```text
import akka.pattern.ask
 import scala.concurrent.Await

 class ExampleActor extends Actor {
   val other = context.actorOf(Props[OtherActor], "childName") // will be destroyed and re-created upon restart by default

   def receive {
     case Request1(msg) => other ! refine(msg)     // uses this actor as sender reference, reply goes to us
     case Request2(msg) => other.tell(msg, sender()) // forward sender reference, enabling direct reply
     case Request3(msg) =>
       implicit val timeout = Timeout(5.seconds)
       (other ? msg) pipeTo sender()
       // the ask call will get a future from other's reply
       // when the future is complete, send its value to the original sender
   }
 }
```

### Example 2: Class ActorRef

```text
import static akka.pattern.Patterns.ask;
 import static akka.pattern.Patterns.pipe;

 public class ExampleActor extends AbstractActor {
   // this child will be destroyed and re-created upon restart by default
   final ActorRef other = getContext().actorOf(Props.create(OtherActor.class), "childName");
   @Override
   public Receive createReceive() {
     return receiveBuilder()
       .match(Request1.class, msg ->
         // uses this actor as sender reference, reply goes to us
         other.tell(msg, getSelf()))
       .match(Request2.class, msg ->
         // forward sender reference, enabling direct reply
         other.tell(msg, getSender()))
       .match(Request3.class, msg ->
         // the ask call will get a future from other's reply
         // when the future is complete, send its value to the original sender
         pipe(ask(other, msg, 5000), context().dispatcher()).to(getSender()))
       .build();
   }
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Nobody$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html)*