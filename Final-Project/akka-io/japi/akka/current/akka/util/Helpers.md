---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/Helpers.Requiring.html
title: Helpers.Requiring
---

# Helpers.Requiring

## Content

Package [akka.util](package-summary.html)
## Class Helpers.Requiring\<A\>

- java.lang.Object
- - scala.AnyVal
	- - akka.util.Helpers.Requiring\<A\>

- Enclosing class:
[Helpers](Helpers.html "class in akka.util")

---

```
public static final class Helpers.Requiring<A>
extends scala.AnyVal
```

Implicit class providing `requiring` methods. This class is based on
 `Predef.ensuring` in the Scala standard library. The difference is that
 this class's methods throw `IllegalArgumentException`s rather than
 `AssertionError`s.
 
 An example adapted from `Predef`'s documentation:
 

```

 import akka.util.Helpers.Requiring

 def addNaturals(nats: List[Int]): Int = {
   require(nats forall (_ >= 0), "List contains negative numbers")
   nats.foldLeft(0)(_ + _)
 } requiring(_ >= 0)
 
```

 param: value The value to check.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Requiring](#%3Cinit%3E(A))​([A](Helpers.Requiring.html "type parameter in Helpers.Requiring") value)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[A](Helpers.Requiring.html "type parameter in Helpers.Requiring")` | `[requiring](#requiring(boolean,scala.Function0))​(boolean cond,  scala.Function0<java.lang.Object> msg)` | Check that a condition is true. |
	| `[A](Helpers.Requiring.html "type parameter in Helpers.Requiring")` | `[requiring](#requiring(scala.Function1,scala.Function0))​(scala.Function1<[A](Helpers.Requiring.html "type parameter in Helpers.Requiring"),​java.lang.Object> cond,  scala.Function0<java.lang.Object> msg)` | Check that a condition is true for the `value`. |
	| `[A](Helpers.Requiring.html "type parameter in Helpers.Requiring")` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Requiring
		
		
		
		```
		public Requiring​([A](Helpers.Requiring.html "type parameter in Helpers.Requiring") value)
		```

	- ### Method Detail
	
	
	
		- #### value
		
		
		
		```
		public [A](Helpers.Requiring.html "type parameter in Helpers.Requiring") value()
		```
		- #### requiring
		
		
		
		```
		public [A](Helpers.Requiring.html "type parameter in Helpers.Requiring") requiring​(boolean cond,
		                   scala.Function0<java.lang.Object> msg)
		```
		
		Check that a condition is true. If true, return `value`, otherwise throw
		 an `IllegalArgumentException` with the given message.
		 
		
		Parameters:
		`cond` \- The condition to check.
		`msg` \- The message to report if the condition isn't met.
		- #### requiring
		
		
		
		```
		public [A](Helpers.Requiring.html "type parameter in Helpers.Requiring") requiring​(scala.Function1<[A](Helpers.Requiring.html "type parameter in Helpers.Requiring"),​java.lang.Object> cond,
		                   scala.Function0<java.lang.Object> msg)
		```
		
		Check that a condition is true for the `value`. If true, return `value`,
		 otherwise throw an `IllegalArgumentException` with the given message.
		 
		
		Parameters:
		`cond` \- The function used to check the `value`.
		`msg` \- The message to report if the condition isn't met.
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`

## Code Examples

### Example 1: Class Helpers.Requiring<A>

```text
import akka.util.Helpers.Requiring

 def addNaturals(nats: List[Int]): Int = {
   require(nats forall (_ >= 0), "List contains negative numbers")
   nats.foldLeft(0)(_ + _)
 } requiring(_ >= 0)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/Helpers.Requiring.html
- https://doc.akka.io/japi/akka/current/akka/util/Helpers.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/Helpers.Requiring.html](https://doc.akka.io/japi/akka/current/akka/util/Helpers.Requiring.html)*