---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/Util.html
title: Util
---

# Util

## Content

Package [akka.japi](package-summary.html)
## Class Util

- java.lang.Object
- - akka.japi.Util

- ---

```
public class Util
extends java.lang.Object
```

This class hold common utilities for Java

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Util](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> scala.reflect.ClassTag<T>` | `[classTag](#classTag(java.lang.Class))​(java.lang.Class<T> clazz)` | Returns a ClassTag describing the provided Class. |
	| `static <T> scala.collection.immutable.IndexedSeq<T>` | `[immutableIndexedSeq](#immutableIndexedSeq(java.lang.Iterable))​(java.lang.Iterable<T> iterable)` | Turns an `Iterable` into an immutable Scala IndexedSeq (by copying it). |
	| `static scala.collection.immutable.Seq<java.lang.Class<?>>` | `[immutableSeq](#immutableSeq(java.lang.Class%5B%5D))​(java.lang.Class<?>[] arr)` | Returns an immutable.Seq representing the provided array of Classes,  an overloading of the generic immutableSeq in Util, to accommodate for erasure. |
	| `static <T> scala.collection.immutable.Seq<T>` | `[immutableSeq](#immutableSeq(java.lang.Iterable))​(java.lang.Iterable<T> iterable)` | Turns an `Iterable` into an immutable Scala sequence (by copying it). |
	| `static <T> scala.collection.immutable.Seq<T>` | `[immutableSeq](#immutableSeq(java.lang.Object))​(java.lang.Object arr)` | Turns an array into an immutable Scala sequence (by copying it). |
	| `static <T> scala.collection.immutable.Seq<T>` | `[immutableSingletonSeq](#immutableSingletonSeq(T))​(T value)` |  |
	| `static <T> java.util.List<T>` | `[javaArrayList](#javaArrayList(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<T> seq)` |  |
	| `static <T> scala.Option<T>` | `[option](#option(java.util.Optional))​(java.util.Optional<T> jOption)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Util
		
		
		
		```
		public Util()
		```

	- ### Method Detail
	
	
	
		- #### classTag
		
		
		
		```
		public static <T> scala.reflect.ClassTag<T> classTag​(java.lang.Class<T> clazz)
		```
		
		Returns a ClassTag describing the provided Class.
		- #### immutableSeq
		
		
		
		```
		public static scala.collection.immutable.Seq<java.lang.Class<?>> immutableSeq​(java.lang.Class<?>[] arr)
		```
		
		Returns an immutable.Seq representing the provided array of Classes,
		 an overloading of the generic immutableSeq in Util, to accommodate for erasure.
		- #### immutableSeq
		
		
		
		```
		public static <T> scala.collection.immutable.Seq<T> immutableSeq​(java.lang.Object arr)
		```
		
		Turns an array into an immutable Scala sequence (by copying it).
		- #### immutableSeq
		
		
		
		```
		public static <T> scala.collection.immutable.Seq<T> immutableSeq​(java.lang.Iterable<T> iterable)
		```
		
		Turns an `Iterable` into an immutable Scala sequence (by copying it).
		- #### immutableSingletonSeq
		
		
		
		```
		public static <T> scala.collection.immutable.Seq<T> immutableSingletonSeq​(T value)
		```
		- #### javaArrayList
		
		
		
		```
		public static <T> java.util.List<T> javaArrayList​(scala.collection.immutable.Seq<T> seq)
		```
		- #### immutableIndexedSeq
		
		
		
		```
		public static <T> scala.collection.immutable.IndexedSeq<T> immutableIndexedSeq​(java.lang.Iterable<T> iterable)
		```
		
		Turns an `Iterable` into an immutable Scala IndexedSeq (by copying it).
		- #### option
		
		
		
		```
		public static <T> scala.Option<T> option​(java.util.Optional<T> jOption)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/Util.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/Util.html)*