---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:40:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentRange.html
title: ContentRange
---

# ContentRange

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class ContentRange

- java.lang.Object
- - akka.http.javadsl.model.ContentRange

- Direct Known Subclasses:
`[ContentRange.Default](../../scaladsl/model/ContentRange.Default.html "class in akka.http.scaladsl.model")`, `[ContentRange.Other](../../scaladsl/model/ContentRange.Other.html "class in akka.http.scaladsl.model")`, `[ContentRange.Unsatisfiable](../../scaladsl/model/ContentRange.Unsatisfiable.html "class in akka.http.scaladsl.model")`

---

```
public abstract class ContentRange
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ContentRange](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ContentRange](ContentRange.html "class in akka.http.javadsl.model")` | `[create](#create(long,long))​(long first,  long last)` |  |
	| `static [ContentRange](ContentRange.html "class in akka.http.javadsl.model")` | `[create](#create(long,long,long))​(long first,  long last,  long instanceLength)` |  |
	| `static [ContentRange](ContentRange.html "class in akka.http.javadsl.model")` | `[create](#create(long,long,java.util.OptionalLong))​(long first,  long last,  java.util.OptionalLong instanceLength)` |  |
	| `static [ContentRange](ContentRange.html "class in akka.http.javadsl.model")` | `[createOther](#createOther(java.lang.String))​(java.lang.String value)` |  |
	| `static [ContentRange](ContentRange.html "class in akka.http.javadsl.model")` | `[createUnsatisfiable](#createUnsatisfiable(long))​(long length)` |  |
	| `abstract java.util.OptionalLong` | `[getInstanceLength](#getInstanceLength())()` |  |
	| `abstract java.util.Optional<java.lang.String>` | `[getOtherValue](#getOtherValue())()` |  |
	| `abstract java.util.OptionalLong` | `[getSatisfiableFirst](#getSatisfiableFirst())()` |  |
	| `abstract java.util.OptionalLong` | `[getSatisfiableLast](#getSatisfiableLast())()` |  |
	| `abstract boolean` | `[isByteContentRange](#isByteContentRange())()` |  |
	| `abstract boolean` | `[isOther](#isOther())()` |  |
	| `abstract boolean` | `[isSatisfiable](#isSatisfiable())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ContentRange
		
		
		
		```
		public ContentRange()
		```

	- ### Method Detail
	
	
	
		- #### isByteContentRange
		
		
		
		```
		public abstract boolean isByteContentRange()
		```
		- #### isSatisfiable
		
		
		
		```
		public abstract boolean isSatisfiable()
		```
		- #### isOther
		
		
		
		```
		public abstract boolean isOther()
		```
		- #### getSatisfiableFirst
		
		
		
		```
		public abstract java.util.OptionalLong getSatisfiableFirst()
		```
		- #### getSatisfiableLast
		
		
		
		```
		public abstract java.util.OptionalLong getSatisfiableLast()
		```
		- #### getOtherValue
		
		
		
		```
		public abstract java.util.Optional<java.lang.String> getOtherValue()
		```
		- #### getInstanceLength
		
		
		
		```
		public abstract java.util.OptionalLong getInstanceLength()
		```
		- #### create
		
		
		
		```
		public static [ContentRange](ContentRange.html "class in akka.http.javadsl.model") create​(long first,
		                                  long last)
		```
		- #### create
		
		
		
		```
		public static [ContentRange](ContentRange.html "class in akka.http.javadsl.model") create​(long first,
		                                  long last,
		                                  long instanceLength)
		```
		- #### create
		
		
		
		```
		public static [ContentRange](ContentRange.html "class in akka.http.javadsl.model") create​(long first,
		                                  long last,
		                                  java.util.OptionalLong instanceLength)
		```
		- #### createUnsatisfiable
		
		
		
		```
		public static [ContentRange](ContentRange.html "class in akka.http.javadsl.model") createUnsatisfiable​(long length)
		```
		- #### createOther
		
		
		
		```
		public static [ContentRange](ContentRange.html "class in akka.http.javadsl.model") createOther​(java.lang.String value)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ContentRange.Default.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ContentRange.Other.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ContentRange.Unsatisfiable.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentRange.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentRange.html)*