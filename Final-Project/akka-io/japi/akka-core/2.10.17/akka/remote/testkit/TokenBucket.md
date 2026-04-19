---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:12:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/TokenBucket.html
title: TokenBucket
---

# TokenBucket

## Content

Package [akka.remote.testkit](package-summary.html)
## Class TokenBucket

- java.lang.Object
- - akka.remote.testkit.TokenBucket

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class TokenBucket
extends java.lang.Object
implements [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testkit.TokenBucket)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TokenBucket](#%3Cinit%3E(int,double,long,int))​(int capacity,  double tokensPerSecond,  long nanoTimeOfLastSend,  int availableTokens)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [TokenBucket](TokenBucket.html "class in akka.remote.testkit")` | `[apply](#apply(int,double,long,int))​(int capacity,  double tokensPerSecond,  long nanoTimeOfLastSend,  int availableTokens)` |  |
	| `int` | `[availableTokens](#availableTokens())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[capacity](#capacity())()` |  |
	| `[TokenBucket](TokenBucket.html "class in akka.remote.testkit")` | `[copy](#copy(int,double,long,int))​(int capacity,  double tokensPerSecond,  long nanoTimeOfLastSend,  int availableTokens)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `double` | `[copy$default$2](#copy$default$2())()` |  |
	| `long` | `[copy$default$3](#copy$default$3())()` |  |
	| `int` | `[copy$default$4](#copy$default$4())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `long` | `[nanoTimeOfLastSend](#nanoTimeOfLastSend())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[timeToAvailable](#timeToAvailable(long,int))​(long currentNanoTime,  int tokens)` |  |
	| `double` | `[tokensPerSecond](#tokensPerSecond())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Tuple2<[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​java.lang.Object>` | `[tryConsumeTokens](#tryConsumeTokens(long,int))​(long nanoTimeOfSend,  int tokens)` |  |
	| `static scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.remote.testkit.TokenBucket))​([TokenBucket](TokenBucket.html "class in akka.remote.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### TokenBucket
		
		
		
		```
		public TokenBucket​(int capacity,
		                   double tokensPerSecond,
		                   long nanoTimeOfLastSend,
		                   int availableTokens)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [TokenBucket](TokenBucket.html "class in akka.remote.testkit") apply​(int capacity,
		                                double tokensPerSecond,
		                                long nanoTimeOfLastSend,
		                                int availableTokens)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​([TokenBucket](TokenBucket.html "class in akka.remote.testkit") x$0)
		```
		- #### capacity
		
		
		
		```
		public int capacity()
		```
		- #### tokensPerSecond
		
		
		
		```
		public double tokensPerSecond()
		```
		- #### nanoTimeOfLastSend
		
		
		
		```
		public long nanoTimeOfLastSend()
		```
		- #### availableTokens
		
		
		
		```
		public int availableTokens()
		```
		- #### tryConsumeTokens
		
		
		
		```
		public scala.Tuple2<[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​java.lang.Object> tryConsumeTokens​(long nanoTimeOfSend,
		                                                                          int tokens)
		```
		
		
		Specified by:
		`[tryConsumeTokens](ThrottleMode.html#tryConsumeTokens(long,int))` in interface `[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")`
		- #### timeToAvailable
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration timeToAvailable​(long currentNanoTime,
		                                                                int tokens)
		```
		
		
		Specified by:
		`[timeToAvailable](ThrottleMode.html#timeToAvailable(long,int))` in interface `[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")`
		- #### copy
		
		
		
		```
		public [TokenBucket](TokenBucket.html "class in akka.remote.testkit") copy​(int capacity,
		                        double tokensPerSecond,
		                        long nanoTimeOfLastSend,
		                        int availableTokens)
		```
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public double copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public long copy$default$3()
		```
		- #### copy$default$4
		
		
		
		```
		public int copy$default$4()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/TokenBucket.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/TokenBucket.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/TokenBucket.html)*