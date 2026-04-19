---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/Util$.html
title: Util$
---

# Util$

## Content

Package [akka.japi](package-summary.html)
## Class Util$

- java.lang.Object
- - akka.japi.Util$

- ---

```
public class Util$
extends java.lang.Object
```

This class hold common utilities for Java

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Util$](Util$.html "class in akka.japi")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Util$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> scala.reflect.ClassTag<T>` | `[classTag](#classTag(java.lang.Class))​(java.lang.Class<T> clazz)` | Returns a ClassTag describing the provided Class. |
	| `<T> scala.collection.immutable.IndexedSeq<T>` | `[immutableIndexedSeq](#immutableIndexedSeq(java.lang.Iterable))​(java.lang.Iterable<T> iterable)` | Turns an `Iterable` into an immutable Scala IndexedSeq (by copying it). |
	| `scala.collection.immutable.Seq<java.lang.Class<?>>` | `[immutableSeq](#immutableSeq(java.lang.Class%5B%5D))​(java.lang.Class<?>[] arr)` | Returns an immutable.Seq representing the provided array of Classes,  an overloading of the generic immutableSeq in Util, to accommodate for erasure. |
	| `<T> scala.collection.immutable.Seq<T>` | `[immutableSeq](#immutableSeq(java.lang.Iterable))​(java.lang.Iterable<T> iterable)` | Turns an `Iterable` into an immutable Scala sequence (by copying it). |
	| `<T> scala.collection.immutable.Seq<T>` | `[immutableSeq](#immutableSeq(java.lang.Object))​(java.lang.Object arr)` | Turns an array into an immutable Scala sequence (by copying it). |
	| `<T> scala.collection.immutable.Seq<T>` | `[immutableSingletonSeq](#immutableSingletonSeq(T))​(T value)` |  |
	| `<T> java.util.List<T>` | `[javaArrayList](#javaArrayList(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<T> seq)` |  |
	| `<T> scala.Option<T>` | `[option](#option(java.util.Optional))​(java.util.Optional<T> jOption)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Util$](Util$.html "class in akka.japi") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Util$
		
		
		
		```
		public Util$()
		```

	- ### Method Detail
	
	
	
		- #### classTag
		
		
		
		```
		public <T> scala.reflect.ClassTag<T> classTag​(java.lang.Class<T> clazz)
		```
		
		Returns a ClassTag describing the provided Class.
		- #### immutableSeq
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.Class<?>> immutableSeq​(java.lang.Class<?>[] arr)
		```
		
		Returns an immutable.Seq representing the provided array of Classes,
		 an overloading of the generic immutableSeq in Util, to accommodate for erasure.
		- #### immutableSeq
		
		
		
		```
		public <T> scala.collection.immutable.Seq<T> immutableSeq​(java.lang.Object arr)
		```
		
		Turns an array into an immutable Scala sequence (by copying it).
		- #### immutableSeq
		
		
		
		```
		public <T> scala.collection.immutable.Seq<T> immutableSeq​(java.lang.Iterable<T> iterable)
		```
		
		Turns an `Iterable` into an immutable Scala sequence (by copying it).
		- #### immutableSingletonSeq
		
		
		
		```
		public <T> scala.collection.immutable.Seq<T> immutableSingletonSeq​(T value)
		```
		- #### javaArrayList
		
		
		
		```
		public <T> java.util.List<T> javaArrayList​(scala.collection.immutable.Seq<T> seq)
		```
		- #### immutableIndexedSeq
		
		
		
		```
		public <T> scala.collection.immutable.IndexedSeq<T> immutableIndexedSeq​(java.lang.Iterable<T> iterable)
		```
		
		Turns an `Iterable` into an immutable Scala IndexedSeq (by copying it).
		- #### option
		
		
		
		```
		public <T> scala.Option<T> option​(java.util.Optional<T> jOption)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/Util$.html
- https://doc.akka.io/japi/akka/current/akka/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/Util$.html](https://doc.akka.io/japi/akka/current/akka/japi/Util$.html)*