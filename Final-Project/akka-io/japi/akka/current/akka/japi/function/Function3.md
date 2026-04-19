---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/function/Function3.html
title: Function3
---

# Function3

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function3\<T1,​T2,​T3,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function3<T1,​T2,​T3,​R>
extends java.io.Serializable
```

A Function interface. Used to create 3\-arg first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function3.html "type parameter in Function3")` | `[apply](#apply(T1,T2,T3))​([T1](Function3.html "type parameter in Function3") arg1,  [T2](Function3.html "type parameter in Function3") arg2,  [T3](Function3.html "type parameter in Function3") arg3)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function3.html "type parameter in Function3") apply​([T1](Function3.html "type parameter in Function3") arg1,
		        [T2](Function3.html "type parameter in Function3") arg2,
		        [T3](Function3.html "type parameter in Function3") arg3)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/function/Function3.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/function/Function3.html](https://doc.akka.io/japi/akka/current/akka/japi/function/Function3.html)*