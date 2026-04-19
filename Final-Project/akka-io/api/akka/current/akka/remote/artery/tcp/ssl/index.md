---
description: Akka 2.10.17 - akka.remote.artery.tcp.ssl
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:50:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/artery/tcp/ssl/index.html
title: Akka 2.10.17 - akka.remote.artery.tcp.ssl
---

# Akka 2.10.17 - akka.remote.artery.tcp.ssl

> **Summary:** Akka 2.10.17 - akka.remote.artery.tcp.ssl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/remote/index.html "Permalink")  package [remote](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/remote/artery/index.html "Permalink")  package [artery](../../index.html)Definition Classes[remote](../../../index.html)
- [**](../../../../../akka/remote/artery/tcp/index.html "Permalink")  package [tcp](../index.html)Definition Classes[artery](../../index.html)
- [**](../../../../../akka/remote/artery/tcp/ssl/index.html "Permalink")  package sslDefinition Classes[tcp](../index.html)
- [RotatingKeysSSLEngineProvider](RotatingKeysSSLEngineProvider.html "Variation on ConfigSSLEngineProvider that will periodically reload the keys and certificates from disk, to facilitate rolling updates of certificates.")
p[akka](../../../../index.html).[remote](../../../index.html).[artery](../../index.html).[tcp](../index.html)

# ssl[**](../../../../../akka/remote/artery/tcp/ssl/index.html "Permalink")

#### package ssl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/remote/artery/tcp/ssl/RotatingKeysSSLEngineProvider.html "Permalink") final  class [RotatingKeysSSLEngineProvider](RotatingKeysSSLEngineProvider.html "Variation on ConfigSSLEngineProvider that will periodically reload the keys and certificates from disk, to facilitate rolling updates of certificates.") extends [SSLEngineProvider](../SSLEngineProvider.html)Variation on ConfigSSLEngineProvider that will periodically reload the keys and certificates
from disk, to facilitate rolling updates of certificates.

Variation on ConfigSSLEngineProvider that will periodically reload the keys and certificates
from disk, to facilitate rolling updates of certificates.

This provider does not perform hostname verification, but instead allows checking
that the remote certificate has a subject name that matches the subject name of
the configured certificate.
### Value Members

1. [**](../../../../../akka/remote/artery/tcp/ssl/RotatingKeysSSLEngineProvider$.html "Permalink")  object [RotatingKeysSSLEngineProvider](RotatingKeysSSLEngineProvider$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/SSLEngineProvider.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/index.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/ssl/RotatingKeysSSLEngineProvider$.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/ssl/RotatingKeysSSLEngineProvider.html
- https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/ssl/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/ssl/index.html](https://doc.akka.io/api/akka/current/akka/remote/artery/tcp/ssl/index.html)*