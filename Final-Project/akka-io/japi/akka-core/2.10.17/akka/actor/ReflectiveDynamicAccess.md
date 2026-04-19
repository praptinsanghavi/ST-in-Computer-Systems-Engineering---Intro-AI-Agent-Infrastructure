---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ReflectiveDynamicAccess.html
title: ReflectiveDynamicAccess
---

# ReflectiveDynamicAccess

## Content

Package [akka.actor](package-summary.html)
## Class ReflectiveDynamicAccess

- java.lang.Object
- - [akka.actor.DynamicAccess](DynamicAccess.html "class in akka.actor")
	- - akka.actor.ReflectiveDynamicAccess

- ---

```
public class ReflectiveDynamicAccess
extends [DynamicAccess](DynamicAccess.html "class in akka.actor")
```

This is the default [`DynamicAccess`](DynamicAccess.html "class in akka.actor") implementation used by [`ExtendedActorSystem`](ExtendedActorSystem.html "class in akka.actor")
 unless overridden. It uses reflection to turn fully\-qualified class names into `Class[_]` objects
 and creates instances from there using `getDeclaredConstructor()` and invoking that. The class loader
 to be used for all this is determined by the actor system\&rsquo;s class loader by default.
 
 Not for user extension or construction

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReflectiveDynamicAccess](#%3Cinit%3E(java.lang.ClassLoader))​(java.lang.ClassLoader classLoader)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[classIsOnClasspath](#classIsOnClasspath(java.lang.String))​(java.lang.String fqcn)` |  |
	| `java.lang.ClassLoader` | `[classLoader](#classLoader())()` | This is the class loader to be used in those special cases where the  other factory method are not applicable (e.g. |
	| `<T> scala.util.Try<T>` | `[createInstanceFor](#createInstanceFor(java.lang.Class,scala.collection.immutable.Seq,scala.reflect.ClassTag))​(java.lang.Class<?> clazz,  scala.collection.immutable.Seq<scala.Tuple2<java.lang.Class<?>,​java.lang.Object>> args,  scala.reflect.ClassTag<T> evidence$2)` | Convenience method which given a `Class[_]` object and a constructor description  will create a new instance of that class. |
	| `<T> scala.util.Try<T>` | `[createInstanceFor](#createInstanceFor(java.lang.String,scala.collection.immutable.Seq,scala.reflect.ClassTag))​(java.lang.String fqcn,  scala.collection.immutable.Seq<scala.Tuple2<java.lang.Class<?>,​java.lang.Object>> args,  scala.reflect.ClassTag<T> evidence$3)` | Obtain an object conforming to the type T, which is expected to be  instantiated from a class designated by the fully\-qualified class name  given, where the constructor is selected and invoked according to the  `args` argument. |
	| `<T> scala.util.Try<java.lang.Class<? extends T>>` | `[getClassFor](#getClassFor(java.lang.String,scala.reflect.ClassTag))​(java.lang.String fqcn,  scala.reflect.ClassTag<T> evidence$1)` | Obtain a `Class[_]` object loaded with the right class loader (i.e. |
	| `<T> scala.util.Try<T>` | `[getObjectFor](#getObjectFor(java.lang.String,scala.reflect.ClassTag))​(java.lang.String fqcn,  scala.reflect.ClassTag<T> evidence$4)` | Obtain the Scala \&ldquo;object\&rdquo; instance for the given fully\-qualified class name, if there is one. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReflectiveDynamicAccess
		
		
		
		```
		public ReflectiveDynamicAccess​(java.lang.ClassLoader classLoader)
		```

	- ### Method Detail
	
	
	
		- #### classIsOnClasspath
		
		
		
		```
		public boolean classIsOnClasspath​(java.lang.String fqcn)
		```
		
		
		Specified by:
		`[classIsOnClasspath](DynamicAccess.html#classIsOnClasspath(java.lang.String))` in class `[DynamicAccess](DynamicAccess.html "class in akka.actor")`
		- #### classLoader
		
		
		
		```
		public java.lang.ClassLoader classLoader()
		```
		
		Description copied from class: `[DynamicAccess](DynamicAccess.html#classLoader())`
		This is the class loader to be used in those special cases where the
		 other factory method are not applicable (e.g. when constructing a ClassLoaderBinaryInputStream).
		
		Specified by:
		`[classLoader](DynamicAccess.html#classLoader())` in class `[DynamicAccess](DynamicAccess.html "class in akka.actor")`
		- #### createInstanceFor
		
		
		
		```
		public <T> scala.util.Try<T> createInstanceFor​(java.lang.Class<?> clazz,
		                                               scala.collection.immutable.Seq<scala.Tuple2<java.lang.Class<?>,​java.lang.Object>> args,
		                                               scala.reflect.ClassTag<T> evidence$2)
		```
		
		Description copied from class: `[DynamicAccess](DynamicAccess.html#createInstanceFor(java.lang.Class,scala.collection.immutable.Seq,scala.reflect.ClassTag))`
		Convenience method which given a `Class[_]` object and a constructor description
		 will create a new instance of that class.
		 
		
		
		
		```
		
		 val obj = DynamicAccess.createInstanceFor(clazz, Seq(classOf[Config] -> config, classOf[String] -> name))
		 
		```
		
		
		Specified by:
		`[createInstanceFor](DynamicAccess.html#createInstanceFor(java.lang.Class,scala.collection.immutable.Seq,scala.reflect.ClassTag))` in class `[DynamicAccess](DynamicAccess.html "class in akka.actor")`
		- #### createInstanceFor
		
		
		
		```
		public <T> scala.util.Try<T> createInstanceFor​(java.lang.String fqcn,
		                                               scala.collection.immutable.Seq<scala.Tuple2<java.lang.Class<?>,​java.lang.Object>> args,
		                                               scala.reflect.ClassTag<T> evidence$3)
		```
		
		Description copied from class: `[DynamicAccess](DynamicAccess.html#createInstanceFor(java.lang.String,scala.collection.immutable.Seq,scala.reflect.ClassTag))`
		Obtain an object conforming to the type T, which is expected to be
		 instantiated from a class designated by the fully\-qualified class name
		 given, where the constructor is selected and invoked according to the
		 `args` argument. The exact usage of args depends on which type is requested,
		 see the relevant requesting code for details.
		
		Specified by:
		`[createInstanceFor](DynamicAccess.html#createInstanceFor(java.lang.String,scala.collection.immutable.Seq,scala.reflect.ClassTag))` in class `[DynamicAccess](DynamicAccess.html "class in akka.actor")`
		- #### getClassFor
		
		
		
		```
		public <T> scala.util.Try<java.lang.Class<? extends T>> getClassFor​(java.lang.String fqcn,
		                                                                    scala.reflect.ClassTag<T> evidence$1)
		```
		
		Description copied from class: `[DynamicAccess](DynamicAccess.html#getClassFor(java.lang.String,scala.reflect.ClassTag))`
		Obtain a `Class[_]` object loaded with the right class loader (i.e. the one
		 returned by `classLoader`).
		
		Specified by:
		`[getClassFor](DynamicAccess.html#getClassFor(java.lang.String,scala.reflect.ClassTag))` in class `[DynamicAccess](DynamicAccess.html "class in akka.actor")`
		- #### getObjectFor
		
		
		
		```
		public <T> scala.util.Try<T> getObjectFor​(java.lang.String fqcn,
		                                          scala.reflect.ClassTag<T> evidence$4)
		```
		
		Description copied from class: `[DynamicAccess](DynamicAccess.html#getObjectFor(java.lang.String,scala.reflect.ClassTag))`
		Obtain the Scala \&ldquo;object\&rdquo; instance for the given fully\-qualified class name, if there is one.
		
		Specified by:
		`[getObjectFor](DynamicAccess.html#getObjectFor(java.lang.String,scala.reflect.ClassTag))` in class `[DynamicAccess](DynamicAccess.html "class in akka.actor")`

## Code Examples

### Example 1: createInstanceFor

```text
val obj = DynamicAccess.createInstanceFor(clazz, Seq(classOf[Config] -> config, classOf[String] -> name))
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DynamicAccess.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ReflectiveDynamicAccess.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ReflectiveDynamicAccess.html)*