---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FileIO.html
title: FileIO
---

# FileIO

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class FileIO

- java.lang.Object
- - akka.stream.scaladsl.FileIO

- ---

```
public class FileIO
extends java.lang.Object
```

Factories to create sinks and sources from files

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FileIO](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [Source](Source.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromFile](#fromFile(java.io.File,int))​(java.io.File f,  int chunkSize)` | Deprecated. Use \`fromPath\` instead. |
	| `static int` | `[fromFile$default$2](#fromFile$default$2())()` |  |
	| `static [Source](Source.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromPath](#fromPath(java.nio.file.Path,int))​(java.nio.file.Path f,  int chunkSize)` | Creates a Source from a files contents. |
	| `static [Source](Source.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromPath](#fromPath(java.nio.file.Path,int,long))​(java.nio.file.Path f,  int chunkSize,  long startPosition)` | Creates a Source from a files contents. |
	| `static int` | `[fromPath$default$2](#fromPath$default$2())()` |  |
	| `static [Sink](Sink.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>>` | `[toFile](#toFile(java.io.File,scala.collection.immutable.Set))​(java.io.File f,  scala.collection.immutable.Set<java.nio.file.OpenOption> options)` | Deprecated. Use \`toPath\` instead. |
	| `static scala.collection.immutable.Set<java.nio.file.OpenOption>` | `[toFile$default$2](#toFile$default$2())()` |  |
	| `static [Sink](Sink.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>>` | `[toPath](#toPath(java.nio.file.Path,scala.collection.immutable.Set))​(java.nio.file.Path f,  scala.collection.immutable.Set<java.nio.file.OpenOption> options)` | Creates a Sink which writes incoming `ByteString` elements to the given file path. |
	| `static [Sink](Sink.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>>` | `[toPath](#toPath(java.nio.file.Path,scala.collection.immutable.Set,long))​(java.nio.file.Path f,  scala.collection.immutable.Set<java.nio.file.OpenOption> options,  long startPosition)` | Creates a Sink which writes incoming `ByteString` elements to the given file path. |
	| `static scala.collection.immutable.Set<java.nio.file.OpenOption>` | `[toPath$default$2](#toPath$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FileIO
		
		
		
		```
		public FileIO()
		```

	- ### Method Detail
	
	
	
		- #### fromFile
		
		
		
		```
		public static [Source](Source.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>> fromFile​(java.io.File f,
		                                                                                  int chunkSize)
		```
		
		Deprecated.
		Use \`fromPath\` instead. Since 2\.4\.5\.
		
		Creates a Source from a files contents.
		 Emitted elements are `chunkSize` sized [`ByteString`](../../util/ByteString.html "class in akka.util") elements,
		 except the final element, which will be up to `chunkSize` in size.
		 
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 It materializes a `Future` of `IOResult` containing the number of bytes read from the source file upon completion,
		 and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
		 not give any guarantee that the bytes were seen by downstream stages.
		 
		
		
		
		Parameters:
		`f` \- the file to read from
		`chunkSize` \- the size of each read operation, defaults to 8192
		- #### fromFile$default$2
		
		
		
		```
		public static int fromFile$default$2()
		```
		- #### fromPath
		
		
		
		```
		public static [Source](Source.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>> fromPath​(java.nio.file.Path f,
		                                                                                  int chunkSize)
		```
		
		Creates a Source from a files contents.
		 Emitted elements are `chunkSize` sized [`ByteString`](../../util/ByteString.html "class in akka.util") elements,
		 except the final element, which will be up to `chunkSize` in size.
		 
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 It materializes a `Future` of `IOResult` containing the number of bytes read from the source file upon completion,
		 and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
		 not give any guarantee that the bytes were seen by downstream stages.
		 
		
		
		 It is not possible to read FIFOs, also known as named pipes, with `fromPath`, trying to do so will potentially first block
		 and then fail the stream.
		 
		
		
		
		Parameters:
		`f` \- the file path to read from
		`chunkSize` \- the size of each read operation, defaults to 8192
		- #### fromPath
		
		
		
		```
		public static [Source](Source.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>> fromPath​(java.nio.file.Path f,
		                                                                                  int chunkSize,
		                                                                                  long startPosition)
		```
		
		Creates a Source from a files contents.
		 Emitted elements are `chunkSize` sized [`ByteString`](../../util/ByteString.html "class in akka.util") elements,
		 except the final element, which will be up to `chunkSize` in size.
		 
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 It materializes a `Future` of `IOResult` containing the number of bytes read from the source file upon completion,
		 and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
		 not give any guarantee that the bytes were seen by downstream stages.
		 
		
		
		 It is not possible to read FIFOs, also known as named pipes, with `fromPath`, trying to do so will potentially first block
		 and then fail the stream.
		 
		
		
		
		Parameters:
		`f` \- the file path to read from
		`chunkSize` \- the size of each read operation, defaults to 8192
		`startPosition` \- the start position to read from
		- #### fromPath$default$2
		
		
		
		```
		public static int fromPath$default$2()
		```
		- #### toFile
		
		
		
		```
		public static [Sink](Sink.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>> toFile​(java.io.File f,
		                                                                              scala.collection.immutable.Set<java.nio.file.OpenOption> options)
		```
		
		Deprecated.
		Use \`toPath\` instead. Since 2\.4\.5\.
		
		Creates a Sink which writes incoming `ByteString` elements to the given file. Overwrites existing files
		 by truncating their contents as default.
		 
		 Materializes a `Future` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 This source is backed by an Actor which will use the dedicated `akka.stream.blocking-io-dispatcher`,
		 unless configured otherwise by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		
		Parameters:
		`f` \- the file to write to
		`options` \- File open options, see `StandardOpenOption`, defaults to Set(WRITE, TRUNCATE\_EXISTING, CREATE)
		- #### toFile$default$2
		
		
		
		```
		public static scala.collection.immutable.Set<java.nio.file.OpenOption> toFile$default$2()
		```
		- #### toPath
		
		
		
		```
		public static [Sink](Sink.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>> toPath​(java.nio.file.Path f,
		                                                                              scala.collection.immutable.Set<java.nio.file.OpenOption> options)
		```
		
		Creates a Sink which writes incoming `ByteString` elements to the given file path. Overwrites existing files
		 by truncating their contents as default.
		 
		 Materializes a `Future` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 This source is backed by an Actor which will use the dedicated `akka.stream.blocking-io-dispatcher`,
		 unless configured otherwise by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 Accepts as arguments a set of `StandardOpenOption`, which will determine
		 the underlying behavior when writing the file. If `java.nio.file.StandardOpenOption.SYNC` is
		 provided, every update to the file's content be written synchronously to the underlying storage
		 device. Otherwise (the default), the write will be written to the storage device asynchronously
		 by the OS, and may not be stored durably on the storage device at the time the stream completes.
		 
		
		
		
		Parameters:
		`f` \- the file path to write to
		`options` \- File open options, see `StandardOpenOption`, defaults to Set(WRITE, TRUNCATE\_EXISTING, CREATE)
		- #### toPath
		
		
		
		```
		public static [Sink](Sink.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>> toPath​(java.nio.file.Path f,
		                                                                              scala.collection.immutable.Set<java.nio.file.OpenOption> options,
		                                                                              long startPosition)
		```
		
		Creates a Sink which writes incoming `ByteString` elements to the given file path. Overwrites existing files
		 by truncating their contents as default.
		 
		 Materializes a `Future` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 This source is backed by an Actor which will use the dedicated `akka.stream.blocking-io-dispatcher`,
		 unless configured otherwise by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 Accepts as arguments a set of `StandardOpenOption`, which will determine
		 the underlying behavior when writing the file. If `java.nio.file.StandardOpenOption.SYNC` is
		 provided, every update to the file's content be written synchronously to the underlying storage
		 device. Otherwise (the default), the write will be written to the storage device asynchronously
		 by the OS, and may not be stored durably on the storage device at the time the stream completes.
		 
		
		
		
		Parameters:
		`f` \- the file path to write to
		`options` \- File open options, see `StandardOpenOption`, defaults to Set(WRITE, CREATE)
		`startPosition` \- the start position to write to
		- #### toPath$default$2
		
		
		
		```
		public static scala.collection.immutable.Set<java.nio.file.OpenOption> toPath$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/ActorAttributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/IOResult.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FileIO.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/FileIO.html)*