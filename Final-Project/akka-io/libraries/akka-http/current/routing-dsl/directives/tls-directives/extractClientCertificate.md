---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/extractClientCertificate.html
title: extractClientCertificate • Akka HTTP
---

# extractClientCertificate • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractClientCertificate

## Signature

```
def extractClientCertificate: Directive1[X509Certificate]
```

## Description

This directive extracts the client certificate for the client mTLS connection where the request was made.

If there is no client trusted certificate present (can only happen with `setWantClientAuth(true)`) the request is rejected with a [`TlsClientUnverifiedRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TlsClientUnverifiedRejection.html "akka.http.javadsl.server.TlsClientUnverifiedRejection")[`TlsClientUnverifiedRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TlsClientUnverifiedRejection.html "akka.http.scaladsl.server.TlsClientUnverifiedRejection").

Note
Using this directive requires tls\-session info parsing to be enabled: `akka.http.server.parsing.tls-session-info-header = on` and that the server ConnectionContext SSLEngine was set up with either `setWantClientAuth(true)` or `setNeedClientAuth(true)`

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/server/directives/TlsDirectiveSpec.scala#L49-L52 "Go to snippet source")path("client-cert") {
  extractClientCertificate { clientCert =>
    complete(clientCert.getSubjectX500Principal.getName)
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/TlsDirectivesExamplesTest.java#L14-L16 "Go to snippet source")final Route route = extractClientCertificate(certificate ->
        complete(certificate.getSubjectX500Principal().getName())
);
```

## Code Examples

### Example 1: Signature

```scala
def extractClientCertificate: Directive1[X509Certificate]
```

### Example 2: Example

```scala
path("client-cert") {
  extractClientCertificate { clientCert =>
    complete(clientCert.getSubjectX500Principal.getName)
  }
```

### Example 3: Example

```java
final Route route = extractClientCertificate(certificate ->
        complete(certificate.getSubjectX500Principal().getName())
);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TlsClientUnverifiedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TlsClientUnverifiedRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/extractSslSession.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/extractClientCertificate.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/extractClientCertificate.html)*