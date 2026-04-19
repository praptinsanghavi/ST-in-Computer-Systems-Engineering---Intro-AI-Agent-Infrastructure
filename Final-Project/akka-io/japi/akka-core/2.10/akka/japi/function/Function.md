---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:33:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html
title: Function
---

# Function

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function\<T,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function<T,​R>
extends java.io.Serializable
```

A Function interface. Used to create first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 Supports throwing `Exception` in the apply, which the `java.util.function.Function` counterpart does not.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function.html "type parameter in Function")` | `[apply](#apply(T))​([T](Function.html "type parameter in Function") param)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function.html "type parameter in Function") apply​([T](Function.html "type parameter in Function") param)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html)*