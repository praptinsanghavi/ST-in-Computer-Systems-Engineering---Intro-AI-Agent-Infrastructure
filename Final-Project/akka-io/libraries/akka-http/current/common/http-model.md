---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:12:54Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/common/http-model.html
title: HTTP Model • Akka HTTP
---

# HTTP Model • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# HTTP Model

Akka HTTP model contains a deeply structured, fully immutable, case\-class based model of all the major HTTP data structures, like HTTP requests, responses and common headers. It lives in the *akka\-http\-core* module and forms the basis for most of Akka HTTP’s APIs.

## Overview

Since akka\-http\-core provides the central HTTP data structures you will find the following import in quite a few places around the code base (and probably your own code as well):

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/ModelSpec.scala#L8 "Go to snippet source")import akka.http.scaladsl.model._
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/ModelDocTest.java#L12-L16 "Go to snippet source")import akka.http.javadsl.model.*;
import akka.http.javadsl.model.headers.*;

import java.util.Optional;

```

This brings all of the most relevant types in scope, mainly:

- [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") and [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse"), the central message model
- `headers`, the package containing all the predefined HTTP header models and supporting types
- Supporting types like [`Uri`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html "akka.http.javadsl.model.Uri")[`Uri`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html "akka.http.scaladsl.model.Uri"), [`HttpMethods`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethods.html "akka.http.javadsl.model.HttpMethods")[`HttpMethods`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethods$.html "akka.http.scaladsl.model.HttpMethods"), [`MediaTypes`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html "akka.http.javadsl.model.MediaTypes")[`MediaTypes`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$.html "akka.http.scaladsl.model.MediaTypes"), [`StatusCodes`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCodes.html "akka.http.javadsl.model.StatusCodes")[`StatusCodes`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$.html "akka.http.scaladsl.model.StatusCodes"), etc.

A common pattern is that the model of a certain entity is represented by an immutable type (class or trait), while the actual instances of the entity defined by the HTTP spec live in an accompanying object carrying the name of the type plus a trailing plural ‘s’.

For example:

- Defined [`HttpMethod`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html "akka.http.javadsl.model.HttpMethod")[`HttpMethod`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html "akka.http.scaladsl.model.HttpMethod") instances live inare defined as static fields of the [`HttpMethods`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethods.html "akka.http.javadsl.model.HttpMethods")[`HttpMethods`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethods$.html "akka.http.scaladsl.model.HttpMethods") objectclass.
- Defined [`HttpCharset`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html "akka.http.javadsl.model.HttpCharset")[`HttpCharset`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html "akka.http.scaladsl.model.HttpCharset") instances live inare defined as static fields of the [`HttpCharsets`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsets.html "akka.http.javadsl.model.HttpCharsets")[`HttpCharsets`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsets$.html "akka.http.scaladsl.model.HttpCharsets") objectclass.
- Defined [`HttpEncoding`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html "akka.http.javadsl.model.headers.HttpEncoding")[`HttpEncoding`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncoding.html "akka.http.scaladsl.model.headers.HttpEncoding") instances live inare defined as static fields of the [`HttpEncodings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncodings.html "akka.http.javadsl.model.headers.HttpEncodings")[`HttpEncodings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncodings$.html "akka.http.scaladsl.model.headers.HttpEncodings") objectclass.
- Defined [`HttpProtocol`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocol.html "akka.http.javadsl.model.HttpProtocol")[`HttpProtocol`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocol.html "akka.http.scaladsl.model.HttpProtocol") instances live inare defined as static fields of the [`HttpProtocols`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocols.html "akka.http.javadsl.model.HttpProtocols")[`HttpProtocols`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocols$.html "akka.http.scaladsl.model.HttpProtocols") objectclass.
- Defined [`MediaType`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html "akka.http.javadsl.model.MediaType")[`MediaType`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html "akka.http.scaladsl.model.MediaType") instances live inare defined as static fields of the [`MediaTypes`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html "akka.http.javadsl.model.MediaTypes")[`MediaTypes`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$.html "akka.http.scaladsl.model.MediaTypes") objectclass.
- Defined [`StatusCode`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html "akka.http.javadsl.model.StatusCode")[`StatusCode`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html "akka.http.scaladsl.model.StatusCode") instances live inare defined as static fields of the [`StatusCodes`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCodes.html "akka.http.javadsl.model.StatusCodes")[`StatusCodes`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$.html "akka.http.scaladsl.model.StatusCodes") objectclass.

## HttpRequest

[`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") and [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") are the basic caseimmutable classes representing HTTP messages.

An [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") consists of

- a method (GET, POST, etc.)
- a URI (see [URI model](uri-model.html) for more information)
- a seq of headers
- an entity (body data)
- a protocol

Here are some examples how to construct an [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest"):

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/ModelSpec.scala#L8 "Go to snippet source")import akka.http.scaladsl.model._
import HttpMethods._

// construct a simple GET request to `homeUri`
val homeUri = Uri("/abc")
HttpRequest(GET, uri = homeUri)

// construct simple GET request to "/index" (implicit string to Uri conversion)
HttpRequest(GET, uri = "/index")

// construct simple POST request containing entity
val data = ByteString("abc")
HttpRequest(POST, uri = "/receive", entity = data)

// customize every detail of HTTP request
import HttpProtocols._
import MediaTypes._
import HttpCharsets._
val userData = ByteString("abc")
val authorization = headers.Authorization(BasicHttpCredentials("user", "pass"))
HttpRequest(
  PUT,
  uri = "/user",
  entity = HttpEntity(`text/plain` withCharset `UTF-8`, userData),
  headers = List(authorization),
  protocol = `HTTP/1.0`)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/ModelDocTest.java#L12-L16 "Go to snippet source")import akka.http.javadsl.model.*;
import akka.http.javadsl.model.headers.*;

import java.util.Optional;

// construct a simple GET request to `homeUri`
Uri homeUri = Uri.create("/home");
HttpRequest request1 = HttpRequest.create().withUri(homeUri);

// construct simple GET request to "/index" using helper methods
HttpRequest request2 = HttpRequest.GET("/index");

// construct simple POST request containing entity
ByteString data = ByteString.fromString("abc");
HttpRequest postRequest1 = HttpRequest.POST("/receive").withEntity(data);

// customize every detail of HTTP request
//import HttpProtocols.*
//import MediaTypes.*
Authorization authorization = Authorization.basic("user", "pass");
HttpRequest complexRequest =
    HttpRequest.PUT("/user")
        .withEntity(HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, "abc"))
        .addHeader(authorization)
        .withProtocol(HttpProtocols.HTTP_1_0);
```

All parameters of `HttpRequest.apply` have default values set, so `headers` for example don’t need to be specified if there are none. Many of the parameters types (like [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") and [`Uri`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html "akka.http.javadsl.model.Uri")[`Uri`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html "akka.http.scaladsl.model.Uri")) define implicit conversions for common use cases to simplify the creation of request and response instances.

In its basic form `HttpRequest.create` creates an empty default GET request without headers which can then be transformed using one of the `withX` methods, `addHeader`, or `addHeaders`. Each of those will create a new immutable instance, so instances can be shared freely. There exist some overloads for `HttpRequest.create` that simplify creating requests for common cases. Also, to aid readability, there are predefined alternatives for `create` named after HTTP methods to create a request with a given method and URI directly.

String representation
There are certain environments where it is easy to inadvertently print, write or log entries built out of string representations of [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") instances. On the other hand, it is not uncommon for HTTP headers and entities to contain *Personal Identifying Information (PII)* or *Sensitive Personal Information (SPI)* . 

To avoid accidentally leaking such information, these fields are omitted from [`HttpRequest`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html "akka.http.javadsl.model.HttpRequest")[`HttpRequest`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html "akka.http.scaladsl.model.HttpRequest") `toString` output. 

If needed, it is possible to define a custom string representation including all fields as shown in the following example:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpRequestDetailedStringExampleSpec.scala "Go to snippet source")/*
 * Copyright (C) 2009-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.http.scaladsl.model.{ HttpEntity, HttpRequest }
import akka.http.scaladsl.model.headers.{ Authorization, BasicHttpCredentials }
import akka.testkit.AkkaSpec

import scala.collection.immutable

class HttpRequestDetailedStringExampleSpec extends AkkaSpec {

  // Custom string representation which includes headers
  def toDetailedString(request: HttpRequest): String = {
    import request._
    s"""HttpRequest(${_1},${_2},${_3},${_4},${_5})"""
  }

  "Include headers in custom string representation" in {

    // An HTTP header containing Personal Identifying Information
    val piiHeader = Authorization(BasicHttpCredentials("user", "password"))

    // An HTTP entity containing Personal Identifying Information
    val piiBody: HttpEntity.Strict =
      "This body contains information about [user]"

    val httpRequestWithHeadersAndBody =
      HttpRequest(entity = piiBody, headers = immutable.Seq(piiHeader))

    // Our custom string representation includes body and headers string representations...
    assert(
      toDetailedString(httpRequestWithHeadersAndBody)
        .contains(piiHeader.toString)
    )
    assert(
      toDetailedString(httpRequestWithHeadersAndBody).contains(piiBody.toString)
    )

    // ... while default `toString` doesn't.
    assert(!s"$httpRequestWithHeadersAndBody".contains(piiHeader.unsafeToString))
    assert(!s"$httpRequestWithHeadersAndBody".contains(piiBody.data.utf8String))
  }

}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpRequestDetailedStringExampleTest.java "Go to snippet source")/*
 * Copyright (C) 2009-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.javadsl;

import akka.http.javadsl.model.*;
import akka.http.javadsl.model.headers.Authorization;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class HttpRequestDetailedStringExampleTest {

    // Custom string representation which includes headers
    public String toDetailedString(HttpRequest request) {

        HttpMethod method = request.method();
        Uri uri = request.getUri();
        Iterable<HttpHeader> headers = request.getHeaders();
        RequestEntity entity = request.entity();
        HttpProtocol protocol = request.protocol();

        return String.format("HttpRequest(%s, %s, %s, %s, %s)", method, uri, headers, entity, protocol);
    }

    @Test
    public void headersInCustomStringRepresentation() {

        // An HTTP header containing Personal Identifying Information
        Authorization piiHeader = Authorization.basic("user", "password");

        // An HTTP entity containing Personal Identifying Information
        HttpEntity.Strict piiBody = HttpEntities.create("This body contains information about [user]");

        HttpRequest httpRequestWithHeadersAndBody = HttpRequest.create()
                .withEntity(piiBody)
                .withHeaders(Arrays.asList(piiHeader));

        // Our custom string representation includes body and headers string representations...
        assertTrue(toDetailedString(httpRequestWithHeadersAndBody).contains(piiHeader.toString()));
        assertTrue(toDetailedString(httpRequestWithHeadersAndBody).contains(piiBody.toString()));

        // ... while default `toString` doesn't.
        assertFalse(httpRequestWithHeadersAndBody.toString().contains(piiHeader.unsafeToString()));
        assertFalse(httpRequestWithHeadersAndBody.toString().contains(piiBody.getData().utf8String()));

    }

}
```

### Synthetic Headers

In some cases it may be necessary to deviate from fully RFC\-Compliant behavior. For instance, Amazon S3 treats the `+` character in the path part of the URL as a space, even though the RFC specifies that this behavior should be limited exclusively to the query portion of the URI.

In order to work around these types of edge cases, Akka HTTP provides for the ability to provide extra, non\-standard information to the request via synthetic headers. These headers are not passed to the client but are instead consumed by the request engine and used to override default behavior.

For instance, in order to provide a raw request URI, bypassing the default URL normalization, you could do the following:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/ModelSpec.scala#L120-L121 "Go to snippet source")import akka.http.scaladsl.model.headers.`Raw-Request-URI`
val req = HttpRequest(uri = "/ignored", headers = List(`Raw-Request-URI`("/a/b%2Bc")))
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/ModelDocTest.java#L130-L131 "Go to snippet source")// imports akka.http.javadsl.model.headers.RawRequestURI
HttpRequest.create("/ignored").addHeader(RawRequestURI.create("/a/b%2Bc"));
```

## HttpResponse

An [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") consists of

- a status code
- a `Seq`list of headers
- an entity (body data)
- a protocol

Here are some examples how to construct an [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse"):

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/ModelSpec.scala#L48-L62 "Go to snippet source")import StatusCodes._

// simple OK response without data created using the integer status code
HttpResponse(200)

// 404 response created using the named StatusCode constant
HttpResponse(NotFound)

// 404 response with a body explaining the error
HttpResponse(404, entity = "Unfortunately, the resource couldn't be found.")

// A redirecting response containing an extra header
val locationHeader = headers.Location("http://example.com/other")
HttpResponse(Found, headers = List(locationHeader))

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/ModelDocTest.java#L50-L67 "Go to snippet source")// simple OK response without data created using the integer status code
HttpResponse ok = HttpResponse.create().withStatus(200);

// 404 response created using the named StatusCode constant
HttpResponse notFound = HttpResponse.create().withStatus(StatusCodes.NOT_FOUND);

// 404 response with a body explaining the error
HttpResponse notFoundCustom =
    HttpResponse.create()
        .withStatus(404)
        .withEntity("Unfortunately, the resource couldn't be found.");

// A redirecting response containing an extra header
Location locationHeader = Location.create("http://example.com/other");
HttpResponse redirectResponse =
    HttpResponse.create()
        .withStatus(StatusCodes.FOUND)
        .addHeader(locationHeader);
```

In addition to the simple [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") constructors`HttpEntities.create` methods which create an entity from a fixed `String` or [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString") as shown here the Akka HTTP model defines a number of subclasses of [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") which allow body data to be specified as a stream of bytes. All of these types can be created using the method on `HttpEntites`.

String representation
There are certain environments where it is easy to inadvertently print, write or log entries built out of string representations of [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") instances. On the other hand, it is not uncommon for HTTP headers and entities to contain *Personal Identifying Information (PII)* or *Sensitive Personal Information (SPI)* . 

To avoid accidentally leaking such information, these fields are omitted from [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") `toString` output. 

If needed, it is possible to define a custom string representation including all fields as shown in the following example:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpResponseDetailedStringExampleSpec.scala "Go to snippet source")/*
 * Copyright (C) 2009-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.http.scaladsl.model.{ HttpEntity, HttpResponse }
import akka.http.scaladsl.model.headers.{ Authorization, BasicHttpCredentials }
import akka.testkit.AkkaSpec

import scala.collection.immutable

class HttpResponseDetailedStringExampleSpec extends AkkaSpec {

  // Custom string representation which includes headers
  def toDetailedString(response: HttpResponse): String = {
    import response._
    s"""HttpResponse(${_1},${_2},${_3},${_4})"""
  }

  "Include headers in custom string representation" in {

    // An HTTP header containing Personal Identifying Information
    val piiHeader = Authorization(BasicHttpCredentials("user", "password"))

    // An HTTP entity containing Personal Identifying Information
    val piiBody: HttpEntity.Strict =
      "This body contains information about [user]"

    val httpResponseWithHeadersAndBody =
      HttpResponse(entity = piiBody, headers = immutable.Seq(piiHeader))

    // Our custom string representation includes body and headers string representations...
    assert(
      toDetailedString(httpResponseWithHeadersAndBody)
        .contains(piiHeader.toString)
    )
    assert(
      toDetailedString(httpResponseWithHeadersAndBody)
        .contains(piiBody.toString)
    )

    // ... while default `toString` doesn't.
    assert(!s"$httpResponseWithHeadersAndBody".contains(piiHeader.unsafeToString))
    assert(!s"$httpResponseWithHeadersAndBody".contains(piiBody.data.utf8String))
  }

}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpResponseDetailedStringExampleTest.java "Go to snippet source")/*
 * Copyright (C) 2009-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.javadsl;

import akka.http.javadsl.model.*;
import akka.http.javadsl.model.headers.Authorization;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HttpResponseDetailedStringExampleTest {

    // Custom string representation which includes headers
    public String toDetailedString(HttpResponse response) {

        StatusCode status = response.status();
        Iterable<HttpHeader> headers = response.getHeaders();
        HttpEntity entity = response.entity();
        HttpProtocol protocol = response.protocol();

        return String.format("HttpResponse(%s, %s, %s, %s)", status, headers, entity, protocol);
    }

    @Test
    public void headersInCustomStringRepresentation() {

        // An HTTP header containing Personal Identifying Information
        Authorization piiHeader = Authorization.basic("user", "password");

        // An HTTP entity containing Personal Identifying Information
        HttpEntity.Strict piiBody = HttpEntities.create("This body contains information about [user]");

        HttpResponse httpResponseWithHeadersAndBody = HttpResponse.create()
                .withEntity(piiBody)
                .withHeaders(Arrays.asList(piiHeader));

        // Our custom string representation includes body and headers string representations...
        assertTrue(toDetailedString(httpResponseWithHeadersAndBody).contains(piiHeader.toString()));
        assertTrue(toDetailedString(httpResponseWithHeadersAndBody).contains(piiBody.toString()));

        // ... while default `toString` doesn't.
        assertFalse(httpResponseWithHeadersAndBody.toString().contains(piiHeader.unsafeToString()));
        assertFalse(httpResponseWithHeadersAndBody.toString().contains(piiBody.getData().utf8String()));

    }

}
```

## HttpEntity

An [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") carries the data bytes of a message together with its Content\-Type and, if known, its Content\-Length. In Akka HTTP there are five different kinds of entities which model the various ways that message content can be received or sent:

HttpEntity.StrictHttpEntityStrict

The simplest entity, which is used when all the entity are already available in memory. It wraps a plain [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString") and represents a standard, unchunked entity with a known `Content-Length`.
HttpEntity.DefaultHttpEntityDefault

The general, unchunked HTTP/1\.1 message entity. It has a known length and presents its data as a [`Source<ByteString, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ByteString, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") which can be only materialized once. It is an error if the provided source doesn’t produce exactly as many bytes as specified. The distinction of `Strict``HttpEntityStrict` and `Default``HttpEntityDefault` is an API\-only one. On the wire, both kinds of entities look the same.
HttpEntity.ChunkedHttpEntityChunked

The model for HTTP/1\.1 [chunked content](https://datatracker.ietf.org/doc/html/rfc7230#section-4.1) (i.e. sent with `Transfer-Encoding: chunked`). The content length is unknown and the individual chunks are presented as a `Source[HttpEntity.ChunkStreamPart]`[`Source<ChunkStreamPart, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ChunkStreamPart, ?]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"). A `ChunkStreamPart` is either a non\-empty `Chunk`chunk or a `LastChunk`the empty last chunk containing optional trailer headers. The stream consists of zero or more `Chunked`non\-empty chunks parts and can be terminated by an optional `LastChunk` partlast chunk.
HttpEntity.CloseDelimitedHttpEntityCloseDelimited

An unchunked entity of unknown length that is implicitly delimited by closing the connection (`Connection: close`). The content data are presented as a [`Source<ByteString, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ByteString, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"). Since the connection must be closed after sending an entity of this type it can only be used on the server\-side for sending a response. Also, the main purpose of `CloseDelimited` entities is compatibility with HTTP/1\.0 peers, which do not support chunked transfer encoding. If you are building a new application and are not constrained by legacy requirements you shouldn’t rely on `CloseDelimited` entities, since implicit terminate\-by\-connection\-close is not a robust way of signaling response end, especially in the presence of proxies. Additionally this type of entity prevents connection reuse which can seriously degrade performance. Use `HttpEntity.Chunked``HttpEntityChunked` instead!
HttpEntity.IndefiniteLengthHttpEntityIndefiniteLength

A streaming entity of unspecified length for use in a `Multipart.BodyPart`.

Entity types `Strict``HttpEntityStrict`, `Default``HttpEntityDefault`, and `Chunked``HttpEntityChunked` are a subtype of `HttpEntity.Regular`[`RequestEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html "akka.http.javadsl.model.RequestEntity")[`RequestEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html "akka.http.scaladsl.model.RequestEntity") which allows to use them for requests and responses. In contrast, `HttpEntity.CloseDelimited``HttpEntityCloseDelimited` can only be used for responses.

Streaming entity types (i.e. all but `Strict``HttpEntityStrict`) cannot be shared or serialized. To create a strict, shareable copy of an entity or message use `HttpEntity.toStrict` or `HttpMessage.toStrict` which returns a `Future``CompletionStage` of the object with the body data collected into a [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString").

The [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") companion objectclass `HttpEntities` contains several helper constructorsstatic methods to create entities from common types easily.

You can pattern match overuse the subtypes`isX` methods of [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") to find out of which subclass an entity is if you want to provide special handling for each of the subtypes. However, in many cases a recipient of an [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") doesn’t care about of which subtype an entity is (and how data is transported exactly on the HTTP layer). Therefore, the general method `HttpEntity.dataBytes``HttpEntity.getDataBytes()` is provided which returns a [`Source<ByteString, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[ByteString, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that allows access to the data of an entity regardless of its concrete subtype.

When to use which subtype?
- Use `Strict``HttpEntityStrict` if the amount of data is “small” and already available in memory (e.g. as a `String` or [`ByteString`](https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka/2.10/akka/util/ByteString.html "akka.util.ByteString"))
- Use `Default``HttpEntityDefault` if the data is generated by a streaming data source and the size of the data is known
- Use `Chunked``HttpEntityChunked` for an entity of unknown length
- Use `CloseDelimited``HttpEntityCloseDelimited` for a response as a legacy alternative to `Chunked``HttpEntityChunked` if the client doesn’t support chunked transfer encoding. Otherwise use `Chunked``HttpEntityChunked`!
- In a `Multipart.BodyPart` use `IndefiniteLength``HttpEntityIndefiniteLength` for content of unknown length.
Caution
When you receive a non\-strict message from a connection then additional data are only read from the network when you request them by consuming the entity data stream. This means that, if you *don’t* consume the entity stream then the connection will effectively be stalled. In particular no subsequent message (request or response) will be read from the connection as the entity of the current message “blocks” the stream. Therefore you must make sure that you always consume the entity data, even in the case that you are not actually interested in it!

### Limiting message entity length

All message entities that Akka HTTP reads from the network automatically get a length verification check attached to them. This check makes sure that the total entity size is less than or equal to the configured `max-content-length` [\[1]](#1), which is an important defense against certain Denial\-of\-Service attacks. However, a single global limit for all requests (or responses) is often too inflexible for applications that need to allow large limits for *some* requests (or responses) but want to clamp down on all messages not belonging into that group.

In order to give you maximum flexibility in defining entity size limits according to your needs the [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity") features a `withSizeLimit` method, which lets you adjust the globally configured maximum size for this particular entity, be it to increase or decrease any previously set value. This means that your application will receive all requests (or responses) from the HTTP layer, even the ones whose `Content-Length` exceeds the configured limit (because you might want to increase the limit yourself). Only when the actual data stream [`Source`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") contained in the entity is materialized will the boundary checks be actually applied. In case the length verification fails the respective stream will be terminated with an `EntityStreamSizeException` either directly at materialization time (if the `Content-Length` is known) or whenever more data bytes than allowed have been read.

When called on `Strict` entities the `withSizeLimit` method will return the entity itself if the length is within the bound, otherwise a `Default` entity with a single element data stream. This allows for potential refinement of the entity size limit at a later point (before materialization of the data stream).

By default all message entities produced by the HTTP layer automatically carry the limit that is defined in the application’s `max-content-length` config setting. If the entity is transformed in a way that changes the content\-length and then another limit is applied then this new limit will be evaluated against the new content\-length. If the entity is transformed in a way that changes the content\-length and no new limit is applied then the previous limit will be applied against the previous content\-length. Generally this behavior should be in line with your expectations.

> [\[1]](#^1) *akka.http.parsing.max\-content\-length* (applying to server\- as well as client\-side), *akka.http.server.parsing.max\-content\-length* (server\-side only), *akka.http.client.parsing.max\-content\-length* (client\-side only) or *akka.http.host\-connection\-pool.client.parsing.max\-content\-length* (only host\-connection\-pools)

### Special processing for HEAD requests

[RFC 7230](https://datatracker.ietf.org/doc/html/rfc7230#section-3.3.3) defines very clear rules for the entity length of HTTP messages.

Especially this rule requires special treatment in Akka HTTP:

> Any response to a HEAD request and any response with a 1xx (Informational), 204 (No Content), or 304 (Not Modified) status code is always terminated by the first empty line after the header fields, regardless of the header fields present in the message, and thus cannot contain a message body.

Responses to HEAD requests introduce the complexity that *Content\-Length* or *Transfer\-Encoding* headers can be present but the entity is empty. This is modeled by allowing *HttpEntity.Default**HttpEntityDefault* and *HttpEntity.Chunked**HttpEntityChunked* to be used for HEAD responses with an empty data stream.

Also, when a HEAD response has an *HttpEntity.CloseDelimited**HttpEntityCloseDelimited* entity the Akka HTTP implementation will *not* close the connection after the response has been sent. This allows the sending of HEAD responses without *Content\-Length* header across persistent HTTP connections.

## Header Model

Akka HTTP contains a rich model of the most common HTTP headers. Parsing and rendering is done automatically so that applications don’t need to care for the actual syntax of headers. Headers not modelled explicitly are represented as a [`RawHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RawHeader.html "akka.http.javadsl.model.headers.RawHeader")[`RawHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/RawHeader.html "akka.http.scaladsl.model.headers.RawHeader"), which is essentially a String/String name/value pair.

See these examples of how to deal with headers:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/ModelSpec.scala#L68-L83 "Go to snippet source")import akka.http.scaladsl.model.headers._

// create a ``Location`` header
val loc = Location("http://example.com/other")

// create an ``Authorization`` header with HTTP Basic authentication data
val auth = Authorization(BasicHttpCredentials("joe", "josepp"))

// custom type
case class User(name: String, pass: String)

// a method that extracts basic HTTP credentials from a request
def credentialsOfRequest(req: HttpRequest): Option[User] =
  for {
    case Authorization(BasicHttpCredentials(user, pass)) <- req.header[Authorization]
  } yield User(user, pass)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/ModelDocTest.java#L74-L91 "Go to snippet source")        // create a ``Location`` header
        Location locationHeader = Location.create("http://example.com/other");

        // create an ``Authorization`` header with HTTP Basic authentication data
        Authorization authorization = Authorization.basic("user", "pass");

    // a method that extracts basic HTTP credentials from a request
	private Optional<BasicHttpCredentials> getCredentialsOfRequest(HttpRequest request) {
        Optional<Authorization> auth = request.getHeader(Authorization.class);
        if (auth.isPresent() && auth.get().credentials() instanceof BasicHttpCredentials)
            return Optional.of((BasicHttpCredentials) auth.get().credentials());
        else
            return Optional.empty();
    }
```

## HTTP Headers

When the Akka HTTP server receives an HTTP request it tries to parse all its headers into their respective model classes. Independently of whether this succeeds or not, the HTTP layer will always pass on all received headers to the application. Unknown headers as well as ones with invalid syntax (according to the header parser) will be made available as [`RawHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RawHeader.html "akka.http.javadsl.model.headers.RawHeader")[`RawHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/RawHeader.html "akka.http.scaladsl.model.headers.RawHeader") instances. For the ones exhibiting parsing errors a warning message is logged depending on the value of the `illegal-header-warnings` config setting.

Some headers have special status in HTTP and are therefore treated differently from “regular” headers:

Content\-Type
 
The Content\-Type of an HTTP message is modeled as the `contentType` field of the [`HttpEntity`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html "akka.http.javadsl.model.HttpEntity")[`HttpEntity`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html "akka.http.scaladsl.model.HttpEntity"). The `Content-Type` header therefore doesn’t appear in the `headers` sequence of a message. Also, a `Content-Type` header instance that is explicitly added to the `headers` of a request or response will not be rendered onto the wire and trigger a warning being logged instead!
Transfer\-Encoding
 
Messages with `Transfer-Encoding: chunked` are represented via the `HttpEntity.Chunked`as a `HttpEntityChunked` entity. As such chunked messages that do not have another deeper nested transfer encoding will not have a `Transfer-Encoding` header in their `headers` sequencelist. Similarly, a `Transfer-Encoding` header instance that is explicitly added to the `headers` of a request or response will not be rendered onto the wire and trigger a warning being logged instead!
Content\-Length
 
The content length of a message is modelled via its [HttpEntity](#httpentity). As such no `Content-Length` header will ever be part of a message’s `header` sequence. Similarly, a `Content-Length` header instance that is explicitly added to the `headers` of a request or response will not be rendered onto the wire and trigger a warning being logged instead!
Server
A `Server` header is usually added automatically to any response and its value can be configured via the `akka.http.server.server-header` setting. Additionally an application can override the configured header with a custom one by adding it to the response’s `header` sequence.
User\-Agent
 
A `User-Agent` header is usually added automatically to any request and its value can be configured via the `akka.http.client.user-agent-header` setting. Additionally an application can override the configured header with a custom one by adding it to the request’s `header` sequence.
Date
The [`Date`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Date.html "akka.http.javadsl.model.headers.Date")[`Date`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Date.html "akka.http.scaladsl.model.headers.Date") response header is added automatically but can be overridden by supplying it manually.
Connection
On the server\-side Akka HTTP watches for explicitly added `Connection: close` response headers and as such honors the potential wish of the application to close the connection after the respective response has been sent out. The actual logic for determining whether to close the connection is quite involved. It takes into account the request’s method, protocol and potential [`Connection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Connection.html "akka.http.javadsl.model.headers.Connection")[`Connection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Connection.html "akka.http.scaladsl.model.headers.Connection") header as well as the response’s protocol, entity and potential [`Connection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Connection.html "akka.http.javadsl.model.headers.Connection")[`Connection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Connection.html "akka.http.scaladsl.model.headers.Connection") header. See [this test](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/test/scala/akka/http/impl/engine/rendering/ResponseRendererSpec.scala#L577-L678) for a full table of what happens when.
Strict\-Transport\-Security
 
HTTP Strict Transport Security (HSTS) is a web security policy mechanism which is communicated by the `Strict-Transport-Security` header. The most important security vulnerability that HSTS can fix is SSL\-stripping man\-in\-the\-middle attacks. The SSL\-stripping attack works by transparently converting a secure HTTPS connection into a plain HTTP connection. The user can see that the connection is insecure, but crucially there is no way of knowing whether the connection should be secure. HSTS addresses this problem by informing the browser that connections to the site should always use TLS/SSL. See also [RFC 6797](https://datatracker.ietf.org/doc/html/rfc6797).

## Custom Headers

Sometimes you may need to model a custom header type which is not part of HTTP and still be able to use it as convenient as is possible with the built\-in types.

Because of the number of ways one may interact with headers (i.e. try to matchconvert a [`CustomHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/CustomHeader.html "akka.http.javadsl.model.headers.CustomHeader")[`CustomHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CustomHeader.html "akka.http.scaladsl.model.headers.CustomHeader") againstto a [`RawHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RawHeader.html "akka.http.javadsl.model.headers.RawHeader")[`RawHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/RawHeader.html "akka.http.scaladsl.model.headers.RawHeader") or the other way around etc), a helper traitclasses for custom Header types and their companions classes are provided by Akka HTTP. Thanks to extending [`ModeledCustomHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html "akka.http.javadsl.model.headers.ModeledCustomHeader")[`ModeledCustomHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ModeledCustomHeader.html "akka.http.scaladsl.model.headers.ModeledCustomHeader") instead of the plain [`CustomHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/CustomHeader.html "akka.http.javadsl.model.headers.CustomHeader")[`CustomHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CustomHeader.html "akka.http.scaladsl.model.headers.CustomHeader") such header can be matchedthe following methods are at your disposal:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/server/ModeledCustomHeaderSpec.scala#L15-L24 "Go to snippet source")final class ApiTokenHeader(token: String) extends ModeledCustomHeader[ApiTokenHeader] {
  override def renderInRequests = true
  override def renderInResponses = true
  override val companion = ApiTokenHeader
  override def value: String = token
}
object ApiTokenHeader extends ModeledCustomHeaderCompanion[ApiTokenHeader] {
  override val name = "apiKey"
  override def parse(value: String) = Try(new ApiTokenHeader(value))
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/CustomHeaderExampleTest.java#L32-L59 "Go to snippet source")public static class ApiTokenHeader extends ModeledCustomHeader {

  ApiTokenHeader(String name, String value) {
    super(name, value);
  }

  public boolean renderInResponses() {
    return false;
  }

  public boolean renderInRequests() {
    return false;
  }

}

static class ApiTokenHeaderFactory extends ModeledCustomHeaderFactory<ApiTokenHeader> {

  public String name() {
    return "apiKey";
  }

  @Override
  public ApiTokenHeader parse(String value) {
    return new ApiTokenHeader(name(), value);
  }

}
```

Which allows this CustomHeadermodeled custom header to be used in the following scenarios:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/server/ModeledCustomHeaderSpec.scala#L49-L73 "Go to snippet source")val ApiTokenHeader(t1) = ApiTokenHeader("token")
t1 should ===("token")

val RawHeader(k2, v2) = ApiTokenHeader("token")
k2 should ===("apiKey")
v2 should ===("token")

// will match, header keys are case insensitive
val ApiTokenHeader(v3) = RawHeader("APIKEY", "token")
v3 should ===("token")

intercept[MatchError] {
  // won't match, different header name
  val ApiTokenHeader(v4) = DifferentHeader("token")
}

intercept[MatchError] {
  // won't match, different header name
  val RawHeader("something", v5) = DifferentHeader("token")
}

intercept[MatchError] {
  // won't match, different header name
  val ApiTokenHeader(v6) = RawHeader("different", "token")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/CustomHeaderExampleTest.java#L65-L89 "Go to snippet source")final ApiTokenHeaderFactory apiTokenHeaderFactory = new ApiTokenHeaderFactory();
final ApiTokenHeader token = apiTokenHeaderFactory.create("token");
assertEquals("token", token.value());

final HttpHeader header = apiTokenHeaderFactory.create("token");
assertEquals("apiKey", header.name());
assertEquals("token", header.value());

final Optional<ApiTokenHeader> fromRaw = apiTokenHeaderFactory
  .from(RawHeader.create("apiKey", "token"));
assertTrue("Expected a header", fromRaw.isPresent());
assertEquals("apiKey", fromRaw.get().name());
assertEquals("token", fromRaw.get().value());

// will match, header keys are case insensitive
final Optional<ApiTokenHeader> fromRawUpper = apiTokenHeaderFactory
  .from(RawHeader.create("APIKEY", "token"));
assertTrue("Expected a header", fromRawUpper.isPresent());
assertEquals("apiKey", fromRawUpper.get().name());
assertEquals("token", fromRawUpper.get().value());

// won't match, different header name
final Optional<ApiTokenHeader> wrong = apiTokenHeaderFactory
  .from(RawHeader.create("different", "token"));
assertFalse(wrong.isPresent());
```

Including usage within the header directives like in the following [headerValuePF](../routing-dsl/directives/header-directives/headerValuePF.html) example:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/server/ModeledCustomHeaderSpec.scala#L94-L116 "Go to snippet source")def extractFromCustomHeader = headerValuePF {
  case t @ ApiTokenHeader(token) => s"extracted> $t"
  case raw: RawHeader            => s"raw> $raw"
}

val routes = extractFromCustomHeader { s =>
  complete(s)
}

Get().withHeaders(RawHeader("apiKey", "TheKey")) ~> routes ~> check {
  status should ===(StatusCodes.OK)
  responseAs[String] should ===("extracted> apiKey: TheKey")
}

Get().withHeaders(RawHeader("somethingElse", "TheKey")) ~> routes ~> check {
  status should ===(StatusCodes.OK)
  responseAs[String] should ===("raw> somethingElse: TheKey")
}

Get().withHeaders(ApiTokenHeader("TheKey")) ~> routes ~> check {
  status should ===(StatusCodes.OK)
  responseAs[String] should ===("extracted> apiKey: TheKey")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/CustomHeaderExampleTest.java#L24-L125 "Go to snippet source")import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.headerValuePF;

final ApiTokenHeaderFactory apiTokenHeaderFactory = new ApiTokenHeaderFactory();
final PartialFunction<HttpHeader, String> extractFromCustomHeader =
  new JavaPartialFunction<HttpHeader, String>() {

    @Override
    public String apply(HttpHeader header, boolean isCheck) throws Exception {
      if (isCheck)
        return null;
      return apiTokenHeaderFactory.from(header)
        .map(apiTokenHeader -> "extracted> " + apiTokenHeader)
        .orElseGet(() -> "raw> " + header);
    }
  };

final Route route = headerValuePF(extractFromCustomHeader, Directives::complete);

testRoute(route)
  .run(HttpRequest.GET("/").addHeader(RawHeader.create("apiKey", "TheKey")))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("extracted> apiKey: TheKey");

testRoute(route)
  .run(HttpRequest.GET("/").addHeader(RawHeader.create("somethingElse", "TheKey")))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("raw> somethingElse: TheKey");

testRoute(route)
  .run(HttpRequest.GET("/").addHeader(apiTokenHeaderFactory.create("TheKey")))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("extracted> apiKey: TheKey");
```

Note
Custom headers do not work with the `header[T]` method on [`HttpMessage`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMessage.html "akka.http.javadsl.model.HttpMessage")[`HttpMessage`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage.html "akka.http.scaladsl.model.HttpMessage").

Note
When defining custom headers, it is better to extend [`ModeledCustomHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html "akka.http.javadsl.model.headers.ModeledCustomHeader")[`ModeledCustomHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ModeledCustomHeader.html "akka.http.scaladsl.model.headers.ModeledCustomHeader") instead of its parent [`CustomHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/CustomHeader.html "akka.http.javadsl.model.headers.CustomHeader")[`CustomHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CustomHeader.html "akka.http.scaladsl.model.headers.CustomHeader"). Custom headers that extend [`ModeledCustomHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html "akka.http.javadsl.model.headers.ModeledCustomHeader")[`ModeledCustomHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ModeledCustomHeader.html "akka.http.scaladsl.model.headers.ModeledCustomHeader") automatically comply with the pattern matching semantics that usually apply to built\-in types (such as matching a custom header against a [`RawHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/RawHeader.html "akka.http.javadsl.model.headers.RawHeader")[`RawHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/RawHeader.html "akka.http.scaladsl.model.headers.RawHeader") in routing layers of Akka HTTP applications).

Note
Custom headers do not work with the `getHeader(Class)` method on [`HttpMessage`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMessage.html "akka.http.javadsl.model.HttpMessage")[`HttpMessage`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage.html "akka.http.scaladsl.model.HttpMessage").

Note
Implement [`ModeledCustomHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeader.html "akka.http.javadsl.model.headers.ModeledCustomHeader")[`ModeledCustomHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ModeledCustomHeader.html "akka.http.scaladsl.model.headers.ModeledCustomHeader") and [`ModeledCustomHeaderFactory`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/ModeledCustomHeaderFactory.html "akka.http.javadsl.model.headers.ModeledCustomHeaderFactory") instead of [`CustomHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/CustomHeader.html "akka.http.javadsl.model.headers.CustomHeader")[`CustomHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CustomHeader.html "akka.http.scaladsl.model.headers.CustomHeader") to be able to use the convenience methods that allow parsing the custom user\-defined header from [`HttpHeader`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html "akka.http.javadsl.model.HttpHeader")[`HttpHeader`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html "akka.http.scaladsl.model.HttpHeader").

## Attributes

Sometimes it can be useful to keep track of some information associated with a request without explicitly closing over it. Such information can be attached to a request or response though message attributes:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/ModelSpec.scala#L93-L113 "Go to snippet source")case class User(name: String)
object User {
  val attributeKey = AttributeKey[User]("user")
}

def determineUser(req: HttpRequest): HttpRequest = {
  val user = // ... somehow determine the user for this request

  // Add the attribute
  req.addAttribute(User.attributeKey, user)
}

// Retrieve the attribute
val user: Option[User] = requestWithAttribute.attribute(User.attributeKey)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/ModelDocTest.java#L96-L122 "Go to snippet source")class User {
    final String name;
    public User(String name) {
        this.name = name;
    }

    public static final AttributeKey<User> attributeKey = AttributeKey.create("user", User.class);
}

public HttpRequest determineUser(HttpRequest request) {
    User user = //... somehow determine the user for this request

    // Add the attribute
    return request.addAttribute(User.attributeKey, user);
}

// Retrieve the attribute
Optional<User> user = requestWithAttribute.getAttribute(User.attributeKey);
```

Message attributes are only to be used within in your application, they are not present on the wire.

## Parsing / Rendering

Parsing and rendering of HTTP data structures is heavily optimized and for most types there’s currently no public API provided to parse (or render to) Strings or byte arrays.

Note
Various parsing and rendering settings are available to tweak in the configuration under `akka.http.client[.parsing]`, `akka.http.server[.parsing]` and `akka.http.host-connection-pool[.client.parsing]`, with defaults for all of these being defined in the `akka.http.parsing` configuration section.

For example, if you want to change a parsing setting for all components, you can set the `akka.http.parsing.illegal-header-warnings = off` value. However this setting can be still overridden by the more specific sections, like for example `akka.http.server.parsing.illegal-header-warnings = on`.

In this case both `client` and `host-connection-pool` APIs will see the setting `off`, however the server will see `on`.

In the case of `akka.http.host-connection-pool.client` settings, they default to settings set in `akka.http.client`, and can override them if needed. This is useful, since both `client` and `host-connection-pool` APIs, such as the Client API `Http().outgoingConnection``Http.get(sys).outgoingConnection` or the Host Connection Pool APIs `Http().singleRequest``Http.get(sys).singleRequest` or `Http().superPool``Http.get(sys).superPool`, usually need the same settings, however the `server` most likely has a very different set of settings.

## Registering Custom Media Types

Akka HTTP [`predefines`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$.html "akka.http.scaladsl.model.MediaTypes")[`predefines`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html "akka.http.javadsl.model.MediaTypes") most commonly encountered media types and emits them in their well\-typed form while parsing http messages. Sometimes you may want to define a custom media type and inform the parser infrastructure about how to handle these custom media types, e.g. that `application/custom` is to be treated as `NonBinary` with `WithFixedCharset`. To achieve this you need to register the custom media type in the server’s settings by configuring [`ParserSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html "akka.http.javadsl.settings.ParserSettings")[`ParserSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html "akka.http.scaladsl.settings.ParserSettings") like this:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/CustomMediaTypesSpec.scala#L38-L55 "Go to snippet source")  
// similarly in Java: `akka.http.javadsl.settings.[...]`
import akka.http.scaladsl.settings.ParserSettings
import akka.http.scaladsl.settings.ServerSettings

// define custom media type:
val utf8 = HttpCharsets.`UTF-8`
val `application/custom`: WithFixedCharset =
  MediaType.customWithFixedCharset("application", "custom", utf8)

// add custom media type to parser settings:
val parserSettings = ParserSettings.forServer(system).withCustomMediaTypes(`application/custom`)
val serverSettings = ServerSettings(system).withParserSettings(parserSettings)

val routes = extractRequest { r =>
  complete(r.entity.contentType.toString + " = " + r.entity.contentType.getClass)
}
val binding = Http().newServerAt("localhost", 0).withSettings(serverSettings).bind(routes)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/CustomMediaTypesExampleTest.java#L31-L68 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractRequest;

// Define custom media type:
final MediaType.WithFixedCharset applicationCustom =
  MediaTypes.customWithFixedCharset("application", "custom", // The new Media Type name
    HttpCharsets.UTF_8, // The charset used
    new HashMap<>(), // Empty parameters
    false); // No arbitrary subtypes are allowed

// Add custom media type to parser settings:
final ParserSettings parserSettings = ParserSettings.forServer(system)
  .withCustomMediaTypes(applicationCustom);
final ServerSettings serverSettings = ServerSettings.create(system)
  .withParserSettings(parserSettings);

final Route route = extractRequest(req ->
  complete(req.entity().getContentType().toString() + " = "
    + req.entity().getContentType().getClass())
);

final CompletionStage<ServerBinding> binding =
  Http.get(system)
    .newServerAt(host, 0)
    .withSettings(serverSettings)
    .bind(route);

```

You may also want to read about MediaType [Registration trees](https://en.wikipedia.org/wiki/Media_type#Registration_trees), in order to register your vendor specific media types in the right style / place.

## Registering Custom Status Codes

Similarly to media types, Akka HTTP [`predefines`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$.html "akka.http.scaladsl.model.StatusCodes")[`predefines`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCodes.html "akka.http.javadsl.model.StatusCodes") well\-known status codes, however sometimes you may need to use a custom one (or are forced to use an API which returns custom status codes). Similarly to the media types registration, you can register custom status codes by configuring [`ParserSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html "akka.http.javadsl.settings.ParserSettings")[`ParserSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html "akka.http.scaladsl.settings.ParserSettings") like this:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-tests/src/test/scala/akka/http/scaladsl/CustomStatusCodesSpec.scala#L20-L44 "Go to snippet source")// similarly in Java: `akka.http.javadsl.settings.[...]`
import akka.http.scaladsl.settings.{ ParserSettings, ServerSettings }

// define custom status code:
val LeetCode = StatusCodes.custom(777, "LeetCode", "Some reason", isSuccess = true, allowsEntity = false)

// add custom method to parser settings:
val parserSettings = ParserSettings.forServer(system).withCustomStatusCodes(LeetCode)
val serverSettings = ServerSettings(system).withParserSettings(parserSettings)

val clientConSettings = ClientConnectionSettings(system).withParserSettings(parserSettings)
val clientSettings = ConnectionPoolSettings(system).withConnectionSettings(clientConSettings)

val routes =
  complete(HttpResponse(status = LeetCode))

// use serverSettings in server:
val binding = Http().newServerAt("127.0.0.1", 0).withSettings(serverSettings).bind(routes).futureValue

// use clientSettings in client:
val request = HttpRequest(uri = s"http://127.0.0.1:${binding.localAddress.getPort}/")
val response = Http().singleRequest(request, settings = clientSettings)

// futureValue is a ScalaTest helper:
response.futureValue.status should ===(LeetCode)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/CustomStatusCodesExampleTest.java#L33-L90 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractRequest;

// Define custom status code:
final StatusCode leetCode = StatusCodes.custom(777, // Our custom status code
  "LeetCode", // Our custom reason
  "Some reason", // Our custom default message
  true, // It should be considered a success response
  false);// Does not allow entities

// Add custom method to parser settings:
final ParserSettings parserSettings = ParserSettings.forServer(system)
  .withCustomStatusCodes(leetCode);
final ServerSettings serverSettings = ServerSettings.create(system)
  .withParserSettings(parserSettings);

final ClientConnectionSettings clientConSettings = ClientConnectionSettings.create(system)
  .withParserSettings(parserSettings);
final ConnectionPoolSettings clientSettings = ConnectionPoolSettings.create(system)
  .withConnectionSettings(clientConSettings);

final Route route = extractRequest(req ->
  complete(HttpResponse.create().withStatus(leetCode))
);

// Use serverSettings in server:
final CompletionStage<ServerBinding> binding = Http.get(system)
  .newServerAt(host, 0)
  .withSettings(serverSettings)
  .bind(route);

final ServerBinding serverBinding = binding.toCompletableFuture().get();

final int port = serverBinding.localAddress().getPort();

// Use clientSettings in client:
final HttpResponse response = Http.get(system)
  .singleRequest(HttpRequest
    .GET("http://" + host + ":" + port + "/"),
    ConnectionContext.httpsClient(SSLContext.getDefault()),
    clientSettings,
    system.log())
  .toCompletableFuture()
  .get();

// Check we get the right code back
assertEquals(leetCode, response.status());
```

## Registering Custom HTTP Method

Akka HTTP also allows you to define custom HTTP methods, other than the well\-known methods [`predefined`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethods$.html "akka.http.scaladsl.model.HttpMethods")[`predefined`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethods.html "akka.http.javadsl.model.HttpMethods") in Akka HTTP. To use a custom HTTP method, you need to define it, and then add it to parser settings like below:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CustomHttpMethodSpec.scala#L26-L45 "Go to snippet source")import akka.http.scaladsl.settings.{ ParserSettings, ServerSettings }

// define custom method type:
val BOLT = HttpMethod.custom("BOLT", safe = false,
  idempotent = true, requestEntityAcceptance = Expected, contentLengthAllowed = true)

// add custom method to parser settings:
val parserSettings = ParserSettings.forServer(system).withCustomMethods(BOLT)
val serverSettings = ServerSettings(system).withParserSettings(parserSettings)

val routes = extractMethod { method =>
  complete(s"This is a ${method.name} method request.")
}
val binding = Http().newServerAt(host, port).withSettings(serverSettings).bind(routes)

val request = HttpRequest(BOLT, s"http://$host:$port/", protocol = `HTTP/1.1`)
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CustomHttpMethodExamplesTest.java#L32-L75 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractMethod;

// define custom method type:
HttpMethod BOLT =
  HttpMethods.custom("BOLT", false, true, Expected);

// add custom method to parser settings:
final ParserSettings parserSettings =
  ParserSettings.forServer(system).withCustomMethods(BOLT);
final ServerSettings serverSettings =
  ServerSettings.create(system).withParserSettings(parserSettings);

final Route routes = concat(
  extractMethod( method ->
    complete( "This is a " + method.name() + " request.")
  )
);
final Http http = Http.get(system);
final CompletionStage<ServerBinding> binding =
  http.newServerAt(host, port)
      .withSettings(serverSettings)
      .logTo(loggingAdapter)
      .bind(routes);

HttpRequest request = HttpRequest.create()
  .withUri("http://" + host + ":" + Integer.toString(port))
  .withMethod(BOLT)
  .withProtocol(HTTP_1_1);

CompletionStage<HttpResponse> response = http.singleRequest(request);
```

## Code Examples

### Example 1: Overview

```scala
import akka.http.scaladsl.model._
```

### Example 2: Overview

```java
import akka.http.javadsl.model.*;
import akka.http.javadsl.model.headers.*;

import java.util.Optional;
```

### Example 3: HttpRequest

```scala
import akka.http.scaladsl.model._
import HttpMethods._

// construct a simple GET request to `homeUri`
val homeUri = Uri("/abc")
HttpRequest(GET, uri = homeUri)

// construct simple GET request to "/index" (implicit string to Uri conversion)
HttpRequest(GET, uri = "/index")

// construct simple POST request containing entity
val data = ByteString("abc")
HttpRequest(POST, uri = "/receive", entity = data)

// customize every detail of HTTP request
import HttpProtocols._
import MediaTypes._
import HttpCharsets._
val userData = ByteString("abc")
val authorization = headers.Authorization(BasicHttpCredentials("user", "pass"))
HttpRequest(
  PUT,
  uri = "/user",
  entity = HttpEntity(`text/plain` withCharset `UTF-8`, userData),
  headers = List(authorization),
  protocol = `HTTP/1.0`)
```

### Example 4: HttpRequest

```java
import akka.http.javadsl.model.*;
import akka.http.javadsl.model.headers.*;

import java.util.Optional;

// construct a simple GET request to `homeUri`
Uri homeUri = Uri.create("/home");
HttpRequest request1 = HttpRequest.create().withUri(homeUri);

// construct simple GET request to "/index" using helper methods
HttpRequest request2 = HttpRequest.GET("/index");

// construct simple POST request containing entity
ByteString data = ByteString.fromString("abc");
HttpRequest postRequest1 = HttpRequest.POST("/receive").withEntity(data);

// customize every detail of HTTP request
//import HttpProtocols.*
//import MediaTypes.*
Authorization authorization = Authorization.basic("user", "pass");
HttpRequest complexRequest =
    HttpRequest.PUT("/user")
        .withEntity(HttpEntities.create(ContentTypes.TEXT_PLAIN_UTF8, "abc"))
        .addHeader(authorization)
        .withProtocol(HttpProtocols.HTTP_1_0);
```

### Example 5: HttpRequest

```scala
/*
 * Copyright (C) 2009-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.http.scaladsl.model.{ HttpEntity, HttpRequest }
import akka.http.scaladsl.model.headers.{ Authorization, BasicHttpCredentials }
import akka.testkit.AkkaSpec

import scala.collection.immutable

class HttpRequestDetailedStringExampleSpec extends AkkaSpec {

  // Custom string representation which includes headers
  def toDetailedString(request: HttpRequest): String = {
    import request._
    s"""HttpRequest(${_1},${_2},${_3},${_4},${_5})"""
  }

  "Include headers in custom string representation" in {

    // An HTTP header containing Personal Identifying Information
    val piiHeader = Authorization(BasicHttpCredentials("user", "password"))

    // An HTTP entity containing Personal Identifying Information
    val piiBody: HttpEntity.Strict =
      "This body contains information about [user]"

    val httpRequestWithHeadersAndBody =
      HttpRequest(entity = piiBody, headers = immutable.Seq(piiHeader))

    // Our custom string representation includes body and headers string representations...
    assert(
      toDetailedString(httpRequestWithHeadersAndBody)
        .contains(piiHeader.toString)
    )
    assert(
      toDetailedString(httpRequestWithHeadersAndBody).contains(piiBody.toString)
    )

    // ... while default `toString` doesn't.
    assert(!s"$httpRequestWithHeadersAndBody".contains(piiHeader.unsafeToString))
    assert(!s"$httpRequestWithHeadersAndBody".contains(piiBody.data.utf8String))
  }

}
```

### Example 6: HttpRequest

```java
/*
 * Copyright (C) 2009-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.javadsl;

import akka.http.javadsl.model.*;
import akka.http.javadsl.model.headers.Authorization;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class HttpRequestDetailedStringExampleTest {

    // Custom string representation which includes headers
    public String toDetailedString(HttpRequest request) {

        HttpMethod method = request.method();
        Uri uri = request.getUri();
        Iterable<HttpHeader> headers = request.getHeaders();
        RequestEntity entity = request.entity();
        HttpProtocol protocol = request.protocol();

        return String.format("HttpRequest(%s, %s, %s, %s, %s)", method, uri, headers, entity, protocol);
    }

    @Test
    public void headersInCustomStringRepresentation() {

        // An HTTP header containing Personal Identifying Information
        Authorization piiHeader = Authorization.basic("user", "password");

        // An HTTP entity containing Personal Identifying Information
        HttpEntity.Strict piiBody = HttpEntities.create("This body contains information about [user]");

        HttpRequest httpRequestWithHeadersAndBody = HttpRequest.create()
                .withEntity(piiBody)
                .withHeaders(Arrays.asList(piiHeader));

        // Our custom string representation includes body and headers string representations...
        assertTrue(toDetailedString(httpRequestWithHeadersAndBody).contains(piiHeader.toString()));
        assertTrue(toDetailedString(httpRequestWithHeadersAndBody).contains(piiBody.toString()));

        // ... while default `toString` doesn't.
        assertFalse(httpRequestWithHeadersAndBody.toString().contains(piiHeader.unsafeToString()));
        assertFalse(httpRequestWithHeadersAndBody.toString().contains(piiBody.getData().utf8String()));

    }

}
```

### Example 7: Synthetic Headers

```scala
import akka.http.scaladsl.model.headers.`Raw-Request-URI`
val req = HttpRequest(uri = "/ignored", headers = List(`Raw-Request-URI`("/a/b%2Bc")))
```

### Example 8: Synthetic Headers

```java
// imports akka.http.javadsl.model.headers.RawRequestURI
HttpRequest.create("/ignored").addHeader(RawRequestURI.create("/a/b%2Bc"));
```

### Example 9: HttpResponse

```scala
import StatusCodes._

// simple OK response without data created using the integer status code
HttpResponse(200)

// 404 response created using the named StatusCode constant
HttpResponse(NotFound)

// 404 response with a body explaining the error
HttpResponse(404, entity = "Unfortunately, the resource couldn't be found.")

// A redirecting response containing an extra header
val locationHeader = headers.Location("http://example.com/other")
HttpResponse(Found, headers = List(locationHeader))
```

### Example 10: HttpResponse

```java
// simple OK response without data created using the integer status code
HttpResponse ok = HttpResponse.create().withStatus(200);

// 404 response created using the named StatusCode constant
HttpResponse notFound = HttpResponse.create().withStatus(StatusCodes.NOT_FOUND);

// 404 response with a body explaining the error
HttpResponse notFoundCustom =
    HttpResponse.create()
        .withStatus(404)
        .withEntity("Unfortunately, the resource couldn't be found.");

// A redirecting response containing an extra header
Location locationHeader = Location.create("http://example.com/other");
HttpResponse redirectResponse =
    HttpResponse.create()
        .withStatus(StatusCodes.FOUND)
        .addHeader(locationHeader);
```

### Example 11: HttpResponse

```scala
/*
 * Copyright (C) 2009-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.http.scaladsl.model.{ HttpEntity, HttpResponse }
import akka.http.scaladsl.model.headers.{ Authorization, BasicHttpCredentials }
import akka.testkit.AkkaSpec

import scala.collection.immutable

class HttpResponseDetailedStringExampleSpec extends AkkaSpec {

  // Custom string representation which includes headers
  def toDetailedString(response: HttpResponse): String = {
    import response._
    s"""HttpResponse(${_1},${_2},${_3},${_4})"""
  }

  "Include headers in custom string representation" in {

    // An HTTP header containing Personal Identifying Information
    val piiHeader = Authorization(BasicHttpCredentials("user", "password"))

    // An HTTP entity containing Personal Identifying Information
    val piiBody: HttpEntity.Strict =
      "This body contains information about [user]"

    val httpResponseWithHeadersAndBody =
      HttpResponse(entity = piiBody, headers = immutable.Seq(piiHeader))

    // Our custom string representation includes body and headers string representations...
    assert(
      toDetailedString(httpResponseWithHeadersAndBody)
        .contains(piiHeader.toString)
    )
    assert(
      toDetailedString(httpResponseWithHeadersAndBody)
        .contains(piiBody.toString)
    )

    // ... while default `toString` doesn't.
    assert(!s"$httpResponseWithHeadersAndBody".contains(piiHeader.unsafeToString))
    assert(!s"$httpResponseWithHeadersAndBody".contains(piiBody.data.utf8String))
  }

}
```

### Example 12: HttpResponse

```java
/*
 * Copyright (C) 2009-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.javadsl;

import akka.http.javadsl.model.*;
import akka.http.javadsl.model.headers.Authorization;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HttpResponseDetailedStringExampleTest {

    // Custom string representation which includes headers
    public String toDetailedString(HttpResponse response) {

        StatusCode status = response.status();
        Iterable<HttpHeader> headers = response.getHeaders();
        HttpEntity entity = response.entity();
        HttpProtocol protocol = response.protocol();


        return String.format("HttpResponse(%s, %s, %s, %s)", status, headers, entity, protocol);
    }

    @Test
    public void headersInCustomStringRepresentation() {

        // An HTTP header containing Personal Identifying Information
        Authorization piiHeader = Authorization.basic("user", "password");

        // An HTTP entity containing Personal Identifying Information
        HttpEntity.Strict piiBody = HttpEntities.create("This body contains information about [user]");

        HttpResponse httpResponseWithHeadersAndBody = HttpResponse.create()
                .withEntity(piiBody)
                .withHeaders(Arrays.asList(piiHeader));

        // Our custom string representation includes body and headers string representations...
        assertTrue(toDetailedString(httpResponseWithHeadersAndBody).contains(piiHeader.toString()));
        assertTrue(toDetailedString(httpResponseWithHeadersAndBody).contains(piiBody.toString()));

        // ... while default `toString` doesn't.
        assertFalse(httpResponseWithHeadersAndBody.toString().contains(piiHeader.unsafeToString()));
        assertFalse(httpResponseWithHeadersAndBody.toString().contains(piiBody.getData().utf8String()));

    }

}
```

### Example 13: Header Model

```scala
import akka.http.scaladsl.model.headers._

// create a ``Location`` header
val loc = Location("http://example.com/other")

// create an ``Authorization`` header with HTTP Basic authentication data
val auth = Authorization(BasicHttpCredentials("joe", "josepp"))

// custom type
case class User(name: String, pass: String)

// a method that extracts basic HTTP credentials from a request
def credentialsOfRequest(req: HttpRequest): Option[User] =
  for {
    case Authorization(BasicHttpCredentials(user, pass)) <- req.header[Authorization]
  } yield User(user, pass)
```

### Example 14: Header Model

```java
// create a ``Location`` header
        Location locationHeader = Location.create("http://example.com/other");

        // create an ``Authorization`` header with HTTP Basic authentication data
        Authorization authorization = Authorization.basic("user", "pass");

    // a method that extracts basic HTTP credentials from a request
	private Optional<BasicHttpCredentials> getCredentialsOfRequest(HttpRequest request) {
        Optional<Authorization> auth = request.getHeader(Authorization.class);
        if (auth.isPresent() && auth.get().credentials() instanceof BasicHttpCredentials)
            return Optional.of((BasicHttpCredentials) auth.get().credentials());
        else
            return Optional.empty();
    }
```

### Example 15: Custom Headers

```scala
final class ApiTokenHeader(token: String) extends ModeledCustomHeader[ApiTokenHeader] {
  override def renderInRequests = true
  override def renderInResponses = true
  override val companion = ApiTokenHeader
  override def value: String = token
}
object ApiTokenHeader extends ModeledCustomHeaderCompanion[ApiTokenHeader] {
  override val name = "apiKey"
  override def parse(value: String) = Try(new ApiTokenHeader(value))
}
```

### Example 16: Custom Headers

```java
public static class ApiTokenHeader extends ModeledCustomHeader {

  ApiTokenHeader(String name, String value) {
    super(name, value);
  }

  public boolean renderInResponses() {
    return false;
  }

  public boolean renderInRequests() {
    return false;
  }

}

static class ApiTokenHeaderFactory extends ModeledCustomHeaderFactory<ApiTokenHeader> {

  public String name() {
    return "apiKey";
  }

  @Override
  public ApiTokenHeader parse(String value) {
    return new ApiTokenHeader(name(), value);
  }

}
```

### Example 17: Custom Headers

```scala
val ApiTokenHeader(t1) = ApiTokenHeader("token")
t1 should ===("token")

val RawHeader(k2, v2) = ApiTokenHeader("token")
k2 should ===("apiKey")
v2 should ===("token")

// will match, header keys are case insensitive
val ApiTokenHeader(v3) = RawHeader("APIKEY", "token")
v3 should ===("token")

intercept[MatchError] {
  // won't match, different header name
  val ApiTokenHeader(v4) = DifferentHeader("token")
}

intercept[MatchError] {
  // won't match, different header name
  val RawHeader("something", v5) = DifferentHeader("token")
}

intercept[MatchError] {
  // won't match, different header name
  val ApiTokenHeader(v6) = RawHeader("different", "token")
}
```

### Example 18: Custom Headers

```java
final ApiTokenHeaderFactory apiTokenHeaderFactory = new ApiTokenHeaderFactory();
final ApiTokenHeader token = apiTokenHeaderFactory.create("token");
assertEquals("token", token.value());

final HttpHeader header = apiTokenHeaderFactory.create("token");
assertEquals("apiKey", header.name());
assertEquals("token", header.value());

final Optional<ApiTokenHeader> fromRaw = apiTokenHeaderFactory
  .from(RawHeader.create("apiKey", "token"));
assertTrue("Expected a header", fromRaw.isPresent());
assertEquals("apiKey", fromRaw.get().name());
assertEquals("token", fromRaw.get().value());

// will match, header keys are case insensitive
final Optional<ApiTokenHeader> fromRawUpper = apiTokenHeaderFactory
  .from(RawHeader.create("APIKEY", "token"));
assertTrue("Expected a header", fromRawUpper.isPresent());
assertEquals("apiKey", fromRawUpper.get().name());
assertEquals("token", fromRawUpper.get().value());

// won't match, different header name
final Optional<ApiTokenHeader> wrong = apiTokenHeaderFactory
  .from(RawHeader.create("different", "token"));
assertFalse(wrong.isPresent());
```

### Example 19: Custom Headers

```scala
def extractFromCustomHeader = headerValuePF {
  case t @ ApiTokenHeader(token) => s"extracted> $t"
  case raw: RawHeader            => s"raw> $raw"
}

val routes = extractFromCustomHeader { s =>
  complete(s)
}

Get().withHeaders(RawHeader("apiKey", "TheKey")) ~> routes ~> check {
  status should ===(StatusCodes.OK)
  responseAs[String] should ===("extracted> apiKey: TheKey")
}

Get().withHeaders(RawHeader("somethingElse", "TheKey")) ~> routes ~> check {
  status should ===(StatusCodes.OK)
  responseAs[String] should ===("raw> somethingElse: TheKey")
}

Get().withHeaders(ApiTokenHeader("TheKey")) ~> routes ~> check {
  status should ===(StatusCodes.OK)
  responseAs[String] should ===("extracted> apiKey: TheKey")
}
```

### Example 20: Custom Headers

```java
import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.headerValuePF;

final ApiTokenHeaderFactory apiTokenHeaderFactory = new ApiTokenHeaderFactory();
final PartialFunction<HttpHeader, String> extractFromCustomHeader =
  new JavaPartialFunction<HttpHeader, String>() {

    @Override
    public String apply(HttpHeader header, boolean isCheck) throws Exception {
      if (isCheck)
        return null;
      return apiTokenHeaderFactory.from(header)
        .map(apiTokenHeader -> "extracted> " + apiTokenHeader)
        .orElseGet(() -> "raw> " + header);
    }
  };

final Route route = headerValuePF(extractFromCustomHeader, Directives::complete);

testRoute(route)
  .run(HttpRequest.GET("/").addHeader(RawHeader.create("apiKey", "TheKey")))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("extracted> apiKey: TheKey");

testRoute(route)
  .run(HttpRequest.GET("/").addHeader(RawHeader.create("somethingElse", "TheKey")))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("raw> somethingElse: TheKey");

testRoute(route)
  .run(HttpRequest.GET("/").addHeader(apiTokenHeaderFactory.create("TheKey")))
  .assertStatusCode(StatusCodes.OK)
  .assertEntity("extracted> apiKey: TheKey");
```

### Example 21: Attributes

```scala
case class User(name: String)
object User {
  val attributeKey = AttributeKey[User]("user")
}

def determineUser(req: HttpRequest): HttpRequest = {
  val user = // ... somehow determine the user for this request

  // Add the attribute
  req.addAttribute(User.attributeKey, user)
}

// Retrieve the attribute
val user: Option[User] = requestWithAttribute.attribute(User.attributeKey)
```

### Example 22: Attributes

```java
class User {
    final String name;
    public User(String name) {
        this.name = name;
    }

    public static final AttributeKey<User> attributeKey = AttributeKey.create("user", User.class);
}

public HttpRequest determineUser(HttpRequest request) {
    User user = //... somehow determine the user for this request

    // Add the attribute
    return request.addAttribute(User.attributeKey, user);
}

// Retrieve the attribute
Optional<User> user = requestWithAttribute.getAttribute(User.attributeKey);
```

### Example 23: Registering Custom Media Types

```scala
// similarly in Java: `akka.http.javadsl.settings.[...]`
import akka.http.scaladsl.settings.ParserSettings
import akka.http.scaladsl.settings.ServerSettings

// define custom media type:
val utf8 = HttpCharsets.`UTF-8`
val `application/custom`: WithFixedCharset =
  MediaType.customWithFixedCharset("application", "custom", utf8)

// add custom media type to parser settings:
val parserSettings = ParserSettings.forServer(system).withCustomMediaTypes(`application/custom`)
val serverSettings = ServerSettings(system).withParserSettings(parserSettings)

val routes = extractRequest { r =>
  complete(r.entity.contentType.toString + " = " + r.entity.contentType.getClass)
}
val binding = Http().newServerAt("localhost", 0).withSettings(serverSettings).bind(routes)
```

### Example 24: Registering Custom Media Types

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractRequest;

// Define custom media type:
final MediaType.WithFixedCharset applicationCustom =
  MediaTypes.customWithFixedCharset("application", "custom", // The new Media Type name
    HttpCharsets.UTF_8, // The charset used
    new HashMap<>(), // Empty parameters
    false); // No arbitrary subtypes are allowed

// Add custom media type to parser settings:
final ParserSettings parserSettings = ParserSettings.forServer(system)
  .withCustomMediaTypes(applicationCustom);
final ServerSettings serverSettings = ServerSettings.create(system)
  .withParserSettings(parserSettings);

final Route route = extractRequest(req ->
  complete(req.entity().getContentType().toString() + " = "
    + req.entity().getContentType().getClass())
);

final CompletionStage<ServerBinding> binding =
  Http.get(system)
    .newServerAt(host, 0)
    .withSettings(serverSettings)
    .bind(route);
```

### Example 25: Registering Custom Status Codes

```scala
// similarly in Java: `akka.http.javadsl.settings.[...]`
import akka.http.scaladsl.settings.{ ParserSettings, ServerSettings }

// define custom status code:
val LeetCode = StatusCodes.custom(777, "LeetCode", "Some reason", isSuccess = true, allowsEntity = false)

// add custom method to parser settings:
val parserSettings = ParserSettings.forServer(system).withCustomStatusCodes(LeetCode)
val serverSettings = ServerSettings(system).withParserSettings(parserSettings)

val clientConSettings = ClientConnectionSettings(system).withParserSettings(parserSettings)
val clientSettings = ConnectionPoolSettings(system).withConnectionSettings(clientConSettings)

val routes =
  complete(HttpResponse(status = LeetCode))

// use serverSettings in server:
val binding = Http().newServerAt("127.0.0.1", 0).withSettings(serverSettings).bind(routes).futureValue

// use clientSettings in client:
val request = HttpRequest(uri = s"http://127.0.0.1:${binding.localAddress.getPort}/")
val response = Http().singleRequest(request, settings = clientSettings)

// futureValue is a ScalaTest helper:
response.futureValue.status should ===(LeetCode)
```

### Example 26: Registering Custom Status Codes

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractRequest;

// Define custom status code:
final StatusCode leetCode = StatusCodes.custom(777, // Our custom status code
  "LeetCode", // Our custom reason
  "Some reason", // Our custom default message
  true, // It should be considered a success response
  false);// Does not allow entities

// Add custom method to parser settings:
final ParserSettings parserSettings = ParserSettings.forServer(system)
  .withCustomStatusCodes(leetCode);
final ServerSettings serverSettings = ServerSettings.create(system)
  .withParserSettings(parserSettings);

final ClientConnectionSettings clientConSettings = ClientConnectionSettings.create(system)
  .withParserSettings(parserSettings);
final ConnectionPoolSettings clientSettings = ConnectionPoolSettings.create(system)
  .withConnectionSettings(clientConSettings);

final Route route = extractRequest(req ->
  complete(HttpResponse.create().withStatus(leetCode))
);

// Use serverSettings in server:
final CompletionStage<ServerBinding> binding = Http.get(system)
  .newServerAt(host, 0)
  .withSettings(serverSettings)
  .bind(route);

final ServerBinding serverBinding = binding.toCompletableFuture().get();

final int port = serverBinding.localAddress().getPort();

// Use clientSettings in client:
final HttpResponse response = Http.get(system)
  .singleRequest(HttpRequest
    .GET("http://" + host + ":" + port + "/"),
    ConnectionContext.httpsClient(SSLContext.getDefault()),
    clientSettings,
    system.log())
  .toCompletableFuture()
  .get();

// Check we get the right code back
assertEquals(leetCode, response.status());
```

### Example 27: Registering Custom HTTP Method

```scala
import akka.http.scaladsl.settings.{ ParserSettings, ServerSettings }

// define custom method type:
val BOLT = HttpMethod.custom("BOLT", safe = false,
  idempotent = true, requestEntityAcceptance = Expected, contentLengthAllowed = true)

// add custom method to parser settings:
val parserSettings = ParserSettings.forServer(system).withCustomMethods(BOLT)
val serverSettings = ServerSettings(system).withParserSettings(parserSettings)

val routes = extractMethod { method =>
  complete(s"This is a ${method.name} method request.")
}
val binding = Http().newServerAt(host, port).withSettings(serverSettings).bind(routes)

val request = HttpRequest(BOLT, s"http://$host:$port/", protocol = `HTTP/1.1`)
```

### Example 28: Registering Custom HTTP Method

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractMethod;


// define custom method type:
HttpMethod BOLT =
  HttpMethods.custom("BOLT", false, true, Expected);

// add custom method to parser settings:
final ParserSettings parserSettings =
  ParserSettings.forServer(system).withCustomMethods(BOLT);
final ServerSettings serverSettings =
  ServerSettings.create(system).withParserSettings(parserSettings);

final Route routes = concat(
  extractMethod( method ->
    complete( "This is a " + method.name() + " request.")
  )
);
final Http http = Http.get(system);
final CompletionStage<ServerBinding> binding =
  http.newServerAt(host, port)
      .withSettings(serverSettings)
      .logTo(loggingAdapter)
      .bind(routes);

HttpRequest request = HttpRequest.create()
  .withUri("http://" + host + ":" + Integer.toString(port))
  .withMethod(BOLT)
  .withProtocol(HTTP_1_1);

CompletionStage<HttpResponse> response = http.singleRequest(request);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpCharsets$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMethods$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpProtocols$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Connection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/CustomHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Date.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpEncodings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/ModeledCustomHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/RawHeader.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharsets.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMessage.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpMethods.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocol.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpProtocols.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCodes.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Connection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/CustomHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Date.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpEncodings.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/common/http-model.html](https://doc.akka.io/libraries/akka-http/current/common/http-model.html)*