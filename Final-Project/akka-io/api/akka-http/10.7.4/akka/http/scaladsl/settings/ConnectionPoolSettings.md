---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ConnectionPoolSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ConnectionPoolSettings
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ConnectionPoolSettings

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.settings.ConnectionPoolSettings

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](index.html)Definition Classes[scaladsl](../index.html)
- [ClientConnectionSettings](ClientConnectionSettings.html "Public API but not intended for subclassing")
- ConnectionPoolSettings
- [CorsSettings](CorsSettings.html "Settings for the CORS support")
- [Http2ClientSettings](Http2ClientSettings.html)
- [Http2ServerSettings](Http2ServerSettings.html)
- [HttpsProxySettings](HttpsProxySettings.html "Public API but not intended for subclassing")
- [ParserSettings](ParserSettings.html "Public API but not intended for subclassing")
- [PreviewServerSettings](PreviewServerSettings.html "Public API but not intended for subclassing")
- [RoutingSettings](RoutingSettings.html "Public API but not intended for subclassing")
- [ServerSentEventSettings](ServerSentEventSettings.html "Public API but not intended for subclassing")
- [ServerSettings](ServerSettings.html "Public API but not intended for subclassing")
- [WebSocketSettings](WebSocketSettings.html)
[c](ConnectionPoolSettings$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[settings](index.html)

# [ConnectionPoolSettings](ConnectionPoolSettings$.html "See companion object")[**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html "Permalink")

### Companion [object ConnectionPoolSettings](ConnectionPoolSettings$.html "See companion object")

#### abstract  class ConnectionPoolSettings extends [javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)

Public API but not intended for subclassing

Self TypeConnectionPoolSettingsImplAnnotations@DoNotInherit() Source[ConnectionPoolSettings.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/settings/ConnectionPoolSettings.scala#L22)Linear Supertypes[javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConnectionPoolSettings
2. ConnectionPoolSettings
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#<init>():akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  new ConnectionPoolSettings()
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#baseConnectionBackoff:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def baseConnectionBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
2. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#connectionSettings:akka.http.scaladsl.settings.ClientConnectionSettings "Permalink") abstract  def connectionSettings: [ClientConnectionSettings](ClientConnectionSettings.html)
3. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#idleTimeout:scala.concurrent.duration.Duration "Permalink") abstract  def idleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
4. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#keepAliveTimeout:scala.concurrent.duration.Duration "Permalink") abstract  def keepAliveTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
5. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#maxConnectionBackoff:scala.concurrent.duration.FiniteDuration "Permalink") abstract  def maxConnectionBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
6. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#maxConnectionLifetime:scala.concurrent.duration.Duration "Permalink") abstract  def maxConnectionLifetime: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)
7. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#maxConnections:Int "Permalink") abstract  def maxConnections: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
8. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#maxOpenRequests:Int "Permalink") abstract  def maxOpenRequests: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
9. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#maxRetries:Int "Permalink") abstract  def maxRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
10. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#minConnections:Int "Permalink") abstract  def minConnections: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
11. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#pipeliningLimit:Int "Permalink") abstract  def pipeliningLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
12. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#responseEntitySubscriptionTimeout:scala.concurrent.duration.Duration "Permalink") abstract  def responseEntitySubscriptionTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)The time after which the pool will drop an entity automatically if it wasn't read or discarded

The time after which the pool will drop an entity automatically if it wasn't read or discarded

Annotations@ApiMayChange()
13. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withUpdatedConnectionSettings(f:akka.http.scaladsl.settings.ClientConnectionSettings=>akka.http.scaladsl.settings.ClientConnectionSettings):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink") abstract  def withUpdatedConnectionSettings(f: ([ClientConnectionSettings](ClientConnectionSettings.html)) \=\> [ClientConnectionSettings](ClientConnectionSettings.html)): ConnectionPoolSettings
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toany2stringadd\[ConnectionPoolSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ConnectionPoolSettings, B)ImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toArrowAssoc\[ConnectionPoolSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#appendHostOverride(hostPattern:String,settings:akka.http.scaladsl.settings.ConnectionPoolSettings):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def appendHostOverride(hostPattern: String, settings: ConnectionPoolSettings): ConnectionPoolSettingsAnnotations@ApiMayChange()
7. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#appendHostOverride(hostPattern:String,settings:akka.http.javadsl.settings.ConnectionPoolSettings):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink")  def appendHostOverride(hostPattern: String, settings: [javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)): [javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)Annotations@ApiMayChange()
8. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ConnectionPoolSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConnectionPoolSettingsImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toEnsuring\[ConnectionPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ConnectionPoolSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConnectionPoolSettingsImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toEnsuring\[ConnectionPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ConnectionPoolSettingsImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toEnsuring\[ConnectionPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ConnectionPoolSettingsImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toEnsuring\[ConnectionPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getBaseConnectionBackoff:scala.concurrent.duration.FiniteDuration "Permalink")  def getBaseConnectionBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
17. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getConnectionSettings:akka.http.javadsl.settings.ClientConnectionSettings "Permalink")  def getConnectionSettings: [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
19. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getIdleTimeout:scala.concurrent.duration.Duration "Permalink")  def getIdleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
20. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getKeepAliveTimeout:scala.concurrent.duration.Duration "Permalink")  def getKeepAliveTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
21. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getMaxConnectionBackoff:scala.concurrent.duration.FiniteDuration "Permalink")  def getMaxConnectionBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
22. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getMaxConnectionLifetime:java.time.Duration "Permalink")  def getMaxConnectionLifetime: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
23. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getMaxConnections:Int "Permalink")  def getMaxConnections: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
24. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getMaxOpenRequests:Int "Permalink")  def getMaxOpenRequests: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
25. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getMaxRetries:Int "Permalink")  def getMaxRetries: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
26. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getMinConnections:Int "Permalink")  def getMinConnections: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
27. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getPipeliningLimit:Int "Permalink")  def getPipeliningLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
28. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#getResponseEntitySubscriptionTimeout:scala.concurrent.duration.Duration "Permalink")  def getResponseEntitySubscriptionTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)Annotations@ApiMayChange()
29. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
31. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
32. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
35. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
36. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
37. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
38. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
39. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withBaseConnectionBackoff(newValue:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withBaseConnectionBackoff(newValue: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConnectionPoolSettingsDefinition ClassesConnectionPoolSettings → [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
40. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withConnectionSettings(newValue:akka.http.scaladsl.settings.ClientConnectionSettings):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withConnectionSettings(newValue: [ClientConnectionSettings](ClientConnectionSettings.html)): ConnectionPoolSettings
41. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withConnectionSettings(newValue:akka.http.javadsl.settings.ClientConnectionSettings):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink")  def withConnectionSettings(newValue: [javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html)): [javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
42. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withHostOverrides(hostOverrides:Seq[(String,akka.http.scaladsl.settings.ConnectionPoolSettings)]):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withHostOverrides(hostOverrides: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[(String, ConnectionPoolSettings)]): ConnectionPoolSettingsAnnotations@ApiMayChange()
43. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withHostOverrides(hostOverrides:java.util.List[(String,akka.http.javadsl.settings.ConnectionPoolSettings)]):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink")  def withHostOverrides(hostOverrides: [List](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#java.util.List)\[(String, [javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html))]): [javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)Annotations@ApiMayChange()
44. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withIdleTimeout(newValue:scala.concurrent.duration.Duration):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withIdleTimeout(newValue: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): ConnectionPoolSettingsDefinition ClassesConnectionPoolSettings → [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
45. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withKeepAliveTimeout(newValue:scala.concurrent.duration.Duration):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withKeepAliveTimeout(newValue: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): ConnectionPoolSettingsDefinition ClassesConnectionPoolSettings → [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
46. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withMaxConnectionBackoff(newValue:scala.concurrent.duration.FiniteDuration):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withMaxConnectionBackoff(newValue: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): ConnectionPoolSettingsDefinition ClassesConnectionPoolSettings → [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
47. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withMaxConnectionLifetime(newValue:scala.concurrent.duration.Duration):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withMaxConnectionLifetime(newValue: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): ConnectionPoolSettingsDefinition ClassesConnectionPoolSettings → [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
48. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withMaxConnections(n:Int):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withMaxConnections(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ConnectionPoolSettingsDefinition ClassesConnectionPoolSettings → [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
49. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withMaxOpenRequests(newValue:Int):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withMaxOpenRequests(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ConnectionPoolSettingsDefinition ClassesConnectionPoolSettings → [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
50. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withMaxRetries(n:Int):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withMaxRetries(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ConnectionPoolSettingsDefinition ClassesConnectionPoolSettings → [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
51. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withMinConnections(n:Int):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withMinConnections(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ConnectionPoolSettingsDefinition ClassesConnectionPoolSettings → [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
52. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withPipeliningLimit(newValue:Int):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withPipeliningLimit(newValue: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): ConnectionPoolSettingsClient\-side pipelining is not currently supported, see https://github.com/akka/akka\-http/issues/32

Client\-side pipelining is not currently supported, see https://github.com/akka/akka\-http/issues/32

Definition ClassesConnectionPoolSettings → [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
53. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withResponseEntitySubscriptionTimeout(newValue:scala.concurrent.duration.Duration):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withResponseEntitySubscriptionTimeout(newValue: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): ConnectionPoolSettingsDefinition ClassesConnectionPoolSettings → [ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)Annotations@ApiMayChange()
54. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withTransport(newValue:akka.http.scaladsl.ClientTransport):akka.http.scaladsl.settings.ConnectionPoolSettings "Permalink")  def withTransport(newValue: [ClientTransport](../ClientTransport.html)): ConnectionPoolSettingsSince 10\.1\.0, the transport is configured in [ClientConnectionSettings](ClientConnectionSettings.html).

Since 10\.1\.0, the transport is configured in [ClientConnectionSettings](ClientConnectionSettings.html). This method is a shortcut for
`withUpdatedConnectionSettings(_.withTransport(newTransport))`.
55. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#withTransport(newValue:akka.http.javadsl.ClientTransport):akka.http.javadsl.settings.ConnectionPoolSettings "Permalink")  def withTransport(newValue: [javadsl.ClientTransport](../../javadsl/ClientTransport.html)): [javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)Definition Classes[ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toStringFormat\[ConnectionPoolSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#transport:akka.http.scaladsl.ClientTransport "Permalink")  def transport: [ClientTransport](../ClientTransport.html)The underlying transport used to connect to hosts.

The underlying transport used to connect to hosts. By default [ClientTransport.TCP](../ClientTransport$.html#TCP:akka.http.scaladsl.ClientTransport) is used.

Annotations@deprecated Deprecated*(Since version 10\.1\.0\)* Deprecated in favor of connectionSettings.transport
4. [**](../../../../akka/http/scaladsl/settings/ConnectionPoolSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ConnectionPoolSettings, B)ImplicitThis member is added by an implicit conversion from ConnectionPoolSettings toArrowAssoc\[ConnectionPoolSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.settings.ConnectionPoolSettings](../../javadsl/settings/ConnectionPoolSettings.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromConnectionPoolSettings to any2stringadd\[ConnectionPoolSettings]

### Inherited by implicit conversion StringFormat fromConnectionPoolSettings to StringFormat\[ConnectionPoolSettings]

### Inherited by implicit conversion Ensuring fromConnectionPoolSettings to Ensuring\[ConnectionPoolSettings]

### Inherited by implicit conversion ArrowAssoc fromConnectionPoolSettings to ArrowAssoc\[ConnectionPoolSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport.html
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
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ConnectionPoolSettings.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ConnectionPoolSettings.html)*