---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/function/Function10.html
title: Function10
---

# Function10

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function10\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​R>
extends java.io.Serializable
```

A Function interface. Used to create 10\-arg first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function10.html "type parameter in Function10")` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10))​([T1](Function10.html "type parameter in Function10") arg1,  [T2](Function10.html "type parameter in Function10") arg2,  [T3](Function10.html "type parameter in Function10") arg3,  [T4](Function10.html "type parameter in Function10") arg4,  [T5](Function10.html "type parameter in Function10") arg5,  [T6](Function10.html "type parameter in Function10") arg6,  [T7](Function10.html "type parameter in Function10") arg7,  [T8](Function10.html "type parameter in Function10") arg8,  [T9](Function10.html "type parameter in Function10") arg9,  [T10](Function10.html "type parameter in Function10") arg10)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function10.html "type parameter in Function10") apply​([T1](Function10.html "type parameter in Function10") arg1,
		        [T2](Function10.html "type parameter in Function10") arg2,
		        [T3](Function10.html "type parameter in Function10") arg3,
		        [T4](Function10.html "type parameter in Function10") arg4,
		        [T5](Function10.html "type parameter in Function10") arg5,
		        [T6](Function10.html "type parameter in Function10") arg6,
		        [T7](Function10.html "type parameter in Function10") arg7,
		        [T8](Function10.html "type parameter in Function10") arg8,
		        [T9](Function10.html "type parameter in Function10") arg9,
		        [T10](Function10.html "type parameter in Function10") arg10)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/function/Function10.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/function/Function10.html](https://doc.akka.io/japi/akka/current/akka/japi/function/Function10.html)*