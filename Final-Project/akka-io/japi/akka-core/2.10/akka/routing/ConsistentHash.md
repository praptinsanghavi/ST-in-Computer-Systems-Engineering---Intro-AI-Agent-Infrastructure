---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:10:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHash.html
title: ConsistentHash
---

# ConsistentHash

## Content

Package [akka.routing](package-summary.html)
## Class ConsistentHash\<T\>

- java.lang.Object
- - akka.routing.ConsistentHash\<T\>

- ---

```
public class ConsistentHash<T>
extends java.lang.Object
```

Consistent Hashing node ring implementation.
 
 A good explanation of Consistent Hashing:
 https://tom\-e\-white.com/2007/11/consistent\-hashing.html
 

 Note that toString of the ring nodes are used for the node
 hash, i.e. make sure it is different for different nodes.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConsistentHash](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ConsistentHash](ConsistentHash.html "class in akka.routing")<[T](ConsistentHash.html "type parameter in ConsistentHash")>` | `[$colon$minus](#$colon$minus(T))​([T](ConsistentHash.html "type parameter in ConsistentHash") node)` | Removes a node from the node ring. |
	| `[ConsistentHash](ConsistentHash.html "class in akka.routing")<[T](ConsistentHash.html "type parameter in ConsistentHash")>` | `[$colon$plus](#$colon$plus(T))​([T](ConsistentHash.html "type parameter in ConsistentHash") node)` | Adds a node to the node ring. |
	| `[ConsistentHash](ConsistentHash.html "class in akka.routing")<[T](ConsistentHash.html "type parameter in ConsistentHash")>` | `[add](#add(T))​([T](ConsistentHash.html "type parameter in ConsistentHash") node)` | Java API: Adds a node to the node ring. |
	| `static <T> [ConsistentHash](ConsistentHash.html "class in akka.routing")<T>` | `[apply](#apply(scala.collection.Iterable,int,scala.reflect.ClassTag))​(scala.collection.Iterable<T> nodes,  int virtualNodesFactor,  scala.reflect.ClassTag<T> evidence$2)` |  |
	| `static <T> [ConsistentHash](ConsistentHash.html "class in akka.routing")<T>` | `[create](#create(java.lang.Iterable,int))​(java.lang.Iterable<T> nodes,  int virtualNodesFactor)` | Java API: Factory method to create a ConsistentHash |
	| `boolean` | `[isEmpty](#isEmpty())()` | Is the node ring empty, i.e. |
	| `[T](ConsistentHash.html "type parameter in ConsistentHash")` | `[nodeFor](#nodeFor(byte%5B%5D))​(byte[] key)` | Get the node responsible for the data key. |
	| `[T](ConsistentHash.html "type parameter in ConsistentHash")` | `[nodeFor](#nodeFor(java.lang.String))​(java.lang.String key)` | Get the node responsible for the data key. |
	| `[ConsistentHash](ConsistentHash.html "class in akka.routing")<[T](ConsistentHash.html "type parameter in ConsistentHash")>` | `[remove](#remove(T))​([T](ConsistentHash.html "type parameter in ConsistentHash") node)` | Java API: Removes a node from the node ring. |
	| `int` | `[virtualNodesFactor](#virtualNodesFactor())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConsistentHash
		
		
		
		```
		public ConsistentHash()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [ConsistentHash](ConsistentHash.html "class in akka.routing")<T> apply​(scala.collection.Iterable<T> nodes,
		                                          int virtualNodesFactor,
		                                          scala.reflect.ClassTag<T> evidence$2)
		```
		- #### create
		
		
		
		```
		public static <T> [ConsistentHash](ConsistentHash.html "class in akka.routing")<T> create​(java.lang.Iterable<T> nodes,
		                                           int virtualNodesFactor)
		```
		
		Java API: Factory method to create a ConsistentHash
		- #### virtualNodesFactor
		
		
		
		```
		public int virtualNodesFactor()
		```
		- #### $colon$plus
		
		
		
		```
		public [ConsistentHash](ConsistentHash.html "class in akka.routing")<[T](ConsistentHash.html "type parameter in ConsistentHash")> $colon$plus​([T](ConsistentHash.html "type parameter in ConsistentHash") node)
		```
		
		Adds a node to the node ring.
		 Note that the instance is immutable and this
		 operation returns a new instance.
		- #### add
		
		
		
		```
		public [ConsistentHash](ConsistentHash.html "class in akka.routing")<[T](ConsistentHash.html "type parameter in ConsistentHash")> add​([T](ConsistentHash.html "type parameter in ConsistentHash") node)
		```
		
		Java API: Adds a node to the node ring.
		 Note that the instance is immutable and this
		 operation returns a new instance.
		- #### $colon$minus
		
		
		
		```
		public [ConsistentHash](ConsistentHash.html "class in akka.routing")<[T](ConsistentHash.html "type parameter in ConsistentHash")> $colon$minus​([T](ConsistentHash.html "type parameter in ConsistentHash") node)
		```
		
		Removes a node from the node ring.
		 Note that the instance is immutable and this
		 operation returns a new instance.
		- #### remove
		
		
		
		```
		public [ConsistentHash](ConsistentHash.html "class in akka.routing")<[T](ConsistentHash.html "type parameter in ConsistentHash")> remove​([T](ConsistentHash.html "type parameter in ConsistentHash") node)
		```
		
		Java API: Removes a node from the node ring.
		 Note that the instance is immutable and this
		 operation returns a new instance.
		- #### nodeFor
		
		
		
		```
		public [T](ConsistentHash.html "type parameter in ConsistentHash") nodeFor​(byte[] key)
		```
		
		Get the node responsible for the data key.
		 Can only be used if nodes exists in the node ring,
		 otherwise throws `IllegalStateException`
		- #### nodeFor
		
		
		
		```
		public [T](ConsistentHash.html "type parameter in ConsistentHash") nodeFor​(java.lang.String key)
		```
		
		Get the node responsible for the data key.
		 Can only be used if nodes exists in the node ring,
		 otherwise throws `IllegalStateException`
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		
		Is the node ring empty, i.e. no nodes added or all removed.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHash.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHash.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHash.html)*