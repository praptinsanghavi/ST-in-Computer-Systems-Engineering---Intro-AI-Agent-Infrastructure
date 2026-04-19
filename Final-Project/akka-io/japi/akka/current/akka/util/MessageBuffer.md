---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/MessageBuffer.html
title: MessageBuffer
---

# MessageBuffer

## Content

Package [akka.util](package-summary.html)
## Class MessageBuffer

- java.lang.Object
- - akka.util.MessageBuffer

- ---

```
public final class MessageBuffer
extends java.lang.Object
```

A non thread safe mutable message buffer that can be used to buffer messages inside actors.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageBuffer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MessageBuffer](MessageBuffer.html "class in akka.util")` | `[append](#append(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` | Add one element to the end of the message buffer. |
	| `void` | `[dropHead](#dropHead())()` | Remove the first element of the message buffer. |
	| `static [MessageBuffer](MessageBuffer.html "class in akka.util")` | `[empty](#empty())()` | Create an empty message buffer. |
	| `void` | `[foreach](#foreach(scala.Function2))​(scala.Function2<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> f)` | Iterate over all elements of the buffer and apply a function to each element. |
	| `void` | `[forEach](#forEach(akka.japi.function.Procedure2))​([Procedure2](../japi/function/Procedure2.html "interface in akka.japi.function")<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor")> f)` | Java API |
	| `[Pair](../japi/Pair.html "class in akka.japi")<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[getHead](#getHead())()` | Java API |
	| `scala.Tuple2<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[head](#head())()` | Return the first element of the message buffer. |
	| `boolean` | `[isEmpty](#isEmpty())()` | Check if the message buffer is empty. |
	| `boolean` | `[nonEmpty](#nonEmpty())()` | Check if the message buffer is not empty. |
	| `int` | `[size](#size())()` | How many elements are in the message buffer. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MessageBuffer
		
		
		
		```
		public MessageBuffer()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static [MessageBuffer](MessageBuffer.html "class in akka.util") empty()
		```
		
		Create an empty message buffer.
		 
		
		Returns:
		an empty message buffer
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		
		Check if the message buffer is empty.
		 
		
		Returns:
		if the buffer is empty
		- #### nonEmpty
		
		
		
		```
		public boolean nonEmpty()
		```
		
		Check if the message buffer is not empty.
		 
		
		Returns:
		if the buffer is not empty
		- #### size
		
		
		
		```
		public int size()
		```
		
		How many elements are in the message buffer.
		 
		
		Returns:
		the number of elements in the message buffer
		- #### append
		
		
		
		```
		public [MessageBuffer](MessageBuffer.html "class in akka.util") append​(java.lang.Object message,
		                            [ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		Add one element to the end of the message buffer.
		 
		
		Parameters:
		`message` \- the message to buffer
		`ref` \- the actor to buffer
		Returns:
		this message buffer
		- #### dropHead
		
		
		
		```
		public void dropHead()
		```
		
		Remove the first element of the message buffer.
		- #### head
		
		
		
		```
		public scala.Tuple2<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor")> head()
		```
		
		Return the first element of the message buffer.
		 
		
		Returns:
		the first element or an element containing null if the buffer is empty
		- #### getHead
		
		
		
		```
		public [Pair](../japi/Pair.html "class in akka.japi")<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor")> getHead()
		```
		
		Java API
		 
		 Return the first element of the message buffer.
		 
		
		
		
		Returns:
		the first element or an element containing null if the buffer is empty
		- #### foreach
		
		
		
		```
		public void foreach​(scala.Function2<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​scala.runtime.BoxedUnit> f)
		```
		
		Iterate over all elements of the buffer and apply a function to each element.
		 
		
		Parameters:
		`f` \- the function to apply to each element
		- #### forEach
		
		
		
		```
		public void forEach​([Procedure2](../japi/function/Procedure2.html "interface in akka.japi.function")<java.lang.Object,​[ActorRef](../actor/ActorRef.html "class in akka.actor")> f)
		```
		
		Java API
		 
		 Iterate over all elements of the buffer and apply a function to each element.
		 
		
		
		
		Parameters:
		`f` \- the function to apply to each element

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure2.html
- https://doc.akka.io/japi/akka/current/akka/util/MessageBuffer.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/MessageBuffer.html](https://doc.akka.io/japi/akka/current/akka/util/MessageBuffer.html)*