---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:04Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/common/json-support.html
title: JSON Support • Akka HTTP
---

# JSON Support • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# JSON Support

Akka HTTP’s [marshalling](marshalling.html) and [unmarshalling](unmarshalling.html) infrastructure makes it rather easy to seamlessly convert application\-domain objects from and to JSON. Integration with [spray\-json](https://github.com/spray/spray-json)[Jackson](https://github.com/FasterXML/jackson) is provided out of the box through the `akka-http-spray-json``akka-http-jackson` module. Integration with other JSON libraries are supported by the community. See [the list of current community extensions for Akka HTTP](https://akka.io/community/#extensions-to-akka-http).

## Jackson Support

@@@note The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To make use of the support module for (un)marshalling from and to JSON with [Jackson](https://github.com/FasterXML/jackson), add a library dependency onto:

sbt
```
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-jackson" % AkkaHttpVersion
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-jackson_${versions.ScalaBinary}"
}
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-jackson_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

Use `akka.http.javadsl.marshallers.jackson.Jackson.unmarshaller(T.class)` to create an [`Unmarshaller<HttpEntity,T>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller[HttpEntity,T]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") which expects the request body (HttpEntity) to be of type `application/json` and converts it to `T` using Jackson.

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/main/java/akka/http/javadsl/server/examples/petstore/PetStoreExample.java#L11-L27 "Go to snippet source")import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.StatusCodes;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import static akka.http.javadsl.server.Directives.*;
import static akka.http.javadsl.unmarshalling.StringUnmarshallers.INTEGER;

public static Route appRoute(final Map<Integer, Pet> pets) {
  PetStoreController controller = new PetStoreController(pets);

  // Defined as Function in order to refer to [pets], but this could also be an ordinary method.
  Function<Integer, Route> existingPet = petId -> {
      Pet pet = pets.get(petId);
      return (pet == null) ? reject() : complete(StatusCodes.OK, pet, Jackson.<Pet>marshaller());
  };

  // The directives here are statically imported, but you can also inherit from AllDirectives.
  return
    concat(
      path("", () ->
        getFromResource("web/index.html")
      ),
      pathPrefix("pet", () ->
        path(INTEGER, petId -> concat(
          // demonstrates different ways of handling requests:

          // 1. using a Function
          get(() -> existingPet.apply(petId)),

          // 2. using a method
          put(() ->
            entity(Jackson.unmarshaller(Pet.class), thePet ->
              putPetHandler(pets, thePet)
            )
          ),
          // 2.1. using a method, and internally handling a Future value
          path("alternate", () ->
            put(() ->
              entity(Jackson.unmarshaller(Pet.class), thePet ->
                putPetHandler(pets, thePet)
              )
            )
          ),

          // 3. calling a method of a controller instance
          delete(() -> controller.deletePet(petId))
        ))
      )
    );
}
```

Use `akka.http.javadsl.marshallers.jackson.Jackson.marshaller(T.class)` to create a [`Marshaller<T,RequestEntity>`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html "akka.http.javadsl.marshalling.Marshaller")[`Marshaller[T,RequestEntity]`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html "akka.http.scaladsl.marshalling.Marshaller") which can be used with `RequestContext.complete` or `RouteDirectives.complete` to convert a POJO to an HttpResponse.

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/main/java/akka/http/javadsl/server/examples/petstore/PetStoreExample.java#L11-L27 "Go to snippet source")import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.StatusCodes;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import static akka.http.javadsl.server.Directives.*;
import static akka.http.javadsl.unmarshalling.StringUnmarshallers.INTEGER;

private static Route putPetHandler(Map<Integer, Pet> pets, Pet thePet) {
    pets.put(thePet.getId(), thePet);
    return complete(StatusCodes.OK, thePet, Jackson.<Pet>marshaller());
}

private static Route alternativeFuturePutPetHandler(Map<Integer, Pet> pets, Pet thePet) {
    pets.put(thePet.getId(), thePet);
  CompletableFuture<Pet> futurePet = CompletableFuture.supplyAsync(() -> thePet);
    return completeOKWithFuture(futurePet, Jackson.<Pet>marshaller());
}
```

Refer to [this file](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/main/java/akka/http/javadsl/server/examples/petstore/PetStoreExample.java) in the sources for the complete example.

@@@

## spray\-json Support

The [`SprayJsonSupport`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html "akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport") trait provides a `FromEntityUnmarshaller[T]` and `ToEntityMarshaller[T]` for every type `T` that an implicit `spray.json.RootJsonReader` and/or `spray.json.RootJsonWriter` (respectively) is available for.

To enable automatic support for (un)marshalling from and to JSON with [spray\-json](https://github.com/spray/spray-json), add a library dependency onto:

sbt
```
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-spray-json_${versions.ScalaBinary}"
}
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-spray-json_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

Next, provide a `RootJsonFormat[T]` for your type and bring it into scope. Check out the [spray\-json](https://github.com/spray/spray-json) documentation for more info on how to do this.

Finally, import the `FromEntityUnmarshaller[T]` and `ToEntityMarshaller[T]` implicits directly from `SprayJsonSupport` as shown in the example below or mix the `akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport` trait into your JSON support module.

Once you have done this (un)marshalling between JSON and your type `T` should work nicely and transparently.

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/SprayJsonExampleSpec.scala#L18-L50 "Go to snippet source")import akka.http.scaladsl.server.Directives
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json._

// domain model
final case class Item(name: String, id: Long)
final case class Order(items: List[Item])

// collect your json format instances into a support trait:
trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val itemFormat: RootJsonFormat[Item] = jsonFormat2(Item.apply)
  implicit val orderFormat: RootJsonFormat[Order] = jsonFormat1(Order.apply) // contains List[Item]
}

// use it wherever json (un)marshalling is needed
class MyJsonService extends Directives with JsonSupport {

  val route =
    concat(
      get {
        pathSingleSlash {
          complete(Item("thing", 42)) // will render as JSON
        }
      },
      post {
        entity(as[Order]) { order => // will unmarshal JSON to Order
          val itemsCount = order.items.size
          val itemNames = order.items.map(_.name).mkString(", ")
          complete(s"Ordered $itemsCount items: $itemNames")
        }
      }
    )
}
```

## Consuming JSON Streaming style APIs

A popular way of implementing streaming APIs is [JSON Streaming](https://en.wikipedia.org/wiki/JSON_Streaming) (see [Source Streaming](../routing-dsl/source-streaming-support.html) for documentation on building server\-side of such API).

Depending on the way the API returns the streamed JSON (newline delimited, raw sequence of objects, or “infinite array”) you may have to apply a different framing mechanism, but the general idea remains the same: consuming the infinite entity stream and applying a framing to it, such that the single objects can be easily deserialized using the usual marshalling infrastructure:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/server/EntityStreamingSpec.scala#L101-L122 "Go to snippet source")import MyJsonProtocol._
import akka.http.scaladsl.unmarshalling._
import akka.http.scaladsl.common.EntityStreamingSupport
import akka.http.scaladsl.common.JsonEntityStreamingSupport

implicit val jsonStreamingSupport: JsonEntityStreamingSupport =
  EntityStreamingSupport.json()

val input = """{"uid":1,"txt":"#Akka rocks!"}""" + "\n" +
  """{"uid":2,"txt":"Streaming is so hot right now!"}""" + "\n" +
  """{"uid":3,"txt":"You cannot enter the same river twice."}"""

val response = HttpResponse(entity = HttpEntity(ContentTypes.`application/json`, input))

// unmarshal:
val unmarshalled: Future[Source[Tweet, NotUsed]] =
  Unmarshal(response).to[Source[Tweet, NotUsed]]

// flatten the Future[Source[]] into a Source[]:
val source: Source[Tweet, Future[NotUsed]] =
  Source.futureSource(unmarshalled)

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/JsonStreamingExamplesTest.java#L136-L152 "Go to snippet source")Unmarshaller<ByteString, JavaTweet> unmarshal = Jackson.byteStringUnmarshaller(JavaTweet.class);
JsonEntityStreamingSupport support = EntityStreamingSupport.json();

// imagine receiving such response from a service:
String payload = "{\"uid\":1,\"txt\":\"#Akka rocks!\"}\n" +
    "{\"uid\":2,\"txt\":\"Streaming is so hot right now!\"}\n" +
    "{\"uid\":3,\"txt\":\"You cannot enter the same river twice.\"}";
HttpEntity.Strict entity = HttpEntities.create(ContentTypes.APPLICATION_JSON, payload);
HttpResponse response = HttpResponse.create().withEntity(entity);

Source<JavaTweet, Object> tweets =
    response.entity().getDataBytes()
    .via(support.framingDecoder()) // apply JSON framing
    .mapAsync(1, // unmarshal each element
        bs -> unmarshal.unmarshal(bs, system())
    );

```

In the above example the marshalling is handled by the implicitly provided `JsonEntityStreamingSupport`, which is also used when building server\-side streaming APIs. You can also achieve the same more explicitly, by manually connecting the entity byte stream through a framing and then deserialization stage: 

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/server/EntityStreamingSpec.scala#L136-L154 "Go to snippet source")import MyJsonProtocol._
import akka.http.scaladsl.unmarshalling._
import akka.http.scaladsl.common.EntityStreamingSupport
import akka.http.scaladsl.common.JsonEntityStreamingSupport

implicit val jsonStreamingSupport: JsonEntityStreamingSupport =
  EntityStreamingSupport.json()

val input = """{"uid":1,"txt":"#Akka rocks!"}""" + "\n" +
  """{"uid":2,"txt":"Streaming is so hot right now!"}""" + "\n" +
  """{"uid":3,"txt":"You cannot enter the same river twice."}"""

val response = HttpResponse(entity = HttpEntity(ContentTypes.`application/json`, input))

val value: Source[Tweet, Any] =
  response.entity.dataBytes
    .via(jsonStreamingSupport.framingDecoder) // pick your Framing (could be "\n" etc)
    .mapAsync(1)(bytes => Unmarshal(bytes).to[Tweet]) // unmarshal one by one

```

In the above example the `JsonEntityStreamingSupport` class is used to obtain the proper framing, though you could also pick the framing manually by using `akka.stream.javadsl.Framing` or `akka.stream.javadsl.JsonFraming`. Framing stages are used to “chunk up” the pieces of incoming bytes into appropriately sized pieces of valid JSON, which then can be handled easily by a not\-streaming JSON serializer such as jackson in the example. This technique is simpler to use and often good enough rather than writing a fully streaming JSON parser (which also is possible). 

## Pretty printing

By default, spray\-json marshals your types to compact printed JSON by implicit conversion using `CompactPrinter`, as defined in:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-marshallers-scala/akka-http-spray-json/src/main/scala/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.scala#L63-L64 "Go to snippet source")implicit def sprayJsonMarshallerConverter[T](writer: RootJsonWriter[T])(implicit printer: JsonPrinter = CompactPrinter): ToEntityMarshaller[T] =
  sprayJsonMarshaller[T](writer, printer)
```

Alternatively to marshal your types to pretty printed JSON, bring a `PrettyPrinter` in scope to perform implicit conversion.

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/SprayJsonPrettyMarshalSpec.scala#L15-L52 "Go to snippet source")import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import spray.json._

// domain model
final case class PrettyPrintedItem(name: String, id: Long)

object PrettyJsonFormatSupport {
  import DefaultJsonProtocol._
  implicit val printer: JsonPrinter = PrettyPrinter
  implicit val prettyPrintedItemFormat: RootJsonFormat[PrettyPrintedItem] = jsonFormat2(PrettyPrintedItem.apply)
}

// use it wherever json (un)marshalling is needed
class MyJsonService extends Directives {
  import PrettyJsonFormatSupport._

  // format: OFF
  val route =
    get {
      pathSingleSlash {
        complete {
          PrettyPrintedItem("akka", 42) // will render as JSON
        }
      }
    }
  // format: ON
}

val service = new MyJsonService

// verify the pretty printed JSON
Get("/") ~> service.route ~> check {
  responseAs[String] shouldEqual
    """{""" + "\n" +
    """  "id": 42,""" + "\n" +
    """  "name": "akka"""" + "\n" +
    """}"""
}
```

To learn more about how spray\-json works please refer to its [documentation](https://github.com/spray/spray-json).

## Code Examples

### Example 1: Jackson Support

```scala
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-jackson" % AkkaHttpVersion
```

### Example 2: Jackson Support

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-jackson_${versions.ScalaBinary}"
}
```

### Example 3: Jackson Support

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-jackson_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 4: Jackson Support

```java
import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.StatusCodes;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import static akka.http.javadsl.server.Directives.*;
import static akka.http.javadsl.unmarshalling.StringUnmarshallers.INTEGER;

public static Route appRoute(final Map<Integer, Pet> pets) {
  PetStoreController controller = new PetStoreController(pets);

  // Defined as Function in order to refer to [pets], but this could also be an ordinary method.
  Function<Integer, Route> existingPet = petId -> {
      Pet pet = pets.get(petId);
      return (pet == null) ? reject() : complete(StatusCodes.OK, pet, Jackson.<Pet>marshaller());
  };

  // The directives here are statically imported, but you can also inherit from AllDirectives.
  return
    concat(
      path("", () ->
        getFromResource("web/index.html")
      ),
      pathPrefix("pet", () ->
        path(INTEGER, petId -> concat(
          // demonstrates different ways of handling requests:

          // 1. using a Function
          get(() -> existingPet.apply(petId)),

          // 2. using a method
          put(() ->
            entity(Jackson.unmarshaller(Pet.class), thePet ->
              putPetHandler(pets, thePet)
            )
          ),
          // 2.1. using a method, and internally handling a Future value
          path("alternate", () ->
            put(() ->
              entity(Jackson.unmarshaller(Pet.class), thePet ->
                putPetHandler(pets, thePet)
              )
            )
          ),

          // 3. calling a method of a controller instance
          delete(() -> controller.deletePet(petId))
        ))
      )
    );
}
```

### Example 5: Jackson Support

```java
import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.StatusCodes;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import static akka.http.javadsl.server.Directives.*;
import static akka.http.javadsl.unmarshalling.StringUnmarshallers.INTEGER;

private static Route putPetHandler(Map<Integer, Pet> pets, Pet thePet) {
    pets.put(thePet.getId(), thePet);
    return complete(StatusCodes.OK, thePet, Jackson.<Pet>marshaller());
}

private static Route alternativeFuturePutPetHandler(Map<Integer, Pet> pets, Pet thePet) {
    pets.put(thePet.getId(), thePet);
  CompletableFuture<Pet> futurePet = CompletableFuture.supplyAsync(() -> thePet);
    return completeOKWithFuture(futurePet, Jackson.<Pet>marshaller());
}
```

### Example 6: spray-json Support

```scala
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion
```

### Example 7: spray-json Support

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-spray-json_${versions.ScalaBinary}"
}
```

### Example 8: spray-json Support

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-spray-json_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 9: spray-json Support

```scala
import akka.http.scaladsl.server.Directives
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json._

// domain model
final case class Item(name: String, id: Long)
final case class Order(items: List[Item])

// collect your json format instances into a support trait:
trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val itemFormat: RootJsonFormat[Item] = jsonFormat2(Item.apply)
  implicit val orderFormat: RootJsonFormat[Order] = jsonFormat1(Order.apply) // contains List[Item]
}

// use it wherever json (un)marshalling is needed
class MyJsonService extends Directives with JsonSupport {

  val route =
    concat(
      get {
        pathSingleSlash {
          complete(Item("thing", 42)) // will render as JSON
        }
      },
      post {
        entity(as[Order]) { order => // will unmarshal JSON to Order
          val itemsCount = order.items.size
          val itemNames = order.items.map(_.name).mkString(", ")
          complete(s"Ordered $itemsCount items: $itemNames")
        }
      }
    )
}
```

### Example 10: Consuming JSON Streaming style APIs

```scala
import MyJsonProtocol._
import akka.http.scaladsl.unmarshalling._
import akka.http.scaladsl.common.EntityStreamingSupport
import akka.http.scaladsl.common.JsonEntityStreamingSupport

implicit val jsonStreamingSupport: JsonEntityStreamingSupport =
  EntityStreamingSupport.json()

val input = """{"uid":1,"txt":"#Akka rocks!"}""" + "\n" +
  """{"uid":2,"txt":"Streaming is so hot right now!"}""" + "\n" +
  """{"uid":3,"txt":"You cannot enter the same river twice."}"""

val response = HttpResponse(entity = HttpEntity(ContentTypes.`application/json`, input))

// unmarshal:
val unmarshalled: Future[Source[Tweet, NotUsed]] =
  Unmarshal(response).to[Source[Tweet, NotUsed]]

// flatten the Future[Source[]] into a Source[]:
val source: Source[Tweet, Future[NotUsed]] =
  Source.futureSource(unmarshalled)
```

### Example 11: Consuming JSON Streaming style APIs

```java
Unmarshaller<ByteString, JavaTweet> unmarshal = Jackson.byteStringUnmarshaller(JavaTweet.class);
JsonEntityStreamingSupport support = EntityStreamingSupport.json();

// imagine receiving such response from a service:
String payload = "{\"uid\":1,\"txt\":\"#Akka rocks!\"}\n" +
    "{\"uid\":2,\"txt\":\"Streaming is so hot right now!\"}\n" +
    "{\"uid\":3,\"txt\":\"You cannot enter the same river twice.\"}";
HttpEntity.Strict entity = HttpEntities.create(ContentTypes.APPLICATION_JSON, payload);
HttpResponse response = HttpResponse.create().withEntity(entity);

Source<JavaTweet, Object> tweets =
    response.entity().getDataBytes()
    .via(support.framingDecoder()) // apply JSON framing
    .mapAsync(1, // unmarshal each element
        bs -> unmarshal.unmarshal(bs, system())
    );
```

### Example 12: Consuming JSON Streaming style APIs

```scala
import MyJsonProtocol._
import akka.http.scaladsl.unmarshalling._
import akka.http.scaladsl.common.EntityStreamingSupport
import akka.http.scaladsl.common.JsonEntityStreamingSupport

implicit val jsonStreamingSupport: JsonEntityStreamingSupport =
  EntityStreamingSupport.json()

val input = """{"uid":1,"txt":"#Akka rocks!"}""" + "\n" +
  """{"uid":2,"txt":"Streaming is so hot right now!"}""" + "\n" +
  """{"uid":3,"txt":"You cannot enter the same river twice."}"""

val response = HttpResponse(entity = HttpEntity(ContentTypes.`application/json`, input))

val value: Source[Tweet, Any] =
  response.entity.dataBytes
    .via(jsonStreamingSupport.framingDecoder) // pick your Framing (could be "\n" etc)
    .mapAsync(1)(bytes => Unmarshal(bytes).to[Tweet]) // unmarshal one by one
```

### Example 13: Pretty printing

```scala
implicit def sprayJsonMarshallerConverter[T](writer: RootJsonWriter[T])(implicit printer: JsonPrinter = CompactPrinter): ToEntityMarshaller[T] =
  sprayJsonMarshaller[T](writer, printer)
```

### Example 14: Pretty printing

```scala
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import spray.json._

// domain model
final case class PrettyPrintedItem(name: String, id: Long)

object PrettyJsonFormatSupport {
  import DefaultJsonProtocol._
  implicit val printer: JsonPrinter = PrettyPrinter
  implicit val prettyPrintedItemFormat: RootJsonFormat[PrettyPrintedItem] = jsonFormat2(PrettyPrintedItem.apply)
}

// use it wherever json (un)marshalling is needed
class MyJsonService extends Directives {
  import PrettyJsonFormatSupport._

  // format: OFF
  val route =
    get {
      pathSingleSlash {
        complete {
          PrettyPrintedItem("akka", 42) // will render as JSON
        }
      }
    }
  // format: ON
}

val service = new MyJsonService

// verify the pretty printed JSON
Get("/") ~> service.route ~> check {
  responseAs[String] shouldEqual
    """{""" + "\n" +
    """  "id": 42,""" + "\n" +
    """  "name": "akka"""" + "\n" +
    """}"""
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/libraries/akka-http/current/common/encoding.html
- https://doc.akka.io/libraries/akka-http/current/common/marshalling.html
- https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html
- https://doc.akka.io/libraries/akka-http/current/common/xml-support.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/source-streaming-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/common/json-support.html](https://doc.akka.io/libraries/akka-http/current/common/json-support.html)*