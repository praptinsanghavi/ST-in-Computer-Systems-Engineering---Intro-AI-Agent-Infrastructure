---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Language.html
title: Language
---

# Language

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class Language

- java.lang.Object
- - akka.http.javadsl.model.headers.Language

- Direct Known Subclasses:
`[Language](../../../scaladsl/model/headers/Language.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class Language
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Language](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Language](Language.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String...))​(java.lang.String primaryTag,  java.lang.String... subTags)` |  |
	| `abstract java.lang.Iterable<java.lang.String>` | `[getSubTags](#getSubTags())()` |  |
	| `abstract java.lang.String` | `[primaryTag](#primaryTag())()` |  |
	| `abstract [LanguageRange](LanguageRange.html "interface in akka.http.javadsl.model.headers")` | `[withQValue](#withQValue(float))​(float qValue)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Language
		
		
		
		```
		public Language()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [Language](Language.html "class in akka.http.javadsl.model.headers") create​(java.lang.String primaryTag,
		                              java.lang.String... subTags)
		```
		- #### primaryTag
		
		
		
		```
		public abstract java.lang.String primaryTag()
		```
		- #### getSubTags
		
		
		
		```
		public abstract java.lang.Iterable<java.lang.String> getSubTags()
		```
		- #### withQValue
		
		
		
		```
		public abstract [LanguageRange](LanguageRange.html "interface in akka.http.javadsl.model.headers") withQValue​(float qValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Language.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/LanguageRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Language.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Language.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Language.html)*