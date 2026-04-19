---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:53:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/TestInbox.html
title: TestInbox
---

# TestInbox

## Content

Package [akka.actor.testkit.typed.scaladsl](package-summary.html)
## Interface TestInbox\<T\>

- ---

```
public interface TestInbox<T>
```

Utility for use as an `ActorRef` when \*synchronously\* testing [`Behavior`](../../../typed/Behavior.html "class in akka.actor.typed")
 with [`BehaviorTestKit`](BehaviorTestKit.html "interface in akka.actor.testkit.typed.scaladsl").
 
 If you plan to use a real [`ActorSystem`](../../../typed/ActorSystem.html "class in akka.actor.typed") then use [`TestProbe`](TestProbe.html "interface in akka.actor.testkit.typed.scaladsl")
 for asynchronous testing.
 

 Use factory `apply` in companion to create instances
 

 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[TestInbox](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl")<[T](TestInbox.html "type parameter in TestInbox")>` | `[expectMessage](#expectMessage(T))​([T](TestInbox.html "type parameter in TestInbox") expectedMessage)` | Assert and remove the the oldest message. |
	| `boolean` | `[hasMessages](#hasMessages())()` |  |
	| `scala.collection.immutable.Seq<[T](TestInbox.html "type parameter in TestInbox")>` | `[internalReceiveAll](#internalReceiveAll())()` |  |
	| `scala.collection.immutable.Seq<[T](TestInbox.html "type parameter in TestInbox")>` | `[receiveAll](#receiveAll())()` | Collect all messages in the inbox and clear it out |
	| `[T](TestInbox.html "type parameter in TestInbox")` | `[receiveMessage](#receiveMessage())()` | Get and remove the oldest message |
	| `[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](TestInbox.html "type parameter in TestInbox")>` | `[ref](#ref())()` | The actor ref of the inbox |

- - ### Method Detail
	
	
	
		- #### ref
		
		
		
		```
		[ActorRef](../../../typed/ActorRef.html "interface in akka.actor.typed")<[T](TestInbox.html "type parameter in TestInbox")> ref()
		```
		
		The actor ref of the inbox
		- #### receiveMessage
		
		
		
		```
		[T](TestInbox.html "type parameter in TestInbox") receiveMessage()
		```
		
		Get and remove the oldest message
		- #### expectMessage
		
		
		
		```
		[TestInbox](TestInbox.html "interface in akka.actor.testkit.typed.scaladsl")<[T](TestInbox.html "type parameter in TestInbox")> expectMessage​([T](TestInbox.html "type parameter in TestInbox") expectedMessage)
		```
		
		Assert and remove the the oldest message.
		- #### receiveAll
		
		
		
		```
		scala.collection.immutable.Seq<[T](TestInbox.html "type parameter in TestInbox")> receiveAll()
		```
		
		Collect all messages in the inbox and clear it out
		- #### internalReceiveAll
		
		
		
		```
		scala.collection.immutable.Seq<[T](TestInbox.html "type parameter in TestInbox")> internalReceiveAll()
		```
		- #### hasMessages
		
		
		
		```
		boolean hasMessages()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/BehaviorTestKit.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/TestInbox.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/TestProbe.html
- https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/TestInbox.html](https://doc.akka.io/japi/akka/current/akka/actor/testkit/typed/scaladsl/TestInbox.html)*