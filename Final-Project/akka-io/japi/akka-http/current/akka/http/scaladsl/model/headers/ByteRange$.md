---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:34:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange$.html
title: ByteRange$
---

# ByteRange$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class ByteRange$

- java.lang.Object
- - akka.http.scaladsl.model.headers.ByteRange$

- ---

```
public class ByteRange$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ByteRange$](ByteRange$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteRange$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ByteRange.Slice](ByteRange.Slice.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(long,long))​(long first,  long last)` |  |
	| `[ByteRange.FromOffset](ByteRange.FromOffset.html "class in akka.http.scaladsl.model.headers")` | `[fromOffset](#fromOffset(long))​(long offset)` |  |
	| `[ByteRange.Suffix](ByteRange.Suffix.html "class in akka.http.scaladsl.model.headers")` | `[suffix](#suffix(long))​(long length)` | Constructs a range that spans the last \`length\` bytes of an entity. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ByteRange$](ByteRange$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ByteRange$
		
		
		
		```
		public ByteRange$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ByteRange.Slice](ByteRange.Slice.html "class in akka.http.scaladsl.model.headers") apply​(long first,
		                             long last)
		```
		- #### fromOffset
		
		
		
		```
		public [ByteRange.FromOffset](ByteRange.FromOffset.html "class in akka.http.scaladsl.model.headers") fromOffset​(long offset)
		```
		- #### suffix
		
		
		
		```
		public [ByteRange.Suffix](ByteRange.Suffix.html "class in akka.http.scaladsl.model.headers") suffix​(long length)
		```
		
		Constructs a range that spans the last \`length\` bytes of an entity.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange.FromOffset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange.Slice.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange.Suffix.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/ByteRange$.html)*