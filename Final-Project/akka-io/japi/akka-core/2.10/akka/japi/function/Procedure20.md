---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure20.html
title: Procedure20
---

# Procedure20

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure20\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>
extends java.io.Serializable
```

A Consumer interface. Used to create 20\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20))​([T1](Procedure20.html "type parameter in Procedure20") arg1,  [T2](Procedure20.html "type parameter in Procedure20") arg2,  [T3](Procedure20.html "type parameter in Procedure20") arg3,  [T4](Procedure20.html "type parameter in Procedure20") arg4,  [T5](Procedure20.html "type parameter in Procedure20") arg5,  [T6](Procedure20.html "type parameter in Procedure20") arg6,  [T7](Procedure20.html "type parameter in Procedure20") arg7,  [T8](Procedure20.html "type parameter in Procedure20") arg8,  [T9](Procedure20.html "type parameter in Procedure20") arg9,  [T10](Procedure20.html "type parameter in Procedure20") arg10,  [T11](Procedure20.html "type parameter in Procedure20") arg11,  [T12](Procedure20.html "type parameter in Procedure20") arg12,  [T13](Procedure20.html "type parameter in Procedure20") arg13,  [T14](Procedure20.html "type parameter in Procedure20") arg14,  [T15](Procedure20.html "type parameter in Procedure20") arg15,  [T16](Procedure20.html "type parameter in Procedure20") arg16,  [T17](Procedure20.html "type parameter in Procedure20") arg17,  [T18](Procedure20.html "type parameter in Procedure20") arg18,  [T19](Procedure20.html "type parameter in Procedure20") arg19,  [T20](Procedure20.html "type parameter in Procedure20") arg20)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure20.html "type parameter in Procedure20") arg1,
		           [T2](Procedure20.html "type parameter in Procedure20") arg2,
		           [T3](Procedure20.html "type parameter in Procedure20") arg3,
		           [T4](Procedure20.html "type parameter in Procedure20") arg4,
		           [T5](Procedure20.html "type parameter in Procedure20") arg5,
		           [T6](Procedure20.html "type parameter in Procedure20") arg6,
		           [T7](Procedure20.html "type parameter in Procedure20") arg7,
		           [T8](Procedure20.html "type parameter in Procedure20") arg8,
		           [T9](Procedure20.html "type parameter in Procedure20") arg9,
		           [T10](Procedure20.html "type parameter in Procedure20") arg10,
		           [T11](Procedure20.html "type parameter in Procedure20") arg11,
		           [T12](Procedure20.html "type parameter in Procedure20") arg12,
		           [T13](Procedure20.html "type parameter in Procedure20") arg13,
		           [T14](Procedure20.html "type parameter in Procedure20") arg14,
		           [T15](Procedure20.html "type parameter in Procedure20") arg15,
		           [T16](Procedure20.html "type parameter in Procedure20") arg16,
		           [T17](Procedure20.html "type parameter in Procedure20") arg17,
		           [T18](Procedure20.html "type parameter in Procedure20") arg18,
		           [T19](Procedure20.html "type parameter in Procedure20") arg19,
		           [T20](Procedure20.html "type parameter in Procedure20") arg20)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure20.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure20.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure20.html)*