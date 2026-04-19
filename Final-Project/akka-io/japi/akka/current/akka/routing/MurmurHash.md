---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/MurmurHash.html
title: MurmurHash
---

# MurmurHash

## Content

Package [akka.routing](package-summary.html)
## Class MurmurHash

- java.lang.Object
- - akka.routing.MurmurHash

- ---

```
public class MurmurHash
extends java.lang.Object
```

An object designed to generate well\-distributed non\-cryptographic
 hashes. It is designed to hash a collection of integers; along with
 the integers to hash, it generates two magic streams of integers to
 increase the distribution of repetitive input sequences. Thus,
 three methods need to be called at each step (to start and to
 incorporate a new integer) to update the values. Only one method
 needs to be called to finalize the hash.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MurmurHash](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> int` | `[arrayHash](#arrayHash(java.lang.Object))​(java.lang.Object a)` | Compute a high\-quality hash of an array |
	| `static int` | `[extendHash](#extendHash(int,int,int,int))​(int hash,  int value,  int magicA,  int magicB)` | Incorporates a new value into an existing hash. |
	| `static int` | `[finalizeHash](#finalizeHash(int))​(int hash)` | Once all hashes have been incorporated, this performs a final mixing |
	| `static int` | `[nextMagicA](#nextMagicA(int))​(int magicA)` | Given a magic integer from the first stream, compute the next |
	| `static int` | `[nextMagicB](#nextMagicB(int))​(int magicB)` | Given a magic integer from the second stream, compute the next |
	| `static int` | `[startHash](#startHash(int))​(int seed)` | Begin a new hash with a seed value. |
	| `static int` | `[startMagicA](#startMagicA())()` | The initial magic integers in the first stream. |
	| `static int` | `[startMagicB](#startMagicB())()` | The initial magic integer in the second stream. |
	| `static int` | `[stringHash](#stringHash(java.lang.String))​(java.lang.String s)` | Compute a high\-quality hash of a string |
	| `static <T> int` | `[symmetricHash](#symmetricHash(scala.collection.IterableOnce,int))​(scala.collection.IterableOnce<T> xs,  int seed)` | Compute a hash that is symmetric in its arguments\-\-that is,  where the order of appearance of elements does not matter. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MurmurHash
		
		
		
		```
		public MurmurHash()
		```

	- ### Method Detail
	
	
	
		- #### startHash
		
		
		
		```
		public static int startHash​(int seed)
		```
		
		Begin a new hash with a seed value.
		- #### startMagicA
		
		
		
		```
		public static int startMagicA()
		```
		
		The initial magic integers in the first stream.
		- #### startMagicB
		
		
		
		```
		public static int startMagicB()
		```
		
		The initial magic integer in the second stream.
		- #### extendHash
		
		
		
		```
		public static int extendHash​(int hash,
		                             int value,
		                             int magicA,
		                             int magicB)
		```
		
		Incorporates a new value into an existing hash.
		 
		
		Parameters:
		`hash` \- the prior hash value
		`value` \- the new value to incorporate
		`magicA` \- a magic integer from the stream
		`magicB` \- a magic integer from a different stream
		Returns:
		the updated hash value
		- #### nextMagicA
		
		
		
		```
		public static int nextMagicA​(int magicA)
		```
		
		Given a magic integer from the first stream, compute the next
		- #### nextMagicB
		
		
		
		```
		public static int nextMagicB​(int magicB)
		```
		
		Given a magic integer from the second stream, compute the next
		- #### finalizeHash
		
		
		
		```
		public static int finalizeHash​(int hash)
		```
		
		Once all hashes have been incorporated, this performs a final mixing
		- #### arrayHash
		
		
		
		```
		public static <T> int arrayHash​(java.lang.Object a)
		```
		
		Compute a high\-quality hash of an array
		- #### stringHash
		
		
		
		```
		public static int stringHash​(java.lang.String s)
		```
		
		Compute a high\-quality hash of a string
		- #### symmetricHash
		
		
		
		```
		public static <T> int symmetricHash​(scala.collection.IterableOnce<T> xs,
		                                    int seed)
		```
		
		Compute a hash that is symmetric in its arguments\-\-that is,
		 where the order of appearance of elements does not matter.
		 This is useful for hashing sets, for example.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/MurmurHash.html](https://doc.akka.io/japi/akka/current/akka/routing/MurmurHash.html)*