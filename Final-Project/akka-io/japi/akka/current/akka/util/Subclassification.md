---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/Subclassification.html
title: Subclassification
---

# Subclassification

## Content

Package [akka.util](package-summary.html)
## Interface Subclassification\<K\>

- ---

```
public interface Subclassification<K>
```

Typeclass which describes a classification hierarchy. Observe the contract between `isEqual` and `isSubclass`!

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isEqual](#isEqual(K,K))​([K](Subclassification.html "type parameter in Subclassification") x,  [K](Subclassification.html "type parameter in Subclassification") y)` | True if and only if x and y are of the same class. |
	| `boolean` | `[isSubclass](#isSubclass(K,K))​([K](Subclassification.html "type parameter in Subclassification") x,  [K](Subclassification.html "type parameter in Subclassification") y)` | True if and only if x is a subclass of y; equal classes must be considered sub\-classes! |

- - ### Method Detail
	
	
	
		- #### isEqual
		
		
		
		```
		boolean isEqual​([K](Subclassification.html "type parameter in Subclassification") x,
		                [K](Subclassification.html "type parameter in Subclassification") y)
		```
		
		True if and only if x and y are of the same class.
		- #### isSubclass
		
		
		
		```
		boolean isSubclass​([K](Subclassification.html "type parameter in Subclassification") x,
		                   [K](Subclassification.html "type parameter in Subclassification") y)
		```
		
		True if and only if x is a subclass of y; equal classes must be considered sub\-classes!

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/Subclassification.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/Subclassification.html](https://doc.akka.io/japi/akka/current/akka/util/Subclassification.html)*