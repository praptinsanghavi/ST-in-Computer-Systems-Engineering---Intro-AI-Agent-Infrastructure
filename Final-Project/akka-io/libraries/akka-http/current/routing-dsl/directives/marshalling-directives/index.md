---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:20Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/index.html
title: Marshalling Directives • Akka HTTP
---

# Marshalling Directives • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Marshalling Directives

Marshalling directives work in conjunction with `akka.http.scaladsl.marshalling` and `akka.http.scaladsl.unmarshalling` to convert a request entity to a specific type or a type to a response.

See [marshalling](../../../common/marshalling.html) and [unmarshalling](../../../common/unmarshalling.html) for specific serialization (also known as pickling) guidance.

Marshalling directives usually rely on an in\-scope implicit marshaller to handle conversion. 

## Understanding Specific Marshalling Directives

| directive | behavior |
| --- | --- |
| [completeWith](completeWith.html) | Uses a marshaller for a given type to produce a completion function for an inner route. Used in conjunction with *instanceOf* to format responses. |
| [entity](entity.html) | Unmarshalls the request entity to the given type and passes it to its inner route. Used in conjunction with *as* to convert requests to objects. |
| [handleWith](handleWith.html) | Completes a request with a given function, using an in\-scope unmarshaller for an input and in\-scope marshaller for the output. |

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/common/marshalling.html
- https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/jwt-directives/jwt.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/completeWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/entity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/handleWith.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/index.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/marshalling-directives/index.html)*