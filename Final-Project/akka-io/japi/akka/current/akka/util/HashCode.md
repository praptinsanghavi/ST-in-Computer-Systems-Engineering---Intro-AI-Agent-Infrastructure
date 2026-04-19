---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/HashCode.html
title: HashCode
---

# HashCode

## Content

Package [akka.util](package-summary.html)
## Class HashCode

- java.lang.Object
- - akka.util.HashCode

- ---

```
public class HashCode
extends java.lang.Object
```

Set of methods which allow easy implementation of `hashCode`.
 
 Example:
 

```

  override def hashCode: Int = {
    var result = HashCode.SEED
    //collect the contributions of various fields
    result = HashCode.hash(result, fPrimitive)
    result = HashCode.hash(result, fObject)
    result = HashCode.hash(result, fArray)
    result
  }
 
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HashCode](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static int` | `[hash](#hash(int,boolean))​(int seed,  boolean value)` |  |
	| `static int` | `[hash](#hash(int,char))​(int seed,  char value)` |  |
	| `static int` | `[hash](#hash(int,double))​(int seed,  double value)` |  |
	| `static int` | `[hash](#hash(int,float))​(int seed,  float value)` |  |
	| `static int` | `[hash](#hash(int,int))​(int seed,  int value)` |  |
	| `static int` | `[hash](#hash(int,long))​(int seed,  long value)` |  |
	| `static int` | `[hash](#hash(int,java.lang.Object))​(int seed,  java.lang.Object any)` |  |
	| `static int` | `[SEED](#SEED())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HashCode
		
		
		
		```
		public HashCode()
		```

	- ### Method Detail
	
	
	
		- #### SEED
		
		
		
		```
		public static int SEED()
		```
		- #### hash
		
		
		
		```
		public static int hash​(int seed,
		                       java.lang.Object any)
		```
		- #### hash
		
		
		
		```
		public static int hash​(int seed,
		                       boolean value)
		```
		- #### hash
		
		
		
		```
		public static int hash​(int seed,
		                       char value)
		```
		- #### hash
		
		
		
		```
		public static int hash​(int seed,
		                       int value)
		```
		- #### hash
		
		
		
		```
		public static int hash​(int seed,
		                       long value)
		```
		- #### hash
		
		
		
		```
		public static int hash​(int seed,
		                       float value)
		```
		- #### hash
		
		
		
		```
		public static int hash​(int seed,
		                       double value)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/HashCode.html](https://doc.akka.io/japi/akka/current/akka/util/HashCode.html)*