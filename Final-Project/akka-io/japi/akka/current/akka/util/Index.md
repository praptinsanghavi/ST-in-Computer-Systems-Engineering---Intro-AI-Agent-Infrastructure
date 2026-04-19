---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/Index.html
title: Index
---

# Index

## Content

Package [akka.util](package-summary.html)
## Class Index\<K,​V\>

- java.lang.Object
- - akka.util.Index\<K,​V\>

- Direct Known Subclasses:
`[ConcurrentMultiMap](ConcurrentMultiMap.html "class in akka.util")`

---

```
public class Index<K,​V>
extends java.lang.Object
```

An implementation of a ConcurrentMultiMap
 Adds/remove is serialized over the specified key
 Reads are fully concurrent \<\-\- el\-cheapo

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Index](#%3Cinit%3E(int,java.util.Comparator))​(int mapSize,  java.util.Comparator<[V](Index.html "type parameter in Index")> valueComparator)` |  |
	| `[Index](#%3Cinit%3E(int,scala.Function2))​(int mapSize,  scala.Function2<[V](Index.html "type parameter in Index"),​[V](Index.html "type parameter in Index"),​java.lang.Object> cmp)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[clear](#clear())()` | Removes all keys and all values |
	| `scala.Option<[V](Index.html "type parameter in Index")>` | `[findValue](#findValue(K,scala.Function1))​([K](Index.html "type parameter in Index") key,  scala.Function1<[V](Index.html "type parameter in Index"),​java.lang.Object> f)` |  |
	| `void` | `[foreach](#foreach(scala.Function2))​(scala.Function2<[K](Index.html "type parameter in Index"),​[V](Index.html "type parameter in Index"),​scala.runtime.BoxedUnit> fun)` | Applies the supplied function to all keys and their values |
	| `boolean` | `[isEmpty](#isEmpty())()` |  |
	| `scala.collection.Iterable<[K](Index.html "type parameter in Index")>` | `[keys](#keys())()` | Returns the key set. |
	| `int` | `[mapSize](#mapSize())()` |  |
	| `boolean` | `[put](#put(K,V))​([K](Index.html "type parameter in Index") key,  [V](Index.html "type parameter in Index") value)` | Associates the value of type V with the key of type K |
	| `scala.Option<scala.collection.Iterable<[V](Index.html "type parameter in Index")>>` | `[remove](#remove(K))​([K](Index.html "type parameter in Index") key)` | Disassociates all the values for the specified key |
	| `boolean` | `[remove](#remove(K,V))​([K](Index.html "type parameter in Index") key,  [V](Index.html "type parameter in Index") value)` | Disassociates the value of type V from the key of type K |
	| `void` | `[removeValue](#removeValue(V))​([V](Index.html "type parameter in Index") value)` | Removes the specified value from all keys |
	| `java.util.Comparator<[V](Index.html "type parameter in Index")>` | `[valueComparator](#valueComparator())()` |  |
	| `scala.collection.Iterator<[V](Index.html "type parameter in Index")>` | `[valueIterator](#valueIterator(K))​([K](Index.html "type parameter in Index") key)` | Returns an Iterator of V containing the values for the supplied key, or an empty iterator if the key doesn't exist |
	| `scala.collection.immutable.Set<[V](Index.html "type parameter in Index")>` | `[values](#values())()` | Returns the union of all value sets. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Index
		
		
		
		```
		public Index​(int mapSize,
		             java.util.Comparator<[V](Index.html "type parameter in Index")> valueComparator)
		```
		- #### Index
		
		
		
		```
		public Index​(int mapSize,
		             scala.Function2<[V](Index.html "type parameter in Index"),​[V](Index.html "type parameter in Index"),​java.lang.Object> cmp)
		```

	- ### Method Detail
	
	
	
		- #### clear
		
		
		
		```
		public void clear()
		```
		
		Removes all keys and all values
		- #### findValue
		
		
		
		```
		public scala.Option<[V](Index.html "type parameter in Index")> findValue​([K](Index.html "type parameter in Index") key,
		                                 scala.Function1<[V](Index.html "type parameter in Index"),​java.lang.Object> f)
		```
		
		
		Returns:
		Some(value) for the first matching value where the supplied function returns true for the given key,
		 if no matches it returns None
		- #### foreach
		
		
		
		```
		public void foreach​(scala.Function2<[K](Index.html "type parameter in Index"),​[V](Index.html "type parameter in Index"),​scala.runtime.BoxedUnit> fun)
		```
		
		Applies the supplied function to all keys and their values
		- #### isEmpty
		
		
		
		```
		public boolean isEmpty()
		```
		
		
		Returns:
		true if the underlying containers is empty, may report false negatives when the last remove is underway
		- #### keys
		
		
		
		```
		public scala.collection.Iterable<[K](Index.html "type parameter in Index")> keys()
		```
		
		Returns the key set.
		- #### mapSize
		
		
		
		```
		public int mapSize()
		```
		- #### put
		
		
		
		```
		public boolean put​([K](Index.html "type parameter in Index") key,
		                   [V](Index.html "type parameter in Index") value)
		```
		
		Associates the value of type V with the key of type K
		
		Returns:
		true if the value didn't exist for the key previously, and false otherwise
		- #### remove
		
		
		
		```
		public boolean remove​([K](Index.html "type parameter in Index") key,
		                      [V](Index.html "type parameter in Index") value)
		```
		
		Disassociates the value of type V from the key of type K
		
		Returns:
		true if the value was disassociated from the key and false if it wasn't previously associated with the key
		- #### remove
		
		
		
		```
		public scala.Option<scala.collection.Iterable<[V](Index.html "type parameter in Index")>> remove​([K](Index.html "type parameter in Index") key)
		```
		
		Disassociates all the values for the specified key
		
		Returns:
		None if the key wasn't associated at all, or Some(scala.Iterable\[V]) if it was associated
		- #### removeValue
		
		
		
		```
		public void removeValue​([V](Index.html "type parameter in Index") value)
		```
		
		Removes the specified value from all keys
		- #### valueComparator
		
		
		
		```
		public java.util.Comparator<[V](Index.html "type parameter in Index")> valueComparator()
		```
		- #### valueIterator
		
		
		
		```
		public scala.collection.Iterator<[V](Index.html "type parameter in Index")> valueIterator​([K](Index.html "type parameter in Index") key)
		```
		
		Returns an Iterator of V containing the values for the supplied key, or an empty iterator if the key doesn't exist
		- #### values
		
		
		
		```
		public scala.collection.immutable.Set<[V](Index.html "type parameter in Index")> values()
		```
		
		Returns the union of all value sets.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/ConcurrentMultiMap.html
- https://doc.akka.io/japi/akka/current/akka/util/Index.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/Index.html](https://doc.akka.io/japi/akka/current/akka/util/Index.html)*