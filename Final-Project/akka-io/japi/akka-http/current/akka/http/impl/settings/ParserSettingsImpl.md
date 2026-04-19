---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ParserSettingsImpl.html
title: ParserSettingsImpl
---

# ParserSettingsImpl

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class ParserSettingsImpl

- java.lang.Object
- - [akka.http.impl.model.parser.HeaderParser.Settings](../model/parser/HeaderParser.Settings.html "class in akka.http.impl.model.parser")
	- - [akka.http.impl.engine.parsing.HttpHeaderParser.Settings](../engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")
		- - [akka.http.impl.engine.parsing.BodyPartParser.Settings](../engine/parsing/BodyPartParser.Settings.html "class in akka.http.impl.engine.parsing")
			- - [akka.http.javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")
				- - [akka.http.scaladsl.settings.ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")
					- - akka.http.impl.settings.ParserSettingsImpl

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ParserSettingsImpl
extends [ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.ParserSettingsImpl)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.settings.[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")
		
		
		`[ParserSettings.ConflictingContentTypeHeaderProcessingMode](../../scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings"), [ParserSettings.ConflictingContentTypeHeaderProcessingMode$](../../scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode$.html "class in akka.http.scaladsl.settings"), [ParserSettings.CookieParsingMode](../../scaladsl/settings/ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings"), [ParserSettings.CookieParsingMode$](../../scaladsl/settings/ParserSettings.CookieParsingMode$.html "class in akka.http.scaladsl.settings"), [ParserSettings.ErrorLoggingVerbosity](../../scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings"), [ParserSettings.ErrorLoggingVerbosity$](../../scaladsl/settings/ParserSettings.ErrorLoggingVerbosity$.html "class in akka.http.scaladsl.settings"), [ParserSettings.IllegalResponseHeaderNameProcessingMode](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings"), [ParserSettings.IllegalResponseHeaderNameProcessingMode$](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode$.html "class in akka.http.scaladsl.settings"), [ParserSettings.IllegalResponseHeaderValueProcessingMode](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings"), [ParserSettings.IllegalResponseHeaderValueProcessingMode$](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode$.html "class in akka.http.scaladsl.settings")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ParserSettingsImpl](#%3Cinit%3E(int,int,int,int,int,int,scala.Option,long,int,int,int,akka.http.scaladsl.model.Uri.ParsingMode,akka.http.scaladsl.settings.ParserSettings.CookieParsingMode,boolean,scala.collection.immutable.Set,akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity,akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode,akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode,akka.http.scaladsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode,scala.collection.immutable.Map,boolean,boolean,boolean,scala.Function1,scala.Function1,scala.Function2))​(int maxUriLength,  int maxMethodLength,  int maxResponseReasonLength,  int maxHeaderNameLength,  int maxHeaderValueLength,  int maxHeaderCount,  scala.Option<java.lang.Object> maxContentLengthSetting,  long maxToStrictBytes,  int maxChunkExtLength,  int maxChunkSize,  int maxCommentParsingDepth,  [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode,  [ParserSettings.CookieParsingMode](../../scaladsl/settings/ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings") cookieParsingMode,  boolean illegalHeaderWarnings,  scala.collection.immutable.Set<java.lang.String> ignoreIllegalHeaderFor,  [ParserSettings.ErrorLoggingVerbosity](../../scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings") errorLoggingVerbosity,  [ParserSettings.IllegalResponseHeaderNameProcessingMode](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderNameProcessingMode,  [ParserSettings.IllegalResponseHeaderValueProcessingMode](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderValueProcessingMode,  [ParserSettings.ConflictingContentTypeHeaderProcessingMode](../../scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings") conflictingContentTypeHeaderProcessingMode,  scala.collection.immutable.Map<java.lang.String,​java.lang.Object> headerValueCacheLimits,  boolean includeTlsSessionInfoHeader,  boolean includeSslSessionAttribute,  boolean modeledHeaderParsing,  scala.Function1<java.lang.String,​scala.Option<[HttpMethod](../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model")>> customMethods,  scala.Function1<java.lang.Object,​scala.Option<[StatusCode](../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model")>> customStatusCodes,  scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>> customMediaTypes)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `[ParserSettings.ConflictingContentTypeHeaderProcessingMode](../../scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[conflictingContentTypeHeaderProcessingMode](#conflictingContentTypeHeaderProcessingMode())()` |  |
	| `[ParserSettings.CookieParsingMode](../../scaladsl/settings/ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings")` | `[cookieParsingMode](#cookieParsingMode())()` |  |
	| `scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>>` | `[customMediaTypes](#customMediaTypes())()` |  |
	| `scala.Function1<java.lang.String,​scala.Option<[HttpMethod](../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model")>>` | `[customMethods](#customMethods())()` |  |
	| `scala.Function1<java.lang.Object,​scala.Option<[StatusCode](../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model")>>` | `[customStatusCodes](#customStatusCodes())()` |  |
	| `int` | `[defaultHeaderValueCacheLimit](#defaultHeaderValueCacheLimit())()` |  |
	| `[ParserSettings.ErrorLoggingVerbosity](../../scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings")` | `[errorLoggingVerbosity](#errorLoggingVerbosity())()` |  |
	| `static [ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")` | `[forServer](#forServer(com.typesafe.config.Config))​(com.typesafe.config.Config root)` |  |
	| `static [ParserSettingsImpl](ParserSettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config inner)` |  |
	| `int` | `[headerValueCacheLimit](#headerValueCacheLimit(java.lang.String))​(java.lang.String headerName)` |  |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[headerValueCacheLimits](#headerValueCacheLimits())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[ignoreIllegalHeaderFor](#ignoreIllegalHeaderFor())()` |  |
	| `boolean` | `[illegalHeaderWarnings](#illegalHeaderWarnings())()` |  |
	| `[ParserSettings.IllegalResponseHeaderNameProcessingMode](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[illegalResponseHeaderNameProcessingMode](#illegalResponseHeaderNameProcessingMode())()` |  |
	| `[ParserSettings.IllegalResponseHeaderValueProcessingMode](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings")` | `[illegalResponseHeaderValueProcessingMode](#illegalResponseHeaderValueProcessingMode())()` |  |
	| `boolean` | `[includeSslSessionAttribute](#includeSslSessionAttribute())()` |  |
	| `boolean` | `[includeTlsSessionInfoHeader](#includeTlsSessionInfoHeader())()` |  |
	| `int` | `[maxChunkExtLength](#maxChunkExtLength())()` |  |
	| `int` | `[maxChunkSize](#maxChunkSize())()` |  |
	| `int` | `[maxCommentParsingDepth](#maxCommentParsingDepth())()` |  |
	| `long` | `[maxContentLength](#maxContentLength())()` |  |
	| `scala.Option<java.lang.Object>` | `[maxContentLengthSetting](#maxContentLengthSetting())()` |  |
	| `int` | `[maxHeaderCount](#maxHeaderCount())()` |  |
	| `int` | `[maxHeaderNameLength](#maxHeaderNameLength())()` |  |
	| `int` | `[maxHeaderValueLength](#maxHeaderValueLength())()` |  |
	| `int` | `[maxMethodLength](#maxMethodLength())()` |  |
	| `int` | `[maxResponseReasonLength](#maxResponseReasonLength())()` |  |
	| `long` | `[maxToStrictBytes](#maxToStrictBytes())()` |  |
	| `int` | `[maxUriLength](#maxUriLength())()` |  |
	| `boolean` | `[modeledHeaderParsing](#modeledHeaderParsing())()` |  |
	| `static scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>>` | `[noCustomMediaTypes](#noCustomMediaTypes())()` |  |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model")` | `[uriParsingMode](#uriParsingMode())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.settings.[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")
		
		
		`[forClient](../../scaladsl/settings/ParserSettings.html#forClient(akka.actor.ClassicActorSystemProvider)), [forServer](../../scaladsl/settings/ParserSettings.html#forServer(akka.actor.ClassicActorSystemProvider)), [getConflictingContentTypeHeaderProcessingMode](../../scaladsl/settings/ParserSettings.html#getConflictingContentTypeHeaderProcessingMode()), [getCookieParsingMode](../../scaladsl/settings/ParserSettings.html#getCookieParsingMode()), [getCustomMediaTypes](../../scaladsl/settings/ParserSettings.html#getCustomMediaTypes()), [getCustomMethods](../../scaladsl/settings/ParserSettings.html#getCustomMethods()), [getCustomStatusCodes](../../scaladsl/settings/ParserSettings.html#getCustomStatusCodes()), [getErrorLoggingVerbosity](../../scaladsl/settings/ParserSettings.html#getErrorLoggingVerbosity()), [getHeaderValueCacheLimits](../../scaladsl/settings/ParserSettings.html#getHeaderValueCacheLimits()), [getIgnoreIllegalHeaderFor](../../scaladsl/settings/ParserSettings.html#getIgnoreIllegalHeaderFor()), [getIllegalHeaderWarnings](../../scaladsl/settings/ParserSettings.html#getIllegalHeaderWarnings()), [getIllegalResponseHeaderNameProcessingMode](../../scaladsl/settings/ParserSettings.html#getIllegalResponseHeaderNameProcessingMode()), [getIllegalResponseHeaderValueProcessingMode](../../scaladsl/settings/ParserSettings.html#getIllegalResponseHeaderValueProcessingMode()), [getIncludeSslSessionAttribute](../../scaladsl/settings/ParserSettings.html#getIncludeSslSessionAttribute()), [getIncludeTlsSessionInfoHeader](../../scaladsl/settings/ParserSettings.html#getIncludeTlsSessionInfoHeader()), [getMaxChunkExtLength](../../scaladsl/settings/ParserSettings.html#getMaxChunkExtLength()), [getMaxChunkSize](../../scaladsl/settings/ParserSettings.html#getMaxChunkSize()), [getMaxCommentParsingDepth](../../scaladsl/settings/ParserSettings.html#getMaxCommentParsingDepth()), [getMaxContentLength](../../scaladsl/settings/ParserSettings.html#getMaxContentLength()), [getMaxHeaderCount](../../scaladsl/settings/ParserSettings.html#getMaxHeaderCount()), [getMaxHeaderNameLength](../../scaladsl/settings/ParserSettings.html#getMaxHeaderNameLength()), [getMaxHeaderValueLength](../../scaladsl/settings/ParserSettings.html#getMaxHeaderValueLength()), [getMaxMethodLength](../../scaladsl/settings/ParserSettings.html#getMaxMethodLength()), [getMaxResponseReasonLength](../../scaladsl/settings/ParserSettings.html#getMaxResponseReasonLength()), [getMaxToStrictBytes](../../scaladsl/settings/ParserSettings.html#getMaxToStrictBytes()), [getMaxUriLength](../../scaladsl/settings/ParserSettings.html#getMaxUriLength()), [getModeledHeaderParsing](../../scaladsl/settings/ParserSettings.html#getModeledHeaderParsing()), [getUriParsingMode](../../scaladsl/settings/ParserSettings.html#getUriParsingMode()), [withConflictingContentTypeHeaderProcessingMode](../../scaladsl/settings/ParserSettings.html#withConflictingContentTypeHeaderProcessingMode(akka.http.scaladsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode)), [withCookieParsingMode](../../scaladsl/settings/ParserSettings.html#withCookieParsingMode(akka.http.scaladsl.settings.ParserSettings.CookieParsingMode)), [withCustomMediaTypes](../../scaladsl/settings/ParserSettings.html#withCustomMediaTypes(scala.collection.immutable.Seq)), [withCustomMethods](../../scaladsl/settings/ParserSettings.html#withCustomMethods(scala.collection.immutable.Seq)), [withCustomStatusCodes](../../scaladsl/settings/ParserSettings.html#withCustomStatusCodes(scala.collection.immutable.Seq)), [withErrorLoggingVerbosity](../../scaladsl/settings/ParserSettings.html#withErrorLoggingVerbosity(akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity)), [withHeaderValueCacheLimits](../../scaladsl/settings/ParserSettings.html#withHeaderValueCacheLimits(scala.collection.immutable.Map)), [withIgnoreIllegalHeaderFor](../../scaladsl/settings/ParserSettings.html#withIgnoreIllegalHeaderFor(scala.collection.immutable.List)), [withIllegalHeaderWarnings](../../scaladsl/settings/ParserSettings.html#withIllegalHeaderWarnings(boolean)), [withIllegalResponseHeaderNameProcessingMode](../../scaladsl/settings/ParserSettings.html#withIllegalResponseHeaderNameProcessingMode(akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode)), [withIllegalResponseHeaderValueProcessingMode](../../scaladsl/settings/ParserSettings.html#withIllegalResponseHeaderValueProcessingMode(akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode)), [withIncludeSslSessionAttribute](../../scaladsl/settings/ParserSettings.html#withIncludeSslSessionAttribute(boolean)), [withIncludeTlsSessionInfoHeader](../../scaladsl/settings/ParserSettings.html#withIncludeTlsSessionInfoHeader(boolean)), [withMaxChunkExtLength](../../scaladsl/settings/ParserSettings.html#withMaxChunkExtLength(int)), [withMaxChunkSize](../../scaladsl/settings/ParserSettings.html#withMaxChunkSize(int)), [withMaxCommentParsingDepth](../../scaladsl/settings/ParserSettings.html#withMaxCommentParsingDepth(int)), [withMaxContentLength](../../scaladsl/settings/ParserSettings.html#withMaxContentLength(long)), [withMaxContentLength](../../scaladsl/settings/ParserSettings.html#withMaxContentLength(scala.Option)), [withMaxHeaderCount](../../scaladsl/settings/ParserSettings.html#withMaxHeaderCount(int)), [withMaxHeaderNameLength](../../scaladsl/settings/ParserSettings.html#withMaxHeaderNameLength(int)), [withMaxHeaderValueLength](../../scaladsl/settings/ParserSettings.html#withMaxHeaderValueLength(int)), [withMaxMethodLength](../../scaladsl/settings/ParserSettings.html#withMaxMethodLength(int)), [withMaxResponseReasonLength](../../scaladsl/settings/ParserSettings.html#withMaxResponseReasonLength(int)), [withMaxToStrictBytes](../../scaladsl/settings/ParserSettings.html#withMaxToStrictBytes(long)), [withMaxUriLength](../../scaladsl/settings/ParserSettings.html#withMaxUriLength(int)), [withModeledHeaderParsing](../../scaladsl/settings/ParserSettings.html#withModeledHeaderParsing(boolean)), [withUriParsingMode](../../scaladsl/settings/ParserSettings.html#withUriParsingMode(akka.http.scaladsl.model.Uri.ParsingMode))`
		- ### Methods inherited from class akka.http.javadsl.settings.[ParserSettings](../../javadsl/settings/ParserSettings.html "class in akka.http.javadsl.settings")
		
		
		`[create](../../javadsl/settings/ParserSettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/ParserSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/ParserSettings.html#create(java.lang.String)), [withCookieParsingMode](../../javadsl/settings/ParserSettings.html#withCookieParsingMode(akka.http.javadsl.settings.ParserSettings.CookieParsingMode)), [withCustomMediaTypes](../../javadsl/settings/ParserSettings.html#withCustomMediaTypes(akka.http.javadsl.model.MediaType...)), [withCustomMediaTypes](../../javadsl/settings/ParserSettings.html#withCustomMediaTypes(scala.collection.immutable.Seq)), [withCustomMethods](../../javadsl/settings/ParserSettings.html#withCustomMethods(akka.http.javadsl.model.HttpMethod...)), [withCustomMethods](../../javadsl/settings/ParserSettings.html#withCustomMethods(scala.collection.immutable.Seq)), [withCustomStatusCodes](../../javadsl/settings/ParserSettings.html#withCustomStatusCodes(akka.http.javadsl.model.StatusCode...)), [withCustomStatusCodes](../../javadsl/settings/ParserSettings.html#withCustomStatusCodes(scala.collection.immutable.Seq)), [withErrorLoggingVerbosity](../../javadsl/settings/ParserSettings.html#withErrorLoggingVerbosity(akka.http.javadsl.settings.ParserSettings.ErrorLoggingVerbosity)), [withHeaderValueCacheLimits](../../javadsl/settings/ParserSettings.html#withHeaderValueCacheLimits(java.util.Map)), [withUriParsingMode](../../javadsl/settings/ParserSettings.html#withUriParsingMode(akka.http.javadsl.model.Uri.ParsingMode))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### ParserSettingsImpl
		
		
		
		```
		public ParserSettingsImpl​(int maxUriLength,
		                          int maxMethodLength,
		                          int maxResponseReasonLength,
		                          int maxHeaderNameLength,
		                          int maxHeaderValueLength,
		                          int maxHeaderCount,
		                          scala.Option<java.lang.Object> maxContentLengthSetting,
		                          long maxToStrictBytes,
		                          int maxChunkExtLength,
		                          int maxChunkSize,
		                          int maxCommentParsingDepth,
		                          [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode,
		                          [ParserSettings.CookieParsingMode](../../scaladsl/settings/ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings") cookieParsingMode,
		                          boolean illegalHeaderWarnings,
		                          scala.collection.immutable.Set<java.lang.String> ignoreIllegalHeaderFor,
		                          [ParserSettings.ErrorLoggingVerbosity](../../scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings") errorLoggingVerbosity,
		                          [ParserSettings.IllegalResponseHeaderNameProcessingMode](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderNameProcessingMode,
		                          [ParserSettings.IllegalResponseHeaderValueProcessingMode](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderValueProcessingMode,
		                          [ParserSettings.ConflictingContentTypeHeaderProcessingMode](../../scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings") conflictingContentTypeHeaderProcessingMode,
		                          scala.collection.immutable.Map<java.lang.String,​java.lang.Object> headerValueCacheLimits,
		                          boolean includeTlsSessionInfoHeader,
		                          boolean includeSslSessionAttribute,
		                          boolean modeledHeaderParsing,
		                          scala.Function1<java.lang.String,​scala.Option<[HttpMethod](../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model")>> customMethods,
		                          scala.Function1<java.lang.Object,​scala.Option<[StatusCode](../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model")>> customStatusCodes,
		                          scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>> customMediaTypes)
		```

	- ### Method Detail
	
	
	
		- #### noCustomMediaTypes
		
		
		
		```
		public static scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>> noCustomMediaTypes()
		```
		- #### forServer
		
		
		
		```
		public static [ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") forServer​(com.typesafe.config.Config root)
		```
		- #### fromSubConfig
		
		
		
		```
		public static [ParserSettingsImpl](ParserSettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                               com.typesafe.config.Config inner)
		```
		- #### prefix
		
		
		
		```
		protected static java.lang.String prefix()
		```
		- #### apply
		
		
		
		```
		public static T apply​(akka.actor.ActorSystem system)
		```
		- #### apply
		
		
		
		```
		public static T apply​(java.lang.String configOverrides)
		```
		- #### apply
		
		
		
		```
		public static T apply​(com.typesafe.config.Config config)
		```
		- #### maxUriLength
		
		
		
		```
		public int maxUriLength()
		```
		
		
		Specified by:
		`[maxUriLength](../../scaladsl/settings/ParserSettings.html#maxUriLength())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxMethodLength
		
		
		
		```
		public int maxMethodLength()
		```
		
		
		Specified by:
		`[maxMethodLength](../../scaladsl/settings/ParserSettings.html#maxMethodLength())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxResponseReasonLength
		
		
		
		```
		public int maxResponseReasonLength()
		```
		
		
		Specified by:
		`[maxResponseReasonLength](../../scaladsl/settings/ParserSettings.html#maxResponseReasonLength())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxHeaderNameLength
		
		
		
		```
		public int maxHeaderNameLength()
		```
		
		
		Specified by:
		`[maxHeaderNameLength](../../scaladsl/settings/ParserSettings.html#maxHeaderNameLength())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxHeaderValueLength
		
		
		
		```
		public int maxHeaderValueLength()
		```
		
		
		Specified by:
		`[maxHeaderValueLength](../../scaladsl/settings/ParserSettings.html#maxHeaderValueLength())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxHeaderCount
		
		
		
		```
		public int maxHeaderCount()
		```
		
		
		Specified by:
		`[maxHeaderCount](../../scaladsl/settings/ParserSettings.html#maxHeaderCount())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxContentLengthSetting
		
		
		
		```
		public scala.Option<java.lang.Object> maxContentLengthSetting()
		```
		- #### maxToStrictBytes
		
		
		
		```
		public long maxToStrictBytes()
		```
		
		
		Specified by:
		`[maxToStrictBytes](../../scaladsl/settings/ParserSettings.html#maxToStrictBytes())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxChunkExtLength
		
		
		
		```
		public int maxChunkExtLength()
		```
		
		
		Specified by:
		`[maxChunkExtLength](../../scaladsl/settings/ParserSettings.html#maxChunkExtLength())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxChunkSize
		
		
		
		```
		public int maxChunkSize()
		```
		
		
		Specified by:
		`[maxChunkSize](../../scaladsl/settings/ParserSettings.html#maxChunkSize())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxCommentParsingDepth
		
		
		
		```
		public int maxCommentParsingDepth()
		```
		
		
		Specified by:
		`[maxCommentParsingDepth](../../scaladsl/settings/ParserSettings.html#maxCommentParsingDepth())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### uriParsingMode
		
		
		
		```
		public [Uri.ParsingMode](../../scaladsl/model/Uri.ParsingMode.html "interface in akka.http.scaladsl.model") uriParsingMode()
		```
		
		
		Specified by:
		`[uriParsingMode](../../scaladsl/settings/ParserSettings.html#uriParsingMode())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### cookieParsingMode
		
		
		
		```
		public [ParserSettings.CookieParsingMode](../../scaladsl/settings/ParserSettings.CookieParsingMode.html "interface in akka.http.scaladsl.settings") cookieParsingMode()
		```
		
		
		Specified by:
		`[cookieParsingMode](../../scaladsl/settings/ParserSettings.html#cookieParsingMode())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### illegalHeaderWarnings
		
		
		
		```
		public boolean illegalHeaderWarnings()
		```
		
		
		Specified by:
		`[illegalHeaderWarnings](../../scaladsl/settings/ParserSettings.html#illegalHeaderWarnings())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### ignoreIllegalHeaderFor
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> ignoreIllegalHeaderFor()
		```
		
		
		Specified by:
		`[ignoreIllegalHeaderFor](../../scaladsl/settings/ParserSettings.html#ignoreIllegalHeaderFor())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### errorLoggingVerbosity
		
		
		
		```
		public [ParserSettings.ErrorLoggingVerbosity](../../scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings") errorLoggingVerbosity()
		```
		
		
		Specified by:
		`[errorLoggingVerbosity](../../scaladsl/settings/ParserSettings.html#errorLoggingVerbosity())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### illegalResponseHeaderNameProcessingMode
		
		
		
		```
		public [ParserSettings.IllegalResponseHeaderNameProcessingMode](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderNameProcessingMode()
		```
		
		
		Specified by:
		`[illegalResponseHeaderNameProcessingMode](../../scaladsl/settings/ParserSettings.html#illegalResponseHeaderNameProcessingMode())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### illegalResponseHeaderValueProcessingMode
		
		
		
		```
		public [ParserSettings.IllegalResponseHeaderValueProcessingMode](../../scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html "interface in akka.http.scaladsl.settings") illegalResponseHeaderValueProcessingMode()
		```
		
		
		Specified by:
		`[illegalResponseHeaderValueProcessingMode](../../scaladsl/settings/ParserSettings.html#illegalResponseHeaderValueProcessingMode())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### conflictingContentTypeHeaderProcessingMode
		
		
		
		```
		public [ParserSettings.ConflictingContentTypeHeaderProcessingMode](../../scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode.html "interface in akka.http.scaladsl.settings") conflictingContentTypeHeaderProcessingMode()
		```
		
		
		Specified by:
		`[conflictingContentTypeHeaderProcessingMode](../../scaladsl/settings/ParserSettings.html#conflictingContentTypeHeaderProcessingMode())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### headerValueCacheLimits
		
		
		
		```
		public scala.collection.immutable.Map<java.lang.String,​java.lang.Object> headerValueCacheLimits()
		```
		
		
		Specified by:
		`[headerValueCacheLimits](../../scaladsl/settings/ParserSettings.html#headerValueCacheLimits())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### includeTlsSessionInfoHeader
		
		
		
		```
		public boolean includeTlsSessionInfoHeader()
		```
		
		
		Specified by:
		`[includeTlsSessionInfoHeader](../../scaladsl/settings/ParserSettings.html#includeTlsSessionInfoHeader())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### includeSslSessionAttribute
		
		
		
		```
		public boolean includeSslSessionAttribute()
		```
		
		
		Specified by:
		`[includeSslSessionAttribute](../../scaladsl/settings/ParserSettings.html#includeSslSessionAttribute())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### modeledHeaderParsing
		
		
		
		```
		public boolean modeledHeaderParsing()
		```
		
		
		Specified by:
		`[modeledHeaderParsing](../../scaladsl/settings/ParserSettings.html#modeledHeaderParsing())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### customMethods
		
		
		
		```
		public scala.Function1<java.lang.String,​scala.Option<[HttpMethod](../../scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model")>> customMethods()
		```
		
		
		Specified by:
		`[customMethods](../../scaladsl/settings/ParserSettings.html#customMethods())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### customStatusCodes
		
		
		
		```
		public scala.Function1<java.lang.Object,​scala.Option<[StatusCode](../../scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model")>> customStatusCodes()
		```
		
		
		Specified by:
		`[customStatusCodes](../../scaladsl/settings/ParserSettings.html#customStatusCodes())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### customMediaTypes
		
		
		
		```
		public scala.Function2<java.lang.String,​java.lang.String,​scala.Option<[MediaType](../../scaladsl/model/MediaType.html "class in akka.http.scaladsl.model")>> customMediaTypes()
		```
		
		
		Specified by:
		`[customMediaTypes](../../scaladsl/settings/ParserSettings.html#customMediaTypes())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### defaultHeaderValueCacheLimit
		
		
		
		```
		public int defaultHeaderValueCacheLimit()
		```
		
		
		Specified by:
		`[defaultHeaderValueCacheLimit](../engine/parsing/BodyPartParser.Settings.html#defaultHeaderValueCacheLimit())` in class `[BodyPartParser.Settings](../engine/parsing/BodyPartParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### headerValueCacheLimit
		
		
		
		```
		public int headerValueCacheLimit​(java.lang.String headerName)
		```
		
		
		Specified by:
		`[headerValueCacheLimit](../engine/parsing/HttpHeaderParser.Settings.html#headerValueCacheLimit(java.lang.String))` in class `[HttpHeaderParser.Settings](../engine/parsing/HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing")`
		- #### maxContentLength
		
		
		
		```
		public long maxContentLength()
		```
		
		
		Specified by:
		`[maxContentLength](../../scaladsl/settings/ParserSettings.html#maxContentLength())` in class `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/model/parser/HeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ParserSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.ParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.CookieParsingMode$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.CookieParsingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.ErrorLoggingVerbosity$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ParserSettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ParserSettingsImpl.html)*