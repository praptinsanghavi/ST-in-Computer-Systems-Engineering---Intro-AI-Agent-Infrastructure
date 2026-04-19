---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:58:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function12.html
title: Function12
---

# Function12

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function12\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​R>
extends java.io.Serializable
```

A Function interface. Used to create 12\-arg first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function12.html "type parameter in Function12")` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12))​([T1](Function12.html "type parameter in Function12") arg1,  [T2](Function12.html "type parameter in Function12") arg2,  [T3](Function12.html "type parameter in Function12") arg3,  [T4](Function12.html "type parameter in Function12") arg4,  [T5](Function12.html "type parameter in Function12") arg5,  [T6](Function12.html "type parameter in Function12") arg6,  [T7](Function12.html "type parameter in Function12") arg7,  [T8](Function12.html "type parameter in Function12") arg8,  [T9](Function12.html "type parameter in Function12") arg9,  [T10](Function12.html "type parameter in Function12") arg10,  [T11](Function12.html "type parameter in Function12") arg11,  [T12](Function12.html "type parameter in Function12") arg12)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function12.html "type parameter in Function12") apply​([T1](Function12.html "type parameter in Function12") arg1,
		        [T2](Function12.html "type parameter in Function12") arg2,
		        [T3](Function12.html "type parameter in Function12") arg3,
		        [T4](Function12.html "type parameter in Function12") arg4,
		        [T5](Function12.html "type parameter in Function12") arg5,
		        [T6](Function12.html "type parameter in Function12") arg6,
		        [T7](Function12.html "type parameter in Function12") arg7,
		        [T8](Function12.html "type parameter in Function12") arg8,
		        [T9](Function12.html "type parameter in Function12") arg9,
		        [T10](Function12.html "type parameter in Function12") arg10,
		        [T11](Function12.html "type parameter in Function12") arg11,
		        [T12](Function12.html "type parameter in Function12") arg12)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function12.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function12.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function12.html)*