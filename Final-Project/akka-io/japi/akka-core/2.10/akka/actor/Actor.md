---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:26:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.ignoringBehavior$.html
title: Actor.ignoringBehavior$
---

# Actor.ignoringBehavior$

## Content

Package [akka.actor](package-summary.html)
## Class Actor.ignoringBehavior$

- java.lang.Object
- - akka.actor.Actor.ignoringBehavior$

- All Implemented Interfaces:
`scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit>`, `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>`

Enclosing interface:
[Actor](Actor.html "interface in akka.actor")

---

```
public static class Actor.ignoringBehavior$
extends java.lang.Object
implements scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>
```

ignoringBehavior is a Receive\-expression that consumes and ignores all messages.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`
		- ### Nested classes/interfaces inherited from interface scala.PartialFunction
		
		
		`scala.PartialFunction.ElementWiseExtractor<A extends java.lang.Object,​B extends java.lang.Object>, scala.PartialFunction.ElementWiseExtractor$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ignoringBehavior$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(java.lang.Object))​(java.lang.Object x)` |  |
	| `boolean` | `[isDefinedAt](#isDefinedAt(java.lang.Object))​(java.lang.Object x)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`
		- ### Methods inherited from interface scala.PartialFunction
		
		
		`andThen, andThen, applyOrElse, compose, elementWise, lift, orElse, runWith, unapply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ignoringBehavior$
		
		
		
		```
		public ignoringBehavior$()
		```

	- ### Method Detail
	
	
	
		- #### isDefinedAt
		
		
		
		```
		public boolean isDefinedAt​(java.lang.Object x)
		```
		
		
		Specified by:
		`isDefinedAt` in interface `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>`
		- #### apply
		
		
		
		```
		public void apply​(java.lang.Object x)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.ignoringBehavior$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.ignoringBehavior$.html)*