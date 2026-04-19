---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:12Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/takeLast.html
title: Sink.takeLast • Akka core
---

# Sink.takeLast • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.takeLast

Collect the last `n` values emitted from the stream into a collection.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.takeLast`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#takeLast(int) "akka.stream.javadsl.Sink")[`Sink.takeLast`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#takeLast[T](n:Int):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[scala.collection.immutable.Seq[T]]] "akka.stream.scaladsl.Sink")

## Description

Materializes into a `Future` `CompletionStage` of `immutable.Seq[T]` `List<In>` containing the last `n` collected elements when the stream completes. If the stream completes before signaling at least n elements, the `Future` `CompletionStage` will complete with the number of elements taken at that point. If the stream never completes, the `Future` `CompletionStage` will never complete. If there is a failure signaled in the stream the `Future` `CompletionStage` will be completed with failure.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/TakeLastSinkSpec.scala#L32-L58 "Go to snippet source")case class Student(name: String, gpa: Double)

val students = List(
  Student("Alison", 4.7),
  Student("Adrian", 3.1),
  Student("Alexis", 4),
  Student("Benita", 2.1),
  Student("Kendra", 4.2),
  Student("Jerrie", 4.3)).sortBy(_.gpa)

val sourceOfStudents = Source(students)

val result: Future[Seq[Student]] = sourceOfStudents.runWith(Sink.takeLast(3))

result.foreach { topThree =>
  println("#### Top students ####")
  topThree.reverse.foreach { s =>
    println(s"Name: ${s.name}, GPA: ${s.gpa}")
  }
}
/*
    #### Top students ####
    Name: Alison, GPA: 4.7
    Name: Jerrie, GPA: 4.3
    Name: Kendra, GPA: 4.2
 */

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SinkDocExamples.java#L14-L76 "Go to snippet source")import akka.japi.Pair;
import org.reactivestreams.Publisher;
// pair of (Name, GPA)
List<Pair<String, Double>> sortedStudents =
    Arrays.asList(
        new Pair<>("Benita", 2.1),
        new Pair<>("Adrian", 3.1),
        new Pair<>("Alexis", 4.0),
        new Pair<>("Kendra", 4.2),
        new Pair<>("Jerrie", 4.3),
        new Pair<>("Alison", 4.7));

Source<Pair<String, Double>, NotUsed> studentSource = Source.from(sortedStudents);

CompletionStage<List<Pair<String, Double>>> topThree =
    studentSource.runWith(Sink.takeLast(3), system);

topThree.thenAccept(
    result -> {
      System.out.println("#### Top students ####");
      for (int i = result.size() - 1; i >= 0; i--) {
        Pair<String, Double> s = result.get(i);
        System.out.println("Name: " + s.first() + ", " + "GPA: " + s.second());
      }
    });
/*
  #### Top students ####
  Name: Alison, GPA: 4.7
  Name: Jerrie, GPA: 4.3
  Name: Kendra, GPA: 4.2
*/
```

## Reactive Streams semantics

**cancels** never

**backpressures** never

## Code Examples

### Example 1: Example

```scala
case class Student(name: String, gpa: Double)

val students = List(
  Student("Alison", 4.7),
  Student("Adrian", 3.1),
  Student("Alexis", 4),
  Student("Benita", 2.1),
  Student("Kendra", 4.2),
  Student("Jerrie", 4.3)).sortBy(_.gpa)

val sourceOfStudents = Source(students)

val result: Future[Seq[Student]] = sourceOfStudents.runWith(Sink.takeLast(3))

result.foreach { topThree =>
  println("#### Top students ####")
  topThree.reverse.foreach { s =>
    println(s"Name: ${s.name}, GPA: ${s.gpa}")
  }
}
/*
    #### Top students ####
    Name: Alison, GPA: 4.7
    Name: Jerrie, GPA: 4.3
    Name: Kendra, GPA: 4.2
 */
```

### Example 2: Example

```java
import akka.japi.Pair;
import org.reactivestreams.Publisher;
// pair of (Name, GPA)
List<Pair<String, Double>> sortedStudents =
    Arrays.asList(
        new Pair<>("Benita", 2.1),
        new Pair<>("Adrian", 3.1),
        new Pair<>("Alexis", 4.0),
        new Pair<>("Kendra", 4.2),
        new Pair<>("Jerrie", 4.3),
        new Pair<>("Alison", 4.7));

Source<Pair<String, Double>, NotUsed> studentSource = Source.from(sortedStudents);

CompletionStage<List<Pair<String, Double>>> topThree =
    studentSource.runWith(Sink.takeLast(3), system);

topThree.thenAccept(
    result -> {
      System.out.println("#### Top students ####");
      for (int i = result.size() - 1; i >= 0; i--) {
        Pair<String, Double> s = result.get(i);
        System.out.println("Name: " + s.first() + ", " + "GPA: " + s.second());
      }
    });
/*
  #### Top students ####
  Name: Alison, GPA: 4.7
  Name: Jerrie, GPA: 4.3
  Name: Kendra, GPA: 4.2
*/
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/take.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/takeWhile.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/takeLast.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/takeLast.html)*