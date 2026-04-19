---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure14.html
title: Procedure14
---

# Procedure14

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure14\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>
extends java.io.Serializable
```

A Consumer interface. Used to create 14\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14))​([T1](Procedure14.html "type parameter in Procedure14") arg1,  [T2](Procedure14.html "type parameter in Procedure14") arg2,  [T3](Procedure14.html "type parameter in Procedure14") arg3,  [T4](Procedure14.html "type parameter in Procedure14") arg4,  [T5](Procedure14.html "type parameter in Procedure14") arg5,  [T6](Procedure14.html "type parameter in Procedure14") arg6,  [T7](Procedure14.html "type parameter in Procedure14") arg7,  [T8](Procedure14.html "type parameter in Procedure14") arg8,  [T9](Procedure14.html "type parameter in Procedure14") arg9,  [T10](Procedure14.html "type parameter in Procedure14") arg10,  [T11](Procedure14.html "type parameter in Procedure14") arg11,  [T12](Procedure14.html "type parameter in Procedure14") arg12,  [T13](Procedure14.html "type parameter in Procedure14") arg13,  [T14](Procedure14.html "type parameter in Procedure14") arg14)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure14.html "type parameter in Procedure14") arg1,
		           [T2](Procedure14.html "type parameter in Procedure14") arg2,
		           [T3](Procedure14.html "type parameter in Procedure14") arg3,
		           [T4](Procedure14.html "type parameter in Procedure14") arg4,
		           [T5](Procedure14.html "type parameter in Procedure14") arg5,
		           [T6](Procedure14.html "type parameter in Procedure14") arg6,
		           [T7](Procedure14.html "type parameter in Procedure14") arg7,
		           [T8](Procedure14.html "type parameter in Procedure14") arg8,
		           [T9](Procedure14.html "type parameter in Procedure14") arg9,
		           [T10](Procedure14.html "type parameter in Procedure14") arg10,
		           [T11](Procedure14.html "type parameter in Procedure14") arg11,
		           [T12](Procedure14.html "type parameter in Procedure14") arg12,
		           [T13](Procedure14.html "type parameter in Procedure14") arg13,
		           [T14](Procedure14.html "type parameter in Procedure14") arg14)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure14.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure14.html](https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure14.html)*