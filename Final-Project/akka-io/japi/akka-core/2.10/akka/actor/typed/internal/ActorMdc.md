---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorMdc.html
title: ActorMdc
---

# ActorMdc

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class ActorMdc

- java.lang.Object
- - akka.actor.typed.internal.ActorMdc

- ---

```
public class ActorMdc
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorMdc](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[AkkaAddressKey](#AkkaAddressKey())()` |  |
	| `static java.lang.String` | `[AkkaSourceKey](#AkkaSourceKey())()` |  |
	| `static java.lang.String` | `[AkkaTagsKey](#AkkaTagsKey())()` |  |
	| `static void` | `[clearMdc](#clearMdc())()` |  |
	| `static void` | `[setMdc](#setMdc(akka.actor.typed.internal.ActorContextImpl.LoggingContext))​([ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") context)` |  |
	| `static java.lang.String` | `[SourceActorSystemKey](#SourceActorSystemKey())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorMdc
		
		
		
		```
		public ActorMdc()
		```

	- ### Method Detail
	
	
	
		- #### SourceActorSystemKey
		
		
		
		```
		public static java.lang.String SourceActorSystemKey()
		```
		- #### AkkaSourceKey
		
		
		
		```
		public static java.lang.String AkkaSourceKey()
		```
		- #### AkkaTagsKey
		
		
		
		```
		public static java.lang.String AkkaTagsKey()
		```
		- #### AkkaAddressKey
		
		
		
		```
		public static java.lang.String AkkaAddressKey()
		```
		- #### setMdc
		
		
		
		```
		public static void setMdc​([ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") context)
		```
		- #### clearMdc
		
		
		
		```
		public static void clearMdc()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorContextImpl.LoggingContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorMdc.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorMdc.html)*