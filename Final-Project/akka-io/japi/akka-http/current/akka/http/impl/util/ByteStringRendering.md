---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ByteStringRendering.html
title: ByteStringRendering
---

# ByteStringRendering

## Content

Package [akka.http.impl.util](package-summary.html)
## Class ByteStringRendering

- java.lang.Object
- - akka.http.impl.util.ByteStringRendering

- All Implemented Interfaces:
`[Rendering](Rendering.html "interface in akka.http.impl.util")`

---

```
public class ByteStringRendering
extends java.lang.Object
implements [Rendering](Rendering.html "interface in akka.http.impl.util")
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.impl.util.[Rendering](Rendering.html "interface in akka.http.impl.util")
		
		
		`[Rendering.$u002C$u0020$](Rendering.$u002C$u0020$.html "class in akka.http.impl.util"), [Rendering.CrLf$](Rendering.CrLf$.html "class in akka.http.impl.util"), [Rendering.Empty$](Rendering.Empty$.html "class in akka.http.impl.util")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ByteStringRendering](#%3Cinit%3E(int))​(int sizeHint)` |  |
	| `[ByteStringRendering](#%3Cinit%3E(int,scala.Function1))​(int sizeHint,  scala.Function1<java.lang.String,​scala.runtime.BoxedUnit> logDiscardedHeader)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected boolean` | `[check](#check(int))​(int mark)` |  |
	| `akka.util.ByteString` | `[get](#get())()` |  |
	| `protected int` | `[mark](#mark())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Rendering](Rendering.html "interface in akka.http.impl.util")
		
		
		`[putEscaped](Rendering.html#putEscaped(java.lang.String,akka.parboiled2.CharPredicate,char)), [putReplaced](Rendering.html#putReplaced(java.lang.String,akka.parboiled2.CharPredicate,char))`

- - ### Constructor Detail
	
	
	
		- #### ByteStringRendering
		
		
		
		```
		public ByteStringRendering​(int sizeHint,
		                           scala.Function1<java.lang.String,​scala.runtime.BoxedUnit> logDiscardedHeader)
		```
		- #### ByteStringRendering
		
		
		
		```
		public ByteStringRendering​(int sizeHint)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public akka.util.ByteString get()
		```
		- #### mark
		
		
		
		```
		protected int mark()
		```
		
		
		Specified by:
		`[mark](Rendering.html#mark())` in interface `[Rendering](Rendering.html "interface in akka.http.impl.util")`
		- #### check
		
		
		
		```
		protected boolean check​(int mark)
		```
		
		
		Specified by:
		`[check](Rendering.html#check(int))` in interface `[Rendering](Rendering.html "interface in akka.http.impl.util")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.$u002C$u0020$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.CrLf$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.Empty$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ByteStringRendering.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ByteStringRendering.html)*