---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorMdc$.html
title: ActorMdc$
---

# ActorMdc$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class ActorMdc$

- java.lang.Object
- - akka.actor.typed.internal.ActorMdc$

- ---

```
public class ActorMdc$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorMdc$](ActorMdc$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorMdc$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[AkkaAddressKey](#AkkaAddressKey())()` |  |
	| `java.lang.String` | `[AkkaSourceKey](#AkkaSourceKey())()` |  |
	| `java.lang.String` | `[AkkaTagsKey](#AkkaTagsKey())()` |  |
	| `void` | `[clearMdc](#clearMdc())()` |  |
	| `void` | `[setMdc](#setMdc(akka.actor.typed.internal.ActorContextImpl.LoggingContext))​([ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") context)` |  |
	| `java.lang.String` | `[SourceActorSystemKey](#SourceActorSystemKey())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorMdc$](ActorMdc$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorMdc$
		
		
		
		```
		public ActorMdc$()
		```

	- ### Method Detail
	
	
	
		- #### SourceActorSystemKey
		
		
		
		```
		public java.lang.String SourceActorSystemKey()
		```
		- #### AkkaSourceKey
		
		
		
		```
		public java.lang.String AkkaSourceKey()
		```
		- #### AkkaTagsKey
		
		
		
		```
		public java.lang.String AkkaTagsKey()
		```
		- #### AkkaAddressKey
		
		
		
		```
		public java.lang.String AkkaAddressKey()
		```
		- #### setMdc
		
		
		
		```
		public void setMdc​([ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") context)
		```
		- #### clearMdc
		
		
		
		```
		public void clearMdc()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorContextImpl.LoggingContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorMdc$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorMdc$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ActorMdc$.html)*