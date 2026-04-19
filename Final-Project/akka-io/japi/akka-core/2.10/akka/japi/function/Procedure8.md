---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure8.html
title: Procedure8
---

# Procedure8

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure8\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>
extends java.io.Serializable
```

A Consumer interface. Used to create 8\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8))​([T1](Procedure8.html "type parameter in Procedure8") arg1,  [T2](Procedure8.html "type parameter in Procedure8") arg2,  [T3](Procedure8.html "type parameter in Procedure8") arg3,  [T4](Procedure8.html "type parameter in Procedure8") arg4,  [T5](Procedure8.html "type parameter in Procedure8") arg5,  [T6](Procedure8.html "type parameter in Procedure8") arg6,  [T7](Procedure8.html "type parameter in Procedure8") arg7,  [T8](Procedure8.html "type parameter in Procedure8") arg8)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure8.html "type parameter in Procedure8") arg1,
		           [T2](Procedure8.html "type parameter in Procedure8") arg2,
		           [T3](Procedure8.html "type parameter in Procedure8") arg3,
		           [T4](Procedure8.html "type parameter in Procedure8") arg4,
		           [T5](Procedure8.html "type parameter in Procedure8") arg5,
		           [T6](Procedure8.html "type parameter in Procedure8") arg6,
		           [T7](Procedure8.html "type parameter in Procedure8") arg7,
		           [T8](Procedure8.html "type parameter in Procedure8") arg8)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure8.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure8.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure8.html)*