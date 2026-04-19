---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure3.html
title: Procedure3
---

# Procedure3

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure3\<T1,​T2,​T3\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure3<T1,​T2,​T3>
extends java.io.Serializable
```

A Consumer interface. Used to create 3\-arg consumers in Java.
 A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T1,T2,T3))​([T1](Procedure3.html "type parameter in Procedure3") arg1,  [T2](Procedure3.html "type parameter in Procedure3") arg2,  [T3](Procedure3.html "type parameter in Procedure3") arg3)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T1](Procedure3.html "type parameter in Procedure3") arg1,
		           [T2](Procedure3.html "type parameter in Procedure3") arg2,
		           [T3](Procedure3.html "type parameter in Procedure3") arg3)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure3.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure3.html](https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure3.html)*