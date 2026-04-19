---
description: Akka HTTP 10.7.4 - akka.http.javadsl.settings.ParserSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:11:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.settings.ParserSettings
---

# Akka HTTP 10.7.4 - akka.http.javadsl.settings.ParserSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.settings.ParserSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[javadsl](../index.html)
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
- [SettingsCompanion](SettingsCompanion.html)
- [WebSocketSettings](WebSocketSettings.html "Public API but not intended for subclassing")
[c](ParserSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[settings](index.html)

# [ParserSettings](ParserSettings$.html "See companion object")[**](../../../../akka/http/javadsl/settings/ParserSettings.html "Permalink")

### Companion [object ParserSettings](ParserSettings$.html "See companion object")

#### abstract  class ParserSettings extends Settings

Public API but not intended for subclassing

Self TypeParserSettingsImplAnnotations@DoNotInherit() Source[ParserSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/settings/ParserSettings.scala#L27)Linear SupertypesSettings, Settings, Settings, [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ParserSettings](../../scaladsl/settings/ParserSettings.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ParserSettings
2. Settings
3. Settings
4. Settings
5. AnyRef
6. Any
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

1. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#cookieParsingMode:akka.http.scaladsl.settings.ParserSettings.CookieParsingMode "Permalink") abstract  def cookieParsingMode: [CookieParsingMode](../../scaladsl/settings/ParserSettings$$CookieParsingMode.html)Definition ClassesSettings
2. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#customMediaTypes:akka.http.scaladsl.model.MediaTypes.FindCustom "Permalink") abstract  def customMediaTypes: [FindCustom](../../scaladsl/model/MediaTypes$.html#FindCustom=(String,String)=>Option[akka.http.scaladsl.model.MediaType])Definition ClassesSettings → Settings
3. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#defaultHeaderValueCacheLimit:Int "Permalink") abstract  def defaultHeaderValueCacheLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSettings
4. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#errorLoggingVerbosity:akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity "Permalink") abstract  def errorLoggingVerbosity: [ErrorLoggingVerbosity](../../scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html)Definition ClassesSettings
5. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getConflictingContentTypeHeaderProcessingMode:akka.http.javadsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode "Permalink") abstract  def getConflictingContentTypeHeaderProcessingMode: [ConflictingContentTypeHeaderProcessingMode](ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html)
6. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getCookieParsingMode:akka.http.javadsl.settings.ParserSettings.CookieParsingMode "Permalink") abstract  def getCookieParsingMode: [CookieParsingMode](ParserSettings$$CookieParsingMode.html)
7. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getCustomMediaTypes:akka.japi.function.Function2[String,String,java.util.Optional[akka.http.javadsl.model.MediaType]] "Permalink") abstract  def getCustomMediaTypes: [Function2](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function2.html#akka.japi.function.Function2)\[String, String, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[MediaType](../model/MediaType.html)]]
8. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getCustomMethods:java.util.function.Function[String,java.util.Optional[akka.http.javadsl.model.HttpMethod]] "Permalink") abstract  def getCustomMethods: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[String, [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[HttpMethod](../model/HttpMethod.html)]]
9. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getCustomStatusCodes:java.util.function.Function[Int,java.util.Optional[akka.http.javadsl.model.StatusCode]] "Permalink") abstract  def getCustomStatusCodes: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[StatusCode](../model/StatusCode.html)]]
10. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getErrorLoggingVerbosity:akka.http.javadsl.settings.ParserSettings.ErrorLoggingVerbosity "Permalink") abstract  def getErrorLoggingVerbosity: [ErrorLoggingVerbosity](ParserSettings$$ErrorLoggingVerbosity.html)
11. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getHeaderValueCacheLimits:java.util.Map[String,Int] "Permalink") abstract  def getHeaderValueCacheLimits: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
12. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getIgnoreIllegalHeaderFor:Set[String] "Permalink") abstract  def getIgnoreIllegalHeaderFor: Set\[String]
13. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getIllegalHeaderWarnings:Boolean "Permalink") abstract  def getIllegalHeaderWarnings: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
14. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getIllegalResponseHeaderNameProcessingMode:akka.http.javadsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode "Permalink") abstract  def getIllegalResponseHeaderNameProcessingMode: [IllegalResponseHeaderNameProcessingMode](ParserSettings$$IllegalResponseHeaderNameProcessingMode.html)
15. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getIllegalResponseHeaderValueProcessingMode:akka.http.javadsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode "Permalink") abstract  def getIllegalResponseHeaderValueProcessingMode: [IllegalResponseHeaderValueProcessingMode](ParserSettings$$IllegalResponseHeaderValueProcessingMode.html)
16. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getIncludeSslSessionAttribute:Boolean "Permalink") abstract  def getIncludeSslSessionAttribute: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
17. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getIncludeTlsSessionInfoHeader:Boolean "Permalink") abstract  def getIncludeTlsSessionInfoHeader: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
18. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getMaxChunkExtLength:Int "Permalink") abstract  def getMaxChunkExtLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
19. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getMaxChunkSize:Int "Permalink") abstract  def getMaxChunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
20. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getMaxCommentParsingDepth:Int "Permalink") abstract  def getMaxCommentParsingDepth: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
21. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getMaxContentLength:Long "Permalink") abstract  def getMaxContentLength: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
22. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getMaxHeaderCount:Int "Permalink") abstract  def getMaxHeaderCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
23. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getMaxHeaderNameLength:Int "Permalink") abstract  def getMaxHeaderNameLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
24. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getMaxHeaderValueLength:Int "Permalink") abstract  def getMaxHeaderValueLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
25. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getMaxMethodLength:Int "Permalink") abstract  def getMaxMethodLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
26. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getMaxResponseReasonLength:Int "Permalink") abstract  def getMaxResponseReasonLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
27. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getMaxToStrictBytes:Long "Permalink") abstract  def getMaxToStrictBytes: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
28. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getMaxUriLength:Int "Permalink") abstract  def getMaxUriLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
29. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getModeledHeaderParsing:Boolean "Permalink") abstract  def getModeledHeaderParsing: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
30. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getUriParsingMode:akka.http.javadsl.model.Uri.ParsingMode "Permalink") abstract  def getUriParsingMode: ParsingMode
31. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#headerValueCacheLimit(headerName:String):Int "Permalink") abstract  def headerValueCacheLimit(headerName: String): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSettings
32. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#headerValueCacheLimits:Map[String,Int] "Permalink") abstract  def headerValueCacheLimits: Map\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]
33. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#ignoreIllegalHeaderFor:Set[String] "Permalink") abstract  def ignoreIllegalHeaderFor: Set\[String]Definition ClassesSettings
34. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#illegalHeaderWarnings:Boolean "Permalink") abstract  def illegalHeaderWarnings: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSettings → Settings
35. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#illegalResponseHeaderNameProcessingMode:akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode "Permalink") abstract  def illegalResponseHeaderNameProcessingMode: [IllegalResponseHeaderNameProcessingMode](../../scaladsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode.html)Definition ClassesSettings → Settings
36. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#illegalResponseHeaderValueProcessingMode:akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode "Permalink") abstract  def illegalResponseHeaderValueProcessingMode: [IllegalResponseHeaderValueProcessingMode](../../scaladsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode.html)Definition ClassesSettings → Settings
37. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#maxCommentParsingDepth:Int "Permalink") abstract  def maxCommentParsingDepth: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSettings
38. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#maxHeaderCount:Int "Permalink") abstract  def maxHeaderCount: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSettings
39. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#maxHeaderNameLength:Int "Permalink") abstract  def maxHeaderNameLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSettings
40. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#maxHeaderValueLength:Int "Permalink") abstract  def maxHeaderValueLength: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSettings
41. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#modeledHeaderParsing:Boolean "Permalink") abstract  def modeledHeaderParsing: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesSettings
42. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#uriParsingMode:akka.http.scaladsl.model.Uri.ParsingMode "Permalink") abstract  def uriParsingMode: [ParsingMode](../../scaladsl/model/Uri$$ParsingMode.html)Definition ClassesSettings
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/settings/ParserSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ParserSettings toany2stringadd\[ParserSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ParserSettings, B)ImplicitThis member is added by an implicit conversion from ParserSettings toArrowAssoc\[ParserSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ParserSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ParserSettingsImplicitThis member is added by an implicit conversion from ParserSettings toEnsuring\[ParserSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ParserSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettingsImplicitThis member is added by an implicit conversion from ParserSettings toEnsuring\[ParserSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ParserSettingsImplicitThis member is added by an implicit conversion from ParserSettings toEnsuring\[ParserSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettingsImplicitThis member is added by an implicit conversion from ParserSettings toEnsuring\[ParserSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withCookieParsingMode(newValue:akka.http.javadsl.settings.ParserSettings.CookieParsingMode):akka.http.javadsl.settings.ParserSettings "Permalink")  def withCookieParsingMode(newValue: [CookieParsingMode](ParserSettings$$CookieParsingMode.html)): ParserSettings
26. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withCustomMediaTypes(mediaTypes:akka.http.javadsl.model.MediaType*):akka.http.javadsl.settings.ParserSettings "Permalink")  def withCustomMediaTypes(mediaTypes: [MediaType](../model/MediaType.html)\*): ParserSettingsAnnotations@varargs()
27. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withCustomMethods(methods:akka.http.javadsl.model.HttpMethod*):akka.http.javadsl.settings.ParserSettings "Permalink")  def withCustomMethods(methods: [HttpMethod](../model/HttpMethod.html)\*): ParserSettingsAnnotations@varargs()
28. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withCustomStatusCodes(codes:akka.http.javadsl.model.StatusCode*):akka.http.javadsl.settings.ParserSettings "Permalink")  def withCustomStatusCodes(codes: [StatusCode](../model/StatusCode.html)\*): ParserSettingsAnnotations@varargs()
29. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withErrorLoggingVerbosity(newValue:akka.http.javadsl.settings.ParserSettings.ErrorLoggingVerbosity):akka.http.javadsl.settings.ParserSettings "Permalink")  def withErrorLoggingVerbosity(newValue: [ErrorLoggingVerbosity](ParserSettings$$ErrorLoggingVerbosity.html)): ParserSettings
30. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withHeaderValueCacheLimits(newValue:java.util.Map[String,Int]):akka.http.javadsl.settings.ParserSettings "Permalink")  def withHeaderValueCacheLimits(newValue: [Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html#java.util.Map)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]): ParserSettings
31. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withIgnoreIllegalHeaderFor(newValue:List[String]):akka.http.javadsl.settings.ParserSettings "Permalink")  def withIgnoreIllegalHeaderFor(newValue: List\[String]): ParserSettings
32. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withIllegalHeaderWarnings(newValue:Boolean):akka.http.javadsl.settings.ParserSettings "Permalink")  def withIllegalHeaderWarnings(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettings
33. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withIncludeSslSessionAttribute(newValue:Boolean):akka.http.javadsl.settings.ParserSettings "Permalink")  def withIncludeSslSessionAttribute(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettings
34. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withIncludeTlsSessionInfoHeader(newValue:Boolean):akka.http.javadsl.settings.ParserSettings "Permalink")  def withIncludeTlsSessionInfoHeader(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettings
35. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withMaxChunkExtLength(newValue:Int):akka.http.javadsl.settings.ParserSettings "Permalink")  def withMaxChunkExtLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettings
36. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withMaxChunkSize(newValue:Int):akka.http.javadsl.settings.ParserSettings "Permalink")  def withMaxChunkSize(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettings
37. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withMaxCommentParsingDepth(newValue:Int):akka.http.javadsl.settings.ParserSettings "Permalink")  def withMaxCommentParsingDepth(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettings
38. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withMaxContentLength(newValue:Long):akka.http.javadsl.settings.ParserSettings "Permalink")  def withMaxContentLength(newValue: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): ParserSettings
39. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withMaxHeaderCount(newValue:Int):akka.http.javadsl.settings.ParserSettings "Permalink")  def withMaxHeaderCount(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettings
40. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withMaxHeaderNameLength(newValue:Int):akka.http.javadsl.settings.ParserSettings "Permalink")  def withMaxHeaderNameLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettings
41. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withMaxHeaderValueLength(newValue:Int):akka.http.javadsl.settings.ParserSettings "Permalink")  def withMaxHeaderValueLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettings
42. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withMaxMethodLength(newValue:Int):akka.http.javadsl.settings.ParserSettings "Permalink")  def withMaxMethodLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettings
43. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withMaxResponseReasonLength(newValue:Int):akka.http.javadsl.settings.ParserSettings "Permalink")  def withMaxResponseReasonLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettings
44. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withMaxToStrictBytes(newValue:Long):akka.http.javadsl.settings.ParserSettings "Permalink")  def withMaxToStrictBytes(newValue: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): ParserSettings
45. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withMaxUriLength(newValue:Int):akka.http.javadsl.settings.ParserSettings "Permalink")  def withMaxUriLength(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ParserSettings
46. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withModeledHeaderParsing(newValue:Boolean):akka.http.javadsl.settings.ParserSettings "Permalink")  def withModeledHeaderParsing(newValue: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ParserSettings
47. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#withUriParsingMode(newValue:akka.http.javadsl.model.Uri.ParsingMode):akka.http.javadsl.settings.ParserSettings "Permalink")  def withUriParsingMode(newValue: ParsingMode): ParserSettings
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ParserSettings toStringFormat\[ParserSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/settings/ParserSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ParserSettings, B)ImplicitThis member is added by an implicit conversion from ParserSettings toArrowAssoc\[ParserSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
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
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings$$ConflictingContentTypeHeaderProcessingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings$$CookieParsingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings$$ErrorLoggingVerbosity.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/RoutingSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/SettingsCompanion.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/WebSocketSettings$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaTypes$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$ParsingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$$CookieParsingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$$ErrorLoggingVerbosity.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderNameProcessingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings$$IllegalResponseHeaderValueProcessingMode.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ParserSettings.html)*