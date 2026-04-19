---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:38:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorTags$.html
title: ActorTags$
---

# ActorTags$

## Content

Package [akka.actor.typed](package-summary.html)
## Class ActorTags$

- java.lang.Object
- - akka.actor.typed.ActorTags$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ActorTags$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.ActorTags$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorTags$](ActorTags$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorTags$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorTags](ActorTags.html "class in akka.actor.typed")` | `[apply](#apply(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String tag,  scala.collection.immutable.Seq<java.lang.String> additionalTags)` | Scala API: create a tag props with one or more tags |
	| `[ActorTags](ActorTags.html "class in akka.actor.typed")` | `[apply](#apply(scala.collection.immutable.Set))​(scala.collection.immutable.Set<java.lang.String> tags)` | Scala API: create a multi\-tag props. |
	| `[ActorTags](ActorTags.html "class in akka.actor.typed")` | `[create](#create(java.lang.String...))​(java.lang.String... tags)` | Java API: create a tag props with one or more tags |
	| `[ActorTags](ActorTags.html "class in akka.actor.typed")` | `[create](#create(java.util.Set))​(java.util.Set<java.lang.String> tags)` | Java API: create a multi\-tag props |
	| `[ActorTags](ActorTags.html "class in akka.actor.typed")` | `[create](#create(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> tags)` | Java API: create a tag props with one or more tags |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorTags$](ActorTags$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorTags$
		
		
		
		```
		public ActorTags$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [ActorTags](ActorTags.html "class in akka.actor.typed") create​(java.lang.String... tags)
		```
		
		Java API: create a tag props with one or more tags
		- #### create
		
		
		
		```
		public [ActorTags](ActorTags.html "class in akka.actor.typed") create​(scala.collection.immutable.Seq<java.lang.String> tags)
		```
		
		Java API: create a tag props with one or more tags
		- #### create
		
		
		
		```
		public [ActorTags](ActorTags.html "class in akka.actor.typed") create​(java.util.Set<java.lang.String> tags)
		```
		
		Java API: create a multi\-tag props
		 
		 Set must not be empty.
		- #### apply
		
		
		
		```
		public [ActorTags](ActorTags.html "class in akka.actor.typed") apply​(java.lang.String tag,
		                       scala.collection.immutable.Seq<java.lang.String> additionalTags)
		```
		
		Scala API: create a tag props with one or more tags
		- #### apply
		
		
		
		```
		public [ActorTags](ActorTags.html "class in akka.actor.typed") apply​(scala.collection.immutable.Set<java.lang.String> tags)
		```
		
		Scala API: create a multi\-tag props.
		 
		 Set must not be empty.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorTags$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorTags.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorTags$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorTags$.html)*