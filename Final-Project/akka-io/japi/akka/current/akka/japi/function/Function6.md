---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/function/Function6.html
title: Function6
---

# Function6

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function6\<T1,​T2,​T3,​T4,​T5,​T6,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function6<T1,​T2,​T3,​T4,​T5,​T6,​R>
extends java.io.Serializable
```

A Function interface. Used to create 6\-arg first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function6.html "type parameter in Function6")` | `[apply](#apply(T1,T2,T3,T4,T5,T6))​([T1](Function6.html "type parameter in Function6") arg1,  [T2](Function6.html "type parameter in Function6") arg2,  [T3](Function6.html "type parameter in Function6") arg3,  [T4](Function6.html "type parameter in Function6") arg4,  [T5](Function6.html "type parameter in Function6") arg5,  [T6](Function6.html "type parameter in Function6") arg6)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function6.html "type parameter in Function6") apply​([T1](Function6.html "type parameter in Function6") arg1,
		        [T2](Function6.html "type parameter in Function6") arg2,
		        [T3](Function6.html "type parameter in Function6") arg3,
		        [T4](Function6.html "type parameter in Function6") arg4,
		        [T5](Function6.html "type parameter in Function6") arg5,
		        [T6](Function6.html "type parameter in Function6") arg6)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/function/Function6.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/function/Function6.html](https://doc.akka.io/japi/akka/current/akka/japi/function/Function6.html)*