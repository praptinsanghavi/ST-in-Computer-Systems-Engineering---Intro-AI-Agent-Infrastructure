---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/StringRendering.html
title: StringRendering
---

# StringRendering

## Content

Package [akka.http.impl.util](package-summary.html)
## Class StringRendering

- java.lang.Object
- - akka.http.impl.util.StringRendering

- All Implemented Interfaces:
`[Rendering](Rendering.html "interface in akka.http.impl.util")`

---

```
public class StringRendering
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
	| `[StringRendering](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected boolean` | `[check](#check(int))​(int mark)` |  |
	| `java.lang.String` | `[get](#get())()` |  |
	| `protected int` | `[mark](#mark())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[Rendering](Rendering.html "interface in akka.http.impl.util")
		
		
		`[putEscaped](Rendering.html#putEscaped(java.lang.String,akka.parboiled2.CharPredicate,char)), [putReplaced](Rendering.html#putReplaced(java.lang.String,akka.parboiled2.CharPredicate,char))`

- - ### Constructor Detail
	
	
	
		- #### StringRendering
		
		
		
		```
		public StringRendering()
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
		public java.lang.String get()
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
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/StringRendering.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/StringRendering.html)*