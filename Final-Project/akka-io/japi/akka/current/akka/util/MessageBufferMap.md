---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/MessageBufferMap.html
title: MessageBufferMap
---

# MessageBufferMap

## Content

Package [akka.util](package-summary.html)
## Class MessageBufferMap\<I\>

- java.lang.Object
- - akka.util.MessageBufferMap\<I\>

- Type Parameters:
`I` \- (Id type)

---

```
public final class MessageBufferMap<I>
extends java.lang.Object
```

A non thread safe mutable message buffer map that can be used to buffer messages inside actors.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageBufferMap](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[add](#add(I))​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id)` | Add an id to the buffer map |
	| `void` | `[append](#append(I,java.lang.Object,akka.actor.ActorRef))​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id,  java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` | Append an element to the buffer for an id. |
	| `boolean` | `[contains](#contains(I))​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id)` | Check if the buffer map contains an id. |
	| `int` | `[drop](#drop(I,java.lang.String,akka.actor.ActorRef))​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id,  java.lang.String reason,  [ActorRef](../actor/ActorRef.html "class in akka.actor") deadLetters)` | Remove the buffer for an id, but publish a [`Dropped`](../actor/Dropped.html "class in akka.actor") for each dropped buffered message |
	| `void` | `[foreach](#foreach(scala.Function2))​(scala.Function2<[I](MessageBufferMap.html "type parameter in MessageBufferMap"),​[MessageBuffer](MessageBuffer.html "class in akka.util"),​scala.runtime.BoxedUnit> f)` | Iterate over all elements of the buffer map and apply a function to each element. |
	| `void` | `[forEach](#forEach(akka.japi.function.Procedure2))​([Procedure2](../japi/function/Procedure2.html "interface in akka.japi.function")<[I](MessageBufferMap.html "type parameter in MessageBufferMap"),​[MessageBuffer](MessageBuffer.html "class in akka.util")> f)` | Java API |
	| `[MessageBuffer](MessageBuffer.html "class in akka.util")` | `[getOrEmpty](#getOrEmpty(I))​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id)` | Get the message buffer for an id, or an empty buffer if the id doesn't exist in the map. |
	| `boolean` | `[isEmpty](#isEmpty())()` | Check if the buffer map is empty. |
	| `boolean` | `[nonEmpty](#nonEmpty())()` | Check if the buffer map is not empty. |
	| `void` | `[remove](#remove(I))​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id)` | Remove the buffer for an id. |
	| `int` | `[size](#size())()` | How many ids are in the buffer map. |
	| `int` | `[totalSize](#totalSize())()` | How many elements are in the buffers in the buffer map. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MessageBufferMap
		
		
		
		```
		public MessageBufferMap()
		```

	- ### Method Detail
	
	
	
		- #### add
		
		
		
		```
		public void add​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id)
		```
		
		Add an id to the buffer map
		- #### append
		
		
		
		```
		public void append​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id,
		                   java.lang.Object message,
		                   [ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		Append an element to the buffer for an id.
		 
		
		Parameters:
		`id` \- the id to add the element to
		`message` \- the message to buffer
		`ref` \- the actor to buffer
		- #### contains
		
		
		
		```
		public boolean contains​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id)
		```
		
		Check if the buffer map contains an id.
		 
		
		Parameters:
		`id` \- the id to check for
		Returns:
		if the buffer contains the given id
		- #### drop
		
		
		
		```
		public int drop​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id,
		                java.lang.String reason,
		                [ActorRef](../actor/ActorRef.html "class in akka.actor") deadLetters)
		```
		
		Remove the buffer for an id, but publish a [`Dropped`](../actor/Dropped.html "class in akka.actor") for each dropped buffered message
		
		Returns:
		how many buffered messages were dropped
		- #### forEach
		
		
		
		```
		public void forEach​([Procedure2](../japi/function/Procedure2.html "interface in akka.japi.function")<[I](MessageBufferMap.html "type parameter in MessageBufferMap"),​[MessageBuffer](MessageBuffer.html "class in akka.util")> f)
		```
		
		Java API
		 
		 Iterate over all elements of the buffer map and apply a function to each element.
		 
		
		
		
		Parameters:
		`f` \- the function to apply to each element
		- #### foreach
		
		
		
		```
		public void foreach​(scala.Function2<[I](MessageBufferMap.html "type parameter in MessageBufferMap"),​[MessageBuffer](MessageBuffer.html "class in akka.util"),​scala.runtime.BoxedUnit> f)
		```
		
		Iterate over all elements of the buffer map and apply a function to each element.
		 
		
		Parameters:
		`f` \- the function to apply to each element
		- #### getOrEmpty
		
		
		
		```
		public [MessageBuffer](MessageBuffer.html "class in akka.util") getOrEmpty​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id)
		```
		
		Get the message buffer for an id, or an empty buffer if the id doesn't exist in the map.
		 
		
		Parameters:
		`id` \- the id to get the message buffer for
		Returns:
		the message buffer for the given id or an empty buffer if the id doesn't exist
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		
		Check if the buffer map is empty.
		 
		
		Returns:
		if the buffer map is empty
		- #### nonEmpty
		
		
		
		```
		public boolean nonEmpty()
		```
		
		Check if the buffer map is not empty.
		 
		
		Returns:
		if the buffer map is not empty
		- #### remove
		
		
		
		```
		public void remove​([I](MessageBufferMap.html "type parameter in MessageBufferMap") id)
		```
		
		Remove the buffer for an id.
		 
		
		Parameters:
		`id` \- the id to remove the buffer for
		- #### size
		
		
		
		```
		public int size()
		```
		
		How many ids are in the buffer map.
		 
		
		Returns:
		the number of ids in the buffer map
		- #### totalSize
		
		
		
		```
		public int totalSize()
		```
		
		How many elements are in the buffers in the buffer map.
		 
		
		Returns:
		the number of elements in the buffers in the buffer map

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Dropped.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure2.html
- https://doc.akka.io/japi/akka/current/akka/util/MessageBuffer.html
- https://doc.akka.io/japi/akka/current/akka/util/MessageBufferMap.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/MessageBufferMap.html](https://doc.akka.io/japi/akka/current/akka/util/MessageBufferMap.html)*