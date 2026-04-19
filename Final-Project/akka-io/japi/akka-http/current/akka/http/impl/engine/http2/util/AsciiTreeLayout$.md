---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/util/AsciiTreeLayout$.html
title: AsciiTreeLayout$
---

# AsciiTreeLayout$

## Content

Package [akka.http.impl.engine.http2\.util](package-summary.html)
## Class AsciiTreeLayout$

- java.lang.Object
- - akka.http.impl.engine.http2\.util.AsciiTreeLayout$

- ---

```
public class AsciiTreeLayout$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AsciiTreeLayout$](AsciiTreeLayout$.html "class in akka.http.impl.engine.http2.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AsciiTreeLayout$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> java.lang.String` | `[toAscii](#toAscii(A,scala.Function1,scala.Function1,int))​(A top,  scala.Function1<A,​scala.collection.immutable.Seq<A>> children,  scala.Function1<A,​java.lang.String> display,  int maxColumn)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AsciiTreeLayout$](AsciiTreeLayout$.html "class in akka.http.impl.engine.http2.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AsciiTreeLayout$
		
		
		
		```
		public AsciiTreeLayout$()
		```

	- ### Method Detail
	
	
	
		- #### toAscii
		
		
		
		```
		public <A> java.lang.String toAscii​(A top,
		                                    scala.Function1<A,​scala.collection.immutable.Seq<A>> children,
		                                    scala.Function1<A,​java.lang.String> display,
		                                    int maxColumn)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/util/AsciiTreeLayout$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/util/AsciiTreeLayout$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/util/AsciiTreeLayout$.html)*