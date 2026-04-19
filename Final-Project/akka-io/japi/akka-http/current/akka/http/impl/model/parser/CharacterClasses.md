---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CharacterClasses.html
title: CharacterClasses
---

# CharacterClasses

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Class CharacterClasses

- java.lang.Object
- - akka.http.impl.model.parser.CharacterClasses

- ---

```
public class CharacterClasses
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CharacterClasses](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.parboiled2.CharPredicate` | `[ALPHA](#ALPHA())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[ALPHANUM](#ALPHANUM())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[colonSlashEOI](#colonSlashEOI())()` |  |
	| `static char` | `[CR](#CR())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[CTL](#CTL())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[DIGIT](#DIGIT())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[DIGIT04](#DIGIT04())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[DIGIT05](#DIGIT05())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[DIGIT19](#DIGIT19())()` |  |
	| `static char` | `[DQUOTE](#DQUOTE())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[HEXDIG](#HEXDIG())()` |  |
	| `static char` | `[HTAB](#HTAB())()` |  |
	| `static char` | `[LF](#LF())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[LOWER_ALPHA](#LOWER_ALPHA())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[reserved](#reserved())()` |  |
	| `static char` | `[SP](#SP())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[special](#special())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[tchar](#tchar())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[unreserved](#unreserved())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[UPPER_ALPHA](#UPPER_ALPHA())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[VCHAR](#VCHAR())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[WSP](#WSP())()` |  |
	| `static akka.parboiled2.CharPredicate` | `[WSPCRLF](#WSPCRLF())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CharacterClasses
		
		
		
		```
		public CharacterClasses()
		```

	- ### Method Detail
	
	
	
		- #### ALPHA
		
		
		
		```
		public static akka.parboiled2.CharPredicate ALPHA()
		```
		- #### LOWER\_ALPHA
		
		
		
		```
		public static akka.parboiled2.CharPredicate LOWER_ALPHA()
		```
		- #### UPPER\_ALPHA
		
		
		
		```
		public static akka.parboiled2.CharPredicate UPPER_ALPHA()
		```
		- #### CR
		
		
		
		```
		public static char CR()
		```
		- #### CTL
		
		
		
		```
		public static akka.parboiled2.CharPredicate CTL()
		```
		- #### DIGIT
		
		
		
		```
		public static akka.parboiled2.CharPredicate DIGIT()
		```
		- #### ALPHANUM
		
		
		
		```
		public static akka.parboiled2.CharPredicate ALPHANUM()
		```
		- #### DQUOTE
		
		
		
		```
		public static char DQUOTE()
		```
		- #### HEXDIG
		
		
		
		```
		public static akka.parboiled2.CharPredicate HEXDIG()
		```
		- #### HTAB
		
		
		
		```
		public static char HTAB()
		```
		- #### LF
		
		
		
		```
		public static char LF()
		```
		- #### SP
		
		
		
		```
		public static char SP()
		```
		- #### VCHAR
		
		
		
		```
		public static akka.parboiled2.CharPredicate VCHAR()
		```
		- #### WSP
		
		
		
		```
		public static akka.parboiled2.CharPredicate WSP()
		```
		- #### WSPCRLF
		
		
		
		```
		public static akka.parboiled2.CharPredicate WSPCRLF()
		```
		- #### special
		
		
		
		```
		public static akka.parboiled2.CharPredicate special()
		```
		- #### tchar
		
		
		
		```
		public static akka.parboiled2.CharPredicate tchar()
		```
		- #### unreserved
		
		
		
		```
		public static akka.parboiled2.CharPredicate unreserved()
		```
		- #### reserved
		
		
		
		```
		public static akka.parboiled2.CharPredicate reserved()
		```
		- #### DIGIT04
		
		
		
		```
		public static akka.parboiled2.CharPredicate DIGIT04()
		```
		- #### DIGIT05
		
		
		
		```
		public static akka.parboiled2.CharPredicate DIGIT05()
		```
		- #### DIGIT19
		
		
		
		```
		public static akka.parboiled2.CharPredicate DIGIT19()
		```
		- #### colonSlashEOI
		
		
		
		```
		public static akka.parboiled2.CharPredicate colonSlashEOI()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CharacterClasses.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CharacterClasses.html)*