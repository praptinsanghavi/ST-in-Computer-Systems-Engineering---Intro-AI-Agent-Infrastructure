---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/BehaviorBuilder.Case$.html
title: BehaviorBuilder.Case$
---

# BehaviorBuilder.Case$

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class BehaviorBuilder.Case$

- java.lang.Object
- - akka.actor.typed.javadsl.BehaviorBuilder.Case$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[BehaviorBuilder](BehaviorBuilder.html "class in akka.actor.typed.javadsl")\<[T](BehaviorBuilder.html "type parameter in BehaviorBuilder")\>

---

```
public static class BehaviorBuilder.Case$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.javadsl.BehaviorBuilder.Case$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BehaviorBuilder.Case$](BehaviorBuilder.Case$.html "class in akka.actor.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Case$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<BT,​MT>akka.actor.typed.javadsl.BehaviorBuilder.Case<BT,​MT>` | `[apply](#apply(%3Cany%3E,%3Cany%3E,akka.japi.function.Function))​(<any> type,  <any> test,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<MT,​[Behavior](../Behavior.html "class in akka.actor.typed")<BT>> handler)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<BT,​MT>scala.Option<scala.Tuple3<<any>,​<any>,​[Function](../../../japi/function/Function.html "interface in akka.japi.function")<MT,​[Behavior](../Behavior.html "class in akka.actor.typed")<BT>>>>` | `[unapply](#unapply(akka.actor.typed.javadsl.BehaviorBuilder.Case))​(akka.actor.typed.javadsl.BehaviorBuilder.Case<BT,​MT> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BehaviorBuilder.Case$](BehaviorBuilder.Case$.html "class in akka.actor.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Case$
		
		
		
		```
		public Case$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <BT,​MT> akka.actor.typed.javadsl.BehaviorBuilder.Case<BT,​MT> apply​(<any> type,
		                                                                                      <any> test,
		                                                                                      [Function](../../../japi/function/Function.html "interface in akka.japi.function")<MT,​[Behavior](../Behavior.html "class in akka.actor.typed")<BT>> handler)
		```
		- #### unapply
		
		
		
		```
		public <BT,​MT> scala.Option<scala.Tuple3<<any>,​<any>,​[Function](../../../japi/function/Function.html "interface in akka.japi.function")<MT,​[Behavior](../Behavior.html "class in akka.actor.typed")<BT>>>> unapply​(akka.actor.typed.javadsl.BehaviorBuilder.Case<BT,​MT> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/BehaviorBuilder.Case$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/BehaviorBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/BehaviorBuilder.Case$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/BehaviorBuilder.Case$.html)*