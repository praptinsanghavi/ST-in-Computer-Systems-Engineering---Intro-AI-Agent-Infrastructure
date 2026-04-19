---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:59:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html
title: Rendering
---

# Rendering

## Content

Package [akka.http.impl.util](package-summary.html)
## Interface Rendering

- All Known Implementing Classes:
`[ByteArrayRendering](ByteArrayRendering.html "class in akka.http.impl.util")`, `[ByteStringRendering](ByteStringRendering.html "class in akka.http.impl.util")`, `[CustomCharsetByteStringRendering](CustomCharsetByteStringRendering.html "class in akka.http.impl.util")`, `[StringRendering](StringRendering.html "class in akka.http.impl.util")`

---

```
public interface Rendering
```

INTERNAL API
 
 The interface for a rendering sink. Implemented for several serialization targets.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[Rendering.$u002C$u0020$](Rendering.$u002C$u0020$.html "class in akka.http.impl.util")` |  |
	| `static class` | `[Rendering.CrLf$](Rendering.CrLf$.html "class in akka.http.impl.util")` |  |
	| `static class` | `[Rendering.Empty$](Rendering.Empty$.html "class in akka.http.impl.util")` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[check](#check(int))​(int mark)` |  |
	| `int` | `[mark](#mark())()` |  |
	| `[Rendering](Rendering.html "interface in akka.http.impl.util")` | `[putEscaped](#putEscaped(java.lang.String,akka.parboiled2.CharPredicate,char))​(java.lang.String s,  akka.parboiled2.CharPredicate escape,  char escChar)` |  |
	| `[Rendering](Rendering.html "interface in akka.http.impl.util")` | `[putReplaced](#putReplaced(java.lang.String,akka.parboiled2.CharPredicate,char))​(java.lang.String s,  akka.parboiled2.CharPredicate keep,  char placeholder)` |  |

- - ### Method Detail
	
	
	
		- #### mark
		
		
		
		```
		int mark()
		```
		- #### check
		
		
		
		```
		boolean check​(int mark)
		```
		- #### putEscaped
		
		
		
		```
		[Rendering](Rendering.html "interface in akka.http.impl.util") putEscaped​(java.lang.String s,
		                     akka.parboiled2.CharPredicate escape,
		                     char escChar)
		```
		- #### putReplaced
		
		
		
		```
		[Rendering](Rendering.html "interface in akka.http.impl.util") putReplaced​(java.lang.String s,
		                      akka.parboiled2.CharPredicate keep,
		                      char placeholder)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ByteArrayRendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ByteStringRendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/CustomCharsetByteStringRendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.$u002C$u0020$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.CrLf$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.Empty$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/StringRendering.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Rendering.html)*