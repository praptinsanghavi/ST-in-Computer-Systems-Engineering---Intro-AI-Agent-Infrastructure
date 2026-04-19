---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:08:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/util/TypedMultiMap.html
title: TypedMultiMap
---

# TypedMultiMap

## Content

Package [akka.util](package-summary.html)
## Class TypedMultiMap\<T,​K\>

- java.lang.Object
- - akka.util.TypedMultiMap\<T,​K\>

- ---

```
public class TypedMultiMap<T,​K>
extends java.lang.Object
```

An immutable multi\-map that expresses the value type as a type function of the key
 type. Create it with a type constructor that expresses the relationship:
 

```

 trait Key { type Type = T }
 case class MyValue[T](...)

 // type function from Key to MyValue
 type KV[K <: Key] = MyValue[K#Type]

 val map = TypedMultiMap.empty[Key, KV]

 // a plain Int => String map would use this function:
 type plain[K <: Int] = String

 // a map T => T would use this function:
 type identity[T <: AnyRef] = T
 
```

 Caveat: using keys which take type parameters does not work due to conflicts
 with the existential interpretation of `Key[_]`. A workaround is to define
 a key type like above and provide a subtype that provides its type parameter
 as type member `Type`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TypedMultiMap](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")>` | `[$plus$plus](#$plus$plus(akka.util.TypedMultiMap))​([TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")> other)` | Add all entries from the other map, overwriting existing entries. |
	| `static <T,​K>[TypedMultiMap](TypedMultiMap.html "class in akka.util")<T,​K>` | `[empty](#empty())()` | Obtain the empty map for the given key type and key–value type function. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `scala.collection.immutable.Set<[K](TypedMultiMap.html "type parameter in TypedMultiMap")>` | `[get](#get(T))​([T](TypedMultiMap.html "type parameter in TypedMultiMap") key)` | Obtain all mappings for the given key. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")>` | `[inserted](#inserted(T,K))​([T](TypedMultiMap.html "type parameter in TypedMultiMap") key,  [K](TypedMultiMap.html "type parameter in TypedMultiMap") value)` | Return a map that has the given value added to the mappings for the given key. |
	| `[TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")>` | `[keyRemoved](#keyRemoved(T))​([T](TypedMultiMap.html "type parameter in TypedMultiMap") key)` | Return a map that has all mappings for the given key removed. |
	| `scala.collection.immutable.Set<[T](TypedMultiMap.html "type parameter in TypedMultiMap")>` | `[keySet](#keySet())()` | Return the set of keys which are mapped to non\-empty value sets. |
	| `[TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")>` | `[removed](#removed(T,K))​([T](TypedMultiMap.html "type parameter in TypedMultiMap") key,  [K](TypedMultiMap.html "type parameter in TypedMultiMap") value)` | Return a map that has the given mapping from the given key removed. |
	| `[TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")>` | `[setAll](#setAll(T,scala.collection.immutable.Set))​([T](TypedMultiMap.html "type parameter in TypedMultiMap") key,  scala.collection.immutable.Set<[K](TypedMultiMap.html "type parameter in TypedMultiMap")> values)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")>` | `[valueRemoved](#valueRemoved(java.lang.Object))​(java.lang.Object value)` | Return a map that has the given value removed from all keys. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TypedMultiMap
		
		
		
		```
		public TypedMultiMap()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static <T,​K> [TypedMultiMap](TypedMultiMap.html "class in akka.util")<T,​K> empty()
		```
		
		Obtain the empty map for the given key type and key–value type function.
		- #### keySet
		
		
		
		```
		public scala.collection.immutable.Set<[T](TypedMultiMap.html "type parameter in TypedMultiMap")> keySet()
		```
		
		Return the set of keys which are mapped to non\-empty value sets.
		- #### inserted
		
		
		
		```
		public [TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")> inserted​([T](TypedMultiMap.html "type parameter in TypedMultiMap") key,
		                                         [K](TypedMultiMap.html "type parameter in TypedMultiMap") value)
		```
		
		Return a map that has the given value added to the mappings for the given key.
		- #### get
		
		
		
		```
		public scala.collection.immutable.Set<[K](TypedMultiMap.html "type parameter in TypedMultiMap")> get​([T](TypedMultiMap.html "type parameter in TypedMultiMap") key)
		```
		
		Obtain all mappings for the given key.
		- #### valueRemoved
		
		
		
		```
		public [TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")> valueRemoved​(java.lang.Object value)
		```
		
		Return a map that has the given value removed from all keys.
		- #### keyRemoved
		
		
		
		```
		public [TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")> keyRemoved​([T](TypedMultiMap.html "type parameter in TypedMultiMap") key)
		```
		
		Return a map that has all mappings for the given key removed.
		- #### removed
		
		
		
		```
		public [TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")> removed​([T](TypedMultiMap.html "type parameter in TypedMultiMap") key,
		                                        [K](TypedMultiMap.html "type parameter in TypedMultiMap") value)
		```
		
		Return a map that has the given mapping from the given key removed.
		- #### setAll
		
		
		
		```
		public [TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")> setAll​([T](TypedMultiMap.html "type parameter in TypedMultiMap") key,
		                                       scala.collection.immutable.Set<[K](TypedMultiMap.html "type parameter in TypedMultiMap")> values)
		```
		- #### $plus$plus
		
		
		
		```
		public [TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")> $plus$plus​([TypedMultiMap](TypedMultiMap.html "class in akka.util")<[T](TypedMultiMap.html "type parameter in TypedMultiMap"),​[K](TypedMultiMap.html "type parameter in TypedMultiMap")> other)
		```
		
		Add all entries from the other map, overwriting existing entries.
		 
		 FIXME: should it merge, instead?
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Code Examples

### Example 1: Class TypedMultiMap<T,​K>

```text
trait Key { type Type = T }
 case class MyValue[T](...)

 // type function from Key to MyValue
 type KV[K <: Key] = MyValue[K#Type]

 val map = TypedMultiMap.empty[Key, KV]

 // a plain Int => String map would use this function:
 type plain[K <: Int] = String

 // a map T => T would use this function:
 type identity[T <: AnyRef] = T
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/util/TypedMultiMap.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/util/TypedMultiMap.html](https://doc.akka.io/japi/akka-core/2.10/akka/util/TypedMultiMap.html)*