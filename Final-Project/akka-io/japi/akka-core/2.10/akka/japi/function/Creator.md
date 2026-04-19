---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Creator.html
title: Creator
---

# Creator

## Content

Package [akka.japi.function](package-summary.html)
## Interface Creator\<T\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Creator<T>
extends java.io.Serializable
```

A constructor/factory, takes no parameters but creates a new value of type T every call.
 Supports throwing `Exception` in the apply, which the `java.util.function.Creator` counterpart does not.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[T](Creator.html "type parameter in Creator")` | `[create](#create())()` | This method must return a different instance upon every call. |

- - ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		[T](Creator.html "type parameter in Creator") create()
		  throws java.lang.Exception
		```
		
		This method must return a different instance upon every call.
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Creator.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Creator.html)*