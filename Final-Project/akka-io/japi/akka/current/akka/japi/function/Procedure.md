---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure.html
title: Procedure
---

# Procedure

## Content

Package [akka.japi.function](package-summary.html)
## Interface Procedure\<T\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Procedure<T>
extends java.io.Serializable
```

A Procedure is like a Function, but it doesn't produce a return value.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 Supports throwing `Exception` in the apply, which the `java.util.function.Consumer` counterpart does not.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[apply](#apply(T))​([T](Procedure.html "type parameter in Procedure") param)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		void apply​([T](Procedure.html "type parameter in Procedure") param)
		    throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure.html](https://doc.akka.io/japi/akka/current/akka/japi/function/Procedure.html)*