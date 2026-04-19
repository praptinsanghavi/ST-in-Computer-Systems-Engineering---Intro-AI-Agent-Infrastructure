---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/internal/OpCode.html
title: OpCode
---

# OpCode

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class OpCode

- java.lang.Object
- - akka.io.dns.internal.OpCode

- ---

```
public class OpCode
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[OpCode](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.Enumeration.Value` | `[apply](#apply(int))​(int x)` |  |
	| `static scala.Enumeration.Value` | `[IQUERY](#IQUERY())()` |  |
	| `static int` | `[maxId](#maxId())()` |  |
	| `protected static int` | `[nextId](#nextId())()` |  |
	| `protected static void` | `[nextId_$eq](#nextId_$eq(int))​(int x$1)` |  |
	| `protected static scala.collection.Iterator<java.lang.String>` | `[nextName](#nextName())()` |  |
	| `protected static void` | `[nextName_$eq](#nextName_$eq(scala.collection.Iterator))​(scala.collection.Iterator<java.lang.String> x$1)` |  |
	| `static scala.Enumeration.Value` | `[QUERY](#QUERY())()` |  |
	| `protected static java.lang.Object` | `[readResolve](#readResolve())()` |  |
	| `static scala.Enumeration.Value` | `[STATUS](#STATUS())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `protected static scala.Enumeration.Value` | `[Value](#Value())()` |  |
	| `protected static scala.Enumeration.Value` | `[Value](#Value(int))​(int i)` |  |
	| `protected static scala.Enumeration.Value` | `[Value](#Value(int,java.lang.String))​(int i,  java.lang.String name)` |  |
	| `protected static scala.Enumeration.Value` | `[Value](#Value(java.lang.String))​(java.lang.String name)` |  |
	| `static scala.Enumeration.ValueSet` | `[values](#values())()` |  |
	| `static scala.Enumeration.Value` | `[withName](#withName(java.lang.String))​(java.lang.String s)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### OpCode
		
		
		
		```
		public OpCode()
		```

	- ### Method Detail
	
	
	
		- #### QUERY
		
		
		
		```
		public static scala.Enumeration.Value QUERY()
		```
		- #### IQUERY
		
		
		
		```
		public static scala.Enumeration.Value IQUERY()
		```
		- #### STATUS
		
		
		
		```
		public static scala.Enumeration.Value STATUS()
		```
		- #### readResolve
		
		
		
		```
		protected static java.lang.Object readResolve()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### values
		
		
		
		```
		public static scala.Enumeration.ValueSet values()
		```
		- #### nextId
		
		
		
		```
		protected static int nextId()
		```
		- #### nextId\_$eq
		
		
		
		```
		protected static void nextId_$eq​(int x$1)
		```
		- #### nextName
		
		
		
		```
		protected static scala.collection.Iterator<java.lang.String> nextName()
		```
		- #### nextName\_$eq
		
		
		
		```
		protected static void nextName_$eq​(scala.collection.Iterator<java.lang.String> x$1)
		```
		- #### maxId
		
		
		
		```
		public static final int maxId()
		```
		- #### apply
		
		
		
		```
		public static final scala.Enumeration.Value apply​(int x)
		```
		- #### withName
		
		
		
		```
		public static final scala.Enumeration.Value withName​(java.lang.String s)
		```
		- #### Value
		
		
		
		```
		protected static final scala.Enumeration.Value Value()
		```
		- #### Value
		
		
		
		```
		protected static final scala.Enumeration.Value Value​(int i)
		```
		- #### Value
		
		
		
		```
		protected static final scala.Enumeration.Value Value​(java.lang.String name)
		```
		- #### Value
		
		
		
		```
		protected static final scala.Enumeration.Value Value​(int i,
		                                                     java.lang.String name)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/io/dns/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/internal/OpCode.html](https://doc.akka.io/japi/akka/current/akka/io/dns/internal/OpCode.html)*