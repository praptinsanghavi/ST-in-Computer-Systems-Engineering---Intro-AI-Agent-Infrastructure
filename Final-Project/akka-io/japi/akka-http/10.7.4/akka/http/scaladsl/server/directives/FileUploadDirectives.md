---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives.html
title: FileUploadDirectives
---

# FileUploadDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface FileUploadDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[FileUploadDirectives$](FileUploadDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface FileUploadDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Tuple2<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object>>>>` | `[fileUpload](#fileUpload(java.lang.String))​(java.lang.String fieldName)` | Collects each body part that is a multipart file as a tuple containing metadata and a `Source`  for streaming the file contents somewhere. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.immutable.Seq<scala.Tuple2<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object>>>>>` | `[fileUploadAll](#fileUploadAll(java.lang.String))​(java.lang.String fieldName)` | Collects each body part that is a multipart file as a tuple containing metadata and a `Source`  for streaming the file contents somewhere. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple2<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​java.io.File>>` | `[storeUploadedFile](#storeUploadedFile(java.lang.String,scala.Function1))​(java.lang.String fieldName,  scala.Function1<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​java.io.File> destFn)` | Streams the bytes of the file submitted using multipart with the given file name into a designated file on disk. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.immutable.Seq<scala.Tuple2<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​java.io.File>>>>` | `[storeUploadedFiles](#storeUploadedFiles(java.lang.String,scala.Function1))​(java.lang.String fieldName,  scala.Function1<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​java.io.File> destFn)` | Streams the bytes of the file submitted using multipart with the given field name into designated files on disk. |

- - ### Method Detail
	
	
	
		- #### storeUploadedFile
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple2<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​java.io.File>> storeUploadedFile​(java.lang.String fieldName,
		                                                                       scala.Function1<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​java.io.File> destFn)
		```
		
		Streams the bytes of the file submitted using multipart with the given file name into a designated file on disk.
		 If there is an error writing to disk the request will be failed with the thrown exception, if there is no such
		 field the request will be rejected, if there are multiple file parts with the same name, the first one will be
		 used and the subsequent ones ignored.
		 
		
		Parameters:
		`fieldName` \- (undocumented)
		`destFn` \- (undocumented)
		Returns:
		(undocumented)
		- #### storeUploadedFiles
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.immutable.Seq<scala.Tuple2<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​java.io.File>>>> storeUploadedFiles​(java.lang.String fieldName,
		                                                                                                                      scala.Function1<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​java.io.File> destFn)
		```
		
		Streams the bytes of the file submitted using multipart with the given field name into designated files on disk.
		 If there is an error writing to disk the request will be failed with the thrown exception, if there is no such
		 field the request will be rejected. Stored files are cleaned up on exit but not on failure.
		 
		
		Parameters:
		`fieldName` \- (undocumented)
		`destFn` \- (undocumented)
		Returns:
		(undocumented)
		- #### fileUpload
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Tuple2<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object>>>> fileUpload​(java.lang.String fieldName)
		```
		
		Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
		 for streaming the file contents somewhere. If there is no such field the request will be rejected,
		 if there are multiple file parts with the same name, the first one will be used and the subsequent
		 ones ignored.
		 
		
		Parameters:
		`fieldName` \- (undocumented)
		Returns:
		(undocumented)
		- #### fileUploadAll
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.immutable.Seq<scala.Tuple2<[FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives"),​akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object>>>>> fileUploadAll​(java.lang.String fieldName)
		```
		
		Collects each body part that is a multipart file as a tuple containing metadata and a `Source`
		 for streaming the file contents somewhere. If there is no such field the request will be rejected.
		 Files are buffered into temporary files on disk so in\-memory buffers don't overflow. The temporary
		 files are cleaned up once materialized, or on exit if the stream is not consumed.
		 
		
		Parameters:
		`fieldName` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileInfo.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives.html)*