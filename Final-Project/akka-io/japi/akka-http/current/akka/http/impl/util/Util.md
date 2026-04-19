---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Util.html
title: Util
---

# Util

## Content

Package [akka.http.impl.util](package-summary.html)
## Class Util

- java.lang.Object
- - akka.http.impl.util.Util

- ---

```
public abstract class Util
extends java.lang.Object
```

Contains internal helper methods.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[emptyMap](#emptyMap)` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Util](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T,​U extends T>scala.collection.immutable.Seq<U>` | `[convertArray](#convertArray(T%5B%5D))​(T[] els)` |  |
	| `static <T,​U extends T>scala.collection.immutable.Seq<U>` | `[convertIterable](#convertIterable(java.lang.Iterable))​(java.lang.Iterable<T> els)` |  |
	| `static scala.collection.immutable.Map<java.lang.String,​java.lang.String>` | `[convertMapToScala](#convertMapToScala(java.util.Map))​(java.util.Map<java.lang.String,​java.lang.String> map)` |  |
	| `static <U,​T extends U>java.util.Optional<U>` | `[convertOption](#convertOption(scala.Option))​(scala.Option<T> o)` |  |
	| `static <T,​U extends T>scala.Option<U>` | `[convertOptionalToScala](#convertOptionalToScala(java.util.Optional))​(java.util.Optional<T> o)` |  |
	| `static <U,​T extends U>akka.stream.scaladsl.Source<U,​scala.Unit>` | `[convertPublisher](#convertPublisher(akka.stream.scaladsl.Source))​(akka.stream.scaladsl.Source<T,​scala.Unit> p)` |  |
	| `static <J,​V extends J>java.util.Optional<J>` | `[lookupInRegistry](#lookupInRegistry(akka.http.impl.util.ObjectRegistry,int))​([ObjectRegistry](ObjectRegistry.html "interface in akka.http.impl.util")<java.lang.Object,​V> registry,  int key)` |  |
	| `static <J,​V extends J>java.util.Optional<J>` | `[lookupInRegistry](#lookupInRegistry(akka.http.impl.util.ObjectRegistry,java.lang.String))​([ObjectRegistry](ObjectRegistry.html "interface in akka.http.impl.util")<java.lang.String,​V> registry,  java.lang.String key)` |  |
	| `static <K,​J,​V extends J>java.util.Optional<J>` | `[lookupInRegistry](#lookupInRegistry(akka.http.impl.util.ObjectRegistry,K))​([ObjectRegistry](ObjectRegistry.html "interface in akka.http.impl.util")<K,​V> registry,  K key)` |  |
	| `static <T> scala.Option<T>` | `[scalaNone](#scalaNone())()` |  |
	| `static <T,​U extends T>akka.stream.scaladsl.Source<U,​scala.Unit>` | `[upcastSource](#upcastSource(akka.stream.scaladsl.Source))​(akka.stream.scaladsl.Source<T,​scala.Unit> p)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### emptyMap
		
		
		
		```
		public static final scala.collection.immutable.Map<java.lang.String,​java.lang.String> emptyMap
		```

	- ### Constructor Detail
	
	
	
		- #### Util
		
		
		
		```
		public Util()
		```

	- ### Method Detail
	
	
	
		- #### convertOption
		
		
		
		```
		public static <U,​T extends U> java.util.Optional<U> convertOption​(scala.Option<T> o)
		```
		- #### convertPublisher
		
		
		
		```
		public static <U,​T extends U> akka.stream.scaladsl.Source<U,​scala.Unit> convertPublisher​(akka.stream.scaladsl.Source<T,​scala.Unit> p)
		```
		- #### upcastSource
		
		
		
		```
		public static <T,​U extends T> akka.stream.scaladsl.Source<U,​scala.Unit> upcastSource​(akka.stream.scaladsl.Source<T,​scala.Unit> p)
		```
		- #### convertMapToScala
		
		
		
		```
		public static scala.collection.immutable.Map<java.lang.String,​java.lang.String> convertMapToScala​(java.util.Map<java.lang.String,​java.lang.String> map)
		```
		- #### convertOptionalToScala
		
		
		
		```
		public static <T,​U extends T> scala.Option<U> convertOptionalToScala​(java.util.Optional<T> o)
		```
		- #### scalaNone
		
		
		
		```
		public static <T> scala.Option<T> scalaNone()
		```
		- #### convertIterable
		
		
		
		```
		public static <T,​U extends T> scala.collection.immutable.Seq<U> convertIterable​(java.lang.Iterable<T> els)
		```
		- #### convertArray
		
		
		
		```
		public static <T,​U extends T> scala.collection.immutable.Seq<U> convertArray​(T[] els)
		```
		- #### lookupInRegistry
		
		
		
		```
		public static <J,​V extends J> java.util.Optional<J> lookupInRegistry​([ObjectRegistry](ObjectRegistry.html "interface in akka.http.impl.util")<java.lang.Object,​V> registry,
		                                                                           int key)
		```
		- #### lookupInRegistry
		
		
		
		```
		public static <J,​V extends J> java.util.Optional<J> lookupInRegistry​([ObjectRegistry](ObjectRegistry.html "interface in akka.http.impl.util")<java.lang.String,​V> registry,
		                                                                           java.lang.String key)
		```
		- #### lookupInRegistry
		
		
		
		```
		public static <K,​J,​V extends J> java.util.Optional<J> lookupInRegistry​([ObjectRegistry](ObjectRegistry.html "interface in akka.http.impl.util")<K,​V> registry,
		                                                                                   K key)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ObjectRegistry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Util.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Util.html)*