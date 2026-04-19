---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:21Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/file.html
title: File • Alpakka Documentation
---

# File • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# File

The File connectors provide additional connectors for filesystems complementing the sources and sinks for files already included in core Akka Streams (which can be found in ).

| Project Info: Alpakka File | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-stream\-alpakka\-file 10\.0\.2 [Snapshots are available](other-docs/snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.stream.alpakka.file |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka/v10.0.2/LICENSE) |
| Readiness level | [Community\-driven](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#community-driven) Since 0\.1, 2016\-11\-16 |
| Home page | <https://doc.akka.io/libraries/alpakka/current> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/file/index.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [GitHub releases](https://github.com/akka/alpakka/releases) |
| Issues | [Github issues](https://github.com/akka/alpakka/labels/p%3Afile) |
| Sources | <https://github.com/akka/alpakka> |

## Artifacts

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-file" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-file_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-file_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

The table below shows direct dependencies of this module and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.typesafe.akka | akka\-stream\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## Writing to and reading from files

Use the `FileIO` class to create streams reading from or writing to files. It is part part of Akka streams. 

[Akka Streaming File IO documentation](https://doc.akka.io/libraries/akka-core/current/stream/stream-io.html#streaming-file-io)

## Tailing a file into a stream

The `FileTailSource` starts at a given offset in a file and emits chunks of bytes until reaching the end of the file, it will then poll the file for changes and emit new changes as they are written to the file (unless there is backpressure).

A very common use case is combining reading bytes with parsing the bytes into lines, therefore `FileTailSource` contains a few factory methods to create a source that parses the bytes into lines and emits those.

In this sample we simply tail the lines of a file and print them to standard out:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/FileTailSourceSpec.scala#L24-L33 "Go to snippet source")import akka.stream.alpakka.file.scaladsl.FileTailSource

val fs = FileSystems.getDefault
val lines: Source[String, NotUsed] = FileTailSource.lines(
  path = fs.getPath(path),
  maxLineSize = 8192,
  pollingInterval = 250.millis
)

lines.runForeach(line => System.out.println(line))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/FileTailSourceTest.java#L221-L229 "Go to snippet source")final FileSystem fs = FileSystems.getDefault();
final Duration pollingInterval = Duration.ofMillis(250);
final int maxLineSize = 8192;

final Source<String, NotUsed> lines =
    akka.stream.alpakka.file.javadsl.FileTailSource.createLines(
        fs.getPath(path), maxLineSize, pollingInterval);

lines.runForeach(System.out::println, system);
```

### Shutdown stream when file is deleted

The `FileTailSource` stream will not shutdown or throw an error when the file it is tailing is deleted from the filesystem. If you would like to shutdown the stream, or throw an error, you can do so by merging in a [`DirectoryChangesSource`](/api/alpakka/10.0.2/akka/stream/alpakka/file/javadsl/DirectoryChangesSource$.html "akka.stream.alpakka.file.javadsl.DirectoryChangesSource")[`DirectoryChangesSource`](/api/alpakka/10.0.2/akka/stream/alpakka/file/scaladsl/DirectoryChangesSource$.html "akka.stream.alpakka.file.scaladsl.DirectoryChangesSource") that listens to filesystem events in the directory that contains the file.

In the following example, a `DirectoryChangesSource` is used to watch for events in a directory. If a file delete event is observed for the file we are tailing then we shutdown the stream gracefully by using a [`Flow.recoverWithRetries`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow.recoverWithRetries`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow$.html "akka.stream.scaladsl.Flow") to switch to a [`Source.empty`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source.empty`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source$.html "akka.stream.scaladsl.Source"), which with immediately send an `OnComplete` signal and shutdown the stream.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/FileTailSourceExtrasSpec.scala#L44-L58 "Go to snippet source")  
val checkInterval = 1.second
val fileCheckSource = DirectoryChangesSource(path.getParent, checkInterval, 8192)
  .collect {
    case (p, DirectoryChange.Deletion) if path == p =>
      throw new FileNotFoundException(path.toString)
  }
  .recoverWithRetries(1, {
    case _: FileNotFoundException => Source.empty
  })

val stream = FileTailSource
  .lines(path = path, maxLineSize = 8192, pollingInterval = 250.millis)
  .merge(fileCheckSource, eagerComplete = true)

```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/FileTailSourceTest.java#L135-L159 "Go to snippet source")  
final Duration checkInterval = Duration.ofSeconds(1);
final Source<String, NotUsed> fileCheckSource =
    akka.stream.alpakka.file.javadsl.DirectoryChangesSource.create(
            path.getParent(), checkInterval, 8192)
        .mapConcat(
            pair -> {
              if (pair.first().equals(path) && pair.second() == DirectoryChange.Deletion) {
                throw new FileNotFoundException();
              }
              return Collections.<String>emptyList();
            })
        .recoverWithRetries(
            -1,
            new PFBuilder<Throwable, Source<String, NotUsed>>()
                .match(FileNotFoundException.class, t -> Source.empty())
                .build());

final Source<String, NotUsed> source =
    akka.stream.alpakka.file.javadsl.FileTailSource.createLines(
            path,
            8192, // chunk size
            Duration.ofMillis(250))
        .merge(fileCheckSource, true);

```

Stream Shutdown Race Condition
Since the `DirectoryChangesSource` and the `FileTailSource` operate asynchronously as separate sources there is the possibility that the stream could be shutdown prematurely. If the file is detected as deleted and the stream is shutdown before the last element is emitted from `FileTailSource`, then that data will never be available to downstream user stages.

### Shutdown stream after an idle timeout

It may be useful to shutdown the stream when no new data has been added for awhile to a file being tailed by `FileTailSource`. In the following example, a [`Flow.idleTimeout`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow.idleTimeout`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow$.html "akka.stream.scaladsl.Flow") operator is used to trigger a `TimeoutException` that can be recovered with [`Flow.recoverWithRetries`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow.recoverWithRetries`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow$.html "akka.stream.scaladsl.Flow") and a [`Source.empty`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source.empty`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source$.html "akka.stream.scaladsl.Source") to successfully shutdown the stream.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/FileTailSourceExtrasSpec.scala#L77-L84 "Go to snippet source")  
val stream = FileTailSource
  .lines(path = path, maxLineSize = 8192, pollingInterval = 250.millis)
  .idleTimeout(5.seconds)
  .recoverWithRetries(1, {
    case _: TimeoutException => Source.empty
  })

```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/FileTailSourceTest.java#L181-L193 "Go to snippet source")  
Source<String, NotUsed> stream =
    akka.stream.alpakka.file.javadsl.FileTailSource.createLines(
            path,
            8192, // chunk size
            Duration.ofMillis(250))
        .idleTimeout(Duration.ofSeconds(5))
        .recoverWithRetries(
            -1,
            new PFBuilder<Throwable, Source<String, NotUsed>>()
                .match(TimeoutException.class, t -> Source.empty())
                .build());

```

## Creating directories

`Directory.mkdirs()` and `Directory.mkdirsWithContext()` create directories for [`Path`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/nio/file/Path.html "java.nio.file.Path") elements in the stream. The `withContext`\-variant allows the user to pass through additional information with every path.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/DirectorySpec.scala#L86-L109 "Go to snippet source")import akka.stream.alpakka.file.scaladsl.Directory

val flow: Flow[Path, Path, NotUsed] = Directory.mkdirs()

val created: Future[immutable.Seq[Path]] =
  Source(immutable.Seq(dir.resolve("dirA"), dir.resolve("dirB")))
    .via(flow)
    .runWith(Sink.seq)

val flowWithContext: FlowWithContext[Path, SomeContext, Path, SomeContext, NotUsed] =
  Directory.mkdirsWithContext[SomeContext]()
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/DirectoryTest.java#L132-L153 "Go to snippet source")Flow<Path, Path, NotUsed> flow = Directory.mkdirs();

CompletionStage<List<Path>> created =
    Source.from(Arrays.asList(dir.resolve("dirA"), dir.resolve("dirB")))
        .via(flow)
        .runWith(Sink.seq(), system);

FlowWithContext<Path, SomeContext, Path, SomeContext, NotUsed> flowWithContext =
    Directory.mkdirsWithContext();
```

## Listing directory contents

`Directory.ls(path)` lists all files and directories directly in a given directory:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/DirectorySpec.scala#L44-L46 "Go to snippet source")import akka.stream.alpakka.file.scaladsl.Directory

val source: Source[Path, NotUsed] = Directory.ls(dir)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/DirectoryTest.java#L12-L70 "Go to snippet source")import akka.stream.Materializer;
import akka.stream.alpakka.file.javadsl.Directory;

final Source<Path, NotUsed> source = Directory.ls(dir);
```

`Directory.walk(path)` traverses all subdirectories and lists files and directories depth first:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/DirectorySpec.scala#L66-L71 "Go to snippet source")import akka.stream.alpakka.file.scaladsl.Directory
import java.nio.file.FileVisitOption

val files: Source[Path, NotUsed] = Directory.walk(root)

val files2: Source[Path, NotUsed] = Directory.walk(root, maxDepth = Some(1), List(FileVisitOption.FOLLOW_LINKS))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/DirectoryTest.java#L12-L118 "Go to snippet source")import akka.stream.Materializer;
import akka.stream.alpakka.file.javadsl.Directory;
import java.nio.file.FileVisitOption;

final Source<Path, NotUsed> source = Directory.walk(root);

final Source<Path, NotUsed> source = Directory.walk(root, 1, FileVisitOption.FOLLOW_LINKS);
```

## Listening to changes in a directory

The `DirectoryChangesSource` will emit elements every time there is a change to a watched directory in the local filesystem, the emitted change concists of the path that was changed and an enumeration describing what kind of change it was.

In this sample we simply print each change to the directory to standard output:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/DirectoryChangesSourceSpec.scala#L20-L26 "Go to snippet source")import akka.stream.alpakka.file.scaladsl.DirectoryChangesSource

val fs = FileSystems.getDefault
val changes = DirectoryChangesSource(fs.getPath(path), pollInterval = 1.second, maxBufferSize = 1000)
changes.runForeach {
  case (path, change) => println("Path: " + path + ", Change: " + change)
}
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/DirectoryChangesSourceTest.java#L13-L163 "Go to snippet source")import akka.stream.alpakka.file.javadsl.DirectoryChangesSource;

final FileSystem fs = FileSystems.getDefault();
final Duration pollingInterval = Duration.ofSeconds(1);
final int maxBufferSize = 1000;
final Source<Pair<Path, DirectoryChange>, NotUsed> changes =
    DirectoryChangesSource.create(fs.getPath(path), pollingInterval, maxBufferSize);

changes.runForeach(
    (Pair<Path, DirectoryChange> pair) -> {
      final Path changedPath = pair.first();
      final DirectoryChange change = pair.second();
      System.out.println("Path: " + changedPath + ", Change: " + change);
    },
    system);
```

## Rotating the file to stream into

The [`LogRotatorSink`](/api/alpakka/10.0.2/akka/stream/alpakka/file/javadsl/LogRotatorSink$.html "akka.stream.alpakka.file.javadsl.LogRotatorSink")[`LogRotatorSink`](/api/alpakka/10.0.2/akka/stream/alpakka/file/scaladsl/LogRotatorSink$.html "akka.stream.alpakka.file.scaladsl.LogRotatorSink") will create and write to multiple files.  
This sink takes a creator as parameter which returns a `Bytestring => Option[Path]` function`Function<ByteString, Optional<Path>>`. If the generated function returns a path the sink will rotate the file output to this new path and the actual `ByteString` will be written to this new file too. With this approach the user can define a custom stateful file generation implementation.

This example usage shows the built\-in target file creation and a custom sink factory which is required to use [`Compression`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Compression.html "akka.stream.javadsl.Compression")[`Compression`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Compression$.html "akka.stream.scaladsl.Compression") for the target files.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/LogRotatorSinkSpec.scala#L155-L284 "Go to snippet source")val triggerFunctionCreator: () => ByteString => Option[Path] = ???

val completion = Source(immutable.Seq("test1", "test2", "test3", "test4", "test5", "test6"))
  .map(ByteString(_))
  .runWith(LogRotatorSink(triggerFunctionCreator))

// GZip compressing the data written
val completion =
  source
    .runWith(
      LogRotatorSink.withSinkFactory(
        triggerFunctionCreator,
        (path: Path) =>
          Flow[ByteString]
            .via(Compression.gzip)
            .toMat(FileIO.toPath(path))(Keep.right)
      )
    )
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/LogRotatorSinkTest.java#L118-L144 "Go to snippet source")import akka.stream.alpakka.file.javadsl.LogRotatorSink;

Creator<Function<ByteString, Optional<Path>>> triggerFunctionCreator = ...;

CompletionStage<Done> completion =
    Source.from(Arrays.asList("test1", "test2", "test3", "test4", "test5", "test6"))
        .map(ByteString::fromString)
        .runWith(LogRotatorSink.createFromFunction(triggerFunctionCreator), system);

// GZip compressing the data written
CompletionStage<Done> compressedCompletion =
    source.runWith(
        LogRotatorSink.withSinkFactory(
            triggerFunctionCreator,
            path ->
                Flow.of(ByteString.class)
                    .via(Compression.gzip())
                    .toMat(FileIO.toPath(path), Keep.right())),
        system);
```

### Example: size\-based rotation

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/LogRotatorSinkSpec.scala#L100-L117 "Go to snippet source")import akka.stream.alpakka.file.scaladsl.LogRotatorSink

val fileSizeTriggerCreator: () => ByteString => Option[Path] = () => {
  val max = 10 * 1024 * 1024
  var size: Long = max
  (element: ByteString) =>
    if (size + element.size > max) {
      val path = Files.createTempFile("out-", ".log")
      size = element.size
      Some(path)
    } else {
      size += element.size
      None
    }
}

val sizeRotatorSink: Sink[ByteString, Future[Done]] =
  LogRotatorSink(fileSizeTriggerCreator)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/LogRotatorSinkTest.java#L56-L73 "Go to snippet source")Creator<Function<ByteString, Optional<Path>>> sizeBasedTriggerCreator =
    () -> {
      long max = 10 * 1024 * 1024;
      final long[] size = new long[] {max};
      return (element) -> {
        if (size[0] + element.size() > max) {
          Path path = Files.createTempFile("out-", ".log");
          size[0] = element.size();
          return Optional.of(path);
        } else {
          size[0] += element.size();
          return Optional.empty();
        }
      };
    };

Sink<ByteString, CompletionStage<Done>> sizeRotatorSink =
    LogRotatorSink.createFromFunction(sizeBasedTriggerCreator);
```

### Example: time\-based rotation

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/LogRotatorSinkSpec.scala#L129-L146 "Go to snippet source")val destinationDir = FileSystems.getDefault.getPath("/tmp")
val formatter = DateTimeFormatter.ofPattern("'stream-'yyyy-MM-dd_HH'.log'")

val timeBasedTriggerCreator: () => ByteString => Option[Path] = () => {
  var currentFilename: Option[String] = None
  (_: ByteString) => {
    val newName = LocalDateTime.now().format(formatter)
    if (currentFilename.contains(newName)) {
      None
    } else {
      currentFilename = Some(newName)
      Some(destinationDir.resolve(newName))
    }
  }
}

val timeBasedSink: Sink[ByteString, Future[Done]] =
  LogRotatorSink(timeBasedTriggerCreator)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/LogRotatorSinkTest.java#L87-L105 "Go to snippet source")final Path destinationDir = FileSystems.getDefault().getPath("/tmp");
final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'stream-'yyyy-MM-dd_HH'.log'");

Creator<Function<ByteString, Optional<Path>>> timeBasedTriggerCreator =
    () -> {
      final String[] currentFileName = new String[] {null};
      return (element) -> {
        String newName = LocalDateTime.now().format(formatter);
        if (newName.equals(currentFileName[0])) {
          return Optional.empty();
        } else {
          currentFileName[0] = newName;
          return Optional.of(destinationDir.resolve(newName));
        }
      };
    };

Sink<ByteString, CompletionStage<Done>> timeBasedSink =
    LogRotatorSink.createFromFunction(timeBasedTriggerCreator);
```

### Example: content\-based rotation with compression to SFTP file

This example can be found in the [self\-contained example documentation section](examples/ftp-samples.html#example-rotate-data-stream-over-to-multiple-compressed-files-on-sftp-server).

## ZIP Archive

### Writing ZIP Archives

The [`Archive`](/api/alpakka/10.0.2/akka/stream/alpakka/file/javadsl/Archive$.html "akka.stream.alpakka.file.javadsl.Archive")[`Archive`](/api/alpakka/10.0.2/akka/stream/alpakka/file/scaladsl/Archive$.html "akka.stream.alpakka.file.scaladsl.Archive") contains flow for compressing multiple files into one ZIP file.

Result of flow can be send to sink even before whole ZIP file is created, so size of resulting ZIP archive is not limited to memory size. 

This example usage shows compressing files from disk. 

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/ArchiveSpec.scala#L62-L78 "Go to snippet source")val fileStream1: Source[ByteString,  Any] = ...
val fileStream2: Source[ByteString,  Any] = ...

val filesStream = Source(
  List(
    (ArchiveMetadata("akka_full_color.svg"), fileStream1),
    (ArchiveMetadata("akka_icon_reverse.svg"), fileStream2)
  )
)

val result = filesStream
  .via(Archive.zip())
  .runWith(FileIO.toPath(Paths.get("result.zip")))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/ArchiveTest.java#L74-L91 "Go to snippet source")Source<ByteString, NotUsed> source1 = ...
Source<ByteString, NotUsed> source2 = ...

Pair<ArchiveMetadata, Source<ByteString, NotUsed>> pair1 =
    Pair.create(ArchiveMetadata.create("akka_full_color.svg"), source1);
Pair<ArchiveMetadata, Source<ByteString, NotUsed>> pair2 =
    Pair.create(ArchiveMetadata.create("akka_icon_reverse.svg"), source2);

Source<Pair<ArchiveMetadata, Source<ByteString, NotUsed>>, NotUsed> source =
    Source.from(Arrays.asList(pair1, pair2));

Sink<ByteString, CompletionStage<IOResult>> fileSink = FileIO.toPath(Paths.get("logo.zip"));
CompletionStage<IOResult> ioResult = source.via(Archive.zip()).runWith(fileSink, system);

```

### Reading ZIP archives

[`Archive.zipReader()`](/api/alpakka/10.0.2/akka/stream/alpakka/file/javadsl/Archive$.html "akka.stream.alpakka.file.javadsl.Archive")[`Archive.zipReader()`](/api/alpakka/10.0.2/akka/stream/alpakka/file/scaladsl/Archive$.html "akka.stream.alpakka.file.scaladsl.Archive") reads a file in ZIP format, and emitting the metadata entry and a `Source` for every file in the stream. It is not needed to emit every file, also multiple files can be emitted in parallel. (Every sub\-source will seek into the archive.)

The example below reads the incoming file, and unzip all to the local file system.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/ArchiveSpec.scala#L140-L166 "Go to snippet source")val zipFile = // ???
val target: Path = // ???
Archive
  .zipReader(zipFile)
  .mapAsyncUnordered(4) {
    case (metadata, source) =>
      val targetFile = target.resolve(metadata.name)
      targetFile.toFile.getParentFile.mkdirs() //missing error handler
      source.runWith(FileIO.toPath(targetFile))
  }
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/ArchiveTest.java#L111-L123 "Go to snippet source")Archive.zipReader(Paths.get("logo.zip").toFile())
    .mapAsync(
        4,
        pair -> {
          ZipArchiveMetadata metadata = pair.first();
          Path targetFile = target.resolve(metadata.getName());
          targetFile.toFile().getParentFile().mkdirs(); // missing error handler
          Source<ByteString, NotUsed> fSource = pair.second();
          // create the target directory
          return fSource
              .runWith(FileIO.toPath(targetFile), system)
              .thenApply(io -> Done.done());
        });
```

## TAR Archive

### Writing TAR archives

[`Archive.tar()`](/api/alpakka/10.0.2/akka/stream/alpakka/file/javadsl/Archive$.html "akka.stream.alpakka.file.javadsl.Archive")[`Archive.tar()`](/api/alpakka/10.0.2/akka/stream/alpakka/file/scaladsl/Archive$.html "akka.stream.alpakka.file.scaladsl.Archive") creates a flow for packaging multiple files into one TAR archive.

Result of flow can be send to sink even before whole TAR file is created, so size of resulting TAR archive is not limited to memory size.

This example usage shows packaging directories and files from disk.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/TarArchiveSpec.scala#L68-L88 "Go to snippet source")  val fileStream1: Source[ByteString,  Any] = ...
  val fileStream2: Source[ByteString,  Any] = ...
  val fileSize1: Long = ...
  val fileSize2: Long = ...

val filesStream = Source(
  List(
    (TarArchiveMetadata.directory("subdir", lastModification), Source.empty),
    (TarArchiveMetadata("subdir", "akka_full_color.svg", fileSize1, lastModification), fileStream1),
    (TarArchiveMetadata("akka_icon_reverse.svg", fileSize2, lastModification), fileStream2)
  )
)

val result = filesStream
  .via(Archive.tar())
  .runWith(FileIO.toPath(Paths.get("result.tar")))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/ArchiveTest.java#L145-L170 "Go to snippet source")Source<ByteString, NotUsed> source1 = ...
Source<ByteString, NotUsed> source2 = ...
Long size1 = ...
Long size2 = ...

Pair<TarArchiveMetadata, Source<ByteString, NotUsed>> dir =
    Pair.create(TarArchiveMetadata.directory("subdir", lastModification), Source.empty());

Pair<TarArchiveMetadata, Source<ByteString, NotUsed>> pair1 =
    Pair.create(
        TarArchiveMetadata.create("subdir", "akka_full_color.svg", size1, lastModification),
        source1);
Pair<TarArchiveMetadata, Source<ByteString, NotUsed>> pair2 =
    Pair.create(
        TarArchiveMetadata.create("akka_icon_reverse.svg", size2, lastModification), source2);

Source<Pair<TarArchiveMetadata, Source<ByteString, NotUsed>>, NotUsed> source =
    Source.from(Arrays.asList(dir, pair1, pair2));

Sink<ByteString, CompletionStage<IOResult>> fileSink = FileIO.toPath(Paths.get("logo.tar"));
CompletionStage<IOResult> ioResult = source.via(Archive.tar()).runWith(fileSink, system);
```

To produce a gzipped TAR file see the following example.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/TarArchiveSpec.scala#L92-L94 "Go to snippet source")val resultGz = filesStream
  .via(Archive.tar().via(akka.stream.scaladsl.Compression.gzip))
  .runWith(FileIO.toPath(Paths.get("result.tar.gz")))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/ArchiveTest.java#L174-L179 "Go to snippet source")Sink<ByteString, CompletionStage<IOResult>> fileSinkGz =
    FileIO.toPath(Paths.get("logo.tar.gz"));
CompletionStage<IOResult> ioResultGz =
    source
        .via(Archive.tar().via(akka.stream.javadsl.Compression.gzip()))
        .runWith(fileSinkGz, system);
```

### Reading TAR archives

[`Archive.tarReader()`](/api/alpakka/10.0.2/akka/stream/alpakka/file/javadsl/Archive$.html "akka.stream.alpakka.file.javadsl.Archive")[`Archive.tarReader()`](/api/alpakka/10.0.2/akka/stream/alpakka/file/scaladsl/Archive$.html "akka.stream.alpakka.file.scaladsl.Archive") reads a stream of `ByteString`s as TAR format emitting the metadata entry and a `Source` for every file in the stream. It is essential to request all the emitted source’s data, otherwise the stream will not reach the next file entry.

The example below reads the incoming stream, creates directories and stores all files in the local file system.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/scala/docs/scaladsl/TarArchiveSpec.scala#L172-L201 "Go to snippet source")val bytesSource: Source[ByteString, NotUsed] = // ???
val tar =
  bytesSource
    .via(Archive.tarReader())
    .mapAsync(1) {
      case (metadata, source) =>
        val targetFile = target.resolve(metadata.filePath)
        if (metadata.isDirectory) {
          Source
            .single(targetFile)
            .via(Directory.mkdirs())
            .runWith(Sink.ignore)
        } else {
          // create the target directory
          Source
            .single(targetFile.getParent)
            .via(Directory.mkdirs())
            .runWith(Sink.ignore)
            .map { _ =>
              // stream the file contents to a local file
              source.runWith(FileIO.toPath(targetFile))
            }
        }
    }
    .runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/ArchiveTest.java#L204-L236 "Go to snippet source")Source<ByteString, NotUsed> bytesSource = // ???
CompletionStage<Done> tar =
    bytesSource
        .via(Archive.tarReader())
        .mapAsync(
            1,
            pair -> {
              TarArchiveMetadata metadata = pair.first();
              Path targetFile = target.resolve(metadata.filePath());
              if (metadata.isDirectory()) {
                return Source.single(targetFile)
                    .via(Directory.mkdirs())
                    .runWith(Sink.ignore(), system);
              } else {
                Source<ByteString, NotUsed> source = pair.second();
                // create the target directory
                return Source.single(targetFile.getParent())
                    .via(Directory.mkdirs())
                    .runWith(Sink.ignore(), system)
                    .thenCompose(
                        done ->
                            // stream the file contents to a local file
                            source
                                .runWith(FileIO.toPath(targetFile), system)
                                .thenApply(io -> Done.done()));
              }
            })
        .runWith(Sink.ignore(), system);
```

The test in [`NestedTarRaderTest`](https://github.com/akka/alpakka/tree/v10.0.2/file/src/test/java/docs/javadsl/NestedTarReaderTest.java) illustrates how the tar reader may be used to extract tar archives from within a tar archive.

## Code Examples

### Example 1: Artifacts

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-file" % "10.0.2",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```

### Example 2: Artifacts

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-file_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 3: Artifacts

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-file_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 4: Tailing a file into a stream

```scala
import akka.stream.alpakka.file.scaladsl.FileTailSource

val fs = FileSystems.getDefault
val lines: Source[String, NotUsed] = FileTailSource.lines(
  path = fs.getPath(path),
  maxLineSize = 8192,
  pollingInterval = 250.millis
)

lines.runForeach(line => System.out.println(line))
```

### Example 5: Tailing a file into a stream

```java
final FileSystem fs = FileSystems.getDefault();
final Duration pollingInterval = Duration.ofMillis(250);
final int maxLineSize = 8192;

final Source<String, NotUsed> lines =
    akka.stream.alpakka.file.javadsl.FileTailSource.createLines(
        fs.getPath(path), maxLineSize, pollingInterval);

lines.runForeach(System.out::println, system);
```

### Example 6: Shutdown stream when file is deleted

```scala
val checkInterval = 1.second
val fileCheckSource = DirectoryChangesSource(path.getParent, checkInterval, 8192)
  .collect {
    case (p, DirectoryChange.Deletion) if path == p =>
      throw new FileNotFoundException(path.toString)
  }
  .recoverWithRetries(1, {
    case _: FileNotFoundException => Source.empty
  })

val stream = FileTailSource
  .lines(path = path, maxLineSize = 8192, pollingInterval = 250.millis)
  .merge(fileCheckSource, eagerComplete = true)
```

### Example 7: Shutdown stream when file is deleted

```java
final Duration checkInterval = Duration.ofSeconds(1);
final Source<String, NotUsed> fileCheckSource =
    akka.stream.alpakka.file.javadsl.DirectoryChangesSource.create(
            path.getParent(), checkInterval, 8192)
        .mapConcat(
            pair -> {
              if (pair.first().equals(path) && pair.second() == DirectoryChange.Deletion) {
                throw new FileNotFoundException();
              }
              return Collections.<String>emptyList();
            })
        .recoverWithRetries(
            -1,
            new PFBuilder<Throwable, Source<String, NotUsed>>()
                .match(FileNotFoundException.class, t -> Source.empty())
                .build());

final Source<String, NotUsed> source =
    akka.stream.alpakka.file.javadsl.FileTailSource.createLines(
            path,
            8192, // chunk size
            Duration.ofMillis(250))
        .merge(fileCheckSource, true);
```

### Example 8: Shutdown stream after an idle timeout

```scala
val stream = FileTailSource
  .lines(path = path, maxLineSize = 8192, pollingInterval = 250.millis)
  .idleTimeout(5.seconds)
  .recoverWithRetries(1, {
    case _: TimeoutException => Source.empty
  })
```

### Example 9: Shutdown stream after an idle timeout

```java
Source<String, NotUsed> stream =
    akka.stream.alpakka.file.javadsl.FileTailSource.createLines(
            path,
            8192, // chunk size
            Duration.ofMillis(250))
        .idleTimeout(Duration.ofSeconds(5))
        .recoverWithRetries(
            -1,
            new PFBuilder<Throwable, Source<String, NotUsed>>()
                .match(TimeoutException.class, t -> Source.empty())
                .build());
```

### Example 10: Creating directories

```scala
import akka.stream.alpakka.file.scaladsl.Directory

val flow: Flow[Path, Path, NotUsed] = Directory.mkdirs()

val created: Future[immutable.Seq[Path]] =
  Source(immutable.Seq(dir.resolve("dirA"), dir.resolve("dirB")))
    .via(flow)
    .runWith(Sink.seq)

val flowWithContext: FlowWithContext[Path, SomeContext, Path, SomeContext, NotUsed] =
  Directory.mkdirsWithContext[SomeContext]()
```

### Example 11: Creating directories

```java
Flow<Path, Path, NotUsed> flow = Directory.mkdirs();

CompletionStage<List<Path>> created =
    Source.from(Arrays.asList(dir.resolve("dirA"), dir.resolve("dirB")))
        .via(flow)
        .runWith(Sink.seq(), system);

FlowWithContext<Path, SomeContext, Path, SomeContext, NotUsed> flowWithContext =
    Directory.mkdirsWithContext();
```

### Example 12: Listing directory contents

```scala
import akka.stream.alpakka.file.scaladsl.Directory

val source: Source[Path, NotUsed] = Directory.ls(dir)
```

### Example 13: Listing directory contents

```java
import akka.stream.Materializer;
import akka.stream.alpakka.file.javadsl.Directory;

final Source<Path, NotUsed> source = Directory.ls(dir);
```

### Example 14: Listing directory contents

```scala
import akka.stream.alpakka.file.scaladsl.Directory
import java.nio.file.FileVisitOption

val files: Source[Path, NotUsed] = Directory.walk(root)

val files2: Source[Path, NotUsed] = Directory.walk(root, maxDepth = Some(1), List(FileVisitOption.FOLLOW_LINKS))
```

### Example 15: Listing directory contents

```java
import akka.stream.Materializer;
import akka.stream.alpakka.file.javadsl.Directory;
import java.nio.file.FileVisitOption;

final Source<Path, NotUsed> source = Directory.walk(root);

final Source<Path, NotUsed> source = Directory.walk(root, 1, FileVisitOption.FOLLOW_LINKS);
```

### Example 16: Listening to changes in a directory

```scala
import akka.stream.alpakka.file.scaladsl.DirectoryChangesSource

val fs = FileSystems.getDefault
val changes = DirectoryChangesSource(fs.getPath(path), pollInterval = 1.second, maxBufferSize = 1000)
changes.runForeach {
  case (path, change) => println("Path: " + path + ", Change: " + change)
}
```

### Example 17: Listening to changes in a directory

```java
import akka.stream.alpakka.file.javadsl.DirectoryChangesSource;

final FileSystem fs = FileSystems.getDefault();
final Duration pollingInterval = Duration.ofSeconds(1);
final int maxBufferSize = 1000;
final Source<Pair<Path, DirectoryChange>, NotUsed> changes =
    DirectoryChangesSource.create(fs.getPath(path), pollingInterval, maxBufferSize);

changes.runForeach(
    (Pair<Path, DirectoryChange> pair) -> {
      final Path changedPath = pair.first();
      final DirectoryChange change = pair.second();
      System.out.println("Path: " + changedPath + ", Change: " + change);
    },
    system);
```

### Example 18: Rotating the file to stream into

```scala
val triggerFunctionCreator: () => ByteString => Option[Path] = ???

val completion = Source(immutable.Seq("test1", "test2", "test3", "test4", "test5", "test6"))
  .map(ByteString(_))
  .runWith(LogRotatorSink(triggerFunctionCreator))

// GZip compressing the data written
val completion =
  source
    .runWith(
      LogRotatorSink.withSinkFactory(
        triggerFunctionCreator,
        (path: Path) =>
          Flow[ByteString]
            .via(Compression.gzip)
            .toMat(FileIO.toPath(path))(Keep.right)
      )
    )
```

### Example 19: Rotating the file to stream into

```java
import akka.stream.alpakka.file.javadsl.LogRotatorSink;

Creator<Function<ByteString, Optional<Path>>> triggerFunctionCreator = ...;

CompletionStage<Done> completion =
    Source.from(Arrays.asList("test1", "test2", "test3", "test4", "test5", "test6"))
        .map(ByteString::fromString)
        .runWith(LogRotatorSink.createFromFunction(triggerFunctionCreator), system);

// GZip compressing the data written
CompletionStage<Done> compressedCompletion =
    source.runWith(
        LogRotatorSink.withSinkFactory(
            triggerFunctionCreator,
            path ->
                Flow.of(ByteString.class)
                    .via(Compression.gzip())
                    .toMat(FileIO.toPath(path), Keep.right())),
        system);
```

### Example 20: Example: size-based rotation

```scala
import akka.stream.alpakka.file.scaladsl.LogRotatorSink

val fileSizeTriggerCreator: () => ByteString => Option[Path] = () => {
  val max = 10 * 1024 * 1024
  var size: Long = max
  (element: ByteString) =>
    if (size + element.size > max) {
      val path = Files.createTempFile("out-", ".log")
      size = element.size
      Some(path)
    } else {
      size += element.size
      None
    }
}

val sizeRotatorSink: Sink[ByteString, Future[Done]] =
  LogRotatorSink(fileSizeTriggerCreator)
```

### Example 21: Example: size-based rotation

```java
Creator<Function<ByteString, Optional<Path>>> sizeBasedTriggerCreator =
    () -> {
      long max = 10 * 1024 * 1024;
      final long[] size = new long[] {max};
      return (element) -> {
        if (size[0] + element.size() > max) {
          Path path = Files.createTempFile("out-", ".log");
          size[0] = element.size();
          return Optional.of(path);
        } else {
          size[0] += element.size();
          return Optional.empty();
        }
      };
    };

Sink<ByteString, CompletionStage<Done>> sizeRotatorSink =
    LogRotatorSink.createFromFunction(sizeBasedTriggerCreator);
```

### Example 22: Example: time-based rotation

```scala
val destinationDir = FileSystems.getDefault.getPath("/tmp")
val formatter = DateTimeFormatter.ofPattern("'stream-'yyyy-MM-dd_HH'.log'")

val timeBasedTriggerCreator: () => ByteString => Option[Path] = () => {
  var currentFilename: Option[String] = None
  (_: ByteString) => {
    val newName = LocalDateTime.now().format(formatter)
    if (currentFilename.contains(newName)) {
      None
    } else {
      currentFilename = Some(newName)
      Some(destinationDir.resolve(newName))
    }
  }
}

val timeBasedSink: Sink[ByteString, Future[Done]] =
  LogRotatorSink(timeBasedTriggerCreator)
```

### Example 23: Example: time-based rotation

```java
final Path destinationDir = FileSystems.getDefault().getPath("/tmp");
final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'stream-'yyyy-MM-dd_HH'.log'");

Creator<Function<ByteString, Optional<Path>>> timeBasedTriggerCreator =
    () -> {
      final String[] currentFileName = new String[] {null};
      return (element) -> {
        String newName = LocalDateTime.now().format(formatter);
        if (newName.equals(currentFileName[0])) {
          return Optional.empty();
        } else {
          currentFileName[0] = newName;
          return Optional.of(destinationDir.resolve(newName));
        }
      };
    };

Sink<ByteString, CompletionStage<Done>> timeBasedSink =
    LogRotatorSink.createFromFunction(timeBasedTriggerCreator);
```

### Example 24: Writing ZIP Archives

```scala
val fileStream1: Source[ByteString,  Any] = ...
val fileStream2: Source[ByteString,  Any] = ...

val filesStream = Source(
  List(
    (ArchiveMetadata("akka_full_color.svg"), fileStream1),
    (ArchiveMetadata("akka_icon_reverse.svg"), fileStream2)
  )
)

val result = filesStream
  .via(Archive.zip())
  .runWith(FileIO.toPath(Paths.get("result.zip")))
```

### Example 25: Writing ZIP Archives

```java
Source<ByteString, NotUsed> source1 = ...
Source<ByteString, NotUsed> source2 = ...

Pair<ArchiveMetadata, Source<ByteString, NotUsed>> pair1 =
    Pair.create(ArchiveMetadata.create("akka_full_color.svg"), source1);
Pair<ArchiveMetadata, Source<ByteString, NotUsed>> pair2 =
    Pair.create(ArchiveMetadata.create("akka_icon_reverse.svg"), source2);

Source<Pair<ArchiveMetadata, Source<ByteString, NotUsed>>, NotUsed> source =
    Source.from(Arrays.asList(pair1, pair2));

Sink<ByteString, CompletionStage<IOResult>> fileSink = FileIO.toPath(Paths.get("logo.zip"));
CompletionStage<IOResult> ioResult = source.via(Archive.zip()).runWith(fileSink, system);
```

### Example 26: Reading ZIP archives

```scala
val zipFile = // ???
val target: Path = // ???
Archive
  .zipReader(zipFile)
  .mapAsyncUnordered(4) {
    case (metadata, source) =>
      val targetFile = target.resolve(metadata.name)
      targetFile.toFile.getParentFile.mkdirs() //missing error handler
      source.runWith(FileIO.toPath(targetFile))
  }
```

### Example 27: Reading ZIP archives

```java
Archive.zipReader(Paths.get("logo.zip").toFile())
    .mapAsync(
        4,
        pair -> {
          ZipArchiveMetadata metadata = pair.first();
          Path targetFile = target.resolve(metadata.getName());
          targetFile.toFile().getParentFile().mkdirs(); // missing error handler
          Source<ByteString, NotUsed> fSource = pair.second();
          // create the target directory
          return fSource
              .runWith(FileIO.toPath(targetFile), system)
              .thenApply(io -> Done.done());
        });
```

### Example 28: Writing TAR archives

```scala
val fileStream1: Source[ByteString,  Any] = ...
  val fileStream2: Source[ByteString,  Any] = ...
  val fileSize1: Long = ...
  val fileSize2: Long = ...

val filesStream = Source(
  List(
    (TarArchiveMetadata.directory("subdir", lastModification), Source.empty),
    (TarArchiveMetadata("subdir", "akka_full_color.svg", fileSize1, lastModification), fileStream1),
    (TarArchiveMetadata("akka_icon_reverse.svg", fileSize2, lastModification), fileStream2)
  )
)

val result = filesStream
  .via(Archive.tar())
  .runWith(FileIO.toPath(Paths.get("result.tar")))
```

### Example 29: Writing TAR archives

```java
Source<ByteString, NotUsed> source1 = ...
Source<ByteString, NotUsed> source2 = ...
Long size1 = ...
Long size2 = ...

Pair<TarArchiveMetadata, Source<ByteString, NotUsed>> dir =
    Pair.create(TarArchiveMetadata.directory("subdir", lastModification), Source.empty());

Pair<TarArchiveMetadata, Source<ByteString, NotUsed>> pair1 =
    Pair.create(
        TarArchiveMetadata.create("subdir", "akka_full_color.svg", size1, lastModification),
        source1);
Pair<TarArchiveMetadata, Source<ByteString, NotUsed>> pair2 =
    Pair.create(
        TarArchiveMetadata.create("akka_icon_reverse.svg", size2, lastModification), source2);

Source<Pair<TarArchiveMetadata, Source<ByteString, NotUsed>>, NotUsed> source =
    Source.from(Arrays.asList(dir, pair1, pair2));

Sink<ByteString, CompletionStage<IOResult>> fileSink = FileIO.toPath(Paths.get("logo.tar"));
CompletionStage<IOResult> ioResult = source.via(Archive.tar()).runWith(fileSink, system);
```

### Example 30: Writing TAR archives

```scala
val resultGz = filesStream
  .via(Archive.tar().via(akka.stream.scaladsl.Compression.gzip))
  .runWith(FileIO.toPath(Paths.get("result.tar.gz")))
```

### Example 31: Writing TAR archives

```java
Sink<ByteString, CompletionStage<IOResult>> fileSinkGz =
    FileIO.toPath(Paths.get("logo.tar.gz"));
CompletionStage<IOResult> ioResultGz =
    source
        .via(Archive.tar().via(akka.stream.javadsl.Compression.gzip()))
        .runWith(fileSinkGz, system);
```

### Example 32: Reading TAR archives

```scala
val bytesSource: Source[ByteString, NotUsed] = // ???
val tar =
  bytesSource
    .via(Archive.tarReader())
    .mapAsync(1) {
      case (metadata, source) =>
        val targetFile = target.resolve(metadata.filePath)
        if (metadata.isDirectory) {
          Source
            .single(targetFile)
            .via(Directory.mkdirs())
            .runWith(Sink.ignore)
        } else {
          // create the target directory
          Source
            .single(targetFile.getParent)
            .via(Directory.mkdirs())
            .runWith(Sink.ignore)
            .map { _ =>
              // stream the file contents to a local file
              source.runWith(FileIO.toPath(targetFile))
            }
        }
    }
    .runWith(Sink.ignore)
```

### Example 33: Reading TAR archives

```java
Source<ByteString, NotUsed> bytesSource = // ???
CompletionStage<Done> tar =
    bytesSource
        .via(Archive.tarReader())
        .mapAsync(
            1,
            pair -> {
              TarArchiveMetadata metadata = pair.first();
              Path targetFile = target.resolve(metadata.filePath());
              if (metadata.isDirectory()) {
                return Source.single(targetFile)
                    .via(Directory.mkdirs())
                    .runWith(Sink.ignore(), system);
              } else {
                Source<ByteString, NotUsed> source = pair.second();
                // create the target directory
                return Source.single(targetFile.getParent())
                    .via(Directory.mkdirs())
                    .runWith(Sink.ignore(), system)
                    .thenCompose(
                        done ->
                            // stream the file contents to a local file
                            source
                                .runWith(FileIO.toPath(targetFile), system)
                                .thenApply(io -> Done.done()));
              }
            })
        .runWith(Sink.ignore(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/file/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/file/javadsl/Archive$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/file/javadsl/DirectoryChangesSource$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/file/javadsl/LogRotatorSink$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/file/scaladsl/Archive$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/file/scaladsl/DirectoryChangesSource$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/file/scaladsl/LogRotatorSink$.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/docs/alpakka/current/examples/ftp-samples.html
- https://doc.akka.io/docs/alpakka/current/external/eventuate.html
- https://doc.akka.io/docs/alpakka/current/external/fs2.html
- https://doc.akka.io/docs/alpakka/current/other-docs/snapshots.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Compression.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-io.html
- https://doc.akka.io/libraries/alpakka/current

---
*Source: [https://doc.akka.io/docs/alpakka/current/file.html](https://doc.akka.io/docs/alpakka/current/file.html)*