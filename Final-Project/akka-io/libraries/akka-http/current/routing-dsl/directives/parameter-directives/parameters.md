---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameters.html
title: parameters • Akka HTTP
---

# parameters • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# parameters

This page explains how to extract multiple *query* parameter values from the request, or parameters that might or might not be present.

## Signature

```
def parameters(param: <ParamDef[T]>): Directive1[T]
def parameters(params: <ParamDef[T_i]>*): Directive[T_0 :: ... T_i ... :: HNil]
def parameters(params: <ParamDef[T_0]> :: ... <ParamDef[T_i]> ... :: HNil): Directive[T_0 :: ... T_i ... :: HNil]

```

The signature shown is simplified and written in pseudo\-syntax, the real signature uses magnets. [\[1]](#1) The type `<ParamDef>` doesn’t really exist but consists of the syntactic variants as shown in the description and the examples.

> [\[1]](#^1) See [The Magnet Pattern](https://spray.readthedocs.io/en/latest/blog/2012-12-13-the-magnet-pattern.html) for an explanation of magnet\-based overloading.

## Description

The parameters directive filters on the existence of several query parameters and extract their values.

Query parameters can be either extracted as a String or can be converted to another type. The parameter name is supplied as a String. Parameter extraction can be modified to mark a query parameter as required, optional, or repeated, or to filter requests where a parameter has a certain value:

`"color"`
extract the value of parameter “color” as `String`
reject if the parameter is missing
`"color".optional`
(symbolic notation `"color".?`)
extract the optional value of parameter “color” as `Option[String]`
`"color".withDefault("red")`
(symbolic notation `"color" ? "red"`)
extract the optional value of parameter “color” as `String` with default value `"red"`
`"color".requiredValue("blue")`
(symbolic notation `"color" ! "blue"`)
require the value of parameter “color” to be `"blue"` and extract nothing
reject if the parameter is missing or has a different value
`"amount".as[Int]`
extract the value of parameter “amount” as `Int`, you need a matching [`Unmarshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") in scope for that to work (see also [Unmarshalling](../../../common/unmarshalling.html))
reject if the parameter is missing or can’t be unmarshalled to the given type
`"amount".as(unmarshaller)`
extract the value of parameter “amount” with an explicit [`Unmarshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") as described in [Unmarshalling](../../../common/unmarshalling.html)
reject if the parameter is missing or can’t be unmarshalled to the given type
`"distance".repeated`
extract multiple occurrences of parameter “distance” as `Iterable[String]`
`"distance".as[Int].repeated`
extract multiple occurrences of parameter “distance” as `Iterable[Int]`, you need a matching [`Unmarshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") in scope for that to work (see also [Unmarshalling](../../../common/unmarshalling.html))
`"distance".as(unmarshaller).repeated`
extract multiple occurrences of parameter “distance” with an explicit [`Unmarshaller`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html "akka.http.javadsl.unmarshalling.Unmarshaller")[`Unmarshaller`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html "akka.http.scaladsl.unmarshalling.Unmarshaller") as described in [Unmarshalling](../../../common/unmarshalling.html)

You can use [Case Class Extraction](../../case-class-extraction.html) to group several extracted values together into a case\-class instance.

In order to filter on the existence of several query parameters, you need to nest as many [parameter](parameter.html) directives as desired.

Query parameters can be either extracted as a `String` or can be converted to another type. Different methods must be used when the desired parameter is required, optional or repeated.

Requests missing a required parameter or parameter value will be rejected with an appropriate rejection. 

If an unmarshaller throws an exception while extracting the value of a parameter, the request will be rejected with a `MissingQueryParameterRejection` if the unmarshaller threw an `Unmarshaller.NoContentException` or a [`MalformedQueryParamRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedQueryParamRejection.html "akka.http.javadsl.server.MalformedQueryParamRejection")[`MalformedQueryParamRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedQueryParamRejection.html "akka.http.scaladsl.server.MalformedQueryParamRejection") in all other cases. (see also [Rejections](../../rejections.html))

There’s also a singular version, [parameter](parameter.html). Form fields can be handled in a similar way, see [`formFields`](../form-field-directives/index.html).

See [When to use which parameter directive?](index.html#which-parameter-directive) to understand when to use which directive.

## Examples

### Required parameter

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ParameterDirectivesExamplesSpec.scala#L34-L46 "Go to snippet source")val route =
  parameters("color", "backgroundColor") { (color, backgroundColor) =>
    complete(s"The color is '$color' and the background is '$backgroundColor'")
  }

// tests:
Get("/?color=blue&backgroundColor=red") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the background is 'red'"
}
Get("/?color=blue") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "Request is missing required query parameter 'backgroundColor'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/ParameterDirectivesExamplesTest.java#L24-L95 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameter;

final Route route = parameter("color", color ->
  parameter("backgroundColor", backgroundColor ->
    complete("The color is '" + color
               + "' and the background is '" + backgroundColor + "'")
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&backgroundColor=red"))
  .assertEntity("The color is 'blue' and the background is 'red'");

testRoute(route).run(HttpRequest.GET("/?color=blue"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("Request is missing required query parameter 'backgroundColor'");
```

### Optional parameter

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ParameterDirectivesExamplesSpec.scala#L51-L63 "Go to snippet source")val route =
  parameters("color", "backgroundColor".optional) { (color, backgroundColor) =>
    val backgroundStr = backgroundColor.getOrElse("<undefined>")
    complete(s"The color is '$color' and the background is '$backgroundStr'")
  }

// tests:
Get("/?color=blue&backgroundColor=red") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the background is 'red'"
}
Get("/?color=blue") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the background is '<undefined>'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/ParameterDirectivesExamplesTest.java#L29-L114 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameter;
import static akka.http.javadsl.server.Directives.parameterOptional;

final Route route = parameter("color", color ->
  parameterOptional("backgroundColor", backgroundColor ->
    complete("The color is '" + color + "' and the background is '"
      + backgroundColor.orElse("undefined") + "'")
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&backgroundColor=red"))
  .assertEntity("The color is 'blue' and the background is 'red'");

testRoute(route).run(HttpRequest.GET("/?color=blue"))
  .assertEntity("The color is 'blue' and the background is 'undefined'");
```

### Optional parameter with default value

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ParameterDirectivesExamplesSpec.scala#L68-L79 "Go to snippet source")val route =
  parameters("color", "backgroundColor".withDefault("white")) { (color, backgroundColor) =>
    complete(s"The color is '$color' and the background is '$backgroundColor'")
  }

// tests:
Get("/?color=blue&backgroundColor=red") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the background is 'red'"
}
Get("/?color=blue") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the background is 'white'"
}
```

### Parameter with required value

The `requiredValue` decorator makes the route match only if the parameter contains the specified value. The directive `parameterRequiredValue` makes the route match only if the parameter contains the specified value.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ParameterDirectivesExamplesSpec.scala#L84-L97 "Go to snippet source")val route =
  parameters("color", "action".requiredValue("true")) { (color, _) =>
    complete(s"The color is '$color'.")
  }

// tests:
Get("/?color=blue&action=true") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue'."
}

Get("/?color=blue&action=false") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "Request is missing required value 'true' for query parameter 'action'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/ParameterDirectivesExamplesTest.java#L35-L134 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameterRequiredValue;

final Route route = parameter("color", color ->
  parameterRequiredValue(StringUnmarshallers.BOOLEAN, true, "action", () ->
    complete("The color is '" + color + "'.")
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&action=true"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("The color is 'blue'.");

testRoute(route).run(HttpRequest.GET("/?color=blue&action=false"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("Request is missing required value 'true' for query parameter 'action'");
```

### Deserialized parameter

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ParameterDirectivesExamplesSpec.scala#L102-L116 "Go to snippet source")val route =
  parameters("color", "count".as[Int]) { (color, count) =>
    complete(s"The color is '$color' and you have $count of it.")
  }

// tests:
Get("/?color=blue&count=42") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and you have 42 of it."
}

Get("/?color=blue&count=blub") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.BadRequest
  responseAs[String] shouldEqual "The query parameter 'count' was malformed:\n'blub'" +
    " is not a valid 32-bit signed integer value"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/ParameterDirectivesExamplesTest.java#L40-L153 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameter;

final Route route = parameter("color", color ->
  parameter(StringUnmarshallers.INTEGER,"count", count ->
    complete("The color is '" + color + "' and you have " + count + " of it.")
  )
);
// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&count=42"))
  .assertEntity("The color is 'blue' and you have 42 of it.");

testRoute(route).run(HttpRequest.GET("/?color=blue&count=blub"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertEntity("The query parameter 'count' was malformed:\n'blub'"
                      +" is not a valid 32-bit signed integer value");
```

### Repeated parameter

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ParameterDirectivesExamplesSpec.scala#L121-L141 "Go to snippet source")val route =
  parameters("color", "city".repeated) { (color, cities) =>
    cities.toList match {
      case Nil         => complete(s"The color is '$color' and there are no cities.")
      case city :: Nil => complete(s"The color is '$color' and the city is $city.")
      case multiple    => complete(s"The color is '$color' and the cities are ${multiple.mkString(", ")}.")
    }
  }

// tests:
Get("/?color=blue") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and there are no cities."
}

Get("/?color=blue&city=Chicago") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the city is Chicago."
}

Get("/?color=blue&city=Chicago&city=Boston") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the cities are Boston, Chicago."
}
```

### CSV parameter

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ParameterDirectivesExamplesSpec.scala#L221-L238 "Go to snippet source")val route =
  parameter("names".as(CsvSeq[String])) { names =>
    complete(s"The parameters are ${names.mkString(", ")}")
  }

// tests:
Get("/?names=") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are "
}
Get("/?names=Caplin") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are Caplin"
}
Get("/?names=Caplin,John") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are Caplin, John"
}
Get("/?names=Caplin,John,") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are Caplin, John, "
}
```

### Repeated, deserialized parameter

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ParameterDirectivesExamplesSpec.scala#L146-L166 "Go to snippet source")val route =
  parameters("color", "distance".as[Int].repeated) { (color, distances) =>
    distances.toList match {
      case Nil             => complete(s"The color is '$color' and there are no distances.")
      case distance :: Nil => complete(s"The color is '$color' and the distance is $distance.")
      case multiple        => complete(s"The color is '$color' and the distances are ${multiple.mkString(", ")}.")
    }
  }

// tests:
Get("/?color=blue") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and there are no distances."
}

Get("/?color=blue&distance=5") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the distance is 5."
}

Get("/?color=blue&distance=5&distance=14") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the distances are 14, 5."
}
```

## Code Examples

### Example 1: Signature

```scala
def parameters(param: <ParamDef[T]>): Directive1[T]
def parameters(params: <ParamDef[T_i]>*): Directive[T_0 :: ... T_i ... :: HNil]
def parameters(params: <ParamDef[T_0]> :: ... <ParamDef[T_i]> ... :: HNil): Directive[T_0 :: ... T_i ... :: HNil]
```

### Example 2: Required parameter

```scala
val route =
  parameters("color", "backgroundColor") { (color, backgroundColor) =>
    complete(s"The color is '$color' and the background is '$backgroundColor'")
  }

// tests:
Get("/?color=blue&backgroundColor=red") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the background is 'red'"
}
Get("/?color=blue") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "Request is missing required query parameter 'backgroundColor'"
}
```

### Example 3: Required parameter

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameter;

final Route route = parameter("color", color ->
  parameter("backgroundColor", backgroundColor ->
    complete("The color is '" + color
               + "' and the background is '" + backgroundColor + "'")
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&backgroundColor=red"))
  .assertEntity("The color is 'blue' and the background is 'red'");

testRoute(route).run(HttpRequest.GET("/?color=blue"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("Request is missing required query parameter 'backgroundColor'");
```

### Example 4: Optional parameter

```scala
val route =
  parameters("color", "backgroundColor".optional) { (color, backgroundColor) =>
    val backgroundStr = backgroundColor.getOrElse("<undefined>")
    complete(s"The color is '$color' and the background is '$backgroundStr'")
  }

// tests:
Get("/?color=blue&backgroundColor=red") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the background is 'red'"
}
Get("/?color=blue") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the background is '<undefined>'"
}
```

### Example 5: Optional parameter

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameter;
import static akka.http.javadsl.server.Directives.parameterOptional;

final Route route = parameter("color", color ->
  parameterOptional("backgroundColor", backgroundColor ->
    complete("The color is '" + color + "' and the background is '"
      + backgroundColor.orElse("undefined") + "'")
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&backgroundColor=red"))
  .assertEntity("The color is 'blue' and the background is 'red'");

testRoute(route).run(HttpRequest.GET("/?color=blue"))
  .assertEntity("The color is 'blue' and the background is 'undefined'");
```

### Example 6: Optional parameter with default value

```scala
val route =
  parameters("color", "backgroundColor".withDefault("white")) { (color, backgroundColor) =>
    complete(s"The color is '$color' and the background is '$backgroundColor'")
  }

// tests:
Get("/?color=blue&backgroundColor=red") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the background is 'red'"
}
Get("/?color=blue") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the background is 'white'"
}
```

### Example 7: Parameter with required value

```scala
val route =
  parameters("color", "action".requiredValue("true")) { (color, _) =>
    complete(s"The color is '$color'.")
  }

// tests:
Get("/?color=blue&action=true") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue'."
}

Get("/?color=blue&action=false") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.NotFound
  responseAs[String] shouldEqual "Request is missing required value 'true' for query parameter 'action'"
}
```

### Example 8: Parameter with required value

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameterRequiredValue;

final Route route = parameter("color", color ->
  parameterRequiredValue(StringUnmarshallers.BOOLEAN, true, "action", () ->
    complete("The color is '" + color + "'.")
  )
);

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&action=true"))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("The color is 'blue'.");

testRoute(route).run(HttpRequest.GET("/?color=blue&action=false"))
  .assertStatusCode(StatusCodes.NOT_FOUND)
  .assertEntity("Request is missing required value 'true' for query parameter 'action'");
```

### Example 9: Deserialized parameter

```scala
val route =
  parameters("color", "count".as[Int]) { (color, count) =>
    complete(s"The color is '$color' and you have $count of it.")
  }

// tests:
Get("/?color=blue&count=42") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and you have 42 of it."
}

Get("/?color=blue&count=blub") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.BadRequest
  responseAs[String] shouldEqual "The query parameter 'count' was malformed:\n'blub'" +
    " is not a valid 32-bit signed integer value"
}
```

### Example 10: Deserialized parameter

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameter;

final Route route = parameter("color", color ->
  parameter(StringUnmarshallers.INTEGER,"count", count ->
    complete("The color is '" + color + "' and you have " + count + " of it.")
  )
);
// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&count=42"))
  .assertEntity("The color is 'blue' and you have 42 of it.");

testRoute(route).run(HttpRequest.GET("/?color=blue&count=blub"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertEntity("The query parameter 'count' was malformed:\n'blub'"
                      +" is not a valid 32-bit signed integer value");
```

### Example 11: Repeated parameter

```scala
val route =
  parameters("color", "city".repeated) { (color, cities) =>
    cities.toList match {
      case Nil         => complete(s"The color is '$color' and there are no cities.")
      case city :: Nil => complete(s"The color is '$color' and the city is $city.")
      case multiple    => complete(s"The color is '$color' and the cities are ${multiple.mkString(", ")}.")
    }
  }

// tests:
Get("/?color=blue") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and there are no cities."
}

Get("/?color=blue&city=Chicago") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the city is Chicago."
}

Get("/?color=blue&city=Chicago&city=Boston") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the cities are Boston, Chicago."
}
```

### Example 12: CSV parameter

```scala
val route =
  parameter("names".as(CsvSeq[String])) { names =>
    complete(s"The parameters are ${names.mkString(", ")}")
  }

// tests:
Get("/?names=") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are "
}
Get("/?names=Caplin") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are Caplin"
}
Get("/?names=Caplin,John") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are Caplin, John"
}
Get("/?names=Caplin,John,") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are Caplin, John, "
}
```

### Example 13: Repeated, deserialized parameter

```scala
val route =
  parameters("color", "distance".as[Int].repeated) { (color, distances) =>
    distances.toList match {
      case Nil             => complete(s"The color is '$color' and there are no distances.")
      case distance :: Nil => complete(s"The color is '$color' and the distance is $distance.")
      case multiple        => complete(s"The color is '$color' and the distances are ${multiple.mkString(", ")}.")
    }
  }

// tests:
Get("/?color=blue") ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and there are no distances."
}

Get("/?color=blue&distance=5") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the distance is 5."
}

Get("/?color=blue&distance=5&distance=14") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "The color is 'blue' and the distances are 14, 5."
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MalformedQueryParamRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/unmarshalling/Unmarshaller.html
- https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/case-class-extraction.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameter.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterMap.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameters.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameters.html)*