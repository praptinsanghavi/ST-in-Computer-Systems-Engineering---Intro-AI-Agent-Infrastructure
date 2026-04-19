---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/Throwables$.html
title: Throwables$
---

# Throwables$

## Content

Package [akka.japi](package-summary.html)
## Class Throwables$

- java.lang.Object
- - akka.japi.Throwables$

- ---

```
public class Throwables$
extends java.lang.Object
```

Helper class for determining whether a `Throwable` is fatal or not.
 User should only catch the non\-fatal one,and keep rethrow the fatal one.
 
 Fatal errors are errors like `VirtualMachineError`
 (for example, `OutOfMemoryError` and `StackOverflowError`, subclasses of `VirtualMachineError`), `ThreadDeath`,
 `LinkageError`, `InterruptedException`, `ControlThrowable`.
 

 Note. this helper keep the same semantic with `NonFatal` in Scala.
 For example, all harmless `Throwable`s can be caught by:
 

```

   try {
     // dangerous stuff
   } catch(Throwable e) {
     if (Throwables.isNonFatal(e)){
       log.error(e, "Something not that bad.");
     } else {
       throw e;
     }
 
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Throwables$](Throwables$.html "class in akka.japi")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Throwables$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isFatal](#isFatal(java.lang.Throwable))​(java.lang.Throwable throwable)` | Returns true if the provided `Throwable` is to be considered fatal,  or false if it is to be considered non\-fatal |
	| `boolean` | `[isNonFatal](#isNonFatal(java.lang.Throwable))​(java.lang.Throwable throwable)` | Returns true if the provided `Throwable` is to be considered non\-fatal,  or false if it is to be considered fatal |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Throwables$](Throwables$.html "class in akka.japi") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Throwables$
		
		
		
		```
		public Throwables$()
		```

	- ### Method Detail
	
	
	
		- #### isNonFatal
		
		
		
		```
		public boolean isNonFatal​(java.lang.Throwable throwable)
		```
		
		Returns true if the provided `Throwable` is to be considered non\-fatal,
		 or false if it is to be considered fatal
		- #### isFatal
		
		
		
		```
		public boolean isFatal​(java.lang.Throwable throwable)
		```
		
		Returns true if the provided `Throwable` is to be considered fatal,
		 or false if it is to be considered non\-fatal

## Code Examples

### Example 1: Class Throwables$

```text
try {
     // dangerous stuff
   } catch(Throwable e) {
     if (Throwables.isNonFatal(e)){
       log.error(e, "Something not that bad.");
     } else {
       throw e;
     }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/Throwables$.html
- https://doc.akka.io/japi/akka/current/akka/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/Throwables$.html](https://doc.akka.io/japi/akka/current/akka/japi/Throwables$.html)*