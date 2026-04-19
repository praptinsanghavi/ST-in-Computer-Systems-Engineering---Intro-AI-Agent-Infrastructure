---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/JavaPartialFunction.html
title: JavaPartialFunction
---

# JavaPartialFunction

## Content

Package [akka.japi](package-summary.html)
## Class JavaPartialFunction\<A,​B\>

- java.lang.Object
- - scala.runtime.AbstractPartialFunction\<A,​B\>
	- - akka.japi.JavaPartialFunction\<A,​B\>

- All Implemented Interfaces:
`scala.Function1<A,​B>`, `scala.PartialFunction<A,​B>`

---

```
public abstract class JavaPartialFunction<A,​B>
extends scala.runtime.AbstractPartialFunction<A,​B>
```

Helper for implementing a \*pure\* partial function: it will possibly be
 invoked multiple times for a single \&ldquo;application\&rdquo;, because its only abstract
 method is used for both isDefinedAt() and apply(); the former is mapped to
 `isCheck == true` and the latter to `isCheck == false` for those cases where
 this is important to know.
 
 Failure to match is signaled by throwing `noMatch()`, i.e. not returning
 normally (the exception used in this case is pre\-allocated, hence not
 *that* expensive).
 

```

 new JavaPartialFunction<Object, String>() {
   public String apply(Object in, boolean isCheck) {
     if (in instanceof TheThing) {
       if (isCheck) return null; // to spare the expensive or side-effecting code
       return doSomethingWithTheThing((TheThing) in);
     } else {
       throw noMatch();
     }
   }
 }
 
```

 The typical use of partial functions from Akka looks like the following:
 

```

 if (pf.isDefinedAt(x)) {
   pf.apply(x);
 }
 
```

 i.e. it will first call `JavaPartialFunction.apply(x, true)` and if that
 does not throw `noMatch()` it will continue with calling
 `JavaPartialFunction.apply(x, false)`.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[JavaPartialFunction.NoMatch$](JavaPartialFunction.NoMatch$.html "class in akka.japi")` |  |
	| `static class` | `[JavaPartialFunction.NoMatchException](JavaPartialFunction.NoMatchException.html "class in akka.japi")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`
		- ### Nested classes/interfaces inherited from interface scala.PartialFunction
		
		
		`scala.PartialFunction.ElementWiseExtractor<A extends java.lang.Object,​B extends java.lang.Object>, scala.PartialFunction.ElementWiseExtractor$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JavaPartialFunction](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[B](JavaPartialFunction.html "type parameter in JavaPartialFunction")` | `[apply](#apply(A))​([A](JavaPartialFunction.html "type parameter in JavaPartialFunction") x)` |  |
	| `abstract [B](JavaPartialFunction.html "type parameter in JavaPartialFunction")` | `[apply](#apply(A,boolean))​([A](JavaPartialFunction.html "type parameter in JavaPartialFunction") x,  boolean isCheck)` |  |
	| `<A1 extends [A](JavaPartialFunction.html "type parameter in JavaPartialFunction"),​B1>B1` | `[applyOrElse](#applyOrElse(A1,scala.Function1))​(A1 x,  scala.Function1<A1,​B1> default_)` |  |
	| `boolean` | `[isDefinedAt](#isDefinedAt(A))​([A](JavaPartialFunction.html "type parameter in JavaPartialFunction") x)` |  |
	| `static java.lang.RuntimeException` | `[noMatch](#noMatch())()` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractPartialFunction
		
		
		`andThen, andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, compose, elementWise, lift, orElse, runWith, toString, unapply`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### JavaPartialFunction
		
		
		
		```
		public JavaPartialFunction()
		```

	- ### Method Detail
	
	
	
		- #### noMatch
		
		
		
		```
		public static final java.lang.RuntimeException noMatch()
		```
		- #### apply
		
		
		
		```
		public abstract [B](JavaPartialFunction.html "type parameter in JavaPartialFunction") apply​([A](JavaPartialFunction.html "type parameter in JavaPartialFunction") x,
		                        boolean isCheck)
		                 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`
		- #### isDefinedAt
		
		
		
		```
		public final boolean isDefinedAt​([A](JavaPartialFunction.html "type parameter in JavaPartialFunction") x)
		```
		- #### apply
		
		
		
		```
		public final [B](JavaPartialFunction.html "type parameter in JavaPartialFunction") apply​([A](JavaPartialFunction.html "type parameter in JavaPartialFunction") x)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[A](JavaPartialFunction.html "type parameter in JavaPartialFunction"),​[B](JavaPartialFunction.html "type parameter in JavaPartialFunction")>`
		Overrides:
		`apply` in class `scala.runtime.AbstractPartialFunction<[A](JavaPartialFunction.html "type parameter in JavaPartialFunction"),​[B](JavaPartialFunction.html "type parameter in JavaPartialFunction")>`
		- #### applyOrElse
		
		
		
		```
		public final <A1 extends [A](JavaPartialFunction.html "type parameter in JavaPartialFunction"),​B1> B1 applyOrElse​(A1 x,
		                                                    scala.Function1<A1,​B1> default_)
		```
		
		
		Specified by:
		`applyOrElse` in interface `scala.PartialFunction<[A](JavaPartialFunction.html "type parameter in JavaPartialFunction"),​[B](JavaPartialFunction.html "type parameter in JavaPartialFunction")>`
		Overrides:
		`applyOrElse` in class `scala.runtime.AbstractPartialFunction<[A](JavaPartialFunction.html "type parameter in JavaPartialFunction"),​[B](JavaPartialFunction.html "type parameter in JavaPartialFunction")>`

## Code Examples

### Example 1: Class JavaPartialFunction<A,​B>

```text
new JavaPartialFunction<Object, String>() {
   public String apply(Object in, boolean isCheck) {
     if (in instanceof TheThing) {
       if (isCheck) return null; // to spare the expensive or side-effecting code
       return doSomethingWithTheThing((TheThing) in);
     } else {
       throw noMatch();
     }
   }
 }
```

### Example 2: Class JavaPartialFunction<A,​B>

```text
if (pf.isDefinedAt(x)) {
   pf.apply(x);
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/JavaPartialFunction.NoMatch$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/JavaPartialFunction.NoMatchException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/JavaPartialFunction.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/JavaPartialFunction.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/JavaPartialFunction.html)*