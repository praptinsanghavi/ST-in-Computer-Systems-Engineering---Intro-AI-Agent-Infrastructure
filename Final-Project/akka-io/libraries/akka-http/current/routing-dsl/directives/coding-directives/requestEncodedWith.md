---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/requestEncodedWith.html
title: requestEncodedWith • Akka HTTP
---

# requestEncodedWith • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# requestEncodedWith

## Signature

```
def requestEncodedWith(encoding: HttpEncoding): Directive0
```

## Description

Passes the request to the inner route if the request is encoded with the argument encoding. Otherwise, rejects the request with an `UnacceptedRequestEncodingRejection(encoding)`.

This directive is the building block for [decodeRequest](decodeRequest.html) to reject unsupported encodings.

## Code Examples

### Example 1: Signature

```scala
def requestEncodedWith(encoding: HttpEncoding): Directive0
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/decodeRequest.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/encodeResponseWith.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/responseEncodingAccepted.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/requestEncodedWith.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/coding-directives/requestEncodedWith.html)*