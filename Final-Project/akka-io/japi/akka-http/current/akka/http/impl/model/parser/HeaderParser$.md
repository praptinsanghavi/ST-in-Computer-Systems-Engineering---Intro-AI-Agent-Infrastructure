---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser$.html
title: HeaderParser$
---

# HeaderParser$

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Class HeaderParser$

- java.lang.Object
- - akka.http.impl.model.parser.HeaderParser$

- ---

```
public class HeaderParser$
extends java.lang.Object
```

INTERNAL API.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HeaderParser$](HeaderParser$.html "class in akka.http.impl.model.parser")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HeaderParser$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HeaderParser.Settings](HeaderParser.Settings.html "class in akka.http.impl.model.parser")` | `[DefaultSettings](#DefaultSettings())()` |  |
	| `java.lang.Object` | `[dispatch](#dispatch())()` |  |
	| `scala.Option<scala.Function1<java.lang.String,​[HeaderParser.Result](HeaderParser.Result.html "interface in akka.http.impl.model.parser")>>` | `[lookupParser](#lookupParser(java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings))​(java.lang.String headerName,  [HeaderParser.Settings](HeaderParser.Settings.html "class in akka.http.impl.model.parser") settings)` |  |
	| `[HeaderParser.Result](HeaderParser.Result.html "interface in akka.http.impl.model.parser")` | `[parseFull](#parseFull(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings))​(java.lang.String headerName,  java.lang.String value,  [HeaderParser.Settings](HeaderParser.Settings.html "class in akka.http.impl.model.parser") settings)` |  |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[ruleNames](#ruleNames())()` |  |
	| `[HeaderParser.Settings](HeaderParser.Settings.html "class in akka.http.impl.model.parser")` | `[Settings](#Settings(akka.http.scaladsl.model.Uri.ParsingMode,akka.http.scaladsl.settings.ParserSettings.CookieParsingMode,scala.Function2,int,akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode,akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode))​([Uri.ParsingMode](../../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode,  [ParserSettings.CookieParsingMode](../../../scaladsl/settings/ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings") cookieParsingMode,  scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>> customMediaTypes,  int maxCommentParsingDepth,  [ParserSettings.IllegalResponseHeaderValueProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings") modeValue,  [ParserSettings.IllegalResponseHeaderNameProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings") modeName)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HeaderParser$](HeaderParser$.html "class in akka.http.impl.model.parser") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HeaderParser$
		
		
		
		```
		public HeaderParser$()
		```

	- ### Method Detail
	
	
	
		- #### lookupParser
		
		
		
		```
		public scala.Option<scala.Function1<java.lang.String,​[HeaderParser.Result](HeaderParser.Result.html "interface in akka.http.impl.model.parser")>> lookupParser​(java.lang.String headerName,
		                                                                                              [HeaderParser.Settings](HeaderParser.Settings.html "class in akka.http.impl.model.parser") settings)
		```
		- #### parseFull
		
		
		
		```
		public [HeaderParser.Result](HeaderParser.Result.html "interface in akka.http.impl.model.parser") parseFull​(java.lang.String headerName,
		                                     java.lang.String value,
		                                     [HeaderParser.Settings](HeaderParser.Settings.html "class in akka.http.impl.model.parser") settings)
		```
		- #### dispatch
		
		
		
		```
		public java.lang.Object dispatch()
		```
		- #### ruleNames
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> ruleNames()
		```
		- #### Settings
		
		
		
		```
		public [HeaderParser.Settings](HeaderParser.Settings.html "class in akka.http.impl.model.parser") Settings​([Uri.ParsingMode](../../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode,
		                                      [ParserSettings.CookieParsingMode](../../../scaladsl/settings/ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings") cookieParsingMode,
		                                      scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>> customMediaTypes,
		                                      int maxCommentParsingDepth,
		                                      [ParserSettings.IllegalResponseHeaderValueProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings") modeValue,
		                                      [ParserSettings.IllegalResponseHeaderNameProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings") modeName)
		```
		- #### DefaultSettings
		
		
		
		```
		public [HeaderParser.Settings](HeaderParser.Settings.html "class in akka.http.impl.model.parser") DefaultSettings()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.Result.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.CookieParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser$.html)*