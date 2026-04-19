---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/Helpers$.html
title: Helpers$
---

# Helpers$

## Content

Package [akka.util](package-summary.html)
## Class Helpers$

- java.lang.Object
- - akka.util.Helpers$

- ---

```
public class Helpers$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Helpers$](Helpers$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Helpers$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[base64](#base64(long,java.lang.StringBuilder))​(long l,  java.lang.StringBuilder sb)` |  |
	| `java.lang.StringBuilder` | `[base64$default$2](#base64$default$2())()` |  |
	| `java.lang.String` | `[base64chars](#base64chars())()` |  |
	| `int` | `[compareIdentityHash](#compareIdentityHash(java.lang.Object,java.lang.Object))​(java.lang.Object a,  java.lang.Object b)` |  |
	| `java.lang.String` | `[currentTimeMillisToUTCString](#currentTimeMillisToUTCString(long))​(long timestamp)` | Converts a "currentTimeMillis"\-obtained timestamp accordingly: |
	| `<T> java.util.Comparator<T>` | `[identityHashComparator](#identityHashComparator(java.util.Comparator))​(java.util.Comparator<T> comp)` | Create a comparator which will efficiently use `System.identityHashCode`,  unless that happens to be the same for two non\-equals objects, in which  case the supplied \&ldquo;real\&rdquo; comparator is used; the comparator must be  consistent with equals, otherwise it would not be an enhancement over  the identityHashCode. |
	| `boolean` | `[isWindows](#isWindows())()` |  |
	| `java.util.regex.Pattern` | `[makePattern](#makePattern(java.lang.String))​(java.lang.String s)` |  |
	| `<A> [Helpers.Requiring](Helpers.Requiring.html "class in akka.util")<A>` | `[Requiring](#Requiring(A))​(A value)` |  |
	| `java.lang.String` | `[timestamp](#timestamp(long))​(long time)` |  |
	| `java.lang.String` | `[toRootLowerCase](#toRootLowerCase(java.lang.String))​(java.lang.String s)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Helpers$](Helpers$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Helpers$
		
		
		
		```
		public Helpers$()
		```

	- ### Method Detail
	
	
	
		- #### toRootLowerCase
		
		
		
		```
		public java.lang.String toRootLowerCase​(java.lang.String s)
		```
		- #### isWindows
		
		
		
		```
		public boolean isWindows()
		```
		- #### makePattern
		
		
		
		```
		public java.util.regex.Pattern makePattern​(java.lang.String s)
		```
		- #### compareIdentityHash
		
		
		
		```
		public int compareIdentityHash​(java.lang.Object a,
		                               java.lang.Object b)
		```
		- #### identityHashComparator
		
		
		
		```
		public <T> java.util.Comparator<T> identityHashComparator​(java.util.Comparator<T> comp)
		```
		
		Create a comparator which will efficiently use `System.identityHashCode`,
		 unless that happens to be the same for two non\-equals objects, in which
		 case the supplied \&ldquo;real\&rdquo; comparator is used; the comparator must be
		 consistent with equals, otherwise it would not be an enhancement over
		 the identityHashCode.
		- #### currentTimeMillisToUTCString
		
		
		
		```
		public java.lang.String currentTimeMillisToUTCString​(long timestamp)
		```
		
		Converts a "currentTimeMillis"\-obtained timestamp accordingly:
		 
		```
		
		   "$hours%02d:$minutes%02d:$seconds%02d.$ms%03dUTC"
		 
		```
		
		
		
		Parameters:
		`timestamp` \- a "currentTimeMillis"\-obtained timestamp
		Returns:
		the formatted timestamp
		- #### timestamp
		
		
		
		```
		public java.lang.String timestamp​(long time)
		```
		- #### base64chars
		
		
		
		```
		public final java.lang.String base64chars()
		```
		- #### base64
		
		
		
		```
		public java.lang.String base64​(long l,
		                               java.lang.StringBuilder sb)
		```
		- #### base64$default$2
		
		
		
		```
		public java.lang.StringBuilder base64$default$2()
		```
		- #### Requiring
		
		
		
		```
		public final <A> [Helpers.Requiring](Helpers.Requiring.html "class in akka.util")<A> Requiring​(A value)
		```

## Code Examples

### Example 1: currentTimeMillisToUTCString

```text
"$hours%02d:$minutes%02d:$seconds%02d.$ms%03dUTC"
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/util/Helpers$.html
- https://doc.akka.io/japi/akka/current/akka/util/Helpers.Requiring.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/Helpers$.html](https://doc.akka.io/japi/akka/current/akka/util/Helpers$.html)*