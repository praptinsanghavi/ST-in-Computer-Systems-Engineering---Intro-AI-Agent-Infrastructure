---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DynamicAccess.html
title: DynamicAccess
---

# DynamicAccess

## Content

Package [akka.actor](package-summary.html)
## Class DynamicAccess

- java.lang.Object
- - akka.actor.DynamicAccess

- Direct Known Subclasses:
`[ReflectiveDynamicAccess](ReflectiveDynamicAccess.html "class in akka.actor")`

---

```
public abstract class DynamicAccess
extends java.lang.Object
```

The DynamicAccess implementation is the class which is used for
 loading all configurable parts of an actor system (the
 [`ReflectiveDynamicAccess`](ReflectiveDynamicAccess.html "class in akka.actor") is the default implementation).
 
 This is an internal facility and users are not expected to encounter it
 unless they are extending Akka in ways which go beyond simple Extensions.
 

 Not for user extension

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DynamicAccess](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract boolean` | `[classIsOnClasspath](#classIsOnClasspath(java.lang.String))​(java.lang.String fqcn)` |  |
	| `abstract java.lang.ClassLoader` | `[classLoader](#classLoader())()` | This is the class loader to be used in those special cases where the  other factory method are not applicable (e.g. |
	| `abstract <T> scala.util.Try<T>` | `[createInstanceFor](#createInstanceFor(java.lang.Class,scala.collection.immutable.Seq,scala.reflect.ClassTag))​(java.lang.Class<?> clazz,  scala.collection.immutable.Seq<scala.Tuple2<java.lang.Class<?>,​java.lang.Object>> args,  scala.reflect.ClassTag<T> evidence$1)` | Convenience method which given a `Class[_]` object and a constructor description  will create a new instance of that class. |
	| `abstract <T> scala.util.Try<T>` | `[createInstanceFor](#createInstanceFor(java.lang.String,scala.collection.immutable.Seq,scala.reflect.ClassTag))​(java.lang.String fqcn,  scala.collection.immutable.Seq<scala.Tuple2<java.lang.Class<?>,​java.lang.Object>> args,  scala.reflect.ClassTag<T> evidence$3)` | Obtain an object conforming to the type T, which is expected to be  instantiated from a class designated by the fully\-qualified class name  given, where the constructor is selected and invoked according to the  `args` argument. |
	| `abstract <T> scala.util.Try<java.lang.Class<? extends T>>` | `[getClassFor](#getClassFor(java.lang.String,scala.reflect.ClassTag))​(java.lang.String fqcn,  scala.reflect.ClassTag<T> evidence$2)` | Obtain a `Class[_]` object loaded with the right class loader (i.e. |
	| `abstract <T> scala.util.Try<T>` | `[getObjectFor](#getObjectFor(java.lang.String,scala.reflect.ClassTag))​(java.lang.String fqcn,  scala.reflect.ClassTag<T> evidence$4)` | Obtain the Scala \&ldquo;object\&rdquo; instance for the given fully\-qualified class name, if there is one. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DynamicAccess
		
		
		
		```
		public DynamicAccess()
		```

	- ### Method Detail
	
	
	
		- #### classIsOnClasspath
		
		
		
		```
		public abstract boolean classIsOnClasspath​(java.lang.String fqcn)
		```
		- #### classLoader
		
		
		
		```
		public abstract java.lang.ClassLoader classLoader()
		```
		
		This is the class loader to be used in those special cases where the
		 other factory method are not applicable (e.g. when constructing a ClassLoaderBinaryInputStream).
		- #### createInstanceFor
		
		
		
		```
		public abstract <T> scala.util.Try<T> createInstanceFor​(java.lang.Class<?> clazz,
		                                                        scala.collection.immutable.Seq<scala.Tuple2<java.lang.Class<?>,​java.lang.Object>> args,
		                                                        scala.reflect.ClassTag<T> evidence$1)
		```
		
		Convenience method which given a `Class[_]` object and a constructor description
		 will create a new instance of that class.
		 
		
		
		
		```
		
		 val obj = DynamicAccess.createInstanceFor(clazz, Seq(classOf[Config] -> config, classOf[String] -> name))
		 
		```
		- #### createInstanceFor
		
		
		
		```
		public abstract <T> scala.util.Try<T> createInstanceFor​(java.lang.String fqcn,
		                                                        scala.collection.immutable.Seq<scala.Tuple2<java.lang.Class<?>,​java.lang.Object>> args,
		                                                        scala.reflect.ClassTag<T> evidence$3)
		```
		
		Obtain an object conforming to the type T, which is expected to be
		 instantiated from a class designated by the fully\-qualified class name
		 given, where the constructor is selected and invoked according to the
		 `args` argument. The exact usage of args depends on which type is requested,
		 see the relevant requesting code for details.
		- #### getClassFor
		
		
		
		```
		public abstract <T> scala.util.Try<java.lang.Class<? extends T>> getClassFor​(java.lang.String fqcn,
		                                                                             scala.reflect.ClassTag<T> evidence$2)
		```
		
		Obtain a `Class[_]` object loaded with the right class loader (i.e. the one
		 returned by `classLoader`).
		- #### getObjectFor
		
		
		
		```
		public abstract <T> scala.util.Try<T> getObjectFor​(java.lang.String fqcn,
		                                                   scala.reflect.ClassTag<T> evidence$4)
		```
		
		Obtain the Scala \&ldquo;object\&rdquo; instance for the given fully\-qualified class name, if there is one.

## Code Examples

### Example 1: createInstanceFor

```text
val obj = DynamicAccess.createInstanceFor(clazz, Seq(classOf[Config] -> config, classOf[String] -> name))
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ReflectiveDynamicAccess.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DynamicAccess.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DynamicAccess.html)*