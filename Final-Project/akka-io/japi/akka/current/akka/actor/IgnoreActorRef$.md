---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:50:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/IgnoreActorRef$.html
title: IgnoreActorRef$
---

# IgnoreActorRef$

## Content

Package [akka.actor](package-summary.html)
## Class IgnoreActorRef$

- java.lang.Object
- - akka.actor.IgnoreActorRef$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class IgnoreActorRef$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.IgnoreActorRef$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [IgnoreActorRef$](IgnoreActorRef$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IgnoreActorRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isIgnoreRefPath](#isIgnoreRefPath(akka.actor.ActorPath))​([ActorPath](ActorPath.html "interface in akka.actor") otherPath)` | Check if the passed `otherPath` is the same as IgnoreActorRef.path |
	| `boolean` | `[isIgnoreRefPath](#isIgnoreRefPath(java.lang.String))​(java.lang.String otherPath)` | Check if the passed `otherPath` is the same as IgnoreActorRef.path |
	| `[ActorPath](ActorPath.html "interface in akka.actor")` | `[path](#path())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [IgnoreActorRef$](IgnoreActorRef$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### IgnoreActorRef$
		
		
		
		```
		public IgnoreActorRef$()
		```

	- ### Method Detail
	
	
	
		- #### path
		
		
		
		```
		public [ActorPath](ActorPath.html "interface in akka.actor") path()
		```
		- #### isIgnoreRefPath
		
		
		
		```
		public boolean isIgnoreRefPath​(java.lang.String otherPath)
		```
		
		Check if the passed `otherPath` is the same as IgnoreActorRef.path
		- #### isIgnoreRefPath
		
		
		
		```
		public boolean isIgnoreRefPath​([ActorPath](ActorPath.html "interface in akka.actor") otherPath)
		```
		
		Check if the passed `otherPath` is the same as IgnoreActorRef.path

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka/current/akka/actor/IgnoreActorRef$.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/IgnoreActorRef$.html](https://doc.akka.io/japi/akka/current/akka/actor/IgnoreActorRef$.html)*