---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:40:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/testing.html
title: Testing • Akka Projection
---

# Testing • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Testing

Akka Projections provides a TestKit to ease testing. There are two supported styles of test: running with an assert function and driving it with an Akka Streams TestKit `TestSink` probe.

## Dependencies

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
Maven
```
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>

```
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

To use the Akka Projections TestKit add the following dependency in your project:

sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-projection-testkit" % "1.6.20" % Test
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-testkit_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  testImplementation "com.lightbend.akka:akka-projection-testkit_${versions.ScalaBinary}:1.6.20"
}
```

Akka Projections require Akka 2\.10\.13 or later, see [Akka version](overview.html#akka-version).

| Project Info: Akka Projections TestKit | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-projection\-testkit 1\.6\.20 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.projection.testkit |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-projection/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2020\-09\-10 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-projection/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-projection/issues) |
| Sources | [https://github.com/akka/akka\-projection](https://github.com/akka/akka-projection) |

### Transitive dependencies

The table below shows `akka-projection-testkit`’s direct dependencies and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.lightbend.akka | akka\-projection\-core\_2\.13 | [1\.6\.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.6.20) |
| com.typesafe.akka | akka\-actor\-testkit\-typed\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-testkit-typed_2.13/2.10.13) |
| com.typesafe.akka | akka\-stream\-testkit\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-testkit_2.13/2.10.13) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.lightbend.akka    akka-projection-core_2.13    [1.6.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.6.20)
    com.typesafe.akka    akka-actor-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-typed_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-slf4j_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
    com.typesafe.akka    akka-persistence-query_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-persistence_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-actor-testkit-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-testkit-typed_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-actor-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-typed_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-slf4j_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
    com.typesafe.akka    akka-slf4j_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
    com.typesafe.akka    akka-testkit_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-stream-testkit_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-testkit_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-testkit_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## Initializing the Projection TestKit

The Projection TestKit requires an instance of `ActorTestKit`. We recommend using Akka’s `ScalaTestWithActorTestKit``TestKitJunitResource`

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/testkit/TestKitDocExample.scala#L16-L18 "Go to snippet source")import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.projection.testkit.scaladsl.ProjectionTestKit

class TestKitDocExample extends ScalaTestWithActorTestKit {
  private val projectionTestKit = ProjectionTestKit(system)

}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/testkit/TestKitDocExample.java#L18-L22 "Go to snippet source")import akka.projection.testkit.javadsl.TestSourceProvider;
import org.junit.ClassRule;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.projection.testkit.javadsl.ProjectionTestKit;

@ClassRule static final TestKitJunitResource testKit = new TestKitJunitResource();
ProjectionTestKit projectionTestKit = ProjectionTestKit.create(testKit.system());
```

## Testing with an assert function

When testing with an assert function the Projection is started and stopped by the TestKit. While the projection is running, the assert function will be called until it completes without errors (no exceptions or assertion errors are thrown).

In the example below the Projection will update a `CartView`. The test will run until it observes that the `CartView` for id `abc-def` is available in the repository. 

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/testkit/TestKitDocExample.scala#L16-L18 "Go to snippet source")import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.projection.testkit.scaladsl.ProjectionTestKit

projectionTestKit.run(projection) {
  // confirm that cart checkout was inserted in db
  cartViewRepository.findById("abc-def").futureValue
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/testkit/TestKitDocExample.java#L74-L80 "Go to snippet source")projectionTestKit.run(
    projection,
    () ->
        cartCheckoutRepository
            .findById("abc-def")
            .toCompletableFuture()
            .get(1, TimeUnit.SECONDS));
```

By default, the test will run for 3 seconds. The assert function will be called every 100 milliseconds. Those values can be modified programatically.

Note: when testing a Projection with this method, the Restart Backoff is disabled. Any backoff configuration settings from `.conf` file or programmatically added will be overwritten.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/testkit/TestKitDocExample.scala#L22-L23 "Go to snippet source")import scala.concurrent.duration._

projectionTestKit.run(projection, max = 5.seconds, interval = 300.millis) {
  // confirm that cart checkout was inserted in db
  cartViewRepository.findById("abc-def").futureValue
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/testkit/TestKitDocExample.java#L26-L31 "Go to snippet source")import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

projectionTestKit.run(
    projection,
    Duration.ofSeconds(5),
    Duration.ofMillis(300),
    () ->
        cartCheckoutRepository
            .findById("abc-def")
            .toCompletableFuture()
            .get(1, TimeUnit.SECONDS));
```

## Testing with a TestSink probe

The [Akka Stream TestKit](https://doc.akka.io/libraries/akka-core/current/stream/stream-testkit.html#using-the-testkit) can be used to drive the pace of envelopes flowing through the Projection.

The Projection starts as soon as the first element is requested by the `TestSink` probe, new elements will be emitted as requested. The Projection is stopped once the assert function completes.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/testkit/TestKitDocExample.scala#L70-L77 "Go to snippet source")projectionTestKit.runWithTestSink(projection) { sinkProbe =>
  sinkProbe.request(1)
  sinkProbe.expectNext(Done)
}

// confirm that cart checkout was inserted in db
cartViewRepository.findById("abc-def").futureValue

```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/testkit/TestKitDocExample.java#L35-L36 "Go to snippet source")import static org.junit.Assert.assertEquals;

projectionTestKit.runWithTestSink(
    projection,
    sinkProbe -> {
      sinkProbe.request(1);
      sinkProbe.expectNext(Done.getInstance());
      cartCheckoutRepository.findById("abc-def").toCompletableFuture().get(1, TimeUnit.SECONDS);
    });

```

## Testing with mocked Projection and SourceProvider

To test a handler in isolation you may want to mock out the implementation of a Projection or SourceProvider so that you don’t have to setup and teardown the associated technology as part of your *integration* test. For example, you may want to project against a Cassandra database, or read envelopes from an Akka Persistence journal source, but you don’t want to have to run Docker containers or embedded/in\-memory services just to run your tests. The [`TestProjection`](/api/akka-projection/1.6.20/akka/projection/testkit/javadsl/TestProjection.html "akka.projection.testkit.javadsl.TestProjection")[`TestProjection`](/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestProjection.html "akka.projection.testkit.scaladsl.TestProjection") allows you to isolate the runtime of your handler so that you don’t need to run these services. Using a `TestProjection` has the added benefit of being fast, since you can run everything within the JVM that runs your tests.

Alongside the `TestProjection` is the [`TestSourceProvider`](/api/akka-projection/1.6.20/akka/projection/testkit/javadsl/TestSourceProvider.html "akka.projection.testkit.javadsl.TestSourceProvider")[`TestSourceProvider`](/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestSourceProvider.html "akka.projection.testkit.scaladsl.TestSourceProvider") which can be used to provide test data to the `TestProjection` running the handler. Test data can be represented in an akka streams [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that is passed to the `TestSourceProvider` constructor.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/testkit/TestKitDocExample.scala#L27-L94 "Go to snippet source")import akka.stream.scaladsl.Source

val testData = Source((0, "abc") :: (1, "def") :: Nil)

val extractOffset = (envelope: (Int, String)) => envelope._1

val sourceProvider = TestSourceProvider(testData, extractOffset)

val projection = TestProjection(ProjectionId("test", "00"), sourceProvider, () => handler)

projectionTestKit.run(projection) {
  // assert logic ..
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/testkit/TestKitDocExample.java#L40-L134 "Go to snippet source")  
import akka.japi.Pair;
import akka.stream.javadsl.Source;
import akka.projection.testkit.javadsl.TestProjection;

List<Pair<Integer, String>> testData =
    Stream.of(Pair.create(0, "abc"), Pair.create(1, "def")).collect(Collectors.toList());

Source<Pair<Integer, String>, NotUsed> source = Source.from(testData);

Function<Pair<Integer, String>, Integer> extractOffsetFn =
    (Pair<Integer, String> env) -> env.first();

TestSourceProvider<Integer, Pair<Integer, String>> sourceProvider =
    TestSourceProvider.create(source, extractOffsetFn);

Projection<Pair<Integer, String>> projection =
    TestProjection.create(ProjectionId.of("test", "00"), sourceProvider, () -> handler);

projectionTestKit.run(
    projection,
    () -> {
      // assert logic ...
    });
```

## Code Examples

### Example 1: Dependencies

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 2: Dependencies

```xml
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>
```

### Example 3: Dependencies

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Dependencies

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-projection-testkit" % "1.6.20" % Test
```

### Example 5: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-testkit_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```

### Example 6: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  testImplementation "com.lightbend.akka:akka-projection-testkit_${versions.ScalaBinary}:1.6.20"
}
```

### Example 7: Initializing the Projection TestKit

```scala
import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.projection.testkit.scaladsl.ProjectionTestKit

class TestKitDocExample extends ScalaTestWithActorTestKit {
  private val projectionTestKit = ProjectionTestKit(system)

}
```

### Example 8: Initializing the Projection TestKit

```java
import akka.projection.testkit.javadsl.TestSourceProvider;
import org.junit.ClassRule;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.projection.testkit.javadsl.ProjectionTestKit;

@ClassRule static final TestKitJunitResource testKit = new TestKitJunitResource();
ProjectionTestKit projectionTestKit = ProjectionTestKit.create(testKit.system());
```

### Example 9: Testing with an assert function

```scala
import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.projection.testkit.scaladsl.ProjectionTestKit

projectionTestKit.run(projection) {
  // confirm that cart checkout was inserted in db
  cartViewRepository.findById("abc-def").futureValue
}
```

### Example 10: Testing with an assert function

```java
projectionTestKit.run(
    projection,
    () ->
        cartCheckoutRepository
            .findById("abc-def")
            .toCompletableFuture()
            .get(1, TimeUnit.SECONDS));
```

### Example 11: Testing with an assert function

```scala
import scala.concurrent.duration._

projectionTestKit.run(projection, max = 5.seconds, interval = 300.millis) {
  // confirm that cart checkout was inserted in db
  cartViewRepository.findById("abc-def").futureValue
}
```

### Example 12: Testing with an assert function

```java
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

projectionTestKit.run(
    projection,
    Duration.ofSeconds(5),
    Duration.ofMillis(300),
    () ->
        cartCheckoutRepository
            .findById("abc-def")
            .toCompletableFuture()
            .get(1, TimeUnit.SECONDS));
```

### Example 13: Testing with a TestSink probe

```scala
projectionTestKit.runWithTestSink(projection) { sinkProbe =>
  sinkProbe.request(1)
  sinkProbe.expectNext(Done)
}

// confirm that cart checkout was inserted in db
cartViewRepository.findById("abc-def").futureValue
```

### Example 14: Testing with a TestSink probe

```java
import static org.junit.Assert.assertEquals;

projectionTestKit.runWithTestSink(
    projection,
    sinkProbe -> {
      sinkProbe.request(1);
      sinkProbe.expectNext(Done.getInstance());
      cartCheckoutRepository.findById("abc-def").toCompletableFuture().get(1, TimeUnit.SECONDS);
    });
```

### Example 15: Testing with mocked Projection and SourceProvider

```scala
import akka.stream.scaladsl.Source

val testData = Source((0, "abc") :: (1, "def") :: Nil)

val extractOffset = (envelope: (Int, String)) => envelope._1

val sourceProvider = TestSourceProvider(testData, extractOffset)

val projection = TestProjection(ProjectionId("test", "00"), sourceProvider, () => handler)

projectionTestKit.run(projection) {
  // assert logic ..
}
```

### Example 16: Testing with mocked Projection and SourceProvider

```java
import akka.japi.Pair;
import akka.stream.javadsl.Source;
import akka.projection.testkit.javadsl.TestProjection;

List<Pair<Integer, String>> testData =
    Stream.of(Pair.create(0, "abc"), Pair.create(1, "def")).collect(Collectors.toList());

Source<Pair<Integer, String>, NotUsed> source = Source.from(testData);

Function<Pair<Integer, String>, Integer> extractOffsetFn =
    (Pair<Integer, String> env) -> env.first();

TestSourceProvider<Integer, Pair<Integer, String>> sourceProvider =
    TestSourceProvider.create(source, extractOffsetFn);

Projection<Pair<Integer, String>> projection =
    TestProjection.create(ProjectionId.of("test", "00"), sourceProvider, () -> handler);

projectionTestKit.run(
    projection,
    () -> {
      // assert logic ...
    });
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/javadsl/TestProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/javadsl/TestSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestSourceProvider.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-testkit.html
- https://doc.akka.io/libraries/akka-projection/current/classic.html
- https://doc.akka.io/libraries/akka-projection/current/management.html
- https://doc.akka.io/libraries/akka-projection/current/overview.html
- https://doc.akka.io/libraries/akka-projection/current/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/testing.html](https://doc.akka.io/libraries/akka-projection/current/testing.html)*