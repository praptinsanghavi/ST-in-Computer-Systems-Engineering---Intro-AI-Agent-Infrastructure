---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:14:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSelection.html
title: ActorSelection
---

# ActorSelection

## Content

Package [akka.actor](package-summary.html)
## Class ActorSelection

- java.lang.Object
- - akka.actor.ActorSelection

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public abstract class ActorSelection
extends java.lang.Object
implements java.io.Serializable
```

An ActorSelection is a logical view of a section of an ActorSystem's tree of Actors,
 allowing for broadcasting of messages to that section.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorSelection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSelection](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `protected abstract [ActorRef](ActorRef.html "class in akka.actor")` | `[anchor](#anchor())()` |  |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[anchorPath](#anchorPath())()` | The [`ActorPath`](ActorPath.html "interface in akka.actor") of the anchor actor. |
	| `static [ActorSelection](ActorSelection.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef,java.lang.String))​([ActorRef](ActorRef.html "class in akka.actor") anchorRef,  java.lang.String path)` | Construct an ActorSelection from the given string representing a path  relative to the given target. |
	| `static [ActorSelection](ActorSelection.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef,scala.collection.Iterable))​([ActorRef](ActorRef.html "class in akka.actor") anchorRef,  scala.collection.Iterable<java.lang.String> elements)` | Construct an ActorSelection from the given string representing a path  relative to the given target. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `void` | `[forward](#forward(java.lang.Object,akka.actor.ActorContext))​(java.lang.Object message,  [ActorContext](ActorContext.html "interface in akka.actor") context)` | Forwards the message and passes the original sender actor as the sender. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `protected abstract scala.collection.immutable.IndexedSeq<[SelectionPathElement](SelectionPathElement.html "interface in akka.actor")>` | `[path](#path())()` |  |
	| `java.lang.String` | `[pathString](#pathString())()` | String representation of the path elements, starting with "/" and separated with "/". |
	| `scala.concurrent.Future<[ActorRef](ActorRef.html "class in akka.actor")>` | `[resolveOne](#resolveOne(akka.util.Timeout))​([Timeout](../util/Timeout.html "class in akka.util") timeout)` | Resolve the [`ActorRef`](ActorRef.html "class in akka.actor") matching this selection. |
	| `java.util.concurrent.CompletionStage<[ActorRef](ActorRef.html "class in akka.actor")>` | `[resolveOne](#resolveOne(java.time.Duration))​(java.time.Duration timeout)` | Java API for [`resolveOne(akka.util.Timeout)`](#resolveOne(akka.util.Timeout)) |
	| `scala.concurrent.Future<[ActorRef](ActorRef.html "class in akka.actor")>` | `[resolveOne](#resolveOne(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | Resolve the [`ActorRef`](ActorRef.html "class in akka.actor") matching this selection. |
	| `java.util.concurrent.CompletionStage<[ActorRef](ActorRef.html "class in akka.actor")>` | `[resolveOneCS](#resolveOneCS(java.time.Duration))​(java.time.Duration timeout)` | Deprecated. Use the overloaded method resolveOne which accepts java.time.Duration instead. |
	| `java.util.concurrent.CompletionStage<[ActorRef](ActorRef.html "class in akka.actor")>` | `[resolveOneCS](#resolveOneCS(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | Deprecated. Use the overloaded method resolveOne which accepts java.time.Duration instead. |
	| `void` | `[tell](#tell(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object msg,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Sends the specified message to this ActorSelection, i.e. |
	| `static [ScalaActorSelection](ScalaActorSelection.html "interface in akka.actor")` | `[toScala](#toScala(akka.actor.ActorSelection))​([ActorSelection](ActorSelection.html "class in akka.actor") sel)` |  |
	| `java.lang.String` | `[toSerializationFormat](#toSerializationFormat())()` | String representation of the actor selection suitable for storage and recreation. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorSelection
		
		
		
		```
		public ActorSelection()
		```

	- ### Method Detail
	
	
	
		- #### toScala
		
		
		
		```
		public static [ScalaActorSelection](ScalaActorSelection.html "interface in akka.actor") toScala​([ActorSelection](ActorSelection.html "class in akka.actor") sel)
		```
		- #### apply
		
		
		
		```
		public static [ActorSelection](ActorSelection.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") anchorRef,
		                                   java.lang.String path)
		```
		
		Construct an ActorSelection from the given string representing a path
		 relative to the given target. This operation has to create all the
		 matching magic, so it is preferable to cache its result if the
		 intention is to send messages frequently.
		- #### apply
		
		
		
		```
		public static [ActorSelection](ActorSelection.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") anchorRef,
		                                   scala.collection.Iterable<java.lang.String> elements)
		```
		
		Construct an ActorSelection from the given string representing a path
		 relative to the given target. This operation has to create all the
		 matching magic, so it is preferable to cache its result if the
		 intention is to send messages frequently.
		- #### anchor
		
		
		
		```
		protected abstract [ActorRef](ActorRef.html "class in akka.actor") anchor()
		```
		- #### path
		
		
		
		```
		protected abstract scala.collection.immutable.IndexedSeq<[SelectionPathElement](SelectionPathElement.html "interface in akka.actor")> path()
		```
		- #### tell
		
		
		
		```
		public void tell​(java.lang.Object msg,
		                 [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Sends the specified message to this ActorSelection, i.e. fire\-and\-forget
		 semantics, including the sender reference if possible.
		 
		 Pass [`ActorRef.noSender()`](ActorRef.html#noSender()) or `null` as sender if there is nobody to reply to
		- #### forward
		
		
		
		```
		public void forward​(java.lang.Object message,
		                    [ActorContext](ActorContext.html "interface in akka.actor") context)
		```
		
		Forwards the message and passes the original sender actor as the sender.
		 
		 Works, no matter whether originally sent with tell/'!' or ask/'?'.
		- #### resolveOne
		
		
		
		```
		public scala.concurrent.Future<[ActorRef](ActorRef.html "class in akka.actor")> resolveOne​([Timeout](../util/Timeout.html "class in akka.util") timeout)
		```
		
		Resolve the [`ActorRef`](ActorRef.html "class in akka.actor") matching this selection.
		 The result is returned as a Future that is completed with the [`ActorRef`](ActorRef.html "class in akka.actor")
		 if such an actor exists. It is completed with failure [`ActorNotFound`](ActorNotFound.html "class in akka.actor") if
		 no such actor exists or the identification didn't complete within the
		 supplied `timeout`.
		 
		 Under the hood it talks to the actor to verify its existence and acquire its
		 [`ActorRef`](ActorRef.html "class in akka.actor").
		- #### resolveOne
		
		
		
		```
		public scala.concurrent.Future<[ActorRef](ActorRef.html "class in akka.actor")> resolveOne​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Resolve the [`ActorRef`](ActorRef.html "class in akka.actor") matching this selection.
		 The result is returned as a Future that is completed with the [`ActorRef`](ActorRef.html "class in akka.actor")
		 if such an actor exists. It is completed with failure [`ActorNotFound`](ActorNotFound.html "class in akka.actor") if
		 no such actor exists or the identification didn't complete within the
		 supplied `timeout`.
		 
		 Under the hood it talks to the actor to verify its existence and acquire its
		 [`ActorRef`](ActorRef.html "class in akka.actor").
		- #### resolveOneCS
		
		
		
		```
		public java.util.concurrent.CompletionStage<[ActorRef](ActorRef.html "class in akka.actor")> resolveOneCS​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Deprecated.
		Use the overloaded method resolveOne which accepts java.time.Duration instead. Since 2\.5\.20\.
		
		Java API for [`resolveOne(akka.util.Timeout)`](#resolveOne(akka.util.Timeout))
		
		 Resolve the [`ActorRef`](ActorRef.html "class in akka.actor") matching this selection.
		 The result is returned as a CompletionStage that is completed with the [`ActorRef`](ActorRef.html "class in akka.actor")
		 if such an actor exists. It is completed with failure [`ActorNotFound`](ActorNotFound.html "class in akka.actor") if
		 no such actor exists or the identification didn't complete within the
		 supplied `timeout`.
		- #### resolveOneCS
		
		
		
		```
		public java.util.concurrent.CompletionStage<[ActorRef](ActorRef.html "class in akka.actor")> resolveOneCS​(java.time.Duration timeout)
		```
		
		Deprecated.
		Use the overloaded method resolveOne which accepts java.time.Duration instead. Since 2\.5\.20\.
		
		Java API for [`resolveOne(akka.util.Timeout)`](#resolveOne(akka.util.Timeout))
		
		 Resolve the [`ActorRef`](ActorRef.html "class in akka.actor") matching this selection.
		 The result is returned as a CompletionStage that is completed with the [`ActorRef`](ActorRef.html "class in akka.actor")
		 if such an actor exists. It is completed with failure [`ActorNotFound`](ActorNotFound.html "class in akka.actor") if
		 no such actor exists or the identification didn't complete within the
		 supplied `timeout`.
		- #### resolveOne
		
		
		
		```
		public java.util.concurrent.CompletionStage<[ActorRef](ActorRef.html "class in akka.actor")> resolveOne​(java.time.Duration timeout)
		```
		
		Java API for [`resolveOne(akka.util.Timeout)`](#resolveOne(akka.util.Timeout))
		
		 Resolve the [`ActorRef`](ActorRef.html "class in akka.actor") matching this selection.
		 The result is returned as a CompletionStage that is completed with the [`ActorRef`](ActorRef.html "class in akka.actor")
		 if such an actor exists. It is completed with failure [`ActorNotFound`](ActorNotFound.html "class in akka.actor") if
		 no such actor exists or the identification didn't complete within the
		 supplied `timeout`.
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### anchorPath
		
		
		
		```
		public [ActorPath](ActorPath.html "interface in akka.actor") anchorPath()
		```
		
		The [`ActorPath`](ActorPath.html "interface in akka.actor") of the anchor actor.
		- #### pathString
		
		
		
		```
		public java.lang.String pathString()
		```
		
		String representation of the path elements, starting with "/" and separated with "/".
		- #### toSerializationFormat
		
		
		
		```
		public java.lang.String toSerializationFormat()
		```
		
		String representation of the actor selection suitable for storage and recreation.
		 The output is similar to the URI fragment returned by [`ActorPath.toSerializationFormat()`](ActorPath.html#toSerializationFormat()).
		
		Returns:
		URI fragment
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorNotFound.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ScalaActorSelection.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/SelectionPathElement.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/util/Timeout.html
- https://doc.akka.io/japi/akka-core/2.6/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSelection.html](https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSelection.html)*