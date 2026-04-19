---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:48:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/AkkaVersion.html
title: AkkaVersion
---

# AkkaVersion

## Content

Package [akka](package-summary.html)
## Class AkkaVersion

- java.lang.Object
- - akka.AkkaVersion

- ---

```
public class AkkaVersion
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AkkaVersion](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[require](#require(java.lang.String,java.lang.String))​(java.lang.String libraryName,  java.lang.String requiredVersion)` | Check that the version of Akka is a specific patch version or higher and throw an [`UnsupportedAkkaVersion`](UnsupportedAkkaVersion.html "class in akka")  exception if the version requirement is not fulfilled. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AkkaVersion
		
		
		
		```
		public AkkaVersion()
		```

	- ### Method Detail
	
	
	
		- #### require
		
		
		
		```
		public static void require​(java.lang.String libraryName,
		                           java.lang.String requiredVersion)
		```
		
		Check that the version of Akka is a specific patch version or higher and throw an [`UnsupportedAkkaVersion`](UnsupportedAkkaVersion.html "class in akka")
		 exception if the version requirement is not fulfilled.
		 
		 For example: `require("my-library", "2.5.4")` would fail if used with Akka 2\.4\.19 and 2\.5\.3, but succeed with 2\.5\.4
		 and 2\.6\.1
		 
		
		
		
		Parameters:
		`libraryName` \- The name of the library or component requiring the Akka version, used in the error message.
		`requiredVersion` \- Minimal version that this library works with

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/UnsupportedAkkaVersion.html
- https://doc.akka.io/japi/akka/current/akka/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/AkkaVersion.html](https://doc.akka.io/japi/akka/current/akka/AkkaVersion.html)*