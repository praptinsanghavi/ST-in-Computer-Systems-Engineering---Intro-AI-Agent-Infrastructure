---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/StringBuilding.html
title: StringBuilding
---

# StringBuilding

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Interface StringBuilding

- All Known Implementing Classes:
`[HeaderParser](HeaderParser.html "class in akka.http.impl.model.parser")`, `[UriParser](UriParser.html "class in akka.http.impl.model.parser")`

---

```
public interface StringBuilding
```

For certain high\-performance use\-cases it is better to construct Strings
 that the parser is to produce/extract from the input in a char\-by\-char fashion.
 
 Mixing this trait into your parser gives you a simple facility to support this.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[appendSB](#appendSB())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[appendSB](#appendSB(char))​(char c)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[appendSB](#appendSB(int))​(int offset)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[appendSB](#appendSB(java.lang.String))​(java.lang.String s)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[clearSB](#clearSB())()` |  |
	| `void` | `[doPrepend](#doPrepend(char))​(char c)` |  |
	| `void` | `[doPrepend](#doPrepend(java.lang.String))​(java.lang.String s)` |  |
	| `void` | `[doSet](#doSet(java.lang.String))​(java.lang.String s)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[prependSB](#prependSB())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[prependSB](#prependSB(char))​(char c)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[prependSB](#prependSB(int))​(int offset)` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[prependSB](#prependSB(java.lang.String))​(java.lang.String s)` |  |
	| `java.lang.StringBuilder` | `[sb](#sb())()` |  |
	| `akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil>` | `[setSB](#setSB(java.lang.String))​(java.lang.String s)` |  |

- - ### Method Detail
	
	
	
		- #### appendSB
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> appendSB()
		```
		- #### appendSB
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> appendSB​(int offset)
		```
		- #### appendSB
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> appendSB​(char c)
		```
		- #### appendSB
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> appendSB​(java.lang.String s)
		```
		- #### clearSB
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> clearSB()
		```
		- #### doPrepend
		
		
		
		```
		void doPrepend​(char c)
		```
		- #### doPrepend
		
		
		
		```
		void doPrepend​(java.lang.String s)
		```
		- #### doSet
		
		
		
		```
		void doSet​(java.lang.String s)
		```
		- #### prependSB
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> prependSB()
		```
		- #### prependSB
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> prependSB​(int offset)
		```
		- #### prependSB
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> prependSB​(char c)
		```
		- #### prependSB
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> prependSB​(java.lang.String s)
		```
		- #### sb
		
		
		
		```
		java.lang.StringBuilder sb()
		```
		- #### setSB
		
		
		
		```
		akka.parboiled2.Rule<akka.parboiled2.support.hlist.HNil,​akka.parboiled2.support.hlist.HNil> setSB​(java.lang.String s)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/UriParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/StringBuilding.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/StringBuilding.html)*