---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function9.html
title: Function9
---

# Function9

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function9\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​R>
extends java.io.Serializable
```

A Function interface. Used to create 9\-arg first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function9.html "type parameter in Function9")` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9))​([T1](Function9.html "type parameter in Function9") arg1,  [T2](Function9.html "type parameter in Function9") arg2,  [T3](Function9.html "type parameter in Function9") arg3,  [T4](Function9.html "type parameter in Function9") arg4,  [T5](Function9.html "type parameter in Function9") arg5,  [T6](Function9.html "type parameter in Function9") arg6,  [T7](Function9.html "type parameter in Function9") arg7,  [T8](Function9.html "type parameter in Function9") arg8,  [T9](Function9.html "type parameter in Function9") arg9)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function9.html "type parameter in Function9") apply​([T1](Function9.html "type parameter in Function9") arg1,
		        [T2](Function9.html "type parameter in Function9") arg2,
		        [T3](Function9.html "type parameter in Function9") arg3,
		        [T4](Function9.html "type parameter in Function9") arg4,
		        [T5](Function9.html "type parameter in Function9") arg5,
		        [T6](Function9.html "type parameter in Function9") arg6,
		        [T7](Function9.html "type parameter in Function9") arg7,
		        [T8](Function9.html "type parameter in Function9") arg8,
		        [T9](Function9.html "type parameter in Function9") arg9)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function9.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function9.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function9.html)*