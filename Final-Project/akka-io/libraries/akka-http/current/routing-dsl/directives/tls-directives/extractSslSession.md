---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:14Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/extractSslSession.html
title: extractSslSession • Akka HTTP
---

# extractSslSession • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractSslSession

## Signature

```
def extractSslSession: Directive1[SSLSession]
```

## Description

This directive extracts the SSL session for the client/connection where the request was made. 

Note
Using this directive requires tls\-session info parsing to be enabled: `akka.http.server.parsing.tls-session-info-header = on`

## Code Examples

### Example 1: Signature

```scala
def extractSslSession: Directive1[SSLSession]
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/extractClientCertificate.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/requireClientCertificateIdentity.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/extractSslSession.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/extractSslSession.html)*