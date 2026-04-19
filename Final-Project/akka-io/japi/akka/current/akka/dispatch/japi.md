---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/japi.UnitFunctionBridge.html
title: japi.UnitFunctionBridge
---

# japi.UnitFunctionBridge

## Content

Package [akka.dispatch](package-summary.html)
## Class japi.UnitFunctionBridge\<T\>

- java.lang.Object
- - akka.dispatch.japi.UnitFunctionBridge\<T\>

- All Implemented Interfaces:
`scala.Function1<T,​scala.runtime.BoxedUnit>`

Direct Known Subclasses:
`[Foreach](Foreach.html "class in akka.dispatch")`

Enclosing class:
[japi](japi.html "class in akka.dispatch")

---

```
public static class japi.UnitFunctionBridge<T>
extends java.lang.Object
implements scala.Function1<T,​scala.runtime.BoxedUnit>
```

Deprecated.
Do not use this directly, use subclasses of this. Since 2\.0\.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnitFunctionBridge](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `scala.runtime.BoxedUnit` | `[apply](#apply(T))​([T](japi.UnitFunctionBridge.html "type parameter in japi.UnitFunctionBridge") t)` | Deprecated. |
	| `scala.runtime.BoxedUnit` | `[apply$mcLD$sp](#apply$mcLD$sp(double))​(double d)` | Deprecated. |
	| `scala.runtime.BoxedUnit` | `[apply$mcLF$sp](#apply$mcLF$sp(float))​(float f)` | Deprecated. |
	| `scala.runtime.BoxedUnit` | `[apply$mcLI$sp](#apply$mcLI$sp(int))​(int i)` | Deprecated. |
	| `scala.runtime.BoxedUnit` | `[apply$mcLJ$sp](#apply$mcLJ$sp(long))​(long l)` | Deprecated. |
	| `protected void` | `[internal](#internal(T))​([T](japi.UnitFunctionBridge.html "type parameter in japi.UnitFunctionBridge") result)` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`

- - ### Constructor Detail
	
	
	
		- #### UnitFunctionBridge
		
		
		
		```
		public UnitFunctionBridge()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public final scala.runtime.BoxedUnit apply​([T](japi.UnitFunctionBridge.html "type parameter in japi.UnitFunctionBridge") t)
		```
		
		Deprecated.
		
		Specified by:
		`apply` in interface `scala.Function1<[T](japi.UnitFunctionBridge.html "type parameter in japi.UnitFunctionBridge"),​scala.runtime.BoxedUnit>`
		- #### apply$mcLD$sp
		
		
		
		```
		public final scala.runtime.BoxedUnit apply$mcLD$sp​(double d)
		```
		
		Deprecated.
		- #### apply$mcLF$sp
		
		
		
		```
		public final scala.runtime.BoxedUnit apply$mcLF$sp​(float f)
		```
		
		Deprecated.
		- #### apply$mcLI$sp
		
		
		
		```
		public final scala.runtime.BoxedUnit apply$mcLI$sp​(int i)
		```
		
		Deprecated.
		- #### apply$mcLJ$sp
		
		
		
		```
		public final scala.runtime.BoxedUnit apply$mcLJ$sp​(long l)
		```
		
		Deprecated.
		- #### internal
		
		
		
		```
		protected void internal​([T](japi.UnitFunctionBridge.html "type parameter in japi.UnitFunctionBridge") result)
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/Foreach.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/japi.UnitFunctionBridge.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/japi.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/japi.UnitFunctionBridge.html](https://doc.akka.io/japi/akka/current/akka/dispatch/japi.UnitFunctionBridge.html)*