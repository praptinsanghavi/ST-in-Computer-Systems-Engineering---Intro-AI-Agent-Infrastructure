---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:41Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/case-class-extraction.html
title: Case Class Extraction • Akka HTTP
---

# Case Class Extraction • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

This section is only relevant when using the Scala API

# Case Class Extraction

The value extraction performed by [Directives](directives/index.html) is a nice way of providing your route logic with interesting request properties, all with proper type\-safety and error handling. However, in some case you might want even more. Consider this example:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/CaseClassExtractionExamplesSpec.scala#L14-L23 "Go to snippet source")case class Color(red: Int, green: Int, blue: Int)

val route =
  path("color") {
    parameters("red".as[Int], "green".as[Int], "blue".as[Int]) { (red, green, blue) =>
      val color = Color(red, green, blue)
      // ... route working with the `color` instance
    }
  }
```

Here the [parameters](directives/parameter-directives/parameters.html) directives is employed to extract three `Int` values, which are then used to construct an instance of the `Color` case class. So far so good. However, if the model classes we’d like to work with have more than just a few parameters the overhead introduced by capturing the arguments as extractions only to feed them into the model class constructor directly afterwards can somewhat clutter up your route definitions.

If your model classes are case classes, as in our example, Akka HTTP supports an even shorter and more concise syntax. You can also write the example above like this:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/CaseClassExtractionExamplesSpec.scala#L31-L39 "Go to snippet source")case class Color(red: Int, green: Int, blue: Int)

val route =
  path("color") {
    parameters("red".as[Int], "green".as[Int], "blue".as[Int]).as(Color.apply _) { color =>
      // ... route working with the `color` instance
    }
  }
```

You can postfix any directive with extractions with an `as(...)` call. By simply passing the companion object of your model case class to the `as` modifier method the underlying directive is transformed into an equivalent one, which extracts only one value of the type of your model class. Note that there is no reflection involved and your case class does not have to implement any special interfaces. The only requirement is that the directive you attach the `as` call to produces the right number of extractions, with the right types and in the right order.

If you’d like to construct a case class instance from extractions produced by *several* directives you can first join the directives with the `&` operator before using the `as` call:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/CaseClassExtractionExamplesSpec.scala#L47-L54 "Go to snippet source")case class Color(name: String, red: Int, green: Int, blue: Int)

val route =
  (path("color" / Segment) & parameters("r".as[Int], "g".as[Int], "b".as[Int]))
    .as(Color.apply _) { color =>
      // ... route working with the `color` instance
    }
```

Here the `Color` class has gotten another member, `name`, which is supplied not as a parameter but as a path element. By joining the `path` and `parameters` directives with `&` you create a directive extracting 4 values, which directly fit the member list of the `Color` case class. Therefore you can use the `as` modifier to convert the directive into one extracting only a single `Color` instance.

Generally, when you have routes that work with, say, more than 3 extractions it’s a good idea to introduce a case class for these and resort to case class extraction. Especially since it supports another nice feature: validation.

Caution
There is one quirk to look out for when using case class extraction: If you create an explicit companion object for your case class, no matter whether you actually add any members to it or not, the syntax presented above will not (quite) work anymore. Instead of `as(Color)` you will then have to say `as(Color.apply)`. This behavior appears as if it’s not really intended, so this might be improved in future Scala versions.

## Case Class Validation

In many cases your web service needs to verify input parameters according to some logic before actually working with them. E.g. in the example above the restriction might be that all color component values must be between 0 and 255\. You could get this done with a few [validate](directives/misc-directives/validate.html) directives but this would quickly become cumbersome and hard to read.

If you use case class extraction you can put the verification logic into the constructor of your case class, where it should be:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/CaseClassExtractionExamplesSpec.scala#L60-L65 "Go to snippet source")case class Color(name: String, red: Int, green: Int, blue: Int) {
  require(!name.isEmpty, "color name must not be empty")
  require(0 <= red && red <= 255, "red color component must be between 0 and 255")
  require(0 <= green && green <= 255, "green color component must be between 0 and 255")
  require(0 <= blue && blue <= 255, "blue color component must be between 0 and 255")
}
```

If you write your validations like this Akka HTTP’s case class extraction logic will properly pick up all error messages and generate a [`ValidationRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ValidationRejection.html "akka.http.javadsl.server.ValidationRejection")[`ValidationRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ValidationRejection.html "akka.http.scaladsl.server.ValidationRejection") if something goes wrong. By default, `ValidationRejections` are converted into `400 Bad Request` error response by the default [RejectionHandler](rejections.html#the-rejectionhandler), if no subsequent route successfully handles the request.

## Code Examples

### Example 1: Case Class Extraction

```scala
case class Color(red: Int, green: Int, blue: Int)

val route =
  path("color") {
    parameters("red".as[Int], "green".as[Int], "blue".as[Int]) { (red, green, blue) =>
      val color = Color(red, green, blue)
      // ... route working with the `color` instance
    }
  }
```

### Example 2: Case Class Extraction

```scala
case class Color(red: Int, green: Int, blue: Int)

val route =
  path("color") {
    parameters("red".as[Int], "green".as[Int], "blue".as[Int]).as(Color.apply _) { color =>
      // ... route working with the `color` instance
    }
  }
```

### Example 3: Case Class Extraction

```scala
case class Color(name: String, red: Int, green: Int, blue: Int)

val route =
  (path("color" / Segment) & parameters("r".as[Int], "g".as[Int], "b".as[Int]))
    .as(Color.apply _) { color =>
      // ... route working with the `color` instance
    }
```

### Example 4: Case Class Validation

```scala
case class Color(name: String, red: Int, green: Int, blue: Int) {
  require(!name.isEmpty, "color name must not be empty")
  require(0 <= red && red <= 255, "red color component must be between 0 and 255")
  require(0 <= green && green <= 255, "green color component must be between 0 and 255")
  require(0 <= blue && blue <= 255, "blue color component must be between 0 and 255")
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ValidationRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ValidationRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/validate.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameters.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/rejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/source-streaming-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/case-class-extraction.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/case-class-extraction.html)*