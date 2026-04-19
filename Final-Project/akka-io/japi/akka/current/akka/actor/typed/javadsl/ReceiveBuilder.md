---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ReceiveBuilder.Case$.html
title: ReceiveBuilder.Case$
---

# ReceiveBuilder.Case$

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class ReceiveBuilder.Case$

- java.lang.Object
- - akka.actor.typed.javadsl.ReceiveBuilder.Case$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")\<[T](ReceiveBuilder.html "type parameter in ReceiveBuilder")\>

---

```
public static class ReceiveBuilder.Case$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.javadsl.ReceiveBuilder.Case$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReceiveBuilder.Case$](ReceiveBuilder.Case$.html "class in akka.actor.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Case$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<BT,​MT>akka.actor.typed.javadsl.ReceiveBuilder.Case<BT,​MT>` | `[apply](#apply(%3Cany%3E,%3Cany%3E,akka.japi.function.Function))​(<any> type,  <any> test,  [Function](../../../japi/function/Function.html "interface in akka.japi.function")<MT,​[Behavior](../Behavior.html "class in akka.actor.typed")<BT>> handler)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<BT,​MT>scala.Option<scala.Tuple3<<any>,​<any>,​[Function](../../../japi/function/Function.html "interface in akka.japi.function")<MT,​[Behavior](../Behavior.html "class in akka.actor.typed")<BT>>>>` | `[unapply](#unapply(akka.actor.typed.javadsl.ReceiveBuilder.Case))​(akka.actor.typed.javadsl.ReceiveBuilder.Case<BT,​MT> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReceiveBuilder.Case$](ReceiveBuilder.Case$.html "class in akka.actor.typed.javadsl") MODULE$
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
		public <BT,​MT> akka.actor.typed.javadsl.ReceiveBuilder.Case<BT,​MT> apply​(<any> type,
		                                                                                     <any> test,
		                                                                                     [Function](../../../japi/function/Function.html "interface in akka.japi.function")<MT,​[Behavior](../Behavior.html "class in akka.actor.typed")<BT>> handler)
		```
		- #### unapply
		
		
		
		```
		public <BT,​MT> scala.Option<scala.Tuple3<<any>,​<any>,​[Function](../../../japi/function/Function.html "interface in akka.japi.function")<MT,​[Behavior](../Behavior.html "class in akka.actor.typed")<BT>>>> unapply​(akka.actor.typed.javadsl.ReceiveBuilder.Case<BT,​MT> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ReceiveBuilder.Case$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ReceiveBuilder.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ReceiveBuilder.Case$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ReceiveBuilder.Case$.html)*