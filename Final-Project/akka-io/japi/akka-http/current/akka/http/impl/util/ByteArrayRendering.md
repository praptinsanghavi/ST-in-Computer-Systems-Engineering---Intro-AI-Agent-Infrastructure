---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ByteArrayRendering.html
title: ByteArrayRendering
---

# ByteArrayRendering

## Content

Package [akka.http.impl.util](package-summary.html)
## Class ByteArrayRendering

- java.lang.Object
- - akka.http.impl.util.ByteArrayRendering

- All Implemented Interfaces:
`[Rendering](Rendering.html "interface in akka.http.impl.util")`

---

```
public class ByteArrayRendering
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
	| `[ByteArrayRendering](#%3Cinit%3E(int))​(int sizeHint)` |  |
	| `[ByteArrayRendering](#%3Cinit%3E(int,scala.Function1))​(int sizeHint,  scala.Function1<java.lang.String,​scala.runtime.BoxedUnit> logDiscardedHeader)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.util.ByteString` | `[asByteString](#asByteString())()` |  |
	| `protected boolean` | `[check](#check(int))​(int mark)` |  |
	| `byte[]` | `[get](#get())()` |  |
	| `protected int` | `[mark](#mark())()` |  |
	| `int` | `[remainingCapacity](#remainingCapacity())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Rendering](Rendering.html "interface in akka.http.impl.util")
		
		
		`[putEscaped](Rendering.html#putEscaped(java.lang.String,akka.parboiled2.CharPredicate,char)), [putReplaced](Rendering.html#putReplaced(java.lang.String,akka.parboiled2.CharPredicate,char))`

- - ### Constructor Detail
	
	
	
		- #### ByteArrayRendering
		
		
		
		```
		public ByteArrayRendering​(int sizeHint,
		                          scala.Function1<java.lang.String,​scala.runtime.BoxedUnit> logDiscardedHeader)
		```
		- #### ByteArrayRendering
		
		
		
		```
		public ByteArrayRendering​(int sizeHint)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public byte[] get()
		```
		- #### remainingCapacity
		
		
		
		```
		public int remainingCapacity()
		```
		- #### asByteString
		
		
		
		```
		public akka.util.ByteString asByteString()
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
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ByteArrayRendering.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ByteArrayRendering.html)*