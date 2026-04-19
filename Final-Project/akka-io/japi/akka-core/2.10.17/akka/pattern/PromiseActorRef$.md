---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:46:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/PromiseActorRef$.html
title: PromiseActorRef$
---

# PromiseActorRef$

## Content

Package [akka.pattern](package-summary.html)
## Class PromiseActorRef$

- java.lang.Object
- - akka.pattern.PromiseActorRef$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class PromiseActorRef$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.pattern.PromiseActorRef$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PromiseActorRef$](PromiseActorRef$.html "class in akka.pattern")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PromiseActorRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.pattern.PromiseActorRef` | `[apply](#apply(akka.actor.ActorRefProvider,akka.util.Timeout,java.lang.Object,java.lang.String,java.lang.String,akka.actor.ActorRef,scala.Function1))​([ActorRefProvider](../actor/ActorRefProvider.html "interface in akka.actor") provider,  [Timeout](../util/Timeout.html "class in akka.util") timeout,  java.lang.Object targetName,  java.lang.String messageClassName,  java.lang.String refPathPrefix,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,  scala.Function1<java.lang.String,​java.lang.Throwable> onTimeout)` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[apply$default$6](#apply$default$6())()` |  |
	| `scala.Function1<java.lang.String,​java.lang.Throwable>` | `[apply$default$7](#apply$default$7())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PromiseActorRef$](PromiseActorRef$.html "class in akka.pattern") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PromiseActorRef$
		
		
		
		```
		public PromiseActorRef$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.pattern.PromiseActorRef apply​([ActorRefProvider](../actor/ActorRefProvider.html "interface in akka.actor") provider,
		                                          [Timeout](../util/Timeout.html "class in akka.util") timeout,
		                                          java.lang.Object targetName,
		                                          java.lang.String messageClassName,
		                                          java.lang.String refPathPrefix,
		                                          [ActorRef](../actor/ActorRef.html "class in akka.actor") sender,
		                                          scala.Function1<java.lang.String,​java.lang.Throwable> onTimeout)
		```
		- #### apply$default$6
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public scala.Function1<java.lang.String,​java.lang.Throwable> apply$default$7()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRefProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/PromiseActorRef$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Timeout.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/PromiseActorRef$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/pattern/PromiseActorRef$.html)*