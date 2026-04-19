---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:33:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html
title: StashBuffer
---

# StashBuffer

## Content

Package [akka.actor.typed.scaladsl](package-summary.html)
## Interface StashBuffer\<T\>

- ---

```
public interface StashBuffer<T>
```

A non thread safe mutable message buffer that can be used to buffer messages inside actors
 and then unstash them.
 
 The buffer can hold at most the given `capacity` number of messages.
 

 Not for user extension.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `int` | `[capacity](#capacity())()` | What is the capacity of this buffer. |
	| `void` | `[clear](#clear())()` | Removes all messages from the buffer. |
	| `<U> boolean` | `[contains](#contains(U))​(U message)` | Tests whether this [`StashBuffer`](StashBuffer.html "interface in akka.actor.typed.scaladsl") contains a given message. |
	| `boolean` | `[exists](#exists(scala.Function1))​(scala.Function1<[T](StashBuffer.html "type parameter in StashBuffer"),​java.lang.Object> predicate)` | Tests whether a predicate holds for at least one element of this [`StashBuffer`](StashBuffer.html "interface in akka.actor.typed.scaladsl"). |
	| `void` | `[foreach](#foreach(scala.Function1))​(scala.Function1<[T](StashBuffer.html "type parameter in StashBuffer"),​scala.runtime.BoxedUnit> f)` | Iterate over all elements of the buffer and apply a function to each element,  without removing them. |
	| `[T](StashBuffer.html "type parameter in StashBuffer")` | `[head](#head())()` | Return the first element of the message buffer without removing it. |
	| `boolean` | `[isEmpty](#isEmpty())()` | Check if the message buffer is empty. |
	| `boolean` | `[isFull](#isFull())()` |  |
	| `boolean` | `[nonEmpty](#nonEmpty())()` | Check if the message buffer is not empty. |
	| `int` | `[size](#size())()` | How many elements are in the message buffer. |
	| `[StashBuffer](StashBuffer.html "interface in akka.actor.typed.scaladsl")<[T](StashBuffer.html "type parameter in StashBuffer")>` | `[stash](#stash(T))​([T](StashBuffer.html "type parameter in StashBuffer") message)` | Add one element to the end of the message buffer. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")>` | `[unstash](#unstash(akka.actor.typed.Behavior,int,scala.Function1))​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")> behavior,  int numberOfMessages,  scala.Function1<[T](StashBuffer.html "type parameter in StashBuffer"),​[T](StashBuffer.html "type parameter in StashBuffer")> wrap)` | Transition to the given `behavior` and process `numberOfMessages` of the stashed messages. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")>` | `[unstashAll](#unstashAll(akka.actor.typed.Behavior))​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")> behavior)` | Transition to the given `behavior` and process all stashed messages. |

- - ### Method Detail
	
	
	
		- #### isEmpty
		
		
		
		```
		boolean isEmpty()
		```
		
		Check if the message buffer is empty.
		 
		
		Returns:
		if the buffer is empty
		- #### nonEmpty
		
		
		
		```
		boolean nonEmpty()
		```
		
		Check if the message buffer is not empty.
		 
		
		Returns:
		if the buffer is not empty
		- #### size
		
		
		
		```
		int size()
		```
		
		How many elements are in the message buffer.
		 
		
		Returns:
		the number of elements in the message buffer
		- #### capacity
		
		
		
		```
		int capacity()
		```
		
		What is the capacity of this buffer.
		 
		
		Returns:
		the capacity of this buffer
		- #### isFull
		
		
		
		```
		boolean isFull()
		```
		
		
		Returns:
		`true` if no more messages can be added, i.e. size equals the capacity of the stash buffer
		- #### stash
		
		
		
		```
		[StashBuffer](StashBuffer.html "interface in akka.actor.typed.scaladsl")<[T](StashBuffer.html "type parameter in StashBuffer")> stash​([T](StashBuffer.html "type parameter in StashBuffer") message)
		```
		
		Add one element to the end of the message buffer.
		 
		
		Parameters:
		`message` \- the message to buffer
		Returns:
		this message buffer
		- #### head
		
		
		
		```
		[T](StashBuffer.html "type parameter in StashBuffer") head()
		```
		
		Return the first element of the message buffer without removing it.
		 
		
		Returns:
		the first element or throws `NoSuchElementException` if the buffer is empty
		- #### foreach
		
		
		
		```
		void foreach​(scala.Function1<[T](StashBuffer.html "type parameter in StashBuffer"),​scala.runtime.BoxedUnit> f)
		```
		
		Iterate over all elements of the buffer and apply a function to each element,
		 without removing them.
		 
		
		Parameters:
		`f` \- the function to apply to each element
		- #### contains
		
		
		
		```
		<U> boolean contains​(U message)
		```
		
		Tests whether this [`StashBuffer`](StashBuffer.html "interface in akka.actor.typed.scaladsl") contains a given message.
		 
		
		Parameters:
		`message` \- the message to test
		Returns:
		true if the buffer contains the message, false otherwise.
		- #### exists
		
		
		
		```
		boolean exists​(scala.Function1<[T](StashBuffer.html "type parameter in StashBuffer"),​java.lang.Object> predicate)
		```
		
		Tests whether a predicate holds for at least one element of this [`StashBuffer`](StashBuffer.html "interface in akka.actor.typed.scaladsl").
		 
		
		Parameters:
		`predicate` \- the predicate used to test
		Returns:
		true if the predicate holds for at least one message, false otherwise.
		- #### clear
		
		
		
		```
		void clear()
		```
		
		Removes all messages from the buffer.
		- #### unstashAll
		
		
		
		```
		[Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")> unstashAll​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")> behavior)
		```
		
		Transition to the given `behavior` and process all stashed messages.
		 Messages will be processed in the same order they arrived.
		 The `StashBuffer` will be empty after processing all messages,
		 unless an exception is thrown or messages are stashed while unstashing.
		 
		 If an exception is thrown by processing a message a proceeding messages
		 and the message causing the exception have been removed from the
		 `StashBuffer`, but unprocessed messages remain.
		 
		
		
		 It's allowed to stash messages while unstashing. Those newly added
		 messages will not be processed by this call and have to be unstashed
		 in another call.
		 
		
		
		 The `behavior` passed to `unstashAll` must not be `unhandled`.
		- #### unstash
		
		
		
		```
		[Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")> unstash​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")> behavior,
		                    int numberOfMessages,
		                    scala.Function1<[T](StashBuffer.html "type parameter in StashBuffer"),​[T](StashBuffer.html "type parameter in StashBuffer")> wrap)
		```
		
		Transition to the given `behavior` and process `numberOfMessages` of the stashed messages.
		 The messages will be processed in the same order they arrived.
		 
		 The purpose of this method, compared to `unstashAll` is to unstash a limited
		 number of messages and then send a message to `self` before continuing unstashing
		 more. That means that other new messages may arrive in\-between and those must
		 be stashed to keep the original order of messages. To differentiate between
		 unstashed and new incoming messages the unstashed messages can be wrapped
		 in another message with the `wrap`.
		 
		
		
		 If an exception is thrown by processing a message a proceeding messages
		 and the message causing the exception have been removed from the
		 `StashBuffer`, but unprocessed messages remain.
		 
		
		
		 It's allowed to stash messages while unstashing. Those newly added
		 messages will not be processed by this call and have to be unstashed
		 in another call.
		 
		
		
		 The `behavior` passed to `unstash` must not be `unhandled`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/StashBuffer.html)*