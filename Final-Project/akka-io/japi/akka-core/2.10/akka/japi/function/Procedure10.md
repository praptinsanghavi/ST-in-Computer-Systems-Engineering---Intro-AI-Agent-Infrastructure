---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure10.html
title: Procedure10
---

# Procedure10

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure10\<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>
extends java.io.Serializable
```

A Consumer interface. Used to create 10\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10))​([T1](Procedure10.html "type parameter in Procedure10") arg1,  [T2](Procedure10.html "type parameter in Procedure10") arg2,  [T3](Procedure10.html "type parameter in Procedure10") arg3,  [T4](Procedure10.html "type parameter in Procedure10") arg4,  [T5](Procedure10.html "type parameter in Procedure10") arg5,  [T6](Procedure10.html "type parameter in Procedure10") arg6,  [T7](Procedure10.html "type parameter in Procedure10") arg7,  [T8](Procedure10.html "type parameter in Procedure10") arg8,  [T9](Procedure10.html "type parameter in Procedure10") arg9,  [T10](Procedure10.html "type parameter in Procedure10") arg10)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure10.html "type parameter in Procedure10") arg1,
		           [T2](Procedure10.html "type parameter in Procedure10") arg2,
		           [T3](Procedure10.html "type parameter in Procedure10") arg3,
		           [T4](Procedure10.html "type parameter in Procedure10") arg4,
		           [T5](Procedure10.html "type parameter in Procedure10") arg5,
		           [T6](Procedure10.html "type parameter in Procedure10") arg6,
		           [T7](Procedure10.html "type parameter in Procedure10") arg7,
		           [T8](Procedure10.html "type parameter in Procedure10") arg8,
		           [T9](Procedure10.html "type parameter in Procedure10") arg9,
		           [T10](Procedure10.html "type parameter in Procedure10") arg10)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure10.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure10.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure10.html)*