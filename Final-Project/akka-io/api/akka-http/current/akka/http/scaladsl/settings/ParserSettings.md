---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:11:13Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ParserSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[scaladsl](../index.html)
- [ClientConnectionSettings](ClientConnectionSettings.html "Public API but not intended for subclassing")
- [ConnectionPoolSettings](ConnectionPoolSettings.html "Public API but not intended for subclassing")
- [CorsSettings](CorsSettings.html "Settings for the CORS support")
- [Http2ClientSettings](Http2ClientSettings.html)
- [Http2ServerSettings](Http2ServerSettings.html)
- [HttpsProxySettings](HttpsProxySettings.html "Public API but not intended for subclassing")
- ParserSettings
- [PreviewServerSettings](PreviewServerSettings.html "Public API but not intended for subclassing")
- [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing")
- [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing")
- [ServerSettings](ServerSettings.html "Public API but not intended for subclassing")
- [WebSocketSettings](WebSocketSettings.html)
[c](ParserSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[settings](index.html)

# [ParserSettings](ParserSettings$.html "See companion object")[**](../../../../akka/http/scaladsl/settings/ParserSettings.html "Permalink")

### Companion [object ParserSettings](ParserSettings$.html "See companion object")

#### abstract  class ParserSettings extends [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)

Public API but not intended for subclassing

Self TypeParserSettingsImplAnnotations@DoNotInherit() Source[ParserSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/settings/ParserSettings.scala#L27)Linear Supertypes[javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html), Settings, Settings, Settings, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ParserSettings
2. ParserSettings
3. Settings
4. Settings
5. Settings
6. AnyRef
7. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#conflictingContentTypeHeaderProcessingMode:akka.http.scaladsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode "Permalink") abstract  def conflictingContentTypeHeaderProcessingMode: [ConflictingContentTypeHeaderProcessingMode](ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html)
2. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#cookieParsingMode:akka.http.scaladsl.settings.ParserSettings.CookieParsingMode "Permalink") abstract  def cookieParsingMode: [CookieParsingMode](ParserSettings$$CookieParsingMode.html)Definition ClassesParserSettings → Settings
3. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#customMediaTypes:akka.http.scaladsl.model.MediaTypes.FindCustom "Permalink") abstract  def customMediaTypes: [FindCustom](../model/MediaTypes$.html#FindCustom=(String,String)=>Option[akka.http.scaladsl.model.MediaType])Definition ClassesParserSettings → Settings → Settings
4. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#customMethods:String=>Option[akka.http.scaladsl.model.HttpMethod] "Permalink") abstract  def customMethods: (String) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[HttpMethod](../model/HttpMethod.html)]
5. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#customStatusCodes:Int=>Option[akka.http.scaladsl.model.StatusCode] "Permalink") abstract  def customStatusCodes: ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[StatusCode](../model/StatusCode.html)]
6. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#defaultHeaderValueCacheLimit:Int "Permalink") abstract  def defaultHeaderValueCacheLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSettings
7. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#errorLoggingVerbosity:akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity "Permalink") abstract  def errorLoggingVerbosity: [ErrorLoggingVerbosity](ParserSettings$$ErrorLoggingVerbosity.html)Definition ClassesParserSettings → Settings
8. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#headerValueCacheLimit(headerName:String):Int "Permalink") abstract  def headerValueCacheLimit(headerName: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSettings
9. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#headerValueCacheLimits:Map[String,Int] "Permalink") abstract  def headerValueCacheLimits: Map\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
10. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#ignoreIllegalHeaderFor:Set[String] "Permalink") abstract  def ignoreIllegalHeaderFor: Set\[String]Definition ClassesParserSettings → Settings
11. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#illegalHeaderWarnings:Boolean "Permalink") abstract  def illegalHeaderWarnings: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesParserSettings → Settings → Settings
12. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#illegalResponseHeaderNameProcessingMode:akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode "Permalink") abstract  def illegalResponseHeaderNameProcessingMode: [IllegalResponseHeaderNameProcessingMode](ParserSettings$$IllegalResponseHeaderNameProcessingMode.html)Definition ClassesParserSettings → Settings → Settings
13. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#illegalResponseHeaderValueProcessingMode:akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode "Permalink") abstract  def illegalResponseHeaderValueProcessingMode: [IllegalResponseHeaderValueProcessingMode](ParserSettings$$IllegalResponseHeaderValueProcessingMode.html)Definition ClassesParserSettings → Settings → Settings
14. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#includeSslSessionAttribute:Boolean "Permalink") abstract  def includeSslSessionAttribute: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
15. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#includeTlsSessionInfoHeader:Boolean "Permalink") abstract  def includeTlsSessionInfoHeader: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
16. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#maxChunkExtLength:Int "Permalink") abstract  def maxChunkExtLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
17. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#maxChunkSize:Int "Permalink") abstract  def maxChunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
18. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#maxCommentParsingDepth:Int "Permalink") abstract  def maxCommentParsingDepth: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → Settings
19. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#maxContentLength:Long "Permalink") abstract  def maxContentLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
20. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#maxHeaderCount:Int "Permalink") abstract  def maxHeaderCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → Settings
21. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#maxHeaderNameLength:Int "Permalink") abstract  def maxHeaderNameLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → Settings
22. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#maxHeaderValueLength:Int "Permalink") abstract  def maxHeaderValueLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → Settings
23. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#maxMethodLength:Int "Permalink") abstract  def maxMethodLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
24. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#maxResponseReasonLength:Int "Permalink") abstract  def maxResponseReasonLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
25. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#maxToStrictBytes:Long "Permalink") abstract  def maxToStrictBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
26. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#maxUriLength:Int "Permalink") abstract  def maxUriLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
27. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#modeledHeaderParsing:Boolean "Permalink") abstract  def modeledHeaderParsing: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesParserSettings → Settings
28. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#uriParsingMode:akka.http.scaladsl.model.Uri.ParsingMode "Permalink") abstract  def uriParsingMode: [ParsingMode](../model/Uri$$ParsingMode.html)Definition ClassesParserSettings → Settings
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ParserSettings toany2stringadd\[ParserSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ParserSettings, B)ImplicitThis member is added by an implicit conversion from ParserSettings toArrowAssoc\[ParserSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ParserSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ParserSettingsImplicitThis member is added by an implicit conversion from ParserSettings toEnsuring\[ParserSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ParserSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettingsImplicitThis member is added by an implicit conversion from ParserSettings toEnsuring\[ParserSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ParserSettingsImplicitThis member is added by an implicit conversion from ParserSettings toEnsuring\[ParserSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettingsImplicitThis member is added by an implicit conversion from ParserSettings toEnsuring\[ParserSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getConflictingContentTypeHeaderProcessingMode:akka.http.scaladsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode "Permalink")  def getConflictingContentTypeHeaderProcessingMode: [ConflictingContentTypeHeaderProcessingMode](ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
16. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getCookieParsingMode:akka.http.scaladsl.settings.ParserSettings.CookieParsingMode "Permalink")  def getCookieParsingMode: [CookieParsingMode](ParserSettings$$CookieParsingMode.html)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
17. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getCustomMediaTypes:akka.japi.function.Function2[String,String,java.util.Optional[akka.http.javadsl.model.MediaType]] "Permalink")  def getCustomMediaTypes: [Function2](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function2.html#akka.japi.function.Function2)\[String, String, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[MediaType](../../javadsl/model/MediaType.html)]]Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
18. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getCustomMethods:java.util.function.Function[String,java.util.Optional[akka.http.javadsl.model.HttpMethod]] "Permalink")  def getCustomMethods: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[HttpMethod](../../javadsl/model/HttpMethod.html)]]Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
19. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getCustomStatusCodes:java.util.function.Function[Int,java.util.Optional[akka.http.javadsl.model.StatusCode]] "Permalink")  def getCustomStatusCodes: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[StatusCode](../../javadsl/model/StatusCode.html)]]Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
20. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getErrorLoggingVerbosity:akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity "Permalink")  def getErrorLoggingVerbosity: [ErrorLoggingVerbosity](ParserSettings$$ErrorLoggingVerbosity.html)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
21. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getHeaderValueCacheLimits:java.util.Map[String,Int] "Permalink")  def getHeaderValueCacheLimits: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
22. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getIgnoreIllegalHeaderFor:Set[String] "Permalink")  def getIgnoreIllegalHeaderFor: Set\[String]Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
23. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getIllegalHeaderWarnings:Boolean "Permalink")  def getIllegalHeaderWarnings: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
24. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getIllegalResponseHeaderNameProcessingMode:akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode "Permalink")  def getIllegalResponseHeaderNameProcessingMode: [IllegalResponseHeaderNameProcessingMode](ParserSettings$$IllegalResponseHeaderNameProcessingMode.html)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
25. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getIllegalResponseHeaderValueProcessingMode:akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode "Permalink")  def getIllegalResponseHeaderValueProcessingMode: [IllegalResponseHeaderValueProcessingMode](ParserSettings$$IllegalResponseHeaderValueProcessingMode.html)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
26. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getIncludeSslSessionAttribute:Boolean "Permalink")  def getIncludeSslSessionAttribute: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
27. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getIncludeTlsSessionInfoHeader:Boolean "Permalink")  def getIncludeTlsSessionInfoHeader: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
28. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getMaxChunkExtLength:Int "Permalink")  def getMaxChunkExtLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
29. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getMaxChunkSize:Int "Permalink")  def getMaxChunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
30. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getMaxCommentParsingDepth:Int "Permalink")  def getMaxCommentParsingDepth: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
31. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getMaxContentLength:Long "Permalink")  def getMaxContentLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
32. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getMaxHeaderCount:Int "Permalink")  def getMaxHeaderCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
33. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getMaxHeaderNameLength:Int "Permalink")  def getMaxHeaderNameLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
34. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getMaxHeaderValueLength:Int "Permalink")  def getMaxHeaderValueLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
35. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getMaxMethodLength:Int "Permalink")  def getMaxMethodLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
36. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getMaxResponseReasonLength:Int "Permalink")  def getMaxResponseReasonLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
37. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getMaxToStrictBytes:Long "Permalink")  def getMaxToStrictBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
38. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getMaxUriLength:Int "Permalink")  def getMaxUriLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
39. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getModeledHeaderParsing:Boolean "Permalink")  def getModeledHeaderParsing: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
40. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#getUriParsingMode:akka.http.javadsl.model.Uri.ParsingMode "Permalink")  def getUriParsingMode: ParsingModeDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
41. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
42. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
43. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
44. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
45. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
46. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
47. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
48. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
49. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
50. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
51. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withConflictingContentTypeHeaderProcessingMode(newValue:akka.http.scaladsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withConflictingContentTypeHeaderProcessingMode(newValue: [ConflictingContentTypeHeaderProcessingMode](ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html)): ParserSettings
52. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withCookieParsingMode(newValue:akka.http.scaladsl.settings.ParserSettings.CookieParsingMode):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withCookieParsingMode(newValue: [CookieParsingMode](ParserSettings$$CookieParsingMode.html)): ParserSettings
53. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withCookieParsingMode(newValue:akka.http.javadsl.settings.ParserSettings.CookieParsingMode):akka.http.javadsl.settings.ParserSettings "Permalink")  def withCookieParsingMode(newValue: [CookieParsingMode](../../javadsl/settings/ParserSettings$$CookieParsingMode.html)): [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)Definition Classes[ParserSettings](../../javadsl/settings/ParserSettings.html)
54. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withCustomMediaTypes(types:akka.http.scaladsl.model.MediaType*):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withCustomMediaTypes(types: [MediaType](../model/MediaType.html)\*): ParserSettings
55. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withCustomMediaTypes(mediaTypes:akka.http.javadsl.model.MediaType*):akka.http.javadsl.settings.ParserSettings "Permalink")  def withCustomMediaTypes(mediaTypes: [MediaType](../../javadsl/model/MediaType.html)\*): [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)Definition Classes[ParserSettings](../../javadsl/settings/ParserSettings.html)Annotations@varargs()
56. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withCustomMethods(methods:akka.http.scaladsl.model.HttpMethod*):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withCustomMethods(methods: [HttpMethod](../model/HttpMethod.html)\*): ParserSettings
57. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withCustomMethods(methods:akka.http.javadsl.model.HttpMethod*):akka.http.javadsl.settings.ParserSettings "Permalink")  def withCustomMethods(methods: [HttpMethod](../../javadsl/model/HttpMethod.html)\*): [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)Definition Classes[ParserSettings](../../javadsl/settings/ParserSettings.html)Annotations@varargs()
58. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withCustomStatusCodes(codes:akka.http.scaladsl.model.StatusCode*):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withCustomStatusCodes(codes: [StatusCode](../model/StatusCode.html)\*): ParserSettings
59. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withCustomStatusCodes(codes:akka.http.javadsl.model.StatusCode*):akka.http.javadsl.settings.ParserSettings "Permalink")  def withCustomStatusCodes(codes: [StatusCode](../../javadsl/model/StatusCode.html)\*): [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)Definition Classes[ParserSettings](../../javadsl/settings/ParserSettings.html)Annotations@varargs()
60. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withErrorLoggingVerbosity(newValue:akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withErrorLoggingVerbosity(newValue: [ErrorLoggingVerbosity](ParserSettings$$ErrorLoggingVerbosity.html)): ParserSettings
61. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withErrorLoggingVerbosity(newValue:akka.http.javadsl.settings.ParserSettings.ErrorLoggingVerbosity):akka.http.javadsl.settings.ParserSettings "Permalink")  def withErrorLoggingVerbosity(newValue: [ErrorLoggingVerbosity](../../javadsl/settings/ParserSettings$$ErrorLoggingVerbosity.html)): [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)Definition Classes[ParserSettings](../../javadsl/settings/ParserSettings.html)
62. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withHeaderValueCacheLimits(newValue:Map[String,Int]):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withHeaderValueCacheLimits(newValue: Map\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): ParserSettings
63. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withHeaderValueCacheLimits(newValue:java.util.Map[String,Int]):akka.http.javadsl.settings.ParserSettings "Permalink")  def withHeaderValueCacheLimits(newValue: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)Definition Classes[ParserSettings](../../javadsl/settings/ParserSettings.html)
64. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withIgnoreIllegalHeaderFor(newValue:List[String]):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withIgnoreIllegalHeaderFor(newValue: List\[String]): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
65. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withIllegalHeaderWarnings(newValue:Boolean):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withIllegalHeaderWarnings(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
66. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withIllegalResponseHeaderNameProcessingMode(newValue:akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withIllegalResponseHeaderNameProcessingMode(newValue: [IllegalResponseHeaderNameProcessingMode](ParserSettings$$IllegalResponseHeaderNameProcessingMode.html)): ParserSettings
67. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withIllegalResponseHeaderValueProcessingMode(newValue:akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withIllegalResponseHeaderValueProcessingMode(newValue: [IllegalResponseHeaderValueProcessingMode](ParserSettings$$IllegalResponseHeaderValueProcessingMode.html)): ParserSettings
68. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withIncludeSslSessionAttribute(newValue:Boolean):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withIncludeSslSessionAttribute(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
69. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withIncludeTlsSessionInfoHeader(newValue:Boolean):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withIncludeTlsSessionInfoHeader(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
70. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxChunkExtLength(newValue:Int):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxChunkExtLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
71. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxChunkSize(newValue:Int):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxChunkSize(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
72. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxCommentParsingDepth(newValue:Int):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxCommentParsingDepth(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
73. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxContentLength(newValue:Option[Long]):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxContentLength(newValue: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]): ParserSettings
74. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxContentLength(newValue:Long):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxContentLength(newValue: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
75. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxHeaderCount(newValue:Int):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxHeaderCount(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
76. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxHeaderNameLength(newValue:Int):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxHeaderNameLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
77. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxHeaderValueLength(newValue:Int):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxHeaderValueLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
78. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxMethodLength(newValue:Int):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxMethodLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
79. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxResponseReasonLength(newValue:Int):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxResponseReasonLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
80. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxToStrictBytes(newValue:Long):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxToStrictBytes(newValue: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
81. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withMaxUriLength(newValue:Int):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withMaxUriLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
82. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withModeledHeaderParsing(newValue:Boolean):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withModeledHeaderParsing(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettingsDefinition ClassesParserSettings → [ParserSettings](../../javadsl/settings/ParserSettings.html)
83. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withUriParsingMode(newValue:akka.http.scaladsl.model.Uri.ParsingMode):akka.http.scaladsl.settings.ParserSettings "Permalink")  def withUriParsingMode(newValue: [ParsingMode](../model/Uri$$ParsingMode.html)): ParserSettings
84. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#withUriParsingMode(newValue:akka.http.javadsl.model.Uri.ParsingMode):akka.http.javadsl.settings.ParserSettings "Permalink")  def withUriParsingMode(newValue: ParsingMode): [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)Definition Classes[ParserSettings](../../javadsl/settings/ParserSettings.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ParserSettings toStringFormat\[ParserSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/settings/ParserSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ParserSettings, B)ImplicitThis member is added by an implicit conversion from ParserSettings toArrowAssoc\[ParserSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.settings.ParserSettings](../../javadsl/settings/ParserSettings.html)

### Inherited from Settings

### Inherited from Settings

### Inherited from Settings

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromParserSettings to any2stringadd\[ParserSettings]

### Inherited by implicit conversion StringFormat fromParserSettings to StringFormat\[ParserSettings]

### Inherited by implicit conversion Ensuring fromParserSettings to Ensuring\[ParserSettings]

### Inherited by implicit conversion ArrowAssoc fromParserSettings to ArrowAssoc\[ParserSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings$$ErrorLoggingVerbosity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaTypes$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$ParsingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/CorsSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$$CookieParsingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/RoutingSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html)*