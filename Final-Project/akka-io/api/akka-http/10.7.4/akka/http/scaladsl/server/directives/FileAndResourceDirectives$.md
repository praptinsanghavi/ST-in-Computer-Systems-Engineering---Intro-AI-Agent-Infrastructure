---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.FileAndResourceDirectives

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [AttributeDirectives](AttributeDirectives.html)
- [AuthenticationDirective](AuthenticationDirective.html)
- [AuthenticationResult](AuthenticationResult$.html)
- [BasicDirectives](BasicDirectives.html)
- [CacheConditionDirectives](CacheConditionDirectives.html)
- [CachingDirectives](CachingDirectives.html)
- [CodingDirectives](CodingDirectives.html)
- [CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html)
- [ContentTypeResolver](ContentTypeResolver.html)
- [CookieDirectives](CookieDirectives.html)
- [CorsDirectives](CorsDirectives.html "Directives for CORS, cross origin requests.")
- [Credentials](Credentials.html "Represents authentication credentials supplied with a request.")
- [DebuggingDirectives](DebuggingDirectives.html)
- [DirectoryListing](DirectoryListing.html)
- [ExecutionDirectives](ExecutionDirectives.html)
- [FileAndResourceDirectives](FileAndResourceDirectives.html)
- [FileInfo](FileInfo.html "Additional metadata about the file being uploaded/that was uploaded using the FileUploadDirectives")
- [FileUploadDirectives](FileUploadDirectives.html)
- [FormFieldDirectives](FormFieldDirectives.html)
- [FormFieldDirectivesInstances](FormFieldDirectivesInstances.html)
- [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "Allows the MarshallingDirectives.entity directive to extract a akka.stream.scaladsl.Source of elements.")
- [FutureDirectives](FutureDirectives.html)
- [HeaderDirectives](HeaderDirectives.html)
- [HeaderMagnet](HeaderMagnet.html)
- [HostDirectives](HostDirectives.html)
- [LogEntry](LogEntry.html)
- [LoggingMagnet](LoggingMagnet.html)
- [LowPriorityHeaderMagnetImplicits](LowPriorityHeaderMagnetImplicits.html)
- [MarshallingDirectives](MarshallingDirectives.html)
- [MethodDirectives](MethodDirectives.html)
- [MiscDirectives](MiscDirectives.html)
- [OnSuccessMagnet](OnSuccessMagnet.html)
- [ParameterDirectives](ParameterDirectives.html)
- [ParameterDirectivesInstances](ParameterDirectivesInstances.html)
- [PathDirectives](PathDirectives.html)
- [RangeDirectives](RangeDirectives.html)
- [RespondWithDirectives](RespondWithDirectives.html)
- [RouteDirectives](RouteDirectives.html)
- [SchemeDirectives](SchemeDirectives.html)
- [SecurityDirectives](SecurityDirectives.html "Provides directives for securing an inner route using the standard Http authentication headers `WWW-Authenticate` and Authorization.")
- [TimeoutDirectives](TimeoutDirectives.html)
- [TlsDirectives](TlsDirectives.html)
- [WebSocketDirectives](WebSocketDirectives.html)
[o](FileAndResourceDirectives.html "See companion trait")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html)

# [FileAndResourceDirectives](FileAndResourceDirectives.html "See companion trait")[**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html "Permalink")

### Companion [trait FileAndResourceDirectives](FileAndResourceDirectives.html "See companion trait")

#### object FileAndResourceDirectives extends [FileAndResourceDirectives](FileAndResourceDirectives.html)

Source[FileAndResourceDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/FileAndResourceDirectives.scala#L204)Linear Supertypes[FileAndResourceDirectives](FileAndResourceDirectives.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. FileAndResourceDirectives
2. FileAndResourceDirectives
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html "Permalink")  trait [DirectoryRenderer](FileAndResourceDirectives$$DirectoryRenderer.html) extends [javadsl.server.directives.DirectoryRenderer](../../../javadsl/server/directives/DirectoryRenderer.html)
2. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$LowLevelDirectoryRenderer.html "Permalink")  trait [LowLevelDirectoryRenderer](FileAndResourceDirectives$$LowLevelDirectoryRenderer.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html "Permalink")  case class [ResourceFile](FileAndResourceDirectives$$ResourceFile.html)(url: [URL](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/URL.html#java.net.URL), length: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), lastModified: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#_defaultClassLoader:ClassLoader "Permalink")  def \_defaultClassLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader)Attributesprotected\[[http](../../../index.html)] Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
5. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#getFromBrowseableDirectories(directories:String*)(implicitrenderer:akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer,implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromBrowseableDirectories(directories: String\*)(implicit renderer: [DirectoryRenderer](FileAndResourceDirectives$$DirectoryRenderer.html), resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Serves the content of the given directories as a file system browser, i.e.

Serves the content of the given directories as a file system browser, i.e. files are sent and directories
served as browseable listings.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
11. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#getFromBrowseableDirectory(directory:String)(implicitrenderer:akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer,implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromBrowseableDirectory(directory: String)(implicit renderer: [DirectoryRenderer](FileAndResourceDirectives$$DirectoryRenderer.html), resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Same as `getFromBrowseableDirectories` with only one directory.

Same as `getFromBrowseableDirectories` with only one directory.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
12. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#getFromDirectory(directoryName:String)(implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromDirectory(directoryName: String)(implicit resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of a file underneath the given directory.

Completes GET requests with the content of a file underneath the given directory.
If the file cannot be read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
13. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#getFromFile(file:java.io.File,contentType:akka.http.scaladsl.model.ContentType):akka.http.scaladsl.server.Route "Permalink")  def getFromFile(file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), contentType: [ContentType](../../model/ContentType.html)): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of the given file.

Completes GET requests with the content of the given file.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
14. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#getFromFile(file:java.io.File)(implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromFile(file: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File))(implicit resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of the given file.

Completes GET requests with the content of the given file.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
15. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#getFromFile(fileName:String)(implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromFile(fileName: String)(implicit resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of the given file.

Completes GET requests with the content of the given file.
If the file cannot be found or read the request is rejected.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
16. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#getFromResource(resourceName:String,contentType:akka.http.scaladsl.model.ContentType,classLoader:ClassLoader):akka.http.scaladsl.server.Route "Permalink")  def getFromResource(resourceName: String, contentType: [ContentType](../../model/ContentType.html), classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader) \= [\_defaultClassLoader](FileAndResourceDirectives.html#_defaultClassLoader:ClassLoader)): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of the given resource.

Completes GET requests with the content of the given resource.
If the resource is a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
17. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#getFromResource(resourceName:String)(implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromResource(resourceName: String)(implicit resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with the content of the given class\-path resource.

Completes GET requests with the content of the given class\-path resource.
If the resource cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
18. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#getFromResourceDirectory(directoryName:String,classLoader:ClassLoader)(implicitresolver:akka.http.scaladsl.server.directives.ContentTypeResolver):akka.http.scaladsl.server.Route "Permalink")  def getFromResourceDirectory(directoryName: String, classLoader: [ClassLoader](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html#java.lang.ClassLoader) \= [\_defaultClassLoader](FileAndResourceDirectives.html#_defaultClassLoader:ClassLoader))(implicit resolver: [ContentTypeResolver](ContentTypeResolver.html)): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory".

Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
"resource directory".
If the requested resource is itself a directory or cannot be found or read the Route rejects the request.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
19. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#listDirectoryContents(directories:String*)(implicitrenderer:akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer):akka.http.scaladsl.server.Route "Permalink")  def listDirectoryContents(directories: String\*)(implicit renderer: [DirectoryRenderer](FileAndResourceDirectives$$DirectoryRenderer.html)): [Route](../index.html#Route=akka.http.scaladsl.server.RequestContext=>scala.concurrent.Future[akka.http.scaladsl.server.RouteResult])Completes GET requests with a unified listing of the contents of all given directories.

Completes GET requests with a unified listing of the contents of all given directories.
The actual rendering of the directory contents is performed by the in\-scope `Marshaller[DirectoryListing]`.

Definition Classes[FileAndResourceDirectives](FileAndResourceDirectives.html)
22. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
29. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer$.html "Permalink")  object [DirectoryRenderer](FileAndResourceDirectives$$DirectoryRenderer$.html) extends [LowLevelDirectoryRenderer](FileAndResourceDirectives$$LowLevelDirectoryRenderer.html)
31. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile$.html "Permalink")  object [ResourceFile](FileAndResourceDirectives$$ResourceFile$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [FileAndResourceDirectives](FileAndResourceDirectives.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### File and resource directives

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/DirectoryRenderer.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AttributeDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationDirective$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationResult$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CacheConditionDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CachingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CorsDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CorsDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DirectoryListing$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DirectoryListing.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ExecutionDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$DirectoryRenderer.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$LowLevelDirectoryRenderer.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$$ResourceFile.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileInfo.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectivesInstances.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FutureDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FutureDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/HeaderDirectives$.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html)*