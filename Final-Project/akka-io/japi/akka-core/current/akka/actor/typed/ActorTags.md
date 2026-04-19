---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:49:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorTags.html
title: ActorTags
---

# ActorTags

## Content

Package [akka.actor.typed](package-summary.html)
## Class ActorTags

- java.lang.Object
- - [akka.actor.typed.Props](Props.html "class in akka.actor.typed")
	- - akka.actor.typed.ActorTags

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Direct Known Subclasses:
`[PropsImpl.ActorTagsImpl](internal/PropsImpl.ActorTagsImpl.html "class in akka.actor.typed.internal")`

---

```
public abstract class ActorTags
extends [Props](Props.html "class in akka.actor.typed")
```

Actor tags are used to logically group actors. The tags are included in logging as markers
 Especially useful for logging from functional style actors and since those may not have a clear logger class.
 
 Not for user extension.

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.ActorTags)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorTags](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ActorTags](ActorTags.html "class in akka.actor.typed")` | `[apply](#apply(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String tag,  scala.collection.immutable.Seq<java.lang.String> additionalTags)` | Scala API: create a tag props with one or more tags |
	| `static [ActorTags](ActorTags.html "class in akka.actor.typed")` | `[apply](#apply(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> tags)` | Scala API: create a multi\-tag props. |
	| `static [ActorTags](ActorTags.html "class in akka.actor.typed")` | `[create](#create(java.lang.String...))​(java.lang.String... tags)` | Java API: create a tag props with one or more tags |
	| `static [ActorTags](ActorTags.html "class in akka.actor.typed")` | `[create](#create(java.util.Set))​(java.util.Set<java.lang.String> tags)` | Java API: create a multi\-tag props |
	| `static [ActorTags](ActorTags.html "class in akka.actor.typed")` | `[create](#create(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> tags)` | Java API: create a tag props with one or more tags |
	| `java.util.Set<java.lang.String>` | `[getTags](#getTags())()` | Java API: one or more tags defined for the actor |
	| `abstract scala.collection.immutable.Set<java.lang.String>` | `[tags](#tags())()` | Scala API: one or more tags defined for the actor |
	
	
		- ### Methods inherited from class akka.actor.typed.[Props](Props.html "class in akka.actor.typed")
		
		
		`[empty](Props.html#empty()), [withDispatcherDefault](Props.html#withDispatcherDefault()), [withDispatcherFromConfig](Props.html#withDispatcherFromConfig(java.lang.String)), [withDispatcherSameAsParent](Props.html#withDispatcherSameAsParent()), [withMailboxFromConfig](Props.html#withMailboxFromConfig(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### ActorTags
		
		
		
		```
		public ActorTags()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [ActorTags](ActorTags.html "class in akka.actor.typed") create​(java.lang.String... tags)
		```
		
		Java API: create a tag props with one or more tags
		- #### create
		
		
		
		```
		public static [ActorTags](ActorTags.html "class in akka.actor.typed") create​(scala.collection.immutable.Seq<java.lang.String> tags)
		```
		
		Java API: create a tag props with one or more tags
		- #### create
		
		
		
		```
		public static [ActorTags](ActorTags.html "class in akka.actor.typed") create​(java.util.Set<java.lang.String> tags)
		```
		
		Java API: create a multi\-tag props
		 
		 Set must not be empty.
		- #### apply
		
		
		
		```
		public static [ActorTags](ActorTags.html "class in akka.actor.typed") apply​(java.lang.String tag,
		                              scala.collection.immutable.Seq<java.lang.String> additionalTags)
		```
		
		Scala API: create a tag props with one or more tags
		- #### apply
		
		
		
		```
		public static [ActorTags](ActorTags.html "class in akka.actor.typed") apply​(scala.collection.immutable.Set<java.lang.String> tags)
		```
		
		Scala API: create a multi\-tag props.
		 
		 Set must not be empty.
		- #### tags
		
		
		
		```
		public abstract scala.collection.immutable.Set<java.lang.String> tags()
		```
		
		Scala API: one or more tags defined for the actor
		
		Returns:
		- #### getTags
		
		
		
		```
		public java.util.Set<java.lang.String> getTags()
		```
		
		Java API: one or more tags defined for the actor

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorTags.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/internal/PropsImpl.ActorTagsImpl.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorTags.html](https://doc.akka.io/japi/akka-core/current/akka/actor/typed/ActorTags.html)*