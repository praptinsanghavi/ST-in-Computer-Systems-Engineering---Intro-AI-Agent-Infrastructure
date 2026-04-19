---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.common.SSLContextFactory
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:44:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/SSLContextFactory$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.common.SSLContextFactory
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.common.SSLContextFactory

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.common.SSLContextFactory

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](index.html)Definition Classes[scaladsl](../index.html)
- [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html)
- [EntityStreamingSupport](EntityStreamingSupport.html "Entity streaming support trait allowing rendering and receiving incoming Source[T, _] from HTTP entities.")
- [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html)
- [NameDefaultReceptacle](NameDefaultReceptacle.html)
- [NameDefaultUnmarshallerReceptacle](NameDefaultUnmarshallerReceptacle.html)
- [NameOptionReceptacle](NameOptionReceptacle.html)
- [NameOptionUnmarshallerReceptacle](NameOptionUnmarshallerReceptacle.html)
- [NameReceptacle](NameReceptacle.html)
- [NameUnmarshallerReceptacle](NameUnmarshallerReceptacle.html)
- [RepeatedValueReceptacle](RepeatedValueReceptacle.html)
- [RepeatedValueUnmarshallerReceptacle](RepeatedValueUnmarshallerReceptacle.html)
- [RequiredValueReceptacle](RequiredValueReceptacle.html)
- [RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html)
- SSLContextFactory
- [StrictForm](StrictForm.html "Read-only abstraction on top of application/x-www-form-urlencoded and multipart form data, allowing joint unmarshalling access to either kind, **if** you supply both, a akka.http.scaladsl.unmarshalling.FromStringUnmarshaller as well as a akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller for the target type T.")
- [ToNameReceptacleEnhancements](ToNameReceptacleEnhancements$.html)
o[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[common](index.html)

# SSLContextFactory[**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html "Permalink")

### 

#### object SSLContextFactory

Source[SSLContextFactory.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/common/SSLContextFactory.scala#L33)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SSLContextFactory
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#createSSLContextFromPem(certificatePath:java.nio.file.Path,privateKeyPath:java.nio.file.Path,trustedCaCertificatePaths:Option[Seq[java.nio.file.Path]],secureRandom:Option[java.security.SecureRandom]):javax.net.ssl.SSLContext "Permalink")  def createSSLContextFromPem(certificatePath: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), privateKeyPath: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), trustedCaCertificatePaths: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Seq\[[Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path)]], secureRandom: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[SecureRandom](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/security/SecureRandom.html#java.security.SecureRandom)]): [SSLContext](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)Convenience factory for constructing an SSLContext out of a certificate file, a private key file and possibly zero or more
CA\-certificate files to trust.

Convenience factory for constructing an SSLContext out of a certificate file, a private key file and possibly zero or more
CA\-certificate files to trust. All files must contain PEM encoded certificates or keys.

Note that the paths are filesystem paths, not class path,
certificate files packaged in the JAR cannot be loaded using this method.

certificatePathPath to a PEM encoded certificate file

privateKeyPathPath to a PEM encoded key file

trustedCaCertificatePaths`None` to use the default system trust store, `Some` with one or more CA certificate paths to
 explicitly control exactly what CAs are trusted

secureRandoma secure random to use for the SSL context or none to use a default instance
API May Change

Annotations@ApiMayChange()
7. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#createSSLContextFromPem(certificatePath:java.nio.file.Path,privateKeyPath:java.nio.file.Path,trustedCaCertificatePaths:Seq[java.nio.file.Path]):javax.net.ssl.SSLContext "Permalink")  def createSSLContextFromPem(certificatePath: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), privateKeyPath: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), trustedCaCertificatePaths: Seq\[[Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path)]): [SSLContext](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)Convenience factory for constructing an SSLContext out of a certificate file, a private key file but use the
default JDK trust store.

Convenience factory for constructing an SSLContext out of a certificate file, a private key file but use the
default JDK trust store. All files must contain PEM encoded certificates or keys.

Note that the paths are filesystem paths, not class path,
certificate files packaged in the JAR cannot be loaded using this method.

API May Change

Annotations@ApiMayChange()
8. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#createSSLContextFromPem(certificatePath:java.nio.file.Path,privateKeyPath:java.nio.file.Path):javax.net.ssl.SSLContext "Permalink")  def createSSLContextFromPem(certificatePath: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), privateKeyPath: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path)): [SSLContext](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)Convenience factory for constructing an SSLContext out of a certificate file, a private key file but use the
default JDK trust store.

Convenience factory for constructing an SSLContext out of a certificate file, a private key file but use the
default JDK trust store. All files must contain PEM encoded certificates or keys.

Note that the paths are filesystem paths, not class path,
certificate files packaged in the JAR cannot be loaded using this method.

API May Change

Annotations@ApiMayChange()
9. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#createSSLContextFromPem(config:com.typesafe.config.Config):javax.net.ssl.SSLContext "Permalink")  def createSSLContextFromPem(config: [Config](https://javadoc.io/page/com.typesafe/config/1.4.5/com/typesafe/config/Config.html#com.typesafe.config.Config)): [SSLContext](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)Convenience factory for constructing an SSLContext out of a certificate file, a private key file and zero or more
CA\-certificate files defined in config.

Convenience factory for constructing an SSLContext out of a certificate file, a private key file and zero or more
CA\-certificate files defined in config.

The provided `Config` is required to have the field `certificate` containing
a path to a certificate file, `private-key` containing the path to a private key, and the key `trusted-ca-certificates`
either with the value "system" to use the default JDK truststore or containing a list of zero to many paths to CA certificate files
to explicitly list what CA certs to trust. All files must contain PEM encoded certificates or keys.

Note that the paths are filesystem paths, not class path,
certificate files packaged in the JAR cannot be loaded using this method.

Example usage: `createSSLContextFromPem(system.settings.config.getConfig("my-server"))`

API May Change

Annotations@ApiMayChange()
10. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#refreshingSSLContextProvider(refreshAfter:scala.concurrent.duration.FiniteDuration)(construct:()=>javax.net.ssl.SSLContext):()=>javax.net.ssl.SSLContext "Permalink")  def refreshingSSLContextProvider(refreshAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(construct: () \=\> [SSLContext](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)): () \=\> [SSLContext](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)Keeps a created SSLContext around for a `refreshAfter` period, sharing it among connections, then creates a new
context.

Keeps a created SSLContext around for a `refreshAfter` period, sharing it among connections, then creates a new
context. Actually constructing the `SSLEngine` is left to caller, to allow additional customization of the `SSLEngine`,
for example to require client certificates in a server application.

refreshAfterKeep a created context around this long, then recreate it

constructA factory method to create the context when recreating is needed

returnsAn SSLEngine provider function to use with Akka HTTP `ConnectionContext.httpsServer()` and `ConnectionContext.httpsClient`.
API May Change

Annotations@ApiMayChange()
19. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#refreshingSSLEngineProvider(refreshAfter:scala.concurrent.duration.FiniteDuration)(construct:()=>javax.net.ssl.SSLContext):()=>javax.net.ssl.SSLEngine "Permalink")  def refreshingSSLEngineProvider(refreshAfter: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(construct: () \=\> [SSLContext](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)): () \=\> [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)Keeps a created SSLContext around for a `refreshAfter` period, sharing it among connections, then creates a new
context.

Keeps a created SSLContext around for a `refreshAfter` period, sharing it among connections, then creates a new
context. Useful for rotating certificates.

refreshAfterKeep a created context around this long, then recreate it

constructA factory method to create the context when recreating is needed

returnsAn SSLEngine provider function to use with Akka HTTP `ConnectionContext.httpsServer()` and `ConnectionContext.httpsClient`.
API May Change

Annotations@ApiMayChange()
20. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/common/SSLContextFactory$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/JsonEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameDefaultReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameDefaultUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameOptionUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/RepeatedValueReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/RequiredValueReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/RequiredValueUnmarshallerReceptacle.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/SSLContextFactory$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/StrictForm$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/StrictForm.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/ToNameReceptacleEnhancements$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/SSLContextFactory$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/SSLContextFactory$.html)*