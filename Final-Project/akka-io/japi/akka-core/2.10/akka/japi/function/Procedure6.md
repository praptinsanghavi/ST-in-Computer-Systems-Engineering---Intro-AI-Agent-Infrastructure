---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure6.html
title: Procedure6
---

# Procedure6

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure6\<T1,​T2,​T3,​T4,​T5,​T6\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure6<T1,​T2,​T3,​T4,​T5,​T6>
extends java.io.Serializable
```

A Consumer interface. Used to create 6\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3,T4,T5,T6))​([T1](Procedure6.html "type parameter in Procedure6") arg1,  [T2](Procedure6.html "type parameter in Procedure6") arg2,  [T3](Procedure6.html "type parameter in Procedure6") arg3,  [T4](Procedure6.html "type parameter in Procedure6") arg4,  [T5](Procedure6.html "type parameter in Procedure6") arg5,  [T6](Procedure6.html "type parameter in Procedure6") arg6)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure6.html "type parameter in Procedure6") arg1,
		           [T2](Procedure6.html "type parameter in Procedure6") arg2,
		           [T3](Procedure6.html "type parameter in Procedure6") arg3,
		           [T4](Procedure6.html "type parameter in Procedure6") arg4,
		           [T5](Procedure6.html "type parameter in Procedure6") arg5,
		           [T6](Procedure6.html "type parameter in Procedure6") arg6)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure6.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure6.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure6.html)*