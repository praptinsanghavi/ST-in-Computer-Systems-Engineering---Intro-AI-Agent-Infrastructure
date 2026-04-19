---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BoyerMoore.html
title: BoyerMoore
---

# BoyerMoore

## Content

Package [akka.http.impl.engine.parsing](package-summary.html)
## Class BoyerMoore

- java.lang.Object
- - akka.http.impl.engine.parsing.BoyerMoore

- ---

```
public class BoyerMoore
extends java.lang.Object
```

Straight\-forward Boyer\-Moore string search implementation.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BoyerMoore](#%3Cinit%3E(byte%5B%5D))​(byte[] needle)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[nextIndex](#nextIndex(akka.util.ByteString,int))​(akka.util.ByteString haystack,  int offset)` | Returns the index of the next occurrence of `needle` in `haystack` that is \>\= `offset`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BoyerMoore
		
		
		
		```
		public BoyerMoore​(byte[] needle)
		```

	- ### Method Detail
	
	
	
		- #### nextIndex
		
		
		
		```
		public int nextIndex​(akka.util.ByteString haystack,
		                     int offset)
		```
		
		Returns the index of the next occurrence of `needle` in `haystack` that is \>\= `offset`.
		 If none is found a `NotEnoughDataException` is thrown.
		
		Parameters:
		`haystack` \- (undocumented)
		`offset` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BoyerMoore.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BoyerMoore.html)*