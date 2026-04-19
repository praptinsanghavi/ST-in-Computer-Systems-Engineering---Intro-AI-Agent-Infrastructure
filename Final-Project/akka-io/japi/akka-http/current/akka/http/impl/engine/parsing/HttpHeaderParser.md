---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.Settings.html
title: HttpHeaderParser.Settings
---

# HttpHeaderParser.Settings

## Content

Package [akka.http.impl.engine.parsing](package-summary.html)
## Class HttpHeaderParser.Settings

- java.lang.Object
- - [akka.http.impl.model.parser.HeaderParser.Settings](../../model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")
	- - akka.http.impl.engine.parsing.HttpHeaderParser.Settings

- Direct Known Subclasses:
`[BodyPartParser.Settings](BodyPartParser.Settings.html "class in akka.http.impl.engine.parsing")`

Enclosing class:
[HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing")

---

```
public abstract static class HttpHeaderParser.Settings
extends [HeaderParser.Settings](../../model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Settings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>>` | `[customMediaTypes](#customMediaTypes())()` |  |
	| `abstract [ParserSettings.ErrorLoggingVerbosity](../../../scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings")` | `[errorLoggingVerbosity](#errorLoggingVerbosity())()` |  |
	| `abstract int` | `[headerValueCacheLimit](#headerValueCacheLimit(java.lang.String))​(java.lang.String headerName)` |  |
	| `abstract scala.collection.immutable.Set<java.lang.String>` | `[ignoreIllegalHeaderFor](#ignoreIllegalHeaderFor())()` |  |
	| `abstract boolean` | `[illegalHeaderWarnings](#illegalHeaderWarnings())()` |  |
	| `abstract [ParserSettings.IllegalResponseHeaderNameProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[illegalResponseHeaderNameProcessingMode](#illegalResponseHeaderNameProcessingMode())()` |  |
	| `abstract [ParserSettings.IllegalResponseHeaderValueProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[illegalResponseHeaderValueProcessingMode](#illegalResponseHeaderValueProcessingMode())()` |  |
	| `abstract int` | `[maxHeaderNameLength](#maxHeaderNameLength())()` |  |
	| `abstract int` | `[maxHeaderValueLength](#maxHeaderValueLength())()` |  |
	| `abstract boolean` | `[modeledHeaderParsing](#modeledHeaderParsing())()` |  |
	
	
		- ### Methods inherited from class akka.http.impl.model.parser.[HeaderParser.Settings](../../model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")
		
		
		`[cookieParsingMode](../../model/parser/HeaderParser.Settings.html#cookieParsingMode()), [maxCommentParsingDepth](../../model/parser/HeaderParser.Settings.html#maxCommentParsingDepth()), [uriParsingMode](../../model/parser/HeaderParser.Settings.html#uriParsingMode())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Settings
		
		
		
		```
		public Settings()
		```

	- ### Method Detail
	
	
	
		- #### customMediaTypes
		
		
		
		```
		public abstract scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>> customMediaTypes()
		```
		
		
		Specified by:
		`[customMediaTypes](../../model/parser/HeaderParser.Settings.html#customMediaTypes())` in class `[HeaderParser.Settings](../../model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")`
		- #### errorLoggingVerbosity
		
		
		
		```
		public abstract [ParserSettings.ErrorLoggingVerbosity](../../../scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings") errorLoggingVerbosity()
		```
		- #### headerValueCacheLimit
		
		
		
		```
		public abstract int headerValueCacheLimit​(java.lang.String headerName)
		```
		- #### ignoreIllegalHeaderFor
		
		
		
		```
		public abstract scala.collection.immutable.Set<java.lang.String> ignoreIllegalHeaderFor()
		```
		- #### illegalHeaderWarnings
		
		
		
		```
		public abstract boolean illegalHeaderWarnings()
		```
		- #### illegalResponseHeaderNameProcessingMode
		
		
		
		```
		public abstract [ParserSettings.IllegalResponseHeaderNameProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderNameProcessingMode()
		```
		
		
		Specified by:
		`[illegalResponseHeaderNameProcessingMode](../../model/parser/HeaderParser.Settings.html#illegalResponseHeaderNameProcessingMode())` in class `[HeaderParser.Settings](../../model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")`
		- #### illegalResponseHeaderValueProcessingMode
		
		
		
		```
		public abstract [ParserSettings.IllegalResponseHeaderValueProcessingMode](../../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderValueProcessingMode()
		```
		
		
		Specified by:
		`[illegalResponseHeaderValueProcessingMode](../../model/parser/HeaderParser.Settings.html#illegalResponseHeaderValueProcessingMode())` in class `[HeaderParser.Settings](../../model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")`
		- #### maxHeaderNameLength
		
		
		
		```
		public abstract int maxHeaderNameLength()
		```
		- #### maxHeaderValueLength
		
		
		
		```
		public abstract int maxHeaderValueLength()
		```
		- #### modeledHeaderParsing
		
		
		
		```
		public abstract boolean modeledHeaderParsing()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.Settings.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.Settings.html)*