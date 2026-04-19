---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function7.html
title: Function7
---

# Function7

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function7\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function7<T1,​T2,​T3,​T4,​T5,​T6,​T7,​R>
extends java.io.Serializable
```

A Function interface. Used to create 7\-arg first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function7.html "type parameter in Function7")` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7))​([T1](Function7.html "type parameter in Function7") arg1,  [T2](Function7.html "type parameter in Function7") arg2,  [T3](Function7.html "type parameter in Function7") arg3,  [T4](Function7.html "type parameter in Function7") arg4,  [T5](Function7.html "type parameter in Function7") arg5,  [T6](Function7.html "type parameter in Function7") arg6,  [T7](Function7.html "type parameter in Function7") arg7)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function7.html "type parameter in Function7") apply​([T1](Function7.html "type parameter in Function7") arg1,
		        [T2](Function7.html "type parameter in Function7") arg2,
		        [T3](Function7.html "type parameter in Function7") arg3,
		        [T4](Function7.html "type parameter in Function7") arg4,
		        [T5](Function7.html "type parameter in Function7") arg5,
		        [T6](Function7.html "type parameter in Function7") arg6,
		        [T7](Function7.html "type parameter in Function7") arg7)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function7.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function7.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function7.html)*