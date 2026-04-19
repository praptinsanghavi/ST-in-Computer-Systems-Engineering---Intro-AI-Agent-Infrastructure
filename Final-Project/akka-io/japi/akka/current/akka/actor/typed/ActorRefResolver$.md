---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:38:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRefResolver$.html
title: ActorRefResolver$
---

# ActorRefResolver$

## Content

Package [akka.actor.typed](package-summary.html)
## Class ActorRefResolver$

- java.lang.Object
- - [akka.actor.typed.ExtensionId](ExtensionId.html "class in akka.actor.typed")\<[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")\>
	- - akka.actor.typed.ActorRefResolver$

- ---

```
public class ActorRefResolver$
extends [ExtensionId](ExtensionId.html "class in akka.actor.typed")<[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorRefResolver$](ActorRefResolver$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorRefResolver$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")` | `[createExtension](#createExtension(akka.actor.typed.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)` | Create the extension, will be invoked at most one time per actor system where the extension is registered. |
	| `[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")` | `[get](#get(akka.actor.typed.ActorSystem))​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[ExtensionId](ExtensionId.html "class in akka.actor.typed")
		
		
		`[apply](ExtensionId.html#apply(akka.actor.typed.ActorSystem)), [equals](ExtensionId.html#equals(java.lang.Object)), [hashCode](ExtensionId.html#hashCode()), [id](ExtensionId.html#id())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorRefResolver$](ActorRefResolver$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorRefResolver$
		
		
		
		```
		public ActorRefResolver$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed") get​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		- #### createExtension
		
		
		
		```
		public [ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed") createExtension​([ActorSystem](ActorSystem.html "class in akka.actor.typed")<?> system)
		```
		
		Description copied from class: `[ExtensionId](ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))`
		Create the extension, will be invoked at most one time per actor system where the extension is registered.
		
		Specified by:
		`[createExtension](ExtensionId.html#createExtension(akka.actor.typed.ActorSystem))` in class `[ExtensionId](ExtensionId.html "class in akka.actor.typed")<[ActorRefResolver](ActorRefResolver.html "class in akka.actor.typed")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRefResolver$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRefResolver.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensionId.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRefResolver$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRefResolver$.html)*