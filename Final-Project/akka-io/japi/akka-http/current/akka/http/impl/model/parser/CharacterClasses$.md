---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CharacterClasses$.html
title: CharacterClasses$
---

# CharacterClasses$

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Class CharacterClasses$

- java.lang.Object
- - akka.http.impl.model.parser.CharacterClasses$

- ---

```
public class CharacterClasses$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CharacterClasses$](CharacterClasses$.html "class in akka.http.impl.model.parser")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CharacterClasses$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.parboiled2.CharPredicate` | `[ALPHA](#ALPHA())()` |  |
	| `akka.parboiled2.CharPredicate` | `[ALPHANUM](#ALPHANUM())()` |  |
	| `akka.parboiled2.CharPredicate` | `[colonSlashEOI](#colonSlashEOI())()` |  |
	| `char` | `[CR](#CR())()` |  |
	| `akka.parboiled2.CharPredicate` | `[CTL](#CTL())()` |  |
	| `akka.parboiled2.CharPredicate` | `[DIGIT](#DIGIT())()` |  |
	| `akka.parboiled2.CharPredicate` | `[DIGIT04](#DIGIT04())()` |  |
	| `akka.parboiled2.CharPredicate` | `[DIGIT05](#DIGIT05())()` |  |
	| `akka.parboiled2.CharPredicate` | `[DIGIT19](#DIGIT19())()` |  |
	| `char` | `[DQUOTE](#DQUOTE())()` |  |
	| `akka.parboiled2.CharPredicate` | `[HEXDIG](#HEXDIG())()` |  |
	| `char` | `[HTAB](#HTAB())()` |  |
	| `char` | `[LF](#LF())()` |  |
	| `akka.parboiled2.CharPredicate` | `[LOWER_ALPHA](#LOWER_ALPHA())()` |  |
	| `akka.parboiled2.CharPredicate` | `[reserved](#reserved())()` |  |
	| `char` | `[SP](#SP())()` |  |
	| `akka.parboiled2.CharPredicate` | `[special](#special())()` |  |
	| `akka.parboiled2.CharPredicate` | `[tchar](#tchar())()` |  |
	| `akka.parboiled2.CharPredicate` | `[unreserved](#unreserved())()` |  |
	| `akka.parboiled2.CharPredicate` | `[UPPER_ALPHA](#UPPER_ALPHA())()` |  |
	| `akka.parboiled2.CharPredicate` | `[VCHAR](#VCHAR())()` |  |
	| `akka.parboiled2.CharPredicate` | `[WSP](#WSP())()` |  |
	| `akka.parboiled2.CharPredicate` | `[WSPCRLF](#WSPCRLF())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CharacterClasses$](CharacterClasses$.html "class in akka.http.impl.model.parser") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CharacterClasses$
		
		
		
		```
		public CharacterClasses$()
		```

	- ### Method Detail
	
	
	
		- #### ALPHA
		
		
		
		```
		public akka.parboiled2.CharPredicate ALPHA()
		```
		- #### LOWER\_ALPHA
		
		
		
		```
		public akka.parboiled2.CharPredicate LOWER_ALPHA()
		```
		- #### UPPER\_ALPHA
		
		
		
		```
		public akka.parboiled2.CharPredicate UPPER_ALPHA()
		```
		- #### CR
		
		
		
		```
		public char CR()
		```
		- #### CTL
		
		
		
		```
		public akka.parboiled2.CharPredicate CTL()
		```
		- #### DIGIT
		
		
		
		```
		public akka.parboiled2.CharPredicate DIGIT()
		```
		- #### ALPHANUM
		
		
		
		```
		public akka.parboiled2.CharPredicate ALPHANUM()
		```
		- #### DQUOTE
		
		
		
		```
		public char DQUOTE()
		```
		- #### HEXDIG
		
		
		
		```
		public akka.parboiled2.CharPredicate HEXDIG()
		```
		- #### HTAB
		
		
		
		```
		public char HTAB()
		```
		- #### LF
		
		
		
		```
		public char LF()
		```
		- #### SP
		
		
		
		```
		public char SP()
		```
		- #### VCHAR
		
		
		
		```
		public akka.parboiled2.CharPredicate VCHAR()
		```
		- #### WSP
		
		
		
		```
		public akka.parboiled2.CharPredicate WSP()
		```
		- #### WSPCRLF
		
		
		
		```
		public akka.parboiled2.CharPredicate WSPCRLF()
		```
		- #### special
		
		
		
		```
		public akka.parboiled2.CharPredicate special()
		```
		- #### tchar
		
		
		
		```
		public akka.parboiled2.CharPredicate tchar()
		```
		- #### unreserved
		
		
		
		```
		public akka.parboiled2.CharPredicate unreserved()
		```
		- #### reserved
		
		
		
		```
		public akka.parboiled2.CharPredicate reserved()
		```
		- #### DIGIT04
		
		
		
		```
		public akka.parboiled2.CharPredicate DIGIT04()
		```
		- #### DIGIT05
		
		
		
		```
		public akka.parboiled2.CharPredicate DIGIT05()
		```
		- #### DIGIT19
		
		
		
		```
		public akka.parboiled2.CharPredicate DIGIT19()
		```
		- #### colonSlashEOI
		
		
		
		```
		public akka.parboiled2.CharPredicate colonSlashEOI()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CharacterClasses$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CharacterClasses$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/CharacterClasses$.html)*