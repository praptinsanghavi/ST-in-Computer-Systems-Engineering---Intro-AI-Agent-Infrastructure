---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/OnFailure.html
title: OnFailure
---

# OnFailure

## Content

Package [akka.dispatch](package-summary.html)
## Class OnFailure

- java.lang.Object
- - scala.runtime.AbstractPartialFunction\<T,​scala.runtime.BoxedUnit\>
	- - [akka.dispatch.japi.CallbackBridge](japi.CallbackBridge.html "class in akka.dispatch")\<java.lang.Throwable\>
		- - akka.dispatch.OnFailure

- All Implemented Interfaces:
`scala.Function1<java.lang.Throwable,​scala.runtime.BoxedUnit>`, `scala.PartialFunction<java.lang.Throwable,​scala.runtime.BoxedUnit>`

---

```
public abstract class OnFailure
extends [japi.CallbackBridge](japi.CallbackBridge.html "class in akka.dispatch")<java.lang.Throwable>
```

Callback for when a Future is completed with a failure
 SAM (Single Abstract Method) class
 
 Java API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`
		- ### Nested classes/interfaces inherited from interface scala.PartialFunction
		
		
		`scala.PartialFunction.ElementWiseExtractor<A extends java.lang.Object,​B extends java.lang.Object>, scala.PartialFunction.ElementWiseExtractor$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OnFailure](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[internal](#internal(java.lang.Throwable))​(java.lang.Throwable failure)` |  |
	| `abstract void` | `[onFailure](#onFailure(java.lang.Throwable))​(java.lang.Throwable failure)` | This method will be invoked once when/if a Future that this callback is registered on  becomes completed with a failure |
	
	
		- ### Methods inherited from class akka.dispatch.[japi.CallbackBridge](japi.CallbackBridge.html "class in akka.dispatch")
		
		
		`[apply](japi.CallbackBridge.html#apply(T)), [isDefinedAt](japi.CallbackBridge.html#isDefinedAt(T))`
		- ### Methods inherited from class scala.runtime.AbstractPartialFunction
		
		
		`andThen, andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, applyOrElse, compose, compose, elementWise, lift, orElse, runWith, toString, unapply`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### OnFailure
		
		
		
		```
		public OnFailure()
		```

	- ### Method Detail
	
	
	
		- #### internal
		
		
		
		```
		protected final void internal​(java.lang.Throwable failure)
		```
		
		
		Overrides:
		`[internal](japi.CallbackBridge.html#internal(T))` in class `[japi.CallbackBridge](japi.CallbackBridge.html "class in akka.dispatch")<java.lang.Throwable>`
		- #### onFailure
		
		
		
		```
		public abstract void onFailure​(java.lang.Throwable failure)
		                        throws java.lang.Throwable
		```
		
		This method will be invoked once when/if a Future that this callback is registered on
		 becomes completed with a failure
		
		Throws:
		`java.lang.Throwable`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/japi.CallbackBridge.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/OnFailure.html](https://doc.akka.io/japi/akka/current/akka/dispatch/OnFailure.html)*