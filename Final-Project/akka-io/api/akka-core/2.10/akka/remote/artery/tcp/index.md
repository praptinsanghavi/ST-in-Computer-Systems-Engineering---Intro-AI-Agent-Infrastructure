---
description: Akka 2.10.17 - akka.remote.artery.tcp
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/artery/tcp/index.html
title: Akka 2.10.17 - akka.remote.artery.tcp
---

# Akka 2.10.17 - akka.remote.artery.tcp

> **Summary:** Akka 2.10.17 - akka.remote.artery.tcp

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/remote/index.html "Permalink")  package [remote](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/remote/artery/index.html "Permalink")  package [artery](../index.html)Definition Classes[remote](../../index.html)
- [**](../../../../akka/remote/artery/aeron/index.html "Permalink")  package [aeron](../aeron/index.html)Definition Classes[artery](../index.html)
- [**](../../../../akka/remote/artery/compress/index.html "Permalink")  package [compress](../compress/index.html)Definition Classes[artery](../index.html)
- [**](../../../../akka/remote/artery/jfr/index.html "Permalink")  package [jfr](../jfr/index.html)Definition Classes[artery](../index.html)
- [**](../../../../akka/remote/artery/tcp/index.html "Permalink")  package tcpDefinition Classes[artery](../index.html)
- [**](../../../../akka/remote/artery/tcp/ssl/index.html "Permalink")  package [ssl](ssl/index.html)
- [ConfigSSLEngineProvider](ConfigSSLEngineProvider.html "Config in akka.remote.artery.ssl.config-ssl-engine")
- [SSLEngineProvider](SSLEngineProvider.html)
- [SSLEngineProviderSetup](SSLEngineProviderSetup.html "Setup for defining a SSLEngineProvider that is passed in when ActorSystem is created rather than creating one from configured class name.")
- [SslTransportException](SslTransportException.html)
p[akka](../../../index.html).[remote](../../index.html).[artery](../index.html)

# tcp[**](../../../../akka/remote/artery/tcp/index.html "Permalink")

#### package tcp

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/remote/artery/tcp/ssl/index.html "Permalink")  package [ssl](ssl/index.html)
### Type Members

1. [**](../../../../akka/remote/artery/tcp/ConfigSSLEngineProvider.html "Permalink")  class [ConfigSSLEngineProvider](ConfigSSLEngineProvider.html "Config in akka.remote.artery.ssl.config-ssl-engine") extends [SSLEngineProvider](SSLEngineProvider.html)Config in akka.remote.artery.ssl.config\-ssl\-engine

Config in akka.remote.artery.ssl.config\-ssl\-engine

Subclass may override protected methods to replace certain parts, such as key and trust manager.
2. [**](../../../../akka/remote/artery/tcp/SSLEngineProvider.html "Permalink")  trait [SSLEngineProvider](SSLEngineProvider.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html "Permalink")  class [SSLEngineProviderSetup](SSLEngineProviderSetup.html "Setup for defining a SSLEngineProvider that is passed in when ActorSystem is created rather than creating one from configured class name.") extends [Setup](../../../actor/setup/Setup.html)Setup for defining a `SSLEngineProvider` that is passed in when ActorSystem
is created rather than creating one from configured class name.

Setup for defining a `SSLEngineProvider` that is passed in when ActorSystem
is created rather than creating one from configured class name. That is useful
when the SSLEngineProvider implementation require other external constructor parameters
or is created before the ActorSystem is created.

Constructor is \*Internal API\*, use factories in [SSLEngineProviderSetup](SSLEngineProviderSetup.html)
4. [**](../../../../akka/remote/artery/tcp/SslTransportException.html "Permalink")  class [SslTransportException](SslTransportException.html) extends RuntimeException
### Value Members

1. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup$.html "Permalink")  object [SSLEngineProviderSetup](SSLEngineProviderSetup$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/setup/Setup.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/aeron/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/compress/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/jfr/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/tcp/ConfigSSLEngineProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/tcp/SSLEngineProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/tcp/SSLEngineProviderSetup$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/tcp/SSLEngineProviderSetup.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/tcp/SslTransportException.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/tcp/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/tcp/ssl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/tcp/index.html](https://doc.akka.io/api/akka-core/2.10/akka/remote/artery/tcp/index.html)*