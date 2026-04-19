---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function4.html
title: Function4
---

# Function4

## Content

Package [akka.japi.function](package-summary.html)
## Interface Function4\<T1,​T2,​T3,​T4,​R\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Function4<T1,​T2,​T3,​T4,​R>
extends java.io.Serializable
```

A Function interface. Used to create 4\-arg first\-class\-functions is Java.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function4.html "type parameter in Function4")` | `[apply](#apply(T1,T2,T3,T4))​([T1](Function4.html "type parameter in Function4") arg1,  [T2](Function4.html "type parameter in Function4") arg2,  [T3](Function4.html "type parameter in Function4") arg3,  [T4](Function4.html "type parameter in Function4") arg4)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function4.html "type parameter in Function4") apply​([T1](Function4.html "type parameter in Function4") arg1,
		        [T2](Function4.html "type parameter in Function4") arg2,
		        [T3](Function4.html "type parameter in Function4") arg3,
		        [T4](Function4.html "type parameter in Function4") arg4)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function4.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function4.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function4.html)*