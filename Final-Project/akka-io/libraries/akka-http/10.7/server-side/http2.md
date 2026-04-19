---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/server-side/http2.html
title: Server-Side HTTP/2 • Akka HTTP
---

# Server-Side HTTP/2 • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Server\-Side HTTP/2

## Enable HTTP/2 support

HTTP/2 can then be enabled through configuration:

```
akka.http.server.enable-http2 = on

```

## Use `newServerAt(...).bind()` and HTTPS

HTTP/2 is primarily used over a secure HTTPS connection which takes care of protocol negotiation and falling back to HTTP/1\.1 over TLS when the client does not support HTTP/2\. See the [HTTPS section](server-https-support.html) for how to set up HTTPS.

You can use [`Http().newServerAt(...).bind()`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ServerBuilder.html "akka.http.scaladsl.ServerBuilder")[`Http().get(system).newServerAt(...).bind()`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBuilder.html "akka.http.javadsl.ServerBuilder") as long as you followed the above steps:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/Http2Spec.scala#L11-L41 "Go to snippet source")import scala.concurrent.Future

import akka.http.scaladsl.HttpsConnectionContext
import akka.http.scaladsl.Http
Http().newServerAt(interface = "localhost", port = 8443).enableHttps(httpsServerContext).bind(asyncHandler)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/Http2Test.java#L27-L44 "Go to snippet source")import akka.http.javadsl.Http;

Http.get(system)
  .newServerAt("127.0.0.1", 8443)
  .enableHttps(httpsConnectionContext)
  .bind(asyncHandler);
```

Note that currently only `newServerAt(...).bind` and `newServerAt(...).bindSync` support HTTP/2 but not `bindFlow` or `connectionSource(): Source`.

HTTP/2 over TLS needs [Application\-Layer Protocol Negotiation (ALPN)](https://en.wikipedia.org/wiki/Application-Layer_Protocol_Negotiation) to negotiate whether both client and server support HTTP/2\. The JVM provides ALPN support starting from JDK 8u252\. Make sure to use at least that version.

### HTTP/2 without HTTPS

While un\-encrypted connections are allowed by HTTP/2, this is [sometimes discouraged](https://http2.github.io/faq/#does-http2-require-encryption).

There are 2 ways to implement un\-encrypted HTTP/2 connections: by using the [HTTP Upgrade mechanism](https://httpwg.org/specs/rfc7540.html#discover-http) or by starting communication in HTTP/2 directly which requires the client to have [Prior Knowledge](https://httpwg.org/specs/rfc7540.html#known-http) of HTTP/2 support.

We support both approaches transparently on the same port. This feature is automatically enabled when HTTP/2 is enabled:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/Http2Spec.scala#L20-L52 "Go to snippet source")import akka.http.scaladsl.Http
import akka.http.scaladsl.HttpConnectionContext

Http().newServerAt("localhost", 8080).bind(handler)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/Http2Test.java#L27-L50 "Go to snippet source")import akka.http.javadsl.Http;

Http.get(system)
  .newServerAt("127.0.0.1", 8443)
  .bind(asyncHandler);
```

#### h2c Upgrade

The advantage of switching from HTTP/1\.1 to HTTP/2 using the [HTTP Upgrade mechanism](https://httpwg.org/specs/rfc7540.html#discover-http) is that both HTTP/1\.1 and HTTP/2 clients can connect to the server on the same port, without being aware beforehand which protocol the server supports.

The disadvantage is that relatively few clients support switching to HTTP/2 in this way. Additionally, HTTP/2 communication cannot start until the first request has been completely sent. This means if your first request may be large, it might be worth it to start with an empty OPTIONS request to switch to HTTP/2 before sending your first ‘real’ request, at the cost of a roundtrip.

#### h2c with prior knowledge

The other option is to connect and start communicating in HTTP/2 immediately. The downside of this approach is the client must know beforehand that the server supports HTTP/2\. For the reason this approach is known as h2c with [Prior Knowledge](https://httpwg.org/specs/rfc7540.html#known-http) of HTTP/2 support.

## Trailing headers

Like in the [HTTP/1\.1 ‘Chunked’ transfer encoding](https://datatracker.ietf.org/doc/html/rfc7230#section-4.1.2), HTTP/2 supports a [trailer part](https://httpwg.org/specs/rfc7540.html#rfc.section.8.1) containing headers after the body. Akka HTTP currently doesn’t expose the trailing headers of the request. For the response, you can either model the trailing headers as the [`HttpEntity.LastChunk`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$LastChunk.html "akka.http.scaladsl.model.HttpEntity.LastChunk")last chunk of a [`HttpEntity.Chunked`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Chunked.html "akka.http.scaladsl.model.HttpEntity.Chunked")chunked response entity, or use the [`trailer`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/AttributeKeys.html "akka.http.javadsl.model.AttributeKeys")[`trailer`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKeys$.html "akka.http.scaladsl.model.AttributeKeys") attribute:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/Http2Spec.scala#L67-L75 "Go to snippet source")import akka.http.scaladsl.model.ContentTypes
import akka.http.scaladsl.model.HttpEntity
import akka.http.scaladsl.model.Trailer
import akka.http.scaladsl.model.AttributeKeys.trailer
import akka.http.scaladsl.model.headers.RawHeader
import akka.util.ByteString

HttpResponse(StatusCodes.OK, entity = HttpEntity.Strict(ContentTypes.`text/plain(UTF-8)`, ByteString("Tralala")))
  .addAttribute(trailer, Trailer(RawHeader("name", "value")))
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/Http2Test.java#L13-L70 "Go to snippet source")import akka.http.javadsl.model.Trailer;
import akka.http.javadsl.model.headers.RawHeader;
import static akka.http.javadsl.model.AttributeKeys.trailer;

HttpResponse.create()
        .withStatus(200)
        .addAttribute(trailer, Trailer.create().addHeader(RawHeader.create("name", "value")));
```

Having both a `trailingHeaders` attribute and a `LastChunk` element is not supported.

## Testing with cURL

At this point you should be able to connect, but HTTP/2 may still not be available.

You’ll need a recent version of [cURL](https://curl.haxx.se/) compiled with HTTP/2 support (for OSX see [this article](https://simonecarletti.com/blog/2016/01/http2-curl-macosx/)). You can check whether your version supports HTTP2 with `curl --version`, look for the nghttp2 extension and the HTTP2 feature:

```
curl 7.52.1 (x86_64-pc-linux-gnu) libcurl/7.52.1 OpenSSL/1.0.2l zlib/1.2.8 libidn2/0.16 libpsl/0.17.0 (+libidn2/0.16) libssh2/1.8.0 nghttp2/1.23.1 librtmp/2.3
Protocols: dict file ftp ftps gopher http https imap imaps ldap ldaps pop3 pop3s rtmp rtsp scp sftp smb smbs smtp smtps telnet tftp
Features: AsynchDNS IDN IPv6 Largefile GSS-API Kerberos SPNEGO NTLM NTLM_WB SSL libz TLS-SRP HTTP2 UnixSockets HTTPS-proxy PSL

```

When you connect to your service you may now see something like:

```
$ curl -k -v https://localhost:8443
(...)
* ALPN, offering h2
* ALPN, offering http/1.1
(...)
* ALPN, server accepted to use h2
(...)
> GET / HTTP/1.1
(...)
< HTTP/2 200
(...)

```

If your curl output looks like above, you have successfully configured HTTP/2\. However, on JDKs up to version 9, it is likely to look like this instead:

```
$ curl -k -v https://localhost:8443
(...)
* ALPN, offering h2
* ALPN, offering http/1.1
(...)
* ALPN, server did not agree to a protocol
(...)
> GET / HTTP/1.1
(...)
< HTTP/1.1 200 OK
(...)

```

This shows `curl` declaring it is ready to speak `h2` (the shorthand name of HTTP/2\), but could not determine whether the server is ready to, so it fell back to HTTP/1\.1\. To make this negotiation work you’ll have to configure ALPN as described below.

## Code Examples

### Example 1: Enable HTTP/2 support

```text
akka.http.server.enable-http2 = on
```

### Example 2: UsenewServerAt(...).bind()and HTTPS

```scala
import scala.concurrent.Future

import akka.http.scaladsl.HttpsConnectionContext
import akka.http.scaladsl.Http
Http().newServerAt(interface = "localhost", port = 8443).enableHttps(httpsServerContext).bind(asyncHandler)
```

### Example 3: UsenewServerAt(...).bind()and HTTPS

```java
import akka.http.javadsl.Http;

Http.get(system)
  .newServerAt("127.0.0.1", 8443)
  .enableHttps(httpsConnectionContext)
  .bind(asyncHandler);
```

### Example 4: HTTP/2 without HTTPS

```scala
import akka.http.scaladsl.Http
import akka.http.scaladsl.HttpConnectionContext

Http().newServerAt("localhost", 8080).bind(handler)
```

### Example 5: HTTP/2 without HTTPS

```java
import akka.http.javadsl.Http;

Http.get(system)
  .newServerAt("127.0.0.1", 8443)
  .bind(asyncHandler);
```

### Example 6: Trailing headers

```scala
import akka.http.scaladsl.model.ContentTypes
import akka.http.scaladsl.model.HttpEntity
import akka.http.scaladsl.model.Trailer
import akka.http.scaladsl.model.AttributeKeys.trailer
import akka.http.scaladsl.model.headers.RawHeader
import akka.util.ByteString

HttpResponse(StatusCodes.OK, entity = HttpEntity.Strict(ContentTypes.`text/plain(UTF-8)`, ByteString("Tralala")))
  .addAttribute(trailer, Trailer(RawHeader("name", "value")))
```

### Example 7: Trailing headers

```java
import akka.http.javadsl.model.Trailer;
import akka.http.javadsl.model.headers.RawHeader;
import static akka.http.javadsl.model.AttributeKeys.trailer;

HttpResponse.create()
        .withStatus(200)
        .addAttribute(trailer, Trailer.create().addHeader(RawHeader.create("name", "value")));
```

### Example 8: Testing with cURL

```text
curl 7.52.1 (x86_64-pc-linux-gnu) libcurl/7.52.1 OpenSSL/1.0.2l zlib/1.2.8 libidn2/0.16 libpsl/0.17.0 (+libidn2/0.16) libssh2/1.8.0 nghttp2/1.23.1 librtmp/2.3
Protocols: dict file ftp ftps gopher http https imap imaps ldap ldaps pop3 pop3s rtmp rtsp scp sftp smb smbs smtp smtps telnet tftp
Features: AsynchDNS IDN IPv6 Largefile GSS-API Kerberos SPNEGO NTLM NTLM_WB SSL libz TLS-SRP HTTP2 UnixSockets HTTPS-proxy PSL
```

### Example 9: Testing with cURL

```text
$ curl -k -v https://localhost:8443
(...)
* ALPN, offering h2
* ALPN, offering http/1.1
(...)
* ALPN, server accepted to use h2
(...)
> GET / HTTP/1.1
(...)
< HTTP/2 200
(...)
```

### Example 10: Testing with cURL

```text
$ curl -k -v https://localhost:8443
(...)
* ALPN, offering h2
* ALPN, offering http/1.1
(...)
* ALPN, server did not agree to a protocol
(...)
> GET / HTTP/1.1
(...)
< HTTP/1.1 200 OK
(...)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ServerBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$Chunked.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity$$LastChunk.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBuilder.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/AttributeKeys.html
- https://doc.akka.io/libraries/akka-http/10.7/client-side/index.html
- https://doc.akka.io/libraries/akka-http/10.7/server-side/graceful-termination.html
- https://doc.akka.io/libraries/akka-http/10.7/server-side/server-https-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/10.7/server-side/http2.html](https://doc.akka.io/libraries/akka-http/10.7/server-side/http2.html)*