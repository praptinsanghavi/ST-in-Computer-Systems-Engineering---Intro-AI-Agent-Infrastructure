---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
title: ParserSettings
---

# ParserSettings

## Content

Package [akka.http.scaladsl.settings](package-summary.html)
## Class ParserSettings

- java.lang.Object
- - [akka.http.impl.model.parser.HeaderParser.Settings](../../impl/model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")
	- - [akka.http.impl.engine.parsing.HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")
		- - [akka.http.impl.engine.parsing.BodyPartParser.Settings](../../impl/engine/parsing/BodyPartParser.Settings.html "class in akka.http.impl.engine.parsing")
			- - [akka.http.javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")
				- - akka.http.scaladsl.settings.ParserSettings

- Direct Known Subclasses:
`[ParserSettingsImpl](../../impl/settings/ParserSettingsImpl.html "class in akka.http.impl.settings")`

---

```
public abstract class ParserSettings
extends [ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")
```

Public API but not intended for subclassing

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[ParserSettings.ConflictingContentTypeHeaderProcessingMode](ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings")` |  |
	| `static class` | `[ParserSettings.ConflictingContentTypeHeaderProcessingMode$](ParserSettings.ConflictingContentTypeHeaderProcessingMode$.html "class in akka.http.scaladsl.settings")` |  |
	| `static interface` | `[ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings")` |  |
	| `static class` | `[ParserSettings.CookieParsingMode$](ParserSettings.CookieParsingMode$.html "class in akka.http.scaladsl.settings")` |  |
	| `static interface` | `[ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings")` |  |
	| `static class` | `[ParserSettings.ErrorLoggingVerbosity$](ParserSettings.ErrorLoggingVerbosity$.html "class in akka.http.scaladsl.settings")` |  |
	| `static interface` | `[ParserSettings.IllegalResponseHeaderNameProcessingMode](ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings")` |  |
	| `static class` | `[ParserSettings.IllegalResponseHeaderNameProcessingMode$](ParserSettings.IllegalResponseHeaderNameProcessingMode$.html "class in akka.http.scaladsl.settings")` |  |
	| `static interface` | `[ParserSettings.IllegalResponseHeaderValueProcessingMode](ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings")` |  |
	| `static class` | `[ParserSettings.IllegalResponseHeaderValueProcessingMode$](ParserSettings.IllegalResponseHeaderValueProcessingMode$.html "class in akka.http.scaladsl.settings")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ParserSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use forServer or forClient instead. |
	| `static [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` | Deprecated. Use forServer or forClient instead. |
	| `abstract [ParserSettings.ConflictingContentTypeHeaderProcessingMode](ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[conflictingContentTypeHeaderProcessingMode](#conflictingContentTypeHeaderProcessingMode())()` |  |
	| `abstract [ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings")` | `[cookieParsingMode](#cookieParsingMode())()` |  |
	| `abstract scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../model/MediaType.html "class in akka.http.scaladsl.model")>>` | `[customMediaTypes](#customMediaTypes())()` |  |
	| `abstract scala.Function1<java.lang.String,​scala.Option<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model")>>` | `[customMethods](#customMethods())()` |  |
	| `abstract scala.Function1<java.lang.Object,​scala.Option<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")>>` | `[customStatusCodes](#customStatusCodes())()` |  |
	| `abstract [ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings")` | `[errorLoggingVerbosity](#errorLoggingVerbosity())()` |  |
	| `static [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[forClient](#forClient(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `static [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[forServer](#forServer(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `[ParserSettings.ConflictingContentTypeHeaderProcessingMode](ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[getConflictingContentTypeHeaderProcessingMode](#getConflictingContentTypeHeaderProcessingMode())()` |  |
	| `[ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings")` | `[getCookieParsingMode](#getCookieParsingMode())()` |  |
	| `java.lang.Object` | `[getCustomMediaTypes](#getCustomMediaTypes())()` |  |
	| `java.lang.Object` | `[getCustomMethods](#getCustomMethods())()` |  |
	| `java.lang.Object` | `[getCustomStatusCodes](#getCustomStatusCodes())()` |  |
	| `[ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings")` | `[getErrorLoggingVerbosity](#getErrorLoggingVerbosity())()` |  |
	| `java.util.Map<java.lang.String,​java.lang.Object>` | `[getHeaderValueCacheLimits](#getHeaderValueCacheLimits())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[getIgnoreIllegalHeaderFor](#getIgnoreIllegalHeaderFor())()` |  |
	| `boolean` | `[getIllegalHeaderWarnings](#getIllegalHeaderWarnings())()` |  |
	| `[ParserSettings.IllegalResponseHeaderNameProcessingMode](ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[getIllegalResponseHeaderNameProcessingMode](#getIllegalResponseHeaderNameProcessingMode())()` |  |
	| `[ParserSettings.IllegalResponseHeaderValueProcessingMode](ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[getIllegalResponseHeaderValueProcessingMode](#getIllegalResponseHeaderValueProcessingMode())()` |  |
	| `boolean` | `[getIncludeSslSessionAttribute](#getIncludeSslSessionAttribute())()` |  |
	| `boolean` | `[getIncludeTlsSessionInfoHeader](#getIncludeTlsSessionInfoHeader())()` |  |
	| `int` | `[getMaxChunkExtLength](#getMaxChunkExtLength())()` |  |
	| `int` | `[getMaxChunkSize](#getMaxChunkSize())()` |  |
	| `int` | `[getMaxCommentParsingDepth](#getMaxCommentParsingDepth())()` |  |
	| `long` | `[getMaxContentLength](#getMaxContentLength())()` |  |
	| `int` | `[getMaxHeaderCount](#getMaxHeaderCount())()` |  |
	| `int` | `[getMaxHeaderNameLength](#getMaxHeaderNameLength())()` |  |
	| `int` | `[getMaxHeaderValueLength](#getMaxHeaderValueLength())()` |  |
	| `int` | `[getMaxMethodLength](#getMaxMethodLength())()` |  |
	| `int` | `[getMaxResponseReasonLength](#getMaxResponseReasonLength())()` |  |
	| `long` | `[getMaxToStrictBytes](#getMaxToStrictBytes())()` |  |
	| `int` | `[getMaxUriLength](#getMaxUriLength())()` |  |
	| `boolean` | `[getModeledHeaderParsing](#getModeledHeaderParsing())()` |  |
	| `[Uri.ParsingMode](../../javadsl/model/Uri.ParsingMode.html "interface in akka.http.javadsl.model")` | `[getUriParsingMode](#getUriParsingMode())()` |  |
	| `abstract scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[headerValueCacheLimits](#headerValueCacheLimits())()` |  |
	| `abstract scala.collection.immutable.Set<java.lang.String>` | `[ignoreIllegalHeaderFor](#ignoreIllegalHeaderFor())()` |  |
	| `abstract boolean` | `[illegalHeaderWarnings](#illegalHeaderWarnings())()` |  |
	| `abstract [ParserSettings.IllegalResponseHeaderNameProcessingMode](ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[illegalResponseHeaderNameProcessingMode](#illegalResponseHeaderNameProcessingMode())()` |  |
	| `abstract [ParserSettings.IllegalResponseHeaderValueProcessingMode](ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[illegalResponseHeaderValueProcessingMode](#illegalResponseHeaderValueProcessingMode())()` |  |
	| `abstract boolean` | `[includeSslSessionAttribute](#includeSslSessionAttribute())()` |  |
	| `abstract boolean` | `[includeTlsSessionInfoHeader](#includeTlsSessionInfoHeader())()` |  |
	| `abstract int` | `[maxChunkExtLength](#maxChunkExtLength())()` |  |
	| `abstract int` | `[maxChunkSize](#maxChunkSize())()` |  |
	| `abstract int` | `[maxCommentParsingDepth](#maxCommentParsingDepth())()` |  |
	| `abstract long` | `[maxContentLength](#maxContentLength())()` |  |
	| `abstract int` | `[maxHeaderCount](#maxHeaderCount())()` |  |
	| `abstract int` | `[maxHeaderNameLength](#maxHeaderNameLength())()` |  |
	| `abstract int` | `[maxHeaderValueLength](#maxHeaderValueLength())()` |  |
	| `abstract int` | `[maxMethodLength](#maxMethodLength())()` |  |
	| `abstract int` | `[maxResponseReasonLength](#maxResponseReasonLength())()` |  |
	| `abstract long` | `[maxToStrictBytes](#maxToStrictBytes())()` |  |
	| `abstract int` | `[maxUriLength](#maxUriLength())()` |  |
	| `abstract boolean` | `[modeledHeaderParsing](#modeledHeaderParsing())()` |  |
	| `abstract [Uri.ParsingMode](../model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model")` | `[uriParsingMode](#uriParsingMode())()` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withConflictingContentTypeHeaderProcessingMode](#withConflictingContentTypeHeaderProcessingMode(akka.http.scaladsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode))​([ParserSettings.ConflictingContentTypeHeaderProcessingMode](ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings") newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withCookieParsingMode](#withCookieParsingMode(akka.http.scaladsl.settings.ParserSettings.CookieParsingMode))​([ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings") newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withCustomMediaTypes](#withCustomMediaTypes(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[MediaType](../model/MediaType.html "class in akka.http.scaladsl.model")> types)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withCustomMethods](#withCustomMethods(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model")> methods)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withCustomStatusCodes](#withCustomStatusCodes(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")> codes)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withErrorLoggingVerbosity](#withErrorLoggingVerbosity(akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity))​([ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings") newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withHeaderValueCacheLimits](#withHeaderValueCacheLimits(scala.collection.immutable.Map))​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withIgnoreIllegalHeaderFor](#withIgnoreIllegalHeaderFor(scala.collection.immutable.List))​(scala.collection.immutable.List<java.lang.String> newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withIllegalHeaderWarnings](#withIllegalHeaderWarnings(boolean))​(boolean newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withIllegalResponseHeaderNameProcessingMode](#withIllegalResponseHeaderNameProcessingMode(akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode))​([ParserSettings.IllegalResponseHeaderNameProcessingMode](ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings") newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withIllegalResponseHeaderValueProcessingMode](#withIllegalResponseHeaderValueProcessingMode(akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode))​([ParserSettings.IllegalResponseHeaderValueProcessingMode](ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings") newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withIncludeSslSessionAttribute](#withIncludeSslSessionAttribute(boolean))​(boolean newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withIncludeTlsSessionInfoHeader](#withIncludeTlsSessionInfoHeader(boolean))​(boolean newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxChunkExtLength](#withMaxChunkExtLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxChunkSize](#withMaxChunkSize(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxCommentParsingDepth](#withMaxCommentParsingDepth(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxContentLength](#withMaxContentLength(long))​(long newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxContentLength](#withMaxContentLength(scala.Option))​(scala.Option<java.lang.Object> newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxHeaderCount](#withMaxHeaderCount(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxHeaderNameLength](#withMaxHeaderNameLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxHeaderValueLength](#withMaxHeaderValueLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxMethodLength](#withMaxMethodLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxResponseReasonLength](#withMaxResponseReasonLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxToStrictBytes](#withMaxToStrictBytes(long))​(long newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withMaxUriLength](#withMaxUriLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withModeledHeaderParsing](#withModeledHeaderParsing(boolean))​(boolean newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings")` | `[withUriParsingMode](#withUriParsingMode(akka.http.scaladsl.model.Uri.ParsingMode))​([Uri.ParsingMode](../model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") newValue)` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.settings.[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")
		
		
		`[create](../../javadsl/settings/ParserSettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/ParserSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/ParserSettings.html#create(java.lang.String)), [withCookieParsingMode](../../javadsl/settings/ParserSettings.html#withCookieParsingMode(akka.http.javadsl.settings.ParserSettings.CookieParsingMode)), [withCustomMediaTypes](../../javadsl/settings/ParserSettings.html#withCustomMediaTypes(akka.http.javadsl.model.MediaType...)), [withCustomMediaTypes](../../javadsl/settings/ParserSettings.html#withCustomMediaTypes(scala.collection.immutable.Seq)), [withCustomMethods](../../javadsl/settings/ParserSettings.html#withCustomMethods(akka.http.javadsl.model.HttpMethod...)), [withCustomMethods](../../javadsl/settings/ParserSettings.html#withCustomMethods(scala.collection.immutable.Seq)), [withCustomStatusCodes](../../javadsl/settings/ParserSettings.html#withCustomStatusCodes(akka.http.javadsl.model.StatusCode...)), [withCustomStatusCodes](../../javadsl/settings/ParserSettings.html#withCustomStatusCodes(scala.collection.immutable.Seq)), [withErrorLoggingVerbosity](../../javadsl/settings/ParserSettings.html#withErrorLoggingVerbosity(akka.http.javadsl.settings.ParserSettings.ErrorLoggingVerbosity)), [withHeaderValueCacheLimits](../../javadsl/settings/ParserSettings.html#withHeaderValueCacheLimits(java.util.Map)), [withUriParsingMode](../../javadsl/settings/ParserSettings.html#withUriParsingMode(akka.http.javadsl.model.Uri.ParsingMode))`
		- ### Methods inherited from class akka.http.impl.engine.parsing.[BodyPartParser.Settings](../../impl/engine/parsing/BodyPartParser.Settings.html "class in akka.http.impl.engine.parsing")
		
		
		`[defaultHeaderValueCacheLimit](../../impl/engine/parsing/BodyPartParser.Settings.html#defaultHeaderValueCacheLimit())`
		- ### Methods inherited from class akka.http.impl.engine.parsing.[HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")
		
		
		`[headerValueCacheLimit](../../impl/engine/parsing/HttpHeaderParser.Settings.html#headerValueCacheLimit(java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ParserSettings
		
		
		
		```
		public ParserSettings()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") apply​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use forServer or forClient instead. Since 10\.2\.0\.
		- #### apply
		
		
		
		```
		public static [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") apply​(java.lang.String configOverrides)
		```
		
		Deprecated.
		Use forServer or forClient instead. Since 10\.2\.0\.
		- #### forServer
		
		
		
		```
		public static [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") forServer​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### forClient
		
		
		
		```
		public static [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") forClient​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### maxUriLength
		
		
		
		```
		public abstract int maxUriLength()
		```
		- #### maxMethodLength
		
		
		
		```
		public abstract int maxMethodLength()
		```
		- #### maxResponseReasonLength
		
		
		
		```
		public abstract int maxResponseReasonLength()
		```
		- #### maxHeaderNameLength
		
		
		
		```
		public abstract int maxHeaderNameLength()
		```
		
		
		Specified by:
		`[maxHeaderNameLength](../../impl/engine/parsing/HttpHeaderParser.Settings.html#maxHeaderNameLength())` in class `[HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### maxHeaderValueLength
		
		
		
		```
		public abstract int maxHeaderValueLength()
		```
		
		
		Specified by:
		`[maxHeaderValueLength](../../impl/engine/parsing/HttpHeaderParser.Settings.html#maxHeaderValueLength())` in class `[HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### maxHeaderCount
		
		
		
		```
		public abstract int maxHeaderCount()
		```
		
		
		Specified by:
		`[maxHeaderCount](../../impl/engine/parsing/BodyPartParser.Settings.html#maxHeaderCount())` in class `[BodyPartParser.Settings](../../impl/engine/parsing/BodyPartParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### maxContentLength
		
		
		
		```
		public abstract long maxContentLength()
		```
		- #### maxToStrictBytes
		
		
		
		```
		public abstract long maxToStrictBytes()
		```
		- #### maxChunkExtLength
		
		
		
		```
		public abstract int maxChunkExtLength()
		```
		- #### maxChunkSize
		
		
		
		```
		public abstract int maxChunkSize()
		```
		- #### maxCommentParsingDepth
		
		
		
		```
		public abstract int maxCommentParsingDepth()
		```
		
		
		Specified by:
		`[maxCommentParsingDepth](../../impl/model/parser/HeaderParser.Settings.html#maxCommentParsingDepth())` in class `[HeaderParser.Settings](../../impl/model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")`
		- #### uriParsingMode
		
		
		
		```
		public abstract [Uri.ParsingMode](../model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode()
		```
		
		
		Specified by:
		`[uriParsingMode](../../impl/model/parser/HeaderParser.Settings.html#uriParsingMode())` in class `[HeaderParser.Settings](../../impl/model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")`
		- #### cookieParsingMode
		
		
		
		```
		public abstract [ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings") cookieParsingMode()
		```
		
		
		Specified by:
		`[cookieParsingMode](../../impl/model/parser/HeaderParser.Settings.html#cookieParsingMode())` in class `[HeaderParser.Settings](../../impl/model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")`
		- #### illegalHeaderWarnings
		
		
		
		```
		public abstract boolean illegalHeaderWarnings()
		```
		
		
		Specified by:
		`[illegalHeaderWarnings](../../impl/engine/parsing/BodyPartParser.Settings.html#illegalHeaderWarnings())` in class `[BodyPartParser.Settings](../../impl/engine/parsing/BodyPartParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### ignoreIllegalHeaderFor
		
		
		
		```
		public abstract scala.collection.immutable.Set<java.lang.String> ignoreIllegalHeaderFor()
		```
		
		
		Specified by:
		`[ignoreIllegalHeaderFor](../../impl/engine/parsing/HttpHeaderParser.Settings.html#ignoreIllegalHeaderFor())` in class `[HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### errorLoggingVerbosity
		
		
		
		```
		public abstract [ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings") errorLoggingVerbosity()
		```
		
		
		Specified by:
		`[errorLoggingVerbosity](../../impl/engine/parsing/HttpHeaderParser.Settings.html#errorLoggingVerbosity())` in class `[HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### illegalResponseHeaderNameProcessingMode
		
		
		
		```
		public abstract [ParserSettings.IllegalResponseHeaderNameProcessingMode](ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderNameProcessingMode()
		```
		
		
		Specified by:
		`[illegalResponseHeaderNameProcessingMode](../../impl/engine/parsing/HttpHeaderParser.Settings.html#illegalResponseHeaderNameProcessingMode())` in class `[HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### illegalResponseHeaderValueProcessingMode
		
		
		
		```
		public abstract [ParserSettings.IllegalResponseHeaderValueProcessingMode](ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderValueProcessingMode()
		```
		
		
		Specified by:
		`[illegalResponseHeaderValueProcessingMode](../../impl/engine/parsing/HttpHeaderParser.Settings.html#illegalResponseHeaderValueProcessingMode())` in class `[HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### conflictingContentTypeHeaderProcessingMode
		
		
		
		```
		public abstract [ParserSettings.ConflictingContentTypeHeaderProcessingMode](ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings") conflictingContentTypeHeaderProcessingMode()
		```
		- #### headerValueCacheLimits
		
		
		
		```
		public abstract scala.collection.immutable.Map<java.lang.String,​java.lang.Object> headerValueCacheLimits()
		```
		
		
		Specified by:
		`[headerValueCacheLimits](../../javadsl/settings/ParserSettings.html#headerValueCacheLimits())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### includeTlsSessionInfoHeader
		
		
		
		```
		public abstract boolean includeTlsSessionInfoHeader()
		```
		- #### includeSslSessionAttribute
		
		
		
		```
		public abstract boolean includeSslSessionAttribute()
		```
		- #### customMethods
		
		
		
		```
		public abstract scala.Function1<java.lang.String,​scala.Option<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model")>> customMethods()
		```
		- #### customStatusCodes
		
		
		
		```
		public abstract scala.Function1<java.lang.Object,​scala.Option<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")>> customStatusCodes()
		```
		- #### customMediaTypes
		
		
		
		```
		public abstract scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../model/MediaType.html "class in akka.http.scaladsl.model")>> customMediaTypes()
		```
		
		
		Specified by:
		`[customMediaTypes](../../impl/engine/parsing/HttpHeaderParser.Settings.html#customMediaTypes())` in class `[HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### modeledHeaderParsing
		
		
		
		```
		public abstract boolean modeledHeaderParsing()
		```
		
		
		Specified by:
		`[modeledHeaderParsing](../../impl/engine/parsing/HttpHeaderParser.Settings.html#modeledHeaderParsing())` in class `[HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### getCookieParsingMode
		
		
		
		```
		public [ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings") getCookieParsingMode()
		```
		
		
		Specified by:
		`[getCookieParsingMode](../../javadsl/settings/ParserSettings.html#getCookieParsingMode())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getHeaderValueCacheLimits
		
		
		
		```
		public java.util.Map<java.lang.String,​java.lang.Object> getHeaderValueCacheLimits()
		```
		
		
		Specified by:
		`[getHeaderValueCacheLimits](../../javadsl/settings/ParserSettings.html#getHeaderValueCacheLimits())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getMaxChunkExtLength
		
		
		
		```
		public int getMaxChunkExtLength()
		```
		
		
		Specified by:
		`[getMaxChunkExtLength](../../javadsl/settings/ParserSettings.html#getMaxChunkExtLength())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getUriParsingMode
		
		
		
		```
		public [Uri.ParsingMode](../../javadsl/model/Uri.ParsingMode.html "interface in akka.http.javadsl.model") getUriParsingMode()
		```
		
		
		Specified by:
		`[getUriParsingMode](../../javadsl/settings/ParserSettings.html#getUriParsingMode())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getMaxHeaderCount
		
		
		
		```
		public int getMaxHeaderCount()
		```
		
		
		Specified by:
		`[getMaxHeaderCount](../../javadsl/settings/ParserSettings.html#getMaxHeaderCount())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getMaxContentLength
		
		
		
		```
		public long getMaxContentLength()
		```
		
		
		Specified by:
		`[getMaxContentLength](../../javadsl/settings/ParserSettings.html#getMaxContentLength())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getMaxToStrictBytes
		
		
		
		```
		public long getMaxToStrictBytes()
		```
		
		
		Specified by:
		`[getMaxToStrictBytes](../../javadsl/settings/ParserSettings.html#getMaxToStrictBytes())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getMaxHeaderValueLength
		
		
		
		```
		public int getMaxHeaderValueLength()
		```
		
		
		Specified by:
		`[getMaxHeaderValueLength](../../javadsl/settings/ParserSettings.html#getMaxHeaderValueLength())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getIncludeTlsSessionInfoHeader
		
		
		
		```
		public boolean getIncludeTlsSessionInfoHeader()
		```
		
		
		Specified by:
		`[getIncludeTlsSessionInfoHeader](../../javadsl/settings/ParserSettings.html#getIncludeTlsSessionInfoHeader())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getIncludeSslSessionAttribute
		
		
		
		```
		public boolean getIncludeSslSessionAttribute()
		```
		
		
		Specified by:
		`[getIncludeSslSessionAttribute](../../javadsl/settings/ParserSettings.html#getIncludeSslSessionAttribute())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getIllegalHeaderWarnings
		
		
		
		```
		public boolean getIllegalHeaderWarnings()
		```
		
		
		Specified by:
		`[getIllegalHeaderWarnings](../../javadsl/settings/ParserSettings.html#getIllegalHeaderWarnings())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getIgnoreIllegalHeaderFor
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> getIgnoreIllegalHeaderFor()
		```
		
		
		Specified by:
		`[getIgnoreIllegalHeaderFor](../../javadsl/settings/ParserSettings.html#getIgnoreIllegalHeaderFor())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getMaxHeaderNameLength
		
		
		
		```
		public int getMaxHeaderNameLength()
		```
		
		
		Specified by:
		`[getMaxHeaderNameLength](../../javadsl/settings/ParserSettings.html#getMaxHeaderNameLength())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getMaxChunkSize
		
		
		
		```
		public int getMaxChunkSize()
		```
		
		
		Specified by:
		`[getMaxChunkSize](../../javadsl/settings/ParserSettings.html#getMaxChunkSize())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getMaxResponseReasonLength
		
		
		
		```
		public int getMaxResponseReasonLength()
		```
		
		
		Specified by:
		`[getMaxResponseReasonLength](../../javadsl/settings/ParserSettings.html#getMaxResponseReasonLength())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getMaxUriLength
		
		
		
		```
		public int getMaxUriLength()
		```
		
		
		Specified by:
		`[getMaxUriLength](../../javadsl/settings/ParserSettings.html#getMaxUriLength())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getMaxMethodLength
		
		
		
		```
		public int getMaxMethodLength()
		```
		
		
		Specified by:
		`[getMaxMethodLength](../../javadsl/settings/ParserSettings.html#getMaxMethodLength())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getMaxCommentParsingDepth
		
		
		
		```
		public int getMaxCommentParsingDepth()
		```
		
		
		Specified by:
		`[getMaxCommentParsingDepth](../../javadsl/settings/ParserSettings.html#getMaxCommentParsingDepth())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getErrorLoggingVerbosity
		
		
		
		```
		public [ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings") getErrorLoggingVerbosity()
		```
		
		
		Specified by:
		`[getErrorLoggingVerbosity](../../javadsl/settings/ParserSettings.html#getErrorLoggingVerbosity())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getIllegalResponseHeaderNameProcessingMode
		
		
		
		```
		public [ParserSettings.IllegalResponseHeaderNameProcessingMode](ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings") getIllegalResponseHeaderNameProcessingMode()
		```
		
		
		Specified by:
		`[getIllegalResponseHeaderNameProcessingMode](../../javadsl/settings/ParserSettings.html#getIllegalResponseHeaderNameProcessingMode())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getIllegalResponseHeaderValueProcessingMode
		
		
		
		```
		public [ParserSettings.IllegalResponseHeaderValueProcessingMode](ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings") getIllegalResponseHeaderValueProcessingMode()
		```
		
		
		Specified by:
		`[getIllegalResponseHeaderValueProcessingMode](../../javadsl/settings/ParserSettings.html#getIllegalResponseHeaderValueProcessingMode())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getConflictingContentTypeHeaderProcessingMode
		
		
		
		```
		public [ParserSettings.ConflictingContentTypeHeaderProcessingMode](ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings") getConflictingContentTypeHeaderProcessingMode()
		```
		
		
		Specified by:
		`[getConflictingContentTypeHeaderProcessingMode](../../javadsl/settings/ParserSettings.html#getConflictingContentTypeHeaderProcessingMode())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### getCustomMethods
		
		
		
		```
		public java.lang.Object getCustomMethods()
		```
		- #### getCustomStatusCodes
		
		
		
		```
		public java.lang.Object getCustomStatusCodes()
		```
		- #### getCustomMediaTypes
		
		
		
		```
		public java.lang.Object getCustomMediaTypes()
		```
		- #### getModeledHeaderParsing
		
		
		
		```
		public boolean getModeledHeaderParsing()
		```
		
		
		Specified by:
		`[getModeledHeaderParsing](../../javadsl/settings/ParserSettings.html#getModeledHeaderParsing())` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxUriLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxUriLength​(int newValue)
		```
		
		
		Overrides:
		`[withMaxUriLength](../../javadsl/settings/ParserSettings.html#withMaxUriLength(int))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxMethodLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxMethodLength​(int newValue)
		```
		
		
		Overrides:
		`[withMaxMethodLength](../../javadsl/settings/ParserSettings.html#withMaxMethodLength(int))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxResponseReasonLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxResponseReasonLength​(int newValue)
		```
		
		
		Overrides:
		`[withMaxResponseReasonLength](../../javadsl/settings/ParserSettings.html#withMaxResponseReasonLength(int))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxHeaderNameLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxHeaderNameLength​(int newValue)
		```
		
		
		Overrides:
		`[withMaxHeaderNameLength](../../javadsl/settings/ParserSettings.html#withMaxHeaderNameLength(int))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxHeaderValueLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxHeaderValueLength​(int newValue)
		```
		
		
		Overrides:
		`[withMaxHeaderValueLength](../../javadsl/settings/ParserSettings.html#withMaxHeaderValueLength(int))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxHeaderCount
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxHeaderCount​(int newValue)
		```
		
		
		Overrides:
		`[withMaxHeaderCount](../../javadsl/settings/ParserSettings.html#withMaxHeaderCount(int))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxContentLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxContentLength​(long newValue)
		```
		
		
		Overrides:
		`[withMaxContentLength](../../javadsl/settings/ParserSettings.html#withMaxContentLength(long))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxContentLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxContentLength​(scala.Option<java.lang.Object> newValue)
		```
		- #### withMaxToStrictBytes
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxToStrictBytes​(long newValue)
		```
		
		
		Overrides:
		`[withMaxToStrictBytes](../../javadsl/settings/ParserSettings.html#withMaxToStrictBytes(long))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxChunkExtLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxChunkExtLength​(int newValue)
		```
		
		
		Overrides:
		`[withMaxChunkExtLength](../../javadsl/settings/ParserSettings.html#withMaxChunkExtLength(int))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxChunkSize
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxChunkSize​(int newValue)
		```
		
		
		Overrides:
		`[withMaxChunkSize](../../javadsl/settings/ParserSettings.html#withMaxChunkSize(int))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withMaxCommentParsingDepth
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withMaxCommentParsingDepth​(int newValue)
		```
		
		
		Overrides:
		`[withMaxCommentParsingDepth](../../javadsl/settings/ParserSettings.html#withMaxCommentParsingDepth(int))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withIllegalHeaderWarnings
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withIllegalHeaderWarnings​(boolean newValue)
		```
		
		
		Overrides:
		`[withIllegalHeaderWarnings](../../javadsl/settings/ParserSettings.html#withIllegalHeaderWarnings(boolean))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withIncludeTlsSessionInfoHeader
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withIncludeTlsSessionInfoHeader​(boolean newValue)
		```
		
		
		Overrides:
		`[withIncludeTlsSessionInfoHeader](../../javadsl/settings/ParserSettings.html#withIncludeTlsSessionInfoHeader(boolean))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withIncludeSslSessionAttribute
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withIncludeSslSessionAttribute​(boolean newValue)
		```
		
		
		Overrides:
		`[withIncludeSslSessionAttribute](../../javadsl/settings/ParserSettings.html#withIncludeSslSessionAttribute(boolean))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withModeledHeaderParsing
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withModeledHeaderParsing​(boolean newValue)
		```
		
		
		Overrides:
		`[withModeledHeaderParsing](../../javadsl/settings/ParserSettings.html#withModeledHeaderParsing(boolean))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withIgnoreIllegalHeaderFor
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withIgnoreIllegalHeaderFor​(scala.collection.immutable.List<java.lang.String> newValue)
		```
		
		
		Overrides:
		`[withIgnoreIllegalHeaderFor](../../javadsl/settings/ParserSettings.html#withIgnoreIllegalHeaderFor(scala.collection.immutable.List))` in class `[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")`
		- #### withUriParsingMode
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withUriParsingMode​([Uri.ParsingMode](../model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") newValue)
		```
		- #### withCookieParsingMode
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withCookieParsingMode​([ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings") newValue)
		```
		- #### withErrorLoggingVerbosity
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withErrorLoggingVerbosity​([ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings") newValue)
		```
		- #### withHeaderValueCacheLimits
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withHeaderValueCacheLimits​(scala.collection.immutable.Map<java.lang.String,​java.lang.Object> newValue)
		```
		- #### withCustomMethods
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withCustomMethods​(scala.collection.immutable.Seq<[HttpMethod](../model/HttpMethod.html "class in akka.http.scaladsl.model")> methods)
		```
		- #### withCustomStatusCodes
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withCustomStatusCodes​(scala.collection.immutable.Seq<[StatusCode](../model/StatusCode.html "class in akka.http.scaladsl.model")> codes)
		```
		- #### withCustomMediaTypes
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withCustomMediaTypes​(scala.collection.immutable.Seq<[MediaType](../model/MediaType.html "class in akka.http.scaladsl.model")> types)
		```
		- #### withIllegalResponseHeaderNameProcessingMode
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withIllegalResponseHeaderNameProcessingMode​([ParserSettings.IllegalResponseHeaderNameProcessingMode](ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings") newValue)
		```
		- #### withIllegalResponseHeaderValueProcessingMode
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withIllegalResponseHeaderValueProcessingMode​([ParserSettings.IllegalResponseHeaderValueProcessingMode](ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings") newValue)
		```
		- #### withConflictingContentTypeHeaderProcessingMode
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.scaladsl.settings") withConflictingContentTypeHeaderProcessingMode​([ParserSettings.ConflictingContentTypeHeaderProcessingMode](ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings") newValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/parsing/BodyPartParser.Settings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/parsing/HttpHeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/model/parser/HeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/settings/ParserSettingsImpl.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.CookieParsingMode$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.CookieParsingMode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.ErrorLoggingVerbosity$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html)*