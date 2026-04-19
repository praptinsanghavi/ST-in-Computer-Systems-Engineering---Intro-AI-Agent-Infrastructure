---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function2.html
title: Function2
---

# Function2

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function2\<T1,​T2,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function2<T1,​T2,​R>
extends java.io.Serializable
```

A Function interface. Used to create 2\-arg first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 Supports throwing `Exception` in the apply, which the `java.util.function.BiFunction` counterpart does not.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function2.html "type parameter in Function2")` | `[apply](#apply(T1,T2))​([T1](Function2.html "type parameter in Function2") arg1,  [T2](Function2.html "type parameter in Function2") arg2)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function2.html "type parameter in Function2") apply​([T1](Function2.html "type parameter in Function2") arg1,
		        [T2](Function2.html "type parameter in Function2") arg2)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function2.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function2.html)*