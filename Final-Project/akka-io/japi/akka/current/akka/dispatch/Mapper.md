---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/Mapper.html
title: Mapper
---

# Mapper

## Content

Package [akka.dispatch](package-summary.html)
## Class Mapper\<T,​R\>

- java.lang.Object
- - scala.runtime.AbstractFunction1\<T,​R\>
	- - akka.dispatch.Mapper\<T,​R\>

- All Implemented Interfaces:
`scala.Function1<T,​R>`

---

```
public abstract class Mapper<T,​R>
extends scala.runtime.AbstractFunction1<T,​R>
```

Callback for the Future.map and Future.flatMap operations that will be invoked
 if the Future that this callback is registered on becomes completed with a success.
 This callback is the equivalent of an akka.japi.Function
 
 Override "apply" normally, or "checkedApply" if you need to throw checked exceptions.
 

 SAM (Single Abstract Method) class
 

 Java API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Mapper](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[R](Mapper.html "type parameter in Mapper")` | `[apply](#apply(T))​([T](Mapper.html "type parameter in Mapper") parameter)` | Override this method to perform the map operation, by default delegates to "checkedApply"  which by default throws an UnsupportedOperationException. |
	| `[R](Mapper.html "type parameter in Mapper")` | `[checkedApply](#checkedApply(T))​([T](Mapper.html "type parameter in Mapper") parameter)` | Override this method if you need to throw checked exceptions |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Mapper
		
		
		
		```
		public Mapper()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [R](Mapper.html "type parameter in Mapper") apply​([T](Mapper.html "type parameter in Mapper") parameter)
		```
		
		Override this method to perform the map operation, by default delegates to "checkedApply"
		 which by default throws an UnsupportedOperationException.
		- #### checkedApply
		
		
		
		```
		public [R](Mapper.html "type parameter in Mapper") checkedApply​([T](Mapper.html "type parameter in Mapper") parameter)
		               throws java.lang.Throwable
		```
		
		Override this method if you need to throw checked exceptions
		 
		 Throws UnsupportedOperation by default.
		
		
		
		Throws:
		`java.lang.Throwable`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/Mapper.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/Mapper.html](https://doc.akka.io/japi/akka/current/akka/dispatch/Mapper.html)*