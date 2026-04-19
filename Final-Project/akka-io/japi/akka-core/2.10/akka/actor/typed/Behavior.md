---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:36:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators$.html
title: Behavior.BehaviorDecorators$
---

# Behavior.BehaviorDecorators$

## Content

Package [akka.actor.typed](package-summary.html)
## Class Behavior.BehaviorDecorators$

- java.lang.Object
- - akka.actor.typed.Behavior.BehaviorDecorators$

- Enclosing class:
[Behavior](Behavior.html "class in akka.actor.typed")\<[T](Behavior.html "type parameter in Behavior")\>

---

```
public static class Behavior.BehaviorDecorators$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Behavior.BehaviorDecorators$](Behavior.BehaviorDecorators$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BehaviorDecorators$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Inner> boolean` | `[equals$extension](#equals$extension(akka.actor.typed.Behavior.BehaviorDecorators,java.lang.Object))​([Behavior.BehaviorDecorators](Behavior.BehaviorDecorators.html "class in akka.actor.typed")<Inner> $this,  java.lang.Object x$1)` |  |
	| `<Inner> int` | `[hashCode$extension](#hashCode$extension(akka.actor.typed.Behavior.BehaviorDecorators))​([Behavior.BehaviorDecorators](Behavior.BehaviorDecorators.html "class in akka.actor.typed")<Inner> $this)` |  |
	| `<Outer,​Inner>[Behavior](Behavior.html "class in akka.actor.typed")<Outer>` | `[transformMessages$extension](#transformMessages$extension(akka.actor.typed.Behavior.BehaviorDecorators,scala.PartialFunction,scala.reflect.ClassTag))​([Behavior.BehaviorDecorators](Behavior.BehaviorDecorators.html "class in akka.actor.typed")<Inner> $this,  scala.PartialFunction<Outer,​Inner> matcher,  scala.reflect.ClassTag<Outer> evidence$1)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Behavior.BehaviorDecorators$](Behavior.BehaviorDecorators$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BehaviorDecorators$
		
		
		
		```
		public BehaviorDecorators$()
		```

	- ### Method Detail
	
	
	
		- #### transformMessages$extension
		
		
		
		```
		public final <Outer,​Inner> [Behavior](Behavior.html "class in akka.actor.typed")<Outer> transformMessages$extension​([Behavior.BehaviorDecorators](Behavior.BehaviorDecorators.html "class in akka.actor.typed")<Inner> $this,
		                                                                             scala.PartialFunction<Outer,​Inner> matcher,
		                                                                             scala.reflect.ClassTag<Outer> evidence$1)
		```
		- #### hashCode$extension
		
		
		
		```
		public final <Inner> int hashCode$extension​([Behavior.BehaviorDecorators](Behavior.BehaviorDecorators.html "class in akka.actor.typed")<Inner> $this)
		```
		- #### equals$extension
		
		
		
		```
		public final <Inner> boolean equals$extension​([Behavior.BehaviorDecorators](Behavior.BehaviorDecorators.html "class in akka.actor.typed")<Inner> $this,
		                                              java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators$.html)*