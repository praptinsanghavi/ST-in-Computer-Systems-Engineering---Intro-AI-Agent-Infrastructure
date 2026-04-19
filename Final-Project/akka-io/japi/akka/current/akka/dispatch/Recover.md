---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/Recover.html
title: Recover
---

# Recover

## Content

Package [akka.dispatch](package-summary.html)
## Class Recover\<T\>

- java.lang.Object
- - scala.runtime.AbstractPartialFunction\<java.lang.Throwable,​T\>
	- - [akka.dispatch.japi.RecoverBridge](japi.RecoverBridge.html "class in akka.dispatch")\<T\>
		- - akka.dispatch.Recover\<T\>

- All Implemented Interfaces:
`scala.Function1<java.lang.Throwable,​T>`, `scala.PartialFunction<java.lang.Throwable,​T>`

---

```
public abstract class Recover<T>
extends [japi.RecoverBridge](japi.RecoverBridge.html "class in akka.dispatch")<T>
```

Callback for the Future.recover operation that conditionally turns failures into successes.
 
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
	| `[Recover](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [T](Recover.html "type parameter in Recover")` | `[internal](#internal(java.lang.Throwable))​(java.lang.Throwable result)` |  |
	| `abstract [T](Recover.html "type parameter in Recover")` | `[recover](#recover(java.lang.Throwable))​(java.lang.Throwable failure)` | This method will be invoked once when/if the Future this recover callback is registered on  becomes completed with a failure. |
	
	
		- ### Methods inherited from class akka.dispatch.[japi.RecoverBridge](japi.RecoverBridge.html "class in akka.dispatch")
		
		
		`[apply](japi.RecoverBridge.html#apply(java.lang.Throwable)), [isDefinedAt](japi.RecoverBridge.html#isDefinedAt(java.lang.Throwable))`
		- ### Methods inherited from class scala.runtime.AbstractPartialFunction
		
		
		`andThen, andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, applyOrElse, compose, compose, elementWise, lift, orElse, runWith, toString, unapply`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Recover
		
		
		
		```
		public Recover()
		```

	- ### Method Detail
	
	
	
		- #### internal
		
		
		
		```
		protected final [T](Recover.html "type parameter in Recover") internal​(java.lang.Throwable result)
		```
		
		
		Overrides:
		`[internal](japi.RecoverBridge.html#internal(java.lang.Throwable))` in class `[japi.RecoverBridge](japi.RecoverBridge.html "class in akka.dispatch")<[T](Recover.html "type parameter in Recover")>`
		- #### recover
		
		
		
		```
		public abstract [T](Recover.html "type parameter in Recover") recover​(java.lang.Throwable failure)
		                   throws java.lang.Throwable
		```
		
		This method will be invoked once when/if the Future this recover callback is registered on
		 becomes completed with a failure.
		 
		
		Returns:
		a successful value for the passed in failure
		 Throws the passed in failure to propagate it.
		 
		 Java API
		
		
		Throws:
		`java.lang.Throwable`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/Recover.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/japi.RecoverBridge.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/Recover.html](https://doc.akka.io/japi/akka/current/akka/dispatch/Recover.html)*