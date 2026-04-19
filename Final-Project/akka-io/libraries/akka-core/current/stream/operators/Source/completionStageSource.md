---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/completionStageSource.html
title: Source.completionStageSource • Akka core
---

# Source.completionStageSource • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.completionStageSource

Streams the elements of an asynchronous source once its given *completion* operator completes.

[Source operators](../index.html#source-operators)

## Signature

[`Source.completionStageSource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#completionStageSource(java.util.concurrent.CompletionStage) "akka.stream.javadsl.Source")[`Source.completionStageSource`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html "akka.stream.scaladsl.Source")

## Description

Streams the elements of an asynchronous source once its given *completion* operator completes. If the *completion* fails the stream is failed with that exception.

For the corresponding operator for the Scala standard library `Future` see [futureSource](futureSource.html).

## Example

Suppose we are accessing a remote service that streams user data over HTTP/2 or a WebSocket. We can model that as a [`Source<User,NotUsed>`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[User,NotUsed]`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") but that source will only be available once the connection has been established.

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/CompletionStageSource.java#L8-L26 "Go to snippet source")import akka.NotUsed;
import akka.stream.javadsl.Source;
import java.util.concurrent.CompletionStage;

public class CompletionStageSource {

  public static void sourceCompletionStageSource() {
    UserRepository userRepository = null; // an abstraction over the remote service
    Source<User, CompletionStage<NotUsed>> userCompletionStageSource =
        Source.completionStageSource(userRepository.loadUsers());
    // ...
  }

  interface UserRepository {
    CompletionStage<Source<User, NotUsed>> loadUsers();
  }

  static class User {}
}
```

## Reactive Streams semantics

**emits** the next value from the asynchronous source, once its *completion operator* has completed

**completes** after the asynchronous source completes

## Code Examples

### Example 1: Example

```java
import akka.NotUsed;
import akka.stream.javadsl.Source;
import java.util.concurrent.CompletionStage;

public class CompletionStageSource {

  public static void sourceCompletionStageSource() {
    UserRepository userRepository = null; // an abstraction over the remote service
    Source<User, CompletionStage<NotUsed>> userCompletionStageSource =
        Source.completionStageSource(userRepository.loadUsers());
    // ...
  }

  interface UserRepository {
    CompletionStage<Source<User, NotUsed>> loadUsers();
  }

  static class User {}
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/completionStageSink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/completionTimeout.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/futureSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/completionStageSource.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/completionStageSource.html)*