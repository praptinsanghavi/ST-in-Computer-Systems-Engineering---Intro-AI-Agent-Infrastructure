---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/handleWith.html
title: handleWith • Akka HTTP
---

# handleWith • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# handleWith

## Signature

```
def handleWith[A, B](f: A => B)(implicit um: FromRequestUnmarshaller[A], m: ToResponseMarshaller[B]): Route
```

## Description

Completes the request using the given function. The input to the function is produced with the in\-scope entity unmarshaller and the result value of the function is marshalled with the in\-scope marshaller. `handleWith` can be a convenient method combining `entity` with `complete`.

The `handleWith` directive is used when you want to handle a route with a given function of type A \=\> BFunction\<A,B\>. `handleWith` will use both an in\-scope unmarshaller to convert a request into type A and an in\-scope marshaller to convert type B into a response. This is helpful when your core business logic resides in some other class or you want your business logic to be independent of the REST interface written with akka\-http. You can use `handleWith` to “hand off” processing to a given function without requiring any akka\-http\-specific functionality.

`handleWith` is similar to `produce`. The main difference is `handleWith` automatically calls `complete` when the function passed to `handleWith` returns. Using `produce` you must explicitly call the completion function passed from the `produce` function.

See [marshalling](../../../common/marshalling.html) and [unmarshalling](../../../common/unmarshalling.html) for guidance on marshalling entities with akka\-http.

## Examples

The following example uses an `updatePerson` function with a `Person` case class as an input and output. We plug this function into our route using `handleWith`.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MarshallingDirectivesExamplesSpec.scala#L14 "Go to snippet source")case class Person(name: String, favoriteNumber: Int)
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
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MarshallingDirectivesExamplesSpec.scala#L91-L111 "Go to snippet source")import PersonJsonSupport._

val updatePerson = (person: Person) => {

  //... some processing logic...

  //return the person
  person
}

val route = post {
  handleWith(updatePerson)
}

// tests:
Post("/", HttpEntity(`application/json`, """{ "name": "Jane", "favoriteNumber" : 42 }""")) ~>
  route ~> check {
    mediaType shouldEqual `application/json`
    responseAs[String] should include(""""name":"Jane"""")
    responseAs[String] should include(""""favoriteNumber":42""")
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MarshallingDirectivesExamplesTest.java#L29-L138 "Go to snippet source")import static akka.http.javadsl.server.Directives.handleWith;

final Unmarshaller<HttpEntity, Person> unmarshaller = Jackson.unmarshaller(Person.class);
final Marshaller<Person, HttpResponse> marshaller = Marshaller.entityToOKResponse(Jackson.<Person>marshaller());

final Function<Person, Person> updatePerson = person -> {

  //... some processing logic...

  //return the person
  return person;
};

final Route route = handleWith(unmarshaller, marshaller, updatePerson);

// tests:
final TestRouteResult routeResult = testRoute(route).run(
  HttpRequest.POST("/")
    .withEntity(
      HttpEntities.create(
        ContentTypes.APPLICATION_JSON, "{\"name\":\"Jane\",\"favoriteNumber\":42}"
      )
    )
);
routeResult.assertMediaType(MediaTypes.APPLICATION_JSON);
routeResult.assertEntity("{\"favoriteNumber\":42,\"name\":\"Jane\"}");
```

The PersonJsonSupport object handlesprevious example uses also [Json Support via Jackson](../../../common/json-support.html#jackson-support) to handle both marshalling and unmarshalling of the Person case class.

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MarshallingDirectivesExamplesSpec.scala#L18-L22 "Go to snippet source")import spray.json.{ DefaultJsonProtocol, RootJsonFormat }

object PersonJsonSupport extends DefaultJsonProtocol with SprayJsonSupport {
  implicit val personFormat: RootJsonFormat[Person] = jsonFormat2(Person.apply)
}
```

## Code Examples

### Example 1: Signature

```scala
def handleWith[A, B](f: A => B)(implicit um: FromRequestUnmarshaller[A], m: ToResponseMarshaller[B]): Route
```

### Example 2: Examples

```scala
case class Person(name: String, favoriteNumber: Int)
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

val updatePerson = (person: Person) => {

  //... some processing logic...

  //return the person
  person
}

val route = post {
  handleWith(updatePerson)
}

// tests:
Post("/", HttpEntity(`application/json`, """{ "name": "Jane", "favoriteNumber" : 42 }""")) ~>
  route ~> check {
    mediaType shouldEqual `application/json`
    responseAs[String] should include(""""name":"Jane"""")
    responseAs[String] should include(""""favoriteNumber":42""")
  }
```

### Example 5: Examples

```java
import static akka.http.javadsl.server.Directives.handleWith;

final Unmarshaller<HttpEntity, Person> unmarshaller = Jackson.unmarshaller(Person.class);
final Marshaller<Person, HttpResponse> marshaller = Marshaller.entityToOKResponse(Jackson.<Person>marshaller());

final Function<Person, Person> updatePerson = person -> {

  //... some processing logic...

  //return the person
  return person;
};

final Route route = handleWith(unmarshaller, marshaller, updatePerson);

// tests:
final TestRouteResult routeResult = testRoute(route).run(
  HttpRequest.POST("/")
    .withEntity(
      HttpEntities.create(
        ContentTypes.APPLICATION_JSON, "{\"name\":\"Jane\",\"favoriteNumber\":42}"
      )
    )
);
routeResult.assertMediaType(MediaTypes.APPLICATION_JSON);
routeResult.assertEntity("{\"favoriteNumber\":42,\"name\":\"Jane\"}");
```

### Example 6: Examples

```scala
import spray.json.{ DefaultJsonProtocol, RootJsonFormat }

object PersonJsonSupport extends DefaultJsonProtocol with SprayJsonSupport {
  implicit val personFormat: RootJsonFormat[Person] = jsonFormat2(Person.apply)
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/common/json-support.html
- https://doc.akka.io/libraries/akka-http/current/common/marshalling.html
- https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/entity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/method-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/handleWith.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/handleWith.html)*