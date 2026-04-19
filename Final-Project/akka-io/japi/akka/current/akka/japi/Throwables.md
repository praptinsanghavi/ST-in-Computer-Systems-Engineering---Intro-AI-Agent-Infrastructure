---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:19:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/japi/Throwables.html
title: Throwables
---

# Throwables

## Content

Package [akka.japi](package-summary.html)
## Class Throwables

- java.lang.Object
- - akka.japi.Throwables

- ---

```
public class Throwables
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

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Throwables](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[isFatal](#isFatal(java.lang.Throwable))​(java.lang.Throwable throwable)` | Returns true if the provided `Throwable` is to be considered fatal,  or false if it is to be considered non\-fatal |
	| `static boolean` | `[isNonFatal](#isNonFatal(java.lang.Throwable))​(java.lang.Throwable throwable)` | Returns true if the provided `Throwable` is to be considered non\-fatal,  or false if it is to be considered fatal |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Throwables
		
		
		
		```
		public Throwables()
		```

	- ### Method Detail
	
	
	
		- #### isNonFatal
		
		
		
		```
		public static boolean isNonFatal​(java.lang.Throwable throwable)
		```
		
		Returns true if the provided `Throwable` is to be considered non\-fatal,
		 or false if it is to be considered fatal
		- #### isFatal
		
		
		
		```
		public static boolean isFatal​(java.lang.Throwable throwable)
		```
		
		Returns true if the provided `Throwable` is to be considered fatal,
		 or false if it is to be considered non\-fatal

## Code Examples

### Example 1: Class Throwables

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

- https://doc.akka.io/japi/akka/current/akka/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/japi/Throwables.html](https://doc.akka.io/japi/akka/current/akka/japi/Throwables.html)*