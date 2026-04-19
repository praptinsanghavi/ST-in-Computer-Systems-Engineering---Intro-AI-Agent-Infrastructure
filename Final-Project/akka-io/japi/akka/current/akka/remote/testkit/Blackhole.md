---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:37:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testkit/Blackhole.html
title: Blackhole
---

# Blackhole

## Content

Package [akka.remote.testkit](package-summary.html)
## Class Blackhole

- java.lang.Object
- - akka.remote.testkit.Blackhole

- ---

```
public class Blackhole
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Blackhole](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static scala.concurrent.duration.FiniteDuration` | `[timeToAvailable](#timeToAvailable(long,int))​(long currentNanoTime,  int tokens)` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Tuple2<[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​java.lang.Object>` | `[tryConsumeTokens](#tryConsumeTokens(long,int))​(long nanoTimeOfSend,  int tokens)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Blackhole
		
		
		
		```
		public Blackhole()
		```

	- ### Method Detail
	
	
	
		- #### tryConsumeTokens
		
		
		
		```
		public static scala.Tuple2<[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​java.lang.Object> tryConsumeTokens​(long nanoTimeOfSend,
		                                                                                 int tokens)
		```
		- #### timeToAvailable
		
		
		
		```
		public static scala.concurrent.duration.FiniteDuration timeToAvailable​(long currentNanoTime,
		                                                                       int tokens)
		```
		- #### getInstance
		
		
		
		```
		public static [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") getInstance()
		```
		
		Java API: get the singleton instance
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### hashCode
		
		
		
		```
		public static int hashCode()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testkit/Blackhole.html](https://doc.akka.io/japi/akka/current/akka/remote/testkit/Blackhole.html)*