---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/LanguageRange.html
title: LanguageRange
---

# LanguageRange

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Interface LanguageRange

- All Known Subinterfaces:
`[LanguageRange](../../../scaladsl/model/headers/LanguageRange.html "interface in akka.http.scaladsl.model.headers")`

All Known Implementing Classes:
`[LanguageRange.$times](../../../scaladsl/model/headers/LanguageRange.$times.html "class in akka.http.scaladsl.model.headers")`, `[LanguageRange.$times$](../../../scaladsl/model/headers/LanguageRange.$times$.html "class in akka.http.scaladsl.model.headers")`, `[LanguageRange.One](../../../scaladsl/model/headers/LanguageRange.One.html "class in akka.http.scaladsl.model.headers")`

---

```
public interface LanguageRange
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Iterable<java.lang.String>` | `[getSubTags](#getSubTags())()` |  |
	| `boolean` | `[matches](#matches(akka.http.javadsl.model.headers.Language))​([Language](Language.html "class in akka.http.javadsl.model.headers") language)` |  |
	| `java.lang.String` | `[primaryTag](#primaryTag())()` |  |
	| `float` | `[qValue](#qValue())()` |  |
	| `[LanguageRange](LanguageRange.html "interface in akka.http.javadsl.model.headers")` | `[withQValue](#withQValue(float))​(float qValue)` |  |

- - ### Method Detail
	
	
	
		- #### primaryTag
		
		
		
		```
		java.lang.String primaryTag()
		```
		- #### qValue
		
		
		
		```
		float qValue()
		```
		- #### matches
		
		
		
		```
		boolean matches​([Language](Language.html "class in akka.http.javadsl.model.headers") language)
		```
		- #### getSubTags
		
		
		
		```
		java.lang.Iterable<java.lang.String> getSubTags()
		```
		- #### withQValue
		
		
		
		```
		[LanguageRange](LanguageRange.html "interface in akka.http.javadsl.model.headers") withQValue​(float qValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Language.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/LanguageRange.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange.$times$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange.$times.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange.One.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/LanguageRange.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/LanguageRange.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/LanguageRange.html)*