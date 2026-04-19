---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/entity.html
title: entity • Akka HTTP
---

# entity • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# entity

## Signature

```
def entity[T](um: FromRequestUnmarshaller[T]): Directive1[T]
```

## Description

Unmarshalls the request entity to the given type and passes it to its inner Route. An unmarshaller returns an `Either` with `Right(value)` if successful or `Left(exception)` for a failure. The `entity` method will either pass the `value` to the inner route or map the `exception` to a [`Rejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html "akka.http.javadsl.server.Rejection")[`Rejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html "akka.http.scaladsl.server.Rejection").

The `entity` directive works in conjunction with `as` and `akka.http.scaladsl.unmarshalling` to convert some serialized “wire format” value into a higher\-level object structure.  
[The unmarshalling documentation](../../../common/unmarshalling.html) explains this process in detail. This directive simplifies extraction and error handling to the specified type from the request.

An unmarshaller will return a `Left(exception)` in the case of an error. This is converted to a [`Rejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html "akka.http.javadsl.server.Rejection")[`Rejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html "akka.http.scaladsl.server.Rejection") within the `entity` directive. The following table lists how exceptions are mapped to rejections:

| Left(exception) | Rejection |
| --- | --- |
| `ContentExpected` | [`RequestEntityExpectedRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestEntityExpectedRejection.html "akka.http.javadsl.server.RequestEntityExpectedRejection")[`RequestEntityExpectedRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html "akka.http.scaladsl.server.RequestEntityExpectedRejection") |
| `UnsupportedContentType` | [`UnsupportedRequestContentTypeRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestContentTypeRejection.html "akka.http.javadsl.server.UnsupportedRequestContentTypeRejection")[`UnsupportedRequestContentTypeRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html "akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection"), which lists the supported types |
| `MalformedContent` | [`MalformedRequestContentRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedRequestContentRejection.html "akka.http.javadsl.server.MalformedRequestContentRejection")[`MalformedRequestContentRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedRequestContentRejection.html "akka.http.scaladsl.server.MalformedRequestContentRejection"), with an error message and cause |

## Examples

The following example uses `spray-json`[Json Support via Jackson](../../../common/json-support.html#jackson-support) to unmarshall a json request into a simple `Person` class. It utilizes `SprayJsonSupport` via the `PersonJsonSupport` object as the in\-scope unmarshaller.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MarshallingDirectivesExamplesSpec.scala#L14 "Go to snippet source")case class Person(name: String, favoriteNumber: Int)
import spray.json.{ DefaultJsonProtocol, RootJsonFormat }

object PersonJsonSupport extends DefaultJsonProtocol with SprayJsonSupport {
  implicit val personFormat: RootJsonFormat[Person] = jsonFormat2(Person.apply)
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MarshallingDirectivesExamplesTest.java#L36-L58 "Go to snippet source")static public class Person {
  private final String name;
  private final int favoriteNumber;

  //default constructor required for Jackson
  public Person() {
    this.name = "";
    this.favoriteNumber = 0;
  }

  public Person(String name, int favoriteNumber) {
    this.name = name;
    this.favoriteNumber = favoriteNumber;
  }

  public String getName() {
    return name;
  }

  public int getFavoriteNumber() {
    return favoriteNumber;
  }
}
```

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MarshallingDirectivesExamplesSpec.scala#L29-L41 "Go to snippet source")import PersonJsonSupport._

val route = post {
  entity(as[Person]) { person =>
    complete(s"Person: ${person.name} - favorite number: ${person.favoriteNumber}")
  }
}

// tests:
Post("/", HttpEntity(`application/json`, """{ "name": "Jane", "favoriteNumber" : 42 }""")) ~>
  route ~> check {
    responseAs[String] shouldEqual "Person: Jane - favorite number: 42"
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MarshallingDirectivesExamplesTest.java#L20-L77 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.entity;

final Unmarshaller<HttpEntity, Person> unmarshaller = Jackson.unmarshaller(Person.class);

final Route route = entity(unmarshaller, person ->
  complete( "Person:" +  person.getName() + " - favoriteNumber:" + person.getFavoriteNumber() )
);

testRoute(route).run(
  HttpRequest.POST("/")
    .withEntity(
      HttpEntities.create(
        ContentTypes.APPLICATION_JSON, "{\"name\":\"Jane\",\"favoriteNumber\":42}"
      )
    )
).assertEntity("Person:Jane - favoriteNumber:42");
```

It is also possible to use the `entity` directive to obtain raw `JsValue` ( [spray\-json](https://github.com/spray/spray-json) ) objects, by simply using `as[JsValue]`, or any other JSON type for which you have marshallers in\-scope.

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MarshallingDirectivesExamplesSpec.scala#L47-L60 "Go to snippet source")import spray.json.JsValue
import PersonJsonSupport._

val route = post {
  entity(as[JsValue]) { json =>
    complete(s"Person: ${json.asJsObject.fields("name")} - favorite number: ${json.asJsObject.fields("favoriteNumber")}")
  }
}

// tests:
Post("/", HttpEntity(`application/json`, """{ "name": "Jane", "favoriteNumber" : 42 }""")) ~>
  route ~> check {
    responseAs[String] shouldEqual """Person: "Jane" - favorite number: 42"""
  }
```

## Code Examples

### Example 1: Signature

```scala
def entity[T](um: FromRequestUnmarshaller[T]): Directive1[T]
```

### Example 2: Examples

```scala
case class Person(name: String, favoriteNumber: Int)
import spray.json.{ DefaultJsonProtocol, RootJsonFormat }

object PersonJsonSupport extends DefaultJsonProtocol with SprayJsonSupport {
  implicit val personFormat: RootJsonFormat[Person] = jsonFormat2(Person.apply)
}
```

### Example 3: Examples

```java
static public class Person {
  private final String name;
  private final int favoriteNumber;

  //default constructor required for Jackson
  public Person() {
    this.name = "";
    this.favoriteNumber = 0;
  }

  public Person(String name, int favoriteNumber) {
    this.name = name;
    this.favoriteNumber = favoriteNumber;
  }

  public String getName() {
    return name;
  }

  public int getFavoriteNumber() {
    return favoriteNumber;
  }
}
```

### Example 4: Examples

```scala
import PersonJsonSupport._

val route = post {
  entity(as[Person]) { person =>
    complete(s"Person: ${person.name} - favorite number: ${person.favoriteNumber}")
  }
}

// tests:
Post("/", HttpEntity(`application/json`, """{ "name": "Jane", "favoriteNumber" : 42 }""")) ~>
  route ~> check {
    responseAs[String] shouldEqual "Person: Jane - favorite number: 42"
  }
```

### Example 5: Examples

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.entity;

final Unmarshaller<HttpEntity, Person> unmarshaller = Jackson.unmarshaller(Person.class);

final Route route = entity(unmarshaller, person ->
  complete( "Person:" +  person.getName() + " - favoriteNumber:" + person.getFavoriteNumber() )
);

testRoute(route).run(
  HttpRequest.POST("/")
    .withEntity(
      HttpEntities.create(
        ContentTypes.APPLICATION_JSON, "{\"name\":\"Jane\",\"favoriteNumber\":42}"
      )
    )
).assertEntity("Person:Jane - favoriteNumber:42");
```

### Example 6: Examples

```scala
import spray.json.JsValue
import PersonJsonSupport._

val route = post {
  entity(as[JsValue]) { json =>
    complete(s"Person: ${json.asJsObject.fields("name")} - favorite number: ${json.asJsObject.fields("favoriteNumber")}")
  }
}

// tests:
Post("/", HttpEntity(`application/json`, """{ "name": "Jane", "favoriteNumber" : 42 }""")) ~>
  route ~> check {
    responseAs[String] shouldEqual """Person: "Jane" - favorite number: 42"""
  }
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedRequestContentRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestEntityExpectedRejection$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedRequestContentRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestEntityExpectedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/UnsupportedRequestContentTypeRejection.html
- https://doc.akka.io/libraries/akka-http/current/common/json-support.html
- https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/completeWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/handleWith.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/entity.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/entity.html)*