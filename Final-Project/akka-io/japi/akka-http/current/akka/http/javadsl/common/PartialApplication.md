---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/PartialApplication.html
title: PartialApplication
---

# PartialApplication

## Content

Package [akka.http.javadsl.common](package-summary.html)
## Class PartialApplication

- java.lang.Object
- - akka.http.javadsl.common.PartialApplication

- ---

```
public class PartialApplication
extends java.lang.Object
```

Contains helpful methods to partially apply Functions for Java

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PartialApplication](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <A,​B,​R>java.util.function.Function<B,​R>` | `[bindParameter](#bindParameter(java.util.function.BiFunction,A))​(java.util.function.BiFunction<A,​B,​R> f,  A a)` | It partially applies function A. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PartialApplication
		
		
		
		```
		public PartialApplication()
		```

	- ### Method Detail
	
	
	
		- #### bindParameter
		
		
		
		```
		public static <A,​B,​R> java.util.function.Function<B,​R> bindParameter​(java.util.function.BiFunction<A,​B,​R> f,
		                                                                                       A a)
		```
		
		It partially applies function A. In other words, it converts a 2 argument function to a 1 argument function by binding the first argument to `a`.
		 Here you can see an example:
		 
		```
		
		 {@code BiFunction<Int, Int, Int> adder = (x, y) -> x + y;
		   Function<Int, Int> add5 = bindParameter(adder, 5);
		   add5(1);
		 }
		 
		```
		
		
		Parameters:
		`f` \- the function to partially apply
		`a` \- the first parameter to partially apply
		Returns:
		the function partially applied

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/PartialApplication.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/common/PartialApplication.html)*