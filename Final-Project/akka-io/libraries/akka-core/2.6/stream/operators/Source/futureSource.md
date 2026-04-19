---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/futureSource.html
title: Source.futureSource • Akka Documentation
---

# Source.futureSource • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Source.futureSource

Streams the elements of the given future source once it successfully completes.

[Source operators](../index.html#source-operators)

## Signature

[`Source.futureSource`](https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source.futureSource`](https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Source$.html#futureSource[T,M](futureSource:scala.concurrent.Future[akka.stream.scaladsl.Source[T,M]]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "akka.stream.scaladsl.Source")

## Description

Streams the elements of the given future source once it successfully completes. If the future fails the stream is failed.

For the corresponding operator for the Java standard library `CompletionStage` see [completionStageSource](completionStageSource.html).

## Example

Suppose we are accessing a remote service that streams user data over HTTP/2 or a WebSocket. We can model that as a [`Source<User,NotUsed>`](https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[User,NotUsed]`](https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") but that source will only be available once the connection has been established.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/stream/operators/source/FutureSource.scala#L8-L27 "Go to snippet source")  
import akka.NotUsed
import akka.stream.scaladsl.Source

import scala.concurrent.Future

object FutureSource {
  def sourceCompletionStageSource(): Unit = {
    val userRepository: UserRepository = ??? // an abstraction over the remote service
    val userFutureSource = Source.futureSource(userRepository.loadUsers)
    // ...
  }

  trait UserRepository {
    def loadUsers: Future[Source[User, NotUsed]]
  }

  case class User()
}

```

## Reactive Streams semantics

**emits** the next value from the *future* source, once it has completed

**completes** after the *future* source completes

## Code Examples

### Example 1: Example

```scala
import akka.NotUsed
import akka.stream.scaladsl.Source

import scala.concurrent.Future

object FutureSource {
  def sourceCompletionStageSource(): Unit = {
    val userRepository: UserRepository = ??? // an abstraction over the remote service
    val userFutureSource = Source.futureSource(userRepository.loadUsers)
    // ...
  }

  trait UserRepository {
    def loadUsers: Future[Source[User, NotUsed]]
  }

  case class User()
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Sink/futureSink.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source-or-Flow/groupBy.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/completionStageSource.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/futureSource.html](https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/futureSource.html)*