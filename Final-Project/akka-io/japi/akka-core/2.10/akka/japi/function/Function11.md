---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:58:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function11.html
title: Function11
---

# Function11

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function11\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​R>
extends java.io.Serializable
```

A Function interface. Used to create 11\-arg first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function11.html "type parameter in Function11")` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11))​([T1](Function11.html "type parameter in Function11") arg1,  [T2](Function11.html "type parameter in Function11") arg2,  [T3](Function11.html "type parameter in Function11") arg3,  [T4](Function11.html "type parameter in Function11") arg4,  [T5](Function11.html "type parameter in Function11") arg5,  [T6](Function11.html "type parameter in Function11") arg6,  [T7](Function11.html "type parameter in Function11") arg7,  [T8](Function11.html "type parameter in Function11") arg8,  [T9](Function11.html "type parameter in Function11") arg9,  [T10](Function11.html "type parameter in Function11") arg10,  [T11](Function11.html "type parameter in Function11") arg11)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function11.html "type parameter in Function11") apply​([T1](Function11.html "type parameter in Function11") arg1,
		        [T2](Function11.html "type parameter in Function11") arg2,
		        [T3](Function11.html "type parameter in Function11") arg3,
		        [T4](Function11.html "type parameter in Function11") arg4,
		        [T5](Function11.html "type parameter in Function11") arg5,
		        [T6](Function11.html "type parameter in Function11") arg6,
		        [T7](Function11.html "type parameter in Function11") arg7,
		        [T8](Function11.html "type parameter in Function11") arg8,
		        [T9](Function11.html "type parameter in Function11") arg9,
		        [T10](Function11.html "type parameter in Function11") arg10,
		        [T11](Function11.html "type parameter in Function11") arg11)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function11.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function11.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function11.html)*