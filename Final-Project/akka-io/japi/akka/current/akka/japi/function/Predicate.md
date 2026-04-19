---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/function/Predicate.html
title: Predicate
---

# Predicate

## Content

Package [akka.japi.function](package-summary.html)
## Interface Predicate\<T\>

- All Superinterfaces:
`java.io.Serializable`

---

```
public interface Predicate<T>
extends java.io.Serializable
```

Java API: Defines a criteria and determines whether the parameter meets this criteria.
 `Serializable` is needed to be able to grab line number for Java 8 lambdas.
 Supports throwing `Exception` in the apply, which the `java.util.function.Predicate` counterpart does not.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[test](#test(T))​([T](Predicate.html "type parameter in Predicate") param)` |  |

- - ### Method Detail
	
	
	
		- #### test
		
		
		
		```
		boolean test​([T](Predicate.html "type parameter in Predicate") param)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/function/Predicate.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/function/Predicate.html](https://doc.akka.io/japi/akka/current/akka/japi/function/Predicate.html)*