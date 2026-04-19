---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/Procedure.html
title: Procedure
---

# Procedure

## Content

Package [akka.japi](package-summary.html)
## Interface Procedure\<T\>

- ---

```
public interface Procedure<T>
```

A Procedure is like a Function, but it doesn't produce a return value.
 
 This class is kept for compatibility, but for future API's please prefer [`Procedure`](function/Procedure.html "interface in akka.japi.function").

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

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Procedure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Procedure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/Procedure.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/Procedure.html)*