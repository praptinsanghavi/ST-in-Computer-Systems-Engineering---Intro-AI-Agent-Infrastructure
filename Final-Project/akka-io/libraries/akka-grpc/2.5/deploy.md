---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:48:06Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/deploy.html
title: Deployment • Akka gRPC
---

# Deployment • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Deployment

You can deploy an Akka gRPC application just like you would any other JVM\-based project. For some general pointers on this topic, see [the deployment section of the Akka documentation](https://doc.akka.io/libraries/akka-core/2.10/additional/deploying.html).

Remember that the cleartext HTTP/2 “h2c with prior knowledge” protocol is not compatible with HTTP/1\.1, so if your infrastructure uses any proxies they must either understand this protocol or support generic TCP connections.

## Serve gRPC over HTTPS

To deploy your gRPC service over a HTTPS connection you will have to use an [`HttpsConnectionContext`](https://doc.akka.io/japi/akka-http/10.7/?akka/http/javadsl/HttpsConnectionContext.html "akka.http.javadsl.HttpsConnectionContext")[`HttpsConnectionContext`](https://doc.akka.io/api/akka-http/10.7/akka/http/scaladsl/HttpsConnectionContext.html "akka.http.scaladsl.HttpsConnectionContext") as described in the [Akka\-HTTP documentation](https://doc.akka.io/libraries/akka-http/10.7/server-side/server-https-support.html).

## Building Native Images

Building native images with Akka gRPC is supported. None of the functionality requires any special concerns, metadata for the libraries Akka gRPC uses are provided out of the box.

For details about building native images with Akka in general see the [Akka Documentation](https://doc.akka.io/libraries/akka-core/2.10/additional/native-image.html)

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/10.7/?akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/libraries/akka-core/2.10/additional/deploying.html
- https://doc.akka.io/libraries/akka-core/2.10/additional/native-image.html
- https://doc.akka.io/libraries/akka-grpc/2.5/apidesign.html
- https://doc.akka.io/libraries/akka-grpc/2.5/mtls.html
- https://doc.akka.io/libraries/akka-http/10.7/server-side/server-https-support.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/2.5/deploy.html](https://doc.akka.io/libraries/akka-grpc/2.5/deploy.html)*