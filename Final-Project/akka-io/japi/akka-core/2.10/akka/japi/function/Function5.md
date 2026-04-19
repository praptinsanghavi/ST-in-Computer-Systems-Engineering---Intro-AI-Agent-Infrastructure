---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function5.html
title: Function5
---

# Function5

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function5\<T1,​T2,​T3,​T4,​T5,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function5<T1,​T2,​T3,​T4,​T5,​R>
extends java.io.Serializable
```

A Function interface. Used to create 5\-arg first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function5.html "type parameter in Function5")` | `[apply](#apply(T1,T2,T3,T4,T5))​([T1](Function5.html "type parameter in Function5") arg1,  [T2](Function5.html "type parameter in Function5") arg2,  [T3](Function5.html "type parameter in Function5") arg3,  [T4](Function5.html "type parameter in Function5") arg4,  [T5](Function5.html "type parameter in Function5") arg5)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function5.html "type parameter in Function5") apply​([T1](Function5.html "type parameter in Function5") arg1,
		        [T2](Function5.html "type parameter in Function5") arg2,
		        [T3](Function5.html "type parameter in Function5") arg3,
		        [T4](Function5.html "type parameter in Function5") arg4,
		        [T5](Function5.html "type parameter in Function5") arg5)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function5.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function5.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function5.html)*