---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/StashBuffer.html
title: StashBuffer
---

# StashBuffer

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
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
	| `boolean` | `[anyMatch](#anyMatch(java.util.function.Predicate))​(java.util.function.Predicate<[T](StashBuffer.html "type parameter in StashBuffer")> predicate)` | Tests whether a predicate holds for at least one element of this [`StashBuffer`](StashBuffer.html "interface in akka.actor.typed.javadsl"). |
	| `int` | `[capacity](#capacity())()` | What is the capacity of this buffer. |
	| `void` | `[clear](#clear())()` | Removes all messages from the buffer. |
	| `<U> boolean` | `[contains](#contains(U))​(U message)` | Tests whether this [`StashBuffer`](StashBuffer.html "interface in akka.actor.typed.javadsl") contains a given message. |
	| `void` | `[forEach](#forEach(akka.japi.function.Procedure))​([Procedure](../../../japi/function/Procedure.html "interface in akka.japi.function")<[T](StashBuffer.html "type parameter in StashBuffer")> f)` | Iterate over all elements of the buffer and apply a function to each element,  without removing them. |
	| `[T](StashBuffer.html "type parameter in StashBuffer")` | `[head](#head())()` | Return the first element of the message buffer without removing it. |
	| `boolean` | `[isEmpty](#isEmpty())()` | Check if the message buffer is empty. |
	| `boolean` | `[isFull](#isFull())()` |  |
	| `boolean` | `[nonEmpty](#nonEmpty())()` | Check if the message buffer is not empty. |
	| `int` | `[size](#size())()` | How many elements are in the message buffer. |
	| `[StashBuffer](StashBuffer.html "interface in akka.actor.typed.javadsl")<[T](StashBuffer.html "type parameter in StashBuffer")>` | `[stash](#stash(T))​([T](StashBuffer.html "type parameter in StashBuffer") message)` | Add one element to the end of the message buffer. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")>` | `[unstash](#unstash(akka.actor.typed.Behavior,int,java.util.function.Function))​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")> behavior,  int numberOfMessages,  java.util.function.Function<[T](StashBuffer.html "type parameter in StashBuffer"),​[T](StashBuffer.html "type parameter in StashBuffer")> wrap)` | Transition to the given `behavior` and process `numberOfMessages` of the stashed messages. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")>` | `[unstashAll](#unstashAll(akka.actor.typed.Behavior))​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")> behavior)` | Transition to the given `behavior` and process all stashed messages. |

- - ### Method Detail
	
	
	
		- #### anyMatch
		
		
		
		```
		boolean anyMatch​(java.util.function.Predicate<[T](StashBuffer.html "type parameter in StashBuffer")> predicate)
		```
		
		Tests whether a predicate holds for at least one element of this [`StashBuffer`](StashBuffer.html "interface in akka.actor.typed.javadsl").
		 
		
		Parameters:
		`predicate` \- the predicate used to test
		Returns:
		true if the predicate holds for at least one message, false otherwise.
		- #### capacity
		
		
		
		```
		int capacity()
		```
		
		What is the capacity of this buffer.
		 
		
		Returns:
		the capacity of this buffer
		- #### clear
		
		
		
		```
		void clear()
		```
		
		Removes all messages from the buffer.
		- #### contains
		
		
		
		```
		<U> boolean contains​(U message)
		```
		
		Tests whether this [`StashBuffer`](StashBuffer.html "interface in akka.actor.typed.javadsl") contains a given message.
		 
		
		Parameters:
		`message` \- the message to test
		Returns:
		true if the buffer contains the message, false otherwise.
		- #### forEach
		
		
		
		```
		void forEach​([Procedure](../../../japi/function/Procedure.html "interface in akka.japi.function")<[T](StashBuffer.html "type parameter in StashBuffer")> f)
		```
		
		Iterate over all elements of the buffer and apply a function to each element,
		 without removing them.
		 
		
		Parameters:
		`f` \- the function to apply to each element
		- #### head
		
		
		
		```
		[T](StashBuffer.html "type parameter in StashBuffer") head()
		```
		
		Return the first element of the message buffer without removing it.
		 
		
		Returns:
		the first element or throws `NoSuchElementException` if the buffer is empty
		- #### isEmpty
		
		
		
		```
		boolean isEmpty()
		```
		
		Check if the message buffer is empty.
		 
		
		Returns:
		if the buffer is empty
		- #### isFull
		
		
		
		```
		boolean isFull()
		```
		
		
		Returns:
		`true` if no more messages can be added, i.e. size equals the capacity of the stash buffer
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
		- #### stash
		
		
		
		```
		[StashBuffer](StashBuffer.html "interface in akka.actor.typed.javadsl")<[T](StashBuffer.html "type parameter in StashBuffer")> stash​([T](StashBuffer.html "type parameter in StashBuffer") message)
		```
		
		Add one element to the end of the message buffer.
		 
		[`StashOverflowException`](StashOverflowException.html "class in akka.actor.typed.javadsl") is thrown if the buffer [`isFull()`](#isFull()).
		 
		
		
		
		Parameters:
		`message` \- the message to buffer
		Returns:
		this message buffer
		- #### unstash
		
		
		
		```
		[Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")> unstash​([Behavior](../Behavior.html "class in akka.actor.typed")<[T](StashBuffer.html "type parameter in StashBuffer")> behavior,
		                    int numberOfMessages,
		                    java.util.function.Function<[T](StashBuffer.html "type parameter in StashBuffer"),​[T](StashBuffer.html "type parameter in StashBuffer")> wrap)
		```
		
		Transition to the given `behavior` and process `numberOfMessages` of the stashed messages.
		 The messages will be processed in the same order they arrived.
		 
		 The purpose of this method, compared to `unstashAll`, is to unstash a limited
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/StashBuffer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/StashOverflowException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Procedure.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/StashBuffer.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/StashBuffer.html)*