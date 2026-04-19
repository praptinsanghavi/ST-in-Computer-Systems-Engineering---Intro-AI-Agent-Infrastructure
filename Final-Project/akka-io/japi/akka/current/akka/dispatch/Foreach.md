---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/Foreach.html
title: Foreach
---

# Foreach

## Content

Package [akka.dispatch](package-summary.html)
## Class Foreach\<T\>

- java.lang.Object
- - [akka.dispatch.japi.UnitFunctionBridge](japi.UnitFunctionBridge.html "class in akka.dispatch")\<T\>
	- - akka.dispatch.Foreach\<T\>

- All Implemented Interfaces:
`scala.Function1<T,​scala.runtime.BoxedUnit>`

---

```
public abstract class Foreach<T>
extends [japi.UnitFunctionBridge](japi.UnitFunctionBridge.html "class in akka.dispatch")<T>
```

Callback for the Future.foreach operation that will be invoked if the Future that this callback
 is registered on becomes completed with a success. This method is essentially the same operation
 as onSuccess.
 
 SAM (Single Abstract Method) class
 Java API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Foreach](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract void` | `[each](#each(T))​([T](Foreach.html "type parameter in Foreach") result)` | This method will be invoked once when/if a Future that this callback is registered on  becomes successfully completed |
	| `void` | `[internal](#internal(T))​([T](Foreach.html "type parameter in Foreach") t)` |  |
	
	
		- ### Methods inherited from class akka.dispatch.[japi.UnitFunctionBridge](japi.UnitFunctionBridge.html "class in akka.dispatch")
		
		
		`[apply](japi.UnitFunctionBridge.html#apply(T)), [apply$mcLD$sp](japi.UnitFunctionBridge.html#apply$mcLD$sp(double)), [apply$mcLF$sp](japi.UnitFunctionBridge.html#apply$mcLF$sp(float)), [apply$mcLI$sp](japi.UnitFunctionBridge.html#apply$mcLI$sp(int)), [apply$mcLJ$sp](japi.UnitFunctionBridge.html#apply$mcLJ$sp(long))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`

- - ### Constructor Detail
	
	
	
		- #### Foreach
		
		
		
		```
		public Foreach()
		```

	- ### Method Detail
	
	
	
		- #### each
		
		
		
		```
		public abstract void each​([T](Foreach.html "type parameter in Foreach") result)
		                   throws java.lang.Throwable
		```
		
		This method will be invoked once when/if a Future that this callback is registered on
		 becomes successfully completed
		
		Throws:
		`java.lang.Throwable`
		- #### internal
		
		
		
		```
		public final void internal​([T](Foreach.html "type parameter in Foreach") t)
		```
		
		
		Overrides:
		`[internal](japi.UnitFunctionBridge.html#internal(T))` in class `[japi.UnitFunctionBridge](japi.UnitFunctionBridge.html "class in akka.dispatch")<[T](Foreach.html "type parameter in Foreach")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/Foreach.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/japi.UnitFunctionBridge.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/Foreach.html](https://doc.akka.io/japi/akka/current/akka/dispatch/Foreach.html)*