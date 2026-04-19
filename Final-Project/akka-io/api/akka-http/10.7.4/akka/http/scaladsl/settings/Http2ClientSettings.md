---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.Http2ClientSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.Http2ClientSettings
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.settings.Http2ClientSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.settings.Http2ClientSettings

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
- Http2ClientSettings
- [Http2ServerSettings](Http2ServerSettings.html)
- [HttpsProxySettings](HttpsProxySettings.html "Public API but not intended for subclassing")
- [ParserSettings](ParserSettings.html "Public API but not intended for subclassing")
- [PreviewServerSettings](PreviewServerSettings.html "Public API but not intended for subclassing")
- [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing")
- [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing")
- [ServerSettings](ServerSettings.html "Public API but not intended for subclassing")
- [WebSocketSettings](WebSocketSettings.html)
[t](Http2ClientSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[settings](index.html)

# [Http2ClientSettings](Http2ClientSettings$.html "See companion object")[**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html "Permalink")

### Companion [object Http2ClientSettings](Http2ClientSettings$.html "See companion object")

#### trait Http2ClientSettings extends [javadsl.settings.Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html) with Http2CommonSettings

Self TypeHttp2ClientSettingsImplAnnotations@ApiMayChange() @DoNotInherit() Source[Http2ServerSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/settings/Http2ServerSettings.scala#L171)Linear SupertypesHttp2CommonSettings, [javadsl.settings.Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Http2ClientSettings
2. Http2CommonSettings
3. Http2ClientSettings
4. AnyRef
5. Any
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

1. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#baseConnectionBackoff:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def baseConnectionBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
2. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#completionTimeout:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def completionTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
3. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#goawayGracePeriod:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def goawayGracePeriod: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition ClassesHttp2ClientSettings → Http2CommonSettings
4. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#incomingConnectionLevelBufferSize:Int "Permalink") abstract  def incomingConnectionLevelBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesHttp2ClientSettings → Http2CommonSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
5. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#incomingStreamLevelBufferSize:Int "Permalink") abstract  def incomingStreamLevelBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesHttp2ClientSettings → Http2CommonSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
6. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#logFrames:Boolean "Permalink") abstract  def logFrames: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesHttp2ClientSettings → Http2CommonSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
7. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#maxConcurrentStreams:Int "Permalink") abstract  def maxConcurrentStreams: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesHttp2ClientSettings → Http2CommonSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
8. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#maxConnectionBackoff:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def maxConnectionBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
9. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#maxPersistentAttempts:Int "Permalink") abstract  def maxPersistentAttempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
10. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#outgoingControlFrameBufferSize:Int "Permalink") abstract  def outgoingControlFrameBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesHttp2ClientSettings → Http2CommonSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
11. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#pingInterval:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def pingInterval: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition ClassesHttp2ClientSettings → Http2CommonSettings
12. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#pingTimeout:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def pingTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition ClassesHttp2ClientSettings → Http2CommonSettings
13. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#requestEntityChunkSize:Int "Permalink") abstract  def requestEntityChunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesHttp2ClientSettings → Http2CommonSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Http2ClientSettings toany2stringadd\[Http2ClientSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Http2ClientSettings, B)ImplicitThis member is added by an implicit conversion from Http2ClientSettings toArrowAssoc\[Http2ClientSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Http2ClientSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Http2ClientSettingsImplicitThis member is added by an implicit conversion from Http2ClientSettings toEnsuring\[Http2ClientSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Http2ClientSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Http2ClientSettingsImplicitThis member is added by an implicit conversion from Http2ClientSettings toEnsuring\[Http2ClientSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Http2ClientSettingsImplicitThis member is added by an implicit conversion from Http2ClientSettings toEnsuring\[Http2ClientSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Http2ClientSettingsImplicitThis member is added by an implicit conversion from Http2ClientSettings toEnsuring\[Http2ClientSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#getBaseConnectionBackoff:java.time.Duration "Permalink")  def getBaseConnectionBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
15. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#getCompletionTimeout:java.time.Duration "Permalink")  def getCompletionTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
17. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#getGoawayGracePeriod:java.time.Duration "Permalink")  def getGoawayGracePeriod: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
18. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#getMaxConnectionBackoff:java.time.Duration "Permalink")  def getMaxConnectionBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
19. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#getMaxPersistentAttempts:Int "Permalink")  def getMaxPersistentAttempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
20. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#getPingInterval:java.time.Duration "Permalink")  def getPingInterval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
21. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#getPingTimeout:java.time.Duration "Permalink")  def getPingTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
22. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#minCollectStrictEntitySize:Int "Permalink")  def minCollectStrictEntitySize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesHttp2ClientSettings → Http2CommonSettings
25. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withBaseConnectionBackoff(backoff:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withBaseConnectionBackoff(backoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): Http2ClientSettings
34. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withBaseConnectionBackoff(backoff:java.time.Duration):akka.http.javadsl.settings.Http2ClientSettings "Permalink")  def withBaseConnectionBackoff(backoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [javadsl.settings.Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
35. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withCompletionTimeout(timeout:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withCompletionTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): Http2ClientSettings
36. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withCompletionTimeout(timeout:java.time.Duration):akka.http.javadsl.settings.Http2ClientSettings "Permalink")  def withCompletionTimeout(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [javadsl.settings.Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
37. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withGoawayGracePeriod(duration:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withGoawayGracePeriod(duration: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): Http2ClientSettings
38. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withGoawayGracePeriod(duration:java.time.Duration):akka.http.javadsl.settings.Http2ClientSettings "Permalink")  def withGoawayGracePeriod(duration: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [javadsl.settings.Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
39. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withIncomingConnectionLevelBufferSize(newValue:Int):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withIncomingConnectionLevelBufferSize(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ClientSettingsDefinition ClassesHttp2ClientSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
40. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withIncomingStreamLevelBufferSize(newValue:Int):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withIncomingStreamLevelBufferSize(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ClientSettingsDefinition ClassesHttp2ClientSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
41. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withLogFrames(shouldLog:Boolean):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withLogFrames(shouldLog: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Http2ClientSettingsDefinition ClassesHttp2ClientSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
42. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withMaxConcurrentStreams(newValue:Int):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withMaxConcurrentStreams(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ClientSettingsDefinition ClassesHttp2ClientSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
43. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withMaxConnectionBackoff(backoff:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withMaxConnectionBackoff(backoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): Http2ClientSettings
44. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withMaxConnectionBackoff(backoff:java.time.Duration):akka.http.javadsl.settings.Http2ClientSettings "Permalink")  def withMaxConnectionBackoff(backoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [javadsl.settings.Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
45. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withMaxPersistentAttempts(max:Int):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withMaxPersistentAttempts(max: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ClientSettingsDefinition ClassesHttp2ClientSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
46. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withOutgoingControlFrameBufferSize(newValue:Int):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withOutgoingControlFrameBufferSize(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ClientSettingsDefinition ClassesHttp2ClientSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
47. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withPingInterval(time:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withPingInterval(time: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): Http2ClientSettings
48. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withPingInterval(interval:java.time.Duration):akka.http.javadsl.settings.Http2ClientSettings "Permalink")  def withPingInterval(interval: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [javadsl.settings.Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
49. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withPingTimeout(timeout:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withPingTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): Http2ClientSettings
50. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withPingTimeout(timeout:java.time.Duration):akka.http.javadsl.settings.Http2ClientSettings "Permalink")  def withPingTimeout(timeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [javadsl.settings.Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)Definition Classes[Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
51. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#withRequestEntityChunkSize(newValue:Int):akka.http.scaladsl.settings.Http2ClientSettings "Permalink")  def withRequestEntityChunkSize(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Http2ClientSettingsDefinition ClassesHttp2ClientSettings → [Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Http2ClientSettings toStringFormat\[Http2ClientSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/settings/Http2ClientSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Http2ClientSettings, B)ImplicitThis member is added by an implicit conversion from Http2ClientSettings toArrowAssoc\[Http2ClientSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from Http2CommonSettings

### Inherited from [javadsl.settings.Http2ClientSettings](../../javadsl/settings/Http2ClientSettings.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttp2ClientSettings to any2stringadd\[Http2ClientSettings]

### Inherited by implicit conversion StringFormat fromHttp2ClientSettings to StringFormat\[Http2ClientSettings]

### Inherited by implicit conversion Ensuring fromHttp2ClientSettings to Ensuring\[Http2ClientSettings]

### Inherited by implicit conversion ArrowAssoc fromHttp2ClientSettings to ArrowAssoc\[Http2ClientSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ClientConnectionSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ConnectionPoolSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/CorsSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/CorsSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ClientSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ClientSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/HttpsProxySettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/HttpsProxySettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/PreviewServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/PreviewServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSentEventSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSentEventSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/WebSocketSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ClientSettings.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/Http2ClientSettings.html)*