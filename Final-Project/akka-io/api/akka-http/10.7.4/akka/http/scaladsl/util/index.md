---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.util
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:04:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/util/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.util
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.util

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.util

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](../client/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](../coding/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](../common/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](../marshallers/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](../marshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../model/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../server/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](../settings/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../unmarshalling/index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/util/index.html "Permalink")  package utilDefinition Classes[scaladsl](../index.html)
- [FastFuture](FastFuture.html "Provides alternative implementations of the basic transformation operations defined on scala.concurrent.Future, which try to avoid scheduling to an scala.concurrent.ExecutionContext if possible, i.e.")
p[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html)

# util[**](../../../../akka/http/scaladsl/util/index.html "Permalink")

#### package util

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/http/scaladsl/util/FastFuture.html "Permalink") final  class [FastFuture](FastFuture.html "Provides alternative implementations of the basic transformation operations defined on scala.concurrent.Future, which try to avoid scheduling to an scala.concurrent.ExecutionContext if possible, i.e.")\[A] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)Provides alternative implementations of the basic transformation operations defined on [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html),
which try to avoid scheduling to an [scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) if possible, i.e.

Provides alternative implementations of the basic transformation operations defined on [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html),
which try to avoid scheduling to an [scala.concurrent.ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html) if possible, i.e. if the given future
value is already present.
### Value Members

1. [**](../../../../akka/http/scaladsl/util/FastFuture$.html "Permalink")  object [FastFuture](FastFuture$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/FastFuture$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/FastFuture.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/index.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/index.html)*