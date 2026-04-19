---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/ConcurrentMultiMap.html
title: ConcurrentMultiMap
---

# ConcurrentMultiMap

## Content

Package [akka.util](package-summary.html)
## Class ConcurrentMultiMap\<K,​V\>

- java.lang.Object
- - [akka.util.Index](Index.html "class in akka.util")\<K,​V\>
	- - akka.util.ConcurrentMultiMap\<K,​V\>

- ---

```
public class ConcurrentMultiMap<K,​V>
extends [Index](Index.html "class in akka.util")<K,​V>
```

An implementation of a ConcurrentMultiMap
 Adds/remove is serialized over the specified key
 Reads are fully concurrent \<\-\- el\-cheapo

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConcurrentMultiMap](#%3Cinit%3E(int,java.util.Comparator))​(int mapSize,  java.util.Comparator<[V](ConcurrentMultiMap.html "type parameter in ConcurrentMultiMap")> valueComparator)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class akka.util.[Index](Index.html "class in akka.util")
		
		
		`[clear](Index.html#clear()), [findValue](Index.html#findValue(K,scala.Function1)), [foreach](Index.html#foreach(scala.Function2)), [isEmpty](Index.html#isEmpty()), [keys](Index.html#keys()), [mapSize](Index.html#mapSize()), [put](Index.html#put(K,V)), [remove](Index.html#remove(K)), [remove](Index.html#remove(K,V)), [removeValue](Index.html#removeValue(V)), [valueComparator](Index.html#valueComparator()), [valueIterator](Index.html#valueIterator(K)), [values](Index.html#values())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConcurrentMultiMap
		
		
		
		```
		public ConcurrentMultiMap​(int mapSize,
		                          java.util.Comparator<[V](ConcurrentMultiMap.html "type parameter in ConcurrentMultiMap")> valueComparator)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/ConcurrentMultiMap.html
- https://doc.akka.io/japi/akka/current/akka/util/Index.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/ConcurrentMultiMap.html](https://doc.akka.io/japi/akka/current/akka/util/ConcurrentMultiMap.html)*