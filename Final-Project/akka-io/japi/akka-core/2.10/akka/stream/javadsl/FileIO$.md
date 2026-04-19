---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:51:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO$.html
title: FileIO$
---

# FileIO$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class FileIO$

- java.lang.Object
- - akka.stream.javadsl.FileIO$

- ---

```
public class FileIO$
extends java.lang.Object
```

Java API: Factories to create sinks and sources from files

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FileIO$](FileIO$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FileIO$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromFile](#fromFile(java.io.File))​(java.io.File f)` | Deprecated. Use \`fromPath\` instead. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromFile](#fromFile(java.io.File,int))​(java.io.File f,  int chunkSize)` | Deprecated. Use \`fromPath\` instead. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromPath](#fromPath(java.nio.file.Path))​(java.nio.file.Path f)` | Creates a Source from a files contents. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromPath](#fromPath(java.nio.file.Path,int))​(java.nio.file.Path f,  int chunkSize)` | Creates a synchronous Source from a files contents. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromPath](#fromPath(java.nio.file.Path,int,long))​(java.nio.file.Path f,  int chunkSize,  long startPosition)` | Creates a synchronous Source from a files contents. |
	| `[Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[toFile](#toFile(java.io.File))​(java.io.File f)` | Deprecated. Use \`toPath\` instead. |
	| `<Opt extends java.nio.file.OpenOption>[Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[toFile](#toFile(java.io.File,java.util.Set))​(java.io.File f,  java.util.Set<Opt> options)` | Deprecated. Use \`toPath\` instead. |
	| `[Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[toPath](#toPath(java.nio.file.Path))​(java.nio.file.Path f)` | Creates a Sink that writes incoming `ByteString` elements to the given file path. |
	| `<Opt extends java.nio.file.OpenOption>[Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[toPath](#toPath(java.nio.file.Path,java.util.Set))​(java.nio.file.Path f,  java.util.Set<Opt> options)` | Creates a Sink that writes incoming `ByteString` elements to the given file path. |
	| `<Opt extends java.nio.file.OpenOption>[Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[toPath](#toPath(java.nio.file.Path,java.util.Set,long))​(java.nio.file.Path f,  java.util.Set<Opt> options,  long startPosition)` | Creates a Sink that writes incoming `ByteString` elements to the given file path. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FileIO$](FileIO$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FileIO$
		
		
		
		```
		public FileIO$()
		```

	- ### Method Detail
	
	
	
		- #### toFile
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> toFile​(java.io.File f)
		```
		
		Deprecated.
		Use \`toPath\` instead. Since 2\.4\.5\.
		
		Creates a Sink that writes incoming `ByteString` elements to the given file.
		 Overwrites existing files by truncating their contents, if you want to append to an existing file use
		 {@link toFile(File, util.Set\[OpenOption])} with `java.nio.file.StandardOpenOption.APPEND`.
		 
		 Materializes a `CompletionStage` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		
		Parameters:
		`f` \- The file to write to
		- #### toPath
		
		
		
		```
		public [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> toPath​(java.nio.file.Path f)
		```
		
		Creates a Sink that writes incoming `ByteString` elements to the given file path.
		 Overwrites existing files by truncating their contents, if you want to append to an existing file
		 {@link toPath(Path, util.Set\[OpenOption])} with `java.nio.file.StandardOpenOption.APPEND`.
		 
		 Materializes a `CompletionStage` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 Accepts as arguments a set of `StandardOpenOption`, which will determine
		 the underlying behavior when writing the file. If `java.nio.file.StandardOpenOption.SYNC` is
		 provided, every update to the file's content be written synchronously to the underlying storage
		 device. Otherwise (the default), the write will be written to the storage device asynchronously
		 by the OS, and may not be stored durably on the storage device at the time the stream completes.
		 
		
		
		
		Parameters:
		`f` \- The file path to write to
		- #### toFile
		
		
		
		```
		public <Opt extends java.nio.file.OpenOption> [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> toFile​(java.io.File f,
		                                                                                                                           java.util.Set<Opt> options)
		```
		
		Deprecated.
		Use \`toPath\` instead. Since 2\.4\.5\.
		
		Creates a Sink that writes incoming `ByteString` elements to the given file.
		 
		 Materializes a `CompletionStage` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		
		Parameters:
		`f` \- The file to write to
		`options` \- File open options, see `StandardOpenOption`
		- #### toPath
		
		
		
		```
		public <Opt extends java.nio.file.OpenOption> [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> toPath​(java.nio.file.Path f,
		                                                                                                                           java.util.Set<Opt> options)
		```
		
		Creates a Sink that writes incoming `ByteString` elements to the given file path.
		 
		 Materializes a `CompletionStage` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 Accepts as arguments a set of `StandardOpenOption`, which will determine
		 the underlying behavior when writing the file. If `java.nio.file.StandardOpenOption.SYNC` is
		 provided, every update to the file's content be written synchronously to the underlying storage
		 device. Otherwise (the default), the write will be written to the storage device asynchronously
		 by the OS, and may not be stored durably on the storage device at the time the stream completes.
		 
		
		
		
		Parameters:
		`f` \- The file path to write to
		`options` \- File open options, see `StandardOpenOption`
		- #### toPath
		
		
		
		```
		public <Opt extends java.nio.file.OpenOption> [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> toPath​(java.nio.file.Path f,
		                                                                                                                           java.util.Set<Opt> options,
		                                                                                                                           long startPosition)
		```
		
		Creates a Sink that writes incoming `ByteString` elements to the given file path.
		 
		 Materializes a `CompletionStage` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 Accepts as arguments a set of `StandardOpenOption`, which will determine
		 the underlying behavior when writing the file. If `java.nio.file.StandardOpenOption.SYNC` is
		 provided, every update to the file's content be written synchronously to the underlying storage
		 device. Otherwise (the default), the write will be written to the storage device asynchronously.
		 by the OS, and may not be stored durably on the storage device at the time the stream completes.
		 
		
		
		
		Parameters:
		`f` \- The file path to write to
		`options` \- File open options, see `StandardOpenOption`
		`startPosition` \- startPosition the start position to read from, defaults to 0
		- #### fromFile
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> fromFile​(java.io.File f)
		```
		
		Deprecated.
		Use \`fromPath\` instead. Since 2\.4\.5\.
		
		Creates a Source from a files contents.
		 Emitted elements are `ByteString` elements, chunked by default by 8192 bytes,
		 except the last element, which will be up to 8192 in size.
		 
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 It materializes a `CompletionStage` of `IOResult` containing the number of bytes read from the source file upon completion,
		 and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
		 not give any guarantee that the bytes were seen by downstream stages.
		 
		
		
		
		Parameters:
		`f` \- the file to read from
		- #### fromPath
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> fromPath​(java.nio.file.Path f)
		```
		
		Creates a Source from a files contents.
		 Emitted elements are `ByteString` elements, chunked by default by 8192 bytes,
		 except the last element, which will be up to 8192 in size.
		 
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 It materializes a `CompletionStage` of `IOResult` containing the number of bytes read from the source file upon completion,
		 and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
		 not give any guarantee that the bytes were seen by downstream stages.
		 
		
		
		 It is not possible to read FIFOs, also known as named pipes, with `fromPath`, trying to do so will potentially first block
		 and then fail the stream.
		 
		
		
		
		Parameters:
		`f` \- the file path to read from
		- #### fromFile
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> fromFile​(java.io.File f,
		                                                                                        int chunkSize)
		```
		
		Deprecated.
		Use \`fromPath\` instead. Since 2\.4\.5\.
		
		Creates a synchronous Source from a files contents.
		 Emitted elements are `chunkSize` sized `ByteString` elements,
		 except the last element, which will be up to `chunkSize` in size.
		 
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 It materializes a `CompletionStage` of `IOResult` containing the number of bytes read from the source file upon completion,
		 and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
		 not give any guarantee that the bytes were seen by downstream stages.
		 
		
		
		
		Parameters:
		`f` \- the file to read from
		`chunkSize` \- the size of each read operation
		- #### fromPath
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> fromPath​(java.nio.file.Path f,
		                                                                                        int chunkSize)
		```
		
		Creates a synchronous Source from a files contents.
		 Emitted elements are `chunkSize` sized `ByteString` elements,
		 except the last element, which will be up to `chunkSize` in size.
		 
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 It materializes a `CompletionStage` of `IOResult` containing the number of bytes read from the source file upon completion,
		 and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
		 not give any guarantee that the bytes were seen by downstream stages.
		 
		
		
		 It is not possible to read FIFOs, also known as named pipes, with `fromPath`, trying to do so will potentially first block
		 and then fail the stream.
		 
		
		
		
		Parameters:
		`f` \- the file path to read from
		`chunkSize` \- the size of each read operation
		- #### fromPath
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> fromPath​(java.nio.file.Path f,
		                                                                                        int chunkSize,
		                                                                                        long startPosition)
		```
		
		Creates a synchronous Source from a files contents.
		 Emitted elements are `chunkSize` sized `ByteString` elements,
		 except the last element, which will be up to `chunkSize` in size.
		 
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 It materializes a `CompletionStage` of `IOResult` containing the number of bytes read from the source file upon completion,
		 and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
		 not give any guarantee that the bytes were seen by downstream stages.
		 
		
		
		
		Parameters:
		`f` \- the file path to read from
		`chunkSize` \- the size of each read operation
		`startPosition` \- startPosition the start position to read from, defaults to 0

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/ActorAttributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/IOResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FileIO$.html)*