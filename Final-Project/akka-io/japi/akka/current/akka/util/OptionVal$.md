---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/OptionVal$.html
title: OptionVal$
---

# OptionVal$

## Content

Package [akka.util](package-summary.html)
## Class OptionVal$

- java.lang.Object
- - akka.util.OptionVal$

- ---

```
public class OptionVal$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [OptionVal$](OptionVal$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OptionVal$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> akka.util.OptionVal<A>` | `[apply](#apply(A))​(A x)` |  |
	| `<B,​A>boolean` | `[contains$extension](#contains$extension(akka.util.OptionVal,B))​(akka.util.OptionVal<A> $this,  B it)` |  |
	| `<A> boolean` | `[equals$extension](#equals$extension(akka.util.OptionVal,java.lang.Object))​(akka.util.OptionVal<A> $this,  java.lang.Object x$1)` |  |
	| `<A> A` | `[get$extension](#get$extension(akka.util.OptionVal))​(akka.util.OptionVal<A> $this)` | Returns the option's value. |
	| `<B,​A>B` | `[getOrElse$extension](#getOrElse$extension(akka.util.OptionVal,B))​(akka.util.OptionVal<A> $this,  B default_)` | Returns the option's value if the option is nonempty, otherwise  return `default`. |
	| `<A> int` | `[hashCode$extension](#hashCode$extension(akka.util.OptionVal))​(akka.util.OptionVal<A> $this)` |  |
	| `<A> boolean` | `[isDefined$extension](#isDefined$extension(akka.util.OptionVal))​(akka.util.OptionVal<A> $this)` | Returns false if the option is `OptionVal.None`, true otherwise. |
	| `<A> boolean` | `[isEmpty$extension](#isEmpty$extension(akka.util.OptionVal))​(akka.util.OptionVal<A> $this)` | Returns true if the option is `OptionVal.None`, false otherwise. |
	| `<A> akka.util.OptionVal<A>` | `[none](#none())()` |  |
	| `akka.util.OptionVal<scala.runtime.Null$>` | `[None](#None())()` | Represents non\-existent values, `null` values. |
	| `<A1,​A>A1` | `[orNull$extension](#orNull$extension(akka.util.OptionVal,scala.$less$colon$less))​(akka.util.OptionVal<A> $this,  scala.$less$colon$less<scala.runtime.Null$,​A1> ev)` | Returns the option's value if it is nonempty, or `null` if it is empty. |
	| `<A> scala.Option<A>` | `[toOption$extension](#toOption$extension(akka.util.OptionVal))​(akka.util.OptionVal<A> $this)` | Convert to `scala.Option` |
	| `<A> java.lang.String` | `[toString$extension](#toString$extension(akka.util.OptionVal))​(akka.util.OptionVal<A> $this)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [OptionVal$](OptionVal$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### OptionVal$
		
		
		
		```
		public OptionVal$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <A> akka.util.OptionVal<A> apply​(A x)
		```
		- #### none
		
		
		
		```
		public <A> akka.util.OptionVal<A> none()
		```
		- #### None
		
		
		
		```
		public akka.util.OptionVal<scala.runtime.Null$> None()
		```
		
		Represents non\-existent values, `null` values.
		- #### isEmpty$extension
		
		
		
		```
		public final <A> boolean isEmpty$extension​(akka.util.OptionVal<A> $this)
		```
		
		Returns true if the option is `OptionVal.None`, false otherwise.
		- #### isDefined$extension
		
		
		
		```
		public final <A> boolean isDefined$extension​(akka.util.OptionVal<A> $this)
		```
		
		Returns false if the option is `OptionVal.None`, true otherwise.
		- #### getOrElse$extension
		
		
		
		```
		public final <B,​A> B getOrElse$extension​(akka.util.OptionVal<A> $this,
		                                               B default_)
		```
		
		Returns the option's value if the option is nonempty, otherwise
		 return `default`.
		- #### toOption$extension
		
		
		
		```
		public final <A> scala.Option<A> toOption$extension​(akka.util.OptionVal<A> $this)
		```
		
		Convert to `scala.Option`
		- #### contains$extension
		
		
		
		```
		public final <B,​A> boolean contains$extension​(akka.util.OptionVal<A> $this,
		                                                    B it)
		```
		- #### orNull$extension
		
		
		
		```
		public final <A1,​A> A1 orNull$extension​(akka.util.OptionVal<A> $this,
		                                              scala.$less$colon$less<scala.runtime.Null$,​A1> ev)
		```
		
		Returns the option's value if it is nonempty, or `null` if it is empty.
		- #### get$extension
		
		
		
		```
		public final <A> A get$extension​(akka.util.OptionVal<A> $this)
		```
		
		Returns the option's value.
		
		Throws:
		`java.util.NoSuchElementException` \- if the option is empty.
		- #### toString$extension
		
		
		
		```
		public final <A> java.lang.String toString$extension​(akka.util.OptionVal<A> $this)
		```
		- #### hashCode$extension
		
		
		
		```
		public final <A> int hashCode$extension​(akka.util.OptionVal<A> $this)
		```
		- #### equals$extension
		
		
		
		```
		public final <A> boolean equals$extension​(akka.util.OptionVal<A> $this,
		                                          java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/OptionVal$.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/OptionVal$.html](https://doc.akka.io/japi/akka/current/akka/util/OptionVal$.html)*