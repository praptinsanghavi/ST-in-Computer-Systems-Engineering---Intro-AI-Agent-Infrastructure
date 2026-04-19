---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure12.html
title: Procedure12
---

# Procedure12

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure12\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>
extends java.io.Serializable
```

A Consumer interface. Used to create 12\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12))​([T1](Procedure12.html "type parameter in Procedure12") arg1,  [T2](Procedure12.html "type parameter in Procedure12") arg2,  [T3](Procedure12.html "type parameter in Procedure12") arg3,  [T4](Procedure12.html "type parameter in Procedure12") arg4,  [T5](Procedure12.html "type parameter in Procedure12") arg5,  [T6](Procedure12.html "type parameter in Procedure12") arg6,  [T7](Procedure12.html "type parameter in Procedure12") arg7,  [T8](Procedure12.html "type parameter in Procedure12") arg8,  [T9](Procedure12.html "type parameter in Procedure12") arg9,  [T10](Procedure12.html "type parameter in Procedure12") arg10,  [T11](Procedure12.html "type parameter in Procedure12") arg11,  [T12](Procedure12.html "type parameter in Procedure12") arg12)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure12.html "type parameter in Procedure12") arg1,
		           [T2](Procedure12.html "type parameter in Procedure12") arg2,
		           [T3](Procedure12.html "type parameter in Procedure12") arg3,
		           [T4](Procedure12.html "type parameter in Procedure12") arg4,
		           [T5](Procedure12.html "type parameter in Procedure12") arg5,
		           [T6](Procedure12.html "type parameter in Procedure12") arg6,
		           [T7](Procedure12.html "type parameter in Procedure12") arg7,
		           [T8](Procedure12.html "type parameter in Procedure12") arg8,
		           [T9](Procedure12.html "type parameter in Procedure12") arg9,
		           [T10](Procedure12.html "type parameter in Procedure12") arg10,
		           [T11](Procedure12.html "type parameter in Procedure12") arg11,
		           [T12](Procedure12.html "type parameter in Procedure12") arg12)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure12.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure12.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure12.html)*