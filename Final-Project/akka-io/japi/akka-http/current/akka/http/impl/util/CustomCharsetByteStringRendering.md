---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/CustomCharsetByteStringRendering.html
title: CustomCharsetByteStringRendering
---

# CustomCharsetByteStringRendering

## Content

Package [akka.http.impl.util](package-summary.html)
## Class CustomCharsetByteStringRendering

- java.lang.Object
- - akka.http.impl.util.CustomCharsetByteStringRendering

- All Implemented Interfaces:
`[Rendering](Rendering.html "interface in akka.http.impl.util")`

---

```
public class CustomCharsetByteStringRendering
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
	| `[CustomCharsetByteStringRendering](#%3Cinit%3E(java.nio.charset.Charset,int))​(java.nio.charset.Charset nioCharset,  int sizeHint)` |  |

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
	
	
	
		- #### CustomCharsetByteStringRendering
		
		
		
		```
		public CustomCharsetByteStringRendering​(java.nio.charset.Charset nioCharset,
		                                        int sizeHint)
		```

	- ### Method Detail
	
	
	
		- #### check
		
		
		
		```
		protected boolean check​(int mark)
		```
		
		
		Specified by:
		`[check](Rendering.html#check(int))` in interface `[Rendering](Rendering.html "interface in akka.http.impl.util")`
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.$u002C$u0020$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.CrLf$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.Empty$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/CustomCharsetByteStringRendering.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/CustomCharsetByteStringRendering.html)*