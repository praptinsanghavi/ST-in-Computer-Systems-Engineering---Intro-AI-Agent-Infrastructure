---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:12:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/IndirectActorProducer$.html
title: IndirectActorProducer$
---

# IndirectActorProducer$

## Content

Package [akka.actor](package-summary.html)
## Class IndirectActorProducer$

- java.lang.Object
- - akka.actor.IndirectActorProducer$

- ---

```
public class IndirectActorProducer$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [IndirectActorProducer$](IndirectActorProducer$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IndirectActorProducer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[IndirectActorProducer](IndirectActorProducer.html "interface in akka.actor")` | `[apply](#apply(java.lang.Class,scala.collection.immutable.Seq))​(java.lang.Class<?> clazz,  scala.collection.immutable.Seq<java.lang.Object> args)` |  |
	| `java.lang.Class<akka.actor.CreatorConsumer>` | `[CreatorConsumerClass](#CreatorConsumerClass())()` |  |
	| `java.lang.Class<akka.actor.CreatorFunctionConsumer>` | `[CreatorFunctionConsumerClass](#CreatorFunctionConsumerClass())()` |  |
	| `java.lang.Class<akka.actor.TypedCreatorFunctionConsumer>` | `[TypedCreatorFunctionConsumerClass](#TypedCreatorFunctionConsumerClass())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [IndirectActorProducer$](IndirectActorProducer$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### IndirectActorProducer$
		
		
		
		```
		public IndirectActorProducer$()
		```

	- ### Method Detail
	
	
	
		- #### CreatorFunctionConsumerClass
		
		
		
		```
		public java.lang.Class<akka.actor.CreatorFunctionConsumer> CreatorFunctionConsumerClass()
		```
		- #### CreatorConsumerClass
		
		
		
		```
		public java.lang.Class<akka.actor.CreatorConsumer> CreatorConsumerClass()
		```
		- #### TypedCreatorFunctionConsumerClass
		
		
		
		```
		public java.lang.Class<akka.actor.TypedCreatorFunctionConsumer> TypedCreatorFunctionConsumerClass()
		```
		- #### apply
		
		
		
		```
		public [IndirectActorProducer](IndirectActorProducer.html "interface in akka.actor") apply​(java.lang.Class<?> clazz,
		                                   scala.collection.immutable.Seq<java.lang.Object> args)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/IndirectActorProducer$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/IndirectActorProducer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/IndirectActorProducer$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/IndirectActorProducer$.html)*