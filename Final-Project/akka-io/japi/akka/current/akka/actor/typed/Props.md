---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
title: Props
---

# Props

## Content

Package [akka.actor.typed](package-summary.html)
## Class Props

- java.lang.Object
- - akka.actor.typed.Props

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Direct Known Subclasses:
`[ActorTags](ActorTags.html "class in akka.actor.typed")`, `[DispatcherSelector](DispatcherSelector.html "class in akka.actor.typed")`, `[MailboxSelector](MailboxSelector.html "class in akka.actor.typed")`, `[PropsImpl.EmptyProps$](internal/PropsImpl.EmptyProps$.html "class in akka.actor.typed.internal")`

---

```
public abstract class Props
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Data structure for describing an actor\&rsquo;s props details like which
 executor to run it on. For each type of setting (e.g. [`DispatcherSelector`](DispatcherSelector.html "class in akka.actor.typed"))
 the FIRST occurrence is used when creating the
 actor; this means that adding configuration using the "with" methods
 overrides what was configured previously.
 
 Deliberately not sealed in order to emphasize future extensibility by the
 framework—this is not intended to be extended by user code.
 

 Not for user extension.

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.Props)

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Props](Props.html "class in akka.actor.typed")` | `[empty](#empty())()` | Empty props instance, should seldom be needed in user code but can be useful as a default props where  custom configuration of an actor is possible. |
	| `[Props](Props.html "class in akka.actor.typed")` | `[withDispatcherDefault](#withDispatcherDefault())()` | Prepend a selection of the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") default executor to this Props. |
	| `[Props](Props.html "class in akka.actor.typed")` | `[withDispatcherFromConfig](#withDispatcherFromConfig(java.lang.String))​(java.lang.String path)` | Prepend a selection of the executor found at the given Config path to this Props. |
	| `[Props](Props.html "class in akka.actor.typed")` | `[withDispatcherSameAsParent](#withDispatcherSameAsParent())()` | Prepend a selection of the same executor as the parent actor to this Props. |
	| `[Props](Props.html "class in akka.actor.typed")` | `[withMailboxFromConfig](#withMailboxFromConfig(java.lang.String))​(java.lang.String path)` | Prepend a selection of the mailbox found at the given Config path to this Props. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static [Props](Props.html "class in akka.actor.typed") empty()
		```
		
		Empty props instance, should seldom be needed in user code but can be useful as a default props where
		 custom configuration of an actor is possible.
		- #### withDispatcherDefault
		
		
		
		```
		public [Props](Props.html "class in akka.actor.typed") withDispatcherDefault()
		```
		
		Prepend a selection of the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") default executor to this Props.
		- #### withDispatcherFromConfig
		
		
		
		```
		public [Props](Props.html "class in akka.actor.typed") withDispatcherFromConfig​(java.lang.String path)
		```
		
		Prepend a selection of the executor found at the given Config path to this Props.
		 The path is relative to the configuration root of the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") that looks up the
		 executor.
		- #### withDispatcherSameAsParent
		
		
		
		```
		public [Props](Props.html "class in akka.actor.typed") withDispatcherSameAsParent()
		```
		
		Prepend a selection of the same executor as the parent actor to this Props.
		- #### withMailboxFromConfig
		
		
		
		```
		public [Props](Props.html "class in akka.actor.typed") withMailboxFromConfig​(java.lang.String path)
		```
		
		Prepend a selection of the mailbox found at the given Config path to this Props.
		 The path is relative to the configuration root of the [`ActorSystem`](ActorSystem.html "class in akka.actor.typed") that looks up the
		 mailbox.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorTags.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/DispatcherSelector.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/MailboxSelector.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/PropsImpl.EmptyProps$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html)*