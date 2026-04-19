---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/Base64Parsing$.html
title: Base64Parsing$
---

# Base64Parsing$

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Class Base64Parsing$

- java.lang.Object
- - akka.http.impl.model.parser.Base64Parsing$

- ---

```
public class Base64Parsing$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Base64Parsing$](Base64Parsing$.html "class in akka.http.impl.model.parser")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Base64Parsing$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<char[],​byte[]>` | `[base64UrlStringDecoder](#base64UrlStringDecoder())()` | as described in RFC4648 5\. \- https://tools.ietf.org/html/rfc4648\#section\-5 |
	| `akka.parboiled2.CharPredicate.MaskBased` | `[customAlphabet](#customAlphabet())()` |  |
	| `scala.Function1<char[],​byte[]>` | `[customBlockDecoder](#customBlockDecoder())()` |  |
	| `scala.Function1<char[],​byte[]>` | `[customStringDecoder](#customStringDecoder())()` |  |
	| `byte[]` | `[decodeBlock](#decodeBlock(akka.parboiled2.util.Base64,char%5B%5D))​(akka.parboiled2.util.Base64 codec,  char[] chars)` |  |
	| `byte[]` | `[decodeString](#decodeString(akka.parboiled2.util.Base64,char%5B%5D))​(akka.parboiled2.util.Base64 codec,  char[] chars)` |  |
	| `akka.parboiled2.CharPredicate.MaskBased` | `[rfc2045Alphabet](#rfc2045Alphabet())()` |  |
	| `scala.Function1<char[],​byte[]>` | `[rfc2045BlockDecoder](#rfc2045BlockDecoder())()` |  |
	| `scala.Function1<char[],​byte[]>` | `[rfc2045StringDecoder](#rfc2045StringDecoder())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Base64Parsing$](Base64Parsing$.html "class in akka.http.impl.model.parser") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Base64Parsing$
		
		
		
		```
		public Base64Parsing$()
		```

	- ### Method Detail
	
	
	
		- #### rfc2045Alphabet
		
		
		
		```
		public akka.parboiled2.CharPredicate.MaskBased rfc2045Alphabet()
		```
		- #### customAlphabet
		
		
		
		```
		public akka.parboiled2.CharPredicate.MaskBased customAlphabet()
		```
		- #### rfc2045StringDecoder
		
		
		
		```
		public scala.Function1<char[],​byte[]> rfc2045StringDecoder()
		```
		- #### customStringDecoder
		
		
		
		```
		public scala.Function1<char[],​byte[]> customStringDecoder()
		```
		- #### rfc2045BlockDecoder
		
		
		
		```
		public scala.Function1<char[],​byte[]> rfc2045BlockDecoder()
		```
		- #### customBlockDecoder
		
		
		
		```
		public scala.Function1<char[],​byte[]> customBlockDecoder()
		```
		- #### base64UrlStringDecoder
		
		
		
		```
		public scala.Function1<char[],​byte[]> base64UrlStringDecoder()
		```
		
		as described in RFC4648 5\. \- https://tools.ietf.org/html/rfc4648\#section\-5
		- #### decodeString
		
		
		
		```
		public byte[] decodeString​(akka.parboiled2.util.Base64 codec,
		                           char[] chars)
		```
		- #### decodeBlock
		
		
		
		```
		public byte[] decodeBlock​(akka.parboiled2.util.Base64 codec,
		                          char[] chars)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/Base64Parsing$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/Base64Parsing$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/Base64Parsing$.html)*