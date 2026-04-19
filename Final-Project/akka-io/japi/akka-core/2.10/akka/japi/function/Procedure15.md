---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure15.html
title: Procedure15
---

# Procedure15

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure15\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>
extends java.io.Serializable
```

A Consumer interface. Used to create 15\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15))​([T1](Procedure15.html "type parameter in Procedure15") arg1,  [T2](Procedure15.html "type parameter in Procedure15") arg2,  [T3](Procedure15.html "type parameter in Procedure15") arg3,  [T4](Procedure15.html "type parameter in Procedure15") arg4,  [T5](Procedure15.html "type parameter in Procedure15") arg5,  [T6](Procedure15.html "type parameter in Procedure15") arg6,  [T7](Procedure15.html "type parameter in Procedure15") arg7,  [T8](Procedure15.html "type parameter in Procedure15") arg8,  [T9](Procedure15.html "type parameter in Procedure15") arg9,  [T10](Procedure15.html "type parameter in Procedure15") arg10,  [T11](Procedure15.html "type parameter in Procedure15") arg11,  [T12](Procedure15.html "type parameter in Procedure15") arg12,  [T13](Procedure15.html "type parameter in Procedure15") arg13,  [T14](Procedure15.html "type parameter in Procedure15") arg14,  [T15](Procedure15.html "type parameter in Procedure15") arg15)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure15.html "type parameter in Procedure15") arg1,
		           [T2](Procedure15.html "type parameter in Procedure15") arg2,
		           [T3](Procedure15.html "type parameter in Procedure15") arg3,
		           [T4](Procedure15.html "type parameter in Procedure15") arg4,
		           [T5](Procedure15.html "type parameter in Procedure15") arg5,
		           [T6](Procedure15.html "type parameter in Procedure15") arg6,
		           [T7](Procedure15.html "type parameter in Procedure15") arg7,
		           [T8](Procedure15.html "type parameter in Procedure15") arg8,
		           [T9](Procedure15.html "type parameter in Procedure15") arg9,
		           [T10](Procedure15.html "type parameter in Procedure15") arg10,
		           [T11](Procedure15.html "type parameter in Procedure15") arg11,
		           [T12](Procedure15.html "type parameter in Procedure15") arg12,
		           [T13](Procedure15.html "type parameter in Procedure15") arg13,
		           [T14](Procedure15.html "type parameter in Procedure15") arg14,
		           [T15](Procedure15.html "type parameter in Procedure15") arg15)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure15.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure15.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure15.html)*