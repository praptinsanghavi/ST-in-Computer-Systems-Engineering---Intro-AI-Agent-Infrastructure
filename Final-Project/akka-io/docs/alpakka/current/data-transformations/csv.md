---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:04Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/data-transformations/csv.html
title: Comma-Separated Values - CSV • Alpakka Documentation
---

# Comma-Separated Values - CSV • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Comma\-Separated Values \- CSV

Comma\-Separated Values are used as interchange format for tabular data of text. This format is supported by most spreadsheet applications and may be used as database extraction format.

Despite the name the values are often separated by a semicolon `;`.

Even though the format is interpreted differently there exists a formal specification in [RFC4180](https://tools.ietf.org/html/rfc4180).

The format uses three different characters to structure the data:

- Field Delimiter \- separates the columns from each other (e.g. `,` or `;`)
- Quote \- marks columns that may contain other structuring characters (such as Field Delimiters or line break) (e.g. `"`)
- Escape Character \- used to escape Field Delimiters in columns (e.g. `\`)

Lines are separated by either Line Feed (`\n` \= ASCII 10\) or Carriage Return and Line Feed (`\r` \= ASCII 13 \+ `\n` \= ASCII 10\).

| Project Info: Alpakka CSV | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-stream\-alpakka\-csv 10\.0\.2 [Snapshots are available](../other-docs/snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.stream.alpakka.csv |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka/v10.0.2/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2019\-04\-04 |
| Home page | <https://doc.akka.io/libraries/alpakka/current> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/csv/index.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [GitHub releases](https://github.com/akka/alpakka/releases) |
| Issues | [Github issues](https://github.com/akka/alpakka/labels/p%3Acsv) |
| Sources | <https://github.com/akka/alpakka> |

## Artifacts

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-csv" % "10.0.2",
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
    <artifactId>akka-stream-alpakka-csv_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-stream-alpakka-csv_${versions.ScalaBinary}:10.0.2"
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

## CSV parsing

CSV parsing offers a flow that takes a stream of `akka.util.ByteString` and issues a stream of lists of `ByteString`.

The incoming data must contain line ends to allow line base framing. The CSV special characters can be specified (as bytes), suitable values are available as constants in `CsvParsing`.

Note
The current parser is limited to byte\-based character sets (UTF\-8, ISO\-8859\-1, ASCII) and can’t parse double\-byte encodings (e.g. UTF\-16\).

The parser accepts Byte Order Mark (BOM) for UTF\-8, but will fail for UTF\-16 and UTF\-32 Byte Order Marks.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/scala/docs/scaladsl/CsvParsingSpec.scala#L28-L31 "Go to snippet source")import akka.stream.alpakka.csv.scaladsl.CsvParsing

val flow: Flow[ByteString, List[ByteString], NotUsed]
  = CsvParsing.lineScanner(delimiter, quoteChar, escapeChar)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/java/docs/javadsl/CsvParsingTest.java#L21-L22 "Go to snippet source")import akka.stream.alpakka.csv.javadsl.CsvParsing;

Flow<ByteString, Collection<ByteString>, NotUsed> flow =
    CsvParsing.lineScanner(delimiter, quoteChar, escapeChar);
```

In this sample we read a single line of CSV formatted data into a list of column elements:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/scala/docs/scaladsl/CsvParsingSpec.scala#L40-L54 "Go to snippet source")import akka.stream.alpakka.csv.scaladsl.CsvParsing

Source.single(ByteString("eins,zwei,drei\n"))
  .via(CsvParsing.lineScanner())
  .runWith(Sink.head)

result should be(List(ByteString("eins"), ByteString("zwei"), ByteString("drei")))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/java/docs/javadsl/CsvParsingTest.java#L21-L22 "Go to snippet source")import akka.stream.alpakka.csv.javadsl.CsvParsing;

Source.single(ByteString.fromString("eins,zwei,drei\n"))
    .via(CsvParsing.lineScanner())
    .runWith(Sink.head(), system);
```

To convert the `ByteString` columns as `String`, a `map` operation can be added to the Flow:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/scala/docs/scaladsl/CsvParsingSpec.scala#L60-L75 "Go to snippet source")import akka.stream.alpakka.csv.scaladsl.CsvParsing

Source.single(ByteString("eins,zwei,drei\n"))
  .via(CsvParsing.lineScanner())
  .map(_.map(_.utf8String))
  .runWith(Sink.head)

result should be(List("eins", "zwei", "drei"))
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/java/docs/javadsl/CsvParsingTest.java#L21-L22 "Go to snippet source")import akka.stream.alpakka.csv.javadsl.CsvParsing;

Source.single(ByteString.fromString("eins,zwei,drei\n"))
    .via(CsvParsing.lineScanner())
    .map(line -> line.stream().map(ByteString::utf8String).collect(Collectors.toList()))
    .runWith(Sink.head(), system);
```

## CSV conversion into a map

The column\-based nature of CSV files can be used to read it into a map of column names and their `ByteString` values, or alternatively to `String` values. The column names can be either provided in code or the first line of data can be interpreted as the column names.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/scala/docs/scaladsl/CsvToMapSpec.scala#L20-L42 "Go to snippet source")import akka.stream.alpakka.csv.scaladsl.CsvToMap

// keep values as ByteString
val flow1: Flow[List[ByteString], Map[String, ByteString], NotUsed]
  = CsvToMap.toMap()

val flow2: Flow[List[ByteString], Map[String, ByteString], NotUsed]
  = CsvToMap.toMap(StandardCharsets.UTF_8)

val flow3: Flow[List[ByteString], Map[String, ByteString], NotUsed]
  = CsvToMap.withHeaders("column1", "column2", "column3")

// values as String (decode ByteString)
val flow4: Flow[List[ByteString], Map[String, String], NotUsed]
= CsvToMap.toMapAsStrings(StandardCharsets.UTF_8)

val flow5: Flow[List[ByteString], Map[String, String], NotUsed]
= CsvToMap.withHeadersAsStrings(StandardCharsets.UTF_8, "column1", "column2", "column3")

// values as String (decode ByteString)
val flow6: Flow[List[ByteString], Map[String, String], NotUsed]
= CsvToMap.toMapAsStringsCombineAll(StandardCharsets.UTF_8, Option.empty)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/java/docs/javadsl/CsvToMapTest.java#L10-L12 "Go to snippet source")import akka.stream.alpakka.csv.javadsl.CsvParsing;
import akka.stream.alpakka.csv.javadsl.CsvToMap;

// keep values as ByteString
Flow<Collection<ByteString>, Map<String, ByteString>, ?> flow1 = CsvToMap.toMap();

Flow<Collection<ByteString>, Map<String, ByteString>, ?> flow2 =
    CsvToMap.toMap(StandardCharsets.UTF_8);

Flow<Collection<ByteString>, Map<String, ByteString>, ?> flow3 =
    CsvToMap.withHeaders("column1", "column2", "column3");

// values as String (decode ByteString)
Flow<Collection<ByteString>, Map<String, String>, ?> flow4 =
    CsvToMap.toMapAsStrings(StandardCharsets.UTF_8);

Flow<Collection<ByteString>, Map<String, String>, ?> flow5 =
    CsvToMap.withHeadersAsStrings(StandardCharsets.UTF_8, "column1", "column2", "column3");

// values as String (decode ByteString)
Flow<Collection<ByteString>, Map<String, String>, ?> flow6 =
    CsvToMap.toMapAsStringsCombineAll(
        StandardCharsets.UTF_8, Optional.empty(), Optional.empty());
```

This example uses the first line (the header line) in the CSV data as column names:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/scala/docs/scaladsl/CsvToMapSpec.scala#L57-L461 "Go to snippet source")  import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

  // values as ByteString
  Source
    .single(ByteString("""eins,zwei,drei
                         |11,12,13
                         |21,22,23
                         |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMap())
    .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> ByteString("11"), "zwei" -> ByteString("12"), "drei" -> ByteString("13")),
      Map("eins" -> ByteString("21"), "zwei" -> ByteString("22"), "drei" -> ByteString("23"))
    )
  )

  // values as String
  Source
    .single(ByteString("""eins,zwei,drei
                         |11,12,13
                         |21,22,23
                         |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMapAsStrings())
    .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> "11", "zwei" -> "12", "drei" -> "13"),
      Map("eins" -> "21", "zwei" -> "22", "drei" -> "23")
    )
  )
  import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

  // values as ByteString
  Source
    .single(ByteString("""eins,zwei,drei,vier,fünt
                          |11,12,13
                          |21,22,23
                          |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMapAsStringsCombineAll(headerPlaceholder = Option.empty))
    .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> "11", "zwei" -> "12", "drei" -> "13", "vier" -> "", "fünt" -> ""),
      Map("eins" -> "21", "zwei" -> "22", "drei" -> "23", "vier" -> "", "fünt" -> "")
    )
  )
  import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

  // values as ByteString
  Source
    .single(ByteString("""eins,zwei,drei
                          |11,12,13,14
                          |21,22,23
                          |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMapAsStringsCombineAll(headerPlaceholder = Option.empty))
    .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> "11", "zwei" -> "12", "drei" -> "13", "MissingHeader0" -> "14"),
      Map("eins" -> "21", "zwei" -> "22", "drei" -> "23")
    )
  )
  import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

  // values as ByteString
  Source
    .single(ByteString("""eins,zwei
                          |11,12,13
                          |21,22,
                          |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMapAsStringsCombineAll(headerPlaceholder = Option("MyCustomHeader")))
    .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> "11", "zwei" -> "12", "MyCustomHeader0" -> "13"),
      Map("eins" -> "21", "zwei" -> "22", "MyCustomHeader0" -> "")
    )
  )
  import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

    // values as ByteString
    Source
      .single(ByteString("""eins,zwei,drei,fünt
                            |11,12,13
                            |21,22,23
                            |""".stripMargin))
      .via(CsvParsing.lineScanner())
      .via(CsvToMap.toMapAsStringsCombineAll(customFieldValuePlaceholder = Option("missing")))
      .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> "11", "zwei" -> "12", "drei" -> "13", "fünt" -> "missing"),
      Map("eins" -> "21", "zwei" -> "22", "drei" -> "23", "fünt" -> "missing")
    )
  )
import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

// values as ByteString
Source
  .single(ByteString("""eins,zwei,drei,vier,fünt
                        |11,12,13
                        |21,22,23
                        |""".stripMargin))
  .via(CsvParsing.lineScanner())
  .via(CsvToMap.toMapCombineAll(headerPlaceholder = Option.empty))
  .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> ByteString("11"),
        "zwei" -> ByteString("12"),
        "drei" -> ByteString("13"),
        "vier" -> ByteString(""),
        "fünt" -> ByteString("")),
    Map("eins" -> ByteString("21"),
        "zwei" -> ByteString("22"),
        "drei" -> ByteString("23"),
        "vier" -> ByteString(""),
        "fünt" -> ByteString(""))
  )
)
import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

// values as ByteString
  Source
  .single(ByteString("""eins,zwei,drei
                        |11,12,13,14,15
                        |21,22,23
                        |""".stripMargin))
  .via(CsvParsing.lineScanner())
  .via(CsvToMap.toMapCombineAll(headerPlaceholder = Option.empty))
  .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> ByteString("11"),
        "zwei" -> ByteString("12"),
        "drei" -> ByteString("13"),
        "MissingHeader0" -> ByteString("14"),
        "MissingHeader1" -> ByteString("15")),
    Map("eins" -> ByteString("21"), "zwei" -> ByteString("22"), "drei" -> ByteString("23"))
  )
)
import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

// values as ByteString
  Source
  .single(ByteString("""eins,zwei
                        |11,12,13
                        |21,22,
                        |""".stripMargin))
  .via(CsvParsing.lineScanner())
  .via(CsvToMap.toMapCombineAll(headerPlaceholder = Option("MyCustomHeader")))
  .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> ByteString("11"), "zwei" -> ByteString("12"), "MyCustomHeader0" -> ByteString("13")),
    Map("eins" -> ByteString("21"), "zwei" -> ByteString("22"), "MyCustomHeader0" -> ByteString(""))
  )
)
import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

  // values as ByteString
  Source
    .single(ByteString("""eins,zwei,drei,fünt
                          |11,12,13
                          |21,22,
                          |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMapCombineAll(headerPlaceholder = Option("MyCustomHeader"), customFieldValuePlaceholder = Option(ByteString("missing"))))
    .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> ByteString("11"),
        "zwei" -> ByteString("12"),
        "drei" -> ByteString("13"),
        "fünt" -> ByteString("missing")),
    Map("eins" -> ByteString("21"),
        "zwei" -> ByteString("22"),
        "drei" -> ByteString(""),
        "fünt" -> ByteString("missing"))
  )
)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/java/docs/javadsl/CsvToMapTest.java#L10-L12 "Go to snippet source")import akka.stream.alpakka.csv.javadsl.CsvParsing;
import akka.stream.alpakka.csv.javadsl.CsvToMap;

    // values as ByteString
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(CsvToMap.toMap(StandardCharsets.UTF_8))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("3")));

    // values as String
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(CsvToMap.toMapAsStrings(StandardCharsets.UTF_8))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("3"));
    // values as ByteString
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3,4,5"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.empty()))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("3")));
assertThat(map.get("MissingHeader0"), equalTo(ByteString.fromString("4")));
assertThat(map.get("MissingHeader1"), equalTo(ByteString.fromString("5")));
    // values as ByteString
    Source.single(ByteString.fromString("eins,zwei,drei,vier,fünt\n1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.empty()))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("3")));
assertThat(map.get("vier"), equalTo(ByteString.fromString("")));
assertThat(map.get("fünt"), equalTo(ByteString.fromString("")));
    // values as ByteString
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3,4,5"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.of("MyCustomHeader")))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("3")));
assertThat(map.get("MyCustomHeader0"), equalTo(ByteString.fromString("4")));
assertThat(map.get("MyCustomHeader1"), equalTo(ByteString.fromString("5")));
    // values as ByteString
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapCombineAll(
                StandardCharsets.UTF_8,
                Optional.of(ByteString.fromString("missing")),
                Optional.of("MyCustomHeader")))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("missing")));
```

This sample will generate the same output as above, but the column names are specified in the code:

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/scala/docs/scaladsl/CsvToMapSpec.scala#L142-L194 "Go to snippet source")import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

// values as ByteString
Source
  .single(ByteString(
    """11,12,13
      |21,22,23
      |""".stripMargin))
  .via(CsvParsing.lineScanner())
  .via(CsvToMap.withHeaders("eins", "zwei", "drei"))
  .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> ByteString("11"), "zwei" -> ByteString("12"), "drei" -> ByteString("13")),
    Map("eins" -> ByteString("21"), "zwei" -> ByteString("22"), "drei" -> ByteString("23"))
  )
)

// values as String
Source
  .single(ByteString("""11,12,13
                       |21,22,23
                       |""".stripMargin))
  .via(CsvParsing.lineScanner())
  .via(CsvToMap.withHeadersAsStrings(StandardCharsets.UTF_8, "eins", "zwei", "drei"))
  .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> "11", "zwei" -> "12", "drei" -> "13"),
    Map("eins" -> "21", "zwei" -> "22", "drei" -> "23")
  )
)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/java/docs/javadsl/CsvToMapTest.java#L10-L12 "Go to snippet source")import akka.stream.alpakka.csv.javadsl.CsvParsing;
import akka.stream.alpakka.csv.javadsl.CsvToMap;

    // values as ByteString
    Source.single(ByteString.fromString("1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(CsvToMap.withHeaders("eins", "zwei", "drei"))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("3")));

    // values as String
    Source.single(ByteString.fromString("1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(CsvToMap.withHeadersAsStrings(StandardCharsets.UTF_8, "eins", "zwei", "drei"))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("3"));

    // values as String
    Source.single(ByteString.fromString("eins,zwei,drei,vier,fünt\n1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapAsStringsCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.empty()))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("3"));
assertThat(map.get("vier"), equalTo(""));
assertThat(map.get("fünt"), equalTo(""));

    // values as String
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3,4,5"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapAsStringsCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.empty()))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("3"));
assertThat(map.get("MissingHeader0"), equalTo("4"));
assertThat(map.get("MissingHeader1"), equalTo("5"));

    // values as String
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3,4,5"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapAsStringsCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.of("MyCustomHeader")))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("3"));
assertThat(map.get("MyCustomHeader0"), equalTo("4"));
assertThat(map.get("MyCustomHeader1"), equalTo("5"));

    // values as String
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapAsStringsCombineAll(
                StandardCharsets.UTF_8, Optional.of("missing"), Optional.of("MyCustomHeader")))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("missing"));
```

## CSV formatting

To emit CSV files `immutable.Seq[String]` can be formatted into `ByteString` e.g to be written to file. The formatter takes care of quoting and escaping.

Certain CSV readers (e.g. Microsoft Excel) require CSV files to indicate their character encoding with a *Byte Order Mark* (BOM) in the first bytes of the file. Choose an appropriate Byte Order Mark matching the selected character set from the constants in `ByteOrderMark` ([Unicode FAQ on Byte Order Mark](https://www.unicode.org/faq/utf_bom.html#bom1)).

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/scala/docs/scaladsl/CsvFormattingSpec.scala#L19-L36 "Go to snippet source")import akka.stream.alpakka.csv.scaladsl.{CsvFormatting, CsvQuotingStyle}

val flow: Flow[immutable.Seq[String], ByteString, _]
  = CsvFormatting.format(delimiter,
                         quoteChar,
                         escapeChar,
                         endOfLine,
                         CsvQuotingStyle.Required,
                         charset = StandardCharsets.UTF_8,
                         byteOrderMark = None)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/java/docs/javadsl/CsvFormattingTest.java#L10-L12 "Go to snippet source")import akka.stream.alpakka.csv.javadsl.CsvFormatting;
import akka.stream.alpakka.csv.javadsl.CsvQuotingStyle;

Flow<Collection<String>, ByteString, ?> flow1 = CsvFormatting.format();

Flow<Collection<String>, ByteString, ?> flow2 =
    CsvFormatting.format(
        delimiter,
        quoteChar,
        escapeChar,
        endOfLine,
        CsvQuotingStyle.REQUIRED,
        charset,
        byteOrderMark);
```

This example uses the default configuration:

- Delimiter: comma (,)
- Quote char: double quote (")
- Escape char: backslash (\\)
- Line ending: Carriage Return and Line Feed (`\r` \= ASCII 13 \+ `\n` \= ASCII 10\)
- Quoting style: quote only if required
- Charset: UTF\-8
- No Byte Order Mark

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/scala/docs/scaladsl/CsvFormattingSpec.scala#L45-L54 "Go to snippet source")import akka.stream.alpakka.csv.scaladsl.CsvFormatting

Source
  .single(List("eins", "zwei", "drei"))
  .via(CsvFormatting.format())
  .runWith(Sink.head)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/csv/src/test/java/docs/javadsl/CsvFormattingTest.java#L10-L12 "Go to snippet source")import akka.stream.alpakka.csv.javadsl.CsvFormatting;
import akka.stream.alpakka.csv.javadsl.CsvQuotingStyle;

Source.single(Arrays.asList("one", "two", "three"))
    .via(CsvFormatting.format())
    .runWith(Sink.head(), system);
```

## Code Examples

### Example 1: Artifacts

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-csv" % "10.0.2",
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
    <artifactId>akka-stream-alpakka-csv_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-stream-alpakka-csv_${versions.ScalaBinary}:10.0.2"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 4: CSV parsing

```scala
import akka.stream.alpakka.csv.scaladsl.CsvParsing

val flow: Flow[ByteString, List[ByteString], NotUsed]
  = CsvParsing.lineScanner(delimiter, quoteChar, escapeChar)
```

### Example 5: CSV parsing

```java
import akka.stream.alpakka.csv.javadsl.CsvParsing;

Flow<ByteString, Collection<ByteString>, NotUsed> flow =
    CsvParsing.lineScanner(delimiter, quoteChar, escapeChar);
```

### Example 6: CSV parsing

```scala
import akka.stream.alpakka.csv.scaladsl.CsvParsing

Source.single(ByteString("eins,zwei,drei\n"))
  .via(CsvParsing.lineScanner())
  .runWith(Sink.head)

result should be(List(ByteString("eins"), ByteString("zwei"), ByteString("drei")))
```

### Example 7: CSV parsing

```java
import akka.stream.alpakka.csv.javadsl.CsvParsing;

Source.single(ByteString.fromString("eins,zwei,drei\n"))
    .via(CsvParsing.lineScanner())
    .runWith(Sink.head(), system);
```

### Example 8: CSV parsing

```scala
import akka.stream.alpakka.csv.scaladsl.CsvParsing

Source.single(ByteString("eins,zwei,drei\n"))
  .via(CsvParsing.lineScanner())
  .map(_.map(_.utf8String))
  .runWith(Sink.head)

result should be(List("eins", "zwei", "drei"))
```

### Example 9: CSV parsing

```java
import akka.stream.alpakka.csv.javadsl.CsvParsing;

Source.single(ByteString.fromString("eins,zwei,drei\n"))
    .via(CsvParsing.lineScanner())
    .map(line -> line.stream().map(ByteString::utf8String).collect(Collectors.toList()))
    .runWith(Sink.head(), system);
```

### Example 10: CSV conversion into a map

```scala
import akka.stream.alpakka.csv.scaladsl.CsvToMap

// keep values as ByteString
val flow1: Flow[List[ByteString], Map[String, ByteString], NotUsed]
  = CsvToMap.toMap()

val flow2: Flow[List[ByteString], Map[String, ByteString], NotUsed]
  = CsvToMap.toMap(StandardCharsets.UTF_8)

val flow3: Flow[List[ByteString], Map[String, ByteString], NotUsed]
  = CsvToMap.withHeaders("column1", "column2", "column3")

// values as String (decode ByteString)
val flow4: Flow[List[ByteString], Map[String, String], NotUsed]
= CsvToMap.toMapAsStrings(StandardCharsets.UTF_8)

val flow5: Flow[List[ByteString], Map[String, String], NotUsed]
= CsvToMap.withHeadersAsStrings(StandardCharsets.UTF_8, "column1", "column2", "column3")


// values as String (decode ByteString)
val flow6: Flow[List[ByteString], Map[String, String], NotUsed]
= CsvToMap.toMapAsStringsCombineAll(StandardCharsets.UTF_8, Option.empty)
```

### Example 11: CSV conversion into a map

```java
import akka.stream.alpakka.csv.javadsl.CsvParsing;
import akka.stream.alpakka.csv.javadsl.CsvToMap;

// keep values as ByteString
Flow<Collection<ByteString>, Map<String, ByteString>, ?> flow1 = CsvToMap.toMap();

Flow<Collection<ByteString>, Map<String, ByteString>, ?> flow2 =
    CsvToMap.toMap(StandardCharsets.UTF_8);

Flow<Collection<ByteString>, Map<String, ByteString>, ?> flow3 =
    CsvToMap.withHeaders("column1", "column2", "column3");

// values as String (decode ByteString)
Flow<Collection<ByteString>, Map<String, String>, ?> flow4 =
    CsvToMap.toMapAsStrings(StandardCharsets.UTF_8);

Flow<Collection<ByteString>, Map<String, String>, ?> flow5 =
    CsvToMap.withHeadersAsStrings(StandardCharsets.UTF_8, "column1", "column2", "column3");

// values as String (decode ByteString)
Flow<Collection<ByteString>, Map<String, String>, ?> flow6 =
    CsvToMap.toMapAsStringsCombineAll(
        StandardCharsets.UTF_8, Optional.empty(), Optional.empty());
```

### Example 12: CSV conversion into a map

```scala
import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

  // values as ByteString
  Source
    .single(ByteString("""eins,zwei,drei
                         |11,12,13
                         |21,22,23
                         |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMap())
    .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> ByteString("11"), "zwei" -> ByteString("12"), "drei" -> ByteString("13")),
      Map("eins" -> ByteString("21"), "zwei" -> ByteString("22"), "drei" -> ByteString("23"))
    )
  )

  // values as String
  Source
    .single(ByteString("""eins,zwei,drei
                         |11,12,13
                         |21,22,23
                         |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMapAsStrings())
    .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> "11", "zwei" -> "12", "drei" -> "13"),
      Map("eins" -> "21", "zwei" -> "22", "drei" -> "23")
    )
  )
  import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

  // values as ByteString
  Source
    .single(ByteString("""eins,zwei,drei,vier,fünt
                          |11,12,13
                          |21,22,23
                          |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMapAsStringsCombineAll(headerPlaceholder = Option.empty))
    .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> "11", "zwei" -> "12", "drei" -> "13", "vier" -> "", "fünt" -> ""),
      Map("eins" -> "21", "zwei" -> "22", "drei" -> "23", "vier" -> "", "fünt" -> "")
    )
  )
  import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

  // values as ByteString
  Source
    .single(ByteString("""eins,zwei,drei
                          |11,12,13,14
                          |21,22,23
                          |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMapAsStringsCombineAll(headerPlaceholder = Option.empty))
    .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> "11", "zwei" -> "12", "drei" -> "13", "MissingHeader0" -> "14"),
      Map("eins" -> "21", "zwei" -> "22", "drei" -> "23")
    )
  )
  import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

  // values as ByteString
  Source
    .single(ByteString("""eins,zwei
                          |11,12,13
                          |21,22,
                          |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMapAsStringsCombineAll(headerPlaceholder = Option("MyCustomHeader")))
    .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> "11", "zwei" -> "12", "MyCustomHeader0" -> "13"),
      Map("eins" -> "21", "zwei" -> "22", "MyCustomHeader0" -> "")
    )
  )
  import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

    // values as ByteString
    Source
      .single(ByteString("""eins,zwei,drei,fünt
                            |11,12,13
                            |21,22,23
                            |""".stripMargin))
      .via(CsvParsing.lineScanner())
      .via(CsvToMap.toMapAsStringsCombineAll(customFieldValuePlaceholder = Option("missing")))
      .runWith(Sink.seq)

  result should be(
    Seq(
      Map("eins" -> "11", "zwei" -> "12", "drei" -> "13", "fünt" -> "missing"),
      Map("eins" -> "21", "zwei" -> "22", "drei" -> "23", "fünt" -> "missing")
    )
  )
import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

// values as ByteString
Source
  .single(ByteString("""eins,zwei,drei,vier,fünt
                        |11,12,13
                        |21,22,23
                        |""".stripMargin))
  .via(CsvParsing.lineScanner())
  .via(CsvToMap.toMapCombineAll(headerPlaceholder = Option.empty))
  .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> ByteString("11"),
        "zwei" -> ByteString("12"),
        "drei" -> ByteString("13"),
        "vier" -> ByteString(""),
        "fünt" -> ByteString("")),
    Map("eins" -> ByteString("21"),
        "zwei" -> ByteString("22"),
        "drei" -> ByteString("23"),
        "vier" -> ByteString(""),
        "fünt" -> ByteString(""))
  )
)
import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

// values as ByteString
  Source
  .single(ByteString("""eins,zwei,drei
                        |11,12,13,14,15
                        |21,22,23
                        |""".stripMargin))
  .via(CsvParsing.lineScanner())
  .via(CsvToMap.toMapCombineAll(headerPlaceholder = Option.empty))
  .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> ByteString("11"),
        "zwei" -> ByteString("12"),
        "drei" -> ByteString("13"),
        "MissingHeader0" -> ByteString("14"),
        "MissingHeader1" -> ByteString("15")),
    Map("eins" -> ByteString("21"), "zwei" -> ByteString("22"), "drei" -> ByteString("23"))
  )
)
import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

// values as ByteString
  Source
  .single(ByteString("""eins,zwei
                        |11,12,13
                        |21,22,
                        |""".stripMargin))
  .via(CsvParsing.lineScanner())
  .via(CsvToMap.toMapCombineAll(headerPlaceholder = Option("MyCustomHeader")))
  .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> ByteString("11"), "zwei" -> ByteString("12"), "MyCustomHeader0" -> ByteString("13")),
    Map("eins" -> ByteString("21"), "zwei" -> ByteString("22"), "MyCustomHeader0" -> ByteString(""))
  )
)
import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

  // values as ByteString
  Source
    .single(ByteString("""eins,zwei,drei,fünt
                          |11,12,13
                          |21,22,
                          |""".stripMargin))
    .via(CsvParsing.lineScanner())
    .via(CsvToMap.toMapCombineAll(headerPlaceholder = Option("MyCustomHeader"), customFieldValuePlaceholder = Option(ByteString("missing"))))
    .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> ByteString("11"),
        "zwei" -> ByteString("12"),
        "drei" -> ByteString("13"),
        "fünt" -> ByteString("missing")),
    Map("eins" -> ByteString("21"),
        "zwei" -> ByteString("22"),
        "drei" -> ByteString(""),
        "fünt" -> ByteString("missing"))
  )
)
```

### Example 13: CSV conversion into a map

```java
import akka.stream.alpakka.csv.javadsl.CsvParsing;
import akka.stream.alpakka.csv.javadsl.CsvToMap;

    // values as ByteString
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(CsvToMap.toMap(StandardCharsets.UTF_8))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("3")));

    // values as String
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(CsvToMap.toMapAsStrings(StandardCharsets.UTF_8))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("3"));
    // values as ByteString
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3,4,5"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.empty()))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("3")));
assertThat(map.get("MissingHeader0"), equalTo(ByteString.fromString("4")));
assertThat(map.get("MissingHeader1"), equalTo(ByteString.fromString("5")));
    // values as ByteString
    Source.single(ByteString.fromString("eins,zwei,drei,vier,fünt\n1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.empty()))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("3")));
assertThat(map.get("vier"), equalTo(ByteString.fromString("")));
assertThat(map.get("fünt"), equalTo(ByteString.fromString("")));
    // values as ByteString
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3,4,5"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.of("MyCustomHeader")))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("3")));
assertThat(map.get("MyCustomHeader0"), equalTo(ByteString.fromString("4")));
assertThat(map.get("MyCustomHeader1"), equalTo(ByteString.fromString("5")));
    // values as ByteString
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapCombineAll(
                StandardCharsets.UTF_8,
                Optional.of(ByteString.fromString("missing")),
                Optional.of("MyCustomHeader")))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("missing")));
```

### Example 14: CSV conversion into a map

```scala
import akka.stream.alpakka.csv.scaladsl.{CsvParsing, CsvToMap}

// values as ByteString
Source
  .single(ByteString(
    """11,12,13
      |21,22,23
      |""".stripMargin))
  .via(CsvParsing.lineScanner())
  .via(CsvToMap.withHeaders("eins", "zwei", "drei"))
  .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> ByteString("11"), "zwei" -> ByteString("12"), "drei" -> ByteString("13")),
    Map("eins" -> ByteString("21"), "zwei" -> ByteString("22"), "drei" -> ByteString("23"))
  )
)

// values as String
Source
  .single(ByteString("""11,12,13
                       |21,22,23
                       |""".stripMargin))
  .via(CsvParsing.lineScanner())
  .via(CsvToMap.withHeadersAsStrings(StandardCharsets.UTF_8, "eins", "zwei", "drei"))
  .runWith(Sink.seq)

result should be(
  Seq(
    Map("eins" -> "11", "zwei" -> "12", "drei" -> "13"),
    Map("eins" -> "21", "zwei" -> "22", "drei" -> "23")
  )
)
```

### Example 15: CSV conversion into a map

```java
import akka.stream.alpakka.csv.javadsl.CsvParsing;
import akka.stream.alpakka.csv.javadsl.CsvToMap;

    // values as ByteString
    Source.single(ByteString.fromString("1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(CsvToMap.withHeaders("eins", "zwei", "drei"))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo(ByteString.fromString("1")));
assertThat(map.get("zwei"), equalTo(ByteString.fromString("2")));
assertThat(map.get("drei"), equalTo(ByteString.fromString("3")));

    // values as String
    Source.single(ByteString.fromString("1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(CsvToMap.withHeadersAsStrings(StandardCharsets.UTF_8, "eins", "zwei", "drei"))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("3"));

    // values as String
    Source.single(ByteString.fromString("eins,zwei,drei,vier,fünt\n1,2,3"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapAsStringsCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.empty()))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("3"));
assertThat(map.get("vier"), equalTo(""));
assertThat(map.get("fünt"), equalTo(""));

    // values as String
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3,4,5"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapAsStringsCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.empty()))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("3"));
assertThat(map.get("MissingHeader0"), equalTo("4"));
assertThat(map.get("MissingHeader1"), equalTo("5"));

    // values as String
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2,3,4,5"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapAsStringsCombineAll(
                StandardCharsets.UTF_8, Optional.empty(), Optional.of("MyCustomHeader")))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("3"));
assertThat(map.get("MyCustomHeader0"), equalTo("4"));
assertThat(map.get("MyCustomHeader1"), equalTo("5"));

    // values as String
    Source.single(ByteString.fromString("eins,zwei,drei\n1,2"))
        .via(CsvParsing.lineScanner())
        .via(
            CsvToMap.toMapAsStringsCombineAll(
                StandardCharsets.UTF_8, Optional.of("missing"), Optional.of("MyCustomHeader")))
        .runWith(Sink.head(), system);

assertThat(map.get("eins"), equalTo("1"));
assertThat(map.get("zwei"), equalTo("2"));
assertThat(map.get("drei"), equalTo("missing"));
```

### Example 16: CSV formatting

```scala
import akka.stream.alpakka.csv.scaladsl.{CsvFormatting, CsvQuotingStyle}

val flow: Flow[immutable.Seq[String], ByteString, _]
  = CsvFormatting.format(delimiter,
                         quoteChar,
                         escapeChar,
                         endOfLine,
                         CsvQuotingStyle.Required,
                         charset = StandardCharsets.UTF_8,
                         byteOrderMark = None)
```

### Example 17: CSV formatting

```java
import akka.stream.alpakka.csv.javadsl.CsvFormatting;
import akka.stream.alpakka.csv.javadsl.CsvQuotingStyle;

Flow<Collection<String>, ByteString, ?> flow1 = CsvFormatting.format();

Flow<Collection<String>, ByteString, ?> flow2 =
    CsvFormatting.format(
        delimiter,
        quoteChar,
        escapeChar,
        endOfLine,
        CsvQuotingStyle.REQUIRED,
        charset,
        byteOrderMark);
```

### Example 18: CSV formatting

```scala
import akka.stream.alpakka.csv.scaladsl.CsvFormatting

Source
  .single(List("eins", "zwei", "drei"))
  .via(CsvFormatting.format())
  .runWith(Sink.head)
```

### Example 19: CSV formatting

```java
import akka.stream.alpakka.csv.javadsl.CsvFormatting;
import akka.stream.alpakka.csv.javadsl.CsvQuotingStyle;

Source.single(Arrays.asList("one", "two", "three"))
    .via(CsvFormatting.format())
    .runWith(Sink.head(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/csv/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/compression.html
- https://doc.akka.io/docs/alpakka/current/data-transformations/simple-codecs.html
- https://doc.akka.io/docs/alpakka/current/other-docs/snapshots.html
- https://doc.akka.io/libraries/alpakka/current

---
*Source: [https://doc.akka.io/docs/alpakka/current/data-transformations/csv.html](https://doc.akka.io/docs/alpakka/current/data-transformations/csv.html)*