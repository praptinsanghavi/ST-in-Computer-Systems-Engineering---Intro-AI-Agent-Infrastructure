---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/AbstractFSM$.html
title: AbstractFSM$
---

# AbstractFSM$

## Content

Package [akka.actor](package-summary.html)
## Class AbstractFSM$

- java.lang.Object
- - akka.actor.AbstractFSM$

- ---

```
public class AbstractFSM$
extends java.lang.Object
```

Java API: compatible with lambda expressions

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AbstractFSM$](AbstractFSM$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractFSM$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<S,​D>scala.PartialFunction<S,​D>` | `[NullFunction](#NullFunction())()` | A partial function value which does not match anything and can be used to  \&ldquo;reset\&rdquo; `whenUnhandled` and `onTermination` handlers. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AbstractFSM$](AbstractFSM$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AbstractFSM$
		
		
		
		```
		public AbstractFSM$()
		```

	- ### Method Detail
	
	
	
		- #### NullFunction
		
		
		
		```
		public <S,​D> scala.PartialFunction<S,​D> NullFunction()
		```
		
		A partial function value which does not match anything and can be used to
		 \&ldquo;reset\&rdquo; `whenUnhandled` and `onTermination` handlers.
		 
		
		
		
		```
		
		 onTermination(FSM.NullFunction())
		 
		```

## Code Examples

### Example 1: NullFunction

```text
onTermination(FSM.NullFunction())
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/AbstractFSM$.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/AbstractFSM$.html](https://doc.akka.io/japi/akka/current/akka/actor/AbstractFSM$.html)*