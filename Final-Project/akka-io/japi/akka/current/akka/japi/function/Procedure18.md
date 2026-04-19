---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure18.html
title: Procedure18
---

# Procedure18

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure18\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure18<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>
extends java.io.Serializable
```

A Consumer interface. Used to create 18\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18))​([T1](Procedure18.html "type parameter in Procedure18") arg1,  [T2](Procedure18.html "type parameter in Procedure18") arg2,  [T3](Procedure18.html "type parameter in Procedure18") arg3,  [T4](Procedure18.html "type parameter in Procedure18") arg4,  [T5](Procedure18.html "type parameter in Procedure18") arg5,  [T6](Procedure18.html "type parameter in Procedure18") arg6,  [T7](Procedure18.html "type parameter in Procedure18") arg7,  [T8](Procedure18.html "type parameter in Procedure18") arg8,  [T9](Procedure18.html "type parameter in Procedure18") arg9,  [T10](Procedure18.html "type parameter in Procedure18") arg10,  [T11](Procedure18.html "type parameter in Procedure18") arg11,  [T12](Procedure18.html "type parameter in Procedure18") arg12,  [T13](Procedure18.html "type parameter in Procedure18") arg13,  [T14](Procedure18.html "type parameter in Procedure18") arg14,  [T15](Procedure18.html "type parameter in Procedure18") arg15,  [T16](Procedure18.html "type parameter in Procedure18") arg16,  [T17](Procedure18.html "type parameter in Procedure18") arg17,  [T18](Procedure18.html "type parameter in Procedure18") arg18)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure18.html "type parameter in Procedure18") arg1,
		           [T2](Procedure18.html "type parameter in Procedure18") arg2,
		           [T3](Procedure18.html "type parameter in Procedure18") arg3,
		           [T4](Procedure18.html "type parameter in Procedure18") arg4,
		           [T5](Procedure18.html "type parameter in Procedure18") arg5,
		           [T6](Procedure18.html "type parameter in Procedure18") arg6,
		           [T7](Procedure18.html "type parameter in Procedure18") arg7,
		           [T8](Procedure18.html "type parameter in Procedure18") arg8,
		           [T9](Procedure18.html "type parameter in Procedure18") arg9,
		           [T10](Procedure18.html "type parameter in Procedure18") arg10,
		           [T11](Procedure18.html "type parameter in Procedure18") arg11,
		           [T12](Procedure18.html "type parameter in Procedure18") arg12,
		           [T13](Procedure18.html "type parameter in Procedure18") arg13,
		           [T14](Procedure18.html "type parameter in Procedure18") arg14,
		           [T15](Procedure18.html "type parameter in Procedure18") arg15,
		           [T16](Procedure18.html "type parameter in Procedure18") arg16,
		           [T17](Procedure18.html "type parameter in Procedure18") arg17,
		           [T18](Procedure18.html "type parameter in Procedure18") arg18)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure18.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure18.html](https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure18.html)*