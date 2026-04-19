---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:21:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Filter.html
title: Filter
---

# Filter

## Content

Package [akka.dispatch](package-summary.html)
## Class Filter

- java.lang.Object
- - akka.dispatch.Filter

- ---

```
public class Filter
extends java.lang.Object
```

***Java API (not recommended):***
 Callback for the Future.filter operation that creates a new Future which will
 conditionally contain the success of another Future.
 
 Unfortunately it is not possible to express the type of a Scala filter in
 Java: Function1\[T, Boolean], where \&ldquo;Boolean\&rdquo; is the primitive type. It is
 possible to use `Future.filter` by constructing such a function indirectly:
 

```

 import static akka.dispatch.Filter.filterOf;
 Future<String> f = ...;
 f.filter(filterOf(new Function<String, Boolean>() {
   @Override
   public Boolean apply(String s) {
     ...
   }
 }));
 
```

 However, `Future.filter` exists mainly to support Scala\&rsquo;s for\-comprehensions,
 thus Java users should prefer `Future.map`, translating non\-matching values
 to failure cases.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Filter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> scala.Function1<T,​java.lang.Object>` | `[filterOf](#filterOf(akka.japi.Function))​([Function](../japi/Function.html "interface in akka.japi")<T,​java.lang.Boolean> f)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Filter
		
		
		
		```
		public Filter()
		```

	- ### Method Detail
	
	
	
		- #### filterOf
		
		
		
		```
		public static <T> scala.Function1<T,​java.lang.Object> filterOf​([Function](../japi/Function.html "interface in akka.japi")<T,​java.lang.Boolean> f)
		```

## Code Examples

### Example 1: Class Filter

```text
import static akka.dispatch.Filter.filterOf;
 Future<String> f = ...;
 f.filter(filterOf(new Function<String, Boolean>() {
   @Override
   public Boolean apply(String s) {
     ...
   }
 }));
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Function.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Filter.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/Filter.html)*