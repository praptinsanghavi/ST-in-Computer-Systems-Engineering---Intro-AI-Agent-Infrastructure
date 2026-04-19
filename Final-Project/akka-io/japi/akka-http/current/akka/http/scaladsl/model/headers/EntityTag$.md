---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTag$.html
title: EntityTag$
---

# EntityTag$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class EntityTag$

- java.lang.Object
- - akka.http.scaladsl.model.headers.EntityTag$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class EntityTag$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.EntityTag$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EntityTag$](EntityTag$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityTag$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[matches](#matches(akka.http.scaladsl.model.headers.EntityTag,akka.http.scaladsl.model.headers.EntityTag,boolean))​([EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") eTag,  [EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") other,  boolean weakComparison)` |  |
	| `boolean` | `[matchesRange](#matchesRange(akka.http.scaladsl.model.headers.EntityTag,akka.http.scaladsl.model.headers.EntityTagRange,boolean))​([EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") eTag,  [EntityTagRange](EntityTagRange.html "class in akka.http.scaladsl.model.headers") entityTagRange,  boolean weakComparison)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EntityTag$](EntityTag$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EntityTag$
		
		
		
		```
		public EntityTag$()
		```

	- ### Method Detail
	
	
	
		- #### matchesRange
		
		
		
		```
		public boolean matchesRange​([EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") eTag,
		                            [EntityTagRange](EntityTagRange.html "class in akka.http.scaladsl.model.headers") entityTagRange,
		                            boolean weakComparison)
		```
		- #### matches
		
		
		
		```
		public boolean matches​([EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") eTag,
		                       [EntityTag](EntityTag.html "class in akka.http.scaladsl.model.headers") other,
		                       boolean weakComparison)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTag$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTagRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTag$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/EntityTag$.html)*