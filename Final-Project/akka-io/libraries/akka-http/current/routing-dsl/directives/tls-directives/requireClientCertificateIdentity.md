---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/requireClientCertificateIdentity.html
title: requireClientCertificateIdentity • Akka HTTP
---

# requireClientCertificateIdentity • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# requireClientCertificateIdentity

## Signature

```
def requireClientCertificateIdentity(cnRegex: Regex): Directive0
```

## Description

This directive allows for matching a regular expression against the identity of a client mTLS certificate. 

Require the client to be authenticated, if not reject the request with a [`TlsClientUnverifiedRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TlsClientUnverifiedRejection.html "akka.http.javadsl.server.TlsClientUnverifiedRejection")[`TlsClientUnverifiedRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TlsClientUnverifiedRejection.html "akka.http.scaladsl.server.TlsClientUnverifiedRejection"), (can only happen with `setWantClientAuth(true)`, if `setNeedClientAuth(true)` the connection is denied earlier), also require that one of the client certificate `ip` or `dns` SANs (Subject Alternative Name) or if non exists, the CN (Common Name) to match the given regular expression, if not the request is rejected with a [`TlsClientIdentityRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TlsClientIdentityRejection.html "akka.http.javadsl.server.TlsClientIdentityRejection")[`TlsClientIdentityRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TlsClientIdentityRejection.html "akka.http.scaladsl.server.TlsClientIdentityRejection").

Note
Using this directive requires tls\-session info parsing to be enabled: `akka.http.server.parsing.tls-session-info-header = on` and that the server ConnectionContext SSLEngine was set up with either `setWantClientAuth(true)` or `setNeedClientAuth(true)`

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/server/directives/TlsDirectiveSpec.scala#L58-L60 "Go to snippet source")requireClientCertificateIdentity(".*client1".r) {
  complete("OK")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/TlsDirectivesExamplesTest.java#L23-L25 "Go to snippet source")final Route route = requireClientCertificateIdentity(".*client1", () ->
        complete("OK")
);
```

## Code Examples

### Example 1: Signature

```scala
def requireClientCertificateIdentity(cnRegex: Regex): Directive0
```

### Example 2: Example

```scala
requireClientCertificateIdentity(".*client1".r) {
  complete("OK")
}
```

### Example 3: Example

```java
final Route route = requireClientCertificateIdentity(".*client1", () ->
        complete("OK")
);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TlsClientIdentityRejection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/TlsClientUnverifiedRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TlsClientIdentityRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/TlsClientUnverifiedRejection.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/custom-directives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/extractSslSession.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/requireClientCertificateIdentity.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/tls-directives/requireClientCertificateIdentity.html)*