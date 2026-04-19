---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
title: ParserSettings
---

# ParserSettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Class ParserSettings

- java.lang.Object
- - [akka.http.impl.model.parser.HeaderParser.Settings](../../impl/model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")
	- - [akka.http.impl.engine.parsing.HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")
		- - [akka.http.impl.engine.parsing.BodyPartParser.Settings](../../impl/engine/parsing/BodyPartParser.Settings.html "class in akka.http.impl.engine.parsing")
			- - akka.http.javadsl.settings.ParserSettings

- Direct Known Subclasses:
`[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`

---

```
public abstract class ParserSettings
extends [BodyPartParser.Settings](../../impl/engine/parsing/BodyPartParser.Settings.html "class in akka.http.impl.engine.parsing")
```

Public API but not intended for subclassing

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[ParserSettings.ConflictingContentTypeHeaderProcessingMode](ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.javadsl.settings")` |  |
	| `static interface` | `[ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.javadsl.settings")` |  |
	| `static interface` | `[ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.javadsl.settings")` |  |
	| `static interface` | `[ParserSettings.IllegalResponseHeaderNameProcessingMode](ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.javadsl.settings")` |  |
	| `static interface` | `[ParserSettings.IllegalResponseHeaderValueProcessingMode](ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.javadsl.settings")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ParserSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | Deprecated. Use forServer or forClient instead. |
	| `static [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Deprecated. Use forServer or forClient instead. |
	| `static [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` | Deprecated. Use forServer or forClient instead. |
	| `static [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[forClient](#forClient(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `static [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[forServer](#forServer(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `abstract [ParserSettings.ConflictingContentTypeHeaderProcessingMode](ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.javadsl.settings")` | `[getConflictingContentTypeHeaderProcessingMode](#getConflictingContentTypeHeaderProcessingMode())()` |  |
	| `abstract [ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.javadsl.settings")` | `[getCookieParsingMode](#getCookieParsingMode())()` |  |
	| `abstract akka.japi.function.Function2<java.lang.String,​java.lang.String,​java.util.Optional<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")>>` | `[getCustomMediaTypes](#getCustomMediaTypes())()` |  |
	| `abstract java.util.function.Function<java.lang.String,​java.util.Optional<[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model")>>` | `[getCustomMethods](#getCustomMethods())()` |  |
	| `abstract java.util.function.Function<java.lang.Object,​java.util.Optional<[StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model")>>` | `[getCustomStatusCodes](#getCustomStatusCodes())()` |  |
	| `abstract [ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.javadsl.settings")` | `[getErrorLoggingVerbosity](#getErrorLoggingVerbosity())()` |  |
	| `abstract java.util.Map<java.lang.String,​java.lang.Object>` | `[getHeaderValueCacheLimits](#getHeaderValueCacheLimits())()` |  |
	| `abstract scala.collection.immutable.Set<java.lang.String>` | `[getIgnoreIllegalHeaderFor](#getIgnoreIllegalHeaderFor())()` |  |
	| `abstract boolean` | `[getIllegalHeaderWarnings](#getIllegalHeaderWarnings())()` |  |
	| `abstract [ParserSettings.IllegalResponseHeaderNameProcessingMode](ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.javadsl.settings")` | `[getIllegalResponseHeaderNameProcessingMode](#getIllegalResponseHeaderNameProcessingMode())()` |  |
	| `abstract [ParserSettings.IllegalResponseHeaderValueProcessingMode](ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.javadsl.settings")` | `[getIllegalResponseHeaderValueProcessingMode](#getIllegalResponseHeaderValueProcessingMode())()` |  |
	| `abstract boolean` | `[getIncludeSslSessionAttribute](#getIncludeSslSessionAttribute())()` |  |
	| `abstract boolean` | `[getIncludeTlsSessionInfoHeader](#getIncludeTlsSessionInfoHeader())()` |  |
	| `abstract int` | `[getMaxChunkExtLength](#getMaxChunkExtLength())()` |  |
	| `abstract int` | `[getMaxChunkSize](#getMaxChunkSize())()` |  |
	| `abstract int` | `[getMaxCommentParsingDepth](#getMaxCommentParsingDepth())()` |  |
	| `abstract long` | `[getMaxContentLength](#getMaxContentLength())()` |  |
	| `abstract int` | `[getMaxHeaderCount](#getMaxHeaderCount())()` |  |
	| `abstract int` | `[getMaxHeaderNameLength](#getMaxHeaderNameLength())()` |  |
	| `abstract int` | `[getMaxHeaderValueLength](#getMaxHeaderValueLength())()` |  |
	| `abstract int` | `[getMaxMethodLength](#getMaxMethodLength())()` |  |
	| `abstract int` | `[getMaxResponseReasonLength](#getMaxResponseReasonLength())()` |  |
	| `abstract long` | `[getMaxToStrictBytes](#getMaxToStrictBytes())()` |  |
	| `abstract int` | `[getMaxUriLength](#getMaxUriLength())()` |  |
	| `abstract boolean` | `[getModeledHeaderParsing](#getModeledHeaderParsing())()` |  |
	| `abstract [Uri.ParsingMode](../model/Uri.ParsingMode.html "interface in akka.http.javadsl.model")` | `[getUriParsingMode](#getUriParsingMode())()` |  |
	| `abstract scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[headerValueCacheLimits](#headerValueCacheLimits())()` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withCookieParsingMode](#withCookieParsingMode(akka.http.javadsl.settings.ParserSettings.CookieParsingMode))​([ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.javadsl.settings") newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withCustomMediaTypes](#withCustomMediaTypes(akka.http.javadsl.model.MediaType...))​([MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")... mediaTypes)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withCustomMediaTypes](#withCustomMediaTypes(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> mediaTypes)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withCustomMethods](#withCustomMethods(akka.http.javadsl.model.HttpMethod...))​([HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model")... methods)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withCustomMethods](#withCustomMethods(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model")> methods)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withCustomStatusCodes](#withCustomStatusCodes(akka.http.javadsl.model.StatusCode...))​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model")... codes)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withCustomStatusCodes](#withCustomStatusCodes(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model")> codes)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withErrorLoggingVerbosity](#withErrorLoggingVerbosity(akka.http.javadsl.settings.ParserSettings.ErrorLoggingVerbosity))​([ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.javadsl.settings") newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withHeaderValueCacheLimits](#withHeaderValueCacheLimits(java.util.Map))​(java.util.Map<java.lang.String,​java.lang.Object> newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withIgnoreIllegalHeaderFor](#withIgnoreIllegalHeaderFor(scala.collection.immutable.List))​(scala.collection.immutable.List<java.lang.String> newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withIllegalHeaderWarnings](#withIllegalHeaderWarnings(boolean))​(boolean newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withIncludeSslSessionAttribute](#withIncludeSslSessionAttribute(boolean))​(boolean newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withIncludeTlsSessionInfoHeader](#withIncludeTlsSessionInfoHeader(boolean))​(boolean newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withMaxChunkExtLength](#withMaxChunkExtLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withMaxChunkSize](#withMaxChunkSize(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withMaxCommentParsingDepth](#withMaxCommentParsingDepth(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withMaxContentLength](#withMaxContentLength(long))​(long newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withMaxHeaderCount](#withMaxHeaderCount(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withMaxHeaderNameLength](#withMaxHeaderNameLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withMaxHeaderValueLength](#withMaxHeaderValueLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withMaxMethodLength](#withMaxMethodLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withMaxResponseReasonLength](#withMaxResponseReasonLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withMaxToStrictBytes](#withMaxToStrictBytes(long))​(long newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withMaxUriLength](#withMaxUriLength(int))​(int newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withModeledHeaderParsing](#withModeledHeaderParsing(boolean))​(boolean newValue)` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[withUriParsingMode](#withUriParsingMode(akka.http.javadsl.model.Uri.ParsingMode))​([Uri.ParsingMode](../model/Uri.ParsingMode.html "interface in akka.http.javadsl.model") newValue)` |  |
	
	
		- ### Methods inherited from class akka.http.impl.engine.parsing.[BodyPartParser.Settings](../../impl/engine/parsing/BodyPartParser.Settings.html "class in akka.http.impl.engine.parsing")
		
		
		`[defaultHeaderValueCacheLimit](../../impl/engine/parsing/BodyPartParser.Settings.html#defaultHeaderValueCacheLimit()), [illegalHeaderWarnings](../../impl/engine/parsing/BodyPartParser.Settings.html#illegalHeaderWarnings()), [maxHeaderCount](../../impl/engine/parsing/BodyPartParser.Settings.html#maxHeaderCount())`
		- ### Methods inherited from class akka.http.impl.engine.parsing.[HttpHeaderParser.Settings](../../impl/engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")
		
		
		`[customMediaTypes](../../impl/engine/parsing/HttpHeaderParser.Settings.html#customMediaTypes()), [errorLoggingVerbosity](../../impl/engine/parsing/HttpHeaderParser.Settings.html#errorLoggingVerbosity()), [headerValueCacheLimit](../../impl/engine/parsing/HttpHeaderParser.Settings.html#headerValueCacheLimit(java.lang.String)), [ignoreIllegalHeaderFor](../../impl/engine/parsing/HttpHeaderParser.Settings.html#ignoreIllegalHeaderFor()), [illegalResponseHeaderNameProcessingMode](../../impl/engine/parsing/HttpHeaderParser.Settings.html#illegalResponseHeaderNameProcessingMode()), [illegalResponseHeaderValueProcessingMode](../../impl/engine/parsing/HttpHeaderParser.Settings.html#illegalResponseHeaderValueProcessingMode()), [maxHeaderNameLength](../../impl/engine/parsing/HttpHeaderParser.Settings.html#maxHeaderNameLength()), [maxHeaderValueLength](../../impl/engine/parsing/HttpHeaderParser.Settings.html#maxHeaderValueLength()), [modeledHeaderParsing](../../impl/engine/parsing/HttpHeaderParser.Settings.html#modeledHeaderParsing())`
		- ### Methods inherited from class akka.http.impl.model.parser.[HeaderParser.Settings](../../impl/model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")
		
		
		`[cookieParsingMode](../../impl/model/parser/HeaderParser.Settings.html#cookieParsingMode()), [maxCommentParsingDepth](../../impl/model/parser/HeaderParser.Settings.html#maxCommentParsingDepth()), [uriParsingMode](../../impl/model/parser/HeaderParser.Settings.html#uriParsingMode())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ParserSettings
		
		
		
		```
		public ParserSettings()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") create​(com.typesafe.config.Config config)
		```
		
		Deprecated.
		Use forServer or forClient instead.
		
		
		Parameters:
		`config` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public static [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") create​(java.lang.String configOverrides)
		```
		
		Deprecated.
		Use forServer or forClient instead.
		
		
		Parameters:
		`configOverrides` \- (undocumented)
		Returns:
		(undocumented)
		- #### create
		
		
		
		```
		public static [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") create​(akka.actor.ActorSystem system)
		```
		
		Deprecated.
		Use forServer or forClient instead.
		
		
		Parameters:
		`system` \- (undocumented)
		Returns:
		(undocumented)
		- #### forServer
		
		
		
		```
		public static [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") forServer​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### forClient
		
		
		
		```
		public static [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") forClient​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### withCustomMethods
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withCustomMethods​([HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model")... methods)
		```
		- #### withCustomStatusCodes
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withCustomStatusCodes​([StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model")... codes)
		```
		- #### withCustomMediaTypes
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withCustomMediaTypes​([MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")... mediaTypes)
		```
		- #### getMaxUriLength
		
		
		
		```
		public abstract int getMaxUriLength()
		```
		- #### getMaxMethodLength
		
		
		
		```
		public abstract int getMaxMethodLength()
		```
		- #### getMaxResponseReasonLength
		
		
		
		```
		public abstract int getMaxResponseReasonLength()
		```
		- #### getMaxHeaderNameLength
		
		
		
		```
		public abstract int getMaxHeaderNameLength()
		```
		- #### getMaxHeaderValueLength
		
		
		
		```
		public abstract int getMaxHeaderValueLength()
		```
		- #### getMaxHeaderCount
		
		
		
		```
		public abstract int getMaxHeaderCount()
		```
		- #### getMaxContentLength
		
		
		
		```
		public abstract long getMaxContentLength()
		```
		- #### getMaxToStrictBytes
		
		
		
		```
		public abstract long getMaxToStrictBytes()
		```
		- #### getMaxChunkExtLength
		
		
		
		```
		public abstract int getMaxChunkExtLength()
		```
		- #### getMaxChunkSize
		
		
		
		```
		public abstract int getMaxChunkSize()
		```
		- #### getMaxCommentParsingDepth
		
		
		
		```
		public abstract int getMaxCommentParsingDepth()
		```
		- #### getUriParsingMode
		
		
		
		```
		public abstract [Uri.ParsingMode](../model/Uri.ParsingMode.html "interface in akka.http.javadsl.model") getUriParsingMode()
		```
		- #### getCookieParsingMode
		
		
		
		```
		public abstract [ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.javadsl.settings") getCookieParsingMode()
		```
		- #### getIllegalHeaderWarnings
		
		
		
		```
		public abstract boolean getIllegalHeaderWarnings()
		```
		- #### getIgnoreIllegalHeaderFor
		
		
		
		```
		public abstract scala.collection.immutable.Set<java.lang.String> getIgnoreIllegalHeaderFor()
		```
		- #### getErrorLoggingVerbosity
		
		
		
		```
		public abstract [ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.javadsl.settings") getErrorLoggingVerbosity()
		```
		- #### getIllegalResponseHeaderNameProcessingMode
		
		
		
		```
		public abstract [ParserSettings.IllegalResponseHeaderNameProcessingMode](ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.javadsl.settings") getIllegalResponseHeaderNameProcessingMode()
		```
		- #### getIllegalResponseHeaderValueProcessingMode
		
		
		
		```
		public abstract [ParserSettings.IllegalResponseHeaderValueProcessingMode](ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.javadsl.settings") getIllegalResponseHeaderValueProcessingMode()
		```
		- #### getConflictingContentTypeHeaderProcessingMode
		
		
		
		```
		public abstract [ParserSettings.ConflictingContentTypeHeaderProcessingMode](ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.javadsl.settings") getConflictingContentTypeHeaderProcessingMode()
		```
		- #### getHeaderValueCacheLimits
		
		
		
		```
		public abstract java.util.Map<java.lang.String,​java.lang.Object> getHeaderValueCacheLimits()
		```
		- #### getIncludeTlsSessionInfoHeader
		
		
		
		```
		public abstract boolean getIncludeTlsSessionInfoHeader()
		```
		- #### getIncludeSslSessionAttribute
		
		
		
		```
		public abstract boolean getIncludeSslSessionAttribute()
		```
		- #### headerValueCacheLimits
		
		
		
		```
		public abstract scala.collection.immutable.Map<java.lang.String,​java.lang.Object> headerValueCacheLimits()
		```
		- #### getCustomMethods
		
		
		
		```
		public abstract java.util.function.Function<java.lang.String,​java.util.Optional<[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model")>> getCustomMethods()
		```
		- #### getCustomStatusCodes
		
		
		
		```
		public abstract java.util.function.Function<java.lang.Object,​java.util.Optional<[StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model")>> getCustomStatusCodes()
		```
		- #### getCustomMediaTypes
		
		
		
		```
		public abstract akka.japi.function.Function2<java.lang.String,​java.lang.String,​java.util.Optional<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")>> getCustomMediaTypes()
		```
		- #### getModeledHeaderParsing
		
		
		
		```
		public abstract boolean getModeledHeaderParsing()
		```
		- #### withMaxUriLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withMaxUriLength​(int newValue)
		```
		- #### withMaxMethodLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withMaxMethodLength​(int newValue)
		```
		- #### withMaxResponseReasonLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withMaxResponseReasonLength​(int newValue)
		```
		- #### withMaxHeaderNameLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withMaxHeaderNameLength​(int newValue)
		```
		- #### withMaxHeaderValueLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withMaxHeaderValueLength​(int newValue)
		```
		- #### withMaxHeaderCount
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withMaxHeaderCount​(int newValue)
		```
		- #### withMaxContentLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withMaxContentLength​(long newValue)
		```
		- #### withMaxToStrictBytes
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withMaxToStrictBytes​(long newValue)
		```
		- #### withMaxChunkExtLength
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withMaxChunkExtLength​(int newValue)
		```
		- #### withMaxChunkSize
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withMaxChunkSize​(int newValue)
		```
		- #### withMaxCommentParsingDepth
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withMaxCommentParsingDepth​(int newValue)
		```
		- #### withUriParsingMode
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withUriParsingMode​([Uri.ParsingMode](../model/Uri.ParsingMode.html "interface in akka.http.javadsl.model") newValue)
		```
		- #### withCookieParsingMode
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withCookieParsingMode​([ParserSettings.CookieParsingMode](ParserSettings.CookieParsingMode.html "interface in akka.http.javadsl.settings") newValue)
		```
		- #### withIllegalHeaderWarnings
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withIllegalHeaderWarnings​(boolean newValue)
		```
		- #### withErrorLoggingVerbosity
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withErrorLoggingVerbosity​([ParserSettings.ErrorLoggingVerbosity](ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.javadsl.settings") newValue)
		```
		- #### withHeaderValueCacheLimits
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withHeaderValueCacheLimits​(java.util.Map<java.lang.String,​java.lang.Object> newValue)
		```
		- #### withIncludeTlsSessionInfoHeader
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withIncludeTlsSessionInfoHeader​(boolean newValue)
		```
		- #### withIncludeSslSessionAttribute
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withIncludeSslSessionAttribute​(boolean newValue)
		```
		- #### withModeledHeaderParsing
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withModeledHeaderParsing​(boolean newValue)
		```
		- #### withIgnoreIllegalHeaderFor
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withIgnoreIllegalHeaderFor​(scala.collection.immutable.List<java.lang.String> newValue)
		```
		- #### withCustomMethods
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withCustomMethods​(scala.collection.immutable.Seq<[HttpMethod](../model/HttpMethod.html "class in akka.http.javadsl.model")> methods)
		```
		- #### withCustomStatusCodes
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withCustomStatusCodes​(scala.collection.immutable.Seq<[StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model")> codes)
		```
		- #### withCustomMediaTypes
		
		
		
		```
		public [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") withCustomMediaTypes​(scala.collection.immutable.Seq<[MediaType](../model/MediaType.html "interface in akka.http.javadsl.model")> mediaTypes)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.CookieParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.ErrorLoggingVerbosity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.html)*