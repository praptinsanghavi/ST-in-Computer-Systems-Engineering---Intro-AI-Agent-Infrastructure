---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/native-image.html
title: 9. Building Native Images • Akka HTTP
---

# 9. Building Native Images • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# 9\. Building Native Images

Building native images with Akka HTTP is supported.

For details about building native images with Akka in general, see the [Akka Documentation](https://doc.akka.io/libraries/akka-core/2.10/additional/native-image.html)

Most built\-in features in Akka HTTP can be used as is, however some require additional metadata for reflective access to work.

## Unsupported features

The following features cannot be used in native image apps:

- Testkits

## Features requiring additional metadata

In general, any feature that allows a custom implementation provided by a third party library or user code that is then plugged into Akka HTTP through an entry in the application config file needs to have reflection metadata explicitly added as described in the [GraalVM docs here](https://www.graalvm.org/latest/reference-manual/native-image/metadata/).

## Marshalling

### Akka HTTP Spray JSON

If using Akka HTTP Spray JSON for marshalling via the `jsonFormatN` factories for `RootJsonFormat` (or corresponding \`\`) to automatically choose JSON field names from the class field names each such class will need a reflect\-config metadata entry in your application like this:

```
 {
    "name":"com.example.MyClass",
    "allDeclaredFields":true,
    "queryAllPublicMethods":true
  }

```

An alternative is to use the `jsonFormat` factories where field names are explicitly passed as parameters, such formats should not need any reflection metadata.

### Akka HTTP Jackson

If using Akka HTTP Jackson for marshalling, each application class used for marshalling to JSON and unmarshalling from JSON needs a reflect\-config entry in your application like this:

```
  {
    "name":"com.example.MyClass",
    "allDeclaredConstructors" : true,
    "allPublicConstructors" : true,
    "allDeclaredMethods" : true,
    "allPublicMethods" : true,
    "allDeclaredFields" : true,
    "allPublicFields" : true
  }

```

## Custom parsing error handler

If defining a custom [`ParsingErrorHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/ParsingErrorHandler.html "akka.http.ParsingErrorHandler")[`ParsingErrorHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/ParsingErrorHandler.html "akka.http.ParsingErrorHandler") through the config `akka.http.server.parsing.error-handler` the error handler implementation needs a reflection metadata entry allowing class lookup and construction via a no\-parameter constructor.

## Code Examples

### Example 1: Akka HTTP Spray JSON

```json
{
    "name":"com.example.MyClass",
    "allDeclaredFields":true,
    "queryAllPublicMethods":true
  }
```

### Example 2: Akka HTTP Jackson

```json
{
    "name":"com.example.MyClass",
    "allDeclaredConstructors" : true,
    "allPublicConstructors" : true,
    "allDeclaredMethods" : true,
    "allPublicMethods" : true,
    "allDeclaredFields" : true,
    "allPublicFields" : true
  }
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/ParsingErrorHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/ParsingErrorHandler.html
- https://doc.akka.io/libraries/akka-core/2.10/additional/native-image.html
- https://doc.akka.io/libraries/akka-http/current/contributing.html
- https://doc.akka.io/libraries/akka-http/current/implications-of-streaming-http-entity.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/native-image.html](https://doc.akka.io/libraries/akka-http/current/native-image.html)*