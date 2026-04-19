---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Effect.html
title: Effect
---

# Effect

## Content

Package [akka.japi.function](package-summary.html)
## Interface Effect

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Effect
extends java.io.Serializable
```

An executable piece of code that takes no parameters and doesn't return any value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 Supports throwing `Exception` in the apply, which the `java.util.function.Effect` counterpart does not.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply())()` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply()
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Effect.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Effect.html)*