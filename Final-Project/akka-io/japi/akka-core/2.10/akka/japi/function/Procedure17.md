---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure17.html
title: Procedure17
---

# Procedure17

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure17\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>
extends java.io.Serializable
```

A Consumer interface. Used to create 17\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17))​([T1](Procedure17.html "type parameter in Procedure17") arg1,  [T2](Procedure17.html "type parameter in Procedure17") arg2,  [T3](Procedure17.html "type parameter in Procedure17") arg3,  [T4](Procedure17.html "type parameter in Procedure17") arg4,  [T5](Procedure17.html "type parameter in Procedure17") arg5,  [T6](Procedure17.html "type parameter in Procedure17") arg6,  [T7](Procedure17.html "type parameter in Procedure17") arg7,  [T8](Procedure17.html "type parameter in Procedure17") arg8,  [T9](Procedure17.html "type parameter in Procedure17") arg9,  [T10](Procedure17.html "type parameter in Procedure17") arg10,  [T11](Procedure17.html "type parameter in Procedure17") arg11,  [T12](Procedure17.html "type parameter in Procedure17") arg12,  [T13](Procedure17.html "type parameter in Procedure17") arg13,  [T14](Procedure17.html "type parameter in Procedure17") arg14,  [T15](Procedure17.html "type parameter in Procedure17") arg15,  [T16](Procedure17.html "type parameter in Procedure17") arg16,  [T17](Procedure17.html "type parameter in Procedure17") arg17)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure17.html "type parameter in Procedure17") arg1,
		           [T2](Procedure17.html "type parameter in Procedure17") arg2,
		           [T3](Procedure17.html "type parameter in Procedure17") arg3,
		           [T4](Procedure17.html "type parameter in Procedure17") arg4,
		           [T5](Procedure17.html "type parameter in Procedure17") arg5,
		           [T6](Procedure17.html "type parameter in Procedure17") arg6,
		           [T7](Procedure17.html "type parameter in Procedure17") arg7,
		           [T8](Procedure17.html "type parameter in Procedure17") arg8,
		           [T9](Procedure17.html "type parameter in Procedure17") arg9,
		           [T10](Procedure17.html "type parameter in Procedure17") arg10,
		           [T11](Procedure17.html "type parameter in Procedure17") arg11,
		           [T12](Procedure17.html "type parameter in Procedure17") arg12,
		           [T13](Procedure17.html "type parameter in Procedure17") arg13,
		           [T14](Procedure17.html "type parameter in Procedure17") arg14,
		           [T15](Procedure17.html "type parameter in Procedure17") arg15,
		           [T16](Procedure17.html "type parameter in Procedure17") arg16,
		           [T17](Procedure17.html "type parameter in Procedure17") arg17)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure17.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure17.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure17.html)*