---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:11:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestInbox.html
title: TestInbox
---

# TestInbox

## Content

Package [akka.actor.testkit.typed.javadsl](package-summary.html)
## Class TestInbox\<T\>

- java.lang.Object
- - akka.actor.testkit.typed.javadsl.TestInbox\<T\>

- ---

```
public abstract class TestInbox<T>
extends java.lang.Object
```

Utility for use as an `ActorRef` when \*synchronously\* testing [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed")
 with [`BehaviorTestKit`](BehaviorTestKit.html "class in akka.actor.testkit.typed.javadsl").
 
 If you plan to use a real [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") then use [`TestProbe`](TestProbe.html "class in akka.actor.testkit.typed.javadsl")
 for asynchronous testing.
 

 Use `TestInbox.create` factory methods to create instances
 

 Not for user extension

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestInbox](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<T>` | `[create](#create())()` |  |
	| `static <T> [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<T>` | `[create](#create(java.lang.String))​(java.lang.String name)` |  |
	| `abstract [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<[T](TestInbox.html "type parameter in TestInbox")>` | `[expectMessage](#expectMessage(T))​([T](TestInbox.html "type parameter in TestInbox") expectedMessage)` | Assert and remove the the oldest message. |
	| `java.util.List<[T](TestInbox.html "type parameter in TestInbox")>` | `[getAllReceived](#getAllReceived())()` | Collect all messages in the inbox and clear it out |
	| `abstract [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](TestInbox.html "type parameter in TestInbox")>` | `[getRef](#getRef())()` | The actor ref of the inbox |
	| `abstract boolean` | `[hasMessages](#hasMessages())()` |  |
	| `protected abstract scala.collection.immutable.Seq<[T](TestInbox.html "type parameter in TestInbox")>` | `[internalReceiveAll](#internalReceiveAll())()` |  |
	| `abstract [T](TestInbox.html "type parameter in TestInbox")` | `[receiveMessage](#receiveMessage())()` | Get and remove the oldest message |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TestInbox
		
		
		
		```
		public TestInbox()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <T> [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<T> create​(java.lang.String name)
		```
		- #### create
		
		
		
		```
		public static <T> [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<T> create()
		```
		- #### getRef
		
		
		
		```
		public abstract [ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](TestInbox.html "type parameter in TestInbox")> getRef()
		```
		
		The actor ref of the inbox
		- #### receiveMessage
		
		
		
		```
		public abstract [T](TestInbox.html "type parameter in TestInbox") receiveMessage()
		```
		
		Get and remove the oldest message
		- #### expectMessage
		
		
		
		```
		public abstract [TestInbox](TestInbox.html "class in akka.actor.testkit.typed.javadsl")<[T](TestInbox.html "type parameter in TestInbox")> expectMessage​([T](TestInbox.html "type parameter in TestInbox") expectedMessage)
		```
		
		Assert and remove the the oldest message.
		- #### getAllReceived
		
		
		
		```
		public java.util.List<[T](TestInbox.html "type parameter in TestInbox")> getAllReceived()
		```
		
		Collect all messages in the inbox and clear it out
		- #### internalReceiveAll
		
		
		
		```
		protected abstract scala.collection.immutable.Seq<[T](TestInbox.html "type parameter in TestInbox")> internalReceiveAll()
		```
		- #### hasMessages
		
		
		
		```
		public abstract boolean hasMessages()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestInbox.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestProbe.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestInbox.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/testkit/typed/javadsl/TestInbox.html)*