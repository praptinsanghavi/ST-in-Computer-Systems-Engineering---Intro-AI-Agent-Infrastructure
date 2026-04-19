---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/parsing/BodyPartParser.Settings.html
title: BodyPartParser.Settings
---

# BodyPartParser.Settings

## Content

Package [akka.http.impl.engine.parsing](package-summary.html)
## Class BodyPartParser.Settings

- java.lang.Object
- - [akka.http.impl.model.parser.HeaderParser.Settings](../../model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")
	- - [akka.http.impl.engine.parsing.HttpHeaderParser.Settings](HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")
		- - akka.http.impl.engine.parsing.BodyPartParser.Settings

- Direct Known Subclasses:
`[ParserSettings](../../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`

Enclosing class:
[BodyPartParser](BodyPartParser.html "class in akka.http.impl.engine.parsing")

---

```
public abstract static class BodyPartParser.Settings
extends [HttpHeaderParser.Settings](HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Settings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract int` | `[defaultHeaderValueCacheLimit](#defaultHeaderValueCacheLimit())()` |  |
	| `abstract boolean` | `[illegalHeaderWarnings](#illegalHeaderWarnings())()` |  |
	| `abstract int` | `[maxHeaderCount](#maxHeaderCount())()` |  |
	
	
		- ### Methods inherited from class akka.http.impl.engine.parsing.[HttpHeaderParser.Settings](HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")
		
		
		`[customMediaTypes](HttpHeaderParser.Settings.html#customMediaTypes()), [errorLoggingVerbosity](HttpHeaderParser.Settings.html#errorLoggingVerbosity()), [headerValueCacheLimit](HttpHeaderParser.Settings.html#headerValueCacheLimit(java.lang.String)), [ignoreIllegalHeaderFor](HttpHeaderParser.Settings.html#ignoreIllegalHeaderFor()), [illegalResponseHeaderNameProcessingMode](HttpHeaderParser.Settings.html#illegalResponseHeaderNameProcessingMode()), [illegalResponseHeaderValueProcessingMode](HttpHeaderParser.Settings.html#illegalResponseHeaderValueProcessingMode()), [maxHeaderNameLength](HttpHeaderParser.Settings.html#maxHeaderNameLength()), [maxHeaderValueLength](HttpHeaderParser.Settings.html#maxHeaderValueLength()), [modeledHeaderParsing](HttpHeaderParser.Settings.html#modeledHeaderParsing())`
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
	
	
	
		- #### defaultHeaderValueCacheLimit
		
		
		
		```
		public abstract int defaultHeaderValueCacheLimit()
		```
		- #### illegalHeaderWarnings
		
		
		
		```
		public abstract boolean illegalHeaderWarnings()
		```
		
		
		Specified by:
		`[illegalHeaderWarnings](HttpHeaderParser.Settings.html#illegalHeaderWarnings())` in class `[HttpHeaderParser.Settings](HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### maxHeaderCount
		
		
		
		```
		public abstract int maxHeaderCount()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/parsing/BodyPartParser.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/parsing/HttpHeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/parsing/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/model/parser/HeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/parsing/BodyPartParser.Settings.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/parsing/BodyPartParser.Settings.html)*