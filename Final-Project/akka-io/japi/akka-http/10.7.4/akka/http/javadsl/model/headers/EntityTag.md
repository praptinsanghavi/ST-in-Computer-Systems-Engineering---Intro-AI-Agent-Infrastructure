---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTag.html
title: EntityTag
---

# EntityTag

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class EntityTag

- java.lang.Object
- - akka.http.javadsl.model.headers.EntityTag

- Direct Known Subclasses:
`[EntityTag](../../../scaladsl/model/headers/EntityTag.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class EntityTag
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityTag](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [EntityTag](EntityTag.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,boolean))​(java.lang.String tag,  boolean weak)` |  |
	| `static boolean` | `[matches](#matches(akka.http.javadsl.model.headers.EntityTag,akka.http.javadsl.model.headers.EntityTag,boolean))​([EntityTag](EntityTag.html "class in akka.http.javadsl.model.headers") eTag,  [EntityTag](EntityTag.html "class in akka.http.javadsl.model.headers") other,  boolean weak)` |  |
	| `static boolean` | `[matchesRange](#matchesRange(akka.http.javadsl.model.headers.EntityTag,akka.http.javadsl.model.headers.EntityTagRange,boolean))​([EntityTag](EntityTag.html "class in akka.http.javadsl.model.headers") eTag,  [EntityTagRange](EntityTagRange.html "class in akka.http.javadsl.model.headers") range,  boolean weak)` |  |
	| `abstract java.lang.String` | `[tag](#tag())()` |  |
	| `abstract boolean` | `[weak](#weak())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EntityTag
		
		
		
		```
		public EntityTag()
		```

	- ### Method Detail
	
	
	
		- #### tag
		
		
		
		```
		public abstract java.lang.String tag()
		```
		- #### weak
		
		
		
		```
		public abstract boolean weak()
		```
		- #### create
		
		
		
		```
		public static [EntityTag](EntityTag.html "class in akka.http.javadsl.model.headers") create​(java.lang.String tag,
		                               boolean weak)
		```
		- #### matchesRange
		
		
		
		```
		public static boolean matchesRange​([EntityTag](EntityTag.html "class in akka.http.javadsl.model.headers") eTag,
		                                   [EntityTagRange](EntityTagRange.html "class in akka.http.javadsl.model.headers") range,
		                                   boolean weak)
		```
		- #### matches
		
		
		
		```
		public static boolean matches​([EntityTag](EntityTag.html "class in akka.http.javadsl.model.headers") eTag,
		                              [EntityTag](EntityTag.html "class in akka.http.javadsl.model.headers") other,
		                              boolean weak)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTag.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTagRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/EntityTag.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTag.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/EntityTag.html)*