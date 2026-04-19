---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:59:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorContextImpl.LoggingContext$.html
title: ActorContextImpl.LoggingContext$
---

# ActorContextImpl.LoggingContext$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class ActorContextImpl.LoggingContext$

- java.lang.Object
- - akka.actor.typed.internal.ActorContextImpl.LoggingContext$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing interface:
[ActorContextImpl](ActorContextImpl.html "interface in akka.actor.typed.internal")\<[T](ActorContextImpl.html "type parameter in ActorContextImpl")\>

---

```
public static class ActorContextImpl.LoggingContext$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.ActorContextImpl.LoggingContext$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorContextImpl.LoggingContext$](ActorContextImpl.LoggingContext$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LoggingContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal")` | `[apply](#apply(org.slf4j.Logger,java.lang.String,java.lang.String,java.lang.String,java.lang.String,boolean))​(org.slf4j.Logger logger,  java.lang.String tagsString,  java.lang.String akkaSource,  java.lang.String sourceActorSystem,  java.lang.String akkaAddress,  boolean hasCustomName)` |  |
	| `[ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal")` | `[apply](#apply(org.slf4j.Logger,scala.collection.immutable.Set,akka.actor.typed.internal.ActorContextImpl))​(org.slf4j.Logger logger,  scala.collection.immutable.Set<java.lang.String> tags,  [ActorContextImpl](ActorContextImpl.html "interface in akka.actor.typed.internal")<?> ctx)` |  |
	| `scala.Option<scala.Tuple6<org.slf4j.Logger,​java.lang.String,​java.lang.String,​java.lang.String,​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.actor.typed.internal.ActorContextImpl.LoggingContext))​([ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorContextImpl.LoggingContext$](ActorContextImpl.LoggingContext$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LoggingContext$
		
		
		
		```
		public LoggingContext$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") apply​(org.slf4j.Logger logger,
		                                             scala.collection.immutable.Set<java.lang.String> tags,
		                                             [ActorContextImpl](ActorContextImpl.html "interface in akka.actor.typed.internal")<?> ctx)
		```
		- #### apply
		
		
		
		```
		public [ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") apply​(org.slf4j.Logger logger,
		                                             java.lang.String tagsString,
		                                             java.lang.String akkaSource,
		                                             java.lang.String sourceActorSystem,
		                                             java.lang.String akkaAddress,
		                                             boolean hasCustomName)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple6<org.slf4j.Logger,​java.lang.String,​java.lang.String,​java.lang.String,​java.lang.String,​java.lang.Object>> unapply​([ActorContextImpl.LoggingContext](ActorContextImpl.LoggingContext.html "class in akka.actor.typed.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorContextImpl.LoggingContext$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorContextImpl.LoggingContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorContextImpl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorContextImpl.LoggingContext$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ActorContextImpl.LoggingContext$.html)*