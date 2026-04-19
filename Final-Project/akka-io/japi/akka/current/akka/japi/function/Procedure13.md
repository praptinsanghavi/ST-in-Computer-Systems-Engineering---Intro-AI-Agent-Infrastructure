---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure13.html
title: Procedure13
---

# Procedure13

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure13\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>
extends java.io.Serializable
```

A Consumer interface. Used to create 13\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13))​([T1](Procedure13.html "type parameter in Procedure13") arg1,  [T2](Procedure13.html "type parameter in Procedure13") arg2,  [T3](Procedure13.html "type parameter in Procedure13") arg3,  [T4](Procedure13.html "type parameter in Procedure13") arg4,  [T5](Procedure13.html "type parameter in Procedure13") arg5,  [T6](Procedure13.html "type parameter in Procedure13") arg6,  [T7](Procedure13.html "type parameter in Procedure13") arg7,  [T8](Procedure13.html "type parameter in Procedure13") arg8,  [T9](Procedure13.html "type parameter in Procedure13") arg9,  [T10](Procedure13.html "type parameter in Procedure13") arg10,  [T11](Procedure13.html "type parameter in Procedure13") arg11,  [T12](Procedure13.html "type parameter in Procedure13") arg12,  [T13](Procedure13.html "type parameter in Procedure13") arg13)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure13.html "type parameter in Procedure13") arg1,
		           [T2](Procedure13.html "type parameter in Procedure13") arg2,
		           [T3](Procedure13.html "type parameter in Procedure13") arg3,
		           [T4](Procedure13.html "type parameter in Procedure13") arg4,
		           [T5](Procedure13.html "type parameter in Procedure13") arg5,
		           [T6](Procedure13.html "type parameter in Procedure13") arg6,
		           [T7](Procedure13.html "type parameter in Procedure13") arg7,
		           [T8](Procedure13.html "type parameter in Procedure13") arg8,
		           [T9](Procedure13.html "type parameter in Procedure13") arg9,
		           [T10](Procedure13.html "type parameter in Procedure13") arg10,
		           [T11](Procedure13.html "type parameter in Procedure13") arg11,
		           [T12](Procedure13.html "type parameter in Procedure13") arg12,
		           [T13](Procedure13.html "type parameter in Procedure13") arg13)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure13.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure13.html](https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure13.html)*