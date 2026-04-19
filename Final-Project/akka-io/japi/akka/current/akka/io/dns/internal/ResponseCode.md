---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/io/dns/internal/ResponseCode.html
title: ResponseCode
---

# ResponseCode

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class ResponseCode

- java.lang.Object
- - akka.io.dns.internal.ResponseCode

- ---

```
public class ResponseCode
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResponseCode](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.Enumeration.Value` | `[apply](#apply(int))​(int x)` |  |
	| `static scala.Enumeration.Value` | `[FORMAT_ERROR](#FORMAT_ERROR())()` |  |
	| `static int` | `[maxId](#maxId())()` |  |
	| `static scala.Enumeration.Value` | `[NAME_ERROR](#NAME_ERROR())()` |  |
	| `protected static int` | `[nextId](#nextId())()` |  |
	| `protected static void` | `[nextId_$eq](#nextId_$eq(int))​(int x$1)` |  |
	| `protected static scala.collection.Iterator<java.lang.String>` | `[nextName](#nextName())()` |  |
	| `protected static void` | `[nextName_$eq](#nextName_$eq(scala.collection.Iterator))​(scala.collection.Iterator<java.lang.String> x$1)` |  |
	| `static scala.Enumeration.Value` | `[NOT_IMPLEMENTED](#NOT_IMPLEMENTED())()` |  |
	| `protected static java.lang.Object` | `[readResolve](#readResolve())()` |  |
	| `static scala.Enumeration.Value` | `[REFUSED](#REFUSED())()` |  |
	| `static scala.Enumeration.Value` | `[SERVER_FAILURE](#SERVER_FAILURE())()` |  |
	| `static scala.Enumeration.Value` | `[SUCCESS](#SUCCESS())()` |  |
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
	
	
	
		- #### ResponseCode
		
		
		
		```
		public ResponseCode()
		```

	- ### Method Detail
	
	
	
		- #### SUCCESS
		
		
		
		```
		public static scala.Enumeration.Value SUCCESS()
		```
		- #### FORMAT\_ERROR
		
		
		
		```
		public static scala.Enumeration.Value FORMAT_ERROR()
		```
		- #### SERVER\_FAILURE
		
		
		
		```
		public static scala.Enumeration.Value SERVER_FAILURE()
		```
		- #### NAME\_ERROR
		
		
		
		```
		public static scala.Enumeration.Value NAME_ERROR()
		```
		- #### NOT\_IMPLEMENTED
		
		
		
		```
		public static scala.Enumeration.Value NOT_IMPLEMENTED()
		```
		- #### REFUSED
		
		
		
		```
		public static scala.Enumeration.Value REFUSED()
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
*Source: [https://doc.akka.io/japi/akka/current/akka/io/dns/internal/ResponseCode.html](https://doc.akka.io/japi/akka/current/akka/io/dns/internal/ResponseCode.html)*