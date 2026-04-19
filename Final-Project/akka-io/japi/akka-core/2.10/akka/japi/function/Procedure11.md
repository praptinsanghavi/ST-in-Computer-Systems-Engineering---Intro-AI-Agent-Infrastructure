---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure11.html
title: Procedure11
---

# Procedure11

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure11\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>
extends java.io.Serializable
```

A Consumer interface. Used to create 11\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11))​([T1](Procedure11.html "type parameter in Procedure11") arg1,  [T2](Procedure11.html "type parameter in Procedure11") arg2,  [T3](Procedure11.html "type parameter in Procedure11") arg3,  [T4](Procedure11.html "type parameter in Procedure11") arg4,  [T5](Procedure11.html "type parameter in Procedure11") arg5,  [T6](Procedure11.html "type parameter in Procedure11") arg6,  [T7](Procedure11.html "type parameter in Procedure11") arg7,  [T8](Procedure11.html "type parameter in Procedure11") arg8,  [T9](Procedure11.html "type parameter in Procedure11") arg9,  [T10](Procedure11.html "type parameter in Procedure11") arg10,  [T11](Procedure11.html "type parameter in Procedure11") arg11)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure11.html "type parameter in Procedure11") arg1,
		           [T2](Procedure11.html "type parameter in Procedure11") arg2,
		           [T3](Procedure11.html "type parameter in Procedure11") arg3,
		           [T4](Procedure11.html "type parameter in Procedure11") arg4,
		           [T5](Procedure11.html "type parameter in Procedure11") arg5,
		           [T6](Procedure11.html "type parameter in Procedure11") arg6,
		           [T7](Procedure11.html "type parameter in Procedure11") arg7,
		           [T8](Procedure11.html "type parameter in Procedure11") arg8,
		           [T9](Procedure11.html "type parameter in Procedure11") arg9,
		           [T10](Procedure11.html "type parameter in Procedure11") arg10,
		           [T11](Procedure11.html "type parameter in Procedure11") arg11)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure11.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure11.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure11.html)*