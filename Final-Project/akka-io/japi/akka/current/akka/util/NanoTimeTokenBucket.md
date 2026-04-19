---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/NanoTimeTokenBucket.html
title: NanoTimeTokenBucket
---

# NanoTimeTokenBucket

## Content

Package [akka.util](package-summary.html)
## Class NanoTimeTokenBucket

- java.lang.Object
- - akka.util.NanoTimeTokenBucket

- ---

```
public final class NanoTimeTokenBucket
extends java.lang.Object
```

Default implementation of `TokenBucket` that uses `System.nanoTime` as the time source.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NanoTimeTokenBucket](#%3Cinit%3E(long,long))​(long _cap,  long _period)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[currentTime](#currentTime())()` | The current time in nanos. |
	| `void` | `[init](#init())()` | This method must be called before the token bucket can be used. |
	| `long` | `[offer](#offer(long))​(long cost)` | Call this (side\-effecting) method whenever an element should be passed through the token\-bucket. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NanoTimeTokenBucket
		
		
		
		```
		public NanoTimeTokenBucket​(long _cap,
		                           long _period)
		```

	- ### Method Detail
	
	
	
		- #### currentTime
		
		
		
		```
		public long currentTime()
		```
		
		The current time in nanos. The returned value is monotonic, might wrap over and has no relationship with wall\-clock.
		 
		
		Returns:
		return the current time in nanos as a Long.
		- #### init
		
		
		
		```
		public void init()
		```
		
		This method must be called before the token bucket can be used.
		- #### offer
		
		
		
		```
		public long offer​(long cost)
		```
		
		Call this (side\-effecting) method whenever an element should be passed through the token\-bucket. This method
		 will return the number of nanoseconds the element needs to be delayed to conform with the token bucket parameters.
		 Returns zero if the element can be emitted immediately. The method does not handle overflow, if an element is to
		 be delayed longer in nanoseconds than what can be represented as a positive Long then an undefined value is returned.
		 
		 If a non\-zero value is returned, it is the responsibility of the caller to not call this method before the
		 returned delay has been elapsed (but can be called later). This class does not check or protect against early
		 calls.
		 
		
		
		
		Parameters:
		`cost` \- How many tokens the element costs. Can be larger than the capacity of the bucket.
		Returns:

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/NanoTimeTokenBucket.html](https://doc.akka.io/japi/akka/current/akka/util/NanoTimeTokenBucket.html)*