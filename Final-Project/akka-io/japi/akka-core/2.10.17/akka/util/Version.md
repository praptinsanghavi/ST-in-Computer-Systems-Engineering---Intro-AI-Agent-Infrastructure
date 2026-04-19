---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Version.html
title: Version
---

# Version

## Content

Package [akka.util](package-summary.html)
## Class Version

- java.lang.Object
- - akka.util.Version

- All Implemented Interfaces:
`java.lang.Comparable<[Version](Version.html "class in akka.util")>`

---

```
public final class Version
extends java.lang.Object
implements java.lang.Comparable<[Version](Version.html "class in akka.util")>
```

Comparable version information.
 
 The typical convention is to use 3 digit version numbers `major.minor.patch`,
 but 1 or two digits are also supported.
 

 If no `.` is used it is interpreted as a single digit version number or as
 plain alphanumeric if it couldn't be parsed as a number.
 

 It may also have a qualifier at the end for 2 or 3 digit version numbers such as "1\.2\-RC1".
 For 1 digit with qualifier, 1\-RC1, it is interpreted as plain alphanumeric.
 

 It has support for https://github.com/dwijnand/sbt\-dynver format with `+` or
 `-` separator. The number of commits from the tag is handled as a numeric part.
 For example `1.0.0+3-73475dce26` is less than `1.0.0+10-ed316bd024` (3 \< 10\).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Version](#%3Cinit%3E(java.lang.String))​(java.lang.String version)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Version](Version.html "class in akka.util")` | `[apply](#apply(java.lang.String))​(java.lang.String version)` |  |
	| `int` | `[compareTo](#compareTo(akka.util.Version))​([Version](Version.html "class in akka.util") other)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object o)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `java.lang.String` | `[version](#version())()` |  |
	| `static [Version](Version.html "class in akka.util")` | `[Zero](#Zero())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Version
		
		
		
		```
		public Version​(java.lang.String version)
		```

	- ### Method Detail
	
	
	
		- #### Zero
		
		
		
		```
		public static [Version](Version.html "class in akka.util") Zero()
		```
		- #### apply
		
		
		
		```
		public static [Version](Version.html "class in akka.util") apply​(java.lang.String version)
		```
		- #### version
		
		
		
		```
		public java.lang.String version()
		```
		- #### compareTo
		
		
		
		```
		public int compareTo​([Version](Version.html "class in akka.util") other)
		```
		
		
		Specified by:
		`compareTo` in interface `java.lang.Comparable<[Version](Version.html "class in akka.util")>`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object o)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Version.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Version.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/util/Version.html)*