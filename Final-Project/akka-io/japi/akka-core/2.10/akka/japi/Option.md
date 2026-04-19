---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option.html
title: Option
---

# Option

## Content

Package [akka.japi](package-summary.html)
## Class Option\<A\>

- java.lang.Object
- - akka.japi.Option\<A\>

- All Implemented Interfaces:
`java.lang.Iterable<A>`

Direct Known Subclasses:
`[Option.Some](Option.Some.html "class in akka.japi")`

---

```
public abstract class Option<A>
extends java.lang.Object
implements java.lang.Iterable<A>
```

This class represents optional values. Instances of `Option`
 are either instances of case class `Some` or it is case
 object `None`.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Option.Some](Option.Some.html "class in akka.japi")<[A](Option.Some.html "type parameter in Option.Some")>` | Class `Some[A]` represents existing values of type  `A`. |
	| `static class` | `[Option.Some$](Option.Some$.html "class in akka.japi")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Option](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract scala.Option<[A](Option.html "type parameter in Option")>` | `[asScala](#asScala())()` |  |
	| `static <T> [Option](Option.html "class in akka.japi")<T>` | `[fromScalaOption](#fromScalaOption(scala.Option))​(scala.Option<T> scalaOption)` | Converts a Scala Option to a Java Option |
	| `abstract [A](Option.html "type parameter in Option")` | `[get](#get())()` |  |
	| `abstract <B> B` | `[getOrElse](#getOrElse(B))​(B defaultValue)` | Returns `a` if this is `some(a)` or `defaultValue` if  this is `none`. |
	| `boolean` | `[isDefined](#isDefined())()` |  |
	| `abstract boolean` | `[isEmpty](#isEmpty())()` |  |
	| `java.util.Iterator<[A](Option.html "type parameter in Option")>` | `[iterator](#iterator())()` |  |
	| `static <A> scala.Option<A>` | `[java2ScalaOption](#java2ScalaOption(akka.japi.Option))​([Option](Option.html "class in akka.japi")<A> o)` |  |
	| `static <A> [Option](Option.html "class in akka.japi")<A>` | `[none](#none())()` | `Option` factory that creates `None` |
	| `static <A> [Option](Option.html "class in akka.japi")<A>` | `[option](#option(A))​(A v)` | `Option` factory that creates `None` if  `v` is `null`, `Some(v)` otherwise. |
	| `static <A> [Option](Option.html "class in akka.japi")<A>` | `[scala2JavaOption](#scala2JavaOption(scala.Option))​(scala.Option<A> o)` |  |
	| `static <A> [Option](Option.html "class in akka.japi")<A>` | `[some](#some(A))​(A v)` | `Option` factory that creates `Some` |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface java.lang.Iterable
		
		
		`forEach, spliterator`

- - ### Constructor Detail
	
	
	
		- #### Option
		
		
		
		```
		public Option()
		```

	- ### Method Detail
	
	
	
		- #### some
		
		
		
		```
		public static <A> [Option](Option.html "class in akka.japi")<A> some​(A v)
		```
		
		`Option` factory that creates `Some`
		- #### none
		
		
		
		```
		public static <A> [Option](Option.html "class in akka.japi")<A> none()
		```
		
		`Option` factory that creates `None`
		- #### option
		
		
		
		```
		public static <A> [Option](Option.html "class in akka.japi")<A> option​(A v)
		```
		
		`Option` factory that creates `None` if
		 `v` is `null`, `Some(v)` otherwise.
		- #### fromScalaOption
		
		
		
		```
		public static <T> [Option](Option.html "class in akka.japi")<T> fromScalaOption​(scala.Option<T> scalaOption)
		```
		
		Converts a Scala Option to a Java Option
		- #### java2ScalaOption
		
		
		
		```
		public static <A> scala.Option<A> java2ScalaOption​([Option](Option.html "class in akka.japi")<A> o)
		```
		- #### scala2JavaOption
		
		
		
		```
		public static <A> [Option](Option.html "class in akka.japi")<A> scala2JavaOption​(scala.Option<A> o)
		```
		- #### get
		
		
		
		```
		public abstract [A](Option.html "type parameter in Option") get()
		```
		- #### getOrElse
		
		
		
		```
		public abstract <B> B getOrElse​(B defaultValue)
		```
		
		Returns `a` if this is `some(a)` or `defaultValue` if
		 this is `none`.
		- #### isEmpty
		
		
		
		```
		public abstract boolean isEmpty()
		```
		- #### isDefined
		
		
		
		```
		public boolean isDefined()
		```
		- #### asScala
		
		
		
		```
		public abstract scala.Option<[A](Option.html "type parameter in Option")> asScala()
		```
		- #### iterator
		
		
		
		```
		public java.util.Iterator<[A](Option.html "type parameter in Option")> iterator()
		```
		
		
		Specified by:
		`iterator` in interface `java.lang.Iterable<[A](Option.html "type parameter in Option")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option.Some$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option.Some.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option.html)*