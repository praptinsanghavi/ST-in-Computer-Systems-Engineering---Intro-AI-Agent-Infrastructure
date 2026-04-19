---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/Unsafe.html
title: Unsafe
---

# Unsafe

## Content

Package [akka.util](package-summary.html)
## Class Unsafe

- java.lang.Object
- - akka.util.Unsafe

- ---

```
[@InternalApi](../annotation/InternalApi.html "annotation in akka.annotation")
public final class Unsafe
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unsafe](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[copyUSAsciiStrToBytes](#copyUSAsciiStrToBytes(java.lang.String,byte%5B%5D))​(java.lang.String str,  byte[] bytes)` |  |
	| `static int` | `[fastHash](#fastHash(java.lang.String))​(java.lang.String str)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Unsafe
		
		
		
		```
		public Unsafe()
		```

	- ### Method Detail
	
	
	
		- #### copyUSAsciiStrToBytes
		
		
		
		```
		[@InternalStableApi](../annotation/InternalStableApi.html "annotation in akka.annotation")
		public static void copyUSAsciiStrToBytes​(java.lang.String str,
		                                         byte[] bytes)
		```
		- #### fastHash
		
		
		
		```
		public static int fastHash​(java.lang.String str)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/japi/akka/current/akka/annotation/InternalStableApi.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/Unsafe.html](https://doc.akka.io/japi/akka/current/akka/util/Unsafe.html)*