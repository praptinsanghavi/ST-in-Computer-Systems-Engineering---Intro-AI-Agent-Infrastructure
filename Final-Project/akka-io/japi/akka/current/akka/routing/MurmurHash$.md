---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/MurmurHash$.html
title: MurmurHash$
---

# MurmurHash$

## Content

Package [akka.routing](package-summary.html)
## Class MurmurHash$

- java.lang.Object
- - akka.routing.MurmurHash$

- ---

```
public class MurmurHash$
extends java.lang.Object
```

An object designed to generate well\-distributed non\-cryptographic
 hashes. It is designed to hash a collection of integers; along with
 the integers to hash, it generates two magic streams of integers to
 increase the distribution of repetitive input sequences. Thus,
 three methods need to be called at each step (to start and to
 incorporate a new integer) to update the values. Only one method
 needs to be called to finalize the hash.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MurmurHash$](MurmurHash$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MurmurHash$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> int` | `[arrayHash](#arrayHash(java.lang.Object))​(java.lang.Object a)` | Compute a high\-quality hash of an array |
	| `int` | `[extendHash](#extendHash(int,int,int,int))​(int hash,  int value,  int magicA,  int magicB)` | Incorporates a new value into an existing hash. |
	| `int` | `[finalizeHash](#finalizeHash(int))​(int hash)` | Once all hashes have been incorporated, this performs a final mixing |
	| `int` | `[nextMagicA](#nextMagicA(int))​(int magicA)` | Given a magic integer from the first stream, compute the next |
	| `int` | `[nextMagicB](#nextMagicB(int))​(int magicB)` | Given a magic integer from the second stream, compute the next |
	| `int` | `[startHash](#startHash(int))​(int seed)` | Begin a new hash with a seed value. |
	| `int` | `[startMagicA](#startMagicA())()` | The initial magic integers in the first stream. |
	| `int` | `[startMagicB](#startMagicB())()` | The initial magic integer in the second stream. |
	| `int` | `[stringHash](#stringHash(java.lang.String))​(java.lang.String s)` | Compute a high\-quality hash of a string |
	| `<T> int` | `[symmetricHash](#symmetricHash(scala.collection.IterableOnce,int))​(scala.collection.IterableOnce<T> xs,  int seed)` | Compute a hash that is symmetric in its arguments\-\-that is,  where the order of appearance of elements does not matter. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MurmurHash$](MurmurHash$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MurmurHash$
		
		
		
		```
		public MurmurHash$()
		```

	- ### Method Detail
	
	
	
		- #### startHash
		
		
		
		```
		public int startHash​(int seed)
		```
		
		Begin a new hash with a seed value.
		- #### startMagicA
		
		
		
		```
		public int startMagicA()
		```
		
		The initial magic integers in the first stream.
		- #### startMagicB
		
		
		
		```
		public int startMagicB()
		```
		
		The initial magic integer in the second stream.
		- #### extendHash
		
		
		
		```
		public int extendHash​(int hash,
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
		public int nextMagicA​(int magicA)
		```
		
		Given a magic integer from the first stream, compute the next
		- #### nextMagicB
		
		
		
		```
		public int nextMagicB​(int magicB)
		```
		
		Given a magic integer from the second stream, compute the next
		- #### finalizeHash
		
		
		
		```
		public int finalizeHash​(int hash)
		```
		
		Once all hashes have been incorporated, this performs a final mixing
		- #### arrayHash
		
		
		
		```
		public <T> int arrayHash​(java.lang.Object a)
		```
		
		Compute a high\-quality hash of an array
		- #### stringHash
		
		
		
		```
		public int stringHash​(java.lang.String s)
		```
		
		Compute a high\-quality hash of a string
		- #### symmetricHash
		
		
		
		```
		public <T> int symmetricHash​(scala.collection.IterableOnce<T> xs,
		                             int seed)
		```
		
		Compute a hash that is symmetric in its arguments\-\-that is,
		 where the order of appearance of elements does not matter.
		 This is useful for hashing sets, for example.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/routing/MurmurHash$.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/MurmurHash$.html](https://doc.akka.io/japi/akka/current/akka/routing/MurmurHash$.html)*