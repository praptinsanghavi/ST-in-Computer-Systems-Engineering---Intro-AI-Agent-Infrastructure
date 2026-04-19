---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/J2SMapping$.html
title: J2SMapping$
---

# J2SMapping$

## Content

Package [akka.http.impl.util](package-summary.html)
## Class J2SMapping$

- java.lang.Object
- - akka.http.impl.util.J2SMapping$

- ---

```
public class J2SMapping$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [J2SMapping$](J2SMapping$.html "class in akka.http.impl.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[J2SMapping$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<J> [J2SMapping](J2SMapping.html "interface in akka.http.impl.util")<J>` | `[fromJavaMapping](#fromJavaMapping(akka.http.impl.util.JavaMapping))​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J,​?> mapping)` |  |
	| `<J> [J2SMapping](J2SMapping.html "interface in akka.http.impl.util")<scala.collection.immutable.Seq<J>>` | `[fromJavaSeqMapping](#fromJavaSeqMapping(akka.http.impl.util.J2SMapping))​([J2SMapping](J2SMapping.html "interface in akka.http.impl.util")<J> mapping)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [J2SMapping$](J2SMapping$.html "class in akka.http.impl.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### J2SMapping$
		
		
		
		```
		public J2SMapping$()
		```

	- ### Method Detail
	
	
	
		- #### fromJavaMapping
		
		
		
		```
		public <J> [J2SMapping](J2SMapping.html "interface in akka.http.impl.util")<J> fromJavaMapping​([JavaMapping](JavaMapping.html "interface in akka.http.impl.util")<J,​?> mapping)
		```
		- #### fromJavaSeqMapping
		
		
		
		```
		public <J> [J2SMapping](J2SMapping.html "interface in akka.http.impl.util")<scala.collection.immutable.Seq<J>> fromJavaSeqMapping​([J2SMapping](J2SMapping.html "interface in akka.http.impl.util")<J> mapping)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/J2SMapping$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/J2SMapping.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/JavaMapping.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/J2SMapping$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/J2SMapping$.html)*