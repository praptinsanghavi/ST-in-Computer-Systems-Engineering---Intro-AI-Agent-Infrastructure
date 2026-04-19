---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function8.html
title: Function8
---

# Function8

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function8\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​R>
extends java.io.Serializable
```

A Function interface. Used to create 8\-arg first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function8.html "type parameter in Function8")` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8))​([T1](Function8.html "type parameter in Function8") arg1,  [T2](Function8.html "type parameter in Function8") arg2,  [T3](Function8.html "type parameter in Function8") arg3,  [T4](Function8.html "type parameter in Function8") arg4,  [T5](Function8.html "type parameter in Function8") arg5,  [T6](Function8.html "type parameter in Function8") arg6,  [T7](Function8.html "type parameter in Function8") arg7,  [T8](Function8.html "type parameter in Function8") arg8)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function8.html "type parameter in Function8") apply​([T1](Function8.html "type parameter in Function8") arg1,
		        [T2](Function8.html "type parameter in Function8") arg2,
		        [T3](Function8.html "type parameter in Function8") arg3,
		        [T4](Function8.html "type parameter in Function8") arg4,
		        [T5](Function8.html "type parameter in Function8") arg5,
		        [T6](Function8.html "type parameter in Function8") arg6,
		        [T7](Function8.html "type parameter in Function8") arg7,
		        [T8](Function8.html "type parameter in Function8") arg8)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function8.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function8.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function8.html)*