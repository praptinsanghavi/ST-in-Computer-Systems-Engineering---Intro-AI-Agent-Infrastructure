---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option$.html
title: Option$
---

# Option$

## Content

Package [akka.japi](package-summary.html)
## Class Option$

- java.lang.Object
- - akka.japi.Option$

- ---

```
public class Option$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Option$](Option$.html "class in akka.japi")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Option$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Option](Option.html "class in akka.japi")<T>` | `[fromScalaOption](#fromScalaOption(scala.Option))​(scala.Option<T> scalaOption)` | Converts a Scala Option to a Java Option |
	| `<A> scala.Option<A>` | `[java2ScalaOption](#java2ScalaOption(akka.japi.Option))​([Option](Option.html "class in akka.japi")<A> o)` |  |
	| `<A> [Option](Option.html "class in akka.japi")<A>` | `[none](#none())()` | `Option` factory that creates `None` |
	| `<A> [Option](Option.html "class in akka.japi")<A>` | `[option](#option(A))​(A v)` | `Option` factory that creates `None` if  `v` is `null`, `Some(v)` otherwise. |
	| `<A> [Option](Option.html "class in akka.japi")<A>` | `[scala2JavaOption](#scala2JavaOption(scala.Option))​(scala.Option<A> o)` |  |
	| `<A> [Option](Option.html "class in akka.japi")<A>` | `[some](#some(A))​(A v)` | `Option` factory that creates `Some` |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Option$](Option$.html "class in akka.japi") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Option$
		
		
		
		```
		public Option$()
		```

	- ### Method Detail
	
	
	
		- #### some
		
		
		
		```
		public <A> [Option](Option.html "class in akka.japi")<A> some​(A v)
		```
		
		`Option` factory that creates `Some`
		- #### none
		
		
		
		```
		public <A> [Option](Option.html "class in akka.japi")<A> none()
		```
		
		`Option` factory that creates `None`
		- #### option
		
		
		
		```
		public <A> [Option](Option.html "class in akka.japi")<A> option​(A v)
		```
		
		`Option` factory that creates `None` if
		 `v` is `null`, `Some(v)` otherwise.
		- #### fromScalaOption
		
		
		
		```
		public <T> [Option](Option.html "class in akka.japi")<T> fromScalaOption​(scala.Option<T> scalaOption)
		```
		
		Converts a Scala Option to a Java Option
		- #### java2ScalaOption
		
		
		
		```
		public <A> scala.Option<A> java2ScalaOption​([Option](Option.html "class in akka.japi")<A> o)
		```
		- #### scala2JavaOption
		
		
		
		```
		public <A> [Option](Option.html "class in akka.japi")<A> scala2JavaOption​(scala.Option<A> o)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option$.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/Option$.html)*