---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/model/parser/HeaderParser.Settings.html
title: HeaderParser.Settings
---

# HeaderParser.Settings

## Content

Package [akka.http.impl.model.parser](package-summary.html)
## Class HeaderParser.Settings

- java.lang.Object
- - akka.http.impl.model.parser.HeaderParser.Settings

- Direct Known Subclasses:
`[HttpHeaderParser.Settings](../../engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")`

Enclosing class:
[HeaderParser](HeaderParser.html "class in akka.http.impl.model.parser")

---

```
public abstract static class HeaderParser.Settings
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Settings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [ParserSettings.CookieParsingMode](../../../scaladsl/settings/ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings")` | `[cookieParsingMode](#cookieParsingMode())()` |  |
	| `abstract scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>>` | `[customMediaTypes](#customMediaTypes())()` |  |
	| `abstract [ParserSettings.IllegalResponseHeaderNameProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[illegalResponseHeaderNameProcessingMode](#illegalResponseHeaderNameProcessingMode())()` |  |
	| `abstract [ParserSettings.IllegalResponseHeaderValueProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[illegalResponseHeaderValueProcessingMode](#illegalResponseHeaderValueProcessingMode())()` |  |
	| `abstract int` | `[maxCommentParsingDepth](#maxCommentParsingDepth())()` |  |
	| `abstract [Uri.ParsingMode](../../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model")` | `[uriParsingMode](#uriParsingMode())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Settings
		
		
		
		```
		public Settings()
		```

	- ### Method Detail
	
	
	
		- #### cookieParsingMode
		
		
		
		```
		public abstract [ParserSettings.CookieParsingMode](../../../scaladsl/settings/ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings") cookieParsingMode()
		```
		- #### customMediaTypes
		
		
		
		```
		public abstract scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>> customMediaTypes()
		```
		- #### illegalResponseHeaderNameProcessingMode
		
		
		
		```
		public abstract [ParserSettings.IllegalResponseHeaderNameProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderNameProcessingMode()
		```
		- #### illegalResponseHeaderValueProcessingMode
		
		
		
		```
		public abstract [ParserSettings.IllegalResponseHeaderValueProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderValueProcessingMode()
		```
		- #### maxCommentParsingDepth
		
		
		
		```
		public abstract int maxCommentParsingDepth()
		```
		- #### uriParsingMode
		
		
		
		```
		public abstract [Uri.ParsingMode](../../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/parsing/HttpHeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/model/parser/HeaderParser.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/model/parser/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.CookieParsingMode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/model/parser/HeaderParser.Settings.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/model/parser/HeaderParser.Settings.html)*