---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FileAndResourceDirectives.html
title: FileAndResourceDirectives
---

# FileAndResourceDirectives

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class FileAndResourceDirectives

- java.lang.Object
- - [akka.http.javadsl.server.directives.BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
	- - [akka.http.javadsl.server.directives.CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
		- - [akka.http.javadsl.server.directives.CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives")
			- - [akka.http.javadsl.server.directives.CookieDirectives](CookieDirectives.html "class in akka.http.javadsl.server.directives")
				- - [akka.http.javadsl.server.directives.DebuggingDirectives](DebuggingDirectives.html "class in akka.http.javadsl.server.directives")
					- - [akka.http.javadsl.server.directives.ExecutionDirectives](ExecutionDirectives.html "class in akka.http.javadsl.server.directives")
						- - akka.http.javadsl.server.directives.FileAndResourceDirectives

- Direct Known Subclasses:
`[FileUploadDirectives](FileUploadDirectives.html "class in akka.http.javadsl.server.directives")`

---

```
public abstract class FileAndResourceDirectives
extends [ExecutionDirectives](ExecutionDirectives.html "class in akka.http.javadsl.server.directives")
```

Directives that load files and resources.
 
 For the directives in this class, the "default classloader" is defined as the classloader that has loaded
 the akka.actor.ActorSystem class.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FileAndResourceDirectives](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives")` | `[defaultContentTypeResolver](#defaultContentTypeResolver())()` | Default [`ContentTypeResolver`](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives"). |
	| `[DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives")` | `[defaultDirectoryRenderer](#defaultDirectoryRenderer())()` | Default [`DirectoryRenderer`](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") to be used with directory listing directives. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectories](#getFromBrowseableDirectories(java.lang.Iterable,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.Iterable<java.lang.String> directories,  [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` | Serves the content of the given directories as a file system browser, i.e. files are sent and directories  served as browseable listings. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectories](#getFromBrowseableDirectories(java.lang.Iterable,akka.http.javadsl.server.directives.DirectoryRenderer))​(java.lang.Iterable<java.lang.String> directories,  [DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer)` | Serves the content of the given directories as a file system browser, i.e. files are sent and directories  served as browseable listings. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectories](#getFromBrowseableDirectories(java.lang.Iterable,akka.http.javadsl.server.directives.DirectoryRenderer,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.Iterable<java.lang.String> directories,  [DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer,  [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` | Serves the content of the given directories as a file system browser, i.e. files are sent and directories  served as browseable listings. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectories](#getFromBrowseableDirectories(java.lang.String...))​(java.lang.String... directories)` | Serves the content of the given directories as a file system browser, i.e. files are sent and directories  served as browseable listings. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectories](#getFromBrowseableDirectories(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> directories)` | Serves the content of the given directories as a file system browser, i.e. files are sent and directories  served as browseable listings. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectory](#getFromBrowseableDirectory(java.lang.String))​(java.lang.String directory)` | Same as `getFromBrowseableDirectories` with only one directory. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectory](#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String directory,  [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` | Same as `getFromBrowseableDirectories` with only one directory. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectory](#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.DirectoryRenderer))​(java.lang.String directory,  [DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer)` | Same as `getFromBrowseableDirectories` with only one directory. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromBrowseableDirectory](#getFromBrowseableDirectory(java.lang.String,akka.http.javadsl.server.directives.DirectoryRenderer,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String directory,  [DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer,  [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` | Same as `getFromBrowseableDirectories` with only one directory. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromDirectory](#getFromDirectory(java.lang.String))​(java.lang.String directoryPath)` | Completes GET requests with the content of a file underneath the given directory, using the default content\-type resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromDirectory](#getFromDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String directoryPath,  [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` | Completes GET requests with the content of a file underneath the given directory, using the given content\-type resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromFile](#getFromFile(java.io.File))​(java.io.File file)` | Completes GET requests with the content of the given file, resolving the content type using the default resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromFile](#getFromFile(java.io.File,akka.http.javadsl.model.ContentType))​(java.io.File file,  [ContentType](../../model/ContentType.html "interface in akka.http.javadsl.model") contentType)` | Completes GET requests with the content of the given file, using the content type. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromFile](#getFromFile(java.io.File,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.io.File file,  [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` | Completes GET requests with the content of the given file, resolving the content type using the given resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromFile](#getFromFile(java.lang.String))​(java.lang.String file)` | Completes GET requests with the content of the given file, resolving the content type using the default resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromFile](#getFromFile(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String file,  [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` | Completes GET requests with the content of the given file, resolving the content type using the given resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromResource](#getFromResource(java.lang.String))​(java.lang.String path)` | Completes GET requests with the content of the given resource loaded from the default ClassLoader,  using the default content type resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromResource](#getFromResource(java.lang.String,akka.http.javadsl.model.ContentType))​(java.lang.String path,  [ContentType](../../model/ContentType.html "interface in akka.http.javadsl.model") contentType)` | Completes GET requests with the content of the given resource loaded from the default ClassLoader,  with the given content type. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromResource](#getFromResource(java.lang.String,akka.http.javadsl.model.ContentType,java.lang.ClassLoader))​(java.lang.String path,  [ContentType](../../model/ContentType.html "interface in akka.http.javadsl.model") contentType,  java.lang.ClassLoader classLoader)` | Completes GET requests with the content of the given resource loaded from the given ClassLoader,  with the given content type. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromResource](#getFromResource(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String path,  [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` | Completes GET requests with the content of the given resource loaded from the default ClassLoader,  using the given content type resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromResourceDirectory](#getFromResourceDirectory(java.lang.String))​(java.lang.String directoryName)` | Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a  "resource directory", using the default ClassLoader, resolving content type using the default content type  resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromResourceDirectory](#getFromResourceDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver))​(java.lang.String directoryName,  [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)` | Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a  "resource directory", using the default ClassLoader, resolving content type using the given content type  resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromResourceDirectory](#getFromResourceDirectory(java.lang.String,akka.http.javadsl.server.directives.ContentTypeResolver,java.lang.ClassLoader))​(java.lang.String directoryName,  [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver,  java.lang.ClassLoader classLoader)` | Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a  "resource directory", using the given ClassLoader, resolving content type using the given content type  resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[getFromResourceDirectory](#getFromResourceDirectory(java.lang.String,java.lang.ClassLoader))​(java.lang.String directoryName,  java.lang.ClassLoader classLoader)` | Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a  "resource directory", using the given ClassLoader, resolving content type using the default content type  resolver. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[listDirectoryContents](#listDirectoryContents(akka.http.javadsl.server.directives.DirectoryRenderer,java.lang.String...))​([DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") directoryRenderer,  java.lang.String... directories)` | Completes GET requests with a unified listing of the contents of all given directories. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[listDirectoryContents](#listDirectoryContents(akka.http.javadsl.server.directives.DirectoryRenderer,scala.collection.immutable.Seq))​([DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") directoryRenderer,  scala.collection.immutable.Seq<java.lang.String> directories)` | Completes GET requests with a unified listing of the contents of all given directories. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[listDirectoryContents](#listDirectoryContents(java.lang.String...))​(java.lang.String... directories)` | Completes GET requests with a unified listing of the contents of all given directories. |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[listDirectoryContents](#listDirectoryContents(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> directories)` | Completes GET requests with a unified listing of the contents of all given directories. |
	
	
		- ### Methods inherited from class akka.http.javadsl.server.directives.[ExecutionDirectives](ExecutionDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[handleExceptions](ExecutionDirectives.html#handleExceptions(akka.http.javadsl.server.ExceptionHandler,java.util.function.Supplier)), [handleRejections](ExecutionDirectives.html#handleRejections(akka.http.javadsl.server.RejectionHandler,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[DebuggingDirectives](DebuggingDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[logRequest](DebuggingDirectives.html#logRequest(java.lang.String,akka.event.Logging.LogLevel,java.util.function.Supplier)), [logRequest](DebuggingDirectives.html#logRequest(java.lang.String,java.util.function.Supplier)), [logRequest](DebuggingDirectives.html#logRequest(java.util.function.Function,java.util.function.Supplier)), [logRequestResult](DebuggingDirectives.html#logRequestResult(java.util.function.BiFunction,java.util.function.BiFunction,java.util.function.Supplier)), [logRequestResultOptional](DebuggingDirectives.html#logRequestResultOptional(java.util.function.BiFunction,java.util.function.BiFunction,java.util.function.Supplier)), [logResult](DebuggingDirectives.html#logResult(java.lang.String,akka.event.Logging.LogLevel,java.util.function.Supplier)), [logResult](DebuggingDirectives.html#logResult(java.lang.String,java.util.function.Supplier)), [logResult](DebuggingDirectives.html#logResult(java.util.function.Function,java.util.function.Function,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CookieDirectives](CookieDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[cookie](CookieDirectives.html#cookie(java.lang.String,java.util.function.Function)), [deleteCookie](CookieDirectives.html#deleteCookie(akka.http.javadsl.model.headers.HttpCookie,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.Iterable,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.String,java.lang.String,java.lang.String,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.String,java.lang.String,java.util.function.Supplier)), [deleteCookie](CookieDirectives.html#deleteCookie(java.lang.String,java.util.function.Supplier)), [optionalCookie](CookieDirectives.html#optionalCookie(java.lang.String,java.util.function.Function)), [setCookie](CookieDirectives.html#setCookie(akka.http.javadsl.model.headers.HttpCookie,java.util.function.Supplier)), [setCookie](CookieDirectives.html#setCookie(java.lang.Iterable,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[decodeRequest](CodingDirectives.html#decodeRequest(java.util.function.Supplier)), [decodeRequestWith](CodingDirectives.html#decodeRequestWith(akka.http.javadsl.coding.Coder,java.util.function.Supplier)), [decodeRequestWith](CodingDirectives.html#decodeRequestWith(java.lang.Iterable,java.util.function.Supplier)), [encodeResponse](CodingDirectives.html#encodeResponse(java.util.function.Supplier)), [encodeResponseWith](CodingDirectives.html#encodeResponseWith(java.lang.Iterable,java.util.function.Supplier)), [requestEncodedWith](CodingDirectives.html#requestEncodedWith(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier)), [responseEncodingAccepted](CodingDirectives.html#responseEncodingAccepted(akka.http.javadsl.model.headers.HttpEncoding,java.util.function.Supplier)), [withPrecompressedMediaTypeSupport](CodingDirectives.html#withPrecompressedMediaTypeSupport(java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[CacheConditionDirectives](CacheConditionDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.DateTime,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.headers.EntityTag,akka.http.javadsl.model.DateTime,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(akka.http.javadsl.model.headers.EntityTag,java.util.function.Supplier)), [conditional](CacheConditionDirectives.html#conditional(java.util.Optional,java.util.Optional,java.util.function.Supplier))`
		- ### Methods inherited from class akka.http.javadsl.server.directives.[BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[cancelRejection](BasicDirectives.html#cancelRejection(akka.http.javadsl.server.Rejection,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.lang.Iterable,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.util.function.Predicate,java.util.function.Supplier)), [extract](BasicDirectives.html#extract(java.util.function.Function,java.util.function.Function)), [extractActorSystem](BasicDirectives.html#extractActorSystem(java.util.function.Function)), [extractDataBytes](BasicDirectives.html#extractDataBytes(java.util.function.Function)), [extractEntity](BasicDirectives.html#extractEntity(java.util.function.Function)), [extractExecutionContext](BasicDirectives.html#extractExecutionContext(java.util.function.Function)), [extractLog](BasicDirectives.html#extractLog(java.util.function.Function)), [extractMatchedPath](BasicDirectives.html#extractMatchedPath(java.util.function.Function)), [extractMaterializer](BasicDirectives.html#extractMaterializer(java.util.function.Function)), [extractParserSettings](BasicDirectives.html#extractParserSettings(java.util.function.Function)), [extractRequest](BasicDirectives.html#extractRequest(java.util.function.Function)), [extractRequestContext](BasicDirectives.html#extractRequestContext(java.util.function.Function)), [extractRequestEntity](BasicDirectives.html#extractRequestEntity(java.util.function.Function)), [extractSettings](BasicDirectives.html#extractSettings(java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Function)), [extractUnmatchedPath](BasicDirectives.html#extractUnmatchedPath(java.util.function.Function)), [extractUri](BasicDirectives.html#extractUri(java.util.function.Function)), [mapInnerRoute](BasicDirectives.html#mapInnerRoute(java.util.function.Function,java.util.function.Supplier)), [mapRejections](BasicDirectives.html#mapRejections(java.util.function.Function,java.util.function.Supplier)), [mapRequest](BasicDirectives.html#mapRequest(java.util.function.Function,java.util.function.Supplier)), [mapRequestContext](BasicDirectives.html#mapRequestContext(java.util.function.Function,java.util.function.Supplier)), [mapResponse](BasicDirectives.html#mapResponse(java.util.function.Function,java.util.function.Supplier)), [mapResponseEntity](BasicDirectives.html#mapResponseEntity(java.util.function.Function,java.util.function.Supplier)), [mapResponseHeaders](BasicDirectives.html#mapResponseHeaders(java.util.function.Function,java.util.function.Supplier)), [mapRouteResult](BasicDirectives.html#mapRouteResult(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultFuture](BasicDirectives.html#mapRouteResultFuture(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultPF](BasicDirectives.html#mapRouteResultPF(scala.PartialFunction,java.util.function.Supplier)), [mapRouteResultWith](BasicDirectives.html#mapRouteResultWith(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultWithPF](BasicDirectives.html#mapRouteResultWithPF(scala.PartialFunction,java.util.function.Supplier)), [mapSettings](BasicDirectives.html#mapSettings(java.util.function.Function,java.util.function.Supplier)), [mapUnmatchedPath](BasicDirectives.html#mapUnmatchedPath(java.util.function.Function,java.util.function.Supplier)), [pass](BasicDirectives.html#pass(java.util.function.Supplier)), [provide](BasicDirectives.html#provide(T,java.util.function.Function)), [recoverRejections](BasicDirectives.html#recoverRejections(java.util.function.Function,java.util.function.Supplier)), [recoverRejectionsWith](BasicDirectives.html#recoverRejectionsWith(java.util.function.Function,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Supplier)), [withExecutionContext](BasicDirectives.html#withExecutionContext(scala.concurrent.ExecutionContextExecutor,java.util.function.Supplier)), [withLog](BasicDirectives.html#withLog(akka.event.LoggingAdapter,java.util.function.Supplier)), [withMaterializer](BasicDirectives.html#withMaterializer(akka.stream.Materializer,java.util.function.Supplier)), [withSettings](BasicDirectives.html#withSettings(akka.http.javadsl.settings.RoutingSettings,java.util.function.Supplier))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FileAndResourceDirectives
		
		
		
		```
		public FileAndResourceDirectives()
		```

	- ### Method Detail
	
	
	
		- #### defaultContentTypeResolver
		
		
		
		```
		public [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") defaultContentTypeResolver()
		```
		
		Default [`ContentTypeResolver`](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives").
		- #### defaultDirectoryRenderer
		
		
		
		```
		public [DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") defaultDirectoryRenderer()
		```
		
		Default [`DirectoryRenderer`](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") to be used with directory listing directives.
		- #### getFromBrowseableDirectories
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectories​(java.lang.String... directories)
		```
		
		Serves the content of the given directories as a file system browser, i.e. files are sent and directories
		 served as browseable listings.
		
		Parameters:
		`directories` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromBrowseableDirectories
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectories​(java.lang.Iterable<java.lang.String> directories,
		                                          [DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer,
		                                          [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		
		Serves the content of the given directories as a file system browser, i.e. files are sent and directories
		 served as browseable listings.
		
		Parameters:
		`directories` \- (undocumented)
		`renderer` \- (undocumented)
		`resolver` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromBrowseableDirectories
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectories​(java.lang.Iterable<java.lang.String> directories,
		                                          [DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer)
		```
		
		Serves the content of the given directories as a file system browser, i.e. files are sent and directories
		 served as browseable listings.
		
		Parameters:
		`directories` \- (undocumented)
		`renderer` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromBrowseableDirectories
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectories​(java.lang.Iterable<java.lang.String> directories,
		                                          [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		
		Serves the content of the given directories as a file system browser, i.e. files are sent and directories
		 served as browseable listings.
		
		Parameters:
		`directories` \- (undocumented)
		`resolver` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromBrowseableDirectories
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectories​(scala.collection.immutable.Seq<java.lang.String> directories)
		```
		
		Serves the content of the given directories as a file system browser, i.e. files are sent and directories
		 served as browseable listings.
		
		Parameters:
		`directories` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromBrowseableDirectory
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectory​(java.lang.String directory,
		                                        [DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer,
		                                        [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		
		Same as `getFromBrowseableDirectories` with only one directory.
		
		Parameters:
		`directory` \- (undocumented)
		`renderer` \- (undocumented)
		`resolver` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromBrowseableDirectory
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectory​(java.lang.String directory,
		                                        [DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") renderer)
		```
		
		Same as `getFromBrowseableDirectories` with only one directory.
		
		Parameters:
		`directory` \- (undocumented)
		`renderer` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromBrowseableDirectory
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectory​(java.lang.String directory,
		                                        [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		
		Same as `getFromBrowseableDirectories` with only one directory.
		
		Parameters:
		`directory` \- (undocumented)
		`resolver` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromBrowseableDirectory
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromBrowseableDirectory​(java.lang.String directory)
		```
		
		Same as `getFromBrowseableDirectories` with only one directory.
		
		Parameters:
		`directory` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromDirectory
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromDirectory​(java.lang.String directoryPath)
		```
		
		Completes GET requests with the content of a file underneath the given directory, using the default content\-type resolver.
		 If the file cannot be read the Route rejects the request.
		
		Parameters:
		`directoryPath` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromDirectory
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromDirectory​(java.lang.String directoryPath,
		                              [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		
		Completes GET requests with the content of a file underneath the given directory, using the given content\-type resolver.
		 If the file cannot be read the Route rejects the request.
		
		Parameters:
		`directoryPath` \- (undocumented)
		`resolver` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromFile
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromFile​(java.io.File file)
		```
		
		Completes GET requests with the content of the given file, resolving the content type using the default resolver.
		 If the file cannot be found or read the request is rejected.
		
		Parameters:
		`file` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromFile
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromFile​(java.io.File file,
		                         [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		
		Completes GET requests with the content of the given file, resolving the content type using the given resolver.
		 If the file cannot be found or read the request is rejected.
		
		Parameters:
		`file` \- (undocumented)
		`resolver` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromFile
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromFile​(java.io.File file,
		                         [ContentType](../../model/ContentType.html "interface in akka.http.javadsl.model") contentType)
		```
		
		Completes GET requests with the content of the given file, using the content type.
		 If the file cannot be found or read the request is rejected.
		
		Parameters:
		`file` \- (undocumented)
		`contentType` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromFile
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromFile​(java.lang.String file)
		```
		
		Completes GET requests with the content of the given file, resolving the content type using the default resolver.
		 If the file cannot be found or read the request is rejected.
		
		Parameters:
		`file` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromFile
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromFile​(java.lang.String file,
		                         [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		
		Completes GET requests with the content of the given file, resolving the content type using the given resolver.
		 If the file cannot be found or read the request is rejected.
		
		Parameters:
		`file` \- (undocumented)
		`resolver` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromResource
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromResource​(java.lang.String path)
		```
		
		Completes GET requests with the content of the given resource loaded from the default ClassLoader,
		 using the default content type resolver.
		 If the resource cannot be found or read the Route rejects the request.
		
		Parameters:
		`path` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromResource
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromResource​(java.lang.String path,
		                             [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		
		Completes GET requests with the content of the given resource loaded from the default ClassLoader,
		 using the given content type resolver.
		 If the resource cannot be found or read the Route rejects the request.
		
		Parameters:
		`path` \- (undocumented)
		`resolver` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromResource
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromResource​(java.lang.String path,
		                             [ContentType](../../model/ContentType.html "interface in akka.http.javadsl.model") contentType)
		```
		
		Completes GET requests with the content of the given resource loaded from the default ClassLoader,
		 with the given content type.
		 If the resource cannot be found or read the Route rejects the request.
		
		Parameters:
		`path` \- (undocumented)
		`contentType` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromResource
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromResource​(java.lang.String path,
		                             [ContentType](../../model/ContentType.html "interface in akka.http.javadsl.model") contentType,
		                             java.lang.ClassLoader classLoader)
		```
		
		Completes GET requests with the content of the given resource loaded from the given ClassLoader,
		 with the given content type.
		 If the resource cannot be found or read the Route rejects the request.
		
		Parameters:
		`path` \- (undocumented)
		`contentType` \- (undocumented)
		`classLoader` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromResourceDirectory
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromResourceDirectory​(java.lang.String directoryName)
		```
		
		Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
		 "resource directory", using the default ClassLoader, resolving content type using the default content type
		 resolver.
		 
		 If the requested resource is itself a directory or cannot be found or read the Route rejects the request.
		
		
		
		Parameters:
		`directoryName` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromResourceDirectory
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromResourceDirectory​(java.lang.String directoryName,
		                                      java.lang.ClassLoader classLoader)
		```
		
		Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
		 "resource directory", using the given ClassLoader, resolving content type using the default content type
		 resolver.
		 
		 If the requested resource is itself a directory or cannot be found or read the Route rejects the request.
		
		
		
		Parameters:
		`directoryName` \- (undocumented)
		`classLoader` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromResourceDirectory
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromResourceDirectory​(java.lang.String directoryName,
		                                      [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver)
		```
		
		Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
		 "resource directory", using the default ClassLoader, resolving content type using the given content type
		 resolver.
		 
		 If the requested resource is itself a directory or cannot be found or read the Route rejects the request.
		
		
		
		Parameters:
		`directoryName` \- (undocumented)
		`resolver` \- (undocumented)
		Returns:
		(undocumented)
		- #### getFromResourceDirectory
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") getFromResourceDirectory​(java.lang.String directoryName,
		                                      [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.javadsl.server.directives") resolver,
		                                      java.lang.ClassLoader classLoader)
		```
		
		Same as "getFromDirectory" except that the file is not fetched from the file system but rather from a
		 "resource directory", using the given ClassLoader, resolving content type using the given content type
		 resolver.
		 
		 If the requested resource is itself a directory or cannot be found or read the Route rejects the request.
		
		
		
		Parameters:
		`directoryName` \- (undocumented)
		`resolver` \- (undocumented)
		`classLoader` \- (undocumented)
		Returns:
		(undocumented)
		- #### listDirectoryContents
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") listDirectoryContents​(java.lang.String... directories)
		```
		
		Completes GET requests with a unified listing of the contents of all given directories.
		 The actual rendering of the directory contents is performed by the in\-scope `Marshaller[DirectoryListing]`.
		
		Parameters:
		`directories` \- (undocumented)
		Returns:
		(undocumented)
		- #### listDirectoryContents
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") listDirectoryContents​([DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") directoryRenderer,
		                                   java.lang.String... directories)
		```
		
		Completes GET requests with a unified listing of the contents of all given directories.
		 The actual rendering of the directory contents is performed by the in\-scope `Marshaller[DirectoryListing]`.
		
		Parameters:
		`directoryRenderer` \- (undocumented)
		`directories` \- (undocumented)
		Returns:
		(undocumented)
		- #### listDirectoryContents
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") listDirectoryContents​(scala.collection.immutable.Seq<java.lang.String> directories)
		```
		
		Completes GET requests with a unified listing of the contents of all given directories.
		 The actual rendering of the directory contents is performed by the in\-scope `Marshaller[DirectoryListing]`.
		
		Parameters:
		`directories` \- (undocumented)
		Returns:
		(undocumented)
		- #### listDirectoryContents
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") listDirectoryContents​([DirectoryRenderer](DirectoryRenderer.html "interface in akka.http.javadsl.server.directives") directoryRenderer,
		                                   scala.collection.immutable.Seq<java.lang.String> directories)
		```
		
		Completes GET requests with a unified listing of the contents of all given directories.
		 The actual rendering of the directory contents is performed by the in\-scope `Marshaller[DirectoryListing]`.
		
		Parameters:
		`directoryRenderer` \- (undocumented)
		`directories` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/BasicDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CodingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CookieDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/DirectoryRenderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FileAndResourceDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/FileAndResourceDirectives.html)*