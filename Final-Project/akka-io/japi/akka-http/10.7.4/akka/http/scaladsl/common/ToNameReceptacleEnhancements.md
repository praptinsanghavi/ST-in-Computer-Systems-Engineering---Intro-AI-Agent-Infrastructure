---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/ToNameReceptacleEnhancements.html
title: ToNameReceptacleEnhancements
---

# ToNameReceptacleEnhancements

## Content

Package [akka.http.scaladsl.common](package-summary.html)
## Interface ToNameReceptacleEnhancements

- All Known Subinterfaces:
`[Directives](../server/Directives.html "interface in akka.http.scaladsl.server")`, `[FormFieldDirectives](../server/directives/FormFieldDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[ParameterDirectives](../server/directives/ParameterDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[PathDirectives](../server/directives/PathDirectives.html "interface in akka.http.scaladsl.server.directives")`

All Known Implementing Classes:
`[Directives$](../server/Directives$.html "class in akka.http.scaladsl.server")`, `[FormFieldDirectives$](../server/directives/FormFieldDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[HttpApp](../server/HttpApp.html "class in akka.http.scaladsl.server")`, `[ParameterDirectives$](../server/directives/ParameterDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[PathDirectives$](../server/directives/PathDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[ToNameReceptacleEnhancements$](ToNameReceptacleEnhancements$.html "class in akka.http.scaladsl.common")`

---

```
public interface ToNameReceptacleEnhancements
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[NameReceptacle](NameReceptacle.html "class in akka.http.scaladsl.common")<java.lang.String>` | `[_string2NR](#_string2NR(java.lang.String))​(java.lang.String string)` |  |
	| `[NameReceptacle](NameReceptacle.html "class in akka.http.scaladsl.common")<java.lang.String>` | `[_symbol2NR](#_symbol2NR(scala.Symbol))​(scala.Symbol symbol)` |  |

- - ### Method Detail
	
	
	
		- #### \_symbol2NR
		
		
		
		```
		[NameReceptacle](NameReceptacle.html "class in akka.http.scaladsl.common")<java.lang.String> _symbol2NR​(scala.Symbol symbol)
		```
		- #### \_string2NR
		
		
		
		```
		[NameReceptacle](NameReceptacle.html "class in akka.http.scaladsl.common")<java.lang.String> _string2NR​(java.lang.String string)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/NameReceptacle.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/ToNameReceptacleEnhancements$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ParameterDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/PathDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/PathDirectives.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/ToNameReceptacleEnhancements.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/ToNameReceptacleEnhancements.html)*